/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Approval info for initial access or extension of a Delegated Resource Access Request
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DelegatedResourceAccessRequestApprovalDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DelegatedResourceAccessRequestApprovalDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "approvalAction",
        "timeApprovedForAccess",
        "approvalType",
        "approverComment",
        "approverId",
        "approverAdditionalMessage"
    })
    public DelegatedResourceAccessRequestApprovalDetails(
            ApprovalAction approvalAction,
            java.util.Date timeApprovedForAccess,
            ApprovalType approvalType,
            String approverComment,
            String approverId,
            String approverAdditionalMessage) {
        super();
        this.approvalAction = approvalAction;
        this.timeApprovedForAccess = timeApprovedForAccess;
        this.approvalType = approvalType;
        this.approverComment = approverComment;
        this.approverId = approverId;
        this.approverAdditionalMessage = approverAdditionalMessage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicated whether the request is approved or rejected.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approvalAction")
        private ApprovalAction approvalAction;

        /**
         * Indicated whether the request is approved or rejected.
         * @param approvalAction the value to set
         * @return this builder
         **/
        public Builder approvalAction(ApprovalAction approvalAction) {
            this.approvalAction = approvalAction;
            this.__explicitlySet__.add("approvalAction");
            return this;
        }
        /**
         * Access start time that is actually approved by the customer in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeApprovedForAccess")
        private java.util.Date timeApprovedForAccess;

        /**
         * Access start time that is actually approved by the customer in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
         * @param timeApprovedForAccess the value to set
         * @return this builder
         **/
        public Builder timeApprovedForAccess(java.util.Date timeApprovedForAccess) {
            this.timeApprovedForAccess = timeApprovedForAccess;
            this.__explicitlySet__.add("timeApprovedForAccess");
            return this;
        }
        /**
         * approval type, initial or extension
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approvalType")
        private ApprovalType approvalType;

        /**
         * approval type, initial or extension
         * @param approvalType the value to set
         * @return this builder
         **/
        public Builder approvalType(ApprovalType approvalType) {
            this.approvalType = approvalType;
            this.__explicitlySet__.add("approvalType");
            return this;
        }
        /**
         * Comment specified by the approver of the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        /**
         * Comment specified by the approver of the request.
         * @param approverComment the value to set
         * @return this builder
         **/
        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }
        /**
         * User ID of the approver.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverId")
        private String approverId;

        /**
         * User ID of the approver.
         * @param approverId the value to set
         * @return this builder
         **/
        public Builder approverId(String approverId) {
            this.approverId = approverId;
            this.__explicitlySet__.add("approverId");
            return this;
        }
        /**
         * Additional message specified by the approver of the request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approverAdditionalMessage")
        private String approverAdditionalMessage;

        /**
         * Additional message specified by the approver of the request.
         * @param approverAdditionalMessage the value to set
         * @return this builder
         **/
        public Builder approverAdditionalMessage(String approverAdditionalMessage) {
            this.approverAdditionalMessage = approverAdditionalMessage;
            this.__explicitlySet__.add("approverAdditionalMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DelegatedResourceAccessRequestApprovalDetails build() {
            DelegatedResourceAccessRequestApprovalDetails model =
                    new DelegatedResourceAccessRequestApprovalDetails(
                            this.approvalAction,
                            this.timeApprovedForAccess,
                            this.approvalType,
                            this.approverComment,
                            this.approverId,
                            this.approverAdditionalMessage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelegatedResourceAccessRequestApprovalDetails model) {
            if (model.wasPropertyExplicitlySet("approvalAction")) {
                this.approvalAction(model.getApprovalAction());
            }
            if (model.wasPropertyExplicitlySet("timeApprovedForAccess")) {
                this.timeApprovedForAccess(model.getTimeApprovedForAccess());
            }
            if (model.wasPropertyExplicitlySet("approvalType")) {
                this.approvalType(model.getApprovalType());
            }
            if (model.wasPropertyExplicitlySet("approverComment")) {
                this.approverComment(model.getApproverComment());
            }
            if (model.wasPropertyExplicitlySet("approverId")) {
                this.approverId(model.getApproverId());
            }
            if (model.wasPropertyExplicitlySet("approverAdditionalMessage")) {
                this.approverAdditionalMessage(model.getApproverAdditionalMessage());
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
     * Indicated whether the request is approved or rejected.
     **/
    public enum ApprovalAction {
        Approve("APPROVE"),
        Reject("REJECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ApprovalAction.class);

        private final String value;
        private static java.util.Map<String, ApprovalAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ApprovalAction v : ApprovalAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ApprovalAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ApprovalAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ApprovalAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicated whether the request is approved or rejected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approvalAction")
    private final ApprovalAction approvalAction;

    /**
     * Indicated whether the request is approved or rejected.
     * @return the value
     **/
    public ApprovalAction getApprovalAction() {
        return approvalAction;
    }

    /**
     * Access start time that is actually approved by the customer in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeApprovedForAccess")
    private final java.util.Date timeApprovedForAccess;

    /**
     * Access start time that is actually approved by the customer in [RFC 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     * @return the value
     **/
    public java.util.Date getTimeApprovedForAccess() {
        return timeApprovedForAccess;
    }

    /**
     * approval type, initial or extension
     **/
    public enum ApprovalType {
        Initial("INITIAL"),
        Extension("EXTENSION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ApprovalType.class);

        private final String value;
        private static java.util.Map<String, ApprovalType> map;

        static {
            map = new java.util.HashMap<>();
            for (ApprovalType v : ApprovalType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ApprovalType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ApprovalType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ApprovalType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * approval type, initial or extension
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approvalType")
    private final ApprovalType approvalType;

    /**
     * approval type, initial or extension
     * @return the value
     **/
    public ApprovalType getApprovalType() {
        return approvalType;
    }

    /**
     * Comment specified by the approver of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    private final String approverComment;

    /**
     * Comment specified by the approver of the request.
     * @return the value
     **/
    public String getApproverComment() {
        return approverComment;
    }

    /**
     * User ID of the approver.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverId")
    private final String approverId;

    /**
     * User ID of the approver.
     * @return the value
     **/
    public String getApproverId() {
        return approverId;
    }

    /**
     * Additional message specified by the approver of the request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverAdditionalMessage")
    private final String approverAdditionalMessage;

    /**
     * Additional message specified by the approver of the request.
     * @return the value
     **/
    public String getApproverAdditionalMessage() {
        return approverAdditionalMessage;
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
        sb.append("DelegatedResourceAccessRequestApprovalDetails(");
        sb.append("super=").append(super.toString());
        sb.append("approvalAction=").append(String.valueOf(this.approvalAction));
        sb.append(", timeApprovedForAccess=").append(String.valueOf(this.timeApprovedForAccess));
        sb.append(", approvalType=").append(String.valueOf(this.approvalType));
        sb.append(", approverComment=").append(String.valueOf(this.approverComment));
        sb.append(", approverId=").append(String.valueOf(this.approverId));
        sb.append(", approverAdditionalMessage=")
                .append(String.valueOf(this.approverAdditionalMessage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelegatedResourceAccessRequestApprovalDetails)) {
            return false;
        }

        DelegatedResourceAccessRequestApprovalDetails other =
                (DelegatedResourceAccessRequestApprovalDetails) o;
        return java.util.Objects.equals(this.approvalAction, other.approvalAction)
                && java.util.Objects.equals(this.timeApprovedForAccess, other.timeApprovedForAccess)
                && java.util.Objects.equals(this.approvalType, other.approvalType)
                && java.util.Objects.equals(this.approverComment, other.approverComment)
                && java.util.Objects.equals(this.approverId, other.approverId)
                && java.util.Objects.equals(
                        this.approverAdditionalMessage, other.approverAdditionalMessage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.approvalAction == null ? 43 : this.approvalAction.hashCode());
        result =
                (result * PRIME)
                        + (this.timeApprovedForAccess == null
                                ? 43
                                : this.timeApprovedForAccess.hashCode());
        result = (result * PRIME) + (this.approvalType == null ? 43 : this.approvalType.hashCode());
        result =
                (result * PRIME)
                        + (this.approverComment == null ? 43 : this.approverComment.hashCode());
        result = (result * PRIME) + (this.approverId == null ? 43 : this.approverId.hashCode());
        result =
                (result * PRIME)
                        + (this.approverAdditionalMessage == null
                                ? 43
                                : this.approverAdditionalMessage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
