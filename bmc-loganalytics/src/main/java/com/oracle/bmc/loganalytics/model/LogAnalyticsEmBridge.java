/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Configuration details for enterprise manager bridge.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsEmBridge.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsEmBridge {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "compartmentId",
        "emEntitiesCompartmentId",
        "bucketName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "lastImportProcessingStatus",
        "lastImportProcessingDetails",
        "timeImportLastProcessed",
        "timeEmDataLastExtracted",
        "freeformTags",
        "definedTags"
    })
    public LogAnalyticsEmBridge(
            String id,
            String displayName,
            String description,
            String compartmentId,
            String emEntitiesCompartmentId,
            String bucketName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            EmBridgeLifecycleStates lifecycleState,
            String lifecycleDetails,
            EmBridgeLatestImportProcessingStatus lastImportProcessingStatus,
            String lastImportProcessingDetails,
            java.util.Date timeImportLastProcessed,
            java.util.Date timeEmDataLastExtracted,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.compartmentId = compartmentId;
        this.emEntitiesCompartmentId = emEntitiesCompartmentId;
        this.bucketName = bucketName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.lastImportProcessingStatus = lastImportProcessingStatus;
        this.lastImportProcessingDetails = lastImportProcessingDetails;
        this.timeImportLastProcessed = timeImportLastProcessed;
        this.timeEmDataLastExtracted = timeEmDataLastExtracted;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The enterprise manager bridge OCID.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The enterprise manager bridge OCID.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Log analytics enterprise manager bridge display name.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Log analytics enterprise manager bridge display name.
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
         * A description for log analytics enterprise manager bridge.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description for log analytics enterprise manager bridge.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Compartment for entities created from enterprise manager.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emEntitiesCompartmentId")
        private String emEntitiesCompartmentId;

        /**
         * Compartment for entities created from enterprise manager.
         *
         * @param emEntitiesCompartmentId the value to set
         * @return this builder
         **/
        public Builder emEntitiesCompartmentId(String emEntitiesCompartmentId) {
            this.emEntitiesCompartmentId = emEntitiesCompartmentId;
            this.__explicitlySet__.add("emEntitiesCompartmentId");
            return this;
        }
        /**
         * Object store bucket name where enterprise manager harvested entities will be uploaded.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Object store bucket name where enterprise manager harvested entities will be uploaded.
         * @param bucketName the value to set
         * @return this builder
         **/
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /**
         * The date and time the resource was created, in the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, in the format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the resource was last updated, in the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was last updated, in the format defined by RFC3339.
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the enterprise manager bridge.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private EmBridgeLifecycleStates lifecycleState;

        /**
         * The current state of the enterprise manager bridge.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(EmBridgeLifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * lifecycleDetails has additional information regarding substeps such as verifying connection to object store.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * lifecycleDetails has additional information regarding substeps such as verifying connection to object store.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The status from last processing status of enterprise manager upload.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingStatus")
        private EmBridgeLatestImportProcessingStatus lastImportProcessingStatus;

        /**
         * The status from last processing status of enterprise manager upload.
         *
         * @param lastImportProcessingStatus the value to set
         * @return this builder
         **/
        public Builder lastImportProcessingStatus(
                EmBridgeLatestImportProcessingStatus lastImportProcessingStatus) {
            this.lastImportProcessingStatus = lastImportProcessingStatus;
            this.__explicitlySet__.add("lastImportProcessingStatus");
            return this;
        }
        /**
         * Processing status details of enterprise manager upload. This provides additional details
         * for failed status
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingDetails")
        private String lastImportProcessingDetails;

        /**
         * Processing status details of enterprise manager upload. This provides additional details
         * for failed status
         *
         * @param lastImportProcessingDetails the value to set
         * @return this builder
         **/
        public Builder lastImportProcessingDetails(String lastImportProcessingDetails) {
            this.lastImportProcessingDetails = lastImportProcessingDetails;
            this.__explicitlySet__.add("lastImportProcessingDetails");
            return this;
        }
        /**
         * The last time of enterprise manager upload was processed. This is in the format defined by RFC3339
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeImportLastProcessed")
        private java.util.Date timeImportLastProcessed;

        /**
         * The last time of enterprise manager upload was processed. This is in the format defined by RFC3339
         *
         * @param timeImportLastProcessed the value to set
         * @return this builder
         **/
        public Builder timeImportLastProcessed(java.util.Date timeImportLastProcessed) {
            this.timeImportLastProcessed = timeImportLastProcessed;
            this.__explicitlySet__.add("timeImportLastProcessed");
            return this;
        }
        /**
         * The timestamp of last enterprise manager upload to OCI Object Store. This is in the format defined by RFC3339
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEmDataLastExtracted")
        private java.util.Date timeEmDataLastExtracted;

        /**
         * The timestamp of last enterprise manager upload to OCI Object Store. This is in the format defined by RFC3339
         *
         * @param timeEmDataLastExtracted the value to set
         * @return this builder
         **/
        public Builder timeEmDataLastExtracted(java.util.Date timeEmDataLastExtracted) {
            this.timeEmDataLastExtracted = timeEmDataLastExtracted;
            this.__explicitlySet__.add("timeEmDataLastExtracted");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsEmBridge build() {
            LogAnalyticsEmBridge __instance__ =
                    new LogAnalyticsEmBridge(
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
        public Builder copy(LogAnalyticsEmBridge o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The enterprise manager bridge OCID.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The enterprise manager bridge OCID.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Log analytics enterprise manager bridge display name.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Log analytics enterprise manager bridge display name.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A description for log analytics enterprise manager bridge.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description for log analytics enterprise manager bridge.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier [OCID] (https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Compartment for entities created from enterprise manager.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emEntitiesCompartmentId")
    private final String emEntitiesCompartmentId;

    /**
     * Compartment for entities created from enterprise manager.
     *
     * @return the value
     **/
    public String getEmEntitiesCompartmentId() {
        return emEntitiesCompartmentId;
    }

    /**
     * Object store bucket name where enterprise manager harvested entities will be uploaded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Object store bucket name where enterprise manager harvested entities will be uploaded.
     * @return the value
     **/
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The date and time the resource was created, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, in the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the resource was last updated, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated, in the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the enterprise manager bridge.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final EmBridgeLifecycleStates lifecycleState;

    /**
     * The current state of the enterprise manager bridge.
     *
     * @return the value
     **/
    public EmBridgeLifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /**
     * lifecycleDetails has additional information regarding substeps such as verifying connection to object store.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * lifecycleDetails has additional information regarding substeps such as verifying connection to object store.
     *
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The status from last processing status of enterprise manager upload.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingStatus")
    private final EmBridgeLatestImportProcessingStatus lastImportProcessingStatus;

    /**
     * The status from last processing status of enterprise manager upload.
     *
     * @return the value
     **/
    public EmBridgeLatestImportProcessingStatus getLastImportProcessingStatus() {
        return lastImportProcessingStatus;
    }

    /**
     * Processing status details of enterprise manager upload. This provides additional details
     * for failed status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastImportProcessingDetails")
    private final String lastImportProcessingDetails;

    /**
     * Processing status details of enterprise manager upload. This provides additional details
     * for failed status
     *
     * @return the value
     **/
    public String getLastImportProcessingDetails() {
        return lastImportProcessingDetails;
    }

    /**
     * The last time of enterprise manager upload was processed. This is in the format defined by RFC3339
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeImportLastProcessed")
    private final java.util.Date timeImportLastProcessed;

    /**
     * The last time of enterprise manager upload was processed. This is in the format defined by RFC3339
     *
     * @return the value
     **/
    public java.util.Date getTimeImportLastProcessed() {
        return timeImportLastProcessed;
    }

    /**
     * The timestamp of last enterprise manager upload to OCI Object Store. This is in the format defined by RFC3339
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEmDataLastExtracted")
    private final java.util.Date timeEmDataLastExtracted;

    /**
     * The timestamp of last enterprise manager upload to OCI Object Store. This is in the format defined by RFC3339
     *
     * @return the value
     **/
    public java.util.Date getTimeEmDataLastExtracted() {
        return timeEmDataLastExtracted;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsEmBridge(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", emEntitiesCompartmentId=")
                .append(String.valueOf(this.emEntitiesCompartmentId));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", lastImportProcessingStatus=")
                .append(String.valueOf(this.lastImportProcessingStatus));
        sb.append(", lastImportProcessingDetails=")
                .append(String.valueOf(this.lastImportProcessingDetails));
        sb.append(", timeImportLastProcessed=")
                .append(String.valueOf(this.timeImportLastProcessed));
        sb.append(", timeEmDataLastExtracted=")
                .append(String.valueOf(this.timeEmDataLastExtracted));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsEmBridge)) {
            return false;
        }

        LogAnalyticsEmBridge other = (LogAnalyticsEmBridge) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.emEntitiesCompartmentId, other.emEntitiesCompartmentId)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(
                        this.lastImportProcessingStatus, other.lastImportProcessingStatus)
                && java.util.Objects.equals(
                        this.lastImportProcessingDetails, other.lastImportProcessingDetails)
                && java.util.Objects.equals(
                        this.timeImportLastProcessed, other.timeImportLastProcessed)
                && java.util.Objects.equals(
                        this.timeEmDataLastExtracted, other.timeEmDataLastExtracted)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.emEntitiesCompartmentId == null
                                ? 43
                                : this.emEntitiesCompartmentId.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.lastImportProcessingStatus == null
                                ? 43
                                : this.lastImportProcessingStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lastImportProcessingDetails == null
                                ? 43
                                : this.lastImportProcessingDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.timeImportLastProcessed == null
                                ? 43
                                : this.timeImportLastProcessed.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEmDataLastExtracted == null
                                ? 43
                                : this.timeEmDataLastExtracted.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
