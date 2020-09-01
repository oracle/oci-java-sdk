/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * An Oracle Database on a bare metal or virtual machine DB system. For more information, see [Bare Metal and Virtual Machine DB Systems](https://docs.cloud.oracle.com/Content/Database/Concepts/overview.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DatabaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
        private String dbHomeId;

        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            this.__explicitlySet__.add("dbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private String dbWorkload;

        public Builder dbWorkload(String dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastBackupTimestamp")
        private java.util.Date lastBackupTimestamp;

        public Builder lastBackupTimestamp(java.util.Date lastBackupTimestamp) {
            this.lastBackupTimestamp = lastBackupTimestamp;
            this.__explicitlySet__.add("lastBackupTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
        private DbBackupConfig dbBackupConfig;

        public Builder dbBackupConfig(DbBackupConfig dbBackupConfig) {
            this.dbBackupConfig = dbBackupConfig;
            this.__explicitlySet__.add("dbBackupConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
        private DatabaseConnectionStrings connectionStrings;

        public Builder connectionStrings(DatabaseConnectionStrings connectionStrings) {
            this.connectionStrings = connectionStrings;
            this.__explicitlySet__.add("connectionStrings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabasePointInTimeRecoveryTimestamp")
        private java.util.Date sourceDatabasePointInTimeRecoveryTimestamp;

        public Builder sourceDatabasePointInTimeRecoveryTimestamp(
                java.util.Date sourceDatabasePointInTimeRecoveryTimestamp) {
            this.sourceDatabasePointInTimeRecoveryTimestamp =
                    sourceDatabasePointInTimeRecoveryTimestamp;
            this.__explicitlySet__.add("sourceDatabasePointInTimeRecoveryTimestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseSummary build() {
            DatabaseSummary __instance__ =
                    new DatabaseSummary(
                            id,
                            compartmentId,
                            characterSet,
                            ncharacterSet,
                            dbHomeId,
                            dbSystemId,
                            vmClusterId,
                            dbName,
                            pdbName,
                            dbWorkload,
                            dbUniqueName,
                            lifecycleDetails,
                            lifecycleState,
                            timeCreated,
                            lastBackupTimestamp,
                            dbBackupConfig,
                            freeformTags,
                            definedTags,
                            connectionStrings,
                            sourceDatabasePointInTimeRecoveryTimestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .characterSet(o.getCharacterSet())
                            .ncharacterSet(o.getNcharacterSet())
                            .dbHomeId(o.getDbHomeId())
                            .dbSystemId(o.getDbSystemId())
                            .vmClusterId(o.getVmClusterId())
                            .dbName(o.getDbName())
                            .pdbName(o.getPdbName())
                            .dbWorkload(o.getDbWorkload())
                            .dbUniqueName(o.getDbUniqueName())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .lastBackupTimestamp(o.getLastBackupTimestamp())
                            .dbBackupConfig(o.getDbBackupConfig())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .connectionStrings(o.getConnectionStrings())
                            .sourceDatabasePointInTimeRecoveryTimestamp(
                                    o.getSourceDatabasePointInTimeRecoveryTimestamp());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The character set for the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    String characterSet;

    /**
     * The national character set for the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    String ncharacterSet;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Database Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    String dbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    String dbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    String vmClusterId;

    /**
     * The database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * The name of the pluggable database. The name must begin with an alphabetic character and can contain a maximum of eight alphanumeric characters. Special characters are not permitted. Pluggable database should not be same as database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    String pdbName;

    /**
     * The database workload type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    String dbWorkload;

    /**
     * A system-generated name for the database to ensure uniqueness within an Oracle Data Guard group (a primary database and its standby databases). The unique name cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    String dbUniqueName;

    /**
     * Additional information about the current lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;
    /**
     * The current state of the database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        RestoreFailed("RESTORE_FAILED"),
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
     * The current state of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time when the latest database backup was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastBackupTimestamp")
    java.util.Date lastBackupTimestamp;

    @com.fasterxml.jackson.annotation.JsonProperty("dbBackupConfig")
    DbBackupConfig dbBackupConfig;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The Connection strings used to connect to the Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionStrings")
    DatabaseConnectionStrings connectionStrings;

    /**
     * Point in time recovery timeStamp of the source database at which cloned database system is cloned from the source database system, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDatabasePointInTimeRecoveryTimestamp")
    java.util.Date sourceDatabasePointInTimeRecoveryTimestamp;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
