/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A data series specific to a particular link output field.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChartDataColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChartDataColumn extends AbstractColumn {
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
        /**
         * Data points for each timestamp for a specific link field un-filtered.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataItems")
        private java.util.List<Object> dataItems;

        /**
         * Data points for each timestamp for a specific link field un-filtered.
         *
         * @param dataItems the value to set
         * @return this builder
         **/
        public Builder dataItems(java.util.List<Object> dataItems) {
            this.dataItems = dataItems;
            this.__explicitlySet__.add("dataItems");
            return this;
        }
        /**
         * Data points filtered by query string. May not contain data points for each timestamp due to filtering.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filteredDataItems")
        private java.util.List<Object> filteredDataItems;

        /**
         * Data points filtered by query string. May not contain data points for each timestamp due to filtering.
         *
         * @param filteredDataItems the value to set
         * @return this builder
         **/
        public Builder filteredDataItems(java.util.List<Object> filteredDataItems) {
            this.filteredDataItems = filteredDataItems;
            this.__explicitlySet__.add("filteredDataItems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChartDataColumn build() {
            ChartDataColumn model =
                    new ChartDataColumn(
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
                            this.dataItems,
                            this.filteredDataItems);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChartDataColumn model) {
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
            if (model.wasPropertyExplicitlySet("dataItems")) {
                this.dataItems(model.getDataItems());
            }
            if (model.wasPropertyExplicitlySet("filteredDataItems")) {
                this.filteredDataItems(model.getFilteredDataItems());
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

    @Deprecated
    public ChartDataColumn(
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
            java.util.List<Object> dataItems,
            java.util.List<Object> filteredDataItems) {
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
        this.dataItems = dataItems;
        this.filteredDataItems = filteredDataItems;
    }

    /**
     * Data points for each timestamp for a specific link field un-filtered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataItems")
    private final java.util.List<Object> dataItems;

    /**
     * Data points for each timestamp for a specific link field un-filtered.
     *
     * @return the value
     **/
    public java.util.List<Object> getDataItems() {
        return dataItems;
    }

    /**
     * Data points filtered by query string. May not contain data points for each timestamp due to filtering.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filteredDataItems")
    private final java.util.List<Object> filteredDataItems;

    /**
     * Data points filtered by query string. May not contain data points for each timestamp due to filtering.
     *
     * @return the value
     **/
    public java.util.List<Object> getFilteredDataItems() {
        return filteredDataItems;
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
        sb.append("ChartDataColumn(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dataItems=").append(String.valueOf(this.dataItems));
        sb.append(", filteredDataItems=").append(String.valueOf(this.filteredDataItems));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChartDataColumn)) {
            return false;
        }

        ChartDataColumn other = (ChartDataColumn) o;
        return java.util.Objects.equals(this.dataItems, other.dataItems)
                && java.util.Objects.equals(this.filteredDataItems, other.filteredDataItems)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dataItems == null ? 43 : this.dataItems.hashCode());
        result =
                (result * PRIME)
                        + (this.filteredDataItems == null ? 43 : this.filteredDataItems.hashCode());
        return result;
    }
}
