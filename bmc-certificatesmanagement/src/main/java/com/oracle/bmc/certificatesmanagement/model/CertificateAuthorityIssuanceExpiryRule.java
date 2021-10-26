/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * A rule that enforces how long certificates or certificate authorities (CAs) issued by this particular CA are valid.
 * You must include either or both {@code leafCertificateMaxValidityDuration} and {@code certificateAuthorityMaxValidityDuration}.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateAuthorityIssuanceExpiryRule.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CertificateAuthorityIssuanceExpiryRule extends CertificateAuthorityRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("leafCertificateMaxValidityDuration")
        private String leafCertificateMaxValidityDuration;

        public Builder leafCertificateMaxValidityDuration(
                String leafCertificateMaxValidityDuration) {
            this.leafCertificateMaxValidityDuration = leafCertificateMaxValidityDuration;
            this.__explicitlySet__.add("leafCertificateMaxValidityDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityMaxValidityDuration")
        private String certificateAuthorityMaxValidityDuration;

        public Builder certificateAuthorityMaxValidityDuration(
                String certificateAuthorityMaxValidityDuration) {
            this.certificateAuthorityMaxValidityDuration = certificateAuthorityMaxValidityDuration;
            this.__explicitlySet__.add("certificateAuthorityMaxValidityDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateAuthorityIssuanceExpiryRule build() {
            CertificateAuthorityIssuanceExpiryRule __instance__ =
                    new CertificateAuthorityIssuanceExpiryRule(
                            leafCertificateMaxValidityDuration,
                            certificateAuthorityMaxValidityDuration);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateAuthorityIssuanceExpiryRule o) {
            Builder copiedBuilder =
                    leafCertificateMaxValidityDuration(o.getLeafCertificateMaxValidityDuration())
                            .certificateAuthorityMaxValidityDuration(
                                    o.getCertificateAuthorityMaxValidityDuration());

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

    @Deprecated
    public CertificateAuthorityIssuanceExpiryRule(
            String leafCertificateMaxValidityDuration,
            String certificateAuthorityMaxValidityDuration) {
        super();
        this.leafCertificateMaxValidityDuration = leafCertificateMaxValidityDuration;
        this.certificateAuthorityMaxValidityDuration = certificateAuthorityMaxValidityDuration;
    }

    /**
     * A property indicating the maximum validity duration, in days, of leaf certificates issued by this CA.
     * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("leafCertificateMaxValidityDuration")
    String leafCertificateMaxValidityDuration;

    /**
     * A property indicating the maximum validity duration, in days, of subordinate CA's issued by this CA.
     * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityMaxValidityDuration")
    String certificateAuthorityMaxValidityDuration;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
