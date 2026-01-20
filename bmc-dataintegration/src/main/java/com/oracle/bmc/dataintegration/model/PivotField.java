/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The type representing the pivot field. Pivot fields have an expression to define a macro and a
 * pattern to generate the column name <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PivotField.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PivotField extends TypedObject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /**
         * column name pattern can be used to generate the name structure of the generated columns.
         * By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but
         * we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX
         * or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and
         * suffix to the column name.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("columnNamePattern")
        private String columnNamePattern;

        /**
         * column name pattern can be used to generate the name structure of the generated columns.
         * By default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but
         * we can change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX
         * or MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and
         * suffix to the column name.
         *
         * @param columnNamePattern the value to set
         * @return this builder
         */
        public Builder columnNamePattern(String columnNamePattern) {
            this.columnNamePattern = columnNamePattern;
            this.__explicitlySet__.add("columnNamePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PivotField build() {
            PivotField model =
                    new PivotField(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.objectStatus,
                            this.name,
                            this.description,
                            this.expr,
                            this.useType,
                            this.type,
                            this.columnNamePattern);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PivotField model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("expr")) {
                this.expr(model.getExpr());
            }
            if (model.wasPropertyExplicitlySet("useType")) {
                this.useType(model.getUseType());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("columnNamePattern")) {
                this.columnNamePattern(model.getColumnNamePattern());
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

    @Deprecated
    public PivotField(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            Expression expr,
            ConfiguredType useType,
            BaseType type,
            String columnNamePattern) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.expr = expr;
        this.useType = useType;
        this.type = type;
        this.columnNamePattern = columnNamePattern;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("expr")
    private final Expression expr;

    public Expression getExpr() {
        return expr;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("useType")
    private final ConfiguredType useType;

    public ConfiguredType getUseType() {
        return useType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final BaseType type;

    public BaseType getType() {
        return type;
    }

    /**
     * column name pattern can be used to generate the name structure of the generated columns. By
     * default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can
     * change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or
     * MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to
     * the column name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("columnNamePattern")
    private final String columnNamePattern;

    /**
     * column name pattern can be used to generate the name structure of the generated columns. By
     * default column names are of %PIVOT_KEY_VALUE% or %MACRO_INPUT%_%PIVOT_KEY_VALUE%, but we can
     * change it something by passing something like MY_PREFIX%PIVOT_KEY_VALUE%MY_SUFFIX or
     * MY_PREFIX%MACRO_INPUT%_%PIVOT_KEY_VALUE%MY_SUFFIX which will add custom prefix and suffix to
     * the column name.
     *
     * @return the value
     */
    public String getColumnNamePattern() {
        return columnNamePattern;
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
        sb.append("PivotField(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", expr=").append(String.valueOf(this.expr));
        sb.append(", useType=").append(String.valueOf(this.useType));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", columnNamePattern=").append(String.valueOf(this.columnNamePattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PivotField)) {
            return false;
        }

        PivotField other = (PivotField) o;
        return java.util.Objects.equals(this.expr, other.expr)
                && java.util.Objects.equals(this.useType, other.useType)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.columnNamePattern, other.columnNamePattern)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.expr == null ? 43 : this.expr.hashCode());
        result = (result * PRIME) + (this.useType == null ? 43 : this.useType.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.columnNamePattern == null ? 43 : this.columnNamePattern.hashCode());
        return result;
    }
}
