/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about task validation.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskValidation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TaskValidation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
        private Integer totalMessageCount;

        public Builder totalMessageCount(Integer totalMessageCount) {
            this.totalMessageCount = totalMessageCount;
            this.__explicitlySet__.add("totalMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
        private Integer errorMessageCount;

        public Builder errorMessageCount(Integer errorMessageCount) {
            this.errorMessageCount = errorMessageCount;
            this.__explicitlySet__.add("errorMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
        private Integer warnMessageCount;

        public Builder warnMessageCount(Integer warnMessageCount) {
            this.warnMessageCount = warnMessageCount;
            this.__explicitlySet__.add("warnMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
        private Integer infoMessageCount;

        public Builder infoMessageCount(Integer infoMessageCount) {
            this.infoMessageCount = infoMessageCount;
            this.__explicitlySet__.add("infoMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
        private java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

        public Builder validationMessages(
                java.util.Map<String, java.util.List<ValidationMessage>> validationMessages) {
            this.validationMessages = validationMessages;
            this.__explicitlySet__.add("validationMessages");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
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

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private ObjectMetadata metadata;

        public Builder metadata(ObjectMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskValidation build() {
            TaskValidation __instance__ =
                    new TaskValidation(
                            totalMessageCount,
                            errorMessageCount,
                            warnMessageCount,
                            infoMessageCount,
                            validationMessages,
                            key,
                            modelType,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            objectStatus,
                            identifier,
                            metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskValidation o) {
            Builder copiedBuilder =
                    totalMessageCount(o.getTotalMessageCount())
                            .errorMessageCount(o.getErrorMessageCount())
                            .warnMessageCount(o.getWarnMessageCount())
                            .infoMessageCount(o.getInfoMessageCount())
                            .validationMessages(o.getValidationMessages())
                            .key(o.getKey())
                            .modelType(o.getModelType())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .metadata(o.getMetadata());

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
     * Total number of validation messages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
    Integer totalMessageCount;

    /**
     * Total number of validation error messages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
    Integer errorMessageCount;

    /**
     * Total number of validation warning messages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
    Integer warnMessageCount;

    /**
     * Total number of validation information messages.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
    Integer infoMessageCount;

    /**
     * Detailed information of the data flow object validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
    java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

    /**
     * Objects use a 36 character key as unique ID. It is system generated and cannot be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    String modelType;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

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
     * The version of the object that is used to track changes in the object instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    Integer objectVersion;

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

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ObjectMetadata metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
