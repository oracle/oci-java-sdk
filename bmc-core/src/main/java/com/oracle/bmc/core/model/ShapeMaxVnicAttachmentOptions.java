/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The possible configurations for the number of VNIC attachments available to an instance of this shape. If this field is null, then all instances of this shape have a fixed maximum number of VNIC attachments equal to `maxVnicAttachments`.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapeMaxVnicAttachmentOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ShapeMaxVnicAttachmentOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The lowest maximum value of VNIC attachments.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("min")
    Integer min;

    /**
     * The highest maximum value of VNIC attachments.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("max")
    Float max;

    /**
     * The default number of VNIC attachments allowed per OCPU.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPerOcpu")
    Float defaultPerOcpu;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
