/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
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
        builder = DataGuardAssociation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataGuardAssociation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "databaseId",
        "role",
        "lifecycleState",
        "lifecycleDetails",
        "peerDbSystemId",
        "peerDbHomeId",
        "peerDatabaseId",
        "peerDataGuardAssociationId",
        "peerRole",
        "applyLag",
        "applyRate",
        "protectionMode",
        "transportType",
        "timeCreated",
        "isActiveDataGuardEnabled"
    })
    public DataGuardAssociation(
            String id,
            String databaseId,
            Role role,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String peerDbSystemId,
            String peerDbHomeId,
            String peerDatabaseId,
            String peerDataGuardAssociationId,
            PeerRole peerRole,
            String applyLag,
            String applyRate,
            ProtectionMode protectionMode,
            TransportType transportType,
            java.util.Date timeCreated,
            Boolean isActiveDataGuardEnabled) {
        super();
        this.id = id;
        this.databaseId = databaseId;
        this.role = role;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.peerDbSystemId = peerDbSystemId;
        this.peerDbHomeId = peerDbHomeId;
        this.peerDatabaseId = peerDatabaseId;
        this.peerDataGuardAssociationId = peerDataGuardAssociationId;
        this.peerRole = peerRole;
        this.applyLag = applyLag;
        this.applyRate = applyRate;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.timeCreated = timeCreated;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Data Guard association.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Data Guard association.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * reporting database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * reporting database.
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
        /** The current state of the Data Guard association. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Data Guard association.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycleState, if available. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycleState, if available.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system containing the associated peer database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
        private String peerDbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system containing the associated peer database.
         *
         * @param peerDbSystemId the value to set
         * @return this builder
         */
        public Builder peerDbSystemId(String peerDbSystemId) {
            this.peerDbSystemId = peerDbSystemId;
            this.__explicitlySet__.add("peerDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Database Home containing the associated peer database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
        private String peerDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Database Home containing the associated peer database.
         *
         * @param peerDbHomeId the value to set
         * @return this builder
         */
        public Builder peerDbHomeId(String peerDbHomeId) {
            this.peerDbHomeId = peerDbHomeId;
            this.__explicitlySet__.add("peerDbHomeId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * associated peer database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDatabaseId")
        private String peerDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * associated peer database.
         *
         * @param peerDatabaseId the value to set
         * @return this builder
         */
        public Builder peerDatabaseId(String peerDatabaseId) {
            this.peerDatabaseId = peerDatabaseId;
            this.__explicitlySet__.add("peerDatabaseId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * peer database's Data Guard association.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDataGuardAssociationId")
        private String peerDataGuardAssociationId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * peer database's Data Guard association.
         *
         * @param peerDataGuardAssociationId the value to set
         * @return this builder
         */
        public Builder peerDataGuardAssociationId(String peerDataGuardAssociationId) {
            this.peerDataGuardAssociationId = peerDataGuardAssociationId;
            this.__explicitlySet__.add("peerDataGuardAssociationId");
            return this;
        }
        /** The role of the peer database in this Data Guard association. */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
        private PeerRole peerRole;

        /**
         * The role of the peer database in this Data Guard association.
         *
         * @param peerRole the value to set
         * @return this builder
         */
        public Builder peerRole(PeerRole peerRole) {
            this.peerRole = peerRole;
            this.__explicitlySet__.add("peerRole");
            return this;
        }
        /**
         * The lag time between updates to the primary database and application of the redo data on
         * the standby database, as computed by the reporting database.
         *
         * <p>Example: {@code 9 seconds}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
        private String applyLag;

        /**
         * The lag time between updates to the primary database and application of the redo data on
         * the standby database, as computed by the reporting database.
         *
         * <p>Example: {@code 9 seconds}
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
         * <p>Example: {@code 180 Mb per second}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
        private String applyRate;

        /**
         * The rate at which redo logs are synced between the associated databases.
         *
         * <p>Example: {@code 180 Mb per second}
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
         * The protection mode of this Data Guard association. For more information, see [Oracle
         * Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Data Guard association. For more information, see [Oracle
         * Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The redo transport type used by this Data Guard association. For more information, see
         * [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The redo transport type used by this Data Guard association. For more information, see
         * [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }
        /** The date and time the Data Guard association was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Data Guard association was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataGuardAssociation build() {
            DataGuardAssociation model =
                    new DataGuardAssociation(
                            this.id,
                            this.databaseId,
                            this.role,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.peerDbSystemId,
                            this.peerDbHomeId,
                            this.peerDatabaseId,
                            this.peerDataGuardAssociationId,
                            this.peerRole,
                            this.applyLag,
                            this.applyRate,
                            this.protectionMode,
                            this.transportType,
                            this.timeCreated,
                            this.isActiveDataGuardEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataGuardAssociation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("role")) {
                this.role(model.getRole());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("peerDbSystemId")) {
                this.peerDbSystemId(model.getPeerDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("peerDbHomeId")) {
                this.peerDbHomeId(model.getPeerDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("peerDatabaseId")) {
                this.peerDatabaseId(model.getPeerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("peerDataGuardAssociationId")) {
                this.peerDataGuardAssociationId(model.getPeerDataGuardAssociationId());
            }
            if (model.wasPropertyExplicitlySet("peerRole")) {
                this.peerRole(model.getPeerRole());
            }
            if (model.wasPropertyExplicitlySet("applyLag")) {
                this.applyLag(model.getApplyLag());
            }
            if (model.wasPropertyExplicitlySet("applyRate")) {
                this.applyRate(model.getApplyRate());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Data Guard association.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Data Guard association.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * reporting database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * reporting database.
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

    /** The current state of the Data Guard association. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        Upgrading("UPGRADING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the Data Guard association. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Data Guard association.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycleState, if available. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycleState, if available.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system containing the associated peer database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
    private final String peerDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system containing the associated peer database.
     *
     * @return the value
     */
    public String getPeerDbSystemId() {
        return peerDbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home containing the associated peer database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
    private final String peerDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Database Home containing the associated peer database.
     *
     * @return the value
     */
    public String getPeerDbHomeId() {
        return peerDbHomeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * associated peer database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDatabaseId")
    private final String peerDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * associated peer database.
     *
     * @return the value
     */
    public String getPeerDatabaseId() {
        return peerDatabaseId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * peer database's Data Guard association.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDataGuardAssociationId")
    private final String peerDataGuardAssociationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * peer database's Data Guard association.
     *
     * @return the value
     */
    public String getPeerDataGuardAssociationId() {
        return peerDataGuardAssociationId;
    }

    /** The role of the peer database in this Data Guard association. */
    public enum PeerRole implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PeerRole.class);

        private final String value;
        private static java.util.Map<String, PeerRole> map;

        static {
            map = new java.util.HashMap<>();
            for (PeerRole v : PeerRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PeerRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PeerRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PeerRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The role of the peer database in this Data Guard association. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
    private final PeerRole peerRole;

    /**
     * The role of the peer database in this Data Guard association.
     *
     * @return the value
     */
    public PeerRole getPeerRole() {
        return peerRole;
    }

    /**
     * The lag time between updates to the primary database and application of the redo data on the
     * standby database, as computed by the reporting database.
     *
     * <p>Example: {@code 9 seconds}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
    private final String applyLag;

    /**
     * The lag time between updates to the primary database and application of the redo data on the
     * standby database, as computed by the reporting database.
     *
     * <p>Example: {@code 9 seconds}
     *
     * @return the value
     */
    public String getApplyLag() {
        return applyLag;
    }

    /**
     * The rate at which redo logs are synced between the associated databases.
     *
     * <p>Example: {@code 180 Mb per second}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
    private final String applyRate;

    /**
     * The rate at which redo logs are synced between the associated databases.
     *
     * <p>Example: {@code 180 Mb per second}
     *
     * @return the value
     */
    public String getApplyRate() {
        return applyRate;
    }

    /**
     * The protection mode of this Data Guard association. For more information, see [Oracle Data
     * Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        MaximumProtection("MAXIMUM_PROTECTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ProtectionMode.class);

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ProtectionMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The protection mode of this Data Guard association. For more information, see [Oracle Data
     * Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Data Guard association. For more information, see [Oracle Data
     * Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The redo transport type used by this Data Guard association. For more information, see [Redo
     * Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
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
     * The redo transport type used by this Data Guard association. For more information, see [Redo
     * Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type used by this Data Guard association. For more information, see [Redo
     * Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public TransportType getTransportType() {
        return transportType;
    }

    /** The date and time the Data Guard association was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Data Guard association was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("DataGuardAssociation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", peerDbSystemId=").append(String.valueOf(this.peerDbSystemId));
        sb.append(", peerDbHomeId=").append(String.valueOf(this.peerDbHomeId));
        sb.append(", peerDatabaseId=").append(String.valueOf(this.peerDatabaseId));
        sb.append(", peerDataGuardAssociationId=")
                .append(String.valueOf(this.peerDataGuardAssociationId));
        sb.append(", peerRole=").append(String.valueOf(this.peerRole));
        sb.append(", applyLag=").append(String.valueOf(this.applyLag));
        sb.append(", applyRate=").append(String.valueOf(this.applyRate));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
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
        if (!(o instanceof DataGuardAssociation)) {
            return false;
        }

        DataGuardAssociation other = (DataGuardAssociation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.peerDbSystemId, other.peerDbSystemId)
                && java.util.Objects.equals(this.peerDbHomeId, other.peerDbHomeId)
                && java.util.Objects.equals(this.peerDatabaseId, other.peerDatabaseId)
                && java.util.Objects.equals(
                        this.peerDataGuardAssociationId, other.peerDataGuardAssociationId)
                && java.util.Objects.equals(this.peerRole, other.peerRole)
                && java.util.Objects.equals(this.applyLag, other.applyLag)
                && java.util.Objects.equals(this.applyRate, other.applyRate)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDbSystemId == null ? 43 : this.peerDbSystemId.hashCode());
        result = (result * PRIME) + (this.peerDbHomeId == null ? 43 : this.peerDbHomeId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDatabaseId == null ? 43 : this.peerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDataGuardAssociationId == null
                                ? 43
                                : this.peerDataGuardAssociationId.hashCode());
        result = (result * PRIME) + (this.peerRole == null ? 43 : this.peerRole.hashCode());
        result = (result * PRIME) + (this.applyLag == null ? 43 : this.applyLag.hashCode());
        result = (result * PRIME) + (this.applyRate == null ? 43 : this.applyRate.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.isActiveDataGuardEnabled == null
                                ? 43
                                : this.isActiveDataGuardEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
