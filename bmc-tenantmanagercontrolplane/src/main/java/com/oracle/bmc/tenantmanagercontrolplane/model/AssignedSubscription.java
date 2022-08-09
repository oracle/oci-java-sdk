/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Assigned subscription information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AssignedSubscription.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AssignedSubscription extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "classicSubscriptionId",
        "serviceName",
        "isClassicSubscription",
        "regionAssignment",
        "lifecycleState",
        "skus",
        "orderIds",
        "programType",
        "customerCountryCode",
        "cloudAmountCurrency",
        "csiNumber",
        "subscriptionTier",
        "isGovernmentSubscription",
        "promotion",
        "purchaseEntitlementId",
        "startDate",
        "endDate",
        "timeUpdated",
        "timeCreated"
    })
    public AssignedSubscription(
            String id,
            String compartmentId,
            String classicSubscriptionId,
            String serviceName,
            Boolean isClassicSubscription,
            String regionAssignment,
            SubscriptionLifecycleState lifecycleState,
            java.util.List<SubscriptionSku> skus,
            java.util.List<String> orderIds,
            String programType,
            String customerCountryCode,
            String cloudAmountCurrency,
            String csiNumber,
            String subscriptionTier,
            Boolean isGovernmentSubscription,
            java.util.List<Promotion> promotion,
            String purchaseEntitlementId,
            java.util.Date startDate,
            java.util.Date endDate,
            java.util.Date timeUpdated,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.classicSubscriptionId = classicSubscriptionId;
        this.serviceName = serviceName;
        this.isClassicSubscription = isClassicSubscription;
        this.regionAssignment = regionAssignment;
        this.lifecycleState = lifecycleState;
        this.skus = skus;
        this.orderIds = orderIds;
        this.programType = programType;
        this.customerCountryCode = customerCountryCode;
        this.cloudAmountCurrency = cloudAmountCurrency;
        this.csiNumber = csiNumber;
        this.subscriptionTier = subscriptionTier;
        this.isGovernmentSubscription = isGovernmentSubscription;
        this.promotion = promotion;
        this.purchaseEntitlementId = purchaseEntitlementId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the subscription.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * OCID of the compartment. Always a tenancy OCID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment. Always a tenancy OCID.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Subscription ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
        private String classicSubscriptionId;

        /**
         * Subscription ID.
         * @param classicSubscriptionId the value to set
         * @return this builder
         **/
        public Builder classicSubscriptionId(String classicSubscriptionId) {
            this.classicSubscriptionId = classicSubscriptionId;
            this.__explicitlySet__.add("classicSubscriptionId");
            return this;
        }
        /**
         * The type of subscription, such as 'CLOUDCM', 'SAAS', 'ERP', or 'CRM'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * The type of subscription, such as 'CLOUDCM', 'SAAS', 'ERP', or 'CRM'.
         * @param serviceName the value to set
         * @return this builder
         **/
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * Denotes if the subscription is legacy or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isClassicSubscription")
        private Boolean isClassicSubscription;

        /**
         * Denotes if the subscription is legacy or not.
         * @param isClassicSubscription the value to set
         * @return this builder
         **/
        public Builder isClassicSubscription(Boolean isClassicSubscription) {
            this.isClassicSubscription = isClassicSubscription;
            this.__explicitlySet__.add("isClassicSubscription");
            return this;
        }
        /**
         * Region for the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regionAssignment")
        private String regionAssignment;

        /**
         * Region for the subscription.
         * @param regionAssignment the value to set
         * @return this builder
         **/
        public Builder regionAssignment(String regionAssignment) {
            this.regionAssignment = regionAssignment;
            this.__explicitlySet__.add("regionAssignment");
            return this;
        }
        /**
         * Lifecycle state of the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SubscriptionLifecycleState lifecycleState;

        /**
         * Lifecycle state of the subscription.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(SubscriptionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * List of SKUs linked to the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<SubscriptionSku> skus;

        /**
         * List of SKUs linked to the subscription.
         * @param skus the value to set
         * @return this builder
         **/
        public Builder skus(java.util.List<SubscriptionSku> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
            return this;
        }
        /**
         * List of subscription order OCIDs that contributed to this subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("orderIds")
        private java.util.List<String> orderIds;

        /**
         * List of subscription order OCIDs that contributed to this subscription.
         * @param orderIds the value to set
         * @return this builder
         **/
        public Builder orderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            this.__explicitlySet__.add("orderIds");
            return this;
        }
        /**
         * Denotes any program that is associated with the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("programType")
        private String programType;

        /**
         * Denotes any program that is associated with the subscription.
         * @param programType the value to set
         * @return this builder
         **/
        public Builder programType(String programType) {
            this.programType = programType;
            this.__explicitlySet__.add("programType");
            return this;
        }
        /**
         * The country code for the customer associated with the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("customerCountryCode")
        private String customerCountryCode;

        /**
         * The country code for the customer associated with the subscription.
         * @param customerCountryCode the value to set
         * @return this builder
         **/
        public Builder customerCountryCode(String customerCountryCode) {
            this.customerCountryCode = customerCountryCode;
            this.__explicitlySet__.add("customerCountryCode");
            return this;
        }
        /**
         * The currency code for the customer associated with the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cloudAmountCurrency")
        private String cloudAmountCurrency;

        /**
         * The currency code for the customer associated with the subscription.
         * @param cloudAmountCurrency the value to set
         * @return this builder
         **/
        public Builder cloudAmountCurrency(String cloudAmountCurrency) {
            this.cloudAmountCurrency = cloudAmountCurrency;
            this.__explicitlySet__.add("cloudAmountCurrency");
            return this;
        }
        /**
         * Customer service identifier for the customer associated with the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("csiNumber")
        private String csiNumber;

        /**
         * Customer service identifier for the customer associated with the subscription.
         * @param csiNumber the value to set
         * @return this builder
         **/
        public Builder csiNumber(String csiNumber) {
            this.csiNumber = csiNumber;
            this.__explicitlySet__.add("csiNumber");
            return this;
        }
        /**
         * Tier for the subscription, such as if it is a free promotion subscription or a paid subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionTier")
        private String subscriptionTier;

        /**
         * Tier for the subscription, such as if it is a free promotion subscription or a paid subscription.
         * @param subscriptionTier the value to set
         * @return this builder
         **/
        public Builder subscriptionTier(String subscriptionTier) {
            this.subscriptionTier = subscriptionTier;
            this.__explicitlySet__.add("subscriptionTier");
            return this;
        }
        /**
         * Denotes if the subscription is a government subscription or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isGovernmentSubscription")
        private Boolean isGovernmentSubscription;

        /**
         * Denotes if the subscription is a government subscription or not.
         * @param isGovernmentSubscription the value to set
         * @return this builder
         **/
        public Builder isGovernmentSubscription(Boolean isGovernmentSubscription) {
            this.isGovernmentSubscription = isGovernmentSubscription;
            this.__explicitlySet__.add("isGovernmentSubscription");
            return this;
        }
        /**
         * List of promotions related to the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("promotion")
        private java.util.List<Promotion> promotion;

        /**
         * List of promotions related to the subscription.
         * @param promotion the value to set
         * @return this builder
         **/
        public Builder promotion(java.util.List<Promotion> promotion) {
            this.promotion = promotion;
            this.__explicitlySet__.add("promotion");
            return this;
        }
        /**
         * Purchase entitlement id associated with the subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("purchaseEntitlementId")
        private String purchaseEntitlementId;

        /**
         * Purchase entitlement id associated with the subscription.
         * @param purchaseEntitlementId the value to set
         * @return this builder
         **/
        public Builder purchaseEntitlementId(String purchaseEntitlementId) {
            this.purchaseEntitlementId = purchaseEntitlementId;
            this.__explicitlySet__.add("purchaseEntitlementId");
            return this;
        }
        /**
         * Subscription start time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        /**
         * Subscription start time.
         * @param startDate the value to set
         * @return this builder
         **/
        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /**
         * Subscription end time.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        /**
         * Subscription end time.
         * @param endDate the value to set
         * @return this builder
         **/
        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }
        /**
         * Date-time when subscription is updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Date-time when subscription is updated.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Date-time when subscription is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date-time when subscription is created.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssignedSubscription build() {
            AssignedSubscription model =
                    new AssignedSubscription(
                            this.id,
                            this.compartmentId,
                            this.classicSubscriptionId,
                            this.serviceName,
                            this.isClassicSubscription,
                            this.regionAssignment,
                            this.lifecycleState,
                            this.skus,
                            this.orderIds,
                            this.programType,
                            this.customerCountryCode,
                            this.cloudAmountCurrency,
                            this.csiNumber,
                            this.subscriptionTier,
                            this.isGovernmentSubscription,
                            this.promotion,
                            this.purchaseEntitlementId,
                            this.startDate,
                            this.endDate,
                            this.timeUpdated,
                            this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssignedSubscription model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("classicSubscriptionId")) {
                this.classicSubscriptionId(model.getClassicSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("isClassicSubscription")) {
                this.isClassicSubscription(model.getIsClassicSubscription());
            }
            if (model.wasPropertyExplicitlySet("regionAssignment")) {
                this.regionAssignment(model.getRegionAssignment());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("skus")) {
                this.skus(model.getSkus());
            }
            if (model.wasPropertyExplicitlySet("orderIds")) {
                this.orderIds(model.getOrderIds());
            }
            if (model.wasPropertyExplicitlySet("programType")) {
                this.programType(model.getProgramType());
            }
            if (model.wasPropertyExplicitlySet("customerCountryCode")) {
                this.customerCountryCode(model.getCustomerCountryCode());
            }
            if (model.wasPropertyExplicitlySet("cloudAmountCurrency")) {
                this.cloudAmountCurrency(model.getCloudAmountCurrency());
            }
            if (model.wasPropertyExplicitlySet("csiNumber")) {
                this.csiNumber(model.getCsiNumber());
            }
            if (model.wasPropertyExplicitlySet("subscriptionTier")) {
                this.subscriptionTier(model.getSubscriptionTier());
            }
            if (model.wasPropertyExplicitlySet("isGovernmentSubscription")) {
                this.isGovernmentSubscription(model.getIsGovernmentSubscription());
            }
            if (model.wasPropertyExplicitlySet("promotion")) {
                this.promotion(model.getPromotion());
            }
            if (model.wasPropertyExplicitlySet("purchaseEntitlementId")) {
                this.purchaseEntitlementId(model.getPurchaseEntitlementId());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * OCID of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the subscription.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * OCID of the compartment. Always a tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment. Always a tenancy OCID.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
    private final String classicSubscriptionId;

    /**
     * Subscription ID.
     * @return the value
     **/
    public String getClassicSubscriptionId() {
        return classicSubscriptionId;
    }

    /**
     * The type of subscription, such as 'CLOUDCM', 'SAAS', 'ERP', or 'CRM'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * The type of subscription, such as 'CLOUDCM', 'SAAS', 'ERP', or 'CRM'.
     * @return the value
     **/
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Denotes if the subscription is legacy or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClassicSubscription")
    private final Boolean isClassicSubscription;

    /**
     * Denotes if the subscription is legacy or not.
     * @return the value
     **/
    public Boolean getIsClassicSubscription() {
        return isClassicSubscription;
    }

    /**
     * Region for the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionAssignment")
    private final String regionAssignment;

    /**
     * Region for the subscription.
     * @return the value
     **/
    public String getRegionAssignment() {
        return regionAssignment;
    }

    /**
     * Lifecycle state of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final SubscriptionLifecycleState lifecycleState;

    /**
     * Lifecycle state of the subscription.
     * @return the value
     **/
    public SubscriptionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * List of SKUs linked to the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    private final java.util.List<SubscriptionSku> skus;

    /**
     * List of SKUs linked to the subscription.
     * @return the value
     **/
    public java.util.List<SubscriptionSku> getSkus() {
        return skus;
    }

    /**
     * List of subscription order OCIDs that contributed to this subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("orderIds")
    private final java.util.List<String> orderIds;

    /**
     * List of subscription order OCIDs that contributed to this subscription.
     * @return the value
     **/
    public java.util.List<String> getOrderIds() {
        return orderIds;
    }

    /**
     * Denotes any program that is associated with the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("programType")
    private final String programType;

    /**
     * Denotes any program that is associated with the subscription.
     * @return the value
     **/
    public String getProgramType() {
        return programType;
    }

    /**
     * The country code for the customer associated with the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerCountryCode")
    private final String customerCountryCode;

    /**
     * The country code for the customer associated with the subscription.
     * @return the value
     **/
    public String getCustomerCountryCode() {
        return customerCountryCode;
    }

    /**
     * The currency code for the customer associated with the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudAmountCurrency")
    private final String cloudAmountCurrency;

    /**
     * The currency code for the customer associated with the subscription.
     * @return the value
     **/
    public String getCloudAmountCurrency() {
        return cloudAmountCurrency;
    }

    /**
     * Customer service identifier for the customer associated with the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csiNumber")
    private final String csiNumber;

    /**
     * Customer service identifier for the customer associated with the subscription.
     * @return the value
     **/
    public String getCsiNumber() {
        return csiNumber;
    }

    /**
     * Tier for the subscription, such as if it is a free promotion subscription or a paid subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionTier")
    private final String subscriptionTier;

    /**
     * Tier for the subscription, such as if it is a free promotion subscription or a paid subscription.
     * @return the value
     **/
    public String getSubscriptionTier() {
        return subscriptionTier;
    }

    /**
     * Denotes if the subscription is a government subscription or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGovernmentSubscription")
    private final Boolean isGovernmentSubscription;

    /**
     * Denotes if the subscription is a government subscription or not.
     * @return the value
     **/
    public Boolean getIsGovernmentSubscription() {
        return isGovernmentSubscription;
    }

    /**
     * List of promotions related to the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("promotion")
    private final java.util.List<Promotion> promotion;

    /**
     * List of promotions related to the subscription.
     * @return the value
     **/
    public java.util.List<Promotion> getPromotion() {
        return promotion;
    }

    /**
     * Purchase entitlement id associated with the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("purchaseEntitlementId")
    private final String purchaseEntitlementId;

    /**
     * Purchase entitlement id associated with the subscription.
     * @return the value
     **/
    public String getPurchaseEntitlementId() {
        return purchaseEntitlementId;
    }

    /**
     * Subscription start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final java.util.Date startDate;

    /**
     * Subscription start time.
     * @return the value
     **/
    public java.util.Date getStartDate() {
        return startDate;
    }

    /**
     * Subscription end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    /**
     * Subscription end time.
     * @return the value
     **/
    public java.util.Date getEndDate() {
        return endDate;
    }

    /**
     * Date-time when subscription is updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Date-time when subscription is updated.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Date-time when subscription is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date-time when subscription is created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("AssignedSubscription(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", classicSubscriptionId=").append(String.valueOf(this.classicSubscriptionId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", isClassicSubscription=").append(String.valueOf(this.isClassicSubscription));
        sb.append(", regionAssignment=").append(String.valueOf(this.regionAssignment));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", skus=").append(String.valueOf(this.skus));
        sb.append(", orderIds=").append(String.valueOf(this.orderIds));
        sb.append(", programType=").append(String.valueOf(this.programType));
        sb.append(", customerCountryCode=").append(String.valueOf(this.customerCountryCode));
        sb.append(", cloudAmountCurrency=").append(String.valueOf(this.cloudAmountCurrency));
        sb.append(", csiNumber=").append(String.valueOf(this.csiNumber));
        sb.append(", subscriptionTier=").append(String.valueOf(this.subscriptionTier));
        sb.append(", isGovernmentSubscription=")
                .append(String.valueOf(this.isGovernmentSubscription));
        sb.append(", promotion=").append(String.valueOf(this.promotion));
        sb.append(", purchaseEntitlementId=").append(String.valueOf(this.purchaseEntitlementId));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssignedSubscription)) {
            return false;
        }

        AssignedSubscription other = (AssignedSubscription) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.classicSubscriptionId, other.classicSubscriptionId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.isClassicSubscription, other.isClassicSubscription)
                && java.util.Objects.equals(this.regionAssignment, other.regionAssignment)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.skus, other.skus)
                && java.util.Objects.equals(this.orderIds, other.orderIds)
                && java.util.Objects.equals(this.programType, other.programType)
                && java.util.Objects.equals(this.customerCountryCode, other.customerCountryCode)
                && java.util.Objects.equals(this.cloudAmountCurrency, other.cloudAmountCurrency)
                && java.util.Objects.equals(this.csiNumber, other.csiNumber)
                && java.util.Objects.equals(this.subscriptionTier, other.subscriptionTier)
                && java.util.Objects.equals(
                        this.isGovernmentSubscription, other.isGovernmentSubscription)
                && java.util.Objects.equals(this.promotion, other.promotion)
                && java.util.Objects.equals(this.purchaseEntitlementId, other.purchaseEntitlementId)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.classicSubscriptionId == null
                                ? 43
                                : this.classicSubscriptionId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.isClassicSubscription == null
                                ? 43
                                : this.isClassicSubscription.hashCode());
        result =
                (result * PRIME)
                        + (this.regionAssignment == null ? 43 : this.regionAssignment.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.skus == null ? 43 : this.skus.hashCode());
        result = (result * PRIME) + (this.orderIds == null ? 43 : this.orderIds.hashCode());
        result = (result * PRIME) + (this.programType == null ? 43 : this.programType.hashCode());
        result =
                (result * PRIME)
                        + (this.customerCountryCode == null
                                ? 43
                                : this.customerCountryCode.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudAmountCurrency == null
                                ? 43
                                : this.cloudAmountCurrency.hashCode());
        result = (result * PRIME) + (this.csiNumber == null ? 43 : this.csiNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionTier == null ? 43 : this.subscriptionTier.hashCode());
        result =
                (result * PRIME)
                        + (this.isGovernmentSubscription == null
                                ? 43
                                : this.isGovernmentSubscription.hashCode());
        result = (result * PRIME) + (this.promotion == null ? 43 : this.promotion.hashCode());
        result =
                (result * PRIME)
                        + (this.purchaseEntitlementId == null
                                ? 43
                                : this.purchaseEntitlementId.hashCode());
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
