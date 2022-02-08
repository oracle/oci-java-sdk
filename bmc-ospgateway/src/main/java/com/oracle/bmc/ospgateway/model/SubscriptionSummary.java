/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Subscription object which contains the common subscription data.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscriptionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SubscriptionSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionPlanNumber")
        private String subscriptionPlanNumber;

        public Builder subscriptionPlanNumber(String subscriptionPlanNumber) {
            this.subscriptionPlanNumber = subscriptionPlanNumber;
            this.__explicitlySet__.add("subscriptionPlanNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private PlanType planType;

        public Builder planType(PlanType planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctSiteId")
        private String shipToCustAcctSiteId;

        public Builder shipToCustAcctSiteId(String shipToCustAcctSiteId) {
            this.shipToCustAcctSiteId = shipToCustAcctSiteId;
            this.__explicitlySet__.add("shipToCustAcctSiteId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctRoleId")
        private String shipToCustAcctRoleId;

        public Builder shipToCustAcctRoleId(String shipToCustAcctRoleId) {
            this.shipToCustAcctRoleId = shipToCustAcctRoleId;
            this.__explicitlySet__.add("shipToCustAcctRoleId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToCustAccountId")
        private String billToCustAccountId;

        public Builder billToCustAccountId(String billToCustAccountId) {
            this.billToCustAccountId = billToCustAccountId;
            this.__explicitlySet__.add("billToCustAccountId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
        private Boolean isIntentToPay;

        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = isIntentToPay;
            this.__explicitlySet__.add("isIntentToPay");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gsiOrgCode")
        private String gsiOrgCode;

        public Builder gsiOrgCode(String gsiOrgCode) {
            this.gsiOrgCode = gsiOrgCode;
            this.__explicitlySet__.add("gsiOrgCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organizationId")
        private String organizationId;

        public Builder organizationId(String organizationId) {
            this.organizationId = organizationId;
            this.__explicitlySet__.add("organizationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upgradeState")
        private UpgradeState upgradeState;

        public Builder upgradeState(UpgradeState upgradeState) {
            this.upgradeState = upgradeState;
            this.__explicitlySet__.add("upgradeState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("upgradeStateDetails")
        private UpgradeStateDetails upgradeStateDetails;

        public Builder upgradeStateDetails(UpgradeStateDetails upgradeStateDetails) {
            this.upgradeStateDetails = upgradeStateDetails;
            this.__explicitlySet__.add("upgradeStateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taxInfo")
        private TaxInfo taxInfo;

        public Builder taxInfo(TaxInfo taxInfo) {
            this.taxInfo = taxInfo;
            this.__explicitlySet__.add("taxInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paymentOptions")
        private java.util.List<PaymentOption> paymentOptions;

        public Builder paymentOptions(java.util.List<PaymentOption> paymentOptions) {
            this.paymentOptions = paymentOptions;
            this.__explicitlySet__.add("paymentOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paymentGateway")
        private PaymentGateway paymentGateway;

        public Builder paymentGateway(PaymentGateway paymentGateway) {
            this.paymentGateway = paymentGateway;
            this.__explicitlySet__.add("paymentGateway");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billingAddress")
        private BillingAddress billingAddress;

        public Builder billingAddress(BillingAddress billingAddress) {
            this.billingAddress = billingAddress;
            this.__explicitlySet__.add("billingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePlanUpgrade")
        private java.util.Date timePlanUpgrade;

        public Builder timePlanUpgrade(java.util.Date timePlanUpgrade) {
            this.timePlanUpgrade = timePlanUpgrade;
            this.__explicitlySet__.add("timePlanUpgrade");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSummary build() {
            SubscriptionSummary __instance__ =
                    new SubscriptionSummary(
                            id,
                            subscriptionPlanNumber,
                            planType,
                            timeStart,
                            shipToCustAcctSiteId,
                            shipToCustAcctRoleId,
                            billToCustAccountId,
                            isIntentToPay,
                            currencyCode,
                            gsiOrgCode,
                            languageCode,
                            organizationId,
                            upgradeState,
                            upgradeStateDetails,
                            taxInfo,
                            paymentOptions,
                            paymentGateway,
                            billingAddress,
                            timePlanUpgrade);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .subscriptionPlanNumber(o.getSubscriptionPlanNumber())
                            .planType(o.getPlanType())
                            .timeStart(o.getTimeStart())
                            .shipToCustAcctSiteId(o.getShipToCustAcctSiteId())
                            .shipToCustAcctRoleId(o.getShipToCustAcctRoleId())
                            .billToCustAccountId(o.getBillToCustAccountId())
                            .isIntentToPay(o.getIsIntentToPay())
                            .currencyCode(o.getCurrencyCode())
                            .gsiOrgCode(o.getGsiOrgCode())
                            .languageCode(o.getLanguageCode())
                            .organizationId(o.getOrganizationId())
                            .upgradeState(o.getUpgradeState())
                            .upgradeStateDetails(o.getUpgradeStateDetails())
                            .taxInfo(o.getTaxInfo())
                            .paymentOptions(o.getPaymentOptions())
                            .paymentGateway(o.getPaymentGateway())
                            .billingAddress(o.getBillingAddress())
                            .timePlanUpgrade(o.getTimePlanUpgrade());

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
     * Subscription id identifier (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Subscription plan number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionPlanNumber")
    String subscriptionPlanNumber;
    /**
     * Subscription plan type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PlanType {
        FreeTier("FREE_TIER"),
        Payg("PAYG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PlanType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlanType v : PlanType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlanType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlanType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlanType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Subscription plan type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    PlanType planType;

    /**
     * Start date of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    java.util.Date timeStart;

    /**
     * Ship to customer account site address id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctSiteId")
    String shipToCustAcctSiteId;

    /**
     * Ship to customer account role.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctRoleId")
    String shipToCustAcctRoleId;

    /**
     * Bill to customer Account id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billToCustAccountId")
    String billToCustAccountId;

    /**
     * Payment intension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    Boolean isIntentToPay;

    /**
     * Currency code
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    String currencyCode;

    /**
     * GSI Subscription external code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gsiOrgCode")
    String gsiOrgCode;

    /**
     * Language short code (en, de, hu, etc)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    String languageCode;

    /**
     * GSI organization external identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationId")
    String organizationId;
    /**
     * Status of the upgrade.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum UpgradeState {
        Promo("PROMO"),
        Submitted("SUBMITTED"),
        Error("ERROR"),
        Upgraded("UPGRADED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, UpgradeState> map;

        static {
            map = new java.util.HashMap<>();
            for (UpgradeState v : UpgradeState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpgradeState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpgradeState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpgradeState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the upgrade.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeState")
    UpgradeState upgradeState;
    /**
     * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure caused by interfacing Tax details- TaxError)
     **/
    @lombok.extern.slf4j.Slf4j
    public enum UpgradeStateDetails {
        TaxError("TAX_ERROR"),
        UpgradeError("UPGRADE_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, UpgradeStateDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (UpgradeStateDetails v : UpgradeStateDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UpgradeStateDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UpgradeStateDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UpgradeStateDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure caused by interfacing Tax details- TaxError)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeStateDetails")
    UpgradeStateDetails upgradeStateDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("taxInfo")
    TaxInfo taxInfo;

    /**
     * Payment option list of a subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentOptions")
    java.util.List<PaymentOption> paymentOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("paymentGateway")
    PaymentGateway paymentGateway;

    @com.fasterxml.jackson.annotation.JsonProperty("billingAddress")
    BillingAddress billingAddress;

    /**
     * Date of upgrade/conversion when planType changed from FREE_TIER to PAYG
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePlanUpgrade")
    java.util.Date timePlanUpgrade;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
