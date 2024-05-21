/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * An audit trail represents the source of audit records that provides documentary evidence of
 * the sequence of activities in the target database. Configuring audit trails in Data Safe, and enabling
 * audit data collection on the audit trails copies the audit records from the target database's audit trail
 * into the Data Safe repository.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AuditTrail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditTrail extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "auditProfileId",
        "targetId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "status",
        "lifecycleDetails",
        "trailLocation",
        "description",
        "isAutoPurgeEnabled",
        "auditCollectionStartTime",
        "workRequestId",
        "compartmentId",
        "timeLastCollected",
        "peerTargetDatabaseKey",
        "trailSource",
        "purgeJobTime",
        "purgeJobStatus",
        "purgeJobDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AuditTrail(
            String id,
            String auditProfileId,
            String targetId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            AuditTrailLifecycleState lifecycleState,
            AuditTrailStatus status,
            String lifecycleDetails,
            String trailLocation,
            String description,
            Boolean isAutoPurgeEnabled,
            java.util.Date auditCollectionStartTime,
            String workRequestId,
            String compartmentId,
            java.util.Date timeLastCollected,
            Integer peerTargetDatabaseKey,
            AuditTrailSource trailSource,
            java.util.Date purgeJobTime,
            PurgeJobStatus purgeJobStatus,
            String purgeJobDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.auditProfileId = auditProfileId;
        this.targetId = targetId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.status = status;
        this.lifecycleDetails = lifecycleDetails;
        this.trailLocation = trailLocation;
        this.description = description;
        this.isAutoPurgeEnabled = isAutoPurgeEnabled;
        this.auditCollectionStartTime = auditCollectionStartTime;
        this.workRequestId = workRequestId;
        this.compartmentId = compartmentId;
        this.timeLastCollected = timeLastCollected;
        this.peerTargetDatabaseKey = peerTargetDatabaseKey;
        this.trailSource = trailSource;
        this.purgeJobTime = purgeJobTime;
        this.purgeJobStatus = purgeJobStatus;
        this.purgeJobDetails = purgeJobDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the audit trail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the audit trail.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the  parent audit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
        private String auditProfileId;

        /**
         * The OCID of the  parent audit.
         * @param auditProfileId the value to set
         * @return this builder
         **/
        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            this.__explicitlySet__.add("auditProfileId");
            return this;
        }
        /**
         * The OCID of the Data Safe target for which the audit trail is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The OCID of the Data Safe target for which the audit trail is created.
         * @param targetId the value to set
         * @return this builder
         **/
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The display name of the audit trail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the audit trail.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the audit trail was created, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the audit trail was created, in the format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the audit trail was updated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the audit trail was updated, in the format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current state of the audit trail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AuditTrailLifecycleState lifecycleState;

        /**
         * The current state of the audit trail.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(AuditTrailLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The current sub-state of the audit trail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private AuditTrailStatus status;

        /**
         * The current sub-state of the audit trail.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(AuditTrailStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Details about the current state of the audit trail in Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the audit trail in Data Safe.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * An audit trail location represents the source of audit records that provides documentary
         * evidence of the sequence of activities in the target database.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
        private String trailLocation;

        /**
         * An audit trail location represents the source of audit records that provides documentary
         * evidence of the sequence of activities in the target database.
         *
         * @param trailLocation the value to set
         * @return this builder
         **/
        public Builder trailLocation(String trailLocation) {
            this.trailLocation = trailLocation;
            this.__explicitlySet__.add("trailLocation");
            return this;
        }
        /**
         * The description of the audit trail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the audit trail.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
         * target database every seven days so that the database's audit trail does not become too large.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurgeEnabled")
        private Boolean isAutoPurgeEnabled;

        /**
         * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
         * target database every seven days so that the database's audit trail does not become too large.
         *
         * @param isAutoPurgeEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoPurgeEnabled(Boolean isAutoPurgeEnabled) {
            this.isAutoPurgeEnabled = isAutoPurgeEnabled;
            this.__explicitlySet__.add("isAutoPurgeEnabled");
            return this;
        }
        /**
         * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
        private java.util.Date auditCollectionStartTime;

        /**
         * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
         * @param auditCollectionStartTime the value to set
         * @return this builder
         **/
        public Builder auditCollectionStartTime(java.util.Date auditCollectionStartTime) {
            this.auditCollectionStartTime = auditCollectionStartTime;
            this.__explicitlySet__.add("auditCollectionStartTime");
            return this;
        }
        /**
         * The OCID of the workrequest for audit trail which collects audit records.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The OCID of the workrequest for audit trail which collects audit records.
         * @param workRequestId the value to set
         * @return this builder
         **/
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * The OCID of the compartment that contains the audit trail and is the same as the compartment of the audit profile resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains the audit trail and is the same as the compartment of the audit profile resource.
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
         * The date and time until when the audit events were collected from the target database by the Data Safe audit trail
         * collection process, in the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastCollected")
        private java.util.Date timeLastCollected;

        /**
         * The date and time until when the audit events were collected from the target database by the Data Safe audit trail
         * collection process, in the format defined by RFC3339.
         *
         * @param timeLastCollected the value to set
         * @return this builder
         **/
        public Builder timeLastCollected(java.util.Date timeLastCollected) {
            this.timeLastCollected = timeLastCollected;
            this.__explicitlySet__.add("timeLastCollected");
            return this;
        }
        /**
         * The secondary id assigned for the peer database registered with Data Safe.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("peerTargetDatabaseKey")
        private Integer peerTargetDatabaseKey;

        /**
         * The secondary id assigned for the peer database registered with Data Safe.
         * @param peerTargetDatabaseKey the value to set
         * @return this builder
         **/
        public Builder peerTargetDatabaseKey(Integer peerTargetDatabaseKey) {
            this.peerTargetDatabaseKey = peerTargetDatabaseKey;
            this.__explicitlySet__.add("peerTargetDatabaseKey");
            return this;
        }
        /**
         * The underlying source of unified audit trail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trailSource")
        private AuditTrailSource trailSource;

        /**
         * The underlying source of unified audit trail.
         * @param trailSource the value to set
         * @return this builder
         **/
        public Builder trailSource(AuditTrailSource trailSource) {
            this.trailSource = trailSource;
            this.__explicitlySet__.add("trailSource");
            return this;
        }
        /**
         * The date and time of the last purge job. The purge job deletes audit data in the
         * target database every seven days so that the database's audit trail does not become too large.
         * In the format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeJobTime")
        private java.util.Date purgeJobTime;

        /**
         * The date and time of the last purge job. The purge job deletes audit data in the
         * target database every seven days so that the database's audit trail does not become too large.
         * In the format defined by RFC3339.
         *
         * @param purgeJobTime the value to set
         * @return this builder
         **/
        public Builder purgeJobTime(java.util.Date purgeJobTime) {
            this.purgeJobTime = purgeJobTime;
            this.__explicitlySet__.add("purgeJobTime");
            return this;
        }
        /**
         * The current status of the audit trail purge job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeJobStatus")
        private PurgeJobStatus purgeJobStatus;

        /**
         * The current status of the audit trail purge job.
         * @param purgeJobStatus the value to set
         * @return this builder
         **/
        public Builder purgeJobStatus(PurgeJobStatus purgeJobStatus) {
            this.purgeJobStatus = purgeJobStatus;
            this.__explicitlySet__.add("purgeJobStatus");
            return this;
        }
        /**
         * The details of the audit trail purge job that ran at the time specified by purgeJobTime".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purgeJobDetails")
        private String purgeJobDetails;

        /**
         * The details of the audit trail purge job that ran at the time specified by purgeJobTime".
         * @param purgeJobDetails the value to set
         * @return this builder
         **/
        public Builder purgeJobDetails(String purgeJobDetails) {
            this.purgeJobDetails = purgeJobDetails;
            this.__explicitlySet__.add("purgeJobDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditTrail build() {
            AuditTrail model =
                    new AuditTrail(
                            this.id,
                            this.auditProfileId,
                            this.targetId,
                            this.displayName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.status,
                            this.lifecycleDetails,
                            this.trailLocation,
                            this.description,
                            this.isAutoPurgeEnabled,
                            this.auditCollectionStartTime,
                            this.workRequestId,
                            this.compartmentId,
                            this.timeLastCollected,
                            this.peerTargetDatabaseKey,
                            this.trailSource,
                            this.purgeJobTime,
                            this.purgeJobStatus,
                            this.purgeJobDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditTrail model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("auditProfileId")) {
                this.auditProfileId(model.getAuditProfileId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("trailLocation")) {
                this.trailLocation(model.getTrailLocation());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isAutoPurgeEnabled")) {
                this.isAutoPurgeEnabled(model.getIsAutoPurgeEnabled());
            }
            if (model.wasPropertyExplicitlySet("auditCollectionStartTime")) {
                this.auditCollectionStartTime(model.getAuditCollectionStartTime());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastCollected")) {
                this.timeLastCollected(model.getTimeLastCollected());
            }
            if (model.wasPropertyExplicitlySet("peerTargetDatabaseKey")) {
                this.peerTargetDatabaseKey(model.getPeerTargetDatabaseKey());
            }
            if (model.wasPropertyExplicitlySet("trailSource")) {
                this.trailSource(model.getTrailSource());
            }
            if (model.wasPropertyExplicitlySet("purgeJobTime")) {
                this.purgeJobTime(model.getPurgeJobTime());
            }
            if (model.wasPropertyExplicitlySet("purgeJobStatus")) {
                this.purgeJobStatus(model.getPurgeJobStatus());
            }
            if (model.wasPropertyExplicitlySet("purgeJobDetails")) {
                this.purgeJobDetails(model.getPurgeJobDetails());
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
     * The OCID of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the audit trail.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the  parent audit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
    private final String auditProfileId;

    /**
     * The OCID of the  parent audit.
     * @return the value
     **/
    public String getAuditProfileId() {
        return auditProfileId;
    }

    /**
     * The OCID of the Data Safe target for which the audit trail is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The OCID of the Data Safe target for which the audit trail is created.
     * @return the value
     **/
    public String getTargetId() {
        return targetId;
    }

    /**
     * The display name of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the audit trail.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the audit trail was created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the audit trail was created, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the audit trail was updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the audit trail was updated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current state of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AuditTrailLifecycleState lifecycleState;

    /**
     * The current state of the audit trail.
     * @return the value
     **/
    public AuditTrailLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The current sub-state of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final AuditTrailStatus status;

    /**
     * The current sub-state of the audit trail.
     * @return the value
     **/
    public AuditTrailStatus getStatus() {
        return status;
    }

    /**
     * Details about the current state of the audit trail in Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the audit trail in Data Safe.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * An audit trail location represents the source of audit records that provides documentary
     * evidence of the sequence of activities in the target database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
    private final String trailLocation;

    /**
     * An audit trail location represents the source of audit records that provides documentary
     * evidence of the sequence of activities in the target database.
     *
     * @return the value
     **/
    public String getTrailLocation() {
        return trailLocation;
    }

    /**
     * The description of the audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the audit trail.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoPurgeEnabled")
    private final Boolean isAutoPurgeEnabled;

    /**
     * Indicates if auto purge is enabled on the target database, which helps delete audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     *
     * @return the value
     **/
    public Boolean getIsAutoPurgeEnabled() {
        return isAutoPurgeEnabled;
    }

    /**
     * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
    private final java.util.Date auditCollectionStartTime;

    /**
     * The date from which the audit trail must start collecting data, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getAuditCollectionStartTime() {
        return auditCollectionStartTime;
    }

    /**
     * The OCID of the workrequest for audit trail which collects audit records.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The OCID of the workrequest for audit trail which collects audit records.
     * @return the value
     **/
    public String getWorkRequestId() {
        return workRequestId;
    }

    /**
     * The OCID of the compartment that contains the audit trail and is the same as the compartment of the audit profile resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains the audit trail and is the same as the compartment of the audit profile resource.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time until when the audit events were collected from the target database by the Data Safe audit trail
     * collection process, in the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastCollected")
    private final java.util.Date timeLastCollected;

    /**
     * The date and time until when the audit events were collected from the target database by the Data Safe audit trail
     * collection process, in the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeLastCollected() {
        return timeLastCollected;
    }

    /**
     * The secondary id assigned for the peer database registered with Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerTargetDatabaseKey")
    private final Integer peerTargetDatabaseKey;

    /**
     * The secondary id assigned for the peer database registered with Data Safe.
     * @return the value
     **/
    public Integer getPeerTargetDatabaseKey() {
        return peerTargetDatabaseKey;
    }

    /**
     * The underlying source of unified audit trail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trailSource")
    private final AuditTrailSource trailSource;

    /**
     * The underlying source of unified audit trail.
     * @return the value
     **/
    public AuditTrailSource getTrailSource() {
        return trailSource;
    }

    /**
     * The date and time of the last purge job. The purge job deletes audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     * In the format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeJobTime")
    private final java.util.Date purgeJobTime;

    /**
     * The date and time of the last purge job. The purge job deletes audit data in the
     * target database every seven days so that the database's audit trail does not become too large.
     * In the format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getPurgeJobTime() {
        return purgeJobTime;
    }

    /**
     * The current status of the audit trail purge job.
     **/
    public enum PurgeJobStatus {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PurgeJobStatus.class);

        private final String value;
        private static java.util.Map<String, PurgeJobStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PurgeJobStatus v : PurgeJobStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PurgeJobStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PurgeJobStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PurgeJobStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current status of the audit trail purge job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeJobStatus")
    private final PurgeJobStatus purgeJobStatus;

    /**
     * The current status of the audit trail purge job.
     * @return the value
     **/
    public PurgeJobStatus getPurgeJobStatus() {
        return purgeJobStatus;
    }

    /**
     * The details of the audit trail purge job that ran at the time specified by purgeJobTime".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purgeJobDetails")
    private final String purgeJobDetails;

    /**
     * The details of the audit trail purge job that ran at the time specified by purgeJobTime".
     * @return the value
     **/
    public String getPurgeJobDetails() {
        return purgeJobDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("AuditTrail(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", trailLocation=").append(String.valueOf(this.trailLocation));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isAutoPurgeEnabled=").append(String.valueOf(this.isAutoPurgeEnabled));
        sb.append(", auditCollectionStartTime=")
                .append(String.valueOf(this.auditCollectionStartTime));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeLastCollected=").append(String.valueOf(this.timeLastCollected));
        sb.append(", peerTargetDatabaseKey=").append(String.valueOf(this.peerTargetDatabaseKey));
        sb.append(", trailSource=").append(String.valueOf(this.trailSource));
        sb.append(", purgeJobTime=").append(String.valueOf(this.purgeJobTime));
        sb.append(", purgeJobStatus=").append(String.valueOf(this.purgeJobStatus));
        sb.append(", purgeJobDetails=").append(String.valueOf(this.purgeJobDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditTrail)) {
            return false;
        }

        AuditTrail other = (AuditTrail) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.trailLocation, other.trailLocation)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isAutoPurgeEnabled, other.isAutoPurgeEnabled)
                && java.util.Objects.equals(
                        this.auditCollectionStartTime, other.auditCollectionStartTime)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeLastCollected, other.timeLastCollected)
                && java.util.Objects.equals(this.peerTargetDatabaseKey, other.peerTargetDatabaseKey)
                && java.util.Objects.equals(this.trailSource, other.trailSource)
                && java.util.Objects.equals(this.purgeJobTime, other.purgeJobTime)
                && java.util.Objects.equals(this.purgeJobStatus, other.purgeJobStatus)
                && java.util.Objects.equals(this.purgeJobDetails, other.purgeJobDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.trailLocation == null ? 43 : this.trailLocation.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoPurgeEnabled == null
                                ? 43
                                : this.isAutoPurgeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.auditCollectionStartTime == null
                                ? 43
                                : this.auditCollectionStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastCollected == null ? 43 : this.timeLastCollected.hashCode());
        result =
                (result * PRIME)
                        + (this.peerTargetDatabaseKey == null
                                ? 43
                                : this.peerTargetDatabaseKey.hashCode());
        result = (result * PRIME) + (this.trailSource == null ? 43 : this.trailSource.hashCode());
        result = (result * PRIME) + (this.purgeJobTime == null ? 43 : this.purgeJobTime.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeJobStatus == null ? 43 : this.purgeJobStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.purgeJobDetails == null ? 43 : this.purgeJobDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
