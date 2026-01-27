/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * Issuance rules apply constraints to a certificate authority (CA) to enforce certain conditions
 * regarding the resources it issues. For example, a path length constraint restricts how many
 * subordinate CAs a CA can have. Or, a name constraint on certificate subject names specifies
 * allowable namespaces for the hierarchical name forms in certificates that any CA in the
 * certificate chain issues. You can't update the issuance rules configured for a CA after you
 * create it. <br>
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
        builder = CertificateAuthorityIssuanceRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "ruleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateAuthorityIssuanceRule extends CertificateAuthorityRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of levels of descendants that this certificate authority (CA) can issue. When
         * set to zero, the CA can issue only leaf certificates. There is no limit if the constraint
         * isn't specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pathLengthConstraint")
        private Integer pathLengthConstraint;

        /**
         * The number of levels of descendants that this certificate authority (CA) can issue. When
         * set to zero, the CA can issue only leaf certificates. There is no limit if the constraint
         * isn't specified.
         *
         * @param pathLengthConstraint the value to set
         * @return this builder
         */
        public Builder pathLengthConstraint(Integer pathLengthConstraint) {
            this.pathLengthConstraint = pathLengthConstraint;
            this.__explicitlySet__.add("pathLengthConstraint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nameConstraint")
        private NameConstraint nameConstraint;

        public Builder nameConstraint(NameConstraint nameConstraint) {
            this.nameConstraint = nameConstraint;
            this.__explicitlySet__.add("nameConstraint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateAuthorityIssuanceRule build() {
            CertificateAuthorityIssuanceRule model =
                    new CertificateAuthorityIssuanceRule(
                            this.pathLengthConstraint, this.nameConstraint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateAuthorityIssuanceRule model) {
            if (model.wasPropertyExplicitlySet("pathLengthConstraint")) {
                this.pathLengthConstraint(model.getPathLengthConstraint());
            }
            if (model.wasPropertyExplicitlySet("nameConstraint")) {
                this.nameConstraint(model.getNameConstraint());
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
    public CertificateAuthorityIssuanceRule(
            Integer pathLengthConstraint, NameConstraint nameConstraint) {
        super();
        this.pathLengthConstraint = pathLengthConstraint;
        this.nameConstraint = nameConstraint;
    }

    /**
     * The number of levels of descendants that this certificate authority (CA) can issue. When set
     * to zero, the CA can issue only leaf certificates. There is no limit if the constraint isn't
     * specified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pathLengthConstraint")
    private final Integer pathLengthConstraint;

    /**
     * The number of levels of descendants that this certificate authority (CA) can issue. When set
     * to zero, the CA can issue only leaf certificates. There is no limit if the constraint isn't
     * specified.
     *
     * @return the value
     */
    public Integer getPathLengthConstraint() {
        return pathLengthConstraint;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nameConstraint")
    private final NameConstraint nameConstraint;

    public NameConstraint getNameConstraint() {
        return nameConstraint;
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
        sb.append("CertificateAuthorityIssuanceRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", pathLengthConstraint=").append(String.valueOf(this.pathLengthConstraint));
        sb.append(", nameConstraint=").append(String.valueOf(this.nameConstraint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateAuthorityIssuanceRule)) {
            return false;
        }

        CertificateAuthorityIssuanceRule other = (CertificateAuthorityIssuanceRule) o;
        return java.util.Objects.equals(this.pathLengthConstraint, other.pathLengthConstraint)
                && java.util.Objects.equals(this.nameConstraint, other.nameConstraint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.pathLengthConstraint == null
                                ? 43
                                : this.pathLengthConstraint.hashCode());
        result =
                (result * PRIME)
                        + (this.nameConstraint == null ? 43 : this.nameConstraint.hashCode());
        return result;
    }
}
