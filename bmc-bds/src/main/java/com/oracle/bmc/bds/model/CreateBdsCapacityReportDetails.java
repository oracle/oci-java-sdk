/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The data to create a report of available BDS capacity. <br>
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
        builder = CreateBdsCapacityReportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateBdsCapacityReportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compartmentId", "shapeAvailabilities"})
    public CreateBdsCapacityReportDetails(
            String compartmentId,
            java.util.List<CreateCapacityReportShapeAvailabilityDetails> shapeAvailabilities) {
        super();
        this.compartmentId = compartmentId;
        this.shapeAvailabilities = shapeAvailabilities;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID for the compartment. This should always be the root compartment. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID for the compartment. This should always be the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Information about the shapes in the capacity report. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeAvailabilities")
        private java.util.List<CreateCapacityReportShapeAvailabilityDetails> shapeAvailabilities;

        /**
         * Information about the shapes in the capacity report.
         *
         * @param shapeAvailabilities the value to set
         * @return this builder
         */
        public Builder shapeAvailabilities(
                java.util.List<CreateCapacityReportShapeAvailabilityDetails> shapeAvailabilities) {
            this.shapeAvailabilities = shapeAvailabilities;
            this.__explicitlySet__.add("shapeAvailabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsCapacityReportDetails build() {
            CreateBdsCapacityReportDetails model =
                    new CreateBdsCapacityReportDetails(
                            this.compartmentId, this.shapeAvailabilities);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsCapacityReportDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("shapeAvailabilities")) {
                this.shapeAvailabilities(model.getShapeAvailabilities());
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

    /** The OCID for the compartment. This should always be the root compartment. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID for the compartment. This should always be the root compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Information about the shapes in the capacity report. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeAvailabilities")
    private final java.util.List<CreateCapacityReportShapeAvailabilityDetails> shapeAvailabilities;

    /**
     * Information about the shapes in the capacity report.
     *
     * @return the value
     */
    public java.util.List<CreateCapacityReportShapeAvailabilityDetails> getShapeAvailabilities() {
        return shapeAvailabilities;
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
        sb.append("CreateBdsCapacityReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", shapeAvailabilities=").append(String.valueOf(this.shapeAvailabilities));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBdsCapacityReportDetails)) {
            return false;
        }

        CreateBdsCapacityReportDetails other = (CreateBdsCapacityReportDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.shapeAvailabilities, other.shapeAvailabilities)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.shapeAvailabilities == null
                                ? 43
                                : this.shapeAvailabilities.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
