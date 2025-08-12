/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Information to create a protected branch <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateOrUpdateProtectedBranchDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOrUpdateProtectedBranchDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"branchName", "protectionLevels"})
    public CreateOrUpdateProtectedBranchDetails(
            String branchName, java.util.List<ProtectionLevel> protectionLevels) {
        super();
        this.branchName = branchName;
        this.protectionLevels = protectionLevels;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The branchName can either be exact branch name or branch pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("branchName")
        private String branchName;

        /**
         * The branchName can either be exact branch name or branch pattern.
         *
         * @param branchName the value to set
         * @return this builder
         */
        public Builder branchName(String branchName) {
            this.branchName = branchName;
            this.__explicitlySet__.add("branchName");
            return this;
        }
        /** Level of protection to add on a branch. */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionLevels")
        private java.util.List<ProtectionLevel> protectionLevels;

        /**
         * Level of protection to add on a branch.
         *
         * @param protectionLevels the value to set
         * @return this builder
         */
        public Builder protectionLevels(java.util.List<ProtectionLevel> protectionLevels) {
            this.protectionLevels = protectionLevels;
            this.__explicitlySet__.add("protectionLevels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOrUpdateProtectedBranchDetails build() {
            CreateOrUpdateProtectedBranchDetails model =
                    new CreateOrUpdateProtectedBranchDetails(
                            this.branchName, this.protectionLevels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOrUpdateProtectedBranchDetails model) {
            if (model.wasPropertyExplicitlySet("branchName")) {
                this.branchName(model.getBranchName());
            }
            if (model.wasPropertyExplicitlySet("protectionLevels")) {
                this.protectionLevels(model.getProtectionLevels());
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

    /** The branchName can either be exact branch name or branch pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("branchName")
    private final String branchName;

    /**
     * The branchName can either be exact branch name or branch pattern.
     *
     * @return the value
     */
    public String getBranchName() {
        return branchName;
    }

    /** Level of protection to add on a branch. */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionLevels")
    private final java.util.List<ProtectionLevel> protectionLevels;

    /**
     * Level of protection to add on a branch.
     *
     * @return the value
     */
    public java.util.List<ProtectionLevel> getProtectionLevels() {
        return protectionLevels;
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
        sb.append("CreateOrUpdateProtectedBranchDetails(");
        sb.append("super=").append(super.toString());
        sb.append("branchName=").append(String.valueOf(this.branchName));
        sb.append(", protectionLevels=").append(String.valueOf(this.protectionLevels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOrUpdateProtectedBranchDetails)) {
            return false;
        }

        CreateOrUpdateProtectedBranchDetails other = (CreateOrUpdateProtectedBranchDetails) o;
        return java.util.Objects.equals(this.branchName, other.branchName)
                && java.util.Objects.equals(this.protectionLevels, other.protectionLevels)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.branchName == null ? 43 : this.branchName.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionLevels == null ? 43 : this.protectionLevels.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
