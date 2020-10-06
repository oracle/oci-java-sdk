/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A `ConfiguredType` represents a type that has built-in configuration to the type itself. An example is a `SSN` type whose basic type is `VARCHAR`, but the type itself also has a built-in configuration like length=10.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ConfiguredType.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ConfiguredType extends BaseType {
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("wrappedType")
        private Object wrappedType;

        public Builder wrappedType(Object wrappedType) {
            this.wrappedType = wrappedType;
            this.__explicitlySet__.add("wrappedType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
        private ConfigDefinition configDefinition;

        public Builder configDefinition(ConfigDefinition configDefinition) {
            this.configDefinition = configDefinition;
            this.__explicitlySet__.add("configDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfiguredType build() {
            ConfiguredType __instance__ =
                    new ConfiguredType(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            objectStatus,
                            description,
                            wrappedType,
                            configValues,
                            configDefinition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfiguredType o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .wrappedType(o.getWrappedType())
                            .configValues(o.getConfigValues())
                            .configDefinition(o.getConfigDefinition());

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
    public ConfiguredType(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            Integer objectStatus,
            String description,
            Object wrappedType,
            ConfigValues configValues,
            ConfigDefinition configDefinition) {
        super(key, modelVersion, parentRef, name, objectStatus, description);
        this.wrappedType = wrappedType;
        this.configValues = configValues;
        this.configDefinition = configDefinition;
    }

    /**
     * A wrapped type, may be a string or a BaseType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("wrappedType")
    Object wrappedType;

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    ConfigValues configValues;

    @com.fasterxml.jackson.annotation.JsonProperty("configDefinition")
    ConfigDefinition configDefinition;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
