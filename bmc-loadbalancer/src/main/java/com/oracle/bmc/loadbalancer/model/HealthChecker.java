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
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HealthChecker {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
        private Integer intervalInMillis;

        public Builder intervalInMillis(Integer intervalInMillis) {
            this.intervalInMillis = intervalInMillis;
            this.__explicitlySet__.add("intervalInMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
        private String responseBodyRegex;

        public Builder responseBodyRegex(String responseBodyRegex) {
            this.responseBodyRegex = responseBodyRegex;
            this.__explicitlySet__.add("responseBodyRegex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retries")
        private Integer retries;

        public Builder retries(Integer retries) {
            this.retries = retries;
            this.__explicitlySet__.add("retries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
        private Integer returnCode;

        public Builder returnCode(Integer returnCode) {
            this.returnCode = returnCode;
            this.__explicitlySet__.add("returnCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
        private Integer timeoutInMillis;

        public Builder timeoutInMillis(Integer timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            this.__explicitlySet__.add("timeoutInMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
        private String urlPath;

        public Builder urlPath(String urlPath) {
            this.urlPath = urlPath;
            this.__explicitlySet__.add("urlPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HealthChecker build() {
            HealthChecker __instance__ =
                    new HealthChecker(
                            intervalInMillis,
                            port,
                            protocol,
                            responseBodyRegex,
                            retries,
                            returnCode,
                            timeoutInMillis,
                            urlPath);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
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
    Integer port;

    /**
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: `HTTP`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    String protocol;

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: `^(500|40[1348])$`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
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
    Integer returnCode;

    /**
     * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
     * returns within this timeout period. Defaults to 3000 (3 seconds).
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
    String urlPath;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
