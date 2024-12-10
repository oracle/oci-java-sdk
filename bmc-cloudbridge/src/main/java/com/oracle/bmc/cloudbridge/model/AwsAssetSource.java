/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * AWS asset source. Used for discovery of EC2 instances and EBS volumes registered for the AWS account.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AwsAssetSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwsAssetSource extends AssetSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("environmentId")
        private String environmentId;

        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            this.__explicitlySet__.add("environmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inventoryId")
        private String inventoryId;

        public Builder inventoryId(String inventoryId) {
            this.inventoryId = inventoryId;
            this.__explicitlySet__.add("inventoryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("assetsCompartmentId")
        private String assetsCompartmentId;

        public Builder assetsCompartmentId(String assetsCompartmentId) {
            this.assetsCompartmentId = assetsCompartmentId;
            this.__explicitlySet__.add("assetsCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryScheduleId")
        private String discoveryScheduleId;

        public Builder discoveryScheduleId(String discoveryScheduleId) {
            this.discoveryScheduleId = discoveryScheduleId;
            this.__explicitlySet__.add("discoveryScheduleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AssetSourceLifecycleState lifecycleState;

        public Builder lifecycleState(AssetSourceLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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
         * AWS region information, from where the resources are discovered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awsRegion")
        private String awsRegion;

        /**
         * AWS region information, from where the resources are discovered.
         * @param awsRegion the value to set
         * @return this builder
         **/
        public Builder awsRegion(String awsRegion) {
            this.awsRegion = awsRegion;
            this.__explicitlySet__.add("awsRegion");
            return this;
        }
        /**
         * The key of customer's aws account to be discovered/migrated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("awsAccountKey")
        private String awsAccountKey;

        /**
         * The key of customer's aws account to be discovered/migrated.
         * @param awsAccountKey the value to set
         * @return this builder
         **/
        public Builder awsAccountKey(String awsAccountKey) {
            this.awsAccountKey = awsAccountKey;
            this.__explicitlySet__.add("awsAccountKey");
            return this;
        }
        /**
         * Flag indicating whether historical metrics are collected for assets, originating from this asset source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areHistoricalMetricsCollected")
        private Boolean areHistoricalMetricsCollected;

        /**
         * Flag indicating whether historical metrics are collected for assets, originating from this asset source.
         * @param areHistoricalMetricsCollected the value to set
         * @return this builder
         **/
        public Builder areHistoricalMetricsCollected(Boolean areHistoricalMetricsCollected) {
            this.areHistoricalMetricsCollected = areHistoricalMetricsCollected;
            this.__explicitlySet__.add("areHistoricalMetricsCollected");
            return this;
        }
        /**
         * Flag indicating whether real-time metrics are collected for assets, originating from this asset source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areRealtimeMetricsCollected")
        private Boolean areRealtimeMetricsCollected;

        /**
         * Flag indicating whether real-time metrics are collected for assets, originating from this asset source.
         * @param areRealtimeMetricsCollected the value to set
         * @return this builder
         **/
        public Builder areRealtimeMetricsCollected(Boolean areRealtimeMetricsCollected) {
            this.areRealtimeMetricsCollected = areRealtimeMetricsCollected;
            this.__explicitlySet__.add("areRealtimeMetricsCollected");
            return this;
        }
        /**
         * Flag indicating whether cost data collection is enabled for assets, originating from this asset source.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCostInformationCollected")
        private Boolean isCostInformationCollected;

        /**
         * Flag indicating whether cost data collection is enabled for assets, originating from this asset source.
         * @param isCostInformationCollected the value to set
         * @return this builder
         **/
        public Builder isCostInformationCollected(Boolean isCostInformationCollected) {
            this.isCostInformationCollected = isCostInformationCollected;
            this.__explicitlySet__.add("isCostInformationCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsAssetSource build() {
            AwsAssetSource model =
                    new AwsAssetSource(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.environmentId,
                            this.inventoryId,
                            this.assetsCompartmentId,
                            this.discoveryScheduleId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.discoveryCredentials,
                            this.replicationCredentials,
                            this.awsRegion,
                            this.awsAccountKey,
                            this.areHistoricalMetricsCollected,
                            this.areRealtimeMetricsCollected,
                            this.isCostInformationCollected);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsAssetSource model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("environmentId")) {
                this.environmentId(model.getEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("inventoryId")) {
                this.inventoryId(model.getInventoryId());
            }
            if (model.wasPropertyExplicitlySet("assetsCompartmentId")) {
                this.assetsCompartmentId(model.getAssetsCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("discoveryScheduleId")) {
                this.discoveryScheduleId(model.getDiscoveryScheduleId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
            if (model.wasPropertyExplicitlySet("discoveryCredentials")) {
                this.discoveryCredentials(model.getDiscoveryCredentials());
            }
            if (model.wasPropertyExplicitlySet("replicationCredentials")) {
                this.replicationCredentials(model.getReplicationCredentials());
            }
            if (model.wasPropertyExplicitlySet("awsRegion")) {
                this.awsRegion(model.getAwsRegion());
            }
            if (model.wasPropertyExplicitlySet("awsAccountKey")) {
                this.awsAccountKey(model.getAwsAccountKey());
            }
            if (model.wasPropertyExplicitlySet("areHistoricalMetricsCollected")) {
                this.areHistoricalMetricsCollected(model.getAreHistoricalMetricsCollected());
            }
            if (model.wasPropertyExplicitlySet("areRealtimeMetricsCollected")) {
                this.areRealtimeMetricsCollected(model.getAreRealtimeMetricsCollected());
            }
            if (model.wasPropertyExplicitlySet("isCostInformationCollected")) {
                this.isCostInformationCollected(model.getIsCostInformationCollected());
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

    @Deprecated
    public AwsAssetSource(
            String id,
            String compartmentId,
            String displayName,
            String environmentId,
            String inventoryId,
            String assetsCompartmentId,
            String discoveryScheduleId,
            AssetSourceLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            AssetSourceCredentials discoveryCredentials,
            AssetSourceCredentials replicationCredentials,
            String awsRegion,
            String awsAccountKey,
            Boolean areHistoricalMetricsCollected,
            Boolean areRealtimeMetricsCollected,
            Boolean isCostInformationCollected) {
        super(
                id,
                compartmentId,
                displayName,
                environmentId,
                inventoryId,
                assetsCompartmentId,
                discoveryScheduleId,
                lifecycleState,
                lifecycleDetails,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags,
                systemTags);
        this.discoveryCredentials = discoveryCredentials;
        this.replicationCredentials = replicationCredentials;
        this.awsRegion = awsRegion;
        this.awsAccountKey = awsAccountKey;
        this.areHistoricalMetricsCollected = areHistoricalMetricsCollected;
        this.areRealtimeMetricsCollected = areRealtimeMetricsCollected;
        this.isCostInformationCollected = isCostInformationCollected;
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
     * AWS region information, from where the resources are discovered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awsRegion")
    private final String awsRegion;

    /**
     * AWS region information, from where the resources are discovered.
     * @return the value
     **/
    public String getAwsRegion() {
        return awsRegion;
    }

    /**
     * The key of customer's aws account to be discovered/migrated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("awsAccountKey")
    private final String awsAccountKey;

    /**
     * The key of customer's aws account to be discovered/migrated.
     * @return the value
     **/
    public String getAwsAccountKey() {
        return awsAccountKey;
    }

    /**
     * Flag indicating whether historical metrics are collected for assets, originating from this asset source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areHistoricalMetricsCollected")
    private final Boolean areHistoricalMetricsCollected;

    /**
     * Flag indicating whether historical metrics are collected for assets, originating from this asset source.
     * @return the value
     **/
    public Boolean getAreHistoricalMetricsCollected() {
        return areHistoricalMetricsCollected;
    }

    /**
     * Flag indicating whether real-time metrics are collected for assets, originating from this asset source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areRealtimeMetricsCollected")
    private final Boolean areRealtimeMetricsCollected;

    /**
     * Flag indicating whether real-time metrics are collected for assets, originating from this asset source.
     * @return the value
     **/
    public Boolean getAreRealtimeMetricsCollected() {
        return areRealtimeMetricsCollected;
    }

    /**
     * Flag indicating whether cost data collection is enabled for assets, originating from this asset source.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCostInformationCollected")
    private final Boolean isCostInformationCollected;

    /**
     * Flag indicating whether cost data collection is enabled for assets, originating from this asset source.
     * @return the value
     **/
    public Boolean getIsCostInformationCollected() {
        return isCostInformationCollected;
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
        sb.append("AwsAssetSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", discoveryCredentials=").append(String.valueOf(this.discoveryCredentials));
        sb.append(", replicationCredentials=").append(String.valueOf(this.replicationCredentials));
        sb.append(", awsRegion=").append(String.valueOf(this.awsRegion));
        sb.append(", awsAccountKey=").append(String.valueOf(this.awsAccountKey));
        sb.append(", areHistoricalMetricsCollected=")
                .append(String.valueOf(this.areHistoricalMetricsCollected));
        sb.append(", areRealtimeMetricsCollected=")
                .append(String.valueOf(this.areRealtimeMetricsCollected));
        sb.append(", isCostInformationCollected=")
                .append(String.valueOf(this.isCostInformationCollected));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsAssetSource)) {
            return false;
        }

        AwsAssetSource other = (AwsAssetSource) o;
        return java.util.Objects.equals(this.discoveryCredentials, other.discoveryCredentials)
                && java.util.Objects.equals(
                        this.replicationCredentials, other.replicationCredentials)
                && java.util.Objects.equals(this.awsRegion, other.awsRegion)
                && java.util.Objects.equals(this.awsAccountKey, other.awsAccountKey)
                && java.util.Objects.equals(
                        this.areHistoricalMetricsCollected, other.areHistoricalMetricsCollected)
                && java.util.Objects.equals(
                        this.areRealtimeMetricsCollected, other.areRealtimeMetricsCollected)
                && java.util.Objects.equals(
                        this.isCostInformationCollected, other.isCostInformationCollected)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
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
        result = (result * PRIME) + (this.awsRegion == null ? 43 : this.awsRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.awsAccountKey == null ? 43 : this.awsAccountKey.hashCode());
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
                        + (this.isCostInformationCollected == null
                                ? 43
                                : this.isCostInformationCollected.hashCode());
        return result;
    }
}
