/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The member of a Data Guard group. Represents either a PRIMARY or a STANDBY Data Guard instance.
 * <br>
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
        builder = DataGuardGroupMember.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataGuardGroupMember
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dbSystemId",
        "databaseId",
        "role",
        "applyLag",
        "applyRate",
        "transportLag",
        "transportLagRefresh",
        "transportType",
        "isActiveDataGuardEnabled",
        "switchoverReadiness",
        "switchoverReadinessMessage",
        "failoverReadiness",
        "failoverReadinessMessage",
        "dataLossExposure",
        "timeUpdated"
    })
    public DataGuardGroupMember(
            String dbSystemId,
            String databaseId,
            Role role,
            String applyLag,
            String applyRate,
            String transportLag,
            String transportLagRefresh,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled,
            SwitchoverReadiness switchoverReadiness,
            String switchoverReadinessMessage,
            FailoverReadiness failoverReadiness,
            String failoverReadinessMessage,
            String dataLossExposure,
            java.util.Date timeUpdated) {
        super();
        this.dbSystemId = dbSystemId;
        this.databaseId = databaseId;
        this.role = role;
        this.applyLag = applyLag;
        this.applyRate = applyRate;
        this.transportLag = transportLag;
        this.transportLagRefresh = transportLagRefresh;
        this.transportType = transportType;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.switchoverReadiness = switchoverReadiness;
        this.switchoverReadinessMessage = switchoverReadinessMessage;
        this.failoverReadiness = failoverReadiness;
        this.failoverReadinessMessage = failoverReadinessMessage;
        this.dataLossExposure = dataLossExposure;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB system, Cloud VM cluster or VM cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB system, Cloud VM cluster or VM cluster.
         *
         * @param dbSystemId the value to set
         * @return this builder
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** The role of the reporting database in this Data Guard association. */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the reporting database in this Data Guard association.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The lag time between updates to the primary database and application of the redo data on
         * the standby database, as computed by the reporting database.
         *
         * <p>Example: {@code 1 second}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
        private String applyLag;

        /**
         * The lag time between updates to the primary database and application of the redo data on
         * the standby database, as computed by the reporting database.
         *
         * <p>Example: {@code 1 second}
         *
         * @param applyLag the value to set
         * @return this builder
         */
        public Builder applyLag(String applyLag) {
            this.applyLag = applyLag;
            this.__explicitlySet__.add("applyLag");
            return this;
        }
        /**
         * The rate at which redo logs are synced between the associated databases.
         *
         * <p>Example: {@code 102.96 MByte/s}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
        private String applyRate;

        /**
         * The rate at which redo logs are synced between the associated databases.
         *
         * <p>Example: {@code 102.96 MByte/s}
         *
         * @param applyRate the value to set
         * @return this builder
         */
        public Builder applyRate(String applyRate) {
            this.applyRate = applyRate;
            this.__explicitlySet__.add("applyRate");
            return this;
        }
        /**
         * The rate at which redo logs are transported between the associated databases.
         *
         * <p>Example: {@code 1 second}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
        private String transportLag;

        /**
         * The rate at which redo logs are transported between the associated databases.
         *
         * <p>Example: {@code 1 second}
         *
         * @param transportLag the value to set
         * @return this builder
         */
        public Builder transportLag(String transportLag) {
            this.transportLag = transportLag;
            this.__explicitlySet__.add("transportLag");
            return this;
        }
        /** The date and time when last redo transport has been done. */
        @com.fasterxml.jackson.annotation.JsonProperty("transportLagRefresh")
        private String transportLagRefresh;

        /**
         * The date and time when last redo transport has been done.
         *
         * @param transportLagRefresh the value to set
         * @return this builder
         */
        public Builder transportLagRefresh(String transportLagRefresh) {
            this.transportLagRefresh = transportLagRefresh;
            this.__explicitlySet__.add("transportLagRefresh");
            return this;
        }
        /**
         * The redo transport type to use for this Data Guard association. Valid values depend on
         * the specified {@code protectionMode}:
         *
         * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC *
         * MAXIMUM_PROTECTION - SYNC
         *
         * <p>For more information, see [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         *
         * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
         * ASYNC.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association. Valid values depend on
         * the specified {@code protectionMode}:
         *
         * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC *
         * MAXIMUM_PROTECTION - SYNC
         *
         * <p>For more information, see [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         *
         * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
         * ASYNC.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }
        /** True if active Data Guard is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        /**
         * True if active Data Guard is enabled.
         *
         * @param isActiveDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
            return this;
        }
        /** The switchover readiness status of the Data Guard member. */
        @com.fasterxml.jackson.annotation.JsonProperty("switchoverReadiness")
        private SwitchoverReadiness switchoverReadiness;

        /**
         * The switchover readiness status of the Data Guard member.
         *
         * @param switchoverReadiness the value to set
         * @return this builder
         */
        public Builder switchoverReadiness(SwitchoverReadiness switchoverReadiness) {
            this.switchoverReadiness = switchoverReadiness;
            this.__explicitlySet__.add("switchoverReadiness");
            return this;
        }
        /**
         * The message explaining switchover readiness status. Example: {@code Address failed checks
         * to avoid extended downtime.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("switchoverReadinessMessage")
        private String switchoverReadinessMessage;

        /**
         * The message explaining switchover readiness status. Example: {@code Address failed checks
         * to avoid extended downtime.}
         *
         * @param switchoverReadinessMessage the value to set
         * @return this builder
         */
        public Builder switchoverReadinessMessage(String switchoverReadinessMessage) {
            this.switchoverReadinessMessage = switchoverReadinessMessage;
            this.__explicitlySet__.add("switchoverReadinessMessage");
            return this;
        }
        /** The failover readiness status of the Data Guard member. */
        @com.fasterxml.jackson.annotation.JsonProperty("failoverReadiness")
        private FailoverReadiness failoverReadiness;

        /**
         * The failover readiness status of the Data Guard member.
         *
         * @param failoverReadiness the value to set
         * @return this builder
         */
        public Builder failoverReadiness(FailoverReadiness failoverReadiness) {
            this.failoverReadiness = failoverReadiness;
            this.__explicitlySet__.add("failoverReadiness");
            return this;
        }
        /**
         * The message explaining failover readiness status. Example: {@code This standby database
         * is not failover ready.}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("failoverReadinessMessage")
        private String failoverReadinessMessage;

        /**
         * The message explaining failover readiness status. Example: {@code This standby database
         * is not failover ready.}
         *
         * @param failoverReadinessMessage the value to set
         * @return this builder
         */
        public Builder failoverReadinessMessage(String failoverReadinessMessage) {
            this.failoverReadinessMessage = failoverReadinessMessage;
            this.__explicitlySet__.add("failoverReadinessMessage");
            return this;
        }
        /**
         * The Data loss exposure is the redo transport lag between the primary and standby
         * databases.
         *
         * <p>Example: {@code 2 seconds}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataLossExposure")
        private String dataLossExposure;

        /**
         * The Data loss exposure is the redo transport lag between the primary and standby
         * databases.
         *
         * <p>Example: {@code 2 seconds}
         *
         * @param dataLossExposure the value to set
         * @return this builder
         */
        public Builder dataLossExposure(String dataLossExposure) {
            this.dataLossExposure = dataLossExposure;
            this.__explicitlySet__.add("dataLossExposure");
            return this;
        }
        /** The date and time when the last successful Data Guard refresh occurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time when the last successful Data Guard refresh occurred.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataGuardGroupMember build() {
            DataGuardGroupMember model =
                    new DataGuardGroupMember(
                            this.dbSystemId,
                            this.databaseId,
                            this.role,
                            this.applyLag,
                            this.applyRate,
                            this.transportLag,
                            this.transportLagRefresh,
                            this.transportType,
                            this.isActiveDataGuardEnabled,
                            this.switchoverReadiness,
                            this.switchoverReadinessMessage,
                            this.failoverReadiness,
                            this.failoverReadinessMessage,
                            this.dataLossExposure,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataGuardGroupMember model) {
            if (model.wasPropertyExplicitlySet("dbSystemId")) {
                this.dbSystemId(model.getDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("applyLag")) {
                this.applyLag(model.getApplyLag());
            }
            if (model.wasPropertyExplicitlySet("applyRate")) {
                this.applyRate(model.getApplyRate());
            }
            if (model.wasPropertyExplicitlySet("transportLag")) {
                this.transportLag(model.getTransportLag());
            }
            if (model.wasPropertyExplicitlySet("transportLagRefresh")) {
                this.transportLagRefresh(model.getTransportLagRefresh());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("switchoverReadiness")) {
                this.switchoverReadiness(model.getSwitchoverReadiness());
            }
            if (model.wasPropertyExplicitlySet("switchoverReadinessMessage")) {
                this.switchoverReadinessMessage(model.getSwitchoverReadinessMessage());
            }
            if (model.wasPropertyExplicitlySet("failoverReadiness")) {
                this.failoverReadiness(model.getFailoverReadiness());
            }
            if (model.wasPropertyExplicitlySet("failoverReadinessMessage")) {
                this.failoverReadinessMessage(model.getFailoverReadinessMessage());
            }
            if (model.wasPropertyExplicitlySet("dataLossExposure")) {
                this.dataLossExposure(model.getDataLossExposure());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * system, Cloud VM cluster or VM cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * system, Cloud VM cluster or VM cluster.
     *
     * @return the value
     */
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** The role of the reporting database in this Data Guard association. */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),
        SnapshotStandby("SNAPSHOT_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Role.class);

        private final String value;
        private static java.util.Map<String, Role> map;

        static {
            map = new java.util.HashMap<>();
            for (Role v : Role.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Role(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Role create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Role', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The role of the reporting database in this Data Guard association. */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the reporting database in this Data Guard association.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /**
     * The lag time between updates to the primary database and application of the redo data on the
     * standby database, as computed by the reporting database.
     *
     * <p>Example: {@code 1 second}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
    private final String applyLag;

    /**
     * The lag time between updates to the primary database and application of the redo data on the
     * standby database, as computed by the reporting database.
     *
     * <p>Example: {@code 1 second}
     *
     * @return the value
     */
    public String getApplyLag() {
        return applyLag;
    }

    /**
     * The rate at which redo logs are synced between the associated databases.
     *
     * <p>Example: {@code 102.96 MByte/s}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
    private final String applyRate;

    /**
     * The rate at which redo logs are synced between the associated databases.
     *
     * <p>Example: {@code 102.96 MByte/s}
     *
     * @return the value
     */
    public String getApplyRate() {
        return applyRate;
    }

    /**
     * The rate at which redo logs are transported between the associated databases.
     *
     * <p>Example: {@code 1 second}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
    private final String transportLag;

    /**
     * The rate at which redo logs are transported between the associated databases.
     *
     * <p>Example: {@code 1 second}
     *
     * @return the value
     */
    public String getTransportLag() {
        return transportLag;
    }

    /** The date and time when last redo transport has been done. */
    @com.fasterxml.jackson.annotation.JsonProperty("transportLagRefresh")
    private final String transportLagRefresh;

    /**
     * The date and time when last redo transport has been done.
     *
     * @return the value
     */
    public String getTransportLagRefresh() {
        return transportLagRefresh;
    }

    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified {@code protectionMode}:
     *
     * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC * MAXIMUM_PROTECTION
     * - SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
     * ASYNC.
     */
    public enum TransportType implements com.oracle.bmc.http.internal.BmcEnum {
        Sync("SYNC"),
        Async("ASYNC"),
        Fastsync("FASTSYNC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TransportType.class);

        private final String value;
        private static java.util.Map<String, TransportType> map;

        static {
            map = new java.util.HashMap<>();
            for (TransportType v : TransportType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TransportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TransportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TransportType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified {@code protectionMode}:
     *
     * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC * MAXIMUM_PROTECTION
     * - SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
     * ASYNC.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified {@code protectionMode}:
     *
     * <p>MAXIMUM_AVAILABILITY - SYNC or FASTSYNC * MAXIMUM_PERFORMANCE - ASYNC * MAXIMUM_PROTECTION
     * - SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * <p>*IMPORTANT** - The only transport type currently supported by the Database service is
     * ASYNC.
     *
     * @return the value
     */
    public TransportType getTransportType() {
        return transportType;
    }

    /** True if active Data Guard is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    private final Boolean isActiveDataGuardEnabled;

    /**
     * True if active Data Guard is enabled.
     *
     * @return the value
     */
    public Boolean getIsActiveDataGuardEnabled() {
        return isActiveDataGuardEnabled;
    }

    /** The switchover readiness status of the Data Guard member. */
    public enum SwitchoverReadiness implements com.oracle.bmc.http.internal.BmcEnum {
        Healthy("HEALTHY"),
        Warning("WARNING"),
        Critical("CRITICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SwitchoverReadiness.class);

        private final String value;
        private static java.util.Map<String, SwitchoverReadiness> map;

        static {
            map = new java.util.HashMap<>();
            for (SwitchoverReadiness v : SwitchoverReadiness.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SwitchoverReadiness(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SwitchoverReadiness create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SwitchoverReadiness', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The switchover readiness status of the Data Guard member. */
    @com.fasterxml.jackson.annotation.JsonProperty("switchoverReadiness")
    private final SwitchoverReadiness switchoverReadiness;

    /**
     * The switchover readiness status of the Data Guard member.
     *
     * @return the value
     */
    public SwitchoverReadiness getSwitchoverReadiness() {
        return switchoverReadiness;
    }

    /**
     * The message explaining switchover readiness status. Example: {@code Address failed checks to
     * avoid extended downtime.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("switchoverReadinessMessage")
    private final String switchoverReadinessMessage;

    /**
     * The message explaining switchover readiness status. Example: {@code Address failed checks to
     * avoid extended downtime.}
     *
     * @return the value
     */
    public String getSwitchoverReadinessMessage() {
        return switchoverReadinessMessage;
    }

    /** The failover readiness status of the Data Guard member. */
    public enum FailoverReadiness implements com.oracle.bmc.http.internal.BmcEnum {
        Healthy("HEALTHY"),
        Warning("WARNING"),
        Critical("CRITICAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FailoverReadiness.class);

        private final String value;
        private static java.util.Map<String, FailoverReadiness> map;

        static {
            map = new java.util.HashMap<>();
            for (FailoverReadiness v : FailoverReadiness.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FailoverReadiness(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FailoverReadiness create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FailoverReadiness', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The failover readiness status of the Data Guard member. */
    @com.fasterxml.jackson.annotation.JsonProperty("failoverReadiness")
    private final FailoverReadiness failoverReadiness;

    /**
     * The failover readiness status of the Data Guard member.
     *
     * @return the value
     */
    public FailoverReadiness getFailoverReadiness() {
        return failoverReadiness;
    }

    /**
     * The message explaining failover readiness status. Example: {@code This standby database is
     * not failover ready.}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("failoverReadinessMessage")
    private final String failoverReadinessMessage;

    /**
     * The message explaining failover readiness status. Example: {@code This standby database is
     * not failover ready.}
     *
     * @return the value
     */
    public String getFailoverReadinessMessage() {
        return failoverReadinessMessage;
    }

    /**
     * The Data loss exposure is the redo transport lag between the primary and standby databases.
     *
     * <p>Example: {@code 2 seconds}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataLossExposure")
    private final String dataLossExposure;

    /**
     * The Data loss exposure is the redo transport lag between the primary and standby databases.
     *
     * <p>Example: {@code 2 seconds}
     *
     * @return the value
     */
    public String getDataLossExposure() {
        return dataLossExposure;
    }

    /** The date and time when the last successful Data Guard refresh occurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time when the last successful Data Guard refresh occurred.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DataGuardGroupMember(");
        sb.append("super=").append(super.toString());
        sb.append("dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", applyLag=").append(String.valueOf(this.applyLag));
        sb.append(", applyRate=").append(String.valueOf(this.applyRate));
        sb.append(", transportLag=").append(String.valueOf(this.transportLag));
        sb.append(", transportLagRefresh=").append(String.valueOf(this.transportLagRefresh));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", isActiveDataGuardEnabled=")
                .append(String.valueOf(this.isActiveDataGuardEnabled));
        sb.append(", switchoverReadiness=").append(String.valueOf(this.switchoverReadiness));
        sb.append(", switchoverReadinessMessage=")
                .append(String.valueOf(this.switchoverReadinessMessage));
        sb.append(", failoverReadiness=").append(String.valueOf(this.failoverReadiness));
        sb.append(", failoverReadinessMessage=")
                .append(String.valueOf(this.failoverReadinessMessage));
        sb.append(", dataLossExposure=").append(String.valueOf(this.dataLossExposure));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataGuardGroupMember)) {
            return false;
        }

        DataGuardGroupMember other = (DataGuardGroupMember) o;
        return java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.applyLag, other.applyLag)
                && java.util.Objects.equals(this.applyRate, other.applyRate)
                && java.util.Objects.equals(this.transportLag, other.transportLag)
                && java.util.Objects.equals(this.transportLagRefresh, other.transportLagRefresh)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && java.util.Objects.equals(this.switchoverReadiness, other.switchoverReadiness)
                && java.util.Objects.equals(
                        this.switchoverReadinessMessage, other.switchoverReadinessMessage)
                && java.util.Objects.equals(this.failoverReadiness, other.failoverReadiness)
                && java.util.Objects.equals(
                        this.failoverReadinessMessage, other.failoverReadinessMessage)
                && java.util.Objects.equals(this.dataLossExposure, other.dataLossExposure)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result = (result * PRIME) + (this.applyLag == null ? 43 : this.applyLag.hashCode());
        result = (result * PRIME) + (this.applyRate == null ? 43 : this.applyRate.hashCode());
        result = (result * PRIME) + (this.transportLag == null ? 43 : this.transportLag.hashCode());
        result =
                (result * PRIME)
                        + (this.transportLagRefresh == null
                                ? 43
                                : this.transportLagRefresh.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result =
                (result * PRIME)
                        + (this.isActiveDataGuardEnabled == null
                                ? 43
                                : this.isActiveDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.switchoverReadiness == null
                                ? 43
                                : this.switchoverReadiness.hashCode());
        result =
                (result * PRIME)
                        + (this.switchoverReadinessMessage == null
                                ? 43
                                : this.switchoverReadinessMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.failoverReadiness == null ? 43 : this.failoverReadiness.hashCode());
        result =
                (result * PRIME)
                        + (this.failoverReadinessMessage == null
                                ? 43
                                : this.failoverReadinessMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.dataLossExposure == null ? 43 : this.dataLossExposure.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
