/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * The configuration details for a listener certificate bundle.
 * For more information on SSL certficate configuration, see
 * [Managing SSL Certificates](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingcertificates.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = CertificateDetails.Builder.class)
public class CertificateDetails {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("caCertificate")
        private String caCertificate;

        @JsonProperty("certificateName")
        private String certificateName;

        @JsonProperty("passphrase")
        private String passphrase;

        @JsonProperty("privateKey")
        private String privateKey;

        @JsonProperty("publicCertificate")
        private String publicCertificate;

        public CertificateDetails build() {
            return new CertificateDetails(
                    caCertificate, certificateName, passphrase, privateKey, publicCertificate);
        }

        @JsonIgnore
        public Builder copy(CertificateDetails o) {
            return caCertificate(o.getCaCertificate())
                    .certificateName(o.getCertificateName())
                    .passphrase(o.getPassphrase())
                    .privateKey(o.getPrivateKey())
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
    @JsonProperty("caCertificate")
    String caCertificate;

    /**
     * A friendly name for the certificate bundle. It must be unique and it cannot be changed.
     * <p>
     * Example: `My certificate bundle`
     *
     **/
    @JsonProperty("certificateName")
    @Valid
    @NotNull
    String certificateName;

    /**
     * A passphrase for encrypted private keys. This is needed only if you created your certificate with a passphrase.
     * <p>
     * Example: `Mysecretunlockingcode42!1!`
     *
     **/
    @JsonProperty("passphrase")
    String passphrase;

    /**
     * The SSL private key for your certificate, in PEM format.
     * <p>
     * Example:
     * <p>
     * -----BEGIN RSA PRIVATE KEY-----
     *     jO1O1v2ftXMsawM90tnXwc6xhOAT1gDBC9S8DKeca..JZNUgYYwNS0dP2UK
     *     tmyN+XqVcAKw4HqVmChXy5b5msu8eIq3uc2NqNVtR..2ksSLukP8pxXcHyb
     *     +sEwvM4uf8qbnHAqwnOnP9+KV9vds6BaH1eRA4CHz..n+NVZlzBsTxTlS16
     *     /Umr7wJzVrMqK5sDiSu4WuaaBdqMGfL5hLsTjcBFD..Da2iyQmSKuVD4lIZ
     *     ...
     *     -----END RSA PRIVATE KEY-----
     *
     **/
    @JsonProperty("privateKey")
    String privateKey;

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
    @JsonProperty("publicCertificate")
    String publicCertificate;
}
