/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of monitor configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "configType",
    defaultImpl = MonitorConfiguration.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DnsSecMonitorConfiguration.class,
        name = "DNSSEC_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DnsTraceMonitorConfiguration.class,
        name = "DNS_TRACE_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ScriptedRestMonitorConfiguration.class,
        name = "SCRIPTED_REST_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DnsServerMonitorConfiguration.class,
        name = "DNS_SERVER_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ScriptedBrowserMonitorConfiguration.class,
        name = "SCRIPTED_BROWSER_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = RestMonitorConfiguration.class,
        name = "REST_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = BrowserMonitorConfiguration.class,
        name = "BROWSER_CONFIG"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = NetworkMonitorConfiguration.class,
        name = "NETWORK_CONFIG"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class MonitorConfiguration extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isFailureRetried", "dnsConfiguration"})
    protected MonitorConfiguration(Boolean isFailureRetried, DnsConfiguration dnsConfiguration) {
        super();
        this.isFailureRetried = isFailureRetried;
        this.dnsConfiguration = dnsConfiguration;
    }

    /**
     * If isFailureRetried is enabled, then a failed call will be retried.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFailureRetried")
    private final Boolean isFailureRetried;

    /**
     * If isFailureRetried is enabled, then a failed call will be retried.
     * @return the value
     **/
    public Boolean getIsFailureRetried() {
        return isFailureRetried;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dnsConfiguration")
    private final DnsConfiguration dnsConfiguration;

    public DnsConfiguration getDnsConfiguration() {
        return dnsConfiguration;
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
        sb.append("MonitorConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isFailureRetried=").append(String.valueOf(this.isFailureRetried));
        sb.append(", dnsConfiguration=").append(String.valueOf(this.dnsConfiguration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MonitorConfiguration)) {
            return false;
        }

        MonitorConfiguration other = (MonitorConfiguration) o;
        return java.util.Objects.equals(this.isFailureRetried, other.isFailureRetried)
                && java.util.Objects.equals(this.dnsConfiguration, other.dnsConfiguration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isFailureRetried == null ? 43 : this.isFailureRetried.hashCode());
        result =
                (result * PRIME)
                        + (this.dnsConfiguration == null ? 43 : this.dnsConfiguration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Type of configuration.
     **/
    public enum ConfigType {
        BrowserConfig("BROWSER_CONFIG"),
        ScriptedBrowserConfig("SCRIPTED_BROWSER_CONFIG"),
        RestConfig("REST_CONFIG"),
        ScriptedRestConfig("SCRIPTED_REST_CONFIG"),
        NetworkConfig("NETWORK_CONFIG"),
        DnsServerConfig("DNS_SERVER_CONFIG"),
        DnsTraceConfig("DNS_TRACE_CONFIG"),
        DnssecConfig("DNSSEC_CONFIG"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConfigType.class);

        private final String value;
        private static java.util.Map<String, ConfigType> map;

        static {
            map = new java.util.HashMap<>();
            for (ConfigType v : ConfigType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConfigType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConfigType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConfigType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
