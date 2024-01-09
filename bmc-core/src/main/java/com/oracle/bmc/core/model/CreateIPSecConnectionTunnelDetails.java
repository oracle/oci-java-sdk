/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

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
        builder = CreateIPSecConnectionTunnelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateIPSecConnectionTunnelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "routing",
        "ikeVersion",
        "sharedSecret",
        "bgpSessionConfig",
        "oracleInitiation",
        "natTranslationEnabled",
        "phaseOneConfig",
        "phaseTwoConfig",
        "dpdConfig",
        "oracleTunnelIp",
        "associatedVirtualCircuits",
        "drgRouteTableId",
        "encryptionDomainConfig"
    })
    public CreateIPSecConnectionTunnelDetails(
            String displayName,
            Routing routing,
            IkeVersion ikeVersion,
            String sharedSecret,
            CreateIPSecTunnelBgpSessionDetails bgpSessionConfig,
            OracleInitiation oracleInitiation,
            NatTranslationEnabled natTranslationEnabled,
            PhaseOneConfigDetails phaseOneConfig,
            PhaseTwoConfigDetails phaseTwoConfig,
            DpdConfig dpdConfig,
            String oracleTunnelIp,
            java.util.List<String> associatedVirtualCircuits,
            String drgRouteTableId,
            CreateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig) {
        super();
        this.displayName = displayName;
        this.routing = routing;
        this.ikeVersion = ikeVersion;
        this.sharedSecret = sharedSecret;
        this.bgpSessionConfig = bgpSessionConfig;
        this.oracleInitiation = oracleInitiation;
        this.natTranslationEnabled = natTranslationEnabled;
        this.phaseOneConfig = phaseOneConfig;
        this.phaseTwoConfig = phaseTwoConfig;
        this.dpdConfig = dpdConfig;
        this.oracleTunnelIp = oracleTunnelIp;
        this.associatedVirtualCircuits = associatedVirtualCircuits;
        this.drgRouteTableId = drgRouteTableId;
        this.encryptionDomainConfig = encryptionDomainConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /**
         * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or
         * policy-based routing).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        /**
         * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or
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
        /**
         * The shared secret (pre-shared key) to use for the IPSec tunnel. Only numbers, letters,
         * and spaces are allowed. If you don't provide a value, Oracle generates a value for you.
         * You can specify your own shared secret later if you like with {@link
         * #updateIPSecConnectionTunnelSharedSecret(UpdateIPSecConnectionTunnelSharedSecretRequest)
         * updateIPSecConnectionTunnelSharedSecret}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
        private String sharedSecret;

        /**
         * The shared secret (pre-shared key) to use for the IPSec tunnel. Only numbers, letters,
         * and spaces are allowed. If you don't provide a value, Oracle generates a value for you.
         * You can specify your own shared secret later if you like with {@link
         * #updateIPSecConnectionTunnelSharedSecret(UpdateIPSecConnectionTunnelSharedSecretRequest)
         * updateIPSecConnectionTunnelSharedSecret}.
         *
         * @param sharedSecret the value to set
         * @return this builder
         */
        public Builder sharedSecret(String sharedSecret) {
            this.sharedSecret = sharedSecret;
            this.__explicitlySet__.add("sharedSecret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
        private CreateIPSecTunnelBgpSessionDetails bgpSessionConfig;

        public Builder bgpSessionConfig(CreateIPSecTunnelBgpSessionDetails bgpSessionConfig) {
            this.bgpSessionConfig = bgpSessionConfig;
            this.__explicitlySet__.add("bgpSessionConfig");
            return this;
        }
        /**
         * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up
         * the IPSec tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleInitiation")
        private OracleInitiation oracleInitiation;

        /**
         * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up
         * the IPSec tunnel.
         *
         * @param oracleInitiation the value to set
         * @return this builder
         */
        public Builder oracleInitiation(OracleInitiation oracleInitiation) {
            this.oracleInitiation = oracleInitiation;
            this.__explicitlySet__.add("oracleInitiation");
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
         * @param natTranslationEnabled the value to set
         * @return this builder
         */
        public Builder natTranslationEnabled(NatTranslationEnabled natTranslationEnabled) {
            this.natTranslationEnabled = natTranslationEnabled;
            this.__explicitlySet__.add("natTranslationEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phaseOneConfig")
        private PhaseOneConfigDetails phaseOneConfig;

        public Builder phaseOneConfig(PhaseOneConfigDetails phaseOneConfig) {
            this.phaseOneConfig = phaseOneConfig;
            this.__explicitlySet__.add("phaseOneConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phaseTwoConfig")
        private PhaseTwoConfigDetails phaseTwoConfig;

        public Builder phaseTwoConfig(PhaseTwoConfigDetails phaseTwoConfig) {
            this.phaseTwoConfig = phaseTwoConfig;
            this.__explicitlySet__.add("phaseTwoConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dpdConfig")
        private DpdConfig dpdConfig;

        public Builder dpdConfig(DpdConfig dpdConfig) {
            this.dpdConfig = dpdConfig;
            this.__explicitlySet__.add("dpdConfig");
            return this;
        }
        /**
         * The headend IP that you can choose on the Oracle side to terminate your private IPSec
         * tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleTunnelIp")
        private String oracleTunnelIp;

        /**
         * The headend IP that you can choose on the Oracle side to terminate your private IPSec
         * tunnel.
         *
         * @param oracleTunnelIp the value to set
         * @return this builder
         */
        public Builder oracleTunnelIp(String oracleTunnelIp) {
            this.oracleTunnelIp = oracleTunnelIp;
            this.__explicitlySet__.add("oracleTunnelIp");
            return this;
        }
        /**
         * The list of virtual circuit
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s over
         * which your network can reach this tunnel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("associatedVirtualCircuits")
        private java.util.List<String> associatedVirtualCircuits;

        /**
         * The list of virtual circuit
         * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s over
         * which your network can reach this tunnel.
         *
         * @param associatedVirtualCircuits the value to set
         * @return this builder
         */
        public Builder associatedVirtualCircuits(java.util.List<String> associatedVirtualCircuits) {
            this.associatedVirtualCircuits = associatedVirtualCircuits;
            this.__explicitlySet__.add("associatedVirtualCircuits");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG route table assigned to this attachment.
         *
         * <p>The DRG route table manages traffic inside the DRG.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
        private String drgRouteTableId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the DRG route table assigned to this attachment.
         *
         * <p>The DRG route table manages traffic inside the DRG.
         *
         * @param drgRouteTableId the value to set
         * @return this builder
         */
        public Builder drgRouteTableId(String drgRouteTableId) {
            this.drgRouteTableId = drgRouteTableId;
            this.__explicitlySet__.add("drgRouteTableId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
        private CreateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig;

        public Builder encryptionDomainConfig(
                CreateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig) {
            this.encryptionDomainConfig = encryptionDomainConfig;
            this.__explicitlySet__.add("encryptionDomainConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIPSecConnectionTunnelDetails build() {
            CreateIPSecConnectionTunnelDetails model =
                    new CreateIPSecConnectionTunnelDetails(
                            this.displayName,
                            this.routing,
                            this.ikeVersion,
                            this.sharedSecret,
                            this.bgpSessionConfig,
                            this.oracleInitiation,
                            this.natTranslationEnabled,
                            this.phaseOneConfig,
                            this.phaseTwoConfig,
                            this.dpdConfig,
                            this.oracleTunnelIp,
                            this.associatedVirtualCircuits,
                            this.drgRouteTableId,
                            this.encryptionDomainConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIPSecConnectionTunnelDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("routing")) {
                this.routing(model.getRouting());
            }
            if (model.wasPropertyExplicitlySet("ikeVersion")) {
                this.ikeVersion(model.getIkeVersion());
            }
            if (model.wasPropertyExplicitlySet("sharedSecret")) {
                this.sharedSecret(model.getSharedSecret());
            }
            if (model.wasPropertyExplicitlySet("bgpSessionConfig")) {
                this.bgpSessionConfig(model.getBgpSessionConfig());
            }
            if (model.wasPropertyExplicitlySet("oracleInitiation")) {
                this.oracleInitiation(model.getOracleInitiation());
            }
            if (model.wasPropertyExplicitlySet("natTranslationEnabled")) {
                this.natTranslationEnabled(model.getNatTranslationEnabled());
            }
            if (model.wasPropertyExplicitlySet("phaseOneConfig")) {
                this.phaseOneConfig(model.getPhaseOneConfig());
            }
            if (model.wasPropertyExplicitlySet("phaseTwoConfig")) {
                this.phaseTwoConfig(model.getPhaseTwoConfig());
            }
            if (model.wasPropertyExplicitlySet("dpdConfig")) {
                this.dpdConfig(model.getDpdConfig());
            }
            if (model.wasPropertyExplicitlySet("oracleTunnelIp")) {
                this.oracleTunnelIp(model.getOracleTunnelIp());
            }
            if (model.wasPropertyExplicitlySet("associatedVirtualCircuits")) {
                this.associatedVirtualCircuits(model.getAssociatedVirtualCircuits());
            }
            if (model.wasPropertyExplicitlySet("drgRouteTableId")) {
                this.drgRouteTableId(model.getDrgRouteTableId());
            }
            if (model.wasPropertyExplicitlySet("encryptionDomainConfig")) {
                this.encryptionDomainConfig(model.getEncryptionDomainConfig());
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

    /**
     * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or
     * policy-based routing).
     */
    public enum Routing implements com.oracle.bmc.http.internal.BmcEnum {
        Bgp("BGP"),
        Static("STATIC"),
        Policy("POLICY"),
        ;

        private final String value;
        private static java.util.Map<String, Routing> map;

        static {
            map = new java.util.HashMap<>();
            for (Routing v : Routing.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Routing: " + key);
        }
    };
    /**
     * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or
     * policy-based routing).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    private final Routing routing;

    /**
     * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or
     * policy-based routing).
     *
     * @return the value
     */
    public Routing getRouting() {
        return routing;
    }

    /** Internet Key Exchange protocol version. */
    public enum IkeVersion implements com.oracle.bmc.http.internal.BmcEnum {
        V1("V1"),
        V2("V2"),
        ;

        private final String value;
        private static java.util.Map<String, IkeVersion> map;

        static {
            map = new java.util.HashMap<>();
            for (IkeVersion v : IkeVersion.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid IkeVersion: " + key);
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

    /**
     * The shared secret (pre-shared key) to use for the IPSec tunnel. Only numbers, letters, and
     * spaces are allowed. If you don't provide a value, Oracle generates a value for you. You can
     * specify your own shared secret later if you like with {@link
     * #updateIPSecConnectionTunnelSharedSecret(UpdateIPSecConnectionTunnelSharedSecretRequest)
     * updateIPSecConnectionTunnelSharedSecret}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
    private final String sharedSecret;

    /**
     * The shared secret (pre-shared key) to use for the IPSec tunnel. Only numbers, letters, and
     * spaces are allowed. If you don't provide a value, Oracle generates a value for you. You can
     * specify your own shared secret later if you like with {@link
     * #updateIPSecConnectionTunnelSharedSecret(UpdateIPSecConnectionTunnelSharedSecretRequest)
     * updateIPSecConnectionTunnelSharedSecret}.
     *
     * @return the value
     */
    public String getSharedSecret() {
        return sharedSecret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
    private final CreateIPSecTunnelBgpSessionDetails bgpSessionConfig;

    public CreateIPSecTunnelBgpSessionDetails getBgpSessionConfig() {
        return bgpSessionConfig;
    }

    /**
     * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up the
     * IPSec tunnel.
     */
    public enum OracleInitiation implements com.oracle.bmc.http.internal.BmcEnum {
        InitiatorOrResponder("INITIATOR_OR_RESPONDER"),
        ResponderOnly("RESPONDER_ONLY"),
        ;

        private final String value;
        private static java.util.Map<String, OracleInitiation> map;

        static {
            map = new java.util.HashMap<>();
            for (OracleInitiation v : OracleInitiation.values()) {
                map.put(v.getValue(), v);
            }
        }

        OracleInitiation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static OracleInitiation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid OracleInitiation: " + key);
        }
    };
    /**
     * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up the
     * IPSec tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInitiation")
    private final OracleInitiation oracleInitiation;

    /**
     * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up the
     * IPSec tunnel.
     *
     * @return the value
     */
    public OracleInitiation getOracleInitiation() {
        return oracleInitiation;
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
     */
    public enum NatTranslationEnabled implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        Auto("AUTO"),
        ;

        private final String value;
        private static java.util.Map<String, NatTranslationEnabled> map;

        static {
            map = new java.util.HashMap<>();
            for (NatTranslationEnabled v : NatTranslationEnabled.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid NatTranslationEnabled: " + key);
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
     * @return the value
     */
    public NatTranslationEnabled getNatTranslationEnabled() {
        return natTranslationEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phaseOneConfig")
    private final PhaseOneConfigDetails phaseOneConfig;

    public PhaseOneConfigDetails getPhaseOneConfig() {
        return phaseOneConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phaseTwoConfig")
    private final PhaseTwoConfigDetails phaseTwoConfig;

    public PhaseTwoConfigDetails getPhaseTwoConfig() {
        return phaseTwoConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dpdConfig")
    private final DpdConfig dpdConfig;

    public DpdConfig getDpdConfig() {
        return dpdConfig;
    }

    /**
     * The headend IP that you can choose on the Oracle side to terminate your private IPSec tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleTunnelIp")
    private final String oracleTunnelIp;

    /**
     * The headend IP that you can choose on the Oracle side to terminate your private IPSec tunnel.
     *
     * @return the value
     */
    public String getOracleTunnelIp() {
        return oracleTunnelIp;
    }

    /**
     * The list of virtual circuit
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s over
     * which your network can reach this tunnel.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("associatedVirtualCircuits")
    private final java.util.List<String> associatedVirtualCircuits;

    /**
     * The list of virtual circuit
     * [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)s over
     * which your network can reach this tunnel.
     *
     * @return the value
     */
    public java.util.List<String> getAssociatedVirtualCircuits() {
        return associatedVirtualCircuits;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG route table assigned to this attachment.
     *
     * <p>The DRG route table manages traffic inside the DRG.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("drgRouteTableId")
    private final String drgRouteTableId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the DRG route table assigned to this attachment.
     *
     * <p>The DRG route table manages traffic inside the DRG.
     *
     * @return the value
     */
    public String getDrgRouteTableId() {
        return drgRouteTableId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
    private final CreateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig;

    public CreateIPSecTunnelEncryptionDomainDetails getEncryptionDomainConfig() {
        return encryptionDomainConfig;
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
        sb.append("CreateIPSecConnectionTunnelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", routing=").append(String.valueOf(this.routing));
        sb.append(", ikeVersion=").append(String.valueOf(this.ikeVersion));
        sb.append(", sharedSecret=").append(String.valueOf(this.sharedSecret));
        sb.append(", bgpSessionConfig=").append(String.valueOf(this.bgpSessionConfig));
        sb.append(", oracleInitiation=").append(String.valueOf(this.oracleInitiation));
        sb.append(", natTranslationEnabled=").append(String.valueOf(this.natTranslationEnabled));
        sb.append(", phaseOneConfig=").append(String.valueOf(this.phaseOneConfig));
        sb.append(", phaseTwoConfig=").append(String.valueOf(this.phaseTwoConfig));
        sb.append(", dpdConfig=").append(String.valueOf(this.dpdConfig));
        sb.append(", oracleTunnelIp=").append(String.valueOf(this.oracleTunnelIp));
        sb.append(", associatedVirtualCircuits=")
                .append(String.valueOf(this.associatedVirtualCircuits));
        sb.append(", drgRouteTableId=").append(String.valueOf(this.drgRouteTableId));
        sb.append(", encryptionDomainConfig=").append(String.valueOf(this.encryptionDomainConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateIPSecConnectionTunnelDetails)) {
            return false;
        }

        CreateIPSecConnectionTunnelDetails other = (CreateIPSecConnectionTunnelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.routing, other.routing)
                && java.util.Objects.equals(this.ikeVersion, other.ikeVersion)
                && java.util.Objects.equals(this.sharedSecret, other.sharedSecret)
                && java.util.Objects.equals(this.bgpSessionConfig, other.bgpSessionConfig)
                && java.util.Objects.equals(this.oracleInitiation, other.oracleInitiation)
                && java.util.Objects.equals(this.natTranslationEnabled, other.natTranslationEnabled)
                && java.util.Objects.equals(this.phaseOneConfig, other.phaseOneConfig)
                && java.util.Objects.equals(this.phaseTwoConfig, other.phaseTwoConfig)
                && java.util.Objects.equals(this.dpdConfig, other.dpdConfig)
                && java.util.Objects.equals(this.oracleTunnelIp, other.oracleTunnelIp)
                && java.util.Objects.equals(
                        this.associatedVirtualCircuits, other.associatedVirtualCircuits)
                && java.util.Objects.equals(this.drgRouteTableId, other.drgRouteTableId)
                && java.util.Objects.equals(
                        this.encryptionDomainConfig, other.encryptionDomainConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.routing == null ? 43 : this.routing.hashCode());
        result = (result * PRIME) + (this.ikeVersion == null ? 43 : this.ikeVersion.hashCode());
        result = (result * PRIME) + (this.sharedSecret == null ? 43 : this.sharedSecret.hashCode());
        result =
                (result * PRIME)
                        + (this.bgpSessionConfig == null ? 43 : this.bgpSessionConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleInitiation == null ? 43 : this.oracleInitiation.hashCode());
        result =
                (result * PRIME)
                        + (this.natTranslationEnabled == null
                                ? 43
                                : this.natTranslationEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.phaseOneConfig == null ? 43 : this.phaseOneConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.phaseTwoConfig == null ? 43 : this.phaseTwoConfig.hashCode());
        result = (result * PRIME) + (this.dpdConfig == null ? 43 : this.dpdConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleTunnelIp == null ? 43 : this.oracleTunnelIp.hashCode());
        result =
                (result * PRIME)
                        + (this.associatedVirtualCircuits == null
                                ? 43
                                : this.associatedVirtualCircuits.hashCode());
        result =
                (result * PRIME)
                        + (this.drgRouteTableId == null ? 43 : this.drgRouteTableId.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionDomainConfig == null
                                ? 43
                                : this.encryptionDomainConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
