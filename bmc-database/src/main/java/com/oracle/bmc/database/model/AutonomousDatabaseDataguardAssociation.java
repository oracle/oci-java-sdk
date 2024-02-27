/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The properties that define dataguard association between two different Autonomous Databases. Note
 * that Autonomous Databases inherit DataGuard association from parent Autonomous Container
 * Database. No actions can be taken on AutonomousDatabaseDataguardAssociation, usage is strictly
 * informational. <br>
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
        builder = AutonomousDatabaseDataguardAssociation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseDataguardAssociation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "autonomousDatabaseId",
        "role",
        "lifecycleState",
        "lifecycleDetails",
        "peerRole",
        "peerAutonomousDatabaseId",
        "peerAutonomousDatabaseLifeCycleState",
        "protectionMode",
        "applyLag",
        "applyRate",
        "isAutomaticFailoverEnabled",
        "transportLag",
        "timeLastSynced",
        "timeCreated",
        "timeLastRoleChanged"
    })
    public AutonomousDatabaseDataguardAssociation(
            String id,
            String autonomousDatabaseId,
            Role role,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            PeerRole peerRole,
            String peerAutonomousDatabaseId,
            PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState,
            ProtectionMode protectionMode,
            String applyLag,
            String applyRate,
            Boolean isAutomaticFailoverEnabled,
            String transportLag,
            java.util.Date timeLastSynced,
            java.util.Date timeCreated,
            java.util.Date timeLastRoleChanged) {
        super();
        this.id = id;
        this.autonomousDatabaseId = autonomousDatabaseId;
        this.role = role;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.peerRole = peerRole;
        this.peerAutonomousDatabaseId = peerAutonomousDatabaseId;
        this.peerAutonomousDatabaseLifeCycleState = peerAutonomousDatabaseLifeCycleState;
        this.protectionMode = protectionMode;
        this.applyLag = applyLag;
        this.applyRate = applyRate;
        this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
        this.transportLag = transportLag;
        this.timeLastSynced = timeLastSynced;
        this.timeCreated = timeCreated;
        this.timeLastRoleChanged = timeLastRoleChanged;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the Autonomous Dataguard created for Autonomous Container Database where
         * given Autonomous Database resides in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the Autonomous Dataguard created for Autonomous Container Database where
         * given Autonomous Database resides in.
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
         * Autonomous Database that has a relationship with the peer Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
        private String autonomousDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Autonomous Database that has a relationship with the peer Autonomous Database.
         *
         * @param autonomousDatabaseId the value to set
         * @return this builder
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            this.__explicitlySet__.add("autonomousDatabaseId");
            return this;
        }
        /**
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        /**
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         *
         * @param role the value to set
         * @return this builder
         */
        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }
        /** The current state of Autonomous Data Guard. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of Autonomous Data Guard.
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
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
        private PeerRole peerRole;

        /**
         * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
         * Autonomous Data Guard is enabled.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * peer Autonomous Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseId")
        private String peerAutonomousDatabaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * peer Autonomous Database.
         *
         * @param peerAutonomousDatabaseId the value to set
         * @return this builder
         */
        public Builder peerAutonomousDatabaseId(String peerAutonomousDatabaseId) {
            this.peerAutonomousDatabaseId = peerAutonomousDatabaseId;
            this.__explicitlySet__.add("peerAutonomousDatabaseId");
            return this;
        }
        /** The current state of the Autonomous Database. */
        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseLifeCycleState")
        private PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState;

        /**
         * The current state of the Autonomous Database.
         *
         * @param peerAutonomousDatabaseLifeCycleState the value to set
         * @return this builder
         */
        public Builder peerAutonomousDatabaseLifeCycleState(
                PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState) {
            this.peerAutonomousDatabaseLifeCycleState = peerAutonomousDatabaseLifeCycleState;
            this.__explicitlySet__.add("peerAutonomousDatabaseLifeCycleState");
            return this;
        }
        /**
         * The protection mode of this Autonomous Data Guard association. For more information, see
         * [Oracle Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode of this Autonomous Data Guard association. For more information, see
         * [Oracle Data Guard Protection
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
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database
         * Dataguard Association
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
        private Boolean isAutomaticFailoverEnabled;

        /**
         * Indicates whether Automatic Failover is enabled for Autonomous Container Database
         * Dataguard Association
         *
         * @param isAutomaticFailoverEnabled the value to set
         * @return this builder
         */
        public Builder isAutomaticFailoverEnabled(Boolean isAutomaticFailoverEnabled) {
            this.isAutomaticFailoverEnabled = isAutomaticFailoverEnabled;
            this.__explicitlySet__.add("isAutomaticFailoverEnabled");
            return this;
        }
        /**
         * The approximate number of seconds of redo data not yet available on the standby
         * Autonomous Container Database, as computed by the reporting database.
         *
         * <p>Example: {@code 7 seconds}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
        private String transportLag;

        /**
         * The approximate number of seconds of redo data not yet available on the standby
         * Autonomous Container Database, as computed by the reporting database.
         *
         * <p>Example: {@code 7 seconds}
         *
         * @param transportLag the value to set
         * @return this builder
         */
        public Builder transportLag(String transportLag) {
            this.transportLag = transportLag;
            this.__explicitlySet__.add("transportLag");
            return this;
        }
        /**
         * The date and time of the last update to the apply lag, apply rate, and transport lag
         * values.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        /**
         * The date and time of the last update to the apply lag, apply rate, and transport lag
         * values.
         *
         * @param timeLastSynced the value to set
         * @return this builder
         */
        public Builder timeLastSynced(java.util.Date timeLastSynced) {
            this.timeLastSynced = timeLastSynced;
            this.__explicitlySet__.add("timeLastSynced");
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
        /** The date and time when the last role change action happened. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRoleChanged")
        private java.util.Date timeLastRoleChanged;

        /**
         * The date and time when the last role change action happened.
         *
         * @param timeLastRoleChanged the value to set
         * @return this builder
         */
        public Builder timeLastRoleChanged(java.util.Date timeLastRoleChanged) {
            this.timeLastRoleChanged = timeLastRoleChanged;
            this.__explicitlySet__.add("timeLastRoleChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseDataguardAssociation build() {
            AutonomousDatabaseDataguardAssociation model =
                    new AutonomousDatabaseDataguardAssociation(
                            this.id,
                            this.autonomousDatabaseId,
                            this.role,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.peerRole,
                            this.peerAutonomousDatabaseId,
                            this.peerAutonomousDatabaseLifeCycleState,
                            this.protectionMode,
                            this.applyLag,
                            this.applyRate,
                            this.isAutomaticFailoverEnabled,
                            this.transportLag,
                            this.timeLastSynced,
                            this.timeCreated,
                            this.timeLastRoleChanged);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseDataguardAssociation model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("autonomousDatabaseId")) {
                this.autonomousDatabaseId(model.getAutonomousDatabaseId());
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
            if (model.wasPropertyExplicitlySet("peerRole")) {
                this.peerRole(model.getPeerRole());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousDatabaseId")) {
                this.peerAutonomousDatabaseId(model.getPeerAutonomousDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("peerAutonomousDatabaseLifeCycleState")) {
                this.peerAutonomousDatabaseLifeCycleState(
                        model.getPeerAutonomousDatabaseLifeCycleState());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("applyLag")) {
                this.applyLag(model.getApplyLag());
            }
            if (model.wasPropertyExplicitlySet("applyRate")) {
                this.applyRate(model.getApplyRate());
            }
            if (model.wasPropertyExplicitlySet("isAutomaticFailoverEnabled")) {
                this.isAutomaticFailoverEnabled(model.getIsAutomaticFailoverEnabled());
            }
            if (model.wasPropertyExplicitlySet("transportLag")) {
                this.transportLag(model.getTransportLag());
            }
            if (model.wasPropertyExplicitlySet("timeLastSynced")) {
                this.timeLastSynced(model.getTimeLastSynced());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeLastRoleChanged")) {
                this.timeLastRoleChanged(model.getTimeLastRoleChanged());
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
     * The OCID of the Autonomous Dataguard created for Autonomous Container Database where given
     * Autonomous Database resides in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the Autonomous Dataguard created for Autonomous Container Database where given
     * Autonomous Database resides in.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Database that has a relationship with the peer Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
    private final String autonomousDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Autonomous Database that has a relationship with the peer Autonomous Database.
     *
     * @return the value
     */
    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }

    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    public enum Role implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),
        BackupCopy("BACKUP_COPY"),
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
    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    private final Role role;

    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     *
     * @return the value
     */
    public Role getRole() {
        return role;
    }

    /** The current state of Autonomous Data Guard. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        Unavailable("UNAVAILABLE"),
        Updating("UPDATING"),

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
    /** The current state of Autonomous Data Guard. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of Autonomous Data Guard.
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
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    public enum PeerRole implements com.oracle.bmc.http.internal.BmcEnum {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),
        BackupCopy("BACKUP_COPY"),
        SnapshotStandby("SNAPSHOT_STANDBY"),

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
    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
    private final PeerRole peerRole;

    /**
     * The Data Guard role of the Autonomous Container Database or Autonomous Database, if
     * Autonomous Data Guard is enabled.
     *
     * @return the value
     */
    public PeerRole getPeerRole() {
        return peerRole;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * peer Autonomous Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseId")
    private final String peerAutonomousDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * peer Autonomous Database.
     *
     * @return the value
     */
    public String getPeerAutonomousDatabaseId() {
        return peerAutonomousDatabaseId;
    }

    /** The current state of the Autonomous Database. */
    public enum PeerAutonomousDatabaseLifeCycleState
            implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Stopping("STOPPING"),
        Stopped("STOPPED"),
        Starting("STARTING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Unavailable("UNAVAILABLE"),
        RestoreInProgress("RESTORE_IN_PROGRESS"),
        RestoreFailed("RESTORE_FAILED"),
        BackupInProgress("BACKUP_IN_PROGRESS"),
        ScaleInProgress("SCALE_IN_PROGRESS"),
        AvailableNeedsAttention("AVAILABLE_NEEDS_ATTENTION"),
        Updating("UPDATING"),
        MaintenanceInProgress("MAINTENANCE_IN_PROGRESS"),
        Restarting("RESTARTING"),
        Recreating("RECREATING"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Upgrading("UPGRADING"),
        Inaccessible("INACCESSIBLE"),
        Standby("STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PeerAutonomousDatabaseLifeCycleState.class);

        private final String value;
        private static java.util.Map<String, PeerAutonomousDatabaseLifeCycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (PeerAutonomousDatabaseLifeCycleState v :
                    PeerAutonomousDatabaseLifeCycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PeerAutonomousDatabaseLifeCycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PeerAutonomousDatabaseLifeCycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PeerAutonomousDatabaseLifeCycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the Autonomous Database. */
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseLifeCycleState")
    private final PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState;

    /**
     * The current state of the Autonomous Database.
     *
     * @return the value
     */
    public PeerAutonomousDatabaseLifeCycleState getPeerAutonomousDatabaseLifeCycleState() {
        return peerAutonomousDatabaseLifeCycleState;
    }

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),

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
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
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
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard
     * Association
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticFailoverEnabled")
    private final Boolean isAutomaticFailoverEnabled;

    /**
     * Indicates whether Automatic Failover is enabled for Autonomous Container Database Dataguard
     * Association
     *
     * @return the value
     */
    public Boolean getIsAutomaticFailoverEnabled() {
        return isAutomaticFailoverEnabled;
    }

    /**
     * The approximate number of seconds of redo data not yet available on the standby Autonomous
     * Container Database, as computed by the reporting database.
     *
     * <p>Example: {@code 7 seconds}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
    private final String transportLag;

    /**
     * The approximate number of seconds of redo data not yet available on the standby Autonomous
     * Container Database, as computed by the reporting database.
     *
     * <p>Example: {@code 7 seconds}
     *
     * @return the value
     */
    public String getTransportLag() {
        return transportLag;
    }

    /**
     * The date and time of the last update to the apply lag, apply rate, and transport lag values.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    private final java.util.Date timeLastSynced;

    /**
     * The date and time of the last update to the apply lag, apply rate, and transport lag values.
     *
     * @return the value
     */
    public java.util.Date getTimeLastSynced() {
        return timeLastSynced;
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

    /** The date and time when the last role change action happened. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRoleChanged")
    private final java.util.Date timeLastRoleChanged;

    /**
     * The date and time when the last role change action happened.
     *
     * @return the value
     */
    public java.util.Date getTimeLastRoleChanged() {
        return timeLastRoleChanged;
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
        sb.append("AutonomousDatabaseDataguardAssociation(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(", role=").append(String.valueOf(this.role));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", peerRole=").append(String.valueOf(this.peerRole));
        sb.append(", peerAutonomousDatabaseId=")
                .append(String.valueOf(this.peerAutonomousDatabaseId));
        sb.append(", peerAutonomousDatabaseLifeCycleState=")
                .append(String.valueOf(this.peerAutonomousDatabaseLifeCycleState));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", applyLag=").append(String.valueOf(this.applyLag));
        sb.append(", applyRate=").append(String.valueOf(this.applyRate));
        sb.append(", isAutomaticFailoverEnabled=")
                .append(String.valueOf(this.isAutomaticFailoverEnabled));
        sb.append(", transportLag=").append(String.valueOf(this.transportLag));
        sb.append(", timeLastSynced=").append(String.valueOf(this.timeLastSynced));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeLastRoleChanged=").append(String.valueOf(this.timeLastRoleChanged));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseDataguardAssociation)) {
            return false;
        }

        AutonomousDatabaseDataguardAssociation other = (AutonomousDatabaseDataguardAssociation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && java.util.Objects.equals(this.role, other.role)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.peerRole, other.peerRole)
                && java.util.Objects.equals(
                        this.peerAutonomousDatabaseId, other.peerAutonomousDatabaseId)
                && java.util.Objects.equals(
                        this.peerAutonomousDatabaseLifeCycleState,
                        other.peerAutonomousDatabaseLifeCycleState)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.applyLag, other.applyLag)
                && java.util.Objects.equals(this.applyRate, other.applyRate)
                && java.util.Objects.equals(
                        this.isAutomaticFailoverEnabled, other.isAutomaticFailoverEnabled)
                && java.util.Objects.equals(this.transportLag, other.transportLag)
                && java.util.Objects.equals(this.timeLastSynced, other.timeLastSynced)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeLastRoleChanged, other.timeLastRoleChanged)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousDatabaseId == null
                                ? 43
                                : this.autonomousDatabaseId.hashCode());
        result = (result * PRIME) + (this.role == null ? 43 : this.role.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.peerRole == null ? 43 : this.peerRole.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousDatabaseId == null
                                ? 43
                                : this.peerAutonomousDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.peerAutonomousDatabaseLifeCycleState == null
                                ? 43
                                : this.peerAutonomousDatabaseLifeCycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result = (result * PRIME) + (this.applyLag == null ? 43 : this.applyLag.hashCode());
        result = (result * PRIME) + (this.applyRate == null ? 43 : this.applyRate.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutomaticFailoverEnabled == null
                                ? 43
                                : this.isAutomaticFailoverEnabled.hashCode());
        result = (result * PRIME) + (this.transportLag == null ? 43 : this.transportLag.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSynced == null ? 43 : this.timeLastSynced.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastRoleChanged == null
                                ? 43
                                : this.timeLastRoleChanged.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
