/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Configuration of the OLVM virtual machine. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"data", "configurationType"})
    public OlvmConfiguration(String data, ConfigurationType configurationType) {
        super();
        this.data = data;
        this.configurationType = configurationType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The document describing the virtual machine. */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        /**
         * The document describing the virtual machine.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /** Configuration format types. */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationType")
        private ConfigurationType configurationType;

        /**
         * Configuration format types.
         *
         * @param configurationType the value to set
         * @return this builder
         */
        public Builder configurationType(ConfigurationType configurationType) {
            this.configurationType = configurationType;
            this.__explicitlySet__.add("configurationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmConfiguration build() {
            OlvmConfiguration model = new OlvmConfiguration(this.data, this.configurationType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmConfiguration model) {
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("configurationType")) {
                this.configurationType(model.getConfigurationType());
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

    /** The document describing the virtual machine. */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final String data;

    /**
     * The document describing the virtual machine.
     *
     * @return the value
     */
    public String getData() {
        return data;
    }

    /** Configuration format types. */
    public enum ConfigurationType implements com.oracle.bmc.http.internal.BmcEnum {
        Ova("OVA"),
        Ovf("OVF"),
        ;

        private final String value;
        private static java.util.Map<String, ConfigurationType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigurationType v : ConfigurationType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ConfigurationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigurationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ConfigurationType: " + key);
        }
    };
    /** Configuration format types. */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationType")
    private final ConfigurationType configurationType;

    /**
     * Configuration format types.
     *
     * @return the value
     */
    public ConfigurationType getConfigurationType() {
        return configurationType;
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
        sb.append("OlvmConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("data=").append(String.valueOf(this.data));
        sb.append(", configurationType=").append(String.valueOf(this.configurationType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmConfiguration)) {
            return false;
        }

        OlvmConfiguration other = (OlvmConfiguration) o;
        return java.util.Objects.equals(this.data, other.data)
                && java.util.Objects.equals(this.configurationType, other.configurationType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.data == null ? 43 : this.data.hashCode());
        result =
                (result * PRIME)
                        + (this.configurationType == null ? 43 : this.configurationType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
