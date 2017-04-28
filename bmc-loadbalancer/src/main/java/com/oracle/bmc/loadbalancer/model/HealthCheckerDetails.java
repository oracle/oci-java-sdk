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
 * The health check policy's configuration details.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = HealthCheckerDetails.Builder.class)
public class HealthCheckerDetails {
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

        @JsonIgnore
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
    @JsonProperty("intervalInMillis")
    @Min(1000)
    @Max(1800000)
    Integer intervalInMillis;

    /**
     * The backend server port against which to run the health check. If the port is not specified, the load balancer uses the
     * port information from the `Backend` object.
     * <p>
     * Example: `8080`
     *
     **/
    @JsonProperty("port")
    @Min(0)
    @Max(65535)
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
    String responseBodyRegex;

    /**
     * The number of retries to attempt before a backend server is considered \"unhealthy\".
     * <p>
     * Example: `3`
     *
     **/
    @JsonProperty("retries")
    Integer retries;

    /**
     * The status code a healthy backend server should return.
     * <p>
     * Example: `200`
     *
     **/
    @JsonProperty("returnCode")
    Integer returnCode;

    /**
     * The maximum timeout in milliseconds before a retry.
     * <p>
     * Example: `6000`
     *
     **/
    @JsonProperty("timeoutInMillis")
    @Min(1)
    @Max(600000)
    Integer timeoutInMillis;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: `/healthcheck`
     *
     **/
    @JsonProperty("urlPath")
    String urlPath;
}
