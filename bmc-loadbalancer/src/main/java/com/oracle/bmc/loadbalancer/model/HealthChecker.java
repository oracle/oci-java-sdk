/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * The health check policy configuration.
 * For more information, see [Editing Health Check Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/editinghealthcheck.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = HealthChecker.Builder.class)
public class HealthChecker {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("intervalInMillis")
        private Integer intervalInMillis;

        @JsonProperty("port")
        private Integer port;

        @JsonProperty("protocol")
        private String protocol;

        @JsonProperty("responseBodyRegex")
        private String responseBodyRegex;

        @JsonProperty("retries")
        private Integer retries;

        @JsonProperty("returnCode")
        private Integer returnCode;

        @JsonProperty("timeoutInMillis")
        private Integer timeoutInMillis;

        @JsonProperty("urlPath")
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

        @JsonIgnore
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
    @JsonProperty("intervalInMillis")
    Integer intervalInMillis;

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the `Backend` object.
     * <p>
     * Example: `8080`
     *
     **/
    @JsonProperty("port")
    @Valid
    @NotNull
    Integer port;

    /**
     * The protocol the health check must use; either HTTP or TCP.
     * <p>
     * Example: `HTTP`
     *
     **/
    @JsonProperty("protocol")
    @Valid
    @NotNull
    String protocol;

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: `^(500|40[1348])$`
     *
     **/
    @JsonProperty("responseBodyRegex")
    @Valid
    @NotNull
    String responseBodyRegex;

    /**
     * The number of retries to attempt before a backend server is considered \"unhealthy\". Defaults to 3.
     * <p>
     * Example: `3`
     *
     **/
    @JsonProperty("retries")
    Integer retries;

    /**
     * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
     * you can use common HTTP status codes such as \"200\".
     * <p>
     * Example: `200`
     *
     **/
    @JsonProperty("returnCode")
    @Valid
    @NotNull
    Integer returnCode;

    /**
     * The maximum timeout before a retry, in milliseconds. Defaults to 3000 (3 seconds).
     * <p>
     * Example: `6000`
     *
     **/
    @JsonProperty("timeoutInMillis")
    Integer timeoutInMillis;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: `/healthcheck`
     *
     **/
    @JsonProperty("urlPath")
    @Valid
    @NotNull
    String urlPath;
}
