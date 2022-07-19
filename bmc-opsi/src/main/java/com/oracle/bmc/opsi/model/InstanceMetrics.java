/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Object containing instance metrics.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InstanceMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InstanceMetrics {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostName",
        "instanceName",
        "usage",
        "capacity",
        "utilizationPercent",
        "usageChangePercent"
    })
    public InstanceMetrics(
            String hostName,
            String instanceName,
            Double usage,
            Double capacity,
            Double utilizationPercent,
            Double usageChangePercent) {
        super();
        this.hostName = hostName;
        this.instanceName = instanceName;
        this.usage = usage;
        this.capacity = capacity;
        this.utilizationPercent = utilizationPercent;
        this.usageChangePercent = usageChangePercent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The hostname of the database insight resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The hostname of the database insight resource.
         * @param hostName the value to set
         * @return this builder
         **/
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /**
         * The instance name of the database insight resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
        private String instanceName;

        /**
         * The instance name of the database insight resource.
         * @param instanceName the value to set
         * @return this builder
         **/
        public Builder instanceName(String instanceName) {
            this.instanceName = instanceName;
            this.__explicitlySet__.add("instanceName");
            return this;
        }
        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private Double usage;

        /**
         * Total amount used of the resource metric type (CPU, STORAGE).
         *
         * @param usage the value to set
         * @return this builder
         **/
        public Builder usage(Double usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }
        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacity")
        private Double capacity;

        /**
         * The maximum allocated amount of the resource metric type  (CPU, STORAGE).
         *
         * @param capacity the value to set
         * @return this builder
         **/
        public Builder capacity(Double capacity) {
            this.capacity = capacity;
            this.__explicitlySet__.add("capacity");
            return this;
        }
        /**
         * Resource utilization in percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
        private Double utilizationPercent;

        /**
         * Resource utilization in percentage
         * @param utilizationPercent the value to set
         * @return this builder
         **/
        public Builder utilizationPercent(Double utilizationPercent) {
            this.utilizationPercent = utilizationPercent;
            this.__explicitlySet__.add("utilizationPercent");
            return this;
        }
        /**
         * Change in resource utilization in percentage
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("usageChangePercent")
        private Double usageChangePercent;

        /**
         * Change in resource utilization in percentage
         * @param usageChangePercent the value to set
         * @return this builder
         **/
        public Builder usageChangePercent(Double usageChangePercent) {
            this.usageChangePercent = usageChangePercent;
            this.__explicitlySet__.add("usageChangePercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceMetrics build() {
            InstanceMetrics __instance__ =
                    new InstanceMetrics(
                            hostName,
                            instanceName,
                            usage,
                            capacity,
                            utilizationPercent,
                            usageChangePercent);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceMetrics o) {
            Builder copiedBuilder =
                    hostName(o.getHostName())
                            .instanceName(o.getInstanceName())
                            .usage(o.getUsage())
                            .capacity(o.getCapacity())
                            .utilizationPercent(o.getUtilizationPercent())
                            .usageChangePercent(o.getUsageChangePercent());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The hostname of the database insight resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The hostname of the database insight resource.
     * @return the value
     **/
    public String getHostName() {
        return hostName;
    }

    /**
     * The instance name of the database insight resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("instanceName")
    private final String instanceName;

    /**
     * The instance name of the database insight resource.
     * @return the value
     **/
    public String getInstanceName() {
        return instanceName;
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
     * Resource utilization in percentage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("utilizationPercent")
    private final Double utilizationPercent;

    /**
     * Resource utilization in percentage
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
        sb.append("InstanceMetrics(");
        sb.append("hostName=").append(String.valueOf(this.hostName));
        sb.append(", instanceName=").append(String.valueOf(this.instanceName));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(", capacity=").append(String.valueOf(this.capacity));
        sb.append(", utilizationPercent=").append(String.valueOf(this.utilizationPercent));
        sb.append(", usageChangePercent=").append(String.valueOf(this.usageChangePercent));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceMetrics)) {
            return false;
        }

        InstanceMetrics other = (InstanceMetrics) o;
        return java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.instanceName, other.instanceName)
                && java.util.Objects.equals(this.usage, other.usage)
                && java.util.Objects.equals(this.capacity, other.capacity)
                && java.util.Objects.equals(this.utilizationPercent, other.utilizationPercent)
                && java.util.Objects.equals(this.usageChangePercent, other.usageChangePercent)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.instanceName == null ? 43 : this.instanceName.hashCode());
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
