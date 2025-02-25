/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A routing rule examines an incoming request, routing matching requests to the specified backend set.
 * Routing rules apply only to HTTP and HTTPS requests. They have no effect on TCP requests.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoutingRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RoutingRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "condition", "actions"})
    public RoutingRule(String name, String condition, java.util.List<Action> actions) {
        super();
        this.name = name;
        this.condition = condition;
        this.actions = actions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique name for the routing policy rule. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique name for the routing policy rule. Avoid entering confidential information.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A routing rule to evaluate defined conditions against the incoming HTTP request and perform an action.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * A routing rule to evaluate defined conditions against the incoming HTTP request and perform an action.
         *
         * @param condition the value to set
         * @return this builder
         **/
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * A list of actions to be applied when conditions of the routing rule are met.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<Action> actions;

        /**
         * A list of actions to be applied when conditions of the routing rule are met.
         *
         * @param actions the value to set
         * @return this builder
         **/
        public Builder actions(java.util.List<Action> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoutingRule build() {
            RoutingRule model = new RoutingRule(this.name, this.condition, this.actions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoutingRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
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
     * A unique name for the routing policy rule. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique name for the routing policy rule. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A routing rule to evaluate defined conditions against the incoming HTTP request and perform an action.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * A routing rule to evaluate defined conditions against the incoming HTTP request and perform an action.
     *
     * @return the value
     **/
    public String getCondition() {
        return condition;
    }

    /**
     * A list of actions to be applied when conditions of the routing rule are met.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final java.util.List<Action> actions;

    /**
     * A list of actions to be applied when conditions of the routing rule are met.
     *
     * @return the value
     **/
    public java.util.List<Action> getActions() {
        return actions;
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
        sb.append("RoutingRule(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoutingRule)) {
            return false;
        }

        RoutingRule other = (RoutingRule) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.actions, other.actions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
