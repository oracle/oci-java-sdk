/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * List of subcomponents under a subcategory.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubComponents.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubComponents extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subCategory", "schema"})
    public SubComponents(java.util.Map<String, String> subCategory, String schema) {
        super();
        this.subCategory = subCategory;
        this.schema = schema;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Subcategory list.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
        private java.util.Map<String, String> subCategory;

        /**
         * Subcategory list.
         * @param subCategory the value to set
         * @return this builder
         **/
        public Builder subCategory(java.util.Map<String, String> subCategory) {
            this.subCategory = subCategory;
            this.__explicitlySet__.add("subCategory");
            return this;
        }
        /**
         * Schema of a subcategory.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schema")
        private String schema;

        /**
         * Schema of a subcategory.
         * @param schema the value to set
         * @return this builder
         **/
        public Builder schema(String schema) {
            this.schema = schema;
            this.__explicitlySet__.add("schema");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubComponents build() {
            SubComponents model = new SubComponents(this.subCategory, this.schema);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubComponents model) {
            if (model.wasPropertyExplicitlySet("subCategory")) {
                this.subCategory(model.getSubCategory());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
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
     * Subcategory list.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subCategory")
    private final java.util.Map<String, String> subCategory;

    /**
     * Subcategory list.
     * @return the value
     **/
    public java.util.Map<String, String> getSubCategory() {
        return subCategory;
    }

    /**
     * Schema of a subcategory.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schema")
    private final String schema;

    /**
     * Schema of a subcategory.
     * @return the value
     **/
    public String getSchema() {
        return schema;
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
        sb.append("SubComponents(");
        sb.append("super=").append(super.toString());
        sb.append("subCategory=").append(String.valueOf(this.subCategory));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubComponents)) {
            return false;
        }

        SubComponents other = (SubComponents) o;
        return java.util.Objects.equals(this.subCategory, other.subCategory)
                && java.util.Objects.equals(this.schema, other.schema)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subCategory == null ? 43 : this.subCategory.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
