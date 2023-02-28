/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Detail for the FusionEnvironmentFamily subscription. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubscriptionDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class SubscriptionDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subscriptions"})
    public SubscriptionDetail(java.util.List<Subscription> subscriptions) {
        super();
        this.subscriptions = subscriptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of subscriptions. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
        private java.util.List<Subscription> subscriptions;

        /**
         * List of subscriptions.
         *
         * @param subscriptions the value to set
         * @return this builder
         */
        public Builder subscriptions(java.util.List<Subscription> subscriptions) {
            this.subscriptions = subscriptions;
            this.__explicitlySet__.add("subscriptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionDetail build() {
            SubscriptionDetail model = new SubscriptionDetail(this.subscriptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionDetail model) {
            if (model.wasPropertyExplicitlySet("subscriptions")) {
                this.subscriptions(model.getSubscriptions());
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

    /** List of subscriptions. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptions")
    private final java.util.List<Subscription> subscriptions;

    /**
     * List of subscriptions.
     *
     * @return the value
     */
    public java.util.List<Subscription> getSubscriptions() {
        return subscriptions;
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
        sb.append("SubscriptionDetail(");
        sb.append("super=").append(super.toString());
        sb.append("subscriptions=").append(String.valueOf(this.subscriptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionDetail)) {
            return false;
        }

        SubscriptionDetail other = (SubscriptionDetail) o;
        return java.util.Objects.equals(this.subscriptions, other.subscriptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.subscriptions == null ? 43 : this.subscriptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
