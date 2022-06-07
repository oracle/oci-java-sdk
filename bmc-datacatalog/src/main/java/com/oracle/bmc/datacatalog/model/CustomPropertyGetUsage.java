/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a single custom property
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomPropertyGetUsage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CustomPropertyGetUsage {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "value",
        "dataType",
        "namespaceName",
        "namespaceKey",
        "isMultiValued",
        "isHidden",
        "isEditable",
        "isShownInList",
        "isEventEnabled",
        "isListType",
        "allowedValues"
    })
    public CustomPropertyGetUsage(
            String key,
            String displayName,
            String description,
            String value,
            CustomPropertyDataType dataType,
            String namespaceName,
            String namespaceKey,
            Boolean isMultiValued,
            Boolean isHidden,
            Boolean isEditable,
            Boolean isShownInList,
            Boolean isEventEnabled,
            Boolean isListType,
            java.util.List<String> allowedValues) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.value = value;
        this.dataType = dataType;
        this.namespaceName = namespaceName;
        this.namespaceKey = namespaceKey;
        this.isMultiValued = isMultiValued;
        this.isHidden = isHidden;
        this.isEditable = isEditable;
        this.isShownInList = isShownInList;
        this.isEventEnabled = isEventEnabled;
        this.isListType = isListType;
        this.allowedValues = allowedValues;
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
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

        @com.fasterxml.jackson.annotation.JsonProperty("namespaceKey")
        private String namespaceKey;

        public Builder namespaceKey(String namespaceKey) {
            this.namespaceKey = namespaceKey;
            this.__explicitlySet__.add("namespaceKey");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
        private Boolean isEventEnabled;

        public Builder isEventEnabled(Boolean isEventEnabled) {
            this.isEventEnabled = isEventEnabled;
            this.__explicitlySet__.add("isEventEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isListType")
        private Boolean isListType;

        public Builder isListType(Boolean isListType) {
            this.isListType = isListType;
            this.__explicitlySet__.add("isListType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<String> allowedValues;

        public Builder allowedValues(java.util.List<String> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomPropertyGetUsage build() {
            CustomPropertyGetUsage __instance__ =
                    new CustomPropertyGetUsage(
                            key,
                            displayName,
                            description,
                            value,
                            dataType,
                            namespaceName,
                            namespaceKey,
                            isMultiValued,
                            isHidden,
                            isEditable,
                            isShownInList,
                            isEventEnabled,
                            isListType,
                            allowedValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomPropertyGetUsage o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .value(o.getValue())
                            .dataType(o.getDataType())
                            .namespaceName(o.getNamespaceName())
                            .namespaceKey(o.getNamespaceKey())
                            .isMultiValued(o.getIsMultiValued())
                            .isHidden(o.getIsHidden())
                            .isEditable(o.getIsEditable())
                            .isShownInList(o.getIsShownInList())
                            .isEventEnabled(o.getIsEventEnabled())
                            .isListType(o.getIsListType())
                            .allowedValues(o.getAllowedValues());

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
     * Unique Identifier of the attribute which is ID
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
     * Description of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The custom property value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    public String getValue() {
        return value;
    }

    /**
     * The data type of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final CustomPropertyDataType dataType;

    public CustomPropertyDataType getDataType() {
        return dataType;
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
     * Unique namespace key that is immutable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceKey")
    private final String namespaceKey;

    public String getNamespaceKey() {
        return namespaceKey;
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
     * If an OCI Event will be emitted when the custom property is modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEventEnabled")
    private final Boolean isEventEnabled;

    public Boolean getIsEventEnabled() {
        return isEventEnabled;
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
     * Allowed values for the custom property if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<String> allowedValues;

    public java.util.List<String> getAllowedValues() {
        return allowedValues;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CustomPropertyGetUsage(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", namespaceKey=").append(String.valueOf(this.namespaceKey));
        sb.append(", isMultiValued=").append(String.valueOf(this.isMultiValued));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", isEditable=").append(String.valueOf(this.isEditable));
        sb.append(", isShownInList=").append(String.valueOf(this.isShownInList));
        sb.append(", isEventEnabled=").append(String.valueOf(this.isEventEnabled));
        sb.append(", isListType=").append(String.valueOf(this.isListType));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomPropertyGetUsage)) {
            return false;
        }

        CustomPropertyGetUsage other = (CustomPropertyGetUsage) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.namespaceKey, other.namespaceKey)
                && java.util.Objects.equals(this.isMultiValued, other.isMultiValued)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.isEditable, other.isEditable)
                && java.util.Objects.equals(this.isShownInList, other.isShownInList)
                && java.util.Objects.equals(this.isEventEnabled, other.isEventEnabled)
                && java.util.Objects.equals(this.isListType, other.isListType)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.namespaceKey == null ? 43 : this.namespaceKey.hashCode());
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
                        + (this.isEventEnabled == null ? 43 : this.isEventEnabled.hashCode());
        result = (result * PRIME) + (this.isListType == null ? 43 : this.isListType.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
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
