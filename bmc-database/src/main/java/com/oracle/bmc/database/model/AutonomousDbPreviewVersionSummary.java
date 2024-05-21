/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Autonomous Database preview version. Note that preview version software is only available for [Autonomous Database Serverless instances](https://docs.oracle.com/en/cloud/paas/autonomous-database/serverless/).
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
    builder = AutonomousDbPreviewVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDbPreviewVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "version",
        "timePreviewBegin",
        "timePreviewEnd",
        "dbWorkload",
        "details"
    })
    public AutonomousDbPreviewVersionSummary(
            String version,
            java.util.Date timePreviewBegin,
            java.util.Date timePreviewEnd,
            DbWorkload dbWorkload,
            String details) {
        super();
        this.version = version;
        this.timePreviewBegin = timePreviewBegin;
        this.timePreviewEnd = timePreviewEnd;
        this.dbWorkload = dbWorkload;
        this.details = details;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A valid Autonomous Database preview version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * A valid Autonomous Database preview version.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The date and time when the preview version availability begins.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePreviewBegin")
        private java.util.Date timePreviewBegin;

        /**
         * The date and time when the preview version availability begins.
         * @param timePreviewBegin the value to set
         * @return this builder
         **/
        public Builder timePreviewBegin(java.util.Date timePreviewBegin) {
            this.timePreviewBegin = timePreviewBegin;
            this.__explicitlySet__.add("timePreviewBegin");
            return this;
        }
        /**
         * The date and time when the preview version availability ends.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePreviewEnd")
        private java.util.Date timePreviewEnd;

        /**
         * The date and time when the preview version availability ends.
         * @param timePreviewEnd the value to set
         * @return this builder
         **/
        public Builder timePreviewEnd(java.util.Date timePreviewEnd) {
            this.timePreviewEnd = timePreviewEnd;
            this.__explicitlySet__.add("timePreviewEnd");
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
         * A URL that points to a detailed description of the preview version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        /**
         * A URL that points to a detailed description of the preview version.
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDbPreviewVersionSummary build() {
            AutonomousDbPreviewVersionSummary model =
                    new AutonomousDbPreviewVersionSummary(
                            this.version,
                            this.timePreviewBegin,
                            this.timePreviewEnd,
                            this.dbWorkload,
                            this.details);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDbPreviewVersionSummary model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("timePreviewBegin")) {
                this.timePreviewBegin(model.getTimePreviewBegin());
            }
            if (model.wasPropertyExplicitlySet("timePreviewEnd")) {
                this.timePreviewEnd(model.getTimePreviewEnd());
            }
            if (model.wasPropertyExplicitlySet("dbWorkload")) {
                this.dbWorkload(model.getDbWorkload());
            }
            if (model.wasPropertyExplicitlySet("details")) {
                this.details(model.getDetails());
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
     * A valid Autonomous Database preview version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * A valid Autonomous Database preview version.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The date and time when the preview version availability begins.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePreviewBegin")
    private final java.util.Date timePreviewBegin;

    /**
     * The date and time when the preview version availability begins.
     * @return the value
     **/
    public java.util.Date getTimePreviewBegin() {
        return timePreviewBegin;
    }

    /**
     * The date and time when the preview version availability ends.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePreviewEnd")
    private final java.util.Date timePreviewEnd;

    /**
     * The date and time when the preview version availability ends.
     * @return the value
     **/
    public java.util.Date getTimePreviewEnd() {
        return timePreviewEnd;
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
     * A URL that points to a detailed description of the preview version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final String details;

    /**
     * A URL that points to a detailed description of the preview version.
     * @return the value
     **/
    public String getDetails() {
        return details;
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
        sb.append("AutonomousDbPreviewVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", timePreviewBegin=").append(String.valueOf(this.timePreviewBegin));
        sb.append(", timePreviewEnd=").append(String.valueOf(this.timePreviewEnd));
        sb.append(", dbWorkload=").append(String.valueOf(this.dbWorkload));
        sb.append(", details=").append(String.valueOf(this.details));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDbPreviewVersionSummary)) {
            return false;
        }

        AutonomousDbPreviewVersionSummary other = (AutonomousDbPreviewVersionSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.timePreviewBegin, other.timePreviewBegin)
                && java.util.Objects.equals(this.timePreviewEnd, other.timePreviewEnd)
                && java.util.Objects.equals(this.dbWorkload, other.dbWorkload)
                && java.util.Objects.equals(this.details, other.details)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.timePreviewBegin == null ? 43 : this.timePreviewBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timePreviewEnd == null ? 43 : this.timePreviewEnd.hashCode());
        result = (result * PRIME) + (this.dbWorkload == null ? 43 : this.dbWorkload.hashCode());
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
