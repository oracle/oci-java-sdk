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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaxInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TaxInfo {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("taxPayerId")
        private String taxPayerId;

        public Builder taxPayerId(String taxPayerId) {
            this.taxPayerId = taxPayerId;
            this.__explicitlySet__.add("taxPayerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taxRegNumber")
        private String taxRegNumber;

        public Builder taxRegNumber(String taxRegNumber) {
            this.taxRegNumber = taxRegNumber;
            this.__explicitlySet__.add("taxRegNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCode")
        private String noTaxReasonCode;

        public Builder noTaxReasonCode(String noTaxReasonCode) {
            this.noTaxReasonCode = noTaxReasonCode;
            this.__explicitlySet__.add("noTaxReasonCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCodeDetails")
        private String noTaxReasonCodeDetails;

        public Builder noTaxReasonCodeDetails(String noTaxReasonCodeDetails) {
            this.noTaxReasonCodeDetails = noTaxReasonCodeDetails;
            this.__explicitlySet__.add("noTaxReasonCodeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("taxCnpj")
        private String taxCnpj;

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

    /**
     * Tay payer identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taxPayerId")
    String taxPayerId;

    /**
     * Tax registration number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taxRegNumber")
    String taxRegNumber;

    /**
     * Tax exemption reason code.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCode")
    String noTaxReasonCode;

    /**
     * Tax exemption reason description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("noTaxReasonCodeDetails")
    String noTaxReasonCodeDetails;

    /**
     * Brazilian companies' CNPJ number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taxCnpj")
    String taxCnpj;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
