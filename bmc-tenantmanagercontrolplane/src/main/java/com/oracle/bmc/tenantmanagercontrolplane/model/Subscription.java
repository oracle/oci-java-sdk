/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * Subscription information for compartmentId. Only root compartments are allowed.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subscription.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Subscription {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "classicSubscriptionId",
        "compartmentId",
        "serviceName",
        "isClassicSubscription",
        "paymentModel",
        "regionAssignment",
        "lifecycleState",
        "skus",
        "startDate",
        "endDate",
        "timeUpdated",
        "timeCreated"
    })
    public Subscription(
            String id,
            String classicSubscriptionId,
            String compartmentId,
            String serviceName,
            Boolean isClassicSubscription,
            String paymentModel,
            String regionAssignment,
            SubscriptionLifecycleState lifecycleState,
            java.util.List<SubscriptionSku> skus,
            java.util.Date startDate,
            java.util.Date endDate,
            java.util.Date timeUpdated,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.classicSubscriptionId = classicSubscriptionId;
        this.compartmentId = compartmentId;
        this.serviceName = serviceName;
        this.isClassicSubscription = isClassicSubscription;
        this.paymentModel = paymentModel;
        this.regionAssignment = regionAssignment;
        this.lifecycleState = lifecycleState;
        this.skus = skus;
        this.startDate = startDate;
        this.endDate = endDate;
        this.timeUpdated = timeUpdated;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the subscription details for the particular root compartment or tenancy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the subscription details for the particular root compartment or tenancy.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Classic subscription ID.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
        private String classicSubscriptionId;

        /**
         * Classic subscription ID.
         * @param classicSubscriptionId the value to set
         * @return this builder
         **/
        public Builder classicSubscriptionId(String classicSubscriptionId) {
            this.classicSubscriptionId = classicSubscriptionId;
            this.__explicitlySet__.add("classicSubscriptionId");
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
         * Denotes if the subscription is from classic systems or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isClassicSubscription")
        private Boolean isClassicSubscription;

        /**
         * Denotes if the subscription is from classic systems or not.
         * @param isClassicSubscription the value to set
         * @return this builder
         **/
        public Builder isClassicSubscription(Boolean isClassicSubscription) {
            this.isClassicSubscription = isClassicSubscription;
            this.__explicitlySet__.add("isClassicSubscription");
            return this;
        }
        /**
         * The pay model of the subscription, such as 'Pay as you go' or 'Monthly'.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paymentModel")
        private String paymentModel;

        /**
         * The pay model of the subscription, such as 'Pay as you go' or 'Monthly'.
         * @param paymentModel the value to set
         * @return this builder
         **/
        public Builder paymentModel(String paymentModel) {
            this.paymentModel = paymentModel;
            this.__explicitlySet__.add("paymentModel");
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
         * List of SKUs linked to this subscription.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<SubscriptionSku> skus;

        /**
         * List of SKUs linked to this subscription.
         * @param skus the value to set
         * @return this builder
         **/
        public Builder skus(java.util.List<SubscriptionSku> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
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

        public Subscription build() {
            Subscription __instance__ =
                    new Subscription(
                            id,
                            classicSubscriptionId,
                            compartmentId,
                            serviceName,
                            isClassicSubscription,
                            paymentModel,
                            regionAssignment,
                            lifecycleState,
                            skus,
                            startDate,
                            endDate,
                            timeUpdated,
                            timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subscription o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .classicSubscriptionId(o.getClassicSubscriptionId())
                            .compartmentId(o.getCompartmentId())
                            .serviceName(o.getServiceName())
                            .isClassicSubscription(o.getIsClassicSubscription())
                            .paymentModel(o.getPaymentModel())
                            .regionAssignment(o.getRegionAssignment())
                            .lifecycleState(o.getLifecycleState())
                            .skus(o.getSkus())
                            .startDate(o.getStartDate())
                            .endDate(o.getEndDate())
                            .timeUpdated(o.getTimeUpdated())
                            .timeCreated(o.getTimeCreated());

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
     * OCID of the subscription details for the particular root compartment or tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the subscription details for the particular root compartment or tenancy.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Classic subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
    private final String classicSubscriptionId;

    /**
     * Classic subscription ID.
     * @return the value
     **/
    public String getClassicSubscriptionId() {
        return classicSubscriptionId;
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
     * Denotes if the subscription is from classic systems or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClassicSubscription")
    private final Boolean isClassicSubscription;

    /**
     * Denotes if the subscription is from classic systems or not.
     * @return the value
     **/
    public Boolean getIsClassicSubscription() {
        return isClassicSubscription;
    }

    /**
     * The pay model of the subscription, such as 'Pay as you go' or 'Monthly'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentModel")
    private final String paymentModel;

    /**
     * The pay model of the subscription, such as 'Pay as you go' or 'Monthly'.
     * @return the value
     **/
    public String getPaymentModel() {
        return paymentModel;
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
     * List of SKUs linked to this subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    private final java.util.List<SubscriptionSku> skus;

    /**
     * List of SKUs linked to this subscription.
     * @return the value
     **/
    public java.util.List<SubscriptionSku> getSkus() {
        return skus;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Subscription(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", classicSubscriptionId=").append(String.valueOf(this.classicSubscriptionId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", isClassicSubscription=").append(String.valueOf(this.isClassicSubscription));
        sb.append(", paymentModel=").append(String.valueOf(this.paymentModel));
        sb.append(", regionAssignment=").append(String.valueOf(this.regionAssignment));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", skus=").append(String.valueOf(this.skus));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.classicSubscriptionId, other.classicSubscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.isClassicSubscription, other.isClassicSubscription)
                && java.util.Objects.equals(this.paymentModel, other.paymentModel)
                && java.util.Objects.equals(this.regionAssignment, other.regionAssignment)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.skus, other.skus)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.classicSubscriptionId == null
                                ? 43
                                : this.classicSubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.isClassicSubscription == null
                                ? 43
                                : this.isClassicSubscription.hashCode());
        result = (result * PRIME) + (this.paymentModel == null ? 43 : this.paymentModel.hashCode());
        result =
                (result * PRIME)
                        + (this.regionAssignment == null ? 43 : this.regionAssignment.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.skus == null ? 43 : this.skus.hashCode());
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
