/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * List-safe summary of a blue/green deployment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BlueGreenDeploymentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BlueGreenDeploymentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "lifecycleState",
        "lifecycleDetails",
        "sourceDbSystemId",
        "targetDbSystemId",
        "activeDbSystemId",
        "switchoverStatus",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCreated",
        "timeUpdated"
    })
    public BlueGreenDeploymentSummary(
            String id,
            String compartmentId,
            String displayName,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String sourceDbSystemId,
            String targetDbSystemId,
            String activeDbSystemId,
            BlueGreenDeploymentSwitchoverStatus switchoverStatus,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.sourceDbSystemId = sourceDbSystemId;
        this.targetDbSystemId = targetDbSystemId;
        this.activeDbSystemId = activeDbSystemId;
        this.switchoverStatus = switchoverStatus;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * blue/green deployment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * blue/green deployment.
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
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The display name of the blue/green deployment. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the blue/green deployment.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional lifecycle details. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional lifecycle details.
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
         * Blue/original source DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * deployment pair.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceDbSystemId")
        private String sourceDbSystemId;

        /**
         * Blue/original source DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * deployment pair.
         *
         * @param sourceDbSystemId the value to set
         * @return this builder
         */
        public Builder sourceDbSystemId(String sourceDbSystemId) {
            this.sourceDbSystemId = sourceDbSystemId;
            this.__explicitlySet__.add("sourceDbSystemId");
            return this;
        }
        /**
         * Green/target DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * deployment pair.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDbSystemId")
        private String targetDbSystemId;

        /**
         * Green/target DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
         * deployment pair.
         *
         * @param targetDbSystemId the value to set
         * @return this builder
         */
        public Builder targetDbSystemId(String targetDbSystemId) {
            this.targetDbSystemId = targetDbSystemId;
            this.__explicitlySet__.add("targetDbSystemId");
            return this;
        }
        /**
         * The DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * currently owns the client-facing VIP and serves traffic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("activeDbSystemId")
        private String activeDbSystemId;

        /**
         * The DB system
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that
         * currently owns the client-facing VIP and serves traffic.
         *
         * @param activeDbSystemId the value to set
         * @return this builder
         */
        public Builder activeDbSystemId(String activeDbSystemId) {
            this.activeDbSystemId = activeDbSystemId;
            this.__explicitlySet__.add("activeDbSystemId");
            return this;
        }
        /**
         * Stage of the most recent switchover workflow. {@code SWITCHOVER_FAILED} indicates
         * terminal switchover failure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("switchoverStatus")
        private BlueGreenDeploymentSwitchoverStatus switchoverStatus;

        /**
         * Stage of the most recent switchover workflow. {@code SWITCHOVER_FAILED} indicates
         * terminal switchover failure.
         *
         * @param switchoverStatus the value to set
         * @return this builder
         */
        public Builder switchoverStatus(BlueGreenDeploymentSwitchoverStatus switchoverStatus) {
            this.switchoverStatus = switchoverStatus;
            this.__explicitlySet__.add("switchoverStatus");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** The time the deployment was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the deployment was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the deployment was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the deployment was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BlueGreenDeploymentSummary build() {
            BlueGreenDeploymentSummary model =
                    new BlueGreenDeploymentSummary(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.sourceDbSystemId,
                            this.targetDbSystemId,
                            this.activeDbSystemId,
                            this.switchoverStatus,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlueGreenDeploymentSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("sourceDbSystemId")) {
                this.sourceDbSystemId(model.getSourceDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("targetDbSystemId")) {
                this.targetDbSystemId(model.getTargetDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("activeDbSystemId")) {
                this.activeDbSystemId(model.getActiveDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("switchoverStatus")) {
                this.switchoverStatus(model.getSwitchoverStatus());
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
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * blue/green deployment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * blue/green deployment.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The display name of the blue/green deployment. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the blue/green deployment.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The current lifecycle state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
    /** The current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional lifecycle details. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional lifecycle details.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Blue/original source DB system
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * deployment pair.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDbSystemId")
    private final String sourceDbSystemId;

    /**
     * Blue/original source DB system
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * deployment pair.
     *
     * @return the value
     */
    public String getSourceDbSystemId() {
        return sourceDbSystemId;
    }

    /**
     * Green/target DB system
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * deployment pair.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbSystemId")
    private final String targetDbSystemId;

    /**
     * Green/target DB system
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) for the
     * deployment pair.
     *
     * @return the value
     */
    public String getTargetDbSystemId() {
        return targetDbSystemId;
    }

    /**
     * The DB system [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * that currently owns the client-facing VIP and serves traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("activeDbSystemId")
    private final String activeDbSystemId;

    /**
     * The DB system [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * that currently owns the client-facing VIP and serves traffic.
     *
     * @return the value
     */
    public String getActiveDbSystemId() {
        return activeDbSystemId;
    }

    /**
     * Stage of the most recent switchover workflow. {@code SWITCHOVER_FAILED} indicates terminal
     * switchover failure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("switchoverStatus")
    private final BlueGreenDeploymentSwitchoverStatus switchoverStatus;

    /**
     * Stage of the most recent switchover workflow. {@code SWITCHOVER_FAILED} indicates terminal
     * switchover failure.
     *
     * @return the value
     */
    public BlueGreenDeploymentSwitchoverStatus getSwitchoverStatus() {
        return switchoverStatus;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The time the deployment was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the deployment was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the deployment was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the deployment was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("BlueGreenDeploymentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", sourceDbSystemId=").append(String.valueOf(this.sourceDbSystemId));
        sb.append(", targetDbSystemId=").append(String.valueOf(this.targetDbSystemId));
        sb.append(", activeDbSystemId=").append(String.valueOf(this.activeDbSystemId));
        sb.append(", switchoverStatus=").append(String.valueOf(this.switchoverStatus));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BlueGreenDeploymentSummary)) {
            return false;
        }

        BlueGreenDeploymentSummary other = (BlueGreenDeploymentSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.sourceDbSystemId, other.sourceDbSystemId)
                && java.util.Objects.equals(this.targetDbSystemId, other.targetDbSystemId)
                && java.util.Objects.equals(this.activeDbSystemId, other.activeDbSystemId)
                && java.util.Objects.equals(this.switchoverStatus, other.switchoverStatus)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceDbSystemId == null ? 43 : this.sourceDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetDbSystemId == null ? 43 : this.targetDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.activeDbSystemId == null ? 43 : this.activeDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.switchoverStatus == null ? 43 : this.switchoverStatus.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
