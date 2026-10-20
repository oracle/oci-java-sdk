/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Base command event emitted while a sandbox command runs. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "event",
        defaultImpl = SandboxCommandEvent.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SandboxCommandStderrEvent.class,
            name = "STDERR"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SandboxCommandFinishedEvent.class,
            name = "FINISHED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SandboxCommandStartedEvent.class,
            name = "STARTED"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SandboxCommandStdoutEvent.class,
            name = "STDOUT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class SandboxCommandEvent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"seq", "timestamp", "commandId", "data"})
    protected SandboxCommandEvent(
            Long seq, java.util.Date timestamp, String commandId, String data) {
        super();
        this.seq = seq;
        this.timestamp = timestamp;
        this.commandId = commandId;
        this.data = data;
    }

    /** Monotonically increasing command event sequence number. */
    @com.fasterxml.jackson.annotation.JsonProperty("seq")
    private final Long seq;

    /**
     * Monotonically increasing command event sequence number.
     *
     * @return the value
     */
    public Long getSeq() {
        return seq;
    }

    /** The date and time the command event was emitted, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the command event was emitted, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** Sandbox command identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("commandId")
    private final String commandId;

    /**
     * Sandbox command identifier.
     *
     * @return the value
     */
    public String getCommandId() {
        return commandId;
    }

    /** Event payload. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * Event payload.
     *
     * @return the value
     */
    public String getData() {
        return data;
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
        sb.append("SandboxCommandEvent(");
        sb.append("super=").append(super.toString());
        sb.append("seq=").append(String.valueOf(this.seq));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", commandId=").append(String.valueOf(this.commandId));
        sb.append(", data=").append(String.valueOf(this.data));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxCommandEvent)) {
            return false;
        }

        SandboxCommandEvent other = (SandboxCommandEvent) o;
        return java.util.Objects.equals(this.seq, other.seq)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.commandId, other.commandId)
                && java.util.Objects.equals(this.data, other.data)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.seq == null ? 43 : this.seq.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.commandId == null ? 43 : this.commandId.hashCode());
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Command event type. */
    public enum Event implements com.oracle.bmc.http.internal.BmcEnum {
        Started("STARTED"),
        Stdout("STDOUT"),
        Stderr("STDERR"),
        Finished("FINISHED"),
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
