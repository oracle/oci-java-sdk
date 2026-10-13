/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.model;

/**
 * The SKU external listing price. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Prices.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Prices extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"model", "value", "rangeMin", "rangeMax", "rangeUnit"})
    public Prices(Model model, String value, String rangeMin, String rangeMax, String rangeUnit) {
        super();
        this.model = model;
        this.value = value;
        this.rangeMin = rangeMin;
        this.rangeMax = rangeMax;
        this.rangeUnit = rangeUnit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Pricing model. */
        @com.fasterxml.jackson.annotation.JsonProperty("model")
        private Model model;

        /**
         * Pricing model.
         *
         * @param model the value to set
         * @return this builder
         */
        public Builder model(Model model) {
            this.model = model;
            this.__explicitlySet__.add("model");
            return this;
        }
        /** Currency value. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Currency value.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The minimum quantity for tier pricing (exclusive). Only applicable for products that
         * support range-based pricing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeMin")
        private String rangeMin;

        /**
         * The minimum quantity for tier pricing (exclusive). Only applicable for products that
         * support range-based pricing.
         *
         * @param rangeMin the value to set
         * @return this builder
         */
        public Builder rangeMin(String rangeMin) {
            this.rangeMin = rangeMin;
            this.__explicitlySet__.add("rangeMin");
            return this;
        }
        /**
         * The maximum quantity for tier pricing (inclusive). Only applicable for products that
         * support range-based pricing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeMax")
        private String rangeMax;

        /**
         * The maximum quantity for tier pricing (inclusive). Only applicable for products that
         * support range-based pricing.
         *
         * @param rangeMax the value to set
         * @return this builder
         */
        public Builder rangeMax(String rangeMax) {
            this.rangeMax = rangeMax;
            this.__explicitlySet__.add("rangeMax");
            return this;
        }
        /**
         * The {@code rangeMin} and {@code rangeMax} unit of measurement (for example, "GB" or
         * "TB").
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rangeUnit")
        private String rangeUnit;

        /**
         * The {@code rangeMin} and {@code rangeMax} unit of measurement (for example, "GB" or
         * "TB").
         *
         * @param rangeUnit the value to set
         * @return this builder
         */
        public Builder rangeUnit(String rangeUnit) {
            this.rangeUnit = rangeUnit;
            this.__explicitlySet__.add("rangeUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Prices build() {
            Prices model =
                    new Prices(
                            this.model, this.value, this.rangeMin, this.rangeMax, this.rangeUnit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Prices model) {
            if (model.wasPropertyExplicitlySet("model")) {
                this.model(model.getModel());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("rangeMin")) {
                this.rangeMin(model.getRangeMin());
            }
            if (model.wasPropertyExplicitlySet("rangeMax")) {
                this.rangeMax(model.getRangeMax());
            }
            if (model.wasPropertyExplicitlySet("rangeUnit")) {
                this.rangeUnit(model.getRangeUnit());
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

    /** Pricing model. */
    public enum Model implements com.oracle.bmc.http.internal.BmcEnum {
        PayAsYouGo("PAY_AS_YOU_GO"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Model.class);

        private final String value;
        private static java.util.Map<String, Model> map;

        static {
            map = new java.util.HashMap<>();
            for (Model v : Model.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Model(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Model create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Model', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Pricing model. */
    @com.fasterxml.jackson.annotation.JsonProperty("model")
    private final Model model;

    /**
     * Pricing model.
     *
     * @return the value
     */
    public Model getModel() {
        return model;
    }

    /** Currency value. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Currency value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * The minimum quantity for tier pricing (exclusive). Only applicable for products that support
     * range-based pricing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeMin")
    private final String rangeMin;

    /**
     * The minimum quantity for tier pricing (exclusive). Only applicable for products that support
     * range-based pricing.
     *
     * @return the value
     */
    public String getRangeMin() {
        return rangeMin;
    }

    /**
     * The maximum quantity for tier pricing (inclusive). Only applicable for products that support
     * range-based pricing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeMax")
    private final String rangeMax;

    /**
     * The maximum quantity for tier pricing (inclusive). Only applicable for products that support
     * range-based pricing.
     *
     * @return the value
     */
    public String getRangeMax() {
        return rangeMax;
    }

    /**
     * The {@code rangeMin} and {@code rangeMax} unit of measurement (for example, "GB" or "TB").
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rangeUnit")
    private final String rangeUnit;

    /**
     * The {@code rangeMin} and {@code rangeMax} unit of measurement (for example, "GB" or "TB").
     *
     * @return the value
     */
    public String getRangeUnit() {
        return rangeUnit;
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
        sb.append("Prices(");
        sb.append("super=").append(super.toString());
        sb.append("model=").append(String.valueOf(this.model));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", rangeMin=").append(String.valueOf(this.rangeMin));
        sb.append(", rangeMax=").append(String.valueOf(this.rangeMax));
        sb.append(", rangeUnit=").append(String.valueOf(this.rangeUnit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Prices)) {
            return false;
        }

        Prices other = (Prices) o;
        return java.util.Objects.equals(this.model, other.model)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.rangeMin, other.rangeMin)
                && java.util.Objects.equals(this.rangeMax, other.rangeMax)
                && java.util.Objects.equals(this.rangeUnit, other.rangeUnit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.model == null ? 43 : this.model.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.rangeMin == null ? 43 : this.rangeMin.hashCode());
        result = (result * PRIME) + (this.rangeMax == null ? 43 : this.rangeMax.hashCode());
        result = (result * PRIME) + (this.rangeUnit == null ? 43 : this.rangeUnit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
