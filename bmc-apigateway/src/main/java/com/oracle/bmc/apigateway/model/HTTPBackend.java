/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Send the request to an HTTP backend.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = HTTPBackend.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HTTPBackend extends ApiSpecificationRouteBackend {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInSeconds")
        private Float connectTimeoutInSeconds;

        public Builder connectTimeoutInSeconds(Float connectTimeoutInSeconds) {
            this.connectTimeoutInSeconds = connectTimeoutInSeconds;
            this.__explicitlySet__.add("connectTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInSeconds")
        private Float readTimeoutInSeconds;

        public Builder readTimeoutInSeconds(Float readTimeoutInSeconds) {
            this.readTimeoutInSeconds = readTimeoutInSeconds;
            this.__explicitlySet__.add("readTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInSeconds")
        private Float sendTimeoutInSeconds;

        public Builder sendTimeoutInSeconds(Float sendTimeoutInSeconds) {
            this.sendTimeoutInSeconds = sendTimeoutInSeconds;
            this.__explicitlySet__.add("sendTimeoutInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HTTPBackend build() {
            HTTPBackend __instance__ =
                    new HTTPBackend(
                            url,
                            connectTimeoutInSeconds,
                            readTimeoutInSeconds,
                            sendTimeoutInSeconds,
                            isSslVerifyDisabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HTTPBackend o) {
            Builder copiedBuilder =
                    url(o.getUrl())
                            .connectTimeoutInSeconds(o.getConnectTimeoutInSeconds())
                            .readTimeoutInSeconds(o.getReadTimeoutInSeconds())
                            .sendTimeoutInSeconds(o.getSendTimeoutInSeconds())
                            .isSslVerifyDisabled(o.getIsSslVerifyDisabled());

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

    @Deprecated
    public HTTPBackend(
            String url,
            Float connectTimeoutInSeconds,
            Float readTimeoutInSeconds,
            Float sendTimeoutInSeconds,
            Boolean isSslVerifyDisabled) {
        super();
        this.url = url;
        this.connectTimeoutInSeconds = connectTimeoutInSeconds;
        this.readTimeoutInSeconds = readTimeoutInSeconds;
        this.sendTimeoutInSeconds = sendTimeoutInSeconds;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("url")
    String url;

    /**
     * Defines a timeout for establishing a connection with a proxied server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInSeconds")
    Float connectTimeoutInSeconds;

    /**
     * Defines a timeout for reading a response from the proxied server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInSeconds")
    Float readTimeoutInSeconds;

    /**
     * Defines a timeout for transmitting a request to the proxied server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInSeconds")
    Float sendTimeoutInSeconds;

    /**
     * Defines whether or not to uphold SSL verification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    Boolean isSslVerifyDisabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
