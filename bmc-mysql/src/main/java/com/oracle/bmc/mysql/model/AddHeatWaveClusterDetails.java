/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Details required to add a HeatWave cluster.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AddHeatWaveClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AddHeatWaveClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shapeName", "clusterSize"})
    public AddHeatWaveClusterDetails(String shapeName, Integer clusterSize) {
        super();
        this.shapeName = shapeName;
        this.clusterSize = clusterSize;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The shape determines resources to allocate to the HeatWave
         * nodes - CPU cores, memory.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape determines resources to allocate to the HeatWave
         * nodes - CPU cores, memory.
         *
         * @param shapeName the value to set
         * @return this builder
         **/
        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }
        /**
         * The number of analytics-processing nodes provisioned for the
         * HeatWave cluster.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        /**
         * The number of analytics-processing nodes provisioned for the
         * HeatWave cluster.
         *
         * @param clusterSize the value to set
         * @return this builder
         **/
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            this.__explicitlySet__.add("clusterSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddHeatWaveClusterDetails build() {
            AddHeatWaveClusterDetails model =
                    new AddHeatWaveClusterDetails(this.shapeName, this.clusterSize);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddHeatWaveClusterDetails model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("clusterSize")) {
                this.clusterSize(model.getClusterSize());
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
     * The shape determines resources to allocate to the HeatWave
     * nodes - CPU cores, memory.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape determines resources to allocate to the HeatWave
     * nodes - CPU cores, memory.
     *
     * @return the value
     **/
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The number of analytics-processing nodes provisioned for the
     * HeatWave cluster.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    private final Integer clusterSize;

    /**
     * The number of analytics-processing nodes provisioned for the
     * HeatWave cluster.
     *
     * @return the value
     **/
    public Integer getClusterSize() {
        return clusterSize;
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
        sb.append("AddHeatWaveClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", clusterSize=").append(String.valueOf(this.clusterSize));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddHeatWaveClusterDetails)) {
            return false;
        }

        AddHeatWaveClusterDetails other = (AddHeatWaveClusterDetails) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.clusterSize, other.clusterSize)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shapeName == null ? 43 : this.shapeName.hashCode());
        result = (result * PRIME) + (this.clusterSize == null ? 43 : this.clusterSize.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
