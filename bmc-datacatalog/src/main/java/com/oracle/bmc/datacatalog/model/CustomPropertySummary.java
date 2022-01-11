/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of a custom property
 *
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
    builder = CustomPropertySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CustomPropertySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private CustomPropertyDataType dataType;

        public Builder dataType(CustomPropertyDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isServiceDefined")
        private Boolean isServiceDefined;

        public Builder isServiceDefined(Boolean isServiceDefined) {
            this.isServiceDefined = isServiceDefined;
            this.__explicitlySet__.add("isServiceDefined");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
        private Boolean isHiddenInSearch;

        public Builder isHiddenInSearch(Boolean isHiddenInSearch) {
            this.isHiddenInSearch = isHiddenInSearch;
            this.__explicitlySet__.add("isHiddenInSearch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageCount")
        private Integer usageCount;

        public Builder usageCount(Integer usageCount) {
            this.usageCount = usageCount;
            this.__explicitlySet__.add("usageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private java.util.List<CustomPropertyTypeUsage> scope;

        public Builder scope(java.util.List<CustomPropertyTypeUsage> scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<String> allowedValues;

        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
        private Boolean isEventEnabled;

        public Builder isEventEnabled(Boolean isEventEnabled) {
            this.isEventEnabled = isEventEnabled;
            this.__explicitlySet__.add("isEventEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("events")
        private java.util.List<EventConfig> events;

        public Builder events(java.util.List<EventConfig> events) {
            this.events = events;
            this.__explicitlySet__.add("events");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomPropertySummary build() {
            CustomPropertySummary __instance__ =
                    new CustomPropertySummary(
                            key,
                            displayName,
                            description,
                            dataType,
                            namespaceName,
                            isSortable,
                            isFilterable,
                            isMultiValued,
                            isHidden,
                            isEditable,
                            isShownInList,
                            isServiceDefined,
                            isHiddenInSearch,
                            timeCreated,
                            lifecycleState,
                            usageCount,
                            scope,
                            allowedValues,
                            timeUpdated,
                            createdById,
                            updatedById,
                            isEventEnabled,
                            events);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomPropertySummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .dataType(o.getDataType())
                            .namespaceName(o.getNamespaceName())
                            .isSortable(o.getIsSortable())
                            .isFilterable(o.getIsFilterable())
                            .isMultiValued(o.getIsMultiValued())
                            .isHidden(o.getIsHidden())
                            .isEditable(o.getIsEditable())
                            .isShownInList(o.getIsShownInList())
                            .isServiceDefined(o.getIsServiceDefined())
                            .isHiddenInSearch(o.getIsHiddenInSearch())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .usageCount(o.getUsageCount())
                            .scope(o.getScope())
                            .allowedValues(o.getAllowedValues())
                            .timeUpdated(o.getTimeUpdated())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById())
                            .isEventEnabled(o.getIsEventEnabled())
                            .events(o.getEvents());

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
     * Unique custom property key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Display name of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Data type of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    CustomPropertyDataType dataType;

    /**
     * Namespace name of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    String namespaceName;

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
     * If this field is defined by service or by a user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isServiceDefined")
    Boolean isServiceDefined;

    /**
     * If this field is allowed to pop in search results
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
    Boolean isHiddenInSearch;

    /**
     * The date and time the custom property was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The current state of the custom property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Total number of first class objects using this custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageCount")
    Integer usageCount;

    /**
     * Type or scope of the custom property belongs to. This will be an array of type id it will be belongs to
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    java.util.List<CustomPropertyTypeUsage> scope;

    /**
     * Allowed values for the custom property if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    java.util.List<String> allowedValues;

    /**
     * The last time that any change was made to the custom property. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * OCID of the user who created the custom property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    String createdById;

    /**
     * OCID of the user who last modified the custom property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    String updatedById;

    /**
     * If an OCI Event will be emitted when the custom property is modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
    Boolean isEventEnabled;

    /**
     * Event configuration for this custom property, against the desired subset of object types to which the property applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("events")
    java.util.List<EventConfig> events;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
