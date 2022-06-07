/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A listener's SSL handling configuration.
 * <p>
 * To use SSL, a listener must be associated with a {@link Certificate}.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SSLConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SSLConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({
        "verifyDepth",
        "verifyPeerCertificate",
        "trustedCertificateAuthorityIds",
        "certificateIds",
        "certificateName",
        "serverOrderPreference",
        "cipherSuiteName",
        "protocols"
    })
    public SSLConfiguration(
            Integer verifyDepth,
            Boolean verifyPeerCertificate,
            java.util.List<String> trustedCertificateAuthorityIds,
            java.util.List<String> certificateIds,
            String certificateName,
            ServerOrderPreference serverOrderPreference,
            String cipherSuiteName,
            java.util.List<String> protocols) {
        super();
        this.verifyDepth = verifyDepth;
        this.verifyPeerCertificate = verifyPeerCertificate;
        this.trustedCertificateAuthorityIds = trustedCertificateAuthorityIds;
        this.certificateIds = certificateIds;
        this.certificateName = certificateName;
        this.serverOrderPreference = serverOrderPreference;
        this.cipherSuiteName = cipherSuiteName;
        this.protocols = protocols;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
        private Integer verifyDepth;

        public Builder verifyDepth(Integer verifyDepth) {
            this.verifyDepth = verifyDepth;
            this.__explicitlySet__.add("verifyDepth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
        private Boolean verifyPeerCertificate;

        public Builder verifyPeerCertificate(Boolean verifyPeerCertificate) {
            this.verifyPeerCertificate = verifyPeerCertificate;
            this.__explicitlySet__.add("verifyPeerCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trustedCertificateAuthorityIds")
        private java.util.List<String> trustedCertificateAuthorityIds;

        public Builder trustedCertificateAuthorityIds(
                java.util.List<String> trustedCertificateAuthorityIds) {
            this.trustedCertificateAuthorityIds = trustedCertificateAuthorityIds;
            this.__explicitlySet__.add("trustedCertificateAuthorityIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateIds")
        private java.util.List<String> certificateIds;

        public Builder certificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            this.__explicitlySet__.add("certificateIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serverOrderPreference")
        private ServerOrderPreference serverOrderPreference;

        public Builder serverOrderPreference(ServerOrderPreference serverOrderPreference) {
            this.serverOrderPreference = serverOrderPreference;
            this.__explicitlySet__.add("serverOrderPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cipherSuiteName")
        private String cipherSuiteName;

        public Builder cipherSuiteName(String cipherSuiteName) {
            this.cipherSuiteName = cipherSuiteName;
            this.__explicitlySet__.add("cipherSuiteName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocols")
        private java.util.List<String> protocols;

        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            this.__explicitlySet__.add("protocols");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SSLConfiguration build() {
            SSLConfiguration __instance__ =
                    new SSLConfiguration(
                            verifyDepth,
                            verifyPeerCertificate,
                            trustedCertificateAuthorityIds,
                            certificateIds,
                            certificateName,
                            serverOrderPreference,
                            cipherSuiteName,
                            protocols);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLConfiguration o) {
            Builder copiedBuilder =
                    verifyDepth(o.getVerifyDepth())
                            .verifyPeerCertificate(o.getVerifyPeerCertificate())
                            .trustedCertificateAuthorityIds(o.getTrustedCertificateAuthorityIds())
                            .certificateIds(o.getCertificateIds())
                            .certificateName(o.getCertificateName())
                            .serverOrderPreference(o.getServerOrderPreference())
                            .cipherSuiteName(o.getCipherSuiteName())
                            .protocols(o.getProtocols());

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
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: {@code 3}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
    private final Integer verifyDepth;

    public Integer getVerifyDepth() {
        return verifyDepth;
    }

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
    private final Boolean verifyPeerCertificate;

    public Boolean getVerifyPeerCertificate() {
        return verifyPeerCertificate;
    }

    /**
     * Ids for OCI certificates service CA or CA bundles for the load balancer to trust.
     * <p>
     * Example: {@code [ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustedCertificateAuthorityIds")
    private final java.util.List<String> trustedCertificateAuthorityIds;

    public java.util.List<String> getTrustedCertificateAuthorityIds() {
        return trustedCertificateAuthorityIds;
    }

    /**
     * Ids for OCI certificates service certificates. Currently only a single Id may be passed.
     * <p>
     * Example: {@code [ocid1.certificate.oc1.us-ashburn-1.amaaaaaaav3bgsaa5o2q7rh5nfmkkukfkogasqhk6af2opufhjlqg7m6jqzq]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateIds")
    private final java.util.List<String> certificateIds;

    public java.util.List<String> getCertificateIds() {
        return certificateIds;
    }

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * Valid certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     * <p>
     * Example: {@code example_certificate_bundle}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    private final String certificateName;

    public String getCertificateName() {
        return certificateName;
    }

    /**
     * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
     * ciphers.
     * <p>
     **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
     *           field is ignored when the {@code SSLConfiguration} object is associated with a backend set.
     *
     **/
    public enum ServerOrderPreference {
        Enabled("ENABLED"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServerOrderPreference.class);

        private final String value;
        private static java.util.Map<String, ServerOrderPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (ServerOrderPreference v : ServerOrderPreference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServerOrderPreference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServerOrderPreference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServerOrderPreference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
     * ciphers.
     * <p>
     **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
     *           field is ignored when the {@code SSLConfiguration} object is associated with a backend set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverOrderPreference")
    private final ServerOrderPreference serverOrderPreference;

    public ServerOrderPreference getServerOrderPreference() {
        return serverOrderPreference;
    }

    /**
     * The name of the cipher suite to use for HTTPS or SSL connections.
     * <p>
     * If this field is not specified, the default is {@code oci-default-ssl-cipher-suite-v1}.
     * <p>
     **Notes:**
     * <p>
     *  You must ensure compatibility between the specified SSL protocols and the ciphers configured in the cipher
     *    suite. Clients cannot perform an SSL handshake if there is an incompatible configuration.
     * *  You must ensure compatibility between the ciphers configured in the cipher suite and the configured
     *    certificates. For example, RSA-based ciphers require RSA certificates and ECDSA-based ciphers require ECDSA
     *    certificates.
     * *  If the cipher configuration is not modified after load balancer creation, the {@code GET} operation returns
     *    {@code oci-default-ssl-cipher-suite-v1} as the value of this field in the SSL configuration for existing listeners
     *    that predate this feature.
     * *  If the cipher configuration was modified using Oracle operations after load balancer creation, the {@code GET}
     *    operation returns {@code oci-customized-ssl-cipher-suite} as the value of this field in the SSL configuration for
     *    existing listeners that predate this feature.
     * *  The {@code GET} operation returns {@code oci-wider-compatible-ssl-cipher-suite-v1} as the value of this field in the SSL
     *    configuration for existing backend sets that predate this feature.
     * *  If the {@code GET} operation on a listener returns {@code oci-customized-ssl-cipher-suite} as the value of this field,
     *    you must specify an appropriate predefined or custom cipher suite name when updating the resource.
     * *  The {@code oci-customized-ssl-cipher-suite} Oracle reserved cipher suite name is not accepted as valid input for
     *    this field.
     * <p>
     * example: {@code example_cipher_suite}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cipherSuiteName")
    private final String cipherSuiteName;

    public String getCipherSuiteName() {
        return cipherSuiteName;
    }

    /**
     * A list of SSL protocols the load balancer must support for HTTPS or SSL connections.
     * <p>
     * The load balancer uses SSL protocols to establish a secure connection between a client and a server. A secure
     * connection ensures that all data passed between the client and the server is private.
     * <p>
     * The Load Balancing service supports the following protocols:
     * <p>
     *  TLSv1
     * *  TLSv1.1
     * *  TLSv1.2
     * <p>
     * If this field is not specified, TLSv1.2 is the default.
     * <p>
     **Warning:** All SSL listeners created on a given port must use the same set of SSL protocols.
     * <p>
     **Notes:**
     * <p>
     *  The handshake to establish an SSL connection fails if the client supports none of the specified protocols.
     * *  You must ensure compatibility between the specified SSL protocols and the ciphers configured in the cipher
     *    suite.
     * *  For all existing load balancer listeners and backend sets that predate this feature, the {@code GET} operation
     *    displays a list of SSL protocols currently used by those resources.
     * <p>
     * example: {@code ["TLSv1.1", "TLSv1.2"]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocols")
    private final java.util.List<String> protocols;

    public java.util.List<String> getProtocols() {
        return protocols;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SSLConfiguration(");
        sb.append("verifyDepth=").append(String.valueOf(this.verifyDepth));
        sb.append(", verifyPeerCertificate=").append(String.valueOf(this.verifyPeerCertificate));
        sb.append(", trustedCertificateAuthorityIds=")
                .append(String.valueOf(this.trustedCertificateAuthorityIds));
        sb.append(", certificateIds=").append(String.valueOf(this.certificateIds));
        sb.append(", certificateName=").append(String.valueOf(this.certificateName));
        sb.append(", serverOrderPreference=").append(String.valueOf(this.serverOrderPreference));
        sb.append(", cipherSuiteName=").append(String.valueOf(this.cipherSuiteName));
        sb.append(", protocols=").append(String.valueOf(this.protocols));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SSLConfiguration)) {
            return false;
        }

        SSLConfiguration other = (SSLConfiguration) o;
        return java.util.Objects.equals(this.verifyDepth, other.verifyDepth)
                && java.util.Objects.equals(this.verifyPeerCertificate, other.verifyPeerCertificate)
                && java.util.Objects.equals(
                        this.trustedCertificateAuthorityIds, other.trustedCertificateAuthorityIds)
                && java.util.Objects.equals(this.certificateIds, other.certificateIds)
                && java.util.Objects.equals(this.certificateName, other.certificateName)
                && java.util.Objects.equals(this.serverOrderPreference, other.serverOrderPreference)
                && java.util.Objects.equals(this.cipherSuiteName, other.cipherSuiteName)
                && java.util.Objects.equals(this.protocols, other.protocols)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.verifyDepth == null ? 43 : this.verifyDepth.hashCode());
        result =
                (result * PRIME)
                        + (this.verifyPeerCertificate == null
                                ? 43
                                : this.verifyPeerCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.trustedCertificateAuthorityIds == null
                                ? 43
                                : this.trustedCertificateAuthorityIds.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateIds == null ? 43 : this.certificateIds.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateName == null ? 43 : this.certificateName.hashCode());
        result =
                (result * PRIME)
                        + (this.serverOrderPreference == null
                                ? 43
                                : this.serverOrderPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.cipherSuiteName == null ? 43 : this.cipherSuiteName.hashCode());
        result = (result * PRIME) + (this.protocols == null ? 43 : this.protocols.hashCode());
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
