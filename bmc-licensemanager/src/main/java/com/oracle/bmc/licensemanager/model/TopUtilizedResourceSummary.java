/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * A summary of a top utlized resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TopUtilizedResourceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TopUtilizedResourceSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceId",
        "resourceName",
        "resourceCompartmentId",
        "resourceCompartmentName",
        "totalUnits",
        "unitType"
    })
    public TopUtilizedResourceSummary(
            String resourceId,
            String resourceName,
            String resourceCompartmentId,
            String resourceCompartmentName,
            Double totalUnits,
            ResourceUnit unitType) {
        super();
        this.resourceId = resourceId;
        this.resourceName = resourceName;
        this.resourceCompartmentId = resourceCompartmentId;
        this.resourceCompartmentName = resourceCompartmentName;
        this.totalUnits = totalUnits;
        this.unitType = unitType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentName")
        private String resourceCompartmentName;

        public Builder resourceCompartmentName(String resourceCompartmentName) {
            this.resourceCompartmentName = resourceCompartmentName;
            this.__explicitlySet__.add("resourceCompartmentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalUnits")
        private Double totalUnits;

        public Builder totalUnits(Double totalUnits) {
            this.totalUnits = totalUnits;
            this.__explicitlySet__.add("totalUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private ResourceUnit unitType;

        public Builder unitType(ResourceUnit unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TopUtilizedResourceSummary build() {
            TopUtilizedResourceSummary __instance__ =
                    new TopUtilizedResourceSummary(
                            resourceId,
                            resourceName,
                            resourceCompartmentId,
                            resourceCompartmentName,
                            totalUnits,
                            unitType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TopUtilizedResourceSummary o) {
            Builder copiedBuilder =
                    resourceId(o.getResourceId())
                            .resourceName(o.getResourceName())
                            .resourceCompartmentId(o.getResourceCompartmentId())
                            .resourceCompartmentName(o.getResourceCompartmentName())
                            .totalUnits(o.getTotalUnits())
                            .unitType(o.getUnitType());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    public String getResourceId() {
        return resourceId;
    }

    /**
     * Resource canonical name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    public String getResourceName() {
        return resourceName;
    }

    /**
     * The compartment [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    private final String resourceCompartmentId;

    public String getResourceCompartmentId() {
        return resourceCompartmentId;
    }

    /**
     * The display name of the compartment that contains the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentName")
    private final String resourceCompartmentName;

    public String getResourceCompartmentName() {
        return resourceCompartmentName;
    }

    /**
     * Number of license units consumed by the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalUnits")
    private final Double totalUnits;

    public Double getTotalUnits() {
        return totalUnits;
    }

    /**
     * The resource unit.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final ResourceUnit unitType;

    public ResourceUnit getUnitType() {
        return unitType;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TopUtilizedResourceSummary(");
        sb.append("resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceCompartmentId=").append(String.valueOf(this.resourceCompartmentId));
        sb.append(", resourceCompartmentName=")
                .append(String.valueOf(this.resourceCompartmentName));
        sb.append(", totalUnits=").append(String.valueOf(this.totalUnits));
        sb.append(", unitType=").append(String.valueOf(this.unitType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopUtilizedResourceSummary)) {
            return false;
        }

        TopUtilizedResourceSummary other = (TopUtilizedResourceSummary) o;
        return java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceCompartmentId, other.resourceCompartmentId)
                && java.util.Objects.equals(
                        this.resourceCompartmentName, other.resourceCompartmentName)
                && java.util.Objects.equals(this.totalUnits, other.totalUnits)
                && java.util.Objects.equals(this.unitType, other.unitType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentId == null
                                ? 43
                                : this.resourceCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentName == null
                                ? 43
                                : this.resourceCompartmentName.hashCode());
        result = (result * PRIME) + (this.totalUnits == null ? 43 : this.totalUnits.hashCode());
        result = (result * PRIME) + (this.unitType == null ? 43 : this.unitType.hashCode());
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
