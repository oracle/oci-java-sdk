/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Workflow Group Layout. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkflowGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkflowGroup extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupName", "type", "steps"})
    public WorkflowGroup(String groupName, Type type, java.util.List<WorkflowComponent> steps) {
        super();
        this.groupName = groupName;
        this.type = type;
        this.steps = steps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Provide the name of the group. */
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * Provide the name of the group.
         *
         * @param groupName the value to set
         * @return this builder
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }
        /** Workflow Group Details. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Workflow Group Details.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Steps within the Group. */
        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<WorkflowComponent> steps;

        /**
         * Steps within the Group.
         *
         * @param steps the value to set
         * @return this builder
         */
        public Builder steps(java.util.List<WorkflowComponent> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkflowGroup build() {
            WorkflowGroup model = new WorkflowGroup(this.groupName, this.type, this.steps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkflowGroup model) {
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("steps")) {
                this.steps(model.getSteps());
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

    /** Provide the name of the group. */
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * Provide the name of the group.
     *
     * @return the value
     */
    public String getGroupName() {
        return groupName;
    }

    /** Workflow Group Details. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        ParallelResourceGroup("PARALLEL_RESOURCE_GROUP"),
        RollingResourceGroup("ROLLING_RESOURCE_GROUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Workflow Group Details. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Workflow Group Details.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Steps within the Group. */
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<WorkflowComponent> steps;

    /**
     * Steps within the Group.
     *
     * @return the value
     */
    public java.util.List<WorkflowComponent> getSteps() {
        return steps;
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
        sb.append("WorkflowGroup(");
        sb.append("super=").append(super.toString());
        sb.append("groupName=").append(String.valueOf(this.groupName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkflowGroup)) {
            return false;
        }

        WorkflowGroup other = (WorkflowGroup) o;
        return java.util.Objects.equals(this.groupName, other.groupName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.steps, other.steps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.steps == null ? 43 : this.steps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
