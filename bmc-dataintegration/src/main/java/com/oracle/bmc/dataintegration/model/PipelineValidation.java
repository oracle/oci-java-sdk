/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about a pipeline validation. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineValidation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineValidation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalMessageCount",
        "errorMessageCount",
        "warnMessageCount",
        "infoMessageCount",
        "validationMessages",
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "objectStatus",
        "identifier",
        "metadata"
    })
    public PipelineValidation(
            Integer totalMessageCount,
            Integer errorMessageCount,
            Integer warnMessageCount,
            Integer infoMessageCount,
            java.util.Map<String, java.util.List<ValidationMessage>> validationMessages,
            String key,
            String modelType,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            ObjectMetadata metadata) {
        super();
        this.totalMessageCount = totalMessageCount;
        this.errorMessageCount = errorMessageCount;
        this.warnMessageCount = warnMessageCount;
        this.infoMessageCount = infoMessageCount;
        this.validationMessages = validationMessages;
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The total number of validation messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
        private Integer totalMessageCount;

        /**
         * The total number of validation messages.
         *
         * @param totalMessageCount the value to set
         * @return this builder
         */
        public Builder totalMessageCount(Integer totalMessageCount) {
            this.totalMessageCount = totalMessageCount;
            this.__explicitlySet__.add("totalMessageCount");
            return this;
        }
        /** The total number of validation error messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
        private Integer errorMessageCount;

        /**
         * The total number of validation error messages.
         *
         * @param errorMessageCount the value to set
         * @return this builder
         */
        public Builder errorMessageCount(Integer errorMessageCount) {
            this.errorMessageCount = errorMessageCount;
            this.__explicitlySet__.add("errorMessageCount");
            return this;
        }
        /** The total number of validation warning messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
        private Integer warnMessageCount;

        /**
         * The total number of validation warning messages.
         *
         * @param warnMessageCount the value to set
         * @return this builder
         */
        public Builder warnMessageCount(Integer warnMessageCount) {
            this.warnMessageCount = warnMessageCount;
            this.__explicitlySet__.add("warnMessageCount");
            return this;
        }
        /** The total number of validation information messages. */
        @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
        private Integer infoMessageCount;

        /**
         * The total number of validation information messages.
         *
         * @param infoMessageCount the value to set
         * @return this builder
         */
        public Builder infoMessageCount(Integer infoMessageCount) {
            this.infoMessageCount = infoMessageCount;
            this.__explicitlySet__.add("infoMessageCount");
            return this;
        }
        /** The detailed information of the pipeline object validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
        private java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

        /**
         * The detailed information of the pipeline object validation.
         *
         * @param validationMessages the value to set
         * @return this builder
         */
        public Builder validationMessages(
                java.util.Map<String, java.util.List<ValidationMessage>> validationMessages) {
            this.validationMessages = validationMessages;
            this.__explicitlySet__.add("validationMessages");
            return this;
        }
        /**
         * Objects will use a 36 character key as unique ID. It is system generated and cannot be
         * modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Objects will use a 36 character key as unique ID. It is system generated and cannot be
         * modified.
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
        /**
         * This is a version number that is used by the service to upgrade objects if needed through
         * releases of the service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * This is a version number that is used by the service to upgrade objects if needed through
         * releases of the service.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
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
        /** Detailed description for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
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
         * This is used by the service for optimistic locking of the object, to prevent multiple
         * users from simultaneously updating the object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * This is used by the service for optimistic locking of the object, to prevent multiple
         * users from simultaneously updating the object.
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineValidation build() {
            PipelineValidation model =
                    new PipelineValidation(
                            this.totalMessageCount,
                            this.errorMessageCount,
                            this.warnMessageCount,
                            this.infoMessageCount,
                            this.validationMessages,
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineValidation model) {
            if (model.wasPropertyExplicitlySet("totalMessageCount")) {
                this.totalMessageCount(model.getTotalMessageCount());
            }
            if (model.wasPropertyExplicitlySet("errorMessageCount")) {
                this.errorMessageCount(model.getErrorMessageCount());
            }
            if (model.wasPropertyExplicitlySet("warnMessageCount")) {
                this.warnMessageCount(model.getWarnMessageCount());
            }
            if (model.wasPropertyExplicitlySet("infoMessageCount")) {
                this.infoMessageCount(model.getInfoMessageCount());
            }
            if (model.wasPropertyExplicitlySet("validationMessages")) {
                this.validationMessages(model.getValidationMessages());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
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
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** The total number of validation messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
    private final Integer totalMessageCount;

    /**
     * The total number of validation messages.
     *
     * @return the value
     */
    public Integer getTotalMessageCount() {
        return totalMessageCount;
    }

    /** The total number of validation error messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
    private final Integer errorMessageCount;

    /**
     * The total number of validation error messages.
     *
     * @return the value
     */
    public Integer getErrorMessageCount() {
        return errorMessageCount;
    }

    /** The total number of validation warning messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
    private final Integer warnMessageCount;

    /**
     * The total number of validation warning messages.
     *
     * @return the value
     */
    public Integer getWarnMessageCount() {
        return warnMessageCount;
    }

    /** The total number of validation information messages. */
    @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
    private final Integer infoMessageCount;

    /**
     * The total number of validation information messages.
     *
     * @return the value
     */
    public Integer getInfoMessageCount() {
        return infoMessageCount;
    }

    /** The detailed information of the pipeline object validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
    private final java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

    /**
     * The detailed information of the pipeline object validation.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<ValidationMessage>> getValidationMessages() {
        return validationMessages;
    }

    /**
     * Objects will use a 36 character key as unique ID. It is system generated and cannot be
     * modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Objects will use a 36 character key as unique ID. It is system generated and cannot be
     * modified.
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

    /**
     * This is a version number that is used by the service to upgrade objects if needed through
     * releases of the service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * This is a version number that is used by the service to upgrade objects if needed through
     * releases of the service.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
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

    /** Detailed description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users
     * from simultaneously updating the object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users
     * from simultaneously updating the object.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
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
        sb.append("PipelineValidation(");
        sb.append("super=").append(super.toString());
        sb.append("totalMessageCount=").append(String.valueOf(this.totalMessageCount));
        sb.append(", errorMessageCount=").append(String.valueOf(this.errorMessageCount));
        sb.append(", warnMessageCount=").append(String.valueOf(this.warnMessageCount));
        sb.append(", infoMessageCount=").append(String.valueOf(this.infoMessageCount));
        sb.append(", validationMessages=").append(String.valueOf(this.validationMessages));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineValidation)) {
            return false;
        }

        PipelineValidation other = (PipelineValidation) o;
        return java.util.Objects.equals(this.totalMessageCount, other.totalMessageCount)
                && java.util.Objects.equals(this.errorMessageCount, other.errorMessageCount)
                && java.util.Objects.equals(this.warnMessageCount, other.warnMessageCount)
                && java.util.Objects.equals(this.infoMessageCount, other.infoMessageCount)
                && java.util.Objects.equals(this.validationMessages, other.validationMessages)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalMessageCount == null ? 43 : this.totalMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.errorMessageCount == null ? 43 : this.errorMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.warnMessageCount == null ? 43 : this.warnMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.infoMessageCount == null ? 43 : this.infoMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMessages == null
                                ? 43
                                : this.validationMessages.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
