/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
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
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceConfigurationInstanceSourceViaImageDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InstanceConfigurationInstanceSourceViaImageDetails
        extends InstanceConfigurationInstanceSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
        private Long bootVolumeSizeInGBs;

        public Builder bootVolumeSizeInGBs(Long bootVolumeSizeInGBs) {
            this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
            this.__explicitlySet__.add("bootVolumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationInstanceSourceViaImageDetails build() {
            InstanceConfigurationInstanceSourceViaImageDetails __instance__ =
                    new InstanceConfigurationInstanceSourceViaImageDetails(
                            bootVolumeSizeInGBs, imageId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationInstanceSourceViaImageDetails o) {
            Builder copiedBuilder =
                    bootVolumeSizeInGBs(o.getBootVolumeSizeInGBs()).imageId(o.getImageId());

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

    @Deprecated
    public InstanceConfigurationInstanceSourceViaImageDetails(
            Long bootVolumeSizeInGBs, String imageId) {
        super();
        this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
        this.imageId = imageId;
    }

    /**
     * The size of the boot volume in GBs. Minimum value is 50 GB and maximum value is 16384 GB (16TB).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
    Long bootVolumeSizeInGBs;

    /**
     * The OCID of the image used to boot the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    String imageId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
