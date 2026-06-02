/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * Extended information about CPU architecture for the task profile.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CpuArchitectureTaskProfileExtendedInformation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CpuArchitectureTaskProfileExtendedInformation
        extends BatchTaskProfileExtendedInformation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of CPU architecture.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private Architecture architecture;

        /**
         * Type of CPU architecture.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(Architecture architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CpuArchitectureTaskProfileExtendedInformation build() {
            CpuArchitectureTaskProfileExtendedInformation model =
                    new CpuArchitectureTaskProfileExtendedInformation(this.architecture);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CpuArchitectureTaskProfileExtendedInformation model) {
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
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

    @Deprecated
    public CpuArchitectureTaskProfileExtendedInformation(Architecture architecture) {
        super();
        this.architecture = architecture;
    }

    /**
     * Type of CPU architecture.
     **/
    public enum Architecture {
        GenericX86("GENERIC_X86"),
        GenericArm("GENERIC_ARM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Architecture.class);

        private final String value;
        private static java.util.Map<String, Architecture> map;

        static {
            map = new java.util.HashMap<>();
            for (Architecture v : Architecture.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Architecture', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of CPU architecture.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final Architecture architecture;

    /**
     * Type of CPU architecture.
     * @return the value
     **/
    public Architecture getArchitecture() {
        return architecture;
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
        sb.append("CpuArchitectureTaskProfileExtendedInformation(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CpuArchitectureTaskProfileExtendedInformation)) {
            return false;
        }

        CpuArchitectureTaskProfileExtendedInformation other =
                (CpuArchitectureTaskProfileExtendedInformation) o;
        return java.util.Objects.equals(this.architecture, other.architecture)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        return result;
    }
}
