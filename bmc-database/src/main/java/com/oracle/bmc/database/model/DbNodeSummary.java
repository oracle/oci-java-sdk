/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * A server where Oracle database software is running.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an administrator. If you're an administrator who needs to write policies to give users access, see [Getting Started with Policies](https://docs.us-phoenix-1.oraclecloud.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbNodeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DbNodeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
        private String backupVnicId;

        public Builder backupVnicId(String backupVnicId) {
            this.backupVnicId = backupVnicId;
            this.__explicitlySet__.add("backupVnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
        private Integer softwareStorageSizeInGB;

        public Builder softwareStorageSizeInGB(Integer softwareStorageSizeInGB) {
            this.softwareStorageSizeInGB = softwareStorageSizeInGB;
            this.__explicitlySet__.add("softwareStorageSizeInGB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
        private String vnicId;

        public Builder vnicId(String vnicId) {
            this.vnicId = vnicId;
            this.__explicitlySet__.add("vnicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbNodeSummary build() {
            DbNodeSummary __instance__ =
                    new DbNodeSummary(
                            backupVnicId,
                            dbSystemId,
                            hostname,
                            id,
                            lifecycleState,
                            softwareStorageSizeInGB,
                            timeCreated,
                            vnicId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbNodeSummary o) {
            return backupVnicId(o.getBackupVnicId())
                    .dbSystemId(o.getDbSystemId())
                    .hostname(o.getHostname())
                    .id(o.getId())
                    .lifecycleState(o.getLifecycleState())
                    .softwareStorageSizeInGB(o.getSoftwareStorageSizeInGB())
                    .timeCreated(o.getTimeCreated())
                    .vnicId(o.getVnicId());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the backup VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupVnicId")
    String backupVnicId;

    /**
     * The OCID of the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    String dbSystemId;

    /**
     * The host name for the DB Node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    String hostname;

    /**
     * The OCID of the DB Node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
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
     * Storage size, in GBs, of the software volume that is allocated to the DB system. This is applicable only for VM-based DBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("softwareStorageSizeInGB")
    Integer softwareStorageSizeInGB;

    /**
     * The date and time that the DB Node was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The OCID of the VNIC.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vnicId")
    String vnicId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
