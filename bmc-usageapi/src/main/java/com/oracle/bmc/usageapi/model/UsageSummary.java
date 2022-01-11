/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The usage store result.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UsageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentPath")
        private String compartmentPath;

        public Builder compartmentPath(String compartmentPath) {
            this.compartmentPath = compartmentPath;
            this.__explicitlySet__.add("compartmentPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private String ad;

        public Builder ad(String ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private java.math.BigDecimal weight;

        public Builder weight(java.math.BigDecimal weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
        private String skuPartNumber;

        public Builder skuPartNumber(String skuPartNumber) {
            this.skuPartNumber = skuPartNumber;
            this.__explicitlySet__.add("skuPartNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skuName")
        private String skuName;

        public Builder skuName(String skuName) {
            this.skuName = skuName;
            this.__explicitlySet__.add("skuName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discount")
        private java.math.BigDecimal discount;

        public Builder discount(java.math.BigDecimal discount) {
            this.discount = discount;
            this.__explicitlySet__.add("discount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("listRate")
        private java.math.BigDecimal listRate;

        public Builder listRate(java.math.BigDecimal listRate) {
            this.listRate = listRate;
            this.__explicitlySet__.add("listRate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computedAmount")
        private java.math.BigDecimal computedAmount;

        public Builder computedAmount(java.math.BigDecimal computedAmount) {
            this.computedAmount = computedAmount;
            this.__explicitlySet__.add("computedAmount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computedQuantity")
        private java.math.BigDecimal computedQuantity;

        public Builder computedQuantity(java.math.BigDecimal computedQuantity) {
            this.computedQuantity = computedQuantity;
            this.__explicitlySet__.add("computedQuantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overagesFlag")
        private String overagesFlag;

        public Builder overagesFlag(String overagesFlag) {
            this.overagesFlag = overagesFlag;
            this.__explicitlySet__.add("overagesFlag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
        private java.math.BigDecimal unitPrice;

        public Builder unitPrice(java.math.BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            this.__explicitlySet__.add("unitPrice");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private String currency;

        public Builder currency(String currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("overage")
        private String overage;

        public Builder overage(String overage) {
            this.overage = overage;
            this.__explicitlySet__.add("overage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isForecast")
        private Boolean isForecast;

        public Builder isForecast(Boolean isForecast) {
            this.isForecast = isForecast;
            this.__explicitlySet__.add("isForecast");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageSummary build() {
            UsageSummary __instance__ =
                    new UsageSummary(
                            tenantId,
                            tenantName,
                            compartmentId,
                            compartmentPath,
                            compartmentName,
                            service,
                            resourceName,
                            resourceId,
                            region,
                            ad,
                            weight,
                            shape,
                            skuPartNumber,
                            skuName,
                            unit,
                            discount,
                            listRate,
                            platform,
                            timeUsageStarted,
                            timeUsageEnded,
                            computedAmount,
                            computedQuantity,
                            overagesFlag,
                            unitPrice,
                            currency,
                            subscriptionId,
                            overage,
                            isForecast,
                            tags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageSummary o) {
            Builder copiedBuilder =
                    tenantId(o.getTenantId())
                            .tenantName(o.getTenantName())
                            .compartmentId(o.getCompartmentId())
                            .compartmentPath(o.getCompartmentPath())
                            .compartmentName(o.getCompartmentName())
                            .service(o.getService())
                            .resourceName(o.getResourceName())
                            .resourceId(o.getResourceId())
                            .region(o.getRegion())
                            .ad(o.getAd())
                            .weight(o.getWeight())
                            .shape(o.getShape())
                            .skuPartNumber(o.getSkuPartNumber())
                            .skuName(o.getSkuName())
                            .unit(o.getUnit())
                            .discount(o.getDiscount())
                            .listRate(o.getListRate())
                            .platform(o.getPlatform())
                            .timeUsageStarted(o.getTimeUsageStarted())
                            .timeUsageEnded(o.getTimeUsageEnded())
                            .computedAmount(o.getComputedAmount())
                            .computedQuantity(o.getComputedQuantity())
                            .overagesFlag(o.getOveragesFlag())
                            .unitPrice(o.getUnitPrice())
                            .currency(o.getCurrency())
                            .subscriptionId(o.getSubscriptionId())
                            .overage(o.getOverage())
                            .isForecast(o.getIsForecast())
                            .tags(o.getTags());

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
     * The tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    /**
     * The tenancy name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    String tenantName;

    /**
     * The compartment OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The compartment path, starting from root.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentPath")
    String compartmentPath;

    /**
     * The compartment name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    String compartmentName;

    /**
     * The service name that is incurring the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    String service;

    /**
     * The resource name that is incurring the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    String resourceName;

    /**
     * The resource OCID that is incurring the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    String resourceId;

    /**
     * The region of the usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    String region;

    /**
     * The availability domain of the usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    String ad;

    /**
     * The resource size being metered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    java.math.BigDecimal weight;

    /**
     * The resource shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The SKU part number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
    String skuPartNumber;

    /**
     * The SKU friendly name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skuName")
    String skuName;

    /**
     * The usage unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    String unit;

    /**
     * The discretionary discount applied to the SKU.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discount")
    java.math.BigDecimal discount;

    /**
     * The SKU list rate (not discount).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listRate")
    java.math.BigDecimal listRate;

    /**
     * Platform for the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    String platform;

    /**
     * The usage start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    java.util.Date timeUsageStarted;

    /**
     * The usage end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    java.util.Date timeUsageEnded;

    /**
     * The computed cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedAmount")
    java.math.BigDecimal computedAmount;

    /**
     * The usage number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedQuantity")
    java.math.BigDecimal computedQuantity;

    /**
     * The SPM OverageFlag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overagesFlag")
    String overagesFlag;

    /**
     * The price per unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    java.math.BigDecimal unitPrice;

    /**
     * The price currency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    String currency;

    /**
     * The subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    String subscriptionId;

    /**
     * The overage usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overage")
    String overage;

    /**
     * The forecasted data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForecast")
    Boolean isForecast;

    /**
     * For grouping, a tag definition. For filtering, a definition and key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    java.util.List<Tag> tags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
