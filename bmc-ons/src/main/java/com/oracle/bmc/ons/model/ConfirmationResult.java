/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.model;

/**
 * The confirmation details for the specified subscription. For information about confirming
 * subscriptions, see [To confirm a
 * subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#confirmSub).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfirmationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfirmationResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "topicName",
        "topicId",
        "endpoint",
        "unsubscribeUrl",
        "message",
        "subscriptionId"
    })
    public ConfirmationResult(
            String topicName,
            String topicId,
            String endpoint,
            String unsubscribeUrl,
            String message,
            String subscriptionId) {
        super();
        this.topicName = topicName;
        this.topicId = topicId;
        this.endpoint = endpoint;
        this.unsubscribeUrl = unsubscribeUrl;
        this.message = message;
        this.subscriptionId = subscriptionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the subscribed topic. */
        @com.fasterxml.jackson.annotation.JsonProperty("topicName")
        private String topicName;

        /**
         * The name of the subscribed topic.
         *
         * @param topicName the value to set
         * @return this builder
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            this.__explicitlySet__.add("topicName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * topic associated with the specified subscription.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("topicId")
        private String topicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * topic associated with the specified subscription.
         *
         * @param topicId the value to set
         * @return this builder
         */
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            this.__explicitlySet__.add("topicId");
            return this;
        }
        /**
         * A locator that corresponds to the subscription protocol. For example, an email address
         * for a subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that
         * uses an HTTP-based protocol.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * A locator that corresponds to the subscription protocol. For example, an email address
         * for a subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that
         * uses an HTTP-based protocol.
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /** The URL for unsubscribing from the topic. */
        @com.fasterxml.jackson.annotation.JsonProperty("unsubscribeUrl")
        private String unsubscribeUrl;

        /**
         * The URL for unsubscribing from the topic.
         *
         * @param unsubscribeUrl the value to set
         * @return this builder
         */
        public Builder unsubscribeUrl(String unsubscribeUrl) {
            this.unsubscribeUrl = unsubscribeUrl;
            this.__explicitlySet__.add("unsubscribeUrl");
            return this;
        }
        /** A human-readable string indicating the status of the subscription confirmation. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human-readable string indicating the status of the subscription confirmation.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription specified in the request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription specified in the request.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfirmationResult build() {
            ConfirmationResult model =
                    new ConfirmationResult(
                            this.topicName,
                            this.topicId,
                            this.endpoint,
                            this.unsubscribeUrl,
                            this.message,
                            this.subscriptionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfirmationResult model) {
            if (model.wasPropertyExplicitlySet("topicName")) {
                this.topicName(model.getTopicName());
            }
            if (model.wasPropertyExplicitlySet("topicId")) {
                this.topicId(model.getTopicId());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("unsubscribeUrl")) {
                this.unsubscribeUrl(model.getUnsubscribeUrl());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
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

    /** The name of the subscribed topic. */
    @com.fasterxml.jackson.annotation.JsonProperty("topicName")
    private final String topicName;

    /**
     * The name of the subscribed topic.
     *
     * @return the value
     */
    public String getTopicName() {
        return topicName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * topic associated with the specified subscription.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicId")
    private final String topicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * topic associated with the specified subscription.
     *
     * @return the value
     */
    public String getTopicId() {
        return topicId;
    }

    /**
     * A locator that corresponds to the subscription protocol. For example, an email address for a
     * subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that uses an
     * HTTP-based protocol.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * A locator that corresponds to the subscription protocol. For example, an email address for a
     * subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that uses an
     * HTTP-based protocol.
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
    }

    /** The URL for unsubscribing from the topic. */
    @com.fasterxml.jackson.annotation.JsonProperty("unsubscribeUrl")
    private final String unsubscribeUrl;

    /**
     * The URL for unsubscribing from the topic.
     *
     * @return the value
     */
    public String getUnsubscribeUrl() {
        return unsubscribeUrl;
    }

    /** A human-readable string indicating the status of the subscription confirmation. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable string indicating the status of the subscription confirmation.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription specified in the request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription specified in the request.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
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
        sb.append("ConfirmationResult(");
        sb.append("super=").append(super.toString());
        sb.append("topicName=").append(String.valueOf(this.topicName));
        sb.append(", topicId=").append(String.valueOf(this.topicId));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", unsubscribeUrl=").append(String.valueOf(this.unsubscribeUrl));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfirmationResult)) {
            return false;
        }

        ConfirmationResult other = (ConfirmationResult) o;
        return java.util.Objects.equals(this.topicName, other.topicName)
                && java.util.Objects.equals(this.topicId, other.topicId)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.unsubscribeUrl, other.unsubscribeUrl)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.topicName == null ? 43 : this.topicName.hashCode());
        result = (result * PRIME) + (this.topicId == null ? 43 : this.topicId.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.unsubscribeUrl == null ? 43 : this.unsubscribeUrl.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
