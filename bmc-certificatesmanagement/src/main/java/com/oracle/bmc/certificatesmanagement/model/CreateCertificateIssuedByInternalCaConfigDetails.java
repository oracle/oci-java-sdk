/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the configuration for creating an internally managed certificate which is issued
 * by a private certificate authority (CA). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCertificateIssuedByInternalCaConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateCertificateIssuedByInternalCaConfigDetails
        extends CreateCertificateConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }
        /**
         * The name of the profile used to create the certificate, which depends on the type of
         * certificate you need.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
        private CertificateProfileType certificateProfileType;

        /**
         * The name of the profile used to create the certificate, which depends on the type of
         * certificate you need.
         *
         * @param certificateProfileType the value to set
         * @return this builder
         */
        public Builder certificateProfileType(CertificateProfileType certificateProfileType) {
            this.certificateProfileType = certificateProfileType;
            this.__explicitlySet__.add("certificateProfileType");
            return this;
        }
        /** The OCID of the private CA. */
        @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
        private String issuerCertificateAuthorityId;

        /**
         * The OCID of the private CA.
         *
         * @param issuerCertificateAuthorityId the value to set
         * @return this builder
         */
        public Builder issuerCertificateAuthorityId(String issuerCertificateAuthorityId) {
            this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
            this.__explicitlySet__.add("issuerCertificateAuthorityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private CertificateSubject subject;

        public Builder subject(CertificateSubject subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /** A list of subject alternative names. */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
        private java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

        /**
         * A list of subject alternative names.
         *
         * @param subjectAlternativeNames the value to set
         * @return this builder
         */
        public Builder subjectAlternativeNames(
                java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            this.__explicitlySet__.add("subjectAlternativeNames");
            return this;
        }
        /** The algorithm to use to create key pairs. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
        private KeyAlgorithm keyAlgorithm;

        /**
         * The algorithm to use to create key pairs.
         *
         * @param keyAlgorithm the value to set
         * @return this builder
         */
        public Builder keyAlgorithm(KeyAlgorithm keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            this.__explicitlySet__.add("keyAlgorithm");
            return this;
        }
        /** The algorithm to use to sign the public key certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private SignatureAlgorithm signatureAlgorithm;

        /**
         * The algorithm to use to sign the public key certificate.
         *
         * @param signatureAlgorithm the value to set
         * @return this builder
         */
        public Builder signatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCertificateIssuedByInternalCaConfigDetails build() {
            CreateCertificateIssuedByInternalCaConfigDetails model =
                    new CreateCertificateIssuedByInternalCaConfigDetails(
                            this.versionName,
                            this.certificateProfileType,
                            this.issuerCertificateAuthorityId,
                            this.validity,
                            this.subject,
                            this.subjectAlternativeNames,
                            this.keyAlgorithm,
                            this.signatureAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCertificateIssuedByInternalCaConfigDetails model) {
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("certificateProfileType")) {
                this.certificateProfileType(model.getCertificateProfileType());
            }
            if (model.wasPropertyExplicitlySet("issuerCertificateAuthorityId")) {
                this.issuerCertificateAuthorityId(model.getIssuerCertificateAuthorityId());
            }
            if (model.wasPropertyExplicitlySet("validity")) {
                this.validity(model.getValidity());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("subjectAlternativeNames")) {
                this.subjectAlternativeNames(model.getSubjectAlternativeNames());
            }
            if (model.wasPropertyExplicitlySet("keyAlgorithm")) {
                this.keyAlgorithm(model.getKeyAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("signatureAlgorithm")) {
                this.signatureAlgorithm(model.getSignatureAlgorithm());
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

    @Deprecated
    public CreateCertificateIssuedByInternalCaConfigDetails(
            String versionName,
            CertificateProfileType certificateProfileType,
            String issuerCertificateAuthorityId,
            Validity validity,
            CertificateSubject subject,
            java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames,
            KeyAlgorithm keyAlgorithm,
            SignatureAlgorithm signatureAlgorithm) {
        super(versionName);
        this.certificateProfileType = certificateProfileType;
        this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
        this.validity = validity;
        this.subject = subject;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.keyAlgorithm = keyAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * The name of the profile used to create the certificate, which depends on the type of
     * certificate you need.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
    private final CertificateProfileType certificateProfileType;

    /**
     * The name of the profile used to create the certificate, which depends on the type of
     * certificate you need.
     *
     * @return the value
     */
    public CertificateProfileType getCertificateProfileType() {
        return certificateProfileType;
    }

    /** The OCID of the private CA. */
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
    private final String issuerCertificateAuthorityId;

    /**
     * The OCID of the private CA.
     *
     * @return the value
     */
    public String getIssuerCertificateAuthorityId() {
        return issuerCertificateAuthorityId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final CertificateSubject subject;

    public CertificateSubject getSubject() {
        return subject;
    }

    /** A list of subject alternative names. */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
    private final java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

    /**
     * A list of subject alternative names.
     *
     * @return the value
     */
    public java.util.List<CertificateSubjectAlternativeName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /** The algorithm to use to create key pairs. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
    private final KeyAlgorithm keyAlgorithm;

    /**
     * The algorithm to use to create key pairs.
     *
     * @return the value
     */
    public KeyAlgorithm getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /** The algorithm to use to sign the public key certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    private final SignatureAlgorithm signatureAlgorithm;

    /**
     * The algorithm to use to sign the public key certificate.
     *
     * @return the value
     */
    public SignatureAlgorithm getSignatureAlgorithm() {
        return signatureAlgorithm;
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
        sb.append("CreateCertificateIssuedByInternalCaConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", certificateProfileType=").append(String.valueOf(this.certificateProfileType));
        sb.append(", issuerCertificateAuthorityId=")
                .append(String.valueOf(this.issuerCertificateAuthorityId));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", subjectAlternativeNames=")
                .append(String.valueOf(this.subjectAlternativeNames));
        sb.append(", keyAlgorithm=").append(String.valueOf(this.keyAlgorithm));
        sb.append(", signatureAlgorithm=").append(String.valueOf(this.signatureAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCertificateIssuedByInternalCaConfigDetails)) {
            return false;
        }

        CreateCertificateIssuedByInternalCaConfigDetails other =
                (CreateCertificateIssuedByInternalCaConfigDetails) o;
        return java.util.Objects.equals(this.certificateProfileType, other.certificateProfileType)
                && java.util.Objects.equals(
                        this.issuerCertificateAuthorityId, other.issuerCertificateAuthorityId)
                && java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(
                        this.subjectAlternativeNames, other.subjectAlternativeNames)
                && java.util.Objects.equals(this.keyAlgorithm, other.keyAlgorithm)
                && java.util.Objects.equals(this.signatureAlgorithm, other.signatureAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.certificateProfileType == null
                                ? 43
                                : this.certificateProfileType.hashCode());
        result =
                (result * PRIME)
                        + (this.issuerCertificateAuthorityId == null
                                ? 43
                                : this.issuerCertificateAuthorityId.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result =
                (result * PRIME)
                        + (this.subjectAlternativeNames == null
                                ? 43
                                : this.subjectAlternativeNames.hashCode());
        result = (result * PRIME) + (this.keyAlgorithm == null ? 43 : this.keyAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.signatureAlgorithm == null
                                ? 43
                                : this.signatureAlgorithm.hashCode());
        return result;
    }
}
