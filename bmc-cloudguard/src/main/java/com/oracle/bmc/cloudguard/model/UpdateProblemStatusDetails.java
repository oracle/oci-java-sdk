/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The additional details to be updated for the problem.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateProblemStatusDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateProblemStatusDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"status", "comment"})
    public UpdateProblemStatusDetails(ProblemLifecycleDetail status, String comment) {
        super();
        this.status = status;
        this.comment = comment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Action taken by user
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ProblemLifecycleDetail status;

        /**
         * Action taken by user
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(ProblemLifecycleDetail status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * User comments
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * User comments
         * @param comment the value to set
         * @return this builder
         **/
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateProblemStatusDetails build() {
            UpdateProblemStatusDetails model =
                    new UpdateProblemStatusDetails(this.status, this.comment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateProblemStatusDetails model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
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
     * Action taken by user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final ProblemLifecycleDetail status;

    /**
     * Action taken by user
     * @return the value
     **/
    public ProblemLifecycleDetail getStatus() {
        return status;
    }

    /**
     * User comments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * User comments
     * @return the value
     **/
    public String getComment() {
        return comment;
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
        sb.append("UpdateProblemStatusDetails(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateProblemStatusDetails)) {
            return false;
        }

        UpdateProblemStatusDetails other = (UpdateProblemStatusDetails) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.comment, other.comment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
