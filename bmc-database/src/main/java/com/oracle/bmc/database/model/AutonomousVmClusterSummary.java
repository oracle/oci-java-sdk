/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of the Autonomous VM cluster.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousVmClusterSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousVmClusterSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
        private String exadataInfrastructureId;

        public Builder exadataInfrastructureId(String exadataInfrastructureId) {
            this.exadataInfrastructureId = exadataInfrastructureId;
            this.__explicitlySet__.add("exadataInfrastructureId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
        private String vmClusterNetworkId;

        public Builder vmClusterNetworkId(String vmClusterNetworkId) {
            this.vmClusterNetworkId = vmClusterNetworkId;
            this.__explicitlySet__.add("vmClusterNetworkId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
        private Boolean isLocalBackupEnabled;

        public Builder isLocalBackupEnabled(Boolean isLocalBackupEnabled) {
            this.isLocalBackupEnabled = isLocalBackupEnabled;
            this.__explicitlySet__.add("isLocalBackupEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpusEnabled")
        private Float ocpusEnabled;

        public Builder ocpusEnabled(Float ocpusEnabled) {
            this.ocpusEnabled = ocpusEnabled;
            this.__explicitlySet__.add("ocpusEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
        private Integer availableCpus;

        public Builder availableCpus(Integer availableCpus) {
            this.availableCpus = availableCpus;
            this.__explicitlySet__.add("availableCpus");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
        private Double dataStorageSizeInTBs;

        public Builder dataStorageSizeInTBs(Double dataStorageSizeInTBs) {
            this.dataStorageSizeInTBs = dataStorageSizeInTBs;
            this.__explicitlySet__.add("dataStorageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Double dataStorageSizeInGBs;

        public Builder dataStorageSizeInGBs(Double dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageSizeInTBs")
        private Double availableDataStorageSizeInTBs;

        public Builder availableDataStorageSizeInTBs(Double availableDataStorageSizeInTBs) {
            this.availableDataStorageSizeInTBs = availableDataStorageSizeInTBs;
            this.__explicitlySet__.add("availableDataStorageSizeInTBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
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

        public AutonomousVmClusterSummary build() {
            AutonomousVmClusterSummary __instance__ =
                    new AutonomousVmClusterSummary(
                            id,
                            compartmentId,
                            displayName,
                            timeCreated,
                            lifecycleState,
                            lifecycleDetails,
                            timeZone,
                            exadataInfrastructureId,
                            vmClusterNetworkId,
                            isLocalBackupEnabled,
                            cpusEnabled,
                            ocpusEnabled,
                            availableCpus,
                            memorySizeInGBs,
                            dbNodeStorageSizeInGBs,
                            dataStorageSizeInTBs,
                            dataStorageSizeInGBs,
                            availableDataStorageSizeInTBs,
                            licenseModel,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousVmClusterSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeZone(o.getTimeZone())
                            .exadataInfrastructureId(o.getExadataInfrastructureId())
                            .vmClusterNetworkId(o.getVmClusterNetworkId())
                            .isLocalBackupEnabled(o.getIsLocalBackupEnabled())
                            .cpusEnabled(o.getCpusEnabled())
                            .ocpusEnabled(o.getOcpusEnabled())
                            .availableCpus(o.getAvailableCpus())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .dbNodeStorageSizeInGBs(o.getDbNodeStorageSizeInGBs())
                            .dataStorageSizeInTBs(o.getDataStorageSizeInTBs())
                            .dataStorageSizeInGBs(o.getDataStorageSizeInGBs())
                            .availableDataStorageSizeInTBs(o.getAvailableDataStorageSizeInTBs())
                            .licenseModel(o.getLicenseModel())
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user-friendly name for the Autonomous VM cluster. The name does not need to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The date and time that the Autonomous VM cluster was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The current state of the Autonomous VM cluster.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
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
     * The current state of the Autonomous VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The time zone to use for the Autonomous VM cluster. For details, see [DB System Time Zones](https://docs.cloud.oracle.com/Content/Database/References/timezones.htm).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    String timeZone;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata infrastructure.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInfrastructureId")
    String exadataInfrastructureId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VM cluster network.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterNetworkId")
    String vmClusterNetworkId;

    /**
     * If true, database backup on local Exadata storage is configured for the Autonomous VM cluster. If false, database backup on local Exadata storage is not available in the Autonomous VM cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLocalBackupEnabled")
    Boolean isLocalBackupEnabled;

    /**
     * The number of enabled CPU cores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    Integer cpusEnabled;

    /**
     * The number of enabled OCPU cores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpusEnabled")
    Float ocpusEnabled;

    /**
     * The numnber of CPU cores available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableCpus")
    Integer availableCpus;

    /**
     * The memory allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    Integer memorySizeInGBs;

    /**
     * The local node storage allocated in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeStorageSizeInGBs")
    Integer dbNodeStorageSizeInGBs;

    /**
     * The total data storage allocated in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInTBs")
    Double dataStorageSizeInTBs;

    /**
     * The total data storage allocated in GBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    Double dataStorageSizeInGBs;

    /**
     * The data storage available in TBs
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableDataStorageSizeInTBs")
    Double availableDataStorageSizeInTBs;
    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is LICENSE_INCLUDED.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LicenseModel {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle license model that applies to the Autonomous VM cluster. The default is LICENSE_INCLUDED.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    LicenseModel licenseModel;

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
