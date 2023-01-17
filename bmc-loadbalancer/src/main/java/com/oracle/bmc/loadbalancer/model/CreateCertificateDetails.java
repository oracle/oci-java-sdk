/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for adding a certificate bundle to a listener. For more information on
 * SSL certficate configuration, see [Managing SSL
 * Certificates](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingcertificates.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateCertificateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "passphrase",
        "privateKey",
        "publicCertificate",
        "caCertificate",
        "certificateName"
    })
    public CreateCertificateDetails(
            String passphrase,
            String privateKey,
            String publicCertificate,
            String caCertificate,
            String certificateName) {
        super();
        this.passphrase = passphrase;
        this.privateKey = privateKey;
        this.publicCertificate = publicCertificate;
        this.caCertificate = caCertificate;
        this.certificateName = certificateName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A passphrase for encrypted private keys. This is needed only if you created your
         * certificate with a passphrase.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
        private String passphrase;

        /**
         * A passphrase for encrypted private keys. This is needed only if you created your
         * certificate with a passphrase.
         *
         * @param passphrase the value to set
         * @return this builder
         */
        public Builder passphrase(String passphrase) {
            this.passphrase = passphrase;
            this.__explicitlySet__.add("passphrase");
            return this;
        }
        /**
         * The SSL private key for your certificate, in PEM format.
         *
         * <p>Example:
         *
         * <p>-----BEGIN RSA PRIVATE KEY-----
         * jO1O1v2ftXMsawM90tnXwc6xhOAT1gDBC9S8DKeca..JZNUgYYwNS0dP2UK
         * tmyN+XqVcAKw4HqVmChXy5b5msu8eIq3uc2NqNVtR..2ksSLukP8pxXcHyb
         * +sEwvM4uf8qbnHAqwnOnP9+KV9vds6BaH1eRA4CHz..n+NVZlzBsTxTlS16
         * /Umr7wJzVrMqK5sDiSu4WuaaBdqMGfL5hLsTjcBFD..Da2iyQmSKuVD4lIZ ... -----END RSA PRIVATE
         * KEY-----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
        private String privateKey;

        /**
         * The SSL private key for your certificate, in PEM format.
         *
         * <p>Example:
         *
         * <p>-----BEGIN RSA PRIVATE KEY-----
         * jO1O1v2ftXMsawM90tnXwc6xhOAT1gDBC9S8DKeca..JZNUgYYwNS0dP2UK
         * tmyN+XqVcAKw4HqVmChXy5b5msu8eIq3uc2NqNVtR..2ksSLukP8pxXcHyb
         * +sEwvM4uf8qbnHAqwnOnP9+KV9vds6BaH1eRA4CHz..n+NVZlzBsTxTlS16
         * /Umr7wJzVrMqK5sDiSu4WuaaBdqMGfL5hLsTjcBFD..Da2iyQmSKuVD4lIZ ... -----END RSA PRIVATE
         * KEY-----
         *
         * @param privateKey the value to set
         * @return this builder
         */
        public Builder privateKey(String privateKey) {
            this.privateKey = privateKey;
            this.__explicitlySet__.add("privateKey");
            return this;
        }
        /**
         * The public certificate, in PEM format, that you received from your SSL certificate
         * provider.
         *
         * <p>Example:
         *
         * <p>-----BEGIN CERTIFICATE-----
         * MIIC2jCCAkMCAg38MA0GCSqGSIb3DQEBBQUAMIGbM..QswCQYDVQQGEwJKU
         * A1UECBMFVG9reW8xEDAOBgNVBAcTB0NodW8ta3UxE..TAPBgNVBAoTCEZyY
         * MRgwFgYDVQQLEw9XZWJDZXJ0IFN1cHBvcnQxGDAWB..gNVBAMTD0ZyYW5rN
         * YiBDQTEjMCEGCSqGSIb3DQEJARYUc3VwcG9ydEBmc..mFuazRkZC5jb20wH ... -----END CERTIFICATE-----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        /**
         * The public certificate, in PEM format, that you received from your SSL certificate
         * provider.
         *
         * <p>Example:
         *
         * <p>-----BEGIN CERTIFICATE-----
         * MIIC2jCCAkMCAg38MA0GCSqGSIb3DQEBBQUAMIGbM..QswCQYDVQQGEwJKU
         * A1UECBMFVG9reW8xEDAOBgNVBAcTB0NodW8ta3UxE..TAPBgNVBAoTCEZyY
         * MRgwFgYDVQQLEw9XZWJDZXJ0IFN1cHBvcnQxGDAWB..gNVBAMTD0ZyYW5rN
         * YiBDQTEjMCEGCSqGSIb3DQEJARYUc3VwcG9ydEBmc..mFuazRkZC5jb20wH ... -----END CERTIFICATE-----
         *
         * @param publicCertificate the value to set
         * @return this builder
         */
        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = publicCertificate;
            this.__explicitlySet__.add("publicCertificate");
            return this;
        }
        /**
         * The Certificate Authority certificate, or any interim certificate, that you received from
         * your SSL certificate provider.
         *
         * <p>Example:
         *
         * <p>-----BEGIN CERTIFICATE-----
         * MIIEczCCA1ugAwIBAgIBADANBgkqhkiG9w0BAQQFAD..AkGA1UEBhMCR0Ix
         * EzARBgNVBAgTClNvbWUtU3RhdGUxFDASBgNVBAoTC0..0EgTHRkMTcwNQYD
         * VQQLEy5DbGFzcyAxIFB1YmxpYyBQcmltYXJ5IENlcn..XRpb24gQXV0aG9y
         * aXR5MRQwEgYDVQQDEwtCZXN0IENBIEx0ZDAeFw0wMD..TUwMTZaFw0wMTAy ... -----END CERTIFICATE-----
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        /**
         * The Certificate Authority certificate, or any interim certificate, that you received from
         * your SSL certificate provider.
         *
         * <p>Example:
         *
         * <p>-----BEGIN CERTIFICATE-----
         * MIIEczCCA1ugAwIBAgIBADANBgkqhkiG9w0BAQQFAD..AkGA1UEBhMCR0Ix
         * EzARBgNVBAgTClNvbWUtU3RhdGUxFDASBgNVBAoTC0..0EgTHRkMTcwNQYD
         * VQQLEy5DbGFzcyAxIFB1YmxpYyBQcmltYXJ5IENlcn..XRpb24gQXV0aG9y
         * aXR5MRQwEgYDVQQDEwtCZXN0IENBIEx0ZDAeFw0wMD..TUwMTZaFw0wMTAy ... -----END CERTIFICATE-----
         *
         * @param caCertificate the value to set
         * @return this builder
         */
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            this.__explicitlySet__.add("caCertificate");
            return this;
        }
        /**
         * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
         * Valid certificate bundle names include only alphanumeric characters, dashes, and
         * underscores. Certificate bundle names cannot contain spaces. Avoid entering confidential
         * information.
         *
         * <p>Example: {@code example_certificate_bundle}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        /**
         * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
         * Valid certificate bundle names include only alphanumeric characters, dashes, and
         * underscores. Certificate bundle names cannot contain spaces. Avoid entering confidential
         * information.
         *
         * <p>Example: {@code example_certificate_bundle}
         *
         * @param certificateName the value to set
         * @return this builder
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCertificateDetails build() {
            CreateCertificateDetails model =
                    new CreateCertificateDetails(
                            this.passphrase,
                            this.privateKey,
                            this.publicCertificate,
                            this.caCertificate,
                            this.certificateName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("passphrase")) {
                this.passphrase(model.getPassphrase());
            }
            if (model.wasPropertyExplicitlySet("privateKey")) {
                this.privateKey(model.getPrivateKey());
            }
            if (model.wasPropertyExplicitlySet("publicCertificate")) {
                this.publicCertificate(model.getPublicCertificate());
            }
            if (model.wasPropertyExplicitlySet("caCertificate")) {
                this.caCertificate(model.getCaCertificate());
            }
            if (model.wasPropertyExplicitlySet("certificateName")) {
                this.certificateName(model.getCertificateName());
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
     * A passphrase for encrypted private keys. This is needed only if you created your certificate
     * with a passphrase.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("passphrase")
    private final String passphrase;

    /**
     * A passphrase for encrypted private keys. This is needed only if you created your certificate
     * with a passphrase.
     *
     * @return the value
     */
    public String getPassphrase() {
        return passphrase;
    }

    /**
     * The SSL private key for your certificate, in PEM format.
     *
     * <p>Example:
     *
     * <p>-----BEGIN RSA PRIVATE KEY-----
     * jO1O1v2ftXMsawM90tnXwc6xhOAT1gDBC9S8DKeca..JZNUgYYwNS0dP2UK
     * tmyN+XqVcAKw4HqVmChXy5b5msu8eIq3uc2NqNVtR..2ksSLukP8pxXcHyb
     * +sEwvM4uf8qbnHAqwnOnP9+KV9vds6BaH1eRA4CHz..n+NVZlzBsTxTlS16
     * /Umr7wJzVrMqK5sDiSu4WuaaBdqMGfL5hLsTjcBFD..Da2iyQmSKuVD4lIZ ... -----END RSA PRIVATE KEY-----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKey")
    private final String privateKey;

    /**
     * The SSL private key for your certificate, in PEM format.
     *
     * <p>Example:
     *
     * <p>-----BEGIN RSA PRIVATE KEY-----
     * jO1O1v2ftXMsawM90tnXwc6xhOAT1gDBC9S8DKeca..JZNUgYYwNS0dP2UK
     * tmyN+XqVcAKw4HqVmChXy5b5msu8eIq3uc2NqNVtR..2ksSLukP8pxXcHyb
     * +sEwvM4uf8qbnHAqwnOnP9+KV9vds6BaH1eRA4CHz..n+NVZlzBsTxTlS16
     * /Umr7wJzVrMqK5sDiSu4WuaaBdqMGfL5hLsTjcBFD..Da2iyQmSKuVD4lIZ ... -----END RSA PRIVATE KEY-----
     *
     * @return the value
     */
    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * The public certificate, in PEM format, that you received from your SSL certificate provider.
     *
     * <p>Example:
     *
     * <p>-----BEGIN CERTIFICATE----- MIIC2jCCAkMCAg38MA0GCSqGSIb3DQEBBQUAMIGbM..QswCQYDVQQGEwJKU
     * A1UECBMFVG9reW8xEDAOBgNVBAcTB0NodW8ta3UxE..TAPBgNVBAoTCEZyY
     * MRgwFgYDVQQLEw9XZWJDZXJ0IFN1cHBvcnQxGDAWB..gNVBAMTD0ZyYW5rN
     * YiBDQTEjMCEGCSqGSIb3DQEJARYUc3VwcG9ydEBmc..mFuazRkZC5jb20wH ... -----END CERTIFICATE-----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
    private final String publicCertificate;

    /**
     * The public certificate, in PEM format, that you received from your SSL certificate provider.
     *
     * <p>Example:
     *
     * <p>-----BEGIN CERTIFICATE----- MIIC2jCCAkMCAg38MA0GCSqGSIb3DQEBBQUAMIGbM..QswCQYDVQQGEwJKU
     * A1UECBMFVG9reW8xEDAOBgNVBAcTB0NodW8ta3UxE..TAPBgNVBAoTCEZyY
     * MRgwFgYDVQQLEw9XZWJDZXJ0IFN1cHBvcnQxGDAWB..gNVBAMTD0ZyYW5rN
     * YiBDQTEjMCEGCSqGSIb3DQEJARYUc3VwcG9ydEBmc..mFuazRkZC5jb20wH ... -----END CERTIFICATE-----
     *
     * @return the value
     */
    public String getPublicCertificate() {
        return publicCertificate;
    }

    /**
     * The Certificate Authority certificate, or any interim certificate, that you received from
     * your SSL certificate provider.
     *
     * <p>Example:
     *
     * <p>-----BEGIN CERTIFICATE----- MIIEczCCA1ugAwIBAgIBADANBgkqhkiG9w0BAQQFAD..AkGA1UEBhMCR0Ix
     * EzARBgNVBAgTClNvbWUtU3RhdGUxFDASBgNVBAoTC0..0EgTHRkMTcwNQYD
     * VQQLEy5DbGFzcyAxIFB1YmxpYyBQcmltYXJ5IENlcn..XRpb24gQXV0aG9y
     * aXR5MRQwEgYDVQQDEwtCZXN0IENBIEx0ZDAeFw0wMD..TUwMTZaFw0wMTAy ... -----END CERTIFICATE-----
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    private final String caCertificate;

    /**
     * The Certificate Authority certificate, or any interim certificate, that you received from
     * your SSL certificate provider.
     *
     * <p>Example:
     *
     * <p>-----BEGIN CERTIFICATE----- MIIEczCCA1ugAwIBAgIBADANBgkqhkiG9w0BAQQFAD..AkGA1UEBhMCR0Ix
     * EzARBgNVBAgTClNvbWUtU3RhdGUxFDASBgNVBAoTC0..0EgTHRkMTcwNQYD
     * VQQLEy5DbGFzcyAxIFB1YmxpYyBQcmltYXJ5IENlcn..XRpb24gQXV0aG9y
     * aXR5MRQwEgYDVQQDEwtCZXN0IENBIEx0ZDAeFw0wMD..TUwMTZaFw0wMTAy ... -----END CERTIFICATE-----
     *
     * @return the value
     */
    public String getCaCertificate() {
        return caCertificate;
    }

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed. Valid
     * certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     *
     * <p>Example: {@code example_certificate_bundle}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    private final String certificateName;

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed. Valid
     * certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     *
     * <p>Example: {@code example_certificate_bundle}
     *
     * @return the value
     */
    public String getCertificateName() {
        return certificateName;
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
        sb.append("CreateCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("passphrase=").append(String.valueOf(this.passphrase));
        sb.append(", privateKey=").append(String.valueOf(this.privateKey));
        sb.append(", publicCertificate=").append(String.valueOf(this.publicCertificate));
        sb.append(", caCertificate=").append(String.valueOf(this.caCertificate));
        sb.append(", certificateName=").append(String.valueOf(this.certificateName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCertificateDetails)) {
            return false;
        }

        CreateCertificateDetails other = (CreateCertificateDetails) o;
        return java.util.Objects.equals(this.passphrase, other.passphrase)
                && java.util.Objects.equals(this.privateKey, other.privateKey)
                && java.util.Objects.equals(this.publicCertificate, other.publicCertificate)
                && java.util.Objects.equals(this.caCertificate, other.caCertificate)
                && java.util.Objects.equals(this.certificateName, other.certificateName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.passphrase == null ? 43 : this.passphrase.hashCode());
        result = (result * PRIME) + (this.privateKey == null ? 43 : this.privateKey.hashCode());
        result =
                (result * PRIME)
                        + (this.publicCertificate == null ? 43 : this.publicCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.caCertificate == null ? 43 : this.caCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateName == null ? 43 : this.certificateName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
