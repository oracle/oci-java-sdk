/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * details of Approver Detail. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApproverDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApproverDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "approverId",
        "approvalAction",
        "approvalComment",
        "approvalAdditionalMessage",
        "timeOfAuthorization",
        "timeApprovedForAccess"
    })
    public ApproverDetail(
            String approverId,
            String approvalAction,
            String approvalComment,
            String approvalAdditionalMessage,
            java.util.Date timeOfAuthorization,
            java.util.Date timeApprovedForAccess) {
        super();
        this.approverId = approverId;
        this.approvalAction = approvalAction;
        this.approvalComment = approvalComment;
        this.approvalAdditionalMessage = approvalAdditionalMessage;
        this.timeOfAuthorization = timeOfAuthorization;
        this.timeApprovedForAccess = timeApprovedForAccess;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The userId of the approver. */
        @com.fasterxml.jackson.annotation.JsonProperty("approverId")
        private String approverId;

        /**
         * The userId of the approver.
         *
         * @param approverId the value to set
         * @return this builder
         */
        public Builder approverId(String approverId) {
            this.approverId = approverId;
            this.__explicitlySet__.add("approverId");
            return this;
        }
        /** The action done by the approver. */
        @com.fasterxml.jackson.annotation.JsonProperty("approvalAction")
        private String approvalAction;

        /**
         * The action done by the approver.
         *
         * @param approvalAction the value to set
         * @return this builder
         */
        public Builder approvalAction(String approvalAction) {
            this.approvalAction = approvalAction;
            this.__explicitlySet__.add("approvalAction");
            return this;
        }
        /** Comment specified by the approver of the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("approvalComment")
        private String approvalComment;

        /**
         * Comment specified by the approver of the request.
         *
         * @param approvalComment the value to set
         * @return this builder
         */
        public Builder approvalComment(String approvalComment) {
            this.approvalComment = approvalComment;
            this.__explicitlySet__.add("approvalComment");
            return this;
        }
        /** Additional message specified by the approver of the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("approvalAdditionalMessage")
        private String approvalAdditionalMessage;

        /**
         * Additional message specified by the approver of the request.
         *
         * @param approvalAdditionalMessage the value to set
         * @return this builder
         */
        public Builder approvalAdditionalMessage(String approvalAdditionalMessage) {
            this.approvalAdditionalMessage = approvalAdditionalMessage;
            this.__explicitlySet__.add("approvalAdditionalMessage");
            return this;
        }
        /**
         * Time when the access request was authorized by the customer in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfAuthorization")
        private java.util.Date timeOfAuthorization;

        /**
         * Time when the access request was authorized by the customer in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfAuthorization the value to set
         * @return this builder
         */
        public Builder timeOfAuthorization(java.util.Date timeOfAuthorization) {
            this.timeOfAuthorization = timeOfAuthorization;
            this.__explicitlySet__.add("timeOfAuthorization");
            return this;
        }
        /**
         * Time for when the access request should start that is authorized by the customer in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeApprovedForAccess")
        private java.util.Date timeApprovedForAccess;

        /**
         * Time for when the access request should start that is authorized by the customer in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
         * '2020-05-22T21:10:29.600Z'
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

        public ApproverDetail build() {
            ApproverDetail model =
                    new ApproverDetail(
                            this.approverId,
                            this.approvalAction,
                            this.approvalComment,
                            this.approvalAdditionalMessage,
                            this.timeOfAuthorization,
                            this.timeApprovedForAccess);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproverDetail model) {
            if (model.wasPropertyExplicitlySet("approverId")) {
                this.approverId(model.getApproverId());
            }
            if (model.wasPropertyExplicitlySet("approvalAction")) {
                this.approvalAction(model.getApprovalAction());
            }
            if (model.wasPropertyExplicitlySet("approvalComment")) {
                this.approvalComment(model.getApprovalComment());
            }
            if (model.wasPropertyExplicitlySet("approvalAdditionalMessage")) {
                this.approvalAdditionalMessage(model.getApprovalAdditionalMessage());
            }
            if (model.wasPropertyExplicitlySet("timeOfAuthorization")) {
                this.timeOfAuthorization(model.getTimeOfAuthorization());
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

    /** The userId of the approver. */
    @com.fasterxml.jackson.annotation.JsonProperty("approverId")
    private final String approverId;

    /**
     * The userId of the approver.
     *
     * @return the value
     */
    public String getApproverId() {
        return approverId;
    }

    /** The action done by the approver. */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalAction")
    private final String approvalAction;

    /**
     * The action done by the approver.
     *
     * @return the value
     */
    public String getApprovalAction() {
        return approvalAction;
    }

    /** Comment specified by the approver of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalComment")
    private final String approvalComment;

    /**
     * Comment specified by the approver of the request.
     *
     * @return the value
     */
    public String getApprovalComment() {
        return approvalComment;
    }

    /** Additional message specified by the approver of the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("approvalAdditionalMessage")
    private final String approvalAdditionalMessage;

    /**
     * Additional message specified by the approver of the request.
     *
     * @return the value
     */
    public String getApprovalAdditionalMessage() {
        return approvalAdditionalMessage;
    }

    /**
     * Time when the access request was authorized by the customer in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfAuthorization")
    private final java.util.Date timeOfAuthorization;

    /**
     * Time when the access request was authorized by the customer in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfAuthorization() {
        return timeOfAuthorization;
    }

    /**
     * Time for when the access request should start that is authorized by the customer in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeApprovedForAccess")
    private final java.util.Date timeApprovedForAccess;

    /**
     * Time for when the access request should start that is authorized by the customer in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example:
     * '2020-05-22T21:10:29.600Z'
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
        sb.append("ApproverDetail(");
        sb.append("super=").append(super.toString());
        sb.append("approverId=").append(String.valueOf(this.approverId));
        sb.append(", approvalAction=").append(String.valueOf(this.approvalAction));
        sb.append(", approvalComment=").append(String.valueOf(this.approvalComment));
        sb.append(", approvalAdditionalMessage=")
                .append(String.valueOf(this.approvalAdditionalMessage));
        sb.append(", timeOfAuthorization=").append(String.valueOf(this.timeOfAuthorization));
        sb.append(", timeApprovedForAccess=").append(String.valueOf(this.timeApprovedForAccess));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproverDetail)) {
            return false;
        }

        ApproverDetail other = (ApproverDetail) o;
        return java.util.Objects.equals(this.approverId, other.approverId)
                && java.util.Objects.equals(this.approvalAction, other.approvalAction)
                && java.util.Objects.equals(this.approvalComment, other.approvalComment)
                && java.util.Objects.equals(
                        this.approvalAdditionalMessage, other.approvalAdditionalMessage)
                && java.util.Objects.equals(this.timeOfAuthorization, other.timeOfAuthorization)
                && java.util.Objects.equals(this.timeApprovedForAccess, other.timeApprovedForAccess)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.approverId == null ? 43 : this.approverId.hashCode());
        result =
                (result * PRIME)
                        + (this.approvalAction == null ? 43 : this.approvalAction.hashCode());
        result =
                (result * PRIME)
                        + (this.approvalComment == null ? 43 : this.approvalComment.hashCode());
        result =
                (result * PRIME)
                        + (this.approvalAdditionalMessage == null
                                ? 43
                                : this.approvalAdditionalMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfAuthorization == null
                                ? 43
                                : this.timeOfAuthorization.hashCode());
        result =
                (result * PRIME)
                        + (this.timeApprovedForAccess == null
                                ? 43
                                : this.timeApprovedForAccess.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
