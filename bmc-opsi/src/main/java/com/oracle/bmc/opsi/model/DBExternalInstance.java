/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration parameters defined for external databases instance level. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DBExternalInstance.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
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
        /** Name of the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * Name of the database instance.
         *
         * @param instanceName the value to set
         * @return this builder
         */
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /** Host name of the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * Host name of the database instance.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** Total number of CPUs allocated for the host. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
        private Integer cpuCount;

        /**
         * Total number of CPUs allocated for the host.
         *
         * @param cpuCount the value to set
         * @return this builder
         */
        public Builder cpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            this.__explicitlySet__.add("cpuCount");
            return this;
        }
        /** Total amount of usable Physical RAM Memory available in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostMemoryCapacity")
        private Double hostMemoryCapacity;

        /**
         * Total amount of usable Physical RAM Memory available in gigabytes.
         *
         * @param hostMemoryCapacity the value to set
         * @return this builder
         */
        public Builder hostMemoryCapacity(Double hostMemoryCapacity) {
            this.hostMemoryCapacity = hostMemoryCapacity;
            this.__explicitlySet__.add("hostMemoryCapacity");
            return this;
        }
        /** Database version. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Database version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** Indicates whether the instance is mounted in cluster database mode (YES) or not (NO). */
        @com.fasterxml.jackson.annotation.JsonProperty("parallel")
        private String parallel;

        /**
         * Indicates whether the instance is mounted in cluster database mode (YES) or not (NO).
         *
         * @param parallel the value to set
         * @return this builder
         */
        public Builder parallel(String parallel) {
            this.parallel = parallel;
            this.__explicitlySet__.add("parallel");
            return this;
        }
        /** Role (permissions) of the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceRole")
        private String instanceRole;

        /**
         * Role (permissions) of the database instance.
         *
         * @param instanceRole the value to set
         * @return this builder
         */
        public Builder instanceRole(String instanceRole) {
            this.instanceRole = instanceRole;
            this.__explicitlySet__.add("instanceRole");
            return this;
        }
        /** Indicates if logins are allowed or restricted. */
        @com.fasterxml.jackson.annotation.JsonProperty("logins")
        private String logins;

        /**
         * Indicates if logins are allowed or restricted.
         *
         * @param logins the value to set
         * @return this builder
         */
        public Builder logins(String logins) {
            this.logins = logins;
            this.__explicitlySet__.add("logins");
            return this;
        }
        /** Status of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
        private String databaseStatus;

        /**
         * Status of the database.
         *
         * @param databaseStatus the value to set
         * @return this builder
         */
        public Builder databaseStatus(String databaseStatus) {
            this.databaseStatus = databaseStatus;
            this.__explicitlySet__.add("databaseStatus");
            return this;
        }
        /** Status of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Status of the instance.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** The edition of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("edition")
        private String edition;

        /**
         * The edition of the database.
         *
         * @param edition the value to set
         * @return this builder
         */
        public Builder edition(String edition) {
            this.edition = edition;
            this.__explicitlySet__.add("edition");
            return this;
        }
        /** Start up time of the database instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("startupTime")
        private java.util.Date startupTime;

        /**
         * Start up time of the database instance.
         *
         * @param startupTime the value to set
         * @return this builder
         */
        public Builder startupTime(java.util.Date startupTime) {
            this.startupTime = startupTime;
            this.__explicitlySet__.add("startupTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DBExternalInstance build() {
            DBExternalInstance model =
                    new DBExternalInstance(
                            this.timeCollected,
                            this.instanceName,
                            this.hostName,
                            this.cpuCount,
                            this.hostMemoryCapacity,
                            this.version,
                            this.parallel,
                            this.instanceRole,
                            this.logins,
                            this.databaseStatus,
                            this.status,
                            this.edition,
                            this.startupTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DBExternalInstance model) {
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("instanceName")) {
                this.instanceName(model.getInstanceName());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("cpuCount")) {
                this.cpuCount(model.getCpuCount());
            }
            if (model.wasPropertyExplicitlySet("hostMemoryCapacity")) {
                this.hostMemoryCapacity(model.getHostMemoryCapacity());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("parallel")) {
                this.parallel(model.getParallel());
            }
            if (model.wasPropertyExplicitlySet("instanceRole")) {
                this.instanceRole(model.getInstanceRole());
            }
            if (model.wasPropertyExplicitlySet("logins")) {
                this.logins(model.getLogins());
            }
            if (model.wasPropertyExplicitlySet("databaseStatus")) {
                this.databaseStatus(model.getDatabaseStatus());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("edition")) {
                this.edition(model.getEdition());
            }
            if (model.wasPropertyExplicitlySet("startupTime")) {
                this.startupTime(model.getStartupTime());
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

    /** Name of the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * Name of the database instance.
     *
     * @return the value
     */
    public String getInstanceName() {
        return instanceName;
    }

    /** Host name of the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * Host name of the database instance.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** Total number of CPUs allocated for the host. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCount")
    private final Integer cpuCount;

    /**
     * Total number of CPUs allocated for the host.
     *
     * @return the value
     */
    public Integer getCpuCount() {
        return cpuCount;
    }

    /** Total amount of usable Physical RAM Memory available in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostMemoryCapacity")
    private final Double hostMemoryCapacity;

    /**
     * Total amount of usable Physical RAM Memory available in gigabytes.
     *
     * @return the value
     */
    public Double getHostMemoryCapacity() {
        return hostMemoryCapacity;
    }

    /** Database version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Database version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** Indicates whether the instance is mounted in cluster database mode (YES) or not (NO). */
    @com.fasterxml.jackson.annotation.JsonProperty("parallel")
    private final String parallel;

    /**
     * Indicates whether the instance is mounted in cluster database mode (YES) or not (NO).
     *
     * @return the value
     */
    public String getParallel() {
        return parallel;
    }

    /** Role (permissions) of the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceRole")
    private final String instanceRole;

    /**
     * Role (permissions) of the database instance.
     *
     * @return the value
     */
    public String getInstanceRole() {
        return instanceRole;
    }

    /** Indicates if logins are allowed or restricted. */
    @com.fasterxml.jackson.annotation.JsonProperty("logins")
    private final String logins;

    /**
     * Indicates if logins are allowed or restricted.
     *
     * @return the value
     */
    public String getLogins() {
        return logins;
    }

    /** Status of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseStatus")
    private final String databaseStatus;

    /**
     * Status of the database.
     *
     * @return the value
     */
    public String getDatabaseStatus() {
        return databaseStatus;
    }

    /** Status of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Status of the instance.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** The edition of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("edition")
    private final String edition;

    /**
     * The edition of the database.
     *
     * @return the value
     */
    public String getEdition() {
        return edition;
    }

    /** Start up time of the database instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("startupTime")
    private final java.util.Date startupTime;

    /**
     * Start up time of the database instance.
     *
     * @return the value
     */
    public java.util.Date getStartupTime() {
        return startupTime;
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
        sb.append("DBExternalInstance(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
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
                && super.equals(other);
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
        return result;
    }
}
