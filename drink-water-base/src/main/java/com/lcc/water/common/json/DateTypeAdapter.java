package com.lcc.water.common.json;

import com.google.gson.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class DateTypeAdapter implements JsonSerializer<Date>, JsonDeserializer<Date> {

    public static final Logger logger = LoggerFactory.getLogger(DateTypeAdapter.class);

    private static final Pattern DatePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static final Pattern DateTimePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}$");
    private static final Pattern TimestampPattern = Pattern.compile("^\\d+$");

    private SimpleDateFormat dateFormat;
    private SimpleDateFormat dateTimeFormat;

    public DateTypeAdapter() {
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        try {
            if (DatePattern.matcher(json.getAsString()).find()) {

                return this.dateFormat.parse(json.getAsString());
            } else if (DateTimePattern.matcher(json.getAsString()).find()) {

                return this.dateTimeFormat.parse(json.getAsString());
            } else if (TimestampPattern.matcher(json.getAsString()).find()) {

                Date date = new Date();
                date.setTime(json.getAsLong());

                return date;
            }
        } catch (Exception e) {
            logger.error("转化异常:{}", e.getMessage(), e);
        }
        return context.deserialize(json, typeOfT);
    }

    public JsonElement serialize(Date src, Type typeOfSrc, JsonSerializationContext context) {
        try {
            return new JsonPrimitive(this.dateTimeFormat.format(src));
        } catch (Exception e) {
            logger.error("转化异常:{}", e.getMessage(), e);
        }
        return context.serialize(src, typeOfSrc);
    }
}