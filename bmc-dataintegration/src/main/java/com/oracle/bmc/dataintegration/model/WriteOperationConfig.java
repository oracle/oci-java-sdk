/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the write operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WriteOperationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class WriteOperationConfig extends AbstractDataOperationConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("metadataConfigProperties")
        private java.util.Map<String, String> metadataConfigProperties;

        public Builder metadataConfigProperties(
                java.util.Map<String, String> metadataConfigProperties) {
            this.metadataConfigProperties = metadataConfigProperties;
            this.__explicitlySet__.add("metadataConfigProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("derivedAttributes")
        private java.util.Map<String, String> derivedAttributes;

        public Builder derivedAttributes(java.util.Map<String, String> derivedAttributes) {
            this.derivedAttributes = derivedAttributes;
            this.__explicitlySet__.add("derivedAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("callAttribute")
        private BipCallAttribute callAttribute;

        public Builder callAttribute(BipCallAttribute callAttribute) {
            this.callAttribute = callAttribute;
            this.__explicitlySet__.add("callAttribute");
            return this;
        }
        /** The object key. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The object's model version. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
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
        /** An array of operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<PushDownOperation> operations;

        /**
         * An array of operations.
         *
         * @param operations the value to set
         * @return this builder
         */
        public Builder operations(java.util.List<PushDownOperation> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
        private DataFormat dataFormat;

        public Builder dataFormat(DataFormat dataFormat) {
            this.dataFormat = dataFormat;
            this.__explicitlySet__.add("dataFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partitionConfig")
        private PartitionConfig partitionConfig;

        public Builder partitionConfig(PartitionConfig partitionConfig) {
            this.partitionConfig = partitionConfig;
            this.__explicitlySet__.add("partitionConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("writeAttribute")
        private AbstractWriteAttribute writeAttribute;

        public Builder writeAttribute(AbstractWriteAttribute writeAttribute) {
            this.writeAttribute = writeAttribute;
            this.__explicitlySet__.add("writeAttribute");
            return this;
        }
        /** The mode for the write operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("writeMode")
        private WriteMode writeMode;

        /**
         * The mode for the write operation.
         *
         * @param writeMode the value to set
         * @return this builder
         */
        public Builder writeMode(WriteMode writeMode) {
            this.writeMode = writeMode;
            this.__explicitlySet__.add("writeMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mergeKey")
        private UniqueKey mergeKey;

        public Builder mergeKey(UniqueKey mergeKey) {
            this.mergeKey = mergeKey;
            this.__explicitlySet__.add("mergeKey");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WriteOperationConfig build() {
            WriteOperationConfig model =
                    new WriteOperationConfig(
                            this.metadataConfigProperties,
                            this.derivedAttributes,
                            this.callAttribute,
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.operations,
                            this.dataFormat,
                            this.partitionConfig,
                            this.writeAttribute,
                            this.writeMode,
                            this.mergeKey,
                            this.objectStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WriteOperationConfig model) {
            if (model.wasPropertyExplicitlySet("metadataConfigProperties")) {
                this.metadataConfigProperties(model.getMetadataConfigProperties());
            }
            if (model.wasPropertyExplicitlySet("derivedAttributes")) {
                this.derivedAttributes(model.getDerivedAttributes());
            }
            if (model.wasPropertyExplicitlySet("callAttribute")) {
                this.callAttribute(model.getCallAttribute());
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
            if (model.wasPropertyExplicitlySet("operations")) {
                this.operations(model.getOperations());
            }
            if (model.wasPropertyExplicitlySet("dataFormat")) {
                this.dataFormat(model.getDataFormat());
            }
            if (model.wasPropertyExplicitlySet("partitionConfig")) {
                this.partitionConfig(model.getPartitionConfig());
            }
            if (model.wasPropertyExplicitlySet("writeAttribute")) {
                this.writeAttribute(model.getWriteAttribute());
            }
            if (model.wasPropertyExplicitlySet("writeMode")) {
                this.writeMode(model.getWriteMode());
            }
            if (model.wasPropertyExplicitlySet("mergeKey")) {
                this.mergeKey(model.getMergeKey());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
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
    public WriteOperationConfig(
            java.util.Map<String, String> metadataConfigProperties,
            java.util.Map<String, String> derivedAttributes,
            BipCallAttribute callAttribute,
            String key,
            String modelVersion,
            ParentReference parentRef,
            java.util.List<PushDownOperation> operations,
            DataFormat dataFormat,
            PartitionConfig partitionConfig,
            AbstractWriteAttribute writeAttribute,
            WriteMode writeMode,
            UniqueKey mergeKey,
            Integer objectStatus) {
        super(metadataConfigProperties, derivedAttributes, callAttribute);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.operations = operations;
        this.dataFormat = dataFormat;
        this.partitionConfig = partitionConfig;
        this.writeAttribute = writeAttribute;
        this.writeMode = writeMode;
        this.mergeKey = mergeKey;
        this.objectStatus = objectStatus;
    }

    /** The object key. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The object's model version. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
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

    /** An array of operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<PushDownOperation> operations;

    /**
     * An array of operations.
     *
     * @return the value
     */
    public java.util.List<PushDownOperation> getOperations() {
        return operations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
    private final DataFormat dataFormat;

    public DataFormat getDataFormat() {
        return dataFormat;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("partitionConfig")
    private final PartitionConfig partitionConfig;

    public PartitionConfig getPartitionConfig() {
        return partitionConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("writeAttribute")
    private final AbstractWriteAttribute writeAttribute;

    public AbstractWriteAttribute getWriteAttribute() {
        return writeAttribute;
    }

    /** The mode for the write operation. */
    public enum WriteMode implements com.oracle.bmc.http.internal.BmcEnum {
        Overwrite("OVERWRITE"),
        Append("APPEND"),
        Merge("MERGE"),
        Ignore("IGNORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(WriteMode.class);

        private final String value;
        private static java.util.Map<String, WriteMode> map;

        static {
            map = new java.util.HashMap<>();
            for (WriteMode v : WriteMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        WriteMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WriteMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'WriteMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The mode for the write operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("writeMode")
    private final WriteMode writeMode;

    /**
     * The mode for the write operation.
     *
     * @return the value
     */
    public WriteMode getWriteMode() {
        return writeMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mergeKey")
    private final UniqueKey mergeKey;

    public UniqueKey getMergeKey() {
        return mergeKey;
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
        sb.append("WriteOperationConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", operations=").append(String.valueOf(this.operations));
        sb.append(", dataFormat=").append(String.valueOf(this.dataFormat));
        sb.append(", partitionConfig=").append(String.valueOf(this.partitionConfig));
        sb.append(", writeAttribute=").append(String.valueOf(this.writeAttribute));
        sb.append(", writeMode=").append(String.valueOf(this.writeMode));
        sb.append(", mergeKey=").append(String.valueOf(this.mergeKey));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WriteOperationConfig)) {
            return false;
        }

        WriteOperationConfig other = (WriteOperationConfig) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.dataFormat, other.dataFormat)
                && java.util.Objects.equals(this.partitionConfig, other.partitionConfig)
                && java.util.Objects.equals(this.writeAttribute, other.writeAttribute)
                && java.util.Objects.equals(this.writeMode, other.writeMode)
                && java.util.Objects.equals(this.mergeKey, other.mergeKey)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result = (result * PRIME) + (this.dataFormat == null ? 43 : this.dataFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.partitionConfig == null ? 43 : this.partitionConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.writeAttribute == null ? 43 : this.writeAttribute.hashCode());
        result = (result * PRIME) + (this.writeMode == null ? 43 : this.writeMode.hashCode());
        result = (result * PRIME) + (this.mergeKey == null ? 43 : this.mergeKey.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        return result;
    }
}
