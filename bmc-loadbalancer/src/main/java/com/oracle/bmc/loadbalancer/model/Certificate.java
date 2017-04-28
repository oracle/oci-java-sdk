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
 * The configuration details of a listener certificate bundle.
 * For more information on SSL certficate configuration, see
 * [Managing SSL Certificates](https://docs.us-phoenix-1.oraclecloud.com/Content/Balance/Tasks/managingcertificates.htm).
 *
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = Certificate.Builder.class)
public class Certificate {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("caCertificate")
        private String caCertificate;

        @JsonProperty("certificateName")
        private String certificateName;

        @JsonProperty("publicCertificate")
        private String publicCertificate;

        public Certificate build() {
            return new Certificate(caCertificate, certificateName, publicCertificate);
        }

        @JsonIgnore
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
    @JsonProperty("caCertificate")
    @Valid
    @NotNull
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
    @Valid
    @NotNull
    String publicCertificate;
}
