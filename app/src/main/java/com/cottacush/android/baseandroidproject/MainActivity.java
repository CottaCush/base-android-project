package com.cottacush.android.baseandroidproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cottacush.android.base_project_engine.api.calls.ApiCallBacks;
import com.cottacush.android.base_project_engine.api.calls.ApiCalls;
import com.cottacush.android.base_project_engine.models.api.data.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Sample api call
        //Entry activity should always remain separate
        //from other activities to the dev can know where to start from with all certainty

        this.referesh();
    }



    private void referesh(){
        ApiCalls.instantiate(this).callPathOne(new ApiCallBacks.PathOneQueryCallBack() {
            @Override
            public void onSuccess(Response.LoginResponse response) {
                //Do what you want with response
            }

            @Override
            public void onFail(String errorMessage) {

            }
        });
    }
}
