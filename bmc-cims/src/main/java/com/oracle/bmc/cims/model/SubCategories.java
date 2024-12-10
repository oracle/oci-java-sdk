/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * List of subcategories under a service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubCategories.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubCategories extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "serviceCategory",
        "schema",
        "hasSubCategory",
        "subCategories"
    })
    public SubCategories(
            java.util.Map<String, String> serviceCategory,
            String schema,
            String hasSubCategory,
            java.util.List<SubComponents> subCategories) {
        super();
        this.serviceCategory = serviceCategory;
        this.schema = schema;
        this.hasSubCategory = hasSubCategory;
        this.subCategories = subCategories;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Subcategory list.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
        private java.util.Map<String, String> serviceCategory;

        /**
         * Subcategory list.
         * @param serviceCategory the value to set
         * @return this builder
         **/
        public Builder serviceCategory(java.util.Map<String, String> serviceCategory) {
            this.serviceCategory = serviceCategory;
            this.__explicitlySet__.add("serviceCategory");
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
        /**
         * Flag to identify if subComponent is present
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasSubCategory")
        private String hasSubCategory;

        /**
         * Flag to identify if subComponent is present
         * @param hasSubCategory the value to set
         * @return this builder
         **/
        public Builder hasSubCategory(String hasSubCategory) {
            this.hasSubCategory = hasSubCategory;
            this.__explicitlySet__.add("hasSubCategory");
            return this;
        }
        /**
         * The sub component list for MOS Taxonomy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subCategories")
        private java.util.List<SubComponents> subCategories;

        /**
         * The sub component list for MOS Taxonomy.
         * @param subCategories the value to set
         * @return this builder
         **/
        public Builder subCategories(java.util.List<SubComponents> subCategories) {
            this.subCategories = subCategories;
            this.__explicitlySet__.add("subCategories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubCategories build() {
            SubCategories model =
                    new SubCategories(
                            this.serviceCategory,
                            this.schema,
                            this.hasSubCategory,
                            this.subCategories);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubCategories model) {
            if (model.wasPropertyExplicitlySet("serviceCategory")) {
                this.serviceCategory(model.getServiceCategory());
            }
            if (model.wasPropertyExplicitlySet("schema")) {
                this.schema(model.getSchema());
            }
            if (model.wasPropertyExplicitlySet("hasSubCategory")) {
                this.hasSubCategory(model.getHasSubCategory());
            }
            if (model.wasPropertyExplicitlySet("subCategories")) {
                this.subCategories(model.getSubCategories());
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
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCategory")
    private final java.util.Map<String, String> serviceCategory;

    /**
     * Subcategory list.
     * @return the value
     **/
    public java.util.Map<String, String> getServiceCategory() {
        return serviceCategory;
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

    /**
     * Flag to identify if subComponent is present
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasSubCategory")
    private final String hasSubCategory;

    /**
     * Flag to identify if subComponent is present
     * @return the value
     **/
    public String getHasSubCategory() {
        return hasSubCategory;
    }

    /**
     * The sub component list for MOS Taxonomy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subCategories")
    private final java.util.List<SubComponents> subCategories;

    /**
     * The sub component list for MOS Taxonomy.
     * @return the value
     **/
    public java.util.List<SubComponents> getSubCategories() {
        return subCategories;
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
        sb.append("SubCategories(");
        sb.append("super=").append(super.toString());
        sb.append("serviceCategory=").append(String.valueOf(this.serviceCategory));
        sb.append(", schema=").append(String.valueOf(this.schema));
        sb.append(", hasSubCategory=").append(String.valueOf(this.hasSubCategory));
        sb.append(", subCategories=").append(String.valueOf(this.subCategories));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubCategories)) {
            return false;
        }

        SubCategories other = (SubCategories) o;
        return java.util.Objects.equals(this.serviceCategory, other.serviceCategory)
                && java.util.Objects.equals(this.schema, other.schema)
                && java.util.Objects.equals(this.hasSubCategory, other.hasSubCategory)
                && java.util.Objects.equals(this.subCategories, other.subCategories)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceCategory == null ? 43 : this.serviceCategory.hashCode());
        result = (result * PRIME) + (this.schema == null ? 43 : this.schema.hashCode());
        result =
                (result * PRIME)
                        + (this.hasSubCategory == null ? 43 : this.hasSubCategory.hashCode());
        result =
                (result * PRIME)
                        + (this.subCategories == null ? 43 : this.subCategories.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
