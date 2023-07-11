/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Configuration details for the SCRIPTED_REST monitor type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScriptedRestMonitorConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScriptedRestMonitorConfiguration extends MonitorConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
        private Boolean isFailureRetried;

        public Builder isFailureRetried(Boolean isFailureRetried) {
            this.isFailureRetried = isFailureRetried;
            this.__explicitlySet__.add("isFailureRetried");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
        private DnsConfiguration dnsConfiguration;

        public Builder dnsConfiguration(DnsConfiguration dnsConfiguration) {
            this.dnsConfiguration = dnsConfiguration;
            this.__explicitlySet__.add("dnsConfiguration");
            return this;
        }
        /** Request HTTP authentication scheme. */
        @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationScheme")
        private RequestAuthenticationSchemesForScriptedRest reqAuthenticationScheme;

        /**
         * Request HTTP authentication scheme.
         *
         * @param reqAuthenticationScheme the value to set
         * @return this builder
         */
        public Builder reqAuthenticationScheme(
                RequestAuthenticationSchemesForScriptedRest reqAuthenticationScheme) {
            this.reqAuthenticationScheme = reqAuthenticationScheme;
            this.__explicitlySet__.add("reqAuthenticationScheme");
            return this;
        }
        /** Expected HTTP response codes. For status code range, set values such as 2xx, 3xx. */
        @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
        private java.util.List<String> verifyResponseCodes;

        /**
         * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
         *
         * @param verifyResponseCodes the value to set
         * @return this builder
         */
        public Builder verifyResponseCodes(java.util.List<String> verifyResponseCodes) {
            this.verifyResponseCodes = verifyResponseCodes;
            this.__explicitlySet__.add("verifyResponseCodes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
        private NetworkConfiguration networkConfiguration;

        public Builder networkConfiguration(NetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            this.__explicitlySet__.add("networkConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScriptedRestMonitorConfiguration build() {
            ScriptedRestMonitorConfiguration model =
                    new ScriptedRestMonitorConfiguration(
                            this.isFailureRetried,
                            this.dnsConfiguration,
                            this.reqAuthenticationScheme,
                            this.verifyResponseCodes,
                            this.networkConfiguration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScriptedRestMonitorConfiguration model) {
            if (model.wasPropertyExplicitlySet("isFailureRetried")) {
                this.isFailureRetried(model.getIsFailureRetried());
            }
            if (model.wasPropertyExplicitlySet("dnsConfiguration")) {
                this.dnsConfiguration(model.getDnsConfiguration());
            }
            if (model.wasPropertyExplicitlySet("reqAuthenticationScheme")) {
                this.reqAuthenticationScheme(model.getReqAuthenticationScheme());
            }
            if (model.wasPropertyExplicitlySet("verifyResponseCodes")) {
                this.verifyResponseCodes(model.getVerifyResponseCodes());
            }
            if (model.wasPropertyExplicitlySet("networkConfiguration")) {
                this.networkConfiguration(model.getNetworkConfiguration());
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
    public ScriptedRestMonitorConfiguration(
            Boolean isFailureRetried,
            DnsConfiguration dnsConfiguration,
            RequestAuthenticationSchemesForScriptedRest reqAuthenticationScheme,
            java.util.List<String> verifyResponseCodes,
            NetworkConfiguration networkConfiguration) {
        super(isFailureRetried, dnsConfiguration);
        this.reqAuthenticationScheme = reqAuthenticationScheme;
        this.verifyResponseCodes = verifyResponseCodes;
        this.networkConfiguration = networkConfiguration;
    }

    /** Request HTTP authentication scheme. */
    @com.fasterxml.jackson.annotation.JsonProperty("reqAuthenticationScheme")
    private final RequestAuthenticationSchemesForScriptedRest reqAuthenticationScheme;

    /**
     * Request HTTP authentication scheme.
     *
     * @return the value
     */
    public RequestAuthenticationSchemesForScriptedRest getReqAuthenticationScheme() {
        return reqAuthenticationScheme;
    }

    /** Expected HTTP response codes. For status code range, set values such as 2xx, 3xx. */
    @com.fasterxml.jackson.annotation.JsonProperty("verifyResponseCodes")
    private final java.util.List<String> verifyResponseCodes;

    /**
     * Expected HTTP response codes. For status code range, set values such as 2xx, 3xx.
     *
     * @return the value
     */
    public java.util.List<String> getVerifyResponseCodes() {
        return verifyResponseCodes;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkConfiguration")
    private final NetworkConfiguration networkConfiguration;

    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
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
        sb.append("ScriptedRestMonitorConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", reqAuthenticationScheme=")
                .append(String.valueOf(this.reqAuthenticationScheme));
        sb.append(", verifyResponseCodes=").append(String.valueOf(this.verifyResponseCodes));
        sb.append(", networkConfiguration=").append(String.valueOf(this.networkConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptedRestMonitorConfiguration)) {
            return false;
        }

        ScriptedRestMonitorConfiguration other = (ScriptedRestMonitorConfiguration) o;
        return java.util.Objects.equals(this.reqAuthenticationScheme, other.reqAuthenticationScheme)
                && java.util.Objects.equals(this.verifyResponseCodes, other.verifyResponseCodes)
                && java.util.Objects.equals(this.networkConfiguration, other.networkConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.reqAuthenticationScheme == null
                                ? 43
                                : this.reqAuthenticationScheme.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyResponseCodes == null
                                ? 43
                                : this.verifyResponseCodes.hashCode());
        result =
                (result * PRIME)
                        + (this.networkConfiguration == null
                                ? 43
                                : this.networkConfiguration.hashCode());
        return result;
    }
}
