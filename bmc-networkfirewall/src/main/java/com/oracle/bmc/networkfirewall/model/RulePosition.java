/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * An object which defines the position of the rule. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RulePosition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RulePosition extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"beforeRule", "afterRule"})
    public RulePosition(String beforeRule, String afterRule) {
        super();
        this.beforeRule = beforeRule;
        this.afterRule = afterRule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier for rule before which this rule lies. */
        @com.fasterxml.jackson.annotation.JsonProperty("beforeRule")
        private String beforeRule;

        /**
         * Identifier for rule before which this rule lies.
         *
         * @param beforeRule the value to set
         * @return this builder
         */
        public Builder beforeRule(String beforeRule) {
            this.beforeRule = beforeRule;
            this.__explicitlySet__.add("beforeRule");
            return this;
        }
        /** Identifier for rule after which this rule lies. */
        @com.fasterxml.jackson.annotation.JsonProperty("afterRule")
        private String afterRule;

        /**
         * Identifier for rule after which this rule lies.
         *
         * @param afterRule the value to set
         * @return this builder
         */
        public Builder afterRule(String afterRule) {
            this.afterRule = afterRule;
            this.__explicitlySet__.add("afterRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RulePosition build() {
            RulePosition model = new RulePosition(this.beforeRule, this.afterRule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RulePosition model) {
            if (model.wasPropertyExplicitlySet("beforeRule")) {
                this.beforeRule(model.getBeforeRule());
            }
            if (model.wasPropertyExplicitlySet("afterRule")) {
                this.afterRule(model.getAfterRule());
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

    /** Identifier for rule before which this rule lies. */
    @com.fasterxml.jackson.annotation.JsonProperty("beforeRule")
    private final String beforeRule;

    /**
     * Identifier for rule before which this rule lies.
     *
     * @return the value
     */
    public String getBeforeRule() {
        return beforeRule;
    }

    /** Identifier for rule after which this rule lies. */
    @com.fasterxml.jackson.annotation.JsonProperty("afterRule")
    private final String afterRule;

    /**
     * Identifier for rule after which this rule lies.
     *
     * @return the value
     */
    public String getAfterRule() {
        return afterRule;
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
        sb.append("RulePosition(");
        sb.append("super=").append(super.toString());
        sb.append("beforeRule=").append(String.valueOf(this.beforeRule));
        sb.append(", afterRule=").append(String.valueOf(this.afterRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RulePosition)) {
            return false;
        }

        RulePosition other = (RulePosition) o;
        return java.util.Objects.equals(this.beforeRule, other.beforeRule)
                && java.util.Objects.equals(this.afterRule, other.afterRule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.beforeRule == null ? 43 : this.beforeRule.hashCode());
        result = (result * PRIME) + (this.afterRule == null ? 43 : this.afterRule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
