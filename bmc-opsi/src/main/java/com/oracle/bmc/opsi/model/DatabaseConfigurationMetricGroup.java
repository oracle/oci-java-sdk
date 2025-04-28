/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Supported configuration metric groups for database capacity planning service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "metricName",
        defaultImpl = DatabaseConfigurationMetricGroup.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DBOSConfigInstance.class,
            name = "DB_OS_CONFIG_INSTANCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DBExternalInstance.class,
            name = "DB_EXTERNAL_INSTANCE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DBParameters.class,
            name = "DB_PARAMETERS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DBConnectionStatus.class,
            name = "DB_CONNECTION_STATUS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = HostAllocation.class,
            name = "HOST_RESOURCE_ALLOCATION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExadataCellConfig.class,
            name = "EXADATA_CELL_CONFIG"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DBExternalProperties.class,
            name = "DB_EXTERNAL_PROPERTIES"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ExadataAsmEntity.class,
            name = "ASM_ENTITY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class DatabaseConfigurationMetricGroup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeCollected"})
    protected DatabaseConfigurationMetricGroup(java.util.Date timeCollected) {
        super();
        this.timeCollected = timeCollected;
    }

    /** Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"} */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
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
        sb.append("DatabaseConfigurationMetricGroup(");
        sb.append("super=").append(super.toString());
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
        return java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Name of the metric group. */
    public enum MetricName implements com.oracle.bmc.http.internal.BmcEnum {
        DbExternalProperties("DB_EXTERNAL_PROPERTIES"),
        DbExternalInstance("DB_EXTERNAL_INSTANCE"),
        DbOsConfigInstance("DB_OS_CONFIG_INSTANCE"),
        DbParameters("DB_PARAMETERS"),
        DbConnectionStatus("DB_CONNECTION_STATUS"),
        HostResourceAllocation("HOST_RESOURCE_ALLOCATION"),
        AsmEntity("ASM_ENTITY"),
        ExadataCellConfig("EXADATA_CELL_CONFIG"),
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
