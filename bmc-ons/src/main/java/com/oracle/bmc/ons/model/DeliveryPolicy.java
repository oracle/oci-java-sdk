/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.model;

/**
 * The subscription delivery policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DeliveryPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DeliveryPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"backoffRetryPolicy"})
    public DeliveryPolicy(BackoffRetryPolicy backoffRetryPolicy) {
        super();
        this.backoffRetryPolicy = backoffRetryPolicy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("backoffRetryPolicy")
        private BackoffRetryPolicy backoffRetryPolicy;

        public Builder backoffRetryPolicy(BackoffRetryPolicy backoffRetryPolicy) {
            this.backoffRetryPolicy = backoffRetryPolicy;
            this.__explicitlySet__.add("backoffRetryPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeliveryPolicy build() {
            DeliveryPolicy model = new DeliveryPolicy(this.backoffRetryPolicy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeliveryPolicy model) {
            if (model.wasPropertyExplicitlySet("backoffRetryPolicy")) {
                this.backoffRetryPolicy(model.getBackoffRetryPolicy());
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

    @com.fasterxml.jackson.annotation.JsonProperty("backoffRetryPolicy")
    private final BackoffRetryPolicy backoffRetryPolicy;

    public BackoffRetryPolicy getBackoffRetryPolicy() {
        return backoffRetryPolicy;
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
        sb.append("DeliveryPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("backoffRetryPolicy=").append(String.valueOf(this.backoffRetryPolicy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeliveryPolicy)) {
            return false;
        }

        DeliveryPolicy other = (DeliveryPolicy) o;
        return java.util.Objects.equals(this.backoffRetryPolicy, other.backoffRetryPolicy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backoffRetryPolicy == null
                                ? 43
                                : this.backoffRetryPolicy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
