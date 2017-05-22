package com.cottacush.android.base_project_engine.api.calls;

import com.cottacush.android.base_project_engine.models.api.data.Response;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public interface ApiCallBacks {
    interface PathOneQueryCallBack{
        void onSuccess(Response.LoginResponse response);
        void onFail(String errorMessage);
    }
}
