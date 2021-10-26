/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subscription.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Subscription {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
        private String classicSubscriptionId;

        public Builder classicSubscriptionId(String classicSubscriptionId) {
            this.classicSubscriptionId = classicSubscriptionId;
            this.__explicitlySet__.add("classicSubscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isClassicSubscription")
        private Boolean isClassicSubscription;

        public Builder isClassicSubscription(Boolean isClassicSubscription) {
            this.isClassicSubscription = isClassicSubscription;
            this.__explicitlySet__.add("isClassicSubscription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("paymentModel")
        private String paymentModel;

        public Builder paymentModel(String paymentModel) {
            this.paymentModel = paymentModel;
            this.__explicitlySet__.add("paymentModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regionAssignment")
        private String regionAssignment;

        public Builder regionAssignment(String regionAssignment) {
            this.regionAssignment = regionAssignment;
            this.__explicitlySet__.add("regionAssignment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SubscriptionLifecycleState lifecycleState;

        public Builder lifecycleState(SubscriptionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("skus")
        private java.util.List<SubscriptionSku> skus;

        public Builder skus(java.util.List<SubscriptionSku> skus) {
            this.skus = skus;
            this.__explicitlySet__.add("skus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

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

    /**
     * OCID of the subscription details for the particular root compartment or tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Classic subscription ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
    String classicSubscriptionId;

    /**
     * OCID of the compartment. Always a tenancy OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The type of subscription, such as 'CLOUDCM', 'SAAS', 'ERP', or 'CRM'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    String serviceName;

    /**
     * Denotes if the subscription is from classic systems or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClassicSubscription")
    Boolean isClassicSubscription;

    /**
     * The pay model of the subscription, such as 'Pay as you go' or 'Monthly'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paymentModel")
    String paymentModel;

    /**
     * Region for the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionAssignment")
    String regionAssignment;

    /**
     * Lifecycle state of the subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    SubscriptionLifecycleState lifecycleState;

    /**
     * List of SKUs linked to this subscription.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("skus")
    java.util.List<SubscriptionSku> skus;

    /**
     * Subscription start time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    java.util.Date startDate;

    /**
     * Subscription end time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    java.util.Date endDate;

    /**
     * Date-time when subscription is updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Date-time when subscription is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
