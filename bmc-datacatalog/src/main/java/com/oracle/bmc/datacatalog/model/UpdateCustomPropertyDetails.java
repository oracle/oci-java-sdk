/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in custom atrribute update operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCustomPropertyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateCustomPropertyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSortable")
        private Boolean isSortable;

        public Builder isSortable(Boolean isSortable) {
            this.isSortable = isSortable;
            this.__explicitlySet__.add("isSortable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFilterable")
        private Boolean isFilterable;

        public Builder isFilterable(Boolean isFilterable) {
            this.isFilterable = isFilterable;
            this.__explicitlySet__.add("isFilterable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
        private Boolean isEditable;

        public Builder isEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            this.__explicitlySet__.add("isEditable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isShownInList")
        private Boolean isShownInList;

        public Builder isShownInList(Boolean isShownInList) {
            this.isShownInList = isShownInList;
            this.__explicitlySet__.add("isShownInList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
        private Boolean isHiddenInSearch;

        public Builder isHiddenInSearch(Boolean isHiddenInSearch) {
            this.isHiddenInSearch = isHiddenInSearch;
            this.__explicitlySet__.add("isHiddenInSearch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
        private Boolean isEventEnabled;

        public Builder isEventEnabled(Boolean isEventEnabled) {
            this.isEventEnabled = isEventEnabled;
            this.__explicitlySet__.add("isEventEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<String> allowedValues;

        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCustomPropertyDetails build() {
            UpdateCustomPropertyDetails __instance__ =
                    new UpdateCustomPropertyDetails(
                            displayName,
                            description,
                            isSortable,
                            isFilterable,
                            isMultiValued,
                            isHidden,
                            isEditable,
                            isShownInList,
                            isHiddenInSearch,
                            isEventEnabled,
                            allowedValues,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCustomPropertyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .isSortable(o.getIsSortable())
                            .isFilterable(o.getIsFilterable())
                            .isMultiValued(o.getIsMultiValued())
                            .isHidden(o.getIsHidden())
                            .isEditable(o.getIsEditable())
                            .isShownInList(o.getIsShownInList())
                            .isHiddenInSearch(o.getIsHiddenInSearch())
                            .isEventEnabled(o.getIsEventEnabled())
                            .allowedValues(o.getAllowedValues())
                            .properties(o.getProperties());

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
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * If this field allows to sort from UI
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSortable")
    Boolean isSortable;

    /**
     * If this field allows to filter or create facets from UI
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFilterable")
    Boolean isFilterable;

    /**
     * If this field allows multiple values to be set
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    Boolean isMultiValued;

    /**
     * If this field is a hidden field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    Boolean isHidden;

    /**
     * If this field is a editable field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
    Boolean isEditable;

    /**
     * If this field is displayed in a list view of applicable objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShownInList")
    Boolean isShownInList;

    /**
     * If this field is allowed to pop in search results
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
    Boolean isHiddenInSearch;

    /**
     * If an OCI Event will be emitted when the custom property is modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
    Boolean isEventEnabled;

    /**
     * Allowed values for the custom property if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    java.util.List<String> allowedValues;

    /**
     * A map of maps that contains the properties which are specific to the asset type. Each data asset type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * data assets have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "host": "host1", "port": "1521", "database": "orcl"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    java.util.Map<String, java.util.Map<String, String>> properties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
