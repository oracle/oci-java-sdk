/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the autoscale configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AutoScalingConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutoScalingConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "nodeType",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "policy",
        "policyDetails"
    })
    public AutoScalingConfiguration(
            String id,
            String displayName,
            Node.NodeType nodeType,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            AutoScalePolicy policy,
            AutoScalePolicyDetails policyDetails) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.nodeType = nodeType;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.policy = policy;
        this.policyDetails = policyDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier for the autoscale configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique identifier for the autoscale configuration.
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
         * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid
         * entering confidential information.
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
         * A node type that is managed by an autoscale configuration. The only supported types are
         * WORKER and COMPUTE_ONLY_WORKER.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private Node.NodeType nodeType;

        /**
         * A node type that is managed by an autoscale configuration. The only supported types are
         * WORKER and COMPUTE_ONLY_WORKER.
         *
         * @param nodeType the value to set
         * @return this builder
         */
        public Builder nodeType(Node.NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }
        /** The state of the autoscale configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the autoscale configuration.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The time the cluster was created, shown as an RFC 3339 formatted datetime string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
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
         * The time the autoscale configuration was updated, shown as an RFC 3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the autoscale configuration was updated, shown as an RFC 3339 formatted datetime
         * string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policy")
        private AutoScalePolicy policy;

        public Builder policy(AutoScalePolicy policy) {
            this.policy = policy;
            this.__explicitlySet__.add("policy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("policyDetails")
        private AutoScalePolicyDetails policyDetails;

        public Builder policyDetails(AutoScalePolicyDetails policyDetails) {
            this.policyDetails = policyDetails;
            this.__explicitlySet__.add("policyDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoScalingConfiguration build() {
            AutoScalingConfiguration model =
                    new AutoScalingConfiguration(
                            this.id,
                            this.displayName,
                            this.nodeType,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.policy,
                            this.policyDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScalingConfiguration model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nodeType")) {
                this.nodeType(model.getNodeType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("policy")) {
                this.policy(model.getPolicy());
            }
            if (model.wasPropertyExplicitlySet("policyDetails")) {
                this.policyDetails(model.getPolicyDetails());
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

    /** The unique identifier for the autoscale configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique identifier for the autoscale configuration.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. The name does not have to be unique, and it may be changed. Avoid
     * entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A node type that is managed by an autoscale configuration. The only supported types are
     * WORKER and COMPUTE_ONLY_WORKER.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final Node.NodeType nodeType;

    /**
     * A node type that is managed by an autoscale configuration. The only supported types are
     * WORKER and COMPUTE_ONLY_WORKER.
     *
     * @return the value
     */
    public Node.NodeType getNodeType() {
        return nodeType;
    }

    /** The state of the autoscale configuration. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
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
    /** The state of the autoscale configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the autoscale configuration.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The time the cluster was created, shown as an RFC 3339 formatted datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the cluster was created, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the autoscale configuration was updated, shown as an RFC 3339 formatted datetime
     * string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the autoscale configuration was updated, shown as an RFC 3339 formatted datetime
     * string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    private final AutoScalePolicy policy;

    public AutoScalePolicy getPolicy() {
        return policy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("policyDetails")
    private final AutoScalePolicyDetails policyDetails;

    public AutoScalePolicyDetails getPolicyDetails() {
        return policyDetails;
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
        sb.append("AutoScalingConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", policy=").append(String.valueOf(this.policy));
        sb.append(", policyDetails=").append(String.valueOf(this.policyDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScalingConfiguration)) {
            return false;
        }

        AutoScalingConfiguration other = (AutoScalingConfiguration) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nodeType, other.nodeType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.policy, other.policy)
                && java.util.Objects.equals(this.policyDetails, other.policyDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.policy == null ? 43 : this.policy.hashCode());
        result =
                (result * PRIME)
                        + (this.policyDetails == null ? 43 : this.policyDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
