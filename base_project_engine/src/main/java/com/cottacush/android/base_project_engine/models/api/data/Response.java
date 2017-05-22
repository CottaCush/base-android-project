package com.cottacush.android.base_project_engine.models.api.data;

import com.cottacush.android.base_project_engine.models.api.BaseResponse;
import com.google.gson.annotations.SerializedName;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class Response {
    public static class LoginResponse extends BaseResponse {
        @SerializedName("data") BaseData data;
    }
}
