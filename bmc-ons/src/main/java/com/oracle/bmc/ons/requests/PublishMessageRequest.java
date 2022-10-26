/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.requests;

import com.oracle.bmc.ons.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/PublishMessageExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use PublishMessageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class PublishMessageRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.ons.model.MessageDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the topic.
     */
    private String topicId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the topic.
     */
    public String getTopicId() {
        return topicId;
    }
    /** The message to publish. */
    private com.oracle.bmc.ons.model.MessageDetails messageDetails;

    /** The message to publish. */
    public com.oracle.bmc.ons.model.MessageDetails getMessageDetails() {
        return messageDetails;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * **Deprecated.** Support for JSON is deprecated. You can send a JSON payload even when
     * transmitting the payload as a raw string. Configure your receiving system to read the raw
     * payload as JSON format.
     *
     * <p>Type of message body in the request. For {@code messageType} of JSON, a default key-value
     * pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm breached:
     * <url>"}.}
     */
    private MessageType messageType;

    /**
     * **Deprecated.** Support for JSON is deprecated. You can send a JSON payload even when
     * transmitting the payload as a raw string. Configure your receiving system to read the raw
     * payload as JSON format.
     *
     * <p>Type of message body in the request. For {@code messageType} of JSON, a default key-value
     * pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm breached:
     * <url>"}.}
     */
    public enum MessageType implements com.oracle.bmc.http.internal.BmcEnum {
        Json("JSON"),
        RawText("RAW_TEXT"),
        ;

        private final String value;
        private static java.util.Map<String, MessageType> map;

        static {
            map = new java.util.HashMap<>();
            for (MessageType v : MessageType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MessageType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MessageType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MessageType: " + key);
        }
    };

    /**
     * **Deprecated.** Support for JSON is deprecated. You can send a JSON payload even when
     * transmitting the payload as a raw string. Configure your receiving system to read the raw
     * payload as JSON format.
     *
     * <p>Type of message body in the request. For {@code messageType} of JSON, a default key-value
     * pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm breached:
     * <url>"}.}
     */
    public MessageType getMessageType() {
        return messageType;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ons.model.MessageDetails getBody$() {
        return messageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PublishMessageRequest, com.oracle.bmc.ons.model.MessageDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the topic.
         */
        private String topicId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the topic.
         *
         * @param topicId the value to set
         * @return this builder instance
         */
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            return this;
        }

        /** The message to publish. */
        private com.oracle.bmc.ons.model.MessageDetails messageDetails = null;

        /**
         * The message to publish.
         *
         * @param messageDetails the value to set
         * @return this builder instance
         */
        public Builder messageDetails(com.oracle.bmc.ons.model.MessageDetails messageDetails) {
            this.messageDetails = messageDetails;
            return this;
        }

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle
         * about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * **Deprecated.** Support for JSON is deprecated. You can send a JSON payload even when
         * transmitting the payload as a raw string. Configure your receiving system to read the raw
         * payload as JSON format.
         *
         * <p>Type of message body in the request. For {@code messageType} of JSON, a default
         * key-value pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm
         * breached: <url>"}.}
         */
        private MessageType messageType = null;

        /**
         * **Deprecated.** Support for JSON is deprecated. You can send a JSON payload even when
         * transmitting the payload as a raw string. Configure your receiving system to read the raw
         * payload as JSON format.
         *
         * <p>Type of message body in the request. For {@code messageType} of JSON, a default
         * key-value pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm
         * breached: <url>"}.}
         *
         * @param messageType the value to set
         * @return this builder instance
         */
        public Builder messageType(MessageType messageType) {
            this.messageType = messageType;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(PublishMessageRequest o) {
            topicId(o.getTopicId());
            messageDetails(o.getMessageDetails());
            opcRequestId(o.getOpcRequestId());
            messageType(o.getMessageType());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of PublishMessageRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of PublishMessageRequest
         */
        public PublishMessageRequest build() {
            PublishMessageRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.ons.model.MessageDetails body) {
            messageDetails(body);
            return this;
        }

        /**
         * Build the instance of PublishMessageRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of PublishMessageRequest
         */
        public PublishMessageRequest buildWithoutInvocationCallback() {
            PublishMessageRequest request = new PublishMessageRequest();
            request.topicId = topicId;
            request.messageDetails = messageDetails;
            request.opcRequestId = opcRequestId;
            request.messageType = messageType;
            return request;
            // new PublishMessageRequest(topicId, messageDetails, opcRequestId, messageType);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .topicId(topicId)
                .messageDetails(messageDetails)
                .opcRequestId(opcRequestId)
                .messageType(messageType);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",topicId=").append(String.valueOf(this.topicId));
        sb.append(",messageDetails=").append(String.valueOf(this.messageDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",messageType=").append(String.valueOf(this.messageType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PublishMessageRequest)) {
            return false;
        }

        PublishMessageRequest other = (PublishMessageRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.topicId, other.topicId)
                && java.util.Objects.equals(this.messageDetails, other.messageDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.messageType, other.messageType);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.topicId == null ? 43 : this.topicId.hashCode());
        result =
                (result * PRIME)
                        + (this.messageDetails == null ? 43 : this.messageDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.messageType == null ? 43 : this.messageType.hashCode());
        return result;
    }
}
