/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration parameters defined for external databases.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DBExternalProperties.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DBExternalProperties extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logMode")
        private String logMode;

        public Builder logMode(String logMode) {
            this.logMode = logMode;
            this.__explicitlySet__.add("logMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cdb")
        private String cdb;

        public Builder cdb(String cdb) {
            this.cdb = cdb;
            this.__explicitlySet__.add("cdb");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private String openMode;

        public Builder openMode(String openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseRole")
        private String databaseRole;

        public Builder databaseRole(String databaseRole) {
            this.databaseRole = databaseRole;
            this.__explicitlySet__.add("databaseRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("guardStatus")
        private String guardStatus;

        public Builder guardStatus(String guardStatus) {
            this.guardStatus = guardStatus;
            this.__explicitlySet__.add("guardStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformName")
        private String platformName;

        public Builder platformName(String platformName) {
            this.platformName = platformName;
            this.__explicitlySet__.add("platformName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("controlFileType")
        private String controlFileType;

        public Builder controlFileType(String controlFileType) {
            this.controlFileType = controlFileType;
            this.__explicitlySet__.add("controlFileType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("switchoverStatus")
        private String switchoverStatus;

        public Builder switchoverStatus(String switchoverStatus) {
            this.switchoverStatus = switchoverStatus;
            this.__explicitlySet__.add("switchoverStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("created")
        private java.util.Date created;

        public Builder created(java.util.Date created) {
            this.created = created;
            this.__explicitlySet__.add("created");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DBExternalProperties build() {
            DBExternalProperties __instance__ =
                    new DBExternalProperties(
                            timeCollected,
                            name,
                            logMode,
                            cdb,
                            openMode,
                            databaseRole,
                            guardStatus,
                            platformName,
                            controlFileType,
                            switchoverStatus,
                            created);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DBExternalProperties o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .name(o.getName())
                            .logMode(o.getLogMode())
                            .cdb(o.getCdb())
                            .openMode(o.getOpenMode())
                            .databaseRole(o.getDatabaseRole())
                            .guardStatus(o.getGuardStatus())
                            .platformName(o.getPlatformName())
                            .controlFileType(o.getControlFileType())
                            .switchoverStatus(o.getSwitchoverStatus())
                            .created(o.getCreated());

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

    @Deprecated
    public DBExternalProperties(
            java.util.Date timeCollected,
            String name,
            String logMode,
            String cdb,
            String openMode,
            String databaseRole,
            String guardStatus,
            String platformName,
            String controlFileType,
            String switchoverStatus,
            java.util.Date created) {
        super(timeCollected);
        this.name = name;
        this.logMode = logMode;
        this.cdb = cdb;
        this.openMode = openMode;
        this.databaseRole = databaseRole;
        this.guardStatus = guardStatus;
        this.platformName = platformName;
        this.controlFileType = controlFileType;
        this.switchoverStatus = switchoverStatus;
        this.created = created;
    }

    /**
     * Name of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * Archive log mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logMode")
    String logMode;

    /**
     * Indicates if it is a CDB or not. This would be 'yes' or 'no'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdb")
    String cdb;

    /**
     * Open mode information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    String openMode;

    /**
     * Current role of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseRole")
    String databaseRole;

    /**
     * Data protection policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guardStatus")
    String guardStatus;

    /**
     * Platform name of the database, OS with architecture.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    String platformName;

    /**
     * Type of control file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("controlFileType")
    String controlFileType;

    /**
     * Indicates whether switchover is allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("switchoverStatus")
    String switchoverStatus;

    /**
     * Creation time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    java.util.Date created;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
