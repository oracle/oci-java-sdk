/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The shape of the DB System. The shape determines resources to allocate
 * to the DB System - CPU cores and memory for VM shapes; CPU cores, memory
 * and storage for non-VM (or bare metal) shapes.  For a description of
 * shapes, see [DB System Shape Options](https://docs.cloud.oracle.com/mysql-database/doc/shapes.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "cpuCoreCount", "memorySizeInGBs", "isSupportedFor"})
    public ShapeSummary(
            String name,
            Integer cpuCoreCount,
            Integer memorySizeInGBs,
            java.util.List<IsSupportedFor> isSupportedFor) {
        super();
        this.name = name;
        this.cpuCoreCount = cpuCoreCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.isSupportedFor = isSupportedFor;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the shape used for the DB System.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the shape used for the DB System.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The number of CPU Cores the Instance provides. These are "OCPU"s.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
        private Integer cpuCoreCount;

        /**
         * The number of CPU Cores the Instance provides. These are "OCPU"s.
         * @param cpuCoreCount the value to set
         * @return this builder
         **/
        public Builder cpuCoreCount(Integer cpuCoreCount) {
            this.cpuCoreCount = cpuCoreCount;
            this.__explicitlySet__.add("cpuCoreCount");
            return this;
        }
        /**
         * The amount of RAM the Instance provides. This is an IEC base-2 number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The amount of RAM the Instance provides. This is an IEC base-2 number.
         * @param memorySizeInGBs the value to set
         * @return this builder
         **/
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /**
         * What service features the shape is supported for.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSupportedFor")
        private java.util.List<IsSupportedFor> isSupportedFor;

        /**
         * What service features the shape is supported for.
         *
         * @param isSupportedFor the value to set
         * @return this builder
         **/
        public Builder isSupportedFor(java.util.List<IsSupportedFor> isSupportedFor) {
            this.isSupportedFor = isSupportedFor;
            this.__explicitlySet__.add("isSupportedFor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeSummary build() {
            ShapeSummary __instance__ =
                    new ShapeSummary(name, cpuCoreCount, memorySizeInGBs, isSupportedFor);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .cpuCoreCount(o.getCpuCoreCount())
                            .memorySizeInGBs(o.getMemorySizeInGBs())
                            .isSupportedFor(o.getIsSupportedFor());

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
     * The name of the shape used for the DB System.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the shape used for the DB System.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The number of CPU Cores the Instance provides. These are "OCPU"s.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cpuCoreCount")
    private final Integer cpuCoreCount;

    /**
     * The number of CPU Cores the Instance provides. These are "OCPU"s.
     * @return the value
     **/
    public Integer getCpuCoreCount() {
        return cpuCoreCount;
    }

    /**
     * The amount of RAM the Instance provides. This is an IEC base-2 number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The amount of RAM the Instance provides. This is an IEC base-2 number.
     * @return the value
     **/
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /**
     **/
    public enum IsSupportedFor {
        Dbsystem("DBSYSTEM"),
        Analyticscluster("ANALYTICSCLUSTER"),
        Heatwavecluster("HEATWAVECLUSTER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IsSupportedFor.class);

        private final String value;
        private static java.util.Map<String, IsSupportedFor> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSupportedFor v : IsSupportedFor.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IsSupportedFor(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSupportedFor create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IsSupportedFor', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * What service features the shape is supported for.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportedFor")
    private final java.util.List<IsSupportedFor> isSupportedFor;

    /**
     * What service features the shape is supported for.
     *
     * @return the value
     **/
    public java.util.List<IsSupportedFor> getIsSupportedFor() {
        return isSupportedFor;
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
        sb.append("ShapeSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", cpuCoreCount=").append(String.valueOf(this.cpuCoreCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", isSupportedFor=").append(String.valueOf(this.isSupportedFor));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeSummary)) {
            return false;
        }

        ShapeSummary other = (ShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.cpuCoreCount, other.cpuCoreCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.isSupportedFor, other.isSupportedFor)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.cpuCoreCount == null ? 43 : this.cpuCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportedFor == null ? 43 : this.isSupportedFor.hashCode());
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
