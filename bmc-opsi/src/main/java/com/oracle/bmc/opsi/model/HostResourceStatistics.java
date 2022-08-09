/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Contains host resource base statistics.
 *
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
    property = "resourceName",
    defaultImpl = HostResourceStatistics.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostMemoryStatistics.class,
        name = "HOST_MEMORY_STATISTICS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostCpuStatistics.class,
        name = "HOST_CPU_STATISTICS"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HostResourceStatistics extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "usage",
        "capacity",
        "utilizationPercent",
        "usageChangePercent"
    })
    protected HostResourceStatistics(
            Double usage, Double capacity, Double utilizationPercent, Double usageChangePercent) {
        super();
        this.usage = usage;
        this.capacity = capacity;
        this.utilizationPercent = utilizationPercent;
        this.usageChangePercent = usageChangePercent;
    }

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final Double usage;

    /**
     * Total amount used of the resource metric type (CPU, STORAGE).
     *
     * @return the value
     **/
    public Double getUsage() {
        return usage;
    }

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacity")
    private final Double capacity;

    /**
     * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
     *
     * @return the value
     **/
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Resource utilization in percentage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
    private final Double utilizationPercent;

    /**
     * Resource utilization in percentage.
     *
     * @return the value
     **/
    public Double getUtilizationPercent() {
        return utilizationPercent;
    }

    /**
     * Change in resource utilization in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
    private final Double usageChangePercent;

    /**
     * Change in resource utilization in percentage
     * @return the value
     **/
    public Double getUsageChangePercent() {
        return usageChangePercent;
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
        sb.append("HostResourceStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("usage=").append(String.valueOf(this.usage));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", utilizationPercent=").append(String.valueOf(this.utilizationPercent));
        sb.append(", usageChangePercent=").append(String.valueOf(this.usageChangePercent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HostResourceStatistics)) {
            return false;
        }

        HostResourceStatistics other = (HostResourceStatistics) o;
        return java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.utilizationPercent, other.utilizationPercent)
                && java.util.Objects.equals(this.usageChangePercent, other.usageChangePercent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        result = (result * PRIME) + (this.capacity == null ? 43 : this.capacity.hashCode());
        result =
                (result * PRIME)
                        + (this.utilizationPercent == null
                                ? 43
                                : this.utilizationPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.usageChangePercent == null
                                ? 43
                                : this.usageChangePercent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Name of resource for host
     **/
    public enum ResourceName {
        HostCpuStatistics("HOST_CPU_STATISTICS"),
        HostMemoryStatistics("HOST_MEMORY_STATISTICS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceName.class);

        private final String value;
        private static java.util.Map<String, ResourceName> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceName v : ResourceName.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceName', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
