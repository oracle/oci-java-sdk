/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The model deployment instance configuration <br>
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
        builder = InstanceConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceConfiguration
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceShapeName",
        "modelDeploymentInstanceShapeConfigDetails",
        "subnetId",
        "privateEndpointId"
    })
    public InstanceConfiguration(
            String instanceShapeName,
            ModelDeploymentInstanceShapeConfigDetails modelDeploymentInstanceShapeConfigDetails,
            String subnetId,
            String privateEndpointId) {
        super();
        this.instanceShapeName = instanceShapeName;
        this.modelDeploymentInstanceShapeConfigDetails = modelDeploymentInstanceShapeConfigDetails;
        this.subnetId = subnetId;
        this.privateEndpointId = privateEndpointId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape used to launch the model deployment instances. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeName")
        private String instanceShapeName;

        /**
         * The shape used to launch the model deployment instances.
         *
         * @param instanceShapeName the value to set
         * @return this builder
         */
        public Builder instanceShapeName(String instanceShapeName) {
            this.instanceShapeName = instanceShapeName;
            this.__explicitlySet__.add("instanceShapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentInstanceShapeConfigDetails")
        private ModelDeploymentInstanceShapeConfigDetails modelDeploymentInstanceShapeConfigDetails;

        public Builder modelDeploymentInstanceShapeConfigDetails(
                ModelDeploymentInstanceShapeConfigDetails
                        modelDeploymentInstanceShapeConfigDetails) {
            this.modelDeploymentInstanceShapeConfigDetails =
                    modelDeploymentInstanceShapeConfigDetails;
            this.__explicitlySet__.add("modelDeploymentInstanceShapeConfigDetails");
            return this;
        }
        /**
         * A model deployment instance is provided with a VNIC for network access. This specifies
         * the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet to create a VNIC in. The subnet should be in a VCN with a NAT/SGW gateway for
         * egress.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * A model deployment instance is provided with a VNIC for network access. This specifies
         * the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet to create a VNIC in. The subnet should be in a VCN with a NAT/SGW gateway for
         * egress.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The OCID of a Data Science private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * The OCID of a Data Science private endpoint.
         *
         * @param privateEndpointId the value to set
         * @return this builder
         */
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfiguration build() {
            InstanceConfiguration model =
                    new InstanceConfiguration(
                            this.instanceShapeName,
                            this.modelDeploymentInstanceShapeConfigDetails,
                            this.subnetId,
                            this.privateEndpointId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfiguration model) {
            if (model.wasPropertyExplicitlySet("instanceShapeName")) {
                this.instanceShapeName(model.getInstanceShapeName());
            }
            if (model.wasPropertyExplicitlySet("modelDeploymentInstanceShapeConfigDetails")) {
                this.modelDeploymentInstanceShapeConfigDetails(
                        model.getModelDeploymentInstanceShapeConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
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

    /** The shape used to launch the model deployment instances. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceShapeName")
    private final String instanceShapeName;

    /**
     * The shape used to launch the model deployment instances.
     *
     * @return the value
     */
    public String getInstanceShapeName() {
        return instanceShapeName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelDeploymentInstanceShapeConfigDetails")
    private final ModelDeploymentInstanceShapeConfigDetails
            modelDeploymentInstanceShapeConfigDetails;

    public ModelDeploymentInstanceShapeConfigDetails
            getModelDeploymentInstanceShapeConfigDetails() {
        return modelDeploymentInstanceShapeConfigDetails;
    }

    /**
     * A model deployment instance is provided with a VNIC for network access. This specifies the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet
     * to create a VNIC in. The subnet should be in a VCN with a NAT/SGW gateway for egress.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * A model deployment instance is provided with a VNIC for network access. This specifies the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet
     * to create a VNIC in. The subnet should be in a VCN with a NAT/SGW gateway for egress.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The OCID of a Data Science private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * The OCID of a Data Science private endpoint.
     *
     * @return the value
     */
    public String getPrivateEndpointId() {
        return privateEndpointId;
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
        sb.append("InstanceConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("instanceShapeName=").append(String.valueOf(this.instanceShapeName));
        sb.append(", modelDeploymentInstanceShapeConfigDetails=")
                .append(String.valueOf(this.modelDeploymentInstanceShapeConfigDetails));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceConfiguration)) {
            return false;
        }

        InstanceConfiguration other = (InstanceConfiguration) o;
        return java.util.Objects.equals(this.instanceShapeName, other.instanceShapeName)
                && java.util.Objects.equals(
                        this.modelDeploymentInstanceShapeConfigDetails,
                        other.modelDeploymentInstanceShapeConfigDetails)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.instanceShapeName == null ? 43 : this.instanceShapeName.hashCode());
        result =
                (result * PRIME)
                        + (this.modelDeploymentInstanceShapeConfigDetails == null
                                ? 43
                                : this.modelDeploymentInstanceShapeConfigDetails.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
