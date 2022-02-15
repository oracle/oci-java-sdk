/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary details of an archive retrieval.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditArchiveRetrievalSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AuditArchiveRetrievalSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeRequested")
        private java.util.Date timeRequested;

        public Builder timeRequested(java.util.Date timeRequested) {
            this.timeRequested = timeRequested;
            this.__explicitlySet__.add("timeRequested");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
        private java.util.Date timeOfExpiry;

        public Builder timeOfExpiry(java.util.Date timeOfExpiry) {
            this.timeOfExpiry = timeOfExpiry;
            this.__explicitlySet__.add("timeOfExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditEventCount")
        private Long auditEventCount;

        public Builder auditEventCount(Long auditEventCount) {
            this.auditEventCount = auditEventCount;
            this.__explicitlySet__.add("auditEventCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
        private String errorInfo;

        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            this.__explicitlySet__.add("errorInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditArchiveRetrievalLifecycleState lifecycleState;

        public Builder lifecycleState(AuditArchiveRetrievalLifecycleState lifecycleState) {
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

        public AuditArchiveRetrievalSummary build() {
            AuditArchiveRetrievalSummary __instance__ =
                    new AuditArchiveRetrievalSummary(
                            id,
                            compartmentId,
                            displayName,
                            description,
                            startDate,
                            endDate,
                            targetId,
                            timeRequested,
                            timeCompleted,
                            timeOfExpiry,
                            auditEventCount,
                            errorInfo,
                            lifecycleState,
                            lifecycleDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditArchiveRetrievalSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .startDate(o.getStartDate())
                            .endDate(o.getEndDate())
                            .targetId(o.getTargetId())
                            .timeRequested(o.getTimeRequested())
                            .timeCompleted(o.getTimeCompleted())
                            .timeOfExpiry(o.getTimeOfExpiry())
                            .auditEventCount(o.getAuditEventCount())
                            .errorInfo(o.getErrorInfo())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
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
     * The OCID of the archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment that contains archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The display name of the archive retrieval. The name does not have to be unique, and is changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Start month of the archive retrieval, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    java.util.Date startDate;

    /**
     * End month of the archive retrieval, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    java.util.Date endDate;

    /**
     * The OCID of the target associated with the archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The date time when archive retrieval was requested, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRequested")
    java.util.Date timeRequested;

    /**
     * The date time when archive retrieval request was fulfilled, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    java.util.Date timeCompleted;

    /**
     * The date time when retrieved archive data will be deleted from Data Safe and unloaded back into archival.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
    java.util.Date timeOfExpiry;

    /**
     * Total retrieved archive records audit event count.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventCount")
    Long auditEventCount;

    /**
     * Error details of failed archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
    String errorInfo;

    /**
     * The current state of the archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    AuditArchiveRetrievalLifecycleState lifecycleState;

    /**
     * Details about the current state of the archive retrieval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
