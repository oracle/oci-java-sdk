/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The supported Autonomous Database version.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDbVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDbVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "dbWorkload",
        "isDedicated",
        "details",
        "isFreeTierEnabled",
        "isPaidEnabled",
        "isDefaultForFree",
        "isDefaultForPaid"
    })
    public AutonomousDbVersionSummary(
            String version,
            DbWorkload dbWorkload,
            Boolean isDedicated,
            String details,
            Boolean isFreeTierEnabled,
            Boolean isPaidEnabled,
            Boolean isDefaultForFree,
            Boolean isDefaultForPaid) {
        super();
        this.version = version;
        this.dbWorkload = dbWorkload;
        this.isDedicated = isDedicated;
        this.details = details;
        this.isFreeTierEnabled = isFreeTierEnabled;
        this.isPaidEnabled = isPaidEnabled;
        this.isDefaultForFree = isDefaultForFree;
        this.isDefaultForPaid = isDefaultForPaid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A valid Oracle Database version for Autonomous Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * A valid Oracle Database version for Autonomous Database.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The Autonomous Database workload type. The following values are valid:
         * <p>
         * - OLTP - indicates an Autonomous Transaction Processing database
         * - DW - indicates an Autonomous Data Warehouse database
         * - AJD - indicates an Autonomous JSON Database
         * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
         * <p>
         * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        /**
         * The Autonomous Database workload type. The following values are valid:
         * <p>
         * - OLTP - indicates an Autonomous Transaction Processing database
         * - DW - indicates an Autonomous Data Warehouse database
         * - AJD - indicates an Autonomous JSON Database
         * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
         * <p>
         * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
         *
         * @param dbWorkload the value to set
         * @return this builder
         **/
        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }
        /**
         * True if the database uses [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
        private Boolean isDedicated;

        /**
         * True if the database uses [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
         *
         * @param isDedicated the value to set
         * @return this builder
         **/
        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            this.__explicitlySet__.add("isDedicated");
            return this;
        }
        /**
         * A URL that points to a detailed description of the Autonomous Database version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * A URL that points to a detailed description of the Autonomous Database version.
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * True if this version of the Oracle Database software can be used for Always-Free Autonomous Databases.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTierEnabled")
        private Boolean isFreeTierEnabled;

        /**
         * True if this version of the Oracle Database software can be used for Always-Free Autonomous Databases.
         * @param isFreeTierEnabled the value to set
         * @return this builder
         **/
        public Builder isFreeTierEnabled(Boolean isFreeTierEnabled) {
            this.isFreeTierEnabled = isFreeTierEnabled;
            this.__explicitlySet__.add("isFreeTierEnabled");
            return this;
        }
        /**
         * True if this version of the Oracle Database software has payments enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidEnabled")
        private Boolean isPaidEnabled;

        /**
         * True if this version of the Oracle Database software has payments enabled.
         * @param isPaidEnabled the value to set
         * @return this builder
         **/
        public Builder isPaidEnabled(Boolean isPaidEnabled) {
            this.isPaidEnabled = isPaidEnabled;
            this.__explicitlySet__.add("isPaidEnabled");
            return this;
        }
        /**
         * True if this version of the Oracle Database software's default is free.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForFree")
        private Boolean isDefaultForFree;

        /**
         * True if this version of the Oracle Database software's default is free.
         * @param isDefaultForFree the value to set
         * @return this builder
         **/
        public Builder isDefaultForFree(Boolean isDefaultForFree) {
            this.isDefaultForFree = isDefaultForFree;
            this.__explicitlySet__.add("isDefaultForFree");
            return this;
        }
        /**
         * True if this version of the Oracle Database software's default is paid.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForPaid")
        private Boolean isDefaultForPaid;

        /**
         * True if this version of the Oracle Database software's default is paid.
         * @param isDefaultForPaid the value to set
         * @return this builder
         **/
        public Builder isDefaultForPaid(Boolean isDefaultForPaid) {
            this.isDefaultForPaid = isDefaultForPaid;
            this.__explicitlySet__.add("isDefaultForPaid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDbVersionSummary build() {
            AutonomousDbVersionSummary model =
                    new AutonomousDbVersionSummary(
                            this.version,
                            this.dbWorkload,
                            this.isDedicated,
                            this.details,
                            this.isFreeTierEnabled,
                            this.isPaidEnabled,
                            this.isDefaultForFree,
                            this.isDefaultForPaid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDbVersionSummary model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("isDedicated")) {
                this.isDedicated(model.getIsDedicated());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
            }
            if (model.wasPropertyExplicitlySet("isFreeTierEnabled")) {
                this.isFreeTierEnabled(model.getIsFreeTierEnabled());
            }
            if (model.wasPropertyExplicitlySet("isPaidEnabled")) {
                this.isPaidEnabled(model.getIsPaidEnabled());
            }
            if (model.wasPropertyExplicitlySet("isDefaultForFree")) {
                this.isDefaultForFree(model.getIsDefaultForFree());
            }
            if (model.wasPropertyExplicitlySet("isDefaultForPaid")) {
                this.isDefaultForPaid(model.getIsDefaultForPaid());
            }
            return this;
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
     * A valid Oracle Database version for Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * A valid Oracle Database version for Autonomous Database.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     **/
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),
        Apex("APEX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    private final DbWorkload dbWorkload;

    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     * - APEX - indicates an Autonomous Database with the Oracle APEX Application Development workload type.
     * <p>
     * This cannot be updated in parallel with any of the following: licenseModel, dbEdition, cpuCoreCount, computeCount, computeModel, adminPassword, whitelistedIps, isMTLSConnectionRequired, privateEndpointLabel, nsgIds, dbVersion, isRefreshable, dbName, scheduledOperations, dbToolsDetails, isLocalDataGuardEnabled, or isFreeTier.
     *
     * @return the value
     **/
    public DbWorkload getDbWorkload() {
        return dbWorkload;
    }

    /**
     * True if the database uses [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    private final Boolean isDedicated;

    /**
     * True if the database uses [dedicated Exadata infrastructure](https://docs.oracle.com/en/cloud/paas/autonomous-database/index.html).
     *
     * @return the value
     **/
    public Boolean getIsDedicated() {
        return isDedicated;
    }

    /**
     * A URL that points to a detailed description of the Autonomous Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * A URL that points to a detailed description of the Autonomous Database version.
     * @return the value
     **/
    public String getDetails() {
        return details;
    }

    /**
     * True if this version of the Oracle Database software can be used for Always-Free Autonomous Databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTierEnabled")
    private final Boolean isFreeTierEnabled;

    /**
     * True if this version of the Oracle Database software can be used for Always-Free Autonomous Databases.
     * @return the value
     **/
    public Boolean getIsFreeTierEnabled() {
        return isFreeTierEnabled;
    }

    /**
     * True if this version of the Oracle Database software has payments enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidEnabled")
    private final Boolean isPaidEnabled;

    /**
     * True if this version of the Oracle Database software has payments enabled.
     * @return the value
     **/
    public Boolean getIsPaidEnabled() {
        return isPaidEnabled;
    }

    /**
     * True if this version of the Oracle Database software's default is free.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForFree")
    private final Boolean isDefaultForFree;

    /**
     * True if this version of the Oracle Database software's default is free.
     * @return the value
     **/
    public Boolean getIsDefaultForFree() {
        return isDefaultForFree;
    }

    /**
     * True if this version of the Oracle Database software's default is paid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForPaid")
    private final Boolean isDefaultForPaid;

    /**
     * True if this version of the Oracle Database software's default is paid.
     * @return the value
     **/
    public Boolean getIsDefaultForPaid() {
        return isDefaultForPaid;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDbVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", isDedicated=").append(String.valueOf(this.isDedicated));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(", isFreeTierEnabled=").append(String.valueOf(this.isFreeTierEnabled));
        sb.append(", isPaidEnabled=").append(String.valueOf(this.isPaidEnabled));
        sb.append(", isDefaultForFree=").append(String.valueOf(this.isDefaultForFree));
        sb.append(", isDefaultForPaid=").append(String.valueOf(this.isDefaultForPaid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDbVersionSummary)) {
            return false;
        }

        AutonomousDbVersionSummary other = (AutonomousDbVersionSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.isDedicated, other.isDedicated)
                && java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.isFreeTierEnabled, other.isFreeTierEnabled)
                && java.util.Objects.equals(this.isPaidEnabled, other.isPaidEnabled)
                && java.util.Objects.equals(this.isDefaultForFree, other.isDefaultForFree)
                && java.util.Objects.equals(this.isDefaultForPaid, other.isDefaultForPaid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.isDedicated == null ? 43 : this.isDedicated.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result =
                (result * PRIME)
                        + (this.isFreeTierEnabled == null ? 43 : this.isFreeTierEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isPaidEnabled == null ? 43 : this.isPaidEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultForFree == null ? 43 : this.isDefaultForFree.hashCode());
        result =
                (result * PRIME)
                        + (this.isDefaultForPaid == null ? 43 : this.isDefaultForPaid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
