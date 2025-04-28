/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Fleet Update Cycle resource creation details. <br>
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = CreateFsuCycleDetails.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CreatePatchFsuCycle.class,
            name = "PATCH")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class CreateFsuCycleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "fsuCollectionId",
        "goalVersionDetails",
        "batchingStrategy",
        "stageActionSchedule",
        "applyActionSchedule",
        "diagnosticsCollection",
        "freeformTags",
        "definedTags"
    })
    protected CreateFsuCycleDetails(
            String displayName,
            String compartmentId,
            String fsuCollectionId,
            FsuGoalVersionDetails goalVersionDetails,
            CreateBatchingStrategyDetails batchingStrategy,
            CreateScheduleDetails stageActionSchedule,
            CreateScheduleDetails applyActionSchedule,
            DiagnosticsCollectionDetails diagnosticsCollection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.fsuCollectionId = fsuCollectionId;
        this.goalVersionDetails = goalVersionDetails;
        this.batchingStrategy = batchingStrategy;
        this.stageActionSchedule = stageActionSchedule;
        this.applyActionSchedule = applyActionSchedule;
        this.diagnosticsCollection = diagnosticsCollection;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    /** Exadata Fleet Update Cycle display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Exadata Fleet Update Cycle display name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID identifier for the Collection ID the Exadata Fleet Update Cycle will be assigned to. */
    @com.fasterxml.jackson.annotation.JsonProperty("fsuCollectionId")
    private final String fsuCollectionId;

    /**
     * OCID identifier for the Collection ID the Exadata Fleet Update Cycle will be assigned to.
     *
     * @return the value
     */
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

    @com.fasterxml.jackson.annotation.JsonProperty("diagnosticsCollection")
    private final DiagnosticsCollectionDetails diagnosticsCollection;

    public DiagnosticsCollectionDetails getDiagnosticsCollection() {
        return diagnosticsCollection;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateFsuCycleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", fsuCollectionId=").append(String.valueOf(this.fsuCollectionId));
        sb.append(", goalVersionDetails=").append(String.valueOf(this.goalVersionDetails));
        sb.append(", batchingStrategy=").append(String.valueOf(this.batchingStrategy));
        sb.append(", stageActionSchedule=").append(String.valueOf(this.stageActionSchedule));
        sb.append(", applyActionSchedule=").append(String.valueOf(this.applyActionSchedule));
        sb.append(", diagnosticsCollection=").append(String.valueOf(this.diagnosticsCollection));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateFsuCycleDetails)) {
            return false;
        }

        CreateFsuCycleDetails other = (CreateFsuCycleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.fsuCollectionId, other.fsuCollectionId)
                && java.util.Objects.equals(this.goalVersionDetails, other.goalVersionDetails)
                && java.util.Objects.equals(this.batchingStrategy, other.batchingStrategy)
                && java.util.Objects.equals(this.stageActionSchedule, other.stageActionSchedule)
                && java.util.Objects.equals(this.applyActionSchedule, other.applyActionSchedule)
                && java.util.Objects.equals(this.diagnosticsCollection, other.diagnosticsCollection)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
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
        result =
                (result * PRIME)
                        + (this.diagnosticsCollection == null
                                ? 43
                                : this.diagnosticsCollection.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
