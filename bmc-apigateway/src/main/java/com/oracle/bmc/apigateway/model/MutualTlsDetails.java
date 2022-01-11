/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Properties used to configure client mTLS verification when API Consumer makes connection to the gateway.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MutualTlsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MutualTlsDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isVerifiedCertificateRequired")
        private Boolean isVerifiedCertificateRequired;

        public Builder isVerifiedCertificateRequired(Boolean isVerifiedCertificateRequired) {
            this.isVerifiedCertificateRequired = isVerifiedCertificateRequired;
            this.__explicitlySet__.add("isVerifiedCertificateRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedSans")
        private java.util.List<String> allowedSans;

        public Builder allowedSans(java.util.List<String> allowedSans) {
            this.allowedSans = allowedSans;
            this.__explicitlySet__.add("allowedSans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MutualTlsDetails build() {
            MutualTlsDetails __instance__ =
                    new MutualTlsDetails(isVerifiedCertificateRequired, allowedSans);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MutualTlsDetails o) {
            Builder copiedBuilder =
                    isVerifiedCertificateRequired(o.getIsVerifiedCertificateRequired())
                            .allowedSans(o.getAllowedSans());

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

    /**
     * Determines whether to enable client verification when API Consumer makes connection to the gateway.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVerifiedCertificateRequired")
    Boolean isVerifiedCertificateRequired;

    /**
     * Allowed list of CN or SAN which will be used for verification of certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedSans")
    java.util.List<String> allowedSans;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
