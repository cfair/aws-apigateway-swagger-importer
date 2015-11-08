package com.amazonaws.service.apigateway.importer.config;

public class AwsConfig {
    public static final String DEFAULT_REGION = "us-east-1";

    private String profile;

    public AwsConfig(String profile) {
        this.profile = profile;
    }

    public String getRegion() {
        return DEFAULT_REGION;
    }

    public String getProfile() {
        return profile;
    }

}
