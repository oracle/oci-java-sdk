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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DBExternalInstance.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DBExternalInstance extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final String instanceName;

    public String getInstanceName() {
        return instanceName;
    }

    /**
     * Host name of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    public String getHostName() {
        return hostName;
    }

    /**
     * Total number of CPUs allocated for the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final Integer cpuCount;

    public Integer getCpuCount() {
        return cpuCount;
    }

    /**
     * Total amount of usable Physical RAM Memory available in gigabytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostMemoryCapacity")
    private final Double hostMemoryCapacity;

    public Double getHostMemoryCapacity() {
        return hostMemoryCapacity;
    }

    /**
     * Database version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    public String getVersion() {
        return version;
    }

    /**
     * Indicates whether the instance is mounted in cluster database mode (YES) or not (NO).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parallel")
    private final String parallel;

    public String getParallel() {
        return parallel;
    }

    /**
     * Role (permissions) of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceRole")
    private final String instanceRole;

    public String getInstanceRole() {
        return instanceRole;
    }

    /**
     * Indicates if logins are allowed or restricted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logins")
    private final String logins;

    public String getLogins() {
        return logins;
    }

    /**
     * Status of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
    private final String databaseStatus;

    public String getDatabaseStatus() {
        return databaseStatus;
    }

    /**
     * Status of the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    public String getStatus() {
        return status;
    }

    /**
     * The edition of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("edition")
    private final String edition;

    public String getEdition() {
        return edition;
    }

    /**
     * Start up time of the database instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startupTime")
    private final java.util.Date startupTime;

    public java.util.Date getStartupTime() {
        return startupTime;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DBExternalInstance(");
        sb.append("super=").append(super.toString());
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", cpuCount=").append(String.valueOf(this.cpuCount));
        sb.append(", hostMemoryCapacity=").append(String.valueOf(this.hostMemoryCapacity));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", parallel=").append(String.valueOf(this.parallel));
        sb.append(", instanceRole=").append(String.valueOf(this.instanceRole));
        sb.append(", logins=").append(String.valueOf(this.logins));
        sb.append(", databaseStatus=").append(String.valueOf(this.databaseStatus));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", edition=").append(String.valueOf(this.edition));
        sb.append(", startupTime=").append(String.valueOf(this.startupTime));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DBExternalInstance)) {
            return false;
        }

        DBExternalInstance other = (DBExternalInstance) o;
        return java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.cpuCount, other.cpuCount)
                && java.util.Objects.equals(this.hostMemoryCapacity, other.hostMemoryCapacity)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.parallel, other.parallel)
                && java.util.Objects.equals(this.instanceRole, other.instanceRole)
                && java.util.Objects.equals(this.logins, other.logins)
                && java.util.Objects.equals(this.databaseStatus, other.databaseStatus)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.edition, other.edition)
                && java.util.Objects.equals(this.startupTime, other.startupTime)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.cpuCount == null ? 43 : this.cpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.hostMemoryCapacity == null
                                ? 43
                                : this.hostMemoryCapacity.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.parallel == null ? 43 : this.parallel.hashCode());
        result = (result * PRIME) + (this.instanceRole == null ? 43 : this.instanceRole.hashCode());
        result = (result * PRIME) + (this.logins == null ? 43 : this.logins.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseStatus == null ? 43 : this.databaseStatus.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.edition == null ? 43 : this.edition.hashCode());
        result = (result * PRIME) + (this.startupTime == null ? 43 : this.startupTime.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
