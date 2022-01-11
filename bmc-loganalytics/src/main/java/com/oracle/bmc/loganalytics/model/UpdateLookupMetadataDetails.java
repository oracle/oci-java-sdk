/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UpdateLookupMetadataDetails
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateLookupMetadataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateLookupMetadataDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
        private String defaultMatchValue;

        public Builder defaultMatchValue(String defaultMatchValue) {
            this.defaultMatchValue = defaultMatchValue;
            this.__explicitlySet__.add("defaultMatchValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<LogAnalyticsLookupFields> fields;

        public Builder fields(java.util.List<LogAnalyticsLookupFields> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxMatches")
        private Long maxMatches;

        public Builder maxMatches(Long maxMatches) {
            this.maxMatches = maxMatches;
            this.__explicitlySet__.add("maxMatches");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("categories")
        private java.util.List<LogAnalyticsCategory> categories;

        public Builder categories(java.util.List<LogAnalyticsCategory> categories) {
            this.categories = categories;
            this.__explicitlySet__.add("categories");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLookupMetadataDetails build() {
            UpdateLookupMetadataDetails __instance__ =
                    new UpdateLookupMetadataDetails(
                            defaultMatchValue, description, fields, maxMatches, categories);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLookupMetadataDetails o) {
            Builder copiedBuilder =
                    defaultMatchValue(o.getDefaultMatchValue())
                            .description(o.getDescription())
                            .fields(o.getFields())
                            .maxMatches(o.getMaxMatches())
                            .categories(o.getCategories());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The default match value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultMatchValue")
    String defaultMatchValue;

    /**
     * The lookup description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The lookup fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<LogAnalyticsLookupFields> fields;

    /**
     * The maximum number of matches.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMatches")
    Long maxMatches;

    /**
     * An array of categories to assign to the lookup. Specifying the name attribute for each category would suffice.
     * Oracle-defined category assignments cannot be removed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categories")
    java.util.List<LogAnalyticsCategory> categories;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
