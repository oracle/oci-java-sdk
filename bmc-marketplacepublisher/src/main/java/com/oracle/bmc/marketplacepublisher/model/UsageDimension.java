/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Usage dimension for usage-based or hybrid SaaS pricing.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsageDimension.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageDimension extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dimensionKey",
        "dimensionName",
        "dimensionDescription",
        "metricType",
        "dimensionBillingFrequency",
        "includedQuantity",
        "additionalDetails",
        "rates"
    })
    public UsageDimension(
            String dimensionKey,
            String dimensionName,
            String dimensionDescription,
            MetricType metricType,
            DimensionBillingFrequency dimensionBillingFrequency,
            Float includedQuantity,
            java.util.Map<String, String> additionalDetails,
            java.util.List<PricingRate> rates) {
        super();
        this.dimensionKey = dimensionKey;
        this.dimensionName = dimensionName;
        this.dimensionDescription = dimensionDescription;
        this.metricType = metricType;
        this.dimensionBillingFrequency = dimensionBillingFrequency;
        this.includedQuantity = includedQuantity;
        this.additionalDetails = additionalDetails;
        this.rates = rates;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Server-generated unique identifier for the usage dimension. If omitted in the request, it is generated automatically.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionKey")
        private String dimensionKey;

        /**
         * Server-generated unique identifier for the usage dimension. If omitted in the request, it is generated automatically.
         * @param dimensionKey the value to set
         * @return this builder
         **/
        public Builder dimensionKey(String dimensionKey) {
            this.dimensionKey = dimensionKey;
            this.__explicitlySet__.add("dimensionKey");
            return this;
        }
        /**
         * The dimension name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
        private String dimensionName;

        /**
         * The dimension name.
         * @param dimensionName the value to set
         * @return this builder
         **/
        public Builder dimensionName(String dimensionName) {
            this.dimensionName = dimensionName;
            this.__explicitlySet__.add("dimensionName");
            return this;
        }
        /**
         * The dimension description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionDescription")
        private String dimensionDescription;

        /**
         * The dimension description.
         * @param dimensionDescription the value to set
         * @return this builder
         **/
        public Builder dimensionDescription(String dimensionDescription) {
            this.dimensionDescription = dimensionDescription;
            this.__explicitlySet__.add("dimensionDescription");
            return this;
        }
        /**
         * The metric type used to measure usage for the dimension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metricType")
        private MetricType metricType;

        /**
         * The metric type used to measure usage for the dimension.
         * @param metricType the value to set
         * @return this builder
         **/
        public Builder metricType(MetricType metricType) {
            this.metricType = metricType;
            this.__explicitlySet__.add("metricType");
            return this;
        }
        /**
         * Billing frequency used for the dimension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dimensionBillingFrequency")
        private DimensionBillingFrequency dimensionBillingFrequency;

        /**
         * Billing frequency used for the dimension.
         * @param dimensionBillingFrequency the value to set
         * @return this builder
         **/
        public Builder dimensionBillingFrequency(
                DimensionBillingFrequency dimensionBillingFrequency) {
            this.dimensionBillingFrequency = dimensionBillingFrequency;
            this.__explicitlySet__.add("dimensionBillingFrequency");
            return this;
        }
        /**
         * Included quantity before overage rates apply.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("includedQuantity")
        private Float includedQuantity;

        /**
         * Included quantity before overage rates apply.
         * @param includedQuantity the value to set
         * @return this builder
         **/
        public Builder includedQuantity(Float includedQuantity) {
            this.includedQuantity = includedQuantity;
            this.__explicitlySet__.add("includedQuantity");
            return this;
        }
        /**
         * Additional metadata key/value pairs for the dimension.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        /**
         * Additional metadata key/value pairs for the dimension.
         *
         * @param additionalDetails the value to set
         * @return this builder
         **/
        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }
        /**
         * List of pricing rates provider by publisher for the dimension.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rates")
        private java.util.List<PricingRate> rates;

        /**
         * List of pricing rates provider by publisher for the dimension.
         * @param rates the value to set
         * @return this builder
         **/
        public Builder rates(java.util.List<PricingRate> rates) {
            this.rates = rates;
            this.__explicitlySet__.add("rates");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageDimension build() {
            UsageDimension model =
                    new UsageDimension(
                            this.dimensionKey,
                            this.dimensionName,
                            this.dimensionDescription,
                            this.metricType,
                            this.dimensionBillingFrequency,
                            this.includedQuantity,
                            this.additionalDetails,
                            this.rates);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageDimension model) {
            if (model.wasPropertyExplicitlySet("dimensionKey")) {
                this.dimensionKey(model.getDimensionKey());
            }
            if (model.wasPropertyExplicitlySet("dimensionName")) {
                this.dimensionName(model.getDimensionName());
            }
            if (model.wasPropertyExplicitlySet("dimensionDescription")) {
                this.dimensionDescription(model.getDimensionDescription());
            }
            if (model.wasPropertyExplicitlySet("metricType")) {
                this.metricType(model.getMetricType());
            }
            if (model.wasPropertyExplicitlySet("dimensionBillingFrequency")) {
                this.dimensionBillingFrequency(model.getDimensionBillingFrequency());
            }
            if (model.wasPropertyExplicitlySet("includedQuantity")) {
                this.includedQuantity(model.getIncludedQuantity());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("rates")) {
                this.rates(model.getRates());
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
     * Server-generated unique identifier for the usage dimension. If omitted in the request, it is generated automatically.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionKey")
    private final String dimensionKey;

    /**
     * Server-generated unique identifier for the usage dimension. If omitted in the request, it is generated automatically.
     * @return the value
     **/
    public String getDimensionKey() {
        return dimensionKey;
    }

    /**
     * The dimension name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionName")
    private final String dimensionName;

    /**
     * The dimension name.
     * @return the value
     **/
    public String getDimensionName() {
        return dimensionName;
    }

    /**
     * The dimension description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionDescription")
    private final String dimensionDescription;

    /**
     * The dimension description.
     * @return the value
     **/
    public String getDimensionDescription() {
        return dimensionDescription;
    }

    /**
     * The metric type used to measure usage for the dimension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metricType")
    private final MetricType metricType;

    /**
     * The metric type used to measure usage for the dimension.
     * @return the value
     **/
    public MetricType getMetricType() {
        return metricType;
    }

    /**
     * Billing frequency used for the dimension.
     **/
    public enum DimensionBillingFrequency {
        Monthly("MONTHLY"),
        Quarterly("QUARTERLY"),
        SemiAnnual("SEMI_ANNUAL"),
        Annual("ANNUAL"),
        Biennial("BIENNIAL"),
        Triennial("TRIENNIAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DimensionBillingFrequency.class);

        private final String value;
        private static java.util.Map<String, DimensionBillingFrequency> map;

        static {
            map = new java.util.HashMap<>();
            for (DimensionBillingFrequency v : DimensionBillingFrequency.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DimensionBillingFrequency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DimensionBillingFrequency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DimensionBillingFrequency', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Billing frequency used for the dimension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dimensionBillingFrequency")
    private final DimensionBillingFrequency dimensionBillingFrequency;

    /**
     * Billing frequency used for the dimension.
     * @return the value
     **/
    public DimensionBillingFrequency getDimensionBillingFrequency() {
        return dimensionBillingFrequency;
    }

    /**
     * Included quantity before overage rates apply.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includedQuantity")
    private final Float includedQuantity;

    /**
     * Included quantity before overage rates apply.
     * @return the value
     **/
    public Float getIncludedQuantity() {
        return includedQuantity;
    }

    /**
     * Additional metadata key/value pairs for the dimension.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final java.util.Map<String, String> additionalDetails;

    /**
     * Additional metadata key/value pairs for the dimension.
     *
     * @return the value
     **/
    public java.util.Map<String, String> getAdditionalDetails() {
        return additionalDetails;
    }

    /**
     * List of pricing rates provider by publisher for the dimension.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rates")
    private final java.util.List<PricingRate> rates;

    /**
     * List of pricing rates provider by publisher for the dimension.
     * @return the value
     **/
    public java.util.List<PricingRate> getRates() {
        return rates;
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
        sb.append("UsageDimension(");
        sb.append("super=").append(super.toString());
        sb.append("dimensionKey=").append(String.valueOf(this.dimensionKey));
        sb.append(", dimensionName=").append(String.valueOf(this.dimensionName));
        sb.append(", dimensionDescription=").append(String.valueOf(this.dimensionDescription));
        sb.append(", metricType=").append(String.valueOf(this.metricType));
        sb.append(", dimensionBillingFrequency=")
                .append(String.valueOf(this.dimensionBillingFrequency));
        sb.append(", includedQuantity=").append(String.valueOf(this.includedQuantity));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(", rates=").append(String.valueOf(this.rates));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageDimension)) {
            return false;
        }

        UsageDimension other = (UsageDimension) o;
        return java.util.Objects.equals(this.dimensionKey, other.dimensionKey)
                && java.util.Objects.equals(this.dimensionName, other.dimensionName)
                && java.util.Objects.equals(this.dimensionDescription, other.dimensionDescription)
                && java.util.Objects.equals(this.metricType, other.metricType)
                && java.util.Objects.equals(
                        this.dimensionBillingFrequency, other.dimensionBillingFrequency)
                && java.util.Objects.equals(this.includedQuantity, other.includedQuantity)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && java.util.Objects.equals(this.rates, other.rates)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dimensionKey == null ? 43 : this.dimensionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionName == null ? 43 : this.dimensionName.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionDescription == null
                                ? 43
                                : this.dimensionDescription.hashCode());
        result = (result * PRIME) + (this.metricType == null ? 43 : this.metricType.hashCode());
        result =
                (result * PRIME)
                        + (this.dimensionBillingFrequency == null
                                ? 43
                                : this.dimensionBillingFrequency.hashCode());
        result =
                (result * PRIME)
                        + (this.includedQuantity == null ? 43 : this.includedQuantity.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + (this.rates == null ? 43 : this.rates.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
