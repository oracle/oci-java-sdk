/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceSourceViaBootVolumeDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class InstanceSourceViaBootVolumeDetails extends InstanceSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
        private String bootVolumeId;

        public Builder bootVolumeId(String bootVolumeId) {
            this.bootVolumeId = bootVolumeId;
            this.__explicitlySet__.add("bootVolumeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceSourceViaBootVolumeDetails build() {
            InstanceSourceViaBootVolumeDetails __instance__ =
                    new InstanceSourceViaBootVolumeDetails(bootVolumeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceSourceViaBootVolumeDetails o) {
            Builder copiedBuilder = bootVolumeId(o.getBootVolumeId());

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

    public InstanceSourceViaBootVolumeDetails(String bootVolumeId) {
        super();
        this.bootVolumeId = bootVolumeId;
    }

    /**
     * The OCID of the boot volume used to boot the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeId")
    String bootVolumeId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
