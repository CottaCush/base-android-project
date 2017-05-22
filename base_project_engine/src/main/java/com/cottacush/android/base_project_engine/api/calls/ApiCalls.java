package com.cottacush.android.base_project_engine.api.calls;

import android.content.Context;

import com.cottacush.android.base_project_engine.models.api.data.Response;
import com.koushikdutta.ion.Ion;

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
        Ion.with(this.context).load(EndPoints.apiForPath(this.context, "/place"));
        callBack.onSuccess(new Response.LoginResponse());
        callBack.onFail("Error message");
    }

}
