/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Summary of an AWS asset source provided in the list. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwsAssetSourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwsAssetSourceSummary extends AssetSourceSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("environmentId")
        private String environmentId;

        public Builder environmentId(String environmentId) {
            this.environmentId = environmentId;
            this.__explicitlySet__.add("environmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
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
        /** AWS region information, from where the resources are discovered. */
        @com.fasterxml.jackson.annotation.JsonProperty("awsRegion")
        private String awsRegion;

        /**
         * AWS region information, from where the resources are discovered.
         *
         * @param awsRegion the value to set
         * @return this builder
         */
        public Builder awsRegion(String awsRegion) {
            this.awsRegion = awsRegion;
            this.__explicitlySet__.add("awsRegion");
            return this;
        }
        /** The key of customer's aws account to be discovered/migrated. */
        @com.fasterxml.jackson.annotation.JsonProperty("awsAccountKey")
        private String awsAccountKey;

        /**
         * The key of customer's aws account to be discovered/migrated.
         *
         * @param awsAccountKey the value to set
         * @return this builder
         */
        public Builder awsAccountKey(String awsAccountKey) {
            this.awsAccountKey = awsAccountKey;
            this.__explicitlySet__.add("awsAccountKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwsAssetSourceSummary build() {
            AwsAssetSourceSummary model =
                    new AwsAssetSourceSummary(
                            this.id,
                            this.compartmentId,
                            this.environmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.inventoryId,
                            this.assetsCompartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.awsRegion,
                            this.awsAccountKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwsAssetSourceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("environmentId")) {
                this.environmentId(model.getEnvironmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("inventoryId")) {
                this.inventoryId(model.getInventoryId());
            }
            if (model.wasPropertyExplicitlySet("assetsCompartmentId")) {
                this.assetsCompartmentId(model.getAssetsCompartmentId());
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
            if (model.wasPropertyExplicitlySet("awsRegion")) {
                this.awsRegion(model.getAwsRegion());
            }
            if (model.wasPropertyExplicitlySet("awsAccountKey")) {
                this.awsAccountKey(model.getAwsAccountKey());
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
    public AwsAssetSourceSummary(
            String id,
            String compartmentId,
            String environmentId,
            String displayName,
            AssetSourceLifecycleState lifecycleState,
            String lifecycleDetails,
            String inventoryId,
            String assetsCompartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String awsRegion,
            String awsAccountKey) {
        super(
                id,
                compartmentId,
                environmentId,
                displayName,
                lifecycleState,
                lifecycleDetails,
                inventoryId,
                assetsCompartmentId,
                timeCreated,
                timeUpdated,
                freeformTags,
                definedTags,
                systemTags);
        this.awsRegion = awsRegion;
        this.awsAccountKey = awsAccountKey;
    }

    /** AWS region information, from where the resources are discovered. */
    @com.fasterxml.jackson.annotation.JsonProperty("awsRegion")
    private final String awsRegion;

    /**
     * AWS region information, from where the resources are discovered.
     *
     * @return the value
     */
    public String getAwsRegion() {
        return awsRegion;
    }

    /** The key of customer's aws account to be discovered/migrated. */
    @com.fasterxml.jackson.annotation.JsonProperty("awsAccountKey")
    private final String awsAccountKey;

    /**
     * The key of customer's aws account to be discovered/migrated.
     *
     * @return the value
     */
    public String getAwsAccountKey() {
        return awsAccountKey;
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
        sb.append("AwsAssetSourceSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", awsRegion=").append(String.valueOf(this.awsRegion));
        sb.append(", awsAccountKey=").append(String.valueOf(this.awsAccountKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwsAssetSourceSummary)) {
            return false;
        }

        AwsAssetSourceSummary other = (AwsAssetSourceSummary) o;
        return java.util.Objects.equals(this.awsRegion, other.awsRegion)
                && java.util.Objects.equals(this.awsAccountKey, other.awsAccountKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.awsRegion == null ? 43 : this.awsRegion.hashCode());
        result =
                (result * PRIME)
                        + (this.awsAccountKey == null ? 43 : this.awsAccountKey.hashCode());
        return result;
    }
}
