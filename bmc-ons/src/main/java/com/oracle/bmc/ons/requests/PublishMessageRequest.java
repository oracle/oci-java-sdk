/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.requests;

import com.oracle.bmc.ons.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ons/PublishMessageExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use PublishMessageRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class PublishMessageRequest extends com.oracle.bmc.requests.BmcRequest<MessageDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the topic.
     *
     */
    private String topicId;

    /**
     * The message to publish.
     */
    private MessageDetails messageDetails;

    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * **Deprecated.**
     * Support for JSON is deprecated.
     * You can send a JSON payload even when transmitting the payload as a raw string.
     * Configure your receiving system to read the raw payload as JSON format.
     * <p>
     * Type of message body in the request.
     * For {@code messageType} of JSON, a default key-value pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm breached: <url>"}.}
     *
     */
    private MessageType messageType;

    /**
     * **Deprecated.**
     * Support for JSON is deprecated.
     * You can send a JSON payload even when transmitting the payload as a raw string.
     * Configure your receiving system to read the raw payload as JSON format.
     * <p>
     * Type of message body in the request.
     * For {@code messageType} of JSON, a default key-value pair is required. Example: {@code {"default": "Alarm breached", "Email": "Alarm breached: <url>"}.}
     *
     **/
    public enum MessageType {
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public MessageDetails getBody$() {
        return messageDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    PublishMessageRequest, MessageDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(MessageDetails body) {
            messageDetails(body);
            return this;
        }
    }
}
