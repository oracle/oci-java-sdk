/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The status collected from the DB System.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DbSystemStatusResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DbSystemStatusResult extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "canAcceptClientConnections",
        "isInOfflineMode",
        "isWritable",
        "areAllMysqlInstancesHealthy",
        "isStorageFull",
        "gtidSet",
        "isGtidSetApplied",
        "channelsStatus"
    })
    public DbSystemStatusResult(
            Boolean canAcceptClientConnections,
            Boolean isInOfflineMode,
            Boolean isWritable,
            Boolean areAllMysqlInstancesHealthy,
            Boolean isStorageFull,
            String gtidSet,
            Boolean isGtidSetApplied,
            java.util.List<ChannelStatusResult> channelsStatus) {
        super();
        this.canAcceptClientConnections = canAcceptClientConnections;
        this.isInOfflineMode = isInOfflineMode;
        this.isWritable = isWritable;
        this.areAllMysqlInstancesHealthy = areAllMysqlInstancesHealthy;
        this.isStorageFull = isStorageFull;
        this.gtidSet = gtidSet;
        this.isGtidSetApplied = isGtidSetApplied;
        this.channelsStatus = channelsStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies if the Read/Write endpoint of the DB System can accept client connections.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("canAcceptClientConnections")
        private Boolean canAcceptClientConnections;

        /**
         * Specifies if the Read/Write endpoint of the DB System can accept client connections.
         *
         * @param canAcceptClientConnections the value to set
         * @return this builder
         **/
        public Builder canAcceptClientConnections(Boolean canAcceptClientConnections) {
            this.canAcceptClientConnections = canAcceptClientConnections;
            this.__explicitlySet__.add("canAcceptClientConnections");
            return this;
        }
        /**
         * Specifies if the DB System is in offline mode based on the value of the MySQL system variable
         * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode).
         * If True, access is allowed only to users with specific privileges. If False, access is allowed for all MySQL
         * user accounts.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInOfflineMode")
        private Boolean isInOfflineMode;

        /**
         * Specifies if the DB System is in offline mode based on the value of the MySQL system variable
         * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode).
         * If True, access is allowed only to users with specific privileges. If False, access is allowed for all MySQL
         * user accounts.
         *
         * @param isInOfflineMode the value to set
         * @return this builder
         **/
        public Builder isInOfflineMode(Boolean isInOfflineMode) {
            this.isInOfflineMode = isInOfflineMode;
            this.__explicitlySet__.add("isInOfflineMode");
            return this;
        }
        /**
         * Specifies if connected users can run write queries on the DB System.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isWritable")
        private Boolean isWritable;

        /**
         * Specifies if connected users can run write queries on the DB System.
         *
         * @param isWritable the value to set
         * @return this builder
         **/
        public Builder isWritable(Boolean isWritable) {
            this.isWritable = isWritable;
            this.__explicitlySet__.add("isWritable");
            return this;
        }
        /**
         * Specifies if the single MySQL instance in a standalone DB System or all MySQL instances in a highly available
         * DB System (excluding read replicas) are healthy.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areAllMysqlInstancesHealthy")
        private Boolean areAllMysqlInstancesHealthy;

        /**
         * Specifies if the single MySQL instance in a standalone DB System or all MySQL instances in a highly available
         * DB System (excluding read replicas) are healthy.
         *
         * @param areAllMysqlInstancesHealthy the value to set
         * @return this builder
         **/
        public Builder areAllMysqlInstancesHealthy(Boolean areAllMysqlInstancesHealthy) {
            this.areAllMysqlInstancesHealthy = areAllMysqlInstancesHealthy;
            this.__explicitlySet__.add("areAllMysqlInstancesHealthy");
            return this;
        }
        /**
         * Specifies if there is any MySQL instance (excluding read replicas) whose storage capacity is below [storage reserve]
         * (https://docs.oracle.com/en-us/iaas/mysql-database/doc/health-monitor.html#GUID-C6CE25C7-B728-4C80-B548-A76B42005C83.html).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isStorageFull")
        private Boolean isStorageFull;

        /**
         * Specifies if there is any MySQL instance (excluding read replicas) whose storage capacity is below [storage reserve]
         * (https://docs.oracle.com/en-us/iaas/mysql-database/doc/health-monitor.html#GUID-C6CE25C7-B728-4C80-B548-A76B42005C83.html).
         *
         * @param isStorageFull the value to set
         * @return this builder
         **/
        public Builder isStorageFull(Boolean isStorageFull) {
            this.isStorageFull = isStorageFull;
            this.__explicitlySet__.add("isStorageFull");
            return this;
        }
        /**
         * The GTID set on the DB System (either GTID_EXECUTED or GTID_AVAILABLE) as specified by the gtidSetType
         * parameter in the request.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gtidSet")
        private String gtidSet;

        /**
         * The GTID set on the DB System (either GTID_EXECUTED or GTID_AVAILABLE) as specified by the gtidSetType
         * parameter in the request.
         *
         * @param gtidSet the value to set
         * @return this builder
         **/
        public Builder gtidSet(String gtidSet) {
            this.gtidSet = gtidSet;
            this.__explicitlySet__.add("gtidSet");
            return this;
        }
        /**
         * Specifies if the GTID set in the gtidSetToApply parameter (if provided in the request) is fully applied
         * on the DB System. If gtidSetToApply is not provided in the request or is "", this field will be empty.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isGtidSetApplied")
        private Boolean isGtidSetApplied;

        /**
         * Specifies if the GTID set in the gtidSetToApply parameter (if provided in the request) is fully applied
         * on the DB System. If gtidSetToApply is not provided in the request or is "", this field will be empty.
         *
         * @param isGtidSetApplied the value to set
         * @return this builder
         **/
        public Builder isGtidSetApplied(Boolean isGtidSetApplied) {
            this.isGtidSetApplied = isGtidSetApplied;
            this.__explicitlySet__.add("isGtidSetApplied");
            return this;
        }
        /**
         * A list showing the status of the channels attached to the DB System for the requested channel IDs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("channelsStatus")
        private java.util.List<ChannelStatusResult> channelsStatus;

        /**
         * A list showing the status of the channels attached to the DB System for the requested channel IDs.
         *
         * @param channelsStatus the value to set
         * @return this builder
         **/
        public Builder channelsStatus(java.util.List<ChannelStatusResult> channelsStatus) {
            this.channelsStatus = channelsStatus;
            this.__explicitlySet__.add("channelsStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbSystemStatusResult build() {
            DbSystemStatusResult model =
                    new DbSystemStatusResult(
                            this.canAcceptClientConnections,
                            this.isInOfflineMode,
                            this.isWritable,
                            this.areAllMysqlInstancesHealthy,
                            this.isStorageFull,
                            this.gtidSet,
                            this.isGtidSetApplied,
                            this.channelsStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbSystemStatusResult model) {
            if (model.wasPropertyExplicitlySet("canAcceptClientConnections")) {
                this.canAcceptClientConnections(model.getCanAcceptClientConnections());
            }
            if (model.wasPropertyExplicitlySet("isInOfflineMode")) {
                this.isInOfflineMode(model.getIsInOfflineMode());
            }
            if (model.wasPropertyExplicitlySet("isWritable")) {
                this.isWritable(model.getIsWritable());
            }
            if (model.wasPropertyExplicitlySet("areAllMysqlInstancesHealthy")) {
                this.areAllMysqlInstancesHealthy(model.getAreAllMysqlInstancesHealthy());
            }
            if (model.wasPropertyExplicitlySet("isStorageFull")) {
                this.isStorageFull(model.getIsStorageFull());
            }
            if (model.wasPropertyExplicitlySet("gtidSet")) {
                this.gtidSet(model.getGtidSet());
            }
            if (model.wasPropertyExplicitlySet("isGtidSetApplied")) {
                this.isGtidSetApplied(model.getIsGtidSetApplied());
            }
            if (model.wasPropertyExplicitlySet("channelsStatus")) {
                this.channelsStatus(model.getChannelsStatus());
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
     * Specifies if the Read/Write endpoint of the DB System can accept client connections.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canAcceptClientConnections")
    private final Boolean canAcceptClientConnections;

    /**
     * Specifies if the Read/Write endpoint of the DB System can accept client connections.
     *
     * @return the value
     **/
    public Boolean getCanAcceptClientConnections() {
        return canAcceptClientConnections;
    }

    /**
     * Specifies if the DB System is in offline mode based on the value of the MySQL system variable
     * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode).
     * If True, access is allowed only to users with specific privileges. If False, access is allowed for all MySQL
     * user accounts.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInOfflineMode")
    private final Boolean isInOfflineMode;

    /**
     * Specifies if the DB System is in offline mode based on the value of the MySQL system variable
     * [offline_mode](https://dev.mysql.com/doc/en/server-system-variables.html#sysvar_offline_mode).
     * If True, access is allowed only to users with specific privileges. If False, access is allowed for all MySQL
     * user accounts.
     *
     * @return the value
     **/
    public Boolean getIsInOfflineMode() {
        return isInOfflineMode;
    }

    /**
     * Specifies if connected users can run write queries on the DB System.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isWritable")
    private final Boolean isWritable;

    /**
     * Specifies if connected users can run write queries on the DB System.
     *
     * @return the value
     **/
    public Boolean getIsWritable() {
        return isWritable;
    }

    /**
     * Specifies if the single MySQL instance in a standalone DB System or all MySQL instances in a highly available
     * DB System (excluding read replicas) are healthy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areAllMysqlInstancesHealthy")
    private final Boolean areAllMysqlInstancesHealthy;

    /**
     * Specifies if the single MySQL instance in a standalone DB System or all MySQL instances in a highly available
     * DB System (excluding read replicas) are healthy.
     *
     * @return the value
     **/
    public Boolean getAreAllMysqlInstancesHealthy() {
        return areAllMysqlInstancesHealthy;
    }

    /**
     * Specifies if there is any MySQL instance (excluding read replicas) whose storage capacity is below [storage reserve]
     * (https://docs.oracle.com/en-us/iaas/mysql-database/doc/health-monitor.html#GUID-C6CE25C7-B728-4C80-B548-A76B42005C83.html).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStorageFull")
    private final Boolean isStorageFull;

    /**
     * Specifies if there is any MySQL instance (excluding read replicas) whose storage capacity is below [storage reserve]
     * (https://docs.oracle.com/en-us/iaas/mysql-database/doc/health-monitor.html#GUID-C6CE25C7-B728-4C80-B548-A76B42005C83.html).
     *
     * @return the value
     **/
    public Boolean getIsStorageFull() {
        return isStorageFull;
    }

    /**
     * The GTID set on the DB System (either GTID_EXECUTED or GTID_AVAILABLE) as specified by the gtidSetType
     * parameter in the request.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gtidSet")
    private final String gtidSet;

    /**
     * The GTID set on the DB System (either GTID_EXECUTED or GTID_AVAILABLE) as specified by the gtidSetType
     * parameter in the request.
     *
     * @return the value
     **/
    public String getGtidSet() {
        return gtidSet;
    }

    /**
     * Specifies if the GTID set in the gtidSetToApply parameter (if provided in the request) is fully applied
     * on the DB System. If gtidSetToApply is not provided in the request or is "", this field will be empty.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGtidSetApplied")
    private final Boolean isGtidSetApplied;

    /**
     * Specifies if the GTID set in the gtidSetToApply parameter (if provided in the request) is fully applied
     * on the DB System. If gtidSetToApply is not provided in the request or is "", this field will be empty.
     *
     * @return the value
     **/
    public Boolean getIsGtidSetApplied() {
        return isGtidSetApplied;
    }

    /**
     * A list showing the status of the channels attached to the DB System for the requested channel IDs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("channelsStatus")
    private final java.util.List<ChannelStatusResult> channelsStatus;

    /**
     * A list showing the status of the channels attached to the DB System for the requested channel IDs.
     *
     * @return the value
     **/
    public java.util.List<ChannelStatusResult> getChannelsStatus() {
        return channelsStatus;
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
        sb.append("DbSystemStatusResult(");
        sb.append("super=").append(super.toString());
        sb.append("canAcceptClientConnections=")
                .append(String.valueOf(this.canAcceptClientConnections));
        sb.append(", isInOfflineMode=").append(String.valueOf(this.isInOfflineMode));
        sb.append(", isWritable=").append(String.valueOf(this.isWritable));
        sb.append(", areAllMysqlInstancesHealthy=")
                .append(String.valueOf(this.areAllMysqlInstancesHealthy));
        sb.append(", isStorageFull=").append(String.valueOf(this.isStorageFull));
        sb.append(", gtidSet=").append(String.valueOf(this.gtidSet));
        sb.append(", isGtidSetApplied=").append(String.valueOf(this.isGtidSetApplied));
        sb.append(", channelsStatus=").append(String.valueOf(this.channelsStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbSystemStatusResult)) {
            return false;
        }

        DbSystemStatusResult other = (DbSystemStatusResult) o;
        return java.util.Objects.equals(
                        this.canAcceptClientConnections, other.canAcceptClientConnections)
                && java.util.Objects.equals(this.isInOfflineMode, other.isInOfflineMode)
                && java.util.Objects.equals(this.isWritable, other.isWritable)
                && java.util.Objects.equals(
                        this.areAllMysqlInstancesHealthy, other.areAllMysqlInstancesHealthy)
                && java.util.Objects.equals(this.isStorageFull, other.isStorageFull)
                && java.util.Objects.equals(this.gtidSet, other.gtidSet)
                && java.util.Objects.equals(this.isGtidSetApplied, other.isGtidSetApplied)
                && java.util.Objects.equals(this.channelsStatus, other.channelsStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.canAcceptClientConnections == null
                                ? 43
                                : this.canAcceptClientConnections.hashCode());
        result =
                (result * PRIME)
                        + (this.isInOfflineMode == null ? 43 : this.isInOfflineMode.hashCode());
        result = (result * PRIME) + (this.isWritable == null ? 43 : this.isWritable.hashCode());
        result =
                (result * PRIME)
                        + (this.areAllMysqlInstancesHealthy == null
                                ? 43
                                : this.areAllMysqlInstancesHealthy.hashCode());
        result =
                (result * PRIME)
                        + (this.isStorageFull == null ? 43 : this.isStorageFull.hashCode());
        result = (result * PRIME) + (this.gtidSet == null ? 43 : this.gtidSet.hashCode());
        result =
                (result * PRIME)
                        + (this.isGtidSetApplied == null ? 43 : this.isGtidSetApplied.hashCode());
        result =
                (result * PRIME)
                        + (this.channelsStatus == null ? 43 : this.channelsStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
