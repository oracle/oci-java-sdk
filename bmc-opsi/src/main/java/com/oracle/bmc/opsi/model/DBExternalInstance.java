/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration parameters defined for external databases instance level.
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
    builder = DBExternalInstance.Builder.class
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
public class DBExternalInstance extends DatabaseConfigurationMetricGroup {
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

        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private Integer cpuCount;

        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostMemoryCapacity")
        private Double hostMemoryCapacity;

        public Builder hostMemoryCapacity(Double hostMemoryCapacity) {
            this.hostMemoryCapacity = hostMemoryCapacity;
            this.__explicitlySet__.add("hostMemoryCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parallel")
        private String parallel;

        public Builder parallel(String parallel) {
            this.parallel = parallel;
            this.__explicitlySet__.add("parallel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceRole")
        private String instanceRole;

        public Builder instanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            this.__explicitlySet__.add("instanceRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logins")
        private String logins;

        public Builder logins(String logins) {
            this.logins = logins;
            this.__explicitlySet__.add("logins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
        private String databaseStatus;

        public Builder databaseStatus(String databaseStatus) {
            this.databaseStatus = databaseStatus;
            this.__explicitlySet__.add("databaseStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("edition")
        private String edition;

        public Builder edition(String edition) {
            this.edition = edition;
            this.__explicitlySet__.add("edition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startupTime")
        private java.util.Date startupTime;

        public Builder startupTime(java.util.Date startupTime) {
            this.startupTime = startupTime;
            this.__explicitlySet__.add("startupTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DBExternalInstance build() {
            DBExternalInstance __instance__ =
                    new DBExternalInstance(
                            timeCollected,
                            instanceName,
                            hostName,
                            cpuCount,
                            hostMemoryCapacity,
                            version,
                            parallel,
                            instanceRole,
                            logins,
                            databaseStatus,
                            status,
                            edition,
                            startupTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DBExternalInstance o) {
            Builder copiedBuilder =
                    timeCollected(o.getTimeCollected())
                            .instanceName(o.getInstanceName())
                            .hostName(o.getHostName())
                            .cpuCount(o.getCpuCount())
                            .hostMemoryCapacity(o.getHostMemoryCapacity())
                            .version(o.getVersion())
                            .parallel(o.getParallel())
                            .instanceRole(o.getInstanceRole())
                            .logins(o.getLogins())
                            .databaseStatus(o.getDatabaseStatus())
                            .status(o.getStatus())
                            .edition(o.getEdition())
                            .startupTime(o.getStartupTime());

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
    public DBExternalInstance(
            java.util.Date timeCollected,
            String instanceName,
            String hostName,
            Integer cpuCount,
            Double hostMemoryCapacity,
            String version,
            String parallel,
            String instanceRole,
            String logins,
            String databaseStatus,
            String status,
            String edition,
            java.util.Date startupTime) {
        super(timeCollected);
        this.instanceName = instanceName;
        this.hostName = hostName;
        this.cpuCount = cpuCount;
        this.hostMemoryCapacity = hostMemoryCapacity;
        this.version = version;
        this.parallel = parallel;
        this.instanceRole = instanceRole;
        this.logins = logins;
        this.databaseStatus = databaseStatus;
        this.status = status;
        this.edition = edition;
        this.startupTime = startupTime;
    }

    /**
     * Name of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    String instanceName;

    /**
     * Host name of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    String hostName;

    /**
     * Total number of CPUs allocated for the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    Integer cpuCount;

    /**
     * Total amount of usable Physical RAM Memory available in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostMemoryCapacity")
    Double hostMemoryCapacity;

    /**
     * Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * Indicates whether the instance is mounted in cluster database mode (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parallel")
    String parallel;

    /**
     * Role (permissions) of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceRole")
    String instanceRole;

    /**
     * Indicates if logins are allowed or restricted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logins")
    String logins;

    /**
     * Status of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
    String databaseStatus;

    /**
     * Status of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    String status;

    /**
     * The edition of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("edition")
    String edition;

    /**
     * Start up time of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startupTime")
    java.util.Date startupTime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
