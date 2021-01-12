/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details of a certificate bundle.
 * For more information on SSL certficate configuration, see
 * [Managing SSL Certificates](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingcertificates.htm).
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Certificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Certificate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicCertificate")
        private String publicCertificate;

        public Builder publicCertificate(String publicCertificate) {
            this.publicCertificate = publicCertificate;
            this.__explicitlySet__.add("publicCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            this.__explicitlySet__.add("caCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate build() {
            Certificate __instance__ =
                    new Certificate(certificateName, publicCertificate, caCertificate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate o) {
            Builder copiedBuilder =
                    certificateName(o.getCertificateName())
                            .publicCertificate(o.getPublicCertificate())
                            .caCertificate(o.getCaCertificate());

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
    String publicCertificate;

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
    String caCertificate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
