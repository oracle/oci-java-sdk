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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ChangeShapeNodes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ChangeShapeNodes {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Change shape of worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("worker")
    String worker;

    @com.fasterxml.jackson.annotation.JsonProperty("workerShapeConfig")
    ShapeConfigDetails workerShapeConfig;

    /**
     * Change shape of compute only worker nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorker")
    String computeOnlyWorker;

    @com.fasterxml.jackson.annotation.JsonProperty("computeOnlyWorkerShapeConfig")
    ShapeConfigDetails computeOnlyWorkerShapeConfig;

    /**
     * Change shape of master nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("master")
    String master;

    @com.fasterxml.jackson.annotation.JsonProperty("masterShapeConfig")
    ShapeConfigDetails masterShapeConfig;

    /**
     * Change shape of utility nodes to the desired target shape. Both VM_STANDARD and E4 Flex shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("utility")
    String utility;

    @com.fasterxml.jackson.annotation.JsonProperty("utilityShapeConfig")
    ShapeConfigDetails utilityShapeConfig;

    /**
     * Change shape of the Cloud SQL node to the desired target shape. Only VM_STANDARD shapes are allowed here.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cloudsql")
    String cloudsql;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
