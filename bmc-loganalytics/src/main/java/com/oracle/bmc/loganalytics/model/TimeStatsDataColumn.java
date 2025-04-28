/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A data series specific to a particular TIMESTATS output field. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TimeStatsDataColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TimeStatsDataColumn extends AbstractColumn {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
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
        /** Column descriptors for the TIMESTATS result. */
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<AbstractColumn> columns;

        /**
         * Column descriptors for the TIMESTATS result.
         *
         * @param columns the value to set
         * @return this builder
         */
        public Builder columns(java.util.List<AbstractColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /** Results of the TIMESTATS command. */
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private java.util.List<java.util.Map<String, Object>> result;

        /**
         * Results of the TIMESTATS command.
         *
         * @param result the value to set
         * @return this builder
         */
        public Builder result(java.util.List<java.util.Map<String, Object>> result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /** Number of timeseries returned by the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
        private Integer resultCount;

        /**
         * Number of timeseries returned by the query.
         *
         * @param resultCount the value to set
         * @return this builder
         */
        public Builder resultCount(Integer resultCount) {
            this.resultCount = resultCount;
            this.__explicitlySet__.add("resultCount");
            return this;
        }
        /** Number of timeseries retrieved by the query. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * Number of timeseries retrieved by the query.
         *
         * @param totalCount the value to set
         * @return this builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }
        /** True if query did not complete processing all data. */
        @com.fasterxml.jackson.annotation.JsonProperty("partialResults")
        private Boolean partialResults;

        /**
         * True if query did not complete processing all data.
         *
         * @param partialResults the value to set
         * @return this builder
         */
        public Builder partialResults(Boolean partialResults) {
            this.partialResults = partialResults;
            this.__explicitlySet__.add("partialResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeStatsDataColumn build() {
            TimeStatsDataColumn model =
                    new TimeStatsDataColumn(
                            this.displayName,
                            this.subSystem,
                            this.values,
                            this.isListOfValues,
                            this.isMultiValued,
                            this.isCaseSensitive,
                            this.isGroupable,
                            this.isEvaluable,
                            this.isHidden,
                            this.valueType,
                            this.originalDisplayName,
                            this.internalName,
                            this.columns,
                            this.result,
                            this.resultCount,
                            this.totalCount,
                            this.partialResults);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeStatsDataColumn model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("subSystem")) {
                this.subSystem(model.getSubSystem());
            }
            if (model.wasPropertyExplicitlySet("values")) {
                this.values(model.getValues());
            }
            if (model.wasPropertyExplicitlySet("isListOfValues")) {
                this.isListOfValues(model.getIsListOfValues());
            }
            if (model.wasPropertyExplicitlySet("isMultiValued")) {
                this.isMultiValued(model.getIsMultiValued());
            }
            if (model.wasPropertyExplicitlySet("isCaseSensitive")) {
                this.isCaseSensitive(model.getIsCaseSensitive());
            }
            if (model.wasPropertyExplicitlySet("isGroupable")) {
                this.isGroupable(model.getIsGroupable());
            }
            if (model.wasPropertyExplicitlySet("isEvaluable")) {
                this.isEvaluable(model.getIsEvaluable());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("originalDisplayName")) {
                this.originalDisplayName(model.getOriginalDisplayName());
            }
            if (model.wasPropertyExplicitlySet("internalName")) {
                this.internalName(model.getInternalName());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("resultCount")) {
                this.resultCount(model.getResultCount());
            }
            if (model.wasPropertyExplicitlySet("totalCount")) {
                this.totalCount(model.getTotalCount());
            }
            if (model.wasPropertyExplicitlySet("partialResults")) {
                this.partialResults(model.getPartialResults());
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
    public TimeStatsDataColumn(
            String displayName,
            SubSystemName subSystem,
            java.util.List<FieldValue> values,
            Boolean isListOfValues,
            Boolean isMultiValued,
            Boolean isCaseSensitive,
            Boolean isGroupable,
            Boolean isEvaluable,
            Boolean isHidden,
            ValueType valueType,
            String originalDisplayName,
            String internalName,
            java.util.List<AbstractColumn> columns,
            java.util.List<java.util.Map<String, Object>> result,
            Integer resultCount,
            Integer totalCount,
            Boolean partialResults) {
        super(
                displayName,
                subSystem,
                values,
                isListOfValues,
                isMultiValued,
                isCaseSensitive,
                isGroupable,
                isEvaluable,
                isHidden,
                valueType,
                originalDisplayName,
                internalName);
        this.columns = columns;
        this.result = result;
        this.resultCount = resultCount;
        this.totalCount = totalCount;
        this.partialResults = partialResults;
    }

    /** Column descriptors for the TIMESTATS result. */
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<AbstractColumn> columns;

    /**
     * Column descriptors for the TIMESTATS result.
     *
     * @return the value
     */
    public java.util.List<AbstractColumn> getColumns() {
        return columns;
    }

    /** Results of the TIMESTATS command. */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final java.util.List<java.util.Map<String, Object>> result;

    /**
     * Results of the TIMESTATS command.
     *
     * @return the value
     */
    public java.util.List<java.util.Map<String, Object>> getResult() {
        return result;
    }

    /** Number of timeseries returned by the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("resultCount")
    private final Integer resultCount;

    /**
     * Number of timeseries returned by the query.
     *
     * @return the value
     */
    public Integer getResultCount() {
        return resultCount;
    }

    /** Number of timeseries retrieved by the query. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * Number of timeseries retrieved by the query.
     *
     * @return the value
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /** True if query did not complete processing all data. */
    @com.fasterxml.jackson.annotation.JsonProperty("partialResults")
    private final Boolean partialResults;

    /**
     * True if query did not complete processing all data.
     *
     * @return the value
     */
    public Boolean getPartialResults() {
        return partialResults;
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
        sb.append("TimeStatsDataColumn(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", resultCount=").append(String.valueOf(this.resultCount));
        sb.append(", totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", partialResults=").append(String.valueOf(this.partialResults));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeStatsDataColumn)) {
            return false;
        }

        TimeStatsDataColumn other = (TimeStatsDataColumn) o;
        return java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.resultCount, other.resultCount)
                && java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.partialResults, other.partialResults)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result = (result * PRIME) + (this.resultCount == null ? 43 : this.resultCount.hashCode());
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.partialResults == null ? 43 : this.partialResults.hashCode());
        return result;
    }
}
