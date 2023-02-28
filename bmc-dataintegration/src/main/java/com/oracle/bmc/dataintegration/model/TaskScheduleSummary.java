/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The tsk schedule summary information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TaskScheduleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class TaskScheduleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "numberOfRetries",
        "retryDelay",
        "retryDelayUnit",
        "startTimeMillis",
        "endTimeMillis",
        "isConcurrentAllowed",
        "isBackfillEnabled",
        "authMode",
        "expectedDuration",
        "expectedDurationUnit",
        "nextRunTimeMillis",
        "lastRunDetails",
        "metadata"
    })
    public TaskScheduleSummary(
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
            Integer numberOfRetries,
            Double retryDelay,
            RetryDelayUnit retryDelayUnit,
            Long startTimeMillis,
            Long endTimeMillis,
            Boolean isConcurrentAllowed,
            Boolean isBackfillEnabled,
            AuthMode authMode,
            Double expectedDuration,
            ExpectedDurationUnit expectedDurationUnit,
            Long nextRunTimeMillis,
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
        this.numberOfRetries = numberOfRetries;
        this.retryDelay = retryDelay;
        this.retryDelayUnit = retryDelayUnit;
        this.startTimeMillis = startTimeMillis;
        this.endTimeMillis = endTimeMillis;
        this.isConcurrentAllowed = isConcurrentAllowed;
        this.isBackfillEnabled = isBackfillEnabled;
        this.authMode = authMode;
        this.expectedDuration = expectedDuration;
        this.expectedDurationUnit = expectedDurationUnit;
        this.nextRunTimeMillis = nextRunTimeMillis;
        this.lastRunDetails = lastRunDetails;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Generated key that can be used in API calls to identify taskSchedule. On scenarios where
         * reference to the taskSchedule is needed, a value can be passed in create.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Generated key that can be used in API calls to identify taskSchedule. On scenarios where
         * reference to the taskSchedule is needed, a value can be passed in create.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * This is a version number that is used by the service to upgrade objects if needed through
         * releases of the service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * This is a version number that is used by the service to upgrade objects if needed through
         * releases of the service.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }
        /** The type of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private String modelType;

        /**
         * The type of the object.
         *
         * @param modelType the value to set
         * @return this builder
         */
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
        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Free form text without any restriction on permitted characters. Name can have letters,
         * numbers, and special characters. The value is editable and is restricted to 1000
         * characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Detailed description for the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description for the object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * This is used by the service for optimistic locking of the object, to prevent multiple
         * users from simultaneously updating the object.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * This is used by the service for optimistic locking of the object, to prevent multiple
         * users from simultaneously updating the object.
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        /**
         * The status of an object that can be set to value 1 for shallow references across objects,
         * other values reserved.
         *
         * @param objectStatus the value to set
         * @return this builder
         */
        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }
        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * Value can only contain upper case letters, underscore, and numbers. It should begin with
         * upper case letter or underscore. The value can be modified.
         *
         * @param identifier the value to set
         * @return this builder
         */
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
        /** Whether the task schedule is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Whether the task schedule is enabled.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The number of retries. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfRetries")
        private Integer numberOfRetries;

        /**
         * The number of retries.
         *
         * @param numberOfRetries the value to set
         * @return this builder
         */
        public Builder numberOfRetries(Integer numberOfRetries) {
            this.numberOfRetries = numberOfRetries;
            this.__explicitlySet__.add("numberOfRetries");
            return this;
        }
        /** The retry delay, the unit for measurement is in the property retry delay unit. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
        private Double retryDelay;

        /**
         * The retry delay, the unit for measurement is in the property retry delay unit.
         *
         * @param retryDelay the value to set
         * @return this builder
         */
        public Builder retryDelay(Double retryDelay) {
            this.retryDelay = retryDelay;
            this.__explicitlySet__.add("retryDelay");
            return this;
        }
        /** The unit for the retry delay. */
        @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
        private RetryDelayUnit retryDelayUnit;

        /**
         * The unit for the retry delay.
         *
         * @param retryDelayUnit the value to set
         * @return this builder
         */
        public Builder retryDelayUnit(RetryDelayUnit retryDelayUnit) {
            this.retryDelayUnit = retryDelayUnit;
            this.__explicitlySet__.add("retryDelayUnit");
            return this;
        }
        /** The start time in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
        private Long startTimeMillis;

        /**
         * The start time in milliseconds.
         *
         * @param startTimeMillis the value to set
         * @return this builder
         */
        public Builder startTimeMillis(Long startTimeMillis) {
            this.startTimeMillis = startTimeMillis;
            this.__explicitlySet__.add("startTimeMillis");
            return this;
        }
        /** The end time in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
        private Long endTimeMillis;

        /**
         * The end time in milliseconds.
         *
         * @param endTimeMillis the value to set
         * @return this builder
         */
        public Builder endTimeMillis(Long endTimeMillis) {
            this.endTimeMillis = endTimeMillis;
            this.__explicitlySet__.add("endTimeMillis");
            return this;
        }
        /** Whether the same task can be executed concurrently. */
        @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
        private Boolean isConcurrentAllowed;

        /**
         * Whether the same task can be executed concurrently.
         *
         * @param isConcurrentAllowed the value to set
         * @return this builder
         */
        public Builder isConcurrentAllowed(Boolean isConcurrentAllowed) {
            this.isConcurrentAllowed = isConcurrentAllowed;
            this.__explicitlySet__.add("isConcurrentAllowed");
            return this;
        }
        /** Whether the backfill is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBackfillEnabled")
        private Boolean isBackfillEnabled;

        /**
         * Whether the backfill is enabled.
         *
         * @param isBackfillEnabled the value to set
         * @return this builder
         */
        public Builder isBackfillEnabled(Boolean isBackfillEnabled) {
            this.isBackfillEnabled = isBackfillEnabled;
            this.__explicitlySet__.add("isBackfillEnabled");
            return this;
        }
        /** The authorization mode for the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("authMode")
        private AuthMode authMode;

        /**
         * The authorization mode for the task.
         *
         * @param authMode the value to set
         * @return this builder
         */
        public Builder authMode(AuthMode authMode) {
            this.authMode = authMode;
            this.__explicitlySet__.add("authMode");
            return this;
        }
        /** The expected duration of the task execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
        private Double expectedDuration;

        /**
         * The expected duration of the task execution.
         *
         * @param expectedDuration the value to set
         * @return this builder
         */
        public Builder expectedDuration(Double expectedDuration) {
            this.expectedDuration = expectedDuration;
            this.__explicitlySet__.add("expectedDuration");
            return this;
        }
        /** The expected duration unit of the task execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
        private ExpectedDurationUnit expectedDurationUnit;

        /**
         * The expected duration unit of the task execution.
         *
         * @param expectedDurationUnit the value to set
         * @return this builder
         */
        public Builder expectedDurationUnit(ExpectedDurationUnit expectedDurationUnit) {
            this.expectedDurationUnit = expectedDurationUnit;
            this.__explicitlySet__.add("expectedDurationUnit");
            return this;
        }
        /** The time for next run in milliseconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("nextRunTimeMillis")
        private Long nextRunTimeMillis;

        /**
         * The time for next run in milliseconds.
         *
         * @param nextRunTimeMillis the value to set
         * @return this builder
         */
        public Builder nextRunTimeMillis(Long nextRunTimeMillis) {
            this.nextRunTimeMillis = nextRunTimeMillis;
            this.__explicitlySet__.add("nextRunTimeMillis");
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

        public TaskScheduleSummary build() {
            TaskScheduleSummary model =
                    new TaskScheduleSummary(
                            this.key,
                            this.modelVersion,
                            this.modelType,
                            this.parentRef,
                            this.name,
                            this.description,
                            this.objectVersion,
                            this.objectStatus,
                            this.identifier,
                            this.scheduleRef,
                            this.configProviderDelegate,
                            this.isEnabled,
                            this.numberOfRetries,
                            this.retryDelay,
                            this.retryDelayUnit,
                            this.startTimeMillis,
                            this.endTimeMillis,
                            this.isConcurrentAllowed,
                            this.isBackfillEnabled,
                            this.authMode,
                            this.expectedDuration,
                            this.expectedDurationUnit,
                            this.nextRunTimeMillis,
                            this.lastRunDetails,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskScheduleSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("scheduleRef")) {
                this.scheduleRef(model.getScheduleRef());
            }
            if (model.wasPropertyExplicitlySet("configProviderDelegate")) {
                this.configProviderDelegate(model.getConfigProviderDelegate());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("numberOfRetries")) {
                this.numberOfRetries(model.getNumberOfRetries());
            }
            if (model.wasPropertyExplicitlySet("retryDelay")) {
                this.retryDelay(model.getRetryDelay());
            }
            if (model.wasPropertyExplicitlySet("retryDelayUnit")) {
                this.retryDelayUnit(model.getRetryDelayUnit());
            }
            if (model.wasPropertyExplicitlySet("startTimeMillis")) {
                this.startTimeMillis(model.getStartTimeMillis());
            }
            if (model.wasPropertyExplicitlySet("endTimeMillis")) {
                this.endTimeMillis(model.getEndTimeMillis());
            }
            if (model.wasPropertyExplicitlySet("isConcurrentAllowed")) {
                this.isConcurrentAllowed(model.getIsConcurrentAllowed());
            }
            if (model.wasPropertyExplicitlySet("isBackfillEnabled")) {
                this.isBackfillEnabled(model.getIsBackfillEnabled());
            }
            if (model.wasPropertyExplicitlySet("authMode")) {
                this.authMode(model.getAuthMode());
            }
            if (model.wasPropertyExplicitlySet("expectedDuration")) {
                this.expectedDuration(model.getExpectedDuration());
            }
            if (model.wasPropertyExplicitlySet("expectedDurationUnit")) {
                this.expectedDurationUnit(model.getExpectedDurationUnit());
            }
            if (model.wasPropertyExplicitlySet("nextRunTimeMillis")) {
                this.nextRunTimeMillis(model.getNextRunTimeMillis());
            }
            if (model.wasPropertyExplicitlySet("lastRunDetails")) {
                this.lastRunDetails(model.getLastRunDetails());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Generated key that can be used in API calls to identify taskSchedule. On scenarios where
     * reference to the taskSchedule is needed, a value can be passed in create.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Generated key that can be used in API calls to identify taskSchedule. On scenarios where
     * reference to the taskSchedule is needed, a value can be passed in create.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * This is a version number that is used by the service to upgrade objects if needed through
     * releases of the service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * This is a version number that is used by the service to upgrade objects if needed through
     * releases of the service.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /** The type of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final String modelType;

    /**
     * The type of the object.
     *
     * @return the value
     */
    public String getModelType() {
        return modelType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Free form text without any restriction on permitted characters. Name can have letters,
     * numbers, and special characters. The value is editable and is restricted to 1000 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Detailed description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users
     * from simultaneously updating the object.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * This is used by the service for optimistic locking of the object, to prevent multiple users
     * from simultaneously updating the object.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    private final Integer objectStatus;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects,
     * other values reserved.
     *
     * @return the value
     */
    public Integer getObjectStatus() {
        return objectStatus;
    }

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * Value can only contain upper case letters, underscore, and numbers. It should begin with
     * upper case letter or underscore. The value can be modified.
     *
     * @return the value
     */
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

    /** Whether the task schedule is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether the task schedule is enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The number of retries. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfRetries")
    private final Integer numberOfRetries;

    /**
     * The number of retries.
     *
     * @return the value
     */
    public Integer getNumberOfRetries() {
        return numberOfRetries;
    }

    /** The retry delay, the unit for measurement is in the property retry delay unit. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
    private final Double retryDelay;

    /**
     * The retry delay, the unit for measurement is in the property retry delay unit.
     *
     * @return the value
     */
    public Double getRetryDelay() {
        return retryDelay;
    }

    /** The unit for the retry delay. */
    public enum RetryDelayUnit implements com.oracle.bmc.http.internal.BmcEnum {
        Seconds("SECONDS"),
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The unit for the retry delay. */
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
    private final RetryDelayUnit retryDelayUnit;

    /**
     * The unit for the retry delay.
     *
     * @return the value
     */
    public RetryDelayUnit getRetryDelayUnit() {
        return retryDelayUnit;
    }

    /** The start time in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    private final Long startTimeMillis;

    /**
     * The start time in milliseconds.
     *
     * @return the value
     */
    public Long getStartTimeMillis() {
        return startTimeMillis;
    }

    /** The end time in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    private final Long endTimeMillis;

    /**
     * The end time in milliseconds.
     *
     * @return the value
     */
    public Long getEndTimeMillis() {
        return endTimeMillis;
    }

    /** Whether the same task can be executed concurrently. */
    @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
    private final Boolean isConcurrentAllowed;

    /**
     * Whether the same task can be executed concurrently.
     *
     * @return the value
     */
    public Boolean getIsConcurrentAllowed() {
        return isConcurrentAllowed;
    }

    /** Whether the backfill is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBackfillEnabled")
    private final Boolean isBackfillEnabled;

    /**
     * Whether the backfill is enabled.
     *
     * @return the value
     */
    public Boolean getIsBackfillEnabled() {
        return isBackfillEnabled;
    }

    /** The authorization mode for the task. */
    public enum AuthMode implements com.oracle.bmc.http.internal.BmcEnum {
        Obo("OBO"),
        ResourcePrincipal("RESOURCE_PRINCIPAL"),
        UserCertificate("USER_CERTIFICATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The authorization mode for the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("authMode")
    private final AuthMode authMode;

    /**
     * The authorization mode for the task.
     *
     * @return the value
     */
    public AuthMode getAuthMode() {
        return authMode;
    }

    /** The expected duration of the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
    private final Double expectedDuration;

    /**
     * The expected duration of the task execution.
     *
     * @return the value
     */
    public Double getExpectedDuration() {
        return expectedDuration;
    }

    /** The expected duration unit of the task execution. */
    public enum ExpectedDurationUnit implements com.oracle.bmc.http.internal.BmcEnum {
        Seconds("SECONDS"),
        Minutes("MINUTES"),
        Hours("HOURS"),
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The expected duration unit of the task execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDurationUnit")
    private final ExpectedDurationUnit expectedDurationUnit;

    /**
     * The expected duration unit of the task execution.
     *
     * @return the value
     */
    public ExpectedDurationUnit getExpectedDurationUnit() {
        return expectedDurationUnit;
    }

    /** The time for next run in milliseconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("nextRunTimeMillis")
    private final Long nextRunTimeMillis;

    /**
     * The time for next run in milliseconds.
     *
     * @return the value
     */
    public Long getNextRunTimeMillis() {
        return nextRunTimeMillis;
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
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaskScheduleSummary(");
        sb.append("super=").append(super.toString());
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
        sb.append(", numberOfRetries=").append(String.valueOf(this.numberOfRetries));
        sb.append(", retryDelay=").append(String.valueOf(this.retryDelay));
        sb.append(", retryDelayUnit=").append(String.valueOf(this.retryDelayUnit));
        sb.append(", startTimeMillis=").append(String.valueOf(this.startTimeMillis));
        sb.append(", endTimeMillis=").append(String.valueOf(this.endTimeMillis));
        sb.append(", isConcurrentAllowed=").append(String.valueOf(this.isConcurrentAllowed));
        sb.append(", isBackfillEnabled=").append(String.valueOf(this.isBackfillEnabled));
        sb.append(", authMode=").append(String.valueOf(this.authMode));
        sb.append(", expectedDuration=").append(String.valueOf(this.expectedDuration));
        sb.append(", expectedDurationUnit=").append(String.valueOf(this.expectedDurationUnit));
        sb.append(", nextRunTimeMillis=").append(String.valueOf(this.nextRunTimeMillis));
        sb.append(", lastRunDetails=").append(String.valueOf(this.lastRunDetails));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskScheduleSummary)) {
            return false;
        }

        TaskScheduleSummary other = (TaskScheduleSummary) o;
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
                && java.util.Objects.equals(this.numberOfRetries, other.numberOfRetries)
                && java.util.Objects.equals(this.retryDelay, other.retryDelay)
                && java.util.Objects.equals(this.retryDelayUnit, other.retryDelayUnit)
                && java.util.Objects.equals(this.startTimeMillis, other.startTimeMillis)
                && java.util.Objects.equals(this.endTimeMillis, other.endTimeMillis)
                && java.util.Objects.equals(this.isConcurrentAllowed, other.isConcurrentAllowed)
                && java.util.Objects.equals(this.isBackfillEnabled, other.isBackfillEnabled)
                && java.util.Objects.equals(this.authMode, other.authMode)
                && java.util.Objects.equals(this.expectedDuration, other.expectedDuration)
                && java.util.Objects.equals(this.expectedDurationUnit, other.expectedDurationUnit)
                && java.util.Objects.equals(this.nextRunTimeMillis, other.nextRunTimeMillis)
                && java.util.Objects.equals(this.lastRunDetails, other.lastRunDetails)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
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
                        + (this.numberOfRetries == null ? 43 : this.numberOfRetries.hashCode());
        result = (result * PRIME) + (this.retryDelay == null ? 43 : this.retryDelay.hashCode());
        result =
                (result * PRIME)
                        + (this.retryDelayUnit == null ? 43 : this.retryDelayUnit.hashCode());
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
                        + (this.nextRunTimeMillis == null ? 43 : this.nextRunTimeMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.lastRunDetails == null ? 43 : this.lastRunDetails.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
