/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Connection details for an external RESP based cache store for Response Caching. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalRespCache.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExternalRespCache extends ResponseCacheDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The set of cache store members to connect to. At present only a single server is
         * supported.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("servers")
        private java.util.List<ResponseCacheRespServer> servers;

        /**
         * The set of cache store members to connect to. At present only a single server is
         * supported.
         *
         * @param servers the value to set
         * @return this builder
         */
        public Builder servers(java.util.List<ResponseCacheRespServer> servers) {
            this.servers = servers;
            this.__explicitlySet__.add("servers");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Vault Service secret resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretId")
        private String authenticationSecretId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Oracle Vault Service secret resource.
         *
         * @param authenticationSecretId the value to set
         * @return this builder
         */
        public Builder authenticationSecretId(String authenticationSecretId) {
            this.authenticationSecretId = authenticationSecretId;
            this.__explicitlySet__.add("authenticationSecretId");
            return this;
        }
        /** The version number of the authentication secret to use. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretVersionNumber")
        private Long authenticationSecretVersionNumber;

        /**
         * The version number of the authentication secret to use.
         *
         * @param authenticationSecretVersionNumber the value to set
         * @return this builder
         */
        public Builder authenticationSecretVersionNumber(Long authenticationSecretVersionNumber) {
            this.authenticationSecretVersionNumber = authenticationSecretVersionNumber;
            this.__explicitlySet__.add("authenticationSecretVersionNumber");
            return this;
        }
        /** Defines if the connection should be over SSL. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSslEnabled")
        private Boolean isSslEnabled;

        /**
         * Defines if the connection should be over SSL.
         *
         * @param isSslEnabled the value to set
         * @return this builder
         */
        public Builder isSslEnabled(Boolean isSslEnabled) {
            this.isSslEnabled = isSslEnabled;
            this.__explicitlySet__.add("isSslEnabled");
            return this;
        }
        /** Defines whether or not to uphold SSL verification. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        /**
         * Defines whether or not to uphold SSL verification.
         *
         * @param isSslVerifyDisabled the value to set
         * @return this builder
         */
        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }
        /** Defines the timeout for establishing a connection with the Response Cache. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInMs")
        private Integer connectTimeoutInMs;

        /**
         * Defines the timeout for establishing a connection with the Response Cache.
         *
         * @param connectTimeoutInMs the value to set
         * @return this builder
         */
        public Builder connectTimeoutInMs(Integer connectTimeoutInMs) {
            this.connectTimeoutInMs = connectTimeoutInMs;
            this.__explicitlySet__.add("connectTimeoutInMs");
            return this;
        }
        /** Defines the timeout for reading data from the Response Cache. */
        @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInMs")
        private Integer readTimeoutInMs;

        /**
         * Defines the timeout for reading data from the Response Cache.
         *
         * @param readTimeoutInMs the value to set
         * @return this builder
         */
        public Builder readTimeoutInMs(Integer readTimeoutInMs) {
            this.readTimeoutInMs = readTimeoutInMs;
            this.__explicitlySet__.add("readTimeoutInMs");
            return this;
        }
        /** Defines the timeout for transmitting data to the Response Cache. */
        @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInMs")
        private Integer sendTimeoutInMs;

        /**
         * Defines the timeout for transmitting data to the Response Cache.
         *
         * @param sendTimeoutInMs the value to set
         * @return this builder
         */
        public Builder sendTimeoutInMs(Integer sendTimeoutInMs) {
            this.sendTimeoutInMs = sendTimeoutInMs;
            this.__explicitlySet__.add("sendTimeoutInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalRespCache build() {
            ExternalRespCache model =
                    new ExternalRespCache(
                            this.servers,
                            this.authenticationSecretId,
                            this.authenticationSecretVersionNumber,
                            this.isSslEnabled,
                            this.isSslVerifyDisabled,
                            this.connectTimeoutInMs,
                            this.readTimeoutInMs,
                            this.sendTimeoutInMs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalRespCache model) {
            if (model.wasPropertyExplicitlySet("servers")) {
                this.servers(model.getServers());
            }
            if (model.wasPropertyExplicitlySet("authenticationSecretId")) {
                this.authenticationSecretId(model.getAuthenticationSecretId());
            }
            if (model.wasPropertyExplicitlySet("authenticationSecretVersionNumber")) {
                this.authenticationSecretVersionNumber(
                        model.getAuthenticationSecretVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("isSslEnabled")) {
                this.isSslEnabled(model.getIsSslEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSslVerifyDisabled")) {
                this.isSslVerifyDisabled(model.getIsSslVerifyDisabled());
            }
            if (model.wasPropertyExplicitlySet("connectTimeoutInMs")) {
                this.connectTimeoutInMs(model.getConnectTimeoutInMs());
            }
            if (model.wasPropertyExplicitlySet("readTimeoutInMs")) {
                this.readTimeoutInMs(model.getReadTimeoutInMs());
            }
            if (model.wasPropertyExplicitlySet("sendTimeoutInMs")) {
                this.sendTimeoutInMs(model.getSendTimeoutInMs());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
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
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servers")
    private final java.util.List<ResponseCacheRespServer> servers;

    /**
     * The set of cache store members to connect to. At present only a single server is supported.
     *
     * @return the value
     */
    public java.util.List<ResponseCacheRespServer> getServers() {
        return servers;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Vault Service secret resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretId")
    private final String authenticationSecretId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Oracle Vault Service secret resource.
     *
     * @return the value
     */
    public String getAuthenticationSecretId() {
        return authenticationSecretId;
    }

    /** The version number of the authentication secret to use. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationSecretVersionNumber")
    private final Long authenticationSecretVersionNumber;

    /**
     * The version number of the authentication secret to use.
     *
     * @return the value
     */
    public Long getAuthenticationSecretVersionNumber() {
        return authenticationSecretVersionNumber;
    }

    /** Defines if the connection should be over SSL. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSslEnabled")
    private final Boolean isSslEnabled;

    /**
     * Defines if the connection should be over SSL.
     *
     * @return the value
     */
    public Boolean getIsSslEnabled() {
        return isSslEnabled;
    }

    /** Defines whether or not to uphold SSL verification. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    private final Boolean isSslVerifyDisabled;

    /**
     * Defines whether or not to uphold SSL verification.
     *
     * @return the value
     */
    public Boolean getIsSslVerifyDisabled() {
        return isSslVerifyDisabled;
    }

    /** Defines the timeout for establishing a connection with the Response Cache. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectTimeoutInMs")
    private final Integer connectTimeoutInMs;

    /**
     * Defines the timeout for establishing a connection with the Response Cache.
     *
     * @return the value
     */
    public Integer getConnectTimeoutInMs() {
        return connectTimeoutInMs;
    }

    /** Defines the timeout for reading data from the Response Cache. */
    @com.fasterxml.jackson.annotation.JsonProperty("readTimeoutInMs")
    private final Integer readTimeoutInMs;

    /**
     * Defines the timeout for reading data from the Response Cache.
     *
     * @return the value
     */
    public Integer getReadTimeoutInMs() {
        return readTimeoutInMs;
    }

    /** Defines the timeout for transmitting data to the Response Cache. */
    @com.fasterxml.jackson.annotation.JsonProperty("sendTimeoutInMs")
    private final Integer sendTimeoutInMs;

    /**
     * Defines the timeout for transmitting data to the Response Cache.
     *
     * @return the value
     */
    public Integer getSendTimeoutInMs() {
        return sendTimeoutInMs;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalRespCache(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", servers=").append(String.valueOf(this.servers));
        sb.append(", authenticationSecretId=").append(String.valueOf(this.authenticationSecretId));
        sb.append(", authenticationSecretVersionNumber=")
                .append(String.valueOf(this.authenticationSecretVersionNumber));
        sb.append(", isSslEnabled=").append(String.valueOf(this.isSslEnabled));
        sb.append(", isSslVerifyDisabled=").append(String.valueOf(this.isSslVerifyDisabled));
        sb.append(", connectTimeoutInMs=").append(String.valueOf(this.connectTimeoutInMs));
        sb.append(", readTimeoutInMs=").append(String.valueOf(this.readTimeoutInMs));
        sb.append(", sendTimeoutInMs=").append(String.valueOf(this.sendTimeoutInMs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalRespCache)) {
            return false;
        }

        ExternalRespCache other = (ExternalRespCache) o;
        return java.util.Objects.equals(this.servers, other.servers)
                && java.util.Objects.equals(
                        this.authenticationSecretId, other.authenticationSecretId)
                && java.util.Objects.equals(
                        this.authenticationSecretVersionNumber,
                        other.authenticationSecretVersionNumber)
                && java.util.Objects.equals(this.isSslEnabled, other.isSslEnabled)
                && java.util.Objects.equals(this.isSslVerifyDisabled, other.isSslVerifyDisabled)
                && java.util.Objects.equals(this.connectTimeoutInMs, other.connectTimeoutInMs)
                && java.util.Objects.equals(this.readTimeoutInMs, other.readTimeoutInMs)
                && java.util.Objects.equals(this.sendTimeoutInMs, other.sendTimeoutInMs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.servers == null ? 43 : this.servers.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationSecretId == null
                                ? 43
                                : this.authenticationSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationSecretVersionNumber == null
                                ? 43
                                : this.authenticationSecretVersionNumber.hashCode());
        result = (result * PRIME) + (this.isSslEnabled == null ? 43 : this.isSslEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isSslVerifyDisabled == null
                                ? 43
                                : this.isSslVerifyDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.connectTimeoutInMs == null
                                ? 43
                                : this.connectTimeoutInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.readTimeoutInMs == null ? 43 : this.readTimeoutInMs.hashCode());
        result =
                (result * PRIME)
                        + (this.sendTimeoutInMs == null ? 43 : this.sendTimeoutInMs.hashCode());
        return result;
    }
}
