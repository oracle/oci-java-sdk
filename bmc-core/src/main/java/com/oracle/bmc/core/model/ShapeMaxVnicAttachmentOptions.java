/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible shape, the number of VNIC attachments that are available for instances that use
 * this shape.
 *
 * <p>If this field is null, then this shape has a fixed maximum number of VNIC attachments equal to
 * {@code maxVnicAttachments}. <br>
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
        builder = ShapeMaxVnicAttachmentOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeMaxVnicAttachmentOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"min", "max", "defaultPerOcpu"})
    public ShapeMaxVnicAttachmentOptions(Integer min, Float max, Float defaultPerOcpu) {
        super();
        this.min = min;
        this.max = max;
        this.defaultPerOcpu = defaultPerOcpu;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The lowest maximum value of VNIC attachments. */
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        /**
         * The lowest maximum value of VNIC attachments.
         *
         * @param min the value to set
         * @return this builder
         */
        public Builder min(Integer min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }
        /** The highest maximum value of VNIC attachments. */
        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Float max;

        /**
         * The highest maximum value of VNIC attachments.
         *
         * @param max the value to set
         * @return this builder
         */
        public Builder max(Float max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }
        /** The default number of VNIC attachments allowed per OCPU. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpu")
        private Float defaultPerOcpu;

        /**
         * The default number of VNIC attachments allowed per OCPU.
         *
         * @param defaultPerOcpu the value to set
         * @return this builder
         */
        public Builder defaultPerOcpu(Float defaultPerOcpu) {
            this.defaultPerOcpu = defaultPerOcpu;
            this.__explicitlySet__.add("defaultPerOcpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeMaxVnicAttachmentOptions build() {
            ShapeMaxVnicAttachmentOptions model =
                    new ShapeMaxVnicAttachmentOptions(this.min, this.max, this.defaultPerOcpu);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeMaxVnicAttachmentOptions model) {
            if (model.wasPropertyExplicitlySet("min")) {
                this.min(model.getMin());
            }
            if (model.wasPropertyExplicitlySet("max")) {
                this.max(model.getMax());
            }
            if (model.wasPropertyExplicitlySet("defaultPerOcpu")) {
                this.defaultPerOcpu(model.getDefaultPerOcpu());
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

    /** The lowest maximum value of VNIC attachments. */
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Integer min;

    /**
     * The lowest maximum value of VNIC attachments.
     *
     * @return the value
     */
    public Integer getMin() {
        return min;
    }

    /** The highest maximum value of VNIC attachments. */
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Float max;

    /**
     * The highest maximum value of VNIC attachments.
     *
     * @return the value
     */
    public Float getMax() {
        return max;
    }

    /** The default number of VNIC attachments allowed per OCPU. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpu")
    private final Float defaultPerOcpu;

    /**
     * The default number of VNIC attachments allowed per OCPU.
     *
     * @return the value
     */
    public Float getDefaultPerOcpu() {
        return defaultPerOcpu;
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
        sb.append("ShapeMaxVnicAttachmentOptions(");
        sb.append("super=").append(super.toString());
        sb.append("min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", defaultPerOcpu=").append(String.valueOf(this.defaultPerOcpu));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeMaxVnicAttachmentOptions)) {
            return false;
        }

        ShapeMaxVnicAttachmentOptions other = (ShapeMaxVnicAttachmentOptions) o;
        return java.util.Objects.equals(this.min, other.min)
                && java.util.Objects.equals(this.max, other.max)
                && java.util.Objects.equals(this.defaultPerOcpu, other.defaultPerOcpu)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.min == null ? 43 : this.min.hashCode());
        result = (result * PRIME) + (this.max == null ? 43 : this.max.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPerOcpu == null ? 43 : this.defaultPerOcpu.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
