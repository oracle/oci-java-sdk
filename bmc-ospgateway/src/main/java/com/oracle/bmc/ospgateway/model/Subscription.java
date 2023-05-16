/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Subscription details object which extends the SubscriptionSummary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subscription.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Subscription extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
    public Subscription(
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
        /** Subscription id identifier (OCID). */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Subscription id identifier (OCID).
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Subscription plan number. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionPlanNumber")
        private String subscriptionPlanNumber;

        /**
         * Subscription plan number.
         *
         * @param subscriptionPlanNumber the value to set
         * @return this builder
         */
        public Builder subscriptionPlanNumber(String subscriptionPlanNumber) {
            this.subscriptionPlanNumber = subscriptionPlanNumber;
            this.__explicitlySet__.add("subscriptionPlanNumber");
            return this;
        }
        /** Subscription plan type. */
        @com.fasterxml.jackson.annotation.JsonProperty("planType")
        private PlanType planType;

        /**
         * Subscription plan type.
         *
         * @param planType the value to set
         * @return this builder
         */
        public Builder planType(PlanType planType) {
            this.planType = planType;
            this.__explicitlySet__.add("planType");
            return this;
        }
        /** Start date of the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Start date of the subscription.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Ship to customer account site address id. */
        @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctSiteId")
        private String shipToCustAcctSiteId;

        /**
         * Ship to customer account site address id.
         *
         * @param shipToCustAcctSiteId the value to set
         * @return this builder
         */
        public Builder shipToCustAcctSiteId(String shipToCustAcctSiteId) {
            this.shipToCustAcctSiteId = shipToCustAcctSiteId;
            this.__explicitlySet__.add("shipToCustAcctSiteId");
            return this;
        }
        /** Ship to customer account role. */
        @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctRoleId")
        private String shipToCustAcctRoleId;

        /**
         * Ship to customer account role.
         *
         * @param shipToCustAcctRoleId the value to set
         * @return this builder
         */
        public Builder shipToCustAcctRoleId(String shipToCustAcctRoleId) {
            this.shipToCustAcctRoleId = shipToCustAcctRoleId;
            this.__explicitlySet__.add("shipToCustAcctRoleId");
            return this;
        }
        /** Bill to customer Account id. */
        @com.fasterxml.jackson.annotation.JsonProperty("billToCustAccountId")
        private String billToCustAccountId;

        /**
         * Bill to customer Account id.
         *
         * @param billToCustAccountId the value to set
         * @return this builder
         */
        public Builder billToCustAccountId(String billToCustAccountId) {
            this.billToCustAccountId = billToCustAccountId;
            this.__explicitlySet__.add("billToCustAccountId");
            return this;
        }
        /** Payment intension. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
        private Boolean isIntentToPay;

        /**
         * Payment intension.
         *
         * @param isIntentToPay the value to set
         * @return this builder
         */
        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = isIntentToPay;
            this.__explicitlySet__.add("isIntentToPay");
            return this;
        }
        /** Currency code */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /** GSI Subscription external code. */
        @com.fasterxml.jackson.annotation.JsonProperty("gsiOrgCode")
        private String gsiOrgCode;

        /**
         * GSI Subscription external code.
         *
         * @param gsiOrgCode the value to set
         * @return this builder
         */
        public Builder gsiOrgCode(String gsiOrgCode) {
            this.gsiOrgCode = gsiOrgCode;
            this.__explicitlySet__.add("gsiOrgCode");
            return this;
        }
        /** Language short code (en, de, hu, etc) */
        @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
        private String languageCode;

        /**
         * Language short code (en, de, hu, etc)
         *
         * @param languageCode the value to set
         * @return this builder
         */
        public Builder languageCode(String languageCode) {
            this.languageCode = languageCode;
            this.__explicitlySet__.add("languageCode");
            return this;
        }
        /** GSI organization external identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("organizationId")
        private String organizationId;

        /**
         * GSI organization external identifier.
         *
         * @param organizationId the value to set
         * @return this builder
         */
        public Builder organizationId(String organizationId) {
            this.organizationId = organizationId;
            this.__explicitlySet__.add("organizationId");
            return this;
        }
        /** Status of the upgrade. */
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeState")
        private UpgradeState upgradeState;

        /**
         * Status of the upgrade.
         *
         * @param upgradeState the value to set
         * @return this builder
         */
        public Builder upgradeState(UpgradeState upgradeState) {
            this.upgradeState = upgradeState;
            this.__explicitlySet__.add("upgradeState");
            return this;
        }
        /**
         * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure
         * caused by interfacing Tax details- TaxError)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("upgradeStateDetails")
        private UpgradeStateDetails upgradeStateDetails;

        /**
         * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure
         * caused by interfacing Tax details- TaxError)
         *
         * @param upgradeStateDetails the value to set
         * @return this builder
         */
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
        /** Payment option list of a subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("paymentOptions")
        private java.util.List<PaymentOption> paymentOptions;

        /**
         * Payment option list of a subscription.
         *
         * @param paymentOptions the value to set
         * @return this builder
         */
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
        /** Date of upgrade/conversion when planType changed from FREE_TIER to PAYG */
        @com.fasterxml.jackson.annotation.JsonProperty("timePlanUpgrade")
        private java.util.Date timePlanUpgrade;

        /**
         * Date of upgrade/conversion when planType changed from FREE_TIER to PAYG
         *
         * @param timePlanUpgrade the value to set
         * @return this builder
         */
        public Builder timePlanUpgrade(java.util.Date timePlanUpgrade) {
            this.timePlanUpgrade = timePlanUpgrade;
            this.__explicitlySet__.add("timePlanUpgrade");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Subscription build() {
            Subscription model =
                    new Subscription(
                            this.id,
                            this.subscriptionPlanNumber,
                            this.planType,
                            this.timeStart,
                            this.shipToCustAcctSiteId,
                            this.shipToCustAcctRoleId,
                            this.billToCustAccountId,
                            this.isIntentToPay,
                            this.currencyCode,
                            this.gsiOrgCode,
                            this.languageCode,
                            this.organizationId,
                            this.upgradeState,
                            this.upgradeStateDetails,
                            this.taxInfo,
                            this.paymentOptions,
                            this.paymentGateway,
                            this.billingAddress,
                            this.timePlanUpgrade);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subscription model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionPlanNumber")) {
                this.subscriptionPlanNumber(model.getSubscriptionPlanNumber());
            }
            if (model.wasPropertyExplicitlySet("planType")) {
                this.planType(model.getPlanType());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("shipToCustAcctSiteId")) {
                this.shipToCustAcctSiteId(model.getShipToCustAcctSiteId());
            }
            if (model.wasPropertyExplicitlySet("shipToCustAcctRoleId")) {
                this.shipToCustAcctRoleId(model.getShipToCustAcctRoleId());
            }
            if (model.wasPropertyExplicitlySet("billToCustAccountId")) {
                this.billToCustAccountId(model.getBillToCustAccountId());
            }
            if (model.wasPropertyExplicitlySet("isIntentToPay")) {
                this.isIntentToPay(model.getIsIntentToPay());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("gsiOrgCode")) {
                this.gsiOrgCode(model.getGsiOrgCode());
            }
            if (model.wasPropertyExplicitlySet("languageCode")) {
                this.languageCode(model.getLanguageCode());
            }
            if (model.wasPropertyExplicitlySet("organizationId")) {
                this.organizationId(model.getOrganizationId());
            }
            if (model.wasPropertyExplicitlySet("upgradeState")) {
                this.upgradeState(model.getUpgradeState());
            }
            if (model.wasPropertyExplicitlySet("upgradeStateDetails")) {
                this.upgradeStateDetails(model.getUpgradeStateDetails());
            }
            if (model.wasPropertyExplicitlySet("taxInfo")) {
                this.taxInfo(model.getTaxInfo());
            }
            if (model.wasPropertyExplicitlySet("paymentOptions")) {
                this.paymentOptions(model.getPaymentOptions());
            }
            if (model.wasPropertyExplicitlySet("paymentGateway")) {
                this.paymentGateway(model.getPaymentGateway());
            }
            if (model.wasPropertyExplicitlySet("billingAddress")) {
                this.billingAddress(model.getBillingAddress());
            }
            if (model.wasPropertyExplicitlySet("timePlanUpgrade")) {
                this.timePlanUpgrade(model.getTimePlanUpgrade());
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

    /** Subscription id identifier (OCID). */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Subscription id identifier (OCID).
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Subscription plan number. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionPlanNumber")
    private final String subscriptionPlanNumber;

    /**
     * Subscription plan number.
     *
     * @return the value
     */
    public String getSubscriptionPlanNumber() {
        return subscriptionPlanNumber;
    }

    /** Subscription plan type. */
    public enum PlanType implements com.oracle.bmc.http.internal.BmcEnum {
        FreeTier("FREE_TIER"),
        Payg("PAYG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Subscription plan type. */
    @com.fasterxml.jackson.annotation.JsonProperty("planType")
    private final PlanType planType;

    /**
     * Subscription plan type.
     *
     * @return the value
     */
    public PlanType getPlanType() {
        return planType;
    }

    /** Start date of the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Start date of the subscription.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Ship to customer account site address id. */
    @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctSiteId")
    private final String shipToCustAcctSiteId;

    /**
     * Ship to customer account site address id.
     *
     * @return the value
     */
    public String getShipToCustAcctSiteId() {
        return shipToCustAcctSiteId;
    }

    /** Ship to customer account role. */
    @com.fasterxml.jackson.annotation.JsonProperty("shipToCustAcctRoleId")
    private final String shipToCustAcctRoleId;

    /**
     * Ship to customer account role.
     *
     * @return the value
     */
    public String getShipToCustAcctRoleId() {
        return shipToCustAcctRoleId;
    }

    /** Bill to customer Account id. */
    @com.fasterxml.jackson.annotation.JsonProperty("billToCustAccountId")
    private final String billToCustAccountId;

    /**
     * Bill to customer Account id.
     *
     * @return the value
     */
    public String getBillToCustAccountId() {
        return billToCustAccountId;
    }

    /** Payment intension. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    private final Boolean isIntentToPay;

    /**
     * Payment intension.
     *
     * @return the value
     */
    public Boolean getIsIntentToPay() {
        return isIntentToPay;
    }

    /** Currency code */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /** GSI Subscription external code. */
    @com.fasterxml.jackson.annotation.JsonProperty("gsiOrgCode")
    private final String gsiOrgCode;

    /**
     * GSI Subscription external code.
     *
     * @return the value
     */
    public String getGsiOrgCode() {
        return gsiOrgCode;
    }

    /** Language short code (en, de, hu, etc) */
    @com.fasterxml.jackson.annotation.JsonProperty("languageCode")
    private final String languageCode;

    /**
     * Language short code (en, de, hu, etc)
     *
     * @return the value
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /** GSI organization external identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("organizationId")
    private final String organizationId;

    /**
     * GSI organization external identifier.
     *
     * @return the value
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /** Status of the upgrade. */
    public enum UpgradeState implements com.oracle.bmc.http.internal.BmcEnum {
        Promo("PROMO"),
        Submitted("SUBMITTED"),
        Error("ERROR"),
        Upgraded("UPGRADED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Status of the upgrade. */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeState")
    private final UpgradeState upgradeState;

    /**
     * Status of the upgrade.
     *
     * @return the value
     */
    public UpgradeState getUpgradeState() {
        return upgradeState;
    }

    /**
     * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure
     * caused by interfacing Tax details- TaxError)
     */
    public enum UpgradeStateDetails implements com.oracle.bmc.http.internal.BmcEnum {
        TaxError("TAX_ERROR"),
        UpgradeError("UPGRADE_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure
     * caused by interfacing Tax details- TaxError)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("upgradeStateDetails")
    private final UpgradeStateDetails upgradeStateDetails;

    /**
     * This field is used to describe the Upgrade State in case of error (E.g. Upgrade failure
     * caused by interfacing Tax details- TaxError)
     *
     * @return the value
     */
    public UpgradeStateDetails getUpgradeStateDetails() {
        return upgradeStateDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("taxInfo")
    private final TaxInfo taxInfo;

    public TaxInfo getTaxInfo() {
        return taxInfo;
    }

    /** Payment option list of a subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentOptions")
    private final java.util.List<PaymentOption> paymentOptions;

    /**
     * Payment option list of a subscription.
     *
     * @return the value
     */
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

    /** Date of upgrade/conversion when planType changed from FREE_TIER to PAYG */
    @com.fasterxml.jackson.annotation.JsonProperty("timePlanUpgrade")
    private final java.util.Date timePlanUpgrade;

    /**
     * Date of upgrade/conversion when planType changed from FREE_TIER to PAYG
     *
     * @return the value
     */
    public java.util.Date getTimePlanUpgrade() {
        return timePlanUpgrade;
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
        sb.append("Subscription(");
        sb.append("super=").append(super.toString());
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
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Subscription)) {
            return false;
        }

        Subscription other = (Subscription) o;
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
