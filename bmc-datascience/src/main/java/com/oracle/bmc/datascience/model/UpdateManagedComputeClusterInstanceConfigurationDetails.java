/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The compute target instance configuration details for managed compute cluster type compute
 * target. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateManagedComputeClusterInstanceConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateManagedComputeClusterInstanceConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceShape",
        "bootVolumeSizeInGBs",
        "instanceShapeDetails"
    })
    public UpdateManagedComputeClusterInstanceConfigurationDetails(
            String instanceShape,
            Integer bootVolumeSizeInGBs,
            ManagedComputeClusterInstanceShapeDetails instanceShapeDetails) {
        super();
        this.instanceShape = instanceShape;
        this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
        this.instanceShapeDetails = instanceShapeDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape used to launch the instances in compute target. Supported shapes can be
         * retrieved using compute target shapes api.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
        private String instanceShape;

        /**
         * The shape used to launch the instances in compute target. Supported shapes can be
         * retrieved using compute target shapes api.
         *
         * @param instanceShape the value to set
         * @return this builder
         */
        public Builder instanceShape(String instanceShape) {
            this.instanceShape = instanceShape;
            this.__explicitlySet__.add("instanceShape");
            return this;
        }
        /** The size of the boot volume to attach to the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
        private Integer bootVolumeSizeInGBs;

        /**
         * The size of the boot volume to attach to the instance.
         *
         * @param bootVolumeSizeInGBs the value to set
         * @return this builder
         */
        public Builder bootVolumeSizeInGBs(Integer bootVolumeSizeInGBs) {
            this.bootVolumeSizeInGBs = bootVolumeSizeInGBs;
            this.__explicitlySet__.add("bootVolumeSizeInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeDetails")
        private ManagedComputeClusterInstanceShapeDetails instanceShapeDetails;

        public Builder instanceShapeDetails(
                ManagedComputeClusterInstanceShapeDetails instanceShapeDetails) {
            this.instanceShapeDetails = instanceShapeDetails;
            this.__explicitlySet__.add("instanceShapeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateManagedComputeClusterInstanceConfigurationDetails build() {
            UpdateManagedComputeClusterInstanceConfigurationDetails model =
                    new UpdateManagedComputeClusterInstanceConfigurationDetails(
                            this.instanceShape,
                            this.bootVolumeSizeInGBs,
                            this.instanceShapeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateManagedComputeClusterInstanceConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("instanceShape")) {
                this.instanceShape(model.getInstanceShape());
            }
            if (model.wasPropertyExplicitlySet("bootVolumeSizeInGBs")) {
                this.bootVolumeSizeInGBs(model.getBootVolumeSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("instanceShapeDetails")) {
                this.instanceShapeDetails(model.getInstanceShapeDetails());
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
     * The shape used to launch the instances in compute target. Supported shapes can be retrieved
     * using compute target shapes api.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShape")
    private final String instanceShape;

    /**
     * The shape used to launch the instances in compute target. Supported shapes can be retrieved
     * using compute target shapes api.
     *
     * @return the value
     */
    public String getInstanceShape() {
        return instanceShape;
    }

    /** The size of the boot volume to attach to the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("bootVolumeSizeInGBs")
    private final Integer bootVolumeSizeInGBs;

    /**
     * The size of the boot volume to attach to the instance.
     *
     * @return the value
     */
    public Integer getBootVolumeSizeInGBs() {
        return bootVolumeSizeInGBs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeDetails")
    private final ManagedComputeClusterInstanceShapeDetails instanceShapeDetails;

    public ManagedComputeClusterInstanceShapeDetails getInstanceShapeDetails() {
        return instanceShapeDetails;
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
        sb.append("UpdateManagedComputeClusterInstanceConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("instanceShape=").append(String.valueOf(this.instanceShape));
        sb.append(", bootVolumeSizeInGBs=").append(String.valueOf(this.bootVolumeSizeInGBs));
        sb.append(", instanceShapeDetails=").append(String.valueOf(this.instanceShapeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateManagedComputeClusterInstanceConfigurationDetails)) {
            return false;
        }

        UpdateManagedComputeClusterInstanceConfigurationDetails other =
                (UpdateManagedComputeClusterInstanceConfigurationDetails) o;
        return java.util.Objects.equals(this.instanceShape, other.instanceShape)
                && java.util.Objects.equals(this.bootVolumeSizeInGBs, other.bootVolumeSizeInGBs)
                && java.util.Objects.equals(this.instanceShapeDetails, other.instanceShapeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceShape == null ? 43 : this.instanceShape.hashCode());
        result =
                (result * PRIME)
                        + (this.bootVolumeSizeInGBs == null
                                ? 43
                                : this.bootVolumeSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceShapeDetails == null
                                ? 43
                                : this.instanceShapeDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
