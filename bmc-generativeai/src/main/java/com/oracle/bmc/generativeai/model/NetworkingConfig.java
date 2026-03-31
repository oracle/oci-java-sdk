/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Networking configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NetworkingConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inboundNetworkingConfig", "outboundNetworkingConfig"})
    public NetworkingConfig(
            InboundNetworkingConfig inboundNetworkingConfig,
            OutboundNetworkingConfig outboundNetworkingConfig) {
        super();
        this.inboundNetworkingConfig = inboundNetworkingConfig;
        this.outboundNetworkingConfig = outboundNetworkingConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("inboundNetworkingConfig")
        private InboundNetworkingConfig inboundNetworkingConfig;

        public Builder inboundNetworkingConfig(InboundNetworkingConfig inboundNetworkingConfig) {
            this.inboundNetworkingConfig = inboundNetworkingConfig;
            this.__explicitlySet__.add("inboundNetworkingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outboundNetworkingConfig")
        private OutboundNetworkingConfig outboundNetworkingConfig;

        public Builder outboundNetworkingConfig(OutboundNetworkingConfig outboundNetworkingConfig) {
            this.outboundNetworkingConfig = outboundNetworkingConfig;
            this.__explicitlySet__.add("outboundNetworkingConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkingConfig build() {
            NetworkingConfig model =
                    new NetworkingConfig(
                            this.inboundNetworkingConfig, this.outboundNetworkingConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkingConfig model) {
            if (model.wasPropertyExplicitlySet("inboundNetworkingConfig")) {
                this.inboundNetworkingConfig(model.getInboundNetworkingConfig());
            }
            if (model.wasPropertyExplicitlySet("outboundNetworkingConfig")) {
                this.outboundNetworkingConfig(model.getOutboundNetworkingConfig());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inboundNetworkingConfig")
    private final InboundNetworkingConfig inboundNetworkingConfig;

    public InboundNetworkingConfig getInboundNetworkingConfig() {
        return inboundNetworkingConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outboundNetworkingConfig")
    private final OutboundNetworkingConfig outboundNetworkingConfig;

    public OutboundNetworkingConfig getOutboundNetworkingConfig() {
        return outboundNetworkingConfig;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NetworkingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("inboundNetworkingConfig=").append(String.valueOf(this.inboundNetworkingConfig));
        sb.append(", outboundNetworkingConfig=")
                .append(String.valueOf(this.outboundNetworkingConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkingConfig)) {
            return false;
        }

        NetworkingConfig other = (NetworkingConfig) o;
        return java.util.Objects.equals(this.inboundNetworkingConfig, other.inboundNetworkingConfig)
                && java.util.Objects.equals(
                        this.outboundNetworkingConfig, other.outboundNetworkingConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inboundNetworkingConfig == null
                                ? 43
                                : this.inboundNetworkingConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.outboundNetworkingConfig == null
                                ? 43
                                : this.outboundNetworkingConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
