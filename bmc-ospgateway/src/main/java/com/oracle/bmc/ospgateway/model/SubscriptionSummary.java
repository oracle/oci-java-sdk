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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscriptionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscriptionSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "subscriptionPlanNumber",
        "planType",
        "timeStart",
        "shipToCustAcctSiteId",
        "shipToCustAcctRoleId",
        "billToCustAccountId",
        "isIntentToPay",
        "currencyCode",
        "gsiOrgCode",
        "languageCode",
        "organizationId",
        "upgradeState",
        "upgradeStateDetails",
        "taxInfo",
        "paymentOptions",
        "paymentGateway",
        "billingAddress",
        "timePlanUpgrade"
    })
    public SubscriptionSummary(
            String id,
            String subscriptionPlanNumber,
            PlanType planType,
            java.util.Date timeStart,
            String shipToCustAcctSiteId,
            String shipToCustAcctRoleId,
            String billToCustAccountId,
            Boolean isIntentToPay,
            String currencyCode,
            String gsiOrgCode,
            String languageCode,
            String organizationId,
            UpgradeState upgradeState,
            UpgradeStateDetails upgradeStateDetails,
            TaxInfo taxInfo,
            java.util.List<PaymentOption> paymentOptions,
            PaymentGateway paymentGateway,
            BillingAddress billingAddress,
            java.util.Date timePlanUpgrade) {
        super();
        this.id = id;
        this.subscriptionPlanNumber = subscriptionPlanNumber;
        this.planType = planType;
        this.timeStart = timeStart;
        this.shipToCustAcctSiteId = shipToCustAcctSiteId;
        this.shipToCustAcctRoleId = shipToCustAcctRoleId;
        this.billToCustAccountId = billToCustAccountId;
        this.isIntentToPay = isIntentToPay;
        this.currencyCode = currencyCode;
        this.gsiOrgCode = gsiOrgCode;
        this.languageCode = languageCode;
        this.organizationId = organizationId;
        this.upgradeState = upgradeState;
        this.upgradeStateDetails = upgradeStateDetails;
        this.taxInfo = taxInfo;
        this.paymentOptions = paymentOptions;
        this.paymentGateway = paymentGateway;
        this.billingAddress = billingAddress;
        this.timePlanUpgrade = timePlanUpgrade;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Subscription id identifier (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    public String getId() {
        return id;
    }

    /**
     * Subscription plan number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionPlanNumber")
    private final String subscriptionPlanNumber;

    public String getSubscriptionPlanNumber() {
        return subscriptionPlanNumber;
    }

    /**
     * Subscription plan type.
     **/
    public enum PlanType {
        FreeTier("FREE_TIER"),
        Payg("PAYG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlanType.class);

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
    private final PlanType planType;

    public PlanType getPlanType() {
        return planType;
    }

    /**
     * Start date of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Ship to customer account site address id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctSiteId")
    private final String shipToCustAcctSiteId;

    public String getShipToCustAcctSiteId() {
        return shipToCustAcctSiteId;
    }

    /**
     * Ship to customer account role.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctRoleId")
    private final String shipToCustAcctRoleId;

    public String getShipToCustAcctRoleId() {
        return shipToCustAcctRoleId;
    }

    /**
     * Bill to customer Account id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billToCustAccountId")
    private final String billToCustAccountId;

    public String getBillToCustAccountId() {
        return billToCustAccountId;
    }

    /**
     * Payment intension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    private final Boolean isIntentToPay;

    public Boolean getIsIntentToPay() {
        return isIntentToPay;
    }

    /**
     * Currency code
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * GSI Subscription external code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gsiOrgCode")
    private final String gsiOrgCode;

    public String getGsiOrgCode() {
        return gsiOrgCode;
    }

    /**
     * Language short code (en, de, hu, etc)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * GSI organization external identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationId")
    private final String organizationId;

    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Status of the upgrade.
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpgradeState.class);

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
    private final UpgradeState upgradeState;

    public UpgradeState getUpgradeState() {
        return upgradeState;
    }

    /**
     * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure caused by interfacing Tax details- TaxError)
     **/
    public enum UpgradeStateDetails {
        TaxError("TAX_ERROR"),
        UpgradeError("UPGRADE_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UpgradeStateDetails.class);

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
    private final UpgradeStateDetails upgradeStateDetails;

    public UpgradeStateDetails getUpgradeStateDetails() {
        return upgradeStateDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("taxInfo")
    private final TaxInfo taxInfo;

    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /**
     * Payment option list of a subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentOptions")
    private final java.util.List<PaymentOption> paymentOptions;

    public java.util.List<PaymentOption> getPaymentOptions() {
        return paymentOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("paymentGateway")
    private final PaymentGateway paymentGateway;

    public PaymentGateway getPaymentGateway() {
        return paymentGateway;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billingAddress")
    private final BillingAddress billingAddress;

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    /**
     * Date of upgrade/conversion when planType changed from FREE_TIER to PAYG
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePlanUpgrade")
    private final java.util.Date timePlanUpgrade;

    public java.util.Date getTimePlanUpgrade() {
        return timePlanUpgrade;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SubscriptionSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", subscriptionPlanNumber=").append(String.valueOf(this.subscriptionPlanNumber));
        sb.append(", planType=").append(String.valueOf(this.planType));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", shipToCustAcctSiteId=").append(String.valueOf(this.shipToCustAcctSiteId));
        sb.append(", shipToCustAcctRoleId=").append(String.valueOf(this.shipToCustAcctRoleId));
        sb.append(", billToCustAccountId=").append(String.valueOf(this.billToCustAccountId));
        sb.append(", isIntentToPay=").append(String.valueOf(this.isIntentToPay));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", gsiOrgCode=").append(String.valueOf(this.gsiOrgCode));
        sb.append(", languageCode=").append(String.valueOf(this.languageCode));
        sb.append(", organizationId=").append(String.valueOf(this.organizationId));
        sb.append(", upgradeState=").append(String.valueOf(this.upgradeState));
        sb.append(", upgradeStateDetails=").append(String.valueOf(this.upgradeStateDetails));
        sb.append(", taxInfo=").append(String.valueOf(this.taxInfo));
        sb.append(", paymentOptions=").append(String.valueOf(this.paymentOptions));
        sb.append(", paymentGateway=").append(String.valueOf(this.paymentGateway));
        sb.append(", billingAddress=").append(String.valueOf(this.billingAddress));
        sb.append(", timePlanUpgrade=").append(String.valueOf(this.timePlanUpgrade));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionSummary)) {
            return false;
        }

        SubscriptionSummary other = (SubscriptionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.subscriptionPlanNumber, other.subscriptionPlanNumber)
                && java.util.Objects.equals(this.planType, other.planType)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.shipToCustAcctSiteId, other.shipToCustAcctSiteId)
                && java.util.Objects.equals(this.shipToCustAcctRoleId, other.shipToCustAcctRoleId)
                && java.util.Objects.equals(this.billToCustAccountId, other.billToCustAccountId)
                && java.util.Objects.equals(this.isIntentToPay, other.isIntentToPay)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.gsiOrgCode, other.gsiOrgCode)
                && java.util.Objects.equals(this.languageCode, other.languageCode)
                && java.util.Objects.equals(this.organizationId, other.organizationId)
                && java.util.Objects.equals(this.upgradeState, other.upgradeState)
                && java.util.Objects.equals(this.upgradeStateDetails, other.upgradeStateDetails)
                && java.util.Objects.equals(this.taxInfo, other.taxInfo)
                && java.util.Objects.equals(this.paymentOptions, other.paymentOptions)
                && java.util.Objects.equals(this.paymentGateway, other.paymentGateway)
                && java.util.Objects.equals(this.billingAddress, other.billingAddress)
                && java.util.Objects.equals(this.timePlanUpgrade, other.timePlanUpgrade)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionPlanNumber == null
                                ? 43
                                : this.subscriptionPlanNumber.hashCode());
        result = (result * PRIME) + (this.planType == null ? 43 : this.planType.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result =
                (result * PRIME)
                        + (this.shipToCustAcctSiteId == null
                                ? 43
                                : this.shipToCustAcctSiteId.hashCode());
        result =
                (result * PRIME)
                        + (this.shipToCustAcctRoleId == null
                                ? 43
                                : this.shipToCustAcctRoleId.hashCode());
        result =
                (result * PRIME)
                        + (this.billToCustAccountId == null
                                ? 43
                                : this.billToCustAccountId.hashCode());
        result =
                (result * PRIME)
                        + (this.isIntentToPay == null ? 43 : this.isIntentToPay.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.gsiOrgCode == null ? 43 : this.gsiOrgCode.hashCode());
        result = (result * PRIME) + (this.languageCode == null ? 43 : this.languageCode.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationId == null ? 43 : this.organizationId.hashCode());
        result = (result * PRIME) + (this.upgradeState == null ? 43 : this.upgradeState.hashCode());
        result =
                (result * PRIME)
                        + (this.upgradeStateDetails == null
                                ? 43
                                : this.upgradeStateDetails.hashCode());
        result = (result * PRIME) + (this.taxInfo == null ? 43 : this.taxInfo.hashCode());
        result =
                (result * PRIME)
                        + (this.paymentOptions == null ? 43 : this.paymentOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.paymentGateway == null ? 43 : this.paymentGateway.hashCode());
        result =
                (result * PRIME)
                        + (this.billingAddress == null ? 43 : this.billingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.timePlanUpgrade == null ? 43 : this.timePlanUpgrade.hashCode());
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
