/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Details of a single portInformation item include the PortNumber (an integer used as an identifier) and the PortType (this refers to either an enum value of Management Utility, Client Utility, or null)
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PortInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PortInformation extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"portNumber", "portType"})
    public PortInformation(Integer portNumber, PortType portType) {
        super();
        this.portNumber = portNumber;
        this.portType = portType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The port number is a unique identifier which is typically used as the loadbalancer listener.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("portNumber")
        private Integer portNumber;

        /**
         * The port number is a unique identifier which is typically used as the loadbalancer listener.
         * @param portNumber the value to set
         * @return this builder
         **/
        public Builder portNumber(Integer portNumber) {
            this.portNumber = portNumber;
            this.__explicitlySet__.add("portNumber");
            return this;
        }
        /**
         * Port type associated for the port number. The two port type enums are {@code CLIENTUTILITY} and {@code MANAGEMENTUTILITY}. The CLIENTUTILITY enum corresponds to a port which is used by the client daemon. The MANAGEMENTUTILITY enum corresponds to a port used by user management utility.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("portType")
        private PortType portType;

        /**
         * Port type associated for the port number. The two port type enums are {@code CLIENTUTILITY} and {@code MANAGEMENTUTILITY}. The CLIENTUTILITY enum corresponds to a port which is used by the client daemon. The MANAGEMENTUTILITY enum corresponds to a port used by user management utility.
         * @param portType the value to set
         * @return this builder
         **/
        public Builder portType(PortType portType) {
            this.portType = portType;
            this.__explicitlySet__.add("portType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PortInformation build() {
            PortInformation model = new PortInformation(this.portNumber, this.portType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PortInformation model) {
            if (model.wasPropertyExplicitlySet("portNumber")) {
                this.portNumber(model.getPortNumber());
            }
            if (model.wasPropertyExplicitlySet("portType")) {
                this.portType(model.getPortType());
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
     * The port number is a unique identifier which is typically used as the loadbalancer listener.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portNumber")
    private final Integer portNumber;

    /**
     * The port number is a unique identifier which is typically used as the loadbalancer listener.
     * @return the value
     **/
    public Integer getPortNumber() {
        return portNumber;
    }

    /**
     * Port type associated for the port number. The two port type enums are {@code CLIENTUTILITY} and {@code MANAGEMENTUTILITY}. The CLIENTUTILITY enum corresponds to a port which is used by the client daemon. The MANAGEMENTUTILITY enum corresponds to a port used by user management utility.
     **/
    public enum PortType {
        Clientutility("CLIENTUTILITY"),
        Managementutility("MANAGEMENTUTILITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PortType.class);

        private final String value;
        private static java.util.Map<String, PortType> map;

        static {
            map = new java.util.HashMap<>();
            for (PortType v : PortType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PortType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PortType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PortType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Port type associated for the port number. The two port type enums are {@code CLIENTUTILITY} and {@code MANAGEMENTUTILITY}. The CLIENTUTILITY enum corresponds to a port which is used by the client daemon. The MANAGEMENTUTILITY enum corresponds to a port used by user management utility.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("portType")
    private final PortType portType;

    /**
     * Port type associated for the port number. The two port type enums are {@code CLIENTUTILITY} and {@code MANAGEMENTUTILITY}. The CLIENTUTILITY enum corresponds to a port which is used by the client daemon. The MANAGEMENTUTILITY enum corresponds to a port used by user management utility.
     * @return the value
     **/
    public PortType getPortType() {
        return portType;
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
        sb.append("PortInformation(");
        sb.append("super=").append(super.toString());
        sb.append("portNumber=").append(String.valueOf(this.portNumber));
        sb.append(", portType=").append(String.valueOf(this.portType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PortInformation)) {
            return false;
        }

        PortInformation other = (PortInformation) o;
        return java.util.Objects.equals(this.portNumber, other.portNumber)
                && java.util.Objects.equals(this.portType, other.portType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.portNumber == null ? 43 : this.portNumber.hashCode());
        result = (result * PRIME) + (this.portType == null ? 43 : this.portType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
