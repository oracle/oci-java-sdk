/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Tax details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaxInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TaxInfo {
    @Deprecated
    @java.beans.ConstructorProperties({
        "taxPayerId",
        "taxRegNumber",
        "noTaxReasonCode",
        "noTaxReasonCodeDetails",
        "taxCnpj"
    })
    public TaxInfo(
            String taxPayerId,
            String taxRegNumber,
            String noTaxReasonCode,
            String noTaxReasonCodeDetails,
            String taxCnpj) {
        super();
        this.taxPayerId = taxPayerId;
        this.taxRegNumber = taxRegNumber;
        this.noTaxReasonCode = noTaxReasonCode;
        this.noTaxReasonCodeDetails = noTaxReasonCodeDetails;
        this.taxCnpj = taxCnpj;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Tay payer identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taxPayerId")
        private String taxPayerId;

        /**
         * Tay payer identifier.
         * @param taxPayerId the value to set
         * @return this builder
         **/
        public Builder taxPayerId(String taxPayerId) {
            this.taxPayerId = taxPayerId;
            this.__explicitlySet__.add("taxPayerId");
            return this;
        }
        /**
         * Tax registration number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taxRegNumber")
        private String taxRegNumber;

        /**
         * Tax registration number.
         * @param taxRegNumber the value to set
         * @return this builder
         **/
        public Builder taxRegNumber(String taxRegNumber) {
            this.taxRegNumber = taxRegNumber;
            this.__explicitlySet__.add("taxRegNumber");
            return this;
        }
        /**
         * Tax exemption reason code.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCode")
        private String noTaxReasonCode;

        /**
         * Tax exemption reason code.
         * @param noTaxReasonCode the value to set
         * @return this builder
         **/
        public Builder noTaxReasonCode(String noTaxReasonCode) {
            this.noTaxReasonCode = noTaxReasonCode;
            this.__explicitlySet__.add("noTaxReasonCode");
            return this;
        }
        /**
         * Tax exemption reason description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCodeDetails")
        private String noTaxReasonCodeDetails;

        /**
         * Tax exemption reason description.
         * @param noTaxReasonCodeDetails the value to set
         * @return this builder
         **/
        public Builder noTaxReasonCodeDetails(String noTaxReasonCodeDetails) {
            this.noTaxReasonCodeDetails = noTaxReasonCodeDetails;
            this.__explicitlySet__.add("noTaxReasonCodeDetails");
            return this;
        }
        /**
         * Brazilian companies' CNPJ number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taxCnpj")
        private String taxCnpj;

        /**
         * Brazilian companies' CNPJ number.
         * @param taxCnpj the value to set
         * @return this builder
         **/
        public Builder taxCnpj(String taxCnpj) {
            this.taxCnpj = taxCnpj;
            this.__explicitlySet__.add("taxCnpj");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaxInfo build() {
            TaxInfo __instance__ =
                    new TaxInfo(
                            taxPayerId,
                            taxRegNumber,
                            noTaxReasonCode,
                            noTaxReasonCodeDetails,
                            taxCnpj);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaxInfo o) {
            Builder copiedBuilder =
                    taxPayerId(o.getTaxPayerId())
                            .taxRegNumber(o.getTaxRegNumber())
                            .noTaxReasonCode(o.getNoTaxReasonCode())
                            .noTaxReasonCodeDetails(o.getNoTaxReasonCodeDetails())
                            .taxCnpj(o.getTaxCnpj());

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
     * Tay payer identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taxPayerId")
    private final String taxPayerId;

    /**
     * Tay payer identifier.
     * @return the value
     **/
    public String getTaxPayerId() {
        return taxPayerId;
    }

    /**
     * Tax registration number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taxRegNumber")
    private final String taxRegNumber;

    /**
     * Tax registration number.
     * @return the value
     **/
    public String getTaxRegNumber() {
        return taxRegNumber;
    }

    /**
     * Tax exemption reason code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCode")
    private final String noTaxReasonCode;

    /**
     * Tax exemption reason code.
     * @return the value
     **/
    public String getNoTaxReasonCode() {
        return noTaxReasonCode;
    }

    /**
     * Tax exemption reason description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCodeDetails")
    private final String noTaxReasonCodeDetails;

    /**
     * Tax exemption reason description.
     * @return the value
     **/
    public String getNoTaxReasonCodeDetails() {
        return noTaxReasonCodeDetails;
    }

    /**
     * Brazilian companies' CNPJ number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taxCnpj")
    private final String taxCnpj;

    /**
     * Brazilian companies' CNPJ number.
     * @return the value
     **/
    public String getTaxCnpj() {
        return taxCnpj;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TaxInfo(");
        sb.append("taxPayerId=").append(String.valueOf(this.taxPayerId));
        sb.append(", taxRegNumber=").append(String.valueOf(this.taxRegNumber));
        sb.append(", noTaxReasonCode=").append(String.valueOf(this.noTaxReasonCode));
        sb.append(", noTaxReasonCodeDetails=").append(String.valueOf(this.noTaxReasonCodeDetails));
        sb.append(", taxCnpj=").append(String.valueOf(this.taxCnpj));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaxInfo)) {
            return false;
        }

        TaxInfo other = (TaxInfo) o;
        return java.util.Objects.equals(this.taxPayerId, other.taxPayerId)
                && java.util.Objects.equals(this.taxRegNumber, other.taxRegNumber)
                && java.util.Objects.equals(this.noTaxReasonCode, other.noTaxReasonCode)
                && java.util.Objects.equals(
                        this.noTaxReasonCodeDetails, other.noTaxReasonCodeDetails)
                && java.util.Objects.equals(this.taxCnpj, other.taxCnpj)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.taxPayerId == null ? 43 : this.taxPayerId.hashCode());
        result = (result * PRIME) + (this.taxRegNumber == null ? 43 : this.taxRegNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.noTaxReasonCode == null ? 43 : this.noTaxReasonCode.hashCode());
        result =
                (result * PRIME)
                        + (this.noTaxReasonCodeDetails == null
                                ? 43
                                : this.noTaxReasonCodeDetails.hashCode());
        result = (result * PRIME) + (this.taxCnpj == null ? 43 : this.taxCnpj.hashCode());
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
