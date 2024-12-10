/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantId",
        "tenantName",
        "compartmentId",
        "compartmentPath",
        "compartmentName",
        "service",
        "resourceName",
        "resourceId",
        "region",
        "ad",
        "weight",
        "shape",
        "skuPartNumber",
        "skuName",
        "unit",
        "discount",
        "listRate",
        "platform",
        "timeUsageStarted",
        "timeUsageEnded",
        "computedAmount",
        "computedQuantity",
        "attributedCost",
        "attributedUsage",
        "overagesFlag",
        "unitPrice",
        "currency",
        "subscriptionId",
        "overage",
        "isForecast",
        "tags"
    })
    public UsageSummary(
            String tenantId,
            String tenantName,
            String compartmentId,
            String compartmentPath,
            String compartmentName,
            String service,
            String resourceName,
            String resourceId,
            String region,
            String ad,
            java.math.BigDecimal weight,
            String shape,
            String skuPartNumber,
            String skuName,
            String unit,
            java.math.BigDecimal discount,
            java.math.BigDecimal listRate,
            String platform,
            java.util.Date timeUsageStarted,
            java.util.Date timeUsageEnded,
            java.math.BigDecimal computedAmount,
            java.math.BigDecimal computedQuantity,
            String attributedCost,
            String attributedUsage,
            String overagesFlag,
            java.math.BigDecimal unitPrice,
            String currency,
            String subscriptionId,
            String overage,
            Boolean isForecast,
            java.util.List<Tag> tags) {
        super();
        this.tenantId = tenantId;
        this.tenantName = tenantName;
        this.compartmentId = compartmentId;
        this.compartmentPath = compartmentPath;
        this.compartmentName = compartmentName;
        this.service = service;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.region = region;
        this.ad = ad;
        this.weight = weight;
        this.shape = shape;
        this.skuPartNumber = skuPartNumber;
        this.skuName = skuName;
        this.unit = unit;
        this.discount = discount;
        this.listRate = listRate;
        this.platform = platform;
        this.timeUsageStarted = timeUsageStarted;
        this.timeUsageEnded = timeUsageEnded;
        this.computedAmount = computedAmount;
        this.computedQuantity = computedQuantity;
        this.attributedCost = attributedCost;
        this.attributedUsage = attributedUsage;
        this.overagesFlag = overagesFlag;
        this.unitPrice = unitPrice;
        this.currency = currency;
        this.subscriptionId = subscriptionId;
        this.overage = overage;
        this.isForecast = isForecast;
        this.tags = tags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenancy OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        /**
         * The tenancy OCID.
         * @param tenantId the value to set
         * @return this builder
         **/
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }
        /**
         * The tenancy name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
        private String tenantName;

        /**
         * The tenancy name.
         * @param tenantName the value to set
         * @return this builder
         **/
        public Builder tenantName(String tenantName) {
            this.tenantName = tenantName;
            this.__explicitlySet__.add("tenantName");
            return this;
        }
        /**
         * The compartment OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment OCID.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The compartment path, starting from root.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentPath")
        private String compartmentPath;

        /**
         * The compartment path, starting from root.
         * @param compartmentPath the value to set
         * @return this builder
         **/
        public Builder compartmentPath(String compartmentPath) {
            this.compartmentPath = compartmentPath;
            this.__explicitlySet__.add("compartmentPath");
            return this;
        }
        /**
         * The compartment name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * The compartment name.
         * @param compartmentName the value to set
         * @return this builder
         **/
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }
        /**
         * The service name that is incurring the cost.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("service")
        private String service;

        /**
         * The service name that is incurring the cost.
         * @param service the value to set
         * @return this builder
         **/
        public Builder service(String service) {
            this.service = service;
            this.__explicitlySet__.add("service");
            return this;
        }
        /**
         * The resource name that is incurring the cost.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The resource name that is incurring the cost.
         * @param resourceName the value to set
         * @return this builder
         **/
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /**
         * The resource OCID that is incurring the cost.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The resource OCID that is incurring the cost.
         * @param resourceId the value to set
         * @return this builder
         **/
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /**
         * The region of the usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The region of the usage.
         * @param region the value to set
         * @return this builder
         **/
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The availability domain of the usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ad")
        private String ad;

        /**
         * The availability domain of the usage.
         * @param ad the value to set
         * @return this builder
         **/
        public Builder ad(String ad) {
            this.ad = ad;
            this.__explicitlySet__.add("ad");
            return this;
        }
        /**
         * The resource size being metered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("weight")
        private java.math.BigDecimal weight;

        /**
         * The resource size being metered.
         * @param weight the value to set
         * @return this builder
         **/
        public Builder weight(java.math.BigDecimal weight) {
            this.weight = weight;
            this.__explicitlySet__.add("weight");
            return this;
        }
        /**
         * The resource shape.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The resource shape.
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The SKU part number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
        private String skuPartNumber;

        /**
         * The SKU part number.
         * @param skuPartNumber the value to set
         * @return this builder
         **/
        public Builder skuPartNumber(String skuPartNumber) {
            this.skuPartNumber = skuPartNumber;
            this.__explicitlySet__.add("skuPartNumber");
            return this;
        }
        /**
         * The SKU friendly name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skuName")
        private String skuName;

        /**
         * The SKU friendly name.
         * @param skuName the value to set
         * @return this builder
         **/
        public Builder skuName(String skuName) {
            this.skuName = skuName;
            this.__explicitlySet__.add("skuName");
            return this;
        }
        /**
         * The usage unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * The usage unit.
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * The discretionary discount applied to the SKU.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("discount")
        private java.math.BigDecimal discount;

        /**
         * The discretionary discount applied to the SKU.
         * @param discount the value to set
         * @return this builder
         **/
        public Builder discount(java.math.BigDecimal discount) {
            this.discount = discount;
            this.__explicitlySet__.add("discount");
            return this;
        }
        /**
         * The SKU list rate (not discount).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listRate")
        private java.math.BigDecimal listRate;

        /**
         * The SKU list rate (not discount).
         * @param listRate the value to set
         * @return this builder
         **/
        public Builder listRate(java.math.BigDecimal listRate) {
            this.listRate = listRate;
            this.__explicitlySet__.add("listRate");
            return this;
        }
        /**
         * Platform for the cost.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("platform")
        private String platform;

        /**
         * Platform for the cost.
         * @param platform the value to set
         * @return this builder
         **/
        public Builder platform(String platform) {
            this.platform = platform;
            this.__explicitlySet__.add("platform");
            return this;
        }
        /**
         * The usage start time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
        private java.util.Date timeUsageStarted;

        /**
         * The usage start time.
         * @param timeUsageStarted the value to set
         * @return this builder
         **/
        public Builder timeUsageStarted(java.util.Date timeUsageStarted) {
            this.timeUsageStarted = timeUsageStarted;
            this.__explicitlySet__.add("timeUsageStarted");
            return this;
        }
        /**
         * The usage end time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
        private java.util.Date timeUsageEnded;

        /**
         * The usage end time.
         * @param timeUsageEnded the value to set
         * @return this builder
         **/
        public Builder timeUsageEnded(java.util.Date timeUsageEnded) {
            this.timeUsageEnded = timeUsageEnded;
            this.__explicitlySet__.add("timeUsageEnded");
            return this;
        }
        /**
         * The computed cost.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computedAmount")
        private java.math.BigDecimal computedAmount;

        /**
         * The computed cost.
         * @param computedAmount the value to set
         * @return this builder
         **/
        public Builder computedAmount(java.math.BigDecimal computedAmount) {
            this.computedAmount = computedAmount;
            this.__explicitlySet__.add("computedAmount");
            return this;
        }
        /**
         * The usage number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computedQuantity")
        private java.math.BigDecimal computedQuantity;

        /**
         * The usage number.
         * @param computedQuantity the value to set
         * @return this builder
         **/
        public Builder computedQuantity(java.math.BigDecimal computedQuantity) {
            this.computedQuantity = computedQuantity;
            this.__explicitlySet__.add("computedQuantity");
            return this;
        }
        /**
         * The attributed cost with a max value of 9999999999.999999999999 and a minimum value of 0.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributedCost")
        private String attributedCost;

        /**
         * The attributed cost with a max value of 9999999999.999999999999 and a minimum value of 0.
         * @param attributedCost the value to set
         * @return this builder
         **/
        public Builder attributedCost(String attributedCost) {
            this.attributedCost = attributedCost;
            this.__explicitlySet__.add("attributedCost");
            return this;
        }
        /**
         * The attributed usage with a max value of 9999999999.999999999999 and a minimum value of 0.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributedUsage")
        private String attributedUsage;

        /**
         * The attributed usage with a max value of 9999999999.999999999999 and a minimum value of 0.
         * @param attributedUsage the value to set
         * @return this builder
         **/
        public Builder attributedUsage(String attributedUsage) {
            this.attributedUsage = attributedUsage;
            this.__explicitlySet__.add("attributedUsage");
            return this;
        }
        /**
         * The SPM OverageFlag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overagesFlag")
        private String overagesFlag;

        /**
         * The SPM OverageFlag.
         * @param overagesFlag the value to set
         * @return this builder
         **/
        public Builder overagesFlag(String overagesFlag) {
            this.overagesFlag = overagesFlag;
            this.__explicitlySet__.add("overagesFlag");
            return this;
        }
        /**
         * The price per unit.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
        private java.math.BigDecimal unitPrice;

        /**
         * The price per unit.
         * @param unitPrice the value to set
         * @return this builder
         **/
        public Builder unitPrice(java.math.BigDecimal unitPrice) {
            this.unitPrice = unitPrice;
            this.__explicitlySet__.add("unitPrice");
            return this;
        }
        /**
         * The price currency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private String currency;

        /**
         * The price currency.
         * @param currency the value to set
         * @return this builder
         **/
        public Builder currency(String currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /**
         * The subscription ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The subscription ID.
         * @param subscriptionId the value to set
         * @return this builder
         **/
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * The overage usage.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("overage")
        private String overage;

        /**
         * The overage usage.
         * @param overage the value to set
         * @return this builder
         **/
        public Builder overage(String overage) {
            this.overage = overage;
            this.__explicitlySet__.add("overage");
            return this;
        }
        /**
         * The forecasted data.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isForecast")
        private Boolean isForecast;

        /**
         * The forecasted data.
         * @param isForecast the value to set
         * @return this builder
         **/
        public Builder isForecast(Boolean isForecast) {
            this.isForecast = isForecast;
            this.__explicitlySet__.add("isForecast");
            return this;
        }
        /**
         * For grouping, a tag definition. For filtering, a definition and key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private java.util.List<Tag> tags;

        /**
         * For grouping, a tag definition. For filtering, a definition and key.
         * @param tags the value to set
         * @return this builder
         **/
        public Builder tags(java.util.List<Tag> tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageSummary build() {
            UsageSummary model =
                    new UsageSummary(
                            this.tenantId,
                            this.tenantName,
                            this.compartmentId,
                            this.compartmentPath,
                            this.compartmentName,
                            this.service,
                            this.resourceName,
                            this.resourceId,
                            this.region,
                            this.ad,
                            this.weight,
                            this.shape,
                            this.skuPartNumber,
                            this.skuName,
                            this.unit,
                            this.discount,
                            this.listRate,
                            this.platform,
                            this.timeUsageStarted,
                            this.timeUsageEnded,
                            this.computedAmount,
                            this.computedQuantity,
                            this.attributedCost,
                            this.attributedUsage,
                            this.overagesFlag,
                            this.unitPrice,
                            this.currency,
                            this.subscriptionId,
                            this.overage,
                            this.isForecast,
                            this.tags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageSummary model) {
            if (model.wasPropertyExplicitlySet("tenantId")) {
                this.tenantId(model.getTenantId());
            }
            if (model.wasPropertyExplicitlySet("tenantName")) {
                this.tenantName(model.getTenantName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentPath")) {
                this.compartmentPath(model.getCompartmentPath());
            }
            if (model.wasPropertyExplicitlySet("compartmentName")) {
                this.compartmentName(model.getCompartmentName());
            }
            if (model.wasPropertyExplicitlySet("service")) {
                this.service(model.getService());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("ad")) {
                this.ad(model.getAd());
            }
            if (model.wasPropertyExplicitlySet("weight")) {
                this.weight(model.getWeight());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("skuPartNumber")) {
                this.skuPartNumber(model.getSkuPartNumber());
            }
            if (model.wasPropertyExplicitlySet("skuName")) {
                this.skuName(model.getSkuName());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("discount")) {
                this.discount(model.getDiscount());
            }
            if (model.wasPropertyExplicitlySet("listRate")) {
                this.listRate(model.getListRate());
            }
            if (model.wasPropertyExplicitlySet("platform")) {
                this.platform(model.getPlatform());
            }
            if (model.wasPropertyExplicitlySet("timeUsageStarted")) {
                this.timeUsageStarted(model.getTimeUsageStarted());
            }
            if (model.wasPropertyExplicitlySet("timeUsageEnded")) {
                this.timeUsageEnded(model.getTimeUsageEnded());
            }
            if (model.wasPropertyExplicitlySet("computedAmount")) {
                this.computedAmount(model.getComputedAmount());
            }
            if (model.wasPropertyExplicitlySet("computedQuantity")) {
                this.computedQuantity(model.getComputedQuantity());
            }
            if (model.wasPropertyExplicitlySet("attributedCost")) {
                this.attributedCost(model.getAttributedCost());
            }
            if (model.wasPropertyExplicitlySet("attributedUsage")) {
                this.attributedUsage(model.getAttributedUsage());
            }
            if (model.wasPropertyExplicitlySet("overagesFlag")) {
                this.overagesFlag(model.getOveragesFlag());
            }
            if (model.wasPropertyExplicitlySet("unitPrice")) {
                this.unitPrice(model.getUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("overage")) {
                this.overage(model.getOverage());
            }
            if (model.wasPropertyExplicitlySet("isForecast")) {
                this.isForecast(model.getIsForecast());
            }
            if (model.wasPropertyExplicitlySet("tags")) {
                this.tags(model.getTags());
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
     * The tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    private final String tenantId;

    /**
     * The tenancy OCID.
     * @return the value
     **/
    public String getTenantId() {
        return tenantId;
    }

    /**
     * The tenancy name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantName")
    private final String tenantName;

    /**
     * The tenancy name.
     * @return the value
     **/
    public String getTenantName() {
        return tenantName;
    }

    /**
     * The compartment OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment OCID.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The compartment path, starting from root.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentPath")
    private final String compartmentPath;

    /**
     * The compartment path, starting from root.
     * @return the value
     **/
    public String getCompartmentPath() {
        return compartmentPath;
    }

    /**
     * The compartment name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * The compartment name.
     * @return the value
     **/
    public String getCompartmentName() {
        return compartmentName;
    }

    /**
     * The service name that is incurring the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("service")
    private final String service;

    /**
     * The service name that is incurring the cost.
     * @return the value
     **/
    public String getService() {
        return service;
    }

    /**
     * The resource name that is incurring the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The resource name that is incurring the cost.
     * @return the value
     **/
    public String getResourceName() {
        return resourceName;
    }

    /**
     * The resource OCID that is incurring the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The resource OCID that is incurring the cost.
     * @return the value
     **/
    public String getResourceId() {
        return resourceId;
    }

    /**
     * The region of the usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The region of the usage.
     * @return the value
     **/
    public String getRegion() {
        return region;
    }

    /**
     * The availability domain of the usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ad")
    private final String ad;

    /**
     * The availability domain of the usage.
     * @return the value
     **/
    public String getAd() {
        return ad;
    }

    /**
     * The resource size being metered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("weight")
    private final java.math.BigDecimal weight;

    /**
     * The resource size being metered.
     * @return the value
     **/
    public java.math.BigDecimal getWeight() {
        return weight;
    }

    /**
     * The resource shape.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The resource shape.
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * The SKU part number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
    private final String skuPartNumber;

    /**
     * The SKU part number.
     * @return the value
     **/
    public String getSkuPartNumber() {
        return skuPartNumber;
    }

    /**
     * The SKU friendly name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skuName")
    private final String skuName;

    /**
     * The SKU friendly name.
     * @return the value
     **/
    public String getSkuName() {
        return skuName;
    }

    /**
     * The usage unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * The usage unit.
     * @return the value
     **/
    public String getUnit() {
        return unit;
    }

    /**
     * The discretionary discount applied to the SKU.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discount")
    private final java.math.BigDecimal discount;

    /**
     * The discretionary discount applied to the SKU.
     * @return the value
     **/
    public java.math.BigDecimal getDiscount() {
        return discount;
    }

    /**
     * The SKU list rate (not discount).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listRate")
    private final java.math.BigDecimal listRate;

    /**
     * The SKU list rate (not discount).
     * @return the value
     **/
    public java.math.BigDecimal getListRate() {
        return listRate;
    }

    /**
     * Platform for the cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platform")
    private final String platform;

    /**
     * Platform for the cost.
     * @return the value
     **/
    public String getPlatform() {
        return platform;
    }

    /**
     * The usage start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageStarted")
    private final java.util.Date timeUsageStarted;

    /**
     * The usage start time.
     * @return the value
     **/
    public java.util.Date getTimeUsageStarted() {
        return timeUsageStarted;
    }

    /**
     * The usage end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUsageEnded")
    private final java.util.Date timeUsageEnded;

    /**
     * The usage end time.
     * @return the value
     **/
    public java.util.Date getTimeUsageEnded() {
        return timeUsageEnded;
    }

    /**
     * The computed cost.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedAmount")
    private final java.math.BigDecimal computedAmount;

    /**
     * The computed cost.
     * @return the value
     **/
    public java.math.BigDecimal getComputedAmount() {
        return computedAmount;
    }

    /**
     * The usage number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedQuantity")
    private final java.math.BigDecimal computedQuantity;

    /**
     * The usage number.
     * @return the value
     **/
    public java.math.BigDecimal getComputedQuantity() {
        return computedQuantity;
    }

    /**
     * The attributed cost with a max value of 9999999999.999999999999 and a minimum value of 0.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributedCost")
    private final String attributedCost;

    /**
     * The attributed cost with a max value of 9999999999.999999999999 and a minimum value of 0.
     * @return the value
     **/
    public String getAttributedCost() {
        return attributedCost;
    }

    /**
     * The attributed usage with a max value of 9999999999.999999999999 and a minimum value of 0.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributedUsage")
    private final String attributedUsage;

    /**
     * The attributed usage with a max value of 9999999999.999999999999 and a minimum value of 0.
     * @return the value
     **/
    public String getAttributedUsage() {
        return attributedUsage;
    }

    /**
     * The SPM OverageFlag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overagesFlag")
    private final String overagesFlag;

    /**
     * The SPM OverageFlag.
     * @return the value
     **/
    public String getOveragesFlag() {
        return overagesFlag;
    }

    /**
     * The price per unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitPrice")
    private final java.math.BigDecimal unitPrice;

    /**
     * The price per unit.
     * @return the value
     **/
    public java.math.BigDecimal getUnitPrice() {
        return unitPrice;
    }

    /**
     * The price currency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final String currency;

    /**
     * The price currency.
     * @return the value
     **/
    public String getCurrency() {
        return currency;
    }

    /**
     * The subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The subscription ID.
     * @return the value
     **/
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * The overage usage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("overage")
    private final String overage;

    /**
     * The overage usage.
     * @return the value
     **/
    public String getOverage() {
        return overage;
    }

    /**
     * The forecasted data.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isForecast")
    private final Boolean isForecast;

    /**
     * The forecasted data.
     * @return the value
     **/
    public Boolean getIsForecast() {
        return isForecast;
    }

    /**
     * For grouping, a tag definition. For filtering, a definition and key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    private final java.util.List<Tag> tags;

    /**
     * For grouping, a tag definition. For filtering, a definition and key.
     * @return the value
     **/
    public java.util.List<Tag> getTags() {
        return tags;
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
        sb.append("UsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("tenantId=").append(String.valueOf(this.tenantId));
        sb.append(", tenantName=").append(String.valueOf(this.tenantName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentPath=").append(String.valueOf(this.compartmentPath));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", service=").append(String.valueOf(this.service));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", ad=").append(String.valueOf(this.ad));
        sb.append(", weight=").append(String.valueOf(this.weight));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", skuPartNumber=").append(String.valueOf(this.skuPartNumber));
        sb.append(", skuName=").append(String.valueOf(this.skuName));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", discount=").append(String.valueOf(this.discount));
        sb.append(", listRate=").append(String.valueOf(this.listRate));
        sb.append(", platform=").append(String.valueOf(this.platform));
        sb.append(", timeUsageStarted=").append(String.valueOf(this.timeUsageStarted));
        sb.append(", timeUsageEnded=").append(String.valueOf(this.timeUsageEnded));
        sb.append(", computedAmount=").append(String.valueOf(this.computedAmount));
        sb.append(", computedQuantity=").append(String.valueOf(this.computedQuantity));
        sb.append(", attributedCost=").append(String.valueOf(this.attributedCost));
        sb.append(", attributedUsage=").append(String.valueOf(this.attributedUsage));
        sb.append(", overagesFlag=").append(String.valueOf(this.overagesFlag));
        sb.append(", unitPrice=").append(String.valueOf(this.unitPrice));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", overage=").append(String.valueOf(this.overage));
        sb.append(", isForecast=").append(String.valueOf(this.isForecast));
        sb.append(", tags=").append(String.valueOf(this.tags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageSummary)) {
            return false;
        }

        UsageSummary other = (UsageSummary) o;
        return java.util.Objects.equals(this.tenantId, other.tenantId)
                && java.util.Objects.equals(this.tenantName, other.tenantName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compartmentPath, other.compartmentPath)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.service, other.service)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.ad, other.ad)
                && java.util.Objects.equals(this.weight, other.weight)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.skuPartNumber, other.skuPartNumber)
                && java.util.Objects.equals(this.skuName, other.skuName)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.discount, other.discount)
                && java.util.Objects.equals(this.listRate, other.listRate)
                && java.util.Objects.equals(this.platform, other.platform)
                && java.util.Objects.equals(this.timeUsageStarted, other.timeUsageStarted)
                && java.util.Objects.equals(this.timeUsageEnded, other.timeUsageEnded)
                && java.util.Objects.equals(this.computedAmount, other.computedAmount)
                && java.util.Objects.equals(this.computedQuantity, other.computedQuantity)
                && java.util.Objects.equals(this.attributedCost, other.attributedCost)
                && java.util.Objects.equals(this.attributedUsage, other.attributedUsage)
                && java.util.Objects.equals(this.overagesFlag, other.overagesFlag)
                && java.util.Objects.equals(this.unitPrice, other.unitPrice)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.overage, other.overage)
                && java.util.Objects.equals(this.isForecast, other.isForecast)
                && java.util.Objects.equals(this.tags, other.tags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantId == null ? 43 : this.tenantId.hashCode());
        result = (result * PRIME) + (this.tenantName == null ? 43 : this.tenantName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentPath == null ? 43 : this.compartmentPath.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result = (result * PRIME) + (this.service == null ? 43 : this.service.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.ad == null ? 43 : this.ad.hashCode());
        result = (result * PRIME) + (this.weight == null ? 43 : this.weight.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.skuPartNumber == null ? 43 : this.skuPartNumber.hashCode());
        result = (result * PRIME) + (this.skuName == null ? 43 : this.skuName.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + (this.discount == null ? 43 : this.discount.hashCode());
        result = (result * PRIME) + (this.listRate == null ? 43 : this.listRate.hashCode());
        result = (result * PRIME) + (this.platform == null ? 43 : this.platform.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageStarted == null ? 43 : this.timeUsageStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUsageEnded == null ? 43 : this.timeUsageEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.computedAmount == null ? 43 : this.computedAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.computedQuantity == null ? 43 : this.computedQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.attributedCost == null ? 43 : this.attributedCost.hashCode());
        result =
                (result * PRIME)
                        + (this.attributedUsage == null ? 43 : this.attributedUsage.hashCode());
        result = (result * PRIME) + (this.overagesFlag == null ? 43 : this.overagesFlag.hashCode());
        result = (result * PRIME) + (this.unitPrice == null ? 43 : this.unitPrice.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.overage == null ? 43 : this.overage.hashCode());
        result = (result * PRIME) + (this.isForecast == null ? 43 : this.isForecast.hashCode());
        result = (result * PRIME) + (this.tags == null ? 43 : this.tags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
