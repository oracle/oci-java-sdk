/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The created CCD offer details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CcdOffer.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CcdOffer extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "typeOfOffer",
        "sourceType",
        "reclaimTerm",
        "reclaimTermUnit",
        "lastUpdatedBy",
        "createdBy",
        "orderDocumentNumber",
        "customerSegment",
        "isFillerUsageEnable",
        "reportingRegion",
        "sku",
        "skuDisplayName",
        "skuMetric",
        "minQuantity",
        "maxQuantity",
        "term",
        "unit",
        "discountPct",
        "externalPriceOfSku",
        "offerRestriction",
        "bundleSkus",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeTerminated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags",
        "timeCcdOfferStarts",
        "timeCcdOfferEnds",
        "currencyCode",
        "listPrice",
        "subscriptionId",
        "compartmentId"
    })
    public CcdOffer(
            String id,
            String displayName,
            TypeOfOffer typeOfOffer,
            SourceType sourceType,
            Long reclaimTerm,
            ReclaimTermUnit reclaimTermUnit,
            String lastUpdatedBy,
            String createdBy,
            String orderDocumentNumber,
            CustomerSegment customerSegment,
            Boolean isFillerUsageEnable,
            String reportingRegion,
            String sku,
            String skuDisplayName,
            String skuMetric,
            Long minQuantity,
            Long maxQuantity,
            Integer term,
            Unit unit,
            String discountPct,
            java.util.List<SkuExternalPriceModel> externalPriceOfSku,
            OfferRestriction offerRestriction,
            java.util.List<BundleSku> bundleSkus,
            LifecycleState lifecycleState,
            LifecycleDetails lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeTerminated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            java.util.Date timeCcdOfferStarts,
            java.util.Date timeCcdOfferEnds,
            String currencyCode,
            String listPrice,
            String subscriptionId,
            String compartmentId) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.typeOfOffer = typeOfOffer;
        this.sourceType = sourceType;
        this.reclaimTerm = reclaimTerm;
        this.reclaimTermUnit = reclaimTermUnit;
        this.lastUpdatedBy = lastUpdatedBy;
        this.createdBy = createdBy;
        this.orderDocumentNumber = orderDocumentNumber;
        this.customerSegment = customerSegment;
        this.isFillerUsageEnable = isFillerUsageEnable;
        this.reportingRegion = reportingRegion;
        this.sku = sku;
        this.skuDisplayName = skuDisplayName;
        this.skuMetric = skuMetric;
        this.minQuantity = minQuantity;
        this.maxQuantity = maxQuantity;
        this.term = term;
        this.unit = unit;
        this.discountPct = discountPct;
        this.externalPriceOfSku = externalPriceOfSku;
        this.offerRestriction = offerRestriction;
        this.bundleSkus = bundleSkus;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeTerminated = timeTerminated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.timeCcdOfferStarts = timeCcdOfferStarts;
        this.timeCcdOfferEnds = timeCcdOfferEnds;
        this.currencyCode = currencyCode;
        this.listPrice = listPrice;
        this.subscriptionId = subscriptionId;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The CCD offer OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The CCD offer OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The CCD offer name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The CCD offer name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The CCD offer type. */
        @com.fasterxml.jackson.annotation.JsonProperty("typeOfOffer")
        private TypeOfOffer typeOfOffer;

        /**
         * The CCD offer type.
         *
         * @param typeOfOffer the value to set
         * @return this builder
         */
        public Builder typeOfOffer(TypeOfOffer typeOfOffer) {
            this.typeOfOffer = typeOfOffer;
            this.__explicitlySet__.add("typeOfOffer");
            return this;
        }
        /**
         * The commercial workflow that created the CCD offer/commitment. This value is immutable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * The commercial workflow that created the CCD offer/commitment. This value is immutable.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }
        /** The reclaim term for an offer, measured in {@code reclaimTermUnit}. */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimTerm")
        private Long reclaimTerm;

        /**
         * The reclaim term for an offer, measured in {@code reclaimTermUnit}.
         *
         * @param reclaimTerm the value to set
         * @return this builder
         */
        public Builder reclaimTerm(Long reclaimTerm) {
            this.reclaimTerm = reclaimTerm;
            this.__explicitlySet__.add("reclaimTerm");
            return this;
        }
        /** The unit used to measure {@code reclaimTerm}. */
        @com.fasterxml.jackson.annotation.JsonProperty("reclaimTermUnit")
        private ReclaimTermUnit reclaimTermUnit;

        /**
         * The unit used to measure {@code reclaimTerm}.
         *
         * @param reclaimTermUnit the value to set
         * @return this builder
         */
        public Builder reclaimTermUnit(ReclaimTermUnit reclaimTermUnit) {
            this.reclaimTermUnit = reclaimTermUnit;
            this.__explicitlySet__.add("reclaimTermUnit");
            return this;
        }
        /** Entity/User who lastly updated the ccdOffer. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
        private String lastUpdatedBy;

        /**
         * Entity/User who lastly updated the ccdOffer.
         *
         * @param lastUpdatedBy the value to set
         * @return this builder
         */
        public Builder lastUpdatedBy(String lastUpdatedBy) {
            this.lastUpdatedBy = lastUpdatedBy;
            this.__explicitlySet__.add("lastUpdatedBy");
            return this;
        }
        /** Entity/User who created the ccdOffer. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * Entity/User who created the ccdOffer.
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Sales order document number. */
        @com.fasterxml.jackson.annotation.JsonProperty("orderDocumentNumber")
        private String orderDocumentNumber;

        /**
         * Sales order document number.
         *
         * @param orderDocumentNumber the value to set
         * @return this builder
         */
        public Builder orderDocumentNumber(String orderDocumentNumber) {
            this.orderDocumentNumber = orderDocumentNumber;
            this.__explicitlySet__.add("orderDocumentNumber");
            return this;
        }
        /** The targeted customer segment. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerSegment")
        private CustomerSegment customerSegment;

        /**
         * The targeted customer segment.
         *
         * @param customerSegment the value to set
         * @return this builder
         */
        public Builder customerSegment(CustomerSegment customerSegment) {
            this.customerSegment = customerSegment;
            this.__explicitlySet__.add("customerSegment");
            return this;
        }
        /**
         * Enable or disable filler usage if the customer usage quantity is below the minimum
         * quantity, and you want metering to fill in usages to meet the minimum quantity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFillerUsageEnable")
        private Boolean isFillerUsageEnable;

        /**
         * Enable or disable filler usage if the customer usage quantity is below the minimum
         * quantity, and you want metering to fill in usages to meet the minimum quantity.
         *
         * @param isFillerUsageEnable the value to set
         * @return this builder
         */
        public Builder isFillerUsageEnable(Boolean isFillerUsageEnable) {
            this.isFillerUsageEnable = isFillerUsageEnable;
            this.__explicitlySet__.add("isFillerUsageEnable");
            return this;
        }
        /** Defines where the filler usage is reported */
        @com.fasterxml.jackson.annotation.JsonProperty("reportingRegion")
        private String reportingRegion;

        /**
         * Defines where the filler usage is reported
         *
         * @param reportingRegion the value to set
         * @return this builder
         */
        public Builder reportingRegion(String reportingRegion) {
            this.reportingRegion = reportingRegion;
            this.__explicitlySet__.add("reportingRegion");
            return this;
        }
        /** The SKU part number (prefaced with "B") the CCD is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * The SKU part number (prefaced with "B") the CCD is associated with.
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /** The canonical SKU display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
        private String skuDisplayName;

        /**
         * The canonical SKU display name.
         *
         * @param skuDisplayName the value to set
         * @return this builder
         */
        public Builder skuDisplayName(String skuDisplayName) {
            this.skuDisplayName = skuDisplayName;
            this.__explicitlySet__.add("skuDisplayName");
            return this;
        }
        /** The canonical billing metric. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
        private String skuMetric;

        /**
         * The canonical billing metric.
         *
         * @param skuMetric the value to set
         * @return this builder
         */
        public Builder skuMetric(String skuMetric) {
            this.skuMetric = skuMetric;
            this.__explicitlySet__.add("skuMetric");
            return this;
        }
        /**
         * The minimum quantity of the primary SKU committed to the CCD offer. For FLEX offers,
         * minQuantity and maxQuantity must both be equal if maxQuantity provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minQuantity")
        private Long minQuantity;

        /**
         * The minimum quantity of the primary SKU committed to the CCD offer. For FLEX offers,
         * minQuantity and maxQuantity must both be equal if maxQuantity provided.
         *
         * @param minQuantity the value to set
         * @return this builder
         */
        public Builder minQuantity(Long minQuantity) {
            this.minQuantity = minQuantity;
            this.__explicitlySet__.add("minQuantity");
            return this;
        }
        /**
         * The maximum quantity of the primary SKU committed to the CCD offer. For FLEX offers if
         * provided, it must equal minQuantity.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxQuantity")
        private Long maxQuantity;

        /**
         * The maximum quantity of the primary SKU committed to the CCD offer. For FLEX offers if
         * provided, it must equal minQuantity.
         *
         * @param maxQuantity the value to set
         * @return this builder
         */
        public Builder maxQuantity(Long maxQuantity) {
            this.maxQuantity = maxQuantity;
            this.__explicitlySet__.add("maxQuantity");
            return this;
        }
        /** The number of terms the offer is applicable to. */
        @com.fasterxml.jackson.annotation.JsonProperty("term")
        private Integer term;

        /**
         * The number of terms the offer is applicable to.
         *
         * @param term the value to set
         * @return this builder
         */
        public Builder term(Integer term) {
            this.term = term;
            this.__explicitlySet__.add("term");
            return this;
        }
        /** The term units. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * The term units.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * The discount percentage applicable to the CCD offer, represented as a decimal string from
         * 0 through 100 inclusive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("discountPct")
        private String discountPct;

        /**
         * The discount percentage applicable to the CCD offer, represented as a decimal string from
         * 0 through 100 inclusive.
         *
         * @param discountPct the value to set
         * @return this builder
         */
        public Builder discountPct(String discountPct) {
            this.discountPct = discountPct;
            this.__explicitlySet__.add("discountPct");
            return this;
        }
        /** The SKU list price in all currency codes. */
        @com.fasterxml.jackson.annotation.JsonProperty("externalPriceOfSku")
        private java.util.List<SkuExternalPriceModel> externalPriceOfSku;

        /**
         * The SKU list price in all currency codes.
         *
         * @param externalPriceOfSku the value to set
         * @return this builder
         */
        public Builder externalPriceOfSku(
                java.util.List<SkuExternalPriceModel> externalPriceOfSku) {
            this.externalPriceOfSku = externalPriceOfSku;
            this.__explicitlySet__.add("externalPriceOfSku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offerRestriction")
        private OfferRestriction offerRestriction;

        public Builder offerRestriction(OfferRestriction offerRestriction) {
            this.offerRestriction = offerRestriction;
            this.__explicitlySet__.add("offerRestriction");
            return this;
        }
        /**
         * The polymorphic bundled SKU definitions. Every bundled SKU in an offer must use the same
         * {@code quantityRule}; don't mix {@code FIXED_RATIO} and {@code CUSTOMER_SELECTED} bundled
         * SKUs in one offer. An offer can contain at most five SKUs in total, including the primary
         * SKU.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bundleSkus")
        private java.util.List<BundleSku> bundleSkus;

        /**
         * The polymorphic bundled SKU definitions. Every bundled SKU in an offer must use the same
         * {@code quantityRule}; don't mix {@code FIXED_RATIO} and {@code CUSTOMER_SELECTED} bundled
         * SKUs in one offer. An offer can contain at most five SKUs in total, including the primary
         * SKU.
         *
         * @param bundleSkus the value to set
         * @return this builder
         */
        public Builder bundleSkus(java.util.List<BundleSku> bundleSkus) {
            this.bundleSkus = bundleSkus;
            this.__explicitlySet__.add("bundleSkus");
            return this;
        }
        /**
         * Always defaults to {@code Active}. For the accurate resource state, refer to the {@code
         * lifecycleDetails} property value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Always defaults to {@code Active}. For the accurate resource state, refer to the {@code
         * lifecycleDetails} property value.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The CCD offer's detailed current state. The state value is determined by {@code
         * timeCcdOfferStarts}, {@code timeCcdOfferEnds}, and {@code timeTerminated} with respect to
         * the current time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetails lifecycleDetails;

        /**
         * The CCD offer's detailed current state. The state value is determined by {@code
         * timeCcdOfferStarts}, {@code timeCcdOfferEnds}, and {@code timeTerminated} with respect to
         * the current time.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
        private java.util.Date timeTerminated;

        /**
         * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
         * 2022-01-25T21:10:29.600Z}
         *
         * @param timeTerminated the value to set
         * @return this builder
         */
        public Builder timeTerminated(java.util.Date timeTerminated) {
            this.timeTerminated = timeTerminated;
            this.__explicitlySet__.add("timeTerminated");
            return this;
        }
        /**
         * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example:
         * {@code 2025-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example:
         * {@code 2025-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /**
         * The inclusive date the CCD offer will be effective. The format is defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCcdOfferStarts")
        private java.util.Date timeCcdOfferStarts;

        /**
         * The inclusive date the CCD offer will be effective. The format is defined by RFC 3339.
         *
         * @param timeCcdOfferStarts the value to set
         * @return this builder
         */
        public Builder timeCcdOfferStarts(java.util.Date timeCcdOfferStarts) {
            this.timeCcdOfferStarts = timeCcdOfferStarts;
            this.__explicitlySet__.add("timeCcdOfferStarts");
            return this;
        }
        /**
         * The inclusive time when the CCD offer is no longer in effect, and must be after {@code
         * timeCcdOfferStarts}. The format is defined by RFC 3339.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCcdOfferEnds")
        private java.util.Date timeCcdOfferEnds;

        /**
         * The inclusive time when the CCD offer is no longer in effect, and must be after {@code
         * timeCcdOfferStarts}. The format is defined by RFC 3339.
         *
         * @param timeCcdOfferEnds the value to set
         * @return this builder
         */
        public Builder timeCcdOfferEnds(java.util.Date timeCcdOfferEnds) {
            this.timeCcdOfferEnds = timeCcdOfferEnds;
            this.__explicitlySet__.add("timeCcdOfferEnds");
            return this;
        }
        /**
         * Currency code of listPrice associated with primary product/sku. This will be always null.
         * Please refer {@code externalPriceOfSku} to know product/sku's associated list price in
         * its currency code.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code of listPrice associated with primary product/sku. This will be always null.
         * Please refer {@code externalPriceOfSku} to know product/sku's associated list price in
         * its currency code.
         *
         * @param currencyCode the value to set
         * @return this builder
         */
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /**
         * ListPrice of a sku. Please refer {@code externalPriceOfSku} to know product/sku's
         * associated list price in its currency code.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("listPrice")
        private String listPrice;

        /**
         * ListPrice of a sku. Please refer {@code externalPriceOfSku} to know product/sku's
         * associated list price in its currency code.
         *
         * @param listPrice the value to set
         * @return this builder
         */
        public Builder listPrice(String listPrice) {
            this.listPrice = listPrice;
            this.__explicitlySet__.add("listPrice");
            return this;
        }
        /** The subscription OCID if a this is dedicated CCD offer for a customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The subscription OCID if a this is dedicated CCD offer for a customer.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * The root compartment OCID of the customer's tenancy if offer is dedicated to a particular
         * customer only.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The root compartment OCID of the customer's tenancy if offer is dedicated to a particular
         * customer only.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CcdOffer build() {
            CcdOffer model =
                    new CcdOffer(
                            this.id,
                            this.displayName,
                            this.typeOfOffer,
                            this.sourceType,
                            this.reclaimTerm,
                            this.reclaimTermUnit,
                            this.lastUpdatedBy,
                            this.createdBy,
                            this.orderDocumentNumber,
                            this.customerSegment,
                            this.isFillerUsageEnable,
                            this.reportingRegion,
                            this.sku,
                            this.skuDisplayName,
                            this.skuMetric,
                            this.minQuantity,
                            this.maxQuantity,
                            this.term,
                            this.unit,
                            this.discountPct,
                            this.externalPriceOfSku,
                            this.offerRestriction,
                            this.bundleSkus,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeTerminated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.timeCcdOfferStarts,
                            this.timeCcdOfferEnds,
                            this.currencyCode,
                            this.listPrice,
                            this.subscriptionId,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CcdOffer model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("typeOfOffer")) {
                this.typeOfOffer(model.getTypeOfOffer());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
            }
            if (model.wasPropertyExplicitlySet("reclaimTerm")) {
                this.reclaimTerm(model.getReclaimTerm());
            }
            if (model.wasPropertyExplicitlySet("reclaimTermUnit")) {
                this.reclaimTermUnit(model.getReclaimTermUnit());
            }
            if (model.wasPropertyExplicitlySet("lastUpdatedBy")) {
                this.lastUpdatedBy(model.getLastUpdatedBy());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("orderDocumentNumber")) {
                this.orderDocumentNumber(model.getOrderDocumentNumber());
            }
            if (model.wasPropertyExplicitlySet("customerSegment")) {
                this.customerSegment(model.getCustomerSegment());
            }
            if (model.wasPropertyExplicitlySet("isFillerUsageEnable")) {
                this.isFillerUsageEnable(model.getIsFillerUsageEnable());
            }
            if (model.wasPropertyExplicitlySet("reportingRegion")) {
                this.reportingRegion(model.getReportingRegion());
            }
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("skuDisplayName")) {
                this.skuDisplayName(model.getSkuDisplayName());
            }
            if (model.wasPropertyExplicitlySet("skuMetric")) {
                this.skuMetric(model.getSkuMetric());
            }
            if (model.wasPropertyExplicitlySet("minQuantity")) {
                this.minQuantity(model.getMinQuantity());
            }
            if (model.wasPropertyExplicitlySet("maxQuantity")) {
                this.maxQuantity(model.getMaxQuantity());
            }
            if (model.wasPropertyExplicitlySet("term")) {
                this.term(model.getTerm());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("discountPct")) {
                this.discountPct(model.getDiscountPct());
            }
            if (model.wasPropertyExplicitlySet("externalPriceOfSku")) {
                this.externalPriceOfSku(model.getExternalPriceOfSku());
            }
            if (model.wasPropertyExplicitlySet("offerRestriction")) {
                this.offerRestriction(model.getOfferRestriction());
            }
            if (model.wasPropertyExplicitlySet("bundleSkus")) {
                this.bundleSkus(model.getBundleSkus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeTerminated")) {
                this.timeTerminated(model.getTimeTerminated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("timeCcdOfferStarts")) {
                this.timeCcdOfferStarts(model.getTimeCcdOfferStarts());
            }
            if (model.wasPropertyExplicitlySet("timeCcdOfferEnds")) {
                this.timeCcdOfferEnds(model.getTimeCcdOfferEnds());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("listPrice")) {
                this.listPrice(model.getListPrice());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    /** The CCD offer OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The CCD offer OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The CCD offer name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The CCD offer name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The CCD offer type. */
    public enum TypeOfOffer implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        Custom("CUSTOM"),
        Private("PRIVATE"),
        Contractual("CONTRACTUAL"),
        Flex("FLEX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TypeOfOffer.class);

        private final String value;
        private static java.util.Map<String, TypeOfOffer> map;

        static {
            map = new java.util.HashMap<>();
            for (TypeOfOffer v : TypeOfOffer.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TypeOfOffer(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TypeOfOffer create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TypeOfOffer', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The CCD offer type. */
    @com.fasterxml.jackson.annotation.JsonProperty("typeOfOffer")
    private final TypeOfOffer typeOfOffer;

    /**
     * The CCD offer type.
     *
     * @return the value
     */
    public TypeOfOffer getTypeOfOffer() {
        return typeOfOffer;
    }

    /** The commercial workflow that created the CCD offer/commitment. This value is immutable. */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        ContractCommitment("CONTRACT_COMMITMENT"),
        ContractOffer("CONTRACT_OFFER"),
        Flex("FLEX"),
        OciGenerated("OCI_GENERATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SourceType.class);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The commercial workflow that created the CCD offer/commitment. This value is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * The commercial workflow that created the CCD offer/commitment. This value is immutable.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
    }

    /** The reclaim term for an offer, measured in {@code reclaimTermUnit}. */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimTerm")
    private final Long reclaimTerm;

    /**
     * The reclaim term for an offer, measured in {@code reclaimTermUnit}.
     *
     * @return the value
     */
    public Long getReclaimTerm() {
        return reclaimTerm;
    }

    /** The unit used to measure {@code reclaimTerm}. */
    public enum ReclaimTermUnit implements com.oracle.bmc.http.internal.BmcEnum {
        Days("DAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ReclaimTermUnit.class);

        private final String value;
        private static java.util.Map<String, ReclaimTermUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (ReclaimTermUnit v : ReclaimTermUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ReclaimTermUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ReclaimTermUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ReclaimTermUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The unit used to measure {@code reclaimTerm}. */
    @com.fasterxml.jackson.annotation.JsonProperty("reclaimTermUnit")
    private final ReclaimTermUnit reclaimTermUnit;

    /**
     * The unit used to measure {@code reclaimTerm}.
     *
     * @return the value
     */
    public ReclaimTermUnit getReclaimTermUnit() {
        return reclaimTermUnit;
    }

    /** Entity/User who lastly updated the ccdOffer. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastUpdatedBy")
    private final String lastUpdatedBy;

    /**
     * Entity/User who lastly updated the ccdOffer.
     *
     * @return the value
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /** Entity/User who created the ccdOffer. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * Entity/User who created the ccdOffer.
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /** Sales order document number. */
    @com.fasterxml.jackson.annotation.JsonProperty("orderDocumentNumber")
    private final String orderDocumentNumber;

    /**
     * Sales order document number.
     *
     * @return the value
     */
    public String getOrderDocumentNumber() {
        return orderDocumentNumber;
    }

    /** The targeted customer segment. */
    public enum CustomerSegment implements com.oracle.bmc.http.internal.BmcEnum {
        Internal("INTERNAL"),
        External("EXTERNAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CustomerSegment.class);

        private final String value;
        private static java.util.Map<String, CustomerSegment> map;

        static {
            map = new java.util.HashMap<>();
            for (CustomerSegment v : CustomerSegment.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CustomerSegment(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CustomerSegment create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CustomerSegment', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The targeted customer segment. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerSegment")
    private final CustomerSegment customerSegment;

    /**
     * The targeted customer segment.
     *
     * @return the value
     */
    public CustomerSegment getCustomerSegment() {
        return customerSegment;
    }

    /**
     * Enable or disable filler usage if the customer usage quantity is below the minimum quantity,
     * and you want metering to fill in usages to meet the minimum quantity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFillerUsageEnable")
    private final Boolean isFillerUsageEnable;

    /**
     * Enable or disable filler usage if the customer usage quantity is below the minimum quantity,
     * and you want metering to fill in usages to meet the minimum quantity.
     *
     * @return the value
     */
    public Boolean getIsFillerUsageEnable() {
        return isFillerUsageEnable;
    }

    /** Defines where the filler usage is reported */
    @com.fasterxml.jackson.annotation.JsonProperty("reportingRegion")
    private final String reportingRegion;

    /**
     * Defines where the filler usage is reported
     *
     * @return the value
     */
    public String getReportingRegion() {
        return reportingRegion;
    }

    /** The SKU part number (prefaced with "B") the CCD is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * The SKU part number (prefaced with "B") the CCD is associated with.
     *
     * @return the value
     */
    public String getSku() {
        return sku;
    }

    /** The canonical SKU display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuDisplayName")
    private final String skuDisplayName;

    /**
     * The canonical SKU display name.
     *
     * @return the value
     */
    public String getSkuDisplayName() {
        return skuDisplayName;
    }

    /** The canonical billing metric. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuMetric")
    private final String skuMetric;

    /**
     * The canonical billing metric.
     *
     * @return the value
     */
    public String getSkuMetric() {
        return skuMetric;
    }

    /**
     * The minimum quantity of the primary SKU committed to the CCD offer. For FLEX offers,
     * minQuantity and maxQuantity must both be equal if maxQuantity provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minQuantity")
    private final Long minQuantity;

    /**
     * The minimum quantity of the primary SKU committed to the CCD offer. For FLEX offers,
     * minQuantity and maxQuantity must both be equal if maxQuantity provided.
     *
     * @return the value
     */
    public Long getMinQuantity() {
        return minQuantity;
    }

    /**
     * The maximum quantity of the primary SKU committed to the CCD offer. For FLEX offers if
     * provided, it must equal minQuantity.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxQuantity")
    private final Long maxQuantity;

    /**
     * The maximum quantity of the primary SKU committed to the CCD offer. For FLEX offers if
     * provided, it must equal minQuantity.
     *
     * @return the value
     */
    public Long getMaxQuantity() {
        return maxQuantity;
    }

    /** The number of terms the offer is applicable to. */
    @com.fasterxml.jackson.annotation.JsonProperty("term")
    private final Integer term;

    /**
     * The number of terms the offer is applicable to.
     *
     * @return the value
     */
    public Integer getTerm() {
        return term;
    }

    /** The term units. */
    public enum Unit implements com.oracle.bmc.http.internal.BmcEnum {
        Months("MONTHS"),
        Years("YEARS"),
        Days("DAYS"),
        Hours("HOURS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Unit.class);

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Unit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Unit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Unit', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The term units. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * The term units.
     *
     * @return the value
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * The discount percentage applicable to the CCD offer, represented as a decimal string from 0
     * through 100 inclusive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("discountPct")
    private final String discountPct;

    /**
     * The discount percentage applicable to the CCD offer, represented as a decimal string from 0
     * through 100 inclusive.
     *
     * @return the value
     */
    public String getDiscountPct() {
        return discountPct;
    }

    /** The SKU list price in all currency codes. */
    @com.fasterxml.jackson.annotation.JsonProperty("externalPriceOfSku")
    private final java.util.List<SkuExternalPriceModel> externalPriceOfSku;

    /**
     * The SKU list price in all currency codes.
     *
     * @return the value
     */
    public java.util.List<SkuExternalPriceModel> getExternalPriceOfSku() {
        return externalPriceOfSku;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("offerRestriction")
    private final OfferRestriction offerRestriction;

    public OfferRestriction getOfferRestriction() {
        return offerRestriction;
    }

    /**
     * The polymorphic bundled SKU definitions. Every bundled SKU in an offer must use the same
     * {@code quantityRule}; don't mix {@code FIXED_RATIO} and {@code CUSTOMER_SELECTED} bundled
     * SKUs in one offer. An offer can contain at most five SKUs in total, including the primary
     * SKU.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bundleSkus")
    private final java.util.List<BundleSku> bundleSkus;

    /**
     * The polymorphic bundled SKU definitions. Every bundled SKU in an offer must use the same
     * {@code quantityRule}; don't mix {@code FIXED_RATIO} and {@code CUSTOMER_SELECTED} bundled
     * SKUs in one offer. An offer can contain at most five SKUs in total, including the primary
     * SKU.
     *
     * @return the value
     */
    public java.util.List<BundleSku> getBundleSkus() {
        return bundleSkus;
    }

    /**
     * Always defaults to {@code Active}. For the accurate resource state, refer to the {@code
     * lifecycleDetails} property value.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Always defaults to {@code Active}. For the accurate resource state, refer to the {@code
     * lifecycleDetails} property value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Always defaults to {@code Active}. For the accurate resource state, refer to the {@code
     * lifecycleDetails} property value.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The CCD offer's detailed current state. The state value is determined by {@code
     * timeCcdOfferStarts}, {@code timeCcdOfferEnds}, and {@code timeTerminated} with respect to the
     * current time.
     */
    public enum LifecycleDetails implements com.oracle.bmc.http.internal.BmcEnum {
        Scheduled("SCHEDULED"),
        Current("CURRENT"),
        Canceled("CANCELED"),
        Ended("ENDED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleDetails.class);

        private final String value;
        private static java.util.Map<String, LifecycleDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleDetails v : LifecycleDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The CCD offer's detailed current state. The state value is determined by {@code
     * timeCcdOfferStarts}, {@code timeCcdOfferEnds}, and {@code timeTerminated} with respect to the
     * current time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetails lifecycleDetails;

    /**
     * The CCD offer's detailed current state. The state value is determined by {@code
     * timeCcdOfferStarts}, {@code timeCcdOfferEnds}, and {@code timeTerminated} with respect to the
     * current time.
     *
     * @return the value
     */
    public LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the CCD was created. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeTerminated")
    private final java.util.Date timeTerminated;

    /**
     * Date and time the CCD was terminated. The format is defined by RFC 3339. Example: {@code
     * 2022-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeTerminated() {
        return timeTerminated;
    }

    /**
     * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example: {@code
     * 2025-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date and time the CCD was updated lastly. The format is defined by RFC 3339. Example: {@code
     * 2025-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The inclusive date the CCD offer will be effective. The format is defined by RFC 3339. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCcdOfferStarts")
    private final java.util.Date timeCcdOfferStarts;

    /**
     * The inclusive date the CCD offer will be effective. The format is defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCcdOfferStarts() {
        return timeCcdOfferStarts;
    }

    /**
     * The inclusive time when the CCD offer is no longer in effect, and must be after {@code
     * timeCcdOfferStarts}. The format is defined by RFC 3339.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCcdOfferEnds")
    private final java.util.Date timeCcdOfferEnds;

    /**
     * The inclusive time when the CCD offer is no longer in effect, and must be after {@code
     * timeCcdOfferStarts}. The format is defined by RFC 3339.
     *
     * @return the value
     */
    public java.util.Date getTimeCcdOfferEnds() {
        return timeCcdOfferEnds;
    }

    /**
     * Currency code of listPrice associated with primary product/sku. This will be always null.
     * Please refer {@code externalPriceOfSku} to know product/sku's associated list price in its
     * currency code.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code of listPrice associated with primary product/sku. This will be always null.
     * Please refer {@code externalPriceOfSku} to know product/sku's associated list price in its
     * currency code.
     *
     * @return the value
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ListPrice of a sku. Please refer {@code externalPriceOfSku} to know product/sku's associated
     * list price in its currency code.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("listPrice")
    private final String listPrice;

    /**
     * ListPrice of a sku. Please refer {@code externalPriceOfSku} to know product/sku's associated
     * list price in its currency code.
     *
     * @return the value
     */
    public String getListPrice() {
        return listPrice;
    }

    /** The subscription OCID if a this is dedicated CCD offer for a customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The subscription OCID if a this is dedicated CCD offer for a customer.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The root compartment OCID of the customer's tenancy if offer is dedicated to a particular
     * customer only.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The root compartment OCID of the customer's tenancy if offer is dedicated to a particular
     * customer only.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("CcdOffer(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", typeOfOffer=").append(String.valueOf(this.typeOfOffer));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(", reclaimTerm=").append(String.valueOf(this.reclaimTerm));
        sb.append(", reclaimTermUnit=").append(String.valueOf(this.reclaimTermUnit));
        sb.append(", lastUpdatedBy=").append(String.valueOf(this.lastUpdatedBy));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", orderDocumentNumber=").append(String.valueOf(this.orderDocumentNumber));
        sb.append(", customerSegment=").append(String.valueOf(this.customerSegment));
        sb.append(", isFillerUsageEnable=").append(String.valueOf(this.isFillerUsageEnable));
        sb.append(", reportingRegion=").append(String.valueOf(this.reportingRegion));
        sb.append(", sku=").append(String.valueOf(this.sku));
        sb.append(", skuDisplayName=").append(String.valueOf(this.skuDisplayName));
        sb.append(", skuMetric=").append(String.valueOf(this.skuMetric));
        sb.append(", minQuantity=").append(String.valueOf(this.minQuantity));
        sb.append(", maxQuantity=").append(String.valueOf(this.maxQuantity));
        sb.append(", term=").append(String.valueOf(this.term));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", discountPct=").append(String.valueOf(this.discountPct));
        sb.append(", externalPriceOfSku=").append(String.valueOf(this.externalPriceOfSku));
        sb.append(", offerRestriction=").append(String.valueOf(this.offerRestriction));
        sb.append(", bundleSkus=").append(String.valueOf(this.bundleSkus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeTerminated=").append(String.valueOf(this.timeTerminated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", timeCcdOfferStarts=").append(String.valueOf(this.timeCcdOfferStarts));
        sb.append(", timeCcdOfferEnds=").append(String.valueOf(this.timeCcdOfferEnds));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", listPrice=").append(String.valueOf(this.listPrice));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CcdOffer)) {
            return false;
        }

        CcdOffer other = (CcdOffer) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.typeOfOffer, other.typeOfOffer)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.reclaimTerm, other.reclaimTerm)
                && java.util.Objects.equals(this.reclaimTermUnit, other.reclaimTermUnit)
                && java.util.Objects.equals(this.lastUpdatedBy, other.lastUpdatedBy)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.orderDocumentNumber, other.orderDocumentNumber)
                && java.util.Objects.equals(this.customerSegment, other.customerSegment)
                && java.util.Objects.equals(this.isFillerUsageEnable, other.isFillerUsageEnable)
                && java.util.Objects.equals(this.reportingRegion, other.reportingRegion)
                && java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(this.skuDisplayName, other.skuDisplayName)
                && java.util.Objects.equals(this.skuMetric, other.skuMetric)
                && java.util.Objects.equals(this.minQuantity, other.minQuantity)
                && java.util.Objects.equals(this.maxQuantity, other.maxQuantity)
                && java.util.Objects.equals(this.term, other.term)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.discountPct, other.discountPct)
                && java.util.Objects.equals(this.externalPriceOfSku, other.externalPriceOfSku)
                && java.util.Objects.equals(this.offerRestriction, other.offerRestriction)
                && java.util.Objects.equals(this.bundleSkus, other.bundleSkus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeTerminated, other.timeTerminated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.timeCcdOfferStarts, other.timeCcdOfferStarts)
                && java.util.Objects.equals(this.timeCcdOfferEnds, other.timeCcdOfferEnds)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.listPrice, other.listPrice)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.typeOfOffer == null ? 43 : this.typeOfOffer.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.reclaimTerm == null ? 43 : this.reclaimTerm.hashCode());
        result =
                (result * PRIME)
                        + (this.reclaimTermUnit == null ? 43 : this.reclaimTermUnit.hashCode());
        result =
                (result * PRIME)
                        + (this.lastUpdatedBy == null ? 43 : this.lastUpdatedBy.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result =
                (result * PRIME)
                        + (this.orderDocumentNumber == null
                                ? 43
                                : this.orderDocumentNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.customerSegment == null ? 43 : this.customerSegment.hashCode());
        result =
                (result * PRIME)
                        + (this.isFillerUsageEnable == null
                                ? 43
                                : this.isFillerUsageEnable.hashCode());
        result =
                (result * PRIME)
                        + (this.reportingRegion == null ? 43 : this.reportingRegion.hashCode());
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result =
                (result * PRIME)
                        + (this.skuDisplayName == null ? 43 : this.skuDisplayName.hashCode());
        result = (result * PRIME) + (this.skuMetric == null ? 43 : this.skuMetric.hashCode());
        result = (result * PRIME) + (this.minQuantity == null ? 43 : this.minQuantity.hashCode());
        result = (result * PRIME) + (this.maxQuantity == null ? 43 : this.maxQuantity.hashCode());
        result = (result * PRIME) + (this.term == null ? 43 : this.term.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.discountPct == null ? 43 : this.discountPct.hashCode());
        result =
                (result * PRIME)
                        + (this.externalPriceOfSku == null
                                ? 43
                                : this.externalPriceOfSku.hashCode());
        result =
                (result * PRIME)
                        + (this.offerRestriction == null ? 43 : this.offerRestriction.hashCode());
        result = (result * PRIME) + (this.bundleSkus == null ? 43 : this.bundleSkus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeTerminated == null ? 43 : this.timeTerminated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCcdOfferStarts == null
                                ? 43
                                : this.timeCcdOfferStarts.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCcdOfferEnds == null ? 43 : this.timeCcdOfferEnds.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.listPrice == null ? 43 : this.listPrice.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
