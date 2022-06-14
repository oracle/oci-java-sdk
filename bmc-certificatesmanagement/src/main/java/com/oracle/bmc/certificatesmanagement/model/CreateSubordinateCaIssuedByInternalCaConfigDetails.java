/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details for creating a private subordinate certificate authority (CA) which is issued by a private CA.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateSubordinateCaIssuedByInternalCaConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateSubordinateCaIssuedByInternalCaConfigDetails
        extends CreateCertificateAuthorityConfigDetails {
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
         * The OCID of the private CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
        private String issuerCertificateAuthorityId;

        /**
         * The OCID of the private CA.
         * @param issuerCertificateAuthorityId the value to set
         * @return this builder
         **/
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
        /**
         * The algorithm used to sign public key certificates that the CA issues.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SignatureAlgorithm signingAlgorithm;

        /**
         * The algorithm used to sign public key certificates that the CA issues.
         * @param signingAlgorithm the value to set
         * @return this builder
         **/
        public Builder signingAlgorithm(SignatureAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            this.__explicitlySet__.add("signingAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private CertificateSubject subject;

        public Builder subject(CertificateSubject subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSubordinateCaIssuedByInternalCaConfigDetails build() {
            CreateSubordinateCaIssuedByInternalCaConfigDetails __instance__ =
                    new CreateSubordinateCaIssuedByInternalCaConfigDetails(
                            versionName,
                            issuerCertificateAuthorityId,
                            validity,
                            signingAlgorithm,
                            subject);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSubordinateCaIssuedByInternalCaConfigDetails o) {
            Builder copiedBuilder =
                    versionName(o.getVersionName())
                            .issuerCertificateAuthorityId(o.getIssuerCertificateAuthorityId())
                            .validity(o.getValidity())
                            .signingAlgorithm(o.getSigningAlgorithm())
                            .subject(o.getSubject());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateSubordinateCaIssuedByInternalCaConfigDetails(
            String versionName,
            String issuerCertificateAuthorityId,
            Validity validity,
            SignatureAlgorithm signingAlgorithm,
            CertificateSubject subject) {
        super(versionName);
        this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
        this.validity = validity;
        this.signingAlgorithm = signingAlgorithm;
        this.subject = subject;
    }

    /**
     * The OCID of the private CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
    private final String issuerCertificateAuthorityId;

    /**
     * The OCID of the private CA.
     * @return the value
     **/
    public String getIssuerCertificateAuthorityId() {
        return issuerCertificateAuthorityId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /**
     * The algorithm used to sign public key certificates that the CA issues.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    private final SignatureAlgorithm signingAlgorithm;

    /**
     * The algorithm used to sign public key certificates that the CA issues.
     * @return the value
     **/
    public SignatureAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final CertificateSubject subject;

    public CertificateSubject getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateSubordinateCaIssuedByInternalCaConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append(", issuerCertificateAuthorityId=")
                .append(String.valueOf(this.issuerCertificateAuthorityId));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSubordinateCaIssuedByInternalCaConfigDetails)) {
            return false;
        }

        CreateSubordinateCaIssuedByInternalCaConfigDetails other =
                (CreateSubordinateCaIssuedByInternalCaConfigDetails) o;
        return java.util.Objects.equals(
                        this.issuerCertificateAuthorityId, other.issuerCertificateAuthorityId)
                && java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.issuerCertificateAuthorityId == null
                                ? 43
                                : this.issuerCertificateAuthorityId.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
