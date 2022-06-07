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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SupportedHostShapeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SupportedHostShapeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "supportedOperations",
        "shapeFamily",
        "defaultOcpuCount",
        "supportedOcpuCount",
        "supportedSddcTypes",
        "supportedVmwareSoftwareVersions",
        "description",
        "isSupportShieldedInstances"
    })
    public SupportedHostShapeSummary(
            String name,
            java.util.List<OperationTypes> supportedOperations,
            String shapeFamily,
            Float defaultOcpuCount,
            java.util.List<Float> supportedOcpuCount,
            java.util.List<SddcTypes> supportedSddcTypes,
            java.util.List<String> supportedVmwareSoftwareVersions,
            String description,
            Boolean isSupportShieldedInstances) {
        super();
        this.name = name;
        this.supportedOperations = supportedOperations;
        this.shapeFamily = shapeFamily;
        this.defaultOcpuCount = defaultOcpuCount;
        this.supportedOcpuCount = supportedOcpuCount;
        this.supportedSddcTypes = supportedSddcTypes;
        this.supportedVmwareSoftwareVersions = supportedVmwareSoftwareVersions;
        this.description = description;
        this.isSupportShieldedInstances = isSupportShieldedInstances;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("supportedVmwareSoftwareVersions")
        private java.util.List<String> supportedVmwareSoftwareVersions;

        public Builder supportedVmwareSoftwareVersions(
                java.util.List<String> supportedVmwareSoftwareVersions) {
            this.supportedVmwareSoftwareVersions = supportedVmwareSoftwareVersions;
            this.__explicitlySet__.add("supportedVmwareSoftwareVersions");
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
                            supportedVmwareSoftwareVersions,
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
                            .supportedVmwareSoftwareVersions(o.getSupportedVmwareSoftwareVersions())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of the supported compute shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    public String getName() {
        return name;
    }

    /**
     * The operations where you can use the shape. The operations can be CREATE_SDDC or CREATE_ESXI_HOST.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOperations")
    private final java.util.List<OperationTypes> supportedOperations;

    public java.util.List<OperationTypes> getSupportedOperations() {
        return supportedOperations;
    }

    /**
     * The family of the shape. ESXi hosts of one SDDC must have the same shape family.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeFamily")
    private final String shapeFamily;

    public String getShapeFamily() {
        return shapeFamily;
    }

    /**
     * The default OCPU count of the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultOcpuCount")
    private final Float defaultOcpuCount;

    public Float getDefaultOcpuCount() {
        return defaultOcpuCount;
    }

    /**
     * Support OCPU count of the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedOcpuCount")
    private final java.util.List<Float> supportedOcpuCount;

    public java.util.List<Float> getSupportedOcpuCount() {
        return supportedOcpuCount;
    }

    /**
     * The supported SDDC types for the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedSddcTypes")
    private final java.util.List<SddcTypes> supportedSddcTypes;

    public java.util.List<SddcTypes> getSupportedSddcTypes() {
        return supportedSddcTypes;
    }

    /**
     * The VMware software versions supported by the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVmwareSoftwareVersions")
    private final java.util.List<String> supportedVmwareSoftwareVersions;

    public java.util.List<String> getSupportedVmwareSoftwareVersions() {
        return supportedVmwareSoftwareVersions;
    }

    /**
     * Description of the shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * Indicates whether the shape supports shielded instances.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupportShieldedInstances")
    private final Boolean isSupportShieldedInstances;

    public Boolean getIsSupportShieldedInstances() {
        return isSupportShieldedInstances;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SupportedHostShapeSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", supportedOperations=").append(String.valueOf(this.supportedOperations));
        sb.append(", shapeFamily=").append(String.valueOf(this.shapeFamily));
        sb.append(", defaultOcpuCount=").append(String.valueOf(this.defaultOcpuCount));
        sb.append(", supportedOcpuCount=").append(String.valueOf(this.supportedOcpuCount));
        sb.append(", supportedSddcTypes=").append(String.valueOf(this.supportedSddcTypes));
        sb.append(", supportedVmwareSoftwareVersions=")
                .append(String.valueOf(this.supportedVmwareSoftwareVersions));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isSupportShieldedInstances=")
                .append(String.valueOf(this.isSupportShieldedInstances));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportedHostShapeSummary)) {
            return false;
        }

        SupportedHostShapeSummary other = (SupportedHostShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.supportedOperations, other.supportedOperations)
                && java.util.Objects.equals(this.shapeFamily, other.shapeFamily)
                && java.util.Objects.equals(this.defaultOcpuCount, other.defaultOcpuCount)
                && java.util.Objects.equals(this.supportedOcpuCount, other.supportedOcpuCount)
                && java.util.Objects.equals(this.supportedSddcTypes, other.supportedSddcTypes)
                && java.util.Objects.equals(
                        this.supportedVmwareSoftwareVersions, other.supportedVmwareSoftwareVersions)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(
                        this.isSupportShieldedInstances, other.isSupportShieldedInstances)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOperations == null
                                ? 43
                                : this.supportedOperations.hashCode());
        result = (result * PRIME) + (this.shapeFamily == null ? 43 : this.shapeFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultOcpuCount == null ? 43 : this.defaultOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedOcpuCount == null
                                ? 43
                                : this.supportedOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedSddcTypes == null
                                ? 43
                                : this.supportedSddcTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedVmwareSoftwareVersions == null
                                ? 43
                                : this.supportedVmwareSoftwareVersions.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isSupportShieldedInstances == null
                                ? 43
                                : this.isSupportShieldedInstances.hashCode());
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
