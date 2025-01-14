/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Tenant eligibility for using third party paid listings <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ThirdPartyPaidListingEligibility.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ThirdPartyPaidListingEligibility
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isPaidListingEligible",
        "isPaidListingThrottled",
        "eligibilityReason"
    })
    public ThirdPartyPaidListingEligibility(
            Boolean isPaidListingEligible,
            Boolean isPaidListingThrottled,
            EligibilityReason eligibilityReason) {
        super();
        this.isPaidListingEligible = isPaidListingEligible;
        this.isPaidListingThrottled = isPaidListingThrottled;
        this.eligibilityReason = eligibilityReason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether the tenant is permitted to use paid listings */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidListingEligible")
        private Boolean isPaidListingEligible;

        /**
         * Whether the tenant is permitted to use paid listings
         *
         * @param isPaidListingEligible the value to set
         * @return this builder
         */
        public Builder isPaidListingEligible(Boolean isPaidListingEligible) {
            this.isPaidListingEligible = isPaidListingEligible;
            this.__explicitlySet__.add("isPaidListingEligible");
            return this;
        }
        /**
         * Whether the tenant is currently prevented from using paid listings because of throttling
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidListingThrottled")
        private Boolean isPaidListingThrottled;

        /**
         * Whether the tenant is currently prevented from using paid listings because of throttling
         *
         * @param isPaidListingThrottled the value to set
         * @return this builder
         */
        public Builder isPaidListingThrottled(Boolean isPaidListingThrottled) {
            this.isPaidListingThrottled = isPaidListingThrottled;
            this.__explicitlySet__.add("isPaidListingThrottled");
            return this;
        }
        /** Reason the account is ineligible to launch paid listings */
        @com.fasterxml.jackson.annotation.JsonProperty("eligibilityReason")
        private EligibilityReason eligibilityReason;

        /**
         * Reason the account is ineligible to launch paid listings
         *
         * @param eligibilityReason the value to set
         * @return this builder
         */
        public Builder eligibilityReason(EligibilityReason eligibilityReason) {
            this.eligibilityReason = eligibilityReason;
            this.__explicitlySet__.add("eligibilityReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ThirdPartyPaidListingEligibility build() {
            ThirdPartyPaidListingEligibility model =
                    new ThirdPartyPaidListingEligibility(
                            this.isPaidListingEligible,
                            this.isPaidListingThrottled,
                            this.eligibilityReason);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ThirdPartyPaidListingEligibility model) {
            if (model.wasPropertyExplicitlySet("isPaidListingEligible")) {
                this.isPaidListingEligible(model.getIsPaidListingEligible());
            }
            if (model.wasPropertyExplicitlySet("isPaidListingThrottled")) {
                this.isPaidListingThrottled(model.getIsPaidListingThrottled());
            }
            if (model.wasPropertyExplicitlySet("eligibilityReason")) {
                this.eligibilityReason(model.getEligibilityReason());
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

    /** Whether the tenant is permitted to use paid listings */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidListingEligible")
    private final Boolean isPaidListingEligible;

    /**
     * Whether the tenant is permitted to use paid listings
     *
     * @return the value
     */
    public Boolean getIsPaidListingEligible() {
        return isPaidListingEligible;
    }

    /** Whether the tenant is currently prevented from using paid listings because of throttling */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidListingThrottled")
    private final Boolean isPaidListingThrottled;

    /**
     * Whether the tenant is currently prevented from using paid listings because of throttling
     *
     * @return the value
     */
    public Boolean getIsPaidListingThrottled() {
        return isPaidListingThrottled;
    }

    /** Reason the account is ineligible to launch paid listings */
    public enum EligibilityReason implements com.oracle.bmc.http.internal.BmcEnum {
        Eligible("ELIGIBLE"),
        IneligibleAccountCountry("INELIGIBLE_ACCOUNT_COUNTRY"),
        IneligibleRegion("INELIGIBLE_REGION"),
        IneligibleAccountBlacklisted("INELIGIBLE_ACCOUNT_BLACKLISTED"),
        IneligibleAccountFeatureDisabled("INELIGIBLE_ACCOUNT_FEATURE_DISABLED"),
        IneligibleAccountCurrency("INELIGIBLE_ACCOUNT_CURRENCY"),
        IneligibleAccountNotPaid("INELIGIBLE_ACCOUNT_NOT_PAID"),
        IneligibleAccountInternal("INELIGIBLE_ACCOUNT_INTERNAL"),
        IneligibleAccountGovSubscription("INELIGIBLE_ACCOUNT_GOV_SUBSCRIPTION"),
        NotAuthorized("NOT_AUTHORIZED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EligibilityReason.class);

        private final String value;
        private static java.util.Map<String, EligibilityReason> map;

        static {
            map = new java.util.HashMap<>();
            for (EligibilityReason v : EligibilityReason.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EligibilityReason(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EligibilityReason create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EligibilityReason', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Reason the account is ineligible to launch paid listings */
    @com.fasterxml.jackson.annotation.JsonProperty("eligibilityReason")
    private final EligibilityReason eligibilityReason;

    /**
     * Reason the account is ineligible to launch paid listings
     *
     * @return the value
     */
    public EligibilityReason getEligibilityReason() {
        return eligibilityReason;
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
        sb.append("ThirdPartyPaidListingEligibility(");
        sb.append("super=").append(super.toString());
        sb.append("isPaidListingEligible=").append(String.valueOf(this.isPaidListingEligible));
        sb.append(", isPaidListingThrottled=").append(String.valueOf(this.isPaidListingThrottled));
        sb.append(", eligibilityReason=").append(String.valueOf(this.eligibilityReason));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ThirdPartyPaidListingEligibility)) {
            return false;
        }

        ThirdPartyPaidListingEligibility other = (ThirdPartyPaidListingEligibility) o;
        return java.util.Objects.equals(this.isPaidListingEligible, other.isPaidListingEligible)
                && java.util.Objects.equals(
                        this.isPaidListingThrottled, other.isPaidListingThrottled)
                && java.util.Objects.equals(this.eligibilityReason, other.eligibilityReason)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPaidListingEligible == null
                                ? 43
                                : this.isPaidListingEligible.hashCode());
        result =
                (result * PRIME)
                        + (this.isPaidListingThrottled == null
                                ? 43
                                : this.isPaidListingThrottled.hashCode());
        result =
                (result * PRIME)
                        + (this.eligibilityReason == null ? 43 : this.eligibilityReason.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
