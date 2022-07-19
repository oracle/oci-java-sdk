/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The properties used in task run create operations.
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
    builder = CreateTaskRunDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateTaskRunDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "name",
        "description",
        "configProvider",
        "identifier",
        "taskScheduleKey",
        "refTaskRunId",
        "reRunType",
        "stepId",
        "registryMetadata"
    })
    public CreateTaskRunDetails(
            String key,
            String modelType,
            String modelVersion,
            String name,
            String description,
            CreateConfigProvider configProvider,
            String identifier,
            String taskScheduleKey,
            String refTaskRunId,
            ReRunType reRunType,
            String stepId,
            RegistryMetadata registryMetadata) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.name = name;
        this.description = description;
        this.configProvider = configProvider;
        this.identifier = identifier;
        this.taskScheduleKey = taskScheduleKey;
        this.refTaskRunId = refTaskRunId;
        this.reRunType = reRunType;
        this.stepId = stepId;
        this.registryMetadata = registryMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The key of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the object.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The type of the object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         * @param modelType the value to set
         * @return this builder
         **/
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The model version of an object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
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

        @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
        private CreateConfigProvider configProvider;

        public Builder configProvider(CreateConfigProvider configProvider) {
            this.configProvider = configProvider;
            this.__explicitlySet__.add("configProvider");
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
         * Optional task schedule key reference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskScheduleKey")
        private String taskScheduleKey;

        /**
         * Optional task schedule key reference.
         * @param taskScheduleKey the value to set
         * @return this builder
         **/
        public Builder taskScheduleKey(String taskScheduleKey) {
            this.taskScheduleKey = taskScheduleKey;
            this.__explicitlySet__.add("taskScheduleKey");
            return this;
        }
        /**
         * Reference Task Run Id to be used for re-run
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("refTaskRunId")
        private String refTaskRunId;

        /**
         * Reference Task Run Id to be used for re-run
         * @param refTaskRunId the value to set
         * @return this builder
         **/
        public Builder refTaskRunId(String refTaskRunId) {
            this.refTaskRunId = refTaskRunId;
            this.__explicitlySet__.add("refTaskRunId");
            return this;
        }
        /**
         * Supported re-run types
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reRunType")
        private ReRunType reRunType;

        /**
         * Supported re-run types
         * @param reRunType the value to set
         * @return this builder
         **/
        public Builder reRunType(ReRunType reRunType) {
            this.reRunType = reRunType;
            this.__explicitlySet__.add("reRunType");
            return this;
        }
        /**
         * Step Id for running from a certain step.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stepId")
        private String stepId;

        /**
         * Step Id for running from a certain step.
         * @param stepId the value to set
         * @return this builder
         **/
        public Builder stepId(String stepId) {
            this.stepId = stepId;
            this.__explicitlySet__.add("stepId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTaskRunDetails build() {
            CreateTaskRunDetails __instance__ =
                    new CreateTaskRunDetails(
                            key,
                            modelType,
                            modelVersion,
                            name,
                            description,
                            configProvider,
                            identifier,
                            taskScheduleKey,
                            refTaskRunId,
                            reRunType,
                            stepId,
                            registryMetadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTaskRunDetails o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelType(o.getModelType())
                            .modelVersion(o.getModelVersion())
                            .name(o.getName())
                            .description(o.getDescription())
                            .configProvider(o.getConfigProvider())
                            .identifier(o.getIdentifier())
                            .taskScheduleKey(o.getTaskScheduleKey())
                            .refTaskRunId(o.getRefTaskRunId())
                            .reRunType(o.getReRunType())
                            .stepId(o.getStepId())
                            .registryMetadata(o.getRegistryMetadata());

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
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     * @return the value
     **/
    public String getModelType() {
        return modelType;
    }

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
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

    @com.fasterxml.jackson.annotation.JsonProperty("configProvider")
    private final CreateConfigProvider configProvider;

    public CreateConfigProvider getConfigProvider() {
        return configProvider;
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
     * Optional task schedule key reference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskScheduleKey")
    private final String taskScheduleKey;

    /**
     * Optional task schedule key reference.
     * @return the value
     **/
    public String getTaskScheduleKey() {
        return taskScheduleKey;
    }

    /**
     * Reference Task Run Id to be used for re-run
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("refTaskRunId")
    private final String refTaskRunId;

    /**
     * Reference Task Run Id to be used for re-run
     * @return the value
     **/
    public String getRefTaskRunId() {
        return refTaskRunId;
    }

    /**
     * Supported re-run types
     **/
    public enum ReRunType {
        Beginning("BEGINNING"),
        Failed("FAILED"),
        Step("STEP"),
        ;

        private final String value;
        private static java.util.Map<String, ReRunType> map;

        static {
            map = new java.util.HashMap<>();
            for (ReRunType v : ReRunType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ReRunType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReRunType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ReRunType: " + key);
        }
    };
    /**
     * Supported re-run types
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reRunType")
    private final ReRunType reRunType;

    /**
     * Supported re-run types
     * @return the value
     **/
    public ReRunType getReRunType() {
        return reRunType;
    }

    /**
     * Step Id for running from a certain step.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stepId")
    private final String stepId;

    /**
     * Step Id for running from a certain step.
     * @return the value
     **/
    public String getStepId() {
        return stepId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
    private final RegistryMetadata registryMetadata;

    public RegistryMetadata getRegistryMetadata() {
        return registryMetadata;
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
        sb.append("CreateTaskRunDetails(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", configProvider=").append(String.valueOf(this.configProvider));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", taskScheduleKey=").append(String.valueOf(this.taskScheduleKey));
        sb.append(", refTaskRunId=").append(String.valueOf(this.refTaskRunId));
        sb.append(", reRunType=").append(String.valueOf(this.reRunType));
        sb.append(", stepId=").append(String.valueOf(this.stepId));
        sb.append(", registryMetadata=").append(String.valueOf(this.registryMetadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateTaskRunDetails)) {
            return false;
        }

        CreateTaskRunDetails other = (CreateTaskRunDetails) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.configProvider, other.configProvider)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.taskScheduleKey, other.taskScheduleKey)
                && java.util.Objects.equals(this.refTaskRunId, other.refTaskRunId)
                && java.util.Objects.equals(this.reRunType, other.reRunType)
                && java.util.Objects.equals(this.stepId, other.stepId)
                && java.util.Objects.equals(this.registryMetadata, other.registryMetadata)
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
                        + (this.configProvider == null ? 43 : this.configProvider.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result =
                (result * PRIME)
                        + (this.taskScheduleKey == null ? 43 : this.taskScheduleKey.hashCode());
        result = (result * PRIME) + (this.refTaskRunId == null ? 43 : this.refTaskRunId.hashCode());
        result = (result * PRIME) + (this.reRunType == null ? 43 : this.reRunType.hashCode());
        result = (result * PRIME) + (this.stepId == null ? 43 : this.stepId.hashCode());
        result =
                (result * PRIME)
                        + (this.registryMetadata == null ? 43 : this.registryMetadata.hashCode());
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
