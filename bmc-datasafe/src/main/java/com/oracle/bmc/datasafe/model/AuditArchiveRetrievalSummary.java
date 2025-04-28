/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary details of an archive retrieval. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuditArchiveRetrievalSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuditArchiveRetrievalSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "startDate",
        "endDate",
        "targetId",
        "timeRequested",
        "timeCompleted",
        "timeOfExpiry",
        "auditEventCount",
        "errorInfo",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags"
    })
    public AuditArchiveRetrievalSummary(
            String id,
            String compartmentId,
            String displayName,
            String description,
            java.util.Date startDate,
            java.util.Date endDate,
            String targetId,
            java.util.Date timeRequested,
            java.util.Date timeCompleted,
            java.util.Date timeOfExpiry,
            Long auditEventCount,
            String errorInfo,
            AuditArchiveRetrievalLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.targetId = targetId;
        this.timeRequested = timeRequested;
        this.timeCompleted = timeCompleted;
        this.timeOfExpiry = timeOfExpiry;
        this.auditEventCount = auditEventCount;
        this.errorInfo = errorInfo;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the archive retrieval.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the compartment that contains archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains archive retrieval.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The display name of the archive retrieval. The name does not have to be unique, and is
         * changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the archive retrieval. The name does not have to be unique, and is
         * changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the archive retrieval.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Start month of the archive retrieval, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        /**
         * Start month of the archive retrieval, in the format defined by RFC3339.
         *
         * @param startDate the value to set
         * @return this builder
         */
        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /** End month of the archive retrieval, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        /**
         * End month of the archive retrieval, in the format defined by RFC3339.
         *
         * @param endDate the value to set
         * @return this builder
         */
        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }
        /** The OCID of the target associated with the archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the target associated with the archive retrieval.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The date time when archive retrieval was requested, in the format defined by RFC3339. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRequested")
        private java.util.Date timeRequested;

        /**
         * The date time when archive retrieval was requested, in the format defined by RFC3339.
         *
         * @param timeRequested the value to set
         * @return this builder
         */
        public Builder timeRequested(java.util.Date timeRequested) {
            this.timeRequested = timeRequested;
            this.__explicitlySet__.add("timeRequested");
            return this;
        }
        /**
         * The date time when archive retrieval request was fulfilled, in the format defined by
         * RFC3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date time when archive retrieval request was fulfilled, in the format defined by
         * RFC3339.
         *
         * @param timeCompleted the value to set
         * @return this builder
         */
        public Builder timeCompleted(java.util.Date timeCompleted) {
            this.timeCompleted = timeCompleted;
            this.__explicitlySet__.add("timeCompleted");
            return this;
        }
        /**
         * The date time when retrieved archive data will be deleted from Data Safe and unloaded
         * back into archival.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
        private java.util.Date timeOfExpiry;

        /**
         * The date time when retrieved archive data will be deleted from Data Safe and unloaded
         * back into archival.
         *
         * @param timeOfExpiry the value to set
         * @return this builder
         */
        public Builder timeOfExpiry(java.util.Date timeOfExpiry) {
            this.timeOfExpiry = timeOfExpiry;
            this.__explicitlySet__.add("timeOfExpiry");
            return this;
        }
        /** Total retrieved archive records audit event count. */
        @com.fasterxml.jackson.annotation.JsonProperty("auditEventCount")
        private Long auditEventCount;

        /**
         * Total retrieved archive records audit event count.
         *
         * @param auditEventCount the value to set
         * @return this builder
         */
        public Builder auditEventCount(Long auditEventCount) {
            this.auditEventCount = auditEventCount;
            this.__explicitlySet__.add("auditEventCount");
            return this;
        }
        /** Error details of failed archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
        private String errorInfo;

        /**
         * Error details of failed archive retrieval.
         *
         * @param errorInfo the value to set
         * @return this builder
         */
        public Builder errorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            this.__explicitlySet__.add("errorInfo");
            return this;
        }
        /** The current state of the archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditArchiveRetrievalLifecycleState lifecycleState;

        /**
         * The current state of the archive retrieval.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AuditArchiveRetrievalLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Details about the current state of the archive retrieval. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the archive retrieval.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditArchiveRetrievalSummary build() {
            AuditArchiveRetrievalSummary model =
                    new AuditArchiveRetrievalSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.startDate,
                            this.endDate,
                            this.targetId,
                            this.timeRequested,
                            this.timeCompleted,
                            this.timeOfExpiry,
                            this.auditEventCount,
                            this.errorInfo,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditArchiveRetrievalSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("timeRequested")) {
                this.timeRequested(model.getTimeRequested());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
            }
            if (model.wasPropertyExplicitlySet("timeOfExpiry")) {
                this.timeOfExpiry(model.getTimeOfExpiry());
            }
            if (model.wasPropertyExplicitlySet("auditEventCount")) {
                this.auditEventCount(model.getAuditEventCount());
            }
            if (model.wasPropertyExplicitlySet("errorInfo")) {
                this.errorInfo(model.getErrorInfo());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /** The OCID of the archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the archive retrieval.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the compartment that contains archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains archive retrieval.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the archive retrieval. The name does not have to be unique, and is
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the archive retrieval. The name does not have to be unique, and is
     * changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the archive retrieval.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Start month of the archive retrieval, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final java.util.Date startDate;

    /**
     * Start month of the archive retrieval, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /** End month of the archive retrieval, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    /**
     * End month of the archive retrieval, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getEndDate() {
        return endDate;
    }

    /** The OCID of the target associated with the archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the target associated with the archive retrieval.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The date time when archive retrieval was requested, in the format defined by RFC3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRequested")
    private final java.util.Date timeRequested;

    /**
     * The date time when archive retrieval was requested, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeRequested() {
        return timeRequested;
    }

    /**
     * The date time when archive retrieval request was fulfilled, in the format defined by RFC3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date time when archive retrieval request was fulfilled, in the format defined by RFC3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    /**
     * The date time when retrieved archive data will be deleted from Data Safe and unloaded back
     * into archival.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
    private final java.util.Date timeOfExpiry;

    /**
     * The date time when retrieved archive data will be deleted from Data Safe and unloaded back
     * into archival.
     *
     * @return the value
     */
    public java.util.Date getTimeOfExpiry() {
        return timeOfExpiry;
    }

    /** Total retrieved archive records audit event count. */
    @com.fasterxml.jackson.annotation.JsonProperty("auditEventCount")
    private final Long auditEventCount;

    /**
     * Total retrieved archive records audit event count.
     *
     * @return the value
     */
    public Long getAuditEventCount() {
        return auditEventCount;
    }

    /** Error details of failed archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorInfo")
    private final String errorInfo;

    /**
     * Error details of failed archive retrieval.
     *
     * @return the value
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    /** The current state of the archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditArchiveRetrievalLifecycleState lifecycleState;

    /**
     * The current state of the archive retrieval.
     *
     * @return the value
     */
    public AuditArchiveRetrievalLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Details about the current state of the archive retrieval. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the archive retrieval.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
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
        sb.append("AuditArchiveRetrievalSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", timeRequested=").append(String.valueOf(this.timeRequested));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", timeOfExpiry=").append(String.valueOf(this.timeOfExpiry));
        sb.append(", auditEventCount=").append(String.valueOf(this.auditEventCount));
        sb.append(", errorInfo=").append(String.valueOf(this.errorInfo));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
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
        if (!(o instanceof AuditArchiveRetrievalSummary)) {
            return false;
        }

        AuditArchiveRetrievalSummary other = (AuditArchiveRetrievalSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.timeRequested, other.timeRequested)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(this.timeOfExpiry, other.timeOfExpiry)
                && java.util.Objects.equals(this.auditEventCount, other.auditEventCount)
                && java.util.Objects.equals(this.errorInfo, other.errorInfo)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRequested == null ? 43 : this.timeRequested.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + (this.timeOfExpiry == null ? 43 : this.timeOfExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.auditEventCount == null ? 43 : this.auditEventCount.hashCode());
        result = (result * PRIME) + (this.errorInfo == null ? 43 : this.errorInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
