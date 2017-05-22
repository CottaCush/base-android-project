package com.cottacush.android.base_project_engine.models.project;

import com.google.gson.annotations.SerializedName;

/**
 * @author fdamilola on 22/05/2017.
 * @contact fdamilola@gmail.com +2348166200715
 */

public class EnvironmentConfig {

    @SerializedName("url") public String devurl;
    @SerializedName("name") public String envName;
    @SerializedName("env_version") public String envVersion;
    @SerializedName("env_type") public String envType;
    @SerializedName("oauth_info") public OauthInfo oauthInfo;

}
