package com.cottacush.android.base_project_engine.models.api;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class BaseResponse {
    @SerializedName("status") String status;
    @SerializedName("error") String error;
    /*
    Sub class responses from here
     */

    public static BaseResponse fromString(String string){
        return new Gson().fromJson(string, BaseResponse.class);
    }
}
