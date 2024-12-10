/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Redundancy level details of the virtual circuit
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualCircuitRedundancyMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VirtualCircuitRedundancyMetadata
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "configuredRedundancyLevel",
        "ipv4bgpSessionRedundancyStatus",
        "ipv6bgpSessionRedundancyStatus"
    })
    public VirtualCircuitRedundancyMetadata(
            ConfiguredRedundancyLevel configuredRedundancyLevel,
            Ipv4bgpSessionRedundancyStatus ipv4bgpSessionRedundancyStatus,
            Ipv6bgpSessionRedundancyStatus ipv6bgpSessionRedundancyStatus) {
        super();
        this.configuredRedundancyLevel = configuredRedundancyLevel;
        this.ipv4bgpSessionRedundancyStatus = ipv4bgpSessionRedundancyStatus;
        this.ipv6bgpSessionRedundancyStatus = ipv6bgpSessionRedundancyStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The configured redundancy level of the virtual circuit
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configuredRedundancyLevel")
        private ConfiguredRedundancyLevel configuredRedundancyLevel;

        /**
         * The configured redundancy level of the virtual circuit
         * @param configuredRedundancyLevel the value to set
         * @return this builder
         **/
        public Builder configuredRedundancyLevel(
                ConfiguredRedundancyLevel configuredRedundancyLevel) {
            this.configuredRedundancyLevel = configuredRedundancyLevel;
            this.__explicitlySet__.add("configuredRedundancyLevel");
            return this;
        }
        /**
         * IPV4 BGP redundancy status indicates if the configured redundancy level is met
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv4bgpSessionRedundancyStatus")
        private Ipv4bgpSessionRedundancyStatus ipv4bgpSessionRedundancyStatus;

        /**
         * IPV4 BGP redundancy status indicates if the configured redundancy level is met
         * @param ipv4bgpSessionRedundancyStatus the value to set
         * @return this builder
         **/
        public Builder ipv4bgpSessionRedundancyStatus(
                Ipv4bgpSessionRedundancyStatus ipv4bgpSessionRedundancyStatus) {
            this.ipv4bgpSessionRedundancyStatus = ipv4bgpSessionRedundancyStatus;
            this.__explicitlySet__.add("ipv4bgpSessionRedundancyStatus");
            return this;
        }
        /**
         * IPV6 BGP redundancy status indicates if the configured redundancy level is met
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6bgpSessionRedundancyStatus")
        private Ipv6bgpSessionRedundancyStatus ipv6bgpSessionRedundancyStatus;

        /**
         * IPV6 BGP redundancy status indicates if the configured redundancy level is met
         * @param ipv6bgpSessionRedundancyStatus the value to set
         * @return this builder
         **/
        public Builder ipv6bgpSessionRedundancyStatus(
                Ipv6bgpSessionRedundancyStatus ipv6bgpSessionRedundancyStatus) {
            this.ipv6bgpSessionRedundancyStatus = ipv6bgpSessionRedundancyStatus;
            this.__explicitlySet__.add("ipv6bgpSessionRedundancyStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitRedundancyMetadata build() {
            VirtualCircuitRedundancyMetadata model =
                    new VirtualCircuitRedundancyMetadata(
                            this.configuredRedundancyLevel,
                            this.ipv4bgpSessionRedundancyStatus,
                            this.ipv6bgpSessionRedundancyStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitRedundancyMetadata model) {
            if (model.wasPropertyExplicitlySet("configuredRedundancyLevel")) {
                this.configuredRedundancyLevel(model.getConfiguredRedundancyLevel());
            }
            if (model.wasPropertyExplicitlySet("ipv4bgpSessionRedundancyStatus")) {
                this.ipv4bgpSessionRedundancyStatus(model.getIpv4bgpSessionRedundancyStatus());
            }
            if (model.wasPropertyExplicitlySet("ipv6bgpSessionRedundancyStatus")) {
                this.ipv6bgpSessionRedundancyStatus(model.getIpv6bgpSessionRedundancyStatus());
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
     * The configured redundancy level of the virtual circuit
     **/
    public enum ConfiguredRedundancyLevel {
        Device("DEVICE"),
        Pop("POP"),
        Region("REGION"),
        NonRedundant("NON_REDUNDANT"),
        Pending("PENDING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfiguredRedundancyLevel.class);

        private final String value;
        private static java.util.Map<String, ConfiguredRedundancyLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfiguredRedundancyLevel v : ConfiguredRedundancyLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfiguredRedundancyLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfiguredRedundancyLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfiguredRedundancyLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The configured redundancy level of the virtual circuit
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configuredRedundancyLevel")
    private final ConfiguredRedundancyLevel configuredRedundancyLevel;

    /**
     * The configured redundancy level of the virtual circuit
     * @return the value
     **/
    public ConfiguredRedundancyLevel getConfiguredRedundancyLevel() {
        return configuredRedundancyLevel;
    }

    /**
     * IPV4 BGP redundancy status indicates if the configured redundancy level is met
     **/
    public enum Ipv4bgpSessionRedundancyStatus {
        ConfigurationMatch("CONFIGURATION_MATCH"),
        ConfigurationMismatch("CONFIGURATION_MISMATCH"),
        NotMetSla("NOT_MET_SLA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Ipv4bgpSessionRedundancyStatus.class);

        private final String value;
        private static java.util.Map<String, Ipv4bgpSessionRedundancyStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (Ipv4bgpSessionRedundancyStatus v : Ipv4bgpSessionRedundancyStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Ipv4bgpSessionRedundancyStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ipv4bgpSessionRedundancyStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Ipv4bgpSessionRedundancyStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * IPV4 BGP redundancy status indicates if the configured redundancy level is met
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv4bgpSessionRedundancyStatus")
    private final Ipv4bgpSessionRedundancyStatus ipv4bgpSessionRedundancyStatus;

    /**
     * IPV4 BGP redundancy status indicates if the configured redundancy level is met
     * @return the value
     **/
    public Ipv4bgpSessionRedundancyStatus getIpv4bgpSessionRedundancyStatus() {
        return ipv4bgpSessionRedundancyStatus;
    }

    /**
     * IPV6 BGP redundancy status indicates if the configured redundancy level is met
     **/
    public enum Ipv6bgpSessionRedundancyStatus {
        ConfigurationMatch("CONFIGURATION_MATCH"),
        ConfigurationMismatch("CONFIGURATION_MISMATCH"),
        NotMetSla("NOT_MET_SLA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Ipv6bgpSessionRedundancyStatus.class);

        private final String value;
        private static java.util.Map<String, Ipv6bgpSessionRedundancyStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (Ipv6bgpSessionRedundancyStatus v : Ipv6bgpSessionRedundancyStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Ipv6bgpSessionRedundancyStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Ipv6bgpSessionRedundancyStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Ipv6bgpSessionRedundancyStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * IPV6 BGP redundancy status indicates if the configured redundancy level is met
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6bgpSessionRedundancyStatus")
    private final Ipv6bgpSessionRedundancyStatus ipv6bgpSessionRedundancyStatus;

    /**
     * IPV6 BGP redundancy status indicates if the configured redundancy level is met
     * @return the value
     **/
    public Ipv6bgpSessionRedundancyStatus getIpv6bgpSessionRedundancyStatus() {
        return ipv6bgpSessionRedundancyStatus;
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
        sb.append("VirtualCircuitRedundancyMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("configuredRedundancyLevel=")
                .append(String.valueOf(this.configuredRedundancyLevel));
        sb.append(", ipv4bgpSessionRedundancyStatus=")
                .append(String.valueOf(this.ipv4bgpSessionRedundancyStatus));
        sb.append(", ipv6bgpSessionRedundancyStatus=")
                .append(String.valueOf(this.ipv6bgpSessionRedundancyStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitRedundancyMetadata)) {
            return false;
        }

        VirtualCircuitRedundancyMetadata other = (VirtualCircuitRedundancyMetadata) o;
        return java.util.Objects.equals(
                        this.configuredRedundancyLevel, other.configuredRedundancyLevel)
                && java.util.Objects.equals(
                        this.ipv4bgpSessionRedundancyStatus, other.ipv4bgpSessionRedundancyStatus)
                && java.util.Objects.equals(
                        this.ipv6bgpSessionRedundancyStatus, other.ipv6bgpSessionRedundancyStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.configuredRedundancyLevel == null
                                ? 43
                                : this.configuredRedundancyLevel.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv4bgpSessionRedundancyStatus == null
                                ? 43
                                : this.ipv4bgpSessionRedundancyStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.ipv6bgpSessionRedundancyStatus == null
                                ? 43
                                : this.ipv6bgpSessionRedundancyStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
