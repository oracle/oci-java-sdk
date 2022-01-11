/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkloadbalancer.model;

/**
 * The configuration details of the health checker.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateHealthCheckerDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateHealthCheckerDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private HealthCheckProtocols protocol;

        public Builder protocol(HealthCheckProtocols protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retries")
        private Integer retries;

        public Builder retries(Integer retries) {
            this.retries = retries;
            this.__explicitlySet__.add("retries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
        private Integer timeoutInMillis;

        public Builder timeoutInMillis(Integer timeoutInMillis) {
            this.timeoutInMillis = timeoutInMillis;
            this.__explicitlySet__.add("timeoutInMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
        private Integer intervalInMillis;

        public Builder intervalInMillis(Integer intervalInMillis) {
            this.intervalInMillis = intervalInMillis;
            this.__explicitlySet__.add("intervalInMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
        private String urlPath;

        public Builder urlPath(String urlPath) {
            this.urlPath = urlPath;
            this.__explicitlySet__.add("urlPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
        private String responseBodyRegex;

        public Builder responseBodyRegex(String responseBodyRegex) {
            this.responseBodyRegex = responseBodyRegex;
            this.__explicitlySet__.add("responseBodyRegex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
        private Integer returnCode;

        public Builder returnCode(Integer returnCode) {
            this.returnCode = returnCode;
            this.__explicitlySet__.add("returnCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestData")
        private byte[] requestData;

        public Builder requestData(byte[] requestData) {
            this.requestData = requestData;
            this.__explicitlySet__.add("requestData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseData")
        private byte[] responseData;

        public Builder responseData(byte[] responseData) {
            this.responseData = responseData;
            this.__explicitlySet__.add("responseData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateHealthCheckerDetails build() {
            UpdateHealthCheckerDetails __instance__ =
                    new UpdateHealthCheckerDetails(
                            protocol,
                            port,
                            retries,
                            timeoutInMillis,
                            intervalInMillis,
                            urlPath,
                            responseBodyRegex,
                            returnCode,
                            requestData,
                            responseData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateHealthCheckerDetails o) {
            Builder copiedBuilder =
                    protocol(o.getProtocol())
                            .port(o.getPort())
                            .retries(o.getRetries())
                            .timeoutInMillis(o.getTimeoutInMillis())
                            .intervalInMillis(o.getIntervalInMillis())
                            .urlPath(o.getUrlPath())
                            .responseBodyRegex(o.getResponseBodyRegex())
                            .returnCode(o.getReturnCode())
                            .requestData(o.getRequestData())
                            .responseData(o.getResponseData());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The protocol that the health check must use; either HTTP, UDP, or TCP.
     * <p>
     * Example: {@code HTTP}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    HealthCheckProtocols protocol;

    /**
     * The backend server port against which to run the health check.
     * <p>
     * Example: {@code 8080}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    Integer port;

    /**
     * The number of retries to attempt before a backend server is considered "unhealthy". This number also applies
     * when recovering a server to the "healthy" state.
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retries")
    Integer retries;

    /**
     * The maximum time, in milliseconds, to wait for a reply to a health check. A health check is successful only if a reply
     * returns within this timeout period.
     * <p>
     * Example: {@code 3000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInMillis")
    Integer timeoutInMillis;

    /**
     * The interval between health checks, in milliseconds.
     * <p>
     * Example: {@code 10000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInMillis")
    Integer intervalInMillis;

    /**
     * The path against which to run the health check.
     * <p>
     * Example: {@code /healthcheck}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("urlPath")
    String urlPath;

    /**
     * A regular expression for parsing the response body from the backend server.
     * <p>
     * Example: {@code ^((?!false).|\\s)*$}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseBodyRegex")
    String responseBodyRegex;

    /**
     * The status code a healthy backend server should return. If you configure the health check policy to use the HTTP protocol,
     * then you can use common HTTP status codes such as "200".
     * <p>
     * Example: {@code 200}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnCode")
    Integer returnCode;

    /**
     * Base64 encoded pattern to be sent as UDP or TCP health check probe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestData")
    byte[] requestData;

    /**
     * Base64 encoded pattern to be validated as UDP or TCP health check probe response.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseData")
    byte[] responseData;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
