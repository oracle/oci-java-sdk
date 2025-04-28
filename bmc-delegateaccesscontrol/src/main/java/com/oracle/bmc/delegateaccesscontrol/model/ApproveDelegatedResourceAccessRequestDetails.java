/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Details of the Delegated Resource Access Request approval. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApproveDelegatedResourceAccessRequestDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApproveDelegatedResourceAccessRequestDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "approverComment",
        "additionalMessage",
        "timeApprovedForAccess"
    })
    public ApproveDelegatedResourceAccessRequestDetails(
            String approverComment,
            String additionalMessage,
            java.util.Date timeApprovedForAccess) {
        super();
        this.approverComment = approverComment;
        this.additionalMessage = additionalMessage;
        this.timeApprovedForAccess = timeApprovedForAccess;
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
        /** Message that needs to be displayed to the operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalMessage")
        private String additionalMessage;

        /**
         * Message that needs to be displayed to the operator.
         *
         * @param additionalMessage the value to set
         * @return this builder
         */
        public Builder additionalMessage(String additionalMessage) {
            this.additionalMessage = additionalMessage;
            this.__explicitlySet__.add("additionalMessage");
            return this;
        }
        /**
         * Access start time that is actually approved by the customer in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeApprovedForAccess")
        private java.util.Date timeApprovedForAccess;

        /**
         * Access start time that is actually approved by the customer in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         *
         * @param timeApprovedForAccess the value to set
         * @return this builder
         */
        public Builder timeApprovedForAccess(java.util.Date timeApprovedForAccess) {
            this.timeApprovedForAccess = timeApprovedForAccess;
            this.__explicitlySet__.add("timeApprovedForAccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproveDelegatedResourceAccessRequestDetails build() {
            ApproveDelegatedResourceAccessRequestDetails model =
                    new ApproveDelegatedResourceAccessRequestDetails(
                            this.approverComment,
                            this.additionalMessage,
                            this.timeApprovedForAccess);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproveDelegatedResourceAccessRequestDetails model) {
            if (model.wasPropertyExplicitlySet("approverComment")) {
                this.approverComment(model.getApproverComment());
            }
            if (model.wasPropertyExplicitlySet("additionalMessage")) {
                this.additionalMessage(model.getAdditionalMessage());
            }
            if (model.wasPropertyExplicitlySet("timeApprovedForAccess")) {
                this.timeApprovedForAccess(model.getTimeApprovedForAccess());
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

    /** Message that needs to be displayed to the operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMessage")
    private final String additionalMessage;

    /**
     * Message that needs to be displayed to the operator.
     *
     * @return the value
     */
    public String getAdditionalMessage() {
        return additionalMessage;
    }

    /**
     * Access start time that is actually approved by the customer in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeApprovedForAccess")
    private final java.util.Date timeApprovedForAccess;

    /**
     * Access start time that is actually approved by the customer in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimeApprovedForAccess() {
        return timeApprovedForAccess;
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
        sb.append("ApproveDelegatedResourceAccessRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("approverComment=").append(String.valueOf(this.approverComment));
        sb.append(", additionalMessage=").append(String.valueOf(this.additionalMessage));
        sb.append(", timeApprovedForAccess=").append(String.valueOf(this.timeApprovedForAccess));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproveDelegatedResourceAccessRequestDetails)) {
            return false;
        }

        ApproveDelegatedResourceAccessRequestDetails other =
                (ApproveDelegatedResourceAccessRequestDetails) o;
        return java.util.Objects.equals(this.approverComment, other.approverComment)
                && java.util.Objects.equals(this.additionalMessage, other.additionalMessage)
                && java.util.Objects.equals(this.timeApprovedForAccess, other.timeApprovedForAccess)
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
                        + (this.additionalMessage == null ? 43 : this.additionalMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeApprovedForAccess == null
                                ? 43
                                : this.timeApprovedForAccess.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
