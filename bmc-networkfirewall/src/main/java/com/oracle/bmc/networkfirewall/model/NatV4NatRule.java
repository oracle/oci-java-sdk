/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * A Nat Rule is used to define to which traffic NAT should be applied by the firewall. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NatV4NatRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NatV4NatRule extends NatRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("priorityOrder")
        private Long priorityOrder;

        public Builder priorityOrder(Long priorityOrder) {
            this.priorityOrder = priorityOrder;
            this.__explicitlySet__.add("priorityOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private RulePosition position;

        public Builder position(RulePosition position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private NatRuleMatchCriteria condition;

        public Builder condition(NatRuleMatchCriteria condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * action:
         *
         * <p>DIPP_SRC_NAT - Dynamic-ip-port source NAT.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private NatV4ActionType action;

        /**
         * action:
         *
         * <p>DIPP_SRC_NAT - Dynamic-ip-port source NAT.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(NatV4ActionType action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NatV4NatRule build() {
            NatV4NatRule model =
                    new NatV4NatRule(
                            this.name,
                            this.description,
                            this.priorityOrder,
                            this.position,
                            this.parentResourceId,
                            this.condition,
                            this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NatV4NatRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("priorityOrder")) {
                this.priorityOrder(model.getPriorityOrder());
            }
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    @Deprecated
    public NatV4NatRule(
            String name,
            String description,
            Long priorityOrder,
            RulePosition position,
            String parentResourceId,
            NatRuleMatchCriteria condition,
            NatV4ActionType action) {
        super(name, description, priorityOrder, position, parentResourceId);
        this.condition = condition;
        this.action = action;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final NatRuleMatchCriteria condition;

    public NatRuleMatchCriteria getCondition() {
        return condition;
    }

    /**
     * action:
     *
     * <p>DIPP_SRC_NAT - Dynamic-ip-port source NAT.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final NatV4ActionType action;

    /**
     * action:
     *
     * <p>DIPP_SRC_NAT - Dynamic-ip-port source NAT.
     *
     * @return the value
     */
    public NatV4ActionType getAction() {
        return action;
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
        sb.append("NatV4NatRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NatV4NatRule)) {
            return false;
        }

        NatV4NatRule other = (NatV4NatRule) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        return result;
    }
}
