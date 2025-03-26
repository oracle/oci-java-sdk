/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The member of a Data Guard group. Represents either a PRIMARY or a STANDBY Data Guard instance.
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
    builder = DataGuardGroupMember.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataGuardGroupMember extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        "isActiveDataGuardEnabled"
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
            Boolean isActiveDataGuardEnabled) {
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
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system, Cloud VM cluster or VM cluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
        private String dbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system, Cloud VM cluster or VM cluster.
         * @param dbSystemId the value to set
         * @return this builder
         **/
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            this.__explicitlySet__.add("dbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database.
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * The role of the reporting database in this Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The role of the reporting database in this Data Guard association.
         * @param role the value to set
         * @return this builder
         **/
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /**
         * The lag time between updates to the primary database and application of the redo data on the standby database,
         * as computed by the reporting database.
         * <p>
         * Example: {@code 1 second}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
        private String applyLag;

        /**
         * The lag time between updates to the primary database and application of the redo data on the standby database,
         * as computed by the reporting database.
         * <p>
         * Example: {@code 1 second}
         *
         * @param applyLag the value to set
         * @return this builder
         **/
        public Builder applyLag(String applyLag) {
            this.applyLag = applyLag;
            this.__explicitlySet__.add("applyLag");
            return this;
        }
        /**
         * The rate at which redo logs are synced between the associated databases.
         * <p>
         * Example: {@code 102.96 MByte/s}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
        private String applyRate;

        /**
         * The rate at which redo logs are synced between the associated databases.
         * <p>
         * Example: {@code 102.96 MByte/s}
         *
         * @param applyRate the value to set
         * @return this builder
         **/
        public Builder applyRate(String applyRate) {
            this.applyRate = applyRate;
            this.__explicitlySet__.add("applyRate");
            return this;
        }
        /**
         * The rate at which redo logs are transported between the associated databases.
         * <p>
         * Example: {@code 1 second}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
        private String transportLag;

        /**
         * The rate at which redo logs are transported between the associated databases.
         * <p>
         * Example: {@code 1 second}
         *
         * @param transportLag the value to set
         * @return this builder
         **/
        public Builder transportLag(String transportLag) {
            this.transportLag = transportLag;
            this.__explicitlySet__.add("transportLag");
            return this;
        }
        /**
         * The date and time when last redo transport has been done.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportLagRefresh")
        private String transportLagRefresh;

        /**
         * The date and time when last redo transport has been done.
         * @param transportLagRefresh the value to set
         * @return this builder
         **/
        public Builder transportLagRefresh(String transportLagRefresh) {
            this.transportLagRefresh = transportLagRefresh;
            this.__explicitlySet__.add("transportLagRefresh");
            return this;
        }
        /**
         * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
         * <p>
         * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
         * * MAXIMUM_PERFORMANCE - ASYNC
         * * MAXIMUM_PROTECTION - SYNC
         * <p>
         * For more information, see
         * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         * <p>
         **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
         * <p>
         * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
         * * MAXIMUM_PERFORMANCE - ASYNC
         * * MAXIMUM_PROTECTION - SYNC
         * <p>
         * For more information, see
         * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         * <p>
         **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
         *
         * @param transportType the value to set
         * @return this builder
         **/
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }
        /**
         * True if active Data Guard is enabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        /**
         * True if active Data Guard is enabled.
         * @param isActiveDataGuardEnabled the value to set
         * @return this builder
         **/
        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
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
                            this.isActiveDataGuardEnabled);
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system, Cloud VM cluster or VM cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemId")
    private final String dbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB system, Cloud VM cluster or VM cluster.
     * @return the value
     **/
    public String getDbSystemId() {
        return dbSystemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database.
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * The role of the reporting database in this Data Guard association.
     **/
    public enum Role {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The role of the reporting database in this Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The role of the reporting database in this Data Guard association.
     * @return the value
     **/
    public Role getRole() {
        return role;
    }

    /**
     * The lag time between updates to the primary database and application of the redo data on the standby database,
     * as computed by the reporting database.
     * <p>
     * Example: {@code 1 second}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
    private final String applyLag;

    /**
     * The lag time between updates to the primary database and application of the redo data on the standby database,
     * as computed by the reporting database.
     * <p>
     * Example: {@code 1 second}
     *
     * @return the value
     **/
    public String getApplyLag() {
        return applyLag;
    }

    /**
     * The rate at which redo logs are synced between the associated databases.
     * <p>
     * Example: {@code 102.96 MByte/s}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
    private final String applyRate;

    /**
     * The rate at which redo logs are synced between the associated databases.
     * <p>
     * Example: {@code 102.96 MByte/s}
     *
     * @return the value
     **/
    public String getApplyRate() {
        return applyRate;
    }

    /**
     * The rate at which redo logs are transported between the associated databases.
     * <p>
     * Example: {@code 1 second}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
    private final String transportLag;

    /**
     * The rate at which redo logs are transported between the associated databases.
     * <p>
     * Example: {@code 1 second}
     *
     * @return the value
     **/
    public String getTransportLag() {
        return transportLag;
    }

    /**
     * The date and time when last redo transport has been done.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportLagRefresh")
    private final String transportLagRefresh;

    /**
     * The date and time when last redo transport has been done.
     * @return the value
     **/
    public String getTransportLagRefresh() {
        return transportLagRefresh;
    }

    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     **/
    public enum TransportType {
        Sync("SYNC"),
        Async("ASYNC"),
        Fastsync("FASTSYNC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     * @return the value
     **/
    public TransportType getTransportType() {
        return transportType;
    }

    /**
     * True if active Data Guard is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    private final Boolean isActiveDataGuardEnabled;

    /**
     * True if active Data Guard is enabled.
     * @return the value
     **/
    public Boolean getIsActiveDataGuardEnabled() {
        return isActiveDataGuardEnabled;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
