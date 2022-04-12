/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The table extracted from a document.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Table.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Table {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("rowCount")
        private Integer rowCount;

        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            this.__explicitlySet__.add("rowCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnCount")
        private Integer columnCount;

        public Builder columnCount(Integer columnCount) {
            this.columnCount = columnCount;
            this.__explicitlySet__.add("columnCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerRows")
        private java.util.List<TableRow> headerRows;

        public Builder headerRows(java.util.List<TableRow> headerRows) {
            this.headerRows = headerRows;
            this.__explicitlySet__.add("headerRows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bodyRows")
        private java.util.List<TableRow> bodyRows;

        public Builder bodyRows(java.util.List<TableRow> bodyRows) {
            this.bodyRows = bodyRows;
            this.__explicitlySet__.add("bodyRows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("footerRows")
        private java.util.List<TableRow> footerRows;

        public Builder footerRows(java.util.List<TableRow> footerRows) {
            this.footerRows = footerRows;
            this.__explicitlySet__.add("footerRows");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        public Builder confidence(Float confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
        private BoundingPolygon boundingPolygon;

        public Builder boundingPolygon(BoundingPolygon boundingPolygon) {
            this.boundingPolygon = boundingPolygon;
            this.__explicitlySet__.add("boundingPolygon");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Table build() {
            Table __instance__ =
                    new Table(
                            rowCount,
                            columnCount,
                            headerRows,
                            bodyRows,
                            footerRows,
                            confidence,
                            boundingPolygon);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Table o) {
            Builder copiedBuilder =
                    rowCount(o.getRowCount())
                            .columnCount(o.getColumnCount())
                            .headerRows(o.getHeaderRows())
                            .bodyRows(o.getBodyRows())
                            .footerRows(o.getFooterRows())
                            .confidence(o.getConfidence())
                            .boundingPolygon(o.getBoundingPolygon());

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

    /**
     * The number of rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rowCount")
    Integer rowCount;

    /**
     * The number of columns.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnCount")
    Integer columnCount;

    /**
     * The header rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerRows")
    java.util.List<TableRow> headerRows;

    /**
     * The body rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bodyRows")
    java.util.List<TableRow> bodyRows;

    /**
     * the footer rows.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("footerRows")
    java.util.List<TableRow> footerRows;

    /**
     * The confidence score between 0 and 1.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    Float confidence;

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    BoundingPolygon boundingPolygon;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
