/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.model;

/**
 * Subscribed Service Contract details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputedUsageAggregatedSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ComputedUsageAggregatedSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscriptionId",
        "parentSubscribedServiceId",
        "parentProduct",
        "timeStart",
        "timeEnd",
        "planNumber",
        "currencyCode",
        "rateCardId",
        "pricingModel",
        "aggregatedComputedUsages"
    })
    public ComputedUsageAggregatedSummary(
            String subscriptionId,
            String parentSubscribedServiceId,
            Product parentProduct,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String planNumber,
            String currencyCode,
            String rateCardId,
            PricingModel pricingModel,
            java.util.List<ComputedUsageAggregation> aggregatedComputedUsages) {
        super();
        this.subscriptionId = subscriptionId;
        this.parentSubscribedServiceId = parentSubscribedServiceId;
        this.parentProduct = parentProduct;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.planNumber = planNumber;
        this.currencyCode = currencyCode;
        this.rateCardId = rateCardId;
        this.pricingModel = pricingModel;
        this.aggregatedComputedUsages = aggregatedComputedUsages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Subscription Id is an identifier associated to the service used for filter the Computed
         * Usage in SPM
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * Subscription Id is an identifier associated to the service used for filter the Computed
         * Usage in SPM
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** Subscribed service line parent id */
        @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
        private String parentSubscribedServiceId;

        /**
         * Subscribed service line parent id
         *
         * @param parentSubscribedServiceId the value to set
         * @return this builder
         */
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
        /** Subscribed services contract line start date, expressed in RFC 3339 timestamp format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Subscribed services contract line start date, expressed in RFC 3339 timestamp format.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Subscribed services contract line end date, expressed in RFC 3339 timestamp format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Subscribed services contract line end date, expressed in RFC 3339 timestamp format.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** Subscribed service asociated subscription plan number. */
        @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
        private String planNumber;

        /**
         * Subscribed service asociated subscription plan number.
         *
         * @param planNumber the value to set
         * @return this builder
         */
        public Builder planNumber(String planNumber) {
            this.planNumber = planNumber;
            this.__explicitlySet__.add("planNumber");
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
        /** Inernal SPM Ratecard Id at line level */
        @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
        private String rateCardId;

        /**
         * Inernal SPM Ratecard Id at line level
         *
         * @param rateCardId the value to set
         * @return this builder
         */
        public Builder rateCardId(String rateCardId) {
            this.rateCardId = rateCardId;
            this.__explicitlySet__.add("rateCardId");
            return this;
        }
        /** Subscribed services pricing model */
        @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
        private PricingModel pricingModel;

        /**
         * Subscribed services pricing model
         *
         * @param pricingModel the value to set
         * @return this builder
         */
        public Builder pricingModel(PricingModel pricingModel) {
            this.pricingModel = pricingModel;
            this.__explicitlySet__.add("pricingModel");
            return this;
        }
        /** Aggregation of computed usages for the subscribed service. */
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatedComputedUsages")
        private java.util.List<ComputedUsageAggregation> aggregatedComputedUsages;

        /**
         * Aggregation of computed usages for the subscribed service.
         *
         * @param aggregatedComputedUsages the value to set
         * @return this builder
         */
        public Builder aggregatedComputedUsages(
                java.util.List<ComputedUsageAggregation> aggregatedComputedUsages) {
            this.aggregatedComputedUsages = aggregatedComputedUsages;
            this.__explicitlySet__.add("aggregatedComputedUsages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputedUsageAggregatedSummary build() {
            ComputedUsageAggregatedSummary model =
                    new ComputedUsageAggregatedSummary(
                            this.subscriptionId,
                            this.parentSubscribedServiceId,
                            this.parentProduct,
                            this.timeStart,
                            this.timeEnd,
                            this.planNumber,
                            this.currencyCode,
                            this.rateCardId,
                            this.pricingModel,
                            this.aggregatedComputedUsages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputedUsageAggregatedSummary model) {
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("parentSubscribedServiceId")) {
                this.parentSubscribedServiceId(model.getParentSubscribedServiceId());
            }
            if (model.wasPropertyExplicitlySet("parentProduct")) {
                this.parentProduct(model.getParentProduct());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("planNumber")) {
                this.planNumber(model.getPlanNumber());
            }
            if (model.wasPropertyExplicitlySet("currencyCode")) {
                this.currencyCode(model.getCurrencyCode());
            }
            if (model.wasPropertyExplicitlySet("rateCardId")) {
                this.rateCardId(model.getRateCardId());
            }
            if (model.wasPropertyExplicitlySet("pricingModel")) {
                this.pricingModel(model.getPricingModel());
            }
            if (model.wasPropertyExplicitlySet("aggregatedComputedUsages")) {
                this.aggregatedComputedUsages(model.getAggregatedComputedUsages());
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

    /**
     * Subscription Id is an identifier associated to the service used for filter the Computed Usage
     * in SPM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * Subscription Id is an identifier associated to the service used for filter the Computed Usage
     * in SPM
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** Subscribed service line parent id */
    @com.fasterxml.jackson.annotation.JsonProperty("parentSubscribedServiceId")
    private final String parentSubscribedServiceId;

    /**
     * Subscribed service line parent id
     *
     * @return the value
     */
    public String getParentSubscribedServiceId() {
        return parentSubscribedServiceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentProduct")
    private final Product parentProduct;

    public Product getParentProduct() {
        return parentProduct;
    }

    /** Subscribed services contract line start date, expressed in RFC 3339 timestamp format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Subscribed services contract line start date, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Subscribed services contract line end date, expressed in RFC 3339 timestamp format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Subscribed services contract line end date, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** Subscribed service asociated subscription plan number. */
    @com.fasterxml.jackson.annotation.JsonProperty("planNumber")
    private final String planNumber;

    /**
     * Subscribed service asociated subscription plan number.
     *
     * @return the value
     */
    public String getPlanNumber() {
        return planNumber;
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

    /** Inernal SPM Ratecard Id at line level */
    @com.fasterxml.jackson.annotation.JsonProperty("rateCardId")
    private final String rateCardId;

    /**
     * Inernal SPM Ratecard Id at line level
     *
     * @return the value
     */
    public String getRateCardId() {
        return rateCardId;
    }

    /** Subscribed services pricing model */
    public enum PricingModel implements com.oracle.bmc.http.internal.BmcEnum {
        PayAsYouGo("PAY_AS_YOU_GO"),
        Monthly("MONTHLY"),
        Annual("ANNUAL"),
        Prepaid("PREPAID"),
        FundedAllocation("FUNDED_ALLOCATION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PricingModel.class);

        private final String value;
        private static java.util.Map<String, PricingModel> map;

        static {
            map = new java.util.HashMap<>();
            for (PricingModel v : PricingModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PricingModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PricingModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PricingModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Subscribed services pricing model */
    @com.fasterxml.jackson.annotation.JsonProperty("pricingModel")
    private final PricingModel pricingModel;

    /**
     * Subscribed services pricing model
     *
     * @return the value
     */
    public PricingModel getPricingModel() {
        return pricingModel;
    }

    /** Aggregation of computed usages for the subscribed service. */
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatedComputedUsages")
    private final java.util.List<ComputedUsageAggregation> aggregatedComputedUsages;

    /**
     * Aggregation of computed usages for the subscribed service.
     *
     * @return the value
     */
    public java.util.List<ComputedUsageAggregation> getAggregatedComputedUsages() {
        return aggregatedComputedUsages;
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
        sb.append("ComputedUsageAggregatedSummary(");
        sb.append("super=").append(super.toString());
        sb.append("subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", parentSubscribedServiceId=")
                .append(String.valueOf(this.parentSubscribedServiceId));
        sb.append(", parentProduct=").append(String.valueOf(this.parentProduct));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", planNumber=").append(String.valueOf(this.planNumber));
        sb.append(", currencyCode=").append(String.valueOf(this.currencyCode));
        sb.append(", rateCardId=").append(String.valueOf(this.rateCardId));
        sb.append(", pricingModel=").append(String.valueOf(this.pricingModel));
        sb.append(", aggregatedComputedUsages=")
                .append(String.valueOf(this.aggregatedComputedUsages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputedUsageAggregatedSummary)) {
            return false;
        }

        ComputedUsageAggregatedSummary other = (ComputedUsageAggregatedSummary) o;
        return java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(
                        this.parentSubscribedServiceId, other.parentSubscribedServiceId)
                && java.util.Objects.equals(this.parentProduct, other.parentProduct)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.planNumber, other.planNumber)
                && java.util.Objects.equals(this.currencyCode, other.currencyCode)
                && java.util.Objects.equals(this.rateCardId, other.rateCardId)
                && java.util.Objects.equals(this.pricingModel, other.pricingModel)
                && java.util.Objects.equals(
                        this.aggregatedComputedUsages, other.aggregatedComputedUsages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentSubscribedServiceId == null
                                ? 43
                                : this.parentSubscribedServiceId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentProduct == null ? 43 : this.parentProduct.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.planNumber == null ? 43 : this.planNumber.hashCode());
        result = (result * PRIME) + (this.currencyCode == null ? 43 : this.currencyCode.hashCode());
        result = (result * PRIME) + (this.rateCardId == null ? 43 : this.rateCardId.hashCode());
        result = (result * PRIME) + (this.pricingModel == null ? 43 : this.pricingModel.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregatedComputedUsages == null
                                ? 43
                                : this.aggregatedComputedUsages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
