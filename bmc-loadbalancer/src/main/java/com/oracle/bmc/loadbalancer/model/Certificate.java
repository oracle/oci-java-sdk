/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details of a listener certificate bundle.
 * For more information on SSL certficate configuration, see
 * [Managing SSL Certificates](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingcertificates.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Certificate.Builder.class)
public class Certificate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        public Certificate build() {
            return new Certificate(caCertificate, certificateName, publicCertificate);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate o) {
            return caCertificate(o.getCaCertificate())
                    .certificateName(o.getCertificateName())
                    .publicCertificate(o.getPublicCertificate());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The Certificate Authority certificate, or any interim certificate, that you received from your SSL certificate provider.
     * <p>
     * Example:
     * <p>
     * -----BEGIN CERTIFICATE-----
     *     MIIEczCCA1ugAwIBAgIBADANBgkqhkiG9w0BAQQFAD..AkGA1UEBhMCR0Ix
     *     EzARBgNVBAgTClNvbWUtU3RhdGUxFDASBgNVBAoTC0..0EgTHRkMTcwNQYD
     *     VQQLEy5DbGFzcyAxIFB1YmxpYyBQcmltYXJ5IENlcn..XRpb24gQXV0aG9y
     *     aXR5MRQwEgYDVQQDEwtCZXN0IENBIEx0ZDAeFw0wMD..TUwMTZaFw0wMTAy
     *     ...
     *     -----END CERTIFICATE-----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String caCertificate;

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * Valid certificate bundle names include only alphanumeric characters, dashes, and underscores.
     * Certificate bundle names cannot contain spaces. Avoid entering confidential information.
     * <p>
     * Example: `My_certificate_bundle`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    @javax.validation.constraints.Pattern(regexp = "/^[a-zA-Z0-9_.-]*$/")
    @javax.validation.constraints.Size(min = 1, max = 255)
    String certificateName;

    /**
     * The public certificate, in PEM format, that you received from your SSL certificate provider.
     * <p>
     * Example:
     * <p>
     * -----BEGIN CERTIFICATE-----
     *     MIIC2jCCAkMCAg38MA0GCSqGSIb3DQEBBQUAMIGbMQswCQYDVQQGEwJKUDEOMAwG
     *     A1UECBMFVG9reW8xEDAOBgNVBAcTB0NodW8ta3UxETAPBgNVBAoTCEZyYW5rNERE
     *     MRgwFgYDVQQLEw9XZWJDZXJ0IFN1cHBvcnQxGDAWBgNVBAMTD0ZyYW5rNEREIFdl
     *     YiBDQTEjMCEGCSqGSIb3DQEJARYUc3VwcG9ydEBmcmFuazRkZC5jb20wHhcNMTIw
     *     ...
     *     -----END CERTIFICATE-----
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String publicCertificate;
}
