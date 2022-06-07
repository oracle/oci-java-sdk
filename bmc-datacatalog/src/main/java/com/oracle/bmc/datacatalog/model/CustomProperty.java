/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Custom Property Definition
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CustomProperty.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomProperty {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "dataType",
        "description",
        "namespaceName",
        "isListType",
        "isSortable",
        "isFilterable",
        "isMultiValued",
        "isHidden",
        "isEditable",
        "isShownInList",
        "isServiceDefined",
        "isHiddenInSearch",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "usageCount",
        "isEventEnabled",
        "scope",
        "allowedValues",
        "events",
        "properties"
    })
    public CustomProperty(
            String key,
            String displayName,
            CustomPropertyDataType dataType,
            String description,
            String namespaceName,
            Boolean isListType,
            Boolean isSortable,
            Boolean isFilterable,
            Boolean isMultiValued,
            Boolean isHidden,
            Boolean isEditable,
            Boolean isShownInList,
            Boolean isServiceDefined,
            Boolean isHiddenInSearch,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            Integer usageCount,
            Boolean isEventEnabled,
            java.util.List<CustomPropertyTypeUsage> scope,
            java.util.List<String> allowedValues,
            java.util.List<EventConfig> events,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.dataType = dataType;
        this.description = description;
        this.namespaceName = namespaceName;
        this.isListType = isListType;
        this.isSortable = isSortable;
        this.isFilterable = isFilterable;
        this.isMultiValued = isMultiValued;
        this.isHidden = isHidden;
        this.isEditable = isEditable;
        this.isShownInList = isShownInList;
        this.isServiceDefined = isServiceDefined;
        this.isHiddenInSearch = isHiddenInSearch;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.usageCount = usageCount;
        this.isEventEnabled = isEventEnabled;
        this.scope = scope;
        this.allowedValues = allowedValues;
        this.events = events;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private CustomPropertyDataType dataType;

        public Builder dataType(CustomPropertyDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isListType")
        private Boolean isListType;

        public Builder isListType(Boolean isListType) {
            this.isListType = isListType;
            this.__explicitlySet__.add("isListType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("usageCount")
        private Integer usageCount;

        public Builder usageCount(Integer usageCount) {
            this.usageCount = usageCount;
            this.__explicitlySet__.add("usageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
        private Boolean isEventEnabled;

        public Builder isEventEnabled(Boolean isEventEnabled) {
            this.isEventEnabled = isEventEnabled;
            this.__explicitlySet__.add("isEventEnabled");
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

        @com.fasterxml.jackson.annotation.JsonProperty("events")
        private java.util.List<EventConfig> events;

        public Builder events(java.util.List<EventConfig> events) {
            this.events = events;
            this.__explicitlySet__.add("events");
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

        public CustomProperty build() {
            CustomProperty __instance__ =
                    new CustomProperty(
                            key,
                            displayName,
                            dataType,
                            description,
                            namespaceName,
                            isListType,
                            isSortable,
                            isFilterable,
                            isMultiValued,
                            isHidden,
                            isEditable,
                            isShownInList,
                            isServiceDefined,
                            isHiddenInSearch,
                            lifecycleState,
                            timeCreated,
                            timeUpdated,
                            createdById,
                            updatedById,
                            usageCount,
                            isEventEnabled,
                            scope,
                            allowedValues,
                            events,
                            properties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomProperty o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .dataType(o.getDataType())
                            .description(o.getDescription())
                            .namespaceName(o.getNamespaceName())
                            .isListType(o.getIsListType())
                            .isSortable(o.getIsSortable())
                            .isFilterable(o.getIsFilterable())
                            .isMultiValued(o.getIsMultiValued())
                            .isHidden(o.getIsHidden())
                            .isEditable(o.getIsEditable())
                            .isShownInList(o.getIsShownInList())
                            .isServiceDefined(o.getIsServiceDefined())
                            .isHiddenInSearch(o.getIsHiddenInSearch())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .createdById(o.getCreatedById())
                            .updatedById(o.getUpdatedById())
                            .usageCount(o.getUsageCount())
                            .isEventEnabled(o.getIsEventEnabled())
                            .scope(o.getScope())
                            .allowedValues(o.getAllowedValues())
                            .events(o.getEvents())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique data asset key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * Display name of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Data type of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final CustomPropertyDataType dataType;

    public CustomPropertyDataType getDataType() {
        return dataType;
    }

    /**
     * Description for the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Namespace name of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * Is this property allowed to have list of values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isListType")
    private final Boolean isListType;

    public Boolean getIsListType() {
        return isListType;
    }

    /**
     * If this field allows to sort from UI
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSortable")
    private final Boolean isSortable;

    public Boolean getIsSortable() {
        return isSortable;
    }

    /**
     * If this field allows to filter or create facets from UI
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFilterable")
    private final Boolean isFilterable;

    public Boolean getIsFilterable() {
        return isFilterable;
    }

    /**
     * If this field allows multiple values to be set
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    private final Boolean isMultiValued;

    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    /**
     * If this field is a hidden field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * If this field is a editable field
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
    private final Boolean isEditable;

    public Boolean getIsEditable() {
        return isEditable;
    }

    /**
     * If this field is displayed in a list view of applicable objects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isShownInList")
    private final Boolean isShownInList;

    public Boolean getIsShownInList() {
        return isShownInList;
    }

    /**
     * If this field is defined by service or by a user
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isServiceDefined")
    private final Boolean isServiceDefined;

    public Boolean getIsServiceDefined() {
        return isServiceDefined;
    }

    /**
     * If this field is allowed to pop in search results
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
    private final Boolean isHiddenInSearch;

    public Boolean getIsHiddenInSearch() {
        return isHiddenInSearch;
    }

    /**
     * The current state of the custom property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the custom property was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the custom property. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * OCID of the user who created the custom property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    public String getCreatedById() {
        return createdById;
    }

    /**
     * OCID of the user who last modified the custom property.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    public String getUpdatedById() {
        return updatedById;
    }

    /**
     * Total number of first class objects using this custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageCount")
    private final Integer usageCount;

    public Integer getUsageCount() {
        return usageCount;
    }

    /**
     * If an OCI Event will be emitted when the custom property is modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
    private final Boolean isEventEnabled;

    public Boolean getIsEventEnabled() {
        return isEventEnabled;
    }

    /**
     * The set of object types to which the custom property applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final java.util.List<CustomPropertyTypeUsage> scope;

    public java.util.List<CustomPropertyTypeUsage> getScope() {
        return scope;
    }

    /**
     * Allowed values for the custom property if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<String> allowedValues;

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * Event configuration for this custom property, against the desired subset of object types to which the property applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("events")
    private final java.util.List<EventConfig> events;

    public java.util.List<EventConfig> getEvents() {
        return events;
    }

    /**
     * A map of maps that contains the properties which are specific to the asset type. Each data asset type
     * definition defines it's set of required and optional properties. The map keys are category names and the
     * values are maps of property name to property value. Every property is contained inside of a category. Most
     * data assets have required properties within the "default" category.
     * Example: {@code {"properties": { "default": { "host": "host1", "port": "1521", "database": "orcl"}}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomProperty(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", isListType=").append(String.valueOf(this.isListType));
        sb.append(", isSortable=").append(String.valueOf(this.isSortable));
        sb.append(", isFilterable=").append(String.valueOf(this.isFilterable));
        sb.append(", isMultiValued=").append(String.valueOf(this.isMultiValued));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", isEditable=").append(String.valueOf(this.isEditable));
        sb.append(", isShownInList=").append(String.valueOf(this.isShownInList));
        sb.append(", isServiceDefined=").append(String.valueOf(this.isServiceDefined));
        sb.append(", isHiddenInSearch=").append(String.valueOf(this.isHiddenInSearch));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", usageCount=").append(String.valueOf(this.usageCount));
        sb.append(", isEventEnabled=").append(String.valueOf(this.isEventEnabled));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", events=").append(String.valueOf(this.events));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomProperty)) {
            return false;
        }

        CustomProperty other = (CustomProperty) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.isListType, other.isListType)
                && java.util.Objects.equals(this.isSortable, other.isSortable)
                && java.util.Objects.equals(this.isFilterable, other.isFilterable)
                && java.util.Objects.equals(this.isMultiValued, other.isMultiValued)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.isEditable, other.isEditable)
                && java.util.Objects.equals(this.isShownInList, other.isShownInList)
                && java.util.Objects.equals(this.isServiceDefined, other.isServiceDefined)
                && java.util.Objects.equals(this.isHiddenInSearch, other.isHiddenInSearch)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.usageCount, other.usageCount)
                && java.util.Objects.equals(this.isEventEnabled, other.isEventEnabled)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.events, other.events)
                && java.util.Objects.equals(this.properties, other.properties)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.isListType == null ? 43 : this.isListType.hashCode());
        result = (result * PRIME) + (this.isSortable == null ? 43 : this.isSortable.hashCode());
        result = (result * PRIME) + (this.isFilterable == null ? 43 : this.isFilterable.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiValued == null ? 43 : this.isMultiValued.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result = (result * PRIME) + (this.isEditable == null ? 43 : this.isEditable.hashCode());
        result =
                (result * PRIME)
                        + (this.isShownInList == null ? 43 : this.isShownInList.hashCode());
        result =
                (result * PRIME)
                        + (this.isServiceDefined == null ? 43 : this.isServiceDefined.hashCode());
        result =
                (result * PRIME)
                        + (this.isHiddenInSearch == null ? 43 : this.isHiddenInSearch.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.usageCount == null ? 43 : this.usageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.isEventEnabled == null ? 43 : this.isEventEnabled.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result = (result * PRIME) + (this.events == null ? 43 : this.events.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
