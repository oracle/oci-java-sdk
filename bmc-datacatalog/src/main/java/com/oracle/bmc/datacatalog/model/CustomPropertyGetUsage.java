/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CustomPropertyGetUsage.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CustomPropertyGetUsage {
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

    /**
     * Unique Identifier of the attribute which is ID
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
     * The custom property value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * The data type of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    CustomPropertyDataType dataType;

    /**
     * Namespace name of the custom property
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    String namespaceName;

    /**
     * Unique namespace key that is immutable
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceKey")
    String namespaceKey;

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
     * Is this property allowed to have list of values
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isListType")
    Boolean isListType;

    /**
     * Allowed values for the custom property if any
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    java.util.List<String> allowedValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
