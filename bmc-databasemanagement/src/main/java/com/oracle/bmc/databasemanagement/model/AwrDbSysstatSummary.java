/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the AWR SYSSTAT data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AwrDbSysstatSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AwrDbSysstatSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "category",
        "timeBegin",
        "timeEnd",
        "avgValue",
        "currentValue"
    })
    public AwrDbSysstatSummary(
            String name,
            String category,
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Double avgValue,
            Double currentValue) {
        super();
        this.name = name;
        this.category = category;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.avgValue = avgValue;
        this.currentValue = currentValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the SYSSTAT.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the SYSSTAT.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of the SYSSTAT category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * The name of the SYSSTAT category.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * The start time of the SYSSTAT.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        /**
         * The start time of the SYSSTAT.
         * @param timeBegin the value to set
         * @return this builder
         **/
        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }
        /**
         * The end time of the SYSSTAT.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time of the SYSSTAT.
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * The average value of the SYSSTAT.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("avgValue")
        private Double avgValue;

        /**
         * The average value of the SYSSTAT.
         * @param avgValue the value to set
         * @return this builder
         **/
        public Builder avgValue(Double avgValue) {
            this.avgValue = avgValue;
            this.__explicitlySet__.add("avgValue");
            return this;
        }
        /**
         * The last value of the SYSSTAT.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentValue")
        private Double currentValue;

        /**
         * The last value of the SYSSTAT.
         * @param currentValue the value to set
         * @return this builder
         **/
        public Builder currentValue(Double currentValue) {
            this.currentValue = currentValue;
            this.__explicitlySet__.add("currentValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbSysstatSummary build() {
            AwrDbSysstatSummary __instance__ =
                    new AwrDbSysstatSummary(
                            name, category, timeBegin, timeEnd, avgValue, currentValue);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbSysstatSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .category(o.getCategory())
                            .timeBegin(o.getTimeBegin())
                            .timeEnd(o.getTimeEnd())
                            .avgValue(o.getAvgValue())
                            .currentValue(o.getCurrentValue());

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

    /**
     * The name of the SYSSTAT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the SYSSTAT.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The name of the SYSSTAT category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * The name of the SYSSTAT category.
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * The start time of the SYSSTAT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

    /**
     * The start time of the SYSSTAT.
     * @return the value
     **/
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }

    /**
     * The end time of the SYSSTAT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time of the SYSSTAT.
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * The average value of the SYSSTAT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("avgValue")
    private final Double avgValue;

    /**
     * The average value of the SYSSTAT.
     * @return the value
     **/
    public Double getAvgValue() {
        return avgValue;
    }

    /**
     * The last value of the SYSSTAT.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentValue")
    private final Double currentValue;

    /**
     * The last value of the SYSSTAT.
     * @return the value
     **/
    public Double getCurrentValue() {
        return currentValue;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AwrDbSysstatSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", avgValue=").append(String.valueOf(this.avgValue));
        sb.append(", currentValue=").append(String.valueOf(this.currentValue));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbSysstatSummary)) {
            return false;
        }

        AwrDbSysstatSummary other = (AwrDbSysstatSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.avgValue, other.avgValue)
                && java.util.Objects.equals(this.currentValue, other.currentValue)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.avgValue == null ? 43 : this.avgValue.hashCode());
        result = (result * PRIME) + (this.currentValue == null ? 43 : this.currentValue.hashCode());
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
