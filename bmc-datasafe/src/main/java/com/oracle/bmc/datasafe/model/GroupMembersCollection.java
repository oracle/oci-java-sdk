/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The criteria for displaying the members of a target database group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GroupMembersCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GroupMembersCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"targetDatabases"})
    public GroupMembersCollection(java.util.List<String> targetDatabases) {
        super();
        this.targetDatabases = targetDatabases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of the OCIDs of the target databases which are members of the target database group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDatabases")
        private java.util.List<String> targetDatabases;

        /**
         * List of the OCIDs of the target databases which are members of the target database group.
         *
         * @param targetDatabases the value to set
         * @return this builder
         */
        public Builder targetDatabases(java.util.List<String> targetDatabases) {
            this.targetDatabases = targetDatabases;
            this.__explicitlySet__.add("targetDatabases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroupMembersCollection build() {
            GroupMembersCollection model = new GroupMembersCollection(this.targetDatabases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroupMembersCollection model) {
            if (model.wasPropertyExplicitlySet("targetDatabases")) {
                this.targetDatabases(model.getTargetDatabases());
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

    /** List of the OCIDs of the target databases which are members of the target database group. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDatabases")
    private final java.util.List<String> targetDatabases;

    /**
     * List of the OCIDs of the target databases which are members of the target database group.
     *
     * @return the value
     */
    public java.util.List<String> getTargetDatabases() {
        return targetDatabases;
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
        sb.append("GroupMembersCollection(");
        sb.append("super=").append(super.toString());
        sb.append("targetDatabases=").append(String.valueOf(this.targetDatabases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupMembersCollection)) {
            return false;
        }

        GroupMembersCollection other = (GroupMembersCollection) o;
        return java.util.Objects.equals(this.targetDatabases, other.targetDatabases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.targetDatabases == null ? 43 : this.targetDatabases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
