/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
        builder = UpdateIPSecConnectionTunnelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateIPSecConnectionTunnelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "routing",
        "ikeVersion",
        "bgpSessionConfig",
        "oracleInitiation",
        "natTranslationEnabled",
        "phaseOneConfig",
        "phaseTwoConfig",
        "dpdConfig",
        "encryptionDomainConfig"
    })
    public UpdateIPSecConnectionTunnelDetails(
            String displayName,
            Routing routing,
            IkeVersion ikeVersion,
            UpdateIPSecTunnelBgpSessionDetails bgpSessionConfig,
            OracleInitiation oracleInitiation,
            NatTranslationEnabled natTranslationEnabled,
            PhaseOneConfigDetails phaseOneConfig,
            PhaseTwoConfigDetails phaseTwoConfig,
            DpdConfig dpdConfig,
            UpdateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig) {
        super();
        this.displayName = displayName;
        this.routing = routing;
        this.ikeVersion = ikeVersion;
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

        @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
        private UpdateIPSecTunnelBgpSessionDetails bgpSessionConfig;

        public Builder bgpSessionConfig(UpdateIPSecTunnelBgpSessionDetails bgpSessionConfig) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
        private UpdateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig;

        public Builder encryptionDomainConfig(
                UpdateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig) {
            this.encryptionDomainConfig = encryptionDomainConfig;
            this.__explicitlySet__.add("encryptionDomainConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateIPSecConnectionTunnelDetails build() {
            UpdateIPSecConnectionTunnelDetails model =
                    new UpdateIPSecConnectionTunnelDetails(
                            this.displayName,
                            this.routing,
                            this.ikeVersion,
                            this.bgpSessionConfig,
                            this.oracleInitiation,
                            this.natTranslationEnabled,
                            this.phaseOneConfig,
                            this.phaseTwoConfig,
                            this.dpdConfig,
                            this.encryptionDomainConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateIPSecConnectionTunnelDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("routing")) {
                this.routing(model.getRouting());
            }
            if (model.wasPropertyExplicitlySet("ikeVersion")) {
                this.ikeVersion(model.getIkeVersion());
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

    @com.fasterxml.jackson.annotation.JsonProperty("bgpSessionConfig")
    private final UpdateIPSecTunnelBgpSessionDetails bgpSessionConfig;

    public UpdateIPSecTunnelBgpSessionDetails getBgpSessionConfig() {
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

    @com.fasterxml.jackson.annotation.JsonProperty("encryptionDomainConfig")
    private final UpdateIPSecTunnelEncryptionDomainDetails encryptionDomainConfig;

    public UpdateIPSecTunnelEncryptionDomainDetails getEncryptionDomainConfig() {
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
        sb.append("UpdateIPSecConnectionTunnelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", routing=").append(String.valueOf(this.routing));
        sb.append(", ikeVersion=").append(String.valueOf(this.ikeVersion));
        sb.append(", bgpSessionConfig=").append(String.valueOf(this.bgpSessionConfig));
        sb.append(", oracleInitiation=").append(String.valueOf(this.oracleInitiation));
        sb.append(", natTranslationEnabled=").append(String.valueOf(this.natTranslationEnabled));
        sb.append(", phaseOneConfig=").append(String.valueOf(this.phaseOneConfig));
        sb.append(", phaseTwoConfig=").append(String.valueOf(this.phaseTwoConfig));
        sb.append(", dpdConfig=").append(String.valueOf(this.dpdConfig));
        sb.append(", encryptionDomainConfig=").append(String.valueOf(this.encryptionDomainConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateIPSecConnectionTunnelDetails)) {
            return false;
        }

        UpdateIPSecConnectionTunnelDetails other = (UpdateIPSecConnectionTunnelDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.routing, other.routing)
                && java.util.Objects.equals(this.ikeVersion, other.ikeVersion)
                && java.util.Objects.equals(this.bgpSessionConfig, other.bgpSessionConfig)
                && java.util.Objects.equals(this.oracleInitiation, other.oracleInitiation)
                && java.util.Objects.equals(this.natTranslationEnabled, other.natTranslationEnabled)
                && java.util.Objects.equals(this.phaseOneConfig, other.phaseOneConfig)
                && java.util.Objects.equals(this.phaseTwoConfig, other.phaseTwoConfig)
                && java.util.Objects.equals(this.dpdConfig, other.dpdConfig)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
