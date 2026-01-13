/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * fetch reports for FAM based on filter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReportDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "granularity",
        "reportTimeRange",
        "condition",
        "filters",
        "orderClause"
    })
    public ReportDetails(
            String name,
            Granularity granularity,
            ReportTimeRange reportTimeRange,
            Condition condition,
            java.util.List<Filter> filters,
            java.util.List<OrderClause> orderClause) {
        super();
        this.name = name;
        this.granularity = granularity;
        this.reportTimeRange = reportTimeRange;
        this.condition = condition;
        this.filters = filters;
        this.orderClause = orderClause;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of report. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of report.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Granularity. */
        @com.fasterxml.jackson.annotation.JsonProperty("granularity")
        private Granularity granularity;

        /**
         * Granularity.
         *
         * @param granularity the value to set
         * @return this builder
         */
        public Builder granularity(Granularity granularity) {
            this.granularity = granularity;
            this.__explicitlySet__.add("granularity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportTimeRange")
        private ReportTimeRange reportTimeRange;

        public Builder reportTimeRange(ReportTimeRange reportTimeRange) {
            this.reportTimeRange = reportTimeRange;
            this.__explicitlySet__.add("reportTimeRange");
            return this;
        }
        /** Condition. */
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        /**
         * Condition.
         *
         * @param condition the value to set
         * @return this builder
         */
        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /** Filters for reports. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<Filter> filters;

        /**
         * Filters for reports.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<Filter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }
        /** order clauses for reports. */
        @com.fasterxml.jackson.annotation.JsonProperty("orderClause")
        private java.util.List<OrderClause> orderClause;

        /**
         * order clauses for reports.
         *
         * @param orderClause the value to set
         * @return this builder
         */
        public Builder orderClause(java.util.List<OrderClause> orderClause) {
            this.orderClause = orderClause;
            this.__explicitlySet__.add("orderClause");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportDetails build() {
            ReportDetails model =
                    new ReportDetails(
                            this.name,
                            this.granularity,
                            this.reportTimeRange,
                            this.condition,
                            this.filters,
                            this.orderClause);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("granularity")) {
                this.granularity(model.getGranularity());
            }
            if (model.wasPropertyExplicitlySet("reportTimeRange")) {
                this.reportTimeRange(model.getReportTimeRange());
            }
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
            }
            if (model.wasPropertyExplicitlySet("orderClause")) {
                this.orderClause(model.getOrderClause());
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

    /** Name of report. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of report.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Granularity. */
    public enum Granularity implements com.oracle.bmc.http.internal.BmcEnum {
        Day("DAY"),
        Week("WEEK"),
        Month("MONTH"),
        Quarter("QUARTER"),
        Year("YEAR"),
        ;

        private final String value;
        private static java.util.Map<String, Granularity> map;

        static {
            map = new java.util.HashMap<>();
            for (Granularity v : Granularity.values()) {
                map.put(v.getValue(), v);
            }
        }

        Granularity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Granularity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Granularity: " + key);
        }
    };
    /** Granularity. */
    @com.fasterxml.jackson.annotation.JsonProperty("granularity")
    private final Granularity granularity;

    /**
     * Granularity.
     *
     * @return the value
     */
    public Granularity getGranularity() {
        return granularity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reportTimeRange")
    private final ReportTimeRange reportTimeRange;

    public ReportTimeRange getReportTimeRange() {
        return reportTimeRange;
    }

    /** Condition. */
    public enum Condition implements com.oracle.bmc.http.internal.BmcEnum {
        All("ALL"),
        Any("ANY"),
        ;

        private final String value;
        private static java.util.Map<String, Condition> map;

        static {
            map = new java.util.HashMap<>();
            for (Condition v : Condition.values()) {
                map.put(v.getValue(), v);
            }
        }

        Condition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Condition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Condition: " + key);
        }
    };
    /** Condition. */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final Condition condition;

    /**
     * Condition.
     *
     * @return the value
     */
    public Condition getCondition() {
        return condition;
    }

    /** Filters for reports. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<Filter> filters;

    /**
     * Filters for reports.
     *
     * @return the value
     */
    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /** order clauses for reports. */
    @com.fasterxml.jackson.annotation.JsonProperty("orderClause")
    private final java.util.List<OrderClause> orderClause;

    /**
     * order clauses for reports.
     *
     * @return the value
     */
    public java.util.List<OrderClause> getOrderClause() {
        return orderClause;
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
        sb.append("ReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", granularity=").append(String.valueOf(this.granularity));
        sb.append(", reportTimeRange=").append(String.valueOf(this.reportTimeRange));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(", orderClause=").append(String.valueOf(this.orderClause));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportDetails)) {
            return false;
        }

        ReportDetails other = (ReportDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.granularity, other.granularity)
                && java.util.Objects.equals(this.reportTimeRange, other.reportTimeRange)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(this.orderClause, other.orderClause)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.granularity == null ? 43 : this.granularity.hashCode());
        result =
                (result * PRIME)
                        + (this.reportTimeRange == null ? 43 : this.reportTimeRange.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + (this.orderClause == null ? 43 : this.orderClause.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
