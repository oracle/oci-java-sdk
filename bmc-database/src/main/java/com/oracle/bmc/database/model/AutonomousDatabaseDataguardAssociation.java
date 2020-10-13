/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The properties that define dataguard association between two different Autonomous Databases.
 * Note that Autonomous Databases inherit DataGuard association from parent Autonomous Container Database.
 * No actions can be taken on AutonomousDatabaseDataguardAssociation, usage is strictly informational.
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
    builder = AutonomousDatabaseDataguardAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AutonomousDatabaseDataguardAssociation {
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

        @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
        private String autonomousDatabaseId;

        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            this.__explicitlySet__.add("autonomousDatabaseId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
        private PeerRole peerRole;

        public Builder peerRole(PeerRole peerRole) {
            this.peerRole = peerRole;
            this.__explicitlySet__.add("peerRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseId")
        private String peerAutonomousDatabaseId;

        public Builder peerAutonomousDatabaseId(String peerAutonomousDatabaseId) {
            this.peerAutonomousDatabaseId = peerAutonomousDatabaseId;
            this.__explicitlySet__.add("peerAutonomousDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseLifeCycleState")
        private PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState;

        public Builder peerAutonomousDatabaseLifeCycleState(
                PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState) {
            this.peerAutonomousDatabaseLifeCycleState = peerAutonomousDatabaseLifeCycleState;
            this.__explicitlySet__.add("peerAutonomousDatabaseLifeCycleState");
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

        public AutonomousDatabaseDataguardAssociation build() {
            AutonomousDatabaseDataguardAssociation __instance__ =
                    new AutonomousDatabaseDataguardAssociation(
                            id,
                            autonomousDatabaseId,
                            role,
                            lifecycleState,
                            lifecycleDetails,
                            peerRole,
                            peerAutonomousDatabaseId,
                            peerAutonomousDatabaseLifeCycleState,
                            protectionMode,
                            applyLag,
                            applyRate,
                            timeCreated,
                            timeLastRoleChanged);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseDataguardAssociation o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .autonomousDatabaseId(o.getAutonomousDatabaseId())
                            .role(o.getRole())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .peerRole(o.getPeerRole())
                            .peerAutonomousDatabaseId(o.getPeerAutonomousDatabaseId())
                            .peerAutonomousDatabaseLifeCycleState(
                                    o.getPeerAutonomousDatabaseLifeCycleState())
                            .protectionMode(o.getProtectionMode())
                            .applyLag(o.getApplyLag())
                            .applyRate(o.getApplyRate())
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
     * The OCID of the Autonomous Dataguard created for Autonomous Container Database where given Autonomous Database resides in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Autonomous Database that has a relationship with the peer Autonomous Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autonomousDatabaseId")
    String autonomousDatabaseId;
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
     * The current state of the Autonomous Data Guard.
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
     * The current state of the Autonomous Data Guard.
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer Autonomous Database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseId")
    String peerAutonomousDatabaseId;
    /**
     * The current state of the Autonomous Data Guard.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PeerAutonomousDatabaseLifeCycleState {
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
    /**
     * The current state of the Autonomous Data Guard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerAutonomousDatabaseLifeCycleState")
    PeerAutonomousDatabaseLifeCycleState peerAutonomousDatabaseLifeCycleState;
    /**
     * The protection mode of this Data Guard association. For more information, see
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
     * The protection mode of this Data Guard association. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    ProtectionMode protectionMode;

    /**
     * The lag time between updates to the primary database and application of the redo data on the standby database,
     * as computed by the reporting database.
     * <p>
     * Example: `9 seconds`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applyLag")
    String applyLag;

    /**
     * The rate at which redo logs are synced between the associated databases.
     * <p>
     * Example: `180 Mb per second`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("applyRate")
    String applyRate;

    /**
     * The date and time the Data Guard association was created.
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
