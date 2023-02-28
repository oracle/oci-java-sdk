/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Properties used to configure client mTLS verification when API Consumer makes connection to the
 * gateway. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MutualTlsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MutualTlsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isVerifiedCertificateRequired", "allowedSans"})
    public MutualTlsDetails(
            Boolean isVerifiedCertificateRequired, java.util.List<String> allowedSans) {
        super();
        this.isVerifiedCertificateRequired = isVerifiedCertificateRequired;
        this.allowedSans = allowedSans;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Determines whether to enable client verification when API Consumer makes connection to
         * the gateway.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isVerifiedCertificateRequired")
        private Boolean isVerifiedCertificateRequired;

        /**
         * Determines whether to enable client verification when API Consumer makes connection to
         * the gateway.
         *
         * @param isVerifiedCertificateRequired the value to set
         * @return this builder
         */
        public Builder isVerifiedCertificateRequired(Boolean isVerifiedCertificateRequired) {
            this.isVerifiedCertificateRequired = isVerifiedCertificateRequired;
            this.__explicitlySet__.add("isVerifiedCertificateRequired");
            return this;
        }
        /** Allowed list of CN or SAN which will be used for verification of certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("allowedSans")
        private java.util.List<String> allowedSans;

        /**
         * Allowed list of CN or SAN which will be used for verification of certificate.
         *
         * @param allowedSans the value to set
         * @return this builder
         */
        public Builder allowedSans(java.util.List<String> allowedSans) {
            this.allowedSans = allowedSans;
            this.__explicitlySet__.add("allowedSans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MutualTlsDetails build() {
            MutualTlsDetails model =
                    new MutualTlsDetails(this.isVerifiedCertificateRequired, this.allowedSans);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MutualTlsDetails model) {
            if (model.wasPropertyExplicitlySet("isVerifiedCertificateRequired")) {
                this.isVerifiedCertificateRequired(model.getIsVerifiedCertificateRequired());
            }
            if (model.wasPropertyExplicitlySet("allowedSans")) {
                this.allowedSans(model.getAllowedSans());
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
     * Determines whether to enable client verification when API Consumer makes connection to the
     * gateway.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isVerifiedCertificateRequired")
    private final Boolean isVerifiedCertificateRequired;

    /**
     * Determines whether to enable client verification when API Consumer makes connection to the
     * gateway.
     *
     * @return the value
     */
    public Boolean getIsVerifiedCertificateRequired() {
        return isVerifiedCertificateRequired;
    }

    /** Allowed list of CN or SAN which will be used for verification of certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("allowedSans")
    private final java.util.List<String> allowedSans;

    /**
     * Allowed list of CN or SAN which will be used for verification of certificate.
     *
     * @return the value
     */
    public java.util.List<String> getAllowedSans() {
        return allowedSans;
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
        sb.append("MutualTlsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isVerifiedCertificateRequired=")
                .append(String.valueOf(this.isVerifiedCertificateRequired));
        sb.append(", allowedSans=").append(String.valueOf(this.allowedSans));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MutualTlsDetails)) {
            return false;
        }

        MutualTlsDetails other = (MutualTlsDetails) o;
        return java.util.Objects.equals(
                        this.isVerifiedCertificateRequired, other.isVerifiedCertificateRequired)
                && java.util.Objects.equals(this.allowedSans, other.allowedSans)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isVerifiedCertificateRequired == null
                                ? 43
                                : this.isVerifiedCertificateRequired.hashCode());
        result = (result * PRIME) + (this.allowedSans == null ? 43 : this.allowedSans.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
