/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * A single cell in a table. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Cell.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Cell extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "text",
        "rowIndex",
        "columnIndex",
        "confidence",
        "boundingPolygon",
        "wordIndexes"
    })
    public Cell(
            String text,
            Integer rowIndex,
            Integer columnIndex,
            Float confidence,
            BoundingPolygon boundingPolygon,
            java.util.List<Integer> wordIndexes) {
        super();
        this.text = text;
        this.rowIndex = rowIndex;
        this.columnIndex = columnIndex;
        this.confidence = confidence;
        this.boundingPolygon = boundingPolygon;
        this.wordIndexes = wordIndexes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The text recognized in the cell. */
        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        /**
         * The text recognized in the cell.
         *
         * @param text the value to set
         * @return this builder
         */
        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }
        /** The index of the cell inside the row. */
        @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
        private Integer rowIndex;

        /**
         * The index of the cell inside the row.
         *
         * @param rowIndex the value to set
         * @return this builder
         */
        public Builder rowIndex(Integer rowIndex) {
            this.rowIndex = rowIndex;
            this.__explicitlySet__.add("rowIndex");
            return this;
        }
        /** The index of the cell inside the column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
        private Integer columnIndex;

        /**
         * The index of the cell inside the column.
         *
         * @param columnIndex the value to set
         * @return this builder
         */
        public Builder columnIndex(Integer columnIndex) {
            this.columnIndex = columnIndex;
            this.__explicitlySet__.add("columnIndex");
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
        /** The words detected in the cell. */
        @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
        private java.util.List<Integer> wordIndexes;

        /**
         * The words detected in the cell.
         *
         * @param wordIndexes the value to set
         * @return this builder
         */
        public Builder wordIndexes(java.util.List<Integer> wordIndexes) {
            this.wordIndexes = wordIndexes;
            this.__explicitlySet__.add("wordIndexes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Cell build() {
            Cell model =
                    new Cell(
                            this.text,
                            this.rowIndex,
                            this.columnIndex,
                            this.confidence,
                            this.boundingPolygon,
                            this.wordIndexes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Cell model) {
            if (model.wasPropertyExplicitlySet("text")) {
                this.text(model.getText());
            }
            if (model.wasPropertyExplicitlySet("rowIndex")) {
                this.rowIndex(model.getRowIndex());
            }
            if (model.wasPropertyExplicitlySet("columnIndex")) {
                this.columnIndex(model.getColumnIndex());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("boundingPolygon")) {
                this.boundingPolygon(model.getBoundingPolygon());
            }
            if (model.wasPropertyExplicitlySet("wordIndexes")) {
                this.wordIndexes(model.getWordIndexes());
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

    /** The text recognized in the cell. */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    private final String text;

    /**
     * The text recognized in the cell.
     *
     * @return the value
     */
    public String getText() {
        return text;
    }

    /** The index of the cell inside the row. */
    @com.fasterxml.jackson.annotation.JsonProperty("rowIndex")
    private final Integer rowIndex;

    /**
     * The index of the cell inside the row.
     *
     * @return the value
     */
    public Integer getRowIndex() {
        return rowIndex;
    }

    /** The index of the cell inside the column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnIndex")
    private final Integer columnIndex;

    /**
     * The index of the cell inside the column.
     *
     * @return the value
     */
    public Integer getColumnIndex() {
        return columnIndex;
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

    /** The words detected in the cell. */
    @com.fasterxml.jackson.annotation.JsonProperty("wordIndexes")
    private final java.util.List<Integer> wordIndexes;

    /**
     * The words detected in the cell.
     *
     * @return the value
     */
    public java.util.List<Integer> getWordIndexes() {
        return wordIndexes;
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
        sb.append("Cell(");
        sb.append("super=").append(super.toString());
        sb.append("text=").append(String.valueOf(this.text));
        sb.append(", rowIndex=").append(String.valueOf(this.rowIndex));
        sb.append(", columnIndex=").append(String.valueOf(this.columnIndex));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", boundingPolygon=").append(String.valueOf(this.boundingPolygon));
        sb.append(", wordIndexes=").append(String.valueOf(this.wordIndexes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Cell)) {
            return false;
        }

        Cell other = (Cell) o;
        return java.util.Objects.equals(this.text, other.text)
                && java.util.Objects.equals(this.rowIndex, other.rowIndex)
                && java.util.Objects.equals(this.columnIndex, other.columnIndex)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.boundingPolygon, other.boundingPolygon)
                && java.util.Objects.equals(this.wordIndexes, other.wordIndexes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.text == null ? 43 : this.text.hashCode());
        result = (result * PRIME) + (this.rowIndex == null ? 43 : this.rowIndex.hashCode());
        result = (result * PRIME) + (this.columnIndex == null ? 43 : this.columnIndex.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.boundingPolygon == null ? 43 : this.boundingPolygon.hashCode());
        result = (result * PRIME) + (this.wordIndexes == null ? 43 : this.wordIndexes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
