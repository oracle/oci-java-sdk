/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * The validation response returned when checking whether the requested user is valid.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ValidationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ValidationResponse extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isValidUser", "writePermittedUserGroupInfos"})
    public ValidationResponse(
            Boolean isValidUser, java.util.List<CmosUserGroupInfo> writePermittedUserGroupInfos) {
        super();
        this.isValidUser = isValidUser;
        this.writePermittedUserGroupInfos = writePermittedUserGroupInfos;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Boolean value that indicates whether the requested user is valid.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isValidUser")
        private Boolean isValidUser;

        /**
         * Boolean value that indicates whether the requested user is valid.
         * @param isValidUser the value to set
         * @return this builder
         **/
        public Builder isValidUser(Boolean isValidUser) {
            this.isValidUser = isValidUser;
            this.__explicitlySet__.add("isValidUser");
            return this;
        }
        /**
         * Technical support type ({@code TECH}) only: Identifier and name of the support request's user group ({@code userGroupId} and {@code userGroupName}).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("writePermittedUserGroupInfos")
        private java.util.List<CmosUserGroupInfo> writePermittedUserGroupInfos;

        /**
         * Technical support type ({@code TECH}) only: Identifier and name of the support request's user group ({@code userGroupId} and {@code userGroupName}).
         *
         * @param writePermittedUserGroupInfos the value to set
         * @return this builder
         **/
        public Builder writePermittedUserGroupInfos(
                java.util.List<CmosUserGroupInfo> writePermittedUserGroupInfos) {
            this.writePermittedUserGroupInfos = writePermittedUserGroupInfos;
            this.__explicitlySet__.add("writePermittedUserGroupInfos");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ValidationResponse build() {
            ValidationResponse model =
                    new ValidationResponse(this.isValidUser, this.writePermittedUserGroupInfos);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ValidationResponse model) {
            if (model.wasPropertyExplicitlySet("isValidUser")) {
                this.isValidUser(model.getIsValidUser());
            }
            if (model.wasPropertyExplicitlySet("writePermittedUserGroupInfos")) {
                this.writePermittedUserGroupInfos(model.getWritePermittedUserGroupInfos());
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
     * Boolean value that indicates whether the requested user is valid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isValidUser")
    private final Boolean isValidUser;

    /**
     * Boolean value that indicates whether the requested user is valid.
     * @return the value
     **/
    public Boolean getIsValidUser() {
        return isValidUser;
    }

    /**
     * Technical support type ({@code TECH}) only: Identifier and name of the support request's user group ({@code userGroupId} and {@code userGroupName}).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writePermittedUserGroupInfos")
    private final java.util.List<CmosUserGroupInfo> writePermittedUserGroupInfos;

    /**
     * Technical support type ({@code TECH}) only: Identifier and name of the support request's user group ({@code userGroupId} and {@code userGroupName}).
     *
     * @return the value
     **/
    public java.util.List<CmosUserGroupInfo> getWritePermittedUserGroupInfos() {
        return writePermittedUserGroupInfos;
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
        sb.append("ValidationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("isValidUser=").append(String.valueOf(this.isValidUser));
        sb.append(", writePermittedUserGroupInfos=")
                .append(String.valueOf(this.writePermittedUserGroupInfos));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidationResponse)) {
            return false;
        }

        ValidationResponse other = (ValidationResponse) o;
        return java.util.Objects.equals(this.isValidUser, other.isValidUser)
                && java.util.Objects.equals(
                        this.writePermittedUserGroupInfos, other.writePermittedUserGroupInfos)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isValidUser == null ? 43 : this.isValidUser.hashCode());
        result =
                (result * PRIME)
                        + (this.writePermittedUserGroupInfos == null
                                ? 43
                                : this.writePermittedUserGroupInfos.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
