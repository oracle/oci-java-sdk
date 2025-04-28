/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Sorts the data at the column level. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ColumnSorting.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ColumnSorting extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fieldName", "isAscending", "sortingOrder"})
    public ColumnSorting(String fieldName, Boolean isAscending, Integer sortingOrder) {
        super();
        this.fieldName = fieldName;
        this.isAscending = isAscending;
        this.sortingOrder = sortingOrder;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the column that must be sorted. */
        @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
        private String fieldName;

        /**
         * Name of the column that must be sorted.
         *
         * @param fieldName the value to set
         * @return this builder
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            this.__explicitlySet__.add("fieldName");
            return this;
        }
        /**
         * Indicates if the column must be sorted in ascending order. Values can either be 'true' or
         * 'false'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAscending")
        private Boolean isAscending;

        /**
         * Indicates if the column must be sorted in ascending order. Values can either be 'true' or
         * 'false'.
         *
         * @param isAscending the value to set
         * @return this builder
         */
        public Builder isAscending(Boolean isAscending) {
            this.isAscending = isAscending;
            this.__explicitlySet__.add("isAscending");
            return this;
        }
        /** Indicates the order at which column must be sorted. */
        @com.fasterxml.jackson.annotation.JsonProperty("sortingOrder")
        private Integer sortingOrder;

        /**
         * Indicates the order at which column must be sorted.
         *
         * @param sortingOrder the value to set
         * @return this builder
         */
        public Builder sortingOrder(Integer sortingOrder) {
            this.sortingOrder = sortingOrder;
            this.__explicitlySet__.add("sortingOrder");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ColumnSorting build() {
            ColumnSorting model =
                    new ColumnSorting(this.fieldName, this.isAscending, this.sortingOrder);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ColumnSorting model) {
            if (model.wasPropertyExplicitlySet("fieldName")) {
                this.fieldName(model.getFieldName());
            }
            if (model.wasPropertyExplicitlySet("isAscending")) {
                this.isAscending(model.getIsAscending());
            }
            if (model.wasPropertyExplicitlySet("sortingOrder")) {
                this.sortingOrder(model.getSortingOrder());
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

    /** Name of the column that must be sorted. */
    @com.fasterxml.jackson.annotation.JsonProperty("fieldName")
    private final String fieldName;

    /**
     * Name of the column that must be sorted.
     *
     * @return the value
     */
    public String getFieldName() {
        return fieldName;
    }

    /**
     * Indicates if the column must be sorted in ascending order. Values can either be 'true' or
     * 'false'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAscending")
    private final Boolean isAscending;

    /**
     * Indicates if the column must be sorted in ascending order. Values can either be 'true' or
     * 'false'.
     *
     * @return the value
     */
    public Boolean getIsAscending() {
        return isAscending;
    }

    /** Indicates the order at which column must be sorted. */
    @com.fasterxml.jackson.annotation.JsonProperty("sortingOrder")
    private final Integer sortingOrder;

    /**
     * Indicates the order at which column must be sorted.
     *
     * @return the value
     */
    public Integer getSortingOrder() {
        return sortingOrder;
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
        sb.append("ColumnSorting(");
        sb.append("super=").append(super.toString());
        sb.append("fieldName=").append(String.valueOf(this.fieldName));
        sb.append(", isAscending=").append(String.valueOf(this.isAscending));
        sb.append(", sortingOrder=").append(String.valueOf(this.sortingOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ColumnSorting)) {
            return false;
        }

        ColumnSorting other = (ColumnSorting) o;
        return java.util.Objects.equals(this.fieldName, other.fieldName)
                && java.util.Objects.equals(this.isAscending, other.isAscending)
                && java.util.Objects.equals(this.sortingOrder, other.sortingOrder)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fieldName == null ? 43 : this.fieldName.hashCode());
        result = (result * PRIME) + (this.isAscending == null ? 43 : this.isAscending.hashCode());
        result = (result * PRIME) + (this.sortingOrder == null ? 43 : this.sortingOrder.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
