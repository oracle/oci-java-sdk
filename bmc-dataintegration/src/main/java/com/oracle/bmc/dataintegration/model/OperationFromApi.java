/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The API operation object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperationFromApi.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OperationFromApi extends Operation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /** The operation key, used to identiying this metadata object within the dataflow. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The operation key, used to identiying this metadata object within the dataflow.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The model version of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of the object.
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

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private Shape shape;

        public Builder shape(Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The operation name. This value is unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The operation name. This value is unique.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
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
        /** The external key for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * The external key for the object.
         *
         * @param externalKey the value to set
         * @return this builder
         */
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }
        /** The resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The resource name.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow reference across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow reference across objects,
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

        @com.fasterxml.jackson.annotation.JsonProperty("operationAttributes")
        private GenericRestApiAttributes operationAttributes;

        public Builder operationAttributes(GenericRestApiAttributes operationAttributes) {
            this.operationAttributes = operationAttributes;
            this.__explicitlySet__.add("operationAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationFromApi build() {
            OperationFromApi model =
                    new OperationFromApi(
                            this.metadata,
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.shape,
                            this.name,
                            this.objectVersion,
                            this.externalKey,
                            this.resourceName,
                            this.objectStatus,
                            this.operationAttributes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationFromApi model) {
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("operationAttributes")) {
                this.operationAttributes(model.getOperationAttributes());
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

    @Deprecated
    public OperationFromApi(
            ObjectMetadata metadata,
            String key,
            String modelVersion,
            ParentReference parentRef,
            Shape shape,
            String name,
            Integer objectVersion,
            String externalKey,
            String resourceName,
            Integer objectStatus,
            GenericRestApiAttributes operationAttributes) {
        super(metadata);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.shape = shape;
        this.name = name;
        this.objectVersion = objectVersion;
        this.externalKey = externalKey;
        this.resourceName = resourceName;
        this.objectStatus = objectStatus;
        this.operationAttributes = operationAttributes;
    }

    /** The operation key, used to identiying this metadata object within the dataflow. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The operation key, used to identiying this metadata object within the dataflow.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The model version of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of the object.
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

    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final Shape shape;

    public Shape getShape() {
        return shape;
    }

    /** The operation name. This value is unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The operation name. This value is unique.
     *
     * @return the value
     */
    public String getName() {
        return name;
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

    /** The external key for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * The external key for the object.
     *
     * @return the value
     */
    public String getExternalKey() {
        return externalKey;
    }

    /** The resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The resource name.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The status of an object that can be set to value 1 for shallow reference across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow reference across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("operationAttributes")
    private final GenericRestApiAttributes operationAttributes;

    public GenericRestApiAttributes getOperationAttributes() {
        return operationAttributes;
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
        sb.append("OperationFromApi(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", operationAttributes=").append(String.valueOf(this.operationAttributes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationFromApi)) {
            return false;
        }

        OperationFromApi other = (OperationFromApi) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.operationAttributes, other.operationAttributes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.operationAttributes == null
                                ? 43
                                : this.operationAttributes.hashCode());
        return result;
    }
}
