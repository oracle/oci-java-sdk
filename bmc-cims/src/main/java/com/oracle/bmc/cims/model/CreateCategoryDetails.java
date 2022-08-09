/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details for creating the category of the support ticket.
 * <p>
 **Caution:** Avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCategoryDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCategoryDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"categoryKey"})
    public CreateCategoryDetails(String categoryKey) {
        super();
        this.categoryKey = categoryKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categoryKey")
        private String categoryKey;

        /**
         * Unique identifier for the category.
         * @param categoryKey the value to set
         * @return this builder
         **/
        public Builder categoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            this.__explicitlySet__.add("categoryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCategoryDetails build() {
            CreateCategoryDetails model = new CreateCategoryDetails(this.categoryKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCategoryDetails model) {
            if (model.wasPropertyExplicitlySet("categoryKey")) {
                this.categoryKey(model.getCategoryKey());
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
     * Unique identifier for the category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryKey")
    private final String categoryKey;

    /**
     * Unique identifier for the category.
     * @return the value
     **/
    public String getCategoryKey() {
        return categoryKey;
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
        sb.append("CreateCategoryDetails(");
        sb.append("super=").append(super.toString());
        sb.append("categoryKey=").append(String.valueOf(this.categoryKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCategoryDetails)) {
            return false;
        }

        CreateCategoryDetails other = (CreateCategoryDetails) o;
        return java.util.Objects.equals(this.categoryKey, other.categoryKey) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.categoryKey == null ? 43 : this.categoryKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
