/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The attributes of a rule associated with the specified listener, and the name of the rule set
 * that the rule belongs to. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ListenerRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ListenerRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rule", "ruleSetName"})
    public ListenerRuleSummary(Rule rule, String ruleSetName) {
        super();
        this.rule = rule;
        this.ruleSetName = ruleSetName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A rule object that applies to the listener. */
        @com.fasterxml.jackson.annotation.JsonProperty("rule")
        private Rule rule;

        /**
         * A rule object that applies to the listener.
         *
         * @param rule the value to set
         * @return this builder
         */
        public Builder rule(Rule rule) {
            this.rule = rule;
            this.__explicitlySet__.add("rule");
            return this;
        }
        /** The name of the rule set that the rule belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleSetName")
        private String ruleSetName;

        /**
         * The name of the rule set that the rule belongs to.
         *
         * @param ruleSetName the value to set
         * @return this builder
         */
        public Builder ruleSetName(String ruleSetName) {
            this.ruleSetName = ruleSetName;
            this.__explicitlySet__.add("ruleSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ListenerRuleSummary build() {
            ListenerRuleSummary model = new ListenerRuleSummary(this.rule, this.ruleSetName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ListenerRuleSummary model) {
            if (model.wasPropertyExplicitlySet("rule")) {
                this.rule(model.getRule());
            }
            if (model.wasPropertyExplicitlySet("ruleSetName")) {
                this.ruleSetName(model.getRuleSetName());
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

    /** A rule object that applies to the listener. */
    @com.fasterxml.jackson.annotation.JsonProperty("rule")
    private final Rule rule;

    /**
     * A rule object that applies to the listener.
     *
     * @return the value
     */
    public Rule getRule() {
        return rule;
    }

    /** The name of the rule set that the rule belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleSetName")
    private final String ruleSetName;

    /**
     * The name of the rule set that the rule belongs to.
     *
     * @return the value
     */
    public String getRuleSetName() {
        return ruleSetName;
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
        sb.append("ListenerRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("rule=").append(String.valueOf(this.rule));
        sb.append(", ruleSetName=").append(String.valueOf(this.ruleSetName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListenerRuleSummary)) {
            return false;
        }

        ListenerRuleSummary other = (ListenerRuleSummary) o;
        return java.util.Objects.equals(this.rule, other.rule)
                && java.util.Objects.equals(this.ruleSetName, other.ruleSetName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rule == null ? 43 : this.rule.hashCode());
        result = (result * PRIME) + (this.ruleSetName == null ? 43 : this.ruleSetName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
