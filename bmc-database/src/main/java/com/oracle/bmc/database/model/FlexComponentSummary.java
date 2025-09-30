/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The Flex Components for a DB system. The Flex Component determines resources to allocate to the
 * DB system - CPU cores, memory and storage for Flex shapes.
 *
 * <p>For Exadata flexible shapes, detailed specifications can be found in
 * https://docs.oracle.com/en/engineered-systems/exadata-cloud-service/ecscm/exa-service-desc.html#GUID-9E090174-5C57-4EB1-9243-B470F9F10D6B
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/Concepts/policygetstarted.htm). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FlexComponentSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FlexComponentSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "minimumCoreCount",
        "availableCoreCount",
        "availableDbStorageInGBs",
        "runtimeMinimumCoreCount",
        "shape",
        "availableMemoryInGBs",
        "availableLocalStorageInGBs",
        "computeModel",
        "hardwareType",
        "descriptionSummary"
    })
    public FlexComponentSummary(
            String name,
            Integer minimumCoreCount,
            Integer availableCoreCount,
            Integer availableDbStorageInGBs,
            Integer runtimeMinimumCoreCount,
            String shape,
            Integer availableMemoryInGBs,
            Integer availableLocalStorageInGBs,
            String computeModel,
            HardwareType hardwareType,
            String descriptionSummary) {
        super();
        this.name = name;
        this.minimumCoreCount = minimumCoreCount;
        this.availableCoreCount = availableCoreCount;
        this.availableDbStorageInGBs = availableDbStorageInGBs;
        this.runtimeMinimumCoreCount = runtimeMinimumCoreCount;
        this.shape = shape;
        this.availableMemoryInGBs = availableMemoryInGBs;
        this.availableLocalStorageInGBs = availableLocalStorageInGBs;
        this.computeModel = computeModel;
        this.hardwareType = hardwareType;
        this.descriptionSummary = descriptionSummary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the Flex Component used for the DB system. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the Flex Component used for the DB system.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The minimum number of CPU cores that can be enabled on the DB Server for this Flex
         * Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
        private Integer minimumCoreCount;

        /**
         * The minimum number of CPU cores that can be enabled on the DB Server for this Flex
         * Component.
         *
         * @param minimumCoreCount the value to set
         * @return this builder
         */
        public Builder minimumCoreCount(Integer minimumCoreCount) {
            this.minimumCoreCount = minimumCoreCount;
            this.__explicitlySet__.add("minimumCoreCount");
            return this;
        }
        /**
         * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
         * Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
        private Integer availableCoreCount;

        /**
         * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
         * Component.
         *
         * @param availableCoreCount the value to set
         * @return this builder
         */
        public Builder availableCoreCount(Integer availableCoreCount) {
            this.availableCoreCount = availableCoreCount;
            this.__explicitlySet__.add("availableCoreCount");
            return this;
        }
        /**
         * The maximum storage that can be enabled on the Storage Server for this Flex Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableDbStorageInGBs")
        private Integer availableDbStorageInGBs;

        /**
         * The maximum storage that can be enabled on the Storage Server for this Flex Component.
         *
         * @param availableDbStorageInGBs the value to set
         * @return this builder
         */
        public Builder availableDbStorageInGBs(Integer availableDbStorageInGBs) {
            this.availableDbStorageInGBs = availableDbStorageInGBs;
            this.__explicitlySet__.add("availableDbStorageInGBs");
            return this;
        }
        /** The runtime minimum number of CPU cores that can be enabled for this Flex Component. */
        @com.fasterxml.jackson.annotation.JsonProperty("runtimeMinimumCoreCount")
        private Integer runtimeMinimumCoreCount;

        /**
         * The runtime minimum number of CPU cores that can be enabled for this Flex Component.
         *
         * @param runtimeMinimumCoreCount the value to set
         * @return this builder
         */
        public Builder runtimeMinimumCoreCount(Integer runtimeMinimumCoreCount) {
            this.runtimeMinimumCoreCount = runtimeMinimumCoreCount;
            this.__explicitlySet__.add("runtimeMinimumCoreCount");
            return this;
        }
        /** The name of the DB system shape for this Flex Component. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the DB system shape for this Flex Component.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The maximum memory size that can be enabled on the DB Server for this Flex Component. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
        private Integer availableMemoryInGBs;

        /**
         * The maximum memory size that can be enabled on the DB Server for this Flex Component.
         *
         * @param availableMemoryInGBs the value to set
         * @return this builder
         */
        public Builder availableMemoryInGBs(Integer availableMemoryInGBs) {
            this.availableMemoryInGBs = availableMemoryInGBs;
            this.__explicitlySet__.add("availableMemoryInGBs");
            return this;
        }
        /**
         * The maximum local storage that can be enabled on the DB Server for this Flex Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("availableLocalStorageInGBs")
        private Integer availableLocalStorageInGBs;

        /**
         * The maximum local storage that can be enabled on the DB Server for this Flex Component.
         *
         * @param availableLocalStorageInGBs the value to set
         * @return this builder
         */
        public Builder availableLocalStorageInGBs(Integer availableLocalStorageInGBs) {
            this.availableLocalStorageInGBs = availableLocalStorageInGBs;
            this.__explicitlySet__.add("availableLocalStorageInGBs");
            return this;
        }
        /** The compute model of the DB Server for this Flex Component. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
        private String computeModel;

        /**
         * The compute model of the DB Server for this Flex Component.
         *
         * @param computeModel the value to set
         * @return this builder
         */
        public Builder computeModel(String computeModel) {
            this.computeModel = computeModel;
            this.__explicitlySet__.add("computeModel");
            return this;
        }
        /**
         * The hardware type of the DB (Compute) or Storage (Cell) Server for this Flex Component.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hardwareType")
        private HardwareType hardwareType;

        /**
         * The hardware type of the DB (Compute) or Storage (Cell) Server for this Flex Component.
         *
         * @param hardwareType the value to set
         * @return this builder
         */
        public Builder hardwareType(HardwareType hardwareType) {
            this.hardwareType = hardwareType;
            this.__explicitlySet__.add("hardwareType");
            return this;
        }
        /** The description summary for this Flex Component. */
        @com.fasterxml.jackson.annotation.JsonProperty("descriptionSummary")
        private String descriptionSummary;

        /**
         * The description summary for this Flex Component.
         *
         * @param descriptionSummary the value to set
         * @return this builder
         */
        public Builder descriptionSummary(String descriptionSummary) {
            this.descriptionSummary = descriptionSummary;
            this.__explicitlySet__.add("descriptionSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlexComponentSummary build() {
            FlexComponentSummary model =
                    new FlexComponentSummary(
                            this.name,
                            this.minimumCoreCount,
                            this.availableCoreCount,
                            this.availableDbStorageInGBs,
                            this.runtimeMinimumCoreCount,
                            this.shape,
                            this.availableMemoryInGBs,
                            this.availableLocalStorageInGBs,
                            this.computeModel,
                            this.hardwareType,
                            this.descriptionSummary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlexComponentSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("minimumCoreCount")) {
                this.minimumCoreCount(model.getMinimumCoreCount());
            }
            if (model.wasPropertyExplicitlySet("availableCoreCount")) {
                this.availableCoreCount(model.getAvailableCoreCount());
            }
            if (model.wasPropertyExplicitlySet("availableDbStorageInGBs")) {
                this.availableDbStorageInGBs(model.getAvailableDbStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("runtimeMinimumCoreCount")) {
                this.runtimeMinimumCoreCount(model.getRuntimeMinimumCoreCount());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("availableMemoryInGBs")) {
                this.availableMemoryInGBs(model.getAvailableMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableLocalStorageInGBs")) {
                this.availableLocalStorageInGBs(model.getAvailableLocalStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("computeModel")) {
                this.computeModel(model.getComputeModel());
            }
            if (model.wasPropertyExplicitlySet("hardwareType")) {
                this.hardwareType(model.getHardwareType());
            }
            if (model.wasPropertyExplicitlySet("descriptionSummary")) {
                this.descriptionSummary(model.getDescriptionSummary());
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

    /** The name of the Flex Component used for the DB system. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the Flex Component used for the DB system.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The minimum number of CPU cores that can be enabled on the DB Server for this Flex Component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumCoreCount")
    private final Integer minimumCoreCount;

    /**
     * The minimum number of CPU cores that can be enabled on the DB Server for this Flex Component.
     *
     * @return the value
     */
    public Integer getMinimumCoreCount() {
        return minimumCoreCount;
    }

    /**
     * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
     * Component.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("availableCoreCount")
    private final Integer availableCoreCount;

    /**
     * The maximum number of CPU cores that can ben enabled on the DB Server for this Flex
     * Component.
     *
     * @return the value
     */
    public Integer getAvailableCoreCount() {
        return availableCoreCount;
    }

    /** The maximum storage that can be enabled on the Storage Server for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableDbStorageInGBs")
    private final Integer availableDbStorageInGBs;

    /**
     * The maximum storage that can be enabled on the Storage Server for this Flex Component.
     *
     * @return the value
     */
    public Integer getAvailableDbStorageInGBs() {
        return availableDbStorageInGBs;
    }

    /** The runtime minimum number of CPU cores that can be enabled for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("runtimeMinimumCoreCount")
    private final Integer runtimeMinimumCoreCount;

    /**
     * The runtime minimum number of CPU cores that can be enabled for this Flex Component.
     *
     * @return the value
     */
    public Integer getRuntimeMinimumCoreCount() {
        return runtimeMinimumCoreCount;
    }

    /** The name of the DB system shape for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the DB system shape for this Flex Component.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The maximum memory size that can be enabled on the DB Server for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableMemoryInGBs")
    private final Integer availableMemoryInGBs;

    /**
     * The maximum memory size that can be enabled on the DB Server for this Flex Component.
     *
     * @return the value
     */
    public Integer getAvailableMemoryInGBs() {
        return availableMemoryInGBs;
    }

    /** The maximum local storage that can be enabled on the DB Server for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableLocalStorageInGBs")
    private final Integer availableLocalStorageInGBs;

    /**
     * The maximum local storage that can be enabled on the DB Server for this Flex Component.
     *
     * @return the value
     */
    public Integer getAvailableLocalStorageInGBs() {
        return availableLocalStorageInGBs;
    }

    /** The compute model of the DB Server for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeModel")
    private final String computeModel;

    /**
     * The compute model of the DB Server for this Flex Component.
     *
     * @return the value
     */
    public String getComputeModel() {
        return computeModel;
    }

    /** The hardware type of the DB (Compute) or Storage (Cell) Server for this Flex Component. */
    public enum HardwareType implements com.oracle.bmc.http.internal.BmcEnum {
        Compute("COMPUTE"),
        Cell("CELL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(HardwareType.class);

        private final String value;
        private static java.util.Map<String, HardwareType> map;

        static {
            map = new java.util.HashMap<>();
            for (HardwareType v : HardwareType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        HardwareType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static HardwareType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'HardwareType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The hardware type of the DB (Compute) or Storage (Cell) Server for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("hardwareType")
    private final HardwareType hardwareType;

    /**
     * The hardware type of the DB (Compute) or Storage (Cell) Server for this Flex Component.
     *
     * @return the value
     */
    public HardwareType getHardwareType() {
        return hardwareType;
    }

    /** The description summary for this Flex Component. */
    @com.fasterxml.jackson.annotation.JsonProperty("descriptionSummary")
    private final String descriptionSummary;

    /**
     * The description summary for this Flex Component.
     *
     * @return the value
     */
    public String getDescriptionSummary() {
        return descriptionSummary;
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
        sb.append("FlexComponentSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", minimumCoreCount=").append(String.valueOf(this.minimumCoreCount));
        sb.append(", availableCoreCount=").append(String.valueOf(this.availableCoreCount));
        sb.append(", availableDbStorageInGBs=")
                .append(String.valueOf(this.availableDbStorageInGBs));
        sb.append(", runtimeMinimumCoreCount=")
                .append(String.valueOf(this.runtimeMinimumCoreCount));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", availableMemoryInGBs=").append(String.valueOf(this.availableMemoryInGBs));
        sb.append(", availableLocalStorageInGBs=")
                .append(String.valueOf(this.availableLocalStorageInGBs));
        sb.append(", computeModel=").append(String.valueOf(this.computeModel));
        sb.append(", hardwareType=").append(String.valueOf(this.hardwareType));
        sb.append(", descriptionSummary=").append(String.valueOf(this.descriptionSummary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlexComponentSummary)) {
            return false;
        }

        FlexComponentSummary other = (FlexComponentSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.minimumCoreCount, other.minimumCoreCount)
                && java.util.Objects.equals(this.availableCoreCount, other.availableCoreCount)
                && java.util.Objects.equals(
                        this.availableDbStorageInGBs, other.availableDbStorageInGBs)
                && java.util.Objects.equals(
                        this.runtimeMinimumCoreCount, other.runtimeMinimumCoreCount)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.availableMemoryInGBs, other.availableMemoryInGBs)
                && java.util.Objects.equals(
                        this.availableLocalStorageInGBs, other.availableLocalStorageInGBs)
                && java.util.Objects.equals(this.computeModel, other.computeModel)
                && java.util.Objects.equals(this.hardwareType, other.hardwareType)
                && java.util.Objects.equals(this.descriptionSummary, other.descriptionSummary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumCoreCount == null ? 43 : this.minimumCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableCoreCount == null
                                ? 43
                                : this.availableCoreCount.hashCode());
        result =
                (result * PRIME)
                        + (this.availableDbStorageInGBs == null
                                ? 43
                                : this.availableDbStorageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeMinimumCoreCount == null
                                ? 43
                                : this.runtimeMinimumCoreCount.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.availableMemoryInGBs == null
                                ? 43
                                : this.availableMemoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableLocalStorageInGBs == null
                                ? 43
                                : this.availableLocalStorageInGBs.hashCode());
        result = (result * PRIME) + (this.computeModel == null ? 43 : this.computeModel.hashCode());
        result = (result * PRIME) + (this.hardwareType == null ? 43 : this.hardwareType.hashCode());
        result =
                (result * PRIME)
                        + (this.descriptionSummary == null
                                ? 43
                                : this.descriptionSummary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
