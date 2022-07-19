/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The stage information for submitting for approval.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApproveDeploymentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApproveDeploymentDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"deployStageId", "reason", "action"})
    public ApproveDeploymentDetails(String deployStageId, String reason, Action action) {
        super();
        this.deployStageId = deployStageId;
        this.reason = reason;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stage which is marked for approval.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
        private String deployStageId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stage which is marked for approval.
         * @param deployStageId the value to set
         * @return this builder
         **/
        public Builder deployStageId(String deployStageId) {
            this.deployStageId = deployStageId;
            this.__explicitlySet__.add("deployStageId");
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
        /**
         * The action of Approve or Reject.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action of Approve or Reject.
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApproveDeploymentDetails build() {
            ApproveDeploymentDetails __instance__ =
                    new ApproveDeploymentDetails(deployStageId, reason, action);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApproveDeploymentDetails o) {
            Builder copiedBuilder =
                    deployStageId(o.getDeployStageId()).reason(o.getReason()).action(o.getAction());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stage which is marked for approval.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deployStageId")
    private final String deployStageId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the stage which is marked for approval.
     * @return the value
     **/
    public String getDeployStageId() {
        return deployStageId;
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

    /**
     * The action of Approve or Reject.
     **/
    public enum Action {
        Approve("APPROVE"),
        Reject("REJECT"),
        ;

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Action: " + key);
        }
    };
    /**
     * The action of Approve or Reject.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action of Approve or Reject.
     * @return the value
     **/
    public Action getAction() {
        return action;
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
        sb.append("ApproveDeploymentDetails(");
        sb.append("deployStageId=").append(String.valueOf(this.deployStageId));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApproveDeploymentDetails)) {
            return false;
        }

        ApproveDeploymentDetails other = (ApproveDeploymentDetails) o;
        return java.util.Objects.equals(this.deployStageId, other.deployStageId)
                && java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.deployStageId == null ? 43 : this.deployStageId.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
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
