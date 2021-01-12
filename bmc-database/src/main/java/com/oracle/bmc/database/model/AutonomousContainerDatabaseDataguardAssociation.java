/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The properties that define Autonomous Data Guard association between two different Autonomous Container Databases.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousContainerDatabaseDataguardAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousContainerDatabaseDataguardAssociation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
        private String autonomousContainerDatabaseId;

        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            this.__explicitlySet__.add("autonomousContainerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("role")
        private Role role;

        public Builder role(Role role) {
            this.role = role;
            this.__explicitlySet__.add("role");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty(
                "peerAutonomousContainerDatabaseDataguardAssociationId")
        private String peerAutonomousContainerDatabaseDataguardAssociationId;

        public Builder peerAutonomousContainerDatabaseDataguardAssociationId(
                String peerAutonomousContainerDatabaseDataguardAssociationId) {
            this.peerAutonomousContainerDatabaseDataguardAssociationId =
                    peerAutonomousContainerDatabaseDataguardAssociationId;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseDataguardAssociationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseId")
        private String peerAutonomousContainerDatabaseId;

        public Builder peerAutonomousContainerDatabaseId(String peerAutonomousContainerDatabaseId) {
            this.peerAutonomousContainerDatabaseId = peerAutonomousContainerDatabaseId;
            this.__explicitlySet__.add("peerAutonomousContainerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
        private PeerRole peerRole;

        public Builder peerRole(PeerRole peerRole) {
            this.peerRole = peerRole;
            this.__explicitlySet__.add("peerRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerLifecycleState")
        private PeerLifecycleState peerLifecycleState;

        public Builder peerLifecycleState(PeerLifecycleState peerLifecycleState) {
            this.peerLifecycleState = peerLifecycleState;
            this.__explicitlySet__.add("peerLifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
        private String applyLag;

        public Builder applyLag(String applyLag) {
            this.applyLag = applyLag;
            this.__explicitlySet__.add("applyLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
        private String applyRate;

        public Builder applyRate(String applyRate) {
            this.applyRate = applyRate;
            this.__explicitlySet__.add("applyRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
        private String transportLag;

        public Builder transportLag(String transportLag) {
            this.transportLag = transportLag;
            this.__explicitlySet__.add("transportLag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        public Builder timeLastSynced(java.util.Date timeLastSynced) {
            this.timeLastSynced = timeLastSynced;
            this.__explicitlySet__.add("timeLastSynced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRoleChanged")
        private java.util.Date timeLastRoleChanged;

        public Builder timeLastRoleChanged(java.util.Date timeLastRoleChanged) {
            this.timeLastRoleChanged = timeLastRoleChanged;
            this.__explicitlySet__.add("timeLastRoleChanged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousContainerDatabaseDataguardAssociation build() {
            AutonomousContainerDatabaseDataguardAssociation __instance__ =
                    new AutonomousContainerDatabaseDataguardAssociation(
                            id,
                            autonomousContainerDatabaseId,
                            role,
                            lifecycleState,
                            lifecycleDetails,
                            peerAutonomousContainerDatabaseDataguardAssociationId,
                            peerAutonomousContainerDatabaseId,
                            peerRole,
                            peerLifecycleState,
                            protectionMode,
                            applyLag,
                            applyRate,
                            transportLag,
                            timeLastSynced,
                            timeCreated,
                            timeLastRoleChanged);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousContainerDatabaseDataguardAssociation o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId())
                            .role(o.getRole())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .peerAutonomousContainerDatabaseDataguardAssociationId(
                                    o.getPeerAutonomousContainerDatabaseDataguardAssociationId())
                            .peerAutonomousContainerDatabaseId(
                                    o.getPeerAutonomousContainerDatabaseId())
                            .peerRole(o.getPeerRole())
                            .peerLifecycleState(o.getPeerLifecycleState())
                            .protectionMode(o.getProtectionMode())
                            .applyLag(o.getApplyLag())
                            .applyRate(o.getApplyRate())
                            .transportLag(o.getTransportLag())
                            .timeLastSynced(o.getTimeLastSynced())
                            .timeCreated(o.getTimeCreated())
                            .timeLastRoleChanged(o.getTimeLastRoleChanged());

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

    /**
     * The OCID of the Autonomous Data Guard created for a given Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Container Database that has a relationship with the peer Autonomous Container Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousContainerDatabaseId")
    String autonomousContainerDatabaseId;
    /**
     * The role of the Autonomous Data Guard-enabled Autonomous Container Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Role {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The role of the Autonomous Data Guard-enabled Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    Role role;
    /**
     * The current state of Autonomous Data Guard.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The current state of Autonomous Data Guard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Additional information about the current lifecycleState, if available.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The OCID of the peer Autonomous Container Database-Autonomous Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty(
            "peerAutonomousContainerDatabaseDataguardAssociationId")
    String peerAutonomousContainerDatabaseDataguardAssociationId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer Autonomous Container Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousContainerDatabaseId")
    String peerAutonomousContainerDatabaseId;
    /**
     * The role of the Autonomous Data Guard-enabled Autonomous Container Database.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PeerRole {
        Primary("PRIMARY"),
        Standby("STANDBY"),
        DisabledStandby("DISABLED_STANDBY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The role of the Autonomous Data Guard-enabled Autonomous Container Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
    PeerRole peerRole;
    /**
     * The current state of Autonomous Data Guard.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PeerLifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        RoleChangeInProgress("ROLE_CHANGE_IN_PROGRESS"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PeerLifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (PeerLifecycleState v : PeerLifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PeerLifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PeerLifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PeerLifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of Autonomous Data Guard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerLifecycleState")
    PeerLifecycleState peerLifecycleState;
    /**
     * The protection mode of this Autonomous Data Guard association. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ProtectionMode {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    ProtectionMode protectionMode;

    /**
     * The lag time between updates to the primary Autonomous Container Database and application of the redo data on the standby Autonomous Container Database,
     * as computed by the reporting database.
     * <p>
     * Example: `9 seconds`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
    String applyLag;

    /**
     * The rate at which redo logs are synchronized between the associated Autonomous Container Databases.
     * <p>
     * Example: `180 Mb per second`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
    String applyRate;

    /**
     * The approximate number of seconds of redo data not yet available on the standby Autonomous Container Database,
     * as computed by the reporting database.
     * <p>
     * Example: `7 seconds`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportLag")
    String transportLag;

    /**
     * The date and time of the last update to the apply lag, apply rate, and transport lag values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    java.util.Date timeLastSynced;

    /**
     * The date and time the Autonomous DataGuard association was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time when the last role change action happened.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRoleChanged")
    java.util.Date timeLastRoleChanged;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
