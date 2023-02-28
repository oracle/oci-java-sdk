/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about a single IPSec tunnel in an IPSec connection. This object does not include the
 * tunnel's shared secret (pre-shared key), which is found in the {@link
 * IPSecConnectionTunnelSharedSecret} object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IPSecConnectionTunnel.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IPSecConnectionTunnel
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the compartment containing the tunnel.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the tunnel.
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
         * The IP address of the Oracle VPN headend for the connection.
         *
         * <p>Example: {@code 203.0.113.21}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
        private String vpnIp;

        /**
         * The IP address of the Oracle VPN headend for the connection.
         *
         * <p>Example: {@code 203.0.113.21}
         *
         * @param vpnIp the value to set
         * @return this builder
         */
        public Builder vpnIp(String vpnIp) {
            this.vpnIp = vpnIp;
            this.__explicitlySet__.add("vpnIp");
            return this;
        }
        /**
         * The IP address of the CPE device's VPN headend.
         *
         * <p>Example: {@code 203.0.113.22}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
        private String cpeIp;

        /**
         * The IP address of the CPE device's VPN headend.
         *
         * <p>Example: {@code 203.0.113.22}
         *
         * @param cpeIp the value to set
         * @return this builder
         */
        public Builder cpeIp(String cpeIp) {
            this.cpeIp = cpeIp;
            this.__explicitlySet__.add("cpeIp");
            return this;
        }
        /** The status of the tunnel based on IPSec protocol characteristics. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * The status of the tunnel based on IPSec protocol characteristics.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Internet Key Exchange protocol version. */
        @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
        private IkeVersion ikeVersion;

        /**
         * Internet Key Exchange protocol version.
         *
         * @param ikeVersion the value to set
         * @return this builder
         */
        public Builder ikeVersion(IkeVersion ikeVersion) {
            this.ikeVersion = ikeVersion;
            this.__explicitlySet__.add("ikeVersion");
            return this;
        }
        /** The tunnel's lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The tunnel's lifecycle state.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
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
        /**
         * The type of routing used for this tunnel (BGP dynamic routing, static routing, or
         * policy-based routing).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        /**
         * The type of routing used for this tunnel (BGP dynamic routing, static routing, or
         * policy-based routing).
         *
         * @param routing the value to set
         * @return this builder
         */
        public Builder routing(Routing routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }
        /**
         * The date and time the IPSec tunnel was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the IPSec tunnel was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * When the status of the IPSec tunnel last changed, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
        private java.util.Date timeStatusUpdated;

        /**
         * When the status of the IPSec tunnel last changed, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeStatusUpdated the value to set
         * @return this builder
         */
        public Builder timeStatusUpdated(java.util.Date timeStatusUpdated) {
            this.timeStatusUpdated = timeStatusUpdated;
            this.__explicitlySet__.add("timeStatusUpdated");
            return this;
        }
        /**
         * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the
         * CPE device, or both respond to and initiate requests.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleCanInitiate")
        private OracleCanInitiate oracleCanInitiate;

        /**
         * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the
         * CPE device, or both respond to and initiate requests.
         *
         * @param oracleCanInitiate the value to set
         * @return this builder
         */
        public Builder oracleCanInitiate(OracleCanInitiate oracleCanInitiate) {
            this.oracleCanInitiate = oracleCanInitiate;
            this.__explicitlySet__.add("oracleCanInitiate");
            return this;
        }
        /**
         * By default (the {@code AUTO} setting), IKE sends packets with a source and destination
         * port set to 500, and when it detects that the port used to forward packets has changed
         * (most likely because a NAT device is between the CPE device and the Oracle VPN headend)
         * it will try to negotiate the use of NAT-T.
         *
         * <p>The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and
         * forces encapsulating traffic with the ESP protocol inside UDP packets.
         *
         * <p>The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T even
         * if it senses there may be a NAT device in use.
         *
         * <p>.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
        private NatTranslationEnabled natTranslationEnabled;

        /**
         * By default (the {@code AUTO} setting), IKE sends packets with a source and destination
         * port set to 500, and when it detects that the port used to forward packets has changed
         * (most likely because a NAT device is between the CPE device and the Oracle VPN headend)
         * it will try to negotiate the use of NAT-T.
         *
         * <p>The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and
         * forces encapsulating traffic with the ESP protocol inside UDP packets.
         *
         * <p>The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T even
         * if it senses there may be a NAT device in use.
         *
         * <p>.
         *
         * @param natTranslationEnabled the value to set
         * @return this builder
         */
        public Builder natTranslationEnabled(NatTranslationEnabled natTranslationEnabled) {
            this.natTranslationEnabled = natTranslationEnabled;
            this.__explicitlySet__.add("natTranslationEnabled");
            return this;
        }
        /**
         * Dead peer detection (DPD) mode set on the Oracle side of the connection. This mode sets
         * whether Oracle can only respond to a request from the CPE device to start DPD, or both
         * respond to and initiate requests.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
        private DpdMode dpdMode;

        /**
         * Dead peer detection (DPD) mode set on the Oracle side of the connection. This mode sets
         * whether Oracle can only respond to a request from the CPE device to start DPD, or both
         * respond to and initiate requests.
         *
         * @param dpdMode the value to set
         * @return this builder
         */
        public Builder dpdMode(DpdMode dpdMode) {
            this.dpdMode = dpdMode;
            this.__explicitlySet__.add("dpdMode");
            return this;
        }
        /** DPD timeout in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
        private Integer dpdTimeoutInSec;

        /**
         * DPD timeout in seconds.
         *
         * @param dpdTimeoutInSec the value to set
         * @return this builder
         */
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
            IPSecConnectionTunnel model =
                    new IPSecConnectionTunnel(
                            this.compartmentId,
                            this.id,
                            this.vpnIp,
                            this.cpeIp,
                            this.status,
                            this.ikeVersion,
                            this.lifecycleState,
                            this.displayName,
                            this.bgpSessionInfo,
                            this.encryptionDomainConfig,
                            this.routing,
                            this.timeCreated,
                            this.timeStatusUpdated,
                            this.oracleCanInitiate,
                            this.natTranslationEnabled,
                            this.dpdMode,
                            this.dpdTimeoutInSec,
                            this.phaseOneDetails,
                            this.phaseTwoDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IPSecConnectionTunnel model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("vpnIp")) {
                this.vpnIp(model.getVpnIp());
            }
            if (model.wasPropertyExplicitlySet("cpeIp")) {
                this.cpeIp(model.getCpeIp());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("ikeVersion")) {
                this.ikeVersion(model.getIkeVersion());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("bgpSessionInfo")) {
                this.bgpSessionInfo(model.getBgpSessionInfo());
            }
            if (model.wasPropertyExplicitlySet("encryptionDomainConfig")) {
                this.encryptionDomainConfig(model.getEncryptionDomainConfig());
            }
            if (model.wasPropertyExplicitlySet("routing")) {
                this.routing(model.getRouting());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStatusUpdated")) {
                this.timeStatusUpdated(model.getTimeStatusUpdated());
            }
            if (model.wasPropertyExplicitlySet("oracleCanInitiate")) {
                this.oracleCanInitiate(model.getOracleCanInitiate());
            }
            if (model.wasPropertyExplicitlySet("natTranslationEnabled")) {
                this.natTranslationEnabled(model.getNatTranslationEnabled());
            }
            if (model.wasPropertyExplicitlySet("dpdMode")) {
                this.dpdMode(model.getDpdMode());
            }
            if (model.wasPropertyExplicitlySet("dpdTimeoutInSec")) {
                this.dpdTimeoutInSec(model.getDpdTimeoutInSec());
            }
            if (model.wasPropertyExplicitlySet("phaseOneDetails")) {
                this.phaseOneDetails(model.getPhaseOneDetails());
            }
            if (model.wasPropertyExplicitlySet("phaseTwoDetails")) {
                this.phaseTwoDetails(model.getPhaseTwoDetails());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the compartment containing the tunnel.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the tunnel.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The IP address of the Oracle VPN headend for the connection.
     *
     * <p>Example: {@code 203.0.113.21}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vpnIp")
    private final String vpnIp;

    /**
     * The IP address of the Oracle VPN headend for the connection.
     *
     * <p>Example: {@code 203.0.113.21}
     *
     * @return the value
     */
    public String getVpnIp() {
        return vpnIp;
    }

    /**
     * The IP address of the CPE device's VPN headend.
     *
     * <p>Example: {@code 203.0.113.22}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cpeIp")
    private final String cpeIp;

    /**
     * The IP address of the CPE device's VPN headend.
     *
     * <p>Example: {@code 203.0.113.22}
     *
     * @return the value
     */
    public String getCpeIp() {
        return cpeIp;
    }

    /** The status of the tunnel based on IPSec protocol characteristics. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Up("UP"),
        Down("DOWN"),
        DownForMaintenance("DOWN_FOR_MAINTENANCE"),
        PartialUp("PARTIAL_UP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** The status of the tunnel based on IPSec protocol characteristics. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * The status of the tunnel based on IPSec protocol characteristics.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Internet Key Exchange protocol version. */
    public enum IkeVersion implements com.oracle.bmc.http.internal.BmcEnum {
        V1("V1"),
        V2("V2"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Internet Key Exchange protocol version. */
    @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
    private final IkeVersion ikeVersion;

    /**
     * Internet Key Exchange protocol version.
     *
     * @return the value
     */
    public IkeVersion getIkeVersion() {
        return ikeVersion;
    }

    /** The tunnel's lifecycle state. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

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
    /** The tunnel's lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The tunnel's lifecycle state.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
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
     * The type of routing used for this tunnel (BGP dynamic routing, static routing, or
     * policy-based routing).
     */
    public enum Routing implements com.oracle.bmc.http.internal.BmcEnum {
        Bgp("BGP"),
        Static("STATIC"),
        Policy("POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The type of routing used for this tunnel (BGP dynamic routing, static routing, or
     * policy-based routing).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    private final Routing routing;

    /**
     * The type of routing used for this tunnel (BGP dynamic routing, static routing, or
     * policy-based routing).
     *
     * @return the value
     */
    public Routing getRouting() {
        return routing;
    }

    /**
     * The date and time the IPSec tunnel was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the IPSec tunnel was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * When the status of the IPSec tunnel last changed, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStatusUpdated")
    private final java.util.Date timeStatusUpdated;

    /**
     * When the status of the IPSec tunnel last changed, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStatusUpdated() {
        return timeStatusUpdated;
    }

    /**
     * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the CPE
     * device, or both respond to and initiate requests.
     */
    public enum OracleCanInitiate implements com.oracle.bmc.http.internal.BmcEnum {
        InitiatorOrResponder("INITIATOR_OR_RESPONDER"),
        ResponderOnly("RESPONDER_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the CPE
     * device, or both respond to and initiate requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleCanInitiate")
    private final OracleCanInitiate oracleCanInitiate;

    /**
     * Indicates whether Oracle can only respond to a request to start an IPSec tunnel from the CPE
     * device, or both respond to and initiate requests.
     *
     * @return the value
     */
    public OracleCanInitiate getOracleCanInitiate() {
        return oracleCanInitiate;
    }

    /**
     * By default (the {@code AUTO} setting), IKE sends packets with a source and destination port
     * set to 500, and when it detects that the port used to forward packets has changed (most
     * likely because a NAT device is between the CPE device and the Oracle VPN headend) it will try
     * to negotiate the use of NAT-T.
     *
     * <p>The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and
     * forces encapsulating traffic with the ESP protocol inside UDP packets.
     *
     * <p>The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T even if it
     * senses there may be a NAT device in use.
     *
     * <p>.
     */
    public enum NatTranslationEnabled implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Auto("AUTO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * By default (the {@code AUTO} setting), IKE sends packets with a source and destination port
     * set to 500, and when it detects that the port used to forward packets has changed (most
     * likely because a NAT device is between the CPE device and the Oracle VPN headend) it will try
     * to negotiate the use of NAT-T.
     *
     * <p>The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and
     * forces encapsulating traffic with the ESP protocol inside UDP packets.
     *
     * <p>The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T even if it
     * senses there may be a NAT device in use.
     *
     * <p>.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
    private final NatTranslationEnabled natTranslationEnabled;

    /**
     * By default (the {@code AUTO} setting), IKE sends packets with a source and destination port
     * set to 500, and when it detects that the port used to forward packets has changed (most
     * likely because a NAT device is between the CPE device and the Oracle VPN headend) it will try
     * to negotiate the use of NAT-T.
     *
     * <p>The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and
     * forces encapsulating traffic with the ESP protocol inside UDP packets.
     *
     * <p>The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T even if it
     * senses there may be a NAT device in use.
     *
     * <p>.
     *
     * @return the value
     */
    public NatTranslationEnabled getNatTranslationEnabled() {
        return natTranslationEnabled;
    }

    /**
     * Dead peer detection (DPD) mode set on the Oracle side of the connection. This mode sets
     * whether Oracle can only respond to a request from the CPE device to start DPD, or both
     * respond to and initiate requests.
     */
    public enum DpdMode implements com.oracle.bmc.http.internal.BmcEnum {
        InitiateAndRespond("INITIATE_AND_RESPOND"),
        RespondOnly("RESPOND_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * Dead peer detection (DPD) mode set on the Oracle side of the connection. This mode sets
     * whether Oracle can only respond to a request from the CPE device to start DPD, or both
     * respond to and initiate requests.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dpdMode")
    private final DpdMode dpdMode;

    /**
     * Dead peer detection (DPD) mode set on the Oracle side of the connection. This mode sets
     * whether Oracle can only respond to a request from the CPE device to start DPD, or both
     * respond to and initiate requests.
     *
     * @return the value
     */
    public DpdMode getDpdMode() {
        return dpdMode;
    }

    /** DPD timeout in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("dpdTimeoutInSec")
    private final Integer dpdTimeoutInSec;

    /**
     * DPD timeout in seconds.
     *
     * @return the value
     */
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
        sb.append("IPSecConnectionTunnel(");
        sb.append("super=").append(super.toString());
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
