/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SubscriptionSku.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SubscriptionSku extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sku",
        "licensePartDescription",
        "metricName",
        "quantity",
        "description"
    })
    public SubscriptionSku(
            String sku,
            String licensePartDescription,
            String metricName,
            Integer quantity,
            String description) {
        super();
        this.sku = sku;
        this.licensePartDescription = licensePartDescription;
        this.metricName = metricName;
        this.quantity = quantity;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Stock keeping unit id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sku")
        private String sku;

        /**
         * Stock keeping unit id.
         * @param sku the value to set
         * @return this builder
         **/
        public Builder sku(String sku) {
            this.sku = sku;
            this.__explicitlySet__.add("sku");
            return this;
        }
        /**
         * Description of the covered product belonging to this Sku.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licensePartDescription")
        private String licensePartDescription;

        /**
         * Description of the covered product belonging to this Sku.
         * @param licensePartDescription the value to set
         * @return this builder
         **/
        public Builder licensePartDescription(String licensePartDescription) {
            this.licensePartDescription = licensePartDescription;
            this.__explicitlySet__.add("licensePartDescription");
            return this;
        }
        /**
         * Base metric for billing the service.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricName")
        private String metricName;

        /**
         * Base metric for billing the service.
         * @param metricName the value to set
         * @return this builder
         **/
        public Builder metricName(String metricName) {
            this.metricName = metricName;
            this.__explicitlySet__.add("metricName");
            return this;
        }
        /**
         * Quantity of the stock units.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private Integer quantity;

        /**
         * Quantity of the stock units.
         * @param quantity the value to set
         * @return this builder
         **/
        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /**
         * Description of the stock units.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the stock units.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSku build() {
            SubscriptionSku model =
                    new SubscriptionSku(
                            this.sku,
                            this.licensePartDescription,
                            this.metricName,
                            this.quantity,
                            this.description);
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
            if (model.wasPropertyExplicitlySet("licensePartDescription")) {
                this.licensePartDescription(model.getLicensePartDescription());
            }
            if (model.wasPropertyExplicitlySet("metricName")) {
                this.metricName(model.getMetricName());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * Stock keeping unit id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sku")
    private final String sku;

    /**
     * Stock keeping unit id.
     * @return the value
     **/
    public String getSku() {
        return sku;
    }

    /**
     * Description of the covered product belonging to this Sku.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licensePartDescription")
    private final String licensePartDescription;

    /**
     * Description of the covered product belonging to this Sku.
     * @return the value
     **/
    public String getLicensePartDescription() {
        return licensePartDescription;
    }

    /**
     * Base metric for billing the service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricName")
    private final String metricName;

    /**
     * Base metric for billing the service.
     * @return the value
     **/
    public String getMetricName() {
        return metricName;
    }

    /**
     * Quantity of the stock units.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final Integer quantity;

    /**
     * Quantity of the stock units.
     * @return the value
     **/
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Description of the stock units.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the stock units.
     * @return the value
     **/
    public String getDescription() {
        return description;
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
        sb.append("SubscriptionSku(");
        sb.append("super=").append(super.toString());
        sb.append("sku=").append(String.valueOf(this.sku));
        sb.append(", licensePartDescription=").append(String.valueOf(this.licensePartDescription));
        sb.append(", metricName=").append(String.valueOf(this.metricName));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", description=").append(String.valueOf(this.description));
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
                && java.util.Objects.equals(
                        this.licensePartDescription, other.licensePartDescription)
                && java.util.Objects.equals(this.metricName, other.metricName)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sku == null ? 43 : this.sku.hashCode());
        result =
                (result * PRIME)
                        + (this.licensePartDescription == null
                                ? 43
                                : this.licensePartDescription.hashCode());
        result = (result * PRIME) + (this.metricName == null ? 43 : this.metricName.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
