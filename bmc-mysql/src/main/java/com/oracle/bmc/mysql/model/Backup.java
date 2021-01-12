/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A full or incremental copy of a DB System which can be used to create a
 * new DB System or recover a DB System.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM
 * policy. If you're not authorized, talk to an administrator. If you're an
 * administrator who needs to write policies to give users access, see
 * [Getting Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Backup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Backup {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("backupType")
        private BackupType backupType;

        public Builder backupType(BackupType backupType) {
            this.backupType = backupType;
            this.__explicitlySet__.add("backupType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationType")
        private CreationType creationType;

        public Builder creationType(CreationType creationType) {
            this.creationType = creationType;
            this.__explicitlySet__.add("creationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSnapshot")
        private DbSystemSnapshot dbSystemSnapshot;

        public Builder dbSystemSnapshot(DbSystemSnapshot dbSystemSnapshot) {
            this.dbSystemSnapshot = dbSystemSnapshot;
            this.__explicitlySet__.add("dbSystemSnapshot");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
        private Integer backupSizeInGBs;

        public Builder backupSizeInGBs(Integer backupSizeInGBs) {
            this.backupSizeInGBs = backupSizeInGBs;
            this.__explicitlySet__.add("backupSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
        private Integer retentionInDays;

        public Builder retentionInDays(Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            this.__explicitlySet__.add("retentionInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Integer dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Integer dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
        private String mysqlVersion;

        public Builder mysqlVersion(String mysqlVersion) {
            this.mysqlVersion = mysqlVersion;
            this.__explicitlySet__.add("mysqlVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Backup build() {
            Backup __instance__ =
                    new Backup(
                            id,
                            displayName,
                            description,
                            compartmentId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            backupType,
                            creationType,
                            dbSystemId,
                            dbSystemSnapshot,
                            backupSizeInGBs,
                            retentionInDays,
                            dataStorageSizeInGBs,
                            mysqlVersion,
                            shapeName,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Backup o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .backupType(o.getBackupType())
                            .creationType(o.getCreationType())
                            .dbSystemId(o.getDbSystemId())
                            .dbSystemSnapshot(o.getDbSystemSnapshot())
                            .backupSizeInGBs(o.getBackupSizeInGBs())
                            .retentionInDays(o.getRetentionInDays())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .mysqlVersion(o.getMysqlVersion())
                            .shapeName(o.getShapeName())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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
     * OCID of the backup itself
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * A user-supplied display name for the backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A user-supplied description for the backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The OCID of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The time the backup record was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time at which the backup was updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;
    /**
     * The state of the backup.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Updating("UPDATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
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
     * The state of the backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;
    /**
     * The type of backup.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BackupType {
        Full("FULL"),
        Incremental("INCREMENTAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BackupType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupType v : BackupType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupType")
    BackupType backupType;
    /**
     * If the backup was created automatically, or by a manual request.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CreationType {
        Manual("MANUAL"),
        Automatic("AUTOMATIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CreationType> map;

        static {
            map = new java.util.HashMap<>();
            for (CreationType v : CreationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * If the backup was created automatically, or by a manual request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creationType")
    CreationType creationType;

    /**
     * The OCID of the DB System the backup is associated with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    String dbSystemId;

    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemSnapshot")
    DbSystemSnapshot dbSystemSnapshot;

    /**
     * The size of the backup in base-2 (IEC) gibibytes. (GiB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupSizeInGBs")
    Integer backupSizeInGBs;

    /**
     * Number of days to retain this backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInDays")
    Integer retentionInDays;

    /**
     * Initial size of the data volume in GiBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Integer dataStorageSizeInGBs;

    /**
     * The MySQL server version of the DB System used for backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mysqlVersion")
    String mysqlVersion;

    /**
     * The shape of the DB System used for backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    String shapeName;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
