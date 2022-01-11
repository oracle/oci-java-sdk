/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The contents of the certificate, properties of the certificate (and certificate version), and user-provided contextual metadata for the certificate.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "certificateBundleType",
    defaultImpl = CertificateBundle.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CertificateBundlePublicOnly.class,
        name = "CERTIFICATE_CONTENT_PUBLIC_ONLY"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CertificateBundleWithPrivateKey.class,
        name = "CERTIFICATE_CONTENT_WITH_PRIVATE_KEY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CertificateBundle {

    /**
     * The OCID of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    String certificateId;

    /**
     * The name of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    String certificateName;

    /**
     * The version number of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    Long versionNumber;

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    /**
     * The certificate in PEM format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    String certificatePem;

    /**
     * The certificate chain (in PEM format) for the certificate bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
    String certChainPem;

    /**
     * An optional property indicating when the certificate version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    Validity validity;

    /**
     * The name of the certificate version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    String versionName;

    /**
     * A list of rotation states for the certificate bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    java.util.List<VersionStage> stages;

    @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
    RevocationStatus revocationStatus;

    /**
     * The type of certificate bundle, which indicates whether the private key fields are included.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum CertificateBundleType {
        CertificateContentPublicOnly("CERTIFICATE_CONTENT_PUBLIC_ONLY"),
        CertificateContentWithPrivateKey("CERTIFICATE_CONTENT_WITH_PRIVATE_KEY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, CertificateBundleType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateBundleType v : CertificateBundleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CertificateBundleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateBundleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CertificateBundleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
