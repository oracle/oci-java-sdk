/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Base Metric Group for Host configuration metrics
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "metricName",
    defaultImpl = HostConfigurationMetricGroup.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostResourceAllocation.class,
        name = "HOST_RESOURCE_ALLOCATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostProduct.class,
        name = "HOST_PRODUCT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostNetworkConfiguration.class,
        name = "HOST_NETWORK_CONFIGURATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostEntities.class,
        name = "HOST_ENTITIES"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostMemoryConfiguration.class,
        name = "HOST_MEMORY_CONFIGURATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostCpuHardwareConfiguration.class,
        name = "HOST_CPU_HARDWARE_CONFIGURATION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = HostHardwareConfiguration.class,
        name = "HOST_HARDWARE_CONFIGURATION"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class HostConfigurationMetricGroup {

    /**
     * Collection timestamp
     * Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    java.util.Date timeCollected;

    /**
     * Name of the metric group
     *
     **/
    public enum MetricName {
        HostProduct("HOST_PRODUCT"),
        HostResourceAllocation("HOST_RESOURCE_ALLOCATION"),
        HostMemoryConfiguration("HOST_MEMORY_CONFIGURATION"),
        HostHardwareConfiguration("HOST_HARDWARE_CONFIGURATION"),
        HostCpuHardwareConfiguration("HOST_CPU_HARDWARE_CONFIGURATION"),
        HostNetworkConfiguration("HOST_NETWORK_CONFIGURATION"),
        HostEntites("HOST_ENTITES"),
        ;

        private final String value;
        private static java.util.Map<String, MetricName> map;

        static {
            map = new java.util.HashMap<>();
            for (MetricName v : MetricName.values()) {
                map.put(v.getValue(), v);
            }
        }

        MetricName(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MetricName create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MetricName: " + key);
        }
    };
}
