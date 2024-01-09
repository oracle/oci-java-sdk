/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Custom Property Definition <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CustomProperty.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomProperty
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Unique data asset key that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique data asset key that is immutable.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** Display name of the custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the custom property
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Data type of the custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private CustomPropertyDataType dataType;

        /**
         * Data type of the custom property
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(CustomPropertyDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** Description for the custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description for the custom property
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Namespace name of the custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Namespace name of the custom property
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** Is this property allowed to have list of values */
        @com.fasterxml.jackson.annotation.JsonProperty("isListType")
        private Boolean isListType;

        /**
         * Is this property allowed to have list of values
         *
         * @param isListType the value to set
         * @return this builder
         */
        public Builder isListType(Boolean isListType) {
            this.isListType = isListType;
            this.__explicitlySet__.add("isListType");
            return this;
        }
        /** If this field allows to sort from UI */
        @com.fasterxml.jackson.annotation.JsonProperty("isSortable")
        private Boolean isSortable;

        /**
         * If this field allows to sort from UI
         *
         * @param isSortable the value to set
         * @return this builder
         */
        public Builder isSortable(Boolean isSortable) {
            this.isSortable = isSortable;
            this.__explicitlySet__.add("isSortable");
            return this;
        }
        /** If this field allows to filter or create facets from UI */
        @com.fasterxml.jackson.annotation.JsonProperty("isFilterable")
        private Boolean isFilterable;

        /**
         * If this field allows to filter or create facets from UI
         *
         * @param isFilterable the value to set
         * @return this builder
         */
        public Builder isFilterable(Boolean isFilterable) {
            this.isFilterable = isFilterable;
            this.__explicitlySet__.add("isFilterable");
            return this;
        }
        /** If this field allows multiple values to be set */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
        private Boolean isMultiValued;

        /**
         * If this field allows multiple values to be set
         *
         * @param isMultiValued the value to set
         * @return this builder
         */
        public Builder isMultiValued(Boolean isMultiValued) {
            this.isMultiValued = isMultiValued;
            this.__explicitlySet__.add("isMultiValued");
            return this;
        }
        /** If this field is a hidden field */
        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        /**
         * If this field is a hidden field
         *
         * @param isHidden the value to set
         * @return this builder
         */
        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /** If this field is a editable field */
        @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
        private Boolean isEditable;

        /**
         * If this field is a editable field
         *
         * @param isEditable the value to set
         * @return this builder
         */
        public Builder isEditable(Boolean isEditable) {
            this.isEditable = isEditable;
            this.__explicitlySet__.add("isEditable");
            return this;
        }
        /** If this field is displayed in a list view of applicable objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("isShownInList")
        private Boolean isShownInList;

        /**
         * If this field is displayed in a list view of applicable objects.
         *
         * @param isShownInList the value to set
         * @return this builder
         */
        public Builder isShownInList(Boolean isShownInList) {
            this.isShownInList = isShownInList;
            this.__explicitlySet__.add("isShownInList");
            return this;
        }
        /** If this field is defined by service or by a user */
        @com.fasterxml.jackson.annotation.JsonProperty("isServiceDefined")
        private Boolean isServiceDefined;

        /**
         * If this field is defined by service or by a user
         *
         * @param isServiceDefined the value to set
         * @return this builder
         */
        public Builder isServiceDefined(Boolean isServiceDefined) {
            this.isServiceDefined = isServiceDefined;
            this.__explicitlySet__.add("isServiceDefined");
            return this;
        }
        /** If this field is allowed to pop in search results */
        @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
        private Boolean isHiddenInSearch;

        /**
         * If this field is allowed to pop in search results
         *
         * @param isHiddenInSearch the value to set
         * @return this builder
         */
        public Builder isHiddenInSearch(Boolean isHiddenInSearch) {
            this.isHiddenInSearch = isHiddenInSearch;
            this.__explicitlySet__.add("isHiddenInSearch");
            return this;
        }
        /** The current state of the custom property. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the custom property.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the custom property was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the custom property was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time that any change was made to the custom property. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the custom property. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** OCID of the user who created the custom property. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created the custom property.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who last modified the custom property. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who last modified the custom property.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
            return this;
        }
        /** Total number of first class objects using this custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("usageCount")
        private Integer usageCount;

        /**
         * Total number of first class objects using this custom property
         *
         * @param usageCount the value to set
         * @return this builder
         */
        public Builder usageCount(Integer usageCount) {
            this.usageCount = usageCount;
            this.__explicitlySet__.add("usageCount");
            return this;
        }
        /** If an OCI Event will be emitted when the custom property is modified. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
        private Boolean isEventEnabled;

        /**
         * If an OCI Event will be emitted when the custom property is modified.
         *
         * @param isEventEnabled the value to set
         * @return this builder
         */
        public Builder isEventEnabled(Boolean isEventEnabled) {
            this.isEventEnabled = isEventEnabled;
            this.__explicitlySet__.add("isEventEnabled");
            return this;
        }
        /** The set of object types to which the custom property applies. */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private java.util.List<CustomPropertyTypeUsage> scope;

        /**
         * The set of object types to which the custom property applies.
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(java.util.List<CustomPropertyTypeUsage> scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /** Allowed values for the custom property if any */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<String> allowedValues;

        /**
         * Allowed values for the custom property if any
         *
         * @param allowedValues the value to set
         * @return this builder
         */
        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }
        /**
         * Event configuration for this custom property, against the desired subset of object types
         * to which the property applies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("events")
        private java.util.List<EventConfig> events;

        /**
         * Event configuration for this custom property, against the desired subset of object types
         * to which the property applies.
         *
         * @param events the value to set
         * @return this builder
         */
        public Builder events(java.util.List<EventConfig> events) {
            this.events = events;
            this.__explicitlySet__.add("events");
            return this;
        }
        /**
         * A map of maps that contains the properties which are specific to the asset type. Each
         * data asset type definition defines it's set of required and optional properties. The map
         * keys are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most data assets have required properties
         * within the "default" category. Example: {@code {"properties": { "default": { "host":
         * "host1", "port": "1521", "database": "orcl"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the asset type. Each
         * data asset type definition defines it's set of required and optional properties. The map
         * keys are category names and the values are maps of property name to property value. Every
         * property is contained inside of a category. Most data assets have required properties
         * within the "default" category. Example: {@code {"properties": { "default": { "host":
         * "host1", "port": "1521", "database": "orcl"}}}}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomProperty build() {
            CustomProperty model =
                    new CustomProperty(
                            this.key,
                            this.displayName,
                            this.dataType,
                            this.description,
                            this.namespaceName,
                            this.isListType,
                            this.isSortable,
                            this.isFilterable,
                            this.isMultiValued,
                            this.isHidden,
                            this.isEditable,
                            this.isShownInList,
                            this.isServiceDefined,
                            this.isHiddenInSearch,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.usageCount,
                            this.isEventEnabled,
                            this.scope,
                            this.allowedValues,
                            this.events,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomProperty model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("isListType")) {
                this.isListType(model.getIsListType());
            }
            if (model.wasPropertyExplicitlySet("isSortable")) {
                this.isSortable(model.getIsSortable());
            }
            if (model.wasPropertyExplicitlySet("isFilterable")) {
                this.isFilterable(model.getIsFilterable());
            }
            if (model.wasPropertyExplicitlySet("isMultiValued")) {
                this.isMultiValued(model.getIsMultiValued());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("isEditable")) {
                this.isEditable(model.getIsEditable());
            }
            if (model.wasPropertyExplicitlySet("isShownInList")) {
                this.isShownInList(model.getIsShownInList());
            }
            if (model.wasPropertyExplicitlySet("isServiceDefined")) {
                this.isServiceDefined(model.getIsServiceDefined());
            }
            if (model.wasPropertyExplicitlySet("isHiddenInSearch")) {
                this.isHiddenInSearch(model.getIsHiddenInSearch());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("usageCount")) {
                this.usageCount(model.getUsageCount());
            }
            if (model.wasPropertyExplicitlySet("isEventEnabled")) {
                this.isEventEnabled(model.getIsEventEnabled());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
            }
            if (model.wasPropertyExplicitlySet("events")) {
                this.events(model.getEvents());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Unique data asset key that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique data asset key that is immutable.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Display name of the custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the custom property
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Data type of the custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final CustomPropertyDataType dataType;

    /**
     * Data type of the custom property
     *
     * @return the value
     */
    public CustomPropertyDataType getDataType() {
        return dataType;
    }

    /** Description for the custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description for the custom property
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Namespace name of the custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Namespace name of the custom property
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** Is this property allowed to have list of values */
    @com.fasterxml.jackson.annotation.JsonProperty("isListType")
    private final Boolean isListType;

    /**
     * Is this property allowed to have list of values
     *
     * @return the value
     */
    public Boolean getIsListType() {
        return isListType;
    }

    /** If this field allows to sort from UI */
    @com.fasterxml.jackson.annotation.JsonProperty("isSortable")
    private final Boolean isSortable;

    /**
     * If this field allows to sort from UI
     *
     * @return the value
     */
    public Boolean getIsSortable() {
        return isSortable;
    }

    /** If this field allows to filter or create facets from UI */
    @com.fasterxml.jackson.annotation.JsonProperty("isFilterable")
    private final Boolean isFilterable;

    /**
     * If this field allows to filter or create facets from UI
     *
     * @return the value
     */
    public Boolean getIsFilterable() {
        return isFilterable;
    }

    /** If this field allows multiple values to be set */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    private final Boolean isMultiValued;

    /**
     * If this field allows multiple values to be set
     *
     * @return the value
     */
    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    /** If this field is a hidden field */
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    /**
     * If this field is a hidden field
     *
     * @return the value
     */
    public Boolean getIsHidden() {
        return isHidden;
    }

    /** If this field is a editable field */
    @com.fasterxml.jackson.annotation.JsonProperty("isEditable")
    private final Boolean isEditable;

    /**
     * If this field is a editable field
     *
     * @return the value
     */
    public Boolean getIsEditable() {
        return isEditable;
    }

    /** If this field is displayed in a list view of applicable objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("isShownInList")
    private final Boolean isShownInList;

    /**
     * If this field is displayed in a list view of applicable objects.
     *
     * @return the value
     */
    public Boolean getIsShownInList() {
        return isShownInList;
    }

    /** If this field is defined by service or by a user */
    @com.fasterxml.jackson.annotation.JsonProperty("isServiceDefined")
    private final Boolean isServiceDefined;

    /**
     * If this field is defined by service or by a user
     *
     * @return the value
     */
    public Boolean getIsServiceDefined() {
        return isServiceDefined;
    }

    /** If this field is allowed to pop in search results */
    @com.fasterxml.jackson.annotation.JsonProperty("isHiddenInSearch")
    private final Boolean isHiddenInSearch;

    /**
     * If this field is allowed to pop in search results
     *
     * @return the value
     */
    public Boolean getIsHiddenInSearch() {
        return isHiddenInSearch;
    }

    /** The current state of the custom property. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the custom property.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the custom property was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the custom property was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time that any change was made to the custom property. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the custom property. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the user who created the custom property. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created the custom property.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who last modified the custom property. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who last modified the custom property.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
    }

    /** Total number of first class objects using this custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("usageCount")
    private final Integer usageCount;

    /**
     * Total number of first class objects using this custom property
     *
     * @return the value
     */
    public Integer getUsageCount() {
        return usageCount;
    }

    /** If an OCI Event will be emitted when the custom property is modified. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
    private final Boolean isEventEnabled;

    /**
     * If an OCI Event will be emitted when the custom property is modified.
     *
     * @return the value
     */
    public Boolean getIsEventEnabled() {
        return isEventEnabled;
    }

    /** The set of object types to which the custom property applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final java.util.List<CustomPropertyTypeUsage> scope;

    /**
     * The set of object types to which the custom property applies.
     *
     * @return the value
     */
    public java.util.List<CustomPropertyTypeUsage> getScope() {
        return scope;
    }

    /** Allowed values for the custom property if any */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<String> allowedValues;

    /**
     * Allowed values for the custom property if any
     *
     * @return the value
     */
    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    /**
     * Event configuration for this custom property, against the desired subset of object types to
     * which the property applies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("events")
    private final java.util.List<EventConfig> events;

    /**
     * Event configuration for this custom property, against the desired subset of object types to
     * which the property applies.
     *
     * @return the value
     */
    public java.util.List<EventConfig> getEvents() {
        return events;
    }

    /**
     * A map of maps that contains the properties which are specific to the asset type. Each data
     * asset type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most data assets have required properties within the
     * "default" category. Example: {@code {"properties": { "default": { "host": "host1", "port":
     * "1521", "database": "orcl"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the asset type. Each data
     * asset type definition defines it's set of required and optional properties. The map keys are
     * category names and the values are maps of property name to property value. Every property is
     * contained inside of a category. Most data assets have required properties within the
     * "default" category. Example: {@code {"properties": { "default": { "host": "host1", "port":
     * "1521", "database": "orcl"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("CustomProperty(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
