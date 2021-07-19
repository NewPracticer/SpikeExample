package com.skyl.miaoshaproject.error;

/**
 * Created by skyl on 2020/11/13.
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);


}
