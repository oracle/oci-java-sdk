/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * A summary of a HeatWave cluster. <br>
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
        builder = HeatWaveClusterSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HeatWaveClusterSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shapeName",
        "clusterSize",
        "isLakehouseEnabled",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public HeatWaveClusterSummary(
            String shapeName,
            Integer clusterSize,
            Boolean isLakehouseEnabled,
            HeatWaveCluster.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.shapeName = shapeName;
        this.clusterSize = clusterSize;
        this.isLakehouseEnabled = isLakehouseEnabled;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape determines resources to allocate to the HeatWave nodes - CPU cores, memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        /**
         * The shape determines resources to allocate to the HeatWave nodes - CPU cores, memory.
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
         * The number of analytics-processing compute instances, of the specified shape, in the
         * HeatWave cluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        /**
         * The number of analytics-processing compute instances, of the specified shape, in the
         * HeatWave cluster.
         *
         * @param clusterSize the value to set
         * @return this builder
         */
        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            this.__explicitlySet__.add("clusterSize");
            return this;
        }
        /** Lakehouse enabled status for the HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
        private Boolean isLakehouseEnabled;

        /**
         * Lakehouse enabled status for the HeatWave cluster.
         *
         * @param isLakehouseEnabled the value to set
         * @return this builder
         */
        public Builder isLakehouseEnabled(Boolean isLakehouseEnabled) {
            this.isLakehouseEnabled = isLakehouseEnabled;
            this.__explicitlySet__.add("isLakehouseEnabled");
            return this;
        }
        /** The current state of the MySQL HeatWave cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private HeatWaveCluster.LifecycleState lifecycleState;

        /**
         * The current state of the MySQL HeatWave cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(HeatWaveCluster.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the HeatWave cluster was created, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the HeatWave cluster was created, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the HeatWave cluster was last updated, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the HeatWave cluster was last updated, as described by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HeatWaveClusterSummary build() {
            HeatWaveClusterSummary model =
                    new HeatWaveClusterSummary(
                            this.shapeName,
                            this.clusterSize,
                            this.isLakehouseEnabled,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HeatWaveClusterSummary model) {
            if (model.wasPropertyExplicitlySet("shapeName")) {
                this.shapeName(model.getShapeName());
            }
            if (model.wasPropertyExplicitlySet("clusterSize")) {
                this.clusterSize(model.getClusterSize());
            }
            if (model.wasPropertyExplicitlySet("isLakehouseEnabled")) {
                this.isLakehouseEnabled(model.getIsLakehouseEnabled());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The shape determines resources to allocate to the HeatWave nodes - CPU cores, memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    private final String shapeName;

    /**
     * The shape determines resources to allocate to the HeatWave nodes - CPU cores, memory.
     *
     * @return the value
     */
    public String getShapeName() {
        return shapeName;
    }

    /**
     * The number of analytics-processing compute instances, of the specified shape, in the HeatWave
     * cluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    private final Integer clusterSize;

    /**
     * The number of analytics-processing compute instances, of the specified shape, in the HeatWave
     * cluster.
     *
     * @return the value
     */
    public Integer getClusterSize() {
        return clusterSize;
    }

    /** Lakehouse enabled status for the HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLakehouseEnabled")
    private final Boolean isLakehouseEnabled;

    /**
     * Lakehouse enabled status for the HeatWave cluster.
     *
     * @return the value
     */
    public Boolean getIsLakehouseEnabled() {
        return isLakehouseEnabled;
    }

    /** The current state of the MySQL HeatWave cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final HeatWaveCluster.LifecycleState lifecycleState;

    /**
     * The current state of the MySQL HeatWave cluster.
     *
     * @return the value
     */
    public HeatWaveCluster.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the HeatWave cluster was created, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the HeatWave cluster was created, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the HeatWave cluster was last updated, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the HeatWave cluster was last updated, as described by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("HeatWaveClusterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("shapeName=").append(String.valueOf(this.shapeName));
        sb.append(", clusterSize=").append(String.valueOf(this.clusterSize));
        sb.append(", isLakehouseEnabled=").append(String.valueOf(this.isLakehouseEnabled));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HeatWaveClusterSummary)) {
            return false;
        }

        HeatWaveClusterSummary other = (HeatWaveClusterSummary) o;
        return java.util.Objects.equals(this.shapeName, other.shapeName)
                && java.util.Objects.equals(this.clusterSize, other.clusterSize)
                && java.util.Objects.equals(this.isLakehouseEnabled, other.isLakehouseEnabled)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
