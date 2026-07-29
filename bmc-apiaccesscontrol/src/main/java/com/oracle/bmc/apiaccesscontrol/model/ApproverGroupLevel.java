/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/**
 * It represents the group level detail for authorization
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApproverGroupLevel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApproverGroupLevel extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupId", "groupLevel"})
    public ApproverGroupLevel(java.util.List<String> groupId, Integer groupLevel) {
        super();
        this.groupId = groupId;
        this.groupLevel = groupLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * id of the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private java.util.List<String> groupId;

        /**
         * id of the group.
         * @param groupId the value to set
         * @return this builder
         **/
        public Builder groupId(java.util.List<String> groupId) {
            this.groupId = groupId;
            this.__explicitlySet__.add("groupId");
            return this;
        }
        /**
         * level of the group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupLevel")
        private Integer groupLevel;

        /**
         * level of the group.
         * @param groupLevel the value to set
         * @return this builder
         **/
        public Builder groupLevel(Integer groupLevel) {
            this.groupLevel = groupLevel;
            this.__explicitlySet__.add("groupLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproverGroupLevel build() {
            ApproverGroupLevel model = new ApproverGroupLevel(this.groupId, this.groupLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproverGroupLevel model) {
            if (model.wasPropertyExplicitlySet("groupId")) {
                this.groupId(model.getGroupId());
            }
            if (model.wasPropertyExplicitlySet("groupLevel")) {
                this.groupLevel(model.getGroupLevel());
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
     * id of the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    private final java.util.List<String> groupId;

    /**
     * id of the group.
     * @return the value
     **/
    public java.util.List<String> getGroupId() {
        return groupId;
    }

    /**
     * level of the group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupLevel")
    private final Integer groupLevel;

    /**
     * level of the group.
     * @return the value
     **/
    public Integer getGroupLevel() {
        return groupLevel;
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
        sb.append("ApproverGroupLevel(");
        sb.append("super=").append(super.toString());
        sb.append("groupId=").append(String.valueOf(this.groupId));
        sb.append(", groupLevel=").append(String.valueOf(this.groupLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproverGroupLevel)) {
            return false;
        }

        ApproverGroupLevel other = (ApproverGroupLevel) o;
        return java.util.Objects.equals(this.groupId, other.groupId)
                && java.util.Objects.equals(this.groupLevel, other.groupLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupId == null ? 43 : this.groupId.hashCode());
        result = (result * PRIME) + (this.groupLevel == null ? 43 : this.groupLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
