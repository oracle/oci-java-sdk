/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The shape config to launch a fast launch capable job instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FastLaunchJobConfigSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FastLaunchJobConfigSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "shapeName",
        "coreCount",
        "memoryInGBs",
        "shapeSeries",
        "managedEgressSupport"
    })
    public FastLaunchJobConfigSummary(
            String name,
            String shapeName,
            Integer coreCount,
            Integer memoryInGBs,
            ShapeSeries shapeSeries,
            ManagedEgressSupport managedEgressSupport) {
        super();
        this.name = name;
        this.shapeName = shapeName;
        this.coreCount = coreCount;
        this.memoryInGBs = memoryInGBs;
        this.shapeSeries = shapeSeries;
        this.managedEgressSupport = managedEgressSupport;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the fast launch job config */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the fast launch job config
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The name of the fast launch job shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The name of the fast launch job shape.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** The number of cores associated with this fast launch job shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("coreCount")
        private Integer coreCount;

        /**
         * The number of cores associated with this fast launch job shape.
         *
         * @param coreCount the value to set
         * @return this builder
         */
        public Builder coreCount(Integer coreCount) {
            this.coreCount = coreCount;
            this.__explicitlySet__.add("coreCount");
            return this;
        }
        /** The number of cores associated with this fast launch job shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        /**
         * The number of cores associated with this fast launch job shape.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /** The family that the compute shape belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeSeries")
        private ShapeSeries shapeSeries;

        /**
         * The family that the compute shape belongs to.
         *
         * @param shapeSeries the value to set
         * @return this builder
         */
        public Builder shapeSeries(ShapeSeries shapeSeries) {
            this.shapeSeries = shapeSeries;
            this.__explicitlySet__.add("shapeSeries");
            return this;
        }
        /** The managed egress support */
        @com.fasterxml.jackson.annotation.JsonProperty("managedEgressSupport")
        private ManagedEgressSupport managedEgressSupport;

        /**
         * The managed egress support
         *
         * @param managedEgressSupport the value to set
         * @return this builder
         */
        public Builder managedEgressSupport(ManagedEgressSupport managedEgressSupport) {
            this.managedEgressSupport = managedEgressSupport;
            this.__explicitlySet__.add("managedEgressSupport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FastLaunchJobConfigSummary build() {
            FastLaunchJobConfigSummary model =
                    new FastLaunchJobConfigSummary(
                            this.name,
                            this.shapeName,
                            this.coreCount,
                            this.memoryInGBs,
                            this.shapeSeries,
                            this.managedEgressSupport);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FastLaunchJobConfigSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("coreCount")) {
                this.coreCount(model.getCoreCount());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("shapeSeries")) {
                this.shapeSeries(model.getShapeSeries());
            }
            if (model.wasPropertyExplicitlySet("managedEgressSupport")) {
                this.managedEgressSupport(model.getManagedEgressSupport());
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

    /** The name of the fast launch job config */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the fast launch job config
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The name of the fast launch job shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The name of the fast launch job shape.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /** The number of cores associated with this fast launch job shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("coreCount")
    private final Integer coreCount;

    /**
     * The number of cores associated with this fast launch job shape.
     *
     * @return the value
     */
    public Integer getCoreCount() {
        return coreCount;
    }

    /** The number of cores associated with this fast launch job shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Integer memoryInGBs;

    /**
     * The number of cores associated with this fast launch job shape.
     *
     * @return the value
     */
    public Integer getMemoryInGBs() {
        return memoryInGBs;
    }

    /** The family that the compute shape belongs to. */
    public enum ShapeSeries implements com.oracle.bmc.http.internal.BmcEnum {
        AmdRome("AMD_ROME"),
        IntelSkylake("INTEL_SKYLAKE"),
        NvidiaGpu("NVIDIA_GPU"),
        Generic("GENERIC"),
        Legacy("LEGACY"),
        Arm("ARM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ShapeSeries.class);

        private final String value;
        private static java.util.Map<String, ShapeSeries> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeSeries v : ShapeSeries.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeSeries(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeSeries create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeSeries', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The family that the compute shape belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeSeries")
    private final ShapeSeries shapeSeries;

    /**
     * The family that the compute shape belongs to.
     *
     * @return the value
     */
    public ShapeSeries getShapeSeries() {
        return shapeSeries;
    }

    /** The managed egress support */
    public enum ManagedEgressSupport implements com.oracle.bmc.http.internal.BmcEnum {
        Required("REQUIRED"),
        Supported("SUPPORTED"),
        Unsupported("UNSUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ManagedEgressSupport.class);

        private final String value;
        private static java.util.Map<String, ManagedEgressSupport> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedEgressSupport v : ManagedEgressSupport.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagedEgressSupport(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedEgressSupport create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagedEgressSupport', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The managed egress support */
    @com.fasterxml.jackson.annotation.JsonProperty("managedEgressSupport")
    private final ManagedEgressSupport managedEgressSupport;

    /**
     * The managed egress support
     *
     * @return the value
     */
    public ManagedEgressSupport getManagedEgressSupport() {
        return managedEgressSupport;
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
        sb.append("FastLaunchJobConfigSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", coreCount=").append(String.valueOf(this.coreCount));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", shapeSeries=").append(String.valueOf(this.shapeSeries));
        sb.append(", managedEgressSupport=").append(String.valueOf(this.managedEgressSupport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FastLaunchJobConfigSummary)) {
            return false;
        }

        FastLaunchJobConfigSummary other = (FastLaunchJobConfigSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.coreCount, other.coreCount)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.shapeSeries, other.shapeSeries)
                && java.util.Objects.equals(this.managedEgressSupport, other.managedEgressSupport)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.coreCount == null ? 43 : this.coreCount.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + (this.shapeSeries == null ? 43 : this.shapeSeries.hashCode());
        result =
                (result * PRIME)
                        + (this.managedEgressSupport == null
                                ? 43
                                : this.managedEgressSupport.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
