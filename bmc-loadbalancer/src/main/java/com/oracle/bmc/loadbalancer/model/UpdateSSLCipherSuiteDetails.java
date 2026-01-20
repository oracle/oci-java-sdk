/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for updating an SSL cipher suite.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
        builder = UpdateSSLCipherSuiteDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSSLCipherSuiteDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ciphers"})
    public UpdateSSLCipherSuiteDetails(java.util.List<String> ciphers) {
        super();
        this.ciphers = ciphers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        public UpdateSSLCipherSuiteDetails build() {
            UpdateSSLCipherSuiteDetails model = new UpdateSSLCipherSuiteDetails(this.ciphers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSSLCipherSuiteDetails model) {
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
        sb.append("UpdateSSLCipherSuiteDetails(");
        sb.append("super=").append(super.toString());
        sb.append("ciphers=").append(String.valueOf(this.ciphers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSSLCipherSuiteDetails)) {
            return false;
        }

        UpdateSSLCipherSuiteDetails other = (UpdateSSLCipherSuiteDetails) o;
        return java.util.Objects.equals(this.ciphers, other.ciphers) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ciphers == null ? 43 : this.ciphers.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
