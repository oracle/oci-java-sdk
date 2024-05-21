/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SSLConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SSLConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "verifyDepth",
        "verifyPeerCertificate",
        "hasSessionResumption",
        "trustedCertificateAuthorityIds",
        "certificateIds",
        "certificateName",
        "protocols",
        "cipherSuiteName",
        "serverOrderPreference"
    })
    public SSLConfigurationDetails(
            Integer verifyDepth,
            Boolean verifyPeerCertificate,
            Boolean hasSessionResumption,
            java.util.List<String> trustedCertificateAuthorityIds,
            java.util.List<String> certificateIds,
            String certificateName,
            java.util.List<String> protocols,
            String cipherSuiteName,
            ServerOrderPreference serverOrderPreference) {
        super();
        this.verifyDepth = verifyDepth;
        this.verifyPeerCertificate = verifyPeerCertificate;
        this.hasSessionResumption = hasSessionResumption;
        this.trustedCertificateAuthorityIds = trustedCertificateAuthorityIds;
        this.certificateIds = certificateIds;
        this.certificateName = certificateName;
        this.protocols = protocols;
        this.cipherSuiteName = cipherSuiteName;
        this.serverOrderPreference = serverOrderPreference;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The maximum depth for peer certificate chain verification.
         * <p>
         * Example: {@code 3}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyDepth")
        private Integer verifyDepth;

        /**
         * The maximum depth for peer certificate chain verification.
         * <p>
         * Example: {@code 3}
         *
         * @param verifyDepth the value to set
         * @return this builder
         **/
        public Builder verifyDepth(Integer verifyDepth) {
            this.verifyDepth = verifyDepth;
            this.__explicitlySet__.add("verifyDepth");
            return this;
        }
        /**
         * Whether the load balancer listener should verify peer certificates.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifyPeerCertificate")
        private Boolean verifyPeerCertificate;

        /**
         * Whether the load balancer listener should verify peer certificates.
         * <p>
         * Example: {@code true}
         *
         * @param verifyPeerCertificate the value to set
         * @return this builder
         **/
        public Builder verifyPeerCertificate(Boolean verifyPeerCertificate) {
            this.verifyPeerCertificate = verifyPeerCertificate;
            this.__explicitlySet__.add("verifyPeerCertificate");
            return this;
        }
        /**
         * Whether the load balancer listener should resume an encrypted session by reusing the cryptographic parameters of a previous TLS session, without having to perform a full handshake again.
         * If "true", the service resumes the previous TLS encrypted session.
         * If "false", the service starts a new TLS encrypted session.
         * Enabling session resumption improves performance but provides a lower level of security. Disabling session resumption improves security but reduces performance.
         * <p>
         * Example: {@code true}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hasSessionResumption")
        private Boolean hasSessionResumption;

        /**
         * Whether the load balancer listener should resume an encrypted session by reusing the cryptographic parameters of a previous TLS session, without having to perform a full handshake again.
         * If "true", the service resumes the previous TLS encrypted session.
         * If "false", the service starts a new TLS encrypted session.
         * Enabling session resumption improves performance but provides a lower level of security. Disabling session resumption improves security but reduces performance.
         * <p>
         * Example: {@code true}
         *
         * @param hasSessionResumption the value to set
         * @return this builder
         **/
        public Builder hasSessionResumption(Boolean hasSessionResumption) {
            this.hasSessionResumption = hasSessionResumption;
            this.__explicitlySet__.add("hasSessionResumption");
            return this;
        }
        /**
         * Ids for OCI certificates service CA or CA bundles for the load balancer to trust.
         * <p>
         * Example: {@code [ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trustedCertificateAuthorityIds")
        private java.util.List<String> trustedCertificateAuthorityIds;

        /**
         * Ids for OCI certificates service CA or CA bundles for the load balancer to trust.
         * <p>
         * Example: {@code [ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]}
         *
         * @param trustedCertificateAuthorityIds the value to set
         * @return this builder
         **/
        public Builder trustedCertificateAuthorityIds(
                java.util.List<String> trustedCertificateAuthorityIds) {
            this.trustedCertificateAuthorityIds = trustedCertificateAuthorityIds;
            this.__explicitlySet__.add("trustedCertificateAuthorityIds");
            return this;
        }
        /**
         * Ids for OCI certificates service certificates. Currently only a single Id may be passed.
         * <p>
         * Example: {@code [ocid1.certificate.oc1.us-ashburn-1.amaaaaaaav3bgsaa5o2q7rh5nfmkkukfkogasqhk6af2opufhjlqg7m6jqzq]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateIds")
        private java.util.List<String> certificateIds;

        /**
         * Ids for OCI certificates service certificates. Currently only a single Id may be passed.
         * <p>
         * Example: {@code [ocid1.certificate.oc1.us-ashburn-1.amaaaaaaav3bgsaa5o2q7rh5nfmkkukfkogasqhk6af2opufhjlqg7m6jqzq]}
         *
         * @param certificateIds the value to set
         * @return this builder
         **/
        public Builder certificateIds(java.util.List<String> certificateIds) {
            this.certificateIds = certificateIds;
            this.__explicitlySet__.add("certificateIds");
            return this;
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
        private String certificateName;

        /**
         * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
         * Valid certificate bundle names include only alphanumeric characters, dashes, and underscores.
         * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
         * <p>
         * Example: {@code example_certificate_bundle}
         *
         * @param certificateName the value to set
         * @return this builder
         **/
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
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
         * *  TLSv1.3
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
        private java.util.List<String> protocols;

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
         * *  TLSv1.3
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
         * @param protocols the value to set
         * @return this builder
         **/
        public Builder protocols(java.util.List<String> protocols) {
            this.protocols = protocols;
            this.__explicitlySet__.add("protocols");
            return this;
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
        private String cipherSuiteName;

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
         * @param cipherSuiteName the value to set
         * @return this builder
         **/
        public Builder cipherSuiteName(String cipherSuiteName) {
            this.cipherSuiteName = cipherSuiteName;
            this.__explicitlySet__.add("cipherSuiteName");
            return this;
        }
        /**
         * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
         * ciphers.
         * <p>
         **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
         *           field is ignored when the {@code SSLConfiguration} object is associated with a backend set.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serverOrderPreference")
        private ServerOrderPreference serverOrderPreference;

        /**
         * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
         * ciphers.
         * <p>
         **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
         *           field is ignored when the {@code SSLConfiguration} object is associated with a backend set.
         *
         * @param serverOrderPreference the value to set
         * @return this builder
         **/
        public Builder serverOrderPreference(ServerOrderPreference serverOrderPreference) {
            this.serverOrderPreference = serverOrderPreference;
            this.__explicitlySet__.add("serverOrderPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SSLConfigurationDetails build() {
            SSLConfigurationDetails model =
                    new SSLConfigurationDetails(
                            this.verifyDepth,
                            this.verifyPeerCertificate,
                            this.hasSessionResumption,
                            this.trustedCertificateAuthorityIds,
                            this.certificateIds,
                            this.certificateName,
                            this.protocols,
                            this.cipherSuiteName,
                            this.serverOrderPreference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("verifyDepth")) {
                this.verifyDepth(model.getVerifyDepth());
            }
            if (model.wasPropertyExplicitlySet("verifyPeerCertificate")) {
                this.verifyPeerCertificate(model.getVerifyPeerCertificate());
            }
            if (model.wasPropertyExplicitlySet("hasSessionResumption")) {
                this.hasSessionResumption(model.getHasSessionResumption());
            }
            if (model.wasPropertyExplicitlySet("trustedCertificateAuthorityIds")) {
                this.trustedCertificateAuthorityIds(model.getTrustedCertificateAuthorityIds());
            }
            if (model.wasPropertyExplicitlySet("certificateIds")) {
                this.certificateIds(model.getCertificateIds());
            }
            if (model.wasPropertyExplicitlySet("certificateName")) {
                this.certificateName(model.getCertificateName());
            }
            if (model.wasPropertyExplicitlySet("protocols")) {
                this.protocols(model.getProtocols());
            }
            if (model.wasPropertyExplicitlySet("cipherSuiteName")) {
                this.cipherSuiteName(model.getCipherSuiteName());
            }
            if (model.wasPropertyExplicitlySet("serverOrderPreference")) {
                this.serverOrderPreference(model.getServerOrderPreference());
            }
            return this;
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

    /**
     * The maximum depth for peer certificate chain verification.
     * <p>
     * Example: {@code 3}
     *
     * @return the value
     **/
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

    /**
     * Whether the load balancer listener should verify peer certificates.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getVerifyPeerCertificate() {
        return verifyPeerCertificate;
    }

    /**
     * Whether the load balancer listener should resume an encrypted session by reusing the cryptographic parameters of a previous TLS session, without having to perform a full handshake again.
     * If "true", the service resumes the previous TLS encrypted session.
     * If "false", the service starts a new TLS encrypted session.
     * Enabling session resumption improves performance but provides a lower level of security. Disabling session resumption improves security but reduces performance.
     * <p>
     * Example: {@code true}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasSessionResumption")
    private final Boolean hasSessionResumption;

    /**
     * Whether the load balancer listener should resume an encrypted session by reusing the cryptographic parameters of a previous TLS session, without having to perform a full handshake again.
     * If "true", the service resumes the previous TLS encrypted session.
     * If "false", the service starts a new TLS encrypted session.
     * Enabling session resumption improves performance but provides a lower level of security. Disabling session resumption improves security but reduces performance.
     * <p>
     * Example: {@code true}
     *
     * @return the value
     **/
    public Boolean getHasSessionResumption() {
        return hasSessionResumption;
    }

    /**
     * Ids for OCI certificates service CA or CA bundles for the load balancer to trust.
     * <p>
     * Example: {@code [ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trustedCertificateAuthorityIds")
    private final java.util.List<String> trustedCertificateAuthorityIds;

    /**
     * Ids for OCI certificates service CA or CA bundles for the load balancer to trust.
     * <p>
     * Example: {@code [ocid1.cabundle.oc1.us-ashburn-1.amaaaaaaav3bgsaagl4zzyqdop5i2vuwoqewdvauuw34llqa74otq2jdsfyq]}
     *
     * @return the value
     **/
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

    /**
     * Ids for OCI certificates service certificates. Currently only a single Id may be passed.
     * <p>
     * Example: {@code [ocid1.certificate.oc1.us-ashburn-1.amaaaaaaav3bgsaa5o2q7rh5nfmkkukfkogasqhk6af2opufhjlqg7m6jqzq]}
     *
     * @return the value
     **/
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

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * Valid certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     * <p>
     * Example: {@code example_certificate_bundle}
     *
     * @return the value
     **/
    public String getCertificateName() {
        return certificateName;
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
     * *  TLSv1.3
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
     * *  TLSv1.3
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
     * @return the value
     **/
    public java.util.List<String> getProtocols() {
        return protocols;
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
     * @return the value
     **/
    public String getCipherSuiteName() {
        return cipherSuiteName;
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
     *           field is ignored when the {@code SSLConfiguration} object is associated with a backend set.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serverOrderPreference")
    private final ServerOrderPreference serverOrderPreference;

    /**
     * When this attribute is set to ENABLED, the system gives preference to the server ciphers over the client
     * ciphers.
     * <p>
     **Note:** This configuration is applicable only when the load balancer is acting as an SSL/HTTPS server. This
     *           field is ignored when the {@code SSLConfiguration} object is associated with a backend set.
     *
     * @return the value
     **/
    public ServerOrderPreference getServerOrderPreference() {
        return serverOrderPreference;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SSLConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("verifyDepth=").append(String.valueOf(this.verifyDepth));
        sb.append(", verifyPeerCertificate=").append(String.valueOf(this.verifyPeerCertificate));
        sb.append(", hasSessionResumption=").append(String.valueOf(this.hasSessionResumption));
        sb.append(", trustedCertificateAuthorityIds=")
                .append(String.valueOf(this.trustedCertificateAuthorityIds));
        sb.append(", certificateIds=").append(String.valueOf(this.certificateIds));
        sb.append(", certificateName=").append(String.valueOf(this.certificateName));
        sb.append(", protocols=").append(String.valueOf(this.protocols));
        sb.append(", cipherSuiteName=").append(String.valueOf(this.cipherSuiteName));
        sb.append(", serverOrderPreference=").append(String.valueOf(this.serverOrderPreference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SSLConfigurationDetails)) {
            return false;
        }

        SSLConfigurationDetails other = (SSLConfigurationDetails) o;
        return java.util.Objects.equals(this.verifyDepth, other.verifyDepth)
                && java.util.Objects.equals(this.verifyPeerCertificate, other.verifyPeerCertificate)
                && java.util.Objects.equals(this.hasSessionResumption, other.hasSessionResumption)
                && java.util.Objects.equals(
                        this.trustedCertificateAuthorityIds, other.trustedCertificateAuthorityIds)
                && java.util.Objects.equals(this.certificateIds, other.certificateIds)
                && java.util.Objects.equals(this.certificateName, other.certificateName)
                && java.util.Objects.equals(this.protocols, other.protocols)
                && java.util.Objects.equals(this.cipherSuiteName, other.cipherSuiteName)
                && java.util.Objects.equals(this.serverOrderPreference, other.serverOrderPreference)
                && super.equals(other);
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
                        + (this.hasSessionResumption == null
                                ? 43
                                : this.hasSessionResumption.hashCode());
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
        result = (result * PRIME) + (this.protocols == null ? 43 : this.protocols.hashCode());
        result =
                (result * PRIME)
                        + (this.cipherSuiteName == null ? 43 : this.cipherSuiteName.hashCode());
        result =
                (result * PRIME)
                        + (this.serverOrderPreference == null
                                ? 43
                                : this.serverOrderPreference.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
