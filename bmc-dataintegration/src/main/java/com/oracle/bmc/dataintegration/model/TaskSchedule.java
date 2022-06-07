/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A model that holds Schedule and other information required for scheduling a task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaskSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TaskSchedule {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelVersion",
        "modelType",
        "parentRef",
        "name",
        "description",
        "objectVersion",
        "objectStatus",
        "identifier",
        "scheduleRef",
        "configProviderDelegate",
        "isEnabled",
        "retryAttempts",
        "retryDelayUnit",
        "retryDelay",
        "startTimeMillis",
        "endTimeMillis",
        "isConcurrentAllowed",
        "isBackfillEnabled",
        "authMode",
        "expectedDuration",
        "expectedDurationUnit",
        "lastRunDetails",
        "metadata"
    })
    public TaskSchedule(
            String key,
            String modelVersion,
            String modelType,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            Integer objectStatus,
            String identifier,
            Schedule scheduleRef,
            ConfigProvider configProviderDelegate,
            Boolean isEnabled,
            Integer retryAttempts,
            RetryDelayUnit retryDelayUnit,
            Double retryDelay,
            Long startTimeMillis,
            Long endTimeMillis,
            Boolean isConcurrentAllowed,
            Boolean isBackfillEnabled,
            AuthMode authMode,
            Double expectedDuration,
            ExpectedDurationUnit expectedDurationUnit,
            LastRunDetails lastRunDetails,
            ObjectMetadata metadata) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.modelType = modelType;
        this.parentRef = parentRef;
        this.name = name;
        this.description = description;
        this.objectVersion = objectVersion;
        this.objectStatus = objectStatus;
        this.identifier = identifier;
        this.scheduleRef = scheduleRef;
        this.configProviderDelegate = configProviderDelegate;
        this.isEnabled = isEnabled;
        this.retryAttempts = retryAttempts;
        this.retryDelayUnit = retryDelayUnit;
        this.retryDelay = retryDelay;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.isConcurrentAllowed = isConcurrentAllowed;
        this.isBackfillEnabled = isBackfillEnabled;
        this.authMode = authMode;
        this.expectedDuration = expectedDuration;
        this.expectedDurationUnit = expectedDurationUnit;
        this.lastRunDetails = lastRunDetails;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        public Builder modelType(String modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
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

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleRef")
        private Schedule scheduleRef;

        public Builder scheduleRef(Schedule scheduleRef) {
            this.scheduleRef = scheduleRef;
            this.__explicitlySet__.add("scheduleRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private ConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(ConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryAttempts")
        private Integer retryAttempts;

        public Builder retryAttempts(Integer retryAttempts) {
            this.retryAttempts = retryAttempts;
            this.__explicitlySet__.add("retryAttempts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
        private RetryDelayUnit retryDelayUnit;

        public Builder retryDelayUnit(RetryDelayUnit retryDelayUnit) {
            this.retryDelayUnit = retryDelayUnit;
            this.__explicitlySet__.add("retryDelayUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
        private Double retryDelay;

        public Builder retryDelay(Double retryDelay) {
            this.retryDelay = retryDelay;
            this.__explicitlySet__.add("retryDelay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
        private Long startTimeMillis;

        public Builder startTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            this.__explicitlySet__.add("startTimeMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
        private Long endTimeMillis;

        public Builder endTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            this.__explicitlySet__.add("endTimeMillis");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
        private Boolean isConcurrentAllowed;

        public Builder isConcurrentAllowed(Boolean isConcurrentAllowed) {
            this.isConcurrentAllowed = isConcurrentAllowed;
            this.__explicitlySet__.add("isConcurrentAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBackfillEnabled")
        private Boolean isBackfillEnabled;

        public Builder isBackfillEnabled(Boolean isBackfillEnabled) {
            this.isBackfillEnabled = isBackfillEnabled;
            this.__explicitlySet__.add("isBackfillEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authMode")
        private AuthMode authMode;

        public Builder authMode(AuthMode authMode) {
            this.authMode = authMode;
            this.__explicitlySet__.add("authMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
        private Double expectedDuration;

        public Builder expectedDuration(Double expectedDuration) {
            this.expectedDuration = expectedDuration;
            this.__explicitlySet__.add("expectedDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
        private ExpectedDurationUnit expectedDurationUnit;

        public Builder expectedDurationUnit(ExpectedDurationUnit expectedDurationUnit) {
            this.expectedDurationUnit = expectedDurationUnit;
            this.__explicitlySet__.add("expectedDurationUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastRunDetails")
        private LastRunDetails lastRunDetails;

        public Builder lastRunDetails(LastRunDetails lastRunDetails) {
            this.lastRunDetails = lastRunDetails;
            this.__explicitlySet__.add("lastRunDetails");
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

        public TaskSchedule build() {
            TaskSchedule __instance__ =
                    new TaskSchedule(
                            key,
                            modelVersion,
                            modelType,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            objectStatus,
                            identifier,
                            scheduleRef,
                            configProviderDelegate,
                            isEnabled,
                            retryAttempts,
                            retryDelayUnit,
                            retryDelay,
                            startTimeMillis,
                            endTimeMillis,
                            isConcurrentAllowed,
                            isBackfillEnabled,
                            authMode,
                            expectedDuration,
                            expectedDurationUnit,
                            lastRunDetails,
                            metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskSchedule o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .modelType(o.getModelType())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .scheduleRef(o.getScheduleRef())
                            .configProviderDelegate(o.getConfigProviderDelegate())
                            .isEnabled(o.getIsEnabled())
                            .retryAttempts(o.getRetryAttempts())
                            .retryDelayUnit(o.getRetryDelayUnit())
                            .retryDelay(o.getRetryDelay())
                            .startTimeMillis(o.getStartTimeMillis())
                            .endTimeMillis(o.getEndTimeMillis())
                            .isConcurrentAllowed(o.getIsConcurrentAllowed())
                            .isBackfillEnabled(o.getIsBackfillEnabled())
                            .authMode(o.getAuthMode())
                            .expectedDuration(o.getExpectedDuration())
                            .expectedDurationUnit(o.getExpectedDurationUnit())
                            .lastRunDetails(o.getLastRunDetails())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Generated key that can be used in API calls to identify taskSchedule. On scenarios where reference to the taskSchedule is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * This is a version number that is used by the service to upgrade objects if needed through releases of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    public String getModelType() {
        return modelType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * Detailed description for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users from simultaneously updating the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with upper case letter or underscore. The value can be modified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    public String getIdentifier() {
        return identifier;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scheduleRef")
    private final Schedule scheduleRef;

    public Schedule getScheduleRef() {
        return scheduleRef;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    private final ConfigProvider configProviderDelegate;

    public ConfigProvider getConfigProviderDelegate() {
        return configProviderDelegate;
    }

    /**
     * Whether the schedule is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The number of retry attempts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryAttempts")
    private final Integer retryAttempts;

    public Integer getRetryAttempts() {
        return retryAttempts;
    }

    /**
     * The unit for the retry delay.
     **/
    public enum RetryDelayUnit {
        Seconds("SECONDS"),
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RetryDelayUnit.class);

        private final String value;
        private static java.util.Map<String, RetryDelayUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (RetryDelayUnit v : RetryDelayUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RetryDelayUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RetryDelayUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RetryDelayUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The unit for the retry delay.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
    private final RetryDelayUnit retryDelayUnit;

    public RetryDelayUnit getRetryDelayUnit() {
        return retryDelayUnit;
    }

    /**
     * The retry delay, the unit for measurement is in the property retry delay unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
    private final Double retryDelay;

    public Double getRetryDelay() {
        return retryDelay;
    }

    /**
     * The start time in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    private final Long startTimeMillis;

    public Long getStartTimeMillis() {
        return startTimeMillis;
    }

    /**
     * The end time in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    private final Long endTimeMillis;

    public Long getEndTimeMillis() {
        return endTimeMillis;
    }

    /**
     * Whether the same task can be executed concurrently.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
    private final Boolean isConcurrentAllowed;

    public Boolean getIsConcurrentAllowed() {
        return isConcurrentAllowed;
    }

    /**
     * Whether the backfill is enabled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBackfillEnabled")
    private final Boolean isBackfillEnabled;

    public Boolean getIsBackfillEnabled() {
        return isBackfillEnabled;
    }

    /**
     * The authorization mode for the task.
     **/
    public enum AuthMode {
        Obo("OBO"),
        ResourcePrincipal("RESOURCE_PRINCIPAL"),
        UserCertificate("USER_CERTIFICATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AuthMode.class);

        private final String value;
        private static java.util.Map<String, AuthMode> map;

        static {
            map = new java.util.HashMap<>();
            for (AuthMode v : AuthMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AuthMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AuthMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AuthMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The authorization mode for the task.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authMode")
    private final AuthMode authMode;

    public AuthMode getAuthMode() {
        return authMode;
    }

    /**
     * The expected duration of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
    private final Double expectedDuration;

    public Double getExpectedDuration() {
        return expectedDuration;
    }

    /**
     * The expected duration unit of the task execution.
     **/
    public enum ExpectedDurationUnit {
        Seconds("SECONDS"),
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ExpectedDurationUnit.class);

        private final String value;
        private static java.util.Map<String, ExpectedDurationUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (ExpectedDurationUnit v : ExpectedDurationUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ExpectedDurationUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ExpectedDurationUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ExpectedDurationUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The expected duration unit of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
    private final ExpectedDurationUnit expectedDurationUnit;

    public ExpectedDurationUnit getExpectedDurationUnit() {
        return expectedDurationUnit;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lastRunDetails")
    private final LastRunDetails lastRunDetails;

    public LastRunDetails getLastRunDetails() {
        return lastRunDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final ObjectMetadata metadata;

    public ObjectMetadata getMetadata() {
        return metadata;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaskSchedule(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", objectStatus=").append(String.valueOf(this.objectStatus));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", scheduleRef=").append(String.valueOf(this.scheduleRef));
        sb.append(", configProviderDelegate=").append(String.valueOf(this.configProviderDelegate));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", retryAttempts=").append(String.valueOf(this.retryAttempts));
        sb.append(", retryDelayUnit=").append(String.valueOf(this.retryDelayUnit));
        sb.append(", retryDelay=").append(String.valueOf(this.retryDelay));
        sb.append(", startTimeMillis=").append(String.valueOf(this.startTimeMillis));
        sb.append(", endTimeMillis=").append(String.valueOf(this.endTimeMillis));
        sb.append(", isConcurrentAllowed=").append(String.valueOf(this.isConcurrentAllowed));
        sb.append(", isBackfillEnabled=").append(String.valueOf(this.isBackfillEnabled));
        sb.append(", authMode=").append(String.valueOf(this.authMode));
        sb.append(", expectedDuration=").append(String.valueOf(this.expectedDuration));
        sb.append(", expectedDurationUnit=").append(String.valueOf(this.expectedDurationUnit));
        sb.append(", lastRunDetails=").append(String.valueOf(this.lastRunDetails));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskSchedule)) {
            return false;
        }

        TaskSchedule other = (TaskSchedule) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.objectStatus, other.objectStatus)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.scheduleRef, other.scheduleRef)
                && java.util.Objects.equals(
                        this.configProviderDelegate, other.configProviderDelegate)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.retryAttempts, other.retryAttempts)
                && java.util.Objects.equals(this.retryDelayUnit, other.retryDelayUnit)
                && java.util.Objects.equals(this.retryDelay, other.retryDelay)
                && java.util.Objects.equals(this.startTimeMillis, other.startTimeMillis)
                && java.util.Objects.equals(this.endTimeMillis, other.endTimeMillis)
                && java.util.Objects.equals(this.isConcurrentAllowed, other.isConcurrentAllowed)
                && java.util.Objects.equals(this.isBackfillEnabled, other.isBackfillEnabled)
                && java.util.Objects.equals(this.authMode, other.authMode)
                && java.util.Objects.equals(this.expectedDuration, other.expectedDuration)
                && java.util.Objects.equals(this.expectedDurationUnit, other.expectedDurationUnit)
                && java.util.Objects.equals(this.lastRunDetails, other.lastRunDetails)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result = (result * PRIME) + (this.objectStatus == null ? 43 : this.objectStatus.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.scheduleRef == null ? 43 : this.scheduleRef.hashCode());
        result =
                (result * PRIME)
                        + (this.configProviderDelegate == null
                                ? 43
                                : this.configProviderDelegate.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.retryAttempts == null ? 43 : this.retryAttempts.hashCode());
        result =
                (result * PRIME)
                        + (this.retryDelayUnit == null ? 43 : this.retryDelayUnit.hashCode());
        result = (result * PRIME) + (this.retryDelay == null ? 43 : this.retryDelay.hashCode());
        result =
                (result * PRIME)
                        + (this.startTimeMillis == null ? 43 : this.startTimeMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.endTimeMillis == null ? 43 : this.endTimeMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.isConcurrentAllowed == null
                                ? 43
                                : this.isConcurrentAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.isBackfillEnabled == null ? 43 : this.isBackfillEnabled.hashCode());
        result = (result * PRIME) + (this.authMode == null ? 43 : this.authMode.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedDuration == null ? 43 : this.expectedDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedDurationUnit == null
                                ? 43
                                : this.expectedDurationUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRunDetails == null ? 43 : this.lastRunDetails.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
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
