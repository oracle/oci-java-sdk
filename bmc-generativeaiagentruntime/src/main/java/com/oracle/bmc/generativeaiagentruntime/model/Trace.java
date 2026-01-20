/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The trace that displays the internal progression, such as reasoning and actions during an
 * execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "traceType",
        defaultImpl = Trace.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ErrorTrace.class,
            name = "ERROR_TRACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RetrievalTrace.class,
            name = "RETRIEVAL_TRACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExecutionTrace.class,
            name = "EXECUTION_TRACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenerationTrace.class,
            name = "GENERATION_TRACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ToolInvocationTrace.class,
            name = "TOOL_INVOCATION_TRACE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = PlanningTrace.class,
            name = "PLANNING_TRACE")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Trace extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "parentKey", "source", "timeCreated", "timeFinished"})
    protected Trace(
            String key,
            String parentKey,
            SourceDetails source,
            java.util.Date timeCreated,
            java.util.Date timeFinished) {
        super();
        this.key = key;
        this.parentKey = parentKey;
        this.source = source;
        this.timeCreated = timeCreated;
        this.timeFinished = timeFinished;
    }

    /** Unique identifier for the event (UUID). */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique identifier for the event (UUID).
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** Identifier of the parent event, if applicable (UUID). */
    @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
    private final String parentKey;

    /**
     * Identifier of the parent event, if applicable (UUID).
     *
     * @return the value
     */
    public String getParentKey() {
        return parentKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final SourceDetails source;

    public SourceDetails getSource() {
        return source;
    }

    /** The date and time that the trace was created in the format of an RFC3339 datetime string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the trace was created in the format of an RFC3339 datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Timestamp for when the event ended (In RFC 3339). */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * Timestamp for when the event ended (In RFC 3339).
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
        sb.append("Trace(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", parentKey=").append(String.valueOf(this.parentKey));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Trace)) {
            return false;
        }

        Trace other = (Trace) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.parentKey, other.parentKey)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.parentKey == null ? 43 : this.parentKey.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the trace. */
    public enum TraceType implements com.oracle.bmc.http.internal.BmcEnum {
        ErrorTrace("ERROR_TRACE"),
        RetrievalTrace("RETRIEVAL_TRACE"),
        GenerationTrace("GENERATION_TRACE"),
        ToolInvocationTrace("TOOL_INVOCATION_TRACE"),
        PlanningTrace("PLANNING_TRACE"),
        ExecutionTrace("EXECUTION_TRACE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(TraceType.class);

        private final String value;
        private static java.util.Map<String, TraceType> map;

        static {
            map = new java.util.HashMap<>();
            for (TraceType v : TraceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TraceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TraceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TraceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
