/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model of the description of a report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ReportTypeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ReportTypeSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reportType", "name", "description", "columns"})
    public ReportTypeSummary(
            String reportType, String name, String description, java.util.List<String> columns) {
        super();
        this.reportType = reportType;
        this.name = name;
        this.description = description;
        this.columns = columns;
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
         * The name of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the report.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A description of the report.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the report.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReportTypeSummary build() {
            ReportTypeSummary model =
                    new ReportTypeSummary(
                            this.reportType, this.name, this.description, this.columns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReportTypeSummary model) {
            if (model.wasPropertyExplicitlySet("reportType")) {
                this.reportType(model.getReportType());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
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
     * The name of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the report.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A description of the report.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the report.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
        sb.append("ReportTypeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("reportType=").append(String.valueOf(this.reportType));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReportTypeSummary)) {
            return false;
        }

        ReportTypeSummary other = (ReportTypeSummary) o;
        return java.util.Objects.equals(this.reportType, other.reportType)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.columns, other.columns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reportType == null ? 43 : this.reportType.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
