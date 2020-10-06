/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of a maintenance run.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaintenanceRun.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaintenanceRun {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
        private TargetResourceType targetResourceType;

        public Builder targetResourceType(TargetResourceType targetResourceType) {
            this.targetResourceType = targetResourceType;
            this.__explicitlySet__.add("targetResourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
        private String targetResourceId;

        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            this.__explicitlySet__.add("targetResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceType maintenanceType;

        public Builder maintenanceType(MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
        private MaintenanceSubtype maintenanceSubtype;

        public Builder maintenanceSubtype(MaintenanceSubtype maintenanceSubtype) {
            this.maintenanceSubtype = maintenanceSubtype;
            this.__explicitlySet__.add("maintenanceSubtype");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceRun build() {
            MaintenanceRun __instance__ =
                    new MaintenanceRun(
                            id,
                            compartmentId,
                            displayName,
                            description,
                            lifecycleState,
                            lifecycleDetails,
                            timeScheduled,
                            timeStarted,
                            timeEnded,
                            targetResourceType,
                            targetResourceId,
                            maintenanceType,
                            patchId,
                            maintenanceSubtype);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceRun o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeScheduled(o.getTimeScheduled())
                            .timeStarted(o.getTimeStarted())
                            .timeEnded(o.getTimeEnded())
                            .targetResourceType(o.getTargetResourceType())
                            .targetResourceId(o.getTargetResourceId())
                            .maintenanceType(o.getMaintenanceType())
                            .patchId(o.getPatchId())
                            .maintenanceSubtype(o.getMaintenanceSubtype());

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
     * The OCID of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user-friendly name for the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Description of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
    /**
     * The current state of the maintenance run.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Scheduled("SCHEDULED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Skipped("SKIPPED"),
        Failed("FAILED"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),

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
     * The current state of the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The date and time the maintenance run is scheduled to occur.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    java.util.Date timeScheduled;

    /**
     * The date and time the maintenance run starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time the maintenance run was completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    java.util.Date timeEnded;
    /**
     * The type of the target resource on which the maintenance run occurs.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TargetResourceType {
        AutonomousExadataInfrastructure("AUTONOMOUS_EXADATA_INFRASTRUCTURE"),
        AutonomousContainerDatabase("AUTONOMOUS_CONTAINER_DATABASE"),
        ExadataDbSystem("EXADATA_DB_SYSTEM"),
        CloudExadataInfrastructure("CLOUD_EXADATA_INFRASTRUCTURE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TargetResourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetResourceType v : TargetResourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetResourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetResourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetResourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the target resource on which the maintenance run occurs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceType")
    TargetResourceType targetResourceType;

    /**
     * The ID of the target resource on which the maintenance run occurs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetResourceId")
    String targetResourceId;
    /**
     * Maintenance type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MaintenanceType {
        Planned("PLANNED"),
        Unplanned("UNPLANNED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MaintenanceType> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceType v : MaintenanceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Maintenance type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
    MaintenanceType maintenanceType;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the patch to be applied in the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    String patchId;
    /**
     * Maintenance sub-type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MaintenanceSubtype {
        Quarterly("QUARTERLY"),
        Hardware("HARDWARE"),
        Critical("CRITICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MaintenanceSubtype> map;

        static {
            map = new java.util.HashMap<>();
            for (MaintenanceSubtype v : MaintenanceSubtype.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MaintenanceSubtype(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaintenanceSubtype create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MaintenanceSubtype', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Maintenance sub-type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceSubtype")
    MaintenanceSubtype maintenanceSubtype;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
