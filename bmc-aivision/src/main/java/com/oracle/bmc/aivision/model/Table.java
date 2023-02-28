/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The table extracted from a document. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Table.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Table extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "rowCount",
        "columnCount",
        "headerRows",
        "bodyRows",
        "footerRows",
        "confidence",
        "boundingPolygon"
    })
    public Table(
            Integer rowCount,
            Integer columnCount,
            java.util.List<TableRow> headerRows,
            java.util.List<TableRow> bodyRows,
            java.util.List<TableRow> footerRows,
            Float confidence,
            BoundingPolygon boundingPolygon) {
        super();
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.headerRows = headerRows;
        this.bodyRows = bodyRows;
        this.footerRows = footerRows;
        this.confidence = confidence;
        this.boundingPolygon = boundingPolygon;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of rows. */
        @com.fasterxml.jackson.annotation.JsonProperty("rowCount")
        private Integer rowCount;

        /**
         * The number of rows.
         *
         * @param rowCount the value to set
         * @return this builder
         */
        public Builder rowCount(Integer rowCount) {
            this.rowCount = rowCount;
            this.__explicitlySet__.add("rowCount");
            return this;
        }
        /** The number of columns. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnCount")
        private Integer columnCount;

        /**
         * The number of columns.
         *
         * @param columnCount the value to set
         * @return this builder
         */
        public Builder columnCount(Integer columnCount) {
            this.columnCount = columnCount;
            this.__explicitlySet__.add("columnCount");
            return this;
        }
        /** The header rows. */
        @com.fasterxml.jackson.annotation.JsonProperty("headerRows")
        private java.util.List<TableRow> headerRows;

        /**
         * The header rows.
         *
         * @param headerRows the value to set
         * @return this builder
         */
        public Builder headerRows(java.util.List<TableRow> headerRows) {
            this.headerRows = headerRows;
            this.__explicitlySet__.add("headerRows");
            return this;
        }
        /** The body rows. */
        @com.fasterxml.jackson.annotation.JsonProperty("bodyRows")
        private java.util.List<TableRow> bodyRows;

        /**
         * The body rows.
         *
         * @param bodyRows the value to set
         * @return this builder
         */
        public Builder bodyRows(java.util.List<TableRow> bodyRows) {
            this.bodyRows = bodyRows;
            this.__explicitlySet__.add("bodyRows");
            return this;
        }
        /** the footer rows. */
        @com.fasterxml.jackson.annotation.JsonProperty("footerRows")
        private java.util.List<TableRow> footerRows;

        /**
         * the footer rows.
         *
         * @param footerRows the value to set
         * @return this builder
         */
        public Builder footerRows(java.util.List<TableRow> footerRows) {
            this.footerRows = footerRows;
            this.__explicitlySet__.add("footerRows");
            return this;
        }
        /** The confidence score between 0 and 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Float confidence;

        /**
         * The confidence score between 0 and 1.
         *
         * @param confidence the value to set
         * @return this builder
         */
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
            Table model =
                    new Table(
                            this.rowCount,
                            this.columnCount,
                            this.headerRows,
                            this.bodyRows,
                            this.footerRows,
                            this.confidence,
                            this.boundingPolygon);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Table model) {
            if (model.wasPropertyExplicitlySet("rowCount")) {
                this.rowCount(model.getRowCount());
            }
            if (model.wasPropertyExplicitlySet("columnCount")) {
                this.columnCount(model.getColumnCount());
            }
            if (model.wasPropertyExplicitlySet("headerRows")) {
                this.headerRows(model.getHeaderRows());
            }
            if (model.wasPropertyExplicitlySet("bodyRows")) {
                this.bodyRows(model.getBodyRows());
            }
            if (model.wasPropertyExplicitlySet("footerRows")) {
                this.footerRows(model.getFooterRows());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("boundingPolygon")) {
                this.boundingPolygon(model.getBoundingPolygon());
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

    /** The number of rows. */
    @com.fasterxml.jackson.annotation.JsonProperty("rowCount")
    private final Integer rowCount;

    /**
     * The number of rows.
     *
     * @return the value
     */
    public Integer getRowCount() {
        return rowCount;
    }

    /** The number of columns. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnCount")
    private final Integer columnCount;

    /**
     * The number of columns.
     *
     * @return the value
     */
    public Integer getColumnCount() {
        return columnCount;
    }

    /** The header rows. */
    @com.fasterxml.jackson.annotation.JsonProperty("headerRows")
    private final java.util.List<TableRow> headerRows;

    /**
     * The header rows.
     *
     * @return the value
     */
    public java.util.List<TableRow> getHeaderRows() {
        return headerRows;
    }

    /** The body rows. */
    @com.fasterxml.jackson.annotation.JsonProperty("bodyRows")
    private final java.util.List<TableRow> bodyRows;

    /**
     * The body rows.
     *
     * @return the value
     */
    public java.util.List<TableRow> getBodyRows() {
        return bodyRows;
    }

    /** the footer rows. */
    @com.fasterxml.jackson.annotation.JsonProperty("footerRows")
    private final java.util.List<TableRow> footerRows;

    /**
     * the footer rows.
     *
     * @return the value
     */
    public java.util.List<TableRow> getFooterRows() {
        return footerRows;
    }

    /** The confidence score between 0 and 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Float confidence;

    /**
     * The confidence score between 0 and 1.
     *
     * @return the value
     */
    public Float getConfidence() {
        return confidence;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("boundingPolygon")
    private final BoundingPolygon boundingPolygon;

    public BoundingPolygon getBoundingPolygon() {
        return boundingPolygon;
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
        sb.append("Table(");
        sb.append("super=").append(super.toString());
        sb.append("rowCount=").append(String.valueOf(this.rowCount));
        sb.append(", columnCount=").append(String.valueOf(this.columnCount));
        sb.append(", headerRows=").append(String.valueOf(this.headerRows));
        sb.append(", bodyRows=").append(String.valueOf(this.bodyRows));
        sb.append(", footerRows=").append(String.valueOf(this.footerRows));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Table)) {
            return false;
        }

        Table other = (Table) o;
        return java.util.Objects.equals(this.rowCount, other.rowCount)
                && java.util.Objects.equals(this.columnCount, other.columnCount)
                && java.util.Objects.equals(this.headerRows, other.headerRows)
                && java.util.Objects.equals(this.bodyRows, other.bodyRows)
                && java.util.Objects.equals(this.footerRows, other.footerRows)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rowCount == null ? 43 : this.rowCount.hashCode());
        result = (result * PRIME) + (this.columnCount == null ? 43 : this.columnCount.hashCode());
        result = (result * PRIME) + (this.headerRows == null ? 43 : this.headerRows.hashCode());
        result = (result * PRIME) + (this.bodyRows == null ? 43 : this.bodyRows.hashCode());
        result = (result * PRIME) + (this.footerRows == null ? 43 : this.footerRows.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
