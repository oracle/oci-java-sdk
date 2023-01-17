/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Details for the notebook session configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NotebookSessionConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NotebookSessionConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shape",
        "blockStorageSizeInGBs",
        "subnetId",
        "notebookSessionShapeConfigDetails"
    })
    public NotebookSessionConfigurationDetails(
            String shape,
            Integer blockStorageSizeInGBs,
            String subnetId,
            NotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails) {
        super();
        this.shape = shape;
        this.blockStorageSizeInGBs = blockStorageSizeInGBs;
        this.subnetId = subnetId;
        this.notebookSessionShapeConfigDetails = notebookSessionShapeConfigDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape used to launch the notebook session compute instance.  The list of available shapes in a given compartment can be retrieved using the {@code ListNotebookSessionShapes} endpoint.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape used to launch the notebook session compute instance.  The list of available shapes in a given compartment can be retrieved using the {@code ListNotebookSessionShapes} endpoint.
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * A notebook session instance is provided with a block storage volume. This specifies the size of the volume in GBs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
        private Integer blockStorageSizeInGBs;

        /**
         * A notebook session instance is provided with a block storage volume. This specifies the size of the volume in GBs.
         *
         * @param blockStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder blockStorageSizeInGBs(Integer blockStorageSizeInGBs) {
            this.blockStorageSizeInGBs = blockStorageSizeInGBs;
            this.__explicitlySet__.add("blockStorageSizeInGBs");
            return this;
        }
        /**
         * A notebook session instance is provided with a VNIC for network access.  This specifies the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create a VNIC in.  The subnet should be in a VCN with a NAT gateway for egress to the internet.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * A notebook session instance is provided with a VNIC for network access.  This specifies the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create a VNIC in.  The subnet should be in a VCN with a NAT gateway for egress to the internet.
         *
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionShapeConfigDetails")
        private NotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails;

        public Builder notebookSessionShapeConfigDetails(
                NotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails) {
            this.notebookSessionShapeConfigDetails = notebookSessionShapeConfigDetails;
            this.__explicitlySet__.add("notebookSessionShapeConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NotebookSessionConfigurationDetails build() {
            NotebookSessionConfigurationDetails model =
                    new NotebookSessionConfigurationDetails(
                            this.shape,
                            this.blockStorageSizeInGBs,
                            this.subnetId,
                            this.notebookSessionShapeConfigDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NotebookSessionConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("blockStorageSizeInGBs")) {
                this.blockStorageSizeInGBs(model.getBlockStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("notebookSessionShapeConfigDetails")) {
                this.notebookSessionShapeConfigDetails(
                        model.getNotebookSessionShapeConfigDetails());
            }
            return this;
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
     * The shape used to launch the notebook session compute instance.  The list of available shapes in a given compartment can be retrieved using the {@code ListNotebookSessionShapes} endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape used to launch the notebook session compute instance.  The list of available shapes in a given compartment can be retrieved using the {@code ListNotebookSessionShapes} endpoint.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    /**
     * A notebook session instance is provided with a block storage volume. This specifies the size of the volume in GBs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockStorageSizeInGBs")
    private final Integer blockStorageSizeInGBs;

    /**
     * A notebook session instance is provided with a block storage volume. This specifies the size of the volume in GBs.
     *
     * @return the value
     **/
    public Integer getBlockStorageSizeInGBs() {
        return blockStorageSizeInGBs;
    }

    /**
     * A notebook session instance is provided with a VNIC for network access.  This specifies the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create a VNIC in.  The subnet should be in a VCN with a NAT gateway for egress to the internet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * A notebook session instance is provided with a VNIC for network access.  This specifies the [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subnet to create a VNIC in.  The subnet should be in a VCN with a NAT gateway for egress to the internet.
     *
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("notebookSessionShapeConfigDetails")
    private final NotebookSessionShapeConfigDetails notebookSessionShapeConfigDetails;

    public NotebookSessionShapeConfigDetails getNotebookSessionShapeConfigDetails() {
        return notebookSessionShapeConfigDetails;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NotebookSessionConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", blockStorageSizeInGBs=").append(String.valueOf(this.blockStorageSizeInGBs));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", notebookSessionShapeConfigDetails=")
                .append(String.valueOf(this.notebookSessionShapeConfigDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NotebookSessionConfigurationDetails)) {
            return false;
        }

        NotebookSessionConfigurationDetails other = (NotebookSessionConfigurationDetails) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.blockStorageSizeInGBs, other.blockStorageSizeInGBs)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.notebookSessionShapeConfigDetails,
                        other.notebookSessionShapeConfigDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.blockStorageSizeInGBs == null
                                ? 43
                                : this.blockStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.notebookSessionShapeConfigDetails == null
                                ? 43
                                : this.notebookSessionShapeConfigDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
