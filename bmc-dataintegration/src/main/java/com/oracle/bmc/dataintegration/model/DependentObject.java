/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about a dependent object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DependentObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DependentObject {
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

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
        private Integer applicationVersion;

        public Builder applicationVersion(Integer applicationVersion) {
            this.applicationVersion = applicationVersion;
            this.__explicitlySet__.add("applicationVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependentObjectMetadata")
        private java.util.List<PatchObjectMetadata> dependentObjectMetadata;

        public Builder dependentObjectMetadata(
                java.util.List<PatchObjectMetadata> dependentObjectMetadata) {
            this.dependentObjectMetadata = dependentObjectMetadata;
            this.__explicitlySet__.add("dependentObjectMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publishedObjectMetadata")
        private java.util.Map<String, PatchObjectMetadata> publishedObjectMetadata;

        public Builder publishedObjectMetadata(
                java.util.Map<String, PatchObjectMetadata> publishedObjectMetadata) {
            this.publishedObjectMetadata = publishedObjectMetadata;
            this.__explicitlySet__.add("publishedObjectMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceApplicationInfo")
        private SourceApplicationInfo sourceApplicationInfo;

        public Builder sourceApplicationInfo(SourceApplicationInfo sourceApplicationInfo) {
            this.sourceApplicationInfo = sourceApplicationInfo;
            this.__explicitlySet__.add("sourceApplicationInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePatched")
        private java.util.Date timePatched;

        public Builder timePatched(java.util.Date timePatched) {
            this.timePatched = timePatched;
            this.__explicitlySet__.add("timePatched");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DependentObject build() {
            DependentObject __instance__ =
                    new DependentObject(
                            key,
                            modelType,
                            modelVersion,
                            name,
                            description,
                            applicationVersion,
                            objectStatus,
                            identifier,
                            parentRef,
                            objectVersion,
                            dependentObjectMetadata,
                            publishedObjectMetadata,
                            sourceApplicationInfo,
                            timePatched,
                            metadata,
                            keyMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DependentObject o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelType(o.getModelType())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .applicationVersion(o.getApplicationVersion())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .parentRef(o.getParentRef())
                            .objectVersion(o.getObjectVersion())
                            .dependentObjectMetadata(o.getDependentObjectMetadata())
                            .publishedObjectMetadata(o.getPublishedObjectMetadata())
                            .sourceApplicationInfo(o.getSourceApplicationInfo())
                            .timePatched(o.getTimePatched())
                            .metadata(o.getMetadata())
                            .keyMap(o.getKeyMap());

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

    /**
     * Generated key that can be used in API calls to identify application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    String modelType;

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The application's version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
    Integer applicationVersion;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    String identifier;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    Integer objectVersion;

    /**
     * A list of dependent objects in this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependentObjectMetadata")
    java.util.List<PatchObjectMetadata> dependentObjectMetadata;

    /**
     * A list of objects that are published or unpublished in this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publishedObjectMetadata")
    java.util.Map<String, PatchObjectMetadata> publishedObjectMetadata;

    @com.fasterxml.jackson.annotation.JsonProperty("sourceApplicationInfo")
    SourceApplicationInfo sourceApplicationInfo;

    /**
     * The date and time the application was patched, in the timestamp format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePatched")
    java.util.Date timePatched;

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ObjectMetadata metadata;

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
    java.util.Map<String, String> keyMap;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
