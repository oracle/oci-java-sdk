/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ociproductcatalog.model;

/**
 * Meter defined in metering service with the associated SKU <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MeterWithSKU.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MeterWithSKU extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "skuBNumber", "skuDescription"})
    public MeterWithSKU(String name, String skuBNumber, String skuDescription) {
        super();
        this.name = name;
        this.skuBNumber = skuBNumber;
        this.skuDescription = skuDescription;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the meter */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the meter
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** B number of the SKU associated with the meter */
        @com.fasterxml.jackson.annotation.JsonProperty("skuBNumber")
        private String skuBNumber;

        /**
         * B number of the SKU associated with the meter
         *
         * @param skuBNumber the value to set
         * @return this builder
         */
        public Builder skuBNumber(String skuBNumber) {
            this.skuBNumber = skuBNumber;
            this.__explicitlySet__.add("skuBNumber");
            return this;
        }
        /** Description of the SKU associated with the meter */
        @com.fasterxml.jackson.annotation.JsonProperty("skuDescription")
        private String skuDescription;

        /**
         * Description of the SKU associated with the meter
         *
         * @param skuDescription the value to set
         * @return this builder
         */
        public Builder skuDescription(String skuDescription) {
            this.skuDescription = skuDescription;
            this.__explicitlySet__.add("skuDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MeterWithSKU build() {
            MeterWithSKU model = new MeterWithSKU(this.name, this.skuBNumber, this.skuDescription);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MeterWithSKU model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("skuBNumber")) {
                this.skuBNumber(model.getSkuBNumber());
            }
            if (model.wasPropertyExplicitlySet("skuDescription")) {
                this.skuDescription(model.getSkuDescription());
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

    /** Name of the meter */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the meter
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** B number of the SKU associated with the meter */
    @com.fasterxml.jackson.annotation.JsonProperty("skuBNumber")
    private final String skuBNumber;

    /**
     * B number of the SKU associated with the meter
     *
     * @return the value
     */
    public String getSkuBNumber() {
        return skuBNumber;
    }

    /** Description of the SKU associated with the meter */
    @com.fasterxml.jackson.annotation.JsonProperty("skuDescription")
    private final String skuDescription;

    /**
     * Description of the SKU associated with the meter
     *
     * @return the value
     */
    public String getSkuDescription() {
        return skuDescription;
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
        sb.append("MeterWithSKU(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", skuBNumber=").append(String.valueOf(this.skuBNumber));
        sb.append(", skuDescription=").append(String.valueOf(this.skuDescription));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MeterWithSKU)) {
            return false;
        }

        MeterWithSKU other = (MeterWithSKU) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.skuBNumber, other.skuBNumber)
                && java.util.Objects.equals(this.skuDescription, other.skuDescription)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.skuBNumber == null ? 43 : this.skuBNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.skuDescription == null ? 43 : this.skuDescription.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
