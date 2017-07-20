/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health check policy configuration.
 * For more information, see [Editing Health Check Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/editinghealthcheck.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HealthChecker.Builder.class)
public class HealthChecker {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
        private Integer intervalInMillis;

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
        private String responseBodyRegex;

        @com.fasterxml.jackson.annotation.JsonProperty("retries")
        private Integer retries;

        @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
        private Integer returnCode;

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
        private Integer timeoutInMillis;

        @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
        private String urlPath;

        public HealthChecker build() {
            return new HealthChecker(
                    intervalInMillis,
                    port,
                    protocol,
                    responseBodyRegex,
                    retries,
                    returnCode,
                    timeoutInMillis,
                    urlPath);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HealthChecker o) {
            return intervalInMillis(o.getIntervalInMillis())
                    .port(o.getPort())
                    .protocol(o.getProtocol())
                    .responseBodyRegex(o.getResponseBodyRegex())
                    .retries(o.getRetries())
                    .returnCode(o.getReturnCode())
                    .timeoutInMillis(o.getTimeoutInMillis())
                    .urlPath(o.getUrlPath());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The interval between health checks, in milliseconds. The default is 10000 (10 seconds).
     * <p>
     * Example: `30000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
    Integer intervalInMillis;

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the `Backend` object.
     * <p>
     * Example: `8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer port;

    /**
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: `HTTP`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String protocol;

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: `^(500|40[1348])$`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String responseBodyRegex;

    /**
     * The number of retries to attempt before a backend server is considered \"unhealthy\". Defaults to 3.
     * <p>
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retries")
    Integer retries;

    /**
     * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
     * you can use common HTTP status codes such as \"200\".
     * <p>
     * Example: `200`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    Integer returnCode;

    /**
     * The maximum timeout before a retry, in milliseconds. Defaults to 3000 (3 seconds).
     * <p>
     * Example: `6000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
    Integer timeoutInMillis;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: `/healthcheck`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String urlPath;
}
