/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Connection details for an external RESP based cache store for Response Caching.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalRespCache.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExternalRespCache extends ResponseCacheDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("servers")
        private java.util.List<ResponseCacheRespServer> servers;

        public Builder servers(java.util.List<ResponseCacheRespServer> servers) {
            this.servers = servers;
            this.__explicitlySet__.add("servers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretId")
        private String authenticationSecretId;

        public Builder authenticationSecretId(String authenticationSecretId) {
            this.authenticationSecretId = authenticationSecretId;
            this.__explicitlySet__.add("authenticationSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretVersionNumber")
        private Long authenticationSecretVersionNumber;

        public Builder authenticationSecretVersionNumber(Long authenticationSecretVersionNumber) {
            this.authenticationSecretVersionNumber = authenticationSecretVersionNumber;
            this.__explicitlySet__.add("authenticationSecretVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSslEnabled")
        private Boolean isSslEnabled;

        public Builder isSslEnabled(Boolean isSslEnabled) {
            this.isSslEnabled = isSslEnabled;
            this.__explicitlySet__.add("isSslEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInMs")
        private Integer connectTimeoutInMs;

        public Builder connectTimeoutInMs(Integer connectTimeoutInMs) {
            this.connectTimeoutInMs = connectTimeoutInMs;
            this.__explicitlySet__.add("connectTimeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInMs")
        private Integer readTimeoutInMs;

        public Builder readTimeoutInMs(Integer readTimeoutInMs) {
            this.readTimeoutInMs = readTimeoutInMs;
            this.__explicitlySet__.add("readTimeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInMs")
        private Integer sendTimeoutInMs;

        public Builder sendTimeoutInMs(Integer sendTimeoutInMs) {
            this.sendTimeoutInMs = sendTimeoutInMs;
            this.__explicitlySet__.add("sendTimeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalRespCache build() {
            ExternalRespCache __instance__ =
                    new ExternalRespCache(
                            servers,
                            authenticationSecretId,
                            authenticationSecretVersionNumber,
                            isSslEnabled,
                            isSslVerifyDisabled,
                            connectTimeoutInMs,
                            readTimeoutInMs,
                            sendTimeoutInMs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalRespCache o) {
            Builder copiedBuilder =
                    servers(o.getServers())
                            .authenticationSecretId(o.getAuthenticationSecretId())
                            .authenticationSecretVersionNumber(
                                    o.getAuthenticationSecretVersionNumber())
                            .isSslEnabled(o.getIsSslEnabled())
                            .isSslVerifyDisabled(o.getIsSslVerifyDisabled())
                            .connectTimeoutInMs(o.getConnectTimeoutInMs())
                            .readTimeoutInMs(o.getReadTimeoutInMs())
                            .sendTimeoutInMs(o.getSendTimeoutInMs());

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
    public ExternalRespCache(
            java.util.List<ResponseCacheRespServer> servers,
            String authenticationSecretId,
            Long authenticationSecretVersionNumber,
            Boolean isSslEnabled,
            Boolean isSslVerifyDisabled,
            Integer connectTimeoutInMs,
            Integer readTimeoutInMs,
            Integer sendTimeoutInMs) {
        super();
        this.servers = servers;
        this.authenticationSecretId = authenticationSecretId;
        this.authenticationSecretVersionNumber = authenticationSecretVersionNumber;
        this.isSslEnabled = isSslEnabled;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
        this.connectTimeoutInMs = connectTimeoutInMs;
        this.readTimeoutInMs = readTimeoutInMs;
        this.sendTimeoutInMs = sendTimeoutInMs;
    }

    /**
     * The set of cache store members to connect to. At present only a single server is supported.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    java.util.List<ResponseCacheRespServer> servers;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Vault Service secret resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretId")
    String authenticationSecretId;

    /**
     * The version number of the authentication secret to use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretVersionNumber")
    Long authenticationSecretVersionNumber;

    /**
     * Defines if the connection should be over SSL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSslEnabled")
    Boolean isSslEnabled;

    /**
     * Defines whether or not to uphold SSL verification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    Boolean isSslVerifyDisabled;

    /**
     * Defines the timeout for establishing a connection with the Response Cache.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInMs")
    Integer connectTimeoutInMs;

    /**
     * Defines the timeout for reading data from the Response Cache.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInMs")
    Integer readTimeoutInMs;

    /**
     * Defines the timeout for transmitting data to the Response Cache.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInMs")
    Integer sendTimeoutInMs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
