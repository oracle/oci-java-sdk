/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * DIS Application is container for runtime objects.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DisApplication.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DisApplication {
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

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public DisApplication build() {
            DisApplication __instance__ =
                    new DisApplication(
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
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags,
                            lifecycleState,
                            metadata,
                            keyMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DisApplication o) {
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
                            .id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .lifecycleState(o.getLifecycleState())
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

    /**
     * OCID of the resource that is used to uniquely identify the application
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * OCID of the compartment that this resource belongs to. Defaults to compartment of the Workspace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The date and time the application was created, in the timestamp format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the application was updated, in the timestamp format defined by RFC3339.
     * example: 2019-08-25T21:10:29.41Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;
    /**
     * The current state of the workspace.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the workspace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

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
