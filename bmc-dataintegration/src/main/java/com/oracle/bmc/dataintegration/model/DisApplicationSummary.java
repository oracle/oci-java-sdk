/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The application summary type contains the audit summary information and the definition of the application.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DisApplicationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DisApplicationSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "name",
        "description",
        "applicationVersion",
        "objectStatus",
        "identifier",
        "parentRef",
        "objectVersion",
        "dependentObjectMetadata",
        "publishedObjectMetadata",
        "sourceApplicationInfo",
        "timePatched",
        "id",
        "compartmentId",
        "displayName",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "lifecycleState",
        "metadata",
        "keyMap"
    })
    public DisApplicationSummary(
            String key,
            String modelType,
            String modelVersion,
            String name,
            String description,
            Integer applicationVersion,
            Integer objectStatus,
            String identifier,
            ParentReference parentRef,
            Integer objectVersion,
            java.util.List<PatchObjectMetadata> dependentObjectMetadata,
            java.util.Map<String, PatchObjectMetadata> publishedObjectMetadata,
            SourceApplicationInfo sourceApplicationInfo,
            java.util.Date timePatched,
            String id,
            String compartmentId,
            String displayName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            LifecycleState lifecycleState,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.applicationVersion = applicationVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.parentRef = parentRef;
        this.objectVersion = objectVersion;
        this.dependentObjectMetadata = dependentObjectMetadata;
        this.publishedObjectMetadata = publishedObjectMetadata;
        this.sourceApplicationInfo = sourceApplicationInfo;
        this.timePatched = timePatched;
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lifecycleState = lifecycleState;
        this.metadata = metadata;
        this.keyMap = keyMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Generated key that can be used in API calls to identify application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify application.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The object type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The object type.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The object's model version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The object's model version.
         * @param modelVersion the value to set
         * @return this builder
         **/
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Detailed description for the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The application's version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
        private Integer applicationVersion;

        /**
         * The application's version.
         * @param applicationVersion the value to set
         * @return this builder
         **/
        public Builder applicationVersion(Integer applicationVersion) {
            this.applicationVersion = applicationVersion;
            this.__explicitlySet__.add("applicationVersion");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
         * @param objectStatus the value to set
         * @return this builder
         **/
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
         * @param identifier the value to set
         * @return this builder
         **/
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
        /**
         * The version of the object that is used to track changes in the object instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         * @param objectVersion the value to set
         * @return this builder
         **/
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * A list of dependent objects in this patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependentObjectMetadata")
        private java.util.List<PatchObjectMetadata> dependentObjectMetadata;

        /**
         * A list of dependent objects in this patch.
         * @param dependentObjectMetadata the value to set
         * @return this builder
         **/
        public Builder dependentObjectMetadata(
                java.util.List<PatchObjectMetadata> dependentObjectMetadata) {
            this.dependentObjectMetadata = dependentObjectMetadata;
            this.__explicitlySet__.add("dependentObjectMetadata");
            return this;
        }
        /**
         * A list of objects that are published or unpublished in this patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("publishedObjectMetadata")
        private java.util.Map<String, PatchObjectMetadata> publishedObjectMetadata;

        /**
         * A list of objects that are published or unpublished in this patch.
         * @param publishedObjectMetadata the value to set
         * @return this builder
         **/
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
        /**
         * The date and time the application was patched, in the timestamp format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePatched")
        private java.util.Date timePatched;

        /**
         * The date and time the application was patched, in the timestamp format defined by RFC3339.
         *
         * @param timePatched the value to set
         * @return this builder
         **/
        public Builder timePatched(java.util.Date timePatched) {
            this.timePatched = timePatched;
            this.__explicitlySet__.add("timePatched");
            return this;
        }
        /**
         * OCID of the resource that is used to uniquely identify the application
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the resource that is used to uniquely identify the application
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the compartment that this resource belongs to. Defaults to compartment of the Workspace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment that this resource belongs to. Defaults to compartment of the Workspace.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The date and time the application was created, in the timestamp format defined by RFC3339.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the application was created, in the timestamp format defined by RFC3339.
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the application was updated, in the timestamp format defined by RFC3339.
         * example: 2019-08-25T21:10:29.41Z
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the application was updated, in the timestamp format defined by RFC3339.
         * example: 2019-08-25T21:10:29.41Z
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The current state of the workspace.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the workspace.
         * @param lifecycleState the value to set
         * @return this builder
         **/
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
        /**
         * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
        private java.util.Map<String, String> keyMap;

        /**
         * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
         * @param keyMap the value to set
         * @return this builder
         **/
        public Builder keyMap(java.util.Map<String, String> keyMap) {
            this.keyMap = keyMap;
            this.__explicitlySet__.add("keyMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DisApplicationSummary build() {
            DisApplicationSummary __instance__ =
                    new DisApplicationSummary(
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
        public Builder copy(DisApplicationSummary o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Generated key that can be used in API calls to identify application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify application.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The object type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The object type.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The object's model version.
     * @return the value
     **/
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The application's version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
    private final Integer applicationVersion;

    /**
     * The application's version.
     * @return the value
     **/
    public Integer getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     * @return the value
     **/
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     * @return the value
     **/
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * A list of dependent objects in this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependentObjectMetadata")
    private final java.util.List<PatchObjectMetadata> dependentObjectMetadata;

    /**
     * A list of dependent objects in this patch.
     * @return the value
     **/
    public java.util.List<PatchObjectMetadata> getDependentObjectMetadata() {
        return dependentObjectMetadata;
    }

    /**
     * A list of objects that are published or unpublished in this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publishedObjectMetadata")
    private final java.util.Map<String, PatchObjectMetadata> publishedObjectMetadata;

    /**
     * A list of objects that are published or unpublished in this patch.
     * @return the value
     **/
    public java.util.Map<String, PatchObjectMetadata> getPublishedObjectMetadata() {
        return publishedObjectMetadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sourceApplicationInfo")
    private final SourceApplicationInfo sourceApplicationInfo;

    public SourceApplicationInfo getSourceApplicationInfo() {
        return sourceApplicationInfo;
    }

    /**
     * The date and time the application was patched, in the timestamp format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePatched")
    private final java.util.Date timePatched;

    /**
     * The date and time the application was patched, in the timestamp format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimePatched() {
        return timePatched;
    }

    /**
     * OCID of the resource that is used to uniquely identify the application
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the resource that is used to uniquely identify the application
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the compartment that this resource belongs to. Defaults to compartment of the Workspace.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment that this resource belongs to. Defaults to compartment of the Workspace.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The date and time the application was created, in the timestamp format defined by RFC3339.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the application was created, in the timestamp format defined by RFC3339.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the application was updated, in the timestamp format defined by RFC3339.
     * example: 2019-08-25T21:10:29.41Z
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the application was updated, in the timestamp format defined by RFC3339.
     * example: 2019-08-25T21:10:29.41Z
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The current state of the workspace.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

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
    private final LifecycleState lifecycleState;

    /**
     * The current state of the workspace.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyMap")
    private final java.util.Map<String, String> keyMap;

    /**
     * A key map. If provided, key is replaced with generated key. This structure provides mapping between user provided key and generated key.
     * @return the value
     **/
    public java.util.Map<String, String> getKeyMap() {
        return keyMap;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DisApplicationSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", applicationVersion=").append(String.valueOf(this.applicationVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", dependentObjectMetadata=")
                .append(String.valueOf(this.dependentObjectMetadata));
        sb.append(", publishedObjectMetadata=")
                .append(String.valueOf(this.publishedObjectMetadata));
        sb.append(", sourceApplicationInfo=").append(String.valueOf(this.sourceApplicationInfo));
        sb.append(", timePatched=").append(String.valueOf(this.timePatched));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", keyMap=").append(String.valueOf(this.keyMap));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DisApplicationSummary)) {
            return false;
        }

        DisApplicationSummary other = (DisApplicationSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.applicationVersion, other.applicationVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(
                        this.dependentObjectMetadata, other.dependentObjectMetadata)
                && java.util.Objects.equals(
                        this.publishedObjectMetadata, other.publishedObjectMetadata)
                && java.util.Objects.equals(this.sourceApplicationInfo, other.sourceApplicationInfo)
                && java.util.Objects.equals(this.timePatched, other.timePatched)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.keyMap, other.keyMap)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.applicationVersion == null
                                ? 43
                                : this.applicationVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dependentObjectMetadata == null
                                ? 43
                                : this.dependentObjectMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.publishedObjectMetadata == null
                                ? 43
                                : this.publishedObjectMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceApplicationInfo == null
                                ? 43
                                : this.sourceApplicationInfo.hashCode());
        result = (result * PRIME) + (this.timePatched == null ? 43 : this.timePatched.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.keyMap == null ? 43 : this.keyMap.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
