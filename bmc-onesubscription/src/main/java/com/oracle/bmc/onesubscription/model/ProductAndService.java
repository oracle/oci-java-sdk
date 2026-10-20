/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Authorization-order product or service that draws down from the subscription. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProductAndService.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProductAndService
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subId",
        "serviceName",
        "timeStart",
        "timeEnd",
        "amountAuthorized",
        "amountProvisioned",
        "amountConsumed"
    })
    public ProductAndService(
            String subId,
            String serviceName,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            Double amountAuthorized,
            Double amountProvisioned,
            Double amountConsumed) {
        super();
        this.subId = subId;
        this.serviceName = serviceName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.amountAuthorized = amountAuthorized;
        this.amountProvisioned = amountProvisioned;
        this.amountConsumed = amountConsumed;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Subscription identifier; may be blank for non-cloud transactions. */
        @com.fasterxml.jackson.annotation.JsonProperty("subId")
        private String subId;

        /**
         * Subscription identifier; may be blank for non-cloud transactions.
         *
         * @param subId the value to set
         * @return this builder
         */
        public Builder subId(String subId) {
            this.subId = subId;
            this.__explicitlySet__.add("subId");
            return this;
        }
        /** Name of the product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the product or service.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Start date and time for the product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Start date and time for the product or service.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** End date and time for the product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * End date and time for the product or service.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** Amount authorized for the product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountAuthorized")
        private Double amountAuthorized;

        /**
         * Amount authorized for the product or service.
         *
         * @param amountAuthorized the value to set
         * @return this builder
         */
        public Builder amountAuthorized(Double amountAuthorized) {
            this.amountAuthorized = amountAuthorized;
            this.__explicitlySet__.add("amountAuthorized");
            return this;
        }
        /** Amount provisioned for the product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountProvisioned")
        private Double amountProvisioned;

        /**
         * Amount provisioned for the product or service.
         *
         * @param amountProvisioned the value to set
         * @return this builder
         */
        public Builder amountProvisioned(Double amountProvisioned) {
            this.amountProvisioned = amountProvisioned;
            this.__explicitlySet__.add("amountProvisioned");
            return this;
        }
        /** Amount consumed by the product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountConsumed")
        private Double amountConsumed;

        /**
         * Amount consumed by the product or service.
         *
         * @param amountConsumed the value to set
         * @return this builder
         */
        public Builder amountConsumed(Double amountConsumed) {
            this.amountConsumed = amountConsumed;
            this.__explicitlySet__.add("amountConsumed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProductAndService build() {
            ProductAndService model =
                    new ProductAndService(
                            this.subId,
                            this.serviceName,
                            this.timeStart,
                            this.timeEnd,
                            this.amountAuthorized,
                            this.amountProvisioned,
                            this.amountConsumed);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProductAndService model) {
            if (model.wasPropertyExplicitlySet("subId")) {
                this.subId(model.getSubId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("amountAuthorized")) {
                this.amountAuthorized(model.getAmountAuthorized());
            }
            if (model.wasPropertyExplicitlySet("amountProvisioned")) {
                this.amountProvisioned(model.getAmountProvisioned());
            }
            if (model.wasPropertyExplicitlySet("amountConsumed")) {
                this.amountConsumed(model.getAmountConsumed());
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

    /** Subscription identifier; may be blank for non-cloud transactions. */
    @com.fasterxml.jackson.annotation.JsonProperty("subId")
    private final String subId;

    /**
     * Subscription identifier; may be blank for non-cloud transactions.
     *
     * @return the value
     */
    public String getSubId() {
        return subId;
    }

    /** Name of the product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the product or service.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Start date and time for the product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Start date and time for the product or service.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** End date and time for the product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * End date and time for the product or service.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** Amount authorized for the product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountAuthorized")
    private final Double amountAuthorized;

    /**
     * Amount authorized for the product or service.
     *
     * @return the value
     */
    public Double getAmountAuthorized() {
        return amountAuthorized;
    }

    /** Amount provisioned for the product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountProvisioned")
    private final Double amountProvisioned;

    /**
     * Amount provisioned for the product or service.
     *
     * @return the value
     */
    public Double getAmountProvisioned() {
        return amountProvisioned;
    }

    /** Amount consumed by the product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountConsumed")
    private final Double amountConsumed;

    /**
     * Amount consumed by the product or service.
     *
     * @return the value
     */
    public Double getAmountConsumed() {
        return amountConsumed;
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
        sb.append("ProductAndService(");
        sb.append("super=").append(super.toString());
        sb.append("subId=").append(String.valueOf(this.subId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", amountAuthorized=").append(String.valueOf(this.amountAuthorized));
        sb.append(", amountProvisioned=").append(String.valueOf(this.amountProvisioned));
        sb.append(", amountConsumed=").append(String.valueOf(this.amountConsumed));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProductAndService)) {
            return false;
        }

        ProductAndService other = (ProductAndService) o;
        return java.util.Objects.equals(this.subId, other.subId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.amountAuthorized, other.amountAuthorized)
                && java.util.Objects.equals(this.amountProvisioned, other.amountProvisioned)
                && java.util.Objects.equals(this.amountConsumed, other.amountConsumed)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subId == null ? 43 : this.subId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.amountAuthorized == null ? 43 : this.amountAuthorized.hashCode());
        result =
                (result * PRIME)
                        + (this.amountProvisioned == null ? 43 : this.amountProvisioned.hashCode());
        result =
                (result * PRIME)
                        + (this.amountConsumed == null ? 43 : this.amountConsumed.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
