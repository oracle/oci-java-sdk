/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to migrate a cluster to Native VCN. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ClusterMigrateToNativeVcnDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ClusterMigrateToNativeVcnDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endpointConfig", "decommissionDelayDuration"})
    public ClusterMigrateToNativeVcnDetails(
            ClusterEndpointConfig endpointConfig, String decommissionDelayDuration) {
        super();
        this.endpointConfig = endpointConfig;
        this.decommissionDelayDuration = decommissionDelayDuration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The network configuration for access to the Cluster control plane. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
        private ClusterEndpointConfig endpointConfig;

        /**
         * The network configuration for access to the Cluster control plane.
         *
         * @param endpointConfig the value to set
         * @return this builder
         */
        public Builder endpointConfig(ClusterEndpointConfig endpointConfig) {
            this.endpointConfig = endpointConfig;
            this.__explicitlySet__.add("endpointConfig");
            return this;
        }
        /**
         * The optional override of the non-native endpoint decommission time after migration is
         * complete. Defaults to 30 days.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("decommissionDelayDuration")
        private String decommissionDelayDuration;

        /**
         * The optional override of the non-native endpoint decommission time after migration is
         * complete. Defaults to 30 days.
         *
         * @param decommissionDelayDuration the value to set
         * @return this builder
         */
        public Builder decommissionDelayDuration(String decommissionDelayDuration) {
            this.decommissionDelayDuration = decommissionDelayDuration;
            this.__explicitlySet__.add("decommissionDelayDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterMigrateToNativeVcnDetails build() {
            ClusterMigrateToNativeVcnDetails model =
                    new ClusterMigrateToNativeVcnDetails(
                            this.endpointConfig, this.decommissionDelayDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterMigrateToNativeVcnDetails model) {
            if (model.wasPropertyExplicitlySet("endpointConfig")) {
                this.endpointConfig(model.getEndpointConfig());
            }
            if (model.wasPropertyExplicitlySet("decommissionDelayDuration")) {
                this.decommissionDelayDuration(model.getDecommissionDelayDuration());
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

    /** The network configuration for access to the Cluster control plane. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
    private final ClusterEndpointConfig endpointConfig;

    /**
     * The network configuration for access to the Cluster control plane.
     *
     * @return the value
     */
    public ClusterEndpointConfig getEndpointConfig() {
        return endpointConfig;
    }

    /**
     * The optional override of the non-native endpoint decommission time after migration is
     * complete. Defaults to 30 days.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("decommissionDelayDuration")
    private final String decommissionDelayDuration;

    /**
     * The optional override of the non-native endpoint decommission time after migration is
     * complete. Defaults to 30 days.
     *
     * @return the value
     */
    public String getDecommissionDelayDuration() {
        return decommissionDelayDuration;
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
        sb.append("ClusterMigrateToNativeVcnDetails(");
        sb.append("super=").append(super.toString());
        sb.append("endpointConfig=").append(String.valueOf(this.endpointConfig));
        sb.append(", decommissionDelayDuration=")
                .append(String.valueOf(this.decommissionDelayDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterMigrateToNativeVcnDetails)) {
            return false;
        }

        ClusterMigrateToNativeVcnDetails other = (ClusterMigrateToNativeVcnDetails) o;
        return java.util.Objects.equals(this.endpointConfig, other.endpointConfig)
                && java.util.Objects.equals(
                        this.decommissionDelayDuration, other.decommissionDelayDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.endpointConfig == null ? 43 : this.endpointConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.decommissionDelayDuration == null
                                ? 43
                                : this.decommissionDelayDuration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
