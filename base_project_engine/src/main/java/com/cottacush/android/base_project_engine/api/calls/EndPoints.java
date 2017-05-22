package com.cottacush.android.base_project_engine.api.calls;

import android.content.Context;

import com.cottacush.android.base_project_engine.BaseAppApplication;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class EndPoints {
    /*
    Let's explore having this load from json or xml :)
     */

    static String apiForPath(Context context, String arg){
        if(context == null){
            return "BAD_URL for args";
        }
        return ((BaseAppApplication)context.getApplicationContext()).getEnvironmentConfig().devurl+"/path1";
    }
}
