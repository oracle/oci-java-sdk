/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The concrete launch mutation payload for an override option.
 *
 * <p>In V1, the override payload is limited to {@code shape}, {@code shapeConfigDetails}, and
 * {@code capacityReservationId}.
 *
 * <p>Each override option must include at least one of {@code shape} or {@code
 * capacityReservationId}, so a {@code capacityReservationId}-only override is valid. {@code
 * shapeConfigDetails} may be supplied only when {@code shape} is supplied. If {@code shape} is a
 * Flex or Fungible shape, {@code shapeConfigDetails} is required.
 *
 * <p>Placement-owned and system-owned fields are not supported in this payload. Any field outside
 * this V1 payload shape is rejected. <br>
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
        builder = InstancePoolLaunchOverrideDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolLaunchOverrideDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shape", "shapeConfigDetails", "capacityReservationId"})
    public InstancePoolLaunchOverrideDetails(
            String shape,
            InstancePoolLaunchOverrideShapeConfigDetails shapeConfigDetails,
            String capacityReservationId) {
        super();
        this.shape = shape;
        this.shapeConfigDetails = shapeConfigDetails;
        this.capacityReservationId = capacityReservationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
         * other resources allocated to the instance.
         *
         * <p>You can enumerate all available shapes by calling {@link
         * #listShapes(ListShapesRequest) listShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
         * other resources allocated to the instance.
         *
         * <p>You can enumerate all available shapes by calling {@link
         * #listShapes(ListShapesRequest) listShapes}.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfigDetails")
        private InstancePoolLaunchOverrideShapeConfigDetails shapeConfigDetails;

        public Builder shapeConfigDetails(
                InstancePoolLaunchOverrideShapeConfigDetails shapeConfigDetails) {
            this.shapeConfigDetails = shapeConfigDetails;
            this.__explicitlySet__.add("shapeConfigDetails");
            return this;
        }
        /** The OCID of the compute capacity reservation to use for the override option. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
        private String capacityReservationId;

        /**
         * The OCID of the compute capacity reservation to use for the override option.
         *
         * @param capacityReservationId the value to set
         * @return this builder
         */
        public Builder capacityReservationId(String capacityReservationId) {
            this.capacityReservationId = capacityReservationId;
            this.__explicitlySet__.add("capacityReservationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolLaunchOverrideDetails build() {
            InstancePoolLaunchOverrideDetails model =
                    new InstancePoolLaunchOverrideDetails(
                            this.shape, this.shapeConfigDetails, this.capacityReservationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolLaunchOverrideDetails model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("shapeConfigDetails")) {
                this.shapeConfigDetails(model.getShapeConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("capacityReservationId")) {
                this.capacityReservationId(model.getCapacityReservationId());
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
     * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
     * other resources allocated to the instance.
     *
     * <p>You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest)
     * listShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of an instance. The shape determines the number of CPUs, amount of memory, and
     * other resources allocated to the instance.
     *
     * <p>You can enumerate all available shapes by calling {@link #listShapes(ListShapesRequest)
     * listShapes}.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfigDetails")
    private final InstancePoolLaunchOverrideShapeConfigDetails shapeConfigDetails;

    public InstancePoolLaunchOverrideShapeConfigDetails getShapeConfigDetails() {
        return shapeConfigDetails;
    }

    /** The OCID of the compute capacity reservation to use for the override option. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityReservationId")
    private final String capacityReservationId;

    /**
     * The OCID of the compute capacity reservation to use for the override option.
     *
     * @return the value
     */
    public String getCapacityReservationId() {
        return capacityReservationId;
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
        sb.append("InstancePoolLaunchOverrideDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", shapeConfigDetails=").append(String.valueOf(this.shapeConfigDetails));
        sb.append(", capacityReservationId=").append(String.valueOf(this.capacityReservationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolLaunchOverrideDetails)) {
            return false;
        }

        InstancePoolLaunchOverrideDetails other = (InstancePoolLaunchOverrideDetails) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.shapeConfigDetails, other.shapeConfigDetails)
                && java.util.Objects.equals(this.capacityReservationId, other.capacityReservationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.shapeConfigDetails == null
                                ? 43
                                : this.shapeConfigDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityReservationId == null
                                ? 43
                                : this.capacityReservationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
