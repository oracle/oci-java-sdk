/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.ons.requests;

import com.oracle.bmc.ons.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class PublishMessageRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The [OCID](https://docs.us-phoenix-1.oraclecloud.com/iaas/Content/General/Concepts/identifiers.htm) of the topic.
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
     * Type of message body in the request. Default value: JSON.
     *
     */
    private MessageType messageType;

    /**
     * Type of message body in the request. Default value: JSON.
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
            throw new RuntimeException("Invalid MessageType: " + key);
        }
    };

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(PublishMessageRequest o) {
            topicId(o.getTopicId());
            messageDetails(o.getMessageDetails());
            opcRequestId(o.getOpcRequestId());
            messageType(o.getMessageType());
            invocationCallback(o.getInvocationCallback());
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
            return request;
        }
    }
}
