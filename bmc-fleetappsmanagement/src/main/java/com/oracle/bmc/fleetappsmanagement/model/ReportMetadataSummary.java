/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary information about a ReportMetadata. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReportMetadataSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReportMetadataSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "defaultOrderClause",
        "columnMetadata",
        "metric",
        "filters"
    })
    public ReportMetadataSummary(
            String name,
            String description,
            java.util.List<OrderClause> defaultOrderClause,
            java.util.List<ColumnMetadata> columnMetadata,
            String metric,
            java.util.List<ReportFilter> filters) {
        super();
        this.name = name;
        this.description = description;
        this.defaultOrderClause = defaultOrderClause;
        this.columnMetadata = columnMetadata;
        this.metric = metric;
        this.filters = filters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of Report. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of Report.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Description of report. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of report.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** default order clause for reports. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultOrderClause")
        private java.util.List<OrderClause> defaultOrderClause;

        /**
         * default order clause for reports.
         *
         * @param defaultOrderClause the value to set
         * @return this builder
         */
        public Builder defaultOrderClause(java.util.List<OrderClause> defaultOrderClause) {
            this.defaultOrderClause = defaultOrderClause;
            this.__explicitlySet__.add("defaultOrderClause");
            return this;
        }
        /** Column Metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnMetadata")
        private java.util.List<ColumnMetadata> columnMetadata;

        /**
         * Column Metadata.
         *
         * @param columnMetadata the value to set
         * @return this builder
         */
        public Builder columnMetadata(java.util.List<ColumnMetadata> columnMetadata) {
            this.columnMetadata = columnMetadata;
            this.__explicitlySet__.add("columnMetadata");
            return this;
        }
        /** Metric Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("metric")
        private String metric;

        /**
         * Metric Name.
         *
         * @param metric the value to set
         * @return this builder
         */
        public Builder metric(String metric) {
            this.metric = metric;
            this.__explicitlySet__.add("metric");
            return this;
        }
        /** metricMetadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<ReportFilter> filters;

        /**
         * metricMetadata.
         *
         * @param filters the value to set
         * @return this builder
         */
        public Builder filters(java.util.List<ReportFilter> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportMetadataSummary build() {
            ReportMetadataSummary model =
                    new ReportMetadataSummary(
                            this.name,
                            this.description,
                            this.defaultOrderClause,
                            this.columnMetadata,
                            this.metric,
                            this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportMetadataSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("defaultOrderClause")) {
                this.defaultOrderClause(model.getDefaultOrderClause());
            }
            if (model.wasPropertyExplicitlySet("columnMetadata")) {
                this.columnMetadata(model.getColumnMetadata());
            }
            if (model.wasPropertyExplicitlySet("metric")) {
                this.metric(model.getMetric());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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

    /** Name of Report. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of Report.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Description of report. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of report.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** default order clause for reports. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultOrderClause")
    private final java.util.List<OrderClause> defaultOrderClause;

    /**
     * default order clause for reports.
     *
     * @return the value
     */
    public java.util.List<OrderClause> getDefaultOrderClause() {
        return defaultOrderClause;
    }

    /** Column Metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnMetadata")
    private final java.util.List<ColumnMetadata> columnMetadata;

    /**
     * Column Metadata.
     *
     * @return the value
     */
    public java.util.List<ColumnMetadata> getColumnMetadata() {
        return columnMetadata;
    }

    /** Metric Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("metric")
    private final String metric;

    /**
     * Metric Name.
     *
     * @return the value
     */
    public String getMetric() {
        return metric;
    }

    /** metricMetadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<ReportFilter> filters;

    /**
     * metricMetadata.
     *
     * @return the value
     */
    public java.util.List<ReportFilter> getFilters() {
        return filters;
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
        sb.append("ReportMetadataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", defaultOrderClause=").append(String.valueOf(this.defaultOrderClause));
        sb.append(", columnMetadata=").append(String.valueOf(this.columnMetadata));
        sb.append(", metric=").append(String.valueOf(this.metric));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportMetadataSummary)) {
            return false;
        }

        ReportMetadataSummary other = (ReportMetadataSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.defaultOrderClause, other.defaultOrderClause)
                && java.util.Objects.equals(this.columnMetadata, other.columnMetadata)
                && java.util.Objects.equals(this.metric, other.metric)
                && java.util.Objects.equals(this.filters, other.filters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultOrderClause == null
                                ? 43
                                : this.defaultOrderClause.hashCode());
        result =
                (result * PRIME)
                        + (this.columnMetadata == null ? 43 : this.columnMetadata.hashCode());
        result = (result * PRIME) + (this.metric == null ? 43 : this.metric.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
