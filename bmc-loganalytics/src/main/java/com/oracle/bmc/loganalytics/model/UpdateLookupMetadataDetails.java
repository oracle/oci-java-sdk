/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UpdateLookupMetadataDetails <br>
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
        builder = UpdateLookupMetadataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateLookupMetadataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultMatchValue",
        "description",
        "fields",
        "maxMatches",
        "categories"
    })
    public UpdateLookupMetadataDetails(
            String defaultMatchValue,
            String description,
            java.util.List<LogAnalyticsLookupFields> fields,
            Long maxMatches,
            java.util.List<LogAnalyticsCategory> categories) {
        super();
        this.defaultMatchValue = defaultMatchValue;
        this.description = description;
        this.fields = fields;
        this.maxMatches = maxMatches;
        this.categories = categories;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The default match value. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
        private String defaultMatchValue;

        /**
         * The default match value.
         *
         * @param defaultMatchValue the value to set
         * @return this builder
         */
        public Builder defaultMatchValue(String defaultMatchValue) {
            this.defaultMatchValue = defaultMatchValue;
            this.__explicitlySet__.add("defaultMatchValue");
            return this;
        }
        /** The lookup description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The lookup description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The lookup fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<LogAnalyticsLookupFields> fields;

        /**
         * The lookup fields.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<LogAnalyticsLookupFields> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /** The maximum number of matches. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxMatches")
        private Long maxMatches;

        /**
         * The maximum number of matches.
         *
         * @param maxMatches the value to set
         * @return this builder
         */
        public Builder maxMatches(Long maxMatches) {
            this.maxMatches = maxMatches;
            this.__explicitlySet__.add("maxMatches");
            return this;
        }
        /**
         * An array of categories to assign to the lookup. Specifying the name attribute for each
         * category would suffice. Oracle-defined category assignments cannot be removed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<LogAnalyticsCategory> categories;

        /**
         * An array of categories to assign to the lookup. Specifying the name attribute for each
         * category would suffice. Oracle-defined category assignments cannot be removed.
         *
         * @param categories the value to set
         * @return this builder
         */
        public Builder categories(java.util.List<LogAnalyticsCategory> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLookupMetadataDetails build() {
            UpdateLookupMetadataDetails model =
                    new UpdateLookupMetadataDetails(
                            this.defaultMatchValue,
                            this.description,
                            this.fields,
                            this.maxMatches,
                            this.categories);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLookupMetadataDetails model) {
            if (model.wasPropertyExplicitlySet("defaultMatchValue")) {
                this.defaultMatchValue(model.getDefaultMatchValue());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("maxMatches")) {
                this.maxMatches(model.getMaxMatches());
            }
            if (model.wasPropertyExplicitlySet("categories")) {
                this.categories(model.getCategories());
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

    /** The default match value. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
    private final String defaultMatchValue;

    /**
     * The default match value.
     *
     * @return the value
     */
    public String getDefaultMatchValue() {
        return defaultMatchValue;
    }

    /** The lookup description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The lookup description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The lookup fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<LogAnalyticsLookupFields> fields;

    /**
     * The lookup fields.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsLookupFields> getFields() {
        return fields;
    }

    /** The maximum number of matches. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxMatches")
    private final Long maxMatches;

    /**
     * The maximum number of matches.
     *
     * @return the value
     */
    public Long getMaxMatches() {
        return maxMatches;
    }

    /**
     * An array of categories to assign to the lookup. Specifying the name attribute for each
     * category would suffice. Oracle-defined category assignments cannot be removed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    private final java.util.List<LogAnalyticsCategory> categories;

    /**
     * An array of categories to assign to the lookup. Specifying the name attribute for each
     * category would suffice. Oracle-defined category assignments cannot be removed.
     *
     * @return the value
     */
    public java.util.List<LogAnalyticsCategory> getCategories() {
        return categories;
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
        sb.append("UpdateLookupMetadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("defaultMatchValue=").append(String.valueOf(this.defaultMatchValue));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", maxMatches=").append(String.valueOf(this.maxMatches));
        sb.append(", categories=").append(String.valueOf(this.categories));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLookupMetadataDetails)) {
            return false;
        }

        UpdateLookupMetadataDetails other = (UpdateLookupMetadataDetails) o;
        return java.util.Objects.equals(this.defaultMatchValue, other.defaultMatchValue)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.maxMatches, other.maxMatches)
                && java.util.Objects.equals(this.categories, other.categories)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultMatchValue == null ? 43 : this.defaultMatchValue.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.maxMatches == null ? 43 : this.maxMatches.hashCode());
        result = (result * PRIME) + (this.categories == null ? 43 : this.categories.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
