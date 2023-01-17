/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * A single statement within a route distribution. All match criteria in a statement must be met
 * for the action to take place.
 *
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
    builder = DrgRouteDistributionStatement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DrgRouteDistributionStatement
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"matchCriteria", "action", "priority", "id"})
    public DrgRouteDistributionStatement(
            java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria,
            Action action,
            Integer priority,
            String id) {
        super();
        this.matchCriteria = matchCriteria;
        this.action = action;
        this.priority = priority;
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The action is applied only if all of the match criteria is met.
         * If there are no match criteria in a statement, any input is considered a match and the action is applied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
        private java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

        /**
         * The action is applied only if all of the match criteria is met.
         * If there are no match criteria in a statement, any input is considered a match and the action is applied.
         *
         * @param matchCriteria the value to set
         * @return this builder
         **/
        public Builder matchCriteria(
                java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria) {
            this.matchCriteria = matchCriteria;
            this.__explicitlySet__.add("matchCriteria");
            return this;
        }
        /**
         * {@code ACCEPT} indicates the route should be imported or exported as-is.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * {@code ACCEPT} indicates the route should be imported or exported as-is.
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * This field specifies the priority of each statement in a route distribution.
         * Priorities must be unique within a particular route distribution.
         * The priority will be represented as a number between 0 and 65535 where a lower number
         * indicates a higher priority. When a route is processed, statements are applied in the order
         * defined by their priority. The first matching rule dictates the action that will be taken
         * on the route.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * This field specifies the priority of each statement in a route distribution.
         * Priorities must be unique within a particular route distribution.
         * The priority will be represented as a number between 0 and 65535 where a lower number
         * indicates a higher priority. When a route is processed, statements are applied in the order
         * defined by their priority. The first matching rule dictates the action that will be taken
         * on the route.
         *
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /**
         * The Oracle-assigned ID of the route distribution statement.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle-assigned ID of the route distribution statement.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgRouteDistributionStatement build() {
            DrgRouteDistributionStatement model =
                    new DrgRouteDistributionStatement(
                            this.matchCriteria, this.action, this.priority, this.id);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgRouteDistributionStatement model) {
            if (model.wasPropertyExplicitlySet("matchCriteria")) {
                this.matchCriteria(model.getMatchCriteria());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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
     * The action is applied only if all of the match criteria is met.
     * If there are no match criteria in a statement, any input is considered a match and the action is applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
    private final java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

    /**
     * The action is applied only if all of the match criteria is met.
     * If there are no match criteria in a statement, any input is considered a match and the action is applied.
     *
     * @return the value
     **/
    public java.util.List<DrgRouteDistributionMatchCriteria> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * {@code ACCEPT} indicates the route should be imported or exported as-is.
     *
     **/
    public enum Action {
        Accept("ACCEPT"),
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
     * {@code ACCEPT} indicates the route should be imported or exported as-is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * {@code ACCEPT} indicates the route should be imported or exported as-is.
     *
     * @return the value
     **/
    public Action getAction() {
        return action;
    }

    /**
     * This field specifies the priority of each statement in a route distribution.
     * Priorities must be unique within a particular route distribution.
     * The priority will be represented as a number between 0 and 65535 where a lower number
     * indicates a higher priority. When a route is processed, statements are applied in the order
     * defined by their priority. The first matching rule dictates the action that will be taken
     * on the route.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * This field specifies the priority of each statement in a route distribution.
     * Priorities must be unique within a particular route distribution.
     * The priority will be represented as a number between 0 and 65535 where a lower number
     * indicates a higher priority. When a route is processed, statements are applied in the order
     * defined by their priority. The first matching rule dictates the action that will be taken
     * on the route.
     *
     * @return the value
     **/
    public Integer getPriority() {
        return priority;
    }

    /**
     * The Oracle-assigned ID of the route distribution statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle-assigned ID of the route distribution statement.
     *
     * @return the value
     **/
    public String getId() {
        return id;
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
        sb.append("DrgRouteDistributionStatement(");
        sb.append("super=").append(super.toString());
        sb.append("matchCriteria=").append(String.valueOf(this.matchCriteria));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrgRouteDistributionStatement)) {
            return false;
        }

        DrgRouteDistributionStatement other = (DrgRouteDistributionStatement) o;
        return java.util.Objects.equals(this.matchCriteria, other.matchCriteria)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.id, other.id)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.matchCriteria == null ? 43 : this.matchCriteria.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
