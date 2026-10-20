/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Associated Subscriptions <br>
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
        builder = AssociatedSubscriptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssociatedSubscriptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscriptionNumber",
        "timeValidFrom",
        "timeValidTo",
        "lifecycleState"
    })
    public AssociatedSubscriptions(
            String subscriptionNumber,
            java.util.Date timeValidFrom,
            java.util.Date timeValidTo,
            String lifecycleState) {
        super();
        this.subscriptionNumber = subscriptionNumber;
        this.timeValidFrom = timeValidFrom;
        this.timeValidTo = timeValidTo;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Subscription Number */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionNumber")
        private String subscriptionNumber;

        /**
         * Subscription Number
         *
         * @param subscriptionNumber the value to set
         * @return this builder
         */
        public Builder subscriptionNumber(String subscriptionNumber) {
            this.subscriptionNumber = subscriptionNumber;
            this.__explicitlySet__.add("subscriptionNumber");
            return this;
        }
        /** Represents the valid from date of the subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidFrom")
        private java.util.Date timeValidFrom;

        /**
         * Represents the valid from date of the subscription
         *
         * @param timeValidFrom the value to set
         * @return this builder
         */
        public Builder timeValidFrom(java.util.Date timeValidFrom) {
            this.timeValidFrom = timeValidFrom;
            this.__explicitlySet__.add("timeValidFrom");
            return this;
        }
        /** Represents the valid to date of the subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidTo")
        private java.util.Date timeValidTo;

        /**
         * Represents the valid to date of the subscription
         *
         * @param timeValidTo the value to set
         * @return this builder
         */
        public Builder timeValidTo(java.util.Date timeValidTo) {
            this.timeValidTo = timeValidTo;
            this.__explicitlySet__.add("timeValidTo");
            return this;
        }
        /** Lifecycle status of the subscription */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private String lifecycleState;

        /**
         * Lifecycle status of the subscription
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociatedSubscriptions build() {
            AssociatedSubscriptions model =
                    new AssociatedSubscriptions(
                            this.subscriptionNumber,
                            this.timeValidFrom,
                            this.timeValidTo,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociatedSubscriptions model) {
            if (model.wasPropertyExplicitlySet("subscriptionNumber")) {
                this.subscriptionNumber(model.getSubscriptionNumber());
            }
            if (model.wasPropertyExplicitlySet("timeValidFrom")) {
                this.timeValidFrom(model.getTimeValidFrom());
            }
            if (model.wasPropertyExplicitlySet("timeValidTo")) {
                this.timeValidTo(model.getTimeValidTo());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** Subscription Number */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionNumber")
    private final String subscriptionNumber;

    /**
     * Subscription Number
     *
     * @return the value
     */
    public String getSubscriptionNumber() {
        return subscriptionNumber;
    }

    /** Represents the valid from date of the subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidFrom")
    private final java.util.Date timeValidFrom;

    /**
     * Represents the valid from date of the subscription
     *
     * @return the value
     */
    public java.util.Date getTimeValidFrom() {
        return timeValidFrom;
    }

    /** Represents the valid to date of the subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidTo")
    private final java.util.Date timeValidTo;

    /**
     * Represents the valid to date of the subscription
     *
     * @return the value
     */
    public java.util.Date getTimeValidTo() {
        return timeValidTo;
    }

    /** Lifecycle status of the subscription */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final String lifecycleState;

    /**
     * Lifecycle status of the subscription
     *
     * @return the value
     */
    public String getLifecycleState() {
        return lifecycleState;
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
        sb.append("AssociatedSubscriptions(");
        sb.append("super=").append(super.toString());
        sb.append("subscriptionNumber=").append(String.valueOf(this.subscriptionNumber));
        sb.append(", timeValidFrom=").append(String.valueOf(this.timeValidFrom));
        sb.append(", timeValidTo=").append(String.valueOf(this.timeValidTo));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssociatedSubscriptions)) {
            return false;
        }

        AssociatedSubscriptions other = (AssociatedSubscriptions) o;
        return java.util.Objects.equals(this.subscriptionNumber, other.subscriptionNumber)
                && java.util.Objects.equals(this.timeValidFrom, other.timeValidFrom)
                && java.util.Objects.equals(this.timeValidTo, other.timeValidTo)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscriptionNumber == null
                                ? 43
                                : this.subscriptionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidFrom == null ? 43 : this.timeValidFrom.hashCode());
        result = (result * PRIME) + (this.timeValidTo == null ? 43 : this.timeValidTo.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
