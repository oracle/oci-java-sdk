/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The details including name and description for the project, which is a container of folders,
 * tasks, and dataflows. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProjectDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProjectDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "name",
        "description",
        "objectStatus",
        "identifier",
        "objectVersion",
        "parentRef",
        "registryMetadata"
    })
    public ProjectDetails(
            String key,
            String modelType,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            Integer objectVersion,
            ParentReference parentRef,
            RegistryMetadata registryMetadata) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.objectVersion = objectVersion;
        this.parentRef = parentRef;
        this.registryMetadata = registryMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Generated key that can be used in API calls to identify project. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify project.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The type of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** The model version of an object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A user defined description for the project. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user defined description for the project.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** The version of the object that is used to track changes in the object instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProjectDetails build() {
            ProjectDetails model =
                    new ProjectDetails(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.identifier,
                            this.objectVersion,
                            this.parentRef,
                            this.registryMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProjectDetails model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
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

    /** Generated key that can be used in API calls to identify project. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify project.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The type of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     *
     * @return the value
     */
    public String getModelType() {
        return modelType;
    }

    /** The model version of an object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A user defined description for the project. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user defined description for the project.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** The version of the object that is used to track changes in the object instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
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
        sb.append("ProjectDetails(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectDetails)) {
            return false;
        }

        ProjectDetails other = (ProjectDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
