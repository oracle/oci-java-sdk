/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Result column that contains a table within each row. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TableColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TableColumn extends AbstractColumn {
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
        /** Column descriptors for the table result. */
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<AbstractColumn> columns;

        /**
         * Column descriptors for the table result.
         *
         * @param columns the value to set
         * @return this builder
         */
        public Builder columns(java.util.List<AbstractColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /** Results data of the table. */
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private java.util.List<java.util.Map<String, Object>> result;

        /**
         * Results data of the table.
         *
         * @param result the value to set
         * @return this builder
         */
        public Builder result(java.util.List<java.util.Map<String, Object>> result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /** True if query did not complete processing all data. */
        @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
        private Boolean arePartialResults;

        /**
         * True if query did not complete processing all data.
         *
         * @param arePartialResults the value to set
         * @return this builder
         */
        public Builder arePartialResults(Boolean arePartialResults) {
            this.arePartialResults = arePartialResults;
            this.__explicitlySet__.add("arePartialResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TableColumn build() {
            TableColumn model =
                    new TableColumn(
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
                            this.arePartialResults);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TableColumn model) {
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
            if (model.wasPropertyExplicitlySet("arePartialResults")) {
                this.arePartialResults(model.getArePartialResults());
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
    public TableColumn(
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
            Boolean arePartialResults) {
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
        this.arePartialResults = arePartialResults;
    }

    /** Column descriptors for the table result. */
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<AbstractColumn> columns;

    /**
     * Column descriptors for the table result.
     *
     * @return the value
     */
    public java.util.List<AbstractColumn> getColumns() {
        return columns;
    }

    /** Results data of the table. */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final java.util.List<java.util.Map<String, Object>> result;

    /**
     * Results data of the table.
     *
     * @return the value
     */
    public java.util.List<java.util.Map<String, Object>> getResult() {
        return result;
    }

    /** True if query did not complete processing all data. */
    @com.fasterxml.jackson.annotation.JsonProperty("arePartialResults")
    private final Boolean arePartialResults;

    /**
     * True if query did not complete processing all data.
     *
     * @return the value
     */
    public Boolean getArePartialResults() {
        return arePartialResults;
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
        sb.append("TableColumn(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", arePartialResults=").append(String.valueOf(this.arePartialResults));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TableColumn)) {
            return false;
        }

        TableColumn other = (TableColumn) o;
        return java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.arePartialResults, other.arePartialResults)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result =
                (result * PRIME)
                        + (this.arePartialResults == null ? 43 : this.arePartialResults.hashCode());
        return result;
    }
}
