/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Base object for tool input parameters. The 'toolInputType' discriminator determines the specific
 * input structure to be used. <br>
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
        property = "toolInputType",
        defaultImpl = ToolInput.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericToolInput.class,
            name = "GENERIC_TOOL_INPUT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ToolInput extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"toolId"})
    protected ToolInput(String toolId) {
        super();
        this.toolId = toolId;
    }

    /** Unique OCID of the tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolId")
    private final String toolId;

    /**
     * Unique OCID of the tool.
     *
     * @return the value
     */
    public String getToolId() {
        return toolId;
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
        sb.append("ToolInput(");
        sb.append("super=").append(super.toString());
        sb.append("toolId=").append(String.valueOf(this.toolId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolInput)) {
            return false;
        }

        ToolInput other = (ToolInput) o;
        return java.util.Objects.equals(this.toolId, other.toolId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.toolId == null ? 43 : this.toolId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Specifies the type of tool input (e.g., GENERIC_TOOL_INPUT). */
    public enum ToolInputType implements com.oracle.bmc.http.internal.BmcEnum {
        GenericToolInput("GENERIC_TOOL_INPUT"),
        ;

        private final String value;
        private static java.util.Map<String, ToolInputType> map;

        static {
            map = new java.util.HashMap<>();
            for (ToolInputType v : ToolInputType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ToolInputType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ToolInputType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ToolInputType: " + key);
        }
    };
}
