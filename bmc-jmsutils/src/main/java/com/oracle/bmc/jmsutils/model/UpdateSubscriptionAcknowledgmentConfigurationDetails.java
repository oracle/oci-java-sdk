/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * Attributes to update a Subscription Acknowledgment Configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateSubscriptionAcknowledgmentConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSubscriptionAcknowledgmentConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isAcknowledged"})
    public UpdateSubscriptionAcknowledgmentConfigurationDetails(Boolean isAcknowledged) {
        super();
        this.isAcknowledged = isAcknowledged;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Flag to determine whether the subscription was acknowledged or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isAcknowledged")
        private Boolean isAcknowledged;

        /**
         * Flag to determine whether the subscription was acknowledged or not.
         *
         * @param isAcknowledged the value to set
         * @return this builder
         */
        public Builder isAcknowledged(Boolean isAcknowledged) {
            this.isAcknowledged = isAcknowledged;
            this.__explicitlySet__.add("isAcknowledged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSubscriptionAcknowledgmentConfigurationDetails build() {
            UpdateSubscriptionAcknowledgmentConfigurationDetails model =
                    new UpdateSubscriptionAcknowledgmentConfigurationDetails(this.isAcknowledged);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSubscriptionAcknowledgmentConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isAcknowledged")) {
                this.isAcknowledged(model.getIsAcknowledged());
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

    /** Flag to determine whether the subscription was acknowledged or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isAcknowledged")
    private final Boolean isAcknowledged;

    /**
     * Flag to determine whether the subscription was acknowledged or not.
     *
     * @return the value
     */
    public Boolean getIsAcknowledged() {
        return isAcknowledged;
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
        sb.append("UpdateSubscriptionAcknowledgmentConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isAcknowledged=").append(String.valueOf(this.isAcknowledged));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSubscriptionAcknowledgmentConfigurationDetails)) {
            return false;
        }

        UpdateSubscriptionAcknowledgmentConfigurationDetails other =
                (UpdateSubscriptionAcknowledgmentConfigurationDetails) o;
        return java.util.Objects.equals(this.isAcknowledged, other.isAcknowledged)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAcknowledged == null ? 43 : this.isAcknowledged.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
