/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a single custom property <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CustomPropertyGetUsage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CustomPropertyGetUsage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** Unique Identifier of the attribute which is ID */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique Identifier of the attribute which is ID
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
        /** Description of the custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the custom property
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The custom property value */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The custom property value
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The data type of the custom property */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private CustomPropertyDataType dataType;

        /**
         * The data type of the custom property
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(CustomPropertyDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
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
        /** Unique namespace key that is immutable */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceKey")
        private String namespaceKey;

        /**
         * Unique namespace key that is immutable
         *
         * @param namespaceKey the value to set
         * @return this builder
         */
        public Builder namespaceKey(String namespaceKey) {
            this.namespaceKey = namespaceKey;
            this.__explicitlySet__.add("namespaceKey");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomPropertyGetUsage build() {
            CustomPropertyGetUsage model =
                    new CustomPropertyGetUsage(
                            this.key,
                            this.displayName,
                            this.description,
                            this.value,
                            this.dataType,
                            this.namespaceName,
                            this.namespaceKey,
                            this.isMultiValued,
                            this.isHidden,
                            this.isEditable,
                            this.isShownInList,
                            this.isEventEnabled,
                            this.isListType,
                            this.allowedValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomPropertyGetUsage model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("namespaceKey")) {
                this.namespaceKey(model.getNamespaceKey());
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
            if (model.wasPropertyExplicitlySet("isEventEnabled")) {
                this.isEventEnabled(model.getIsEventEnabled());
            }
            if (model.wasPropertyExplicitlySet("isListType")) {
                this.isListType(model.getIsListType());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
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

    /** Unique Identifier of the attribute which is ID */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique Identifier of the attribute which is ID
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

    /** Description of the custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the custom property
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The custom property value */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The custom property value
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** The data type of the custom property */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final CustomPropertyDataType dataType;

    /**
     * The data type of the custom property
     *
     * @return the value
     */
    public CustomPropertyDataType getDataType() {
        return dataType;
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

    /** Unique namespace key that is immutable */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceKey")
    private final String namespaceKey;

    /**
     * Unique namespace key that is immutable
     *
     * @return the value
     */
    public String getNamespaceKey() {
        return namespaceKey;
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
        sb.append("CustomPropertyGetUsage(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
