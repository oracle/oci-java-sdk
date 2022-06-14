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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DBExternalProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DBExternalProperties extends DatabaseConfigurationMetricGroup {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /**
         * Name of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the database.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Archive log mode.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("logMode")
        private String logMode;

        /**
         * Archive log mode.
         * @param logMode the value to set
         * @return this builder
         **/
        public Builder logMode(String logMode) {
            this.logMode = logMode;
            this.__explicitlySet__.add("logMode");
            return this;
        }
        /**
         * Indicates if it is a CDB or not. This would be 'yes' or 'no'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cdb")
        private String cdb;

        /**
         * Indicates if it is a CDB or not. This would be 'yes' or 'no'.
         * @param cdb the value to set
         * @return this builder
         **/
        public Builder cdb(String cdb) {
            this.cdb = cdb;
            this.__explicitlySet__.add("cdb");
            return this;
        }
        /**
         * Open mode information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("openMode")
        private String openMode;

        /**
         * Open mode information.
         * @param openMode the value to set
         * @return this builder
         **/
        public Builder openMode(String openMode) {
            this.openMode = openMode;
            this.__explicitlySet__.add("openMode");
            return this;
        }
        /**
         * Current role of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseRole")
        private String databaseRole;

        /**
         * Current role of the database.
         * @param databaseRole the value to set
         * @return this builder
         **/
        public Builder databaseRole(String databaseRole) {
            this.databaseRole = databaseRole;
            this.__explicitlySet__.add("databaseRole");
            return this;
        }
        /**
         * Data protection policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("guardStatus")
        private String guardStatus;

        /**
         * Data protection policy.
         * @param guardStatus the value to set
         * @return this builder
         **/
        public Builder guardStatus(String guardStatus) {
            this.guardStatus = guardStatus;
            this.__explicitlySet__.add("guardStatus");
            return this;
        }
        /**
         * Platform name of the database, OS with architecture.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platformName")
        private String platformName;

        /**
         * Platform name of the database, OS with architecture.
         * @param platformName the value to set
         * @return this builder
         **/
        public Builder platformName(String platformName) {
            this.platformName = platformName;
            this.__explicitlySet__.add("platformName");
            return this;
        }
        /**
         * Type of control file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("controlFileType")
        private String controlFileType;

        /**
         * Type of control file.
         * @param controlFileType the value to set
         * @return this builder
         **/
        public Builder controlFileType(String controlFileType) {
            this.controlFileType = controlFileType;
            this.__explicitlySet__.add("controlFileType");
            return this;
        }
        /**
         * Indicates whether switchover is allowed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("switchoverStatus")
        private String switchoverStatus;

        /**
         * Indicates whether switchover is allowed.
         * @param switchoverStatus the value to set
         * @return this builder
         **/
        public Builder switchoverStatus(String switchoverStatus) {
            this.switchoverStatus = switchoverStatus;
            this.__explicitlySet__.add("switchoverStatus");
            return this;
        }
        /**
         * Creation time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("created")
        private java.util.Date created;

        /**
         * Creation time.
         * @param created the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
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
    private final String name;

    /**
     * Name of the database.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Archive log mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logMode")
    private final String logMode;

    /**
     * Archive log mode.
     * @return the value
     **/
    public String getLogMode() {
        return logMode;
    }

    /**
     * Indicates if it is a CDB or not. This would be 'yes' or 'no'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdb")
    private final String cdb;

    /**
     * Indicates if it is a CDB or not. This would be 'yes' or 'no'.
     * @return the value
     **/
    public String getCdb() {
        return cdb;
    }

    /**
     * Open mode information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("openMode")
    private final String openMode;

    /**
     * Open mode information.
     * @return the value
     **/
    public String getOpenMode() {
        return openMode;
    }

    /**
     * Current role of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseRole")
    private final String databaseRole;

    /**
     * Current role of the database.
     * @return the value
     **/
    public String getDatabaseRole() {
        return databaseRole;
    }

    /**
     * Data protection policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("guardStatus")
    private final String guardStatus;

    /**
     * Data protection policy.
     * @return the value
     **/
    public String getGuardStatus() {
        return guardStatus;
    }

    /**
     * Platform name of the database, OS with architecture.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformName")
    private final String platformName;

    /**
     * Platform name of the database, OS with architecture.
     * @return the value
     **/
    public String getPlatformName() {
        return platformName;
    }

    /**
     * Type of control file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("controlFileType")
    private final String controlFileType;

    /**
     * Type of control file.
     * @return the value
     **/
    public String getControlFileType() {
        return controlFileType;
    }

    /**
     * Indicates whether switchover is allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("switchoverStatus")
    private final String switchoverStatus;

    /**
     * Indicates whether switchover is allowed.
     * @return the value
     **/
    public String getSwitchoverStatus() {
        return switchoverStatus;
    }

    /**
     * Creation time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("created")
    private final java.util.Date created;

    /**
     * Creation time.
     * @return the value
     **/
    public java.util.Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DBExternalProperties(");
        sb.append("super=").append(super.toString());
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", logMode=").append(String.valueOf(this.logMode));
        sb.append(", cdb=").append(String.valueOf(this.cdb));
        sb.append(", openMode=").append(String.valueOf(this.openMode));
        sb.append(", databaseRole=").append(String.valueOf(this.databaseRole));
        sb.append(", guardStatus=").append(String.valueOf(this.guardStatus));
        sb.append(", platformName=").append(String.valueOf(this.platformName));
        sb.append(", controlFileType=").append(String.valueOf(this.controlFileType));
        sb.append(", switchoverStatus=").append(String.valueOf(this.switchoverStatus));
        sb.append(", created=").append(String.valueOf(this.created));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DBExternalProperties)) {
            return false;
        }

        DBExternalProperties other = (DBExternalProperties) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.logMode, other.logMode)
                && java.util.Objects.equals(this.cdb, other.cdb)
                && java.util.Objects.equals(this.openMode, other.openMode)
                && java.util.Objects.equals(this.databaseRole, other.databaseRole)
                && java.util.Objects.equals(this.guardStatus, other.guardStatus)
                && java.util.Objects.equals(this.platformName, other.platformName)
                && java.util.Objects.equals(this.controlFileType, other.controlFileType)
                && java.util.Objects.equals(this.switchoverStatus, other.switchoverStatus)
                && java.util.Objects.equals(this.created, other.created)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.logMode == null ? 43 : this.logMode.hashCode());
        result = (result * PRIME) + (this.cdb == null ? 43 : this.cdb.hashCode());
        result = (result * PRIME) + (this.openMode == null ? 43 : this.openMode.hashCode());
        result = (result * PRIME) + (this.databaseRole == null ? 43 : this.databaseRole.hashCode());
        result = (result * PRIME) + (this.guardStatus == null ? 43 : this.guardStatus.hashCode());
        result = (result * PRIME) + (this.platformName == null ? 43 : this.platformName.hashCode());
        result =
                (result * PRIME)
                        + (this.controlFileType == null ? 43 : this.controlFileType.hashCode());
        result =
                (result * PRIME)
                        + (this.switchoverStatus == null ? 43 : this.switchoverStatus.hashCode());
        result = (result * PRIME) + (this.created == null ? 43 : this.created.hashCode());
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
