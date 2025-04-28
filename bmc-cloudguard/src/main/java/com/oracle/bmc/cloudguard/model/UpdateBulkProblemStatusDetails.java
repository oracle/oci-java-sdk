/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * List of problem IDs to be passed in to update problem status. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateBulkProblemStatusDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBulkProblemStatusDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "problemIds", "comment"})
    public UpdateBulkProblemStatusDetails(
            ProblemLifecycleDetail status, java.util.List<String> problemIds, String comment) {
        super();
        this.status = status;
        this.problemIds = problemIds;
        this.comment = comment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Action taken by user */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ProblemLifecycleDetail status;

        /**
         * Action taken by user
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(ProblemLifecycleDetail status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** List of problem IDs to be passed in to update the problem status */
        @com.fasterxml.jackson.annotation.JsonProperty("problemIds")
        private java.util.List<String> problemIds;

        /**
         * List of problem IDs to be passed in to update the problem status
         *
         * @param problemIds the value to set
         * @return this builder
         */
        public Builder problemIds(java.util.List<String> problemIds) {
            this.problemIds = problemIds;
            this.__explicitlySet__.add("problemIds");
            return this;
        }
        /** User-defined comment to be passed in to update the problem */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * User-defined comment to be passed in to update the problem
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBulkProblemStatusDetails build() {
            UpdateBulkProblemStatusDetails model =
                    new UpdateBulkProblemStatusDetails(this.status, this.problemIds, this.comment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBulkProblemStatusDetails model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("problemIds")) {
                this.problemIds(model.getProblemIds());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
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

    /** Action taken by user */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ProblemLifecycleDetail status;

    /**
     * Action taken by user
     *
     * @return the value
     */
    public ProblemLifecycleDetail getStatus() {
        return status;
    }

    /** List of problem IDs to be passed in to update the problem status */
    @com.fasterxml.jackson.annotation.JsonProperty("problemIds")
    private final java.util.List<String> problemIds;

    /**
     * List of problem IDs to be passed in to update the problem status
     *
     * @return the value
     */
    public java.util.List<String> getProblemIds() {
        return problemIds;
    }

    /** User-defined comment to be passed in to update the problem */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * User-defined comment to be passed in to update the problem
     *
     * @return the value
     */
    public String getComment() {
        return comment;
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
        sb.append("UpdateBulkProblemStatusDetails(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", problemIds=").append(String.valueOf(this.problemIds));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBulkProblemStatusDetails)) {
            return false;
        }

        UpdateBulkProblemStatusDetails other = (UpdateBulkProblemStatusDetails) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.problemIds, other.problemIds)
                && java.util.Objects.equals(this.comment, other.comment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.problemIds == null ? 43 : this.problemIds.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
