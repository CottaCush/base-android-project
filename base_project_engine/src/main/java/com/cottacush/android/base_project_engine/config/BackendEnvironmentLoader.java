package com.cottacush.android.base_project_engine.config;

import android.content.Context;

import com.cottacush.android.base_project_engine.R;
import com.cottacush.android.base_project_engine.config.enums.BackendEnvironmentType;
import com.cottacush.android.base_project_engine.models.project.EnvironmentConfig;
import com.cottacush.android.cottyswifknife.utils.StringUtils;
import com.google.gson.Gson;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class BackendEnvironmentLoader {

    public static EnvironmentConfig loadCurrentConfig(Context context, BackendEnvironmentType type){
        switch (type){
            case CLIENT_DEV:
                return loadClientStagingConfig(context); //Client Staging
            case CLIENT_STAGING:
                return loadClientStagingConfig(context); //Client Staging
            case CLIENT_PRODUCTION:
                return loadClientProdConfig(context); //Client Prod
            case MCC_DEV:
                return loadCCDevConfig(context); //C&C dev
            case MCC_STAGING:
                return loadCCStagingConfig(context); //C&C staging
            case MCC_PRODUCTION:
                return loadCCStagingConfig(context); //C&C production
            default:
                return loadCCDevConfig(context); ////C&C dev
        }
    }

    private static EnvironmentConfig loadCCDevConfig(Context context){
        return new Gson().fromJson(StringUtils.resourceReader(context.getResources(), R.raw.cc_dev_environment), EnvironmentConfig.class);
    }

    private static EnvironmentConfig loadCCStagingConfig(Context context){
        return new Gson().fromJson(StringUtils.resourceReader(context.getResources(), R.raw.cc_staging_environment), EnvironmentConfig.class);
    }

    private static EnvironmentConfig loadClientProdConfig(Context context){
        return new Gson().fromJson(StringUtils.resourceReader(context.getResources(), R.raw.client_prod_environment), EnvironmentConfig.class);
    }

    private static EnvironmentConfig loadClientStagingConfig(Context context){
        return new Gson().fromJson(StringUtils.resourceReader(context.getResources(), R.raw.client_staging_environment), EnvironmentConfig.class);
    }
}
