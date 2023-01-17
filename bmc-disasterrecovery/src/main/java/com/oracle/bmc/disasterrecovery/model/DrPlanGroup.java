/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * Details of a plan group in a DR Plan.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrPlanGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DrPlanGroup extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "type", "displayName", "steps"})
    public DrPlanGroup(
            String id, DrPlanGroupType type, String displayName, java.util.List<DrPlanStep> steps) {
        super();
        this.id = id;
        this.type = type;
        this.displayName = displayName;
        this.steps = steps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique id of this group. Must not be modified by user.
         * <p>
         * Example: {@code sgid1.group..examplegroupsgid}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The unique id of this group. Must not be modified by user.
         * <p>
         * Example: {@code sgid1.group..examplegroupsgid}
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The plan group type.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private DrPlanGroupType type;

        /**
         * The plan group type.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(DrPlanGroupType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The display name of this DR Plan Group.
         * <p>
         * Example: {@code DATABASE_SWITCHOVER}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of this DR Plan Group.
         * <p>
         * Example: {@code DATABASE_SWITCHOVER}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The list of steps in this plan group.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("steps")
        private java.util.List<DrPlanStep> steps;

        /**
         * The list of steps in this plan group.
         *
         * @param steps the value to set
         * @return this builder
         **/
        public Builder steps(java.util.List<DrPlanStep> steps) {
            this.steps = steps;
            this.__explicitlySet__.add("steps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrPlanGroup build() {
            DrPlanGroup model = new DrPlanGroup(this.id, this.type, this.displayName, this.steps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrPlanGroup model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("steps")) {
                this.steps(model.getSteps());
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
     * The unique id of this group. Must not be modified by user.
     * <p>
     * Example: {@code sgid1.group..examplegroupsgid}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The unique id of this group. Must not be modified by user.
     * <p>
     * Example: {@code sgid1.group..examplegroupsgid}
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The plan group type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final DrPlanGroupType type;

    /**
     * The plan group type.
     *
     * @return the value
     **/
    public DrPlanGroupType getType() {
        return type;
    }

    /**
     * The display name of this DR Plan Group.
     * <p>
     * Example: {@code DATABASE_SWITCHOVER}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of this DR Plan Group.
     * <p>
     * Example: {@code DATABASE_SWITCHOVER}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The list of steps in this plan group.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("steps")
    private final java.util.List<DrPlanStep> steps;

    /**
     * The list of steps in this plan group.
     *
     * @return the value
     **/
    public java.util.List<DrPlanStep> getSteps() {
        return steps;
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
        sb.append("DrPlanGroup(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", steps=").append(String.valueOf(this.steps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrPlanGroup)) {
            return false;
        }

        DrPlanGroup other = (DrPlanGroup) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.steps, other.steps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.steps == null ? 43 : this.steps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
