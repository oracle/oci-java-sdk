/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * Tiering configuration for a Lustre file system. Tiering archives eligible file data to Object
 * Storage while keeping files visible at their original Lustre paths, and restores archived data
 * transparently when accessed. When {@code policyMode} is {@code CUSTOM}, this object includes the
 * custom policy rules configured for the file system. When {@code policyMode} is {@code DEFAULT},
 * the service applies the built-in tiering policy rule, which archives files larger than 1 MB that
 * have not been accessed for more than 30 days. <br>
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
        builder = TieringConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TieringConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "policyMode", "ruleCount", "rules"})
    public TieringConfiguration(
            Boolean isEnabled,
            PolicyMode policyMode,
            Integer ruleCount,
            java.util.List<TieringPolicyRule> rules) {
        super();
        this.isEnabled = isEnabled;
        this.policyMode = policyMode;
        this.ruleCount = ruleCount;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether tiering is enabled for the Lustre file system. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether tiering is enabled for the Lustre file system.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Whether the service default policy rule or custom policy rules are used. When set to
         * {@code DEFAULT}, the service applies the built-in tiering policy rule, which archives
         * files larger than 1 MB that have not been accessed for more than 30 days. When set to
         * {@code CUSTOM}, the service uses the policy rules configured in {@code rules}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("policyMode")
        private PolicyMode policyMode;

        /**
         * Whether the service default policy rule or custom policy rules are used. When set to
         * {@code DEFAULT}, the service applies the built-in tiering policy rule, which archives
         * files larger than 1 MB that have not been accessed for more than 30 days. When set to
         * {@code CUSTOM}, the service uses the policy rules configured in {@code rules}.
         *
         * @param policyMode the value to set
         * @return this builder
         */
        public Builder policyMode(PolicyMode policyMode) {
            this.policyMode = policyMode;
            this.__explicitlySet__.add("policyMode");
            return this;
        }
        /** Service-computed number of custom tiering policy rules. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleCount")
        private Integer ruleCount;

        /**
         * Service-computed number of custom tiering policy rules.
         *
         * @param ruleCount the value to set
         * @return this builder
         */
        public Builder ruleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            this.__explicitlySet__.add("ruleCount");
            return this;
        }
        /**
         * Custom tiering policy rules configured for the Lustre file system. This property is only
         * applicable when {@code policyMode} is {@code CUSTOM}. When {@code policyMode} is {@code
         * DEFAULT}, the service applies the built-in tiering policy rule instead. An enabled custom
         * policy contains 1 to 50 rules. When tiering is disabled, custom policy rules are
         * optional.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<TieringPolicyRule> rules;

        /**
         * Custom tiering policy rules configured for the Lustre file system. This property is only
         * applicable when {@code policyMode} is {@code CUSTOM}. When {@code policyMode} is {@code
         * DEFAULT}, the service applies the built-in tiering policy rule instead. An enabled custom
         * policy contains 1 to 50 rules. When tiering is disabled, custom policy rules are
         * optional.
         *
         * @param rules the value to set
         * @return this builder
         */
        public Builder rules(java.util.List<TieringPolicyRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TieringConfiguration build() {
            TieringConfiguration model =
                    new TieringConfiguration(
                            this.isEnabled, this.policyMode, this.ruleCount, this.rules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TieringConfiguration model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("policyMode")) {
                this.policyMode(model.getPolicyMode());
            }
            if (model.wasPropertyExplicitlySet("ruleCount")) {
                this.ruleCount(model.getRuleCount());
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

    /** Whether tiering is enabled for the Lustre file system. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether tiering is enabled for the Lustre file system.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Whether the service default policy rule or custom policy rules are used. When set to {@code
     * DEFAULT}, the service applies the built-in tiering policy rule, which archives files larger
     * than 1 MB that have not been accessed for more than 30 days. When set to {@code CUSTOM}, the
     * service uses the policy rules configured in {@code rules}.
     */
    public enum PolicyMode implements com.oracle.bmc.http.internal.BmcEnum {
        Default("DEFAULT"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PolicyMode.class);

        private final String value;
        private static java.util.Map<String, PolicyMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PolicyMode v : PolicyMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PolicyMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PolicyMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PolicyMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Whether the service default policy rule or custom policy rules are used. When set to {@code
     * DEFAULT}, the service applies the built-in tiering policy rule, which archives files larger
     * than 1 MB that have not been accessed for more than 30 days. When set to {@code CUSTOM}, the
     * service uses the policy rules configured in {@code rules}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policyMode")
    private final PolicyMode policyMode;

    /**
     * Whether the service default policy rule or custom policy rules are used. When set to {@code
     * DEFAULT}, the service applies the built-in tiering policy rule, which archives files larger
     * than 1 MB that have not been accessed for more than 30 days. When set to {@code CUSTOM}, the
     * service uses the policy rules configured in {@code rules}.
     *
     * @return the value
     */
    public PolicyMode getPolicyMode() {
        return policyMode;
    }

    /** Service-computed number of custom tiering policy rules. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleCount")
    private final Integer ruleCount;

    /**
     * Service-computed number of custom tiering policy rules.
     *
     * @return the value
     */
    public Integer getRuleCount() {
        return ruleCount;
    }

    /**
     * Custom tiering policy rules configured for the Lustre file system. This property is only
     * applicable when {@code policyMode} is {@code CUSTOM}. When {@code policyMode} is {@code
     * DEFAULT}, the service applies the built-in tiering policy rule instead. An enabled custom
     * policy contains 1 to 50 rules. When tiering is disabled, custom policy rules are optional.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<TieringPolicyRule> rules;

    /**
     * Custom tiering policy rules configured for the Lustre file system. This property is only
     * applicable when {@code policyMode} is {@code CUSTOM}. When {@code policyMode} is {@code
     * DEFAULT}, the service applies the built-in tiering policy rule instead. An enabled custom
     * policy contains 1 to 50 rules. When tiering is disabled, custom policy rules are optional.
     *
     * @return the value
     */
    public java.util.List<TieringPolicyRule> getRules() {
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
        sb.append("TieringConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", policyMode=").append(String.valueOf(this.policyMode));
        sb.append(", ruleCount=").append(String.valueOf(this.ruleCount));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TieringConfiguration)) {
            return false;
        }

        TieringConfiguration other = (TieringConfiguration) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.policyMode, other.policyMode)
                && java.util.Objects.equals(this.ruleCount, other.ruleCount)
                && java.util.Objects.equals(this.rules, other.rules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.policyMode == null ? 43 : this.policyMode.hashCode());
        result = (result * PRIME) + (this.ruleCount == null ? 43 : this.ruleCount.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
