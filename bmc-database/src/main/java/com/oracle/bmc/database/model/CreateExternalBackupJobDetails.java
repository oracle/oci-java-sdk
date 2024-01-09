/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateExternalBackupJobDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExternalBackupJobDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "compartmentId",
        "displayName",
        "dbVersion",
        "dbName",
        "dbUniqueName",
        "pdbName",
        "externalDatabaseIdentifier",
        "characterSet",
        "ncharacterSet",
        "databaseMode",
        "databaseEdition"
    })
    public CreateExternalBackupJobDetails(
            String availabilityDomain,
            String compartmentId,
            String displayName,
            String dbVersion,
            String dbName,
            String dbUniqueName,
            String pdbName,
            Long externalDatabaseIdentifier,
            String characterSet,
            String ncharacterSet,
            DatabaseMode databaseMode,
            DatabaseEdition databaseEdition) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.dbVersion = dbVersion;
        this.dbName = dbName;
        this.dbUniqueName = dbUniqueName;
        this.pdbName = pdbName;
        this.externalDatabaseIdentifier = externalDatabaseIdentifier;
        this.characterSet = characterSet;
        this.ncharacterSet = ncharacterSet;
        this.databaseMode = databaseMode;
        this.databaseEdition = databaseEdition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The targeted availability domain for the backup. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The targeted availability domain for the backup.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where this backup should be created.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment where this backup should be created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A user-friendly name for the backup. This name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the backup. This name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A valid Oracle Database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * A valid Oracle Database version.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /** The name of the database from which the backup is being taken. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbName")
        private String dbName;

        /**
         * The name of the database from which the backup is being taken.
         *
         * @param dbName the value to set
         * @return this builder
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            this.__explicitlySet__.add("dbName");
            return this;
        }
        /** The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
        private String dbUniqueName;

        /**
         * The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up.
         *
         * @param dbUniqueName the value to set
         * @return this builder
         */
        public Builder dbUniqueName(String dbUniqueName) {
            this.dbUniqueName = dbUniqueName;
            this.__explicitlySet__.add("dbUniqueName");
            return this;
        }
        /** The pluggable database name. */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
        private String pdbName;

        /**
         * The pluggable database name.
         *
         * @param pdbName the value to set
         * @return this builder
         */
        public Builder pdbName(String pdbName) {
            this.pdbName = pdbName;
            this.__explicitlySet__.add("pdbName");
            return this;
        }
        /** The {@code DBID} of the Oracle Database being backed up. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseIdentifier")
        private Long externalDatabaseIdentifier;

        /**
         * The {@code DBID} of the Oracle Database being backed up.
         *
         * @param externalDatabaseIdentifier the value to set
         * @return this builder
         */
        public Builder externalDatabaseIdentifier(Long externalDatabaseIdentifier) {
            this.externalDatabaseIdentifier = externalDatabaseIdentifier;
            this.__explicitlySet__.add("externalDatabaseIdentifier");
            return this;
        }
        /** The character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
        private String characterSet;

        /**
         * The character set for the database.
         *
         * @param characterSet the value to set
         * @return this builder
         */
        public Builder characterSet(String characterSet) {
            this.characterSet = characterSet;
            this.__explicitlySet__.add("characterSet");
            return this;
        }
        /** The national character set for the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
        private String ncharacterSet;

        /**
         * The national character set for the database.
         *
         * @param ncharacterSet the value to set
         * @return this builder
         */
        public Builder ncharacterSet(String ncharacterSet) {
            this.ncharacterSet = ncharacterSet;
            this.__explicitlySet__.add("ncharacterSet");
            return this;
        }
        /** The mode (single instance or RAC) of the database being backed up. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseMode")
        private DatabaseMode databaseMode;

        /**
         * The mode (single instance or RAC) of the database being backed up.
         *
         * @param databaseMode the value to set
         * @return this builder
         */
        public Builder databaseMode(DatabaseMode databaseMode) {
            this.databaseMode = databaseMode;
            this.__explicitlySet__.add("databaseMode");
            return this;
        }
        /**
         * The Oracle Database edition to use for creating a database from this standalone backup.
         * Note that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
        private DatabaseEdition databaseEdition;

        /**
         * The Oracle Database edition to use for creating a database from this standalone backup.
         * Note that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
         *
         * @param databaseEdition the value to set
         * @return this builder
         */
        public Builder databaseEdition(DatabaseEdition databaseEdition) {
            this.databaseEdition = databaseEdition;
            this.__explicitlySet__.add("databaseEdition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalBackupJobDetails build() {
            CreateExternalBackupJobDetails model =
                    new CreateExternalBackupJobDetails(
                            this.availabilityDomain,
                            this.compartmentId,
                            this.displayName,
                            this.dbVersion,
                            this.dbName,
                            this.dbUniqueName,
                            this.pdbName,
                            this.externalDatabaseIdentifier,
                            this.characterSet,
                            this.ncharacterSet,
                            this.databaseMode,
                            this.databaseEdition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalBackupJobDetails model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("dbName")) {
                this.dbName(model.getDbName());
            }
            if (model.wasPropertyExplicitlySet("dbUniqueName")) {
                this.dbUniqueName(model.getDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("pdbName")) {
                this.pdbName(model.getPdbName());
            }
            if (model.wasPropertyExplicitlySet("externalDatabaseIdentifier")) {
                this.externalDatabaseIdentifier(model.getExternalDatabaseIdentifier());
            }
            if (model.wasPropertyExplicitlySet("characterSet")) {
                this.characterSet(model.getCharacterSet());
            }
            if (model.wasPropertyExplicitlySet("ncharacterSet")) {
                this.ncharacterSet(model.getNcharacterSet());
            }
            if (model.wasPropertyExplicitlySet("databaseMode")) {
                this.databaseMode(model.getDatabaseMode());
            }
            if (model.wasPropertyExplicitlySet("databaseEdition")) {
                this.databaseEdition(model.getDatabaseEdition());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The targeted availability domain for the backup. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The targeted availability domain for the backup.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where this backup should be created.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment where this backup should be created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A user-friendly name for the backup. This name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the backup. This name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A valid Oracle Database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * A valid Oracle Database version.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /** The name of the database from which the backup is being taken. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbName")
    private final String dbName;

    /**
     * The name of the database from which the backup is being taken.
     *
     * @return the value
     */
    public String getDbName() {
        return dbName;
    }

    /** The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUniqueName")
    private final String dbUniqueName;

    /**
     * The {@code DB_UNIQUE_NAME} of the Oracle Database being backed up.
     *
     * @return the value
     */
    public String getDbUniqueName() {
        return dbUniqueName;
    }

    /** The pluggable database name. */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbName")
    private final String pdbName;

    /**
     * The pluggable database name.
     *
     * @return the value
     */
    public String getPdbName() {
        return pdbName;
    }

    /** The {@code DBID} of the Oracle Database being backed up. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalDatabaseIdentifier")
    private final Long externalDatabaseIdentifier;

    /**
     * The {@code DBID} of the Oracle Database being backed up.
     *
     * @return the value
     */
    public Long getExternalDatabaseIdentifier() {
        return externalDatabaseIdentifier;
    }

    /** The character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("characterSet")
    private final String characterSet;

    /**
     * The character set for the database.
     *
     * @return the value
     */
    public String getCharacterSet() {
        return characterSet;
    }

    /** The national character set for the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("ncharacterSet")
    private final String ncharacterSet;

    /**
     * The national character set for the database.
     *
     * @return the value
     */
    public String getNcharacterSet() {
        return ncharacterSet;
    }

    /** The mode (single instance or RAC) of the database being backed up. */
    public enum DatabaseMode implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** The mode (single instance or RAC) of the database being backed up. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseMode")
    private final DatabaseMode databaseMode;

    /**
     * The mode (single instance or RAC) of the database being backed up.
     *
     * @return the value
     */
    public DatabaseMode getDatabaseMode() {
        return databaseMode;
    }

    /**
     * The Oracle Database edition to use for creating a database from this standalone backup. Note
     * that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
     */
    public enum DatabaseEdition implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The Oracle Database edition to use for creating a database from this standalone backup. Note
     * that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseEdition")
    private final DatabaseEdition databaseEdition;

    /**
     * The Oracle Database edition to use for creating a database from this standalone backup. Note
     * that 2-node RAC DB systems require Enterprise Edition - Extreme Performance.
     *
     * @return the value
     */
    public DatabaseEdition getDatabaseEdition() {
        return databaseEdition;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateExternalBackupJobDetails(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", dbName=").append(String.valueOf(this.dbName));
        sb.append(", dbUniqueName=").append(String.valueOf(this.dbUniqueName));
        sb.append(", pdbName=").append(String.valueOf(this.pdbName));
        sb.append(", externalDatabaseIdentifier=")
                .append(String.valueOf(this.externalDatabaseIdentifier));
        sb.append(", characterSet=").append(String.valueOf(this.characterSet));
        sb.append(", ncharacterSet=").append(String.valueOf(this.ncharacterSet));
        sb.append(", databaseMode=").append(String.valueOf(this.databaseMode));
        sb.append(", databaseEdition=").append(String.valueOf(this.databaseEdition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalBackupJobDetails)) {
            return false;
        }

        CreateExternalBackupJobDetails other = (CreateExternalBackupJobDetails) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.dbName, other.dbName)
                && java.util.Objects.equals(this.dbUniqueName, other.dbUniqueName)
                && java.util.Objects.equals(this.pdbName, other.pdbName)
                && java.util.Objects.equals(
                        this.externalDatabaseIdentifier, other.externalDatabaseIdentifier)
                && java.util.Objects.equals(this.characterSet, other.characterSet)
                && java.util.Objects.equals(this.ncharacterSet, other.ncharacterSet)
                && java.util.Objects.equals(this.databaseMode, other.databaseMode)
                && java.util.Objects.equals(this.databaseEdition, other.databaseEdition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result = (result * PRIME) + (this.dbName == null ? 43 : this.dbName.hashCode());
        result = (result * PRIME) + (this.dbUniqueName == null ? 43 : this.dbUniqueName.hashCode());
        result = (result * PRIME) + (this.pdbName == null ? 43 : this.pdbName.hashCode());
        result =
                (result * PRIME)
                        + (this.externalDatabaseIdentifier == null
                                ? 43
                                : this.externalDatabaseIdentifier.hashCode());
        result = (result * PRIME) + (this.characterSet == null ? 43 : this.characterSet.hashCode());
        result =
                (result * PRIME)
                        + (this.ncharacterSet == null ? 43 : this.ncharacterSet.hashCode());
        result = (result * PRIME) + (this.databaseMode == null ? 43 : this.databaseMode.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseEdition == null ? 43 : this.databaseEdition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
