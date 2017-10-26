package com.lcc.water.common.json;

import com.google.gson.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * 时间戳类型编解码适配器
 */
public class TimestampTypeAdapter implements JsonSerializer<Timestamp>, JsonDeserializer<Timestamp> {
    private static final Logger logger = LoggerFactory.getLogger(TimestampTypeAdapter.class);

    private static final Pattern DatePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}$");
    private static final Pattern DateTimePattern = Pattern.compile("^\\d{4}-\\d{2}-\\d{2}\\s+\\d{2}:\\d{2}:\\d{2}$");
    private static final Pattern TimestampPattern = Pattern.compile("^\\d+$");

    private SimpleDateFormat dateFormat;
    private SimpleDateFormat dateTimeFormat;

    public TimestampTypeAdapter() {
        this.dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        this.dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }

    public Timestamp deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        try {
            if (DatePattern.matcher(json.getAsString()).find()) {
                return new Timestamp(this.dateFormat.parse(json.getAsString()).getTime());
            } else if (DateTimePattern.matcher(json.getAsString()).find()) {
                return new Timestamp(this.dateTimeFormat.parse(json.getAsString()).getTime());
            } else if (TimestampPattern.matcher(json.getAsString()).find()) {
                return new Timestamp(json.getAsLong());
            }
        } catch (Exception e) {
            logger.error("", e.getMessage(), e);
        }
        return context.deserialize(json, typeOfT);
    }

    public JsonElement serialize(Timestamp src, Type typeOfSrc, JsonSerializationContext context) {
        try {
            return new JsonPrimitive(Long.valueOf(src.getTime()));
        } catch (Exception e) {
            logger.error("", e.getMessage(), e);
        }
        return context.serialize(src, typeOfSrc);
    }
}