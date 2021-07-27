/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DrgRouteDistributionStatement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DrgRouteDistributionStatement {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
        private java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

        public Builder matchCriteria(
                java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria) {
            this.matchCriteria = matchCriteria;
            this.__explicitlySet__.add("matchCriteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrgRouteDistributionStatement build() {
            DrgRouteDistributionStatement __instance__ =
                    new DrgRouteDistributionStatement(matchCriteria, action, priority, id);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrgRouteDistributionStatement o) {
            Builder copiedBuilder =
                    matchCriteria(o.getMatchCriteria())
                            .action(o.getAction())
                            .priority(o.getPriority())
                            .id(o.getId());

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
     * The action is applied only if all of the match criteria is met.
     * If there are no match criteria in a statement, any input is considered a match and the action is applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
    java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;
    /**
     * {@code ACCEPT} indicates the route should be imported or exported as-is.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        Accept("ACCEPT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * {@code ACCEPT} indicates the route should be imported or exported as-is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

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
    Integer priority;

    /**
     * The Oracle-assigned ID of the route distribution statement.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
