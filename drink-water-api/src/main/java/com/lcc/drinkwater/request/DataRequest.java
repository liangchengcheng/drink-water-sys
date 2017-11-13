
package com.lcc.drinkwater.request;

import com.lcc.water.common.ApiParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yangjiahui on 2017/7/20.
 */

public class DataRequest extends ApiParam {

    @Resource
    private InvestigationRequest pcqk;

    @Resource
    private List<RemediationRequest> zzqk;

    @Resource
    private List<ImageRequest> images;


    public List<ImageRequest> getImages() {
        return images;
    }

    public void setImages(List<ImageRequest> images) {
        this.images = images;
    }

    public InvestigationRequest getPcqk() {
        return pcqk;
    }

    public void setPcqk(InvestigationRequest pcqk) {
        this.pcqk = pcqk;
    }

    public List<RemediationRequest> getZzqk() {
        return zzqk;
    }

    public void setZzqk(List<RemediationRequest> zzqk) {
        this.zzqk = zzqk;
    }

    @Override
    public String toString() {
        return "DataRequest{" +
                "pcqk=" + pcqk +
                ", zzqk=" + zzqk +
                ", images=" + images +
                '}';
    }
}

