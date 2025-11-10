/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The shape used to launch the dedicated virtual machine (VM) host. <br>
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
        builder = DedicatedVmHostShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DedicatedVmHostShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "dedicatedVmHostShape",
        "capacityConfigs"
    })
    public DedicatedVmHostShapeSummary(
            String availabilityDomain,
            String dedicatedVmHostShape,
            java.util.List<CapacityConfig> capacityConfigs) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.dedicatedVmHostShape = dedicatedVmHostShape;
        this.capacityConfigs = capacityConfigs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape's availability domain. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The shape's availability domain.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * The name of the dedicated VM host shape. You can enumerate all available shapes by
         * calling {@link #listDedicatedVmHostShapes(ListDedicatedVmHostShapesRequest)
         * listDedicatedVmHostShapes}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostShape")
        private String dedicatedVmHostShape;

        /**
         * The name of the dedicated VM host shape. You can enumerate all available shapes by
         * calling {@link #listDedicatedVmHostShapes(ListDedicatedVmHostShapesRequest)
         * listDedicatedVmHostShapes}.
         *
         * @param dedicatedVmHostShape the value to set
         * @return this builder
         */
        public Builder dedicatedVmHostShape(String dedicatedVmHostShape) {
            this.dedicatedVmHostShape = dedicatedVmHostShape;
            this.__explicitlySet__.add("dedicatedVmHostShape");
            return this;
        }
        /** A list of capacity configs that are supported by this dedicated VM host shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("capacityConfigs")
        private java.util.List<CapacityConfig> capacityConfigs;

        /**
         * A list of capacity configs that are supported by this dedicated VM host shape.
         *
         * @param capacityConfigs the value to set
         * @return this builder
         */
        public Builder capacityConfigs(java.util.List<CapacityConfig> capacityConfigs) {
            this.capacityConfigs = capacityConfigs;
            this.__explicitlySet__.add("capacityConfigs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DedicatedVmHostShapeSummary build() {
            DedicatedVmHostShapeSummary model =
                    new DedicatedVmHostShapeSummary(
                            this.availabilityDomain,
                            this.dedicatedVmHostShape,
                            this.capacityConfigs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DedicatedVmHostShapeSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("dedicatedVmHostShape")) {
                this.dedicatedVmHostShape(model.getDedicatedVmHostShape());
            }
            if (model.wasPropertyExplicitlySet("capacityConfigs")) {
                this.capacityConfigs(model.getCapacityConfigs());
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

    /** The shape's availability domain. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The shape's availability domain.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * The name of the dedicated VM host shape. You can enumerate all available shapes by calling
     * {@link #listDedicatedVmHostShapes(ListDedicatedVmHostShapesRequest)
     * listDedicatedVmHostShapes}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dedicatedVmHostShape")
    private final String dedicatedVmHostShape;

    /**
     * The name of the dedicated VM host shape. You can enumerate all available shapes by calling
     * {@link #listDedicatedVmHostShapes(ListDedicatedVmHostShapesRequest)
     * listDedicatedVmHostShapes}.
     *
     * @return the value
     */
    public String getDedicatedVmHostShape() {
        return dedicatedVmHostShape;
    }

    /** A list of capacity configs that are supported by this dedicated VM host shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("capacityConfigs")
    private final java.util.List<CapacityConfig> capacityConfigs;

    /**
     * A list of capacity configs that are supported by this dedicated VM host shape.
     *
     * @return the value
     */
    public java.util.List<CapacityConfig> getCapacityConfigs() {
        return capacityConfigs;
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
        sb.append("DedicatedVmHostShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", dedicatedVmHostShape=").append(String.valueOf(this.dedicatedVmHostShape));
        sb.append(", capacityConfigs=").append(String.valueOf(this.capacityConfigs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DedicatedVmHostShapeSummary)) {
            return false;
        }

        DedicatedVmHostShapeSummary other = (DedicatedVmHostShapeSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.dedicatedVmHostShape, other.dedicatedVmHostShape)
                && java.util.Objects.equals(this.capacityConfigs, other.capacityConfigs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.dedicatedVmHostShape == null
                                ? 43
                                : this.dedicatedVmHostShape.hashCode());
        result =
                (result * PRIME)
                        + (this.capacityConfigs == null ? 43 : this.capacityConfigs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
