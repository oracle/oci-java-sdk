/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Groups using the configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = GroupAssociationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GroupAssociationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"groupList"})
    public GroupAssociationDetails(java.util.List<String> groupList) {
        super();
        this.groupList = groupList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * list of group/dynamic group ids associated with this configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupList")
        private java.util.List<String> groupList;

        /**
         * list of group/dynamic group ids associated with this configuration.
         * @param groupList the value to set
         * @return this builder
         **/
        public Builder groupList(java.util.List<String> groupList) {
            this.groupList = groupList;
            this.__explicitlySet__.add("groupList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupAssociationDetails build() {
            GroupAssociationDetails model = new GroupAssociationDetails(this.groupList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupAssociationDetails model) {
            if (model.wasPropertyExplicitlySet("groupList")) {
                this.groupList(model.getGroupList());
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
     * list of group/dynamic group ids associated with this configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupList")
    private final java.util.List<String> groupList;

    /**
     * list of group/dynamic group ids associated with this configuration.
     * @return the value
     **/
    public java.util.List<String> getGroupList() {
        return groupList;
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
        sb.append("GroupAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("groupList=").append(String.valueOf(this.groupList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupAssociationDetails)) {
            return false;
        }

        GroupAssociationDetails other = (GroupAssociationDetails) o;
        return java.util.Objects.equals(this.groupList, other.groupList) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.groupList == null ? 43 : this.groupList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
