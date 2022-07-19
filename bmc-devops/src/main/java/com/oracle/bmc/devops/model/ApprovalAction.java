/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Information about the approval action of DevOps deployment stages.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApprovalAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApprovalAction {
    @Deprecated
    @java.beans.ConstructorProperties({"subjectId", "action", "reason"})
    public ApprovalAction(String subjectId, Action action, String reason) {
        super();
        this.subjectId = subjectId;
        this.action = action;
        this.reason = reason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The subject ID of the user who approves or disapproves a DevOps deployment stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
        private String subjectId;

        /**
         * The subject ID of the user who approves or disapproves a DevOps deployment stage.
         * @param subjectId the value to set
         * @return this builder
         **/
        public Builder subjectId(String subjectId) {
            this.subjectId = subjectId;
            this.__explicitlySet__.add("subjectId");
            return this;
        }
        /**
         * The action of the user on the DevOps deployment stage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action of the user on the DevOps deployment stage.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The reason for approving or rejecting the deployment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * The reason for approving or rejecting the deployment.
         * @param reason the value to set
         * @return this builder
         **/
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApprovalAction build() {
            ApprovalAction __instance__ = new ApprovalAction(subjectId, action, reason);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApprovalAction o) {
            Builder copiedBuilder =
                    subjectId(o.getSubjectId()).action(o.getAction()).reason(o.getReason());

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
     * The subject ID of the user who approves or disapproves a DevOps deployment stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectId")
    private final String subjectId;

    /**
     * The subject ID of the user who approves or disapproves a DevOps deployment stage.
     * @return the value
     **/
    public String getSubjectId() {
        return subjectId;
    }

    /**
     * The action of the user on the DevOps deployment stage.
     **/
    public enum Action {
        Approve("APPROVE"),
        Reject("REJECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action of the user on the DevOps deployment stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action of the user on the DevOps deployment stage.
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * The reason for approving or rejecting the deployment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * The reason for approving or rejecting the deployment.
     * @return the value
     **/
    public String getReason() {
        return reason;
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
        sb.append("ApprovalAction(");
        sb.append("subjectId=").append(String.valueOf(this.subjectId));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApprovalAction)) {
            return false;
        }

        ApprovalAction other = (ApprovalAction) o;
        return java.util.Objects.equals(this.subjectId, other.subjectId)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subjectId == null ? 43 : this.subjectId.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
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
