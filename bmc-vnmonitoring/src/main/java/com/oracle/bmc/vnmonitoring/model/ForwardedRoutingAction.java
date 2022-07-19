/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the routing actions taken for traffic that is forwarded.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ForwardedRoutingAction.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "action"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ForwardedRoutingAction extends RoutingAction {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("forwardedRoutingActionDetails")
        private ForwardedRoutingActionDetails forwardedRoutingActionDetails;

        public Builder forwardedRoutingActionDetails(
                ForwardedRoutingActionDetails forwardedRoutingActionDetails) {
            this.forwardedRoutingActionDetails = forwardedRoutingActionDetails;
            this.__explicitlySet__.add("forwardedRoutingActionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ForwardedRoutingAction build() {
            ForwardedRoutingAction __instance__ =
                    new ForwardedRoutingAction(actionType, forwardedRoutingActionDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ForwardedRoutingAction o) {
            Builder copiedBuilder =
                    actionType(o.getActionType())
                            .forwardedRoutingActionDetails(o.getForwardedRoutingActionDetails());

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

    @Deprecated
    public ForwardedRoutingAction(
            ActionType actionType, ForwardedRoutingActionDetails forwardedRoutingActionDetails) {
        super(actionType);
        this.forwardedRoutingActionDetails = forwardedRoutingActionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("forwardedRoutingActionDetails")
    private final ForwardedRoutingActionDetails forwardedRoutingActionDetails;

    public ForwardedRoutingActionDetails getForwardedRoutingActionDetails() {
        return forwardedRoutingActionDetails;
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
        sb.append("ForwardedRoutingAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", forwardedRoutingActionDetails=")
                .append(String.valueOf(this.forwardedRoutingActionDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ForwardedRoutingAction)) {
            return false;
        }

        ForwardedRoutingAction other = (ForwardedRoutingAction) o;
        return java.util.Objects.equals(
                        this.forwardedRoutingActionDetails, other.forwardedRoutingActionDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.forwardedRoutingActionDetails == null
                                ? 43
                                : this.forwardedRoutingActionDetails.hashCode());
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
