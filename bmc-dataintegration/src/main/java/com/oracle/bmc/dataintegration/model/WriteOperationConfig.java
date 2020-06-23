/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the write operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WriteOperationConfig.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WriteOperationConfig extends AbstractDataOperationConfig {
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

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

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

        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<PushDownOperation> operations;

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

        @com.fasterxml.jackson.annotation.JsonProperty("writeMode")
        private WriteMode writeMode;

        public Builder writeMode(WriteMode writeMode) {
            this.writeMode = writeMode;
            this.__explicitlySet__.add("writeMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WriteOperationConfig build() {
            WriteOperationConfig __instance__ =
                    new WriteOperationConfig(
                            key,
                            modelVersion,
                            parentRef,
                            operations,
                            dataFormat,
                            partitionConfig,
                            writeAttribute,
                            writeMode,
                            objectStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WriteOperationConfig o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .operations(o.getOperations())
                            .dataFormat(o.getDataFormat())
                            .partitionConfig(o.getPartitionConfig())
                            .writeAttribute(o.getWriteAttribute())
                            .writeMode(o.getWriteMode())
                            .objectStatus(o.getObjectStatus());

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

    @Deprecated
    public WriteOperationConfig(
            String key,
            String modelVersion,
            ParentReference parentRef,
            java.util.List<PushDownOperation> operations,
            DataFormat dataFormat,
            PartitionConfig partitionConfig,
            AbstractWriteAttribute writeAttribute,
            WriteMode writeMode,
            Integer objectStatus) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.operations = operations;
        this.dataFormat = dataFormat;
        this.partitionConfig = partitionConfig;
        this.writeAttribute = writeAttribute;
        this.writeMode = writeMode;
        this.objectStatus = objectStatus;
    }

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * An array of operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    java.util.List<PushDownOperation> operations;

    @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
    DataFormat dataFormat;

    @com.fasterxml.jackson.annotation.JsonProperty("partitionConfig")
    PartitionConfig partitionConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("writeAttribute")
    AbstractWriteAttribute writeAttribute;
    /**
     * The mode for the write operation.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum WriteMode {
        Overwrite("OVERWRITE"),
        Append("APPEND"),
        Merge("MERGE"),
        Ignore("IGNORE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The mode for the write operation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("writeMode")
    WriteMode writeMode;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
