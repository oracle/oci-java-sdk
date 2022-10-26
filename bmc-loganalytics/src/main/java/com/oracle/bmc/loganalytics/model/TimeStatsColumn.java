/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Column returned by querylanguage TIMESTATS command. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TimeStatsColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TimeStatsColumn extends AbstractColumn {
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
        /** Time span between each timestamp in the timeseries datapoints. */
        @com.fasterxml.jackson.annotation.JsonProperty("intervalGap")
        private String intervalGap;

        /**
         * Time span between each timestamp in the timeseries datapoints.
         *
         * @param intervalGap the value to set
         * @return this builder
         */
        public Builder intervalGap(String intervalGap) {
            this.intervalGap = intervalGap;
            this.__explicitlySet__.add("intervalGap");
            return this;
        }
        /** List of timestamps making up the timeseries datapoints. */
        @com.fasterxml.jackson.annotation.JsonProperty("intervals")
        private java.util.List<Long> intervals;

        /**
         * List of timestamps making up the timeseries datapoints.
         *
         * @param intervals the value to set
         * @return this builder
         */
        public Builder intervals(java.util.List<Long> intervals) {
            this.intervals = intervals;
            this.__explicitlySet__.add("intervals");
            return this;
        }
        /** List of series data sets for each statistical function specified in the command. */
        @com.fasterxml.jackson.annotation.JsonProperty("series")
        private java.util.List<TimeStatsDataColumn> series;

        /**
         * List of series data sets for each statistical function specified in the command.
         *
         * @param series the value to set
         * @return this builder
         */
        public Builder series(java.util.List<TimeStatsDataColumn> series) {
            this.series = series;
            this.__explicitlySet__.add("series");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TimeStatsColumn build() {
            TimeStatsColumn model =
                    new TimeStatsColumn(
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
                            this.intervalGap,
                            this.intervals,
                            this.series);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TimeStatsColumn model) {
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
            if (model.wasPropertyExplicitlySet("intervalGap")) {
                this.intervalGap(model.getIntervalGap());
            }
            if (model.wasPropertyExplicitlySet("intervals")) {
                this.intervals(model.getIntervals());
            }
            if (model.wasPropertyExplicitlySet("series")) {
                this.series(model.getSeries());
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
    public TimeStatsColumn(
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
            String intervalGap,
            java.util.List<Long> intervals,
            java.util.List<TimeStatsDataColumn> series) {
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
        this.intervalGap = intervalGap;
        this.intervals = intervals;
        this.series = series;
    }

    /** Time span between each timestamp in the timeseries datapoints. */
    @com.fasterxml.jackson.annotation.JsonProperty("intervalGap")
    private final String intervalGap;

    /**
     * Time span between each timestamp in the timeseries datapoints.
     *
     * @return the value
     */
    public String getIntervalGap() {
        return intervalGap;
    }

    /** List of timestamps making up the timeseries datapoints. */
    @com.fasterxml.jackson.annotation.JsonProperty("intervals")
    private final java.util.List<Long> intervals;

    /**
     * List of timestamps making up the timeseries datapoints.
     *
     * @return the value
     */
    public java.util.List<Long> getIntervals() {
        return intervals;
    }

    /** List of series data sets for each statistical function specified in the command. */
    @com.fasterxml.jackson.annotation.JsonProperty("series")
    private final java.util.List<TimeStatsDataColumn> series;

    /**
     * List of series data sets for each statistical function specified in the command.
     *
     * @return the value
     */
    public java.util.List<TimeStatsDataColumn> getSeries() {
        return series;
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
        sb.append("TimeStatsColumn(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", intervalGap=").append(String.valueOf(this.intervalGap));
        sb.append(", intervals=").append(String.valueOf(this.intervals));
        sb.append(", series=").append(String.valueOf(this.series));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TimeStatsColumn)) {
            return false;
        }

        TimeStatsColumn other = (TimeStatsColumn) o;
        return java.util.Objects.equals(this.intervalGap, other.intervalGap)
                && java.util.Objects.equals(this.intervals, other.intervals)
                && java.util.Objects.equals(this.series, other.series)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.intervalGap == null ? 43 : this.intervalGap.hashCode());
        result = (result * PRIME) + (this.intervals == null ? 43 : this.intervals.hashCode());
        result = (result * PRIME) + (this.series == null ? 43 : this.series.hashCode());
        return result;
    }
}
