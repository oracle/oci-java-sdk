/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Object containing summary of Commit Analytics author. <br>
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
        builder = CommitAnalyticsAuthorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CommitAnalyticsAuthorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"authorName", "authorEmail"})
    public CommitAnalyticsAuthorSummary(String authorName, String authorEmail) {
        super();
        this.authorName = authorName;
        this.authorEmail = authorEmail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Author name. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorName")
        private String authorName;

        /**
         * Author name.
         *
         * @param authorName the value to set
         * @return this builder
         */
        public Builder authorName(String authorName) {
            this.authorName = authorName;
            this.__explicitlySet__.add("authorName");
            return this;
        }
        /** Author email. */
        @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
        private String authorEmail;

        /**
         * Author email.
         *
         * @param authorEmail the value to set
         * @return this builder
         */
        public Builder authorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            this.__explicitlySet__.add("authorEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitAnalyticsAuthorSummary build() {
            CommitAnalyticsAuthorSummary model =
                    new CommitAnalyticsAuthorSummary(this.authorName, this.authorEmail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitAnalyticsAuthorSummary model) {
            if (model.wasPropertyExplicitlySet("authorName")) {
                this.authorName(model.getAuthorName());
            }
            if (model.wasPropertyExplicitlySet("authorEmail")) {
                this.authorEmail(model.getAuthorEmail());
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

    /** Author name. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorName")
    private final String authorName;

    /**
     * Author name.
     *
     * @return the value
     */
    public String getAuthorName() {
        return authorName;
    }

    /** Author email. */
    @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
    private final String authorEmail;

    /**
     * Author email.
     *
     * @return the value
     */
    public String getAuthorEmail() {
        return authorEmail;
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
        sb.append("CommitAnalyticsAuthorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("authorName=").append(String.valueOf(this.authorName));
        sb.append(", authorEmail=").append(String.valueOf(this.authorEmail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitAnalyticsAuthorSummary)) {
            return false;
        }

        CommitAnalyticsAuthorSummary other = (CommitAnalyticsAuthorSummary) o;
        return java.util.Objects.equals(this.authorName, other.authorName)
                && java.util.Objects.equals(this.authorEmail, other.authorEmail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.authorName == null ? 43 : this.authorName.hashCode());
        result = (result * PRIME) + (this.authorEmail == null ? 43 : this.authorEmail.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
