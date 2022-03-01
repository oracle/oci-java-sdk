/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The standalone job infrastructure configuration with network egress settings preconfigured.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagedEgressStandaloneJobInfrastructureConfigurationDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "jobInfrastructureType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagedEgressStandaloneJobInfrastructureConfigurationDetails
        extends JobInfrastructureConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
        private Integer blockStorageSizeInGBs;

        public Builder blockStorageSizeInGBs(Integer blockStorageSizeInGBs) {
            this.blockStorageSizeInGBs = blockStorageSizeInGBs;
            this.__explicitlySet__.add("blockStorageSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedEgressStandaloneJobInfrastructureConfigurationDetails build() {
            ManagedEgressStandaloneJobInfrastructureConfigurationDetails __instance__ =
                    new ManagedEgressStandaloneJobInfrastructureConfigurationDetails(
                            shapeName, blockStorageSizeInGBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedEgressStandaloneJobInfrastructureConfigurationDetails o) {
            Builder copiedBuilder =
                    shapeName(o.getShapeName()).blockStorageSizeInGBs(o.getBlockStorageSizeInGBs());

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
    public ManagedEgressStandaloneJobInfrastructureConfigurationDetails(
            String shapeName, Integer blockStorageSizeInGBs) {
        super();
        this.shapeName = shapeName;
        this.blockStorageSizeInGBs = blockStorageSizeInGBs;
    }

    /**
     * The shape used to launch the job run instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    String shapeName;

    /**
     * The size of the block storage volume to attach to the instance running the job
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
    Integer blockStorageSizeInGBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
