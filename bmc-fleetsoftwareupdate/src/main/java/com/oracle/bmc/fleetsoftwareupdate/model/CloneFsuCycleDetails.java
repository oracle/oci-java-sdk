/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Details for cloning an existing Exadata Fleet Update Cycle resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CloneFsuCycleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloneFsuCycleDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "fsuCollectionId",
        "goalVersionDetails",
        "batchingStrategy",
        "stageActionSchedule",
        "applyActionSchedule"
    })
    public CloneFsuCycleDetails(
            String displayName,
            String compartmentId,
            String fsuCollectionId,
            FsuGoalVersionDetails goalVersionDetails,
            CreateBatchingStrategyDetails batchingStrategy,
            CreateScheduleDetails stageActionSchedule,
            CreateScheduleDetails applyActionSchedule) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.fsuCollectionId = fsuCollectionId;
        this.goalVersionDetails = goalVersionDetails;
        this.batchingStrategy = batchingStrategy;
        this.stageActionSchedule = stageActionSchedule;
        this.applyActionSchedule = applyActionSchedule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Exadata Fleet Update Cycle display name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Exadata Fleet Update Cycle display name.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Compartment Identifier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * OCID identifier for the Collection ID the Exadata Fleet Update Cycle will be assigned to.
         * If not specified, it will be assigned to the same Collection as the source Exadata Fleet Update Cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
        private String fsuCollectionId;

        /**
         * OCID identifier for the Collection ID the Exadata Fleet Update Cycle will be assigned to.
         * If not specified, it will be assigned to the same Collection as the source Exadata Fleet Update Cycle.
         *
         * @param fsuCollectionId the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloneFsuCycleDetails build() {
            CloneFsuCycleDetails model =
                    new CloneFsuCycleDetails(
                            this.displayName,
                            this.compartmentId,
                            this.fsuCollectionId,
                            this.goalVersionDetails,
                            this.batchingStrategy,
                            this.stageActionSchedule,
                            this.applyActionSchedule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloneFsuCycleDetails model) {
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

    /**
     * Exadata Fleet Update Cycle display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Exadata Fleet Update Cycle display name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Compartment Identifier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * OCID identifier for the Collection ID the Exadata Fleet Update Cycle will be assigned to.
     * If not specified, it will be assigned to the same Collection as the source Exadata Fleet Update Cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
    private final String fsuCollectionId;

    /**
     * OCID identifier for the Collection ID the Exadata Fleet Update Cycle will be assigned to.
     * If not specified, it will be assigned to the same Collection as the source Exadata Fleet Update Cycle.
     *
     * @return the value
     **/
    public String getFsuCollectionId() {
        return fsuCollectionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("goalVersionDetails")
    private final FsuGoalVersionDetails goalVersionDetails;

    public FsuGoalVersionDetails getGoalVersionDetails() {
        return goalVersionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("batchingStrategy")
    private final CreateBatchingStrategyDetails batchingStrategy;

    public CreateBatchingStrategyDetails getBatchingStrategy() {
        return batchingStrategy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stageActionSchedule")
    private final CreateScheduleDetails stageActionSchedule;

    public CreateScheduleDetails getStageActionSchedule() {
        return stageActionSchedule;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyActionSchedule")
    private final CreateScheduleDetails applyActionSchedule;

    public CreateScheduleDetails getApplyActionSchedule() {
        return applyActionSchedule;
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
        sb.append("CloneFsuCycleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fsuCollectionId=").append(String.valueOf(this.fsuCollectionId));
        sb.append(", goalVersionDetails=").append(String.valueOf(this.goalVersionDetails));
        sb.append(", batchingStrategy=").append(String.valueOf(this.batchingStrategy));
        sb.append(", stageActionSchedule=").append(String.valueOf(this.stageActionSchedule));
        sb.append(", applyActionSchedule=").append(String.valueOf(this.applyActionSchedule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloneFsuCycleDetails)) {
            return false;
        }

        CloneFsuCycleDetails other = (CloneFsuCycleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fsuCollectionId, other.fsuCollectionId)
                && java.util.Objects.equals(this.goalVersionDetails, other.goalVersionDetails)
                && java.util.Objects.equals(this.batchingStrategy, other.batchingStrategy)
                && java.util.Objects.equals(this.stageActionSchedule, other.stageActionSchedule)
                && java.util.Objects.equals(this.applyActionSchedule, other.applyActionSchedule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.fsuCollectionId == null ? 43 : this.fsuCollectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.goalVersionDetails == null
                                ? 43
                                : this.goalVersionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.batchingStrategy == null ? 43 : this.batchingStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.stageActionSchedule == null
                                ? 43
                                : this.stageActionSchedule.hashCode());
        result =
                (result * PRIME)
                        + (this.applyActionSchedule == null
                                ? 43
                                : this.applyActionSchedule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
