/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Filters that are applied to the data at the column level.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ColumnFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ColumnFilter extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "fieldName",
        "operator",
        "expressions",
        "isEnabled",
        "isHidden"
    })
    public ColumnFilter(
            String fieldName,
            Operator operator,
            java.util.List<String> expressions,
            Boolean isEnabled,
            Boolean isHidden) {
        super();
        this.fieldName = fieldName;
        this.operator = operator;
        this.expressions = expressions;
        this.isEnabled = isEnabled;
        this.isHidden = isHidden;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the column on which the filter must be applied.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * Name of the column on which the filter must be applied.
         * @param fieldName the value to set
         * @return this builder
         **/
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * Specifies the type of operator that must be applied for example in, eq etc.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private Operator operator;

        /**
         * Specifies the type of operator that must be applied for example in, eq etc.
         * @param operator the value to set
         * @return this builder
         **/
        public Builder operator(Operator operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /**
         * An array of expressions based on the operator type. A filter may have one or more expressions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expressions")
        private java.util.List<String> expressions;

        /**
         * An array of expressions based on the operator type. A filter may have one or more expressions.
         * @param expressions the value to set
         * @return this builder
         **/
        public Builder expressions(java.util.List<String> expressions) {
            this.expressions = expressions;
            this.__explicitlySet__.add("expressions");
            return this;
        }
        /**
         * Indicates whether the filter is enabled. Values can either be 'true' or 'false'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Indicates whether the filter is enabled. Values can either be 'true' or 'false'.
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * Indicates whether the filter is hidden. Values can either be 'true' or 'false'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        /**
         * Indicates whether the filter is hidden. Values can either be 'true' or 'false'.
         * @param isHidden the value to set
         * @return this builder
         **/
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ColumnFilter build() {
            ColumnFilter model =
                    new ColumnFilter(
                            this.fieldName,
                            this.operator,
                            this.expressions,
                            this.isEnabled,
                            this.isHidden);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ColumnFilter model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("expressions")) {
                this.expressions(model.getExpressions());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
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
     * Name of the column on which the filter must be applied.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * Name of the column on which the filter must be applied.
     * @return the value
     **/
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Specifies the type of operator that must be applied for example in, eq etc.
     **/
    public enum Operator {
        In("IN"),
        Eq("EQ"),
        Gt("GT"),
        Ge("GE"),
        Lt("LT"),
        Le("LE"),
        And("AND"),
        Or("OR"),
        Ne("NE"),
        Co("CO"),
        Not("NOT"),
        NotIn("NOT_IN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Operator.class);

        private final String value;
        private static java.util.Map<String, Operator> map;

        static {
            map = new java.util.HashMap<>();
            for (Operator v : Operator.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operator(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operator create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operator', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies the type of operator that must be applied for example in, eq etc.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final Operator operator;

    /**
     * Specifies the type of operator that must be applied for example in, eq etc.
     * @return the value
     **/
    public Operator getOperator() {
        return operator;
    }

    /**
     * An array of expressions based on the operator type. A filter may have one or more expressions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expressions")
    private final java.util.List<String> expressions;

    /**
     * An array of expressions based on the operator type. A filter may have one or more expressions.
     * @return the value
     **/
    public java.util.List<String> getExpressions() {
        return expressions;
    }

    /**
     * Indicates whether the filter is enabled. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Indicates whether the filter is enabled. Values can either be 'true' or 'false'.
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Indicates whether the filter is hidden. Values can either be 'true' or 'false'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    /**
     * Indicates whether the filter is hidden. Values can either be 'true' or 'false'.
     * @return the value
     **/
    public Boolean getIsHidden() {
        return isHidden;
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
        sb.append("ColumnFilter(");
        sb.append("super=").append(super.toString());
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", expressions=").append(String.valueOf(this.expressions));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColumnFilter)) {
            return false;
        }

        ColumnFilter other = (ColumnFilter) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.expressions, other.expressions)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result = (result * PRIME) + (this.expressions == null ? 43 : this.expressions.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
