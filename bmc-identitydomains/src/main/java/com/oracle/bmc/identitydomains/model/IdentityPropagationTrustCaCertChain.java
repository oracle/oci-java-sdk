/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Certificate trust store. This is required if identity propagation type is X509.
 *
 * <p>*Added In:** 2508041610
 *
 * <p>*SCIM++ Properties:** - caseExact: true - type: complex - multiValued: false - required: false
 * - mutability: readWrite - returned: default - uniqueness: none <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IdentityPropagationTrustCaCertChain.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IdentityPropagationTrustCaCertChain
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rootCAs", "intermediateCAs"})
    public IdentityPropagationTrustCaCertChain(
            java.util.List<String> rootCAs, java.util.List<String> intermediateCAs) {
        super();
        this.rootCAs = rootCAs;
        this.intermediateCAs = intermediateCAs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of PEM-encoded root CA certificates.
         *
         * <p>*Added In:** 2508041610
         *
         * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
         * true - mutability: readWrite - returned: default - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rootCAs")
        private java.util.List<String> rootCAs;

        /**
         * A list of PEM-encoded root CA certificates.
         *
         * <p>*Added In:** 2508041610
         *
         * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
         * true - mutability: readWrite - returned: default - uniqueness: none
         *
         * @param rootCAs the value to set
         * @return this builder
         */
        public Builder rootCAs(java.util.List<String> rootCAs) {
            this.rootCAs = rootCAs;
            this.__explicitlySet__.add("rootCAs");
            return this;
        }
        /**
         * A list of PEM-encoded intermediate CA certificates.
         *
         * <p>*Added In:** 2508041610
         *
         * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
         * false - mutability: readWrite - returned: default - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("intermediateCAs")
        private java.util.List<String> intermediateCAs;

        /**
         * A list of PEM-encoded intermediate CA certificates.
         *
         * <p>*Added In:** 2508041610
         *
         * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
         * false - mutability: readWrite - returned: default - uniqueness: none
         *
         * @param intermediateCAs the value to set
         * @return this builder
         */
        public Builder intermediateCAs(java.util.List<String> intermediateCAs) {
            this.intermediateCAs = intermediateCAs;
            this.__explicitlySet__.add("intermediateCAs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdentityPropagationTrustCaCertChain build() {
            IdentityPropagationTrustCaCertChain model =
                    new IdentityPropagationTrustCaCertChain(this.rootCAs, this.intermediateCAs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdentityPropagationTrustCaCertChain model) {
            if (model.wasPropertyExplicitlySet("rootCAs")) {
                this.rootCAs(model.getRootCAs());
            }
            if (model.wasPropertyExplicitlySet("intermediateCAs")) {
                this.intermediateCAs(model.getIntermediateCAs());
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
     * A list of PEM-encoded root CA certificates.
     *
     * <p>*Added In:** 2508041610
     *
     * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
     * true - mutability: readWrite - returned: default - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rootCAs")
    private final java.util.List<String> rootCAs;

    /**
     * A list of PEM-encoded root CA certificates.
     *
     * <p>*Added In:** 2508041610
     *
     * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
     * true - mutability: readWrite - returned: default - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getRootCAs() {
        return rootCAs;
    }

    /**
     * A list of PEM-encoded intermediate CA certificates.
     *
     * <p>*Added In:** 2508041610
     *
     * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
     * false - mutability: readWrite - returned: default - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("intermediateCAs")
    private final java.util.List<String> intermediateCAs;

    /**
     * A list of PEM-encoded intermediate CA certificates.
     *
     * <p>*Added In:** 2508041610
     *
     * <p>*SCIM++ Properties:** - caseExact: true - type: string - multiValued: true - required:
     * false - mutability: readWrite - returned: default - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<String> getIntermediateCAs() {
        return intermediateCAs;
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
        sb.append("IdentityPropagationTrustCaCertChain(");
        sb.append("super=").append(super.toString());
        sb.append("rootCAs=").append(String.valueOf(this.rootCAs));
        sb.append(", intermediateCAs=").append(String.valueOf(this.intermediateCAs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IdentityPropagationTrustCaCertChain)) {
            return false;
        }

        IdentityPropagationTrustCaCertChain other = (IdentityPropagationTrustCaCertChain) o;
        return java.util.Objects.equals(this.rootCAs, other.rootCAs)
                && java.util.Objects.equals(this.intermediateCAs, other.intermediateCAs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rootCAs == null ? 43 : this.rootCAs.hashCode());
        result =
                (result * PRIME)
                        + (this.intermediateCAs == null ? 43 : this.intermediateCAs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
