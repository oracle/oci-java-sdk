/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The tsk schedule summary information.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TaskScheduleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TaskScheduleSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("numberOfRetries")
        private Integer numberOfRetries;

        public Builder numberOfRetries(Integer numberOfRetries) {
            this.numberOfRetries = numberOfRetries;
            this.__explicitlySet__.add("numberOfRetries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
        private Double retryDelay;

        public Builder retryDelay(Double retryDelay) {
            this.retryDelay = retryDelay;
            this.__explicitlySet__.add("retryDelay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retryDelayUnit")
        private RetryDelayUnit retryDelayUnit;

        public Builder retryDelayUnit(RetryDelayUnit retryDelayUnit) {
            this.retryDelayUnit = retryDelayUnit;
            this.__explicitlySet__.add("retryDelayUnit");
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

        @com.fasterxml.jackson.annotation.JsonProperty("nextRunTimeMillis")
        private Long nextRunTimeMillis;

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
            TaskScheduleSummary __instance__ =
                    new TaskScheduleSummary(
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
                            numberOfRetries,
                            retryDelay,
                            retryDelayUnit,
                            startTimeMillis,
                            endTimeMillis,
                            isConcurrentAllowed,
                            isBackfillEnabled,
                            authMode,
                            expectedDuration,
                            expectedDurationUnit,
                            nextRunTimeMillis,
                            lastRunDetails,
                            metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskScheduleSummary o) {
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
                            .numberOfRetries(o.getNumberOfRetries())
                            .retryDelay(o.getRetryDelay())
                            .retryDelayUnit(o.getRetryDelayUnit())
                            .startTimeMillis(o.getStartTimeMillis())
                            .endTimeMillis(o.getEndTimeMillis())
                            .isConcurrentAllowed(o.getIsConcurrentAllowed())
                            .isBackfillEnabled(o.getIsBackfillEnabled())
                            .authMode(o.getAuthMode())
                            .expectedDuration(o.getExpectedDuration())
                            .expectedDurationUnit(o.getExpectedDurationUnit())
                            .nextRunTimeMillis(o.getNextRunTimeMillis())
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

    /**
     * Generated key that can be used in API calls to identify taskSchedule. On scenarios where reference to the taskSchedule is needed, a value can be passed in create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * This is a version number that is used by the service to upgrade objects if needed through releases of the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    /**
     * The type of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    String modelType;

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
     * This is used by the service for optimistic locking of the object, to prevent multiple users from simultaneously updating the object.
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

    @com.fasterxml.jackson.annotation.JsonProperty("scheduleRef")
    Schedule scheduleRef;

    @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
    ConfigProvider configProviderDelegate;

    /**
     * Whether the task schedule is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * The number of retries.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfRetries")
    Integer numberOfRetries;

    /**
     * The retry delay, the unit for measurement is in the property retry delay unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retryDelay")
    Double retryDelay;
    /**
     * The unit for the retry delay.
     **/
    @lombok.extern.slf4j.Slf4j
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
    RetryDelayUnit retryDelayUnit;

    /**
     * The start time in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimeMillis")
    Long startTimeMillis;

    /**
     * The end time in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTimeMillis")
    Long endTimeMillis;

    /**
     * Whether the same task can be executed concurrently.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isConcurrentAllowed")
    Boolean isConcurrentAllowed;

    /**
     * Whether the backfill is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBackfillEnabled")
    Boolean isBackfillEnabled;
    /**
     * The authorization mode for the task.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AuthMode {
        Obo("OBO"),
        ResourcePrincipal("RESOURCE_PRINCIPAL"),
        UserCertificate("USER_CERTIFICATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    AuthMode authMode;

    /**
     * The expected duration of the task execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expectedDuration")
    Double expectedDuration;
    /**
     * The expected duration unit of the task execution.
     **/
    @lombok.extern.slf4j.Slf4j
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
    ExpectedDurationUnit expectedDurationUnit;

    /**
     * The time for next run in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nextRunTimeMillis")
    Long nextRunTimeMillis;

    @com.fasterxml.jackson.annotation.JsonProperty("lastRunDetails")
    LastRunDetails lastRunDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    ObjectMetadata metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
