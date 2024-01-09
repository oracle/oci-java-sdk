/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details about the HeatWave cluster properties to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateHeatWaveClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateHeatWaveClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shapeName", "clusterSize", "isLakehouseEnabled"})
    public UpdateHeatWaveClusterDetails(
            String shapeName, Integer clusterSize, Boolean isLakehouseEnabled) {
        super();
        this.shapeName = shapeName;
        this.clusterSize = clusterSize;
        this.isLakehouseEnabled = isLakehouseEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A change to the shape of the nodes in the HeatWave cluster will result in the entire
         * cluster being torn down and re-created with Compute instances of the new Shape. This may
         * result in significant downtime for the analytics capability while the HeatWave cluster is
         * re-provisioned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * A change to the shape of the nodes in the HeatWave cluster will result in the entire
         * cluster being torn down and re-created with Compute instances of the new Shape. This may
         * result in significant downtime for the analytics capability while the HeatWave cluster is
         * re-provisioned.
         *
         * @param shapeName the value to set
         * @return this builder
         */
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * A change to the number of nodes in the HeatWave cluster will result in the entire cluster
         * being torn down and re-created with the new cluster of nodes. This may result in a
         * significant downtime for the analytics capability while the HeatWave cluster is
         * re-provisioned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        /**
         * A change to the number of nodes in the HeatWave cluster will result in the entire cluster
         * being torn down and re-created with the new cluster of nodes. This may result in a
         * significant downtime for the analytics capability while the HeatWave cluster is
         * re-provisioned.
         *
         * @param clusterSize the value to set
         * @return this builder
         */
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            this.__explicitlySet__.add("clusterSize");
            return this;
        }
        /** Enable/disable Lakehouse for the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
        private Boolean isLakehouseEnabled;

        /**
         * Enable/disable Lakehouse for the HeatWave cluster.
         *
         * @param isLakehouseEnabled the value to set
         * @return this builder
         */
        public Builder isLakehouseEnabled(Boolean isLakehouseEnabled) {
            this.isLakehouseEnabled = isLakehouseEnabled;
            this.__explicitlySet__.add("isLakehouseEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateHeatWaveClusterDetails build() {
            UpdateHeatWaveClusterDetails model =
                    new UpdateHeatWaveClusterDetails(
                            this.shapeName, this.clusterSize, this.isLakehouseEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateHeatWaveClusterDetails model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("clusterSize")) {
                this.clusterSize(model.getClusterSize());
            }
            if (model.wasPropertyExplicitlySet("isLakehouseEnabled")) {
                this.isLakehouseEnabled(model.getIsLakehouseEnabled());
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
     * A change to the shape of the nodes in the HeatWave cluster will result in the entire cluster
     * being torn down and re-created with Compute instances of the new Shape. This may result in
     * significant downtime for the analytics capability while the HeatWave cluster is
     * re-provisioned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * A change to the shape of the nodes in the HeatWave cluster will result in the entire cluster
     * being torn down and re-created with Compute instances of the new Shape. This may result in
     * significant downtime for the analytics capability while the HeatWave cluster is
     * re-provisioned.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * A change to the number of nodes in the HeatWave cluster will result in the entire cluster
     * being torn down and re-created with the new cluster of nodes. This may result in a
     * significant downtime for the analytics capability while the HeatWave cluster is
     * re-provisioned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    private final Integer clusterSize;

    /**
     * A change to the number of nodes in the HeatWave cluster will result in the entire cluster
     * being torn down and re-created with the new cluster of nodes. This may result in a
     * significant downtime for the analytics capability while the HeatWave cluster is
     * re-provisioned.
     *
     * @return the value
     */
    public Integer getClusterSize() {
        return clusterSize;
    }

    /** Enable/disable Lakehouse for the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
    private final Boolean isLakehouseEnabled;

    /**
     * Enable/disable Lakehouse for the HeatWave cluster.
     *
     * @return the value
     */
    public Boolean getIsLakehouseEnabled() {
        return isLakehouseEnabled;
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
        sb.append("UpdateHeatWaveClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", clusterSize=").append(String.valueOf(this.clusterSize));
        sb.append(", isLakehouseEnabled=").append(String.valueOf(this.isLakehouseEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateHeatWaveClusterDetails)) {
            return false;
        }

        UpdateHeatWaveClusterDetails other = (UpdateHeatWaveClusterDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.clusterSize, other.clusterSize)
                && java.util.Objects.equals(this.isLakehouseEnabled, other.isLakehouseEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.clusterSize == null ? 43 : this.clusterSize.hashCode());
        result =
                (result * PRIME)
                        + (this.isLakehouseEnabled == null
                                ? 43
                                : this.isLakehouseEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
