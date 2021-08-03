/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * A server where Oracle Database software is running.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbNodeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DbNodeSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
        private String backupVnicId;

        public Builder backupVnicId(String backupVnicId) {
            this.backupVnicId = backupVnicId;
            this.__explicitlySet__.add("backupVnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostIpId")
        private String hostIpId;

        public Builder hostIpId(String hostIpId) {
            this.hostIpId = hostIpId;
            this.__explicitlySet__.add("hostIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupIpId")
        private String backupIpId;

        public Builder backupIpId(String backupIpId) {
            this.backupIpId = backupIpId;
            this.__explicitlySet__.add("backupIpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vnic2Id")
        private String vnic2Id;

        public Builder vnic2Id(String vnic2Id) {
            this.vnic2Id = vnic2Id;
            this.__explicitlySet__.add("vnic2Id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupVnic2Id")
        private String backupVnic2Id;

        public Builder backupVnic2Id(String backupVnic2Id) {
            this.backupVnic2Id = backupVnic2Id;
            this.__explicitlySet__.add("backupVnic2Id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
        private Integer softwareStorageSizeInGB;

        public Builder softwareStorageSizeInGB(Integer softwareStorageSizeInGB) {
            this.softwareStorageSizeInGB = softwareStorageSizeInGB;
            this.__explicitlySet__.add("softwareStorageSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
        private MaintenanceType maintenanceType;

        public Builder maintenanceType(MaintenanceType maintenanceType) {
            this.maintenanceType = maintenanceType;
            this.__explicitlySet__.add("maintenanceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
        private java.util.Date timeMaintenanceWindowStart;

        public Builder timeMaintenanceWindowStart(java.util.Date timeMaintenanceWindowStart) {
            this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
            this.__explicitlySet__.add("timeMaintenanceWindowStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
        private java.util.Date timeMaintenanceWindowEnd;

        public Builder timeMaintenanceWindowEnd(java.util.Date timeMaintenanceWindowEnd) {
            this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
            this.__explicitlySet__.add("timeMaintenanceWindowEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private String additionalDetails;

        public Builder additionalDetails(String additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbNodeSummary build() {
            DbNodeSummary __instance__ =
                    new DbNodeSummary(
                            id,
                            dbSystemId,
                            vnicId,
                            backupVnicId,
                            hostIpId,
                            backupIpId,
                            vnic2Id,
                            backupVnic2Id,
                            lifecycleState,
                            hostname,
                            faultDomain,
                            timeCreated,
                            softwareStorageSizeInGB,
                            maintenanceType,
                            timeMaintenanceWindowStart,
                            timeMaintenanceWindowEnd,
                            additionalDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbNodeSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .dbSystemId(o.getDbSystemId())
                            .vnicId(o.getVnicId())
                            .backupVnicId(o.getBackupVnicId())
                            .hostIpId(o.getHostIpId())
                            .backupIpId(o.getBackupIpId())
                            .vnic2Id(o.getVnic2Id())
                            .backupVnic2Id(o.getBackupVnic2Id())
                            .lifecycleState(o.getLifecycleState())
                            .hostname(o.getHostname())
                            .faultDomain(o.getFaultDomain())
                            .timeCreated(o.getTimeCreated())
                            .softwareStorageSizeInGB(o.getSoftwareStorageSizeInGB())
                            .maintenanceType(o.getMaintenanceType())
                            .timeMaintenanceWindowStart(o.getTimeMaintenanceWindowStart())
                            .timeMaintenanceWindowEnd(o.getTimeMaintenanceWindowEnd())
                            .additionalDetails(o.getAdditionalDetails());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    String vnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
    String backupVnicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the host IP address associated with the database node.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostIpId")
    String hostIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup IP address associated with the database node.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupIpId")
    String backupIpId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnic2Id")
    String vnic2Id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second backup VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnic2Id")
    String backupVnic2Id;
    /**
     * The current state of the database node.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        Starting("STARTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
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
     * The current state of the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The host name for the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * The name of the Fault Domain the instance is contained in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    String faultDomain;

    /**
     * The date and time that the database node was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The size (in GB) of the block storage volume allocation for the DB system. This attribute applies only for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
    Integer softwareStorageSizeInGB;
    /**
     * The type of database node maintenance.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MaintenanceType {
        VmdbRebootMigration("VMDB_REBOOT_MIGRATION"),

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
     * The type of database node maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceType")
    MaintenanceType maintenanceType;

    /**
     * Start date and time of maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
    java.util.Date timeMaintenanceWindowStart;

    /**
     * End date and time of maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
    java.util.Date timeMaintenanceWindowEnd;

    /**
     * Additional information about the planned maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    String additionalDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
