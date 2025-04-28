/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details for creating a private root certificate authority (CA). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateRootCaByGeneratingInternallyConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "configType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateRootCaByGeneratingInternallyConfigDetails
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

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }
        /** The algorithm used to sign public key certificates that the CA issues. */
        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SignatureAlgorithm signingAlgorithm;

        /**
         * The algorithm used to sign public key certificates that the CA issues.
         *
         * @param signingAlgorithm the value to set
         * @return this builder
         */
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

        public CreateRootCaByGeneratingInternallyConfigDetails build() {
            CreateRootCaByGeneratingInternallyConfigDetails model =
                    new CreateRootCaByGeneratingInternallyConfigDetails(
                            this.versionName, this.validity, this.signingAlgorithm, this.subject);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRootCaByGeneratingInternallyConfigDetails model) {
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("validity")) {
                this.validity(model.getValidity());
            }
            if (model.wasPropertyExplicitlySet("signingAlgorithm")) {
                this.signingAlgorithm(model.getSigningAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
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
    public CreateRootCaByGeneratingInternallyConfigDetails(
            String versionName,
            Validity validity,
            SignatureAlgorithm signingAlgorithm,
            CertificateSubject subject) {
        super(versionName);
        this.validity = validity;
        this.signingAlgorithm = signingAlgorithm;
        this.subject = subject;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /** The algorithm used to sign public key certificates that the CA issues. */
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    private final SignatureAlgorithm signingAlgorithm;

    /**
     * The algorithm used to sign public key certificates that the CA issues.
     *
     * @return the value
     */
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
        sb.append("CreateRootCaByGeneratingInternallyConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateRootCaByGeneratingInternallyConfigDetails)) {
            return false;
        }

        CreateRootCaByGeneratingInternallyConfigDetails other =
                (CreateRootCaByGeneratingInternallyConfigDetails) o;
        return java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && java.util.Objects.equals(this.subject, other.subject)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        return result;
    }
}
