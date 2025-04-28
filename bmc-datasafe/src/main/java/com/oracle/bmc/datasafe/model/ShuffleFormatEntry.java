/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The Shuffle masking format randomly shuffles values within a column. It can also be used to
 * shuffle column data within discrete units, or groups, where there is a relationship among the
 * members of each group. To learn more, check Shuffle in the Data Safe documentation. The Shuffle
 * masking format randomly shuffles values within a column. It can also be used to shuffle column
 * data within discrete units, or groups, where there is a relationship among the members of each
 * group. To learn more, check Shuffle in the Data Safe documentation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShuffleFormatEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShuffleFormatEntry extends FormatEntry {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * One or more reference columns to be used to group column values so that they can be
         * shuffled within their own group. The grouping columns and the column to be masked must
         * belong to the same table.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupingColumns")
        private java.util.List<String> groupingColumns;

        /**
         * One or more reference columns to be used to group column values so that they can be
         * shuffled within their own group. The grouping columns and the column to be masked must
         * belong to the same table.
         *
         * @param groupingColumns the value to set
         * @return this builder
         */
        public Builder groupingColumns(java.util.List<String> groupingColumns) {
            this.groupingColumns = groupingColumns;
            this.__explicitlySet__.add("groupingColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShuffleFormatEntry build() {
            ShuffleFormatEntry model =
                    new ShuffleFormatEntry(this.description, this.groupingColumns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShuffleFormatEntry model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("groupingColumns")) {
                this.groupingColumns(model.getGroupingColumns());
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
    public ShuffleFormatEntry(String description, java.util.List<String> groupingColumns) {
        super(description);
        this.groupingColumns = groupingColumns;
    }

    /**
     * One or more reference columns to be used to group column values so that they can be shuffled
     * within their own group. The grouping columns and the column to be masked must belong to the
     * same table.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupingColumns")
    private final java.util.List<String> groupingColumns;

    /**
     * One or more reference columns to be used to group column values so that they can be shuffled
     * within their own group. The grouping columns and the column to be masked must belong to the
     * same table.
     *
     * @return the value
     */
    public java.util.List<String> getGroupingColumns() {
        return groupingColumns;
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
        sb.append("ShuffleFormatEntry(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", groupingColumns=").append(String.valueOf(this.groupingColumns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShuffleFormatEntry)) {
            return false;
        }

        ShuffleFormatEntry other = (ShuffleFormatEntry) o;
        return java.util.Objects.equals(this.groupingColumns, other.groupingColumns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.groupingColumns == null ? 43 : this.groupingColumns.hashCode());
        return result;
    }
}
