/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.database.model;

/**
 * The properties that define a Data Guard association.
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized, talk to an
 * administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 * For information about endpoints and signing API requests, see
 * [About the API](https://docs.cloud.oracle.com/Content/API/Concepts/usingapi.htm). For information about available SDKs and tools, see
 * [SDKS and Other Tools](https://docs.cloud.oracle.com/Content/API/Concepts/sdks.htm).
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
    builder = DataGuardAssociationSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DataGuardAssociationSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
        private String peerDbSystemId;

        public Builder peerDbSystemId(String peerDbSystemId) {
            this.peerDbSystemId = peerDbSystemId;
            this.__explicitlySet__.add("peerDbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
        private String peerDbHomeId;

        public Builder peerDbHomeId(String peerDbHomeId) {
            this.peerDbHomeId = peerDbHomeId;
            this.__explicitlySet__.add("peerDbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDatabaseId")
        private String peerDatabaseId;

        public Builder peerDatabaseId(String peerDatabaseId) {
            this.peerDatabaseId = peerDatabaseId;
            this.__explicitlySet__.add("peerDatabaseId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDataGuardAssociationId")
        private String peerDataGuardAssociationId;

        public Builder peerDataGuardAssociationId(String peerDataGuardAssociationId) {
            this.peerDataGuardAssociationId = peerDataGuardAssociationId;
            this.__explicitlySet__.add("peerDataGuardAssociationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
        private PeerRole peerRole;

        public Builder peerRole(PeerRole peerRole) {
            this.peerRole = peerRole;
            this.__explicitlySet__.add("peerRole");
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

        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataGuardAssociationSummary build() {
            DataGuardAssociationSummary __instance__ =
                    new DataGuardAssociationSummary(
                            id,
                            databaseId,
                            role,
                            lifecycleState,
                            lifecycleDetails,
                            peerDbSystemId,
                            peerDbHomeId,
                            peerDatabaseId,
                            peerDataGuardAssociationId,
                            peerRole,
                            applyLag,
                            applyRate,
                            protectionMode,
                            transportType,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataGuardAssociationSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .databaseId(o.getDatabaseId())
                            .role(o.getRole())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .peerDbSystemId(o.getPeerDbSystemId())
                            .peerDbHomeId(o.getPeerDbHomeId())
                            .peerDatabaseId(o.getPeerDatabaseId())
                            .peerDataGuardAssociationId(o.getPeerDataGuardAssociationId())
                            .peerRole(o.getPeerRole())
                            .applyLag(o.getApplyLag())
                            .applyRate(o.getApplyRate())
                            .protectionMode(o.getProtectionMode())
                            .transportType(o.getTransportType())
                            .timeCreated(o.getTimeCreated());

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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the reporting database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    String databaseId;
    /**
     * The role of the reporting database in this Data Guard association.
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
     * The role of the reporting database in this Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("role")
    Role role;
    /**
     * The current state of the Data Guard association.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
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
     * The current state of the Data Guard association.
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system containing the associated
     * peer database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
    String peerDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the database home containing the associated peer database.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
    String peerDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the associated peer database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDatabaseId")
    String peerDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the peer database's Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDataGuardAssociationId")
    String peerDataGuardAssociationId;
    /**
     * The role of the peer database in this Data Guard association.
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
     * The role of the peer database in this Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerRole")
    PeerRole peerRole;

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
     * The protection mode of this Data Guard association. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ProtectionMode {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        MaximumProtection("MAXIMUM_PROTECTION"),

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
     * The redo transport type used by this Data Guard association.  For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TransportType {
        Sync("SYNC"),
        Async("ASYNC"),
        Fastsync("FASTSYNC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The redo transport type used by this Data Guard association.  For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    TransportType transportType;

    /**
     * The date and time the Data Guard association was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
