/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The contents of the certificate, properties of the certificate (and certificate version), and
 * user-provided contextual metadata for the certificate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "certificateBundleType",
        defaultImpl = CertificateBundle.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CertificateBundlePublicOnly.class,
            name = "CERTIFICATE_CONTENT_PUBLIC_ONLY"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CertificateBundleWithPrivateKey.class,
            name = "CERTIFICATE_CONTENT_WITH_PRIVATE_KEY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public class CertificateBundle extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateId",
        "certificateName",
        "versionNumber",
        "serialNumber",
        "certificatePem",
        "certChainPem",
        "timeCreated",
        "validity",
        "versionName",
        "stages",
        "revocationStatus"
    })
    protected CertificateBundle(
            String certificateId,
            String certificateName,
            Long versionNumber,
            String serialNumber,
            String certificatePem,
            String certChainPem,
            java.util.Date timeCreated,
            Validity validity,
            String versionName,
            java.util.List<VersionStage> stages,
            RevocationStatus revocationStatus) {
        super();
        this.certificateId = certificateId;
        this.certificateName = certificateName;
        this.versionNumber = versionNumber;
        this.serialNumber = serialNumber;
        this.certificatePem = certificatePem;
        this.certChainPem = certChainPem;
        this.timeCreated = timeCreated;
        this.validity = validity;
        this.versionName = versionName;
        this.stages = stages;
        this.revocationStatus = revocationStatus;
    }

    /** The OCID of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the certificate.
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
    }

    /** The name of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    private final String certificateName;

    /**
     * The name of the certificate.
     *
     * @return the value
     */
    public String getCertificateName() {
        return certificateName;
    }

    /** The version number of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the certificate.
     *
     * @return the value
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** The certificate in PEM format. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    private final String certificatePem;

    /**
     * The certificate in PEM format.
     *
     * @return the value
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /** The certificate chain (in PEM format) for the certificate bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
    private final String certChainPem;

    /**
     * The certificate chain (in PEM format) for the certificate bundle.
     *
     * @return the value
     */
    public String getCertChainPem() {
        return certChainPem;
    }

    /**
     * An optional property indicating when the certificate version was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An optional property indicating when the certificate version was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /** The name of the certificate version. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * The name of the certificate version.
     *
     * @return the value
     */
    public String getVersionName() {
        return versionName;
    }

    /** A list of rotation states for the certificate bundle. */
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<VersionStage> stages;

    /**
     * A list of rotation states for the certificate bundle.
     *
     * @return the value
     */
    public java.util.List<VersionStage> getStages() {
        return stages;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
    private final RevocationStatus revocationStatus;

    public RevocationStatus getRevocationStatus() {
        return revocationStatus;
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
        sb.append("CertificateBundle(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", certificateName=").append(String.valueOf(this.certificateName));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", certificatePem=").append(String.valueOf(this.certificatePem));
        sb.append(", certChainPem=").append(String.valueOf(this.certChainPem));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", versionName=").append(String.valueOf(this.versionName));
        sb.append(", stages=").append(String.valueOf(this.stages));
        sb.append(", revocationStatus=").append(String.valueOf(this.revocationStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateBundle)) {
            return false;
        }

        CertificateBundle other = (CertificateBundle) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.certificateName, other.certificateName)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.certificatePem, other.certificatePem)
                && java.util.Objects.equals(this.certChainPem, other.certChainPem)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.versionName, other.versionName)
                && java.util.Objects.equals(this.stages, other.stages)
                && java.util.Objects.equals(this.revocationStatus, other.revocationStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateName == null ? 43 : this.certificateName.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatePem == null ? 43 : this.certificatePem.hashCode());
        result = (result * PRIME) + (this.certChainPem == null ? 43 : this.certChainPem.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationStatus == null ? 43 : this.revocationStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of certificate bundle, which indicates whether the private key fields are included.
     */
    public enum CertificateBundleType implements com.oracle.bmc.http.internal.BmcEnum {
        CertificateContentPublicOnly("CERTIFICATE_CONTENT_PUBLIC_ONLY"),
        CertificateContentWithPrivateKey("CERTIFICATE_CONTENT_WITH_PRIVATE_KEY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CertificateBundleType.class);

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
