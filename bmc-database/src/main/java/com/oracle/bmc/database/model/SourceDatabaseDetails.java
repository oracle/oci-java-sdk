/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Source Autonomous AI Database details. <br>
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
        builder = SourceDatabaseDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SourceDatabaseDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "autonomousVmClusterDisplayName",
        "autonomousContainerDatabaseName",
        "autonomousContainerDatabaseDisplayName",
        "autonomousContainerDatabaseCustomerContacts",
        "autonomousContainerDatabaseDstFileVersion",
        "autonomousDatabaseName",
        "autonomousDatabaseCustomerContacts",
        "dbWorkload"
    })
    public SourceDatabaseDetails(
            String autonomousVmClusterDisplayName,
            String autonomousContainerDatabaseName,
            String autonomousContainerDatabaseDisplayName,
            java.util.List<CustomerContact> autonomousContainerDatabaseCustomerContacts,
            String autonomousContainerDatabaseDstFileVersion,
            String autonomousDatabaseName,
            java.util.List<CustomerContact> autonomousDatabaseCustomerContacts,
            DbWorkload dbWorkload) {
        super();
        this.autonomousVmClusterDisplayName = autonomousVmClusterDisplayName;
        this.autonomousContainerDatabaseName = autonomousContainerDatabaseName;
        this.autonomousContainerDatabaseDisplayName = autonomousContainerDatabaseDisplayName;
        this.autonomousContainerDatabaseCustomerContacts =
                autonomousContainerDatabaseCustomerContacts;
        this.autonomousContainerDatabaseDstFileVersion = autonomousContainerDatabaseDstFileVersion;
        this.autonomousDatabaseName = autonomousDatabaseName;
        this.autonomousDatabaseCustomerContacts = autonomousDatabaseCustomerContacts;
        this.dbWorkload = dbWorkload;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Autonomous VM cluster's user-friendly name. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterDisplayName")
        private String autonomousVmClusterDisplayName;

        /**
         * Autonomous VM cluster's user-friendly name.
         *
         * @param autonomousVmClusterDisplayName the value to set
         * @return this builder
         */
        public Builder autonomousVmClusterDisplayName(String autonomousVmClusterDisplayName) {
            this.autonomousVmClusterDisplayName = autonomousVmClusterDisplayName;
            this.__explicitlySet__.add("autonomousVmClusterDisplayName");
            return this;
        }
        /** Autonomous Container Database name. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseName")
        private String autonomousContainerDatabaseName;

        /**
         * Autonomous Container Database name.
         *
         * @param autonomousContainerDatabaseName the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseName(String autonomousContainerDatabaseName) {
            this.autonomousContainerDatabaseName = autonomousContainerDatabaseName;
            this.__explicitlySet__.add("autonomousContainerDatabaseName");
            return this;
        }
        /** The user-provided name for the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseDisplayName")
        private String autonomousContainerDatabaseDisplayName;

        /**
         * The user-provided name for the Autonomous Container Database.
         *
         * @param autonomousContainerDatabaseDisplayName the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseDisplayName(
                String autonomousContainerDatabaseDisplayName) {
            this.autonomousContainerDatabaseDisplayName = autonomousContainerDatabaseDisplayName;
            this.__explicitlySet__.add("autonomousContainerDatabaseDisplayName");
            return this;
        }
        /**
         * Customer Contacts for the Autonomous Container Database. Setting this to an empty list
         * removes all customer contacts.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "autonomousContainerDatabaseCustomerContacts")
        private java.util.List<CustomerContact> autonomousContainerDatabaseCustomerContacts;

        /**
         * Customer Contacts for the Autonomous Container Database. Setting this to an empty list
         * removes all customer contacts.
         *
         * @param autonomousContainerDatabaseCustomerContacts the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseCustomerContacts(
                java.util.List<CustomerContact> autonomousContainerDatabaseCustomerContacts) {
            this.autonomousContainerDatabaseCustomerContacts =
                    autonomousContainerDatabaseCustomerContacts;
            this.__explicitlySet__.add("autonomousContainerDatabaseCustomerContacts");
            return this;
        }
        /** DST Time-Zone File version of the Autonomous Container Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseDstFileVersion")
        private String autonomousContainerDatabaseDstFileVersion;

        /**
         * DST Time-Zone File version of the Autonomous Container Database.
         *
         * @param autonomousContainerDatabaseDstFileVersion the value to set
         * @return this builder
         */
        public Builder autonomousContainerDatabaseDstFileVersion(
                String autonomousContainerDatabaseDstFileVersion) {
            this.autonomousContainerDatabaseDstFileVersion =
                    autonomousContainerDatabaseDstFileVersion;
            this.__explicitlySet__.add("autonomousContainerDatabaseDstFileVersion");
            return this;
        }
        /** Autonomous AI Database's name. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseName")
        private String autonomousDatabaseName;

        /**
         * Autonomous AI Database's name.
         *
         * @param autonomousDatabaseName the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseName(String autonomousDatabaseName) {
            this.autonomousDatabaseName = autonomousDatabaseName;
            this.__explicitlySet__.add("autonomousDatabaseName");
            return this;
        }
        /** Customer Contacts for the Autonomous AI Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseCustomerContacts")
        private java.util.List<CustomerContact> autonomousDatabaseCustomerContacts;

        /**
         * Customer Contacts for the Autonomous AI Database.
         *
         * @param autonomousDatabaseCustomerContacts the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseCustomerContacts(
                java.util.List<CustomerContact> autonomousDatabaseCustomerContacts) {
            this.autonomousDatabaseCustomerContacts = autonomousDatabaseCustomerContacts;
            this.__explicitlySet__.add("autonomousDatabaseCustomerContacts");
            return this;
        }
        /**
         * The Autonomous AI Database workload type. The following values are valid: - OLTP -
         * indicates an Autonomous AI Transaction Processing database - DW - indicates an Autonomous
         * AI Lakehouse database - AJD - indicates an Autonomous AI JSON Database - APEX - indicates
         * an Autonomous AI Database with the Oracle APEX AI Application Development workload type.
         * - LH - indicates an Oracle Autonomous AI Lakehouse database
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        /**
         * The Autonomous AI Database workload type. The following values are valid: - OLTP -
         * indicates an Autonomous AI Transaction Processing database - DW - indicates an Autonomous
         * AI Lakehouse database - AJD - indicates an Autonomous AI JSON Database - APEX - indicates
         * an Autonomous AI Database with the Oracle APEX AI Application Development workload type.
         * - LH - indicates an Oracle Autonomous AI Lakehouse database
         *
         * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
         * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
         * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
         * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param dbWorkload the value to set
         * @return this builder
         */
        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SourceDatabaseDetails build() {
            SourceDatabaseDetails model =
                    new SourceDatabaseDetails(
                            this.autonomousVmClusterDisplayName,
                            this.autonomousContainerDatabaseName,
                            this.autonomousContainerDatabaseDisplayName,
                            this.autonomousContainerDatabaseCustomerContacts,
                            this.autonomousContainerDatabaseDstFileVersion,
                            this.autonomousDatabaseName,
                            this.autonomousDatabaseCustomerContacts,
                            this.dbWorkload);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SourceDatabaseDetails model) {
            if (model.wasPropertyExplicitlySet("autonomousVmClusterDisplayName")) {
                this.autonomousVmClusterDisplayName(model.getAutonomousVmClusterDisplayName());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseName")) {
                this.autonomousContainerDatabaseName(model.getAutonomousContainerDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseDisplayName")) {
                this.autonomousContainerDatabaseDisplayName(
                        model.getAutonomousContainerDatabaseDisplayName());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseCustomerContacts")) {
                this.autonomousContainerDatabaseCustomerContacts(
                        model.getAutonomousContainerDatabaseCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("autonomousContainerDatabaseDstFileVersion")) {
                this.autonomousContainerDatabaseDstFileVersion(
                        model.getAutonomousContainerDatabaseDstFileVersion());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseName")) {
                this.autonomousDatabaseName(model.getAutonomousDatabaseName());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseCustomerContacts")) {
                this.autonomousDatabaseCustomerContacts(
                        model.getAutonomousDatabaseCustomerContacts());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
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

    /** Autonomous VM cluster's user-friendly name. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousVmClusterDisplayName")
    private final String autonomousVmClusterDisplayName;

    /**
     * Autonomous VM cluster's user-friendly name.
     *
     * @return the value
     */
    public String getAutonomousVmClusterDisplayName() {
        return autonomousVmClusterDisplayName;
    }

    /** Autonomous Container Database name. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseName")
    private final String autonomousContainerDatabaseName;

    /**
     * Autonomous Container Database name.
     *
     * @return the value
     */
    public String getAutonomousContainerDatabaseName() {
        return autonomousContainerDatabaseName;
    }

    /** The user-provided name for the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseDisplayName")
    private final String autonomousContainerDatabaseDisplayName;

    /**
     * The user-provided name for the Autonomous Container Database.
     *
     * @return the value
     */
    public String getAutonomousContainerDatabaseDisplayName() {
        return autonomousContainerDatabaseDisplayName;
    }

    /**
     * Customer Contacts for the Autonomous Container Database. Setting this to an empty list
     * removes all customer contacts.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseCustomerContacts")
    private final java.util.List<CustomerContact> autonomousContainerDatabaseCustomerContacts;

    /**
     * Customer Contacts for the Autonomous Container Database. Setting this to an empty list
     * removes all customer contacts.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getAutonomousContainerDatabaseCustomerContacts() {
        return autonomousContainerDatabaseCustomerContacts;
    }

    /** DST Time-Zone File version of the Autonomous Container Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseDstFileVersion")
    private final String autonomousContainerDatabaseDstFileVersion;

    /**
     * DST Time-Zone File version of the Autonomous Container Database.
     *
     * @return the value
     */
    public String getAutonomousContainerDatabaseDstFileVersion() {
        return autonomousContainerDatabaseDstFileVersion;
    }

    /** Autonomous AI Database's name. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseName")
    private final String autonomousDatabaseName;

    /**
     * Autonomous AI Database's name.
     *
     * @return the value
     */
    public String getAutonomousDatabaseName() {
        return autonomousDatabaseName;
    }

    /** Customer Contacts for the Autonomous AI Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseCustomerContacts")
    private final java.util.List<CustomerContact> autonomousDatabaseCustomerContacts;

    /**
     * Customer Contacts for the Autonomous AI Database.
     *
     * @return the value
     */
    public java.util.List<CustomerContact> getAutonomousDatabaseCustomerContacts() {
        return autonomousDatabaseCustomerContacts;
    }

    /**
     * The Autonomous AI Database workload type. The following values are valid: - OLTP - indicates
     * an Autonomous AI Transaction Processing database - DW - indicates an Autonomous AI Lakehouse
     * database - AJD - indicates an Autonomous AI JSON Database - APEX - indicates an Autonomous AI
     * Database with the Oracle APEX AI Application Development workload type. - LH - indicates an
     * Oracle Autonomous AI Lakehouse database
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    public enum DbWorkload implements com.oracle.bmc.http.internal.BmcEnum {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),
        Apex("APEX"),
        Lh("LH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DbWorkload.class);

        private final String value;
        private static java.util.Map<String, DbWorkload> map;

        static {
            map = new java.util.HashMap<>();
            for (DbWorkload v : DbWorkload.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DbWorkload(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DbWorkload create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DbWorkload', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The Autonomous AI Database workload type. The following values are valid: - OLTP - indicates
     * an Autonomous AI Transaction Processing database - DW - indicates an Autonomous AI Lakehouse
     * database - AJD - indicates an Autonomous AI JSON Database - APEX - indicates an Autonomous AI
     * Database with the Oracle APEX AI Application Development workload type. - LH - indicates an
     * Oracle Autonomous AI Lakehouse database
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final DbWorkload dbWorkload;

    /**
     * The Autonomous AI Database workload type. The following values are valid: - OLTP - indicates
     * an Autonomous AI Transaction Processing database - DW - indicates an Autonomous AI Lakehouse
     * database - AJD - indicates an Autonomous AI JSON Database - APEX - indicates an Autonomous AI
     * Database with the Oracle APEX AI Application Development workload type. - LH - indicates an
     * Oracle Autonomous AI Lakehouse database
     *
     * <p>This cannot be updated in parallel with any of the following: licenseModel, dbEdition,
     * cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps,
     * isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName,
     * scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     */
    public DbWorkload getDbWorkload() {
        return dbWorkload;
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
        sb.append("SourceDatabaseDetails(");
        sb.append("super=").append(super.toString());
        sb.append("autonomousVmClusterDisplayName=")
                .append(String.valueOf(this.autonomousVmClusterDisplayName));
        sb.append(", autonomousContainerDatabaseName=")
                .append(String.valueOf(this.autonomousContainerDatabaseName));
        sb.append(", autonomousContainerDatabaseDisplayName=")
                .append(String.valueOf(this.autonomousContainerDatabaseDisplayName));
        sb.append(", autonomousContainerDatabaseCustomerContacts=")
                .append(String.valueOf(this.autonomousContainerDatabaseCustomerContacts));
        sb.append(", autonomousContainerDatabaseDstFileVersion=")
                .append(String.valueOf(this.autonomousContainerDatabaseDstFileVersion));
        sb.append(", autonomousDatabaseName=").append(String.valueOf(this.autonomousDatabaseName));
        sb.append(", autonomousDatabaseCustomerContacts=")
                .append(String.valueOf(this.autonomousDatabaseCustomerContacts));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SourceDatabaseDetails)) {
            return false;
        }

        SourceDatabaseDetails other = (SourceDatabaseDetails) o;
        return java.util.Objects.equals(
                        this.autonomousVmClusterDisplayName, other.autonomousVmClusterDisplayName)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseName, other.autonomousContainerDatabaseName)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseDisplayName,
                        other.autonomousContainerDatabaseDisplayName)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseCustomerContacts,
                        other.autonomousContainerDatabaseCustomerContacts)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseDstFileVersion,
                        other.autonomousContainerDatabaseDstFileVersion)
                && java.util.Objects.equals(
                        this.autonomousDatabaseName, other.autonomousDatabaseName)
                && java.util.Objects.equals(
                        this.autonomousDatabaseCustomerContacts,
                        other.autonomousDatabaseCustomerContacts)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterDisplayName == null
                                ? 43
                                : this.autonomousVmClusterDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseName == null
                                ? 43
                                : this.autonomousContainerDatabaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseDisplayName == null
                                ? 43
                                : this.autonomousContainerDatabaseDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseCustomerContacts == null
                                ? 43
                                : this.autonomousContainerDatabaseCustomerContacts.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseDstFileVersion == null
                                ? 43
                                : this.autonomousContainerDatabaseDstFileVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseName == null
                                ? 43
                                : this.autonomousDatabaseName.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseCustomerContacts == null
                                ? 43
                                : this.autonomousDatabaseCustomerContacts.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
