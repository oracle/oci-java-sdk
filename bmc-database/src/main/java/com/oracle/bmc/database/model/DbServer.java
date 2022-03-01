/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Exacc Db server resource. Applies to Exadata Cloud@Customer instances only.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DbServer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DbServer {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
        private java.util.List<String> vmClusterIds;

        public Builder vmClusterIds(java.util.List<String> vmClusterIds) {
            this.vmClusterIds = vmClusterIds;
            this.__explicitlySet__.add("vmClusterIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeIds")
        private java.util.List<String> dbNodeIds;

        public Builder dbNodeIds(java.util.List<String> dbNodeIds) {
            this.dbNodeIds = dbNodeIds;
            this.__explicitlySet__.add("dbNodeIds");
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

        @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
        private Integer maxCpuCount;

        public Builder maxCpuCount(Integer maxCpuCount) {
            this.maxCpuCount = maxCpuCount;
            this.__explicitlySet__.add("maxCpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
        private Integer maxMemoryInGBs;

        public Builder maxMemoryInGBs(Integer maxMemoryInGBs) {
            this.maxMemoryInGBs = maxMemoryInGBs;
            this.__explicitlySet__.add("maxMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
        private Integer maxDbNodeStorageInGBs;

        public Builder maxDbNodeStorageInGBs(Integer maxDbNodeStorageInGBs) {
            this.maxDbNodeStorageInGBs = maxDbNodeStorageInGBs;
            this.__explicitlySet__.add("maxDbNodeStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbServerPatchingDetails")
        private DbServerPatchingDetails dbServerPatchingDetails;

        public Builder dbServerPatchingDetails(DbServerPatchingDetails dbServerPatchingDetails) {
            this.dbServerPatchingDetails = dbServerPatchingDetails;
            this.__explicitlySet__.add("dbServerPatchingDetails");
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

        public DbServer build() {
            DbServer __instance__ =
                    new DbServer(
                            id,
                            displayName,
                            compartmentId,
                            exadataInfrastructureId,
                            cpuCoreCount,
                            memorySizeInGBs,
                            dbNodeStorageSizeInGBs,
                            vmClusterIds,
                            dbNodeIds,
                            lifecycleState,
                            lifecycleDetails,
                            maxCpuCount,
                            maxMemoryInGBs,
                            maxDbNodeStorageInGBs,
                            timeCreated,
                            dbServerPatchingDetails,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbServer o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .exadataInfrastructureId(o.getExadataInfrastructureId())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .dbNodeStorageSizeInGBs(o.getDbNodeStorageSizeInGBs())
                            .vmClusterIds(o.getVmClusterIds())
                            .dbNodeIds(o.getDbNodeIds())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .maxCpuCount(o.getMaxCpuCount())
                            .maxMemoryInGBs(o.getMaxMemoryInGBs())
                            .maxDbNodeStorageInGBs(o.getMaxDbNodeStorageInGBs())
                            .timeCreated(o.getTimeCreated())
                            .dbServerPatchingDetails(o.getDbServerPatchingDetails())
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exacc Db server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The user-friendly name for the Db server. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    String exadataInfrastructureId;

    /**
     * The number of CPU cores enabled on the Db server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    Integer cpuCoreCount;

    /**
     * The allocated memory in GBs on the Db server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    Integer memorySizeInGBs;

    /**
     * The allocated local node storage in GBs on the Db server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    Integer dbNodeStorageSizeInGBs;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM Clusters associated with the Db server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterIds")
    java.util.List<String> vmClusterIds;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db nodes associated with the Db server.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeIds")
    java.util.List<String> dbNodeIds;
    /**
     * The current state of the Db server.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Available("AVAILABLE"),
        Unavailable("UNAVAILABLE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),

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
     * The current state of the Db server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The total number of CPU cores available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCpuCount")
    Integer maxCpuCount;

    /**
     * The total memory available in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxMemoryInGBs")
    Integer maxMemoryInGBs;

    /**
     * The total local node storage available in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxDbNodeStorageInGBs")
    Integer maxDbNodeStorageInGBs;

    /**
     * The date and time that the Db Server was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonProperty("dbServerPatchingDetails")
    DbServerPatchingDetails dbServerPatchingDetails;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
