/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An updated list of routing rules that overwrites the existing list of routing rules.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateRoutingPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateRoutingPolicyDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"conditionLanguageVersion", "rules"})
    public UpdateRoutingPolicyDetails(
            ConditionLanguageVersion conditionLanguageVersion, java.util.List<RoutingRule> rules) {
        super();
        this.conditionLanguageVersion = conditionLanguageVersion;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The version of the language in which {@code condition} of {@code rules} are composed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguageVersion")
        private ConditionLanguageVersion conditionLanguageVersion;

        /**
         * The version of the language in which {@code condition} of {@code rules} are composed.
         *
         * @param conditionLanguageVersion the value to set
         * @return this builder
         **/
        public Builder conditionLanguageVersion(ConditionLanguageVersion conditionLanguageVersion) {
            this.conditionLanguageVersion = conditionLanguageVersion;
            this.__explicitlySet__.add("conditionLanguageVersion");
            return this;
        }
        /**
         * The list of routing rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<RoutingRule> rules;

        /**
         * The list of routing rules.
         * @param rules the value to set
         * @return this builder
         **/
        public Builder rules(java.util.List<RoutingRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRoutingPolicyDetails build() {
            UpdateRoutingPolicyDetails __instance__ =
                    new UpdateRoutingPolicyDetails(conditionLanguageVersion, rules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRoutingPolicyDetails o) {
            Builder copiedBuilder =
                    conditionLanguageVersion(o.getConditionLanguageVersion()).rules(o.getRules());

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
     * The version of the language in which {@code condition} of {@code rules} are composed.
     *
     **/
    public enum ConditionLanguageVersion {
        V1("V1"),
        ;

        private final String value;
        private static java.util.Map<String, ConditionLanguageVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (ConditionLanguageVersion v : ConditionLanguageVersion.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConditionLanguageVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConditionLanguageVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConditionLanguageVersion: " + key);
        }
    };
    /**
     * The version of the language in which {@code condition} of {@code rules} are composed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conditionLanguageVersion")
    private final ConditionLanguageVersion conditionLanguageVersion;

    /**
     * The version of the language in which {@code condition} of {@code rules} are composed.
     *
     * @return the value
     **/
    public ConditionLanguageVersion getConditionLanguageVersion() {
        return conditionLanguageVersion;
    }

    /**
     * The list of routing rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<RoutingRule> rules;

    /**
     * The list of routing rules.
     * @return the value
     **/
    public java.util.List<RoutingRule> getRules() {
        return rules;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateRoutingPolicyDetails(");
        sb.append("conditionLanguageVersion=")
                .append(String.valueOf(this.conditionLanguageVersion));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRoutingPolicyDetails)) {
            return false;
        }

        UpdateRoutingPolicyDetails other = (UpdateRoutingPolicyDetails) o;
        return java.util.Objects.equals(
                        this.conditionLanguageVersion, other.conditionLanguageVersion)
                && java.util.Objects.equals(this.rules, other.rules)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.conditionLanguageVersion == null
                                ? 43
                                : this.conditionLanguageVersion.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
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
