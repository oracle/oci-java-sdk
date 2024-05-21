/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The dataset created by the Data Labeling Service.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DataScienceLabelingDataset.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "datasetType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DataScienceLabelingDataset extends Dataset {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCID of the Data Labeling dataset.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
        private String datasetId;

        /**
         * OCID of the Data Labeling dataset.
         * @param datasetId the value to set
         * @return this builder
         **/
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            this.__explicitlySet__.add("datasetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataScienceLabelingDataset build() {
            DataScienceLabelingDataset model = new DataScienceLabelingDataset(this.datasetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataScienceLabelingDataset model) {
            if (model.wasPropertyExplicitlySet("datasetId")) {
                this.datasetId(model.getDatasetId());
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

    @Deprecated
    public DataScienceLabelingDataset(String datasetId) {
        super();
        this.datasetId = datasetId;
    }

    /**
     * OCID of the Data Labeling dataset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("datasetId")
    private final String datasetId;

    /**
     * OCID of the Data Labeling dataset.
     * @return the value
     **/
    public String getDatasetId() {
        return datasetId;
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
        sb.append("DataScienceLabelingDataset(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", datasetId=").append(String.valueOf(this.datasetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataScienceLabelingDataset)) {
            return false;
        }

        DataScienceLabelingDataset other = (DataScienceLabelingDataset) o;
        return java.util.Objects.equals(this.datasetId, other.datasetId) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.datasetId == null ? 43 : this.datasetId.hashCode());
        return result;
    }
}
