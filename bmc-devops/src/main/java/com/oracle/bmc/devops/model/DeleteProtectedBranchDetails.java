/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Information to delete a protected branch
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DeleteProtectedBranchDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DeleteProtectedBranchDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"branchName"})
    public DeleteProtectedBranchDetails(String branchName) {
        super();
        this.branchName = branchName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of a protected branch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        /**
         * Name of a protected branch.
         * @param branchName the value to set
         * @return this builder
         **/
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeleteProtectedBranchDetails build() {
            DeleteProtectedBranchDetails model = new DeleteProtectedBranchDetails(this.branchName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeleteProtectedBranchDetails model) {
            if (model.wasPropertyExplicitlySet("branchName")) {
                this.branchName(model.getBranchName());
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
     * Name of a protected branch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

    /**
     * Name of a protected branch.
     * @return the value
     **/
    public String getBranchName() {
        return branchName;
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
        sb.append("DeleteProtectedBranchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("branchName=").append(String.valueOf(this.branchName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeleteProtectedBranchDetails)) {
            return false;
        }

        DeleteProtectedBranchDetails other = (DeleteProtectedBranchDetails) o;
        return java.util.Objects.equals(this.branchName, other.branchName) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
