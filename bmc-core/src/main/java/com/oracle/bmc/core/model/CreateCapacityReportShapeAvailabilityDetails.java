/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Information about the shapes in a capacity report. <br>
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
        builder = CreateCapacityReportShapeAvailabilityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCapacityReportShapeAvailabilityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"faultDomain", "instanceShape", "instanceShapeConfig"})
    public CreateCapacityReportShapeAvailabilityDetails(
            String faultDomain,
            String instanceShape,
            CapacityReportInstanceShapeConfig instanceShapeConfig) {
        super();
        this.faultDomain = faultDomain;
        this.instanceShape = instanceShape;
        this.instanceShapeConfig = instanceShapeConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The fault domain for the capacity report.
         *
         * <p>If you do not specify a fault domain, the capacity report includes information about
         * all fault domains.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
        private String faultDomain;

        /**
         * The fault domain for the capacity report.
         *
         * <p>If you do not specify a fault domain, the capacity report includes information about
         * all fault domains.
         *
         * @param faultDomain the value to set
         * @return this builder
         */
        public Builder faultDomain(String faultDomain) {
            this.faultDomain = faultDomain;
            this.__explicitlySet__.add("faultDomain");
            return this;
        }
        /**
         * The shape that you want to request a capacity report for. You can enumerate all available
         * shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

        /**
         * The shape that you want to request a capacity report for. You can enumerate all available
         * shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
         *
         * @param instanceShape the value to set
         * @return this builder
         */
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = instanceShape;
            this.__explicitlySet__.add("instanceShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
        private CapacityReportInstanceShapeConfig instanceShapeConfig;

        public Builder instanceShapeConfig(CapacityReportInstanceShapeConfig instanceShapeConfig) {
            this.instanceShapeConfig = instanceShapeConfig;
            this.__explicitlySet__.add("instanceShapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCapacityReportShapeAvailabilityDetails build() {
            CreateCapacityReportShapeAvailabilityDetails model =
                    new CreateCapacityReportShapeAvailabilityDetails(
                            this.faultDomain, this.instanceShape, this.instanceShapeConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCapacityReportShapeAvailabilityDetails model) {
            if (model.wasPropertyExplicitlySet("faultDomain")) {
                this.faultDomain(model.getFaultDomain());
            }
            if (model.wasPropertyExplicitlySet("instanceShape")) {
                this.instanceShape(model.getInstanceShape());
            }
            if (model.wasPropertyExplicitlySet("instanceShapeConfig")) {
                this.instanceShapeConfig(model.getInstanceShapeConfig());
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

    /**
     * The fault domain for the capacity report.
     *
     * <p>If you do not specify a fault domain, the capacity report includes information about all
     * fault domains.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("faultDomain")
    private final String faultDomain;

    /**
     * The fault domain for the capacity report.
     *
     * <p>If you do not specify a fault domain, the capacity report includes information about all
     * fault domains.
     *
     * @return the value
     */
    public String getFaultDomain() {
        return faultDomain;
    }

    /**
     * The shape that you want to request a capacity report for. You can enumerate all available
     * shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    /**
     * The shape that you want to request a capacity report for. You can enumerate all available
     * shapes by calling {@link #listShapes(ListShapesRequest) listShapes}.
     *
     * @return the value
     */
    public String getInstanceShape() {
        return instanceShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeConfig")
    private final CapacityReportInstanceShapeConfig instanceShapeConfig;

    public CapacityReportInstanceShapeConfig getInstanceShapeConfig() {
        return instanceShapeConfig;
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
        sb.append("CreateCapacityReportShapeAvailabilityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("faultDomain=").append(String.valueOf(this.faultDomain));
        sb.append(", instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", instanceShapeConfig=").append(String.valueOf(this.instanceShapeConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCapacityReportShapeAvailabilityDetails)) {
            return false;
        }

        CreateCapacityReportShapeAvailabilityDetails other =
                (CreateCapacityReportShapeAvailabilityDetails) o;
        return java.util.Objects.equals(this.faultDomain, other.faultDomain)
                && java.util.Objects.equals(this.instanceShape, other.instanceShape)
                && java.util.Objects.equals(this.instanceShapeConfig, other.instanceShapeConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.faultDomain == null ? 43 : this.faultDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShape == null ? 43 : this.instanceShape.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShapeConfig == null
                                ? 43
                                : this.instanceShapeConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
