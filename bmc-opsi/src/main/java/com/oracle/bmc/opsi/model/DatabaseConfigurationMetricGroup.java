/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Supported configuration metric groups for database capacity planning service.
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
    property = "metricName",
    defaultImpl = DatabaseConfigurationMetricGroup.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DBOSConfigInstance.class,
        name = "DB_OS_CONFIG_INSTANCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DBExternalInstance.class,
        name = "DB_EXTERNAL_INSTANCE"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = DBExternalProperties.class,
        name = "DB_EXTERNAL_PROPERTIES"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class DatabaseConfigurationMetricGroup {
    @Deprecated
    @java.beans.ConstructorProperties({"timeCollected"})
    protected DatabaseConfigurationMetricGroup(java.util.Date timeCollected) {
        super();
        this.timeCollected = timeCollected;
    }

    /**
     * Collection timestamp
     * Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp
     * Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     * @return the value
     **/
    public java.util.Date getTimeCollected() {
        return timeCollected;
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
        sb.append("DatabaseConfigurationMetricGroup(");
        sb.append("timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConfigurationMetricGroup)) {
            return false;
        }

        DatabaseConfigurationMetricGroup other = (DatabaseConfigurationMetricGroup) o;
        return java.util.Objects.equals(this.timeCollected, other.timeCollected);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        return result;
    }

    /**
     * Name of the metric group.
     *
     **/
    public enum MetricName {
        DbExternalProperties("DB_EXTERNAL_PROPERTIES"),
        DbExternalInstance("DB_EXTERNAL_INSTANCE"),
        DbOsConfigInstance("DB_OS_CONFIG_INSTANCE"),
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
