/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * A rule that enforces how long certificates or certificate authorities (CAs) issued by this
 * particular CA are valid. You must include either or both {@code
 * leafCertificateMaxValidityDuration} and {@code certificateAuthorityMaxValidityDuration}. <br>
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
        builder = CertificateAuthorityIssuanceExpiryRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "ruleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateAuthorityIssuanceExpiryRule extends CertificateAuthorityRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A property indicating the maximum validity duration, in days, of leaf certificates issued
         * by this CA. Expressed in [ISO
         * 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("leafCertificateMaxValidityDuration")
        private String leafCertificateMaxValidityDuration;

        /**
         * A property indicating the maximum validity duration, in days, of leaf certificates issued
         * by this CA. Expressed in [ISO
         * 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         *
         * @param leafCertificateMaxValidityDuration the value to set
         * @return this builder
         */
        public Builder leafCertificateMaxValidityDuration(
                String leafCertificateMaxValidityDuration) {
            this.leafCertificateMaxValidityDuration = leafCertificateMaxValidityDuration;
            this.__explicitlySet__.add("leafCertificateMaxValidityDuration");
            return this;
        }
        /**
         * A property indicating the maximum validity duration, in days, of subordinate CA's issued
         * by this CA. Expressed in [ISO
         * 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityMaxValidityDuration")
        private String certificateAuthorityMaxValidityDuration;

        /**
         * A property indicating the maximum validity duration, in days, of subordinate CA's issued
         * by this CA. Expressed in [ISO
         * 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         *
         * @param certificateAuthorityMaxValidityDuration the value to set
         * @return this builder
         */
        public Builder certificateAuthorityMaxValidityDuration(
                String certificateAuthorityMaxValidityDuration) {
            this.certificateAuthorityMaxValidityDuration = certificateAuthorityMaxValidityDuration;
            this.__explicitlySet__.add("certificateAuthorityMaxValidityDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateAuthorityIssuanceExpiryRule build() {
            CertificateAuthorityIssuanceExpiryRule model =
                    new CertificateAuthorityIssuanceExpiryRule(
                            this.leafCertificateMaxValidityDuration,
                            this.certificateAuthorityMaxValidityDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateAuthorityIssuanceExpiryRule model) {
            if (model.wasPropertyExplicitlySet("leafCertificateMaxValidityDuration")) {
                this.leafCertificateMaxValidityDuration(
                        model.getLeafCertificateMaxValidityDuration());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityMaxValidityDuration")) {
                this.certificateAuthorityMaxValidityDuration(
                        model.getCertificateAuthorityMaxValidityDuration());
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
    public CertificateAuthorityIssuanceExpiryRule(
            String leafCertificateMaxValidityDuration,
            String certificateAuthorityMaxValidityDuration) {
        super();
        this.leafCertificateMaxValidityDuration = leafCertificateMaxValidityDuration;
        this.certificateAuthorityMaxValidityDuration = certificateAuthorityMaxValidityDuration;
    }

    /**
     * A property indicating the maximum validity duration, in days, of leaf certificates issued by
     * this CA. Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals)
     * format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("leafCertificateMaxValidityDuration")
    private final String leafCertificateMaxValidityDuration;

    /**
     * A property indicating the maximum validity duration, in days, of leaf certificates issued by
     * this CA. Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals)
     * format.
     *
     * @return the value
     */
    public String getLeafCertificateMaxValidityDuration() {
        return leafCertificateMaxValidityDuration;
    }

    /**
     * A property indicating the maximum validity duration, in days, of subordinate CA's issued by
     * this CA. Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals)
     * format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityMaxValidityDuration")
    private final String certificateAuthorityMaxValidityDuration;

    /**
     * A property indicating the maximum validity duration, in days, of subordinate CA's issued by
     * this CA. Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals)
     * format.
     *
     * @return the value
     */
    public String getCertificateAuthorityMaxValidityDuration() {
        return certificateAuthorityMaxValidityDuration;
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
        sb.append("CertificateAuthorityIssuanceExpiryRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", leafCertificateMaxValidityDuration=")
                .append(String.valueOf(this.leafCertificateMaxValidityDuration));
        sb.append(", certificateAuthorityMaxValidityDuration=")
                .append(String.valueOf(this.certificateAuthorityMaxValidityDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateAuthorityIssuanceExpiryRule)) {
            return false;
        }

        CertificateAuthorityIssuanceExpiryRule other = (CertificateAuthorityIssuanceExpiryRule) o;
        return java.util.Objects.equals(
                        this.leafCertificateMaxValidityDuration,
                        other.leafCertificateMaxValidityDuration)
                && java.util.Objects.equals(
                        this.certificateAuthorityMaxValidityDuration,
                        other.certificateAuthorityMaxValidityDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.leafCertificateMaxValidityDuration == null
                                ? 43
                                : this.leafCertificateMaxValidityDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityMaxValidityDuration == null
                                ? 43
                                : this.certificateAuthorityMaxValidityDuration.hashCode());
        return result;
    }
}
