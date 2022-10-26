/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Properties used in custom atrribute update operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCustomPropertyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateCustomPropertyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "isSortable",
        "isFilterable",
        "isMultiValued",
        "isHidden",
        "isEditable",
        "isShownInList",
        "isHiddenInSearch",
        "isEventEnabled",
        "allowedValues",
        "properties"
    })
    public UpdateCustomPropertyDetails(
            String displayName,
            String description,
            Boolean isSortable,
            Boolean isFilterable,
            Boolean isMultiValued,
            Boolean isHidden,
            Boolean isEditable,
            Boolean isShownInList,
            Boolean isHiddenInSearch,
            Boolean isEventEnabled,
            java.util.List<String> allowedValues,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.isSortable = isSortable;
        this.isFilterable = isFilterable;
        this.isMultiValued = isMultiValued;
        this.isHidden = isHidden;
        this.isEditable = isEditable;
        this.isShownInList = isShownInList;
        this.isHiddenInSearch = isHiddenInSearch;
        this.isEventEnabled = isEventEnabled;
        this.allowedValues = allowedValues;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detailed description of the data asset. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the data asset.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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

        public UpdateCustomPropertyDetails build() {
            UpdateCustomPropertyDetails model =
                    new UpdateCustomPropertyDetails(
                            this.displayName,
                            this.description,
                            this.isSortable,
                            this.isFilterable,
                            this.isMultiValued,
                            this.isHidden,
                            this.isEditable,
                            this.isShownInList,
                            this.isHiddenInSearch,
                            this.isEventEnabled,
                            this.allowedValues,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCustomPropertyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("isHiddenInSearch")) {
                this.isHiddenInSearch(model.getIsHiddenInSearch());
            }
            if (model.wasPropertyExplicitlySet("isEventEnabled")) {
                this.isEventEnabled(model.getIsEventEnabled());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
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

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detailed description of the data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the data asset.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("UpdateCustomPropertyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isSortable=").append(String.valueOf(this.isSortable));
        sb.append(", isFilterable=").append(String.valueOf(this.isFilterable));
        sb.append(", isMultiValued=").append(String.valueOf(this.isMultiValued));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", isEditable=").append(String.valueOf(this.isEditable));
        sb.append(", isShownInList=").append(String.valueOf(this.isShownInList));
        sb.append(", isHiddenInSearch=").append(String.valueOf(this.isHiddenInSearch));
        sb.append(", isEventEnabled=").append(String.valueOf(this.isEventEnabled));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCustomPropertyDetails)) {
            return false;
        }

        UpdateCustomPropertyDetails other = (UpdateCustomPropertyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isSortable, other.isSortable)
                && java.util.Objects.equals(this.isFilterable, other.isFilterable)
                && java.util.Objects.equals(this.isMultiValued, other.isMultiValued)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.isEditable, other.isEditable)
                && java.util.Objects.equals(this.isShownInList, other.isShownInList)
                && java.util.Objects.equals(this.isHiddenInSearch, other.isHiddenInSearch)
                && java.util.Objects.equals(this.isEventEnabled, other.isEventEnabled)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
                        + (this.isHiddenInSearch == null ? 43 : this.isHiddenInSearch.hashCode());
        result =
                (result * PRIME)
                        + (this.isEventEnabled == null ? 43 : this.isEventEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
