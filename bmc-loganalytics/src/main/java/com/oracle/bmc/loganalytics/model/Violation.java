/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Violation <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Violation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Violation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "indexes",
        "ruleDescription",
        "ruleName",
        "ruleRemediation",
        "ruleType"
    })
    public Violation(
            java.util.List<Indexes> indexes,
            String ruleDescription,
            String ruleName,
            String ruleRemediation,
            RuleType ruleType) {
        super();
        this.indexes = indexes;
        this.ruleDescription = ruleDescription;
        this.ruleName = ruleName;
        this.ruleRemediation = ruleRemediation;
        this.ruleType = ruleType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The indices associated with regular expression violations. */
        @com.fasterxml.jackson.annotation.JsonProperty("indexes")
        private java.util.List<Indexes> indexes;

        /**
         * The indices associated with regular expression violations.
         *
         * @param indexes the value to set
         * @return this builder
         */
        public Builder indexes(java.util.List<Indexes> indexes) {
            this.indexes = indexes;
            this.__explicitlySet__.add("indexes");
            return this;
        }
        /** The rule description. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleDescription")
        private String ruleDescription;

        /**
         * The rule description.
         *
         * @param ruleDescription the value to set
         * @return this builder
         */
        public Builder ruleDescription(String ruleDescription) {
            this.ruleDescription = ruleDescription;
            this.__explicitlySet__.add("ruleDescription");
            return this;
        }
        /** The rule name. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
        private String ruleName;

        /**
         * The rule name.
         *
         * @param ruleName the value to set
         * @return this builder
         */
        public Builder ruleName(String ruleName) {
            this.ruleName = ruleName;
            this.__explicitlySet__.add("ruleName");
            return this;
        }
        /** The rule remediation. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleRemediation")
        private String ruleRemediation;

        /**
         * The rule remediation.
         *
         * @param ruleRemediation the value to set
         * @return this builder
         */
        public Builder ruleRemediation(String ruleRemediation) {
            this.ruleRemediation = ruleRemediation;
            this.__explicitlySet__.add("ruleRemediation");
            return this;
        }
        /** The rule type. Either WARN or ERROR. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
        private RuleType ruleType;

        /**
         * The rule type. Either WARN or ERROR.
         *
         * @param ruleType the value to set
         * @return this builder
         */
        public Builder ruleType(RuleType ruleType) {
            this.ruleType = ruleType;
            this.__explicitlySet__.add("ruleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Violation build() {
            Violation model =
                    new Violation(
                            this.indexes,
                            this.ruleDescription,
                            this.ruleName,
                            this.ruleRemediation,
                            this.ruleType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Violation model) {
            if (model.wasPropertyExplicitlySet("indexes")) {
                this.indexes(model.getIndexes());
            }
            if (model.wasPropertyExplicitlySet("ruleDescription")) {
                this.ruleDescription(model.getRuleDescription());
            }
            if (model.wasPropertyExplicitlySet("ruleName")) {
                this.ruleName(model.getRuleName());
            }
            if (model.wasPropertyExplicitlySet("ruleRemediation")) {
                this.ruleRemediation(model.getRuleRemediation());
            }
            if (model.wasPropertyExplicitlySet("ruleType")) {
                this.ruleType(model.getRuleType());
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

    /** The indices associated with regular expression violations. */
    @com.fasterxml.jackson.annotation.JsonProperty("indexes")
    private final java.util.List<Indexes> indexes;

    /**
     * The indices associated with regular expression violations.
     *
     * @return the value
     */
    public java.util.List<Indexes> getIndexes() {
        return indexes;
    }

    /** The rule description. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleDescription")
    private final String ruleDescription;

    /**
     * The rule description.
     *
     * @return the value
     */
    public String getRuleDescription() {
        return ruleDescription;
    }

    /** The rule name. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleName")
    private final String ruleName;

    /**
     * The rule name.
     *
     * @return the value
     */
    public String getRuleName() {
        return ruleName;
    }

    /** The rule remediation. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleRemediation")
    private final String ruleRemediation;

    /**
     * The rule remediation.
     *
     * @return the value
     */
    public String getRuleRemediation() {
        return ruleRemediation;
    }

    /** The rule type. Either WARN or ERROR. */
    public enum RuleType implements com.oracle.bmc.http.internal.BmcEnum {
        Warn("WARN"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RuleType.class);

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
    /** The rule type. Either WARN or ERROR. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
    private final RuleType ruleType;

    /**
     * The rule type. Either WARN or ERROR.
     *
     * @return the value
     */
    public RuleType getRuleType() {
        return ruleType;
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
        sb.append("Violation(");
        sb.append("super=").append(super.toString());
        sb.append("indexes=").append(String.valueOf(this.indexes));
        sb.append(", ruleDescription=").append(String.valueOf(this.ruleDescription));
        sb.append(", ruleName=").append(String.valueOf(this.ruleName));
        sb.append(", ruleRemediation=").append(String.valueOf(this.ruleRemediation));
        sb.append(", ruleType=").append(String.valueOf(this.ruleType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Violation)) {
            return false;
        }

        Violation other = (Violation) o;
        return java.util.Objects.equals(this.indexes, other.indexes)
                && java.util.Objects.equals(this.ruleDescription, other.ruleDescription)
                && java.util.Objects.equals(this.ruleName, other.ruleName)
                && java.util.Objects.equals(this.ruleRemediation, other.ruleRemediation)
                && java.util.Objects.equals(this.ruleType, other.ruleType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.indexes == null ? 43 : this.indexes.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleDescription == null ? 43 : this.ruleDescription.hashCode());
        result = (result * PRIME) + (this.ruleName == null ? 43 : this.ruleName.hashCode());
        result =
                (result * PRIME)
                        + (this.ruleRemediation == null ? 43 : this.ruleRemediation.hashCode());
        result = (result * PRIME) + (this.ruleType == null ? 43 : this.ruleType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
