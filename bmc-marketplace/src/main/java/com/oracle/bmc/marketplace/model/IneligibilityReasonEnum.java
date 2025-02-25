/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Possible values of on why a tenant cannot launch a listing
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
public enum IneligibilityReasonEnum {
    IneligibleAccountCountry("INELIGIBLE_ACCOUNT_COUNTRY"),
    IneligibleRegion("INELIGIBLE_REGION"),
    IneligibleAccountBlacklisted("INELIGIBLE_ACCOUNT_BLACKLISTED"),
    IneligibleAccountFeatureDisabled("INELIGIBLE_ACCOUNT_FEATURE_DISABLED"),
    IneligibleAccountCurrency("INELIGIBLE_ACCOUNT_CURRENCY"),
    IneligibleAccountNotPaid("INELIGIBLE_ACCOUNT_NOT_PAID"),
    IneligibleAccountInternal("INELIGIBLE_ACCOUNT_INTERNAL"),
    IneligibleAccountGovSubscription("INELIGIBLE_ACCOUNT_GOV_SUBSCRIPTION"),
    IneligiblePaidListingThrottled("INELIGIBLE_PAID_LISTING_THROTTLED"),
    IneligibleAccountNotAvailable("INELIGIBLE_ACCOUNT_NOT_AVAILABLE"),
    IneligibleAccountNotMonthlyInclusive("INELIGIBLE_ACCOUNT_NOT_MONTHLY_INCLUSIVE"),
    ImageMetaDataSo("IMAGE_META_DATA_SO"),
    IneligibleAccountTenancyNotAllowedAccessImage(
            "INELIGIBLE_ACCOUNT_TENANCY_NOT_ALLOWED_ACCESS_IMAGE"),
    IneligibleAccountGovLaunchNonGovListing("INELIGIBLE_ACCOUNT_GOV_LAUNCH_NON_GOV_LISTING"),
    AgreementNotAccepted("AGREEMENT_NOT_ACCEPTED"),
    NotAuthorized("NOT_AUTHORIZED"),
    Eligible("ELIGIBLE"),

    /**
     * This value is used if a service returns a value for this enum that is not recognized by this
     * version of the SDK.
     */
    UnknownEnumValue(null);

    private static final org.slf4j.Logger LOG =
            org.slf4j.LoggerFactory.getLogger(IneligibilityReasonEnum.class);

    private final String value;
    private static java.util.Map<String, IneligibilityReasonEnum> map;

    static {
        map = new java.util.HashMap<>();
        for (IneligibilityReasonEnum v : IneligibilityReasonEnum.values()) {
            if (v != UnknownEnumValue) {
                map.put(v.getValue(), v);
            }
        }
    }

    IneligibilityReasonEnum(String value) {
        this.value = value;
    }

    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() {
        return value;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    public static IneligibilityReasonEnum create(String key) {
        if (map.containsKey(key)) {
            return map.get(key);
        }
        LOG.warn(
                "Received unknown value '{}' for enum 'IneligibilityReasonEnum', returning UnknownEnumValue",
                key);
        return UnknownEnumValue;
    }
}
