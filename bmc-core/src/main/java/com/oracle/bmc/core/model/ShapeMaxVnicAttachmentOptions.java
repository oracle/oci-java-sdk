/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * For a flexible shape, the number of VNIC attachments that are available for instances that use this shape.
 * <p>
 * If this field is null, then this shape has a fixed maximum number of VNIC attachments equal to {@code maxVnicAttachments}.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapeMaxVnicAttachmentOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShapeMaxVnicAttachmentOptions {
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
        @com.fasterxml.jackson.annotation.JsonProperty("min")
        private Integer min;

        public Builder min(Integer min) {
            this.min = min;
            this.__explicitlySet__.add("min");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("max")
        private Float max;

        public Builder max(Float max) {
            this.max = max;
            this.__explicitlySet__.add("max");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpu")
        private Float defaultPerOcpu;

        public Builder defaultPerOcpu(Float defaultPerOcpu) {
            this.defaultPerOcpu = defaultPerOcpu;
            this.__explicitlySet__.add("defaultPerOcpu");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeMaxVnicAttachmentOptions build() {
            ShapeMaxVnicAttachmentOptions __instance__ =
                    new ShapeMaxVnicAttachmentOptions(min, max, defaultPerOcpu);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeMaxVnicAttachmentOptions o) {
            Builder copiedBuilder =
                    min(o.getMin()).max(o.getMax()).defaultPerOcpu(o.getDefaultPerOcpu());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The lowest maximum value of VNIC attachments.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    private final Integer min;

    public Integer getMin() {
        return min;
    }

    /**
     * The highest maximum value of VNIC attachments.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    private final Float max;

    public Float getMax() {
        return max;
    }

    /**
     * The default number of VNIC attachments allowed per OCPU.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpu")
    private final Float defaultPerOcpu;

    public Float getDefaultPerOcpu() {
        return defaultPerOcpu;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapeMaxVnicAttachmentOptions(");
        sb.append("min=").append(String.valueOf(this.min));
        sb.append(", max=").append(String.valueOf(this.max));
        sb.append(", defaultPerOcpu=").append(String.valueOf(this.defaultPerOcpu));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
