/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The manner in which the root or subordinate certificate authority (CA) is generated and managed.
 * CA configuration types include the following: - Root CA generated internally by the service
 * (ROOT_CA_GENERATED_INTERNALLY). You provide the details required to generate a certificate,
 * including the Oracle Cloud Infrastructure (OCI) Key Management service (KMS) hardware-protected,
 * asymmetric encryption key. Using this information, the Certificates service creates the root CA
 * certificate which is then signed by the OCI KMS private key. - Subordinate CA issued by a CA that
 * was generated internally by the service (SUBORDINATE_CA_ISSUED_BY_INTERNAL_CA). You provide the
 * details required to generate a certificate, including the OCI KMS hardware-protected, asymmetric
 * encryption key. Using this information, the Certificates service creates the subordinate CA
 * certificate which is then signed by the OCI KMS private key you specified and the OCI KMS private
 * key of the issuer CA. - Root CA imported to the service (ROOT_CA_MANAGED_EXTERNALLY). You import
 * the root CA certificate in PEM format without the certificate's private key. Private keys are
 * managed externally by OCI KMS Dedicated KMS (DKMS), an on-premises key management solution, or a
 * third-party cloud provider. This type of CA can't directly issue certificates or subordinate CAs.
 * Instead, for any certificates or subordinate CAs you want to issue, the service generates a CSR
 * that you must sign externally and then import. - Subordinate CA issued by a CA that was generated
 * externally, but where you manage keys in OCI
 * (SUBORDINATE_CA_MANAGED_INTERNALLY_ISSUED_BY_EXTERNAL_CA). You import the key of the subordinate
 * CA certificate to OCI KMS. You then provide the details required to generate a CSR that you must
 * sign externally by using the private key of the external parent CA. During this time, the CA
 * remains in a {@code PENDING_ACTIVATION} lifecycle state. To complete activation, import the
 * signed certificate. This type of subordinate CA can issue certificates and subordinate CAs of its
 * own.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
public enum CertificateAuthorityConfigType implements com.oracle.bmc.http.internal.BmcEnum {
    RootCaGeneratedInternally("ROOT_CA_GENERATED_INTERNALLY"),
    SubordinateCaIssuedByInternalCa("SUBORDINATE_CA_ISSUED_BY_INTERNAL_CA"),
    RootCaManagedExternally("ROOT_CA_MANAGED_EXTERNALLY"),
    SubordinateCaManagedInternallyIssuedByExternalCa(
            "SUBORDINATE_CA_MANAGED_INTERNALLY_ISSUED_BY_EXTERNAL_CA"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(CertificateAuthorityConfigType.class);

    private final String value;
    private static java.util.Map<String, CertificateAuthorityConfigType> map;

    static {
        map = new java.util.HashMap<>();
        for (CertificateAuthorityConfigType v : CertificateAuthorityConfigType.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    CertificateAuthorityConfigType(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static CertificateAuthorityConfigType create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'CertificateAuthorityConfigType', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
