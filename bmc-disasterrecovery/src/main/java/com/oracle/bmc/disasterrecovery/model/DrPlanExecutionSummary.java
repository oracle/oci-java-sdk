/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The summary of a DR plan execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DrPlanExecutionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrPlanExecutionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "planId",
        "planExecutionType",
        "drProtectionGroupId",
        "peerDrProtectionGroupId",
        "peerRegion",
        "logLocation",
        "timeCreated",
        "timeStarted",
        "timeUpdated",
        "timeEnded",
        "executionDurationInSec",
        "lifecycleState",
        "lifeCycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public DrPlanExecutionSummary(
            String id,
            String compartmentId,
            String displayName,
            String planId,
            DrPlanExecutionType planExecutionType,
            String drProtectionGroupId,
            String peerDrProtectionGroupId,
            String peerRegion,
            ObjectStorageLogLocation logLocation,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeUpdated,
            java.util.Date timeEnded,
            Integer executionDurationInSec,
            DrPlanExecutionLifecycleState lifecycleState,
            String lifeCycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.planId = planId;
        this.planExecutionType = planExecutionType;
        this.drProtectionGroupId = drProtectionGroupId;
        this.peerDrProtectionGroupId = peerDrProtectionGroupId;
        this.peerRegion = peerRegion;
        this.logLocation = logLocation;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeUpdated = timeUpdated;
        this.timeEnded = timeEnded;
        this.executionDurationInSec = executionDurationInSec;
        this.lifecycleState = lifecycleState;
        this.lifeCycleDetails = lifeCycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the DR plan execution.
         *
         * <p>Example: {@code ocid1.drplanexecution.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the DR plan execution.
         *
         * <p>Example: {@code ocid1.drplanexecution.oc1..uniqueID}
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the compartment containing this plan execution.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing this plan execution.
         *
         * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
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
         * The display name of the DR plan execution.
         *
         * <p>Example: {@code Execution - EBS Switchover PHX to IAD}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the DR plan execution.
         *
         * <p>Example: {@code Execution - EBS Switchover PHX to IAD}
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
         * The OCID of the DR plan for this DR plan execution.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("planId")
        private String planId;

        /**
         * The OCID of the DR plan for this DR plan execution.
         *
         * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
         *
         * @param planId the value to set
         * @return this builder
         */
        public Builder planId(String planId) {
            this.planId = planId;
            this.__explicitlySet__.add("planId");
            return this;
        }
        /** The type of the DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("planExecutionType")
        private DrPlanExecutionType planExecutionType;

        /**
         * The type of the DR plan execution.
         *
         * @param planExecutionType the value to set
         * @return this builder
         */
        public Builder planExecutionType(DrPlanExecutionType planExecutionType) {
            this.planExecutionType = planExecutionType;
            this.__explicitlySet__.add("planExecutionType");
            return this;
        }
        /**
         * The OCID of the DR protection group to which this DR plan execution belongs.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drProtectionGroupId")
        private String drProtectionGroupId;

        /**
         * The OCID of the DR protection group to which this DR plan execution belongs.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         *
         * @param drProtectionGroupId the value to set
         * @return this builder
         */
        public Builder drProtectionGroupId(String drProtectionGroupId) {
            this.drProtectionGroupId = drProtectionGroupId;
            this.__explicitlySet__.add("drProtectionGroupId");
            return this;
        }
        /**
         * The OCID of peer DR protection group associated with this DR plan execution's DR
         * protection group.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDrProtectionGroupId")
        private String peerDrProtectionGroupId;

        /**
         * The OCID of peer DR protection group associated with this DR plan execution's DR
         * protection group.
         *
         * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
         *
         * @param peerDrProtectionGroupId the value to set
         * @return this builder
         */
        public Builder peerDrProtectionGroupId(String peerDrProtectionGroupId) {
            this.peerDrProtectionGroupId = peerDrProtectionGroupId;
            this.__explicitlySet__.add("peerDrProtectionGroupId");
            return this;
        }
        /**
         * The region of the peer DR protection group associated with this DR plan execution's DR
         * protection group.
         *
         * <p>Example: {@code us-ashburn-1}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRegion")
        private String peerRegion;

        /**
         * The region of the peer DR protection group associated with this DR plan execution's DR
         * protection group.
         *
         * <p>Example: {@code us-ashburn-1}
         *
         * @param peerRegion the value to set
         * @return this builder
         */
        public Builder peerRegion(String peerRegion) {
            this.peerRegion = peerRegion;
            this.__explicitlySet__.add("peerRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
        private ObjectStorageLogLocation logLocation;

        public Builder logLocation(ObjectStorageLogLocation logLocation) {
            this.logLocation = logLocation;
            this.__explicitlySet__.add("logLocation");
            return this;
        }
        /**
         * The date and time at which DR plan execution was created. An RFC3339 formatted datetime
         * string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time at which DR plan execution was created. An RFC3339 formatted datetime
         * string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
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
         * The date and time at which DR plan execution began. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time at which DR plan execution began. An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time when this DR plan execution was last updated.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when this DR plan execution was last updated.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time at which DR plan execution succeeded, failed, was paused, or canceled.
         * An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time at which DR plan execution succeeded, failed, was paused, or canceled.
         * An RFC3339 formatted datetime string.
         *
         * <p>Example: {@code 2019-03-29T09:36:42Z}
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * The total duration in seconds taken to complete the DR plan execution.
         *
         * <p>Example: {@code 750}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("executionDurationInSec")
        private Integer executionDurationInSec;

        /**
         * The total duration in seconds taken to complete the DR plan execution.
         *
         * <p>Example: {@code 750}
         *
         * @param executionDurationInSec the value to set
         * @return this builder
         */
        public Builder executionDurationInSec(Integer executionDurationInSec) {
            this.executionDurationInSec = executionDurationInSec;
            this.__explicitlySet__.add("executionDurationInSec");
            return this;
        }
        /** The current state of the DR plan execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DrPlanExecutionLifecycleState lifecycleState;

        /**
         * The current state of the DR plan execution.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(DrPlanExecutionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A message describing the DR plan execution's current state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifeCycleDetails")
        private String lifeCycleDetails;

        /**
         * A message describing the DR plan execution's current state in more detail.
         *
         * @param lifeCycleDetails the value to set
         * @return this builder
         */
        public Builder lifeCycleDetails(String lifeCycleDetails) {
            this.lifeCycleDetails = lifeCycleDetails;
            this.__explicitlySet__.add("lifeCycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only.
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public DrPlanExecutionSummary build() {
            DrPlanExecutionSummary model =
                    new DrPlanExecutionSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.planId,
                            this.planExecutionType,
                            this.drProtectionGroupId,
                            this.peerDrProtectionGroupId,
                            this.peerRegion,
                            this.logLocation,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeUpdated,
                            this.timeEnded,
                            this.executionDurationInSec,
                            this.lifecycleState,
                            this.lifeCycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanExecutionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("planId")) {
                this.planId(model.getPlanId());
            }
            if (model.wasPropertyExplicitlySet("planExecutionType")) {
                this.planExecutionType(model.getPlanExecutionType());
            }
            if (model.wasPropertyExplicitlySet("drProtectionGroupId")) {
                this.drProtectionGroupId(model.getDrProtectionGroupId());
            }
            if (model.wasPropertyExplicitlySet("peerDrProtectionGroupId")) {
                this.peerDrProtectionGroupId(model.getPeerDrProtectionGroupId());
            }
            if (model.wasPropertyExplicitlySet("peerRegion")) {
                this.peerRegion(model.getPeerRegion());
            }
            if (model.wasPropertyExplicitlySet("logLocation")) {
                this.logLocation(model.getLogLocation());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("executionDurationInSec")) {
                this.executionDurationInSec(model.getExecutionDurationInSec());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifeCycleDetails")) {
                this.lifeCycleDetails(model.getLifeCycleDetails());
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
     * The OCID of the DR plan execution.
     *
     * <p>Example: {@code ocid1.drplanexecution.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the DR plan execution.
     *
     * <p>Example: {@code ocid1.drplanexecution.oc1..uniqueID}
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The OCID of the compartment containing this plan execution.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing this plan execution.
     *
     * <p>Example: {@code ocid1.compartment.oc1..uniqueID}
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The display name of the DR plan execution.
     *
     * <p>Example: {@code Execution - EBS Switchover PHX to IAD}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the DR plan execution.
     *
     * <p>Example: {@code Execution - EBS Switchover PHX to IAD}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the DR plan for this DR plan execution.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("planId")
    private final String planId;

    /**
     * The OCID of the DR plan for this DR plan execution.
     *
     * <p>Example: {@code ocid1.drplan.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPlanId() {
        return planId;
    }

    /** The type of the DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("planExecutionType")
    private final DrPlanExecutionType planExecutionType;

    /**
     * The type of the DR plan execution.
     *
     * @return the value
     */
    public DrPlanExecutionType getPlanExecutionType() {
        return planExecutionType;
    }

    /**
     * The OCID of the DR protection group to which this DR plan execution belongs.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drProtectionGroupId")
    private final String drProtectionGroupId;

    /**
     * The OCID of the DR protection group to which this DR plan execution belongs.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     *
     * @return the value
     */
    public String getDrProtectionGroupId() {
        return drProtectionGroupId;
    }

    /**
     * The OCID of peer DR protection group associated with this DR plan execution's DR protection
     * group.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDrProtectionGroupId")
    private final String peerDrProtectionGroupId;

    /**
     * The OCID of peer DR protection group associated with this DR plan execution's DR protection
     * group.
     *
     * <p>Example: {@code ocid1.drprotectiongroup.oc1..uniqueID}
     *
     * @return the value
     */
    public String getPeerDrProtectionGroupId() {
        return peerDrProtectionGroupId;
    }

    /**
     * The region of the peer DR protection group associated with this DR plan execution's DR
     * protection group.
     *
     * <p>Example: {@code us-ashburn-1}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRegion")
    private final String peerRegion;

    /**
     * The region of the peer DR protection group associated with this DR plan execution's DR
     * protection group.
     *
     * <p>Example: {@code us-ashburn-1}
     *
     * @return the value
     */
    public String getPeerRegion() {
        return peerRegion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("logLocation")
    private final ObjectStorageLogLocation logLocation;

    public ObjectStorageLogLocation getLogLocation() {
        return logLocation;
    }

    /**
     * The date and time at which DR plan execution was created. An RFC3339 formatted datetime
     * string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time at which DR plan execution was created. An RFC3339 formatted datetime
     * string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time at which DR plan execution began. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time at which DR plan execution began. An RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time when this DR plan execution was last updated.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when this DR plan execution was last updated.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time at which DR plan execution succeeded, failed, was paused, or canceled. An
     * RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time at which DR plan execution succeeded, failed, was paused, or canceled. An
     * RFC3339 formatted datetime string.
     *
     * <p>Example: {@code 2019-03-29T09:36:42Z}
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * The total duration in seconds taken to complete the DR plan execution.
     *
     * <p>Example: {@code 750}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("executionDurationInSec")
    private final Integer executionDurationInSec;

    /**
     * The total duration in seconds taken to complete the DR plan execution.
     *
     * <p>Example: {@code 750}
     *
     * @return the value
     */
    public Integer getExecutionDurationInSec() {
        return executionDurationInSec;
    }

    /** The current state of the DR plan execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final DrPlanExecutionLifecycleState lifecycleState;

    /**
     * The current state of the DR plan execution.
     *
     * @return the value
     */
    public DrPlanExecutionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A message describing the DR plan execution's current state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifeCycleDetails")
    private final String lifeCycleDetails;

    /**
     * A message describing the DR plan execution's current state in more detail.
     *
     * @return the value
     */
    public String getLifeCycleDetails() {
        return lifeCycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only.
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("DrPlanExecutionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", planId=").append(String.valueOf(this.planId));
        sb.append(", planExecutionType=").append(String.valueOf(this.planExecutionType));
        sb.append(", drProtectionGroupId=").append(String.valueOf(this.drProtectionGroupId));
        sb.append(", peerDrProtectionGroupId=")
                .append(String.valueOf(this.peerDrProtectionGroupId));
        sb.append(", peerRegion=").append(String.valueOf(this.peerRegion));
        sb.append(", logLocation=").append(String.valueOf(this.logLocation));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", executionDurationInSec=").append(String.valueOf(this.executionDurationInSec));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifeCycleDetails=").append(String.valueOf(this.lifeCycleDetails));
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
        if (!(o instanceof DrPlanExecutionSummary)) {
            return false;
        }

        DrPlanExecutionSummary other = (DrPlanExecutionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.planId, other.planId)
                && java.util.Objects.equals(this.planExecutionType, other.planExecutionType)
                && java.util.Objects.equals(this.drProtectionGroupId, other.drProtectionGroupId)
                && java.util.Objects.equals(
                        this.peerDrProtectionGroupId, other.peerDrProtectionGroupId)
                && java.util.Objects.equals(this.peerRegion, other.peerRegion)
                && java.util.Objects.equals(this.logLocation, other.logLocation)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(
                        this.executionDurationInSec, other.executionDurationInSec)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifeCycleDetails, other.lifeCycleDetails)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.planId == null ? 43 : this.planId.hashCode());
        result =
                (result * PRIME)
                        + (this.planExecutionType == null ? 43 : this.planExecutionType.hashCode());
        result =
                (result * PRIME)
                        + (this.drProtectionGroupId == null
                                ? 43
                                : this.drProtectionGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDrProtectionGroupId == null
                                ? 43
                                : this.peerDrProtectionGroupId.hashCode());
        result = (result * PRIME) + (this.peerRegion == null ? 43 : this.peerRegion.hashCode());
        result = (result * PRIME) + (this.logLocation == null ? 43 : this.logLocation.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.executionDurationInSec == null
                                ? 43
                                : this.executionDurationInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifeCycleDetails == null ? 43 : this.lifeCycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
