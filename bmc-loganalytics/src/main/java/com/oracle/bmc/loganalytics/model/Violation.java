/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Violation
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Violation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Violation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("indexes")
        private java.util.List<Indexes> indexes;

        public Builder indexes(java.util.List<Indexes> indexes) {
            this.indexes = indexes;
            this.__explicitlySet__.add("indexes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleDescription")
        private String ruleDescription;

        public Builder ruleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            this.__explicitlySet__.add("ruleDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleRemediation")
        private String ruleRemediation;

        public Builder ruleRemediation(String ruleRemediation) {
            this.ruleRemediation = ruleRemediation;
            this.__explicitlySet__.add("ruleRemediation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
        private RuleType ruleType;

        public Builder ruleType(RuleType ruleType) {
            this.ruleType = ruleType;
            this.__explicitlySet__.add("ruleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Violation build() {
            Violation __instance__ =
                    new Violation(indexes, ruleDescription, ruleName, ruleRemediation, ruleType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Violation o) {
            Builder copiedBuilder =
                    indexes(o.getIndexes())
                            .ruleDescription(o.getRuleDescription())
                            .ruleName(o.getRuleName())
                            .ruleRemediation(o.getRuleRemediation())
                            .ruleType(o.getRuleType());

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
     * indexes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexes")
    java.util.List<Indexes> indexes;

    /**
     * ruleDescription
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleDescription")
    String ruleDescription;

    /**
     * ruleName
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    String ruleName;

    /**
     * ruleRemediation
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleRemediation")
    String ruleRemediation;
    /**
     * ruleType
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RuleType {
        Warn("WARN"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RuleType> map;

        static {
            map = new java.util.HashMap<>();
            for (RuleType v : RuleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RuleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RuleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * ruleType
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
    RuleType ruleType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
