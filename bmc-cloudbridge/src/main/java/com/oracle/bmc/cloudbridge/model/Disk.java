/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * The assets disk.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Disk.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Disk extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "bootOrder",
        "uuid",
        "uuidLun",
        "sizeInMBs",
        "location",
        "persistentMode"
    })
    public Disk(
            String name,
            Integer bootOrder,
            String uuid,
            String uuidLun,
            Long sizeInMBs,
            String location,
            String persistentMode) {
        super();
        this.name = name;
        this.bootOrder = bootOrder;
        this.uuid = uuid;
        this.uuidLun = uuidLun;
        this.sizeInMBs = sizeInMBs;
        this.location = location;
        this.persistentMode = persistentMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Disk name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Disk name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Order of boot volumes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bootOrder")
        private Integer bootOrder;

        /**
         * Order of boot volumes.
         * @param bootOrder the value to set
         * @return this builder
         **/
        public Builder bootOrder(Integer bootOrder) {
            this.bootOrder = bootOrder;
            this.__explicitlySet__.add("bootOrder");
            return this;
        }
        /**
         * Disk UUID for the virtual disk, if available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uuid")
        private String uuid;

        /**
         * Disk UUID for the virtual disk, if available.
         * @param uuid the value to set
         * @return this builder
         **/
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            this.__explicitlySet__.add("uuid");
            return this;
        }
        /**
         * Disk UUID LUN for the virtual disk, if available.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uuidLun")
        private String uuidLun;

        /**
         * Disk UUID LUN for the virtual disk, if available.
         * @param uuidLun the value to set
         * @return this builder
         **/
        public Builder uuidLun(String uuidLun) {
            this.uuidLun = uuidLun;
            this.__explicitlySet__.add("uuidLun");
            return this;
        }
        /**
         * The size of the volume in MBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
        private Long sizeInMBs;

        /**
         * The size of the volume in MBs.
         * @param sizeInMBs the value to set
         * @return this builder
         **/
        public Builder sizeInMBs(Long sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            this.__explicitlySet__.add("sizeInMBs");
            return this;
        }
        /**
         * Location of the boot/data volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * Location of the boot/data volume.
         * @param location the value to set
         * @return this builder
         **/
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /**
         * The disk persistent mode.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("persistentMode")
        private String persistentMode;

        /**
         * The disk persistent mode.
         * @param persistentMode the value to set
         * @return this builder
         **/
        public Builder persistentMode(String persistentMode) {
            this.persistentMode = persistentMode;
            this.__explicitlySet__.add("persistentMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Disk build() {
            Disk model =
                    new Disk(
                            this.name,
                            this.bootOrder,
                            this.uuid,
                            this.uuidLun,
                            this.sizeInMBs,
                            this.location,
                            this.persistentMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Disk model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("bootOrder")) {
                this.bootOrder(model.getBootOrder());
            }
            if (model.wasPropertyExplicitlySet("uuid")) {
                this.uuid(model.getUuid());
            }
            if (model.wasPropertyExplicitlySet("uuidLun")) {
                this.uuidLun(model.getUuidLun());
            }
            if (model.wasPropertyExplicitlySet("sizeInMBs")) {
                this.sizeInMBs(model.getSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("persistentMode")) {
                this.persistentMode(model.getPersistentMode());
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
     * Disk name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Disk name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Order of boot volumes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootOrder")
    private final Integer bootOrder;

    /**
     * Order of boot volumes.
     * @return the value
     **/
    public Integer getBootOrder() {
        return bootOrder;
    }

    /**
     * Disk UUID for the virtual disk, if available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uuid")
    private final String uuid;

    /**
     * Disk UUID for the virtual disk, if available.
     * @return the value
     **/
    public String getUuid() {
        return uuid;
    }

    /**
     * Disk UUID LUN for the virtual disk, if available.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uuidLun")
    private final String uuidLun;

    /**
     * Disk UUID LUN for the virtual disk, if available.
     * @return the value
     **/
    public String getUuidLun() {
        return uuidLun;
    }

    /**
     * The size of the volume in MBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInMBs")
    private final Long sizeInMBs;

    /**
     * The size of the volume in MBs.
     * @return the value
     **/
    public Long getSizeInMBs() {
        return sizeInMBs;
    }

    /**
     * Location of the boot/data volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * Location of the boot/data volume.
     * @return the value
     **/
    public String getLocation() {
        return location;
    }

    /**
     * The disk persistent mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("persistentMode")
    private final String persistentMode;

    /**
     * The disk persistent mode.
     * @return the value
     **/
    public String getPersistentMode() {
        return persistentMode;
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
        sb.append("Disk(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", bootOrder=").append(String.valueOf(this.bootOrder));
        sb.append(", uuid=").append(String.valueOf(this.uuid));
        sb.append(", uuidLun=").append(String.valueOf(this.uuidLun));
        sb.append(", sizeInMBs=").append(String.valueOf(this.sizeInMBs));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", persistentMode=").append(String.valueOf(this.persistentMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Disk)) {
            return false;
        }

        Disk other = (Disk) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.bootOrder, other.bootOrder)
                && java.util.Objects.equals(this.uuid, other.uuid)
                && java.util.Objects.equals(this.uuidLun, other.uuidLun)
                && java.util.Objects.equals(this.sizeInMBs, other.sizeInMBs)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.persistentMode, other.persistentMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.bootOrder == null ? 43 : this.bootOrder.hashCode());
        result = (result * PRIME) + (this.uuid == null ? 43 : this.uuid.hashCode());
        result = (result * PRIME) + (this.uuidLun == null ? 43 : this.uuidLun.hashCode());
        result = (result * PRIME) + (this.sizeInMBs == null ? 43 : this.sizeInMBs.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.persistentMode == null ? 43 : this.persistentMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
