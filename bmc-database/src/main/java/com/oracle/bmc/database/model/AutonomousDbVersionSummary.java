/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDbVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousDbVersionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
        private DbWorkload dbWorkload;

        public Builder dbWorkload(DbWorkload dbWorkload) {
            this.dbWorkload = dbWorkload;
            this.__explicitlySet__.add("dbWorkload");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
        private Boolean isDedicated;

        public Builder isDedicated(Boolean isDedicated) {
            this.isDedicated = isDedicated;
            this.__explicitlySet__.add("isDedicated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private String details;

        public Builder details(String details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFreeTierEnabled")
        private Boolean isFreeTierEnabled;

        public Builder isFreeTierEnabled(Boolean isFreeTierEnabled) {
            this.isFreeTierEnabled = isFreeTierEnabled;
            this.__explicitlySet__.add("isFreeTierEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPaidEnabled")
        private Boolean isPaidEnabled;

        public Builder isPaidEnabled(Boolean isPaidEnabled) {
            this.isPaidEnabled = isPaidEnabled;
            this.__explicitlySet__.add("isPaidEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForFree")
        private Boolean isDefaultForFree;

        public Builder isDefaultForFree(Boolean isDefaultForFree) {
            this.isDefaultForFree = isDefaultForFree;
            this.__explicitlySet__.add("isDefaultForFree");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForPaid")
        private Boolean isDefaultForPaid;

        public Builder isDefaultForPaid(Boolean isDefaultForPaid) {
            this.isDefaultForPaid = isDefaultForPaid;
            this.__explicitlySet__.add("isDefaultForPaid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDbVersionSummary build() {
            AutonomousDbVersionSummary __instance__ =
                    new AutonomousDbVersionSummary(
                            version,
                            dbWorkload,
                            isDedicated,
                            details,
                            isFreeTierEnabled,
                            isPaidEnabled,
                            isDefaultForFree,
                            isDefaultForPaid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDbVersionSummary o) {
            Builder copiedBuilder =
                    version(o.getVersion())
                            .dbWorkload(o.getDbWorkload())
                            .isDedicated(o.getIsDedicated())
                            .details(o.getDetails())
                            .isFreeTierEnabled(o.getIsFreeTierEnabled())
                            .isPaidEnabled(o.getIsPaidEnabled())
                            .isDefaultForFree(o.getIsDefaultForFree())
                            .isDefaultForPaid(o.getIsDefaultForPaid());

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
     * A valid Oracle Database version for Autonomous Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;
    /**
     * The Autonomous Database workload type. The following values are valid:
     * <p>
     * - OLTP - indicates an Autonomous Transaction Processing database
     * - DW - indicates an Autonomous Data Warehouse database
     * - AJD - indicates an Autonomous JSON Database
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DbWorkload {
        Oltp("OLTP"),
        Dw("DW"),
        Ajd("AJD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbWorkload")
    DbWorkload dbWorkload;

    /**
     * True if the database uses [dedicated Exadata infrastructure](https://docs.cloud.oracle.com/Content/Database/Concepts/adbddoverview.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDedicated")
    Boolean isDedicated;

    /**
     * A URL that points to a detailed description of the Autonomous Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    String details;

    /**
     * True if this version of the Oracle Database software can be used for Always-Free Autonomous Databases.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreeTierEnabled")
    Boolean isFreeTierEnabled;

    /**
     * True if this version of the Oracle Database software has payments enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidEnabled")
    Boolean isPaidEnabled;

    /**
     * True if this version of the Oracle Database software's default is free.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForFree")
    Boolean isDefaultForFree;

    /**
     * True if this version of the Oracle Database software's default is paid.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefaultForPaid")
    Boolean isDefaultForPaid;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
