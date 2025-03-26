/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The detailed description of an object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DetailedDescription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DetailedDescription extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "modelType",
        "key",
        "modelVersion",
        "parentRef",
        "name",
        "objectVersion",
        "objectStatus",
        "identifier",
        "metadata",
        "logo",
        "detailedDescription"
    })
    public DetailedDescription(
            ModelType modelType,
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            ObjectMetadata metadata,
            String logo,
            String detailedDescription) {
        super();
        this.modelType = modelType;
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.metadata = metadata;
        this.logo = logo;
        this.detailedDescription = detailedDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of the published object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private ModelType modelType;

        /**
         * The type of the published object.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * Generated key that can be used in API calls to identify task. On scenarios where reference to the task is needed, a value can be passed in create.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify task. On scenarios where reference to the task is needed, a value can be passed in create.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The object's model version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }
        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of the object that is used to track changes in the object instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         * @param objectVersion the value to set
         * @return this builder
         **/
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * Base64 encoded image to represent logo of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logo")
        private String logo;

        /**
         * Base64 encoded image to represent logo of the object.
         * @param logo the value to set
         * @return this builder
         **/
        public Builder logo(String logo) {
            this.logo = logo;
            this.__explicitlySet__.add("logo");
            return this;
        }
        /**
         * Base64 encoded rich text description of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detailedDescription")
        private String detailedDescription;

        /**
         * Base64 encoded rich text description of the object.
         * @param detailedDescription the value to set
         * @return this builder
         **/
        public Builder detailedDescription(String detailedDescription) {
            this.detailedDescription = detailedDescription;
            this.__explicitlySet__.add("detailedDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DetailedDescription build() {
            DetailedDescription model =
                    new DetailedDescription(
                            this.modelType,
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.metadata,
                            this.logo,
                            this.detailedDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DetailedDescription model) {
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("logo")) {
                this.logo(model.getLogo());
            }
            if (model.wasPropertyExplicitlySet("detailedDescription")) {
                this.detailedDescription(model.getDetailedDescription());
            }
            return this;
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
     * The type of the published object.
     **/
    public enum ModelType {
        DetailedDescription("DETAILED_DESCRIPTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the published object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final ModelType modelType;

    /**
     * The type of the published object.
     * @return the value
     **/
    public ModelType getModelType() {
        return modelType;
    }

    /**
     * Generated key that can be used in API calls to identify task. On scenarios where reference to the task is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify task. On scenarios where reference to the task is needed, a value can be passed in create.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     * @return the value
     **/
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * Base64 encoded image to represent logo of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logo")
    private final String logo;

    /**
     * Base64 encoded image to represent logo of the object.
     * @return the value
     **/
    public String getLogo() {
        return logo;
    }

    /**
     * Base64 encoded rich text description of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detailedDescription")
    private final String detailedDescription;

    /**
     * Base64 encoded rich text description of the object.
     * @return the value
     **/
    public String getDetailedDescription() {
        return detailedDescription;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DetailedDescription(");
        sb.append("super=").append(super.toString());
        sb.append("modelType=").append(String.valueOf(this.modelType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", logo=").append(String.valueOf(this.logo));
        sb.append(", detailedDescription=").append(String.valueOf(this.detailedDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetailedDescription)) {
            return false;
        }

        DetailedDescription other = (DetailedDescription) o;
        return java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.logo, other.logo)
                && java.util.Objects.equals(this.detailedDescription, other.detailedDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.logo == null ? 43 : this.logo.hashCode());
        result =
                (result * PRIME)
                        + (this.detailedDescription == null
                                ? 43
                                : this.detailedDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
