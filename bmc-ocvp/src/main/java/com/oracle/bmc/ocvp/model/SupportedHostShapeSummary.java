/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A specific compute shape supported by the Oracle Cloud VMware Solution.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SupportedHostShapeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SupportedHostShapeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedOperations")
        private java.util.List<OperationTypes> supportedOperations;

        public Builder supportedOperations(java.util.List<OperationTypes> supportedOperations) {
            this.supportedOperations = supportedOperations;
            this.__explicitlySet__.add("supportedOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
        private String shapeFamily;

        public Builder shapeFamily(String shapeFamily) {
            this.shapeFamily = shapeFamily;
            this.__explicitlySet__.add("shapeFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("defaultOcpuCount")
        private Float defaultOcpuCount;

        public Builder defaultOcpuCount(Float defaultOcpuCount) {
            this.defaultOcpuCount = defaultOcpuCount;
            this.__explicitlySet__.add("defaultOcpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedOcpuCount")
        private java.util.List<Float> supportedOcpuCount;

        public Builder supportedOcpuCount(java.util.List<Float> supportedOcpuCount) {
            this.supportedOcpuCount = supportedOcpuCount;
            this.__explicitlySet__.add("supportedOcpuCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("supportedSddcTypes")
        private java.util.List<SddcTypes> supportedSddcTypes;

        public Builder supportedSddcTypes(java.util.List<SddcTypes> supportedSddcTypes) {
            this.supportedSddcTypes = supportedSddcTypes;
            this.__explicitlySet__.add("supportedSddcTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSupportShieldedInstances")
        private Boolean isSupportShieldedInstances;

        public Builder isSupportShieldedInstances(Boolean isSupportShieldedInstances) {
            this.isSupportShieldedInstances = isSupportShieldedInstances;
            this.__explicitlySet__.add("isSupportShieldedInstances");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportedHostShapeSummary build() {
            SupportedHostShapeSummary __instance__ =
                    new SupportedHostShapeSummary(
                            name,
                            supportedOperations,
                            shapeFamily,
                            defaultOcpuCount,
                            supportedOcpuCount,
                            supportedSddcTypes,
                            description,
                            isSupportShieldedInstances);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportedHostShapeSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .supportedOperations(o.getSupportedOperations())
                            .shapeFamily(o.getShapeFamily())
                            .defaultOcpuCount(o.getDefaultOcpuCount())
                            .supportedOcpuCount(o.getSupportedOcpuCount())
                            .supportedSddcTypes(o.getSupportedSddcTypes())
                            .description(o.getDescription())
                            .isSupportShieldedInstances(o.getIsSupportShieldedInstances());

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
     * The name of the supported compute shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The operations where you can use the shape. The operations can be CREATE_SDDC or CREATE_ESXI_HOST.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOperations")
    java.util.List<OperationTypes> supportedOperations;

    /**
     * The family of the shape. ESXi hosts of one SDDC must have the same shape family.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
    String shapeFamily;

    /**
     * The default OCPU count of the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultOcpuCount")
    Float defaultOcpuCount;

    /**
     * Support OCPU count of the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOcpuCount")
    java.util.List<Float> supportedOcpuCount;

    /**
     * The supported SDDC types for the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedSddcTypes")
    java.util.List<SddcTypes> supportedSddcTypes;

    /**
     * Description of the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Indicates whether the shape supports shielded instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportShieldedInstances")
    Boolean isSupportShieldedInstances;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
