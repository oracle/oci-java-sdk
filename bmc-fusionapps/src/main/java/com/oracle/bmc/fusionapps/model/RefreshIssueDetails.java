/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Details of refresh failure or validation failure that needs to be investigated.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RefreshIssueDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RefreshIssueDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"refreshIssues"})
    public RefreshIssueDetails(String refreshIssues) {
        super();
        this.refreshIssues = refreshIssues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Detail reasons of refresh failure or validation failure that needs to be shown to customer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refreshIssues")
        private String refreshIssues;

        /**
         * Detail reasons of refresh failure or validation failure that needs to be shown to customer.
         * @param refreshIssues the value to set
         * @return this builder
         **/
        public Builder refreshIssues(String refreshIssues) {
            this.refreshIssues = refreshIssues;
            this.__explicitlySet__.add("refreshIssues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RefreshIssueDetails build() {
            RefreshIssueDetails model = new RefreshIssueDetails(this.refreshIssues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RefreshIssueDetails model) {
            if (model.wasPropertyExplicitlySet("refreshIssues")) {
                this.refreshIssues(model.getRefreshIssues());
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
     * Detail reasons of refresh failure or validation failure that needs to be shown to customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refreshIssues")
    private final String refreshIssues;

    /**
     * Detail reasons of refresh failure or validation failure that needs to be shown to customer.
     * @return the value
     **/
    public String getRefreshIssues() {
        return refreshIssues;
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
        sb.append("RefreshIssueDetails(");
        sb.append("super=").append(super.toString());
        sb.append("refreshIssues=").append(String.valueOf(this.refreshIssues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RefreshIssueDetails)) {
            return false;
        }

        RefreshIssueDetails other = (RefreshIssueDetails) o;
        return java.util.Objects.equals(this.refreshIssues, other.refreshIssues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.refreshIssues == null ? 43 : this.refreshIssues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
