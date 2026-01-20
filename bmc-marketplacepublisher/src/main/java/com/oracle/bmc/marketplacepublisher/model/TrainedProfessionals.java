/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * Number of trained professional per product <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TrainedProfessionals.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TrainedProfessionals
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"professionalsCount", "productCode"})
    public TrainedProfessionals(Long professionalsCount, String productCode) {
        super();
        this.professionalsCount = professionalsCount;
        this.productCode = productCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Count of trained professional */
        @com.fasterxml.jackson.annotation.JsonProperty("professionalsCount")
        private Long professionalsCount;

        /**
         * Count of trained professional
         *
         * @param professionalsCount the value to set
         * @return this builder
         */
        public Builder professionalsCount(Long professionalsCount) {
            this.professionalsCount = professionalsCount;
            this.__explicitlySet__.add("professionalsCount");
            return this;
        }
        /** Product code on which professional is trained on */
        @com.fasterxml.jackson.annotation.JsonProperty("productCode")
        private String productCode;

        /**
         * Product code on which professional is trained on
         *
         * @param productCode the value to set
         * @return this builder
         */
        public Builder productCode(String productCode) {
            this.productCode = productCode;
            this.__explicitlySet__.add("productCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TrainedProfessionals build() {
            TrainedProfessionals model =
                    new TrainedProfessionals(this.professionalsCount, this.productCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TrainedProfessionals model) {
            if (model.wasPropertyExplicitlySet("professionalsCount")) {
                this.professionalsCount(model.getProfessionalsCount());
            }
            if (model.wasPropertyExplicitlySet("productCode")) {
                this.productCode(model.getProductCode());
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

    /** Count of trained professional */
    @com.fasterxml.jackson.annotation.JsonProperty("professionalsCount")
    private final Long professionalsCount;

    /**
     * Count of trained professional
     *
     * @return the value
     */
    public Long getProfessionalsCount() {
        return professionalsCount;
    }

    /** Product code on which professional is trained on */
    @com.fasterxml.jackson.annotation.JsonProperty("productCode")
    private final String productCode;

    /**
     * Product code on which professional is trained on
     *
     * @return the value
     */
    public String getProductCode() {
        return productCode;
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
        sb.append("TrainedProfessionals(");
        sb.append("super=").append(super.toString());
        sb.append("professionalsCount=").append(String.valueOf(this.professionalsCount));
        sb.append(", productCode=").append(String.valueOf(this.productCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TrainedProfessionals)) {
            return false;
        }

        TrainedProfessionals other = (TrainedProfessionals) o;
        return java.util.Objects.equals(this.professionalsCount, other.professionalsCount)
                && java.util.Objects.equals(this.productCode, other.productCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.professionalsCount == null
                                ? 43
                                : this.professionalsCount.hashCode());
        result = (result * PRIME) + (this.productCode == null ? 43 : this.productCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
