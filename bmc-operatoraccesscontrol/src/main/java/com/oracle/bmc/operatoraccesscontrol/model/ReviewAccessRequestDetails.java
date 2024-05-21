/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details to mark access request in review.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReviewAccessRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReviewAccessRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"approverComment"})
    public ReviewAccessRequestDetails(String approverComment) {
        super();
        this.approverComment = approverComment;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Comment by the approver explaining that the access request is in review.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        /**
         * Comment by the approver explaining that the access request is in review.
         * @param approverComment the value to set
         * @return this builder
         **/
        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReviewAccessRequestDetails build() {
            ReviewAccessRequestDetails model = new ReviewAccessRequestDetails(this.approverComment);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReviewAccessRequestDetails model) {
            if (model.wasPropertyExplicitlySet("approverComment")) {
                this.approverComment(model.getApproverComment());
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
     * Comment by the approver explaining that the access request is in review.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    private final String approverComment;

    /**
     * Comment by the approver explaining that the access request is in review.
     * @return the value
     **/
    public String getApproverComment() {
        return approverComment;
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
        sb.append("ReviewAccessRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("approverComment=").append(String.valueOf(this.approverComment));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReviewAccessRequestDetails)) {
            return false;
        }

        ReviewAccessRequestDetails other = (ReviewAccessRequestDetails) o;
        return java.util.Objects.equals(this.approverComment, other.approverComment)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.approverComment == null ? 43 : this.approverComment.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
