/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * GPU device details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GpuDevice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class GpuDevice extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "coresCount",
        "memoryInMBs",
        "manufacturer"
    })
    public GpuDevice(
            String name,
            String description,
            Integer coresCount,
            Long memoryInMBs,
            String manufacturer) {
        super();
        this.name = name;
        this.description = description;
        this.coresCount = coresCount;
        this.memoryInMBs = memoryInMBs;
        this.manufacturer = manufacturer;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * GPU device name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * GPU device name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * GPU device description.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * GPU device description.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Number of GPU cores.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coresCount")
        private Integer coresCount;

        /**
         * Number of GPU cores.
         * @param coresCount the value to set
         * @return this builder
         **/
        public Builder coresCount(Integer coresCount) {
            this.coresCount = coresCount;
            this.__explicitlySet__.add("coresCount");
            return this;
        }
        /**
         * GPU memory size in MBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
        private Long memoryInMBs;

        /**
         * GPU memory size in MBs.
         * @param memoryInMBs the value to set
         * @return this builder
         **/
        public Builder memoryInMBs(Long memoryInMBs) {
            this.memoryInMBs = memoryInMBs;
            this.__explicitlySet__.add("memoryInMBs");
            return this;
        }
        /**
         * The manufacturer of GPU.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
        private String manufacturer;

        /**
         * The manufacturer of GPU.
         * @param manufacturer the value to set
         * @return this builder
         **/
        public Builder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            this.__explicitlySet__.add("manufacturer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GpuDevice build() {
            GpuDevice model =
                    new GpuDevice(
                            this.name,
                            this.description,
                            this.coresCount,
                            this.memoryInMBs,
                            this.manufacturer);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GpuDevice model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("coresCount")) {
                this.coresCount(model.getCoresCount());
            }
            if (model.wasPropertyExplicitlySet("memoryInMBs")) {
                this.memoryInMBs(model.getMemoryInMBs());
            }
            if (model.wasPropertyExplicitlySet("manufacturer")) {
                this.manufacturer(model.getManufacturer());
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

    /**
     * GPU device name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * GPU device name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * GPU device description.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * GPU device description.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Number of GPU cores.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coresCount")
    private final Integer coresCount;

    /**
     * Number of GPU cores.
     * @return the value
     **/
    public Integer getCoresCount() {
        return coresCount;
    }

    /**
     * GPU memory size in MBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInMBs")
    private final Long memoryInMBs;

    /**
     * GPU memory size in MBs.
     * @return the value
     **/
    public Long getMemoryInMBs() {
        return memoryInMBs;
    }

    /**
     * The manufacturer of GPU.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturer")
    private final String manufacturer;

    /**
     * The manufacturer of GPU.
     * @return the value
     **/
    public String getManufacturer() {
        return manufacturer;
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
        sb.append("GpuDevice(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", coresCount=").append(String.valueOf(this.coresCount));
        sb.append(", memoryInMBs=").append(String.valueOf(this.memoryInMBs));
        sb.append(", manufacturer=").append(String.valueOf(this.manufacturer));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GpuDevice)) {
            return false;
        }

        GpuDevice other = (GpuDevice) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.coresCount, other.coresCount)
                && java.util.Objects.equals(this.memoryInMBs, other.memoryInMBs)
                && java.util.Objects.equals(this.manufacturer, other.manufacturer)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.coresCount == null ? 43 : this.coresCount.hashCode());
        result = (result * PRIME) + (this.memoryInMBs == null ? 43 : this.memoryInMBs.hashCode());
        result = (result * PRIME) + (this.manufacturer == null ? 43 : this.manufacturer.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
