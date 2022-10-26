/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Asset source update details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVmWareAssetSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateVmWareAssetSourceDetails extends UpdateAssetSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetsCompartmentId")
        private String assetsCompartmentId;

        public Builder assetsCompartmentId(String assetsCompartmentId) {
            this.assetsCompartmentId = assetsCompartmentId;
            this.__explicitlySet__.add("assetsCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Endpoint for VMware asset discovery and replication in the form of {@code
         * https://<host>:<port>/sdk}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcenterEndpoint")
        private String vcenterEndpoint;

        /**
         * Endpoint for VMware asset discovery and replication in the form of {@code
         * https://<host>:<port>/sdk}
         *
         * @param vcenterEndpoint the value to set
         * @return this builder
         */
        public Builder vcenterEndpoint(String vcenterEndpoint) {
            this.vcenterEndpoint = vcenterEndpoint;
            this.__explicitlySet__.add("vcenterEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryCredentials")
        private AssetSourceCredentials discoveryCredentials;

        public Builder discoveryCredentials(AssetSourceCredentials discoveryCredentials) {
            this.discoveryCredentials = discoveryCredentials;
            this.__explicitlySet__.add("discoveryCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicationCredentials")
        private AssetSourceCredentials replicationCredentials;

        public Builder replicationCredentials(AssetSourceCredentials replicationCredentials) {
            this.replicationCredentials = replicationCredentials;
            this.__explicitlySet__.add("replicationCredentials");
            return this;
        }
        /**
         * Flag indicating whether historical metrics are collected for assets, originating from
         * this asset source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areHistoricalMetricsCollected")
        private Boolean areHistoricalMetricsCollected;

        /**
         * Flag indicating whether historical metrics are collected for assets, originating from
         * this asset source.
         *
         * @param areHistoricalMetricsCollected the value to set
         * @return this builder
         */
        public Builder areHistoricalMetricsCollected(Boolean areHistoricalMetricsCollected) {
            this.areHistoricalMetricsCollected = areHistoricalMetricsCollected;
            this.__explicitlySet__.add("areHistoricalMetricsCollected");
            return this;
        }
        /**
         * Flag indicating whether real-time metrics are collected for assets, originating from this
         * asset source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areRealtimeMetricsCollected")
        private Boolean areRealtimeMetricsCollected;

        /**
         * Flag indicating whether real-time metrics are collected for assets, originating from this
         * asset source.
         *
         * @param areRealtimeMetricsCollected the value to set
         * @return this builder
         */
        public Builder areRealtimeMetricsCollected(Boolean areRealtimeMetricsCollected) {
            this.areRealtimeMetricsCollected = areRealtimeMetricsCollected;
            this.__explicitlySet__.add("areRealtimeMetricsCollected");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * discovery schedule that is going to be assigned to an asset source.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryScheduleId")
        private String discoveryScheduleId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * discovery schedule that is going to be assigned to an asset source.
         *
         * @param discoveryScheduleId the value to set
         * @return this builder
         */
        public Builder discoveryScheduleId(String discoveryScheduleId) {
            this.discoveryScheduleId = discoveryScheduleId;
            this.__explicitlySet__.add("discoveryScheduleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVmWareAssetSourceDetails build() {
            UpdateVmWareAssetSourceDetails model =
                    new UpdateVmWareAssetSourceDetails(
                            this.displayName,
                            this.assetsCompartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.vcenterEndpoint,
                            this.discoveryCredentials,
                            this.replicationCredentials,
                            this.areHistoricalMetricsCollected,
                            this.areRealtimeMetricsCollected,
                            this.discoveryScheduleId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVmWareAssetSourceDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("assetsCompartmentId")) {
                this.assetsCompartmentId(model.getAssetsCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("vcenterEndpoint")) {
                this.vcenterEndpoint(model.getVcenterEndpoint());
            }
            if (model.wasPropertyExplicitlySet("discoveryCredentials")) {
                this.discoveryCredentials(model.getDiscoveryCredentials());
            }
            if (model.wasPropertyExplicitlySet("replicationCredentials")) {
                this.replicationCredentials(model.getReplicationCredentials());
            }
            if (model.wasPropertyExplicitlySet("areHistoricalMetricsCollected")) {
                this.areHistoricalMetricsCollected(model.getAreHistoricalMetricsCollected());
            }
            if (model.wasPropertyExplicitlySet("areRealtimeMetricsCollected")) {
                this.areRealtimeMetricsCollected(model.getAreRealtimeMetricsCollected());
            }
            if (model.wasPropertyExplicitlySet("discoveryScheduleId")) {
                this.discoveryScheduleId(model.getDiscoveryScheduleId());
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
    public UpdateVmWareAssetSourceDetails(
            String displayName,
            String assetsCompartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String vcenterEndpoint,
            AssetSourceCredentials discoveryCredentials,
            AssetSourceCredentials replicationCredentials,
            Boolean areHistoricalMetricsCollected,
            Boolean areRealtimeMetricsCollected,
            String discoveryScheduleId) {
        super(displayName, assetsCompartmentId, freeformTags, definedTags, systemTags);
        this.vcenterEndpoint = vcenterEndpoint;
        this.discoveryCredentials = discoveryCredentials;
        this.replicationCredentials = replicationCredentials;
        this.areHistoricalMetricsCollected = areHistoricalMetricsCollected;
        this.areRealtimeMetricsCollected = areRealtimeMetricsCollected;
        this.discoveryScheduleId = discoveryScheduleId;
    }

    /**
     * Endpoint for VMware asset discovery and replication in the form of {@code
     * https://<host>:<port>/sdk}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcenterEndpoint")
    private final String vcenterEndpoint;

    /**
     * Endpoint for VMware asset discovery and replication in the form of {@code
     * https://<host>:<port>/sdk}
     *
     * @return the value
     */
    public String getVcenterEndpoint() {
        return vcenterEndpoint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("discoveryCredentials")
    private final AssetSourceCredentials discoveryCredentials;

    public AssetSourceCredentials getDiscoveryCredentials() {
        return discoveryCredentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicationCredentials")
    private final AssetSourceCredentials replicationCredentials;

    public AssetSourceCredentials getReplicationCredentials() {
        return replicationCredentials;
    }

    /**
     * Flag indicating whether historical metrics are collected for assets, originating from this
     * asset source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areHistoricalMetricsCollected")
    private final Boolean areHistoricalMetricsCollected;

    /**
     * Flag indicating whether historical metrics are collected for assets, originating from this
     * asset source.
     *
     * @return the value
     */
    public Boolean getAreHistoricalMetricsCollected() {
        return areHistoricalMetricsCollected;
    }

    /**
     * Flag indicating whether real-time metrics are collected for assets, originating from this
     * asset source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areRealtimeMetricsCollected")
    private final Boolean areRealtimeMetricsCollected;

    /**
     * Flag indicating whether real-time metrics are collected for assets, originating from this
     * asset source.
     *
     * @return the value
     */
    public Boolean getAreRealtimeMetricsCollected() {
        return areRealtimeMetricsCollected;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * discovery schedule that is going to be assigned to an asset source.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryScheduleId")
    private final String discoveryScheduleId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * discovery schedule that is going to be assigned to an asset source.
     *
     * @return the value
     */
    public String getDiscoveryScheduleId() {
        return discoveryScheduleId;
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
        sb.append("UpdateVmWareAssetSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", vcenterEndpoint=").append(String.valueOf(this.vcenterEndpoint));
        sb.append(", discoveryCredentials=").append(String.valueOf(this.discoveryCredentials));
        sb.append(", replicationCredentials=").append(String.valueOf(this.replicationCredentials));
        sb.append(", areHistoricalMetricsCollected=")
                .append(String.valueOf(this.areHistoricalMetricsCollected));
        sb.append(", areRealtimeMetricsCollected=")
                .append(String.valueOf(this.areRealtimeMetricsCollected));
        sb.append(", discoveryScheduleId=").append(String.valueOf(this.discoveryScheduleId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVmWareAssetSourceDetails)) {
            return false;
        }

        UpdateVmWareAssetSourceDetails other = (UpdateVmWareAssetSourceDetails) o;
        return java.util.Objects.equals(this.vcenterEndpoint, other.vcenterEndpoint)
                && java.util.Objects.equals(this.discoveryCredentials, other.discoveryCredentials)
                && java.util.Objects.equals(
                        this.replicationCredentials, other.replicationCredentials)
                && java.util.Objects.equals(
                        this.areHistoricalMetricsCollected, other.areHistoricalMetricsCollected)
                && java.util.Objects.equals(
                        this.areRealtimeMetricsCollected, other.areRealtimeMetricsCollected)
                && java.util.Objects.equals(this.discoveryScheduleId, other.discoveryScheduleId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.vcenterEndpoint == null ? 43 : this.vcenterEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryCredentials == null
                                ? 43
                                : this.discoveryCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationCredentials == null
                                ? 43
                                : this.replicationCredentials.hashCode());
        result =
                (result * PRIME)
                        + (this.areHistoricalMetricsCollected == null
                                ? 43
                                : this.areHistoricalMetricsCollected.hashCode());
        result =
                (result * PRIME)
                        + (this.areRealtimeMetricsCollected == null
                                ? 43
                                : this.areRealtimeMetricsCollected.hashCode());
        result =
                (result * PRIME)
                        + (this.discoveryScheduleId == null
                                ? 43
                                : this.discoveryScheduleId.hashCode());
        return result;
    }
}
