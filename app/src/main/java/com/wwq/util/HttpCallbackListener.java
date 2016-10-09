package com.wwq.util;

/**
 * Created by 魏文强 on 2016/10/3.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
