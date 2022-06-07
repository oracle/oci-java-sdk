/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Individual worker nodes groups details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChangeShapeNodes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeShapeNodes {
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
        "cloudsql"
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
            String cloudsql) {
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
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("worker")
        private String worker;

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

        @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorker")
        private String computeOnlyWorker;

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

        @com.fasterxml.jackson.annotation.JsonProperty("master")
        private String master;

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

        @com.fasterxml.jackson.annotation.JsonProperty("utility")
        private String utility;

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

        @com.fasterxml.jackson.annotation.JsonProperty("cloudsql")
        private String cloudsql;

        public Builder cloudsql(String cloudsql) {
            this.cloudsql = cloudsql;
            this.__explicitlySet__.add("cloudsql");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeShapeNodes build() {
            ChangeShapeNodes __instance__ =
                    new ChangeShapeNodes(
                            worker,
                            workerShapeConfig,
                            computeOnlyWorker,
                            computeOnlyWorkerShapeConfig,
                            master,
                            masterShapeConfig,
                            utility,
                            utilityShapeConfig,
                            cloudsql);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeShapeNodes o) {
            Builder copiedBuilder =
                    worker(o.getWorker())
                            .workerShapeConfig(o.getWorkerShapeConfig())
                            .computeOnlyWorker(o.getComputeOnlyWorker())
                            .computeOnlyWorkerShapeConfig(o.getComputeOnlyWorkerShapeConfig())
                            .master(o.getMaster())
                            .masterShapeConfig(o.getMasterShapeConfig())
                            .utility(o.getUtility())
                            .utilityShapeConfig(o.getUtilityShapeConfig())
                            .cloudsql(o.getCloudsql());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Change shape of worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("worker")
    private final String worker;

    public String getWorker() {
        return worker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("workerShapeConfig")
    private final ShapeConfigDetails workerShapeConfig;

    public ShapeConfigDetails getWorkerShapeConfig() {
        return workerShapeConfig;
    }

    /**
     * Change shape of compute only worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorker")
    private final String computeOnlyWorker;

    public String getComputeOnlyWorker() {
        return computeOnlyWorker;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorkerShapeConfig")
    private final ShapeConfigDetails computeOnlyWorkerShapeConfig;

    public ShapeConfigDetails getComputeOnlyWorkerShapeConfig() {
        return computeOnlyWorkerShapeConfig;
    }

    /**
     * Change shape of master nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("master")
    private final String master;

    public String getMaster() {
        return master;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("masterShapeConfig")
    private final ShapeConfigDetails masterShapeConfig;

    public ShapeConfigDetails getMasterShapeConfig() {
        return masterShapeConfig;
    }

    /**
     * Change shape of utility nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("utility")
    private final String utility;

    public String getUtility() {
        return utility;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("utilityShapeConfig")
    private final ShapeConfigDetails utilityShapeConfig;

    public ShapeConfigDetails getUtilityShapeConfig() {
        return utilityShapeConfig;
    }

    /**
     * Change shape of the Cloud SQL node to the desired target shape. Only VM_STANDARD shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudsql")
    private final String cloudsql;

    public String getCloudsql() {
        return cloudsql;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeShapeNodes(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
