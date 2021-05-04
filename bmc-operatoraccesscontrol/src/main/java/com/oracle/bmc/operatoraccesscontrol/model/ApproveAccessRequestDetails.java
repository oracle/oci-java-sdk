/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApproveAccessRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ApproveAccessRequestDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
        private String approverComment;

        public Builder approverComment(String approverComment) {
            this.approverComment = approverComment;
            this.__explicitlySet__.add("approverComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("auditType")
        private java.util.List<String> auditType;

        public Builder auditType(java.util.List<String> auditType) {
            this.auditType = auditType;
            this.__explicitlySet__.add("auditType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalMessage")
        private String additionalMessage;

        public Builder additionalMessage(String additionalMessage) {
            this.additionalMessage = additionalMessage;
            this.__explicitlySet__.add("additionalMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproveAccessRequestDetails build() {
            ApproveAccessRequestDetails __instance__ =
                    new ApproveAccessRequestDetails(approverComment, auditType, additionalMessage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproveAccessRequestDetails o) {
            Builder copiedBuilder =
                    approverComment(o.getApproverComment())
                            .auditType(o.getAuditType())
                            .additionalMessage(o.getAdditionalMessage());

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

    /**
     * Comment by the approver during approval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approverComment")
    String approverComment;

    /**
     * Specifies the type of auditing to be enabled. There are two levels of auditing: command-level and keystroke-level.
     * By default, auditing is enabled at the command level i.e., each command issued by the operator is audited. When keystroke-level is chosen,
     * in addition to command level logging, key strokes are also logged.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditType")
    java.util.List<String> auditType;

    /**
     * Message that needs to be displayed to the Ops User.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMessage")
    String additionalMessage;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
