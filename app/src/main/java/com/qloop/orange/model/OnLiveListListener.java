package com.qloop.orange.model;

import com.qloop.orange.bean.LiveListInfo;

/**
 * Created by Qloop on 2017/4/15.
 */

public interface OnLiveListListener {
    void setData(LiveListInfo liveListInfo);
    void accessError();
}
