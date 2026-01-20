/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Model that contains signed marketplace instance metadata and associated signature in JWT form
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MarketplaceMetadataPublicKeySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MarketplaceMetadataPublicKeySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "keyAlgorithm",
        "keyType",
        "keyUse",
        "keyId",
        "exponent",
        "modulus",
        "certificateChain",
        "certificateThumbprint"
    })
    public MarketplaceMetadataPublicKeySummary(
            String keyAlgorithm,
            String keyType,
            String keyUse,
            String keyId,
            String exponent,
            String modulus,
            java.util.List<String> certificateChain,
            String certificateThumbprint) {
        super();
        this.keyAlgorithm = keyAlgorithm;
        this.keyType = keyType;
        this.keyUse = keyUse;
        this.keyId = keyId;
        this.exponent = exponent;
        this.modulus = modulus;
        this.certificateChain = certificateChain;
        this.certificateThumbprint = certificateThumbprint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** algorithm for public key (i.e. RS256) */
        @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
        private String keyAlgorithm;

        /**
         * algorithm for public key (i.e. RS256)
         *
         * @param keyAlgorithm the value to set
         * @return this builder
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            this.__explicitlySet__.add("keyAlgorithm");
            return this;
        }
        /** key type (i.e. RSA) */
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private String keyType;

        /**
         * key type (i.e. RSA)
         *
         * @param keyType the value to set
         * @return this builder
         */
        public Builder keyType(String keyType) {
            this.keyType = keyType;
            this.__explicitlySet__.add("keyType");
            return this;
        }
        /** how key is to be used */
        @com.fasterxml.jackson.annotation.JsonProperty("keyUse")
        private String keyUse;

        /**
         * how key is to be used
         *
         * @param keyUse the value to set
         * @return this builder
         */
        public Builder keyUse(String keyUse) {
            this.keyUse = keyUse;
            this.__explicitlySet__.add("keyUse");
            return this;
        }
        /**
         * unique id that maps to public certificate, directs user which certificate to use to
         * verfiy
         */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * unique id that maps to public certificate, directs user which certificate to use to
         * verfiy
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** base64 encoded exponent for public key */
        @com.fasterxml.jackson.annotation.JsonProperty("exponent")
        private String exponent;

        /**
         * base64 encoded exponent for public key
         *
         * @param exponent the value to set
         * @return this builder
         */
        public Builder exponent(String exponent) {
            this.exponent = exponent;
            this.__explicitlySet__.add("exponent");
            return this;
        }
        /** RSA public modulus */
        @com.fasterxml.jackson.annotation.JsonProperty("modulus")
        private String modulus;

        /**
         * RSA public modulus
         *
         * @param modulus the value to set
         * @return this builder
         */
        public Builder modulus(String modulus) {
            this.modulus = modulus;
            this.__explicitlySet__.add("modulus");
            return this;
        }
        /** chain of certificates used to sign JWT */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateChain")
        private java.util.List<String> certificateChain;

        /**
         * chain of certificates used to sign JWT
         *
         * @param certificateChain the value to set
         * @return this builder
         */
        public Builder certificateChain(java.util.List<String> certificateChain) {
            this.certificateChain = certificateChain;
            this.__explicitlySet__.add("certificateChain");
            return this;
        }
        /** unique identifier of associated X509 certificate */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateThumbprint")
        private String certificateThumbprint;

        /**
         * unique identifier of associated X509 certificate
         *
         * @param certificateThumbprint the value to set
         * @return this builder
         */
        public Builder certificateThumbprint(String certificateThumbprint) {
            this.certificateThumbprint = certificateThumbprint;
            this.__explicitlySet__.add("certificateThumbprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MarketplaceMetadataPublicKeySummary build() {
            MarketplaceMetadataPublicKeySummary model =
                    new MarketplaceMetadataPublicKeySummary(
                            this.keyAlgorithm,
                            this.keyType,
                            this.keyUse,
                            this.keyId,
                            this.exponent,
                            this.modulus,
                            this.certificateChain,
                            this.certificateThumbprint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MarketplaceMetadataPublicKeySummary model) {
            if (model.wasPropertyExplicitlySet("keyAlgorithm")) {
                this.keyAlgorithm(model.getKeyAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
            }
            if (model.wasPropertyExplicitlySet("keyUse")) {
                this.keyUse(model.getKeyUse());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("exponent")) {
                this.exponent(model.getExponent());
            }
            if (model.wasPropertyExplicitlySet("modulus")) {
                this.modulus(model.getModulus());
            }
            if (model.wasPropertyExplicitlySet("certificateChain")) {
                this.certificateChain(model.getCertificateChain());
            }
            if (model.wasPropertyExplicitlySet("certificateThumbprint")) {
                this.certificateThumbprint(model.getCertificateThumbprint());
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

    /** algorithm for public key (i.e. RS256) */
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
    private final String keyAlgorithm;

    /**
     * algorithm for public key (i.e. RS256)
     *
     * @return the value
     */
    public String getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /** key type (i.e. RSA) */
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final String keyType;

    /**
     * key type (i.e. RSA)
     *
     * @return the value
     */
    public String getKeyType() {
        return keyType;
    }

    /** how key is to be used */
    @com.fasterxml.jackson.annotation.JsonProperty("keyUse")
    private final String keyUse;

    /**
     * how key is to be used
     *
     * @return the value
     */
    public String getKeyUse() {
        return keyUse;
    }

    /**
     * unique id that maps to public certificate, directs user which certificate to use to verfiy
     */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * unique id that maps to public certificate, directs user which certificate to use to verfiy
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** base64 encoded exponent for public key */
    @com.fasterxml.jackson.annotation.JsonProperty("exponent")
    private final String exponent;

    /**
     * base64 encoded exponent for public key
     *
     * @return the value
     */
    public String getExponent() {
        return exponent;
    }

    /** RSA public modulus */
    @com.fasterxml.jackson.annotation.JsonProperty("modulus")
    private final String modulus;

    /**
     * RSA public modulus
     *
     * @return the value
     */
    public String getModulus() {
        return modulus;
    }

    /** chain of certificates used to sign JWT */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateChain")
    private final java.util.List<String> certificateChain;

    /**
     * chain of certificates used to sign JWT
     *
     * @return the value
     */
    public java.util.List<String> getCertificateChain() {
        return certificateChain;
    }

    /** unique identifier of associated X509 certificate */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateThumbprint")
    private final String certificateThumbprint;

    /**
     * unique identifier of associated X509 certificate
     *
     * @return the value
     */
    public String getCertificateThumbprint() {
        return certificateThumbprint;
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
        sb.append("MarketplaceMetadataPublicKeySummary(");
        sb.append("super=").append(super.toString());
        sb.append("keyAlgorithm=").append(String.valueOf(this.keyAlgorithm));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(", keyUse=").append(String.valueOf(this.keyUse));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", exponent=").append(String.valueOf(this.exponent));
        sb.append(", modulus=").append(String.valueOf(this.modulus));
        sb.append(", certificateChain=").append(String.valueOf(this.certificateChain));
        sb.append(", certificateThumbprint=").append(String.valueOf(this.certificateThumbprint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MarketplaceMetadataPublicKeySummary)) {
            return false;
        }

        MarketplaceMetadataPublicKeySummary other = (MarketplaceMetadataPublicKeySummary) o;
        return java.util.Objects.equals(this.keyAlgorithm, other.keyAlgorithm)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && java.util.Objects.equals(this.keyUse, other.keyUse)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.exponent, other.exponent)
                && java.util.Objects.equals(this.modulus, other.modulus)
                && java.util.Objects.equals(this.certificateChain, other.certificateChain)
                && java.util.Objects.equals(this.certificateThumbprint, other.certificateThumbprint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.keyAlgorithm == null ? 43 : this.keyAlgorithm.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + (this.keyUse == null ? 43 : this.keyUse.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.exponent == null ? 43 : this.exponent.hashCode());
        result = (result * PRIME) + (this.modulus == null ? 43 : this.modulus.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateChain == null ? 43 : this.certificateChain.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateThumbprint == null
                                ? 43
                                : this.certificateThumbprint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
