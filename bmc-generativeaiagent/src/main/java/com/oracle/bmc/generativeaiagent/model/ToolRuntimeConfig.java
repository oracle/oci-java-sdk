/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Configuration for the tool. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ToolRuntimeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ToolRuntimeConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"toolRuntimeConfigType", "version"})
    public ToolRuntimeConfig(ToolRuntimeConfigType toolRuntimeConfigType, String version) {
        super();
        this.toolRuntimeConfigType = toolRuntimeConfigType;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of the tool. */
        @com.fasterxml.jackson.annotation.JsonProperty("toolRuntimeConfigType")
        private ToolRuntimeConfigType toolRuntimeConfigType;

        /**
         * The type of the tool.
         *
         * @param toolRuntimeConfigType the value to set
         * @return this builder
         */
        public Builder toolRuntimeConfigType(ToolRuntimeConfigType toolRuntimeConfigType) {
            this.toolRuntimeConfigType = toolRuntimeConfigType;
            this.__explicitlySet__.add("toolRuntimeConfigType");
            return this;
        }
        /** The version of the components. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the components.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ToolRuntimeConfig build() {
            ToolRuntimeConfig model =
                    new ToolRuntimeConfig(this.toolRuntimeConfigType, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ToolRuntimeConfig model) {
            if (model.wasPropertyExplicitlySet("toolRuntimeConfigType")) {
                this.toolRuntimeConfigType(model.getToolRuntimeConfigType());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** The type of the tool. */
    public enum ToolRuntimeConfigType implements com.oracle.bmc.http.internal.BmcEnum {
        Rag("RAG"),
        SqlSmall("SQL_SMALL"),
        SqlLarge("SQL_LARGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ToolRuntimeConfigType.class);

        private final String value;
        private static java.util.Map<String, ToolRuntimeConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (ToolRuntimeConfigType v : ToolRuntimeConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ToolRuntimeConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ToolRuntimeConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ToolRuntimeConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The type of the tool. */
    @com.fasterxml.jackson.annotation.JsonProperty("toolRuntimeConfigType")
    private final ToolRuntimeConfigType toolRuntimeConfigType;

    /**
     * The type of the tool.
     *
     * @return the value
     */
    public ToolRuntimeConfigType getToolRuntimeConfigType() {
        return toolRuntimeConfigType;
    }

    /** The version of the components. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the components.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
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
        sb.append("ToolRuntimeConfig(");
        sb.append("super=").append(super.toString());
        sb.append("toolRuntimeConfigType=").append(String.valueOf(this.toolRuntimeConfigType));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ToolRuntimeConfig)) {
            return false;
        }

        ToolRuntimeConfig other = (ToolRuntimeConfig) o;
        return java.util.Objects.equals(this.toolRuntimeConfigType, other.toolRuntimeConfigType)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.toolRuntimeConfigType == null
                                ? 43
                                : this.toolRuntimeConfigType.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
