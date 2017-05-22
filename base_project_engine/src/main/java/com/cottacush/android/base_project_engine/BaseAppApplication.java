package com.cottacush.android.base_project_engine;

import android.app.Application;

import com.cottacush.android.base_project_engine.config.BackendEnvironmentLoader;
import com.cottacush.android.base_project_engine.config.enums.BackendEnvironmentType;
import com.cottacush.android.base_project_engine.models.project.EnvironmentConfig;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class BaseAppApplication extends Application {

    private EnvironmentConfig environmentConfig;
    private BackendEnvironmentType current = BackendEnvironmentType.MCC_STAGING;



    @Override
    public void onCreate() {
        super.onCreate();
        this.environmentConfig = BackendEnvironmentLoader.loadCurrentConfig(this, current);
    }

    public EnvironmentConfig getEnvironmentConfig(){
        return environmentConfig != null ? environmentConfig:BackendEnvironmentLoader.loadCurrentConfig(this, current);
    }
}
