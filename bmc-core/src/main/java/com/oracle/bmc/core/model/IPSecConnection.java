/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A connection between a DRG and CPE. This connection consists of multiple IPSec
 * tunnels. Creating this connection is one of the steps required when setting up
 * an IPSec VPN. For more information, see
 * [IPSec VPN](https://docs.cloud.oracle.com/Content/Network/Tasks/managingIPsec.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IPSecConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class IPSecConnection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
        private String cpeId;

        public Builder cpeId(String cpeId) {
            this.cpeId = cpeId;
            this.__explicitlySet__.add("cpeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("drgId")
        private String drgId;

        public Builder drgId(String drgId) {
            this.drgId = drgId;
            this.__explicitlySet__.add("drgId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
        private String cpeLocalIdentifier;

        public Builder cpeLocalIdentifier(String cpeLocalIdentifier) {
            this.cpeLocalIdentifier = cpeLocalIdentifier;
            this.__explicitlySet__.add("cpeLocalIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
        private CpeLocalIdentifierType cpeLocalIdentifierType;

        public Builder cpeLocalIdentifierType(CpeLocalIdentifierType cpeLocalIdentifierType) {
            this.cpeLocalIdentifierType = cpeLocalIdentifierType;
            this.__explicitlySet__.add("cpeLocalIdentifierType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
        private java.util.List<String> staticRoutes;

        public Builder staticRoutes(java.util.List<String> staticRoutes) {
            this.staticRoutes = staticRoutes;
            this.__explicitlySet__.add("staticRoutes");
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

        public IPSecConnection build() {
            IPSecConnection __instance__ =
                    new IPSecConnection(
                            compartmentId,
                            cpeId,
                            definedTags,
                            displayName,
                            drgId,
                            freeformTags,
                            id,
                            lifecycleState,
                            cpeLocalIdentifier,
                            cpeLocalIdentifierType,
                            staticRoutes,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnection o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .cpeId(o.getCpeId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .drgId(o.getDrgId())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .cpeLocalIdentifier(o.getCpeLocalIdentifier())
                            .cpeLocalIdentifierType(o.getCpeLocalIdentifierType())
                            .staticRoutes(o.getStaticRoutes())
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
     * The OCID of the compartment containing the IPSec connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The OCID of the {@link Cpe} object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeId")
    String cpeId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the DRG.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("drgId")
    String drgId;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see
     * [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The IPSec connection's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The IPSec connection's current state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
     * The IPSec connection's current state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Your identifier for your CPE device. Can be either an IP address or a hostname (specifically,
     * the fully qualified domain name (FQDN)). The type of identifier here must correspond
     * to the value for `cpeLocalIdentifierType`.
     * <p>
     * If you don't provide a value when creating the IPSec connection, the `ipAddress` attribute
     * for the {@link Cpe} object specified by `cpeId` is used as the `cpeLocalIdentifier`.
     * <p>
     * Example IP address: `10.0.3.3`
     * <p>
     * Example hostname: `cpe.example.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifier")
    String cpeLocalIdentifier;
    /**
     * The type of identifier for your CPE device. The value here must correspond to the value
     * for `cpeLocalIdentifier`.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CpeLocalIdentifierType {
        IpAddress("IP_ADDRESS"),
        Hostname("HOSTNAME"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CpeLocalIdentifierType> map;

        static {
            map = new java.util.HashMap<>();
            for (CpeLocalIdentifierType v : CpeLocalIdentifierType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CpeLocalIdentifierType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CpeLocalIdentifierType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CpeLocalIdentifierType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of identifier for your CPE device. The value here must correspond to the value
     * for `cpeLocalIdentifier`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeLocalIdentifierType")
    CpeLocalIdentifierType cpeLocalIdentifierType;

    /**
     * Static routes to the CPE. At least one route must be included. The CIDR must not be a
     * multicast address or class E address.
     * <p>
     * Example: `10.0.1.0/24`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("staticRoutes")
    java.util.List<String> staticRoutes;

    /**
     * The date and time the IPSec connection was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
