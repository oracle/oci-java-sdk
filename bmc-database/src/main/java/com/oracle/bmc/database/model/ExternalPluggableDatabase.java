/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * an external Oracle pluggable database.
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
    builder = ExternalPluggableDatabase.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExternalPluggableDatabase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalContainerDatabaseId")
        private String externalContainerDatabaseId;

        public Builder externalContainerDatabaseId(String externalContainerDatabaseId) {
            this.externalContainerDatabaseId = externalContainerDatabaseId;
            this.__explicitlySet__.add("externalContainerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsConfig")
        private OperationsInsightsConfig operationsInsightsConfig;

        public Builder operationsInsightsConfig(OperationsInsightsConfig operationsInsightsConfig) {
            this.operationsInsightsConfig = operationsInsightsConfig;
            this.__explicitlySet__.add("operationsInsightsConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbId")
        private String dbId;

        public Builder dbId(String dbId) {
            this.dbId = dbId;
            this.__explicitlySet__.add("dbId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
        private String databaseVersion;

        public Builder databaseVersion(String databaseVersion) {
            this.databaseVersion = databaseVersion;
            this.__explicitlySet__.add("databaseVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbPacks")
        private String dbPacks;

        public Builder dbPacks(String dbPacks) {
            this.dbPacks = dbPacks;
            this.__explicitlySet__.add("dbPacks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseConfiguration")
        private DatabaseConfiguration databaseConfiguration;

        public Builder databaseConfiguration(DatabaseConfiguration databaseConfiguration) {
            this.databaseConfiguration = databaseConfiguration;
            this.__explicitlySet__.add("databaseConfiguration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
        private DatabaseManagementConfig databaseManagementConfig;

        public Builder databaseManagementConfig(DatabaseManagementConfig databaseManagementConfig) {
            this.databaseManagementConfig = databaseManagementConfig;
            this.__explicitlySet__.add("databaseManagementConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalPluggableDatabase build() {
            ExternalPluggableDatabase __instance__ =
                    new ExternalPluggableDatabase(
                            sourceId,
                            externalContainerDatabaseId,
                            operationsInsightsConfig,
                            compartmentId,
                            freeformTags,
                            definedTags,
                            displayName,
                            id,
                            lifecycleDetails,
                            lifecycleState,
                            timeCreated,
                            dbUniqueName,
                            dbId,
                            databaseVersion,
                            databaseEdition,
                            timeZone,
                            characterSet,
                            ncharacterSet,
                            dbPacks,
                            databaseConfiguration,
                            databaseManagementConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalPluggableDatabase o) {
            Builder copiedBuilder =
                    sourceId(o.getSourceId())
                            .externalContainerDatabaseId(o.getExternalContainerDatabaseId())
                            .operationsInsightsConfig(o.getOperationsInsightsConfig())
                            .compartmentId(o.getCompartmentId())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .id(o.getId())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .dbUniqueName(o.getDbUniqueName())
                            .dbId(o.getDbId())
                            .databaseVersion(o.getDatabaseVersion())
                            .databaseEdition(o.getDatabaseEdition())
                            .timeZone(o.getTimeZone())
                            .characterSet(o.getCharacterSet())
                            .ncharacterSet(o.getNcharacterSet())
                            .dbPacks(o.getDbPacks())
                            .databaseConfiguration(o.getDatabaseConfiguration())
                            .databaseManagementConfig(o.getDatabaseManagementConfig());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the the non-container database that was converted
     * to a pluggable database to create this resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalContainerDatabaseDetails(CreateExternalContainerDatabaseDetailsRequest) createExternalContainerDatabaseDetails} that contains
     * the specified {@link #createExternalPluggableDatabaseDetails(CreateExternalPluggableDatabaseDetailsRequest) createExternalPluggableDatabaseDetails} resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalContainerDatabaseId")
    String externalContainerDatabaseId;

    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsConfig")
    OperationsInsightsConfig operationsInsightsConfig;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

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

    /**
     * The user-friendly name for the external database. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure external database resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Additional information about the current lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;
    /**
     * The current state of the Oracle Cloud Infrastructure external database resource.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        NotConnected("NOT_CONNECTED"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
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
     * The current state of the Oracle Cloud Infrastructure external database resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The date and time the database was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The {@code DB_UNIQUE_NAME} of the external database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    String dbUniqueName;

    /**
     * The Oracle Database ID, which identifies an Oracle Database located outside of Oracle Cloud.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbId")
    String dbId;

    /**
     * The Oracle Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseVersion")
    String databaseVersion;
    /**
     * The Oracle Database edition.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DatabaseEdition {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseEdition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseEdition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseEdition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle Database edition.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    DatabaseEdition databaseEdition;

    /**
     * The time zone of the external database.
     * It is a time zone offset (a character type in the format '[+|-]TZH:TZM') or a time zone region name,
     * depending on how the time zone value was specified when the database was created / last altered.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    String timeZone;

    /**
     * The character set of the external database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    String characterSet;

    /**
     * The national character of the external database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    String ncharacterSet;

    /**
     * The database packs licensed for the external Oracle Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbPacks")
    String dbPacks;
    /**
     * The Oracle Database configuration
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DatabaseConfiguration {
        Rac("RAC"),
        SingleInstance("SINGLE_INSTANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DatabaseConfiguration> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseConfiguration v : DatabaseConfiguration.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseConfiguration(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseConfiguration create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseConfiguration', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Oracle Database configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseConfiguration")
    DatabaseConfiguration databaseConfiguration;

    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
    DatabaseManagementConfig databaseManagementConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
