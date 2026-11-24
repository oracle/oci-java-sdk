/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Summary information for an instance pool refresh. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolRefreshSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolRefreshSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "instancePoolId",
        "lifecycleState",
        "targetInstanceConfigurationId",
        "maxHealthyPercent",
        "warmupSeconds",
        "totalMemberCount",
        "remainingMemberCount",
        "percentComplete",
        "skippedMemberCount",
        "timeCreated",
        "timeCompleted",
        "systemTags",
        "definedTags",
        "freeformTags"
    })
    public InstancePoolRefreshSummary(
            String id,
            String compartmentId,
            String instancePoolId,
            InstancePoolRefresh.LifecycleState lifecycleState,
            String targetInstanceConfigurationId,
            Integer maxHealthyPercent,
            Integer warmupSeconds,
            Integer totalMemberCount,
            Integer remainingMemberCount,
            Integer percentComplete,
            Integer skippedMemberCount,
            java.util.Date timeCreated,
            java.util.Date timeCompleted,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.instancePoolId = instancePoolId;
        this.lifecycleState = lifecycleState;
        this.targetInstanceConfigurationId = targetInstanceConfigurationId;
        this.maxHealthyPercent = maxHealthyPercent;
        this.warmupSeconds = warmupSeconds;
        this.totalMemberCount = totalMemberCount;
        this.remainingMemberCount = remainingMemberCount;
        this.percentComplete = percentComplete;
        this.skippedMemberCount = skippedMemberCount;
        this.timeCreated = timeCreated;
        this.timeCompleted = timeCompleted;
        this.systemTags = systemTags;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool refresh.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool refresh.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the instance pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the instance pool.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instancePoolId")
        private String instancePoolId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance pool.
         *
         * @param instancePoolId the value to set
         * @return this builder
         */
        public Builder instancePoolId(String instancePoolId) {
            this.instancePoolId = instancePoolId;
            this.__explicitlySet__.add("instancePoolId");
            return this;
        }
        /** The current state of the instance pool refresh. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private InstancePoolRefresh.LifecycleState lifecycleState;

        /**
         * The current state of the instance pool refresh.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(InstancePoolRefresh.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance configuration captured from the instance pool when the refresh started.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetInstanceConfigurationId")
        private String targetInstanceConfigurationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * instance configuration captured from the instance pool when the refresh started.
         *
         * @param targetInstanceConfigurationId the value to set
         * @return this builder
         */
        public Builder targetInstanceConfigurationId(String targetInstanceConfigurationId) {
            this.targetInstanceConfigurationId = targetInstanceConfigurationId;
            this.__explicitlySet__.add("targetInstanceConfigurationId");
            return this;
        }
        /** The maximum healthy percentage requested for launch-before-terminate capacity. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxHealthyPercent")
        private Integer maxHealthyPercent;

        /**
         * The maximum healthy percentage requested for launch-before-terminate capacity.
         *
         * @param maxHealthyPercent the value to set
         * @return this builder
         */
        public Builder maxHealthyPercent(Integer maxHealthyPercent) {
            this.maxHealthyPercent = maxHealthyPercent;
            this.__explicitlySet__.add("maxHealthyPercent");
            return this;
        }
        /** The requested warmup duration in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("warmupSeconds")
        private Integer warmupSeconds;

        /**
         * The requested warmup duration in seconds.
         *
         * @param warmupSeconds the value to set
         * @return this builder
         */
        public Builder warmupSeconds(Integer warmupSeconds) {
            this.warmupSeconds = warmupSeconds;
            this.__explicitlySet__.add("warmupSeconds");
            return this;
        }
        /** The total number of instances selected for this refresh. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMemberCount")
        private Integer totalMemberCount;

        /**
         * The total number of instances selected for this refresh.
         *
         * @param totalMemberCount the value to set
         * @return this builder
         */
        public Builder totalMemberCount(Integer totalMemberCount) {
            this.totalMemberCount = totalMemberCount;
            this.__explicitlySet__.add("totalMemberCount");
            return this;
        }
        /** The number of instances remaining to be refreshed. */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingMemberCount")
        private Integer remainingMemberCount;

        /**
         * The number of instances remaining to be refreshed.
         *
         * @param remainingMemberCount the value to set
         * @return this builder
         */
        public Builder remainingMemberCount(Integer remainingMemberCount) {
            this.remainingMemberCount = remainingMemberCount;
            this.__explicitlySet__.add("remainingMemberCount");
            return this;
        }
        /** The percentage of the refresh that is complete. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Integer percentComplete;

        /**
         * The percentage of the refresh that is complete.
         *
         * @param percentComplete the value to set
         * @return this builder
         */
        public Builder percentComplete(Integer percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }
        /** The number of instances skipped by the refresh. */
        @com.fasterxml.jackson.annotation.JsonProperty("skippedMemberCount")
        private Integer skippedMemberCount;

        /**
         * The number of instances skipped by the refresh.
         *
         * @param skippedMemberCount the value to set
         * @return this builder
         */
        public Builder skippedMemberCount(Integer skippedMemberCount) {
            this.skippedMemberCount = skippedMemberCount;
            this.__explicitlySet__.add("skippedMemberCount");
            return this;
        }
        /**
         * The date and time the instance pool refresh was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the instance pool refresh was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the instance pool refresh reached a terminal state, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code
         * 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
        private java.util.Date timeCompleted;

        /**
         * The date and time the instance pool refresh reached a terminal state, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code
         * 2016-08-25T21:10:29.600Z}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolRefreshSummary build() {
            InstancePoolRefreshSummary model =
                    new InstancePoolRefreshSummary(
                            this.id,
                            this.compartmentId,
                            this.instancePoolId,
                            this.lifecycleState,
                            this.targetInstanceConfigurationId,
                            this.maxHealthyPercent,
                            this.warmupSeconds,
                            this.totalMemberCount,
                            this.remainingMemberCount,
                            this.percentComplete,
                            this.skippedMemberCount,
                            this.timeCreated,
                            this.timeCompleted,
                            this.systemTags,
                            this.definedTags,
                            this.freeformTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolRefreshSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("instancePoolId")) {
                this.instancePoolId(model.getInstancePoolId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("targetInstanceConfigurationId")) {
                this.targetInstanceConfigurationId(model.getTargetInstanceConfigurationId());
            }
            if (model.wasPropertyExplicitlySet("maxHealthyPercent")) {
                this.maxHealthyPercent(model.getMaxHealthyPercent());
            }
            if (model.wasPropertyExplicitlySet("warmupSeconds")) {
                this.warmupSeconds(model.getWarmupSeconds());
            }
            if (model.wasPropertyExplicitlySet("totalMemberCount")) {
                this.totalMemberCount(model.getTotalMemberCount());
            }
            if (model.wasPropertyExplicitlySet("remainingMemberCount")) {
                this.remainingMemberCount(model.getRemainingMemberCount());
            }
            if (model.wasPropertyExplicitlySet("percentComplete")) {
                this.percentComplete(model.getPercentComplete());
            }
            if (model.wasPropertyExplicitlySet("skippedMemberCount")) {
                this.skippedMemberCount(model.getSkippedMemberCount());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeCompleted")) {
                this.timeCompleted(model.getTimeCompleted());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool refresh.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool refresh.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the instance pool.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instancePoolId")
    private final String instancePoolId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance pool.
     *
     * @return the value
     */
    public String getInstancePoolId() {
        return instancePoolId;
    }

    /** The current state of the instance pool refresh. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final InstancePoolRefresh.LifecycleState lifecycleState;

    /**
     * The current state of the instance pool refresh.
     *
     * @return the value
     */
    public InstancePoolRefresh.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance configuration captured from the instance pool when the refresh started.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetInstanceConfigurationId")
    private final String targetInstanceConfigurationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * instance configuration captured from the instance pool when the refresh started.
     *
     * @return the value
     */
    public String getTargetInstanceConfigurationId() {
        return targetInstanceConfigurationId;
    }

    /** The maximum healthy percentage requested for launch-before-terminate capacity. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxHealthyPercent")
    private final Integer maxHealthyPercent;

    /**
     * The maximum healthy percentage requested for launch-before-terminate capacity.
     *
     * @return the value
     */
    public Integer getMaxHealthyPercent() {
        return maxHealthyPercent;
    }

    /** The requested warmup duration in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("warmupSeconds")
    private final Integer warmupSeconds;

    /**
     * The requested warmup duration in seconds.
     *
     * @return the value
     */
    public Integer getWarmupSeconds() {
        return warmupSeconds;
    }

    /** The total number of instances selected for this refresh. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMemberCount")
    private final Integer totalMemberCount;

    /**
     * The total number of instances selected for this refresh.
     *
     * @return the value
     */
    public Integer getTotalMemberCount() {
        return totalMemberCount;
    }

    /** The number of instances remaining to be refreshed. */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingMemberCount")
    private final Integer remainingMemberCount;

    /**
     * The number of instances remaining to be refreshed.
     *
     * @return the value
     */
    public Integer getRemainingMemberCount() {
        return remainingMemberCount;
    }

    /** The percentage of the refresh that is complete. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    private final Integer percentComplete;

    /**
     * The percentage of the refresh that is complete.
     *
     * @return the value
     */
    public Integer getPercentComplete() {
        return percentComplete;
    }

    /** The number of instances skipped by the refresh. */
    @com.fasterxml.jackson.annotation.JsonProperty("skippedMemberCount")
    private final Integer skippedMemberCount;

    /**
     * The number of instances skipped by the refresh.
     *
     * @return the value
     */
    public Integer getSkippedMemberCount() {
        return skippedMemberCount;
    }

    /**
     * The date and time the instance pool refresh was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the instance pool refresh was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the instance pool refresh reached a terminal state, in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCompleted")
    private final java.util.Date timeCompleted;

    /**
     * The date and time the instance pool refresh reached a terminal state, in the format defined
     * by [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCompleted() {
        return timeCompleted;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
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
        sb.append("InstancePoolRefreshSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", instancePoolId=").append(String.valueOf(this.instancePoolId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", targetInstanceConfigurationId=")
                .append(String.valueOf(this.targetInstanceConfigurationId));
        sb.append(", maxHealthyPercent=").append(String.valueOf(this.maxHealthyPercent));
        sb.append(", warmupSeconds=").append(String.valueOf(this.warmupSeconds));
        sb.append(", totalMemberCount=").append(String.valueOf(this.totalMemberCount));
        sb.append(", remainingMemberCount=").append(String.valueOf(this.remainingMemberCount));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", skippedMemberCount=").append(String.valueOf(this.skippedMemberCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolRefreshSummary)) {
            return false;
        }

        InstancePoolRefreshSummary other = (InstancePoolRefreshSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.instancePoolId, other.instancePoolId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.targetInstanceConfigurationId, other.targetInstanceConfigurationId)
                && java.util.Objects.equals(this.maxHealthyPercent, other.maxHealthyPercent)
                && java.util.Objects.equals(this.warmupSeconds, other.warmupSeconds)
                && java.util.Objects.equals(this.totalMemberCount, other.totalMemberCount)
                && java.util.Objects.equals(this.remainingMemberCount, other.remainingMemberCount)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.skippedMemberCount, other.skippedMemberCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
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
        result =
                (result * PRIME)
                        + (this.instancePoolId == null ? 43 : this.instancePoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.targetInstanceConfigurationId == null
                                ? 43
                                : this.targetInstanceConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.maxHealthyPercent == null ? 43 : this.maxHealthyPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.warmupSeconds == null ? 43 : this.warmupSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.totalMemberCount == null ? 43 : this.totalMemberCount.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingMemberCount == null
                                ? 43
                                : this.remainingMemberCount.hashCode());
        result =
                (result * PRIME)
                        + (this.percentComplete == null ? 43 : this.percentComplete.hashCode());
        result =
                (result * PRIME)
                        + (this.skippedMemberCount == null
                                ? 43
                                : this.skippedMemberCount.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCompleted == null ? 43 : this.timeCompleted.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
