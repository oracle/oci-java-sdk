/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Column containing query results produced by the query language classify command.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClassifyColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClassifyColumn extends AbstractColumn {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
        private SubSystemName subSystem;

        public Builder subSystem(SubSystemName subSystem) {
            this.subSystem = subSystem;
            this.__explicitlySet__.add("subSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("values")
        private java.util.List<FieldValue> values;

        public Builder values(java.util.List<FieldValue> values) {
            this.values = values;
            this.__explicitlySet__.add("values");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isListOfValues")
        private Boolean isListOfValues;

        public Builder isListOfValues(Boolean isListOfValues) {
            this.isListOfValues = isListOfValues;
            this.__explicitlySet__.add("isListOfValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
        private Boolean isCaseSensitive;

        public Builder isCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            this.__explicitlySet__.add("isCaseSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
        private Boolean isGroupable;

        public Builder isGroupable(Boolean isGroupable) {
            this.isGroupable = isGroupable;
            this.__explicitlySet__.add("isGroupable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEvaluable")
        private Boolean isEvaluable;

        public Builder isEvaluable(Boolean isEvaluable) {
            this.isEvaluable = isEvaluable;
            this.__explicitlySet__.add("isEvaluable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayName")
        private String originalDisplayName;

        public Builder originalDisplayName(String originalDisplayName) {
            this.originalDisplayName = originalDisplayName;
            this.__explicitlySet__.add("originalDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }
        /**
         * A list of fields specified in the classify command in the query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyFieldNames")
        private java.util.List<String> classifyFieldNames;

        /**
         * A list of fields specified in the classify command in the query string.
         *
         * @param classifyFieldNames the value to set
         * @return this builder
         **/
        public Builder classifyFieldNames(java.util.List<String> classifyFieldNames) {
            this.classifyFieldNames = classifyFieldNames;
            this.__explicitlySet__.add("classifyFieldNames");
            return this;
        }
        /**
         * Count of nulls found in each of the fields specified in the classify command in the query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyFieldNullCount")
        private java.util.List<Long> classifyFieldNullCount;

        /**
         * Count of nulls found in each of the fields specified in the classify command in the query string.
         *
         * @param classifyFieldNullCount the value to set
         * @return this builder
         **/
        public Builder classifyFieldNullCount(java.util.List<Long> classifyFieldNullCount) {
            this.classifyFieldNullCount = classifyFieldNullCount;
            this.__explicitlySet__.add("classifyFieldNullCount");
            return this;
        }
        /**
         * Count of anomalies for each timeseries datapoint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyAnomalyIntervalCounts")
        private java.util.List<Long> classifyAnomalyIntervalCounts;

        /**
         * Count of anomalies for each timeseries datapoint.
         *
         * @param classifyAnomalyIntervalCounts the value to set
         * @return this builder
         **/
        public Builder classifyAnomalyIntervalCounts(
                java.util.List<Long> classifyAnomalyIntervalCounts) {
            this.classifyAnomalyIntervalCounts = classifyAnomalyIntervalCounts;
            this.__explicitlySet__.add("classifyAnomalyIntervalCounts");
            return this;
        }
        /**
         * Column descriptors for the classify result.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyColumns")
        private java.util.List<AbstractColumn> classifyColumns;

        /**
         * Column descriptors for the classify result.
         *
         * @param classifyColumns the value to set
         * @return this builder
         **/
        public Builder classifyColumns(java.util.List<AbstractColumn> classifyColumns) {
            this.classifyColumns = classifyColumns;
            this.__explicitlySet__.add("classifyColumns");
            return this;
        }
        /**
         * Results of the classify command.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyResult")
        private java.util.List<java.util.Map<String, Object>> classifyResult;

        /**
         * Results of the classify command.
         *
         * @param classifyResult the value to set
         * @return this builder
         **/
        public Builder classifyResult(
                java.util.List<java.util.Map<String, Object>> classifyResult) {
            this.classifyResult = classifyResult;
            this.__explicitlySet__.add("classifyResult");
            return this;
        }
        /**
         * Column descriptors of fields with strong correlation with the classify fields.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyCorrelateColumns")
        private java.util.List<AbstractColumn> classifyCorrelateColumns;

        /**
         * Column descriptors of fields with strong correlation with the classify fields.
         *
         * @param classifyCorrelateColumns the value to set
         * @return this builder
         **/
        public Builder classifyCorrelateColumns(
                java.util.List<AbstractColumn> classifyCorrelateColumns) {
            this.classifyCorrelateColumns = classifyCorrelateColumns;
            this.__explicitlySet__.add("classifyCorrelateColumns");
            return this;
        }
        /**
         * Correlation results of the classify command.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classifyCorrelateResult")
        private java.util.List<java.util.Map<String, Object>> classifyCorrelateResult;

        /**
         * Correlation results of the classify command.
         *
         * @param classifyCorrelateResult the value to set
         * @return this builder
         **/
        public Builder classifyCorrelateResult(
                java.util.List<java.util.Map<String, Object>> classifyCorrelateResult) {
            this.classifyCorrelateResult = classifyCorrelateResult;
            this.__explicitlySet__.add("classifyCorrelateResult");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClassifyColumn build() {
            ClassifyColumn __instance__ =
                    new ClassifyColumn(
                            displayName,
                            subSystem,
                            values,
                            isListOfValues,
                            isMultiValued,
                            isCaseSensitive,
                            isGroupable,
                            isEvaluable,
                            valueType,
                            originalDisplayName,
                            internalName,
                            classifyFieldNames,
                            classifyFieldNullCount,
                            classifyAnomalyIntervalCounts,
                            classifyColumns,
                            classifyResult,
                            classifyCorrelateColumns,
                            classifyCorrelateResult);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClassifyColumn o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .subSystem(o.getSubSystem())
                            .values(o.getValues())
                            .isListOfValues(o.getIsListOfValues())
                            .isMultiValued(o.getIsMultiValued())
                            .isCaseSensitive(o.getIsCaseSensitive())
                            .isGroupable(o.getIsGroupable())
                            .isEvaluable(o.getIsEvaluable())
                            .valueType(o.getValueType())
                            .originalDisplayName(o.getOriginalDisplayName())
                            .internalName(o.getInternalName())
                            .classifyFieldNames(o.getClassifyFieldNames())
                            .classifyFieldNullCount(o.getClassifyFieldNullCount())
                            .classifyAnomalyIntervalCounts(o.getClassifyAnomalyIntervalCounts())
                            .classifyColumns(o.getClassifyColumns())
                            .classifyResult(o.getClassifyResult())
                            .classifyCorrelateColumns(o.getClassifyCorrelateColumns())
                            .classifyCorrelateResult(o.getClassifyCorrelateResult());

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

    @Deprecated
    public ClassifyColumn(
            String displayName,
            SubSystemName subSystem,
            java.util.List<FieldValue> values,
            Boolean isListOfValues,
            Boolean isMultiValued,
            Boolean isCaseSensitive,
            Boolean isGroupable,
            Boolean isEvaluable,
            ValueType valueType,
            String originalDisplayName,
            String internalName,
            java.util.List<String> classifyFieldNames,
            java.util.List<Long> classifyFieldNullCount,
            java.util.List<Long> classifyAnomalyIntervalCounts,
            java.util.List<AbstractColumn> classifyColumns,
            java.util.List<java.util.Map<String, Object>> classifyResult,
            java.util.List<AbstractColumn> classifyCorrelateColumns,
            java.util.List<java.util.Map<String, Object>> classifyCorrelateResult) {
        super(
                displayName,
                subSystem,
                values,
                isListOfValues,
                isMultiValued,
                isCaseSensitive,
                isGroupable,
                isEvaluable,
                valueType,
                originalDisplayName,
                internalName);
        this.classifyFieldNames = classifyFieldNames;
        this.classifyFieldNullCount = classifyFieldNullCount;
        this.classifyAnomalyIntervalCounts = classifyAnomalyIntervalCounts;
        this.classifyColumns = classifyColumns;
        this.classifyResult = classifyResult;
        this.classifyCorrelateColumns = classifyCorrelateColumns;
        this.classifyCorrelateResult = classifyCorrelateResult;
    }

    /**
     * A list of fields specified in the classify command in the query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyFieldNames")
    private final java.util.List<String> classifyFieldNames;

    /**
     * A list of fields specified in the classify command in the query string.
     *
     * @return the value
     **/
    public java.util.List<String> getClassifyFieldNames() {
        return classifyFieldNames;
    }

    /**
     * Count of nulls found in each of the fields specified in the classify command in the query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyFieldNullCount")
    private final java.util.List<Long> classifyFieldNullCount;

    /**
     * Count of nulls found in each of the fields specified in the classify command in the query string.
     *
     * @return the value
     **/
    public java.util.List<Long> getClassifyFieldNullCount() {
        return classifyFieldNullCount;
    }

    /**
     * Count of anomalies for each timeseries datapoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyAnomalyIntervalCounts")
    private final java.util.List<Long> classifyAnomalyIntervalCounts;

    /**
     * Count of anomalies for each timeseries datapoint.
     *
     * @return the value
     **/
    public java.util.List<Long> getClassifyAnomalyIntervalCounts() {
        return classifyAnomalyIntervalCounts;
    }

    /**
     * Column descriptors for the classify result.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyColumns")
    private final java.util.List<AbstractColumn> classifyColumns;

    /**
     * Column descriptors for the classify result.
     *
     * @return the value
     **/
    public java.util.List<AbstractColumn> getClassifyColumns() {
        return classifyColumns;
    }

    /**
     * Results of the classify command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyResult")
    private final java.util.List<java.util.Map<String, Object>> classifyResult;

    /**
     * Results of the classify command.
     *
     * @return the value
     **/
    public java.util.List<java.util.Map<String, Object>> getClassifyResult() {
        return classifyResult;
    }

    /**
     * Column descriptors of fields with strong correlation with the classify fields.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyCorrelateColumns")
    private final java.util.List<AbstractColumn> classifyCorrelateColumns;

    /**
     * Column descriptors of fields with strong correlation with the classify fields.
     *
     * @return the value
     **/
    public java.util.List<AbstractColumn> getClassifyCorrelateColumns() {
        return classifyCorrelateColumns;
    }

    /**
     * Correlation results of the classify command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classifyCorrelateResult")
    private final java.util.List<java.util.Map<String, Object>> classifyCorrelateResult;

    /**
     * Correlation results of the classify command.
     *
     * @return the value
     **/
    public java.util.List<java.util.Map<String, Object>> getClassifyCorrelateResult() {
        return classifyCorrelateResult;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ClassifyColumn(");
        sb.append("super=").append(super.toString());
        sb.append(", classifyFieldNames=").append(String.valueOf(this.classifyFieldNames));
        sb.append(", classifyFieldNullCount=").append(String.valueOf(this.classifyFieldNullCount));
        sb.append(", classifyAnomalyIntervalCounts=")
                .append(String.valueOf(this.classifyAnomalyIntervalCounts));
        sb.append(", classifyColumns=").append(String.valueOf(this.classifyColumns));
        sb.append(", classifyResult=").append(String.valueOf(this.classifyResult));
        sb.append(", classifyCorrelateColumns=")
                .append(String.valueOf(this.classifyCorrelateColumns));
        sb.append(", classifyCorrelateResult=")
                .append(String.valueOf(this.classifyCorrelateResult));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClassifyColumn)) {
            return false;
        }

        ClassifyColumn other = (ClassifyColumn) o;
        return java.util.Objects.equals(this.classifyFieldNames, other.classifyFieldNames)
                && java.util.Objects.equals(
                        this.classifyFieldNullCount, other.classifyFieldNullCount)
                && java.util.Objects.equals(
                        this.classifyAnomalyIntervalCounts, other.classifyAnomalyIntervalCounts)
                && java.util.Objects.equals(this.classifyColumns, other.classifyColumns)
                && java.util.Objects.equals(this.classifyResult, other.classifyResult)
                && java.util.Objects.equals(
                        this.classifyCorrelateColumns, other.classifyCorrelateColumns)
                && java.util.Objects.equals(
                        this.classifyCorrelateResult, other.classifyCorrelateResult)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.classifyFieldNames == null
                                ? 43
                                : this.classifyFieldNames.hashCode());
        result =
                (result * PRIME)
                        + (this.classifyFieldNullCount == null
                                ? 43
                                : this.classifyFieldNullCount.hashCode());
        result =
                (result * PRIME)
                        + (this.classifyAnomalyIntervalCounts == null
                                ? 43
                                : this.classifyAnomalyIntervalCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.classifyColumns == null ? 43 : this.classifyColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.classifyResult == null ? 43 : this.classifyResult.hashCode());
        result =
                (result * PRIME)
                        + (this.classifyCorrelateColumns == null
                                ? 43
                                : this.classifyCorrelateColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.classifyCorrelateResult == null
                                ? 43
                                : this.classifyCorrelateResult.hashCode());
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
