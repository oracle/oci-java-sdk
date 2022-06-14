/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicemesh.model;

/**
 * Resource representing the TLS configuration used for validating client certificates.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressListenerClientValidationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IngressListenerClientValidationConfig {
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
         * A list of alternate names to verify the subject identity in the certificate presented by the client.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternateNames")
        private java.util.List<String> subjectAlternateNames;

        /**
         * A list of alternate names to verify the subject identity in the certificate presented by the client.
         *
         * @param subjectAlternateNames the value to set
         * @return this builder
         **/
        public Builder subjectAlternateNames(java.util.List<String> subjectAlternateNames) {
            this.subjectAlternateNames = subjectAlternateNames;
            this.__explicitlySet__.add("subjectAlternateNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IngressListenerClientValidationConfig build() {
            IngressListenerClientValidationConfig __instance__ =
                    new IngressListenerClientValidationConfig(
                            trustedCaBundle, subjectAlternateNames);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IngressListenerClientValidationConfig o) {
            Builder copiedBuilder =
                    trustedCaBundle(o.getTrustedCaBundle())
                            .subjectAlternateNames(o.getSubjectAlternateNames());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @com.fasterxml.jackson.annotation.JsonProperty("trustedCaBundle")
    private final CaBundle trustedCaBundle;

    public CaBundle getTrustedCaBundle() {
        return trustedCaBundle;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternateNames")
    private final java.util.List<String> subjectAlternateNames;

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     *
     * @return the value
     **/
    public java.util.List<String> getSubjectAlternateNames() {
        return subjectAlternateNames;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IngressListenerClientValidationConfig(");
        sb.append("trustedCaBundle=").append(String.valueOf(this.trustedCaBundle));
        sb.append(", subjectAlternateNames=").append(String.valueOf(this.subjectAlternateNames));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
