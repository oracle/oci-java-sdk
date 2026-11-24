/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * An instance pool refresh is an asynchronous operation that replaces eligible instances in an
 * instance pool with instances launched from the pool's target instance configuration. <br>
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
        builder = InstancePoolRefresh.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolRefresh
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "systemTags",
        "instancePoolId",
        "lifecycleState",
        "targetInstanceConfigurationId",
        "maxHealthyPercent",
        "warmupSeconds",
        "isFullRefresh",
        "refreshBatchSize",
        "totalMemberCount",
        "remainingMemberCount",
        "percentComplete",
        "skippedMemberCount",
        "timeCreated",
        "timeCompleted"
    })
    public InstancePoolRefresh(
            String id,
            String compartmentId,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String instancePoolId,
            LifecycleState lifecycleState,
            String targetInstanceConfigurationId,
            Integer maxHealthyPercent,
            Integer warmupSeconds,
            Boolean isFullRefresh,
            Integer refreshBatchSize,
            Integer totalMemberCount,
            Integer remainingMemberCount,
            Integer percentComplete,
            Integer skippedMemberCount,
            java.util.Date timeCreated,
            java.util.Date timeCompleted) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.systemTags = systemTags;
        this.instancePoolId = instancePoolId;
        this.lifecycleState = lifecycleState;
        this.targetInstanceConfigurationId = targetInstanceConfigurationId;
        this.maxHealthyPercent = maxHealthyPercent;
        this.warmupSeconds = warmupSeconds;
        this.isFullRefresh = isFullRefresh;
        this.refreshBatchSize = refreshBatchSize;
        this.totalMemberCount = totalMemberCount;
        this.remainingMemberCount = remainingMemberCount;
        this.percentComplete = percentComplete;
        this.skippedMemberCount = skippedMemberCount;
        this.timeCreated = timeCreated;
        this.timeCompleted = timeCompleted;
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
        private LifecycleState lifecycleState;

        /**
         * The current state of the instance pool refresh.
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
        /**
         * Whether the refresh can select instances that already match the target instance
         * configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFullRefresh")
        private Boolean isFullRefresh;

        /**
         * Whether the refresh can select instances that already match the target instance
         * configuration.
         *
         * @param isFullRefresh the value to set
         * @return this builder
         */
        public Builder isFullRefresh(Boolean isFullRefresh) {
            this.isFullRefresh = isFullRefresh;
            this.__explicitlySet__.add("isFullRefresh");
            return this;
        }
        /** The maximum number of instances refreshed in a batch. */
        @com.fasterxml.jackson.annotation.JsonProperty("refreshBatchSize")
        private Integer refreshBatchSize;

        /**
         * The maximum number of instances refreshed in a batch.
         *
         * @param refreshBatchSize the value to set
         * @return this builder
         */
        public Builder refreshBatchSize(Integer refreshBatchSize) {
            this.refreshBatchSize = refreshBatchSize;
            this.__explicitlySet__.add("refreshBatchSize");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolRefresh build() {
            InstancePoolRefresh model =
                    new InstancePoolRefresh(
                            this.id,
                            this.compartmentId,
                            this.systemTags,
                            this.instancePoolId,
                            this.lifecycleState,
                            this.targetInstanceConfigurationId,
                            this.maxHealthyPercent,
                            this.warmupSeconds,
                            this.isFullRefresh,
                            this.refreshBatchSize,
                            this.totalMemberCount,
                            this.remainingMemberCount,
                            this.percentComplete,
                            this.skippedMemberCount,
                            this.timeCreated,
                            this.timeCompleted);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolRefresh model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
            if (model.wasPropertyExplicitlySet("isFullRefresh")) {
                this.isFullRefresh(model.getIsFullRefresh());
            }
            if (model.wasPropertyExplicitlySet("refreshBatchSize")) {
                this.refreshBatchSize(model.getRefreshBatchSize());
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
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

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
    /** The current state of the instance pool refresh. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the instance pool refresh.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
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

    /**
     * Whether the refresh can select instances that already match the target instance
     * configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFullRefresh")
    private final Boolean isFullRefresh;

    /**
     * Whether the refresh can select instances that already match the target instance
     * configuration.
     *
     * @return the value
     */
    public Boolean getIsFullRefresh() {
        return isFullRefresh;
    }

    /** The maximum number of instances refreshed in a batch. */
    @com.fasterxml.jackson.annotation.JsonProperty("refreshBatchSize")
    private final Integer refreshBatchSize;

    /**
     * The maximum number of instances refreshed in a batch.
     *
     * @return the value
     */
    public Integer getRefreshBatchSize() {
        return refreshBatchSize;
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
        sb.append("InstancePoolRefresh(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", instancePoolId=").append(String.valueOf(this.instancePoolId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", targetInstanceConfigurationId=")
                .append(String.valueOf(this.targetInstanceConfigurationId));
        sb.append(", maxHealthyPercent=").append(String.valueOf(this.maxHealthyPercent));
        sb.append(", warmupSeconds=").append(String.valueOf(this.warmupSeconds));
        sb.append(", isFullRefresh=").append(String.valueOf(this.isFullRefresh));
        sb.append(", refreshBatchSize=").append(String.valueOf(this.refreshBatchSize));
        sb.append(", totalMemberCount=").append(String.valueOf(this.totalMemberCount));
        sb.append(", remainingMemberCount=").append(String.valueOf(this.remainingMemberCount));
        sb.append(", percentComplete=").append(String.valueOf(this.percentComplete));
        sb.append(", skippedMemberCount=").append(String.valueOf(this.skippedMemberCount));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeCompleted=").append(String.valueOf(this.timeCompleted));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolRefresh)) {
            return false;
        }

        InstancePoolRefresh other = (InstancePoolRefresh) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.instancePoolId, other.instancePoolId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.targetInstanceConfigurationId, other.targetInstanceConfigurationId)
                && java.util.Objects.equals(this.maxHealthyPercent, other.maxHealthyPercent)
                && java.util.Objects.equals(this.warmupSeconds, other.warmupSeconds)
                && java.util.Objects.equals(this.isFullRefresh, other.isFullRefresh)
                && java.util.Objects.equals(this.refreshBatchSize, other.refreshBatchSize)
                && java.util.Objects.equals(this.totalMemberCount, other.totalMemberCount)
                && java.util.Objects.equals(this.remainingMemberCount, other.remainingMemberCount)
                && java.util.Objects.equals(this.percentComplete, other.percentComplete)
                && java.util.Objects.equals(this.skippedMemberCount, other.skippedMemberCount)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeCompleted, other.timeCompleted)
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
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
                        + (this.isFullRefresh == null ? 43 : this.isFullRefresh.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshBatchSize == null ? 43 : this.refreshBatchSize.hashCode());
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
