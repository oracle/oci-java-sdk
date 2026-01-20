/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The configuration details of a Dataflow step. <br>
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
        builder = PipelineDataflowConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineDataflowConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "configuration",
        "driverShape",
        "driverShapeConfigDetails",
        "executorShape",
        "executorShapeConfigDetails",
        "numExecutors",
        "warehouseBucketUri",
        "logsBucketUri"
    })
    public PipelineDataflowConfigurationDetails(
            Object configuration,
            String driverShape,
            PipelineShapeConfigDetails driverShapeConfigDetails,
            String executorShape,
            PipelineShapeConfigDetails executorShapeConfigDetails,
            Integer numExecutors,
            String warehouseBucketUri,
            String logsBucketUri) {
        super();
        this.configuration = configuration;
        this.driverShape = driverShape;
        this.driverShapeConfigDetails = driverShapeConfigDetails;
        this.executorShape = executorShape;
        this.executorShapeConfigDetails = executorShapeConfigDetails;
        this.numExecutors = numExecutors;
        this.warehouseBucketUri = warehouseBucketUri;
        this.logsBucketUri = logsBucketUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Spark configuration passed to the running process. */
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private Object configuration;

        /**
         * The Spark configuration passed to the running process.
         *
         * @param configuration the value to set
         * @return this builder
         */
        public Builder configuration(Object configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /** The VM shape for the driver. */
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The VM shape for the driver.
         *
         * @param driverShape the value to set
         * @return this builder
         */
        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfigDetails")
        private PipelineShapeConfigDetails driverShapeConfigDetails;

        public Builder driverShapeConfigDetails(
                PipelineShapeConfigDetails driverShapeConfigDetails) {
            this.driverShapeConfigDetails = driverShapeConfigDetails;
            this.__explicitlySet__.add("driverShapeConfigDetails");
            return this;
        }
        /** The VM shape for the executors. */
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The VM shape for the executors.
         *
         * @param executorShape the value to set
         * @return this builder
         */
        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfigDetails")
        private PipelineShapeConfigDetails executorShapeConfigDetails;

        public Builder executorShapeConfigDetails(
                PipelineShapeConfigDetails executorShapeConfigDetails) {
            this.executorShapeConfigDetails = executorShapeConfigDetails;
            this.__explicitlySet__.add("executorShapeConfigDetails");
            return this;
        }
        /** The number of executor VMs requested. */
        @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
        private Integer numExecutors;

        /**
         * The number of executor VMs requested.
         *
         * @param numExecutors the value to set
         * @return this builder
         */
        public Builder numExecutors(Integer numExecutors) {
            this.numExecutors = numExecutors;
            this.__explicitlySet__.add("numExecutors");
            return this;
        }
        /**
         * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse
         * directory for BATCH SQL runs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
        private String warehouseBucketUri;

        /**
         * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse
         * directory for BATCH SQL runs.
         *
         * @param warehouseBucketUri the value to set
         * @return this builder
         */
        public Builder warehouseBucketUri(String warehouseBucketUri) {
            this.warehouseBucketUri = warehouseBucketUri;
            this.__explicitlySet__.add("warehouseBucketUri");
            return this;
        }
        /**
         * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be
         * uploaded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
        private String logsBucketUri;

        /**
         * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be
         * uploaded.
         *
         * @param logsBucketUri the value to set
         * @return this builder
         */
        public Builder logsBucketUri(String logsBucketUri) {
            this.logsBucketUri = logsBucketUri;
            this.__explicitlySet__.add("logsBucketUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineDataflowConfigurationDetails build() {
            PipelineDataflowConfigurationDetails model =
                    new PipelineDataflowConfigurationDetails(
                            this.configuration,
                            this.driverShape,
                            this.driverShapeConfigDetails,
                            this.executorShape,
                            this.executorShapeConfigDetails,
                            this.numExecutors,
                            this.warehouseBucketUri,
                            this.logsBucketUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineDataflowConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("driverShape")) {
                this.driverShape(model.getDriverShape());
            }
            if (model.wasPropertyExplicitlySet("driverShapeConfigDetails")) {
                this.driverShapeConfigDetails(model.getDriverShapeConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("executorShape")) {
                this.executorShape(model.getExecutorShape());
            }
            if (model.wasPropertyExplicitlySet("executorShapeConfigDetails")) {
                this.executorShapeConfigDetails(model.getExecutorShapeConfigDetails());
            }
            if (model.wasPropertyExplicitlySet("numExecutors")) {
                this.numExecutors(model.getNumExecutors());
            }
            if (model.wasPropertyExplicitlySet("warehouseBucketUri")) {
                this.warehouseBucketUri(model.getWarehouseBucketUri());
            }
            if (model.wasPropertyExplicitlySet("logsBucketUri")) {
                this.logsBucketUri(model.getLogsBucketUri());
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

    /** The Spark configuration passed to the running process. */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final Object configuration;

    /**
     * The Spark configuration passed to the running process.
     *
     * @return the value
     */
    public Object getConfiguration() {
        return configuration;
    }

    /** The VM shape for the driver. */
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The VM shape for the driver.
     *
     * @return the value
     */
    public String getDriverShape() {
        return driverShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfigDetails")
    private final PipelineShapeConfigDetails driverShapeConfigDetails;

    public PipelineShapeConfigDetails getDriverShapeConfigDetails() {
        return driverShapeConfigDetails;
    }

    /** The VM shape for the executors. */
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The VM shape for the executors.
     *
     * @return the value
     */
    public String getExecutorShape() {
        return executorShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfigDetails")
    private final PipelineShapeConfigDetails executorShapeConfigDetails;

    public PipelineShapeConfigDetails getExecutorShapeConfigDetails() {
        return executorShapeConfigDetails;
    }

    /** The number of executor VMs requested. */
    @com.fasterxml.jackson.annotation.JsonProperty("numExecutors")
    private final Integer numExecutors;

    /**
     * The number of executor VMs requested.
     *
     * @return the value
     */
    public Integer getNumExecutors() {
        return numExecutors;
    }

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketUri")
    private final String warehouseBucketUri;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket to be used as default warehouse directory
     * for BATCH SQL runs.
     *
     * @return the value
     */
    public String getWarehouseBucketUri() {
        return warehouseBucketUri;
    }

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logsBucketUri")
    private final String logsBucketUri;

    /**
     * An Oracle Cloud Infrastructure URI of the bucket where the Spark job logs are to be uploaded.
     *
     * @return the value
     */
    public String getLogsBucketUri() {
        return logsBucketUri;
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
        sb.append("PipelineDataflowConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("configuration=").append(String.valueOf(this.configuration));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", driverShapeConfigDetails=")
                .append(String.valueOf(this.driverShapeConfigDetails));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", executorShapeConfigDetails=")
                .append(String.valueOf(this.executorShapeConfigDetails));
        sb.append(", numExecutors=").append(String.valueOf(this.numExecutors));
        sb.append(", warehouseBucketUri=").append(String.valueOf(this.warehouseBucketUri));
        sb.append(", logsBucketUri=").append(String.valueOf(this.logsBucketUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineDataflowConfigurationDetails)) {
            return false;
        }

        PipelineDataflowConfigurationDetails other = (PipelineDataflowConfigurationDetails) o;
        return java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(
                        this.driverShapeConfigDetails, other.driverShapeConfigDetails)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(
                        this.executorShapeConfigDetails, other.executorShapeConfigDetails)
                && java.util.Objects.equals(this.numExecutors, other.numExecutors)
                && java.util.Objects.equals(this.warehouseBucketUri, other.warehouseBucketUri)
                && java.util.Objects.equals(this.logsBucketUri, other.logsBucketUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result =
                (result * PRIME)
                        + (this.driverShapeConfigDetails == null
                                ? 43
                                : this.driverShapeConfigDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShape == null ? 43 : this.executorShape.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShapeConfigDetails == null
                                ? 43
                                : this.executorShapeConfigDetails.hashCode());
        result = (result * PRIME) + (this.numExecutors == null ? 43 : this.numExecutors.hashCode());
        result =
                (result * PRIME)
                        + (this.warehouseBucketUri == null
                                ? 43
                                : this.warehouseBucketUri.hashCode());
        result =
                (result * PRIME)
                        + (this.logsBucketUri == null ? 43 : this.logsBucketUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
