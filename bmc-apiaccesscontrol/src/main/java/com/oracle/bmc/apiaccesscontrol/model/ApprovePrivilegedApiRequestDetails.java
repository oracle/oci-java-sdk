/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiaccesscontrol.model;

/**
 * Details of the privilegedApi request approval such as when the approver approved and any comment
 * provided by the approver. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApprovePrivilegedApiRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApprovePrivilegedApiRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"approverComment", "timeOfUserCreation"})
    public ApprovePrivilegedApiRequestDetails(
            String approverComment, java.util.Date timeOfUserCreation) {
        super();
        this.approverComment = approverComment;
        this.timeOfUserCreation = timeOfUserCreation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Comment by the approver during approval. */
        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        /**
         * Comment by the approver during approval.
         *
         * @param approverComment the value to set
         * @return this builder
         */
        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }
        /**
         * The time when access request is scheduled to be approved in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
        private java.util.Date timeOfUserCreation;

        /**
         * The time when access request is scheduled to be approved in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfUserCreation the value to set
         * @return this builder
         */
        public Builder timeOfUserCreation(java.util.Date timeOfUserCreation) {
            this.timeOfUserCreation = timeOfUserCreation;
            this.__explicitlySet__.add("timeOfUserCreation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApprovePrivilegedApiRequestDetails build() {
            ApprovePrivilegedApiRequestDetails model =
                    new ApprovePrivilegedApiRequestDetails(
                            this.approverComment, this.timeOfUserCreation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApprovePrivilegedApiRequestDetails model) {
            if (model.wasPropertyExplicitlySet("approverComment")) {
                this.approverComment(model.getApproverComment());
            }
            if (model.wasPropertyExplicitlySet("timeOfUserCreation")) {
                this.timeOfUserCreation(model.getTimeOfUserCreation());
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

    /** Comment by the approver during approval. */
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    private final String approverComment;

    /**
     * Comment by the approver during approval.
     *
     * @return the value
     */
    public String getApproverComment() {
        return approverComment;
    }

    /**
     * The time when access request is scheduled to be approved in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
    private final java.util.Date timeOfUserCreation;

    /**
     * The time when access request is scheduled to be approved in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfUserCreation() {
        return timeOfUserCreation;
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
        sb.append("ApprovePrivilegedApiRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("approverComment=").append(String.valueOf(this.approverComment));
        sb.append(", timeOfUserCreation=").append(String.valueOf(this.timeOfUserCreation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApprovePrivilegedApiRequestDetails)) {
            return false;
        }

        ApprovePrivilegedApiRequestDetails other = (ApprovePrivilegedApiRequestDetails) o;
        return java.util.Objects.equals(this.approverComment, other.approverComment)
                && java.util.Objects.equals(this.timeOfUserCreation, other.timeOfUserCreation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.approverComment == null ? 43 : this.approverComment.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfUserCreation == null
                                ? 43
                                : this.timeOfUserCreation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
