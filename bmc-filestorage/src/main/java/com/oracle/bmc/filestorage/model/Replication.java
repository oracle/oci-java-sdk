/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.filestorage.model;

/**
 * Replications are the primary resource that governs the policy of cross-region replication between
 * source and target file systems. Replications are associated with a secondary resource called a
 * {@link ReplicationTarget} located in another availability domain in the same or different region.
 * The replication retrieves the delta of data between two snapshots of a source file system and
 * sends it to the associated {@code ReplicationTarget}, which applies it to the target file system.
 * For more information, see [File System
 * Replication](https://docs.cloud.oracle.com/iaas/Content/File/Tasks/FSreplication.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20171215")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Replication.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Replication extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "availabilityDomain",
        "id",
        "lifecycleState",
        "displayName",
        "timeCreated",
        "sourceId",
        "targetId",
        "replicationTargetId",
        "replicationInterval",
        "lastSnapshotId",
        "recoveryPointTime",
        "deltaStatus",
        "lifecycleDetails",
        "deltaProgress",
        "locks",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public Replication(
            String compartmentId,
            String availabilityDomain,
            String id,
            LifecycleState lifecycleState,
            String displayName,
            java.util.Date timeCreated,
            String sourceId,
            String targetId,
            String replicationTargetId,
            Long replicationInterval,
            String lastSnapshotId,
            java.util.Date recoveryPointTime,
            DeltaStatus deltaStatus,
            String lifecycleDetails,
            Long deltaProgress,
            java.util.List<ResourceLock> locks,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.compartmentId = compartmentId;
        this.availabilityDomain = availabilityDomain;
        this.id = id;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.replicationTargetId = replicationTargetId;
        this.replicationInterval = replicationInterval;
        this.lastSnapshotId = lastSnapshotId;
        this.recoveryPointTime = recoveryPointTime;
        this.deltaStatus = deltaStatus;
        this.lifecycleDetails = lifecycleDetails;
        this.deltaProgress = deltaProgress;
        this.locks = locks;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the replication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the replication.
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
         * The availability domain that contains the replication. May be unset as a blank or {@code
         * NULL} value. Example: {@code Uocm:PHX-AD-2}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The availability domain that contains the replication. May be unset as a blank or {@code
         * NULL} value. Example: {@code Uocm:PHX-AD-2}
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * replication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * replication.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current lifecycle state of the replication. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the replication.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My replication}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My replication}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the replication was created in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2021-01-04T20:01:29.100Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the replication was created in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2021-01-04T20:01:29.100Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * source file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * source file system.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * target file system.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * target file system.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link ReplicationTarget}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationTargetId")
        private String replicationTargetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link ReplicationTarget}.
         *
         * @param replicationTargetId the value to set
         * @return this builder
         */
        public Builder replicationTargetId(String replicationTargetId) {
            this.replicationTargetId = replicationTargetId;
            this.__explicitlySet__.add("replicationTargetId");
            return this;
        }
        /** Duration in minutes between replication snapshots. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationInterval")
        private Long replicationInterval;

        /**
         * Duration in minutes between replication snapshots.
         *
         * @param replicationInterval the value to set
         * @return this builder
         */
        public Builder replicationInterval(Long replicationInterval) {
            this.replicationInterval = replicationInterval;
            this.__explicitlySet__.add("replicationInterval");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last snapshot that has been replicated completely. Empty if the copy of the initial
         * snapshot is not complete.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastSnapshotId")
        private String lastSnapshotId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * last snapshot that has been replicated completely. Empty if the copy of the initial
         * snapshot is not complete.
         *
         * @param lastSnapshotId the value to set
         * @return this builder
         */
        public Builder lastSnapshotId(String lastSnapshotId) {
            this.lastSnapshotId = lastSnapshotId;
            this.__explicitlySet__.add("lastSnapshotId");
            return this;
        }
        /**
         * The {@link #snapshotTime(SnapshotTimeRequest) snapshotTime} of the most recent
         * recoverable replication snapshot in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
         * timestamp format. Example: {@code 2021-04-04T20:01:29.100Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryPointTime")
        private java.util.Date recoveryPointTime;

        /**
         * The {@link #snapshotTime(SnapshotTimeRequest) snapshotTime} of the most recent
         * recoverable replication snapshot in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
         * timestamp format. Example: {@code 2021-04-04T20:01:29.100Z}
         *
         * @param recoveryPointTime the value to set
         * @return this builder
         */
        public Builder recoveryPointTime(java.util.Date recoveryPointTime) {
            this.recoveryPointTime = recoveryPointTime;
            this.__explicitlySet__.add("recoveryPointTime");
            return this;
        }
        /** The current state of the snapshot during replication operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("deltaStatus")
        private DeltaStatus deltaStatus;

        /**
         * The current state of the snapshot during replication operations.
         *
         * @param deltaStatus the value to set
         * @return this builder
         */
        public Builder deltaStatus(DeltaStatus deltaStatus) {
            this.deltaStatus = deltaStatus;
            this.__explicitlySet__.add("deltaStatus");
            return this;
        }
        /** Additional information about the current 'lifecycleState'. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current 'lifecycleState'.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Percentage progress of the current replication cycle. */
        @com.fasterxml.jackson.annotation.JsonProperty("deltaProgress")
        private Long deltaProgress;

        /**
         * Percentage progress of the current replication cycle.
         *
         * @param deltaProgress the value to set
         * @return this builder
         */
        public Builder deltaProgress(Long deltaProgress) {
            this.deltaProgress = deltaProgress;
            this.__explicitlySet__.add("deltaProgress");
            return this;
        }
        /** Locks associated with this resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("locks")
        private java.util.List<ResourceLock> locks;

        /**
         * Locks associated with this resource.
         *
         * @param locks the value to set
         * @return this builder
         */
        public Builder locks(java.util.List<ResourceLock> locks) {
            this.locks = locks;
            this.__explicitlySet__.add("locks");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
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
        /**
         * System tags for this resource. System tags are applied to resources by internal OCI
         * services.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. System tags are applied to resources by internal OCI
         * services.
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Replication build() {
            Replication model =
                    new Replication(
                            this.compartmentId,
                            this.availabilityDomain,
                            this.id,
                            this.lifecycleState,
                            this.displayName,
                            this.timeCreated,
                            this.sourceId,
                            this.targetId,
                            this.replicationTargetId,
                            this.replicationInterval,
                            this.lastSnapshotId,
                            this.recoveryPointTime,
                            this.deltaStatus,
                            this.lifecycleDetails,
                            this.deltaProgress,
                            this.locks,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Replication model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("replicationTargetId")) {
                this.replicationTargetId(model.getReplicationTargetId());
            }
            if (model.wasPropertyExplicitlySet("replicationInterval")) {
                this.replicationInterval(model.getReplicationInterval());
            }
            if (model.wasPropertyExplicitlySet("lastSnapshotId")) {
                this.lastSnapshotId(model.getLastSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("recoveryPointTime")) {
                this.recoveryPointTime(model.getRecoveryPointTime());
            }
            if (model.wasPropertyExplicitlySet("deltaStatus")) {
                this.deltaStatus(model.getDeltaStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("deltaProgress")) {
                this.deltaProgress(model.getDeltaProgress());
            }
            if (model.wasPropertyExplicitlySet("locks")) {
                this.locks(model.getLocks());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the replication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the replication.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The availability domain that contains the replication. May be unset as a blank or {@code
     * NULL} value. Example: {@code Uocm:PHX-AD-2}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The availability domain that contains the replication. May be unset as a blank or {@code
     * NULL} value. Example: {@code Uocm:PHX-AD-2}
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * replication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * replication.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current lifecycle state of the replication. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycle state of the replication. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the replication.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My replication}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. It does not have to be unique, and it is changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My replication}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the replication was created in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2021-01-04T20:01:29.100Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the replication was created in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2021-01-04T20:01:29.100Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * source file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * source file system.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * target file system.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * target file system.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link ReplicationTarget}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationTargetId")
    private final String replicationTargetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link ReplicationTarget}.
     *
     * @return the value
     */
    public String getReplicationTargetId() {
        return replicationTargetId;
    }

    /** Duration in minutes between replication snapshots. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationInterval")
    private final Long replicationInterval;

    /**
     * Duration in minutes between replication snapshots.
     *
     * @return the value
     */
    public Long getReplicationInterval() {
        return replicationInterval;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last snapshot that has been replicated completely. Empty if the copy of the initial snapshot
     * is not complete.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSnapshotId")
    private final String lastSnapshotId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * last snapshot that has been replicated completely. Empty if the copy of the initial snapshot
     * is not complete.
     *
     * @return the value
     */
    public String getLastSnapshotId() {
        return lastSnapshotId;
    }

    /**
     * The {@link #snapshotTime(SnapshotTimeRequest) snapshotTime} of the most recent recoverable
     * replication snapshot in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * Example: {@code 2021-04-04T20:01:29.100Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryPointTime")
    private final java.util.Date recoveryPointTime;

    /**
     * The {@link #snapshotTime(SnapshotTimeRequest) snapshotTime} of the most recent recoverable
     * replication snapshot in [RFC 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     * Example: {@code 2021-04-04T20:01:29.100Z}
     *
     * @return the value
     */
    public java.util.Date getRecoveryPointTime() {
        return recoveryPointTime;
    }

    /** The current state of the snapshot during replication operations. */
    public enum DeltaStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Idle("IDLE"),
        Capturing("CAPTURING"),
        Applying("APPLYING"),
        ServiceError("SERVICE_ERROR"),
        UserError("USER_ERROR"),
        Failed("FAILED"),
        Transferring("TRANSFERRING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DeltaStatus.class);

        private final String value;
        private static java.util.Map<String, DeltaStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DeltaStatus v : DeltaStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DeltaStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeltaStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DeltaStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the snapshot during replication operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("deltaStatus")
    private final DeltaStatus deltaStatus;

    /**
     * The current state of the snapshot during replication operations.
     *
     * @return the value
     */
    public DeltaStatus getDeltaStatus() {
        return deltaStatus;
    }

    /** Additional information about the current 'lifecycleState'. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current 'lifecycleState'.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Percentage progress of the current replication cycle. */
    @com.fasterxml.jackson.annotation.JsonProperty("deltaProgress")
    private final Long deltaProgress;

    /**
     * Percentage progress of the current replication cycle.
     *
     * @return the value
     */
    public Long getDeltaProgress() {
        return deltaProgress;
    }

    /** Locks associated with this resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("locks")
    private final java.util.List<ResourceLock> locks;

    /**
     * Locks associated with this resource.
     *
     * @return the value
     */
    public java.util.List<ResourceLock> getLocks() {
        return locks;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. System tags are applied to resources by internal OCI services.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. System tags are applied to resources by internal OCI services.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Replication(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", replicationTargetId=").append(String.valueOf(this.replicationTargetId));
        sb.append(", replicationInterval=").append(String.valueOf(this.replicationInterval));
        sb.append(", lastSnapshotId=").append(String.valueOf(this.lastSnapshotId));
        sb.append(", recoveryPointTime=").append(String.valueOf(this.recoveryPointTime));
        sb.append(", deltaStatus=").append(String.valueOf(this.deltaStatus));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", deltaProgress=").append(String.valueOf(this.deltaProgress));
        sb.append(", locks=").append(String.valueOf(this.locks));
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
        if (!(o instanceof Replication)) {
            return false;
        }

        Replication other = (Replication) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.replicationTargetId, other.replicationTargetId)
                && java.util.Objects.equals(this.replicationInterval, other.replicationInterval)
                && java.util.Objects.equals(this.lastSnapshotId, other.lastSnapshotId)
                && java.util.Objects.equals(this.recoveryPointTime, other.recoveryPointTime)
                && java.util.Objects.equals(this.deltaStatus, other.deltaStatus)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.deltaProgress, other.deltaProgress)
                && java.util.Objects.equals(this.locks, other.locks)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationTargetId == null
                                ? 43
                                : this.replicationTargetId.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationInterval == null
                                ? 43
                                : this.replicationInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.lastSnapshotId == null ? 43 : this.lastSnapshotId.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryPointTime == null ? 43 : this.recoveryPointTime.hashCode());
        result = (result * PRIME) + (this.deltaStatus == null ? 43 : this.deltaStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.deltaProgress == null ? 43 : this.deltaProgress.hashCode());
        result = (result * PRIME) + (this.locks == null ? 43 : this.locks.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
