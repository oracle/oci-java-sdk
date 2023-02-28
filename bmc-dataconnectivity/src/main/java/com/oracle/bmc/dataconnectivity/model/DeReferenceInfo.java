/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Represents de-reference details of a DCMS artifact. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DeReferenceInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DeReferenceInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "modelType",
        "key",
        "modelVersion",
        "name",
        "description",
        "objectStatus",
        "objectVersion",
        "identifier",
        "dcmsArtifactId",
        "serviceArtifactId",
        "referenceCount",
        "registryMetadata",
        "metadata"
    })
    public DeReferenceInfo(
            String modelType,
            String key,
            String modelVersion,
            String name,
            String description,
            Integer objectStatus,
            Integer objectVersion,
            String identifier,
            String dcmsArtifactId,
            String serviceArtifactId,
            Integer referenceCount,
            RegistryMetadata registryMetadata,
            ObjectMetadata metadata) {
        super();
        this.modelType = modelType;
        this.key = key;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.objectStatus = objectStatus;
        this.objectVersion = objectVersion;
        this.identifier = identifier;
        this.dcmsArtifactId = dcmsArtifactId;
        this.serviceArtifactId = serviceArtifactId;
        this.referenceCount = referenceCount;
        this.registryMetadata = registryMetadata;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of the ReferenceInfo. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the ReferenceInfo.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** Generated key that can be used in API calls to identify the referenceinfo. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify the referenceinfo.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
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
         * Free form text without any restriction on the permitted characters. Name can have
         * letters, numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on the permitted characters. Name can have
         * letters, numbers, and special characters. The value is editable and is restricted to 1000
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
        /** User-defined description of the referenceInfo. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * User-defined description of the referenceInfo.
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
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * an upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * an upper case letter or underscore. The value can be modified.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** The unique ID of the DCMS artifact that is getting referenced. */
        @com.fasterxml.jackson.annotation.JsonProperty("dcmsArtifactId")
        private String dcmsArtifactId;

        /**
         * The unique ID of the DCMS artifact that is getting referenced.
         *
         * @param dcmsArtifactId the value to set
         * @return this builder
         */
        public Builder dcmsArtifactId(String dcmsArtifactId) {
            this.dcmsArtifactId = dcmsArtifactId;
            this.__explicitlySet__.add("dcmsArtifactId");
            return this;
        }
        /** The unique ID of the service that is referencing a DCMS artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceArtifactId")
        private String serviceArtifactId;

        /**
         * The unique ID of the service that is referencing a DCMS artifact.
         *
         * @param serviceArtifactId the value to set
         * @return this builder
         */
        public Builder serviceArtifactId(String serviceArtifactId) {
            this.serviceArtifactId = serviceArtifactId;
            this.__explicitlySet__.add("serviceArtifactId");
            return this;
        }
        /** The number of times a DCMS artifact has been registered by a service. */
        @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
        private Integer referenceCount;

        /**
         * The number of times a DCMS artifact has been registered by a service.
         *
         * @param referenceCount the value to set
         * @return this builder
         */
        public Builder referenceCount(Integer referenceCount) {
            this.referenceCount = referenceCount;
            this.__explicitlySet__.add("referenceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeReferenceInfo build() {
            DeReferenceInfo model =
                    new DeReferenceInfo(
                            this.modelType,
                            this.key,
                            this.modelVersion,
                            this.name,
                            this.description,
                            this.objectStatus,
                            this.objectVersion,
                            this.identifier,
                            this.dcmsArtifactId,
                            this.serviceArtifactId,
                            this.referenceCount,
                            this.registryMetadata,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeReferenceInfo model) {
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
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
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("dcmsArtifactId")) {
                this.dcmsArtifactId(model.getDcmsArtifactId());
            }
            if (model.wasPropertyExplicitlySet("serviceArtifactId")) {
                this.serviceArtifactId(model.getServiceArtifactId());
            }
            if (model.wasPropertyExplicitlySet("referenceCount")) {
                this.referenceCount(model.getReferenceCount());
            }
            if (model.wasPropertyExplicitlySet("registryMetadata")) {
                this.registryMetadata(model.getRegistryMetadata());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /** The type of the ReferenceInfo. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the ReferenceInfo.
     *
     * @return the value
     */
    public String getModelType() {
        return modelType;
    }

    /** Generated key that can be used in API calls to identify the referenceinfo. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify the referenceinfo.
     *
     * @return the value
     */
    public String getKey() {
        return key;
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
     * Free form text without any restriction on the permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on the permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** User-defined description of the referenceInfo. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * User-defined description of the referenceInfo.
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

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with an
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with an
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** The unique ID of the DCMS artifact that is getting referenced. */
    @com.fasterxml.jackson.annotation.JsonProperty("dcmsArtifactId")
    private final String dcmsArtifactId;

    /**
     * The unique ID of the DCMS artifact that is getting referenced.
     *
     * @return the value
     */
    public String getDcmsArtifactId() {
        return dcmsArtifactId;
    }

    /** The unique ID of the service that is referencing a DCMS artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceArtifactId")
    private final String serviceArtifactId;

    /**
     * The unique ID of the service that is referencing a DCMS artifact.
     *
     * @return the value
     */
    public String getServiceArtifactId() {
        return serviceArtifactId;
    }

    /** The number of times a DCMS artifact has been registered by a service. */
    @com.fasterxml.jackson.annotation.JsonProperty("referenceCount")
    private final Integer referenceCount;

    /**
     * The number of times a DCMS artifact has been registered by a service.
     *
     * @return the value
     */
    public Integer getReferenceCount() {
        return referenceCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
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
        sb.append("DeReferenceInfo(");
        sb.append("super=").append(super.toString());
        sb.append("modelType=").append(String.valueOf(this.modelType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", dcmsArtifactId=").append(String.valueOf(this.dcmsArtifactId));
        sb.append(", serviceArtifactId=").append(String.valueOf(this.serviceArtifactId));
        sb.append(", referenceCount=").append(String.valueOf(this.referenceCount));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeReferenceInfo)) {
            return false;
        }

        DeReferenceInfo other = (DeReferenceInfo) o;
        return java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.dcmsArtifactId, other.dcmsArtifactId)
                && java.util.Objects.equals(this.serviceArtifactId, other.serviceArtifactId)
                && java.util.Objects.equals(this.referenceCount, other.referenceCount)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.dcmsArtifactId == null ? 43 : this.dcmsArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceArtifactId == null ? 43 : this.serviceArtifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.referenceCount == null ? 43 : this.referenceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
