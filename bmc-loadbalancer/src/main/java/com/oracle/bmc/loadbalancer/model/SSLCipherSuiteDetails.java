/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details of an SSL cipher suite.
 *
 * <p>The algorithms that compose a cipher suite help you secure Transport Layer Security (TLS) or
 * Secure Socket Layer (SSL) network connections. A cipher suite defines the list of security
 * algorithms your load balancer uses to negotiate with peers while sending and receiving
 * information. The cipher suites you use affect the security level, performance, and compatibility
 * of your data traffic.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API.
 *
 * <p>Oracle created the following predefined cipher suites that you can specify when you define a
 * resource's [SSL
 * configuration](https://docs.cloud.oracle.com/api/#/en/loadbalancer/20170115/datatypes/SSLConfigurationDetails).
 * You can [create custom cipher
 * suites](https://docs.cloud.oracle.com/api/#/en/loadbalancer/20170115/SSLCipherSuite/CreateSSLCipherSuite)
 * if the predefined cipher suites do not meet your requirements.
 *
 * <p>* __oci-default-ssl-cipher-suite-v1__
 *
 * <p>"DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
 * "DHE-RSA-AES256-SHA256" "ECDHE-RSA-AES128-GCM-SHA256" "ECDHE-RSA-AES128-SHA256"
 * "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA384"
 *
 * <p>__oci-modern-ssl-cipher-suite-v1__
 *
 * <p>"AES128-GCM-SHA256" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA256"
 * "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
 * "DHE-RSA-AES256-SHA256" "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256"
 * "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES128-GCM-SHA256"
 * "ECDHE-RSA-AES128-SHA256" "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA384"
 *
 * <p>__oci-compatible-ssl-cipher-suite-v1__
 *
 * <p>"AES128-GCM-SHA256" "AES128-SHA" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA"
 * "AES256-SHA256" "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
 * "DHE-RSA-AES256-SHA256" "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA"
 * "ECDHE-ECDSA-AES128-SHA256" "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-SHA"
 * "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES128-GCM-SHA256" "ECDHE-RSA-AES128-SHA"
 * "ECDHE-RSA-AES128-SHA256" "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA"
 * "ECDHE-RSA-AES256-SHA384"
 *
 * <p>__oci-wider-compatible-ssl-cipher-suite-v1__
 *
 * <p>"AES128-GCM-SHA256" "AES128-SHA" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA"
 * "AES256-SHA256" "CAMELLIA128-SHA" "CAMELLIA256-SHA" "DES-CBC3-SHA" "DH-DSS-AES128-GCM-SHA256"
 * "DH-DSS-AES128-SHA" "DH-DSS-AES128-SHA256" "DH-DSS-AES256-GCM-SHA384" "DH-DSS-AES256-SHA"
 * "DH-DSS-AES256-SHA256" "DH-DSS-CAMELLIA128-SHA" "DH-DSS-CAMELLIA256-SHA" "DH-DSS-DES-CBC3-SHAv"
 * "DH-DSS-SEED-SHA" "DH-RSA-AES128-GCM-SHA256" "DH-RSA-AES128-SHA" "DH-RSA-AES128-SHA256"
 * "DH-RSA-AES256-GCM-SHA384" "DH-RSA-AES256-SHA" "DH-RSA-AES256-SHA256" "DH-RSA-CAMELLIA128-SHA"
 * "DH-RSA-CAMELLIA256-SHA" "DH-RSA-DES-CBC3-SHA" "DH-RSA-SEED-SHA" "DHE-DSS-AES128-GCM-SHA256"
 * "DHE-DSS-AES128-SHA" "DHE-DSS-AES128-SHA256" "DHE-DSS-AES256-GCM-SHA384" "DHE-DSS-AES256-SHA"
 * "DHE-DSS-AES256-SHA256" "DHE-DSS-CAMELLIA128-SHA" "DHE-DSS-CAMELLIA256-SHA"
 * "DHE-DSS-DES-CBC3-SHA" "DHE-DSS-SEED-SHA" "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA"
 * "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384" "DHE-RSA-AES256-SHA" "DHE-RSA-AES256-SHA256"
 * "DHE-RSA-CAMELLIA128-SHA" "DHE-RSA-CAMELLIA256-SHA" "DHE-RSA-DES-CBC3-SHA" "DHE-RSA-SEED-SHA"
 * "ECDH-ECDSA-AES128-GCM-SHA256" "ECDH-ECDSA-AES128-SHA" "ECDH-ECDSA-AES128-SHA256"
 * "ECDH-ECDSA-AES256-GCM-SHA384" "ECDH-ECDSA-AES256-SHA" "ECDH-ECDSA-AES256-SHA384"
 * "ECDH-ECDSA-DES-CBC3-SHA" "ECDH-ECDSA-RC4-SHA" "ECDH-RSA-AES128-GCM-SHA256" "ECDH-RSA-AES128-SHA"
 * "ECDH-RSA-AES128-SHA256" "ECDH-RSA-AES256-GCM-SHA384" "ECDH-RSA-AES256-SHA"
 * "ECDH-RSA-AES256-SHA384" "ECDH-RSA-DES-CBC3-SHA" "ECDH-RSA-RC4-SHA"
 * "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA" "ECDHE-ECDSA-AES128-SHA256"
 * "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-SHA" "ECDHE-ECDSA-AES256-SHA384"
 * "ECDHE-ECDSA-DES-CBC3-SHA" "ECDHE-ECDSA-RC4-SHA" "ECDHE-RSA-AES128-GCM-SHA256"
 * "ECDHE-RSA-AES128-SHA" "ECDHE-RSA-AES128-SHA256" "ECDHE-RSA-AES256-GCM-SHA384"
 * "ECDHE-RSA-AES256-SHA" "ECDHE-RSA-AES256-SHA384" "ECDHE-RSA-DES-CBC3-SHA" "ECDHE-RSA-RC4-SHA"
 * "IDEA-CBC-SHA" "KRB5-DES-CBC3-MD5" "KRB5-DES-CBC3-SHA" "KRB5-IDEA-CBC-MD5" "KRB5-IDEA-CBC-SHA"
 * "KRB5-RC4-MD5" "KRB5-RC4-SHA" "PSK-3DES-EDE-CBC-SHA" "PSK-AES128-CBC-SHA" "PSK-AES256-CBC-SHA"
 * "PSK-RC4-SHA" "RC4-MD5" "RC4-SHA" "SEED-SHA"
 *
 * <p>__oci-default-http2-ssl-cipher-suite-v1__
 *
 * <p>"ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-RSA-AES128-GCM-SHA256"
 * "ECDHE-ECDSA-AES128-GCM-SHA256" "DHE-RSA-AES256-GCM-SHA384" "DHE-RSA-AES128-GCM-SHA256"
 *
 * <p>__oci-default-http2-tls-13-ssl-cipher-suite-v1__
 *
 * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
 *
 * <p>__oci-default-http2-tls-12-13-ssl-cipher-suite-v1__
 *
 * <p>"ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-RSA-AES128-GCM-SHA256"
 * "ECDHE-ECDSA-AES128-GCM-SHA256" "DHE-RSA-AES256-GCM-SHA384" "DHE-RSA-AES128-GCM-SHA256"
 * "TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
 *
 * <p>__oci-tls-13-recommended-ssl-cipher-suite-v1__
 *
 * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
 *
 * <p>__oci-tls-12-13-wider-ssl-cipher-suite-v1__
 *
 * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
 * "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-RSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256"
 * "ECDHE-RSA-AES128-SHA256" "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-GCM-SHA384"
 * "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES256-SHA384" "AES128-GCM-SHA256" "AES128-SHA256"
 * "AES256-GCM-SHA384" "AES256-SHA256"
 *
 * <p>__oci-tls-11-12-13-wider-ssl-cipher-suite-v1__ "TLS_AES_128_GCM_SHA256"
 * "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256" "ECDHE-ECDSA-AES128-GCM-SHA256"
 * "ECDHE-RSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256" "ECDHE-RSA-AES128-SHA256"
 * "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-SHA384"
 * "ECDHE-RSA-AES256-SHA384" "AES128-GCM-SHA256" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA256"
 * "ECDHE-ECDSA-AES128-SHA" "ECDHE-RSA-AES128-SHA" "ECDHE-RSA-AES256-SHA" "ECDHE-ECDSA-AES256-SHA"
 * "AES128-SHA" "AES256-SHA" <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SSLCipherSuiteDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SSLCipherSuiteDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "ciphers"})
    public SSLCipherSuiteDetails(String name, java.util.List<String> ciphers) {
        super();
        this.name = name;
        this.ciphers = ciphers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A friendly name for the SSL cipher suite. It must be unique and it cannot be changed.
         *
         * <p>*Note:** The name of your user-defined cipher suite must not be the same as any of
         * Oracle's predefined or reserved SSL cipher suite names:
         *
         * <p>oci-default-ssl-cipher-suite-v1 * oci-modern-ssl-cipher-suite-v1 *
         * oci-compatible-ssl-cipher-suite-v1 * oci-wider-compatible-ssl-cipher-suite-v1 *
         * oci-customized-ssl-cipher-suite * oci-default-http2-ssl-cipher-suite-v1 *
         * oci-default-http2-tls-13-ssl-cipher-suite-v1 *
         * oci-default-http2-tls-12-13-ssl-cipher-suite-v1 *
         * oci-tls-13-recommended-ssl-cipher-suite-v1 * oci-tls-12-13-wider-ssl-cipher-suite-v1 *
         * oci-tls-11-12-13-wider-ssl-cipher-suite-v1
         *
         * <p>example: {@code example_cipher_suite}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A friendly name for the SSL cipher suite. It must be unique and it cannot be changed.
         *
         * <p>*Note:** The name of your user-defined cipher suite must not be the same as any of
         * Oracle's predefined or reserved SSL cipher suite names:
         *
         * <p>oci-default-ssl-cipher-suite-v1 * oci-modern-ssl-cipher-suite-v1 *
         * oci-compatible-ssl-cipher-suite-v1 * oci-wider-compatible-ssl-cipher-suite-v1 *
         * oci-customized-ssl-cipher-suite * oci-default-http2-ssl-cipher-suite-v1 *
         * oci-default-http2-tls-13-ssl-cipher-suite-v1 *
         * oci-default-http2-tls-12-13-ssl-cipher-suite-v1 *
         * oci-tls-13-recommended-ssl-cipher-suite-v1 * oci-tls-12-13-wider-ssl-cipher-suite-v1 *
         * oci-tls-11-12-13-wider-ssl-cipher-suite-v1
         *
         * <p>example: {@code example_cipher_suite}
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A list of SSL ciphers the load balancer must support for HTTPS or SSL connections.
         *
         * <p>The following ciphers are valid values for this property:
         *
         * <p>__TLSv1.3 ciphers__
         *
         * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
         * "TLS_AES_128_CCM_SHA256" "TLS_AES_128_CCM_8_SHA256"
         *
         * <p>__TLSv1.2 ciphers__
         *
         * <p>"AES128-GCM-SHA256" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA256"
         * "DH-DSS-AES128-GCM-SHA256" "DH-DSS-AES128-SHA256" "DH-DSS-AES256-GCM-SHA384"
         * "DH-DSS-AES256-SHA256" "DH-RSA-AES128-GCM-SHA256" "DH-RSA-AES128-SHA256"
         * "DH-RSA-AES256-GCM-SHA384" "DH-RSA-AES256-SHA256" "DHE-DSS-AES128-GCM-SHA256"
         * "DHE-DSS-AES128-SHA256" "DHE-DSS-AES256-GCM-SHA384" "DHE-DSS-AES256-SHA256"
         * "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
         * "DHE-RSA-AES256-SHA256" "ECDH-ECDSA-AES128-GCM-SHA256" "ECDH-ECDSA-AES128-SHA256"
         * "ECDH-ECDSA-AES256-GCM-SHA384" "ECDH-ECDSA-AES256-SHA384" "ECDH-RSA-AES128-GCM-SHA256"
         * "ECDH-RSA-AES128-SHA256" "ECDH-RSA-AES256-GCM-SHA384" "ECDH-RSA-AES256-SHA384"
         * "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256"
         * "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES128-GCM-SHA256"
         * "ECDHE-RSA-AES128-SHA256" "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA384"
         *
         * <p>__TLSv1 ciphers also supported by TLSv1.2__
         *
         * <p>"AES128-SHA" "AES256-SHA" "CAMELLIA128-SHA" "CAMELLIA256-SHA" "DES-CBC3-SHA"
         * "DH-DSS-AES128-SHA" "DH-DSS-AES256-SHA" "DH-DSS-CAMELLIA128-SHA" "DH-DSS-CAMELLIA256-SHA"
         * "DH-DSS-DES-CBC3-SHAv" "DH-DSS-SEED-SHA" "DH-RSA-AES128-SHA" "DH-RSA-AES256-SHA"
         * "DH-RSA-CAMELLIA128-SHA" "DH-RSA-CAMELLIA256-SHA" "DH-RSA-DES-CBC3-SHA" "DH-RSA-SEED-SHA"
         * "DHE-DSS-AES128-SHA" "DHE-DSS-AES256-SHA" "DHE-DSS-CAMELLIA128-SHA"
         * "DHE-DSS-CAMELLIA256-SHA" "DHE-DSS-DES-CBC3-SHA" "DHE-DSS-SEED-SHA" "DHE-RSA-AES128-SHA"
         * "DHE-RSA-AES256-SHA" "DHE-RSA-CAMELLIA128-SHA" "DHE-RSA-CAMELLIA256-SHA"
         * "DHE-RSA-DES-CBC3-SHA" "DHE-RSA-SEED-SHA" "ECDH-ECDSA-AES128-SHA" "ECDH-ECDSA-AES256-SHA"
         * "ECDH-ECDSA-DES-CBC3-SHA" "ECDH-ECDSA-RC4-SHA" "ECDH-RSA-AES128-SHA"
         * "ECDH-RSA-AES256-SHA" "ECDH-RSA-DES-CBC3-SHA" "ECDH-RSA-RC4-SHA" "ECDHE-ECDSA-AES128-SHA"
         * "ECDHE-ECDSA-AES256-SHA" "ECDHE-ECDSA-DES-CBC3-SHA" "ECDHE-ECDSA-RC4-SHA"
         * "ECDHE-RSA-AES128-SHA" "ECDHE-RSA-AES256-SHA" "ECDHE-RSA-DES-CBC3-SHA"
         * "ECDHE-RSA-RC4-SHA" "IDEA-CBC-SHA" "KRB5-DES-CBC3-MD5" "KRB5-DES-CBC3-SHA"
         * "KRB5-IDEA-CBC-MD5" "KRB5-IDEA-CBC-SHA" "KRB5-RC4-MD5" "KRB5-RC4-SHA"
         * "PSK-3DES-EDE-CBC-SHA" "PSK-AES128-CBC-SHA" "PSK-AES256-CBC-SHA" "PSK-RC4-SHA" "RC4-MD5"
         * "RC4-SHA" "SEED-SHA"
         *
         * <p>example: {@code
         * ["ECDHE-RSA-AES256-GCM-SHA384","ECDHE-ECDSA-AES256-GCM-SHA384","ECDHE-RSA-AES128-GCM-SHA256"]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ciphers")
        private java.util.List<String> ciphers;

        /**
         * A list of SSL ciphers the load balancer must support for HTTPS or SSL connections.
         *
         * <p>The following ciphers are valid values for this property:
         *
         * <p>__TLSv1.3 ciphers__
         *
         * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
         * "TLS_AES_128_CCM_SHA256" "TLS_AES_128_CCM_8_SHA256"
         *
         * <p>__TLSv1.2 ciphers__
         *
         * <p>"AES128-GCM-SHA256" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA256"
         * "DH-DSS-AES128-GCM-SHA256" "DH-DSS-AES128-SHA256" "DH-DSS-AES256-GCM-SHA384"
         * "DH-DSS-AES256-SHA256" "DH-RSA-AES128-GCM-SHA256" "DH-RSA-AES128-SHA256"
         * "DH-RSA-AES256-GCM-SHA384" "DH-RSA-AES256-SHA256" "DHE-DSS-AES128-GCM-SHA256"
         * "DHE-DSS-AES128-SHA256" "DHE-DSS-AES256-GCM-SHA384" "DHE-DSS-AES256-SHA256"
         * "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
         * "DHE-RSA-AES256-SHA256" "ECDH-ECDSA-AES128-GCM-SHA256" "ECDH-ECDSA-AES128-SHA256"
         * "ECDH-ECDSA-AES256-GCM-SHA384" "ECDH-ECDSA-AES256-SHA384" "ECDH-RSA-AES128-GCM-SHA256"
         * "ECDH-RSA-AES128-SHA256" "ECDH-RSA-AES256-GCM-SHA384" "ECDH-RSA-AES256-SHA384"
         * "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256"
         * "ECDHE-ECDSA-AES256-GCM-SHA384" "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES128-GCM-SHA256"
         * "ECDHE-RSA-AES128-SHA256" "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA384"
         *
         * <p>__TLSv1 ciphers also supported by TLSv1.2__
         *
         * <p>"AES128-SHA" "AES256-SHA" "CAMELLIA128-SHA" "CAMELLIA256-SHA" "DES-CBC3-SHA"
         * "DH-DSS-AES128-SHA" "DH-DSS-AES256-SHA" "DH-DSS-CAMELLIA128-SHA" "DH-DSS-CAMELLIA256-SHA"
         * "DH-DSS-DES-CBC3-SHAv" "DH-DSS-SEED-SHA" "DH-RSA-AES128-SHA" "DH-RSA-AES256-SHA"
         * "DH-RSA-CAMELLIA128-SHA" "DH-RSA-CAMELLIA256-SHA" "DH-RSA-DES-CBC3-SHA" "DH-RSA-SEED-SHA"
         * "DHE-DSS-AES128-SHA" "DHE-DSS-AES256-SHA" "DHE-DSS-CAMELLIA128-SHA"
         * "DHE-DSS-CAMELLIA256-SHA" "DHE-DSS-DES-CBC3-SHA" "DHE-DSS-SEED-SHA" "DHE-RSA-AES128-SHA"
         * "DHE-RSA-AES256-SHA" "DHE-RSA-CAMELLIA128-SHA" "DHE-RSA-CAMELLIA256-SHA"
         * "DHE-RSA-DES-CBC3-SHA" "DHE-RSA-SEED-SHA" "ECDH-ECDSA-AES128-SHA" "ECDH-ECDSA-AES256-SHA"
         * "ECDH-ECDSA-DES-CBC3-SHA" "ECDH-ECDSA-RC4-SHA" "ECDH-RSA-AES128-SHA"
         * "ECDH-RSA-AES256-SHA" "ECDH-RSA-DES-CBC3-SHA" "ECDH-RSA-RC4-SHA" "ECDHE-ECDSA-AES128-SHA"
         * "ECDHE-ECDSA-AES256-SHA" "ECDHE-ECDSA-DES-CBC3-SHA" "ECDHE-ECDSA-RC4-SHA"
         * "ECDHE-RSA-AES128-SHA" "ECDHE-RSA-AES256-SHA" "ECDHE-RSA-DES-CBC3-SHA"
         * "ECDHE-RSA-RC4-SHA" "IDEA-CBC-SHA" "KRB5-DES-CBC3-MD5" "KRB5-DES-CBC3-SHA"
         * "KRB5-IDEA-CBC-MD5" "KRB5-IDEA-CBC-SHA" "KRB5-RC4-MD5" "KRB5-RC4-SHA"
         * "PSK-3DES-EDE-CBC-SHA" "PSK-AES128-CBC-SHA" "PSK-AES256-CBC-SHA" "PSK-RC4-SHA" "RC4-MD5"
         * "RC4-SHA" "SEED-SHA"
         *
         * <p>example: {@code
         * ["ECDHE-RSA-AES256-GCM-SHA384","ECDHE-ECDSA-AES256-GCM-SHA384","ECDHE-RSA-AES128-GCM-SHA256"]}
         *
         * @param ciphers the value to set
         * @return this builder
         */
        public Builder ciphers(java.util.List<String> ciphers) {
            this.ciphers = ciphers;
            this.__explicitlySet__.add("ciphers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SSLCipherSuiteDetails build() {
            SSLCipherSuiteDetails model = new SSLCipherSuiteDetails(this.name, this.ciphers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SSLCipherSuiteDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("ciphers")) {
                this.ciphers(model.getCiphers());
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
     * A friendly name for the SSL cipher suite. It must be unique and it cannot be changed.
     *
     * <p>*Note:** The name of your user-defined cipher suite must not be the same as any of
     * Oracle's predefined or reserved SSL cipher suite names:
     *
     * <p>oci-default-ssl-cipher-suite-v1 * oci-modern-ssl-cipher-suite-v1 *
     * oci-compatible-ssl-cipher-suite-v1 * oci-wider-compatible-ssl-cipher-suite-v1 *
     * oci-customized-ssl-cipher-suite * oci-default-http2-ssl-cipher-suite-v1 *
     * oci-default-http2-tls-13-ssl-cipher-suite-v1 *
     * oci-default-http2-tls-12-13-ssl-cipher-suite-v1 * oci-tls-13-recommended-ssl-cipher-suite-v1
     * * oci-tls-12-13-wider-ssl-cipher-suite-v1 * oci-tls-11-12-13-wider-ssl-cipher-suite-v1
     *
     * <p>example: {@code example_cipher_suite}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A friendly name for the SSL cipher suite. It must be unique and it cannot be changed.
     *
     * <p>*Note:** The name of your user-defined cipher suite must not be the same as any of
     * Oracle's predefined or reserved SSL cipher suite names:
     *
     * <p>oci-default-ssl-cipher-suite-v1 * oci-modern-ssl-cipher-suite-v1 *
     * oci-compatible-ssl-cipher-suite-v1 * oci-wider-compatible-ssl-cipher-suite-v1 *
     * oci-customized-ssl-cipher-suite * oci-default-http2-ssl-cipher-suite-v1 *
     * oci-default-http2-tls-13-ssl-cipher-suite-v1 *
     * oci-default-http2-tls-12-13-ssl-cipher-suite-v1 * oci-tls-13-recommended-ssl-cipher-suite-v1
     * * oci-tls-12-13-wider-ssl-cipher-suite-v1 * oci-tls-11-12-13-wider-ssl-cipher-suite-v1
     *
     * <p>example: {@code example_cipher_suite}
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * A list of SSL ciphers the load balancer must support for HTTPS or SSL connections.
     *
     * <p>The following ciphers are valid values for this property:
     *
     * <p>__TLSv1.3 ciphers__
     *
     * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
     * "TLS_AES_128_CCM_SHA256" "TLS_AES_128_CCM_8_SHA256"
     *
     * <p>__TLSv1.2 ciphers__
     *
     * <p>"AES128-GCM-SHA256" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA256"
     * "DH-DSS-AES128-GCM-SHA256" "DH-DSS-AES128-SHA256" "DH-DSS-AES256-GCM-SHA384"
     * "DH-DSS-AES256-SHA256" "DH-RSA-AES128-GCM-SHA256" "DH-RSA-AES128-SHA256"
     * "DH-RSA-AES256-GCM-SHA384" "DH-RSA-AES256-SHA256" "DHE-DSS-AES128-GCM-SHA256"
     * "DHE-DSS-AES128-SHA256" "DHE-DSS-AES256-GCM-SHA384" "DHE-DSS-AES256-SHA256"
     * "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
     * "DHE-RSA-AES256-SHA256" "ECDH-ECDSA-AES128-GCM-SHA256" "ECDH-ECDSA-AES128-SHA256"
     * "ECDH-ECDSA-AES256-GCM-SHA384" "ECDH-ECDSA-AES256-SHA384" "ECDH-RSA-AES128-GCM-SHA256"
     * "ECDH-RSA-AES128-SHA256" "ECDH-RSA-AES256-GCM-SHA384" "ECDH-RSA-AES256-SHA384"
     * "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256" "ECDHE-ECDSA-AES256-GCM-SHA384"
     * "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES128-GCM-SHA256" "ECDHE-RSA-AES128-SHA256"
     * "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA384"
     *
     * <p>__TLSv1 ciphers also supported by TLSv1.2__
     *
     * <p>"AES128-SHA" "AES256-SHA" "CAMELLIA128-SHA" "CAMELLIA256-SHA" "DES-CBC3-SHA"
     * "DH-DSS-AES128-SHA" "DH-DSS-AES256-SHA" "DH-DSS-CAMELLIA128-SHA" "DH-DSS-CAMELLIA256-SHA"
     * "DH-DSS-DES-CBC3-SHAv" "DH-DSS-SEED-SHA" "DH-RSA-AES128-SHA" "DH-RSA-AES256-SHA"
     * "DH-RSA-CAMELLIA128-SHA" "DH-RSA-CAMELLIA256-SHA" "DH-RSA-DES-CBC3-SHA" "DH-RSA-SEED-SHA"
     * "DHE-DSS-AES128-SHA" "DHE-DSS-AES256-SHA" "DHE-DSS-CAMELLIA128-SHA" "DHE-DSS-CAMELLIA256-SHA"
     * "DHE-DSS-DES-CBC3-SHA" "DHE-DSS-SEED-SHA" "DHE-RSA-AES128-SHA" "DHE-RSA-AES256-SHA"
     * "DHE-RSA-CAMELLIA128-SHA" "DHE-RSA-CAMELLIA256-SHA" "DHE-RSA-DES-CBC3-SHA" "DHE-RSA-SEED-SHA"
     * "ECDH-ECDSA-AES128-SHA" "ECDH-ECDSA-AES256-SHA" "ECDH-ECDSA-DES-CBC3-SHA"
     * "ECDH-ECDSA-RC4-SHA" "ECDH-RSA-AES128-SHA" "ECDH-RSA-AES256-SHA" "ECDH-RSA-DES-CBC3-SHA"
     * "ECDH-RSA-RC4-SHA" "ECDHE-ECDSA-AES128-SHA" "ECDHE-ECDSA-AES256-SHA"
     * "ECDHE-ECDSA-DES-CBC3-SHA" "ECDHE-ECDSA-RC4-SHA" "ECDHE-RSA-AES128-SHA"
     * "ECDHE-RSA-AES256-SHA" "ECDHE-RSA-DES-CBC3-SHA" "ECDHE-RSA-RC4-SHA" "IDEA-CBC-SHA"
     * "KRB5-DES-CBC3-MD5" "KRB5-DES-CBC3-SHA" "KRB5-IDEA-CBC-MD5" "KRB5-IDEA-CBC-SHA"
     * "KRB5-RC4-MD5" "KRB5-RC4-SHA" "PSK-3DES-EDE-CBC-SHA" "PSK-AES128-CBC-SHA"
     * "PSK-AES256-CBC-SHA" "PSK-RC4-SHA" "RC4-MD5" "RC4-SHA" "SEED-SHA"
     *
     * <p>example: {@code
     * ["ECDHE-RSA-AES256-GCM-SHA384","ECDHE-ECDSA-AES256-GCM-SHA384","ECDHE-RSA-AES128-GCM-SHA256"]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ciphers")
    private final java.util.List<String> ciphers;

    /**
     * A list of SSL ciphers the load balancer must support for HTTPS or SSL connections.
     *
     * <p>The following ciphers are valid values for this property:
     *
     * <p>__TLSv1.3 ciphers__
     *
     * <p>"TLS_AES_128_GCM_SHA256" "TLS_AES_256_GCM_SHA384" "TLS_CHACHA20_POLY1305_SHA256"
     * "TLS_AES_128_CCM_SHA256" "TLS_AES_128_CCM_8_SHA256"
     *
     * <p>__TLSv1.2 ciphers__
     *
     * <p>"AES128-GCM-SHA256" "AES128-SHA256" "AES256-GCM-SHA384" "AES256-SHA256"
     * "DH-DSS-AES128-GCM-SHA256" "DH-DSS-AES128-SHA256" "DH-DSS-AES256-GCM-SHA384"
     * "DH-DSS-AES256-SHA256" "DH-RSA-AES128-GCM-SHA256" "DH-RSA-AES128-SHA256"
     * "DH-RSA-AES256-GCM-SHA384" "DH-RSA-AES256-SHA256" "DHE-DSS-AES128-GCM-SHA256"
     * "DHE-DSS-AES128-SHA256" "DHE-DSS-AES256-GCM-SHA384" "DHE-DSS-AES256-SHA256"
     * "DHE-RSA-AES128-GCM-SHA256" "DHE-RSA-AES128-SHA256" "DHE-RSA-AES256-GCM-SHA384"
     * "DHE-RSA-AES256-SHA256" "ECDH-ECDSA-AES128-GCM-SHA256" "ECDH-ECDSA-AES128-SHA256"
     * "ECDH-ECDSA-AES256-GCM-SHA384" "ECDH-ECDSA-AES256-SHA384" "ECDH-RSA-AES128-GCM-SHA256"
     * "ECDH-RSA-AES128-SHA256" "ECDH-RSA-AES256-GCM-SHA384" "ECDH-RSA-AES256-SHA384"
     * "ECDHE-ECDSA-AES128-GCM-SHA256" "ECDHE-ECDSA-AES128-SHA256" "ECDHE-ECDSA-AES256-GCM-SHA384"
     * "ECDHE-ECDSA-AES256-SHA384" "ECDHE-RSA-AES128-GCM-SHA256" "ECDHE-RSA-AES128-SHA256"
     * "ECDHE-RSA-AES256-GCM-SHA384" "ECDHE-RSA-AES256-SHA384"
     *
     * <p>__TLSv1 ciphers also supported by TLSv1.2__
     *
     * <p>"AES128-SHA" "AES256-SHA" "CAMELLIA128-SHA" "CAMELLIA256-SHA" "DES-CBC3-SHA"
     * "DH-DSS-AES128-SHA" "DH-DSS-AES256-SHA" "DH-DSS-CAMELLIA128-SHA" "DH-DSS-CAMELLIA256-SHA"
     * "DH-DSS-DES-CBC3-SHAv" "DH-DSS-SEED-SHA" "DH-RSA-AES128-SHA" "DH-RSA-AES256-SHA"
     * "DH-RSA-CAMELLIA128-SHA" "DH-RSA-CAMELLIA256-SHA" "DH-RSA-DES-CBC3-SHA" "DH-RSA-SEED-SHA"
     * "DHE-DSS-AES128-SHA" "DHE-DSS-AES256-SHA" "DHE-DSS-CAMELLIA128-SHA" "DHE-DSS-CAMELLIA256-SHA"
     * "DHE-DSS-DES-CBC3-SHA" "DHE-DSS-SEED-SHA" "DHE-RSA-AES128-SHA" "DHE-RSA-AES256-SHA"
     * "DHE-RSA-CAMELLIA128-SHA" "DHE-RSA-CAMELLIA256-SHA" "DHE-RSA-DES-CBC3-SHA" "DHE-RSA-SEED-SHA"
     * "ECDH-ECDSA-AES128-SHA" "ECDH-ECDSA-AES256-SHA" "ECDH-ECDSA-DES-CBC3-SHA"
     * "ECDH-ECDSA-RC4-SHA" "ECDH-RSA-AES128-SHA" "ECDH-RSA-AES256-SHA" "ECDH-RSA-DES-CBC3-SHA"
     * "ECDH-RSA-RC4-SHA" "ECDHE-ECDSA-AES128-SHA" "ECDHE-ECDSA-AES256-SHA"
     * "ECDHE-ECDSA-DES-CBC3-SHA" "ECDHE-ECDSA-RC4-SHA" "ECDHE-RSA-AES128-SHA"
     * "ECDHE-RSA-AES256-SHA" "ECDHE-RSA-DES-CBC3-SHA" "ECDHE-RSA-RC4-SHA" "IDEA-CBC-SHA"
     * "KRB5-DES-CBC3-MD5" "KRB5-DES-CBC3-SHA" "KRB5-IDEA-CBC-MD5" "KRB5-IDEA-CBC-SHA"
     * "KRB5-RC4-MD5" "KRB5-RC4-SHA" "PSK-3DES-EDE-CBC-SHA" "PSK-AES128-CBC-SHA"
     * "PSK-AES256-CBC-SHA" "PSK-RC4-SHA" "RC4-MD5" "RC4-SHA" "SEED-SHA"
     *
     * <p>example: {@code
     * ["ECDHE-RSA-AES256-GCM-SHA384","ECDHE-ECDSA-AES256-GCM-SHA384","ECDHE-RSA-AES128-GCM-SHA256"]}
     *
     * @return the value
     */
    public java.util.List<String> getCiphers() {
        return ciphers;
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
        sb.append("SSLCipherSuiteDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", ciphers=").append(String.valueOf(this.ciphers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SSLCipherSuiteDetails)) {
            return false;
        }

        SSLCipherSuiteDetails other = (SSLCipherSuiteDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.ciphers, other.ciphers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.ciphers == null ? 43 : this.ciphers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
