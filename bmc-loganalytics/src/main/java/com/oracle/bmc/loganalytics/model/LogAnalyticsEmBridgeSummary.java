/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Enterprise manager bridge summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEmBridgeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsEmBridgeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emEntitiesCompartmentId")
        private String emEntitiesCompartmentId;

        public Builder emEntitiesCompartmentId(String emEntitiesCompartmentId) {
            this.emEntitiesCompartmentId = emEntitiesCompartmentId;
            this.__explicitlySet__.add("emEntitiesCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EmBridgeLifecycleStates lifecycleState;

        public Builder lifecycleState(EmBridgeLifecycleStates lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingStatus")
        private EmBridgeLatestImportProcessingStatus lastImportProcessingStatus;

        public Builder lastImportProcessingStatus(
                EmBridgeLatestImportProcessingStatus lastImportProcessingStatus) {
            this.lastImportProcessingStatus = lastImportProcessingStatus;
            this.__explicitlySet__.add("lastImportProcessingStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingDetails")
        private String lastImportProcessingDetails;

        public Builder lastImportProcessingDetails(String lastImportProcessingDetails) {
            this.lastImportProcessingDetails = lastImportProcessingDetails;
            this.__explicitlySet__.add("lastImportProcessingDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeImportLastProcessed")
        private java.util.Date timeImportLastProcessed;

        public Builder timeImportLastProcessed(java.util.Date timeImportLastProcessed) {
            this.timeImportLastProcessed = timeImportLastProcessed;
            this.__explicitlySet__.add("timeImportLastProcessed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEmDataLastExtracted")
        private java.util.Date timeEmDataLastExtracted;

        public Builder timeEmDataLastExtracted(java.util.Date timeEmDataLastExtracted) {
            this.timeEmDataLastExtracted = timeEmDataLastExtracted;
            this.__explicitlySet__.add("timeEmDataLastExtracted");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEmBridgeSummary build() {
            LogAnalyticsEmBridgeSummary __instance__ =
                    new LogAnalyticsEmBridgeSummary(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            emEntitiesCompartmentId,
                            bucketName,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            lastImportProcessingStatus,
                            lastImportProcessingDetails,
                            timeImportLastProcessed,
                            timeEmDataLastExtracted,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsEmBridgeSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .emEntitiesCompartmentId(o.getEmEntitiesCompartmentId())
                            .bucketName(o.getBucketName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lastImportProcessingStatus(o.getLastImportProcessingStatus())
                            .lastImportProcessingDetails(o.getLastImportProcessingDetails())
                            .timeImportLastProcessed(o.getTimeImportLastProcessed())
                            .timeEmDataLastExtracted(o.getTimeEmDataLastExtracted())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The enterprise manager bridge OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Log analytics enterprise manager bridge display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A description for log analytics enterprise manager bridge.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Compartment for entities created from enterprise manager.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emEntitiesCompartmentId")
    String emEntitiesCompartmentId;

    /**
     * Object store bucket name where enterprise manager harvested entities will be uploaded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    String bucketName;

    /**
     * The date and time the resource was created, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the resource was last updated, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the enterprise manager bridge.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    EmBridgeLifecycleStates lifecycleState;

    /**
     * lifecycleDetails has additional information regarding substeps such as verifying connection to object store.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The status from last processing status of enterprise manager upload.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingStatus")
    EmBridgeLatestImportProcessingStatus lastImportProcessingStatus;

    /**
     * Processing status details of enterprise manager upload. This provides additional details
     * for failed status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingDetails")
    String lastImportProcessingDetails;

    /**
     * The last time of enterprise manager upload was processed. This is in the format defined by RFC3339
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeImportLastProcessed")
    java.util.Date timeImportLastProcessed;

    /**
     * The timestamp of last enterprise manager upload to OCI Object Store. This is in the format defined by RFC3339
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEmDataLastExtracted")
    java.util.Date timeEmDataLastExtracted;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
