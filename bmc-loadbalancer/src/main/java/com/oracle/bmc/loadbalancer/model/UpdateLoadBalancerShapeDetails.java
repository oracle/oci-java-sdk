/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateLoadBalancerShapeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateLoadBalancerShapeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shapeName", "shapeDetails"})
    public UpdateLoadBalancerShapeDetails(String shapeName, ShapeDetails shapeDetails) {
        super();
        this.shapeName = shapeName;
        this.shapeDetails = shapeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The new shape name for the load balancer.
         *
         * <p>Allowed values are : * 10Mbps * 100Mbps * 400Mbps * 8000Mbps * Flexible
         *
         * <p>Example: {@code flexible}
         *
         * <p>NOTE: Fixed shapes 10Mbps, 100Mbps, 400Mbps, 8000Mbps will be deprecated after May
         * 2023. This api * will only support {@code Flexible} shape after that date.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The new shape name for the load balancer.
         *
         * <p>Allowed values are : * 10Mbps * 100Mbps * 400Mbps * 8000Mbps * Flexible
         *
         * <p>Example: {@code flexible}
         *
         * <p>NOTE: Fixed shapes 10Mbps, 100Mbps, 400Mbps, 8000Mbps will be deprecated after May
         * 2023. This api * will only support {@code Flexible} shape after that date.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /** The configuration details to update load balancer to a different profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeDetails")
        private ShapeDetails shapeDetails;

        /**
         * The configuration details to update load balancer to a different profile.
         *
         * @param shapeDetails the value to set
         * @return this builder
         */
        public Builder shapeDetails(ShapeDetails shapeDetails) {
            this.shapeDetails = shapeDetails;
            this.__explicitlySet__.add("shapeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLoadBalancerShapeDetails build() {
            UpdateLoadBalancerShapeDetails model =
                    new UpdateLoadBalancerShapeDetails(this.shapeName, this.shapeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLoadBalancerShapeDetails model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("shapeDetails")) {
                this.shapeDetails(model.getShapeDetails());
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
     * The new shape name for the load balancer.
     *
     * <p>Allowed values are : * 10Mbps * 100Mbps * 400Mbps * 8000Mbps * Flexible
     *
     * <p>Example: {@code flexible}
     *
     * <p>NOTE: Fixed shapes 10Mbps, 100Mbps, 400Mbps, 8000Mbps will be deprecated after May 2023.
     * This api * will only support {@code Flexible} shape after that date.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The new shape name for the load balancer.
     *
     * <p>Allowed values are : * 10Mbps * 100Mbps * 400Mbps * 8000Mbps * Flexible
     *
     * <p>Example: {@code flexible}
     *
     * <p>NOTE: Fixed shapes 10Mbps, 100Mbps, 400Mbps, 8000Mbps will be deprecated after May 2023.
     * This api * will only support {@code Flexible} shape after that date.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /** The configuration details to update load balancer to a different profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeDetails")
    private final ShapeDetails shapeDetails;

    /**
     * The configuration details to update load balancer to a different profile.
     *
     * @return the value
     */
    public ShapeDetails getShapeDetails() {
        return shapeDetails;
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
        sb.append("UpdateLoadBalancerShapeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", shapeDetails=").append(String.valueOf(this.shapeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLoadBalancerShapeDetails)) {
            return false;
        }

        UpdateLoadBalancerShapeDetails other = (UpdateLoadBalancerShapeDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.shapeDetails, other.shapeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.shapeDetails == null ? 43 : this.shapeDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
