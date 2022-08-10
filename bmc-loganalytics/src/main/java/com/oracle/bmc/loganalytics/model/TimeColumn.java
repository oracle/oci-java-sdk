/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Time column returned when the shape of a queries results contsin a time series.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TimeColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TimeColumn extends AbstractColumn {
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
         * Time span betwwen each series data point.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private String span;

        /**
         * Time span betwwen each series data point.
         *
         * @param span the value to set
         * @return this builder
         **/
        public Builder span(String span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }
        /**
         * List of timestamps that represent each time stamp in the entire time series even if certain intervals are filtered out of query results.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("times")
        private java.util.List<Long> times;

        /**
         * List of timestamps that represent each time stamp in the entire time series even if certain intervals are filtered out of query results.
         *
         * @param times the value to set
         * @return this builder
         **/
        public Builder times(java.util.List<Long> times) {
            this.times = times;
            this.__explicitlySet__.add("times");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeColumn build() {
            TimeColumn model =
                    new TimeColumn(
                            this.displayName,
                            this.subSystem,
                            this.values,
                            this.isListOfValues,
                            this.isMultiValued,
                            this.isCaseSensitive,
                            this.isGroupable,
                            this.isEvaluable,
                            this.valueType,
                            this.originalDisplayName,
                            this.internalName,
                            this.span,
                            this.times);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeColumn model) {
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
            if (model.wasPropertyExplicitlySet("valueType")) {
                this.valueType(model.getValueType());
            }
            if (model.wasPropertyExplicitlySet("originalDisplayName")) {
                this.originalDisplayName(model.getOriginalDisplayName());
            }
            if (model.wasPropertyExplicitlySet("internalName")) {
                this.internalName(model.getInternalName());
            }
            if (model.wasPropertyExplicitlySet("span")) {
                this.span(model.getSpan());
            }
            if (model.wasPropertyExplicitlySet("times")) {
                this.times(model.getTimes());
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
    public TimeColumn(
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
            String span,
            java.util.List<Long> times) {
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
        this.span = span;
        this.times = times;
    }

    /**
     * Time span betwwen each series data point.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    private final String span;

    /**
     * Time span betwwen each series data point.
     *
     * @return the value
     **/
    public String getSpan() {
        return span;
    }

    /**
     * List of timestamps that represent each time stamp in the entire time series even if certain intervals are filtered out of query results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("times")
    private final java.util.List<Long> times;

    /**
     * List of timestamps that represent each time stamp in the entire time series even if certain intervals are filtered out of query results.
     *
     * @return the value
     **/
    public java.util.List<Long> getTimes() {
        return times;
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
        sb.append("TimeColumn(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", span=").append(String.valueOf(this.span));
        sb.append(", times=").append(String.valueOf(this.times));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeColumn)) {
            return false;
        }

        TimeColumn other = (TimeColumn) o;
        return java.util.Objects.equals(this.span, other.span)
                && java.util.Objects.equals(this.times, other.times)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.span == null ? 43 : this.span.hashCode());
        result = (result * PRIME) + (this.times == null ? 43 : this.times.hashCode());
        return result;
    }
}
