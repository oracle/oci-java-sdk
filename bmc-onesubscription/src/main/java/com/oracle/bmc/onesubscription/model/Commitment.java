/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Subscribed Service commitment summary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Commitment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Commitment extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "subscribedServiceId",
        "timeStart",
        "timeEnd",
        "quantity",
        "usedAmount",
        "availableAmount",
        "fundedAllocationValue"
    })
    public Commitment(
            String id,
            String subscribedServiceId,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            String quantity,
            String usedAmount,
            String availableAmount,
            String fundedAllocationValue) {
        super();
        this.id = id;
        this.subscribedServiceId = subscribedServiceId;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.quantity = quantity;
        this.usedAmount = usedAmount;
        this.availableAmount = availableAmount;
        this.fundedAllocationValue = fundedAllocationValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** SPM internal Commitment ID */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * SPM internal Commitment ID
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** SPM internal Subscribed Service ID */
        @com.fasterxml.jackson.annotation.JsonProperty("subscribedServiceId")
        private String subscribedServiceId;

        /**
         * SPM internal Subscribed Service ID
         *
         * @param subscribedServiceId the value to set
         * @return this builder
         */
        public Builder subscribedServiceId(String subscribedServiceId) {
            this.subscribedServiceId = subscribedServiceId;
            this.__explicitlySet__.add("subscribedServiceId");
            return this;
        }
        /** Commitment start date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Commitment start date
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Commitment end date */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Commitment end date
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** Commitment quantity */
        @com.fasterxml.jackson.annotation.JsonProperty("quantity")
        private String quantity;

        /**
         * Commitment quantity
         *
         * @param quantity the value to set
         * @return this builder
         */
        public Builder quantity(String quantity) {
            this.quantity = quantity;
            this.__explicitlySet__.add("quantity");
            return this;
        }
        /** Commitment used amount */
        @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
        private String usedAmount;

        /**
         * Commitment used amount
         *
         * @param usedAmount the value to set
         * @return this builder
         */
        public Builder usedAmount(String usedAmount) {
            this.usedAmount = usedAmount;
            this.__explicitlySet__.add("usedAmount");
            return this;
        }
        /** Commitment available amount */
        @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
        private String availableAmount;

        /**
         * Commitment available amount
         *
         * @param availableAmount the value to set
         * @return this builder
         */
        public Builder availableAmount(String availableAmount) {
            this.availableAmount = availableAmount;
            this.__explicitlySet__.add("availableAmount");
            return this;
        }
        /** Funded Allocation line value example: 12000.00 */
        @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
        private String fundedAllocationValue;

        /**
         * Funded Allocation line value example: 12000.00
         *
         * @param fundedAllocationValue the value to set
         * @return this builder
         */
        public Builder fundedAllocationValue(String fundedAllocationValue) {
            this.fundedAllocationValue = fundedAllocationValue;
            this.__explicitlySet__.add("fundedAllocationValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Commitment build() {
            Commitment model =
                    new Commitment(
                            this.id,
                            this.subscribedServiceId,
                            this.timeStart,
                            this.timeEnd,
                            this.quantity,
                            this.usedAmount,
                            this.availableAmount,
                            this.fundedAllocationValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Commitment model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("subscribedServiceId")) {
                this.subscribedServiceId(model.getSubscribedServiceId());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("quantity")) {
                this.quantity(model.getQuantity());
            }
            if (model.wasPropertyExplicitlySet("usedAmount")) {
                this.usedAmount(model.getUsedAmount());
            }
            if (model.wasPropertyExplicitlySet("availableAmount")) {
                this.availableAmount(model.getAvailableAmount());
            }
            if (model.wasPropertyExplicitlySet("fundedAllocationValue")) {
                this.fundedAllocationValue(model.getFundedAllocationValue());
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

    /** SPM internal Commitment ID */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * SPM internal Commitment ID
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** SPM internal Subscribed Service ID */
    @com.fasterxml.jackson.annotation.JsonProperty("subscribedServiceId")
    private final String subscribedServiceId;

    /**
     * SPM internal Subscribed Service ID
     *
     * @return the value
     */
    public String getSubscribedServiceId() {
        return subscribedServiceId;
    }

    /** Commitment start date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Commitment start date
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Commitment end date */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Commitment end date
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** Commitment quantity */
    @com.fasterxml.jackson.annotation.JsonProperty("quantity")
    private final String quantity;

    /**
     * Commitment quantity
     *
     * @return the value
     */
    public String getQuantity() {
        return quantity;
    }

    /** Commitment used amount */
    @com.fasterxml.jackson.annotation.JsonProperty("usedAmount")
    private final String usedAmount;

    /**
     * Commitment used amount
     *
     * @return the value
     */
    public String getUsedAmount() {
        return usedAmount;
    }

    /** Commitment available amount */
    @com.fasterxml.jackson.annotation.JsonProperty("availableAmount")
    private final String availableAmount;

    /**
     * Commitment available amount
     *
     * @return the value
     */
    public String getAvailableAmount() {
        return availableAmount;
    }

    /** Funded Allocation line value example: 12000.00 */
    @com.fasterxml.jackson.annotation.JsonProperty("fundedAllocationValue")
    private final String fundedAllocationValue;

    /**
     * Funded Allocation line value example: 12000.00
     *
     * @return the value
     */
    public String getFundedAllocationValue() {
        return fundedAllocationValue;
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
        sb.append("Commitment(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", subscribedServiceId=").append(String.valueOf(this.subscribedServiceId));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", quantity=").append(String.valueOf(this.quantity));
        sb.append(", usedAmount=").append(String.valueOf(this.usedAmount));
        sb.append(", availableAmount=").append(String.valueOf(this.availableAmount));
        sb.append(", fundedAllocationValue=").append(String.valueOf(this.fundedAllocationValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Commitment)) {
            return false;
        }

        Commitment other = (Commitment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.subscribedServiceId, other.subscribedServiceId)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.quantity, other.quantity)
                && java.util.Objects.equals(this.usedAmount, other.usedAmount)
                && java.util.Objects.equals(this.availableAmount, other.availableAmount)
                && java.util.Objects.equals(this.fundedAllocationValue, other.fundedAllocationValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.subscribedServiceId == null
                                ? 43
                                : this.subscribedServiceId.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.quantity == null ? 43 : this.quantity.hashCode());
        result = (result * PRIME) + (this.usedAmount == null ? 43 : this.usedAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableAmount == null ? 43 : this.availableAmount.hashCode());
        result =
                (result * PRIME)
                        + (this.fundedAllocationValue == null
                                ? 43
                                : this.fundedAllocationValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
