/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osuborganizationsubscription.model;

/**
 * Subscription summary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubscriptionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SubscriptionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "serviceName",
        "type",
        "status",
        "timeStart",
        "timeEnd",
        "currency",
        "totalValue"
    })
    public SubscriptionSummary(
            String id,
            String serviceName,
            String type,
            String status,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            Currency currency,
            String totalValue) {
        super();
        this.id = id;
        this.serviceName = serviceName;
        this.type = type;
        this.status = status;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.currency = currency;
        this.totalValue = totalValue;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** SPM internal Subscription ID */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * SPM internal Subscription ID
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Customer friendly service name provided by PRG */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Customer friendly service name provided by PRG
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /** Subscription Type i.e. IAAS,SAAS,PAAS */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Subscription Type i.e. IAAS,SAAS,PAAS
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Status of the plan */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Status of the plan
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Represents the date when the first service of the subscription was activated */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * Represents the date when the first service of the subscription was activated
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** Represents the date when the last service of the subscription ends */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * Represents the date when the last service of the subscription ends
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currency")
        private Currency currency;

        public Builder currency(Currency currency) {
            this.currency = currency;
            this.__explicitlySet__.add("currency");
            return this;
        }
        /**
         * Total aggregate TCLV of all lines for the subscription including expired, active, and
         * signed
         */
        @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
        private String totalValue;

        /**
         * Total aggregate TCLV of all lines for the subscription including expired, active, and
         * signed
         *
         * @param totalValue the value to set
         * @return this builder
         */
        public Builder totalValue(String totalValue) {
            this.totalValue = totalValue;
            this.__explicitlySet__.add("totalValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSummary build() {
            SubscriptionSummary model =
                    new SubscriptionSummary(
                            this.id,
                            this.serviceName,
                            this.type,
                            this.status,
                            this.timeStart,
                            this.timeEnd,
                            this.currency,
                            this.totalValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("currency")) {
                this.currency(model.getCurrency());
            }
            if (model.wasPropertyExplicitlySet("totalValue")) {
                this.totalValue(model.getTotalValue());
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

    /** SPM internal Subscription ID */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * SPM internal Subscription ID
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Customer friendly service name provided by PRG */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Customer friendly service name provided by PRG
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    /** Subscription Type i.e. IAAS,SAAS,PAAS */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Subscription Type i.e. IAAS,SAAS,PAAS
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Status of the plan */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Status of the plan
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Represents the date when the first service of the subscription was activated */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * Represents the date when the first service of the subscription was activated
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** Represents the date when the last service of the subscription ends */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * Represents the date when the last service of the subscription ends
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currency")
    private final Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    /**
     * Total aggregate TCLV of all lines for the subscription including expired, active, and signed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("totalValue")
    private final String totalValue;

    /**
     * Total aggregate TCLV of all lines for the subscription including expired, active, and signed
     *
     * @return the value
     */
    public String getTotalValue() {
        return totalValue;
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
        sb.append("SubscriptionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", totalValue=").append(String.valueOf(this.totalValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionSummary)) {
            return false;
        }

        SubscriptionSummary other = (SubscriptionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.totalValue, other.totalValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.totalValue == null ? 43 : this.totalValue.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
