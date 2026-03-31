/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.self.model;

/**
 * Response model for the activation of a subscription. Includes the details of the activated
 * subscription. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ActivateSubscriptionResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivateSubscriptionResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscriptionId",
        "displayName",
        "timeStart",
        "timeEnd",
        "lifecycleState",
        "lifecycleDetails"
    })
    public ActivateSubscriptionResult(
            String subscriptionId,
            String displayName,
            java.util.Date timeStart,
            java.util.Date timeEnd,
            LifecycleStateEnum lifecycleState,
            LifecycleDetailsEnum lifecycleDetails) {
        super();
        this.subscriptionId = subscriptionId;
        this.displayName = displayName;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique identifier of the activated subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The unique identifier of the activated subscription.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * The subscription name. Must be unique within the compartment. This value can be updated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The subscription name. Must be unique within the compartment. This value can be updated.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The start date of the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private java.util.Date timeStart;

        /**
         * The start date of the subscription.
         *
         * @param timeStart the value to set
         * @return this builder
         */
        public Builder timeStart(java.util.Date timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /** The end date of the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end date of the subscription.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The current state of the Subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStateEnum lifecycleState;

        /**
         * The current state of the Subscription.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStateEnum lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the Subscription in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private LifecycleDetailsEnum lifecycleDetails;

        /**
         * A message that describes the current state of the Subscription in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(LifecycleDetailsEnum lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivateSubscriptionResult build() {
            ActivateSubscriptionResult model =
                    new ActivateSubscriptionResult(
                            this.subscriptionId,
                            this.displayName,
                            this.timeStart,
                            this.timeEnd,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivateSubscriptionResult model) {
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** The unique identifier of the activated subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The unique identifier of the activated subscription.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** The subscription name. Must be unique within the compartment. This value can be updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The subscription name. Must be unique within the compartment. This value can be updated.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The start date of the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final java.util.Date timeStart;

    /**
     * The start date of the subscription.
     *
     * @return the value
     */
    public java.util.Date getTimeStart() {
        return timeStart;
    }

    /** The end date of the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end date of the subscription.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** The current state of the Subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStateEnum lifecycleState;

    /**
     * The current state of the Subscription.
     *
     * @return the value
     */
    public LifecycleStateEnum getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the Subscription in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final LifecycleDetailsEnum lifecycleDetails;

    /**
     * A message that describes the current state of the Subscription in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public LifecycleDetailsEnum getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("ActivateSubscriptionResult(");
        sb.append("super=").append(super.toString());
        sb.append("subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivateSubscriptionResult)) {
            return false;
        }

        ActivateSubscriptionResult other = (ActivateSubscriptionResult) o;
        return java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
