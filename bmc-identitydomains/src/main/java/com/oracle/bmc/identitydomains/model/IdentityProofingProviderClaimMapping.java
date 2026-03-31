/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Configure the verification claims and idcs attribute mapping.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IdentityProofingProviderClaimMapping.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IdentityProofingProviderClaimMapping
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"verifiableClaim", "attrMatch"})
    public IdentityProofingProviderClaimMapping(String verifiableClaim, String attrMatch) {
        super();
        this.verifiableClaim = verifiableClaim;
        this.attrMatch = attrMatch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Verifiable Claims.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("verifiableClaim")
        private String verifiableClaim;

        /**
         * Verifiable Claims.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param verifiableClaim the value to set
         * @return this builder
         **/
        public Builder verifiableClaim(String verifiableClaim) {
            this.verifiableClaim = verifiableClaim;
            this.__explicitlySet__.add("verifiableClaim");
            return this;
        }
        /**
         * Matching attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attrMatch")
        private String attrMatch;

        /**
         * Matching attribute.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: true
         *  - returned: default
         *  - type: string
         *  - uniqueness: none
         * @param attrMatch the value to set
         * @return this builder
         **/
        public Builder attrMatch(String attrMatch) {
            this.attrMatch = attrMatch;
            this.__explicitlySet__.add("attrMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityProofingProviderClaimMapping build() {
            IdentityProofingProviderClaimMapping model =
                    new IdentityProofingProviderClaimMapping(this.verifiableClaim, this.attrMatch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityProofingProviderClaimMapping model) {
            if (model.wasPropertyExplicitlySet("verifiableClaim")) {
                this.verifiableClaim(model.getVerifiableClaim());
            }
            if (model.wasPropertyExplicitlySet("attrMatch")) {
                this.attrMatch(model.getAttrMatch());
            }
            return this;
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

    /**
     * Verifiable Claims.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verifiableClaim")
    private final String verifiableClaim;

    /**
     * Verifiable Claims.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getVerifiableClaim() {
        return verifiableClaim;
    }

    /**
     * Matching attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attrMatch")
    private final String attrMatch;

    /**
     * Matching attribute.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: true
     *  - returned: default
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAttrMatch() {
        return attrMatch;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IdentityProofingProviderClaimMapping(");
        sb.append("super=").append(super.toString());
        sb.append("verifiableClaim=").append(String.valueOf(this.verifiableClaim));
        sb.append(", attrMatch=").append(String.valueOf(this.attrMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityProofingProviderClaimMapping)) {
            return false;
        }

        IdentityProofingProviderClaimMapping other = (IdentityProofingProviderClaimMapping) o;
        return java.util.Objects.equals(this.verifiableClaim, other.verifiableClaim)
                && java.util.Objects.equals(this.attrMatch, other.attrMatch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.verifiableClaim == null ? 43 : this.verifiableClaim.hashCode());
        result = (result * PRIME) + (this.attrMatch == null ? 43 : this.attrMatch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
