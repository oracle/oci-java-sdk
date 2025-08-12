/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Identifier and name of a user group ({@code userGroupId} and {@code userGroupName}) that the
 * current user has access to. Note: The Customer User Administrator (CUA) can manage user groups by
 * name using [My Oracle Cloud Support portal](https://support.oracle.com). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CmosUserGroupInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CmosUserGroupInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"userGroupId", "userGroupName"})
    public CmosUserGroupInfo(String userGroupId, String userGroupName) {
        super();
        this.userGroupId = userGroupId;
        this.userGroupName = userGroupName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Technical support type ({@code TECH}) only: The identifier of a user group in My Oracle
         * Cloud Support portal.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
        private String userGroupId;

        /**
         * Technical support type ({@code TECH}) only: The identifier of a user group in My Oracle
         * Cloud Support portal.
         *
         * @param userGroupId the value to set
         * @return this builder
         */
        public Builder userGroupId(String userGroupId) {
            this.userGroupId = userGroupId;
            this.__explicitlySet__.add("userGroupId");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: Name of a user group in My Oracle Cloud
         * Support portal.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userGroupName")
        private String userGroupName;

        /**
         * Technical support type ({@code TECH}) only: Name of a user group in My Oracle Cloud
         * Support portal.
         *
         * @param userGroupName the value to set
         * @return this builder
         */
        public Builder userGroupName(String userGroupName) {
            this.userGroupName = userGroupName;
            this.__explicitlySet__.add("userGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CmosUserGroupInfo build() {
            CmosUserGroupInfo model = new CmosUserGroupInfo(this.userGroupId, this.userGroupName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CmosUserGroupInfo model) {
            if (model.wasPropertyExplicitlySet("userGroupId")) {
                this.userGroupId(model.getUserGroupId());
            }
            if (model.wasPropertyExplicitlySet("userGroupName")) {
                this.userGroupName(model.getUserGroupName());
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
     * Technical support type ({@code TECH}) only: The identifier of a user group in My Oracle Cloud
     * Support portal.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userGroupId")
    private final String userGroupId;

    /**
     * Technical support type ({@code TECH}) only: The identifier of a user group in My Oracle Cloud
     * Support portal.
     *
     * @return the value
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    /**
     * Technical support type ({@code TECH}) only: Name of a user group in My Oracle Cloud Support
     * portal.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userGroupName")
    private final String userGroupName;

    /**
     * Technical support type ({@code TECH}) only: Name of a user group in My Oracle Cloud Support
     * portal.
     *
     * @return the value
     */
    public String getUserGroupName() {
        return userGroupName;
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
        sb.append("CmosUserGroupInfo(");
        sb.append("super=").append(super.toString());
        sb.append("userGroupId=").append(String.valueOf(this.userGroupId));
        sb.append(", userGroupName=").append(String.valueOf(this.userGroupName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CmosUserGroupInfo)) {
            return false;
        }

        CmosUserGroupInfo other = (CmosUserGroupInfo) o;
        return java.util.Objects.equals(this.userGroupId, other.userGroupId)
                && java.util.Objects.equals(this.userGroupName, other.userGroupName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userGroupId == null ? 43 : this.userGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.userGroupName == null ? 43 : this.userGroupName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
