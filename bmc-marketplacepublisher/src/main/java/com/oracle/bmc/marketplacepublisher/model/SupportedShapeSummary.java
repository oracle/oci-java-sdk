/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SupportedShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SupportedShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shape", "isFlexible", "ocpuOptions", "memoryOptions"})
    public SupportedShapeSummary(
            String shape,
            Boolean isFlexible,
            ShapeOcpuOptions ocpuOptions,
            ShapeMemoryOptions memoryOptions) {
        super();
        this.shape = shape;
        this.isFlexible = isFlexible;
        this.ocpuOptions = ocpuOptions;
        this.memoryOptions = memoryOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
        private ShapeOcpuOptions ocpuOptions;

        public Builder ocpuOptions(ShapeOcpuOptions ocpuOptions) {
            this.ocpuOptions = ocpuOptions;
            this.__explicitlySet__.add("ocpuOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
        private ShapeMemoryOptions memoryOptions;

        public Builder memoryOptions(ShapeMemoryOptions memoryOptions) {
            this.memoryOptions = memoryOptions;
            this.__explicitlySet__.add("memoryOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportedShapeSummary build() {
            SupportedShapeSummary model =
                    new SupportedShapeSummary(
                            this.shape, this.isFlexible, this.ocpuOptions, this.memoryOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportedShapeSummary model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("isFlexible")) {
                this.isFlexible(model.getIsFlexible());
            }
            if (model.wasPropertyExplicitlySet("ocpuOptions")) {
                this.ocpuOptions(model.getOcpuOptions());
            }
            if (model.wasPropertyExplicitlySet("memoryOptions")) {
                this.memoryOptions(model.getMemoryOptions());
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

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
    private final ShapeOcpuOptions ocpuOptions;

    public ShapeOcpuOptions getOcpuOptions() {
        return ocpuOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
    private final ShapeMemoryOptions memoryOptions;

    public ShapeMemoryOptions getMemoryOptions() {
        return memoryOptions;
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
        sb.append("SupportedShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", isFlexible=").append(String.valueOf(this.isFlexible));
        sb.append(", ocpuOptions=").append(String.valueOf(this.ocpuOptions));
        sb.append(", memoryOptions=").append(String.valueOf(this.memoryOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportedShapeSummary)) {
            return false;
        }

        SupportedShapeSummary other = (SupportedShapeSummary) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.isFlexible, other.isFlexible)
                && java.util.Objects.equals(this.ocpuOptions, other.ocpuOptions)
                && java.util.Objects.equals(this.memoryOptions, other.memoryOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.isFlexible == null ? 43 : this.isFlexible.hashCode());
        result = (result * PRIME) + (this.ocpuOptions == null ? 43 : this.ocpuOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryOptions == null ? 43 : this.memoryOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
