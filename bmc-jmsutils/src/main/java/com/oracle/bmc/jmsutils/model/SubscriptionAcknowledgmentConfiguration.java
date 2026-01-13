/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * The configuration for subscription acknowledgment. <br>
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
        builder = SubscriptionAcknowledgmentConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionAcknowledgmentConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isAcknowledged", "acknowledgedBy", "timeAcknowledged"})
    public SubscriptionAcknowledgmentConfiguration(
            Boolean isAcknowledged, String acknowledgedBy, java.util.Date timeAcknowledged) {
        super();
        this.isAcknowledged = isAcknowledged;
        this.acknowledgedBy = acknowledgedBy;
        this.timeAcknowledged = timeAcknowledged;
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * principal that ackwnoledged the subscription.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("acknowledgedBy")
        private String acknowledgedBy;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * principal that ackwnoledged the subscription.
         *
         * @param acknowledgedBy the value to set
         * @return this builder
         */
        public Builder acknowledgedBy(String acknowledgedBy) {
            this.acknowledgedBy = acknowledgedBy;
            this.__explicitlySet__.add("acknowledgedBy");
            return this;
        }
        /**
         * The date and time the subscription was acknowledged (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
        private java.util.Date timeAcknowledged;

        /**
         * The date and time the subscription was acknowledged (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param timeAcknowledged the value to set
         * @return this builder
         */
        public Builder timeAcknowledged(java.util.Date timeAcknowledged) {
            this.timeAcknowledged = timeAcknowledged;
            this.__explicitlySet__.add("timeAcknowledged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionAcknowledgmentConfiguration build() {
            SubscriptionAcknowledgmentConfiguration model =
                    new SubscriptionAcknowledgmentConfiguration(
                            this.isAcknowledged, this.acknowledgedBy, this.timeAcknowledged);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionAcknowledgmentConfiguration model) {
            if (model.wasPropertyExplicitlySet("isAcknowledged")) {
                this.isAcknowledged(model.getIsAcknowledged());
            }
            if (model.wasPropertyExplicitlySet("acknowledgedBy")) {
                this.acknowledgedBy(model.getAcknowledgedBy());
            }
            if (model.wasPropertyExplicitlySet("timeAcknowledged")) {
                this.timeAcknowledged(model.getTimeAcknowledged());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * principal that ackwnoledged the subscription.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("acknowledgedBy")
    private final String acknowledgedBy;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * principal that ackwnoledged the subscription.
     *
     * @return the value
     */
    public String getAcknowledgedBy() {
        return acknowledgedBy;
    }

    /**
     * The date and time the subscription was acknowledged (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
    private final java.util.Date timeAcknowledged;

    /**
     * The date and time the subscription was acknowledged (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getTimeAcknowledged() {
        return timeAcknowledged;
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
        sb.append("SubscriptionAcknowledgmentConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isAcknowledged=").append(String.valueOf(this.isAcknowledged));
        sb.append(", acknowledgedBy=").append(String.valueOf(this.acknowledgedBy));
        sb.append(", timeAcknowledged=").append(String.valueOf(this.timeAcknowledged));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionAcknowledgmentConfiguration)) {
            return false;
        }

        SubscriptionAcknowledgmentConfiguration other = (SubscriptionAcknowledgmentConfiguration) o;
        return java.util.Objects.equals(this.isAcknowledged, other.isAcknowledged)
                && java.util.Objects.equals(this.acknowledgedBy, other.acknowledgedBy)
                && java.util.Objects.equals(this.timeAcknowledged, other.timeAcknowledged)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAcknowledged == null ? 43 : this.isAcknowledged.hashCode());
        result =
                (result * PRIME)
                        + (this.acknowledgedBy == null ? 43 : this.acknowledgedBy.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAcknowledged == null ? 43 : this.timeAcknowledged.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
