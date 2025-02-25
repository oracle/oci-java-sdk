/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Summary of the line item in an assigned subscription.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AssignedSubscriptionLineItemSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssignedSubscriptionLineItemSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "productCode",
        "quantity",
        "billingModel",
        "timeStarted",
        "timeEnded",
        "systemTags"
    })
    public AssignedSubscriptionLineItemSummary(
            String id,
            String productCode,
            Float quantity,
            BillingModel billingModel,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.productCode = productCode;
        this.quantity = quantity;
        this.billingModel = billingModel;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Subscription line item identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Subscription line item identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Product code.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productCode")
        private String productCode;

        /**
         * Product code.
         * @param productCode the value to set
         * @return this builder
         **/
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            this.__explicitlySet__.add("productCode");
            return this;
        }
        /**
         * Product number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Float quantity;

        /**
         * Product number.
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(Float quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Billing model supported by the associated line item.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billingModel")
        private BillingModel billingModel;

        /**
         * Billing model supported by the associated line item.
         * @param billingModel the value to set
         * @return this builder
         **/
        public Builder billingModel(BillingModel billingModel) {
            this.billingModel = billingModel;
            this.__explicitlySet__.add("billingModel");
            return this;
        }
        /**
         * The time the subscription item and associated products should start. An RFC 3339 formatted date and time string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the subscription item and associated products should start. An RFC 3339 formatted date and time string.
         * @param timeStarted the value to set
         * @return this builder
         **/
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The time the subscription item and associated products should end. An RFC 3339 formatted date and time string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The time the subscription item and associated products should end. An RFC 3339 formatted date and time string.
         * @param timeEnded the value to set
         * @return this builder
         **/
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssignedSubscriptionLineItemSummary build() {
            AssignedSubscriptionLineItemSummary model =
                    new AssignedSubscriptionLineItemSummary(
                            this.id,
                            this.productCode,
                            this.quantity,
                            this.billingModel,
                            this.timeStarted,
                            this.timeEnded,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignedSubscriptionLineItemSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("productCode")) {
                this.productCode(model.getProductCode());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("billingModel")) {
                this.billingModel(model.getBillingModel());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * Subscription line item identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Subscription line item identifier.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Product code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productCode")
    private final String productCode;

    /**
     * Product code.
     * @return the value
     **/
    public String getProductCode() {
        return productCode;
    }

    /**
     * Product number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Float quantity;

    /**
     * Product number.
     * @return the value
     **/
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Billing model supported by the associated line item.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billingModel")
    private final BillingModel billingModel;

    /**
     * Billing model supported by the associated line item.
     * @return the value
     **/
    public BillingModel getBillingModel() {
        return billingModel;
    }

    /**
     * The time the subscription item and associated products should start. An RFC 3339 formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the subscription item and associated products should start. An RFC 3339 formatted date and time string.
     * @return the value
     **/
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The time the subscription item and associated products should end. An RFC 3339 formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The time the subscription item and associated products should end. An RFC 3339 formatted date and time string.
     * @return the value
     **/
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("AssignedSubscriptionLineItemSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", productCode=").append(String.valueOf(this.productCode));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", billingModel=").append(String.valueOf(this.billingModel));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignedSubscriptionLineItemSummary)) {
            return false;
        }

        AssignedSubscriptionLineItemSummary other = (AssignedSubscriptionLineItemSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.productCode, other.productCode)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.billingModel, other.billingModel)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.productCode == null ? 43 : this.productCode.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.billingModel == null ? 43 : this.billingModel.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
