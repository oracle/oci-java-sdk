/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A collection of resources and their category assignments. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LogAnalyticsResourceCategoryCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LogAnalyticsResourceCategoryCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"categories", "items"})
    public LogAnalyticsResourceCategoryCollection(
            java.util.List<LogAnalyticsCategory> categories,
            java.util.List<LogAnalyticsResourceCategory> items) {
        super();
        this.categories = categories;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of categories. The array contents include detailed information about the
         * distinct set of categories assigned to all the listed resources under items.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<LogAnalyticsCategory> categories;

        /**
         * An array of categories. The array contents include detailed information about the
         * distinct set of categories assigned to all the listed resources under items.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<LogAnalyticsCategory> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }
        /** A list of resources and their category assignments */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<LogAnalyticsResourceCategory> items;

        /**
         * A list of resources and their category assignments
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<LogAnalyticsResourceCategory> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsResourceCategoryCollection build() {
            LogAnalyticsResourceCategoryCollection model =
                    new LogAnalyticsResourceCategoryCollection(this.categories, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsResourceCategoryCollection model) {
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /**
     * An array of categories. The array contents include detailed information about the distinct
     * set of categories assigned to all the listed resources under items.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<LogAnalyticsCategory> categories;

    /**
     * An array of categories. The array contents include detailed information about the distinct
     * set of categories assigned to all the listed resources under items.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsCategory> getCategories() {
        return categories;
    }

    /** A list of resources and their category assignments */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<LogAnalyticsResourceCategory> items;

    /**
     * A list of resources and their category assignments
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsResourceCategory> getItems() {
        return items;
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
        sb.append("LogAnalyticsResourceCategoryCollection(");
        sb.append("super=").append(super.toString());
        sb.append("categories=").append(String.valueOf(this.categories));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsResourceCategoryCollection)) {
            return false;
        }

        LogAnalyticsResourceCategoryCollection other = (LogAnalyticsResourceCategoryCollection) o;
        return java.util.Objects.equals(this.categories, other.categories)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
