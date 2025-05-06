/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Rule Selection Criteria for DYNAMIC resource selection for a GENERIC fleet. Rules define what
 * resources are members of this fleet. All resources that meet the criteria are added
 * automatically. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SelectionCriteria.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SelectionCriteria
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"matchCondition", "rules"})
    public SelectionCriteria(MatchCondition matchCondition, java.util.List<Rule> rules) {
        super();
        this.matchCondition = matchCondition;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Match condition for the rule selection. Include resources that match all rules or any of
         * the rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("matchCondition")
        private MatchCondition matchCondition;

        /**
         * Match condition for the rule selection. Include resources that match all rules or any of
         * the rules.
         *
         * @param matchCondition the value to set
         * @return this builder
         */
        public Builder matchCondition(MatchCondition matchCondition) {
            this.matchCondition = matchCondition;
            this.__explicitlySet__.add("matchCondition");
            return this;
        }
        /** Rules. */
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<Rule> rules;

        /**
         * Rules.
         *
         * @param rules the value to set
         * @return this builder
         */
        public Builder rules(java.util.List<Rule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SelectionCriteria build() {
            SelectionCriteria model = new SelectionCriteria(this.matchCondition, this.rules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SelectionCriteria model) {
            if (model.wasPropertyExplicitlySet("matchCondition")) {
                this.matchCondition(model.getMatchCondition());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
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

    /**
     * Match condition for the rule selection. Include resources that match all rules or any of the
     * rules.
     */
    public enum MatchCondition implements com.oracle.bmc.http.internal.BmcEnum {
        MatchAll("MATCH_ALL"),
        Any("ANY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MatchCondition.class);

        private final String value;
        private static java.util.Map<String, MatchCondition> map;

        static {
            map = new java.util.HashMap<>();
            for (MatchCondition v : MatchCondition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MatchCondition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MatchCondition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MatchCondition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Match condition for the rule selection. Include resources that match all rules or any of the
     * rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("matchCondition")
    private final MatchCondition matchCondition;

    /**
     * Match condition for the rule selection. Include resources that match all rules or any of the
     * rules.
     *
     * @return the value
     */
    public MatchCondition getMatchCondition() {
        return matchCondition;
    }

    /** Rules. */
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<Rule> rules;

    /**
     * Rules.
     *
     * @return the value
     */
    public java.util.List<Rule> getRules() {
        return rules;
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
        sb.append("SelectionCriteria(");
        sb.append("super=").append(super.toString());
        sb.append("matchCondition=").append(String.valueOf(this.matchCondition));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SelectionCriteria)) {
            return false;
        }

        SelectionCriteria other = (SelectionCriteria) o;
        return java.util.Objects.equals(this.matchCondition, other.matchCondition)
                && java.util.Objects.equals(this.rules, other.rules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.matchCondition == null ? 43 : this.matchCondition.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
