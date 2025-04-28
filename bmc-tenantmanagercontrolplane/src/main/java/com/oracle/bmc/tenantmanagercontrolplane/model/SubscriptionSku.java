/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * SKU information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230401")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubscriptionSku.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionSku
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sku",
        "quantity",
        "description",
        "gsiOrderLineId",
        "licensePartDescription",
        "metricName",
        "isBaseServiceComponent",
        "isAdditionalInstance",
        "startDate",
        "endDate"
    })
    public SubscriptionSku(
            String sku,
            Integer quantity,
            String description,
            String gsiOrderLineId,
            String licensePartDescription,
            String metricName,
            Boolean isBaseServiceComponent,
            Boolean isAdditionalInstance,
            java.util.Date startDate,
            java.util.Date endDate) {
        super();
        this.sku = sku;
        this.quantity = quantity;
        this.description = description;
        this.gsiOrderLineId = gsiOrderLineId;
        this.licensePartDescription = licensePartDescription;
        this.metricName = metricName;
        this.isBaseServiceComponent = isBaseServiceComponent;
        this.isAdditionalInstance = isAdditionalInstance;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Stock Keeping Unit (SKU) ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * Stock Keeping Unit (SKU) ID.
         *
         * @param sku the value to set
         * @return this builder
         */
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /** Quantity of the stock units. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Integer quantity;

        /**
         * Quantity of the stock units.
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /** Description of the stock units. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the stock units.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Sales order line identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("gsiOrderLineId")
        private String gsiOrderLineId;

        /**
         * Sales order line identifier.
         *
         * @param gsiOrderLineId the value to set
         * @return this builder
         */
        public Builder gsiOrderLineId(String gsiOrderLineId) {
            this.gsiOrderLineId = gsiOrderLineId;
            this.__explicitlySet__.add("gsiOrderLineId");
            return this;
        }
        /** Description of the covered product belonging to this SKU. */
        @com.fasterxml.jackson.annotation.JsonProperty("licensePartDescription")
        private String licensePartDescription;

        /**
         * Description of the covered product belonging to this SKU.
         *
         * @param licensePartDescription the value to set
         * @return this builder
         */
        public Builder licensePartDescription(String licensePartDescription) {
            this.licensePartDescription = licensePartDescription;
            this.__explicitlySet__.add("licensePartDescription");
            return this;
        }
        /** Base metric for billing the service. */
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * Base metric for billing the service.
         *
         * @param metricName the value to set
         * @return this builder
         */
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /** Specifies if the SKU is considered as a parent or child. */
        @com.fasterxml.jackson.annotation.JsonProperty("isBaseServiceComponent")
        private Boolean isBaseServiceComponent;

        /**
         * Specifies if the SKU is considered as a parent or child.
         *
         * @param isBaseServiceComponent the value to set
         * @return this builder
         */
        public Builder isBaseServiceComponent(Boolean isBaseServiceComponent) {
            this.isBaseServiceComponent = isBaseServiceComponent;
            this.__explicitlySet__.add("isBaseServiceComponent");
            return this;
        }
        /** Specifies if an additional test instance can be provisioned by the SaaS application. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAdditionalInstance")
        private Boolean isAdditionalInstance;

        /**
         * Specifies if an additional test instance can be provisioned by the SaaS application.
         *
         * @param isAdditionalInstance the value to set
         * @return this builder
         */
        public Builder isAdditionalInstance(Boolean isAdditionalInstance) {
            this.isAdditionalInstance = isAdditionalInstance;
            this.__explicitlySet__.add("isAdditionalInstance");
            return this;
        }
        /** Date and time when the SKU was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("startDate")
        private java.util.Date startDate;

        /**
         * Date and time when the SKU was created.
         *
         * @param startDate the value to set
         * @return this builder
         */
        public Builder startDate(java.util.Date startDate) {
            this.startDate = startDate;
            this.__explicitlySet__.add("startDate");
            return this;
        }
        /** Date and time when the SKU ended. */
        @com.fasterxml.jackson.annotation.JsonProperty("endDate")
        private java.util.Date endDate;

        /**
         * Date and time when the SKU ended.
         *
         * @param endDate the value to set
         * @return this builder
         */
        public Builder endDate(java.util.Date endDate) {
            this.endDate = endDate;
            this.__explicitlySet__.add("endDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSku build() {
            SubscriptionSku model =
                    new SubscriptionSku(
                            this.sku,
                            this.quantity,
                            this.description,
                            this.gsiOrderLineId,
                            this.licensePartDescription,
                            this.metricName,
                            this.isBaseServiceComponent,
                            this.isAdditionalInstance,
                            this.startDate,
                            this.endDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionSku model) {
            if (model.wasPropertyExplicitlySet("sku")) {
                this.sku(model.getSku());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("gsiOrderLineId")) {
                this.gsiOrderLineId(model.getGsiOrderLineId());
            }
            if (model.wasPropertyExplicitlySet("licensePartDescription")) {
                this.licensePartDescription(model.getLicensePartDescription());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("isBaseServiceComponent")) {
                this.isBaseServiceComponent(model.getIsBaseServiceComponent());
            }
            if (model.wasPropertyExplicitlySet("isAdditionalInstance")) {
                this.isAdditionalInstance(model.getIsAdditionalInstance());
            }
            if (model.wasPropertyExplicitlySet("startDate")) {
                this.startDate(model.getStartDate());
            }
            if (model.wasPropertyExplicitlySet("endDate")) {
                this.endDate(model.getEndDate());
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

    /** Stock Keeping Unit (SKU) ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * Stock Keeping Unit (SKU) ID.
     *
     * @return the value
     */
    public String getSku() {
        return sku;
    }

    /** Quantity of the stock units. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Integer quantity;

    /**
     * Quantity of the stock units.
     *
     * @return the value
     */
    public Integer getQuantity() {
        return quantity;
    }

    /** Description of the stock units. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the stock units.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Sales order line identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("gsiOrderLineId")
    private final String gsiOrderLineId;

    /**
     * Sales order line identifier.
     *
     * @return the value
     */
    public String getGsiOrderLineId() {
        return gsiOrderLineId;
    }

    /** Description of the covered product belonging to this SKU. */
    @com.fasterxml.jackson.annotation.JsonProperty("licensePartDescription")
    private final String licensePartDescription;

    /**
     * Description of the covered product belonging to this SKU.
     *
     * @return the value
     */
    public String getLicensePartDescription() {
        return licensePartDescription;
    }

    /** Base metric for billing the service. */
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * Base metric for billing the service.
     *
     * @return the value
     */
    public String getMetricName() {
        return metricName;
    }

    /** Specifies if the SKU is considered as a parent or child. */
    @com.fasterxml.jackson.annotation.JsonProperty("isBaseServiceComponent")
    private final Boolean isBaseServiceComponent;

    /**
     * Specifies if the SKU is considered as a parent or child.
     *
     * @return the value
     */
    public Boolean getIsBaseServiceComponent() {
        return isBaseServiceComponent;
    }

    /** Specifies if an additional test instance can be provisioned by the SaaS application. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAdditionalInstance")
    private final Boolean isAdditionalInstance;

    /**
     * Specifies if an additional test instance can be provisioned by the SaaS application.
     *
     * @return the value
     */
    public Boolean getIsAdditionalInstance() {
        return isAdditionalInstance;
    }

    /** Date and time when the SKU was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("startDate")
    private final java.util.Date startDate;

    /**
     * Date and time when the SKU was created.
     *
     * @return the value
     */
    public java.util.Date getStartDate() {
        return startDate;
    }

    /** Date and time when the SKU ended. */
    @com.fasterxml.jackson.annotation.JsonProperty("endDate")
    private final java.util.Date endDate;

    /**
     * Date and time when the SKU ended.
     *
     * @return the value
     */
    public java.util.Date getEndDate() {
        return endDate;
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
        sb.append("SubscriptionSku(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", gsiOrderLineId=").append(String.valueOf(this.gsiOrderLineId));
        sb.append(", licensePartDescription=").append(String.valueOf(this.licensePartDescription));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", isBaseServiceComponent=").append(String.valueOf(this.isBaseServiceComponent));
        sb.append(", isAdditionalInstance=").append(String.valueOf(this.isAdditionalInstance));
        sb.append(", startDate=").append(String.valueOf(this.startDate));
        sb.append(", endDate=").append(String.valueOf(this.endDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionSku)) {
            return false;
        }

        SubscriptionSku other = (SubscriptionSku) o;
        return java.util.Objects.equals(this.sku, other.sku)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.gsiOrderLineId, other.gsiOrderLineId)
                && java.util.Objects.equals(
                        this.licensePartDescription, other.licensePartDescription)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(
                        this.isBaseServiceComponent, other.isBaseServiceComponent)
                && java.util.Objects.equals(this.isAdditionalInstance, other.isAdditionalInstance)
                && java.util.Objects.equals(this.startDate, other.startDate)
                && java.util.Objects.equals(this.endDate, other.endDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.gsiOrderLineId == null ? 43 : this.gsiOrderLineId.hashCode());
        result =
                (result * PRIME)
                        + (this.licensePartDescription == null
                                ? 43
                                : this.licensePartDescription.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result =
                (result * PRIME)
                        + (this.isBaseServiceComponent == null
                                ? 43
                                : this.isBaseServiceComponent.hashCode());
        result =
                (result * PRIME)
                        + (this.isAdditionalInstance == null
                                ? 43
                                : this.isAdditionalInstance.hashCode());
        result = (result * PRIME) + (this.startDate == null ? 43 : this.startDate.hashCode());
        result = (result * PRIME) + (this.endDate == null ? 43 : this.endDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
