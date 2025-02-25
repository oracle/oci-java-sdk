/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * This model for autoscaling policy is deprecated and not supported for ODH clusters. Use the {@code AutoScalePolicyDetails} model to manage autoscale policy details for ODH clusters.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AutoScalePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutoScalePolicy extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"policyType", "rules"})
    public AutoScalePolicy(PolicyType policyType, java.util.List<AutoScalePolicyRule> rules) {
        super();
        this.policyType = policyType;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Types of autoscale policies. Options are SCHEDULE-BASED or THRESHOLD-BASED. (Only THRESHOLD-BASED is supported in this release.)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("policyType")
        private PolicyType policyType;

        /**
         * Types of autoscale policies. Options are SCHEDULE-BASED or THRESHOLD-BASED. (Only THRESHOLD-BASED is supported in this release.)
         * @param policyType the value to set
         * @return this builder
         **/
        public Builder policyType(PolicyType policyType) {
            this.policyType = policyType;
            this.__explicitlySet__.add("policyType");
            return this;
        }
        /**
         * The list of rules for autoscaling. If an action has multiple rules, the last rule in the array will be applied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<AutoScalePolicyRule> rules;

        /**
         * The list of rules for autoscaling. If an action has multiple rules, the last rule in the array will be applied.
         * @param rules the value to set
         * @return this builder
         **/
        public Builder rules(java.util.List<AutoScalePolicyRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutoScalePolicy build() {
            AutoScalePolicy model = new AutoScalePolicy(this.policyType, this.rules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutoScalePolicy model) {
            if (model.wasPropertyExplicitlySet("policyType")) {
                this.policyType(model.getPolicyType());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
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
     * Types of autoscale policies. Options are SCHEDULE-BASED or THRESHOLD-BASED. (Only THRESHOLD-BASED is supported in this release.)
     **/
    public enum PolicyType {
        ThresholdBased("THRESHOLD_BASED"),
        ScheduleBased("SCHEDULE_BASED"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PolicyType.class);

        private final String value;
        private static java.util.Map<String, PolicyType> map;

        static {
            map = new java.util.HashMap<>();
            for (PolicyType v : PolicyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PolicyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PolicyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PolicyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Types of autoscale policies. Options are SCHEDULE-BASED or THRESHOLD-BASED. (Only THRESHOLD-BASED is supported in this release.)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("policyType")
    private final PolicyType policyType;

    /**
     * Types of autoscale policies. Options are SCHEDULE-BASED or THRESHOLD-BASED. (Only THRESHOLD-BASED is supported in this release.)
     * @return the value
     **/
    public PolicyType getPolicyType() {
        return policyType;
    }

    /**
     * The list of rules for autoscaling. If an action has multiple rules, the last rule in the array will be applied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<AutoScalePolicyRule> rules;

    /**
     * The list of rules for autoscaling. If an action has multiple rules, the last rule in the array will be applied.
     * @return the value
     **/
    public java.util.List<AutoScalePolicyRule> getRules() {
        return rules;
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
        sb.append("AutoScalePolicy(");
        sb.append("super=").append(super.toString());
        sb.append("policyType=").append(String.valueOf(this.policyType));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutoScalePolicy)) {
            return false;
        }

        AutoScalePolicy other = (AutoScalePolicy) o;
        return java.util.Objects.equals(this.policyType, other.policyType)
                && java.util.Objects.equals(this.rules, other.rules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.policyType == null ? 43 : this.policyType.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
