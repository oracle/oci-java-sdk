/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The health check policy's configuration details.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HealthCheckerDetails.Builder.class
)
public class HealthCheckerDetails {
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

        public HealthCheckerDetails build() {
            return new HealthCheckerDetails(
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
        public Builder copy(HealthCheckerDetails o) {
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
     * The interval between health checks, in milliseconds.
     * <p>
     * Example: `30000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
    @javax.validation.constraints.Min(1000)
    @javax.validation.constraints.Max(1800000)
    Integer intervalInMillis;

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the `Backend` object.
     * <p>
     * Example: `8080`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    @javax.validation.constraints.Min(0)
    @javax.validation.constraints.Max(65535)
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
    String responseBodyRegex;

    /**
     * The number of retries to attempt before a backend server is considered \"unhealthy\".
     * <p>
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retries")
    Integer retries;

    /**
     * The status code a healthy backend server should return.
     * <p>
     * Example: `200`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
    Integer returnCode;

    /**
     * The maximum timeout in milliseconds before a retry.
     * <p>
     * Example: `6000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
    @javax.validation.constraints.Min(1)
    @javax.validation.constraints.Max(600000)
    Integer timeoutInMillis;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: `/healthcheck`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
    String urlPath;
}
