/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Inbound Networking configuration.
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
    builder = InboundNetworkingConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InboundNetworkingConfig
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"endpointMode", "privateEndpointId"})
    public InboundNetworkingConfig(EndpointMode endpointMode, String privateEndpointId) {
        super();
        this.endpointMode = endpointMode;
        this.privateEndpointId = privateEndpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * inbounding from public or private endpoint.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpointMode")
        private EndpointMode endpointMode;

        /**
         * inbounding from public or private endpoint.
         * @param endpointMode the value to set
         * @return this builder
         **/
        public Builder endpointMode(EndpointMode endpointMode) {
            this.endpointMode = endpointMode;
            this.__explicitlySet__.add("endpointMode");
            return this;
        }
        /**
         * The [OCID] of Private Endpoint when endpointMode=Private
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * The [OCID] of Private Endpoint when endpointMode=Private
         * @param privateEndpointId the value to set
         * @return this builder
         **/
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InboundNetworkingConfig build() {
            InboundNetworkingConfig model =
                    new InboundNetworkingConfig(this.endpointMode, this.privateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InboundNetworkingConfig model) {
            if (model.wasPropertyExplicitlySet("endpointMode")) {
                this.endpointMode(model.getEndpointMode());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
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
     * inbounding from public or private endpoint.
     **/
    public enum EndpointMode {
        Public("PUBLIC"),
        Private("PRIVATE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EndpointMode.class);

        private final String value;
        private static java.util.Map<String, EndpointMode> map;

        static {
            map = new java.util.HashMap<>();
            for (EndpointMode v : EndpointMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EndpointMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EndpointMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EndpointMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * inbounding from public or private endpoint.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointMode")
    private final EndpointMode endpointMode;

    /**
     * inbounding from public or private endpoint.
     * @return the value
     **/
    public EndpointMode getEndpointMode() {
        return endpointMode;
    }

    /**
     * The [OCID] of Private Endpoint when endpointMode=Private
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * The [OCID] of Private Endpoint when endpointMode=Private
     * @return the value
     **/
    public String getPrivateEndpointId() {
        return privateEndpointId;
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
        sb.append("InboundNetworkingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("endpointMode=").append(String.valueOf(this.endpointMode));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InboundNetworkingConfig)) {
            return false;
        }

        InboundNetworkingConfig other = (InboundNetworkingConfig) o;
        return java.util.Objects.equals(this.endpointMode, other.endpointMode)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.endpointMode == null ? 43 : this.endpointMode.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
