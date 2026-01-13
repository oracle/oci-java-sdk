/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Upgrade Exadata Fleet Update Cycle resource creation details. Batching strategy should always be
 * NON_ROLLING for DB collection upgrade. For GI upgrade case, Batching strategy may be NON_ROLLING
 * or SEQUENTIAL(default). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateUpgradeFsuCycle.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateUpgradeFsuCycle extends CreateFsuCycleDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
        private String fsuCollectionId;

        public Builder fsuCollectionId(String fsuCollectionId) {
            this.fsuCollectionId = fsuCollectionId;
            this.__explicitlySet__.add("fsuCollectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
        private FsuGoalVersionDetails goalVersionDetails;

        public Builder goalVersionDetails(FsuGoalVersionDetails goalVersionDetails) {
            this.goalVersionDetails = goalVersionDetails;
            this.__explicitlySet__.add("goalVersionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("batchingStrategy")
        private CreateBatchingStrategyDetails batchingStrategy;

        public Builder batchingStrategy(CreateBatchingStrategyDetails batchingStrategy) {
            this.batchingStrategy = batchingStrategy;
            this.__explicitlySet__.add("batchingStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stageActionSchedule")
        private CreateScheduleDetails stageActionSchedule;

        public Builder stageActionSchedule(CreateScheduleDetails stageActionSchedule) {
            this.stageActionSchedule = stageActionSchedule;
            this.__explicitlySet__.add("stageActionSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyActionSchedule")
        private CreateScheduleDetails applyActionSchedule;

        public Builder applyActionSchedule(CreateScheduleDetails applyActionSchedule) {
            this.applyActionSchedule = applyActionSchedule;
            this.__explicitlySet__.add("applyActionSchedule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
        private DiagnosticsCollectionDetails diagnosticsCollection;

        public Builder diagnosticsCollection(DiagnosticsCollectionDetails diagnosticsCollection) {
            this.diagnosticsCollection = diagnosticsCollection;
            this.__explicitlySet__.add("diagnosticsCollection");
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

        @com.fasterxml.jackson.annotation.JsonProperty("upgradeDetails")
        private UpgradeDetails upgradeDetails;

        public Builder upgradeDetails(UpgradeDetails upgradeDetails) {
            this.upgradeDetails = upgradeDetails;
            this.__explicitlySet__.add("upgradeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateUpgradeFsuCycle build() {
            CreateUpgradeFsuCycle model =
                    new CreateUpgradeFsuCycle(
                            this.displayName,
                            this.compartmentId,
                            this.fsuCollectionId,
                            this.goalVersionDetails,
                            this.batchingStrategy,
                            this.stageActionSchedule,
                            this.applyActionSchedule,
                            this.diagnosticsCollection,
                            this.freeformTags,
                            this.definedTags,
                            this.upgradeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateUpgradeFsuCycle model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fsuCollectionId")) {
                this.fsuCollectionId(model.getFsuCollectionId());
            }
            if (model.wasPropertyExplicitlySet("goalVersionDetails")) {
                this.goalVersionDetails(model.getGoalVersionDetails());
            }
            if (model.wasPropertyExplicitlySet("batchingStrategy")) {
                this.batchingStrategy(model.getBatchingStrategy());
            }
            if (model.wasPropertyExplicitlySet("stageActionSchedule")) {
                this.stageActionSchedule(model.getStageActionSchedule());
            }
            if (model.wasPropertyExplicitlySet("applyActionSchedule")) {
                this.applyActionSchedule(model.getApplyActionSchedule());
            }
            if (model.wasPropertyExplicitlySet("diagnosticsCollection")) {
                this.diagnosticsCollection(model.getDiagnosticsCollection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("upgradeDetails")) {
                this.upgradeDetails(model.getUpgradeDetails());
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
    public CreateUpgradeFsuCycle(
            String displayName,
            String compartmentId,
            String fsuCollectionId,
            FsuGoalVersionDetails goalVersionDetails,
            CreateBatchingStrategyDetails batchingStrategy,
            CreateScheduleDetails stageActionSchedule,
            CreateScheduleDetails applyActionSchedule,
            DiagnosticsCollectionDetails diagnosticsCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UpgradeDetails upgradeDetails) {
        super(
                displayName,
                compartmentId,
                fsuCollectionId,
                goalVersionDetails,
                batchingStrategy,
                stageActionSchedule,
                applyActionSchedule,
                diagnosticsCollection,
                freeformTags,
                definedTags);
        this.upgradeDetails = upgradeDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("upgradeDetails")
    private final UpgradeDetails upgradeDetails;

    public UpgradeDetails getUpgradeDetails() {
        return upgradeDetails;
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
        sb.append("CreateUpgradeFsuCycle(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", upgradeDetails=").append(String.valueOf(this.upgradeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateUpgradeFsuCycle)) {
            return false;
        }

        CreateUpgradeFsuCycle other = (CreateUpgradeFsuCycle) o;
        return java.util.Objects.equals(this.upgradeDetails, other.upgradeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.upgradeDetails == null ? 43 : this.upgradeDetails.hashCode());
        return result;
    }
}
