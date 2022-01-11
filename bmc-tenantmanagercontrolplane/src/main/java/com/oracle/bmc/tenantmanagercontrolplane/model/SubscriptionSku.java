/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * SKU information.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubscriptionSku.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SubscriptionSku {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Integer quantity;

        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("gsiOrderLineId")
        private String gsiOrderLineId;

        public Builder gsiOrderLineId(String gsiOrderLineId) {
            this.gsiOrderLineId = gsiOrderLineId;
            this.__explicitlySet__.add("gsiOrderLineId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licensePartDescription")
        private String licensePartDescription;

        public Builder licensePartDescription(String licensePartDescription) {
            this.licensePartDescription = licensePartDescription;
            this.__explicitlySet__.add("licensePartDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBaseServiceComponent")
        private Boolean isBaseServiceComponent;

        public Builder isBaseServiceComponent(Boolean isBaseServiceComponent) {
            this.isBaseServiceComponent = isBaseServiceComponent;
            this.__explicitlySet__.add("isBaseServiceComponent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAdditionalInstance")
        private Boolean isAdditionalInstance;

        public Builder isAdditionalInstance(Boolean isAdditionalInstance) {
            this.isAdditionalInstance = isAdditionalInstance;
            this.__explicitlySet__.add("isAdditionalInstance");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSku build() {
            SubscriptionSku __instance__ =
                    new SubscriptionSku(
                            sku,
                            quantity,
                            description,
                            gsiOrderLineId,
                            licensePartDescription,
                            metricName,
                            isBaseServiceComponent,
                            isAdditionalInstance,
                            startDate,
                            endDate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionSku o) {
            Builder copiedBuilder =
                    sku(o.getSku())
                            .quantity(o.getQuantity())
                            .description(o.getDescription())
                            .gsiOrderLineId(o.getGsiOrderLineId())
                            .licensePartDescription(o.getLicensePartDescription())
                            .metricName(o.getMetricName())
                            .isBaseServiceComponent(o.getIsBaseServiceComponent())
                            .isAdditionalInstance(o.getIsAdditionalInstance())
                            .startDate(o.getStartDate())
                            .endDate(o.getEndDate());

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
     * Stock keeping unit ID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    String sku;

    /**
     * Quantity of the stock units.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    Integer quantity;

    /**
     * Description of the stock units.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Sales order line identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gsiOrderLineId")
    String gsiOrderLineId;

    /**
     * Description of the covered product belonging to this SKU.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licensePartDescription")
    String licensePartDescription;

    /**
     * Base metric for billing the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    String metricName;

    /**
     * Denotes if the SKU is considered as a parent or child.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseServiceComponent")
    Boolean isBaseServiceComponent;

    /**
     * Denotes if an additional test instance can be provisioned by the SAAS application.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdditionalInstance")
    Boolean isAdditionalInstance;

    /**
     * Date-time when the SKU was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    java.util.Date startDate;

    /**
     * Date-time when the SKU ended.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    java.util.Date endDate;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
