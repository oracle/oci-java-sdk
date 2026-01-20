/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details of the existing dataflow instance to be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataflowUpdateDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataflowUpdateDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "instanceId",
        "sparkVersion",
        "driverShape",
        "executorShape",
        "driverShapeConfig",
        "executorShapeConfig",
        "numExecutors",
        "privateEndpointId",
        "connections",
        "logBucketInstanceId",
        "warehouseBucketInstanceId"
    })
    public DataflowUpdateDetail(
            String instanceId,
            String sparkVersion,
            String driverShape,
            String executorShape,
            ShapeConfig driverShapeConfig,
            ShapeConfig executorShapeConfig,
            Integer numExecutors,
            String privateEndpointId,
            UpdateDataflowConnections connections,
            String logBucketInstanceId,
            String warehouseBucketInstanceId) {
        super();
        this.instanceId = instanceId;
        this.sparkVersion = sparkVersion;
        this.driverShape = driverShape;
        this.executorShape = executorShape;
        this.driverShapeConfig = driverShapeConfig;
        this.executorShapeConfig = executorShapeConfig;
        this.numExecutors = numExecutors;
        this.privateEndpointId = privateEndpointId;
        this.connections = connections;
        this.logBucketInstanceId = logBucketInstanceId;
        this.warehouseBucketInstanceId = warehouseBucketInstanceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Instance id of the existing dataflow instance to be updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
        private String instanceId;

        /**
         * Instance id of the existing dataflow instance to be updated.
         *
         * @param instanceId the value to set
         * @return this builder
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            this.__explicitlySet__.add("instanceId");
            return this;
        }
        /** The Spark version utilized to run the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
        private String sparkVersion;

        /**
         * The Spark version utilized to run the application.
         *
         * @param sparkVersion the value to set
         * @return this builder
         */
        public Builder sparkVersion(String sparkVersion) {
            this.sparkVersion = sparkVersion;
            this.__explicitlySet__.add("sparkVersion");
            return this;
        }
        /** The VM shape for the driver. Sets the driver cores and memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
        private String driverShape;

        /**
         * The VM shape for the driver. Sets the driver cores and memory.
         *
         * @param driverShape the value to set
         * @return this builder
         */
        public Builder driverShape(String driverShape) {
            this.driverShape = driverShape;
            this.__explicitlySet__.add("driverShape");
            return this;
        }
        /** The VM shape for the executors. Sets the executor cores and memory. */
        @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
        private String executorShape;

        /**
         * The VM shape for the executors. Sets the executor cores and memory.
         *
         * @param executorShape the value to set
         * @return this builder
         */
        public Builder executorShape(String executorShape) {
            this.executorShape = executorShape;
            this.__explicitlySet__.add("executorShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
        private ShapeConfig driverShapeConfig;

        public Builder driverShapeConfig(ShapeConfig driverShapeConfig) {
            this.driverShapeConfig = driverShapeConfig;
            this.__explicitlySet__.add("driverShapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
        private ShapeConfig executorShapeConfig;

        public Builder executorShapeConfig(ShapeConfig executorShapeConfig) {
            this.executorShapeConfig = executorShapeConfig;
            this.__explicitlySet__.add("executorShapeConfig");
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
        /** OCID of the already provisioned dataflow private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
        private String privateEndpointId;

        /**
         * OCID of the already provisioned dataflow private endpoint.
         *
         * @param privateEndpointId the value to set
         * @return this builder
         */
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = privateEndpointId;
            this.__explicitlySet__.add("privateEndpointId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connections")
        private UpdateDataflowConnections connections;

        public Builder connections(UpdateDataflowConnections connections) {
            this.connections = connections;
            this.__explicitlySet__.add("connections");
            return this;
        }
        /**
         * InstanceId of log bucket created as part of objectstorage service in stack. Used for
         * storing application run logs.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("logBucketInstanceId")
        private String logBucketInstanceId;

        /**
         * InstanceId of log bucket created as part of objectstorage service in stack. Used for
         * storing application run logs.
         *
         * @param logBucketInstanceId the value to set
         * @return this builder
         */
        public Builder logBucketInstanceId(String logBucketInstanceId) {
            this.logBucketInstanceId = logBucketInstanceId;
            this.__explicitlySet__.add("logBucketInstanceId");
            return this;
        }
        /**
         * InstanceId of warehouse bucket created as part of objectstorage service in stack.
         * Mandatory for SQL applications.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketInstanceId")
        private String warehouseBucketInstanceId;

        /**
         * InstanceId of warehouse bucket created as part of objectstorage service in stack.
         * Mandatory for SQL applications.
         *
         * @param warehouseBucketInstanceId the value to set
         * @return this builder
         */
        public Builder warehouseBucketInstanceId(String warehouseBucketInstanceId) {
            this.warehouseBucketInstanceId = warehouseBucketInstanceId;
            this.__explicitlySet__.add("warehouseBucketInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataflowUpdateDetail build() {
            DataflowUpdateDetail model =
                    new DataflowUpdateDetail(
                            this.instanceId,
                            this.sparkVersion,
                            this.driverShape,
                            this.executorShape,
                            this.driverShapeConfig,
                            this.executorShapeConfig,
                            this.numExecutors,
                            this.privateEndpointId,
                            this.connections,
                            this.logBucketInstanceId,
                            this.warehouseBucketInstanceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataflowUpdateDetail model) {
            if (model.wasPropertyExplicitlySet("instanceId")) {
                this.instanceId(model.getInstanceId());
            }
            if (model.wasPropertyExplicitlySet("sparkVersion")) {
                this.sparkVersion(model.getSparkVersion());
            }
            if (model.wasPropertyExplicitlySet("driverShape")) {
                this.driverShape(model.getDriverShape());
            }
            if (model.wasPropertyExplicitlySet("executorShape")) {
                this.executorShape(model.getExecutorShape());
            }
            if (model.wasPropertyExplicitlySet("driverShapeConfig")) {
                this.driverShapeConfig(model.getDriverShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("executorShapeConfig")) {
                this.executorShapeConfig(model.getExecutorShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("numExecutors")) {
                this.numExecutors(model.getNumExecutors());
            }
            if (model.wasPropertyExplicitlySet("privateEndpointId")) {
                this.privateEndpointId(model.getPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("connections")) {
                this.connections(model.getConnections());
            }
            if (model.wasPropertyExplicitlySet("logBucketInstanceId")) {
                this.logBucketInstanceId(model.getLogBucketInstanceId());
            }
            if (model.wasPropertyExplicitlySet("warehouseBucketInstanceId")) {
                this.warehouseBucketInstanceId(model.getWarehouseBucketInstanceId());
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

    /** Instance id of the existing dataflow instance to be updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceId")
    private final String instanceId;

    /**
     * Instance id of the existing dataflow instance to be updated.
     *
     * @return the value
     */
    public String getInstanceId() {
        return instanceId;
    }

    /** The Spark version utilized to run the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("sparkVersion")
    private final String sparkVersion;

    /**
     * The Spark version utilized to run the application.
     *
     * @return the value
     */
    public String getSparkVersion() {
        return sparkVersion;
    }

    /** The VM shape for the driver. Sets the driver cores and memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("driverShape")
    private final String driverShape;

    /**
     * The VM shape for the driver. Sets the driver cores and memory.
     *
     * @return the value
     */
    public String getDriverShape() {
        return driverShape;
    }

    /** The VM shape for the executors. Sets the executor cores and memory. */
    @com.fasterxml.jackson.annotation.JsonProperty("executorShape")
    private final String executorShape;

    /**
     * The VM shape for the executors. Sets the executor cores and memory.
     *
     * @return the value
     */
    public String getExecutorShape() {
        return executorShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("driverShapeConfig")
    private final ShapeConfig driverShapeConfig;

    public ShapeConfig getDriverShapeConfig() {
        return driverShapeConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("executorShapeConfig")
    private final ShapeConfig executorShapeConfig;

    public ShapeConfig getExecutorShapeConfig() {
        return executorShapeConfig;
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

    /** OCID of the already provisioned dataflow private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndpointId")
    private final String privateEndpointId;

    /**
     * OCID of the already provisioned dataflow private endpoint.
     *
     * @return the value
     */
    public String getPrivateEndpointId() {
        return privateEndpointId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connections")
    private final UpdateDataflowConnections connections;

    public UpdateDataflowConnections getConnections() {
        return connections;
    }

    /**
     * InstanceId of log bucket created as part of objectstorage service in stack. Used for storing
     * application run logs.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("logBucketInstanceId")
    private final String logBucketInstanceId;

    /**
     * InstanceId of log bucket created as part of objectstorage service in stack. Used for storing
     * application run logs.
     *
     * @return the value
     */
    public String getLogBucketInstanceId() {
        return logBucketInstanceId;
    }

    /**
     * InstanceId of warehouse bucket created as part of objectstorage service in stack. Mandatory
     * for SQL applications.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("warehouseBucketInstanceId")
    private final String warehouseBucketInstanceId;

    /**
     * InstanceId of warehouse bucket created as part of objectstorage service in stack. Mandatory
     * for SQL applications.
     *
     * @return the value
     */
    public String getWarehouseBucketInstanceId() {
        return warehouseBucketInstanceId;
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
        sb.append("DataflowUpdateDetail(");
        sb.append("super=").append(super.toString());
        sb.append("instanceId=").append(String.valueOf(this.instanceId));
        sb.append(", sparkVersion=").append(String.valueOf(this.sparkVersion));
        sb.append(", driverShape=").append(String.valueOf(this.driverShape));
        sb.append(", executorShape=").append(String.valueOf(this.executorShape));
        sb.append(", driverShapeConfig=").append(String.valueOf(this.driverShapeConfig));
        sb.append(", executorShapeConfig=").append(String.valueOf(this.executorShapeConfig));
        sb.append(", numExecutors=").append(String.valueOf(this.numExecutors));
        sb.append(", privateEndpointId=").append(String.valueOf(this.privateEndpointId));
        sb.append(", connections=").append(String.valueOf(this.connections));
        sb.append(", logBucketInstanceId=").append(String.valueOf(this.logBucketInstanceId));
        sb.append(", warehouseBucketInstanceId=")
                .append(String.valueOf(this.warehouseBucketInstanceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataflowUpdateDetail)) {
            return false;
        }

        DataflowUpdateDetail other = (DataflowUpdateDetail) o;
        return java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.sparkVersion, other.sparkVersion)
                && java.util.Objects.equals(this.driverShape, other.driverShape)
                && java.util.Objects.equals(this.executorShape, other.executorShape)
                && java.util.Objects.equals(this.driverShapeConfig, other.driverShapeConfig)
                && java.util.Objects.equals(this.executorShapeConfig, other.executorShapeConfig)
                && java.util.Objects.equals(this.numExecutors, other.numExecutors)
                && java.util.Objects.equals(this.privateEndpointId, other.privateEndpointId)
                && java.util.Objects.equals(this.connections, other.connections)
                && java.util.Objects.equals(this.logBucketInstanceId, other.logBucketInstanceId)
                && java.util.Objects.equals(
                        this.warehouseBucketInstanceId, other.warehouseBucketInstanceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.sparkVersion == null ? 43 : this.sparkVersion.hashCode());
        result = (result * PRIME) + (this.driverShape == null ? 43 : this.driverShape.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShape == null ? 43 : this.executorShape.hashCode());
        result =
                (result * PRIME)
                        + (this.driverShapeConfig == null ? 43 : this.driverShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.executorShapeConfig == null
                                ? 43
                                : this.executorShapeConfig.hashCode());
        result = (result * PRIME) + (this.numExecutors == null ? 43 : this.numExecutors.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndpointId == null ? 43 : this.privateEndpointId.hashCode());
        result = (result * PRIME) + (this.connections == null ? 43 : this.connections.hashCode());
        result =
                (result * PRIME)
                        + (this.logBucketInstanceId == null
                                ? 43
                                : this.logBucketInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.warehouseBucketInstanceId == null
                                ? 43
                                : this.warehouseBucketInstanceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
