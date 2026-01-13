/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Websocket messages sent between client and service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "event",
        defaultImpl = RealtimeMessage.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RealtimeMessageError.class,
            name = "ERROR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RealtimeMessageAckAudio.class,
            name = "ACKAUDIO"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RealtimeMessageConnect.class,
            name = "CONNECT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RealtimeMessageResult.class,
            name = "RESULT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class RealtimeMessage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sessionId"})
    protected RealtimeMessage(String sessionId) {
        super();
        this.sessionId = sessionId;
    }

    /** Session ID for the connected session. */
    @com.fasterxml.jackson.annotation.JsonProperty("sessionId")
    private final String sessionId;

    /**
     * Session ID for the connected session.
     *
     * @return the value
     */
    public String getSessionId() {
        return sessionId;
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
        sb.append("RealtimeMessage(");
        sb.append("super=").append(super.toString());
        sb.append("sessionId=").append(String.valueOf(this.sessionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeMessage)) {
            return false;
        }

        RealtimeMessage other = (RealtimeMessage) o;
        return java.util.Objects.equals(this.sessionId, other.sessionId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sessionId == null ? 43 : this.sessionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Incoming Types of message event sent from Service -> Client - RESULT - result - ACKAUDIO -
     * ackAudio - ERROR - error - CONNECT - connect Outgoing Types of message event sent from Client
     * -> Service - SEND_FINAL_RESULT - sendFinalResult
     */
    public enum Event implements com.oracle.bmc.http.internal.BmcEnum {
        Result("RESULT"),
        Ackaudio("ACKAUDIO"),
        Error("ERROR"),
        Connect("CONNECT"),
        ;

        private final String value;
        private static java.util.Map<String, Event> map;

        static {
            map = new java.util.HashMap<>();
            for (Event v : Event.values()) {
                map.put(v.getValue(), v);
            }
        }

        Event(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Event create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Event: " + key);
        }
    };
}
