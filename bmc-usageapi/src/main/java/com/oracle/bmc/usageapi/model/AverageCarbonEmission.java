/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * Average carbon emission. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AverageCarbonEmission.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AverageCarbonEmission
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"skuPartNumber", "averageCarbonEmission"})
    public AverageCarbonEmission(String skuPartNumber, Double averageCarbonEmission) {
        super();
        this.skuPartNumber = skuPartNumber;
        this.averageCarbonEmission = averageCarbonEmission;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The sku part number. */
        @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
        private String skuPartNumber;

        /**
         * The sku part number.
         *
         * @param skuPartNumber the value to set
         * @return this builder
         */
        public Builder skuPartNumber(String skuPartNumber) {
            this.skuPartNumber = skuPartNumber;
            this.__explicitlySet__.add("skuPartNumber");
            return this;
        }
        /** The average carbon emissions by SKU. */
        @com.fasterxml.jackson.annotation.JsonProperty("averageCarbonEmission")
        private Double averageCarbonEmission;

        /**
         * The average carbon emissions by SKU.
         *
         * @param averageCarbonEmission the value to set
         * @return this builder
         */
        public Builder averageCarbonEmission(Double averageCarbonEmission) {
            this.averageCarbonEmission = averageCarbonEmission;
            this.__explicitlySet__.add("averageCarbonEmission");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AverageCarbonEmission build() {
            AverageCarbonEmission model =
                    new AverageCarbonEmission(this.skuPartNumber, this.averageCarbonEmission);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AverageCarbonEmission model) {
            if (model.wasPropertyExplicitlySet("skuPartNumber")) {
                this.skuPartNumber(model.getSkuPartNumber());
            }
            if (model.wasPropertyExplicitlySet("averageCarbonEmission")) {
                this.averageCarbonEmission(model.getAverageCarbonEmission());
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

    /** The sku part number. */
    @com.fasterxml.jackson.annotation.JsonProperty("skuPartNumber")
    private final String skuPartNumber;

    /**
     * The sku part number.
     *
     * @return the value
     */
    public String getSkuPartNumber() {
        return skuPartNumber;
    }

    /** The average carbon emissions by SKU. */
    @com.fasterxml.jackson.annotation.JsonProperty("averageCarbonEmission")
    private final Double averageCarbonEmission;

    /**
     * The average carbon emissions by SKU.
     *
     * @return the value
     */
    public Double getAverageCarbonEmission() {
        return averageCarbonEmission;
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
        sb.append("AverageCarbonEmission(");
        sb.append("super=").append(super.toString());
        sb.append("skuPartNumber=").append(String.valueOf(this.skuPartNumber));
        sb.append(", averageCarbonEmission=").append(String.valueOf(this.averageCarbonEmission));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AverageCarbonEmission)) {
            return false;
        }

        AverageCarbonEmission other = (AverageCarbonEmission) o;
        return java.util.Objects.equals(this.skuPartNumber, other.skuPartNumber)
                && java.util.Objects.equals(this.averageCarbonEmission, other.averageCarbonEmission)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.skuPartNumber == null ? 43 : this.skuPartNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.averageCarbonEmission == null
                                ? 43
                                : this.averageCarbonEmission.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
