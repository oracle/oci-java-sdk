/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubsubscription.model;

/**
 * Subscription summary <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubscriptionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "timeStart",
        "timeEnd",
        "currency",
        "serviceName",
        "subscribedServices"
    })
    public SubscriptionSummary(
            String status,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            Currency currency,
            String serviceName,
            java.util.List<SubscribedServiceSummary> subscribedServices) {
        super();
        this.status = status;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.currency = currency;
        this.serviceName = serviceName;
        this.subscribedServices = subscribedServices;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** List of Subscribed Services of the plan */
        @com.fasterxml.jackson.annotation.JsonProperty("subscribedServices")
        private java.util.List<SubscribedServiceSummary> subscribedServices;

        /**
         * List of Subscribed Services of the plan
         *
         * @param subscribedServices the value to set
         * @return this builder
         */
        public Builder subscribedServices(
                java.util.List<SubscribedServiceSummary> subscribedServices) {
            this.subscribedServices = subscribedServices;
            this.__explicitlySet__.add("subscribedServices");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionSummary build() {
            SubscriptionSummary model =
                    new SubscriptionSummary(
                            this.status,
                            this.timeStart,
                            this.timeEnd,
                            this.currency,
                            this.serviceName,
                            this.subscribedServices);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionSummary model) {
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
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("subscribedServices")) {
                this.subscribedServices(model.getSubscribedServices());
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

    /** List of Subscribed Services of the plan */
    @com.fasterxml.jackson.annotation.JsonProperty("subscribedServices")
    private final java.util.List<SubscribedServiceSummary> subscribedServices;

    /**
     * List of Subscribed Services of the plan
     *
     * @return the value
     */
    public java.util.List<SubscribedServiceSummary> getSubscribedServices() {
        return subscribedServices;
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
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", currency=").append(String.valueOf(this.currency));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", subscribedServices=").append(String.valueOf(this.subscribedServices));
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
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.currency, other.currency)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.subscribedServices, other.subscribedServices)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.currency == null ? 43 : this.currency.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscribedServices == null
                                ? 43
                                : this.subscribedServices.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
