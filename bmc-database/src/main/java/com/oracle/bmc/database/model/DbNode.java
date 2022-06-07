/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbNode {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "dbSystemId",
        "vnicId",
        "backupVnicId",
        "hostIpId",
        "backupIpId",
        "vnic2Id",
        "backupVnic2Id",
        "lifecycleState",
        "hostname",
        "faultDomain",
        "timeCreated",
        "softwareStorageSizeInGB",
        "maintenanceType",
        "timeMaintenanceWindowStart",
        "timeMaintenanceWindowEnd",
        "additionalDetails",
        "cpuCoreCount",
        "memorySizeInGBs",
        "dbNodeStorageSizeInGBs",
        "dbServerId"
    })
    public DbNode(
            String id,
            String dbSystemId,
            String vnicId,
            String backupVnicId,
            String hostIpId,
            String backupIpId,
            String vnic2Id,
            String backupVnic2Id,
            LifecycleState lifecycleState,
            String hostname,
            String faultDomain,
            java.util.Date timeCreated,
            Integer softwareStorageSizeInGB,
            MaintenanceType maintenanceType,
            java.util.Date timeMaintenanceWindowStart,
            java.util.Date timeMaintenanceWindowEnd,
            String additionalDetails,
            Integer cpuCoreCount,
            Integer memorySizeInGBs,
            Integer dbNodeStorageSizeInGBs,
            String dbServerId) {
        super();
        this.id = id;
        this.dbSystemId = dbSystemId;
        this.vnicId = vnicId;
        this.backupVnicId = backupVnicId;
        this.hostIpId = hostIpId;
        this.backupIpId = backupIpId;
        this.vnic2Id = vnic2Id;
        this.backupVnic2Id = backupVnic2Id;
        this.lifecycleState = lifecycleState;
        this.hostname = hostname;
        this.faultDomain = faultDomain;
        this.timeCreated = timeCreated;
        this.softwareStorageSizeInGB = softwareStorageSizeInGB;
        this.maintenanceType = maintenanceType;
        this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
        this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
        this.additionalDetails = additionalDetails;
        this.cpuCoreCount = cpuCoreCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
        this.dbServerId = dbServerId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
        private Integer dbNodeStorageSizeInGBs;

        public Builder dbNodeStorageSizeInGBs(Integer dbNodeStorageSizeInGBs) {
            this.dbNodeStorageSizeInGBs = dbNodeStorageSizeInGBs;
            this.__explicitlySet__.add("dbNodeStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
        private String dbServerId;

        public Builder dbServerId(String dbServerId) {
            this.dbServerId = dbServerId;
            this.__explicitlySet__.add("dbServerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbNode build() {
            DbNode __instance__ =
                    new DbNode(
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
                            additionalDetails,
                            cpuCoreCount,
                            memorySizeInGBs,
                            dbNodeStorageSizeInGBs,
                            dbServerId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbNode o) {
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
                            .additionalDetails(o.getAdditionalDetails())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .dbNodeStorageSizeInGBs(o.getDbNodeStorageSizeInGBs())
                            .dbServerId(o.getDbServerId());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    private final String vnicId;

    public String getVnicId() {
        return vnicId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
    private final String backupVnicId;

    public String getBackupVnicId() {
        return backupVnicId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the host IP address associated with the database node. Use this OCID with either the
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
     * needed to make a database connection.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostIpId")
    private final String hostIpId;

    public String getHostIpId() {
        return hostIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the backup IP address associated with the database node. Use this OCID with either the
     * {@link #getPrivateIp(GetPrivateIpRequest) getPrivateIp} or the {@link #getPublicIpByPrivateIpId(GetPublicIpByPrivateIpIdRequest) getPublicIpByPrivateIpId} API to get the IP address
     * needed to make a database connection.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupIpId")
    private final String backupIpId;

    public String getBackupIpId() {
        return backupIpId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnic2Id")
    private final String vnic2Id;

    public String getVnic2Id() {
        return vnic2Id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the second backup VNIC.
     * <p>
     **Note:** Applies only to Exadata Cloud Service.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnic2Id")
    private final String backupVnic2Id;

    public String getBackupVnic2Id() {
        return backupVnic2Id;
    }

    /**
     * The current state of the database node.
     **/
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
     * The current state of the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The host name for the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    public String getHostname() {
        return hostname;
    }

    /**
     * The name of the Fault Domain the instance is contained in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The date and time that the database node was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The size (in GB) of the block storage volume allocation for the DB system. This attribute applies only for virtual machine DB systems.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
    private final Integer softwareStorageSizeInGB;

    public Integer getSoftwareStorageSizeInGB() {
        return softwareStorageSizeInGB;
    }

    /**
     * The type of database node maintenance.
     **/
    public enum MaintenanceType {
        VmdbRebootMigration("VMDB_REBOOT_MIGRATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MaintenanceType.class);

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
    private final MaintenanceType maintenanceType;

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    /**
     * Start date and time of maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
    private final java.util.Date timeMaintenanceWindowStart;

    public java.util.Date getTimeMaintenanceWindowStart() {
        return timeMaintenanceWindowStart;
    }

    /**
     * End date and time of maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
    private final java.util.Date timeMaintenanceWindowEnd;

    public java.util.Date getTimeMaintenanceWindowEnd() {
        return timeMaintenanceWindowEnd;
    }

    /**
     * Additional information about the planned maintenance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final String additionalDetails;

    public String getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * The number of CPU cores enabled on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The allocated memory in GBs on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     * The allocated local node storage in GBs on the Db node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    private final Integer dbNodeStorageSizeInGBs;

    public Integer getDbNodeStorageSizeInGBs() {
        return dbNodeStorageSizeInGBs;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exacc Db server associated with the database node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServerId")
    private final String dbServerId;

    public String getDbServerId() {
        return dbServerId;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DbNode(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", vnicId=").append(String.valueOf(this.vnicId));
        sb.append(", backupVnicId=").append(String.valueOf(this.backupVnicId));
        sb.append(", hostIpId=").append(String.valueOf(this.hostIpId));
        sb.append(", backupIpId=").append(String.valueOf(this.backupIpId));
        sb.append(", vnic2Id=").append(String.valueOf(this.vnic2Id));
        sb.append(", backupVnic2Id=").append(String.valueOf(this.backupVnic2Id));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", softwareStorageSizeInGB=")
                .append(String.valueOf(this.softwareStorageSizeInGB));
        sb.append(", maintenanceType=").append(String.valueOf(this.maintenanceType));
        sb.append(", timeMaintenanceWindowStart=")
                .append(String.valueOf(this.timeMaintenanceWindowStart));
        sb.append(", timeMaintenanceWindowEnd=")
                .append(String.valueOf(this.timeMaintenanceWindowEnd));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", dbNodeStorageSizeInGBs=").append(String.valueOf(this.dbNodeStorageSizeInGBs));
        sb.append(", dbServerId=").append(String.valueOf(this.dbServerId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbNode)) {
            return false;
        }

        DbNode other = (DbNode) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.vnicId, other.vnicId)
                && java.util.Objects.equals(this.backupVnicId, other.backupVnicId)
                && java.util.Objects.equals(this.hostIpId, other.hostIpId)
                && java.util.Objects.equals(this.backupIpId, other.backupIpId)
                && java.util.Objects.equals(this.vnic2Id, other.vnic2Id)
                && java.util.Objects.equals(this.backupVnic2Id, other.backupVnic2Id)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.softwareStorageSizeInGB, other.softwareStorageSizeInGB)
                && java.util.Objects.equals(this.maintenanceType, other.maintenanceType)
                && java.util.Objects.equals(
                        this.timeMaintenanceWindowStart, other.timeMaintenanceWindowStart)
                && java.util.Objects.equals(
                        this.timeMaintenanceWindowEnd, other.timeMaintenanceWindowEnd)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(
                        this.dbNodeStorageSizeInGBs, other.dbNodeStorageSizeInGBs)
                && java.util.Objects.equals(this.dbServerId, other.dbServerId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.vnicId == null ? 43 : this.vnicId.hashCode());
        result = (result * PRIME) + (this.backupVnicId == null ? 43 : this.backupVnicId.hashCode());
        result = (result * PRIME) + (this.hostIpId == null ? 43 : this.hostIpId.hashCode());
        result = (result * PRIME) + (this.backupIpId == null ? 43 : this.backupIpId.hashCode());
        result = (result * PRIME) + (this.vnic2Id == null ? 43 : this.vnic2Id.hashCode());
        result =
                (result * PRIME)
                        + (this.backupVnic2Id == null ? 43 : this.backupVnic2Id.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareStorageSizeInGB == null
                                ? 43
                                : this.softwareStorageSizeInGB.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceType == null ? 43 : this.maintenanceType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowStart == null
                                ? 43
                                : this.timeMaintenanceWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowEnd == null
                                ? 43
                                : this.timeMaintenanceWindowEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dbNodeStorageSizeInGBs == null
                                ? 43
                                : this.dbNodeStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.dbServerId == null ? 43 : this.dbServerId.hashCode());
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
