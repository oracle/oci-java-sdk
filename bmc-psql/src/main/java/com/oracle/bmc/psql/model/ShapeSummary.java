/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Summary of the database system shape. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "shape",
        "isFlexible",
        "ocpuCount",
        "memorySizeInGBs",
        "shapeOcpuOptions",
        "shapeMemoryOptions"
    })
    public ShapeSummary(
            String id,
            String shape,
            Boolean isFlexible,
            Integer ocpuCount,
            Integer memorySizeInGBs,
            ShapeOcpuOptions shapeOcpuOptions,
            ShapeMemoryOptions shapeMemoryOptions) {
        super();
        this.id = id;
        this.shape = shape;
        this.isFlexible = isFlexible;
        this.ocpuCount = ocpuCount;
        this.memorySizeInGBs = memorySizeInGBs;
        this.shapeOcpuOptions = shapeOcpuOptions;
        this.shapeMemoryOptions = shapeMemoryOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for the shape.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the Compute VM shape. Example: {@code VM.Standard.E4.Flex} */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The name of the Compute VM shape. Example: {@code VM.Standard.E4.Flex}
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Indicates if the shape is a flex shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("isFlexible")
        private Boolean isFlexible;

        /**
         * Indicates if the shape is a flex shape.
         *
         * @param isFlexible the value to set
         * @return this builder
         */
        public Builder isFlexible(Boolean isFlexible) {
            this.isFlexible = isFlexible;
            this.__explicitlySet__.add("isFlexible");
            return this;
        }
        /** The number of OCPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
        private Integer ocpuCount;

        /**
         * The number of OCPUs.
         *
         * @param ocpuCount the value to set
         * @return this builder
         */
        public Builder ocpuCount(Integer ocpuCount) {
            this.ocpuCount = ocpuCount;
            this.__explicitlySet__.add("ocpuCount");
            return this;
        }
        /** The amount of memory in gigabytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Integer memorySizeInGBs;

        /**
         * The amount of memory in gigabytes.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Integer memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeOcpuOptions")
        private ShapeOcpuOptions shapeOcpuOptions;

        public Builder shapeOcpuOptions(ShapeOcpuOptions shapeOcpuOptions) {
            this.shapeOcpuOptions = shapeOcpuOptions;
            this.__explicitlySet__.add("shapeOcpuOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeMemoryOptions")
        private ShapeMemoryOptions shapeMemoryOptions;

        public Builder shapeMemoryOptions(ShapeMemoryOptions shapeMemoryOptions) {
            this.shapeMemoryOptions = shapeMemoryOptions;
            this.__explicitlySet__.add("shapeMemoryOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeSummary build() {
            ShapeSummary model =
                    new ShapeSummary(
                            this.id,
                            this.shape,
                            this.isFlexible,
                            this.ocpuCount,
                            this.memorySizeInGBs,
                            this.shapeOcpuOptions,
                            this.shapeMemoryOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("isFlexible")) {
                this.isFlexible(model.getIsFlexible());
            }
            if (model.wasPropertyExplicitlySet("ocpuCount")) {
                this.ocpuCount(model.getOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("shapeOcpuOptions")) {
                this.shapeOcpuOptions(model.getShapeOcpuOptions());
            }
            if (model.wasPropertyExplicitlySet("shapeMemoryOptions")) {
                this.shapeMemoryOptions(model.getShapeMemoryOptions());
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

    /** A unique identifier for the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for the shape.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the Compute VM shape. Example: {@code VM.Standard.E4.Flex} */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The name of the Compute VM shape. Example: {@code VM.Standard.E4.Flex}
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** Indicates if the shape is a flex shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("isFlexible")
    private final Boolean isFlexible;

    /**
     * Indicates if the shape is a flex shape.
     *
     * @return the value
     */
    public Boolean getIsFlexible() {
        return isFlexible;
    }

    /** The number of OCPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuCount")
    private final Integer ocpuCount;

    /**
     * The number of OCPUs.
     *
     * @return the value
     */
    public Integer getOcpuCount() {
        return ocpuCount;
    }

    /** The amount of memory in gigabytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Integer memorySizeInGBs;

    /**
     * The amount of memory in gigabytes.
     *
     * @return the value
     */
    public Integer getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeOcpuOptions")
    private final ShapeOcpuOptions shapeOcpuOptions;

    public ShapeOcpuOptions getShapeOcpuOptions() {
        return shapeOcpuOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeMemoryOptions")
    private final ShapeMemoryOptions shapeMemoryOptions;

    public ShapeMemoryOptions getShapeMemoryOptions() {
        return shapeMemoryOptions;
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
        sb.append("ShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", isFlexible=").append(String.valueOf(this.isFlexible));
        sb.append(", ocpuCount=").append(String.valueOf(this.ocpuCount));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", shapeOcpuOptions=").append(String.valueOf(this.shapeOcpuOptions));
        sb.append(", shapeMemoryOptions=").append(String.valueOf(this.shapeMemoryOptions));
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
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.isFlexible, other.isFlexible)
                && java.util.Objects.equals(this.ocpuCount, other.ocpuCount)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.shapeOcpuOptions, other.shapeOcpuOptions)
                && java.util.Objects.equals(this.shapeMemoryOptions, other.shapeMemoryOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.isFlexible == null ? 43 : this.isFlexible.hashCode());
        result = (result * PRIME) + (this.ocpuCount == null ? 43 : this.ocpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.shapeOcpuOptions == null ? 43 : this.shapeOcpuOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.shapeMemoryOptions == null
                                ? 43
                                : this.shapeMemoryOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
