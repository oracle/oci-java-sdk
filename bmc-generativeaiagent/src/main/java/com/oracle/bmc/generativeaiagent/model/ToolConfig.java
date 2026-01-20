/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The configuration and type of Tool. <br>
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
        property = "toolConfigType",
        defaultImpl = ToolConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SqlToolConfig.class,
            name = "SQL_TOOL_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FunctionCallingToolConfig.class,
            name = "FUNCTION_CALLING_TOOL_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HttpEndpointToolConfig.class,
            name = "HTTP_ENDPOINT_TOOL_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AgentToolConfig.class,
            name = "AGENT_TOOL_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RagToolConfig.class,
            name = "RAG_TOOL_CONFIG")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ToolConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({})
    protected ToolConfig() {
        super();
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
        sb.append("ToolConfig(");
        sb.append("super=").append(super.toString());
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolConfig)) {
            return false;
        }

        ToolConfig other = (ToolConfig) o;
        return super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of the Tool config. */
    public enum ToolConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        SqlToolConfig("SQL_TOOL_CONFIG"),
        RagToolConfig("RAG_TOOL_CONFIG"),
        FunctionCallingToolConfig("FUNCTION_CALLING_TOOL_CONFIG"),
        HttpEndpointToolConfig("HTTP_ENDPOINT_TOOL_CONFIG"),
        AgentToolConfig("AGENT_TOOL_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ToolConfigType.class);

        private final String value;
        private static java.util.Map<String, ToolConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (ToolConfigType v : ToolConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ToolConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ToolConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ToolConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
