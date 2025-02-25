/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Describes a security group.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GroupIdentifier.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GroupIdentifier extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupKey", "groupName"})
    public GroupIdentifier(String groupKey, String groupName) {
        super();
        this.groupKey = groupKey;
        this.groupName = groupName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the security group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupKey")
        private String groupKey;

        /**
         * The ID of the security group.
         * @param groupKey the value to set
         * @return this builder
         **/
        public Builder groupKey(String groupKey) {
            this.groupKey = groupKey;
            this.__explicitlySet__.add("groupKey");
            return this;
        }
        /**
         * The name of the security group.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupName")
        private String groupName;

        /**
         * The name of the security group.
         * @param groupName the value to set
         * @return this builder
         **/
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            this.__explicitlySet__.add("groupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupIdentifier build() {
            GroupIdentifier model = new GroupIdentifier(this.groupKey, this.groupName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupIdentifier model) {
            if (model.wasPropertyExplicitlySet("groupKey")) {
                this.groupKey(model.getGroupKey());
            }
            if (model.wasPropertyExplicitlySet("groupName")) {
                this.groupName(model.getGroupName());
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
     * The ID of the security group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupKey")
    private final String groupKey;

    /**
     * The ID of the security group.
     * @return the value
     **/
    public String getGroupKey() {
        return groupKey;
    }

    /**
     * The name of the security group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupName")
    private final String groupName;

    /**
     * The name of the security group.
     * @return the value
     **/
    public String getGroupName() {
        return groupName;
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
        sb.append("GroupIdentifier(");
        sb.append("super=").append(super.toString());
        sb.append("groupKey=").append(String.valueOf(this.groupKey));
        sb.append(", groupName=").append(String.valueOf(this.groupName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupIdentifier)) {
            return false;
        }

        GroupIdentifier other = (GroupIdentifier) o;
        return java.util.Objects.equals(this.groupKey, other.groupKey)
                && java.util.Objects.equals(this.groupName, other.groupName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupKey == null ? 43 : this.groupKey.hashCode());
        result = (result * PRIME) + (this.groupName == null ? 43 : this.groupName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
