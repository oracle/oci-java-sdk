/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.model;

/**
 * Computed Usage Summary object
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComputedUsageSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComputedUsageSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeCreated",
        "timeUpdated",
        "parentSubscribedServiceId",
        "parentProduct",
        "planNumber",
        "currencyCode",
        "rateCardTierdId",
        "rateCardId",
        "computeSource",
        "dataCenter",
        "mqsMessageId",
        "computedUsageId",
        "quantity",
        "usageNumber",
        "originalUsageNumber",
        "commitmentServiceId",
        "isInvoiced",
        "type",
        "timeOfArrival",
        "timeMeteredOn",
        "netUnitPrice",
        "costRounded",
        "cost",
        "product",
        "unitOfMeasure"
    })
    public ComputedUsageSummary(
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String parentSubscribedServiceId,
            Product parentProduct,
            String planNumber,
            String currencyCode,
            String rateCardTierdId,
            String rateCardId,
            String computeSource,
            String dataCenter,
            String mqsMessageId,
            String computedUsageId,
            String quantity,
            String usageNumber,
            String originalUsageNumber,
            String commitmentServiceId,
            Boolean isInvoiced,
            Type type,
            java.util.Date timeOfArrival,
            java.util.Date timeMeteredOn,
            String netUnitPrice,
            String costRounded,
            String cost,
            Product product,
            String unitOfMeasure) {
        super();
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.parentSubscribedServiceId = parentSubscribedServiceId;
        this.parentProduct = parentProduct;
        this.planNumber = planNumber;
        this.currencyCode = currencyCode;
        this.rateCardTierdId = rateCardTierdId;
        this.rateCardId = rateCardId;
        this.computeSource = computeSource;
        this.dataCenter = dataCenter;
        this.mqsMessageId = mqsMessageId;
        this.computedUsageId = computedUsageId;
        this.quantity = quantity;
        this.usageNumber = usageNumber;
        this.originalUsageNumber = originalUsageNumber;
        this.commitmentServiceId = commitmentServiceId;
        this.isInvoiced = isInvoiced;
        this.type = type;
        this.timeOfArrival = timeOfArrival;
        this.timeMeteredOn = timeMeteredOn;
        this.netUnitPrice = netUnitPrice;
        this.costRounded = costRounded;
        this.cost = cost;
        this.product = product;
        this.unitOfMeasure = unitOfMeasure;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Computed Usage created time, expressed in RFC 3339 timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Computed Usage created time, expressed in RFC 3339 timestamp format.
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
         * Computed Usage updated time, expressed in RFC 3339 timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Computed Usage updated time, expressed in RFC 3339 timestamp format.
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
         * Subscribed service line parent id
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
        private String parentSubscribedServiceId;

        /**
         * Subscribed service line parent id
         *
         * @param parentSubscribedServiceId the value to set
         * @return this builder
         **/
        public Builder parentSubscribedServiceId(String parentSubscribedServiceId) {
            this.parentSubscribedServiceId = parentSubscribedServiceId;
            this.__explicitlySet__.add("parentSubscribedServiceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
        private Product parentProduct;

        public Builder parentProduct(Product parentProduct) {
            this.parentProduct = parentProduct;
            this.__explicitlySet__.add("parentProduct");
            return this;
        }
        /**
         * Subscription plan number
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
        private String planNumber;

        /**
         * Subscription plan number
         *
         * @param planNumber the value to set
         * @return this builder
         **/
        public Builder planNumber(String planNumber) {
            this.planNumber = planNumber;
            this.__explicitlySet__.add("planNumber");
            return this;
        }
        /**
         * Currency code
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
        private String currencyCode;

        /**
         * Currency code
         *
         * @param currencyCode the value to set
         * @return this builder
         **/
        public Builder currencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            this.__explicitlySet__.add("currencyCode");
            return this;
        }
        /**
         * References the tier in the ratecard for that usage (OCI will be using the same reference to cross-reference for correctness on the usage csv report), comes from Entity OBSCNTR_IPT_PRODUCTTIER.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rateCardTierdId")
        private String rateCardTierdId;

        /**
         * References the tier in the ratecard for that usage (OCI will be using the same reference to cross-reference for correctness on the usage csv report), comes from Entity OBSCNTR_IPT_PRODUCTTIER.
         *
         * @param rateCardTierdId the value to set
         * @return this builder
         **/
        public Builder rateCardTierdId(String rateCardTierdId) {
            this.rateCardTierdId = rateCardTierdId;
            this.__explicitlySet__.add("rateCardTierdId");
            return this;
        }
        /**
         * Ratecard Id at subscribed service level
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
        private String rateCardId;

        /**
         * Ratecard Id at subscribed service level
         *
         * @param rateCardId the value to set
         * @return this builder
         **/
        public Builder rateCardId(String rateCardId) {
            this.rateCardId = rateCardId;
            this.__explicitlySet__.add("rateCardId");
            return this;
        }
        /**
         * SPM Internal compute records source .
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computeSource")
        private String computeSource;

        /**
         * SPM Internal compute records source .
         *
         * @param computeSource the value to set
         * @return this builder
         **/
        public Builder computeSource(String computeSource) {
            this.computeSource = computeSource;
            this.__explicitlySet__.add("computeSource");
            return this;
        }
        /**
         * Data Center Attribute as sent by MQS to SPM.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
        private String dataCenter;

        /**
         * Data Center Attribute as sent by MQS to SPM.
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
         * MQS Identfier send to SPM , SPM does not transform this attribute and is received as is.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mqsMessageId")
        private String mqsMessageId;

        /**
         * MQS Identfier send to SPM , SPM does not transform this attribute and is received as is.
         *
         * @param mqsMessageId the value to set
         * @return this builder
         **/
        public Builder mqsMessageId(String mqsMessageId) {
            this.mqsMessageId = mqsMessageId;
            this.__explicitlySet__.add("mqsMessageId");
            return this;
        }
        /**
         * SPM Internal computed usage Id , 32 character string
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("computedUsageId")
        private String computedUsageId;

        /**
         * SPM Internal computed usage Id , 32 character string
         *
         * @param computedUsageId the value to set
         * @return this builder
         **/
        public Builder computedUsageId(String computedUsageId) {
            this.computedUsageId = computedUsageId;
            this.__explicitlySet__.add("computedUsageId");
            return this;
        }
        /**
         * Total Quantity that was used for computation
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Total Quantity that was used for computation
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
         * SPM Internal usage Line number identifier in SPM coming from Metered Services entity.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageNumber")
        private String usageNumber;

        /**
         * SPM Internal usage Line number identifier in SPM coming from Metered Services entity.
         *
         * @param usageNumber the value to set
         * @return this builder
         **/
        public Builder usageNumber(String usageNumber) {
            this.usageNumber = usageNumber;
            this.__explicitlySet__.add("usageNumber");
            return this;
        }
        /**
         * SPM Internal Original usage Line number identifier in SPM coming from Metered Services entity.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originalUsageNumber")
        private String originalUsageNumber;

        /**
         * SPM Internal Original usage Line number identifier in SPM coming from Metered Services entity.
         *
         * @param originalUsageNumber the value to set
         * @return this builder
         **/
        public Builder originalUsageNumber(String originalUsageNumber) {
            this.originalUsageNumber = originalUsageNumber;
            this.__explicitlySet__.add("originalUsageNumber");
            return this;
        }
        /**
         * Subscribed service commitmentId.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentServiceId")
        private String commitmentServiceId;

        /**
         * Subscribed service commitmentId.
         *
         * @param commitmentServiceId the value to set
         * @return this builder
         **/
        public Builder commitmentServiceId(String commitmentServiceId) {
            this.commitmentServiceId = commitmentServiceId;
            this.__explicitlySet__.add("commitmentServiceId");
            return this;
        }
        /**
         * Invoicing status for the aggregated compute usage
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInvoiced")
        private Boolean isInvoiced;

        /**
         * Invoicing status for the aggregated compute usage
         *
         * @param isInvoiced the value to set
         * @return this builder
         **/
        public Builder isInvoiced(Boolean isInvoiced) {
            this.isInvoiced = isInvoiced;
            this.__explicitlySet__.add("isInvoiced");
            return this;
        }
        /**
         * Usage compute type in SPM.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Usage compute type in SPM.
         *
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Usae computation date, expressed in RFC 3339 timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfArrival")
        private java.util.Date timeOfArrival;

        /**
         * Usae computation date, expressed in RFC 3339 timestamp format.
         *
         * @param timeOfArrival the value to set
         * @return this builder
         **/
        public Builder timeOfArrival(java.util.Date timeOfArrival) {
            this.timeOfArrival = timeOfArrival;
            this.__explicitlySet__.add("timeOfArrival");
            return this;
        }
        /**
         * Metered Service date, expressed in RFC 3339 timestamp format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
        private java.util.Date timeMeteredOn;

        /**
         * Metered Service date, expressed in RFC 3339 timestamp format.
         *
         * @param timeMeteredOn the value to set
         * @return this builder
         **/
        public Builder timeMeteredOn(java.util.Date timeMeteredOn) {
            this.timeMeteredOn = timeMeteredOn;
            this.__explicitlySet__.add("timeMeteredOn");
            return this;
        }
        /**
         * Net Unit Price for the product in consideration, price actual.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
        private String netUnitPrice;

        /**
         * Net Unit Price for the product in consideration, price actual.
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
         * Computed Line Amount rounded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
        private String costRounded;

        /**
         * Computed Line Amount rounded.
         *
         * @param costRounded the value to set
         * @return this builder
         **/
        public Builder costRounded(String costRounded) {
            this.costRounded = costRounded;
            this.__explicitlySet__.add("costRounded");
            return this;
        }
        /**
         * Computed Line Amount not rounded
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cost")
        private String cost;

        /**
         * Computed Line Amount not rounded
         *
         * @param cost the value to set
         * @return this builder
         **/
        public Builder cost(String cost) {
            this.cost = cost;
            this.__explicitlySet__.add("cost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("product")
        private Product product;

        public Builder product(Product product) {
            this.product = product;
            this.__explicitlySet__.add("product");
            return this;
        }
        /**
         * Unit of Messure
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        /**
         * Unit of Messure
         *
         * @param unitOfMeasure the value to set
         * @return this builder
         **/
        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageSummary build() {
            ComputedUsageSummary model =
                    new ComputedUsageSummary(
                            this.timeCreated,
                            this.timeUpdated,
                            this.parentSubscribedServiceId,
                            this.parentProduct,
                            this.planNumber,
                            this.currencyCode,
                            this.rateCardTierdId,
                            this.rateCardId,
                            this.computeSource,
                            this.dataCenter,
                            this.mqsMessageId,
                            this.computedUsageId,
                            this.quantity,
                            this.usageNumber,
                            this.originalUsageNumber,
                            this.commitmentServiceId,
                            this.isInvoiced,
                            this.type,
                            this.timeOfArrival,
                            this.timeMeteredOn,
                            this.netUnitPrice,
                            this.costRounded,
                            this.cost,
                            this.product,
                            this.unitOfMeasure);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageSummary model) {
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("parentSubscribedServiceId")) {
                this.parentSubscribedServiceId(model.getParentSubscribedServiceId());
            }
            if (model.wasPropertyExplicitlySet("parentProduct")) {
                this.parentProduct(model.getParentProduct());
            }
            if (model.wasPropertyExplicitlySet("planNumber")) {
                this.planNumber(model.getPlanNumber());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("rateCardTierdId")) {
                this.rateCardTierdId(model.getRateCardTierdId());
            }
            if (model.wasPropertyExplicitlySet("rateCardId")) {
                this.rateCardId(model.getRateCardId());
            }
            if (model.wasPropertyExplicitlySet("computeSource")) {
                this.computeSource(model.getComputeSource());
            }
            if (model.wasPropertyExplicitlySet("dataCenter")) {
                this.dataCenter(model.getDataCenter());
            }
            if (model.wasPropertyExplicitlySet("mqsMessageId")) {
                this.mqsMessageId(model.getMqsMessageId());
            }
            if (model.wasPropertyExplicitlySet("computedUsageId")) {
                this.computedUsageId(model.getComputedUsageId());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("usageNumber")) {
                this.usageNumber(model.getUsageNumber());
            }
            if (model.wasPropertyExplicitlySet("originalUsageNumber")) {
                this.originalUsageNumber(model.getOriginalUsageNumber());
            }
            if (model.wasPropertyExplicitlySet("commitmentServiceId")) {
                this.commitmentServiceId(model.getCommitmentServiceId());
            }
            if (model.wasPropertyExplicitlySet("isInvoiced")) {
                this.isInvoiced(model.getIsInvoiced());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("timeOfArrival")) {
                this.timeOfArrival(model.getTimeOfArrival());
            }
            if (model.wasPropertyExplicitlySet("timeMeteredOn")) {
                this.timeMeteredOn(model.getTimeMeteredOn());
            }
            if (model.wasPropertyExplicitlySet("netUnitPrice")) {
                this.netUnitPrice(model.getNetUnitPrice());
            }
            if (model.wasPropertyExplicitlySet("costRounded")) {
                this.costRounded(model.getCostRounded());
            }
            if (model.wasPropertyExplicitlySet("cost")) {
                this.cost(model.getCost());
            }
            if (model.wasPropertyExplicitlySet("product")) {
                this.product(model.getProduct());
            }
            if (model.wasPropertyExplicitlySet("unitOfMeasure")) {
                this.unitOfMeasure(model.getUnitOfMeasure());
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
     * Computed Usage created time, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Computed Usage created time, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Computed Usage updated time, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Computed Usage updated time, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Subscribed service line parent id
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
    private final String parentSubscribedServiceId;

    /**
     * Subscribed service line parent id
     *
     * @return the value
     **/
    public String getParentSubscribedServiceId() {
        return parentSubscribedServiceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
    private final Product parentProduct;

    public Product getParentProduct() {
        return parentProduct;
    }

    /**
     * Subscription plan number
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
    private final String planNumber;

    /**
     * Subscription plan number
     *
     * @return the value
     **/
    public String getPlanNumber() {
        return planNumber;
    }

    /**
     * Currency code
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currencyCode")
    private final String currencyCode;

    /**
     * Currency code
     *
     * @return the value
     **/
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * References the tier in the ratecard for that usage (OCI will be using the same reference to cross-reference for correctness on the usage csv report), comes from Entity OBSCNTR_IPT_PRODUCTTIER.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardTierdId")
    private final String rateCardTierdId;

    /**
     * References the tier in the ratecard for that usage (OCI will be using the same reference to cross-reference for correctness on the usage csv report), comes from Entity OBSCNTR_IPT_PRODUCTTIER.
     *
     * @return the value
     **/
    public String getRateCardTierdId() {
        return rateCardTierdId;
    }

    /**
     * Ratecard Id at subscribed service level
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
    private final String rateCardId;

    /**
     * Ratecard Id at subscribed service level
     *
     * @return the value
     **/
    public String getRateCardId() {
        return rateCardId;
    }

    /**
     * SPM Internal compute records source .
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeSource")
    private final String computeSource;

    /**
     * SPM Internal compute records source .
     *
     * @return the value
     **/
    public String getComputeSource() {
        return computeSource;
    }

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataCenter")
    private final String dataCenter;

    /**
     * Data Center Attribute as sent by MQS to SPM.
     *
     * @return the value
     **/
    public String getDataCenter() {
        return dataCenter;
    }

    /**
     * MQS Identfier send to SPM , SPM does not transform this attribute and is received as is.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mqsMessageId")
    private final String mqsMessageId;

    /**
     * MQS Identfier send to SPM , SPM does not transform this attribute and is received as is.
     *
     * @return the value
     **/
    public String getMqsMessageId() {
        return mqsMessageId;
    }

    /**
     * SPM Internal computed usage Id , 32 character string
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computedUsageId")
    private final String computedUsageId;

    /**
     * SPM Internal computed usage Id , 32 character string
     *
     * @return the value
     **/
    public String getComputedUsageId() {
        return computedUsageId;
    }

    /**
     * Total Quantity that was used for computation
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Total Quantity that was used for computation
     *
     * @return the value
     **/
    public String getQuantity() {
        return quantity;
    }

    /**
     * SPM Internal usage Line number identifier in SPM coming from Metered Services entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageNumber")
    private final String usageNumber;

    /**
     * SPM Internal usage Line number identifier in SPM coming from Metered Services entity.
     *
     * @return the value
     **/
    public String getUsageNumber() {
        return usageNumber;
    }

    /**
     * SPM Internal Original usage Line number identifier in SPM coming from Metered Services entity.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalUsageNumber")
    private final String originalUsageNumber;

    /**
     * SPM Internal Original usage Line number identifier in SPM coming from Metered Services entity.
     *
     * @return the value
     **/
    public String getOriginalUsageNumber() {
        return originalUsageNumber;
    }

    /**
     * Subscribed service commitmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentServiceId")
    private final String commitmentServiceId;

    /**
     * Subscribed service commitmentId.
     *
     * @return the value
     **/
    public String getCommitmentServiceId() {
        return commitmentServiceId;
    }

    /**
     * Invoicing status for the aggregated compute usage
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInvoiced")
    private final Boolean isInvoiced;

    /**
     * Invoicing status for the aggregated compute usage
     *
     * @return the value
     **/
    public Boolean getIsInvoiced() {
        return isInvoiced;
    }

    /**
     * Usage compute type in SPM.
     *
     **/
    public enum Type {
        Promotion("PROMOTION"),
        DoNotBill("DO_NOT_BILL"),
        Usage("USAGE"),
        Commit("COMMIT"),
        Overage("OVERAGE"),
        PayAsYouGo("PAY_AS_YOU_GO"),
        MonthlyMinimum("MONTHLY_MINIMUM"),
        DelayedUsageInvoiceTiming("DELAYED_USAGE_INVOICE_TIMING"),
        DelayedUsageCommitmentExp("DELAYED_USAGE_COMMITMENT_EXP"),
        OnAccountCredit("ON_ACCOUNT_CREDIT"),
        ServiceCredit("SERVICE_CREDIT"),
        CommitmentExpiration("COMMITMENT_EXPIRATION"),
        FundedAllocation("FUNDED_ALLOCATION"),
        DonotBillUsagePostTermination("DONOT_BILL_USAGE_POST_TERMINATION"),
        DelayedUsagePostTermination("DELAYED_USAGE_POST_TERMINATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Usage compute type in SPM.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Usage compute type in SPM.
     *
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Usae computation date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfArrival")
    private final java.util.Date timeOfArrival;

    /**
     * Usae computation date, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeOfArrival() {
        return timeOfArrival;
    }

    /**
     * Metered Service date, expressed in RFC 3339 timestamp format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeMeteredOn")
    private final java.util.Date timeMeteredOn;

    /**
     * Metered Service date, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     **/
    public java.util.Date getTimeMeteredOn() {
        return timeMeteredOn;
    }

    /**
     * Net Unit Price for the product in consideration, price actual.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("netUnitPrice")
    private final String netUnitPrice;

    /**
     * Net Unit Price for the product in consideration, price actual.
     *
     * @return the value
     **/
    public String getNetUnitPrice() {
        return netUnitPrice;
    }

    /**
     * Computed Line Amount rounded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("costRounded")
    private final String costRounded;

    /**
     * Computed Line Amount rounded.
     *
     * @return the value
     **/
    public String getCostRounded() {
        return costRounded;
    }

    /**
     * Computed Line Amount not rounded
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cost")
    private final String cost;

    /**
     * Computed Line Amount not rounded
     *
     * @return the value
     **/
    public String getCost() {
        return cost;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("product")
    private final Product product;

    public Product getProduct() {
        return product;
    }

    /**
     * Unit of Messure
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    private final String unitOfMeasure;

    /**
     * Unit of Messure
     *
     * @return the value
     **/
    public String getUnitOfMeasure() {
        return unitOfMeasure;
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
        sb.append("ComputedUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", parentSubscribedServiceId=")
                .append(String.valueOf(this.parentSubscribedServiceId));
        sb.append(", parentProduct=").append(String.valueOf(this.parentProduct));
        sb.append(", planNumber=").append(String.valueOf(this.planNumber));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", rateCardTierdId=").append(String.valueOf(this.rateCardTierdId));
        sb.append(", rateCardId=").append(String.valueOf(this.rateCardId));
        sb.append(", computeSource=").append(String.valueOf(this.computeSource));
        sb.append(", dataCenter=").append(String.valueOf(this.dataCenter));
        sb.append(", mqsMessageId=").append(String.valueOf(this.mqsMessageId));
        sb.append(", computedUsageId=").append(String.valueOf(this.computedUsageId));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", usageNumber=").append(String.valueOf(this.usageNumber));
        sb.append(", originalUsageNumber=").append(String.valueOf(this.originalUsageNumber));
        sb.append(", commitmentServiceId=").append(String.valueOf(this.commitmentServiceId));
        sb.append(", isInvoiced=").append(String.valueOf(this.isInvoiced));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", timeOfArrival=").append(String.valueOf(this.timeOfArrival));
        sb.append(", timeMeteredOn=").append(String.valueOf(this.timeMeteredOn));
        sb.append(", netUnitPrice=").append(String.valueOf(this.netUnitPrice));
        sb.append(", costRounded=").append(String.valueOf(this.costRounded));
        sb.append(", cost=").append(String.valueOf(this.cost));
        sb.append(", product=").append(String.valueOf(this.product));
        sb.append(", unitOfMeasure=").append(String.valueOf(this.unitOfMeasure));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputedUsageSummary)) {
            return false;
        }

        ComputedUsageSummary other = (ComputedUsageSummary) o;
        return java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.parentSubscribedServiceId, other.parentSubscribedServiceId)
                && java.util.Objects.equals(this.parentProduct, other.parentProduct)
                && java.util.Objects.equals(this.planNumber, other.planNumber)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.rateCardTierdId, other.rateCardTierdId)
                && java.util.Objects.equals(this.rateCardId, other.rateCardId)
                && java.util.Objects.equals(this.computeSource, other.computeSource)
                && java.util.Objects.equals(this.dataCenter, other.dataCenter)
                && java.util.Objects.equals(this.mqsMessageId, other.mqsMessageId)
                && java.util.Objects.equals(this.computedUsageId, other.computedUsageId)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.usageNumber, other.usageNumber)
                && java.util.Objects.equals(this.originalUsageNumber, other.originalUsageNumber)
                && java.util.Objects.equals(this.commitmentServiceId, other.commitmentServiceId)
                && java.util.Objects.equals(this.isInvoiced, other.isInvoiced)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.timeOfArrival, other.timeOfArrival)
                && java.util.Objects.equals(this.timeMeteredOn, other.timeMeteredOn)
                && java.util.Objects.equals(this.netUnitPrice, other.netUnitPrice)
                && java.util.Objects.equals(this.costRounded, other.costRounded)
                && java.util.Objects.equals(this.cost, other.cost)
                && java.util.Objects.equals(this.product, other.product)
                && java.util.Objects.equals(this.unitOfMeasure, other.unitOfMeasure)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSubscribedServiceId == null
                                ? 43
                                : this.parentSubscribedServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentProduct == null ? 43 : this.parentProduct.hashCode());
        result = (result * PRIME) + (this.planNumber == null ? 43 : this.planNumber.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result =
                (result * PRIME)
                        + (this.rateCardTierdId == null ? 43 : this.rateCardTierdId.hashCode());
        result = (result * PRIME) + (this.rateCardId == null ? 43 : this.rateCardId.hashCode());
        result =
                (result * PRIME)
                        + (this.computeSource == null ? 43 : this.computeSource.hashCode());
        result = (result * PRIME) + (this.dataCenter == null ? 43 : this.dataCenter.hashCode());
        result = (result * PRIME) + (this.mqsMessageId == null ? 43 : this.mqsMessageId.hashCode());
        result =
                (result * PRIME)
                        + (this.computedUsageId == null ? 43 : this.computedUsageId.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.usageNumber == null ? 43 : this.usageNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.originalUsageNumber == null
                                ? 43
                                : this.originalUsageNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.commitmentServiceId == null
                                ? 43
                                : this.commitmentServiceId.hashCode());
        result = (result * PRIME) + (this.isInvoiced == null ? 43 : this.isInvoiced.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfArrival == null ? 43 : this.timeOfArrival.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMeteredOn == null ? 43 : this.timeMeteredOn.hashCode());
        result = (result * PRIME) + (this.netUnitPrice == null ? 43 : this.netUnitPrice.hashCode());
        result = (result * PRIME) + (this.costRounded == null ? 43 : this.costRounded.hashCode());
        result = (result * PRIME) + (this.cost == null ? 43 : this.cost.hashCode());
        result = (result * PRIME) + (this.product == null ? 43 : this.product.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasure == null ? 43 : this.unitOfMeasure.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
