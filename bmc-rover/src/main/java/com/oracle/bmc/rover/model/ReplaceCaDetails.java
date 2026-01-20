/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information about the detailed CA bundle replacement of the rover node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ReplaceCaDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ReplaceCaDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "caBundlePem",
        "certificateMaxValidityDuration",
        "certKeyAlgorithm",
        "certSignatureAlgorithm"
    })
    public ReplaceCaDetails(
            String caBundlePem,
            String certificateMaxValidityDuration,
            CertKeyAlgorithm certKeyAlgorithm,
            CertSignatureAlgorithm certSignatureAlgorithm) {
        super();
        this.caBundlePem = caBundlePem;
        this.certificateMaxValidityDuration = certificateMaxValidityDuration;
        this.certKeyAlgorithm = certKeyAlgorithm;
        this.certSignatureAlgorithm = certSignatureAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Plain text certificate chain in PEM format for the subordinate CA associated with given
         * roverNode.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caBundlePem")
        private String caBundlePem;

        /**
         * Plain text certificate chain in PEM format for the subordinate CA associated with given
         * roverNode.
         *
         * @param caBundlePem the value to set
         * @return this builder
         */
        public Builder caBundlePem(String caBundlePem) {
            this.caBundlePem = caBundlePem;
            this.__explicitlySet__.add("caBundlePem");
            return this;
        }
        /**
         * Max validity of leaf certificates issued by the CA associated with given node, in days,
         * in ISO 8601 format, example "P365D".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateMaxValidityDuration")
        private String certificateMaxValidityDuration;

        /**
         * Max validity of leaf certificates issued by the CA associated with given node, in days,
         * in ISO 8601 format, example "P365D".
         *
         * @param certificateMaxValidityDuration the value to set
         * @return this builder
         */
        public Builder certificateMaxValidityDuration(String certificateMaxValidityDuration) {
            this.certificateMaxValidityDuration = certificateMaxValidityDuration;
            this.__explicitlySet__.add("certificateMaxValidityDuration");
            return this;
        }
        /** key algorithm for issuing leaf certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certKeyAlgorithm")
        private CertKeyAlgorithm certKeyAlgorithm;

        /**
         * key algorithm for issuing leaf certificate.
         *
         * @param certKeyAlgorithm the value to set
         * @return this builder
         */
        public Builder certKeyAlgorithm(CertKeyAlgorithm certKeyAlgorithm) {
            this.certKeyAlgorithm = certKeyAlgorithm;
            this.__explicitlySet__.add("certKeyAlgorithm");
            return this;
        }
        /** signature algorithm for issuing leaf certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certSignatureAlgorithm")
        private CertSignatureAlgorithm certSignatureAlgorithm;

        /**
         * signature algorithm for issuing leaf certificate.
         *
         * @param certSignatureAlgorithm the value to set
         * @return this builder
         */
        public Builder certSignatureAlgorithm(CertSignatureAlgorithm certSignatureAlgorithm) {
            this.certSignatureAlgorithm = certSignatureAlgorithm;
            this.__explicitlySet__.add("certSignatureAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplaceCaDetails build() {
            ReplaceCaDetails model =
                    new ReplaceCaDetails(
                            this.caBundlePem,
                            this.certificateMaxValidityDuration,
                            this.certKeyAlgorithm,
                            this.certSignatureAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplaceCaDetails model) {
            if (model.wasPropertyExplicitlySet("caBundlePem")) {
                this.caBundlePem(model.getCaBundlePem());
            }
            if (model.wasPropertyExplicitlySet("certificateMaxValidityDuration")) {
                this.certificateMaxValidityDuration(model.getCertificateMaxValidityDuration());
            }
            if (model.wasPropertyExplicitlySet("certKeyAlgorithm")) {
                this.certKeyAlgorithm(model.getCertKeyAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("certSignatureAlgorithm")) {
                this.certSignatureAlgorithm(model.getCertSignatureAlgorithm());
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

    /**
     * Plain text certificate chain in PEM format for the subordinate CA associated with given
     * roverNode.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caBundlePem")
    private final String caBundlePem;

    /**
     * Plain text certificate chain in PEM format for the subordinate CA associated with given
     * roverNode.
     *
     * @return the value
     */
    public String getCaBundlePem() {
        return caBundlePem;
    }

    /**
     * Max validity of leaf certificates issued by the CA associated with given node, in days, in
     * ISO 8601 format, example "P365D".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateMaxValidityDuration")
    private final String certificateMaxValidityDuration;

    /**
     * Max validity of leaf certificates issued by the CA associated with given node, in days, in
     * ISO 8601 format, example "P365D".
     *
     * @return the value
     */
    public String getCertificateMaxValidityDuration() {
        return certificateMaxValidityDuration;
    }

    /** key algorithm for issuing leaf certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certKeyAlgorithm")
    private final CertKeyAlgorithm certKeyAlgorithm;

    /**
     * key algorithm for issuing leaf certificate.
     *
     * @return the value
     */
    public CertKeyAlgorithm getCertKeyAlgorithm() {
        return certKeyAlgorithm;
    }

    /** signature algorithm for issuing leaf certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certSignatureAlgorithm")
    private final CertSignatureAlgorithm certSignatureAlgorithm;

    /**
     * signature algorithm for issuing leaf certificate.
     *
     * @return the value
     */
    public CertSignatureAlgorithm getCertSignatureAlgorithm() {
        return certSignatureAlgorithm;
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
        sb.append("ReplaceCaDetails(");
        sb.append("super=").append(super.toString());
        sb.append("caBundlePem=").append(String.valueOf(this.caBundlePem));
        sb.append(", certificateMaxValidityDuration=")
                .append(String.valueOf(this.certificateMaxValidityDuration));
        sb.append(", certKeyAlgorithm=").append(String.valueOf(this.certKeyAlgorithm));
        sb.append(", certSignatureAlgorithm=").append(String.valueOf(this.certSignatureAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplaceCaDetails)) {
            return false;
        }

        ReplaceCaDetails other = (ReplaceCaDetails) o;
        return java.util.Objects.equals(this.caBundlePem, other.caBundlePem)
                && java.util.Objects.equals(
                        this.certificateMaxValidityDuration, other.certificateMaxValidityDuration)
                && java.util.Objects.equals(this.certKeyAlgorithm, other.certKeyAlgorithm)
                && java.util.Objects.equals(
                        this.certSignatureAlgorithm, other.certSignatureAlgorithm)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.caBundlePem == null ? 43 : this.caBundlePem.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateMaxValidityDuration == null
                                ? 43
                                : this.certificateMaxValidityDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.certKeyAlgorithm == null ? 43 : this.certKeyAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.certSignatureAlgorithm == null
                                ? 43
                                : this.certSignatureAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
