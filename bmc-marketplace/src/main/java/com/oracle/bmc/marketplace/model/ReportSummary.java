/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model of a single report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReportSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReportSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"reportType", "date", "columns", "content"})
    public ReportSummary(
            String reportType,
            java.util.Date date,
            java.util.List<String> columns,
            String content) {
        super();
        this.reportType = reportType;
        this.date = date;
        this.columns = columns;
        this.content = content;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportType")
        private String reportType;

        /**
         * The type of report.
         * @param reportType the value to set
         * @return this builder
         **/
        public Builder reportType(String reportType) {
            this.reportType = reportType;
            this.__explicitlySet__.add("reportType");
            return this;
        }
        /**
         * The date of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("date")
        private java.util.Date date;

        /**
         * The date of the report.
         * @param date the value to set
         * @return this builder
         **/
        public Builder date(java.util.Date date) {
            this.date = date;
            this.__explicitlySet__.add("date");
            return this;
        }
        /**
         * The columns in the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<String> columns;

        /**
         * The columns in the report.
         * @param columns the value to set
         * @return this builder
         **/
        public Builder columns(java.util.List<String> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /**
         * The contents of the report in comma-separated values (CSV) file format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The contents of the report in comma-separated values (CSV) file format.
         * @param content the value to set
         * @return this builder
         **/
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportSummary build() {
            ReportSummary __instance__ = new ReportSummary(reportType, date, columns, content);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportSummary o) {
            Builder copiedBuilder =
                    reportType(o.getReportType())
                            .date(o.getDate())
                            .columns(o.getColumns())
                            .content(o.getContent());

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
     * The type of report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportType")
    private final String reportType;

    /**
     * The type of report.
     * @return the value
     **/
    public String getReportType() {
        return reportType;
    }

    /**
     * The date of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    private final java.util.Date date;

    /**
     * The date of the report.
     * @return the value
     **/
    public java.util.Date getDate() {
        return date;
    }

    /**
     * The columns in the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<String> columns;

    /**
     * The columns in the report.
     * @return the value
     **/
    public java.util.List<String> getColumns() {
        return columns;
    }

    /**
     * The contents of the report in comma-separated values (CSV) file format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The contents of the report in comma-separated values (CSV) file format.
     * @return the value
     **/
    public String getContent() {
        return content;
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
        sb.append("ReportSummary(");
        sb.append("reportType=").append(String.valueOf(this.reportType));
        sb.append(", date=").append(String.valueOf(this.date));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportSummary)) {
            return false;
        }

        ReportSummary other = (ReportSummary) o;
        return java.util.Objects.equals(this.reportType, other.reportType)
                && java.util.Objects.equals(this.date, other.date)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reportType == null ? 43 : this.reportType.hashCode());
        result = (result * PRIME) + (this.date == null ? 43 : this.date.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
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
