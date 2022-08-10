/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Subscribed service contract details
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SubscribedService.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscribedService extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "serialNumber",
        "subscriptionId",
        "product",
        "timeStart",
        "timeEnd",
        "quantity",
        "status",
        "operationType",
        "netUnitPrice",
        "pricePeriod",
        "lineNetAmount",
        "isVariableCommitment",
        "isAllowance",
        "usedAmount",
        "availableAmount",
        "fundedAllocationValue",
        "isHavingUsage",
        "isCapToPriceList",
        "creditPercentage",
        "partnerTransactionType",
        "isCreditEnabled",
        "overagePolicy",
        "overageBillTo",
        "paygPolicy",
        "promoOrderLineId",
        "promotionPricingType",
        "rateCardDiscountPercentage",
        "overageDiscountPercentage",
        "billToCustomer",
        "billToContact",
        "billToAddress",
        "paymentNumber",
        "timePaymentExpiry",
        "paymentTerm",
        "paymentMethod",
        "transactionExtensionId",
        "salesChannel",
        "eligibleToRenew",
        "renewedSubscribedServiceId",
        "termValue",
        "termValueUom",
        "renewalOptyId",
        "renewalOptyNumber",
        "renewalOptyType",
        "bookingOptyNumber",
        "revenueLineId",
        "revenueLineNumber",
        "majorSet",
        "timeMajorsetStart",
        "timeMajorsetEnd",
        "systemArrInLc",
        "systemArrInSc",
        "systemAtrArrInLc",
        "systemAtrArrInSc",
        "revisedArrInLc",
        "revisedArrInSc",
        "totalValue",
        "originalPromoAmount",
        "orderHeaderId",
        "orderNumber",
        "orderType",
        "orderLineId",
        "orderLineNumber",
        "commitmentScheduleId",
        "salesAccountPartyId",
        "dataCenter",
        "dataCenterRegion",
        "adminEmail",
        "buyerEmail",
        "subscriptionSource",
        "provisioningSource",
        "fulfillmentSet",
        "isIntentToPay",
        "isPayg",
        "pricingModel",
        "programType",
        "startDateType",
        "timeProvisioned",
        "promoType",
        "serviceToCustomer",
        "serviceToContact",
        "serviceToAddress",
        "soldToCustomer",
        "soldToContact",
        "endUserCustomer",
        "endUserContact",
        "endUserAddress",
        "resellerCustomer",
        "resellerContact",
        "resellerAddress",
        "csi",
        "customerTransactionReference",
        "partnerCreditAmount",
        "isSingleRateCard",
        "agreementId",
        "agreementName",
        "agreementType",
        "billingFrequency",
        "timeWelcomeEmailSent",
        "timeServiceConfigurationEmailSent",
        "timeCustomerConfig",
        "timeAgreementEnd",
        "commitmentServices",
        "rateCards",
        "timeCreated",
        "createdBy",
        "timeUpdated",
        "updatedBy",
        "ratecardType"
    })
    public SubscribedService(
            String id,
            String type,
            String serialNumber,
            String subscriptionId,
            RateCardProduct product,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String quantity,
            String status,
            String operationType,
            String netUnitPrice,
            String pricePeriod,
            String lineNetAmount,
            Boolean isVariableCommitment,
            Boolean isAllowance,
            String usedAmount,
            String availableAmount,
            String fundedAllocationValue,
            Boolean isHavingUsage,
            Boolean isCapToPriceList,
            String creditPercentage,
            String partnerTransactionType,
            Boolean isCreditEnabled,
            String overagePolicy,
            String overageBillTo,
            String paygPolicy,
            Long promoOrderLineId,
            String promotionPricingType,
            String rateCardDiscountPercentage,
            String overageDiscountPercentage,
            SubscribedServiceBusinessPartner billToCustomer,
            SubscribedServiceUser billToContact,
            SubscribedServiceAddress billToAddress,
            String paymentNumber,
            java.util.Date timePaymentExpiry,
            SubscribedServicePaymentTerm paymentTerm,
            String paymentMethod,
            Long transactionExtensionId,
            String salesChannel,
            String eligibleToRenew,
            String renewedSubscribedServiceId,
            Long termValue,
            String termValueUom,
            Long renewalOptyId,
            String renewalOptyNumber,
            String renewalOptyType,
            String bookingOptyNumber,
            Long revenueLineId,
            String revenueLineNumber,
            Long majorSet,
            java.util.Date timeMajorsetStart,
            java.util.Date timeMajorsetEnd,
            String systemArrInLc,
            String systemArrInSc,
            String systemAtrArrInLc,
            String systemAtrArrInSc,
            String revisedArrInLc,
            String revisedArrInSc,
            String totalValue,
            String originalPromoAmount,
            Long orderHeaderId,
            Long orderNumber,
            String orderType,
            Long orderLineId,
            Integer orderLineNumber,
            String commitmentScheduleId,
            Long salesAccountPartyId,
            String dataCenter,
            String dataCenterRegion,
            String adminEmail,
            String buyerEmail,
            String subscriptionSource,
            String provisioningSource,
            String fulfillmentSet,
            Boolean isIntentToPay,
            Boolean isPayg,
            String pricingModel,
            String programType,
            String startDateType,
            java.util.Date timeProvisioned,
            String promoType,
            SubscribedServiceBusinessPartner serviceToCustomer,
            SubscribedServiceUser serviceToContact,
            SubscribedServiceAddress serviceToAddress,
            SubscribedServiceBusinessPartner soldToCustomer,
            SubscribedServiceUser soldToContact,
            SubscribedServiceBusinessPartner endUserCustomer,
            SubscribedServiceUser endUserContact,
            SubscribedServiceAddress endUserAddress,
            SubscribedServiceBusinessPartner resellerCustomer,
            SubscribedServiceUser resellerContact,
            SubscribedServiceAddress resellerAddress,
            Long csi,
            String customerTransactionReference,
            String partnerCreditAmount,
            Boolean isSingleRateCard,
            Long agreementId,
            String agreementName,
            String agreementType,
            String billingFrequency,
            java.util.Date timeWelcomeEmailSent,
            java.util.Date timeServiceConfigurationEmailSent,
            java.util.Date timeCustomerConfig,
            java.util.Date timeAgreementEnd,
            java.util.List<CommitmentService> commitmentServices,
            java.util.List<RateCardSummary> rateCards,
            java.util.Date timeCreated,
            String createdBy,
            java.util.Date timeUpdated,
            String updatedBy,
            String ratecardType) {
        super();
        this.id = id;
        this.type = type;
        this.serialNumber = serialNumber;
        this.subscriptionId = subscriptionId;
        this.product = product;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.quantity = quantity;
        this.status = status;
        this.operationType = operationType;
        this.netUnitPrice = netUnitPrice;
        this.pricePeriod = pricePeriod;
        this.lineNetAmount = lineNetAmount;
        this.isVariableCommitment = isVariableCommitment;
        this.isAllowance = isAllowance;
        this.usedAmount = usedAmount;
        this.availableAmount = availableAmount;
        this.fundedAllocationValue = fundedAllocationValue;
        this.isHavingUsage = isHavingUsage;
        this.isCapToPriceList = isCapToPriceList;
        this.creditPercentage = creditPercentage;
        this.partnerTransactionType = partnerTransactionType;
        this.isCreditEnabled = isCreditEnabled;
        this.overagePolicy = overagePolicy;
        this.overageBillTo = overageBillTo;
        this.paygPolicy = paygPolicy;
        this.promoOrderLineId = promoOrderLineId;
        this.promotionPricingType = promotionPricingType;
        this.rateCardDiscountPercentage = rateCardDiscountPercentage;
        this.overageDiscountPercentage = overageDiscountPercentage;
        this.billToCustomer = billToCustomer;
        this.billToContact = billToContact;
        this.billToAddress = billToAddress;
        this.paymentNumber = paymentNumber;
        this.timePaymentExpiry = timePaymentExpiry;
        this.paymentTerm = paymentTerm;
        this.paymentMethod = paymentMethod;
        this.transactionExtensionId = transactionExtensionId;
        this.salesChannel = salesChannel;
        this.eligibleToRenew = eligibleToRenew;
        this.renewedSubscribedServiceId = renewedSubscribedServiceId;
        this.termValue = termValue;
        this.termValueUom = termValueUom;
        this.renewalOptyId = renewalOptyId;
        this.renewalOptyNumber = renewalOptyNumber;
        this.renewalOptyType = renewalOptyType;
        this.bookingOptyNumber = bookingOptyNumber;
        this.revenueLineId = revenueLineId;
        this.revenueLineNumber = revenueLineNumber;
        this.majorSet = majorSet;
        this.timeMajorsetStart = timeMajorsetStart;
        this.timeMajorsetEnd = timeMajorsetEnd;
        this.systemArrInLc = systemArrInLc;
        this.systemArrInSc = systemArrInSc;
        this.systemAtrArrInLc = systemAtrArrInLc;
        this.systemAtrArrInSc = systemAtrArrInSc;
        this.revisedArrInLc = revisedArrInLc;
        this.revisedArrInSc = revisedArrInSc;
        this.totalValue = totalValue;
        this.originalPromoAmount = originalPromoAmount;
        this.orderHeaderId = orderHeaderId;
        this.orderNumber = orderNumber;
        this.orderType = orderType;
        this.orderLineId = orderLineId;
        this.orderLineNumber = orderLineNumber;
        this.commitmentScheduleId = commitmentScheduleId;
        this.salesAccountPartyId = salesAccountPartyId;
        this.dataCenter = dataCenter;
        this.dataCenterRegion = dataCenterRegion;
        this.adminEmail = adminEmail;
        this.buyerEmail = buyerEmail;
        this.subscriptionSource = subscriptionSource;
        this.provisioningSource = provisioningSource;
        this.fulfillmentSet = fulfillmentSet;
        this.isIntentToPay = isIntentToPay;
        this.isPayg = isPayg;
        this.pricingModel = pricingModel;
        this.programType = programType;
        this.startDateType = startDateType;
        this.timeProvisioned = timeProvisioned;
        this.promoType = promoType;
        this.serviceToCustomer = serviceToCustomer;
        this.serviceToContact = serviceToContact;
        this.serviceToAddress = serviceToAddress;
        this.soldToCustomer = soldToCustomer;
        this.soldToContact = soldToContact;
        this.endUserCustomer = endUserCustomer;
        this.endUserContact = endUserContact;
        this.endUserAddress = endUserAddress;
        this.resellerCustomer = resellerCustomer;
        this.resellerContact = resellerContact;
        this.resellerAddress = resellerAddress;
        this.csi = csi;
        this.customerTransactionReference = customerTransactionReference;
        this.partnerCreditAmount = partnerCreditAmount;
        this.isSingleRateCard = isSingleRateCard;
        this.agreementId = agreementId;
        this.agreementName = agreementName;
        this.agreementType = agreementType;
        this.billingFrequency = billingFrequency;
        this.timeWelcomeEmailSent = timeWelcomeEmailSent;
        this.timeServiceConfigurationEmailSent = timeServiceConfigurationEmailSent;
        this.timeCustomerConfig = timeCustomerConfig;
        this.timeAgreementEnd = timeAgreementEnd;
        this.commitmentServices = commitmentServices;
        this.rateCards = rateCards;
        this.timeCreated = timeCreated;
        this.createdBy = createdBy;
        this.timeUpdated = timeUpdated;
        this.updatedBy = updatedBy;
        this.ratecardType = ratecardType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * SPM internal Subscribed Service ID
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * SPM internal Subscribed Service ID
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Subscribed Service line type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Subscribed Service line type
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Subscribed service line number
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * Subscribed service line number
         *
         * @param serialNumber the value to set
         * @return this builder
         **/
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /**
         * Subscription ID associated to the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * Subscription ID associated to the subscribed service
         *
         * @param subscriptionId the value to set
         * @return this builder
         **/
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private RateCardProduct product;

        public Builder product(RateCardProduct product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Subscribed service start date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Subscribed service start date
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * Subscribed service end date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Subscribed service end date
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Subscribed service quantity
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Subscribed service quantity
         *
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Subscribed service status
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Subscribed service status
         *
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Subscribed service operation type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationType")
        private String operationType;

        /**
         * Subscribed service operation type
         *
         * @param operationType the value to set
         * @return this builder
         **/
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            this.__explicitlySet__.add("operationType");
            return this;
        }
        /**
         * Subscribed service net unit price
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Subscribed service net unit price
         *
         * @param netUnitPrice the value to set
         * @return this builder
         **/
        public Builder netUnitPrice(String netUnitPrice) {
            this.netUnitPrice = netUnitPrice;
            this.__explicitlySet__.add("netUnitPrice");
            return this;
        }
        /**
         * Indicates the period for which the commitment amount can be utilised exceeding which the amount lapses. Also used in calculation of total contract line value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricePeriod")
        private String pricePeriod;

        /**
         * Indicates the period for which the commitment amount can be utilised exceeding which the amount lapses. Also used in calculation of total contract line value
         *
         * @param pricePeriod the value to set
         * @return this builder
         **/
        public Builder pricePeriod(String pricePeriod) {
            this.pricePeriod = pricePeriod;
            this.__explicitlySet__.add("pricePeriod");
            return this;
        }
        /**
         * Subscribed service line net amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lineNetAmount")
        private String lineNetAmount;

        /**
         * Subscribed service line net amount
         *
         * @param lineNetAmount the value to set
         * @return this builder
         **/
        public Builder lineNetAmount(String lineNetAmount) {
            this.lineNetAmount = lineNetAmount;
            this.__explicitlySet__.add("lineNetAmount");
            return this;
        }
        /**
         * Indicates if the commitment lines can have different quantities
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isVariableCommitment")
        private Boolean isVariableCommitment;

        /**
         * Indicates if the commitment lines can have different quantities
         *
         * @param isVariableCommitment the value to set
         * @return this builder
         **/
        public Builder isVariableCommitment(Boolean isVariableCommitment) {
            this.isVariableCommitment = isVariableCommitment;
            this.__explicitlySet__.add("isVariableCommitment");
            return this;
        }
        /**
         * Indicates if a service can recieve usages and consequently have available amounts computed
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAllowance")
        private Boolean isAllowance;

        /**
         * Indicates if a service can recieve usages and consequently have available amounts computed
         *
         * @param isAllowance the value to set
         * @return this builder
         **/
        public Builder isAllowance(Boolean isAllowance) {
            this.isAllowance = isAllowance;
            this.__explicitlySet__.add("isAllowance");
            return this;
        }
        /**
         * Subscribed service used amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
        private String usedAmount;

        /**
         * Subscribed service used amount
         *
         * @param usedAmount the value to set
         * @return this builder
         **/
        public Builder usedAmount(String usedAmount) {
            this.usedAmount = usedAmount;
            this.__explicitlySet__.add("usedAmount");
            return this;
        }
        /**
         * Subscribed sercice available or remaining amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
        private String availableAmount;

        /**
         * Subscribed sercice available or remaining amount
         *
         * @param availableAmount the value to set
         * @return this builder
         **/
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            this.__explicitlySet__.add("availableAmount");
            return this;
        }
        /**
         * Funded Allocation line value
         * example: 12000.00
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
        private String fundedAllocationValue;

        /**
         * Funded Allocation line value
         * example: 12000.00
         *
         * @param fundedAllocationValue the value to set
         * @return this builder
         **/
        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = fundedAllocationValue;
            this.__explicitlySet__.add("fundedAllocationValue");
            return this;
        }
        /**
         * Indicator on whether or not there has been usage for the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHavingUsage")
        private Boolean isHavingUsage;

        /**
         * Indicator on whether or not there has been usage for the subscribed service
         *
         * @param isHavingUsage the value to set
         * @return this builder
         **/
        public Builder isHavingUsage(Boolean isHavingUsage) {
            this.isHavingUsage = isHavingUsage;
            this.__explicitlySet__.add("isHavingUsage");
            return this;
        }
        /**
         * If true compares rate between ratecard and the active pricelist and minimum rate would be fetched
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCapToPriceList")
        private Boolean isCapToPriceList;

        /**
         * If true compares rate between ratecard and the active pricelist and minimum rate would be fetched
         *
         * @param isCapToPriceList the value to set
         * @return this builder
         **/
        public Builder isCapToPriceList(Boolean isCapToPriceList) {
            this.isCapToPriceList = isCapToPriceList;
            this.__explicitlySet__.add("isCapToPriceList");
            return this;
        }
        /**
         * Subscribed service credit percentage
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("creditPercentage")
        private String creditPercentage;

        /**
         * Subscribed service credit percentage
         *
         * @param creditPercentage the value to set
         * @return this builder
         **/
        public Builder creditPercentage(String creditPercentage) {
            this.creditPercentage = creditPercentage;
            this.__explicitlySet__.add("creditPercentage");
            return this;
        }
        /**
         * This field contains the name of the partner to which the subscription belongs - depending on which the invoicing may differ
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
        private String partnerTransactionType;

        /**
         * This field contains the name of the partner to which the subscription belongs - depending on which the invoicing may differ
         *
         * @param partnerTransactionType the value to set
         * @return this builder
         **/
        public Builder partnerTransactionType(String partnerTransactionType) {
            this.partnerTransactionType = partnerTransactionType;
            this.__explicitlySet__.add("partnerTransactionType");
            return this;
        }
        /**
         * Used in context of service credit lines
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCreditEnabled")
        private Boolean isCreditEnabled;

        /**
         * Used in context of service credit lines
         *
         * @param isCreditEnabled the value to set
         * @return this builder
         **/
        public Builder isCreditEnabled(Boolean isCreditEnabled) {
            this.isCreditEnabled = isCreditEnabled;
            this.__explicitlySet__.add("isCreditEnabled");
            return this;
        }
        /**
         * Overage Policy of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overagePolicy")
        private String overagePolicy;

        /**
         * Overage Policy of Subscribed Service
         *
         * @param overagePolicy the value to set
         * @return this builder
         **/
        public Builder overagePolicy(String overagePolicy) {
            this.overagePolicy = overagePolicy;
            this.__explicitlySet__.add("overagePolicy");
            return this;
        }
        /**
         * Overage Bill To of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overageBillTo")
        private String overageBillTo;

        /**
         * Overage Bill To of Subscribed Service
         *
         * @param overageBillTo the value to set
         * @return this builder
         **/
        public Builder overageBillTo(String overageBillTo) {
            this.overageBillTo = overageBillTo;
            this.__explicitlySet__.add("overageBillTo");
            return this;
        }
        /**
         * Pay As You Go policy of Subscribed Service (Can be null - indicating no payg policy)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paygPolicy")
        private String paygPolicy;

        /**
         * Pay As You Go policy of Subscribed Service (Can be null - indicating no payg policy)
         *
         * @param paygPolicy the value to set
         * @return this builder
         **/
        public Builder paygPolicy(String paygPolicy) {
            this.paygPolicy = paygPolicy;
            this.__explicitlySet__.add("paygPolicy");
            return this;
        }
        /**
         * Not null if this service has an associated promotion line in SPM. Contains the line identifier from Order Management of
         * the associated promo line.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("promoOrderLineId")
        private Long promoOrderLineId;

        /**
         * Not null if this service has an associated promotion line in SPM. Contains the line identifier from Order Management of
         * the associated promo line.
         *
         * @param promoOrderLineId the value to set
         * @return this builder
         **/
        public Builder promoOrderLineId(Long promoOrderLineId) {
            this.promoOrderLineId = promoOrderLineId;
            this.__explicitlySet__.add("promoOrderLineId");
            return this;
        }
        /**
         * Promotion Pricing Type of Subscribed Service (Can be null - indicating no promotion pricing)
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("promotionPricingType")
        private String promotionPricingType;

        /**
         * Promotion Pricing Type of Subscribed Service (Can be null - indicating no promotion pricing)
         *
         * @param promotionPricingType the value to set
         * @return this builder
         **/
        public Builder promotionPricingType(String promotionPricingType) {
            this.promotionPricingType = promotionPricingType;
            this.__explicitlySet__.add("promotionPricingType");
            return this;
        }
        /**
         * Subscribed service Rate Card Discount Percentage
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rateCardDiscountPercentage")
        private String rateCardDiscountPercentage;

        /**
         * Subscribed service Rate Card Discount Percentage
         *
         * @param rateCardDiscountPercentage the value to set
         * @return this builder
         **/
        public Builder rateCardDiscountPercentage(String rateCardDiscountPercentage) {
            this.rateCardDiscountPercentage = rateCardDiscountPercentage;
            this.__explicitlySet__.add("rateCardDiscountPercentage");
            return this;
        }
        /**
         * Subscribed service Overage Discount Percentage
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overageDiscountPercentage")
        private String overageDiscountPercentage;

        /**
         * Subscribed service Overage Discount Percentage
         *
         * @param overageDiscountPercentage the value to set
         * @return this builder
         **/
        public Builder overageDiscountPercentage(String overageDiscountPercentage) {
            this.overageDiscountPercentage = overageDiscountPercentage;
            this.__explicitlySet__.add("overageDiscountPercentage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToCustomer")
        private SubscribedServiceBusinessPartner billToCustomer;

        public Builder billToCustomer(SubscribedServiceBusinessPartner billToCustomer) {
            this.billToCustomer = billToCustomer;
            this.__explicitlySet__.add("billToCustomer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToContact")
        private SubscribedServiceUser billToContact;

        public Builder billToContact(SubscribedServiceUser billToContact) {
            this.billToContact = billToContact;
            this.__explicitlySet__.add("billToContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
        private SubscribedServiceAddress billToAddress;

        public Builder billToAddress(SubscribedServiceAddress billToAddress) {
            this.billToAddress = billToAddress;
            this.__explicitlySet__.add("billToAddress");
            return this;
        }
        /**
         * Payment Number of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paymentNumber")
        private String paymentNumber;

        /**
         * Payment Number of Subscribed Service
         *
         * @param paymentNumber the value to set
         * @return this builder
         **/
        public Builder paymentNumber(String paymentNumber) {
            this.paymentNumber = paymentNumber;
            this.__explicitlySet__.add("paymentNumber");
            return this;
        }
        /**
         * Subscribed service payment expiry date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timePaymentExpiry")
        private java.util.Date timePaymentExpiry;

        /**
         * Subscribed service payment expiry date
         *
         * @param timePaymentExpiry the value to set
         * @return this builder
         **/
        public Builder timePaymentExpiry(java.util.Date timePaymentExpiry) {
            this.timePaymentExpiry = timePaymentExpiry;
            this.__explicitlySet__.add("timePaymentExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paymentTerm")
        private SubscribedServicePaymentTerm paymentTerm;

        public Builder paymentTerm(SubscribedServicePaymentTerm paymentTerm) {
            this.paymentTerm = paymentTerm;
            this.__explicitlySet__.add("paymentTerm");
            return this;
        }
        /**
         * Payment Method of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paymentMethod")
        private String paymentMethod;

        /**
         * Payment Method of Subscribed Service
         *
         * @param paymentMethod the value to set
         * @return this builder
         **/
        public Builder paymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            this.__explicitlySet__.add("paymentMethod");
            return this;
        }
        /**
         * Subscribed service Transaction Extension Id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transactionExtensionId")
        private Long transactionExtensionId;

        /**
         * Subscribed service Transaction Extension Id
         *
         * @param transactionExtensionId the value to set
         * @return this builder
         **/
        public Builder transactionExtensionId(Long transactionExtensionId) {
            this.transactionExtensionId = transactionExtensionId;
            this.__explicitlySet__.add("transactionExtensionId");
            return this;
        }
        /**
         * Sales Channel of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("salesChannel")
        private String salesChannel;

        /**
         * Sales Channel of Subscribed Service
         *
         * @param salesChannel the value to set
         * @return this builder
         **/
        public Builder salesChannel(String salesChannel) {
            this.salesChannel = salesChannel;
            this.__explicitlySet__.add("salesChannel");
            return this;
        }
        /**
         * Subscribed service eligible to renew field
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("eligibleToRenew")
        private String eligibleToRenew;

        /**
         * Subscribed service eligible to renew field
         *
         * @param eligibleToRenew the value to set
         * @return this builder
         **/
        public Builder eligibleToRenew(String eligibleToRenew) {
            this.eligibleToRenew = eligibleToRenew;
            this.__explicitlySet__.add("eligibleToRenew");
            return this;
        }
        /**
         * SPM renewed Subscription ID
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("renewedSubscribedServiceId")
        private String renewedSubscribedServiceId;

        /**
         * SPM renewed Subscription ID
         *
         * @param renewedSubscribedServiceId the value to set
         * @return this builder
         **/
        public Builder renewedSubscribedServiceId(String renewedSubscribedServiceId) {
            this.renewedSubscribedServiceId = renewedSubscribedServiceId;
            this.__explicitlySet__.add("renewedSubscribedServiceId");
            return this;
        }
        /**
         * Term value in Months
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termValue")
        private Long termValue;

        /**
         * Term value in Months
         *
         * @param termValue the value to set
         * @return this builder
         **/
        public Builder termValue(Long termValue) {
            this.termValue = termValue;
            this.__explicitlySet__.add("termValue");
            return this;
        }
        /**
         * Term value UOM
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("termValueUom")
        private String termValueUom;

        /**
         * Term value UOM
         *
         * @param termValueUom the value to set
         * @return this builder
         **/
        public Builder termValueUom(String termValueUom) {
            this.termValueUom = termValueUom;
            this.__explicitlySet__.add("termValueUom");
            return this;
        }
        /**
         * Subscribed service Opportunity Id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("renewalOptyId")
        private Long renewalOptyId;

        /**
         * Subscribed service Opportunity Id
         *
         * @param renewalOptyId the value to set
         * @return this builder
         **/
        public Builder renewalOptyId(Long renewalOptyId) {
            this.renewalOptyId = renewalOptyId;
            this.__explicitlySet__.add("renewalOptyId");
            return this;
        }
        /**
         * Renewal Opportunity Number of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("renewalOptyNumber")
        private String renewalOptyNumber;

        /**
         * Renewal Opportunity Number of Subscribed Service
         *
         * @param renewalOptyNumber the value to set
         * @return this builder
         **/
        public Builder renewalOptyNumber(String renewalOptyNumber) {
            this.renewalOptyNumber = renewalOptyNumber;
            this.__explicitlySet__.add("renewalOptyNumber");
            return this;
        }
        /**
         * Renewal Opportunity Type of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("renewalOptyType")
        private String renewalOptyType;

        /**
         * Renewal Opportunity Type of Subscribed Service
         *
         * @param renewalOptyType the value to set
         * @return this builder
         **/
        public Builder renewalOptyType(String renewalOptyType) {
            this.renewalOptyType = renewalOptyType;
            this.__explicitlySet__.add("renewalOptyType");
            return this;
        }
        /**
         * Booking Opportunity Number of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
        private String bookingOptyNumber;

        /**
         * Booking Opportunity Number of Subscribed Service
         *
         * @param bookingOptyNumber the value to set
         * @return this builder
         **/
        public Builder bookingOptyNumber(String bookingOptyNumber) {
            this.bookingOptyNumber = bookingOptyNumber;
            this.__explicitlySet__.add("bookingOptyNumber");
            return this;
        }
        /**
         * Subscribed service Revenue Line Id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revenueLineId")
        private Long revenueLineId;

        /**
         * Subscribed service Revenue Line Id
         *
         * @param revenueLineId the value to set
         * @return this builder
         **/
        public Builder revenueLineId(Long revenueLineId) {
            this.revenueLineId = revenueLineId;
            this.__explicitlySet__.add("revenueLineId");
            return this;
        }
        /**
         * Revenue Line NUmber of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revenueLineNumber")
        private String revenueLineNumber;

        /**
         * Revenue Line NUmber of Subscribed Service
         *
         * @param revenueLineNumber the value to set
         * @return this builder
         **/
        public Builder revenueLineNumber(String revenueLineNumber) {
            this.revenueLineNumber = revenueLineNumber;
            this.__explicitlySet__.add("revenueLineNumber");
            return this;
        }
        /**
         * Subscribed service Major Set
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("majorSet")
        private Long majorSet;

        /**
         * Subscribed service Major Set
         *
         * @param majorSet the value to set
         * @return this builder
         **/
        public Builder majorSet(Long majorSet) {
            this.majorSet = majorSet;
            this.__explicitlySet__.add("majorSet");
            return this;
        }
        /**
         * Subscribed service Major Set Start date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMajorsetStart")
        private java.util.Date timeMajorsetStart;

        /**
         * Subscribed service Major Set Start date
         *
         * @param timeMajorsetStart the value to set
         * @return this builder
         **/
        public Builder timeMajorsetStart(java.util.Date timeMajorsetStart) {
            this.timeMajorsetStart = timeMajorsetStart;
            this.__explicitlySet__.add("timeMajorsetStart");
            return this;
        }
        /**
         * Subscribed service Major Set End date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMajorsetEnd")
        private java.util.Date timeMajorsetEnd;

        /**
         * Subscribed service Major Set End date
         *
         * @param timeMajorsetEnd the value to set
         * @return this builder
         **/
        public Builder timeMajorsetEnd(java.util.Date timeMajorsetEnd) {
            this.timeMajorsetEnd = timeMajorsetEnd;
            this.__explicitlySet__.add("timeMajorsetEnd");
            return this;
        }
        /**
         * Subscribed service System ARR
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemArrInLc")
        private String systemArrInLc;

        /**
         * Subscribed service System ARR
         *
         * @param systemArrInLc the value to set
         * @return this builder
         **/
        public Builder systemArrInLc(String systemArrInLc) {
            this.systemArrInLc = systemArrInLc;
            this.__explicitlySet__.add("systemArrInLc");
            return this;
        }
        /**
         * Subscribed service System ARR in Standard Currency
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemArrInSc")
        private String systemArrInSc;

        /**
         * Subscribed service System ARR in Standard Currency
         *
         * @param systemArrInSc the value to set
         * @return this builder
         **/
        public Builder systemArrInSc(String systemArrInSc) {
            this.systemArrInSc = systemArrInSc;
            this.__explicitlySet__.add("systemArrInSc");
            return this;
        }
        /**
         * Subscribed service System ATR-ARR
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemAtrArrInLc")
        private String systemAtrArrInLc;

        /**
         * Subscribed service System ATR-ARR
         *
         * @param systemAtrArrInLc the value to set
         * @return this builder
         **/
        public Builder systemAtrArrInLc(String systemAtrArrInLc) {
            this.systemAtrArrInLc = systemAtrArrInLc;
            this.__explicitlySet__.add("systemAtrArrInLc");
            return this;
        }
        /**
         * Subscribed service System ATR-ARR in Standard Currency
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemAtrArrInSc")
        private String systemAtrArrInSc;

        /**
         * Subscribed service System ATR-ARR in Standard Currency
         *
         * @param systemAtrArrInSc the value to set
         * @return this builder
         **/
        public Builder systemAtrArrInSc(String systemAtrArrInSc) {
            this.systemAtrArrInSc = systemAtrArrInSc;
            this.__explicitlySet__.add("systemAtrArrInSc");
            return this;
        }
        /**
         * Subscribed service Revised ARR
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revisedArrInLc")
        private String revisedArrInLc;

        /**
         * Subscribed service Revised ARR
         *
         * @param revisedArrInLc the value to set
         * @return this builder
         **/
        public Builder revisedArrInLc(String revisedArrInLc) {
            this.revisedArrInLc = revisedArrInLc;
            this.__explicitlySet__.add("revisedArrInLc");
            return this;
        }
        /**
         * Subscribed service Revised ARR in Standard Currency
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revisedArrInSc")
        private String revisedArrInSc;

        /**
         * Subscribed service Revised ARR in Standard Currency
         *
         * @param revisedArrInSc the value to set
         * @return this builder
         **/
        public Builder revisedArrInSc(String revisedArrInSc) {
            this.revisedArrInSc = revisedArrInSc;
            this.__explicitlySet__.add("revisedArrInSc");
            return this;
        }
        /**
         * Subscribed service total value
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
        private String totalValue;

        /**
         * Subscribed service total value
         *
         * @param totalValue the value to set
         * @return this builder
         **/
        public Builder totalValue(String totalValue) {
            this.totalValue = totalValue;
            this.__explicitlySet__.add("totalValue");
            return this;
        }
        /**
         * Subscribed service Promotion Amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalPromoAmount")
        private String originalPromoAmount;

        /**
         * Subscribed service Promotion Amount
         *
         * @param originalPromoAmount the value to set
         * @return this builder
         **/
        public Builder originalPromoAmount(String originalPromoAmount) {
            this.originalPromoAmount = originalPromoAmount;
            this.__explicitlySet__.add("originalPromoAmount");
            return this;
        }
        /**
         * Sales Order Header associated to the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderHeaderId")
        private Long orderHeaderId;

        /**
         * Sales Order Header associated to the subscribed service
         *
         * @param orderHeaderId the value to set
         * @return this builder
         **/
        public Builder orderHeaderId(Long orderHeaderId) {
            this.orderHeaderId = orderHeaderId;
            this.__explicitlySet__.add("orderHeaderId");
            return this;
        }
        /**
         * Sales Order Number associated to the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
        private Long orderNumber;

        /**
         * Sales Order Number associated to the subscribed service
         *
         * @param orderNumber the value to set
         * @return this builder
         **/
        public Builder orderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            this.__explicitlySet__.add("orderNumber");
            return this;
        }
        /**
         * Order Type of Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderType")
        private String orderType;

        /**
         * Order Type of Subscribed Service
         *
         * @param orderType the value to set
         * @return this builder
         **/
        public Builder orderType(String orderType) {
            this.orderType = orderType;
            this.__explicitlySet__.add("orderType");
            return this;
        }
        /**
         * Sales Order Line Id associated to the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderLineId")
        private Long orderLineId;

        /**
         * Sales Order Line Id associated to the subscribed service
         *
         * @param orderLineId the value to set
         * @return this builder
         **/
        public Builder orderLineId(Long orderLineId) {
            this.orderLineId = orderLineId;
            this.__explicitlySet__.add("orderLineId");
            return this;
        }
        /**
         * Sales Order Line Number associated to the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderLineNumber")
        private Integer orderLineNumber;

        /**
         * Sales Order Line Number associated to the subscribed service
         *
         * @param orderLineNumber the value to set
         * @return this builder
         **/
        public Builder orderLineNumber(Integer orderLineNumber) {
            this.orderLineNumber = orderLineNumber;
            this.__explicitlySet__.add("orderLineNumber");
            return this;
        }
        /**
         * Subscribed service commitment schedule Id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentScheduleId")
        private String commitmentScheduleId;

        /**
         * Subscribed service commitment schedule Id
         *
         * @param commitmentScheduleId the value to set
         * @return this builder
         **/
        public Builder commitmentScheduleId(String commitmentScheduleId) {
            this.commitmentScheduleId = commitmentScheduleId;
            this.__explicitlySet__.add("commitmentScheduleId");
            return this;
        }
        /**
         * Subscribed service sales account party id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("salesAccountPartyId")
        private Long salesAccountPartyId;

        /**
         * Subscribed service sales account party id
         *
         * @param salesAccountPartyId the value to set
         * @return this builder
         **/
        public Builder salesAccountPartyId(Long salesAccountPartyId) {
            this.salesAccountPartyId = salesAccountPartyId;
            this.__explicitlySet__.add("salesAccountPartyId");
            return this;
        }
        /**
         * Subscribed service data center
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        /**
         * Subscribed service data center
         *
         * @param dataCenter the value to set
         * @return this builder
         **/
        public Builder dataCenter(String dataCenter) {
            this.dataCenter = dataCenter;
            this.__explicitlySet__.add("dataCenter");
            return this;
        }
        /**
         * Subscribed service data center region
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
        private String dataCenterRegion;

        /**
         * Subscribed service data center region
         *
         * @param dataCenterRegion the value to set
         * @return this builder
         **/
        public Builder dataCenterRegion(String dataCenterRegion) {
            this.dataCenterRegion = dataCenterRegion;
            this.__explicitlySet__.add("dataCenterRegion");
            return this;
        }
        /**
         * Subscribed service admin email id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
        private String adminEmail;

        /**
         * Subscribed service admin email id
         *
         * @param adminEmail the value to set
         * @return this builder
         **/
        public Builder adminEmail(String adminEmail) {
            this.adminEmail = adminEmail;
            this.__explicitlySet__.add("adminEmail");
            return this;
        }
        /**
         * Subscribed service buyer email id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("buyerEmail")
        private String buyerEmail;

        /**
         * Subscribed service buyer email id
         *
         * @param buyerEmail the value to set
         * @return this builder
         **/
        public Builder buyerEmail(String buyerEmail) {
            this.buyerEmail = buyerEmail;
            this.__explicitlySet__.add("buyerEmail");
            return this;
        }
        /**
         * Subscribed service source
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionSource")
        private String subscriptionSource;

        /**
         * Subscribed service source
         *
         * @param subscriptionSource the value to set
         * @return this builder
         **/
        public Builder subscriptionSource(String subscriptionSource) {
            this.subscriptionSource = subscriptionSource;
            this.__explicitlySet__.add("subscriptionSource");
            return this;
        }
        /**
         * Subscribed service provisioning source
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningSource")
        private String provisioningSource;

        /**
         * Subscribed service provisioning source
         *
         * @param provisioningSource the value to set
         * @return this builder
         **/
        public Builder provisioningSource(String provisioningSource) {
            this.provisioningSource = provisioningSource;
            this.__explicitlySet__.add("provisioningSource");
            return this;
        }
        /**
         * Subscribed service fulfillment set
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fulfillmentSet")
        private String fulfillmentSet;

        /**
         * Subscribed service fulfillment set
         *
         * @param fulfillmentSet the value to set
         * @return this builder
         **/
        public Builder fulfillmentSet(String fulfillmentSet) {
            this.fulfillmentSet = fulfillmentSet;
            this.__explicitlySet__.add("fulfillmentSet");
            return this;
        }
        /**
         * Subscribed service intent to pay flag
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
        private Boolean isIntentToPay;

        /**
         * Subscribed service intent to pay flag
         *
         * @param isIntentToPay the value to set
         * @return this builder
         **/
        public Builder isIntentToPay(Boolean isIntentToPay) {
            this.isIntentToPay = isIntentToPay;
            this.__explicitlySet__.add("isIntentToPay");
            return this;
        }
        /**
         * Subscribed service payg flag
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPayg")
        private Boolean isPayg;

        /**
         * Subscribed service payg flag
         *
         * @param isPayg the value to set
         * @return this builder
         **/
        public Builder isPayg(Boolean isPayg) {
            this.isPayg = isPayg;
            this.__explicitlySet__.add("isPayg");
            return this;
        }
        /**
         * Subscribed service pricing model
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
        private String pricingModel;

        /**
         * Subscribed service pricing model
         *
         * @param pricingModel the value to set
         * @return this builder
         **/
        public Builder pricingModel(String pricingModel) {
            this.pricingModel = pricingModel;
            this.__explicitlySet__.add("pricingModel");
            return this;
        }
        /**
         * Subscribed service program type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("programType")
        private String programType;

        /**
         * Subscribed service program type
         *
         * @param programType the value to set
         * @return this builder
         **/
        public Builder programType(String programType) {
            this.programType = programType;
            this.__explicitlySet__.add("programType");
            return this;
        }
        /**
         * Subscribed service start date type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startDateType")
        private String startDateType;

        /**
         * Subscribed service start date type
         *
         * @param startDateType the value to set
         * @return this builder
         **/
        public Builder startDateType(String startDateType) {
            this.startDateType = startDateType;
            this.__explicitlySet__.add("startDateType");
            return this;
        }
        /**
         * Subscribed service provisioning date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeProvisioned")
        private java.util.Date timeProvisioned;

        /**
         * Subscribed service provisioning date
         *
         * @param timeProvisioned the value to set
         * @return this builder
         **/
        public Builder timeProvisioned(java.util.Date timeProvisioned) {
            this.timeProvisioned = timeProvisioned;
            this.__explicitlySet__.add("timeProvisioned");
            return this;
        }
        /**
         * Subscribed service promotion type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("promoType")
        private String promoType;

        /**
         * Subscribed service promotion type
         *
         * @param promoType the value to set
         * @return this builder
         **/
        public Builder promoType(String promoType) {
            this.promoType = promoType;
            this.__explicitlySet__.add("promoType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceToCustomer")
        private SubscribedServiceBusinessPartner serviceToCustomer;

        public Builder serviceToCustomer(SubscribedServiceBusinessPartner serviceToCustomer) {
            this.serviceToCustomer = serviceToCustomer;
            this.__explicitlySet__.add("serviceToCustomer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceToContact")
        private SubscribedServiceUser serviceToContact;

        public Builder serviceToContact(SubscribedServiceUser serviceToContact) {
            this.serviceToContact = serviceToContact;
            this.__explicitlySet__.add("serviceToContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceToAddress")
        private SubscribedServiceAddress serviceToAddress;

        public Builder serviceToAddress(SubscribedServiceAddress serviceToAddress) {
            this.serviceToAddress = serviceToAddress;
            this.__explicitlySet__.add("serviceToAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("soldToCustomer")
        private SubscribedServiceBusinessPartner soldToCustomer;

        public Builder soldToCustomer(SubscribedServiceBusinessPartner soldToCustomer) {
            this.soldToCustomer = soldToCustomer;
            this.__explicitlySet__.add("soldToCustomer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("soldToContact")
        private SubscribedServiceUser soldToContact;

        public Builder soldToContact(SubscribedServiceUser soldToContact) {
            this.soldToContact = soldToContact;
            this.__explicitlySet__.add("soldToContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endUserCustomer")
        private SubscribedServiceBusinessPartner endUserCustomer;

        public Builder endUserCustomer(SubscribedServiceBusinessPartner endUserCustomer) {
            this.endUserCustomer = endUserCustomer;
            this.__explicitlySet__.add("endUserCustomer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endUserContact")
        private SubscribedServiceUser endUserContact;

        public Builder endUserContact(SubscribedServiceUser endUserContact) {
            this.endUserContact = endUserContact;
            this.__explicitlySet__.add("endUserContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endUserAddress")
        private SubscribedServiceAddress endUserAddress;

        public Builder endUserAddress(SubscribedServiceAddress endUserAddress) {
            this.endUserAddress = endUserAddress;
            this.__explicitlySet__.add("endUserAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resellerCustomer")
        private SubscribedServiceBusinessPartner resellerCustomer;

        public Builder resellerCustomer(SubscribedServiceBusinessPartner resellerCustomer) {
            this.resellerCustomer = resellerCustomer;
            this.__explicitlySet__.add("resellerCustomer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resellerContact")
        private SubscribedServiceUser resellerContact;

        public Builder resellerContact(SubscribedServiceUser resellerContact) {
            this.resellerContact = resellerContact;
            this.__explicitlySet__.add("resellerContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resellerAddress")
        private SubscribedServiceAddress resellerAddress;

        public Builder resellerAddress(SubscribedServiceAddress resellerAddress) {
            this.resellerAddress = resellerAddress;
            this.__explicitlySet__.add("resellerAddress");
            return this;
        }
        /**
         * Subscribed service CSI number
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private Long csi;

        /**
         * Subscribed service CSI number
         *
         * @param csi the value to set
         * @return this builder
         **/
        public Builder csi(Long csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }
        /**
         * Identifier for a customer's transactions for purchase of ay oracle services
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerTransactionReference")
        private String customerTransactionReference;

        /**
         * Identifier for a customer's transactions for purchase of ay oracle services
         *
         * @param customerTransactionReference the value to set
         * @return this builder
         **/
        public Builder customerTransactionReference(String customerTransactionReference) {
            this.customerTransactionReference = customerTransactionReference;
            this.__explicitlySet__.add("customerTransactionReference");
            return this;
        }
        /**
         * Subscribed service partner credit amount
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partnerCreditAmount")
        private String partnerCreditAmount;

        /**
         * Subscribed service partner credit amount
         *
         * @param partnerCreditAmount the value to set
         * @return this builder
         **/
        public Builder partnerCreditAmount(String partnerCreditAmount) {
            this.partnerCreditAmount = partnerCreditAmount;
            this.__explicitlySet__.add("partnerCreditAmount");
            return this;
        }
        /**
         * Indicates if the Subscribed service has a single ratecard
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSingleRateCard")
        private Boolean isSingleRateCard;

        /**
         * Indicates if the Subscribed service has a single ratecard
         *
         * @param isSingleRateCard the value to set
         * @return this builder
         **/
        public Builder isSingleRateCard(Boolean isSingleRateCard) {
            this.isSingleRateCard = isSingleRateCard;
            this.__explicitlySet__.add("isSingleRateCard");
            return this;
        }
        /**
         * Subscribed service agreement ID
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agreementId")
        private Long agreementId;

        /**
         * Subscribed service agreement ID
         *
         * @param agreementId the value to set
         * @return this builder
         **/
        public Builder agreementId(Long agreementId) {
            this.agreementId = agreementId;
            this.__explicitlySet__.add("agreementId");
            return this;
        }
        /**
         * Subscribed service agrrement name
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agreementName")
        private String agreementName;

        /**
         * Subscribed service agrrement name
         *
         * @param agreementName the value to set
         * @return this builder
         **/
        public Builder agreementName(String agreementName) {
            this.agreementName = agreementName;
            this.__explicitlySet__.add("agreementName");
            return this;
        }
        /**
         * Subscribed service agrrement type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agreementType")
        private String agreementType;

        /**
         * Subscribed service agrrement type
         *
         * @param agreementType the value to set
         * @return this builder
         **/
        public Builder agreementType(String agreementType) {
            this.agreementType = agreementType;
            this.__explicitlySet__.add("agreementType");
            return this;
        }
        /**
         * Subscribed service invoice frequency
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
        private String billingFrequency;

        /**
         * Subscribed service invoice frequency
         *
         * @param billingFrequency the value to set
         * @return this builder
         **/
        public Builder billingFrequency(String billingFrequency) {
            this.billingFrequency = billingFrequency;
            this.__explicitlySet__.add("billingFrequency");
            return this;
        }
        /**
         * Subscribed service welcome email sent date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeWelcomeEmailSent")
        private java.util.Date timeWelcomeEmailSent;

        /**
         * Subscribed service welcome email sent date
         *
         * @param timeWelcomeEmailSent the value to set
         * @return this builder
         **/
        public Builder timeWelcomeEmailSent(java.util.Date timeWelcomeEmailSent) {
            this.timeWelcomeEmailSent = timeWelcomeEmailSent;
            this.__explicitlySet__.add("timeWelcomeEmailSent");
            return this;
        }
        /**
         * Subscribed service service configuration email sent date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeServiceConfigurationEmailSent")
        private java.util.Date timeServiceConfigurationEmailSent;

        /**
         * Subscribed service service configuration email sent date
         *
         * @param timeServiceConfigurationEmailSent the value to set
         * @return this builder
         **/
        public Builder timeServiceConfigurationEmailSent(
                java.util.Date timeServiceConfigurationEmailSent) {
            this.timeServiceConfigurationEmailSent = timeServiceConfigurationEmailSent;
            this.__explicitlySet__.add("timeServiceConfigurationEmailSent");
            return this;
        }
        /**
         * Subscribed service customer config date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCustomerConfig")
        private java.util.Date timeCustomerConfig;

        /**
         * Subscribed service customer config date
         *
         * @param timeCustomerConfig the value to set
         * @return this builder
         **/
        public Builder timeCustomerConfig(java.util.Date timeCustomerConfig) {
            this.timeCustomerConfig = timeCustomerConfig;
            this.__explicitlySet__.add("timeCustomerConfig");
            return this;
        }
        /**
         * Subscribed service agrrement end date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeAgreementEnd")
        private java.util.Date timeAgreementEnd;

        /**
         * Subscribed service agrrement end date
         *
         * @param timeAgreementEnd the value to set
         * @return this builder
         **/
        public Builder timeAgreementEnd(java.util.Date timeAgreementEnd) {
            this.timeAgreementEnd = timeAgreementEnd;
            this.__explicitlySet__.add("timeAgreementEnd");
            return this;
        }
        /**
         * List of Commitment services of a line
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
        private java.util.List<CommitmentService> commitmentServices;

        /**
         * List of Commitment services of a line
         *
         * @param commitmentServices the value to set
         * @return this builder
         **/
        public Builder commitmentServices(java.util.List<CommitmentService> commitmentServices) {
            this.commitmentServices = commitmentServices;
            this.__explicitlySet__.add("commitmentServices");
            return this;
        }
        /**
         * List of Rate Cards of a Subscribed Service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rateCards")
        private java.util.List<RateCardSummary> rateCards;

        /**
         * List of Rate Cards of a Subscribed Service
         *
         * @param rateCards the value to set
         * @return this builder
         **/
        public Builder rateCards(java.util.List<RateCardSummary> rateCards) {
            this.rateCards = rateCards;
            this.__explicitlySet__.add("rateCards");
            return this;
        }
        /**
         * Subscribed service creation date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Subscribed service creation date
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * User that created the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * User that created the subscribed service
         *
         * @param createdBy the value to set
         * @return this builder
         **/
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /**
         * Subscribed service last update date
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Subscribed service last update date
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * User that updated the subscribed service
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        /**
         * User that updated the subscribed service
         *
         * @param updatedBy the value to set
         * @return this builder
         **/
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }
        /**
         * SPM Ratecard Type
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ratecardType")
        private String ratecardType;

        /**
         * SPM Ratecard Type
         *
         * @param ratecardType the value to set
         * @return this builder
         **/
        public Builder ratecardType(String ratecardType) {
            this.ratecardType = ratecardType;
            this.__explicitlySet__.add("ratecardType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscribedService build() {
            SubscribedService model =
                    new SubscribedService(
                            this.id,
                            this.type,
                            this.serialNumber,
                            this.subscriptionId,
                            this.product,
                            this.timeStart,
                            this.timeEnd,
                            this.quantity,
                            this.status,
                            this.operationType,
                            this.netUnitPrice,
                            this.pricePeriod,
                            this.lineNetAmount,
                            this.isVariableCommitment,
                            this.isAllowance,
                            this.usedAmount,
                            this.availableAmount,
                            this.fundedAllocationValue,
                            this.isHavingUsage,
                            this.isCapToPriceList,
                            this.creditPercentage,
                            this.partnerTransactionType,
                            this.isCreditEnabled,
                            this.overagePolicy,
                            this.overageBillTo,
                            this.paygPolicy,
                            this.promoOrderLineId,
                            this.promotionPricingType,
                            this.rateCardDiscountPercentage,
                            this.overageDiscountPercentage,
                            this.billToCustomer,
                            this.billToContact,
                            this.billToAddress,
                            this.paymentNumber,
                            this.timePaymentExpiry,
                            this.paymentTerm,
                            this.paymentMethod,
                            this.transactionExtensionId,
                            this.salesChannel,
                            this.eligibleToRenew,
                            this.renewedSubscribedServiceId,
                            this.termValue,
                            this.termValueUom,
                            this.renewalOptyId,
                            this.renewalOptyNumber,
                            this.renewalOptyType,
                            this.bookingOptyNumber,
                            this.revenueLineId,
                            this.revenueLineNumber,
                            this.majorSet,
                            this.timeMajorsetStart,
                            this.timeMajorsetEnd,
                            this.systemArrInLc,
                            this.systemArrInSc,
                            this.systemAtrArrInLc,
                            this.systemAtrArrInSc,
                            this.revisedArrInLc,
                            this.revisedArrInSc,
                            this.totalValue,
                            this.originalPromoAmount,
                            this.orderHeaderId,
                            this.orderNumber,
                            this.orderType,
                            this.orderLineId,
                            this.orderLineNumber,
                            this.commitmentScheduleId,
                            this.salesAccountPartyId,
                            this.dataCenter,
                            this.dataCenterRegion,
                            this.adminEmail,
                            this.buyerEmail,
                            this.subscriptionSource,
                            this.provisioningSource,
                            this.fulfillmentSet,
                            this.isIntentToPay,
                            this.isPayg,
                            this.pricingModel,
                            this.programType,
                            this.startDateType,
                            this.timeProvisioned,
                            this.promoType,
                            this.serviceToCustomer,
                            this.serviceToContact,
                            this.serviceToAddress,
                            this.soldToCustomer,
                            this.soldToContact,
                            this.endUserCustomer,
                            this.endUserContact,
                            this.endUserAddress,
                            this.resellerCustomer,
                            this.resellerContact,
                            this.resellerAddress,
                            this.csi,
                            this.customerTransactionReference,
                            this.partnerCreditAmount,
                            this.isSingleRateCard,
                            this.agreementId,
                            this.agreementName,
                            this.agreementType,
                            this.billingFrequency,
                            this.timeWelcomeEmailSent,
                            this.timeServiceConfigurationEmailSent,
                            this.timeCustomerConfig,
                            this.timeAgreementEnd,
                            this.commitmentServices,
                            this.rateCards,
                            this.timeCreated,
                            this.createdBy,
                            this.timeUpdated,
                            this.updatedBy,
                            this.ratecardType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscribedService model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("operationType")) {
                this.operationType(model.getOperationType());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("pricePeriod")) {
                this.pricePeriod(model.getPricePeriod());
            }
            if (model.wasPropertyExplicitlySet("lineNetAmount")) {
                this.lineNetAmount(model.getLineNetAmount());
            }
            if (model.wasPropertyExplicitlySet("isVariableCommitment")) {
                this.isVariableCommitment(model.getIsVariableCommitment());
            }
            if (model.wasPropertyExplicitlySet("isAllowance")) {
                this.isAllowance(model.getIsAllowance());
            }
            if (model.wasPropertyExplicitlySet("usedAmount")) {
                this.usedAmount(model.getUsedAmount());
            }
            if (model.wasPropertyExplicitlySet("availableAmount")) {
                this.availableAmount(model.getAvailableAmount());
            }
            if (model.wasPropertyExplicitlySet("fundedAllocationValue")) {
                this.fundedAllocationValue(model.getFundedAllocationValue());
            }
            if (model.wasPropertyExplicitlySet("isHavingUsage")) {
                this.isHavingUsage(model.getIsHavingUsage());
            }
            if (model.wasPropertyExplicitlySet("isCapToPriceList")) {
                this.isCapToPriceList(model.getIsCapToPriceList());
            }
            if (model.wasPropertyExplicitlySet("creditPercentage")) {
                this.creditPercentage(model.getCreditPercentage());
            }
            if (model.wasPropertyExplicitlySet("partnerTransactionType")) {
                this.partnerTransactionType(model.getPartnerTransactionType());
            }
            if (model.wasPropertyExplicitlySet("isCreditEnabled")) {
                this.isCreditEnabled(model.getIsCreditEnabled());
            }
            if (model.wasPropertyExplicitlySet("overagePolicy")) {
                this.overagePolicy(model.getOveragePolicy());
            }
            if (model.wasPropertyExplicitlySet("overageBillTo")) {
                this.overageBillTo(model.getOverageBillTo());
            }
            if (model.wasPropertyExplicitlySet("paygPolicy")) {
                this.paygPolicy(model.getPaygPolicy());
            }
            if (model.wasPropertyExplicitlySet("promoOrderLineId")) {
                this.promoOrderLineId(model.getPromoOrderLineId());
            }
            if (model.wasPropertyExplicitlySet("promotionPricingType")) {
                this.promotionPricingType(model.getPromotionPricingType());
            }
            if (model.wasPropertyExplicitlySet("rateCardDiscountPercentage")) {
                this.rateCardDiscountPercentage(model.getRateCardDiscountPercentage());
            }
            if (model.wasPropertyExplicitlySet("overageDiscountPercentage")) {
                this.overageDiscountPercentage(model.getOverageDiscountPercentage());
            }
            if (model.wasPropertyExplicitlySet("billToCustomer")) {
                this.billToCustomer(model.getBillToCustomer());
            }
            if (model.wasPropertyExplicitlySet("billToContact")) {
                this.billToContact(model.getBillToContact());
            }
            if (model.wasPropertyExplicitlySet("billToAddress")) {
                this.billToAddress(model.getBillToAddress());
            }
            if (model.wasPropertyExplicitlySet("paymentNumber")) {
                this.paymentNumber(model.getPaymentNumber());
            }
            if (model.wasPropertyExplicitlySet("timePaymentExpiry")) {
                this.timePaymentExpiry(model.getTimePaymentExpiry());
            }
            if (model.wasPropertyExplicitlySet("paymentTerm")) {
                this.paymentTerm(model.getPaymentTerm());
            }
            if (model.wasPropertyExplicitlySet("paymentMethod")) {
                this.paymentMethod(model.getPaymentMethod());
            }
            if (model.wasPropertyExplicitlySet("transactionExtensionId")) {
                this.transactionExtensionId(model.getTransactionExtensionId());
            }
            if (model.wasPropertyExplicitlySet("salesChannel")) {
                this.salesChannel(model.getSalesChannel());
            }
            if (model.wasPropertyExplicitlySet("eligibleToRenew")) {
                this.eligibleToRenew(model.getEligibleToRenew());
            }
            if (model.wasPropertyExplicitlySet("renewedSubscribedServiceId")) {
                this.renewedSubscribedServiceId(model.getRenewedSubscribedServiceId());
            }
            if (model.wasPropertyExplicitlySet("termValue")) {
                this.termValue(model.getTermValue());
            }
            if (model.wasPropertyExplicitlySet("termValueUom")) {
                this.termValueUom(model.getTermValueUom());
            }
            if (model.wasPropertyExplicitlySet("renewalOptyId")) {
                this.renewalOptyId(model.getRenewalOptyId());
            }
            if (model.wasPropertyExplicitlySet("renewalOptyNumber")) {
                this.renewalOptyNumber(model.getRenewalOptyNumber());
            }
            if (model.wasPropertyExplicitlySet("renewalOptyType")) {
                this.renewalOptyType(model.getRenewalOptyType());
            }
            if (model.wasPropertyExplicitlySet("bookingOptyNumber")) {
                this.bookingOptyNumber(model.getBookingOptyNumber());
            }
            if (model.wasPropertyExplicitlySet("revenueLineId")) {
                this.revenueLineId(model.getRevenueLineId());
            }
            if (model.wasPropertyExplicitlySet("revenueLineNumber")) {
                this.revenueLineNumber(model.getRevenueLineNumber());
            }
            if (model.wasPropertyExplicitlySet("majorSet")) {
                this.majorSet(model.getMajorSet());
            }
            if (model.wasPropertyExplicitlySet("timeMajorsetStart")) {
                this.timeMajorsetStart(model.getTimeMajorsetStart());
            }
            if (model.wasPropertyExplicitlySet("timeMajorsetEnd")) {
                this.timeMajorsetEnd(model.getTimeMajorsetEnd());
            }
            if (model.wasPropertyExplicitlySet("systemArrInLc")) {
                this.systemArrInLc(model.getSystemArrInLc());
            }
            if (model.wasPropertyExplicitlySet("systemArrInSc")) {
                this.systemArrInSc(model.getSystemArrInSc());
            }
            if (model.wasPropertyExplicitlySet("systemAtrArrInLc")) {
                this.systemAtrArrInLc(model.getSystemAtrArrInLc());
            }
            if (model.wasPropertyExplicitlySet("systemAtrArrInSc")) {
                this.systemAtrArrInSc(model.getSystemAtrArrInSc());
            }
            if (model.wasPropertyExplicitlySet("revisedArrInLc")) {
                this.revisedArrInLc(model.getRevisedArrInLc());
            }
            if (model.wasPropertyExplicitlySet("revisedArrInSc")) {
                this.revisedArrInSc(model.getRevisedArrInSc());
            }
            if (model.wasPropertyExplicitlySet("totalValue")) {
                this.totalValue(model.getTotalValue());
            }
            if (model.wasPropertyExplicitlySet("originalPromoAmount")) {
                this.originalPromoAmount(model.getOriginalPromoAmount());
            }
            if (model.wasPropertyExplicitlySet("orderHeaderId")) {
                this.orderHeaderId(model.getOrderHeaderId());
            }
            if (model.wasPropertyExplicitlySet("orderNumber")) {
                this.orderNumber(model.getOrderNumber());
            }
            if (model.wasPropertyExplicitlySet("orderType")) {
                this.orderType(model.getOrderType());
            }
            if (model.wasPropertyExplicitlySet("orderLineId")) {
                this.orderLineId(model.getOrderLineId());
            }
            if (model.wasPropertyExplicitlySet("orderLineNumber")) {
                this.orderLineNumber(model.getOrderLineNumber());
            }
            if (model.wasPropertyExplicitlySet("commitmentScheduleId")) {
                this.commitmentScheduleId(model.getCommitmentScheduleId());
            }
            if (model.wasPropertyExplicitlySet("salesAccountPartyId")) {
                this.salesAccountPartyId(model.getSalesAccountPartyId());
            }
            if (model.wasPropertyExplicitlySet("dataCenter")) {
                this.dataCenter(model.getDataCenter());
            }
            if (model.wasPropertyExplicitlySet("dataCenterRegion")) {
                this.dataCenterRegion(model.getDataCenterRegion());
            }
            if (model.wasPropertyExplicitlySet("adminEmail")) {
                this.adminEmail(model.getAdminEmail());
            }
            if (model.wasPropertyExplicitlySet("buyerEmail")) {
                this.buyerEmail(model.getBuyerEmail());
            }
            if (model.wasPropertyExplicitlySet("subscriptionSource")) {
                this.subscriptionSource(model.getSubscriptionSource());
            }
            if (model.wasPropertyExplicitlySet("provisioningSource")) {
                this.provisioningSource(model.getProvisioningSource());
            }
            if (model.wasPropertyExplicitlySet("fulfillmentSet")) {
                this.fulfillmentSet(model.getFulfillmentSet());
            }
            if (model.wasPropertyExplicitlySet("isIntentToPay")) {
                this.isIntentToPay(model.getIsIntentToPay());
            }
            if (model.wasPropertyExplicitlySet("isPayg")) {
                this.isPayg(model.getIsPayg());
            }
            if (model.wasPropertyExplicitlySet("pricingModel")) {
                this.pricingModel(model.getPricingModel());
            }
            if (model.wasPropertyExplicitlySet("programType")) {
                this.programType(model.getProgramType());
            }
            if (model.wasPropertyExplicitlySet("startDateType")) {
                this.startDateType(model.getStartDateType());
            }
            if (model.wasPropertyExplicitlySet("timeProvisioned")) {
                this.timeProvisioned(model.getTimeProvisioned());
            }
            if (model.wasPropertyExplicitlySet("promoType")) {
                this.promoType(model.getPromoType());
            }
            if (model.wasPropertyExplicitlySet("serviceToCustomer")) {
                this.serviceToCustomer(model.getServiceToCustomer());
            }
            if (model.wasPropertyExplicitlySet("serviceToContact")) {
                this.serviceToContact(model.getServiceToContact());
            }
            if (model.wasPropertyExplicitlySet("serviceToAddress")) {
                this.serviceToAddress(model.getServiceToAddress());
            }
            if (model.wasPropertyExplicitlySet("soldToCustomer")) {
                this.soldToCustomer(model.getSoldToCustomer());
            }
            if (model.wasPropertyExplicitlySet("soldToContact")) {
                this.soldToContact(model.getSoldToContact());
            }
            if (model.wasPropertyExplicitlySet("endUserCustomer")) {
                this.endUserCustomer(model.getEndUserCustomer());
            }
            if (model.wasPropertyExplicitlySet("endUserContact")) {
                this.endUserContact(model.getEndUserContact());
            }
            if (model.wasPropertyExplicitlySet("endUserAddress")) {
                this.endUserAddress(model.getEndUserAddress());
            }
            if (model.wasPropertyExplicitlySet("resellerCustomer")) {
                this.resellerCustomer(model.getResellerCustomer());
            }
            if (model.wasPropertyExplicitlySet("resellerContact")) {
                this.resellerContact(model.getResellerContact());
            }
            if (model.wasPropertyExplicitlySet("resellerAddress")) {
                this.resellerAddress(model.getResellerAddress());
            }
            if (model.wasPropertyExplicitlySet("csi")) {
                this.csi(model.getCsi());
            }
            if (model.wasPropertyExplicitlySet("customerTransactionReference")) {
                this.customerTransactionReference(model.getCustomerTransactionReference());
            }
            if (model.wasPropertyExplicitlySet("partnerCreditAmount")) {
                this.partnerCreditAmount(model.getPartnerCreditAmount());
            }
            if (model.wasPropertyExplicitlySet("isSingleRateCard")) {
                this.isSingleRateCard(model.getIsSingleRateCard());
            }
            if (model.wasPropertyExplicitlySet("agreementId")) {
                this.agreementId(model.getAgreementId());
            }
            if (model.wasPropertyExplicitlySet("agreementName")) {
                this.agreementName(model.getAgreementName());
            }
            if (model.wasPropertyExplicitlySet("agreementType")) {
                this.agreementType(model.getAgreementType());
            }
            if (model.wasPropertyExplicitlySet("billingFrequency")) {
                this.billingFrequency(model.getBillingFrequency());
            }
            if (model.wasPropertyExplicitlySet("timeWelcomeEmailSent")) {
                this.timeWelcomeEmailSent(model.getTimeWelcomeEmailSent());
            }
            if (model.wasPropertyExplicitlySet("timeServiceConfigurationEmailSent")) {
                this.timeServiceConfigurationEmailSent(
                        model.getTimeServiceConfigurationEmailSent());
            }
            if (model.wasPropertyExplicitlySet("timeCustomerConfig")) {
                this.timeCustomerConfig(model.getTimeCustomerConfig());
            }
            if (model.wasPropertyExplicitlySet("timeAgreementEnd")) {
                this.timeAgreementEnd(model.getTimeAgreementEnd());
            }
            if (model.wasPropertyExplicitlySet("commitmentServices")) {
                this.commitmentServices(model.getCommitmentServices());
            }
            if (model.wasPropertyExplicitlySet("rateCards")) {
                this.rateCards(model.getRateCards());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("updatedBy")) {
                this.updatedBy(model.getUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("ratecardType")) {
                this.ratecardType(model.getRatecardType());
            }
            return this;
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
     * SPM internal Subscribed Service ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * SPM internal Subscribed Service ID
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Subscribed Service line type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Subscribed Service line type
     *
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * Subscribed service line number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * Subscribed service line number
     *
     * @return the value
     **/
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Subscription ID associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * Subscription ID associated to the subscribed service
     *
     * @return the value
     **/
    public String getSubscriptionId() {
        return subscriptionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final RateCardProduct product;

    public RateCardProduct getProduct() {
        return product;
    }

    /**
     * Subscribed service start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Subscribed service start date
     *
     * @return the value
     **/
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /**
     * Subscribed service end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Subscribed service end date
     *
     * @return the value
     **/
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /**
     * Subscribed service quantity
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Subscribed service quantity
     *
     * @return the value
     **/
    public String getQuantity() {
        return quantity;
    }

    /**
     * Subscribed service status
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Subscribed service status
     *
     * @return the value
     **/
    public String getStatus() {
        return status;
    }

    /**
     * Subscribed service operation type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationType")
    private final String operationType;

    /**
     * Subscribed service operation type
     *
     * @return the value
     **/
    public String getOperationType() {
        return operationType;
    }

    /**
     * Subscribed service net unit price
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Subscribed service net unit price
     *
     * @return the value
     **/
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Indicates the period for which the commitment amount can be utilised exceeding which the amount lapses. Also used in calculation of total contract line value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricePeriod")
    private final String pricePeriod;

    /**
     * Indicates the period for which the commitment amount can be utilised exceeding which the amount lapses. Also used in calculation of total contract line value
     *
     * @return the value
     **/
    public String getPricePeriod() {
        return pricePeriod;
    }

    /**
     * Subscribed service line net amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lineNetAmount")
    private final String lineNetAmount;

    /**
     * Subscribed service line net amount
     *
     * @return the value
     **/
    public String getLineNetAmount() {
        return lineNetAmount;
    }

    /**
     * Indicates if the commitment lines can have different quantities
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVariableCommitment")
    private final Boolean isVariableCommitment;

    /**
     * Indicates if the commitment lines can have different quantities
     *
     * @return the value
     **/
    public Boolean getIsVariableCommitment() {
        return isVariableCommitment;
    }

    /**
     * Indicates if a service can recieve usages and consequently have available amounts computed
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAllowance")
    private final Boolean isAllowance;

    /**
     * Indicates if a service can recieve usages and consequently have available amounts computed
     *
     * @return the value
     **/
    public Boolean getIsAllowance() {
        return isAllowance;
    }

    /**
     * Subscribed service used amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
    private final String usedAmount;

    /**
     * Subscribed service used amount
     *
     * @return the value
     **/
    public String getUsedAmount() {
        return usedAmount;
    }

    /**
     * Subscribed sercice available or remaining amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
    private final String availableAmount;

    /**
     * Subscribed sercice available or remaining amount
     *
     * @return the value
     **/
    public String getAvailableAmount() {
        return availableAmount;
    }

    /**
     * Funded Allocation line value
     * example: 12000.00
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    private final String fundedAllocationValue;

    /**
     * Funded Allocation line value
     * example: 12000.00
     *
     * @return the value
     **/
    public String getFundedAllocationValue() {
        return fundedAllocationValue;
    }

    /**
     * Indicator on whether or not there has been usage for the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHavingUsage")
    private final Boolean isHavingUsage;

    /**
     * Indicator on whether or not there has been usage for the subscribed service
     *
     * @return the value
     **/
    public Boolean getIsHavingUsage() {
        return isHavingUsage;
    }

    /**
     * If true compares rate between ratecard and the active pricelist and minimum rate would be fetched
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCapToPriceList")
    private final Boolean isCapToPriceList;

    /**
     * If true compares rate between ratecard and the active pricelist and minimum rate would be fetched
     *
     * @return the value
     **/
    public Boolean getIsCapToPriceList() {
        return isCapToPriceList;
    }

    /**
     * Subscribed service credit percentage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("creditPercentage")
    private final String creditPercentage;

    /**
     * Subscribed service credit percentage
     *
     * @return the value
     **/
    public String getCreditPercentage() {
        return creditPercentage;
    }

    /**
     * This field contains the name of the partner to which the subscription belongs - depending on which the invoicing may differ
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerTransactionType")
    private final String partnerTransactionType;

    /**
     * This field contains the name of the partner to which the subscription belongs - depending on which the invoicing may differ
     *
     * @return the value
     **/
    public String getPartnerTransactionType() {
        return partnerTransactionType;
    }

    /**
     * Used in context of service credit lines
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCreditEnabled")
    private final Boolean isCreditEnabled;

    /**
     * Used in context of service credit lines
     *
     * @return the value
     **/
    public Boolean getIsCreditEnabled() {
        return isCreditEnabled;
    }

    /**
     * Overage Policy of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overagePolicy")
    private final String overagePolicy;

    /**
     * Overage Policy of Subscribed Service
     *
     * @return the value
     **/
    public String getOveragePolicy() {
        return overagePolicy;
    }

    /**
     * Overage Bill To of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overageBillTo")
    private final String overageBillTo;

    /**
     * Overage Bill To of Subscribed Service
     *
     * @return the value
     **/
    public String getOverageBillTo() {
        return overageBillTo;
    }

    /**
     * Pay As You Go policy of Subscribed Service (Can be null - indicating no payg policy)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paygPolicy")
    private final String paygPolicy;

    /**
     * Pay As You Go policy of Subscribed Service (Can be null - indicating no payg policy)
     *
     * @return the value
     **/
    public String getPaygPolicy() {
        return paygPolicy;
    }

    /**
     * Not null if this service has an associated promotion line in SPM. Contains the line identifier from Order Management of
     * the associated promo line.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promoOrderLineId")
    private final Long promoOrderLineId;

    /**
     * Not null if this service has an associated promotion line in SPM. Contains the line identifier from Order Management of
     * the associated promo line.
     *
     * @return the value
     **/
    public Long getPromoOrderLineId() {
        return promoOrderLineId;
    }

    /**
     * Promotion Pricing Type of Subscribed Service (Can be null - indicating no promotion pricing)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promotionPricingType")
    private final String promotionPricingType;

    /**
     * Promotion Pricing Type of Subscribed Service (Can be null - indicating no promotion pricing)
     *
     * @return the value
     **/
    public String getPromotionPricingType() {
        return promotionPricingType;
    }

    /**
     * Subscribed service Rate Card Discount Percentage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardDiscountPercentage")
    private final String rateCardDiscountPercentage;

    /**
     * Subscribed service Rate Card Discount Percentage
     *
     * @return the value
     **/
    public String getRateCardDiscountPercentage() {
        return rateCardDiscountPercentage;
    }

    /**
     * Subscribed service Overage Discount Percentage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overageDiscountPercentage")
    private final String overageDiscountPercentage;

    /**
     * Subscribed service Overage Discount Percentage
     *
     * @return the value
     **/
    public String getOverageDiscountPercentage() {
        return overageDiscountPercentage;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToCustomer")
    private final SubscribedServiceBusinessPartner billToCustomer;

    public SubscribedServiceBusinessPartner getBillToCustomer() {
        return billToCustomer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToContact")
    private final SubscribedServiceUser billToContact;

    public SubscribedServiceUser getBillToContact() {
        return billToContact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("billToAddress")
    private final SubscribedServiceAddress billToAddress;

    public SubscribedServiceAddress getBillToAddress() {
        return billToAddress;
    }

    /**
     * Payment Number of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentNumber")
    private final String paymentNumber;

    /**
     * Payment Number of Subscribed Service
     *
     * @return the value
     **/
    public String getPaymentNumber() {
        return paymentNumber;
    }

    /**
     * Subscribed service payment expiry date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePaymentExpiry")
    private final java.util.Date timePaymentExpiry;

    /**
     * Subscribed service payment expiry date
     *
     * @return the value
     **/
    public java.util.Date getTimePaymentExpiry() {
        return timePaymentExpiry;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("paymentTerm")
    private final SubscribedServicePaymentTerm paymentTerm;

    public SubscribedServicePaymentTerm getPaymentTerm() {
        return paymentTerm;
    }

    /**
     * Payment Method of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentMethod")
    private final String paymentMethod;

    /**
     * Payment Method of Subscribed Service
     *
     * @return the value
     **/
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Subscribed service Transaction Extension Id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transactionExtensionId")
    private final Long transactionExtensionId;

    /**
     * Subscribed service Transaction Extension Id
     *
     * @return the value
     **/
    public Long getTransactionExtensionId() {
        return transactionExtensionId;
    }

    /**
     * Sales Channel of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("salesChannel")
    private final String salesChannel;

    /**
     * Sales Channel of Subscribed Service
     *
     * @return the value
     **/
    public String getSalesChannel() {
        return salesChannel;
    }

    /**
     * Subscribed service eligible to renew field
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eligibleToRenew")
    private final String eligibleToRenew;

    /**
     * Subscribed service eligible to renew field
     *
     * @return the value
     **/
    public String getEligibleToRenew() {
        return eligibleToRenew;
    }

    /**
     * SPM renewed Subscription ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("renewedSubscribedServiceId")
    private final String renewedSubscribedServiceId;

    /**
     * SPM renewed Subscription ID
     *
     * @return the value
     **/
    public String getRenewedSubscribedServiceId() {
        return renewedSubscribedServiceId;
    }

    /**
     * Term value in Months
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termValue")
    private final Long termValue;

    /**
     * Term value in Months
     *
     * @return the value
     **/
    public Long getTermValue() {
        return termValue;
    }

    /**
     * Term value UOM
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termValueUom")
    private final String termValueUom;

    /**
     * Term value UOM
     *
     * @return the value
     **/
    public String getTermValueUom() {
        return termValueUom;
    }

    /**
     * Subscribed service Opportunity Id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("renewalOptyId")
    private final Long renewalOptyId;

    /**
     * Subscribed service Opportunity Id
     *
     * @return the value
     **/
    public Long getRenewalOptyId() {
        return renewalOptyId;
    }

    /**
     * Renewal Opportunity Number of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("renewalOptyNumber")
    private final String renewalOptyNumber;

    /**
     * Renewal Opportunity Number of Subscribed Service
     *
     * @return the value
     **/
    public String getRenewalOptyNumber() {
        return renewalOptyNumber;
    }

    /**
     * Renewal Opportunity Type of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("renewalOptyType")
    private final String renewalOptyType;

    /**
     * Renewal Opportunity Type of Subscribed Service
     *
     * @return the value
     **/
    public String getRenewalOptyType() {
        return renewalOptyType;
    }

    /**
     * Booking Opportunity Number of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bookingOptyNumber")
    private final String bookingOptyNumber;

    /**
     * Booking Opportunity Number of Subscribed Service
     *
     * @return the value
     **/
    public String getBookingOptyNumber() {
        return bookingOptyNumber;
    }

    /**
     * Subscribed service Revenue Line Id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revenueLineId")
    private final Long revenueLineId;

    /**
     * Subscribed service Revenue Line Id
     *
     * @return the value
     **/
    public Long getRevenueLineId() {
        return revenueLineId;
    }

    /**
     * Revenue Line NUmber of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revenueLineNumber")
    private final String revenueLineNumber;

    /**
     * Revenue Line NUmber of Subscribed Service
     *
     * @return the value
     **/
    public String getRevenueLineNumber() {
        return revenueLineNumber;
    }

    /**
     * Subscribed service Major Set
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("majorSet")
    private final Long majorSet;

    /**
     * Subscribed service Major Set
     *
     * @return the value
     **/
    public Long getMajorSet() {
        return majorSet;
    }

    /**
     * Subscribed service Major Set Start date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMajorsetStart")
    private final java.util.Date timeMajorsetStart;

    /**
     * Subscribed service Major Set Start date
     *
     * @return the value
     **/
    public java.util.Date getTimeMajorsetStart() {
        return timeMajorsetStart;
    }

    /**
     * Subscribed service Major Set End date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMajorsetEnd")
    private final java.util.Date timeMajorsetEnd;

    /**
     * Subscribed service Major Set End date
     *
     * @return the value
     **/
    public java.util.Date getTimeMajorsetEnd() {
        return timeMajorsetEnd;
    }

    /**
     * Subscribed service System ARR
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemArrInLc")
    private final String systemArrInLc;

    /**
     * Subscribed service System ARR
     *
     * @return the value
     **/
    public String getSystemArrInLc() {
        return systemArrInLc;
    }

    /**
     * Subscribed service System ARR in Standard Currency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemArrInSc")
    private final String systemArrInSc;

    /**
     * Subscribed service System ARR in Standard Currency
     *
     * @return the value
     **/
    public String getSystemArrInSc() {
        return systemArrInSc;
    }

    /**
     * Subscribed service System ATR-ARR
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemAtrArrInLc")
    private final String systemAtrArrInLc;

    /**
     * Subscribed service System ATR-ARR
     *
     * @return the value
     **/
    public String getSystemAtrArrInLc() {
        return systemAtrArrInLc;
    }

    /**
     * Subscribed service System ATR-ARR in Standard Currency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemAtrArrInSc")
    private final String systemAtrArrInSc;

    /**
     * Subscribed service System ATR-ARR in Standard Currency
     *
     * @return the value
     **/
    public String getSystemAtrArrInSc() {
        return systemAtrArrInSc;
    }

    /**
     * Subscribed service Revised ARR
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revisedArrInLc")
    private final String revisedArrInLc;

    /**
     * Subscribed service Revised ARR
     *
     * @return the value
     **/
    public String getRevisedArrInLc() {
        return revisedArrInLc;
    }

    /**
     * Subscribed service Revised ARR in Standard Currency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revisedArrInSc")
    private final String revisedArrInSc;

    /**
     * Subscribed service Revised ARR in Standard Currency
     *
     * @return the value
     **/
    public String getRevisedArrInSc() {
        return revisedArrInSc;
    }

    /**
     * Subscribed service total value
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
    private final String totalValue;

    /**
     * Subscribed service total value
     *
     * @return the value
     **/
    public String getTotalValue() {
        return totalValue;
    }

    /**
     * Subscribed service Promotion Amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalPromoAmount")
    private final String originalPromoAmount;

    /**
     * Subscribed service Promotion Amount
     *
     * @return the value
     **/
    public String getOriginalPromoAmount() {
        return originalPromoAmount;
    }

    /**
     * Sales Order Header associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderHeaderId")
    private final Long orderHeaderId;

    /**
     * Sales Order Header associated to the subscribed service
     *
     * @return the value
     **/
    public Long getOrderHeaderId() {
        return orderHeaderId;
    }

    /**
     * Sales Order Number associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderNumber")
    private final Long orderNumber;

    /**
     * Sales Order Number associated to the subscribed service
     *
     * @return the value
     **/
    public Long getOrderNumber() {
        return orderNumber;
    }

    /**
     * Order Type of Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderType")
    private final String orderType;

    /**
     * Order Type of Subscribed Service
     *
     * @return the value
     **/
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sales Order Line Id associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderLineId")
    private final Long orderLineId;

    /**
     * Sales Order Line Id associated to the subscribed service
     *
     * @return the value
     **/
    public Long getOrderLineId() {
        return orderLineId;
    }

    /**
     * Sales Order Line Number associated to the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderLineNumber")
    private final Integer orderLineNumber;

    /**
     * Sales Order Line Number associated to the subscribed service
     *
     * @return the value
     **/
    public Integer getOrderLineNumber() {
        return orderLineNumber;
    }

    /**
     * Subscribed service commitment schedule Id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentScheduleId")
    private final String commitmentScheduleId;

    /**
     * Subscribed service commitment schedule Id
     *
     * @return the value
     **/
    public String getCommitmentScheduleId() {
        return commitmentScheduleId;
    }

    /**
     * Subscribed service sales account party id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("salesAccountPartyId")
    private final Long salesAccountPartyId;

    /**
     * Subscribed service sales account party id
     *
     * @return the value
     **/
    public Long getSalesAccountPartyId() {
        return salesAccountPartyId;
    }

    /**
     * Subscribed service data center
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    private final String dataCenter;

    /**
     * Subscribed service data center
     *
     * @return the value
     **/
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * Subscribed service data center region
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenterRegion")
    private final String dataCenterRegion;

    /**
     * Subscribed service data center region
     *
     * @return the value
     **/
    public String getDataCenterRegion() {
        return dataCenterRegion;
    }

    /**
     * Subscribed service admin email id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("adminEmail")
    private final String adminEmail;

    /**
     * Subscribed service admin email id
     *
     * @return the value
     **/
    public String getAdminEmail() {
        return adminEmail;
    }

    /**
     * Subscribed service buyer email id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("buyerEmail")
    private final String buyerEmail;

    /**
     * Subscribed service buyer email id
     *
     * @return the value
     **/
    public String getBuyerEmail() {
        return buyerEmail;
    }

    /**
     * Subscribed service source
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionSource")
    private final String subscriptionSource;

    /**
     * Subscribed service source
     *
     * @return the value
     **/
    public String getSubscriptionSource() {
        return subscriptionSource;
    }

    /**
     * Subscribed service provisioning source
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningSource")
    private final String provisioningSource;

    /**
     * Subscribed service provisioning source
     *
     * @return the value
     **/
    public String getProvisioningSource() {
        return provisioningSource;
    }

    /**
     * Subscribed service fulfillment set
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fulfillmentSet")
    private final String fulfillmentSet;

    /**
     * Subscribed service fulfillment set
     *
     * @return the value
     **/
    public String getFulfillmentSet() {
        return fulfillmentSet;
    }

    /**
     * Subscribed service intent to pay flag
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIntentToPay")
    private final Boolean isIntentToPay;

    /**
     * Subscribed service intent to pay flag
     *
     * @return the value
     **/
    public Boolean getIsIntentToPay() {
        return isIntentToPay;
    }

    /**
     * Subscribed service payg flag
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPayg")
    private final Boolean isPayg;

    /**
     * Subscribed service payg flag
     *
     * @return the value
     **/
    public Boolean getIsPayg() {
        return isPayg;
    }

    /**
     * Subscribed service pricing model
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
    private final String pricingModel;

    /**
     * Subscribed service pricing model
     *
     * @return the value
     **/
    public String getPricingModel() {
        return pricingModel;
    }

    /**
     * Subscribed service program type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("programType")
    private final String programType;

    /**
     * Subscribed service program type
     *
     * @return the value
     **/
    public String getProgramType() {
        return programType;
    }

    /**
     * Subscribed service start date type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDateType")
    private final String startDateType;

    /**
     * Subscribed service start date type
     *
     * @return the value
     **/
    public String getStartDateType() {
        return startDateType;
    }

    /**
     * Subscribed service provisioning date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeProvisioned")
    private final java.util.Date timeProvisioned;

    /**
     * Subscribed service provisioning date
     *
     * @return the value
     **/
    public java.util.Date getTimeProvisioned() {
        return timeProvisioned;
    }

    /**
     * Subscribed service promotion type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promoType")
    private final String promoType;

    /**
     * Subscribed service promotion type
     *
     * @return the value
     **/
    public String getPromoType() {
        return promoType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceToCustomer")
    private final SubscribedServiceBusinessPartner serviceToCustomer;

    public SubscribedServiceBusinessPartner getServiceToCustomer() {
        return serviceToCustomer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceToContact")
    private final SubscribedServiceUser serviceToContact;

    public SubscribedServiceUser getServiceToContact() {
        return serviceToContact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serviceToAddress")
    private final SubscribedServiceAddress serviceToAddress;

    public SubscribedServiceAddress getServiceToAddress() {
        return serviceToAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("soldToCustomer")
    private final SubscribedServiceBusinessPartner soldToCustomer;

    public SubscribedServiceBusinessPartner getSoldToCustomer() {
        return soldToCustomer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("soldToContact")
    private final SubscribedServiceUser soldToContact;

    public SubscribedServiceUser getSoldToContact() {
        return soldToContact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endUserCustomer")
    private final SubscribedServiceBusinessPartner endUserCustomer;

    public SubscribedServiceBusinessPartner getEndUserCustomer() {
        return endUserCustomer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endUserContact")
    private final SubscribedServiceUser endUserContact;

    public SubscribedServiceUser getEndUserContact() {
        return endUserContact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endUserAddress")
    private final SubscribedServiceAddress endUserAddress;

    public SubscribedServiceAddress getEndUserAddress() {
        return endUserAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resellerCustomer")
    private final SubscribedServiceBusinessPartner resellerCustomer;

    public SubscribedServiceBusinessPartner getResellerCustomer() {
        return resellerCustomer;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resellerContact")
    private final SubscribedServiceUser resellerContact;

    public SubscribedServiceUser getResellerContact() {
        return resellerContact;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resellerAddress")
    private final SubscribedServiceAddress resellerAddress;

    public SubscribedServiceAddress getResellerAddress() {
        return resellerAddress;
    }

    /**
     * Subscribed service CSI number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    private final Long csi;

    /**
     * Subscribed service CSI number
     *
     * @return the value
     **/
    public Long getCsi() {
        return csi;
    }

    /**
     * Identifier for a customer's transactions for purchase of ay oracle services
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerTransactionReference")
    private final String customerTransactionReference;

    /**
     * Identifier for a customer's transactions for purchase of ay oracle services
     *
     * @return the value
     **/
    public String getCustomerTransactionReference() {
        return customerTransactionReference;
    }

    /**
     * Subscribed service partner credit amount
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partnerCreditAmount")
    private final String partnerCreditAmount;

    /**
     * Subscribed service partner credit amount
     *
     * @return the value
     **/
    public String getPartnerCreditAmount() {
        return partnerCreditAmount;
    }

    /**
     * Indicates if the Subscribed service has a single ratecard
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSingleRateCard")
    private final Boolean isSingleRateCard;

    /**
     * Indicates if the Subscribed service has a single ratecard
     *
     * @return the value
     **/
    public Boolean getIsSingleRateCard() {
        return isSingleRateCard;
    }

    /**
     * Subscribed service agreement ID
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agreementId")
    private final Long agreementId;

    /**
     * Subscribed service agreement ID
     *
     * @return the value
     **/
    public Long getAgreementId() {
        return agreementId;
    }

    /**
     * Subscribed service agrrement name
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agreementName")
    private final String agreementName;

    /**
     * Subscribed service agrrement name
     *
     * @return the value
     **/
    public String getAgreementName() {
        return agreementName;
    }

    /**
     * Subscribed service agrrement type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agreementType")
    private final String agreementType;

    /**
     * Subscribed service agrrement type
     *
     * @return the value
     **/
    public String getAgreementType() {
        return agreementType;
    }

    /**
     * Subscribed service invoice frequency
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingFrequency")
    private final String billingFrequency;

    /**
     * Subscribed service invoice frequency
     *
     * @return the value
     **/
    public String getBillingFrequency() {
        return billingFrequency;
    }

    /**
     * Subscribed service welcome email sent date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeWelcomeEmailSent")
    private final java.util.Date timeWelcomeEmailSent;

    /**
     * Subscribed service welcome email sent date
     *
     * @return the value
     **/
    public java.util.Date getTimeWelcomeEmailSent() {
        return timeWelcomeEmailSent;
    }

    /**
     * Subscribed service service configuration email sent date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeServiceConfigurationEmailSent")
    private final java.util.Date timeServiceConfigurationEmailSent;

    /**
     * Subscribed service service configuration email sent date
     *
     * @return the value
     **/
    public java.util.Date getTimeServiceConfigurationEmailSent() {
        return timeServiceConfigurationEmailSent;
    }

    /**
     * Subscribed service customer config date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCustomerConfig")
    private final java.util.Date timeCustomerConfig;

    /**
     * Subscribed service customer config date
     *
     * @return the value
     **/
    public java.util.Date getTimeCustomerConfig() {
        return timeCustomerConfig;
    }

    /**
     * Subscribed service agrrement end date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAgreementEnd")
    private final java.util.Date timeAgreementEnd;

    /**
     * Subscribed service agrrement end date
     *
     * @return the value
     **/
    public java.util.Date getTimeAgreementEnd() {
        return timeAgreementEnd;
    }

    /**
     * List of Commitment services of a line
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServices")
    private final java.util.List<CommitmentService> commitmentServices;

    /**
     * List of Commitment services of a line
     *
     * @return the value
     **/
    public java.util.List<CommitmentService> getCommitmentServices() {
        return commitmentServices;
    }

    /**
     * List of Rate Cards of a Subscribed Service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCards")
    private final java.util.List<RateCardSummary> rateCards;

    /**
     * List of Rate Cards of a Subscribed Service
     *
     * @return the value
     **/
    public java.util.List<RateCardSummary> getRateCards() {
        return rateCards;
    }

    /**
     * Subscribed service creation date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Subscribed service creation date
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * User that created the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * User that created the subscribed service
     *
     * @return the value
     **/
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Subscribed service last update date
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Subscribed service last update date
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * User that updated the subscribed service
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    private final String updatedBy;

    /**
     * User that updated the subscribed service
     *
     * @return the value
     **/
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * SPM Ratecard Type
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ratecardType")
    private final String ratecardType;

    /**
     * SPM Ratecard Type
     *
     * @return the value
     **/
    public String getRatecardType() {
        return ratecardType;
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
        sb.append("SubscribedService(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", operationType=").append(String.valueOf(this.operationType));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", pricePeriod=").append(String.valueOf(this.pricePeriod));
        sb.append(", lineNetAmount=").append(String.valueOf(this.lineNetAmount));
        sb.append(", isVariableCommitment=").append(String.valueOf(this.isVariableCommitment));
        sb.append(", isAllowance=").append(String.valueOf(this.isAllowance));
        sb.append(", usedAmount=").append(String.valueOf(this.usedAmount));
        sb.append(", availableAmount=").append(String.valueOf(this.availableAmount));
        sb.append(", fundedAllocationValue=").append(String.valueOf(this.fundedAllocationValue));
        sb.append(", isHavingUsage=").append(String.valueOf(this.isHavingUsage));
        sb.append(", isCapToPriceList=").append(String.valueOf(this.isCapToPriceList));
        sb.append(", creditPercentage=").append(String.valueOf(this.creditPercentage));
        sb.append(", partnerTransactionType=").append(String.valueOf(this.partnerTransactionType));
        sb.append(", isCreditEnabled=").append(String.valueOf(this.isCreditEnabled));
        sb.append(", overagePolicy=").append(String.valueOf(this.overagePolicy));
        sb.append(", overageBillTo=").append(String.valueOf(this.overageBillTo));
        sb.append(", paygPolicy=").append(String.valueOf(this.paygPolicy));
        sb.append(", promoOrderLineId=").append(String.valueOf(this.promoOrderLineId));
        sb.append(", promotionPricingType=").append(String.valueOf(this.promotionPricingType));
        sb.append(", rateCardDiscountPercentage=")
                .append(String.valueOf(this.rateCardDiscountPercentage));
        sb.append(", overageDiscountPercentage=")
                .append(String.valueOf(this.overageDiscountPercentage));
        sb.append(", billToCustomer=").append(String.valueOf(this.billToCustomer));
        sb.append(", billToContact=").append(String.valueOf(this.billToContact));
        sb.append(", billToAddress=").append(String.valueOf(this.billToAddress));
        sb.append(", paymentNumber=").append(String.valueOf(this.paymentNumber));
        sb.append(", timePaymentExpiry=").append(String.valueOf(this.timePaymentExpiry));
        sb.append(", paymentTerm=").append(String.valueOf(this.paymentTerm));
        sb.append(", paymentMethod=").append(String.valueOf(this.paymentMethod));
        sb.append(", transactionExtensionId=").append(String.valueOf(this.transactionExtensionId));
        sb.append(", salesChannel=").append(String.valueOf(this.salesChannel));
        sb.append(", eligibleToRenew=").append(String.valueOf(this.eligibleToRenew));
        sb.append(", renewedSubscribedServiceId=")
                .append(String.valueOf(this.renewedSubscribedServiceId));
        sb.append(", termValue=").append(String.valueOf(this.termValue));
        sb.append(", termValueUom=").append(String.valueOf(this.termValueUom));
        sb.append(", renewalOptyId=").append(String.valueOf(this.renewalOptyId));
        sb.append(", renewalOptyNumber=").append(String.valueOf(this.renewalOptyNumber));
        sb.append(", renewalOptyType=").append(String.valueOf(this.renewalOptyType));
        sb.append(", bookingOptyNumber=").append(String.valueOf(this.bookingOptyNumber));
        sb.append(", revenueLineId=").append(String.valueOf(this.revenueLineId));
        sb.append(", revenueLineNumber=").append(String.valueOf(this.revenueLineNumber));
        sb.append(", majorSet=").append(String.valueOf(this.majorSet));
        sb.append(", timeMajorsetStart=").append(String.valueOf(this.timeMajorsetStart));
        sb.append(", timeMajorsetEnd=").append(String.valueOf(this.timeMajorsetEnd));
        sb.append(", systemArrInLc=").append(String.valueOf(this.systemArrInLc));
        sb.append(", systemArrInSc=").append(String.valueOf(this.systemArrInSc));
        sb.append(", systemAtrArrInLc=").append(String.valueOf(this.systemAtrArrInLc));
        sb.append(", systemAtrArrInSc=").append(String.valueOf(this.systemAtrArrInSc));
        sb.append(", revisedArrInLc=").append(String.valueOf(this.revisedArrInLc));
        sb.append(", revisedArrInSc=").append(String.valueOf(this.revisedArrInSc));
        sb.append(", totalValue=").append(String.valueOf(this.totalValue));
        sb.append(", originalPromoAmount=").append(String.valueOf(this.originalPromoAmount));
        sb.append(", orderHeaderId=").append(String.valueOf(this.orderHeaderId));
        sb.append(", orderNumber=").append(String.valueOf(this.orderNumber));
        sb.append(", orderType=").append(String.valueOf(this.orderType));
        sb.append(", orderLineId=").append(String.valueOf(this.orderLineId));
        sb.append(", orderLineNumber=").append(String.valueOf(this.orderLineNumber));
        sb.append(", commitmentScheduleId=").append(String.valueOf(this.commitmentScheduleId));
        sb.append(", salesAccountPartyId=").append(String.valueOf(this.salesAccountPartyId));
        sb.append(", dataCenter=").append(String.valueOf(this.dataCenter));
        sb.append(", dataCenterRegion=").append(String.valueOf(this.dataCenterRegion));
        sb.append(", adminEmail=").append(String.valueOf(this.adminEmail));
        sb.append(", buyerEmail=").append(String.valueOf(this.buyerEmail));
        sb.append(", subscriptionSource=").append(String.valueOf(this.subscriptionSource));
        sb.append(", provisioningSource=").append(String.valueOf(this.provisioningSource));
        sb.append(", fulfillmentSet=").append(String.valueOf(this.fulfillmentSet));
        sb.append(", isIntentToPay=").append(String.valueOf(this.isIntentToPay));
        sb.append(", isPayg=").append(String.valueOf(this.isPayg));
        sb.append(", pricingModel=").append(String.valueOf(this.pricingModel));
        sb.append(", programType=").append(String.valueOf(this.programType));
        sb.append(", startDateType=").append(String.valueOf(this.startDateType));
        sb.append(", timeProvisioned=").append(String.valueOf(this.timeProvisioned));
        sb.append(", promoType=").append(String.valueOf(this.promoType));
        sb.append(", serviceToCustomer=").append(String.valueOf(this.serviceToCustomer));
        sb.append(", serviceToContact=").append(String.valueOf(this.serviceToContact));
        sb.append(", serviceToAddress=").append(String.valueOf(this.serviceToAddress));
        sb.append(", soldToCustomer=").append(String.valueOf(this.soldToCustomer));
        sb.append(", soldToContact=").append(String.valueOf(this.soldToContact));
        sb.append(", endUserCustomer=").append(String.valueOf(this.endUserCustomer));
        sb.append(", endUserContact=").append(String.valueOf(this.endUserContact));
        sb.append(", endUserAddress=").append(String.valueOf(this.endUserAddress));
        sb.append(", resellerCustomer=").append(String.valueOf(this.resellerCustomer));
        sb.append(", resellerContact=").append(String.valueOf(this.resellerContact));
        sb.append(", resellerAddress=").append(String.valueOf(this.resellerAddress));
        sb.append(", csi=").append(String.valueOf(this.csi));
        sb.append(", customerTransactionReference=")
                .append(String.valueOf(this.customerTransactionReference));
        sb.append(", partnerCreditAmount=").append(String.valueOf(this.partnerCreditAmount));
        sb.append(", isSingleRateCard=").append(String.valueOf(this.isSingleRateCard));
        sb.append(", agreementId=").append(String.valueOf(this.agreementId));
        sb.append(", agreementName=").append(String.valueOf(this.agreementName));
        sb.append(", agreementType=").append(String.valueOf(this.agreementType));
        sb.append(", billingFrequency=").append(String.valueOf(this.billingFrequency));
        sb.append(", timeWelcomeEmailSent=").append(String.valueOf(this.timeWelcomeEmailSent));
        sb.append(", timeServiceConfigurationEmailSent=")
                .append(String.valueOf(this.timeServiceConfigurationEmailSent));
        sb.append(", timeCustomerConfig=").append(String.valueOf(this.timeCustomerConfig));
        sb.append(", timeAgreementEnd=").append(String.valueOf(this.timeAgreementEnd));
        sb.append(", commitmentServices=").append(String.valueOf(this.commitmentServices));
        sb.append(", rateCards=").append(String.valueOf(this.rateCards));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", updatedBy=").append(String.valueOf(this.updatedBy));
        sb.append(", ratecardType=").append(String.valueOf(this.ratecardType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscribedService)) {
            return false;
        }

        SubscribedService other = (SubscribedService) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.operationType, other.operationType)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.pricePeriod, other.pricePeriod)
                && java.util.Objects.equals(this.lineNetAmount, other.lineNetAmount)
                && java.util.Objects.equals(this.isVariableCommitment, other.isVariableCommitment)
                && java.util.Objects.equals(this.isAllowance, other.isAllowance)
                && java.util.Objects.equals(this.usedAmount, other.usedAmount)
                && java.util.Objects.equals(this.availableAmount, other.availableAmount)
                && java.util.Objects.equals(this.fundedAllocationValue, other.fundedAllocationValue)
                && java.util.Objects.equals(this.isHavingUsage, other.isHavingUsage)
                && java.util.Objects.equals(this.isCapToPriceList, other.isCapToPriceList)
                && java.util.Objects.equals(this.creditPercentage, other.creditPercentage)
                && java.util.Objects.equals(
                        this.partnerTransactionType, other.partnerTransactionType)
                && java.util.Objects.equals(this.isCreditEnabled, other.isCreditEnabled)
                && java.util.Objects.equals(this.overagePolicy, other.overagePolicy)
                && java.util.Objects.equals(this.overageBillTo, other.overageBillTo)
                && java.util.Objects.equals(this.paygPolicy, other.paygPolicy)
                && java.util.Objects.equals(this.promoOrderLineId, other.promoOrderLineId)
                && java.util.Objects.equals(this.promotionPricingType, other.promotionPricingType)
                && java.util.Objects.equals(
                        this.rateCardDiscountPercentage, other.rateCardDiscountPercentage)
                && java.util.Objects.equals(
                        this.overageDiscountPercentage, other.overageDiscountPercentage)
                && java.util.Objects.equals(this.billToCustomer, other.billToCustomer)
                && java.util.Objects.equals(this.billToContact, other.billToContact)
                && java.util.Objects.equals(this.billToAddress, other.billToAddress)
                && java.util.Objects.equals(this.paymentNumber, other.paymentNumber)
                && java.util.Objects.equals(this.timePaymentExpiry, other.timePaymentExpiry)
                && java.util.Objects.equals(this.paymentTerm, other.paymentTerm)
                && java.util.Objects.equals(this.paymentMethod, other.paymentMethod)
                && java.util.Objects.equals(
                        this.transactionExtensionId, other.transactionExtensionId)
                && java.util.Objects.equals(this.salesChannel, other.salesChannel)
                && java.util.Objects.equals(this.eligibleToRenew, other.eligibleToRenew)
                && java.util.Objects.equals(
                        this.renewedSubscribedServiceId, other.renewedSubscribedServiceId)
                && java.util.Objects.equals(this.termValue, other.termValue)
                && java.util.Objects.equals(this.termValueUom, other.termValueUom)
                && java.util.Objects.equals(this.renewalOptyId, other.renewalOptyId)
                && java.util.Objects.equals(this.renewalOptyNumber, other.renewalOptyNumber)
                && java.util.Objects.equals(this.renewalOptyType, other.renewalOptyType)
                && java.util.Objects.equals(this.bookingOptyNumber, other.bookingOptyNumber)
                && java.util.Objects.equals(this.revenueLineId, other.revenueLineId)
                && java.util.Objects.equals(this.revenueLineNumber, other.revenueLineNumber)
                && java.util.Objects.equals(this.majorSet, other.majorSet)
                && java.util.Objects.equals(this.timeMajorsetStart, other.timeMajorsetStart)
                && java.util.Objects.equals(this.timeMajorsetEnd, other.timeMajorsetEnd)
                && java.util.Objects.equals(this.systemArrInLc, other.systemArrInLc)
                && java.util.Objects.equals(this.systemArrInSc, other.systemArrInSc)
                && java.util.Objects.equals(this.systemAtrArrInLc, other.systemAtrArrInLc)
                && java.util.Objects.equals(this.systemAtrArrInSc, other.systemAtrArrInSc)
                && java.util.Objects.equals(this.revisedArrInLc, other.revisedArrInLc)
                && java.util.Objects.equals(this.revisedArrInSc, other.revisedArrInSc)
                && java.util.Objects.equals(this.totalValue, other.totalValue)
                && java.util.Objects.equals(this.originalPromoAmount, other.originalPromoAmount)
                && java.util.Objects.equals(this.orderHeaderId, other.orderHeaderId)
                && java.util.Objects.equals(this.orderNumber, other.orderNumber)
                && java.util.Objects.equals(this.orderType, other.orderType)
                && java.util.Objects.equals(this.orderLineId, other.orderLineId)
                && java.util.Objects.equals(this.orderLineNumber, other.orderLineNumber)
                && java.util.Objects.equals(this.commitmentScheduleId, other.commitmentScheduleId)
                && java.util.Objects.equals(this.salesAccountPartyId, other.salesAccountPartyId)
                && java.util.Objects.equals(this.dataCenter, other.dataCenter)
                && java.util.Objects.equals(this.dataCenterRegion, other.dataCenterRegion)
                && java.util.Objects.equals(this.adminEmail, other.adminEmail)
                && java.util.Objects.equals(this.buyerEmail, other.buyerEmail)
                && java.util.Objects.equals(this.subscriptionSource, other.subscriptionSource)
                && java.util.Objects.equals(this.provisioningSource, other.provisioningSource)
                && java.util.Objects.equals(this.fulfillmentSet, other.fulfillmentSet)
                && java.util.Objects.equals(this.isIntentToPay, other.isIntentToPay)
                && java.util.Objects.equals(this.isPayg, other.isPayg)
                && java.util.Objects.equals(this.pricingModel, other.pricingModel)
                && java.util.Objects.equals(this.programType, other.programType)
                && java.util.Objects.equals(this.startDateType, other.startDateType)
                && java.util.Objects.equals(this.timeProvisioned, other.timeProvisioned)
                && java.util.Objects.equals(this.promoType, other.promoType)
                && java.util.Objects.equals(this.serviceToCustomer, other.serviceToCustomer)
                && java.util.Objects.equals(this.serviceToContact, other.serviceToContact)
                && java.util.Objects.equals(this.serviceToAddress, other.serviceToAddress)
                && java.util.Objects.equals(this.soldToCustomer, other.soldToCustomer)
                && java.util.Objects.equals(this.soldToContact, other.soldToContact)
                && java.util.Objects.equals(this.endUserCustomer, other.endUserCustomer)
                && java.util.Objects.equals(this.endUserContact, other.endUserContact)
                && java.util.Objects.equals(this.endUserAddress, other.endUserAddress)
                && java.util.Objects.equals(this.resellerCustomer, other.resellerCustomer)
                && java.util.Objects.equals(this.resellerContact, other.resellerContact)
                && java.util.Objects.equals(this.resellerAddress, other.resellerAddress)
                && java.util.Objects.equals(this.csi, other.csi)
                && java.util.Objects.equals(
                        this.customerTransactionReference, other.customerTransactionReference)
                && java.util.Objects.equals(this.partnerCreditAmount, other.partnerCreditAmount)
                && java.util.Objects.equals(this.isSingleRateCard, other.isSingleRateCard)
                && java.util.Objects.equals(this.agreementId, other.agreementId)
                && java.util.Objects.equals(this.agreementName, other.agreementName)
                && java.util.Objects.equals(this.agreementType, other.agreementType)
                && java.util.Objects.equals(this.billingFrequency, other.billingFrequency)
                && java.util.Objects.equals(this.timeWelcomeEmailSent, other.timeWelcomeEmailSent)
                && java.util.Objects.equals(
                        this.timeServiceConfigurationEmailSent,
                        other.timeServiceConfigurationEmailSent)
                && java.util.Objects.equals(this.timeCustomerConfig, other.timeCustomerConfig)
                && java.util.Objects.equals(this.timeAgreementEnd, other.timeAgreementEnd)
                && java.util.Objects.equals(this.commitmentServices, other.commitmentServices)
                && java.util.Objects.equals(this.rateCards, other.rateCards)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.updatedBy, other.updatedBy)
                && java.util.Objects.equals(this.ratecardType, other.ratecardType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.operationType == null ? 43 : this.operationType.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.pricePeriod == null ? 43 : this.pricePeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.lineNetAmount == null ? 43 : this.lineNetAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.isVariableCommitment == null
                                ? 43
                                : this.isVariableCommitment.hashCode());
        result = (result * PRIME) + (this.isAllowance == null ? 43 : this.isAllowance.hashCode());
        result = (result * PRIME) + (this.usedAmount == null ? 43 : this.usedAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAmount == null ? 43 : this.availableAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.fundedAllocationValue == null
                                ? 43
                                : this.fundedAllocationValue.hashCode());
        result =
                (result * PRIME)
                        + (this.isHavingUsage == null ? 43 : this.isHavingUsage.hashCode());
        result =
                (result * PRIME)
                        + (this.isCapToPriceList == null ? 43 : this.isCapToPriceList.hashCode());
        result =
                (result * PRIME)
                        + (this.creditPercentage == null ? 43 : this.creditPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerTransactionType == null
                                ? 43
                                : this.partnerTransactionType.hashCode());
        result =
                (result * PRIME)
                        + (this.isCreditEnabled == null ? 43 : this.isCreditEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.overagePolicy == null ? 43 : this.overagePolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.overageBillTo == null ? 43 : this.overageBillTo.hashCode());
        result = (result * PRIME) + (this.paygPolicy == null ? 43 : this.paygPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.promoOrderLineId == null ? 43 : this.promoOrderLineId.hashCode());
        result =
                (result * PRIME)
                        + (this.promotionPricingType == null
                                ? 43
                                : this.promotionPricingType.hashCode());
        result =
                (result * PRIME)
                        + (this.rateCardDiscountPercentage == null
                                ? 43
                                : this.rateCardDiscountPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.overageDiscountPercentage == null
                                ? 43
                                : this.overageDiscountPercentage.hashCode());
        result =
                (result * PRIME)
                        + (this.billToCustomer == null ? 43 : this.billToCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.billToContact == null ? 43 : this.billToContact.hashCode());
        result =
                (result * PRIME)
                        + (this.billToAddress == null ? 43 : this.billToAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.paymentNumber == null ? 43 : this.paymentNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.timePaymentExpiry == null ? 43 : this.timePaymentExpiry.hashCode());
        result = (result * PRIME) + (this.paymentTerm == null ? 43 : this.paymentTerm.hashCode());
        result =
                (result * PRIME)
                        + (this.paymentMethod == null ? 43 : this.paymentMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.transactionExtensionId == null
                                ? 43
                                : this.transactionExtensionId.hashCode());
        result = (result * PRIME) + (this.salesChannel == null ? 43 : this.salesChannel.hashCode());
        result =
                (result * PRIME)
                        + (this.eligibleToRenew == null ? 43 : this.eligibleToRenew.hashCode());
        result =
                (result * PRIME)
                        + (this.renewedSubscribedServiceId == null
                                ? 43
                                : this.renewedSubscribedServiceId.hashCode());
        result = (result * PRIME) + (this.termValue == null ? 43 : this.termValue.hashCode());
        result = (result * PRIME) + (this.termValueUom == null ? 43 : this.termValueUom.hashCode());
        result =
                (result * PRIME)
                        + (this.renewalOptyId == null ? 43 : this.renewalOptyId.hashCode());
        result =
                (result * PRIME)
                        + (this.renewalOptyNumber == null ? 43 : this.renewalOptyNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.renewalOptyType == null ? 43 : this.renewalOptyType.hashCode());
        result =
                (result * PRIME)
                        + (this.bookingOptyNumber == null ? 43 : this.bookingOptyNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.revenueLineId == null ? 43 : this.revenueLineId.hashCode());
        result =
                (result * PRIME)
                        + (this.revenueLineNumber == null ? 43 : this.revenueLineNumber.hashCode());
        result = (result * PRIME) + (this.majorSet == null ? 43 : this.majorSet.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMajorsetStart == null ? 43 : this.timeMajorsetStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMajorsetEnd == null ? 43 : this.timeMajorsetEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.systemArrInLc == null ? 43 : this.systemArrInLc.hashCode());
        result =
                (result * PRIME)
                        + (this.systemArrInSc == null ? 43 : this.systemArrInSc.hashCode());
        result =
                (result * PRIME)
                        + (this.systemAtrArrInLc == null ? 43 : this.systemAtrArrInLc.hashCode());
        result =
                (result * PRIME)
                        + (this.systemAtrArrInSc == null ? 43 : this.systemAtrArrInSc.hashCode());
        result =
                (result * PRIME)
                        + (this.revisedArrInLc == null ? 43 : this.revisedArrInLc.hashCode());
        result =
                (result * PRIME)
                        + (this.revisedArrInSc == null ? 43 : this.revisedArrInSc.hashCode());
        result = (result * PRIME) + (this.totalValue == null ? 43 : this.totalValue.hashCode());
        result =
                (result * PRIME)
                        + (this.originalPromoAmount == null
                                ? 43
                                : this.originalPromoAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.orderHeaderId == null ? 43 : this.orderHeaderId.hashCode());
        result = (result * PRIME) + (this.orderNumber == null ? 43 : this.orderNumber.hashCode());
        result = (result * PRIME) + (this.orderType == null ? 43 : this.orderType.hashCode());
        result = (result * PRIME) + (this.orderLineId == null ? 43 : this.orderLineId.hashCode());
        result =
                (result * PRIME)
                        + (this.orderLineNumber == null ? 43 : this.orderLineNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentScheduleId == null
                                ? 43
                                : this.commitmentScheduleId.hashCode());
        result =
                (result * PRIME)
                        + (this.salesAccountPartyId == null
                                ? 43
                                : this.salesAccountPartyId.hashCode());
        result = (result * PRIME) + (this.dataCenter == null ? 43 : this.dataCenter.hashCode());
        result =
                (result * PRIME)
                        + (this.dataCenterRegion == null ? 43 : this.dataCenterRegion.hashCode());
        result = (result * PRIME) + (this.adminEmail == null ? 43 : this.adminEmail.hashCode());
        result = (result * PRIME) + (this.buyerEmail == null ? 43 : this.buyerEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionSource == null
                                ? 43
                                : this.subscriptionSource.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningSource == null
                                ? 43
                                : this.provisioningSource.hashCode());
        result =
                (result * PRIME)
                        + (this.fulfillmentSet == null ? 43 : this.fulfillmentSet.hashCode());
        result =
                (result * PRIME)
                        + (this.isIntentToPay == null ? 43 : this.isIntentToPay.hashCode());
        result = (result * PRIME) + (this.isPayg == null ? 43 : this.isPayg.hashCode());
        result = (result * PRIME) + (this.pricingModel == null ? 43 : this.pricingModel.hashCode());
        result = (result * PRIME) + (this.programType == null ? 43 : this.programType.hashCode());
        result =
                (result * PRIME)
                        + (this.startDateType == null ? 43 : this.startDateType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeProvisioned == null ? 43 : this.timeProvisioned.hashCode());
        result = (result * PRIME) + (this.promoType == null ? 43 : this.promoType.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceToCustomer == null ? 43 : this.serviceToCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceToContact == null ? 43 : this.serviceToContact.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceToAddress == null ? 43 : this.serviceToAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.soldToCustomer == null ? 43 : this.soldToCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.soldToContact == null ? 43 : this.soldToContact.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserCustomer == null ? 43 : this.endUserCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserContact == null ? 43 : this.endUserContact.hashCode());
        result =
                (result * PRIME)
                        + (this.endUserAddress == null ? 43 : this.endUserAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.resellerCustomer == null ? 43 : this.resellerCustomer.hashCode());
        result =
                (result * PRIME)
                        + (this.resellerContact == null ? 43 : this.resellerContact.hashCode());
        result =
                (result * PRIME)
                        + (this.resellerAddress == null ? 43 : this.resellerAddress.hashCode());
        result = (result * PRIME) + (this.csi == null ? 43 : this.csi.hashCode());
        result =
                (result * PRIME)
                        + (this.customerTransactionReference == null
                                ? 43
                                : this.customerTransactionReference.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerCreditAmount == null
                                ? 43
                                : this.partnerCreditAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.isSingleRateCard == null ? 43 : this.isSingleRateCard.hashCode());
        result = (result * PRIME) + (this.agreementId == null ? 43 : this.agreementId.hashCode());
        result =
                (result * PRIME)
                        + (this.agreementName == null ? 43 : this.agreementName.hashCode());
        result =
                (result * PRIME)
                        + (this.agreementType == null ? 43 : this.agreementType.hashCode());
        result =
                (result * PRIME)
                        + (this.billingFrequency == null ? 43 : this.billingFrequency.hashCode());
        result =
                (result * PRIME)
                        + (this.timeWelcomeEmailSent == null
                                ? 43
                                : this.timeWelcomeEmailSent.hashCode());
        result =
                (result * PRIME)
                        + (this.timeServiceConfigurationEmailSent == null
                                ? 43
                                : this.timeServiceConfigurationEmailSent.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCustomerConfig == null
                                ? 43
                                : this.timeCustomerConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAgreementEnd == null ? 43 : this.timeAgreementEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentServices == null
                                ? 43
                                : this.commitmentServices.hashCode());
        result = (result * PRIME) + (this.rateCards == null ? 43 : this.rateCards.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.updatedBy == null ? 43 : this.updatedBy.hashCode());
        result = (result * PRIME) + (this.ratecardType == null ? 43 : this.ratecardType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
