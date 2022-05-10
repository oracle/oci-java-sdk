/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * MacroPivotField is used for the PivotField with macro expressions. It can contain the rules according to the macro pattern/attribute added and create new fields according to the PivotKeyValues
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacroPivotField.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MacroPivotField {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isUseSourceType")
        private Boolean isUseSourceType;

        public Builder isUseSourceType(Boolean isUseSourceType) {
            this.isUseSourceType = isUseSourceType;
            this.__explicitlySet__.add("isUseSourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expr")
        private Expression expr;

        public Builder expr(Expression expr) {
            this.expr = expr;
            this.__explicitlySet__.add("expr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("useType")
        private ConfiguredType useType;

        public Builder useType(ConfiguredType useType) {
            this.useType = useType;
            this.__explicitlySet__.add("useType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private BaseType type;

        public Builder type(BaseType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnNamePattern")
        private String columnNamePattern;

        public Builder columnNamePattern(String columnNamePattern) {
            this.columnNamePattern = columnNamePattern;
            this.__explicitlySet__.add("columnNamePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacroPivotField build() {
            MacroPivotField __instance__ =
                    new MacroPivotField(isUseSourceType, expr, useType, type, columnNamePattern);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacroPivotField o) {
            Builder copiedBuilder =
                    isUseSourceType(o.getIsUseSourceType())
                            .expr(o.getExpr())
                            .useType(o.getUseType())
                            .type(o.getType())
                            .columnNamePattern(o.getColumnNamePattern());

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
     * Specifies whether the type of macro fields is inferred from an expression or useType (false) or the source field (true).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUseSourceType")
    Boolean isUseSourceType;

    @com.fasterxml.jackson.annotation.JsonProperty("expr")
    Expression expr;

    @com.fasterxml.jackson.annotation.JsonProperty("useType")
    ConfiguredType useType;

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    BaseType type;

    /**
     * column name pattern can be used to generate the name structure of the generated columns. By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to the column name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnNamePattern")
    String columnNamePattern;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
