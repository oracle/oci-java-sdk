/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
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
    builder = CreateIPSecConnectionTunnelDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateIPSecConnectionTunnelDetails {
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
        this.encryptionDomainConfig = encryptionDomainConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("routing")
        private Routing routing;

        public Builder routing(Routing routing) {
            this.routing = routing;
            this.__explicitlySet__.add("routing");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ikeVersion")
        private IkeVersion ikeVersion;

        public Builder ikeVersion(IkeVersion ikeVersion) {
            this.ikeVersion = ikeVersion;
            this.__explicitlySet__.add("ikeVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
        private String sharedSecret;

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

        @com.fasterxml.jackson.annotation.JsonProperty("oracleInitiation")
        private OracleInitiation oracleInitiation;

        public Builder oracleInitiation(OracleInitiation oracleInitiation) {
            this.oracleInitiation = oracleInitiation;
            this.__explicitlySet__.add("oracleInitiation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
        private NatTranslationEnabled natTranslationEnabled;

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
            CreateIPSecConnectionTunnelDetails __instance__ =
                    new CreateIPSecConnectionTunnelDetails(
                            displayName,
                            routing,
                            ikeVersion,
                            sharedSecret,
                            bgpSessionConfig,
                            oracleInitiation,
                            natTranslationEnabled,
                            phaseOneConfig,
                            phaseTwoConfig,
                            dpdConfig,
                            encryptionDomainConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIPSecConnectionTunnelDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .routing(o.getRouting())
                            .ikeVersion(o.getIkeVersion())
                            .sharedSecret(o.getSharedSecret())
                            .bgpSessionConfig(o.getBgpSessionConfig())
                            .oracleInitiation(o.getOracleInitiation())
                            .natTranslationEnabled(o.getNatTranslationEnabled())
                            .phaseOneConfig(o.getPhaseOneConfig())
                            .phaseTwoConfig(o.getPhaseTwoConfig())
                            .dpdConfig(o.getDpdConfig())
                            .encryptionDomainConfig(o.getEncryptionDomainConfig());

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
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or policy-based routing).
     *
     **/
    public enum Routing {
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
     * The type of routing to use for this tunnel (BGP dynamic routing, static routing, or policy-based routing).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routing")
    private final Routing routing;

    public Routing getRouting() {
        return routing;
    }

    /**
     * Internet Key Exchange protocol version.
     *
     **/
    public enum IkeVersion {
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
     * The shared secret (pre-shared key) to use for the IPSec tunnel. Only numbers, letters, and
     * spaces are allowed. If you don't provide a value,
     * Oracle generates a value for you. You can specify your own shared secret later if
     * you like with {@link #updateIPSecConnectionTunnelSharedSecret(UpdateIPSecConnectionTunnelSharedSecretRequest) updateIPSecConnectionTunnelSharedSecret}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sharedSecret")
    private final String sharedSecret;

    public String getSharedSecret() {
        return sharedSecret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
    private final CreateIPSecTunnelBgpSessionDetails bgpSessionConfig;

    public CreateIPSecTunnelBgpSessionDetails getBgpSessionConfig() {
        return bgpSessionConfig;
    }

    /**
     * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up the IPSec tunnel.
     *
     **/
    public enum OracleInitiation {
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
     * Indicates whether the Oracle end of the IPSec connection is able to initiate starting up the IPSec tunnel.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleInitiation")
    private final OracleInitiation oracleInitiation;

    public OracleInitiation getOracleInitiation() {
        return oracleInitiation;
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
     *
     **/
    public enum NatTranslationEnabled {
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
     * By default (the {@code AUTO} setting), IKE sends packets with a source and destination port set to 500,
     * and when it detects that the port used to forward packets has changed (most likely because a NAT device
     * is between the CPE device and the Oracle VPN headend) it will try to negotiate the use of NAT-T.
     * <p>
     * The {@code ENABLED} option sets the IKE protocol to use port 4500 instead of 500 and forces encapsulating traffic with the ESP protocol inside UDP packets.
     * <p>
     * The {@code DISABLED} option directs IKE to completely refuse to negotiate NAT-T
     * even if it senses there may be a NAT device in use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("natTranslationEnabled")
    private final NatTranslationEnabled natTranslationEnabled;

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

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
    private final CreateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig;

    public CreateIPSecTunnelEncryptionDomainDetails getEncryptionDomainConfig() {
        return encryptionDomainConfig;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateIPSecConnectionTunnelDetails(");
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
        sb.append(", encryptionDomainConfig=").append(String.valueOf(this.encryptionDomainConfig));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(
                        this.encryptionDomainConfig, other.encryptionDomainConfig)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.encryptionDomainConfig == null
                                ? 43
                                : this.encryptionDomainConfig.hashCode());
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
