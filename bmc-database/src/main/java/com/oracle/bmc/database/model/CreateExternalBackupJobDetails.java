/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateExternalBackupJobDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateExternalBackupJobDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
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

        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseIdentifier")
        private Long externalDatabaseIdentifier;

        public Builder externalDatabaseIdentifier(Long externalDatabaseIdentifier) {
            this.externalDatabaseIdentifier = externalDatabaseIdentifier;
            this.__explicitlySet__.add("externalDatabaseIdentifier");
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

        @com.fasterxml.jackson.annotation.JsonProperty("databaseMode")
        private DatabaseMode databaseMode;

        public Builder databaseMode(DatabaseMode databaseMode) {
            this.databaseMode = databaseMode;
            this.__explicitlySet__.add("databaseMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalBackupJobDetails build() {
            CreateExternalBackupJobDetails __instance__ =
                    new CreateExternalBackupJobDetails(
                            availabilityDomain,
                            compartmentId,
                            displayName,
                            dbVersion,
                            dbName,
                            dbUniqueName,
                            pdbName,
                            externalDatabaseIdentifier,
                            characterSet,
                            ncharacterSet,
                            databaseMode,
                            databaseEdition);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalBackupJobDetails o) {
            Builder copiedBuilder =
                    availabilityDomain(o.getAvailabilityDomain())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .dbVersion(o.getDbVersion())
                            .dbName(o.getDbName())
                            .dbUniqueName(o.getDbUniqueName())
                            .pdbName(o.getPdbName())
                            .externalDatabaseIdentifier(o.getExternalDatabaseIdentifier())
                            .characterSet(o.getCharacterSet())
                            .ncharacterSet(o.getNcharacterSet())
                            .databaseMode(o.getDatabaseMode())
                            .databaseEdition(o.getDatabaseEdition());

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
     * The targeted availability domain for the backup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    String availabilityDomain;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment where this backup should be created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A user-friendly name for the backup. This name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * A valid Oracle Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    String dbVersion;

    /**
     * The name of the database from which the backup is being taken.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    String dbName;

    /**
     * The `DB_UNIQUE_NAME` of the Oracle Database being backed up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    String dbUniqueName;

    /**
     * The pluggable database name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    String pdbName;

    /**
     * The `DBID` of the Oracle Database being backed up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseIdentifier")
    Long externalDatabaseIdentifier;

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
     * The mode (single instance or RAC) of the database being backed up.
     **/
    public enum DatabaseMode {
        Si("SI"),
        Rac("RAC"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseMode v : DatabaseMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        DatabaseMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DatabaseMode: " + key);
        }
    };
    /**
     * The mode (single instance or RAC) of the database being backed up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseMode")
    DatabaseMode databaseMode;
    /**
     * The Oracle Database edition to use for creating a database from this standalone backup.
     * Note that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
     *
     **/
    public enum DatabaseEdition {
        StandardEdition("STANDARD_EDITION"),
        EnterpriseEdition("ENTERPRISE_EDITION"),
        EnterpriseEditionHighPerformance("ENTERPRISE_EDITION_HIGH_PERFORMANCE"),
        EnterpriseEditionExtremePerformance("ENTERPRISE_EDITION_EXTREME_PERFORMANCE"),
        ;

        private final String value;
        private static java.util.Map<String, DatabaseEdition> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseEdition v : DatabaseEdition.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DatabaseEdition: " + key);
        }
    };
    /**
     * The Oracle Database edition to use for creating a database from this standalone backup.
     * Note that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    DatabaseEdition databaseEdition;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
