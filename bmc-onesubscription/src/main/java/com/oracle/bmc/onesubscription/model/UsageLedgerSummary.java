/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Revenue invoice consumption detail for a subscription. <br>
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
        builder = UsageLedgerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageLedgerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commitmentPeriod",
        "timeConsumption",
        "subId",
        "serviceName",
        "consumptionAmount",
        "type"
    })
    public UsageLedgerSummary(
            String commitmentPeriod,
            java.util.Date timeConsumption,
            String subId,
            String serviceName,
            Double consumptionAmount,
            String type) {
        super();
        this.commitmentPeriod = commitmentPeriod;
        this.timeConsumption = timeConsumption;
        this.subId = subId;
        this.serviceName = serviceName;
        this.consumptionAmount = consumptionAmount;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Commitment period from the subscription details summary. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentPeriod")
        private String commitmentPeriod;

        /**
         * Commitment period from the subscription details summary.
         *
         * @param commitmentPeriod the value to set
         * @return this builder
         */
        public Builder commitmentPeriod(String commitmentPeriod) {
            this.commitmentPeriod = commitmentPeriod;
            this.__explicitlySet__.add("commitmentPeriod");
            return this;
        }
        /** Revenue invoice consumption date. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeConsumption")
        private java.util.Date timeConsumption;

        /**
         * Revenue invoice consumption date.
         *
         * @param timeConsumption the value to set
         * @return this builder
         */
        public Builder timeConsumption(java.util.Date timeConsumption) {
            this.timeConsumption = timeConsumption;
            this.__explicitlySet__.add("timeConsumption");
            return this;
        }
        /** Authorization-order subscription identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("subId")
        private String subId;

        /**
         * Authorization-order subscription identifier.
         *
         * @param subId the value to set
         * @return this builder
         */
        public Builder subId(String subId) {
            this.subId = subId;
            this.__explicitlySet__.add("subId");
            return this;
        }
        /** Name of the consumed product or service. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Name of the consumed product or service.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Amount consumed on the consumption date. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumptionAmount")
        private Double consumptionAmount;

        /**
         * Amount consumed on the consumption date.
         *
         * @param consumptionAmount the value to set
         * @return this builder
         */
        public Builder consumptionAmount(Double consumptionAmount) {
            this.consumptionAmount = consumptionAmount;
            this.__explicitlySet__.add("consumptionAmount");
            return this;
        }
        /**
         * Consumption category. Known values include Consumption, Commitment Expiration, and
         * Overage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Consumption category. Known values include Consumption, Commitment Expiration, and
         * Overage.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageLedgerSummary build() {
            UsageLedgerSummary model =
                    new UsageLedgerSummary(
                            this.commitmentPeriod,
                            this.timeConsumption,
                            this.subId,
                            this.serviceName,
                            this.consumptionAmount,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageLedgerSummary model) {
            if (model.wasPropertyExplicitlySet("commitmentPeriod")) {
                this.commitmentPeriod(model.getCommitmentPeriod());
            }
            if (model.wasPropertyExplicitlySet("timeConsumption")) {
                this.timeConsumption(model.getTimeConsumption());
            }
            if (model.wasPropertyExplicitlySet("subId")) {
                this.subId(model.getSubId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("consumptionAmount")) {
                this.consumptionAmount(model.getConsumptionAmount());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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

    /** Commitment period from the subscription details summary. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentPeriod")
    private final String commitmentPeriod;

    /**
     * Commitment period from the subscription details summary.
     *
     * @return the value
     */
    public String getCommitmentPeriod() {
        return commitmentPeriod;
    }

    /** Revenue invoice consumption date. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeConsumption")
    private final java.util.Date timeConsumption;

    /**
     * Revenue invoice consumption date.
     *
     * @return the value
     */
    public java.util.Date getTimeConsumption() {
        return timeConsumption;
    }

    /** Authorization-order subscription identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("subId")
    private final String subId;

    /**
     * Authorization-order subscription identifier.
     *
     * @return the value
     */
    public String getSubId() {
        return subId;
    }

    /** Name of the consumed product or service. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Name of the consumed product or service.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Amount consumed on the consumption date. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumptionAmount")
    private final Double consumptionAmount;

    /**
     * Amount consumed on the consumption date.
     *
     * @return the value
     */
    public Double getConsumptionAmount() {
        return consumptionAmount;
    }

    /**
     * Consumption category. Known values include Consumption, Commitment Expiration, and Overage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Consumption category. Known values include Consumption, Commitment Expiration, and Overage.
     *
     * @return the value
     */
    public String getType() {
        return type;
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
        sb.append("UsageLedgerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("commitmentPeriod=").append(String.valueOf(this.commitmentPeriod));
        sb.append(", timeConsumption=").append(String.valueOf(this.timeConsumption));
        sb.append(", subId=").append(String.valueOf(this.subId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", consumptionAmount=").append(String.valueOf(this.consumptionAmount));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageLedgerSummary)) {
            return false;
        }

        UsageLedgerSummary other = (UsageLedgerSummary) o;
        return java.util.Objects.equals(this.commitmentPeriod, other.commitmentPeriod)
                && java.util.Objects.equals(this.timeConsumption, other.timeConsumption)
                && java.util.Objects.equals(this.subId, other.subId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.consumptionAmount, other.consumptionAmount)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.commitmentPeriod == null ? 43 : this.commitmentPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.timeConsumption == null ? 43 : this.timeConsumption.hashCode());
        result = (result * PRIME) + (this.subId == null ? 43 : this.subId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.consumptionAmount == null ? 43 : this.consumptionAmount.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
