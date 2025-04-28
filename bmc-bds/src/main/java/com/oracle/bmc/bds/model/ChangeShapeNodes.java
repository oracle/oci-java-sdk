/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Individual worker nodes groups details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChangeShapeNodes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ChangeShapeNodes
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "worker",
        "workerShapeConfig",
        "computeOnlyWorker",
        "computeOnlyWorkerShapeConfig",
        "master",
        "masterShapeConfig",
        "utility",
        "utilityShapeConfig",
        "cloudsql",
        "cloudsqlShapeConfig",
        "edge",
        "edgeShapeConfig",
        "kafkaBroker",
        "kafkaBrokerShapeConfig"
    })
    public ChangeShapeNodes(
            String worker,
            ShapeConfigDetails workerShapeConfig,
            String computeOnlyWorker,
            ShapeConfigDetails computeOnlyWorkerShapeConfig,
            String master,
            ShapeConfigDetails masterShapeConfig,
            String utility,
            ShapeConfigDetails utilityShapeConfig,
            String cloudsql,
            ShapeConfigDetails cloudsqlShapeConfig,
            String edge,
            ShapeConfigDetails edgeShapeConfig,
            String kafkaBroker,
            ShapeConfigDetails kafkaBrokerShapeConfig) {
        super();
        this.worker = worker;
        this.workerShapeConfig = workerShapeConfig;
        this.computeOnlyWorker = computeOnlyWorker;
        this.computeOnlyWorkerShapeConfig = computeOnlyWorkerShapeConfig;
        this.master = master;
        this.masterShapeConfig = masterShapeConfig;
        this.utility = utility;
        this.utilityShapeConfig = utilityShapeConfig;
        this.cloudsql = cloudsql;
        this.cloudsqlShapeConfig = cloudsqlShapeConfig;
        this.edge = edge;
        this.edgeShapeConfig = edgeShapeConfig;
        this.kafkaBroker = kafkaBroker;
        this.kafkaBrokerShapeConfig = kafkaBrokerShapeConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Change shape of worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("worker")
        private String worker;

        /**
         * Change shape of worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         *
         * @param worker the value to set
         * @return this builder
         */
        public Builder worker(String worker) {
            this.worker = worker;
            this.__explicitlySet__.add("worker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("workerShapeConfig")
        private ShapeConfigDetails workerShapeConfig;

        public Builder workerShapeConfig(ShapeConfigDetails workerShapeConfig) {
            this.workerShapeConfig = workerShapeConfig;
            this.__explicitlySet__.add("workerShapeConfig");
            return this;
        }
        /**
         * Change shape of compute only worker nodes to the desired target shape. Both VM_STANDARD
         * and E4 Flex shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorker")
        private String computeOnlyWorker;

        /**
         * Change shape of compute only worker nodes to the desired target shape. Both VM_STANDARD
         * and E4 Flex shapes are allowed here.
         *
         * @param computeOnlyWorker the value to set
         * @return this builder
         */
        public Builder computeOnlyWorker(String computeOnlyWorker) {
            this.computeOnlyWorker = computeOnlyWorker;
            this.__explicitlySet__.add("computeOnlyWorker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorkerShapeConfig")
        private ShapeConfigDetails computeOnlyWorkerShapeConfig;

        public Builder computeOnlyWorkerShapeConfig(
                ShapeConfigDetails computeOnlyWorkerShapeConfig) {
            this.computeOnlyWorkerShapeConfig = computeOnlyWorkerShapeConfig;
            this.__explicitlySet__.add("computeOnlyWorkerShapeConfig");
            return this;
        }
        /**
         * Change shape of master nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("master")
        private String master;

        /**
         * Change shape of master nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         *
         * @param master the value to set
         * @return this builder
         */
        public Builder master(String master) {
            this.master = master;
            this.__explicitlySet__.add("master");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("masterShapeConfig")
        private ShapeConfigDetails masterShapeConfig;

        public Builder masterShapeConfig(ShapeConfigDetails masterShapeConfig) {
            this.masterShapeConfig = masterShapeConfig;
            this.__explicitlySet__.add("masterShapeConfig");
            return this;
        }
        /**
         * Change shape of utility nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("utility")
        private String utility;

        /**
         * Change shape of utility nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         *
         * @param utility the value to set
         * @return this builder
         */
        public Builder utility(String utility) {
            this.utility = utility;
            this.__explicitlySet__.add("utility");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("utilityShapeConfig")
        private ShapeConfigDetails utilityShapeConfig;

        public Builder utilityShapeConfig(ShapeConfigDetails utilityShapeConfig) {
            this.utilityShapeConfig = utilityShapeConfig;
            this.__explicitlySet__.add("utilityShapeConfig");
            return this;
        }
        /**
         * Change shape of the Cloud SQL node to the desired target shape. Both VM_STANDARD and E4
         * Flex shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudsql")
        private String cloudsql;

        /**
         * Change shape of the Cloud SQL node to the desired target shape. Both VM_STANDARD and E4
         * Flex shapes are allowed here.
         *
         * @param cloudsql the value to set
         * @return this builder
         */
        public Builder cloudsql(String cloudsql) {
            this.cloudsql = cloudsql;
            this.__explicitlySet__.add("cloudsql");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudsqlShapeConfig")
        private ShapeConfigDetails cloudsqlShapeConfig;

        public Builder cloudsqlShapeConfig(ShapeConfigDetails cloudsqlShapeConfig) {
            this.cloudsqlShapeConfig = cloudsqlShapeConfig;
            this.__explicitlySet__.add("cloudsqlShapeConfig");
            return this;
        }
        /**
         * Change shape of edge nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("edge")
        private String edge;

        /**
         * Change shape of edge nodes to the desired target shape. Both VM_STANDARD and E4 Flex
         * shapes are allowed here.
         *
         * @param edge the value to set
         * @return this builder
         */
        public Builder edge(String edge) {
            this.edge = edge;
            this.__explicitlySet__.add("edge");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("edgeShapeConfig")
        private ShapeConfigDetails edgeShapeConfig;

        public Builder edgeShapeConfig(ShapeConfigDetails edgeShapeConfig) {
            this.edgeShapeConfig = edgeShapeConfig;
            this.__explicitlySet__.add("edgeShapeConfig");
            return this;
        }
        /**
         * Change shape of Kafka Broker nodes to the desired target shape. Both VM_STANDARD and E4
         * Flex shapes are allowed here.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("kafkaBroker")
        private String kafkaBroker;

        /**
         * Change shape of Kafka Broker nodes to the desired target shape. Both VM_STANDARD and E4
         * Flex shapes are allowed here.
         *
         * @param kafkaBroker the value to set
         * @return this builder
         */
        public Builder kafkaBroker(String kafkaBroker) {
            this.kafkaBroker = kafkaBroker;
            this.__explicitlySet__.add("kafkaBroker");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kafkaBrokerShapeConfig")
        private ShapeConfigDetails kafkaBrokerShapeConfig;

        public Builder kafkaBrokerShapeConfig(ShapeConfigDetails kafkaBrokerShapeConfig) {
            this.kafkaBrokerShapeConfig = kafkaBrokerShapeConfig;
            this.__explicitlySet__.add("kafkaBrokerShapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeShapeNodes build() {
            ChangeShapeNodes model =
                    new ChangeShapeNodes(
                            this.worker,
                            this.workerShapeConfig,
                            this.computeOnlyWorker,
                            this.computeOnlyWorkerShapeConfig,
                            this.master,
                            this.masterShapeConfig,
                            this.utility,
                            this.utilityShapeConfig,
                            this.cloudsql,
                            this.cloudsqlShapeConfig,
                            this.edge,
                            this.edgeShapeConfig,
                            this.kafkaBroker,
                            this.kafkaBrokerShapeConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeShapeNodes model) {
            if (model.wasPropertyExplicitlySet("worker")) {
                this.worker(model.getWorker());
            }
            if (model.wasPropertyExplicitlySet("workerShapeConfig")) {
                this.workerShapeConfig(model.getWorkerShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("computeOnlyWorker")) {
                this.computeOnlyWorker(model.getComputeOnlyWorker());
            }
            if (model.wasPropertyExplicitlySet("computeOnlyWorkerShapeConfig")) {
                this.computeOnlyWorkerShapeConfig(model.getComputeOnlyWorkerShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("master")) {
                this.master(model.getMaster());
            }
            if (model.wasPropertyExplicitlySet("masterShapeConfig")) {
                this.masterShapeConfig(model.getMasterShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("utility")) {
                this.utility(model.getUtility());
            }
            if (model.wasPropertyExplicitlySet("utilityShapeConfig")) {
                this.utilityShapeConfig(model.getUtilityShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("cloudsql")) {
                this.cloudsql(model.getCloudsql());
            }
            if (model.wasPropertyExplicitlySet("cloudsqlShapeConfig")) {
                this.cloudsqlShapeConfig(model.getCloudsqlShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("edge")) {
                this.edge(model.getEdge());
            }
            if (model.wasPropertyExplicitlySet("edgeShapeConfig")) {
                this.edgeShapeConfig(model.getEdgeShapeConfig());
            }
            if (model.wasPropertyExplicitlySet("kafkaBroker")) {
                this.kafkaBroker(model.getKafkaBroker());
            }
            if (model.wasPropertyExplicitlySet("kafkaBrokerShapeConfig")) {
                this.kafkaBrokerShapeConfig(model.getKafkaBrokerShapeConfig());
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
     * Change shape of worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes
     * are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("worker")
    private final String worker;

    /**
     * Change shape of worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes
     * are allowed here.
     *
     * @return the value
     */
    public String getWorker() {
        return worker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workerShapeConfig")
    private final ShapeConfigDetails workerShapeConfig;

    public ShapeConfigDetails getWorkerShapeConfig() {
        return workerShapeConfig;
    }

    /**
     * Change shape of compute only worker nodes to the desired target shape. Both VM_STANDARD and
     * E4 Flex shapes are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorker")
    private final String computeOnlyWorker;

    /**
     * Change shape of compute only worker nodes to the desired target shape. Both VM_STANDARD and
     * E4 Flex shapes are allowed here.
     *
     * @return the value
     */
    public String getComputeOnlyWorker() {
        return computeOnlyWorker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorkerShapeConfig")
    private final ShapeConfigDetails computeOnlyWorkerShapeConfig;

    public ShapeConfigDetails getComputeOnlyWorkerShapeConfig() {
        return computeOnlyWorkerShapeConfig;
    }

    /**
     * Change shape of master nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes
     * are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("master")
    private final String master;

    /**
     * Change shape of master nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes
     * are allowed here.
     *
     * @return the value
     */
    public String getMaster() {
        return master;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("masterShapeConfig")
    private final ShapeConfigDetails masterShapeConfig;

    public ShapeConfigDetails getMasterShapeConfig() {
        return masterShapeConfig;
    }

    /**
     * Change shape of utility nodes to the desired target shape. Both VM_STANDARD and E4 Flex
     * shapes are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("utility")
    private final String utility;

    /**
     * Change shape of utility nodes to the desired target shape. Both VM_STANDARD and E4 Flex
     * shapes are allowed here.
     *
     * @return the value
     */
    public String getUtility() {
        return utility;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("utilityShapeConfig")
    private final ShapeConfigDetails utilityShapeConfig;

    public ShapeConfigDetails getUtilityShapeConfig() {
        return utilityShapeConfig;
    }

    /**
     * Change shape of the Cloud SQL node to the desired target shape. Both VM_STANDARD and E4 Flex
     * shapes are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudsql")
    private final String cloudsql;

    /**
     * Change shape of the Cloud SQL node to the desired target shape. Both VM_STANDARD and E4 Flex
     * shapes are allowed here.
     *
     * @return the value
     */
    public String getCloudsql() {
        return cloudsql;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudsqlShapeConfig")
    private final ShapeConfigDetails cloudsqlShapeConfig;

    public ShapeConfigDetails getCloudsqlShapeConfig() {
        return cloudsqlShapeConfig;
    }

    /**
     * Change shape of edge nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes
     * are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("edge")
    private final String edge;

    /**
     * Change shape of edge nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes
     * are allowed here.
     *
     * @return the value
     */
    public String getEdge() {
        return edge;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("edgeShapeConfig")
    private final ShapeConfigDetails edgeShapeConfig;

    public ShapeConfigDetails getEdgeShapeConfig() {
        return edgeShapeConfig;
    }

    /**
     * Change shape of Kafka Broker nodes to the desired target shape. Both VM_STANDARD and E4 Flex
     * shapes are allowed here.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaBroker")
    private final String kafkaBroker;

    /**
     * Change shape of Kafka Broker nodes to the desired target shape. Both VM_STANDARD and E4 Flex
     * shapes are allowed here.
     *
     * @return the value
     */
    public String getKafkaBroker() {
        return kafkaBroker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kafkaBrokerShapeConfig")
    private final ShapeConfigDetails kafkaBrokerShapeConfig;

    public ShapeConfigDetails getKafkaBrokerShapeConfig() {
        return kafkaBrokerShapeConfig;
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
        sb.append("ChangeShapeNodes(");
        sb.append("super=").append(super.toString());
        sb.append("worker=").append(String.valueOf(this.worker));
        sb.append(", workerShapeConfig=").append(String.valueOf(this.workerShapeConfig));
        sb.append(", computeOnlyWorker=").append(String.valueOf(this.computeOnlyWorker));
        sb.append(", computeOnlyWorkerShapeConfig=")
                .append(String.valueOf(this.computeOnlyWorkerShapeConfig));
        sb.append(", master=").append(String.valueOf(this.master));
        sb.append(", masterShapeConfig=").append(String.valueOf(this.masterShapeConfig));
        sb.append(", utility=").append(String.valueOf(this.utility));
        sb.append(", utilityShapeConfig=").append(String.valueOf(this.utilityShapeConfig));
        sb.append(", cloudsql=").append(String.valueOf(this.cloudsql));
        sb.append(", cloudsqlShapeConfig=").append(String.valueOf(this.cloudsqlShapeConfig));
        sb.append(", edge=").append(String.valueOf(this.edge));
        sb.append(", edgeShapeConfig=").append(String.valueOf(this.edgeShapeConfig));
        sb.append(", kafkaBroker=").append(String.valueOf(this.kafkaBroker));
        sb.append(", kafkaBrokerShapeConfig=").append(String.valueOf(this.kafkaBrokerShapeConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeShapeNodes)) {
            return false;
        }

        ChangeShapeNodes other = (ChangeShapeNodes) o;
        return java.util.Objects.equals(this.worker, other.worker)
                && java.util.Objects.equals(this.workerShapeConfig, other.workerShapeConfig)
                && java.util.Objects.equals(this.computeOnlyWorker, other.computeOnlyWorker)
                && java.util.Objects.equals(
                        this.computeOnlyWorkerShapeConfig, other.computeOnlyWorkerShapeConfig)
                && java.util.Objects.equals(this.master, other.master)
                && java.util.Objects.equals(this.masterShapeConfig, other.masterShapeConfig)
                && java.util.Objects.equals(this.utility, other.utility)
                && java.util.Objects.equals(this.utilityShapeConfig, other.utilityShapeConfig)
                && java.util.Objects.equals(this.cloudsql, other.cloudsql)
                && java.util.Objects.equals(this.cloudsqlShapeConfig, other.cloudsqlShapeConfig)
                && java.util.Objects.equals(this.edge, other.edge)
                && java.util.Objects.equals(this.edgeShapeConfig, other.edgeShapeConfig)
                && java.util.Objects.equals(this.kafkaBroker, other.kafkaBroker)
                && java.util.Objects.equals(
                        this.kafkaBrokerShapeConfig, other.kafkaBrokerShapeConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.worker == null ? 43 : this.worker.hashCode());
        result =
                (result * PRIME)
                        + (this.workerShapeConfig == null ? 43 : this.workerShapeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.computeOnlyWorker == null ? 43 : this.computeOnlyWorker.hashCode());
        result =
                (result * PRIME)
                        + (this.computeOnlyWorkerShapeConfig == null
                                ? 43
                                : this.computeOnlyWorkerShapeConfig.hashCode());
        result = (result * PRIME) + (this.master == null ? 43 : this.master.hashCode());
        result =
                (result * PRIME)
                        + (this.masterShapeConfig == null ? 43 : this.masterShapeConfig.hashCode());
        result = (result * PRIME) + (this.utility == null ? 43 : this.utility.hashCode());
        result =
                (result * PRIME)
                        + (this.utilityShapeConfig == null
                                ? 43
                                : this.utilityShapeConfig.hashCode());
        result = (result * PRIME) + (this.cloudsql == null ? 43 : this.cloudsql.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudsqlShapeConfig == null
                                ? 43
                                : this.cloudsqlShapeConfig.hashCode());
        result = (result * PRIME) + (this.edge == null ? 43 : this.edge.hashCode());
        result =
                (result * PRIME)
                        + (this.edgeShapeConfig == null ? 43 : this.edgeShapeConfig.hashCode());
        result = (result * PRIME) + (this.kafkaBroker == null ? 43 : this.kafkaBroker.hashCode());
        result =
                (result * PRIME)
                        + (this.kafkaBrokerShapeConfig == null
                                ? 43
                                : this.kafkaBrokerShapeConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
