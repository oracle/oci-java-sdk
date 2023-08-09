/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Each value of this attribute represent a certificate that this App uses when it acts as an
 * OAuthClient. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AppCertificates.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppCertificates
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certAlias",
        "sha1Thumbprint",
        "kid",
        "x5t",
        "x509Base64Certificate"
    })
    public AppCertificates(
            String certAlias,
            String sha1Thumbprint,
            String kid,
            String x5t,
            Object x509Base64Certificate) {
        super();
        this.certAlias = certAlias;
        this.sha1Thumbprint = sha1Thumbprint;
        this.kid = kid;
        this.x5t = x5t;
        this.x509Base64Certificate = x509Base64Certificate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Certificate alias
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certAlias")
        private String certAlias;

        /**
         * Certificate alias
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: always - type: string - uniqueness:
         * none
         *
         * @param certAlias the value to set
         * @return this builder
         */
        public Builder certAlias(String certAlias) {
            this.certAlias = certAlias;
            this.__explicitlySet__.add("certAlias");
            return this;
        }
        /**
         * sha1Thumbprint
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sha1Thumbprint")
        private String sha1Thumbprint;

        /**
         * sha1Thumbprint
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param sha1Thumbprint the value to set
         * @return this builder
         */
        public Builder sha1Thumbprint(String sha1Thumbprint) {
            this.sha1Thumbprint = sha1Thumbprint;
            this.__explicitlySet__.add("sha1Thumbprint");
            return this;
        }
        /**
         * Certificate kid
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kid")
        private String kid;

        /**
         * Certificate kid
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param kid the value to set
         * @return this builder
         */
        public Builder kid(String kid) {
            this.kid = kid;
            this.__explicitlySet__.add("kid");
            return this;
        }
        /**
         * Certificate x5t
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("x5t")
        private String x5t;

        /**
         * Certificate x5t
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param x5t the value to set
         * @return this builder
         */
        public Builder x5t(String x5t) {
            this.x5t = x5t;
            this.__explicitlySet__.add("x5t");
            return this;
        }
        /**
         * Base-64-encoded certificate.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: binary - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("x509Base64Certificate")
        private Object x509Base64Certificate;

        /**
         * Base-64-encoded certificate.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: binary - uniqueness:
         * none
         *
         * @param x509Base64Certificate the value to set
         * @return this builder
         */
        public Builder x509Base64Certificate(Object x509Base64Certificate) {
            this.x509Base64Certificate = x509Base64Certificate;
            this.__explicitlySet__.add("x509Base64Certificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppCertificates build() {
            AppCertificates model =
                    new AppCertificates(
                            this.certAlias,
                            this.sha1Thumbprint,
                            this.kid,
                            this.x5t,
                            this.x509Base64Certificate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppCertificates model) {
            if (model.wasPropertyExplicitlySet("certAlias")) {
                this.certAlias(model.getCertAlias());
            }
            if (model.wasPropertyExplicitlySet("sha1Thumbprint")) {
                this.sha1Thumbprint(model.getSha1Thumbprint());
            }
            if (model.wasPropertyExplicitlySet("kid")) {
                this.kid(model.getKid());
            }
            if (model.wasPropertyExplicitlySet("x5t")) {
                this.x5t(model.getX5t());
            }
            if (model.wasPropertyExplicitlySet("x509Base64Certificate")) {
                this.x509Base64Certificate(model.getX509Base64Certificate());
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
     * Certificate alias
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certAlias")
    private final String certAlias;

    /**
     * Certificate alias
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: always - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getCertAlias() {
        return certAlias;
    }

    /**
     * sha1Thumbprint
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sha1Thumbprint")
    private final String sha1Thumbprint;

    /**
     * sha1Thumbprint
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getSha1Thumbprint() {
        return sha1Thumbprint;
    }

    /**
     * Certificate kid
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kid")
    private final String kid;

    /**
     * Certificate kid
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getKid() {
        return kid;
    }

    /**
     * Certificate x5t
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("x5t")
    private final String x5t;

    /**
     * Certificate x5t
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getX5t() {
        return x5t;
    }

    /**
     * Base-64-encoded certificate.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: binary - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("x509Base64Certificate")
    private final Object x509Base64Certificate;

    /**
     * Base-64-encoded certificate.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: binary - uniqueness: none
     *
     * @return the value
     */
    public Object getX509Base64Certificate() {
        return x509Base64Certificate;
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
        sb.append("AppCertificates(");
        sb.append("super=").append(super.toString());
        sb.append("certAlias=").append(String.valueOf(this.certAlias));
        sb.append(", sha1Thumbprint=").append(String.valueOf(this.sha1Thumbprint));
        sb.append(", kid=").append(String.valueOf(this.kid));
        sb.append(", x5t=").append(String.valueOf(this.x5t));
        sb.append(", x509Base64Certificate=").append(String.valueOf(this.x509Base64Certificate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppCertificates)) {
            return false;
        }

        AppCertificates other = (AppCertificates) o;
        return java.util.Objects.equals(this.certAlias, other.certAlias)
                && java.util.Objects.equals(this.sha1Thumbprint, other.sha1Thumbprint)
                && java.util.Objects.equals(this.kid, other.kid)
                && java.util.Objects.equals(this.x5t, other.x5t)
                && java.util.Objects.equals(this.x509Base64Certificate, other.x509Base64Certificate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.certAlias == null ? 43 : this.certAlias.hashCode());
        result =
                (result * PRIME)
                        + (this.sha1Thumbprint == null ? 43 : this.sha1Thumbprint.hashCode());
        result = (result * PRIME) + (this.kid == null ? 43 : this.kid.hashCode());
        result = (result * PRIME) + (this.x5t == null ? 43 : this.x5t.hashCode());
        result =
                (result * PRIME)
                        + (this.x509Base64Certificate == null
                                ? 43
                                : this.x509Base64Certificate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
