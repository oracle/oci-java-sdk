/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Additional JWT validation checks. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AdditionalValidationPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AdditionalValidationPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"issuers", "audiences", "verifyClaims"})
    public AdditionalValidationPolicy(
            java.util.List<String> issuers,
            java.util.List<String> audiences,
            java.util.List<JsonWebTokenClaim> verifyClaims) {
        super();
        this.issuers = issuers;
        this.audiences = audiences;
        this.verifyClaims = verifyClaims;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A list of parties that could have issued the token. */
        @com.fasterxml.jackson.annotation.JsonProperty("issuers")
        private java.util.List<String> issuers;

        /**
         * A list of parties that could have issued the token.
         *
         * @param issuers the value to set
         * @return this builder
         */
        public Builder issuers(java.util.List<String> issuers) {
            this.issuers = issuers;
            this.__explicitlySet__.add("issuers");
            return this;
        }
        /** The list of intended recipients for the token. */
        @com.fasterxml.jackson.annotation.JsonProperty("audiences")
        private java.util.List<String> audiences;

        /**
         * The list of intended recipients for the token.
         *
         * @param audiences the value to set
         * @return this builder
         */
        public Builder audiences(java.util.List<String> audiences) {
            this.audiences = audiences;
            this.__explicitlySet__.add("audiences");
            return this;
        }
        /** A list of claims which should be validated to consider the token valid. */
        @com.fasterxml.jackson.annotation.JsonProperty("verifyClaims")
        private java.util.List<JsonWebTokenClaim> verifyClaims;

        /**
         * A list of claims which should be validated to consider the token valid.
         *
         * @param verifyClaims the value to set
         * @return this builder
         */
        public Builder verifyClaims(java.util.List<JsonWebTokenClaim> verifyClaims) {
            this.verifyClaims = verifyClaims;
            this.__explicitlySet__.add("verifyClaims");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalValidationPolicy build() {
            AdditionalValidationPolicy model =
                    new AdditionalValidationPolicy(this.issuers, this.audiences, this.verifyClaims);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalValidationPolicy model) {
            if (model.wasPropertyExplicitlySet("issuers")) {
                this.issuers(model.getIssuers());
            }
            if (model.wasPropertyExplicitlySet("audiences")) {
                this.audiences(model.getAudiences());
            }
            if (model.wasPropertyExplicitlySet("verifyClaims")) {
                this.verifyClaims(model.getVerifyClaims());
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

    /** A list of parties that could have issued the token. */
    @com.fasterxml.jackson.annotation.JsonProperty("issuers")
    private final java.util.List<String> issuers;

    /**
     * A list of parties that could have issued the token.
     *
     * @return the value
     */
    public java.util.List<String> getIssuers() {
        return issuers;
    }

    /** The list of intended recipients for the token. */
    @com.fasterxml.jackson.annotation.JsonProperty("audiences")
    private final java.util.List<String> audiences;

    /**
     * The list of intended recipients for the token.
     *
     * @return the value
     */
    public java.util.List<String> getAudiences() {
        return audiences;
    }

    /** A list of claims which should be validated to consider the token valid. */
    @com.fasterxml.jackson.annotation.JsonProperty("verifyClaims")
    private final java.util.List<JsonWebTokenClaim> verifyClaims;

    /**
     * A list of claims which should be validated to consider the token valid.
     *
     * @return the value
     */
    public java.util.List<JsonWebTokenClaim> getVerifyClaims() {
        return verifyClaims;
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
        sb.append("AdditionalValidationPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("issuers=").append(String.valueOf(this.issuers));
        sb.append(", audiences=").append(String.valueOf(this.audiences));
        sb.append(", verifyClaims=").append(String.valueOf(this.verifyClaims));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalValidationPolicy)) {
            return false;
        }

        AdditionalValidationPolicy other = (AdditionalValidationPolicy) o;
        return java.util.Objects.equals(this.issuers, other.issuers)
                && java.util.Objects.equals(this.audiences, other.audiences)
                && java.util.Objects.equals(this.verifyClaims, other.verifyClaims)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.issuers == null ? 43 : this.issuers.hashCode());
        result = (result * PRIME) + (this.audiences == null ? 43 : this.audiences.hashCode());
        result = (result * PRIME) + (this.verifyClaims == null ? 43 : this.verifyClaims.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
