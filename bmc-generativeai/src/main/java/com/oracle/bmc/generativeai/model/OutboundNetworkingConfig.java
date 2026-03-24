/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Outbound Networking configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OutboundNetworkingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OutboundNetworkingConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"networkMode", "customSubnetId", "nsgIds"})
    public OutboundNetworkingConfig(
            NetworkMode networkMode, String customSubnetId, java.util.List<String> nsgIds) {
        super();
        this.networkMode = networkMode;
        this.customSubnetId = customSubnetId;
        this.nsgIds = nsgIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** outbounding to managed internet or customer network. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkMode")
        private NetworkMode networkMode;

        /**
         * outbounding to managed internet or customer network.
         *
         * @param networkMode the value to set
         * @return this builder
         */
        public Builder networkMode(NetworkMode networkMode) {
            this.networkMode = networkMode;
            this.__explicitlySet__.add("networkMode");
            return this;
        }
        /** ocid of customer subnet when networkMode=Custom */
        @com.fasterxml.jackson.annotation.JsonProperty("customSubnetId")
        private String customSubnetId;

        /**
         * ocid of customer subnet when networkMode=Custom
         *
         * @param customSubnetId the value to set
         * @return this builder
         */
        public Builder customSubnetId(String customSubnetId) {
            this.customSubnetId = customSubnetId;
            this.__explicitlySet__.add("customSubnetId");
            return this;
        }
        /**
         * A list of the OCIDs of the network security groups that the private endpoint's VNIC
         * belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
        private java.util.List<String> nsgIds;

        /**
         * A list of the OCIDs of the network security groups that the private endpoint's VNIC
         * belongs to.
         *
         * @param nsgIds the value to set
         * @return this builder
         */
        public Builder nsgIds(java.util.List<String> nsgIds) {
            this.nsgIds = nsgIds;
            this.__explicitlySet__.add("nsgIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OutboundNetworkingConfig build() {
            OutboundNetworkingConfig model =
                    new OutboundNetworkingConfig(
                            this.networkMode, this.customSubnetId, this.nsgIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OutboundNetworkingConfig model) {
            if (model.wasPropertyExplicitlySet("networkMode")) {
                this.networkMode(model.getNetworkMode());
            }
            if (model.wasPropertyExplicitlySet("customSubnetId")) {
                this.customSubnetId(model.getCustomSubnetId());
            }
            if (model.wasPropertyExplicitlySet("nsgIds")) {
                this.nsgIds(model.getNsgIds());
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

    /** outbounding to managed internet or customer network. */
    public enum NetworkMode implements com.oracle.bmc.http.internal.BmcEnum {
        Managed("MANAGED"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkMode.class);

        private final String value;
        private static java.util.Map<String, NetworkMode> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkMode v : NetworkMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** outbounding to managed internet or customer network. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkMode")
    private final NetworkMode networkMode;

    /**
     * outbounding to managed internet or customer network.
     *
     * @return the value
     */
    public NetworkMode getNetworkMode() {
        return networkMode;
    }

    /** ocid of customer subnet when networkMode=Custom */
    @com.fasterxml.jackson.annotation.JsonProperty("customSubnetId")
    private final String customSubnetId;

    /**
     * ocid of customer subnet when networkMode=Custom
     *
     * @return the value
     */
    public String getCustomSubnetId() {
        return customSubnetId;
    }

    /**
     * A list of the OCIDs of the network security groups that the private endpoint's VNIC belongs
     * to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIds")
    private final java.util.List<String> nsgIds;

    /**
     * A list of the OCIDs of the network security groups that the private endpoint's VNIC belongs
     * to.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIds() {
        return nsgIds;
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
        sb.append("OutboundNetworkingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("networkMode=").append(String.valueOf(this.networkMode));
        sb.append(", customSubnetId=").append(String.valueOf(this.customSubnetId));
        sb.append(", nsgIds=").append(String.valueOf(this.nsgIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OutboundNetworkingConfig)) {
            return false;
        }

        OutboundNetworkingConfig other = (OutboundNetworkingConfig) o;
        return java.util.Objects.equals(this.networkMode, other.networkMode)
                && java.util.Objects.equals(this.customSubnetId, other.customSubnetId)
                && java.util.Objects.equals(this.nsgIds, other.nsgIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.networkMode == null ? 43 : this.networkMode.hashCode());
        result =
                (result * PRIME)
                        + (this.customSubnetId == null ? 43 : this.customSubnetId.hashCode());
        result = (result * PRIME) + (this.nsgIds == null ? 43 : this.nsgIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
