/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Summary information for a VectorStoreConnectorFileSync
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VectorStoreConnectorFileSyncSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VectorStoreConnectorFileSyncSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "vectorStoreConnectorId",
        "compartmentId",
        "tenantId",
        "timeCreated",
        "lifecycleState",
        "lifecycleDetails",
        "timeStarted",
        "timeEnded",
        "durationInSeconds",
        "triggerType",
        "stats",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public VectorStoreConnectorFileSyncSummary(
            String id,
            String displayName,
            String vectorStoreConnectorId,
            String compartmentId,
            String tenantId,
            java.util.Date timeCreated,
            VectorStoreConnectorFileSync.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Integer durationInSeconds,
            TriggerType triggerType,
            VectorStoreConnectorStats stats,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.vectorStoreConnectorId = vectorStoreConnectorId;
        this.compartmentId = compartmentId;
        this.tenantId = tenantId;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.durationInSeconds = durationInSeconds;
        this.triggerType = triggerType;
        this.stats = stats;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An OCID that uniquely identifies a VectorStoreConnectorFileSync operation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * An OCID that uniquely identifies a VectorStoreConnectorFileSync operation.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * An OCID that identifies the VectorStoreConnector under which this FileSync operation is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vectorStoreConnectorId")
        private String vectorStoreConnectorId;

        /**
         * An OCID that identifies the VectorStoreConnector under which this FileSync operation is created.
         * @param vectorStoreConnectorId the value to set
         * @return this builder
         **/
        public Builder vectorStoreConnectorId(String vectorStoreConnectorId) {
            this.vectorStoreConnectorId = vectorStoreConnectorId;
            this.__explicitlySet__.add("vectorStoreConnectorId");
            return this;
        }
        /**
         * Owning compartment OCID for a VectorStoreConnectorFileSync.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Owning compartment OCID for a VectorStoreConnectorFileSync.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Owning tenant OCID for a VectorStoreConnector
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * Owning tenant OCID for a VectorStoreConnector
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The date and time that the FileSync operation was created in the format of an RFC3339 datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the FileSync operation was created in the format of an RFC3339 datetime string.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current state of the VectorStoreConnectorFileSync operation.
         * Accepted Values are:
         *   - ACCEPTED
         *   - IN_PROGRESS
         *   - FAILED
         *   - SUCCEEDED
         *   - CANCELING
         *   - CANCELED
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private VectorStoreConnectorFileSync.LifecycleState lifecycleState;

        /**
         * The current state of the VectorStoreConnectorFileSync operation.
         * Accepted Values are:
         *   - ACCEPTED
         *   - IN_PROGRESS
         *   - FAILED
         *   - SUCCEEDED
         *   - CANCELING
         *   - CANCELED
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(VectorStoreConnectorFileSync.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message describing the current state in more detail that can provide actionable information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail that can provide actionable information.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time when the FileSync operation has started in the format of an RFC3339 datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time when the FileSync operation has started in the format of an RFC3339 datetime string.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time when the FileSync operation has ended in the format of an RFC3339 datetime string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time when the FileSync operation has ended in the format of an RFC3339 datetime string.
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * The duration (in seconds) taken for the VectorStoreConnectorFileSync operation to complete.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Integer durationInSeconds;

        /**
         * The duration (in seconds) taken for the VectorStoreConnectorFileSync operation to complete.
         * @param durationInSeconds the value to set
         * @return this builder
         **/
        public Builder durationInSeconds(Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }
        /**
         * The type of the FileSync operation based on how it is triggered. The type can be either MANUAL or SCHEDULED
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
        private TriggerType triggerType;

        /**
         * The type of the FileSync operation based on how it is triggered. The type can be either MANUAL or SCHEDULED
         * @param triggerType the value to set
         * @return this builder
         **/
        public Builder triggerType(TriggerType triggerType) {
            this.triggerType = triggerType;
            this.__explicitlySet__.add("triggerType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stats")
        private VectorStoreConnectorStats stats;

        public Builder stats(VectorStoreConnectorStats stats) {
            this.stats = stats;
            this.__explicitlySet__.add("stats");
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

        public VectorStoreConnectorFileSyncSummary build() {
            VectorStoreConnectorFileSyncSummary model =
                    new VectorStoreConnectorFileSyncSummary(
                            this.id,
                            this.displayName,
                            this.vectorStoreConnectorId,
                            this.compartmentId,
                            this.tenantId,
                            this.timeCreated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeStarted,
                            this.timeEnded,
                            this.durationInSeconds,
                            this.triggerType,
                            this.stats,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VectorStoreConnectorFileSyncSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("vectorStoreConnectorId")) {
                this.vectorStoreConnectorId(model.getVectorStoreConnectorId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
            }
            if (model.wasPropertyExplicitlySet("triggerType")) {
                this.triggerType(model.getTriggerType());
            }
            if (model.wasPropertyExplicitlySet("stats")) {
                this.stats(model.getStats());
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
     * An OCID that uniquely identifies a VectorStoreConnectorFileSync operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * An OCID that uniquely identifies a VectorStoreConnectorFileSync operation.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * An OCID that identifies the VectorStoreConnector under which this FileSync operation is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vectorStoreConnectorId")
    private final String vectorStoreConnectorId;

    /**
     * An OCID that identifies the VectorStoreConnector under which this FileSync operation is created.
     * @return the value
     **/
    public String getVectorStoreConnectorId() {
        return vectorStoreConnectorId;
    }

    /**
     * Owning compartment OCID for a VectorStoreConnectorFileSync.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Owning compartment OCID for a VectorStoreConnectorFileSync.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Owning tenant OCID for a VectorStoreConnector
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * Owning tenant OCID for a VectorStoreConnector
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The date and time that the FileSync operation was created in the format of an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the FileSync operation was created in the format of an RFC3339 datetime string.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current state of the VectorStoreConnectorFileSync operation.
     * Accepted Values are:
     *   - ACCEPTED
     *   - IN_PROGRESS
     *   - FAILED
     *   - SUCCEEDED
     *   - CANCELING
     *   - CANCELED
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final VectorStoreConnectorFileSync.LifecycleState lifecycleState;

    /**
     * The current state of the VectorStoreConnectorFileSync operation.
     * Accepted Values are:
     *   - ACCEPTED
     *   - IN_PROGRESS
     *   - FAILED
     *   - SUCCEEDED
     *   - CANCELING
     *   - CANCELED
     *
     * @return the value
     **/
    public VectorStoreConnectorFileSync.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message describing the current state in more detail that can provide actionable information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail that can provide actionable information.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time when the FileSync operation has started in the format of an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time when the FileSync operation has started in the format of an RFC3339 datetime string.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time when the FileSync operation has ended in the format of an RFC3339 datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time when the FileSync operation has ended in the format of an RFC3339 datetime string.
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * The duration (in seconds) taken for the VectorStoreConnectorFileSync operation to complete.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Integer durationInSeconds;

    /**
     * The duration (in seconds) taken for the VectorStoreConnectorFileSync operation to complete.
     * @return the value
     **/
    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    /**
     * The type of the FileSync operation based on how it is triggered. The type can be either MANUAL or SCHEDULED
     **/
    public enum TriggerType {
        Manual("MANUAL"),
        Scheduled("SCHEDULED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TriggerType.class);

        private final String value;
        private static java.util.Map<String, TriggerType> map;

        static {
            map = new java.util.HashMap<>();
            for (TriggerType v : TriggerType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TriggerType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TriggerType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TriggerType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the FileSync operation based on how it is triggered. The type can be either MANUAL or SCHEDULED
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("triggerType")
    private final TriggerType triggerType;

    /**
     * The type of the FileSync operation based on how it is triggered. The type can be either MANUAL or SCHEDULED
     * @return the value
     **/
    public TriggerType getTriggerType() {
        return triggerType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stats")
    private final VectorStoreConnectorStats stats;

    public VectorStoreConnectorStats getStats() {
        return stats;
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
        sb.append("VectorStoreConnectorFileSyncSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", vectorStoreConnectorId=").append(String.valueOf(this.vectorStoreConnectorId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(", triggerType=").append(String.valueOf(this.triggerType));
        sb.append(", stats=").append(String.valueOf(this.stats));
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
        if (!(o instanceof VectorStoreConnectorFileSyncSummary)) {
            return false;
        }

        VectorStoreConnectorFileSyncSummary other = (VectorStoreConnectorFileSyncSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.vectorStoreConnectorId, other.vectorStoreConnectorId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && java.util.Objects.equals(this.triggerType, other.triggerType)
                && java.util.Objects.equals(this.stats, other.stats)
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
        result =
                (result * PRIME)
                        + (this.vectorStoreConnectorId == null
                                ? 43
                                : this.vectorStoreConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result = (result * PRIME) + (this.triggerType == null ? 43 : this.triggerType.hashCode());
        result = (result * PRIME) + (this.stats == null ? 43 : this.stats.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
