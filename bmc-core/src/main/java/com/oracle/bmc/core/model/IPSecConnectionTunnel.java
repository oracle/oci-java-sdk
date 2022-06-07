/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about a single IPSec tunnel in an IPSec connection. This object does not include the tunnel's
 * shared secret (pre-shared key), which is found in the
 * {@link IPSecConnectionTunnelSharedSecret} object.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IPSecConnectionTunnel.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IPSecConnectionTunnel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "id",
        "vpnIp",
        "cpeIp",
        "status",
        "ikeVersion",
        "lifecycleState",
        "displayName",
        "bgpSessionInfo",
        "encryptionDomainConfig",
        "routing",
        "timeCreated",
        "timeStatusUpdated",
        "oracleCanInitiate",
        "natTranslationEnabled",
        "dpdMode",
        "dpdTimeoutInSec",
        "phaseOneDetails",
        "phaseTwoDetails"
    })
    public IPSecConnectionTunnel(
            String compartmentId,
            String id,
            String vpnIp,
            String cpeIp,
            Status status,
            IkeVersion ikeVersion,
            LifecycleState lifecycleState,
            String displayName,
            BgpSessionInfo bgpSessionInfo,
            EncryptionDomainConfig encryptionDomainConfig,
            Routing routing,
            java.util.Date timeCreated,
            java.util.Date timeStatusUpdated,
            OracleCanInitiate oracleCanInitiate,
            NatTranslationEnabled natTranslationEnabled,
            DpdMode dpdMode,
            Integer dpdTimeoutInSec,
            TunnelPhaseOneDetails phaseOneDetails,
            TunnelPhaseTwoDetails phaseTwoDetails) {
        super();
        this.compartmentId = compartmentId;
        this.id = id;
        this.vpnIp = vpnIp;
        this.cpeIp = cpeIp;
        this.status = status;
        this.ikeVersion = ikeVersion;
        this.lifecycleState = lifecycleState;
        this.displayName = displayName;
        this.bgpSessionInfo = bgpSessionInfo;
        this.encryptionDomainConfig = encryptionDomainConfig;
        this.routing = routing;
        this.timeCreated = timeCreated;
        this.timeStatusUpdated = timeStatusUpdated;
        this.oracleCanInitiate = oracleCanInitiate;
        this.natTranslationEnabled = natTranslationEnabled;
        this.dpdMode = dpdMode;
        this.dpdTimeoutInSec = dpdTimeoutInSec;
        this.phaseOneDetails = phaseOneDetails;
        this.phaseTwoDetails = phaseTwoDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
        private String vpnIp;

        public Builder vpnIp(String vpnIp) {
            this.vpnIp = vpnIp;
            this.__explicitlySet__.add("vpnIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
        private String cpeIp;

        public Builder cpeIp(String cpeIp) {
            this.cpeIp = cpeIp;
            this.__explicitlySet__.add("cpeIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
        private IkeVersion ikeVersion;

        public Builder ikeVersion(IkeVersion ikeVersion) {
            this.ikeVersion = ikeVersion;
            this.__explicitlySet__.add("ikeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionInfo")
        private BgpSessionInfo bgpSessionInfo;

        public Builder bgpSessionInfo(BgpSessionInfo bgpSessionInfo) {
            this.bgpSessionInfo = bgpSessionInfo;
            this.__explicitlySet__.add("bgpSessionInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
        private EncryptionDomainConfig encryptionDomainConfig;

        public Builder encryptionDomainConfig(EncryptionDomainConfig encryptionDomainConfig) {
            this.encryptionDomainConfig = encryptionDomainConfig;
            this.__explicitlySet__.add("encryptionDomainConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        public Builder routing(Routing routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
        private java.util.Date timeStatusUpdated;

        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            this.__explicitlySet__.add("timeStatusUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleCanInitiate")
        private OracleCanInitiate oracleCanInitiate;

        public Builder oracleCanInitiate(OracleCanInitiate oracleCanInitiate) {
            this.oracleCanInitiate = oracleCanInitiate;
            this.__explicitlySet__.add("oracleCanInitiate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
        private NatTranslationEnabled natTranslationEnabled;

        public Builder natTranslationEnabled(NatTranslationEnabled natTranslationEnabled) {
            this.natTranslationEnabled = natTranslationEnabled;
            this.__explicitlySet__.add("natTranslationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
        private DpdMode dpdMode;

        public Builder dpdMode(DpdMode dpdMode) {
            this.dpdMode = dpdMode;
            this.__explicitlySet__.add("dpdMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
        private Integer dpdTimeoutInSec;

        public Builder dpdTimeoutInSec(Integer dpdTimeoutInSec) {
            this.dpdTimeoutInSec = dpdTimeoutInSec;
            this.__explicitlySet__.add("dpdTimeoutInSec");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phaseOneDetails")
        private TunnelPhaseOneDetails phaseOneDetails;

        public Builder phaseOneDetails(TunnelPhaseOneDetails phaseOneDetails) {
            this.phaseOneDetails = phaseOneDetails;
            this.__explicitlySet__.add("phaseOneDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phaseTwoDetails")
        private TunnelPhaseTwoDetails phaseTwoDetails;

        public Builder phaseTwoDetails(TunnelPhaseTwoDetails phaseTwoDetails) {
            this.phaseTwoDetails = phaseTwoDetails;
            this.__explicitlySet__.add("phaseTwoDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IPSecConnectionTunnel build() {
            IPSecConnectionTunnel __instance__ =
                    new IPSecConnectionTunnel(
                            compartmentId,
                            id,
                            vpnIp,
                            cpeIp,
                            status,
                            ikeVersion,
                            lifecycleState,
                            displayName,
                            bgpSessionInfo,
                            encryptionDomainConfig,
                            routing,
                            timeCreated,
                            timeStatusUpdated,
                            oracleCanInitiate,
                            natTranslationEnabled,
                            dpdMode,
                            dpdTimeoutInSec,
                            phaseOneDetails,
                            phaseTwoDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnel o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .id(o.getId())
                            .vpnIp(o.getVpnIp())
                            .cpeIp(o.getCpeIp())
                            .status(o.getStatus())
                            .ikeVersion(o.getIkeVersion())
                            .lifecycleState(o.getLifecycleState())
                            .displayName(o.getDisplayName())
                            .bgpSessionInfo(o.getBgpSessionInfo())
                            .encryptionDomainConfig(o.getEncryptionDomainConfig())
                            .routing(o.getRouting())
                            .timeCreated(o.getTimeCreated())
                            .timeStatusUpdated(o.getTimeStatusUpdated())
                            .oracleCanInitiate(o.getOracleCanInitiate())
                            .natTranslationEnabled(o.getNatTranslationEnabled())
                            .dpdMode(o.getDpdMode())
                            .dpdTimeoutInSec(o.getDpdTimeoutInSec())
                            .phaseOneDetails(o.getPhaseOneDetails())
                            .phaseTwoDetails(o.getPhaseTwoDetails());

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

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment containing the tunnel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the tunnel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * The IP address of the Oracle VPN headend for the connection.
     * <p>
     * Example: {@code 203.0.113.21}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
    private final String vpnIp;

    public String getVpnIp() {
        return vpnIp;
    }

    /**
     * The IP address of the CPE device's VPN headend.
     * <p>
     * Example: {@code 203.0.113.22}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
    private final String cpeIp;

    public String getCpeIp() {
        return cpeIp;
    }

    /**
     * The status of the tunnel based on IPSec protocol characteristics.
     **/
    public enum Status {
        Up("UP"),
        Down("DOWN"),
        DownForMaintenance("DOWN_FOR_MAINTENANCE"),
        PartialUp("PARTIAL_UP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the tunnel based on IPSec protocol characteristics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    public Status getStatus() {
        return status;
    }

    /**
     * Internet Key Exchange protocol version.
     *
     **/
    public enum IkeVersion {
        V1("V1"),
        V2("V2"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IkeVersion.class);

        private final String value;
        private static java.util.Map<String, IkeVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (IkeVersion v : IkeVersion.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IkeVersion(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IkeVersion create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IkeVersion', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Internet Key Exchange protocol version.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
    private final IkeVersion ikeVersion;

    public IkeVersion getIkeVersion() {
        return ikeVersion;
    }

    /**
     * The tunnel's lifecycle state.
     **/
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
    /**
     * The tunnel's lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionInfo")
    private final BgpSessionInfo bgpSessionInfo;

    public BgpSessionInfo getBgpSessionInfo() {
        return bgpSessionInfo;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
    private final EncryptionDomainConfig encryptionDomainConfig;

    public EncryptionDomainConfig getEncryptionDomainConfig() {
        return encryptionDomainConfig;
    }

    /**
     * The type of routing used for this tunnel (BGP dynamic routing, static routing, or policy-based routing).
     *
     **/
    public enum Routing {
        Bgp("BGP"),
        Static("STATIC"),
        Policy("POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Routing.class);

        private final String value;
        private static java.util.Map<String, Routing> map;

        static {
            map = new java.util.HashMap<>();
            for (Routing v : Routing.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Routing(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Routing create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Routing', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of routing used for this tunnel (BGP dynamic routing, static routing, or policy-based routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    private final Routing routing;

    public Routing getRouting() {
        return routing;
    }

    /**
     * The date and time the IPSec tunnel was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the status of the IPSec tunnel last changed, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2016-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
    private final java.util.Date timeStatusUpdated;

    public java.util.Date getTimeStatusUpdated() {
        return timeStatusUpdated;
    }

    /**
     * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the CPE device, or both respond to and initiate requests.
     *
     **/
    public enum OracleCanInitiate {
        InitiatorOrResponder("INITIATOR_OR_RESPONDER"),
        ResponderOnly("RESPONDER_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(OracleCanInitiate.class);

        private final String value;
        private static java.util.Map<String, OracleCanInitiate> map;

        static {
            map = new java.util.HashMap<>();
            for (OracleCanInitiate v : OracleCanInitiate.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        OracleCanInitiate(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OracleCanInitiate create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'OracleCanInitiate', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the CPE device, or both respond to and initiate requests.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleCanInitiate")
    private final OracleCanInitiate oracleCanInitiate;

    public OracleCanInitiate getOracleCanInitiate() {
        return oracleCanInitiate;
    }

    /**
     * By default (the {@code AUTO} setting), IKE sends packets with a source and destination port set to 500,
     * and when it detects that the port used to forward packets has changed (most likely because a NAT device
     * is between the CPE device and the Oracle VPN headend) it will try to negotiate the use of NAT-T.
     * <p>
     * The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and forces encapsulating traffic with the ESP protocol inside UDP packets.
     * <p>
     * The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T
     * even if it senses there may be a NAT device in use.
     * <p>
     *
     * .
     *
     **/
    public enum NatTranslationEnabled {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Auto("AUTO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NatTranslationEnabled.class);

        private final String value;
        private static java.util.Map<String, NatTranslationEnabled> map;

        static {
            map = new java.util.HashMap<>();
            for (NatTranslationEnabled v : NatTranslationEnabled.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NatTranslationEnabled(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NatTranslationEnabled create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NatTranslationEnabled', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * By default (the {@code AUTO} setting), IKE sends packets with a source and destination port set to 500,
     * and when it detects that the port used to forward packets has changed (most likely because a NAT device
     * is between the CPE device and the Oracle VPN headend) it will try to negotiate the use of NAT-T.
     * <p>
     * The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and forces encapsulating traffic with the ESP protocol inside UDP packets.
     * <p>
     * The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T
     * even if it senses there may be a NAT device in use.
     * <p>
     *
     * .
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
    private final NatTranslationEnabled natTranslationEnabled;

    public NatTranslationEnabled getNatTranslationEnabled() {
        return natTranslationEnabled;
    }

    /**
     * Dead peer detection (DPD) mode set on the Oracle side of the connection.
     * This mode sets whether Oracle can only respond to a request from the CPE device to start DPD,
     * or both respond to and initiate requests.
     *
     **/
    public enum DpdMode {
        InitiateAndRespond("INITIATE_AND_RESPOND"),
        RespondOnly("RESPOND_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DpdMode.class);

        private final String value;
        private static java.util.Map<String, DpdMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DpdMode v : DpdMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DpdMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DpdMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DpdMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Dead peer detection (DPD) mode set on the Oracle side of the connection.
     * This mode sets whether Oracle can only respond to a request from the CPE device to start DPD,
     * or both respond to and initiate requests.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
    private final DpdMode dpdMode;

    public DpdMode getDpdMode() {
        return dpdMode;
    }

    /**
     * DPD timeout in seconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
    private final Integer dpdTimeoutInSec;

    public Integer getDpdTimeoutInSec() {
        return dpdTimeoutInSec;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phaseOneDetails")
    private final TunnelPhaseOneDetails phaseOneDetails;

    public TunnelPhaseOneDetails getPhaseOneDetails() {
        return phaseOneDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phaseTwoDetails")
    private final TunnelPhaseTwoDetails phaseTwoDetails;

    public TunnelPhaseTwoDetails getPhaseTwoDetails() {
        return phaseTwoDetails;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IPSecConnectionTunnel(");
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", vpnIp=").append(String.valueOf(this.vpnIp));
        sb.append(", cpeIp=").append(String.valueOf(this.cpeIp));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", ikeVersion=").append(String.valueOf(this.ikeVersion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", bgpSessionInfo=").append(String.valueOf(this.bgpSessionInfo));
        sb.append(", encryptionDomainConfig=").append(String.valueOf(this.encryptionDomainConfig));
        sb.append(", routing=").append(String.valueOf(this.routing));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStatusUpdated=").append(String.valueOf(this.timeStatusUpdated));
        sb.append(", oracleCanInitiate=").append(String.valueOf(this.oracleCanInitiate));
        sb.append(", natTranslationEnabled=").append(String.valueOf(this.natTranslationEnabled));
        sb.append(", dpdMode=").append(String.valueOf(this.dpdMode));
        sb.append(", dpdTimeoutInSec=").append(String.valueOf(this.dpdTimeoutInSec));
        sb.append(", phaseOneDetails=").append(String.valueOf(this.phaseOneDetails));
        sb.append(", phaseTwoDetails=").append(String.valueOf(this.phaseTwoDetails));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IPSecConnectionTunnel)) {
            return false;
        }

        IPSecConnectionTunnel other = (IPSecConnectionTunnel) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.vpnIp, other.vpnIp)
                && java.util.Objects.equals(this.cpeIp, other.cpeIp)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.ikeVersion, other.ikeVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.bgpSessionInfo, other.bgpSessionInfo)
                && java.util.Objects.equals(
                        this.encryptionDomainConfig, other.encryptionDomainConfig)
                && java.util.Objects.equals(this.routing, other.routing)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStatusUpdated, other.timeStatusUpdated)
                && java.util.Objects.equals(this.oracleCanInitiate, other.oracleCanInitiate)
                && java.util.Objects.equals(this.natTranslationEnabled, other.natTranslationEnabled)
                && java.util.Objects.equals(this.dpdMode, other.dpdMode)
                && java.util.Objects.equals(this.dpdTimeoutInSec, other.dpdTimeoutInSec)
                && java.util.Objects.equals(this.phaseOneDetails, other.phaseOneDetails)
                && java.util.Objects.equals(this.phaseTwoDetails, other.phaseTwoDetails)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.vpnIp == null ? 43 : this.vpnIp.hashCode());
        result = (result * PRIME) + (this.cpeIp == null ? 43 : this.cpeIp.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.ikeVersion == null ? 43 : this.ikeVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpSessionInfo == null ? 43 : this.bgpSessionInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionDomainConfig == null
                                ? 43
                                : this.encryptionDomainConfig.hashCode());
        result = (result * PRIME) + (this.routing == null ? 43 : this.routing.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStatusUpdated == null ? 43 : this.timeStatusUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleCanInitiate == null ? 43 : this.oracleCanInitiate.hashCode());
        result =
                (result * PRIME)
                        + (this.natTranslationEnabled == null
                                ? 43
                                : this.natTranslationEnabled.hashCode());
        result = (result * PRIME) + (this.dpdMode == null ? 43 : this.dpdMode.hashCode());
        result =
                (result * PRIME)
                        + (this.dpdTimeoutInSec == null ? 43 : this.dpdTimeoutInSec.hashCode());
        result =
                (result * PRIME)
                        + (this.phaseOneDetails == null ? 43 : this.phaseOneDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.phaseTwoDetails == null ? 43 : this.phaseTwoDetails.hashCode());
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
