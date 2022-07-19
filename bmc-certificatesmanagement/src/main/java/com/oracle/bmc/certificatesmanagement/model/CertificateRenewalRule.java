/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * A rule that imposes constraints on certificate renewal.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateRenewalRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateRenewalRule extends CertificateRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A property specifying how often, in days, a certificate should be renewed.
         * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("renewalInterval")
        private String renewalInterval;

        /**
         * A property specifying how often, in days, a certificate should be renewed.
         * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         *
         * @param renewalInterval the value to set
         * @return this builder
         **/
        public Builder renewalInterval(String renewalInterval) {
            this.renewalInterval = renewalInterval;
            this.__explicitlySet__.add("renewalInterval");
            return this;
        }
        /**
         * A property specifying the period of time, in days, before the certificate's targeted renewal that the process should occur.
         * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("advanceRenewalPeriod")
        private String advanceRenewalPeriod;

        /**
         * A property specifying the period of time, in days, before the certificate's targeted renewal that the process should occur.
         * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
         *
         * @param advanceRenewalPeriod the value to set
         * @return this builder
         **/
        public Builder advanceRenewalPeriod(String advanceRenewalPeriod) {
            this.advanceRenewalPeriod = advanceRenewalPeriod;
            this.__explicitlySet__.add("advanceRenewalPeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateRenewalRule build() {
            CertificateRenewalRule __instance__ =
                    new CertificateRenewalRule(renewalInterval, advanceRenewalPeriod);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateRenewalRule o) {
            Builder copiedBuilder =
                    renewalInterval(o.getRenewalInterval())
                            .advanceRenewalPeriod(o.getAdvanceRenewalPeriod());

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

    @Deprecated
    public CertificateRenewalRule(String renewalInterval, String advanceRenewalPeriod) {
        super();
        this.renewalInterval = renewalInterval;
        this.advanceRenewalPeriod = advanceRenewalPeriod;
    }

    /**
     * A property specifying how often, in days, a certificate should be renewed.
     * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("renewalInterval")
    private final String renewalInterval;

    /**
     * A property specifying how often, in days, a certificate should be renewed.
     * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
     *
     * @return the value
     **/
    public String getRenewalInterval() {
        return renewalInterval;
    }

    /**
     * A property specifying the period of time, in days, before the certificate's targeted renewal that the process should occur.
     * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("advanceRenewalPeriod")
    private final String advanceRenewalPeriod;

    /**
     * A property specifying the period of time, in days, before the certificate's targeted renewal that the process should occur.
     * Expressed in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601#Time_intervals) format.
     *
     * @return the value
     **/
    public String getAdvanceRenewalPeriod() {
        return advanceRenewalPeriod;
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
        sb.append("CertificateRenewalRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", renewalInterval=").append(String.valueOf(this.renewalInterval));
        sb.append(", advanceRenewalPeriod=").append(String.valueOf(this.advanceRenewalPeriod));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateRenewalRule)) {
            return false;
        }

        CertificateRenewalRule other = (CertificateRenewalRule) o;
        return java.util.Objects.equals(this.renewalInterval, other.renewalInterval)
                && java.util.Objects.equals(this.advanceRenewalPeriod, other.advanceRenewalPeriod)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.renewalInterval == null ? 43 : this.renewalInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.advanceRenewalPeriod == null
                                ? 43
                                : this.advanceRenewalPeriod.hashCode());
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
