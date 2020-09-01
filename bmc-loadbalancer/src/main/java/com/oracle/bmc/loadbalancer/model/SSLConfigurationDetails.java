/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The load balancer's SSL handling configuration details.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SSLConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SSLConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protocols")
        private java.util.List<String> protocols;

        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            this.__explicitlySet__.add("protocols");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cipherSuiteName")
        private String cipherSuiteName;

        public Builder cipherSuiteName(String cipherSuiteName) {
            this.cipherSuiteName = cipherSuiteName;
            this.__explicitlySet__.add("cipherSuiteName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serverOrderPreference")
        private ServerOrderPreference serverOrderPreference;

        public Builder serverOrderPreference(ServerOrderPreference serverOrderPreference) {
            this.serverOrderPreference = serverOrderPreference;
            this.__explicitlySet__.add("serverOrderPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SSLConfigurationDetails build() {
            SSLConfigurationDetails __instance__ =
                    new SSLConfigurationDetails(
                            verifyDepth,
                            verifyPeerCertificate,
                            certificateName,
                            protocols,
                            cipherSuiteName,
                            serverOrderPreference);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLConfigurationDetails o) {
            Builder copiedBuilder =
                    verifyDepth(o.getVerifyDepth())
                            .verifyPeerCertificate(o.getVerifyPeerCertificate())
                            .certificateName(o.getCertificateName())
                            .protocols(o.getProtocols())
                            .cipherSuiteName(o.getCipherSuiteName())
                            .serverOrderPreference(o.getServerOrderPreference());

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
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: `3`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
    Integer verifyDepth;

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
    Boolean verifyPeerCertificate;

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * Valid certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     * <p>
     * Example: `example_certificate_bundle`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    String certificateName;

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
     * *  For all existing load balancer listeners and backend sets that predate this feature, the `GET` operation
     *    displays a list of SSL protocols currently used by those resources.
     * <p>
     * example: `[\"TLSv1.1\", \"TLSv1.2\"]`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocols")
    java.util.List<String> protocols;

    /**
     * The name of the cipher suite to use for HTTPS or SSL connections.
     * <p>
     * If this field is not specified, the default is `oci-default-ssl-cipher-suite-v1`.
     * <p>
     **Notes:**
     * <p>
     *  You must ensure compatibility between the specified SSL protocols and the ciphers configured in the cipher
     *    suite. Clients cannot perform an SSL handshake if there is an incompatible configuration.
     * *  You must ensure compatibility between the ciphers configured in the cipher suite and the configured
     *    certificates. For example, RSA-based ciphers require RSA certificates and ECDSA-based ciphers require ECDSA
     *    certificates.
     * *  If the cipher configuration is not modified after load balancer creation, the `GET` operation returns
     *    `oci-default-ssl-cipher-suite-v1` as the value of this field in the SSL configuration for existing listeners
     *    that predate this feature.
     * *  If the cipher configuration was modified using Oracle operations after load balancer creation, the `GET`
     *    operation returns `oci-customized-ssl-cipher-suite` as the value of this field in the SSL configuration for
     *    existing listeners that predate this feature.
     * *  The `GET` operation returns `oci-wider-compatible-ssl-cipher-suite-v1` as the value of this field in the SSL
     *    configuration for existing backend sets that predate this feature.
     * *  If the `GET` operation on a listener returns `oci-customized-ssl-cipher-suite` as the value of this field,
     *    you must specify an appropriate predefined or custom cipher suite name when updating the resource.
     * *  The `oci-customized-ssl-cipher-suite` Oracle reserved cipher suite name is not accepted as valid input for
     *    this field.
     * <p>
     * example: `example_cipher_suite`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cipherSuiteName")
    String cipherSuiteName;
    /**
     * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
     * ciphers.
     * <p>
     **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
     *           field is ignored when the `SSLConfiguration` object is associated with a backend set.
     *
     **/
    public enum ServerOrderPreference {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, ServerOrderPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (ServerOrderPreference v : ServerOrderPreference.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ServerOrderPreference: " + key);
        }
    };
    /**
     * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
     * ciphers.
     * <p>
     **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
     *           field is ignored when the `SSLConfiguration` object is associated with a backend set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverOrderPreference")
    ServerOrderPreference serverOrderPreference;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
