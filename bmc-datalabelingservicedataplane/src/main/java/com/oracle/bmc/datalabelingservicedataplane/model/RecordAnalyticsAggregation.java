/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datalabelingservicedataplane.model;

/**
 * Aggregation entities are required by the API consistency guidelines for API Consistency Guidelines#AnalyticsAPIs.  These are used to summarize record information for a given dataset and are used to populate UI elements.  Aggregations need to have the fields that identify the exact scope that they're summarizing.  Any filters applied to the list API, have to show up in the aggregation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RecordAnalyticsAggregation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecordAnalyticsAggregation
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "count",
        "dimensions",
        "datasetId",
        "compartmentId",
        "lifecycleState"
    })
    public RecordAnalyticsAggregation(
            java.math.BigDecimal count,
            RecordAggregationDimensions dimensions,
            String datasetId,
            String compartmentId,
            Record.LifecycleState lifecycleState) {
        super();
        this.count = count;
        this.dimensions = dimensions;
        this.datasetId = datasetId;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * the count of the matching results
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private java.math.BigDecimal count;

        /**
         * the count of the matching results
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(java.math.BigDecimal count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
        private RecordAggregationDimensions dimensions;

        public Builder dimensions(RecordAggregationDimensions dimensions) {
            this.dimensions = dimensions;
            this.__explicitlySet__.add("dimensions");
            return this;
        }
        /**
         * ocid of the dataset the annotation belongs to
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
        private String datasetId;

        /**
         * ocid of the dataset the annotation belongs to
         * @param datasetId the value to set
         * @return this builder
         **/
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            this.__explicitlySet__.add("datasetId");
            return this;
        }
        /**
         * ocid of the compartment the records
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * ocid of the compartment the records
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Describes the lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private Record.LifecycleState lifecycleState;

        /**
         * Describes the lifecycle state.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(Record.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecordAnalyticsAggregation build() {
            RecordAnalyticsAggregation model =
                    new RecordAnalyticsAggregation(
                            this.count,
                            this.dimensions,
                            this.datasetId,
                            this.compartmentId,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecordAnalyticsAggregation model) {
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("dimensions")) {
                this.dimensions(model.getDimensions());
            }
            if (model.wasPropertyExplicitlySet("datasetId")) {
                this.datasetId(model.getDatasetId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * the count of the matching results
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final java.math.BigDecimal count;

    /**
     * the count of the matching results
     * @return the value
     **/
    public java.math.BigDecimal getCount() {
        return count;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dimensions")
    private final RecordAggregationDimensions dimensions;

    public RecordAggregationDimensions getDimensions() {
        return dimensions;
    }

    /**
     * ocid of the dataset the annotation belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
    private final String datasetId;

    /**
     * ocid of the dataset the annotation belongs to
     * @return the value
     **/
    public String getDatasetId() {
        return datasetId;
    }

    /**
     * ocid of the compartment the records
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * ocid of the compartment the records
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Describes the lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final Record.LifecycleState lifecycleState;

    /**
     * Describes the lifecycle state.
     * @return the value
     **/
    public Record.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("RecordAnalyticsAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("count=").append(String.valueOf(this.count));
        sb.append(", dimensions=").append(String.valueOf(this.dimensions));
        sb.append(", datasetId=").append(String.valueOf(this.datasetId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecordAnalyticsAggregation)) {
            return false;
        }

        RecordAnalyticsAggregation other = (RecordAnalyticsAggregation) o;
        return java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.dimensions, other.dimensions)
                && java.util.Objects.equals(this.datasetId, other.datasetId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result = (result * PRIME) + (this.dimensions == null ? 43 : this.dimensions.hashCode());
        result = (result * PRIME) + (this.datasetId == null ? 43 : this.datasetId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
