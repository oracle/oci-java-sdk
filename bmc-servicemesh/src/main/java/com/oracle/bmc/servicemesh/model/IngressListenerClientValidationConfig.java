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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IngressListenerClientValidationConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class IngressListenerClientValidationConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("trustedCaBundle")
        private CaBundle trustedCaBundle;

        public Builder trustedCaBundle(CaBundle trustedCaBundle) {
            this.trustedCaBundle = trustedCaBundle;
            this.__explicitlySet__.add("trustedCaBundle");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternateNames")
        private java.util.List<String> subjectAlternateNames;

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

    @com.fasterxml.jackson.annotation.JsonProperty("trustedCaBundle")
    CaBundle trustedCaBundle;

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternateNames")
    java.util.List<String> subjectAlternateNames;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
