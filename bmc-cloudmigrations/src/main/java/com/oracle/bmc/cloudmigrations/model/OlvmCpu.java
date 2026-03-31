/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * CPU attributes in OLVM <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmCpu.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmCpu extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "architecture",
        "core",
        "cpuTune",
        "level",
        "mode",
        "name",
        "speed",
        "cpuTopology",
        "type"
    })
    public OlvmCpu(
            Architecture architecture,
            java.util.List<OlvmCore> core,
            OlvmCpuTune cpuTune,
            Integer level,
            Mode mode,
            String name,
            Float speed,
            OlvmCpuTopology cpuTopology,
            String type) {
        super();
        this.architecture = architecture;
        this.core = core;
        this.cpuTune = cpuTune;
        this.level = level;
        this.mode = mode;
        this.name = name;
        this.speed = speed;
        this.cpuTopology = cpuTopology;
        this.type = type;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** CPU architecture */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private Architecture architecture;

        /**
         * CPU architecture
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(Architecture architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** List of cores of this CPU */
        @com.fasterxml.jackson.annotation.JsonProperty("core")
        private java.util.List<OlvmCore> core;

        /**
         * List of cores of this CPU
         *
         * @param core the value to set
         * @return this builder
         */
        public Builder core(java.util.List<OlvmCore> core) {
            this.core = core;
            this.__explicitlySet__.add("core");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTune")
        private OlvmCpuTune cpuTune;

        public Builder cpuTune(OlvmCpuTune cpuTune) {
            this.cpuTune = cpuTune;
            this.__explicitlySet__.add("cpuTune");
            return this;
        }
        /** Level of this CPU */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private Integer level;

        /**
         * Level of this CPU
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(Integer level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /** CPU mode */
        @com.fasterxml.jackson.annotation.JsonProperty("mode")
        private Mode mode;

        /**
         * CPU mode
         *
         * @param mode the value to set
         * @return this builder
         */
        public Builder mode(Mode mode) {
            this.mode = mode;
            this.__explicitlySet__.add("mode");
            return this;
        }
        /** A human-readable name in plain text. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A human-readable name in plain text.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Speed of this CPU */
        @com.fasterxml.jackson.annotation.JsonProperty("speed")
        private Float speed;

        /**
         * Speed of this CPU
         *
         * @param speed the value to set
         * @return this builder
         */
        public Builder speed(Float speed) {
            this.speed = speed;
            this.__explicitlySet__.add("speed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuTopology")
        private OlvmCpuTopology cpuTopology;

        public Builder cpuTopology(OlvmCpuTopology cpuTopology) {
            this.cpuTopology = cpuTopology;
            this.__explicitlySet__.add("cpuTopology");
            return this;
        }
        /** CPU type */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * CPU type
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmCpu build() {
            OlvmCpu model =
                    new OlvmCpu(
                            this.architecture,
                            this.core,
                            this.cpuTune,
                            this.level,
                            this.mode,
                            this.name,
                            this.speed,
                            this.cpuTopology,
                            this.type);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmCpu model) {
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("core")) {
                this.core(model.getCore());
            }
            if (model.wasPropertyExplicitlySet("cpuTune")) {
                this.cpuTune(model.getCpuTune());
            }
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("mode")) {
                this.mode(model.getMode());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("speed")) {
                this.speed(model.getSpeed());
            }
            if (model.wasPropertyExplicitlySet("cpuTopology")) {
                this.cpuTopology(model.getCpuTopology());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
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

    /** CPU architecture */
    public enum Architecture implements com.oracle.bmc.http.internal.BmcEnum {
        Aarch64("AARCH64"),
        Ppc64("PPC64"),
        S390X("S390X"),
        Undefined("UNDEFINED"),
        X8664("X86_64"),
        ;

        private final String value;
        private static java.util.Map<String, Architecture> map;

        static {
            map = new java.util.HashMap<>();
            for (Architecture v : Architecture.values()) {
                map.put(v.getValue(), v);
            }
        }

        Architecture(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Architecture create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Architecture: " + key);
        }
    };
    /** CPU architecture */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final Architecture architecture;

    /**
     * CPU architecture
     *
     * @return the value
     */
    public Architecture getArchitecture() {
        return architecture;
    }

    /** List of cores of this CPU */
    @com.fasterxml.jackson.annotation.JsonProperty("core")
    private final java.util.List<OlvmCore> core;

    /**
     * List of cores of this CPU
     *
     * @return the value
     */
    public java.util.List<OlvmCore> getCore() {
        return core;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuTune")
    private final OlvmCpuTune cpuTune;

    public OlvmCpuTune getCpuTune() {
        return cpuTune;
    }

    /** Level of this CPU */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final Integer level;

    /**
     * Level of this CPU
     *
     * @return the value
     */
    public Integer getLevel() {
        return level;
    }

    /** CPU mode */
    public enum Mode implements com.oracle.bmc.http.internal.BmcEnum {
        Custom("CUSTOM"),
        HostModel("HOST_MODEL"),
        HostPassthrough("HOST_PASSTHROUGH"),
        ;

        private final String value;
        private static java.util.Map<String, Mode> map;

        static {
            map = new java.util.HashMap<>();
            for (Mode v : Mode.values()) {
                map.put(v.getValue(), v);
            }
        }

        Mode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Mode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Mode: " + key);
        }
    };
    /** CPU mode */
    @com.fasterxml.jackson.annotation.JsonProperty("mode")
    private final Mode mode;

    /**
     * CPU mode
     *
     * @return the value
     */
    public Mode getMode() {
        return mode;
    }

    /** A human-readable name in plain text. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A human-readable name in plain text.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Speed of this CPU */
    @com.fasterxml.jackson.annotation.JsonProperty("speed")
    private final Float speed;

    /**
     * Speed of this CPU
     *
     * @return the value
     */
    public Float getSpeed() {
        return speed;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cpuTopology")
    private final OlvmCpuTopology cpuTopology;

    public OlvmCpuTopology getCpuTopology() {
        return cpuTopology;
    }

    /** CPU type */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * CPU type
     *
     * @return the value
     */
    public String getType() {
        return type;
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
        sb.append("OlvmCpu(");
        sb.append("super=").append(super.toString());
        sb.append("architecture=").append(String.valueOf(this.architecture));
        sb.append(", core=").append(String.valueOf(this.core));
        sb.append(", cpuTune=").append(String.valueOf(this.cpuTune));
        sb.append(", level=").append(String.valueOf(this.level));
        sb.append(", mode=").append(String.valueOf(this.mode));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", speed=").append(String.valueOf(this.speed));
        sb.append(", cpuTopology=").append(String.valueOf(this.cpuTopology));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmCpu)) {
            return false;
        }

        OlvmCpu other = (OlvmCpu) o;
        return java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.core, other.core)
                && java.util.Objects.equals(this.cpuTune, other.cpuTune)
                && java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.mode, other.mode)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.speed, other.speed)
                && java.util.Objects.equals(this.cpuTopology, other.cpuTopology)
                && java.util.Objects.equals(this.type, other.type)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.core == null ? 43 : this.core.hashCode());
        result = (result * PRIME) + (this.cpuTune == null ? 43 : this.cpuTune.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.mode == null ? 43 : this.mode.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.speed == null ? 43 : this.speed.hashCode());
        result = (result * PRIME) + (this.cpuTopology == null ? 43 : this.cpuTopology.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
