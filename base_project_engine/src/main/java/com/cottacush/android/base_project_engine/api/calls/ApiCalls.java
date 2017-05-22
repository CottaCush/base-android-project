package com.cottacush.android.base_project_engine.api.calls;

import android.content.Context;

import com.cottacush.android.base_project_engine.models.api.data.Response;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class ApiCalls {
    /*
    Singleton pattern for apis calls
     */

    private Context context;

    private ApiCalls(Context context){
        this.context = context;
    }

    public static ApiCalls instantiate(Context context){
        return new ApiCalls(context);
    }


    public void callPathOne(ApiCallBacks.PathOneQueryCallBack callBack){
        //Call callback appropriately
        callBack.onSuccess(new Response.LoginResponse());
        callBack.onFail("Error message");
    }

}
