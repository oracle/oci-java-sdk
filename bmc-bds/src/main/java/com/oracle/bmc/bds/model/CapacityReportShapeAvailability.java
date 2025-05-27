/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Detailed information about the availabilities of a shape in each domain. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CapacityReportShapeAvailability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CapacityReportShapeAvailability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shape", "shapeConfig", "domainLevelCapacityReports"})
    public CapacityReportShapeAvailability(
            String shape,
            ShapeConfigDetails shapeConfig,
            java.util.List<DomainTypeCapacityReport> domainLevelCapacityReports) {
        super();
        this.shape = shape;
        this.shapeConfig = shapeConfig;
        this.domainLevelCapacityReports = domainLevelCapacityReports;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape that the capacity report was requested for. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape that the capacity report was requested for.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private ShapeConfigDetails shapeConfig;

        public Builder shapeConfig(ShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }
        /** Information about the capacity in each domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainLevelCapacityReports")
        private java.util.List<DomainTypeCapacityReport> domainLevelCapacityReports;

        /**
         * Information about the capacity in each domain.
         *
         * @param domainLevelCapacityReports the value to set
         * @return this builder
         */
        public Builder domainLevelCapacityReports(
                java.util.List<DomainTypeCapacityReport> domainLevelCapacityReports) {
            this.domainLevelCapacityReports = domainLevelCapacityReports;
            this.__explicitlySet__.add("domainLevelCapacityReports");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CapacityReportShapeAvailability build() {
            CapacityReportShapeAvailability model =
                    new CapacityReportShapeAvailability(
                            this.shape, this.shapeConfig, this.domainLevelCapacityReports);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CapacityReportShapeAvailability model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("domainLevelCapacityReports")) {
                this.domainLevelCapacityReports(model.getDomainLevelCapacityReports());
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

    /** The shape that the capacity report was requested for. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape that the capacity report was requested for.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final ShapeConfigDetails shapeConfig;

    public ShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    /** Information about the capacity in each domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainLevelCapacityReports")
    private final java.util.List<DomainTypeCapacityReport> domainLevelCapacityReports;

    /**
     * Information about the capacity in each domain.
     *
     * @return the value
     */
    public java.util.List<DomainTypeCapacityReport> getDomainLevelCapacityReports() {
        return domainLevelCapacityReports;
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
        sb.append("CapacityReportShapeAvailability(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(", domainLevelCapacityReports=")
                .append(String.valueOf(this.domainLevelCapacityReports));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapacityReportShapeAvailability)) {
            return false;
        }

        CapacityReportShapeAvailability other = (CapacityReportShapeAvailability) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && java.util.Objects.equals(
                        this.domainLevelCapacityReports, other.domainLevelCapacityReports)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.domainLevelCapacityReports == null
                                ? 43
                                : this.domainLevelCapacityReports.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
