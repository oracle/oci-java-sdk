/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * This contains configuration for direct data access. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DirectDataAccessDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DirectDataAccessDetails extends ConfigureIotDomainDataAccessDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of IAM groups of form described in
         * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
         * that are allowed to directly connect to the data host.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbAllowListedIdentityGroupNames")
        private java.util.List<String> dbAllowListedIdentityGroupNames;

        /**
         * List of IAM groups of form described in
         * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
         * that are allowed to directly connect to the data host.
         *
         * @param dbAllowListedIdentityGroupNames the value to set
         * @return this builder
         */
        public Builder dbAllowListedIdentityGroupNames(
                java.util.List<String> dbAllowListedIdentityGroupNames) {
            this.dbAllowListedIdentityGroupNames = dbAllowListedIdentityGroupNames;
            this.__explicitlySet__.add("dbAllowListedIdentityGroupNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DirectDataAccessDetails build() {
            DirectDataAccessDetails model =
                    new DirectDataAccessDetails(this.dbAllowListedIdentityGroupNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DirectDataAccessDetails model) {
            if (model.wasPropertyExplicitlySet("dbAllowListedIdentityGroupNames")) {
                this.dbAllowListedIdentityGroupNames(model.getDbAllowListedIdentityGroupNames());
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

    @Deprecated
    public DirectDataAccessDetails(java.util.List<String> dbAllowListedIdentityGroupNames) {
        super();
        this.dbAllowListedIdentityGroupNames = dbAllowListedIdentityGroupNames;
    }

    /**
     * List of IAM groups of form described in
     * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
     * that are allowed to directly connect to the data host.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbAllowListedIdentityGroupNames")
    private final java.util.List<String> dbAllowListedIdentityGroupNames;

    /**
     * List of IAM groups of form described in
     * [here](https://docs.oracle.com/en/cloud/paas/autonomous-database/dedicated/mnqmn/#GUID-3634D6C9-A7F1-4875-9925-BAEA2D3C5197)
     * that are allowed to directly connect to the data host.
     *
     * @return the value
     */
    public java.util.List<String> getDbAllowListedIdentityGroupNames() {
        return dbAllowListedIdentityGroupNames;
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
        sb.append("DirectDataAccessDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbAllowListedIdentityGroupNames=")
                .append(String.valueOf(this.dbAllowListedIdentityGroupNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DirectDataAccessDetails)) {
            return false;
        }

        DirectDataAccessDetails other = (DirectDataAccessDetails) o;
        return java.util.Objects.equals(
                        this.dbAllowListedIdentityGroupNames, other.dbAllowListedIdentityGroupNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.dbAllowListedIdentityGroupNames == null
                                ? 43
                                : this.dbAllowListedIdentityGroupNames.hashCode());
        return result;
    }
}
