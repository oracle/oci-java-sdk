/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the select object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Select.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Select extends PushDownOperation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specifies whether the object is distinct. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDistinct")
        private Boolean isDistinct;

        /**
         * Specifies whether the object is distinct.
         *
         * @param isDistinct the value to set
         * @return this builder
         */
        public Builder isDistinct(Boolean isDistinct) {
            this.isDistinct = isDistinct;
            this.__explicitlySet__.add("isDistinct");
            return this;
        }
        /** An array of selected columns. */
        @com.fasterxml.jackson.annotation.JsonProperty("selectColumns")
        private java.util.List<ShapeField> selectColumns;

        /**
         * An array of selected columns.
         *
         * @param selectColumns the value to set
         * @return this builder
         */
        public Builder selectColumns(java.util.List<ShapeField> selectColumns) {
            this.selectColumns = selectColumns;
            this.__explicitlySet__.add("selectColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Select build() {
            Select model = new Select(this.isDistinct, this.selectColumns);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Select model) {
            if (model.wasPropertyExplicitlySet("isDistinct")) {
                this.isDistinct(model.getIsDistinct());
            }
            if (model.wasPropertyExplicitlySet("selectColumns")) {
                this.selectColumns(model.getSelectColumns());
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
    public Select(Boolean isDistinct, java.util.List<ShapeField> selectColumns) {
        super();
        this.isDistinct = isDistinct;
        this.selectColumns = selectColumns;
    }

    /** Specifies whether the object is distinct. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDistinct")
    private final Boolean isDistinct;

    /**
     * Specifies whether the object is distinct.
     *
     * @return the value
     */
    public Boolean getIsDistinct() {
        return isDistinct;
    }

    /** An array of selected columns. */
    @com.fasterxml.jackson.annotation.JsonProperty("selectColumns")
    private final java.util.List<ShapeField> selectColumns;

    /**
     * An array of selected columns.
     *
     * @return the value
     */
    public java.util.List<ShapeField> getSelectColumns() {
        return selectColumns;
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
        sb.append("Select(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isDistinct=").append(String.valueOf(this.isDistinct));
        sb.append(", selectColumns=").append(String.valueOf(this.selectColumns));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Select)) {
            return false;
        }

        Select other = (Select) o;
        return java.util.Objects.equals(this.isDistinct, other.isDistinct)
                && java.util.Objects.equals(this.selectColumns, other.selectColumns)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.isDistinct == null ? 43 : this.isDistinct.hashCode());
        result =
                (result * PRIME)
                        + (this.selectColumns == null ? 43 : this.selectColumns.hashCode());
        return result;
    }
}
