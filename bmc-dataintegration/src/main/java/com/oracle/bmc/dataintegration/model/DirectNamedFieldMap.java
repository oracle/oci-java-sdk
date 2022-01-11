/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A named field map.
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
    builder = DirectNamedFieldMap.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DirectNamedFieldMap extends FieldMap {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceTypedObject")
        private String sourceTypedObject;

        public Builder sourceTypedObject(String sourceTypedObject) {
            this.sourceTypedObject = sourceTypedObject;
            this.__explicitlySet__.add("sourceTypedObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetTypedObject")
        private String targetTypedObject;

        public Builder targetTypedObject(String targetTypedObject) {
            this.targetTypedObject = targetTypedObject;
            this.__explicitlySet__.add("targetTypedObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceFieldName")
        private String sourceFieldName;

        public Builder sourceFieldName(String sourceFieldName) {
            this.sourceFieldName = sourceFieldName;
            this.__explicitlySet__.add("sourceFieldName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetFieldName")
        private String targetFieldName;

        public Builder targetFieldName(String targetFieldName) {
            this.targetFieldName = targetFieldName;
            this.__explicitlySet__.add("targetFieldName");
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

        public DirectNamedFieldMap build() {
            DirectNamedFieldMap __instance__ =
                    new DirectNamedFieldMap(
                            description,
                            key,
                            modelVersion,
                            parentRef,
                            configValues,
                            sourceTypedObject,
                            targetTypedObject,
                            sourceFieldName,
                            targetFieldName,
                            objectStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DirectNamedFieldMap o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .configValues(o.getConfigValues())
                            .sourceTypedObject(o.getSourceTypedObject())
                            .targetTypedObject(o.getTargetTypedObject())
                            .sourceFieldName(o.getSourceFieldName())
                            .targetFieldName(o.getTargetFieldName())
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
    public DirectNamedFieldMap(
            String description,
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            String sourceTypedObject,
            String targetTypedObject,
            String sourceFieldName,
            String targetFieldName,
            Integer objectStatus) {
        super(description);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.configValues = configValues;
        this.sourceTypedObject = sourceTypedObject;
        this.targetTypedObject = targetTypedObject;
        this.sourceFieldName = sourceFieldName;
        this.targetFieldName = targetFieldName;
        this.objectStatus = objectStatus;
    }

    /**
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    ConfigValues configValues;

    /**
     * Reference to a typed object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTypedObject")
    String sourceTypedObject;

    /**
     * Reference to a typed object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTypedObject")
    String targetTypedObject;

    /**
     * The source field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceFieldName")
    String sourceFieldName;

    /**
     * The target field name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetFieldName")
    String targetFieldName;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
