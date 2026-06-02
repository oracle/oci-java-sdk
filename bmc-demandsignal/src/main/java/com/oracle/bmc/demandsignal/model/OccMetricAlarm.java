/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.model;

/**
 * OccMetricAlarm represents an alarm configuration for OCI Control Center metric.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OccMetricAlarm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OccMetricAlarm extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "description",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "compartmentId",
        "isActive",
        "subscribers",
        "frequency",
        "threshold",
        "thresholdType",
        "resourceConfiguration",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OccMetricAlarm(
            String id,
            String displayName,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String compartmentId,
            Boolean isActive,
            java.util.List<String> subscribers,
            Frequency frequency,
            Integer threshold,
            ThresholdType thresholdType,
            BaseResourceConfiguration resourceConfiguration,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.compartmentId = compartmentId;
        this.isActive = isActive;
        this.subscribers = subscribers;
        this.frequency = frequency;
        this.threshold = threshold;
        this.thresholdType = thresholdType;
        this.resourceConfiguration = resourceConfiguration;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique OCID for this alarm configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID for this alarm configuration.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Human-readable name for the alarm.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Human-readable name for the alarm.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Optional description for the alarm.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Optional description for the alarm.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Creation timestamp (RFC 3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Creation timestamp (RFC 3339).
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Last update timestamp (RFC 3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Last update timestamp (RFC 3339).
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The current lifecycle state of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Compartment OCID in which the alarm is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment OCID in which the alarm is created.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Alarm active status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * Alarm active status.
         * @param isActive the value to set
         * @return this builder
         **/
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }
        /**
         * List of topic OCIDs for notifications.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscribers")
        private java.util.List<String> subscribers;

        /**
         * List of topic OCIDs for notifications.
         * @param subscribers the value to set
         * @return this builder
         **/
        public Builder subscribers(java.util.List<String> subscribers) {
            this.subscribers = subscribers;
            this.__explicitlySet__.add("subscribers");
            return this;
        }
        /**
         * Frequency at which notifications should be sent.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("frequency")
        private Frequency frequency;

        /**
         * Frequency at which notifications should be sent.
         * @param frequency the value to set
         * @return this builder
         **/
        public Builder frequency(Frequency frequency) {
            this.frequency = frequency;
            this.__explicitlySet__.add("frequency");
            return this;
        }
        /**
         * Threshold at which alarm must be triggered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Integer threshold;

        /**
         * Threshold at which alarm must be triggered.
         * @param threshold the value to set
         * @return this builder
         **/
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }
        /**
         * Units in which threshold is being stored.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("thresholdType")
        private ThresholdType thresholdType;

        /**
         * Units in which threshold is being stored.
         * @param thresholdType the value to set
         * @return this builder
         **/
        public Builder thresholdType(ThresholdType thresholdType) {
            this.thresholdType = thresholdType;
            this.__explicitlySet__.add("thresholdType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceConfiguration")
        private BaseResourceConfiguration resourceConfiguration;

        public Builder resourceConfiguration(BaseResourceConfiguration resourceConfiguration) {
            this.resourceConfiguration = resourceConfiguration;
            this.__explicitlySet__.add("resourceConfiguration");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * <p>
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * <p>
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

        public OccMetricAlarm build() {
            OccMetricAlarm model =
                    new OccMetricAlarm(
                            this.id,
                            this.displayName,
                            this.description,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.compartmentId,
                            this.isActive,
                            this.subscribers,
                            this.frequency,
                            this.threshold,
                            this.thresholdType,
                            this.resourceConfiguration,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OccMetricAlarm model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("isActive")) {
                this.isActive(model.getIsActive());
            }
            if (model.wasPropertyExplicitlySet("subscribers")) {
                this.subscribers(model.getSubscribers());
            }
            if (model.wasPropertyExplicitlySet("frequency")) {
                this.frequency(model.getFrequency());
            }
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
            }
            if (model.wasPropertyExplicitlySet("thresholdType")) {
                this.thresholdType(model.getThresholdType());
            }
            if (model.wasPropertyExplicitlySet("resourceConfiguration")) {
                this.resourceConfiguration(model.getResourceConfiguration());
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
     * Unique OCID for this alarm configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID for this alarm configuration.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Human-readable name for the alarm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Human-readable name for the alarm.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Optional description for the alarm.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Optional description for the alarm.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Creation timestamp (RFC 3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Creation timestamp (RFC 3339).
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Last update timestamp (RFC 3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Last update timestamp (RFC 3339).
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The current lifecycle state of the resource.
     **/
    public enum LifecycleState {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The current lifecycle state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Compartment OCID in which the alarm is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment OCID in which the alarm is created.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Alarm active status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * Alarm active status.
     * @return the value
     **/
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * List of topic OCIDs for notifications.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscribers")
    private final java.util.List<String> subscribers;

    /**
     * List of topic OCIDs for notifications.
     * @return the value
     **/
    public java.util.List<String> getSubscribers() {
        return subscribers;
    }

    /**
     * Frequency at which notifications should be sent.
     **/
    public enum Frequency {
        Daily("DAILY"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Frequency.class);

        private final String value;
        private static java.util.Map<String, Frequency> map;

        static {
            map = new java.util.HashMap<>();
            for (Frequency v : Frequency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Frequency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Frequency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Frequency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Frequency at which notifications should be sent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("frequency")
    private final Frequency frequency;

    /**
     * Frequency at which notifications should be sent.
     * @return the value
     **/
    public Frequency getFrequency() {
        return frequency;
    }

    /**
     * Threshold at which alarm must be triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Integer threshold;

    /**
     * Threshold at which alarm must be triggered.
     * @return the value
     **/
    public Integer getThreshold() {
        return threshold;
    }

    /**
     * Units in which threshold is being stored.
     **/
    public enum ThresholdType {
        Percentage("PERCENTAGE"),
        Units("UNITS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ThresholdType.class);

        private final String value;
        private static java.util.Map<String, ThresholdType> map;

        static {
            map = new java.util.HashMap<>();
            for (ThresholdType v : ThresholdType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ThresholdType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ThresholdType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ThresholdType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Units in which threshold is being stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("thresholdType")
    private final ThresholdType thresholdType;

    /**
     * Units in which threshold is being stored.
     * @return the value
     **/
    public ThresholdType getThresholdType() {
        return thresholdType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceConfiguration")
    private final BaseResourceConfiguration resourceConfiguration;

    public BaseResourceConfiguration getResourceConfiguration() {
        return resourceConfiguration;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * <p>
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * <p>
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
        sb.append("OccMetricAlarm(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isActive=").append(String.valueOf(this.isActive));
        sb.append(", subscribers=").append(String.valueOf(this.subscribers));
        sb.append(", frequency=").append(String.valueOf(this.frequency));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", thresholdType=").append(String.valueOf(this.thresholdType));
        sb.append(", resourceConfiguration=").append(String.valueOf(this.resourceConfiguration));
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
        if (!(o instanceof OccMetricAlarm)) {
            return false;
        }

        OccMetricAlarm other = (OccMetricAlarm) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isActive, other.isActive)
                && java.util.Objects.equals(this.subscribers, other.subscribers)
                && java.util.Objects.equals(this.frequency, other.frequency)
                && java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.thresholdType, other.thresholdType)
                && java.util.Objects.equals(this.resourceConfiguration, other.resourceConfiguration)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result = (result * PRIME) + (this.subscribers == null ? 43 : this.subscribers.hashCode());
        result = (result * PRIME) + (this.frequency == null ? 43 : this.frequency.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result =
                (result * PRIME)
                        + (this.thresholdType == null ? 43 : this.thresholdType.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceConfiguration == null
                                ? 43
                                : this.resourceConfiguration.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
