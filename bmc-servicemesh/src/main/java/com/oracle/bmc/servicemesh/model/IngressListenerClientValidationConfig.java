/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Resource representing the TLS configuration used for validating client certificates. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IngressListenerClientValidationConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IngressListenerClientValidationConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"trustedCaBundle", "subjectAlternateNames"})
    public IngressListenerClientValidationConfig(
            CaBundle trustedCaBundle, java.util.List<String> subjectAlternateNames) {
        super();
        this.trustedCaBundle = trustedCaBundle;
        this.subjectAlternateNames = subjectAlternateNames;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("trustedCaBundle")
        private CaBundle trustedCaBundle;

        public Builder trustedCaBundle(CaBundle trustedCaBundle) {
            this.trustedCaBundle = trustedCaBundle;
            this.__explicitlySet__.add("trustedCaBundle");
            return this;
        }
        /**
         * A list of alternate names to verify the subject identity in the certificate presented by
         * the client.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternateNames")
        private java.util.List<String> subjectAlternateNames;

        /**
         * A list of alternate names to verify the subject identity in the certificate presented by
         * the client.
         *
         * @param subjectAlternateNames the value to set
         * @return this builder
         */
        public Builder subjectAlternateNames(java.util.List<String> subjectAlternateNames) {
            this.subjectAlternateNames = subjectAlternateNames;
            this.__explicitlySet__.add("subjectAlternateNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressListenerClientValidationConfig build() {
            IngressListenerClientValidationConfig model =
                    new IngressListenerClientValidationConfig(
                            this.trustedCaBundle, this.subjectAlternateNames);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressListenerClientValidationConfig model) {
            if (model.wasPropertyExplicitlySet("trustedCaBundle")) {
                this.trustedCaBundle(model.getTrustedCaBundle());
            }
            if (model.wasPropertyExplicitlySet("subjectAlternateNames")) {
                this.subjectAlternateNames(model.getSubjectAlternateNames());
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

    @com.fasterxml.jackson.annotation.JsonProperty("trustedCaBundle")
    private final CaBundle trustedCaBundle;

    public CaBundle getTrustedCaBundle() {
        return trustedCaBundle;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the
     * client.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternateNames")
    private final java.util.List<String> subjectAlternateNames;

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the
     * client.
     *
     * @return the value
     */
    public java.util.List<String> getSubjectAlternateNames() {
        return subjectAlternateNames;
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
        sb.append("IngressListenerClientValidationConfig(");
        sb.append("super=").append(super.toString());
        sb.append("trustedCaBundle=").append(String.valueOf(this.trustedCaBundle));
        sb.append(", subjectAlternateNames=").append(String.valueOf(this.subjectAlternateNames));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IngressListenerClientValidationConfig)) {
            return false;
        }

        IngressListenerClientValidationConfig other = (IngressListenerClientValidationConfig) o;
        return java.util.Objects.equals(this.trustedCaBundle, other.trustedCaBundle)
                && java.util.Objects.equals(this.subjectAlternateNames, other.subjectAlternateNames)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.trustedCaBundle == null ? 43 : this.trustedCaBundle.hashCode());
        result =
                (result * PRIME)
                        + (this.subjectAlternateNames == null
                                ? 43
                                : this.subjectAlternateNames.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
