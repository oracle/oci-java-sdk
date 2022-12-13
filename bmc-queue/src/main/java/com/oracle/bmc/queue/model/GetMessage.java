/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * A message consumed from a queue. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GetMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GetMessage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "content",
        "receipt",
        "deliveryCount",
        "visibleAfter",
        "expireAfter"
    })
    public GetMessage(
            Long id,
            String content,
            String receipt,
            Integer deliveryCount,
            java.util.Date visibleAfter,
            java.util.Date expireAfter) {
        super();
        this.id = id;
        this.content = content;
        this.receipt = receipt;
        this.deliveryCount = deliveryCount;
        this.visibleAfter = visibleAfter;
        this.expireAfter = expireAfter;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the message - this is only used for tracing and debugging purposes and isn't
         * used as a parameter in any request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private Long id;

        /**
         * The id of the message - this is only used for tracing and debugging purposes and isn't
         * used as a parameter in any request.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(Long id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The content of the message */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The content of the message
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * A receipt is a base64urlencode opaque token, uniquely representing a message. The receipt
         * can be used to delete a message or update its visibility.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("receipt")
        private String receipt;

        /**
         * A receipt is a base64urlencode opaque token, uniquely representing a message. The receipt
         * can be used to delete a message or update its visibility.
         *
         * @param receipt the value to set
         * @return this builder
         */
        public Builder receipt(String receipt) {
            this.receipt = receipt;
            this.__explicitlySet__.add("receipt");
            return this;
        }
        /** The number of time the message has been delivered to a consumer. */
        @com.fasterxml.jackson.annotation.JsonProperty("deliveryCount")
        private Integer deliveryCount;

        /**
         * The number of time the message has been delivered to a consumer.
         *
         * @param deliveryCount the value to set
         * @return this builder
         */
        public Builder deliveryCount(Integer deliveryCount) {
            this.deliveryCount = deliveryCount;
            this.__explicitlySet__.add("deliveryCount");
            return this;
        }
        /**
         * The time after which the message will be visible to other consumers. An RFC3339 formatted
         * datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("visibleAfter")
        private java.util.Date visibleAfter;

        /**
         * The time after which the message will be visible to other consumers. An RFC3339 formatted
         * datetime string
         *
         * @param visibleAfter the value to set
         * @return this builder
         */
        public Builder visibleAfter(java.util.Date visibleAfter) {
            this.visibleAfter = visibleAfter;
            this.__explicitlySet__.add("visibleAfter");
            return this;
        }
        /**
         * The time after which the message will be automatically deleted. An RFC3339 formatted
         * datetime string
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expireAfter")
        private java.util.Date expireAfter;

        /**
         * The time after which the message will be automatically deleted. An RFC3339 formatted
         * datetime string
         *
         * @param expireAfter the value to set
         * @return this builder
         */
        public Builder expireAfter(java.util.Date expireAfter) {
            this.expireAfter = expireAfter;
            this.__explicitlySet__.add("expireAfter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GetMessage build() {
            GetMessage model =
                    new GetMessage(
                            this.id,
                            this.content,
                            this.receipt,
                            this.deliveryCount,
                            this.visibleAfter,
                            this.expireAfter);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetMessage model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("receipt")) {
                this.receipt(model.getReceipt());
            }
            if (model.wasPropertyExplicitlySet("deliveryCount")) {
                this.deliveryCount(model.getDeliveryCount());
            }
            if (model.wasPropertyExplicitlySet("visibleAfter")) {
                this.visibleAfter(model.getVisibleAfter());
            }
            if (model.wasPropertyExplicitlySet("expireAfter")) {
                this.expireAfter(model.getExpireAfter());
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

    /**
     * The id of the message - this is only used for tracing and debugging purposes and isn't used
     * as a parameter in any request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final Long id;

    /**
     * The id of the message - this is only used for tracing and debugging purposes and isn't used
     * as a parameter in any request.
     *
     * @return the value
     */
    public Long getId() {
        return id;
    }

    /** The content of the message */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The content of the message
     *
     * @return the value
     */
    public String getContent() {
        return content;
    }

    /**
     * A receipt is a base64urlencode opaque token, uniquely representing a message. The receipt can
     * be used to delete a message or update its visibility.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("receipt")
    private final String receipt;

    /**
     * A receipt is a base64urlencode opaque token, uniquely representing a message. The receipt can
     * be used to delete a message or update its visibility.
     *
     * @return the value
     */
    public String getReceipt() {
        return receipt;
    }

    /** The number of time the message has been delivered to a consumer. */
    @com.fasterxml.jackson.annotation.JsonProperty("deliveryCount")
    private final Integer deliveryCount;

    /**
     * The number of time the message has been delivered to a consumer.
     *
     * @return the value
     */
    public Integer getDeliveryCount() {
        return deliveryCount;
    }

    /**
     * The time after which the message will be visible to other consumers. An RFC3339 formatted
     * datetime string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("visibleAfter")
    private final java.util.Date visibleAfter;

    /**
     * The time after which the message will be visible to other consumers. An RFC3339 formatted
     * datetime string
     *
     * @return the value
     */
    public java.util.Date getVisibleAfter() {
        return visibleAfter;
    }

    /**
     * The time after which the message will be automatically deleted. An RFC3339 formatted datetime
     * string
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expireAfter")
    private final java.util.Date expireAfter;

    /**
     * The time after which the message will be automatically deleted. An RFC3339 formatted datetime
     * string
     *
     * @return the value
     */
    public java.util.Date getExpireAfter() {
        return expireAfter;
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
        sb.append("GetMessage(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", receipt=").append(String.valueOf(this.receipt));
        sb.append(", deliveryCount=").append(String.valueOf(this.deliveryCount));
        sb.append(", visibleAfter=").append(String.valueOf(this.visibleAfter));
        sb.append(", expireAfter=").append(String.valueOf(this.expireAfter));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMessage)) {
            return false;
        }

        GetMessage other = (GetMessage) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.receipt, other.receipt)
                && java.util.Objects.equals(this.deliveryCount, other.deliveryCount)
                && java.util.Objects.equals(this.visibleAfter, other.visibleAfter)
                && java.util.Objects.equals(this.expireAfter, other.expireAfter)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.receipt == null ? 43 : this.receipt.hashCode());
        result =
                (result * PRIME)
                        + (this.deliveryCount == null ? 43 : this.deliveryCount.hashCode());
        result = (result * PRIME) + (this.visibleAfter == null ? 43 : this.visibleAfter.hashCode());
        result = (result * PRIME) + (this.expireAfter == null ? 43 : this.expireAfter.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
