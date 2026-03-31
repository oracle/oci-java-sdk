/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Summary of the VM target asset. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmTargetAssetSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmTargetAssetSummary extends TargetAssetSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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
        private TargetAsset.LifecycleState lifecycleState;

        public Builder lifecycleState(TargetAsset.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationPlanId")
        private String migrationPlanId;

        public Builder migrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            this.__explicitlySet__.add("migrationPlanId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdResourceId")
        private String createdResourceId;

        public Builder createdResourceId(String createdResourceId) {
            this.createdResourceId = createdResourceId;
            this.__explicitlySet__.add("createdResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isExcludedFromExecution")
        private Boolean isExcludedFromExecution;

        public Builder isExcludedFromExecution(Boolean isExcludedFromExecution) {
            this.isExcludedFromExecution = isExcludedFromExecution;
            this.__explicitlySet__.add("isExcludedFromExecution");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compatibilityMessages")
        private java.util.List<CompatibilityMessage> compatibilityMessages;

        public Builder compatibilityMessages(
                java.util.List<CompatibilityMessage> compatibilityMessages) {
            this.compatibilityMessages = compatibilityMessages;
            this.__explicitlySet__.add("compatibilityMessages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedCost")
        private CostEstimation estimatedCost;

        public Builder estimatedCost(CostEstimation estimatedCost) {
            this.estimatedCost = estimatedCost;
            this.__explicitlySet__.add("estimatedCost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAssessed")
        private java.util.Date timeAssessed;

        public Builder timeAssessed(java.util.Date timeAssessed) {
            this.timeAssessed = timeAssessed;
            this.__explicitlySet__.add("timeAssessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("migrationAsset")
        private MigrationAssetSummary migrationAsset;

        public Builder migrationAsset(MigrationAssetSummary migrationAsset) {
            this.migrationAsset = migrationAsset;
            this.__explicitlySet__.add("migrationAsset");
            return this;
        }
        /** Microsoft license for VM configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
        private String msLicense;

        /**
         * Microsoft license for VM configuration.
         *
         * @param msLicense the value to set
         * @return this builder
         */
        public Builder msLicense(String msLicense) {
            this.msLicense = msLicense;
            this.__explicitlySet__.add("msLicense");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmTargetAssetSummary build() {
            OlvmTargetAssetSummary model =
                    new OlvmTargetAssetSummary(
                            this.id,
                            this.displayName,
                            this.lifecycleState,
                            this.migrationPlanId,
                            this.compartmentId,
                            this.createdResourceId,
                            this.isExcludedFromExecution,
                            this.compatibilityMessages,
                            this.estimatedCost,
                            this.timeCreated,
                            this.lifecycleDetails,
                            this.timeUpdated,
                            this.timeAssessed,
                            this.migrationAsset,
                            this.msLicense);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmTargetAssetSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("migrationPlanId")) {
                this.migrationPlanId(model.getMigrationPlanId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdResourceId")) {
                this.createdResourceId(model.getCreatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("isExcludedFromExecution")) {
                this.isExcludedFromExecution(model.getIsExcludedFromExecution());
            }
            if (model.wasPropertyExplicitlySet("compatibilityMessages")) {
                this.compatibilityMessages(model.getCompatibilityMessages());
            }
            if (model.wasPropertyExplicitlySet("estimatedCost")) {
                this.estimatedCost(model.getEstimatedCost());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeAssessed")) {
                this.timeAssessed(model.getTimeAssessed());
            }
            if (model.wasPropertyExplicitlySet("migrationAsset")) {
                this.migrationAsset(model.getMigrationAsset());
            }
            if (model.wasPropertyExplicitlySet("msLicense")) {
                this.msLicense(model.getMsLicense());
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
    public OlvmTargetAssetSummary(
            String id,
            String displayName,
            TargetAsset.LifecycleState lifecycleState,
            String migrationPlanId,
            String compartmentId,
            String createdResourceId,
            Boolean isExcludedFromExecution,
            java.util.List<CompatibilityMessage> compatibilityMessages,
            CostEstimation estimatedCost,
            java.util.Date timeCreated,
            String lifecycleDetails,
            java.util.Date timeUpdated,
            java.util.Date timeAssessed,
            MigrationAssetSummary migrationAsset,
            String msLicense) {
        super(
                id,
                displayName,
                lifecycleState,
                migrationPlanId,
                compartmentId,
                createdResourceId,
                isExcludedFromExecution,
                compatibilityMessages,
                estimatedCost,
                timeCreated,
                lifecycleDetails,
                timeUpdated,
                timeAssessed,
                migrationAsset);
        this.msLicense = msLicense;
    }

    /** Microsoft license for VM configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("msLicense")
    private final String msLicense;

    /**
     * Microsoft license for VM configuration.
     *
     * @return the value
     */
    public String getMsLicense() {
        return msLicense;
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
        sb.append("OlvmTargetAssetSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", msLicense=").append(String.valueOf(this.msLicense));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmTargetAssetSummary)) {
            return false;
        }

        OlvmTargetAssetSummary other = (OlvmTargetAssetSummary) o;
        return java.util.Objects.equals(this.msLicense, other.msLicense) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.msLicense == null ? 43 : this.msLicense.hashCode());
        return result;
    }
}
