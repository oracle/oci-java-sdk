/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of an external ASM disk group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalAsmDiskGroupSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalAsmDiskGroupSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "mountingInstanceCount",
        "dismountingInstanceCount",
        "redundancyType",
        "isSparse",
        "databases",
        "totalSizeInMBs",
        "usedSizeInMBs",
        "usedPercent"
    })
    public ExternalAsmDiskGroupSummary(
            String name,
            Integer mountingInstanceCount,
            Integer dismountingInstanceCount,
            RedundancyType redundancyType,
            Boolean isSparse,
            java.util.List<String> databases,
            Long totalSizeInMBs,
            Long usedSizeInMBs,
            Float usedPercent) {
        super();
        this.name = name;
        this.mountingInstanceCount = mountingInstanceCount;
        this.dismountingInstanceCount = dismountingInstanceCount;
        this.redundancyType = redundancyType;
        this.isSparse = isSparse;
        this.databases = databases;
        this.totalSizeInMBs = totalSizeInMBs;
        this.usedSizeInMBs = usedSizeInMBs;
        this.usedPercent = usedPercent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the ASM disk group. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the ASM disk group.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The number of ASM instances that have the disk group in mounted state. */
        @com.fasterxml.jackson.annotation.JsonProperty("mountingInstanceCount")
        private Integer mountingInstanceCount;

        /**
         * The number of ASM instances that have the disk group in mounted state.
         *
         * @param mountingInstanceCount the value to set
         * @return this builder
         */
        public Builder mountingInstanceCount(Integer mountingInstanceCount) {
            this.mountingInstanceCount = mountingInstanceCount;
            this.__explicitlySet__.add("mountingInstanceCount");
            return this;
        }
        /** The number of ASM instances that have the disk group in dismounted state. */
        @com.fasterxml.jackson.annotation.JsonProperty("dismountingInstanceCount")
        private Integer dismountingInstanceCount;

        /**
         * The number of ASM instances that have the disk group in dismounted state.
         *
         * @param dismountingInstanceCount the value to set
         * @return this builder
         */
        public Builder dismountingInstanceCount(Integer dismountingInstanceCount) {
            this.dismountingInstanceCount = dismountingInstanceCount;
            this.__explicitlySet__.add("dismountingInstanceCount");
            return this;
        }
        /** The redundancy type of the disk group. */
        @com.fasterxml.jackson.annotation.JsonProperty("redundancyType")
        private RedundancyType redundancyType;

        /**
         * The redundancy type of the disk group.
         *
         * @param redundancyType the value to set
         * @return this builder
         */
        public Builder redundancyType(RedundancyType redundancyType) {
            this.redundancyType = redundancyType;
            this.__explicitlySet__.add("redundancyType");
            return this;
        }
        /** Indicates whether the disk group is a sparse disk group or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSparse")
        private Boolean isSparse;

        /**
         * Indicates whether the disk group is a sparse disk group or not.
         *
         * @param isSparse the value to set
         * @return this builder
         */
        public Builder isSparse(Boolean isSparse) {
            this.isSparse = isSparse;
            this.__explicitlySet__.add("isSparse");
            return this;
        }
        /** The unique names of the databases using the disk group. */
        @com.fasterxml.jackson.annotation.JsonProperty("databases")
        private java.util.List<String> databases;

        /**
         * The unique names of the databases using the disk group.
         *
         * @param databases the value to set
         * @return this builder
         */
        public Builder databases(java.util.List<String> databases) {
            this.databases = databases;
            this.__explicitlySet__.add("databases");
            return this;
        }
        /** The total capacity of the disk group (in megabytes). */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInMBs")
        private Long totalSizeInMBs;

        /**
         * The total capacity of the disk group (in megabytes).
         *
         * @param totalSizeInMBs the value to set
         * @return this builder
         */
        public Builder totalSizeInMBs(Long totalSizeInMBs) {
            this.totalSizeInMBs = totalSizeInMBs;
            this.__explicitlySet__.add("totalSizeInMBs");
            return this;
        }
        /** The used capacity of the disk group (in megabytes). */
        @com.fasterxml.jackson.annotation.JsonProperty("usedSizeInMBs")
        private Long usedSizeInMBs;

        /**
         * The used capacity of the disk group (in megabytes).
         *
         * @param usedSizeInMBs the value to set
         * @return this builder
         */
        public Builder usedSizeInMBs(Long usedSizeInMBs) {
            this.usedSizeInMBs = usedSizeInMBs;
            this.__explicitlySet__.add("usedSizeInMBs");
            return this;
        }
        /** The percentage of used space in the disk group. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedPercent")
        private Float usedPercent;

        /**
         * The percentage of used space in the disk group.
         *
         * @param usedPercent the value to set
         * @return this builder
         */
        public Builder usedPercent(Float usedPercent) {
            this.usedPercent = usedPercent;
            this.__explicitlySet__.add("usedPercent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalAsmDiskGroupSummary build() {
            ExternalAsmDiskGroupSummary model =
                    new ExternalAsmDiskGroupSummary(
                            this.name,
                            this.mountingInstanceCount,
                            this.dismountingInstanceCount,
                            this.redundancyType,
                            this.isSparse,
                            this.databases,
                            this.totalSizeInMBs,
                            this.usedSizeInMBs,
                            this.usedPercent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalAsmDiskGroupSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("mountingInstanceCount")) {
                this.mountingInstanceCount(model.getMountingInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("dismountingInstanceCount")) {
                this.dismountingInstanceCount(model.getDismountingInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("redundancyType")) {
                this.redundancyType(model.getRedundancyType());
            }
            if (model.wasPropertyExplicitlySet("isSparse")) {
                this.isSparse(model.getIsSparse());
            }
            if (model.wasPropertyExplicitlySet("databases")) {
                this.databases(model.getDatabases());
            }
            if (model.wasPropertyExplicitlySet("totalSizeInMBs")) {
                this.totalSizeInMBs(model.getTotalSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("usedSizeInMBs")) {
                this.usedSizeInMBs(model.getUsedSizeInMBs());
            }
            if (model.wasPropertyExplicitlySet("usedPercent")) {
                this.usedPercent(model.getUsedPercent());
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

    /** The name of the ASM disk group. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the ASM disk group.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The number of ASM instances that have the disk group in mounted state. */
    @com.fasterxml.jackson.annotation.JsonProperty("mountingInstanceCount")
    private final Integer mountingInstanceCount;

    /**
     * The number of ASM instances that have the disk group in mounted state.
     *
     * @return the value
     */
    public Integer getMountingInstanceCount() {
        return mountingInstanceCount;
    }

    /** The number of ASM instances that have the disk group in dismounted state. */
    @com.fasterxml.jackson.annotation.JsonProperty("dismountingInstanceCount")
    private final Integer dismountingInstanceCount;

    /**
     * The number of ASM instances that have the disk group in dismounted state.
     *
     * @return the value
     */
    public Integer getDismountingInstanceCount() {
        return dismountingInstanceCount;
    }

    /** The redundancy type of the disk group. */
    public enum RedundancyType implements com.oracle.bmc.http.internal.BmcEnum {
        Extend("EXTEND"),
        Extern("EXTERN"),
        Flex("FLEX"),
        High("HIGH"),
        Normal("NORMAL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RedundancyType.class);

        private final String value;
        private static java.util.Map<String, RedundancyType> map;

        static {
            map = new java.util.HashMap<>();
            for (RedundancyType v : RedundancyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RedundancyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RedundancyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RedundancyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The redundancy type of the disk group. */
    @com.fasterxml.jackson.annotation.JsonProperty("redundancyType")
    private final RedundancyType redundancyType;

    /**
     * The redundancy type of the disk group.
     *
     * @return the value
     */
    public RedundancyType getRedundancyType() {
        return redundancyType;
    }

    /** Indicates whether the disk group is a sparse disk group or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSparse")
    private final Boolean isSparse;

    /**
     * Indicates whether the disk group is a sparse disk group or not.
     *
     * @return the value
     */
    public Boolean getIsSparse() {
        return isSparse;
    }

    /** The unique names of the databases using the disk group. */
    @com.fasterxml.jackson.annotation.JsonProperty("databases")
    private final java.util.List<String> databases;

    /**
     * The unique names of the databases using the disk group.
     *
     * @return the value
     */
    public java.util.List<String> getDatabases() {
        return databases;
    }

    /** The total capacity of the disk group (in megabytes). */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSizeInMBs")
    private final Long totalSizeInMBs;

    /**
     * The total capacity of the disk group (in megabytes).
     *
     * @return the value
     */
    public Long getTotalSizeInMBs() {
        return totalSizeInMBs;
    }

    /** The used capacity of the disk group (in megabytes). */
    @com.fasterxml.jackson.annotation.JsonProperty("usedSizeInMBs")
    private final Long usedSizeInMBs;

    /**
     * The used capacity of the disk group (in megabytes).
     *
     * @return the value
     */
    public Long getUsedSizeInMBs() {
        return usedSizeInMBs;
    }

    /** The percentage of used space in the disk group. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedPercent")
    private final Float usedPercent;

    /**
     * The percentage of used space in the disk group.
     *
     * @return the value
     */
    public Float getUsedPercent() {
        return usedPercent;
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
        sb.append("ExternalAsmDiskGroupSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", mountingInstanceCount=").append(String.valueOf(this.mountingInstanceCount));
        sb.append(", dismountingInstanceCount=")
                .append(String.valueOf(this.dismountingInstanceCount));
        sb.append(", redundancyType=").append(String.valueOf(this.redundancyType));
        sb.append(", isSparse=").append(String.valueOf(this.isSparse));
        sb.append(", databases=").append(String.valueOf(this.databases));
        sb.append(", totalSizeInMBs=").append(String.valueOf(this.totalSizeInMBs));
        sb.append(", usedSizeInMBs=").append(String.valueOf(this.usedSizeInMBs));
        sb.append(", usedPercent=").append(String.valueOf(this.usedPercent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalAsmDiskGroupSummary)) {
            return false;
        }

        ExternalAsmDiskGroupSummary other = (ExternalAsmDiskGroupSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.mountingInstanceCount, other.mountingInstanceCount)
                && java.util.Objects.equals(
                        this.dismountingInstanceCount, other.dismountingInstanceCount)
                && java.util.Objects.equals(this.redundancyType, other.redundancyType)
                && java.util.Objects.equals(this.isSparse, other.isSparse)
                && java.util.Objects.equals(this.databases, other.databases)
                && java.util.Objects.equals(this.totalSizeInMBs, other.totalSizeInMBs)
                && java.util.Objects.equals(this.usedSizeInMBs, other.usedSizeInMBs)
                && java.util.Objects.equals(this.usedPercent, other.usedPercent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.mountingInstanceCount == null
                                ? 43
                                : this.mountingInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dismountingInstanceCount == null
                                ? 43
                                : this.dismountingInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.redundancyType == null ? 43 : this.redundancyType.hashCode());
        result = (result * PRIME) + (this.isSparse == null ? 43 : this.isSparse.hashCode());
        result = (result * PRIME) + (this.databases == null ? 43 : this.databases.hashCode());
        result =
                (result * PRIME)
                        + (this.totalSizeInMBs == null ? 43 : this.totalSizeInMBs.hashCode());
        result =
                (result * PRIME)
                        + (this.usedSizeInMBs == null ? 43 : this.usedSizeInMBs.hashCode());
        result = (result * PRIME) + (this.usedPercent == null ? 43 : this.usedPercent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
