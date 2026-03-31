/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * The client-side inbound authentication configuration for the Hosted Application.
 * Defines the network access rules.
 * When unspecified, the service applies the default inbound authentication configuration type.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InboundAuthConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InboundAuthConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"inboundAuthConfigType", "idcsConfig"})
    public InboundAuthConfig(
            InboundAuthConfigType inboundAuthConfigType, IdcsAuthConfig idcsConfig) {
        super();
        this.inboundAuthConfigType = inboundAuthConfigType;
        this.idcsConfig = idcsConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Inbound authentication configuration type of network access
         * (IDCS_AUTH_CONFIG).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inboundAuthConfigType")
        private InboundAuthConfigType inboundAuthConfigType;

        /**
         * Inbound authentication configuration type of network access
         * (IDCS_AUTH_CONFIG).
         *
         * @param inboundAuthConfigType the value to set
         * @return this builder
         **/
        public Builder inboundAuthConfigType(InboundAuthConfigType inboundAuthConfigType) {
            this.inboundAuthConfigType = inboundAuthConfigType;
            this.__explicitlySet__.add("inboundAuthConfigType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idcsConfig")
        private IdcsAuthConfig idcsConfig;

        public Builder idcsConfig(IdcsAuthConfig idcsConfig) {
            this.idcsConfig = idcsConfig;
            this.__explicitlySet__.add("idcsConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InboundAuthConfig build() {
            InboundAuthConfig model =
                    new InboundAuthConfig(this.inboundAuthConfigType, this.idcsConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InboundAuthConfig model) {
            if (model.wasPropertyExplicitlySet("inboundAuthConfigType")) {
                this.inboundAuthConfigType(model.getInboundAuthConfigType());
            }
            if (model.wasPropertyExplicitlySet("idcsConfig")) {
                this.idcsConfig(model.getIdcsConfig());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Inbound authentication configuration type of network access
     * (IDCS_AUTH_CONFIG).
     *
     **/
    public enum InboundAuthConfigType {
        IdcsAuthConfig("IDCS_AUTH_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(InboundAuthConfigType.class);

        private final String value;
        private static java.util.Map<String, InboundAuthConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (InboundAuthConfigType v : InboundAuthConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        InboundAuthConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static InboundAuthConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'InboundAuthConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Inbound authentication configuration type of network access
     * (IDCS_AUTH_CONFIG).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inboundAuthConfigType")
    private final InboundAuthConfigType inboundAuthConfigType;

    /**
     * Inbound authentication configuration type of network access
     * (IDCS_AUTH_CONFIG).
     *
     * @return the value
     **/
    public InboundAuthConfigType getInboundAuthConfigType() {
        return inboundAuthConfigType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("idcsConfig")
    private final IdcsAuthConfig idcsConfig;

    public IdcsAuthConfig getIdcsConfig() {
        return idcsConfig;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InboundAuthConfig(");
        sb.append("super=").append(super.toString());
        sb.append("inboundAuthConfigType=").append(String.valueOf(this.inboundAuthConfigType));
        sb.append(", idcsConfig=").append(String.valueOf(this.idcsConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InboundAuthConfig)) {
            return false;
        }

        InboundAuthConfig other = (InboundAuthConfig) o;
        return java.util.Objects.equals(this.inboundAuthConfigType, other.inboundAuthConfigType)
                && java.util.Objects.equals(this.idcsConfig, other.idcsConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inboundAuthConfigType == null
                                ? 43
                                : this.inboundAuthConfigType.hashCode());
        result = (result * PRIME) + (this.idcsConfig == null ? 43 : this.idcsConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
