/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The patch summary type contains the audit summary information and the definition of the patch.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PatchSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PatchSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "name",
        "description",
        "objectVersion",
        "objectStatus",
        "identifier",
        "timePatched",
        "errorMessages",
        "applicationVersion",
        "patchType",
        "patchStatus",
        "dependentObjectMetadata",
        "patchObjectMetadata",
        "parentRef",
        "metadata",
        "keyMap"
    })
    public PatchSummary(
            String key,
            String modelType,
            String modelVersion,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            java.util.Date timePatched,
            java.util.Map<String, String> errorMessages,
            Integer applicationVersion,
            PatchType patchType,
            PatchStatus patchStatus,
            java.util.List<PatchObjectMetadata> dependentObjectMetadata,
            java.util.List<PatchObjectMetadata> patchObjectMetadata,
            ParentReference parentRef,
            ObjectMetadata metadata,
            java.util.Map<String, String> keyMap) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.timePatched = timePatched;
        this.errorMessages = errorMessages;
        this.applicationVersion = applicationVersion;
        this.patchType = patchType;
        this.patchStatus = patchStatus;
        this.dependentObjectMetadata = dependentObjectMetadata;
        this.patchObjectMetadata = patchObjectMetadata;
        this.parentRef = parentRef;
        this.metadata = metadata;
        this.keyMap = keyMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The object key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The object key.
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
        /**
         * The date and time the patch was applied, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePatched")
        private java.util.Date timePatched;

        /**
         * The date and time the patch was applied, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * @param timePatched the value to set
         * @return this builder
         **/
        public Builder timePatched(java.util.Date timePatched) {
            this.timePatched = timePatched;
            this.__explicitlySet__.add("timePatched");
            return this;
        }
        /**
         * The errors encountered while applying the patch, if any.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessages")
        private java.util.Map<String, String> errorMessages;

        /**
         * The errors encountered while applying the patch, if any.
         * @param errorMessages the value to set
         * @return this builder
         **/
        public Builder errorMessages(java.util.Map<String, String> errorMessages) {
            this.errorMessages = errorMessages;
            this.__explicitlySet__.add("errorMessages");
            return this;
        }
        /**
         * The application version of the patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
        private Integer applicationVersion;

        /**
         * The application version of the patch.
         * @param applicationVersion the value to set
         * @return this builder
         **/
        public Builder applicationVersion(Integer applicationVersion) {
            this.applicationVersion = applicationVersion;
            this.__explicitlySet__.add("applicationVersion");
            return this;
        }
        /**
         * The type of the patch applied or being applied on the application.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private PatchType patchType;

        /**
         * The type of the patch applied or being applied on the application.
         * @param patchType the value to set
         * @return this builder
         **/
        public Builder patchType(PatchType patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }
        /**
         * Status of the patch applied or being applied on the application
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchStatus")
        private PatchStatus patchStatus;

        /**
         * Status of the patch applied or being applied on the application
         * @param patchStatus the value to set
         * @return this builder
         **/
        public Builder patchStatus(PatchStatus patchStatus) {
            this.patchStatus = patchStatus;
            this.__explicitlySet__.add("patchStatus");
            return this;
        }
        /**
         * List of dependent objects in this patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dependentObjectMetadata")
        private java.util.List<PatchObjectMetadata> dependentObjectMetadata;

        /**
         * List of dependent objects in this patch.
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
         * List of objects that are published or unpublished in this patch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchObjectMetadata")
        private java.util.List<PatchObjectMetadata> patchObjectMetadata;

        /**
         * List of objects that are published or unpublished in this patch.
         * @param patchObjectMetadata the value to set
         * @return this builder
         **/
        public Builder patchObjectMetadata(
                java.util.List<PatchObjectMetadata> patchObjectMetadata) {
            this.patchObjectMetadata = patchObjectMetadata;
            this.__explicitlySet__.add("patchObjectMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
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

        public PatchSummary build() {
            PatchSummary __instance__ =
                    new PatchSummary(
                            key,
                            modelType,
                            modelVersion,
                            name,
                            description,
                            objectVersion,
                            objectStatus,
                            identifier,
                            timePatched,
                            errorMessages,
                            applicationVersion,
                            patchType,
                            patchStatus,
                            dependentObjectMetadata,
                            patchObjectMetadata,
                            parentRef,
                            metadata,
                            keyMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PatchSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelType(o.getModelType())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .timePatched(o.getTimePatched())
                            .errorMessages(o.getErrorMessages())
                            .applicationVersion(o.getApplicationVersion())
                            .patchType(o.getPatchType())
                            .patchStatus(o.getPatchStatus())
                            .dependentObjectMetadata(o.getDependentObjectMetadata())
                            .patchObjectMetadata(o.getPatchObjectMetadata())
                            .parentRef(o.getParentRef())
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
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The object key.
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

    /**
     * The date and time the patch was applied, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePatched")
    private final java.util.Date timePatched;

    /**
     * The date and time the patch was applied, in the timestamp format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * @return the value
     **/
    public java.util.Date getTimePatched() {
        return timePatched;
    }

    /**
     * The errors encountered while applying the patch, if any.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessages")
    private final java.util.Map<String, String> errorMessages;

    /**
     * The errors encountered while applying the patch, if any.
     * @return the value
     **/
    public java.util.Map<String, String> getErrorMessages() {
        return errorMessages;
    }

    /**
     * The application version of the patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applicationVersion")
    private final Integer applicationVersion;

    /**
     * The application version of the patch.
     * @return the value
     **/
    public Integer getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * The type of the patch applied or being applied on the application.
     **/
    public enum PatchType {
        Publish("PUBLISH"),
        Refresh("REFRESH"),
        Unpublish("UNPUBLISH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchType.class);

        private final String value;
        private static java.util.Map<String, PatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchType v : PatchType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the patch applied or being applied on the application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final PatchType patchType;

    /**
     * The type of the patch applied or being applied on the application.
     * @return the value
     **/
    public PatchType getPatchType() {
        return patchType;
    }

    /**
     * Status of the patch applied or being applied on the application
     **/
    public enum PatchStatus {
        Queued("QUEUED"),
        Successful("SUCCESSFUL"),
        Failed("FAILED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PatchStatus.class);

        private final String value;
        private static java.util.Map<String, PatchStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchStatus v : PatchStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PatchStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PatchStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the patch applied or being applied on the application
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchStatus")
    private final PatchStatus patchStatus;

    /**
     * Status of the patch applied or being applied on the application
     * @return the value
     **/
    public PatchStatus getPatchStatus() {
        return patchStatus;
    }

    /**
     * List of dependent objects in this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependentObjectMetadata")
    private final java.util.List<PatchObjectMetadata> dependentObjectMetadata;

    /**
     * List of dependent objects in this patch.
     * @return the value
     **/
    public java.util.List<PatchObjectMetadata> getDependentObjectMetadata() {
        return dependentObjectMetadata;
    }

    /**
     * List of objects that are published or unpublished in this patch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchObjectMetadata")
    private final java.util.List<PatchObjectMetadata> patchObjectMetadata;

    /**
     * List of objects that are published or unpublished in this patch.
     * @return the value
     **/
    public java.util.List<PatchObjectMetadata> getPatchObjectMetadata() {
        return patchObjectMetadata;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PatchSummary(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", timePatched=").append(String.valueOf(this.timePatched));
        sb.append(", errorMessages=").append(String.valueOf(this.errorMessages));
        sb.append(", applicationVersion=").append(String.valueOf(this.applicationVersion));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
        sb.append(", patchStatus=").append(String.valueOf(this.patchStatus));
        sb.append(", dependentObjectMetadata=")
                .append(String.valueOf(this.dependentObjectMetadata));
        sb.append(", patchObjectMetadata=").append(String.valueOf(this.patchObjectMetadata));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
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
        if (!(o instanceof PatchSummary)) {
            return false;
        }

        PatchSummary other = (PatchSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.timePatched, other.timePatched)
                && java.util.Objects.equals(this.errorMessages, other.errorMessages)
                && java.util.Objects.equals(this.applicationVersion, other.applicationVersion)
                && java.util.Objects.equals(this.patchType, other.patchType)
                && java.util.Objects.equals(this.patchStatus, other.patchStatus)
                && java.util.Objects.equals(
                        this.dependentObjectMetadata, other.dependentObjectMetadata)
                && java.util.Objects.equals(this.patchObjectMetadata, other.patchObjectMetadata)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
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
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.timePatched == null ? 43 : this.timePatched.hashCode());
        result =
                (result * PRIME)
                        + (this.errorMessages == null ? 43 : this.errorMessages.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationVersion == null
                                ? 43
                                : this.applicationVersion.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
        result = (result * PRIME) + (this.patchStatus == null ? 43 : this.patchStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.dependentObjectMetadata == null
                                ? 43
                                : this.dependentObjectMetadata.hashCode());
        result =
                (result * PRIME)
                        + (this.patchObjectMetadata == null
                                ? 43
                                : this.patchObjectMetadata.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
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
