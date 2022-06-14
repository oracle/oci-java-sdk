/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Details of the access request approval.
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
    builder = ApproveAccessRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApproveAccessRequestDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "approverComment",
        "auditType",
        "additionalMessage",
        "timeOfUserCreation"
    })
    public ApproveAccessRequestDetails(
            String approverComment,
            java.util.List<String> auditType,
            String additionalMessage,
            java.util.Date timeOfUserCreation) {
        super();
        this.approverComment = approverComment;
        this.auditType = auditType;
        this.additionalMessage = additionalMessage;
        this.timeOfUserCreation = timeOfUserCreation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Comment by the approver during approval.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        /**
         * Comment by the approver during approval.
         * @param approverComment the value to set
         * @return this builder
         **/
        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }
        /**
         * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
         * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
         * in addition to command level logging, key strokes are also logged.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private java.util.List<String> auditType;

        /**
         * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
         * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
         * in addition to command level logging, key strokes are also logged.
         *
         * @param auditType the value to set
         * @return this builder
         **/
        public Builder auditType(java.util.List<String> auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }
        /**
         * Message that needs to be displayed to the Ops User.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalMessage")
        private String additionalMessage;

        /**
         * Message that needs to be displayed to the Ops User.
         * @param additionalMessage the value to set
         * @return this builder
         **/
        public Builder additionalMessage(String additionalMessage) {
            this.additionalMessage = additionalMessage;
            this.__explicitlySet__.add("additionalMessage");
            return this;
        }
        /**
         * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
        private java.util.Date timeOfUserCreation;

        /**
         * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfUserCreation the value to set
         * @return this builder
         **/
        public Builder timeOfUserCreation(java.util.Date timeOfUserCreation) {
            this.timeOfUserCreation = timeOfUserCreation;
            this.__explicitlySet__.add("timeOfUserCreation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproveAccessRequestDetails build() {
            ApproveAccessRequestDetails __instance__ =
                    new ApproveAccessRequestDetails(
                            approverComment, auditType, additionalMessage, timeOfUserCreation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproveAccessRequestDetails o) {
            Builder copiedBuilder =
                    approverComment(o.getApproverComment())
                            .auditType(o.getAuditType())
                            .additionalMessage(o.getAdditionalMessage())
                            .timeOfUserCreation(o.getTimeOfUserCreation());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Comment by the approver during approval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    private final String approverComment;

    /**
     * Comment by the approver during approval.
     * @return the value
     **/
    public String getApproverComment() {
        return approverComment;
    }

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
     * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
     * in addition to command level logging, key strokes are also logged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    private final java.util.List<String> auditType;

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
     * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
     * in addition to command level logging, key strokes are also logged.
     *
     * @return the value
     **/
    public java.util.List<String> getAuditType() {
        return auditType;
    }

    /**
     * Message that needs to be displayed to the Ops User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMessage")
    private final String additionalMessage;

    /**
     * Message that needs to be displayed to the Ops User.
     * @return the value
     **/
    public String getAdditionalMessage() {
        return additionalMessage;
    }

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfUserCreation")
    private final java.util.Date timeOfUserCreation;

    /**
     * The time when access request is scheduled to be approved in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.Example: '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     **/
    public java.util.Date getTimeOfUserCreation() {
        return timeOfUserCreation;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApproveAccessRequestDetails(");
        sb.append("approverComment=").append(String.valueOf(this.approverComment));
        sb.append(", auditType=").append(String.valueOf(this.auditType));
        sb.append(", additionalMessage=").append(String.valueOf(this.additionalMessage));
        sb.append(", timeOfUserCreation=").append(String.valueOf(this.timeOfUserCreation));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproveAccessRequestDetails)) {
            return false;
        }

        ApproveAccessRequestDetails other = (ApproveAccessRequestDetails) o;
        return java.util.Objects.equals(this.approverComment, other.approverComment)
                && java.util.Objects.equals(this.auditType, other.auditType)
                && java.util.Objects.equals(this.additionalMessage, other.additionalMessage)
                && java.util.Objects.equals(this.timeOfUserCreation, other.timeOfUserCreation)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.approverComment == null ? 43 : this.approverComment.hashCode());
        result = (result * PRIME) + (this.auditType == null ? 43 : this.auditType.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalMessage == null ? 43 : this.additionalMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfUserCreation == null
                                ? 43
                                : this.timeOfUserCreation.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
