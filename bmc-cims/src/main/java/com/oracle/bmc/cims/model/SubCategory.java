/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about the subcategory associated with the support ticket. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubCategory.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SubCategory extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subCategoryKey", "name"})
    public SubCategory(String subCategoryKey, String name) {
        super();
        this.subCategoryKey = subCategoryKey;
        this.name = name;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the subcategory. */
        @com.fasterxml.jackson.annotation.JsonProperty("subCategoryKey")
        private String subCategoryKey;

        /**
         * Unique identifier for the subcategory.
         *
         * @param subCategoryKey the value to set
         * @return this builder
         */
        public Builder subCategoryKey(String subCategoryKey) {
            this.subCategoryKey = subCategoryKey;
            this.__explicitlySet__.add("subCategoryKey");
            return this;
        }
        /**
         * The name of the subcategory. For example, {@code Backup Count} or {@code Custom Image
         * Count}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the subcategory. For example, {@code Backup Count} or {@code Custom Image
         * Count}.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubCategory build() {
            SubCategory model = new SubCategory(this.subCategoryKey, this.name);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubCategory model) {
            if (model.wasPropertyExplicitlySet("subCategoryKey")) {
                this.subCategoryKey(model.getSubCategoryKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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

    /** Unique identifier for the subcategory. */
    @com.fasterxml.jackson.annotation.JsonProperty("subCategoryKey")
    private final String subCategoryKey;

    /**
     * Unique identifier for the subcategory.
     *
     * @return the value
     */
    public String getSubCategoryKey() {
        return subCategoryKey;
    }

    /**
     * The name of the subcategory. For example, {@code Backup Count} or {@code Custom Image Count}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the subcategory. For example, {@code Backup Count} or {@code Custom Image Count}.
     *
     * @return the value
     */
    public String getName() {
        return name;
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
        sb.append("SubCategory(");
        sb.append("super=").append(super.toString());
        sb.append("subCategoryKey=").append(String.valueOf(this.subCategoryKey));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubCategory)) {
            return false;
        }

        SubCategory other = (SubCategory) o;
        return java.util.Objects.equals(this.subCategoryKey, other.subCategoryKey)
                && java.util.Objects.equals(this.name, other.name)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subCategoryKey == null ? 43 : this.subCategoryKey.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
