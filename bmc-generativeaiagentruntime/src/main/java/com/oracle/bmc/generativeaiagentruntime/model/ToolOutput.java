/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Base schema for tool outputs. Identified by {@code toolOutputType}, which determines the format
 * of the output content. <br>
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
        property = "toolOutputType",
        defaultImpl = ToolOutput.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericToolOutput.class,
            name = "GENERIC_TOOL_OUTPUT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SqlToolOutput.class,
            name = "SQL_TOOL_OUTPUT"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RagToolOutput.class,
            name = "RAG_TOOL_OUTPUT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ToolOutput extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"toolId", "toolName"})
    protected ToolOutput(String toolId, String toolName) {
        super();
        this.toolId = toolId;
        this.toolName = toolName;
    }

    /** Specifies the unique OCID of the tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolId")
    private final String toolId;

    /**
     * Specifies the unique OCID of the tool.
     *
     * @return the value
     */
    public String getToolId() {
        return toolId;
    }

    /** Specifies the display name of the tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolName")
    private final String toolName;

    /**
     * Specifies the display name of the tool.
     *
     * @return the value
     */
    public String getToolName() {
        return toolName;
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
        sb.append("ToolOutput(");
        sb.append("super=").append(super.toString());
        sb.append("toolId=").append(String.valueOf(this.toolId));
        sb.append(", toolName=").append(String.valueOf(this.toolName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolOutput)) {
            return false;
        }

        ToolOutput other = (ToolOutput) o;
        return java.util.Objects.equals(this.toolId, other.toolId)
                && java.util.Objects.equals(this.toolName, other.toolName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.toolId == null ? 43 : this.toolId.hashCode());
        result = (result * PRIME) + (this.toolName == null ? 43 : this.toolName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Specifies the type of tool output (e.g., GENERIC_TOOL_OUTPUT, SQL_TOOL_OUTPUT). */
    public enum ToolOutputType implements com.oracle.bmc.http.internal.BmcEnum {
        GenericToolOutput("GENERIC_TOOL_OUTPUT"),
        SqlToolOutput("SQL_TOOL_OUTPUT"),
        RagToolOutput("RAG_TOOL_OUTPUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ToolOutputType.class);

        private final String value;
        private static java.util.Map<String, ToolOutputType> map;

        static {
            map = new java.util.HashMap<>();
            for (ToolOutputType v : ToolOutputType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ToolOutputType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ToolOutputType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ToolOutputType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
