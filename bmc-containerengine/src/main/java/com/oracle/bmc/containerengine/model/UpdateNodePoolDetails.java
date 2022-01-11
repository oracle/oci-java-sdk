/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to update a node pool.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateNodePoolDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateNodePoolDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
        private java.util.List<KeyValue> initialNodeLabels;

        public Builder initialNodeLabels(java.util.List<KeyValue> initialNodeLabels) {
            this.initialNodeLabels = initialNodeLabels;
            this.__explicitlySet__.add("initialNodeLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
        private Integer quantityPerSubnet;

        public Builder quantityPerSubnet(Integer quantityPerSubnet) {
            this.quantityPerSubnet = quantityPerSubnet;
            this.__explicitlySet__.add("quantityPerSubnet");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
        private java.util.List<String> subnetIds;

        public Builder subnetIds(java.util.List<String> subnetIds) {
            this.subnetIds = subnetIds;
            this.__explicitlySet__.add("subnetIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
        private UpdateNodePoolNodeConfigDetails nodeConfigDetails;

        public Builder nodeConfigDetails(UpdateNodePoolNodeConfigDetails nodeConfigDetails) {
            this.nodeConfigDetails = nodeConfigDetails;
            this.__explicitlySet__.add("nodeConfigDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeMetadata")
        private java.util.Map<String, String> nodeMetadata;

        public Builder nodeMetadata(java.util.Map<String, String> nodeMetadata) {
            this.nodeMetadata = nodeMetadata;
            this.__explicitlySet__.add("nodeMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
        private NodeSourceDetails nodeSourceDetails;

        public Builder nodeSourceDetails(NodeSourceDetails nodeSourceDetails) {
            this.nodeSourceDetails = nodeSourceDetails;
            this.__explicitlySet__.add("nodeSourceDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
        private String sshPublicKey;

        public Builder sshPublicKey(String sshPublicKey) {
            this.sshPublicKey = sshPublicKey;
            this.__explicitlySet__.add("sshPublicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
        private String nodeShape;

        public Builder nodeShape(String nodeShape) {
            this.nodeShape = nodeShape;
            this.__explicitlySet__.add("nodeShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
        private UpdateNodeShapeConfigDetails nodeShapeConfig;

        public Builder nodeShapeConfig(UpdateNodeShapeConfigDetails nodeShapeConfig) {
            this.nodeShapeConfig = nodeShapeConfig;
            this.__explicitlySet__.add("nodeShapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateNodePoolDetails build() {
            UpdateNodePoolDetails __instance__ =
                    new UpdateNodePoolDetails(
                            name,
                            kubernetesVersion,
                            initialNodeLabels,
                            quantityPerSubnet,
                            subnetIds,
                            nodeConfigDetails,
                            nodeMetadata,
                            nodeSourceDetails,
                            sshPublicKey,
                            nodeShape,
                            nodeShapeConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateNodePoolDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .initialNodeLabels(o.getInitialNodeLabels())
                            .quantityPerSubnet(o.getQuantityPerSubnet())
                            .subnetIds(o.getSubnetIds())
                            .nodeConfigDetails(o.getNodeConfigDetails())
                            .nodeMetadata(o.getNodeMetadata())
                            .nodeSourceDetails(o.getNodeSourceDetails())
                            .sshPublicKey(o.getSshPublicKey())
                            .nodeShape(o.getNodeShape())
                            .nodeShapeConfig(o.getNodeShapeConfig());

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
     * The new name for the cluster. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The version of Kubernetes to which the nodes in the node pool should be upgraded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    String kubernetesVersion;

    /**
     * A list of key/value pairs to add to nodes after they join the Kubernetes cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("initialNodeLabels")
    java.util.List<KeyValue> initialNodeLabels;

    /**
     * The number of nodes to have in each subnet specified in the subnetIds property. This property is deprecated,
     * use nodeConfigDetails instead. If the current value of quantityPerSubnet is greater than 0, you can only
     * use quantityPerSubnet to scale the node pool. If the current value of quantityPerSubnet is equal to 0 and
     * the current value of size in nodeConfigDetails is greater than 0, before you can use quantityPerSubnet,
     * you must first scale the node pool to 0 nodes using nodeConfigDetails.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantityPerSubnet")
    Integer quantityPerSubnet;

    /**
     * The OCIDs of the subnets in which to place nodes for this node pool. This property is deprecated,
     * use nodeConfigDetails instead. Only one of the subnetIds or nodeConfigDetails
     * properties can be specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetIds")
    java.util.List<String> subnetIds;

    /**
     * The configuration of nodes in the node pool. Only one of the subnetIds or nodeConfigDetails
     * properties should be specified. If the current value of quantityPerSubnet is greater than 0, the node
     * pool may still be scaled using quantityPerSubnet. Before you can use nodeConfigDetails,
     * you must first scale the node pool to 0 nodes using quantityPerSubnet.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeConfigDetails")
    UpdateNodePoolNodeConfigDetails nodeConfigDetails;

    /**
     * A list of key/value pairs to add to each underlying OCI instance in the node pool on launch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeMetadata")
    java.util.Map<String, String> nodeMetadata;

    /**
     * Specify the source to use to launch nodes in the node pool. Currently, image is the only supported source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeSourceDetails")
    NodeSourceDetails nodeSourceDetails;

    /**
     * The SSH public key to add to each node in the node pool on launch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKey")
    String sshPublicKey;

    /**
     * The name of the node shape of the nodes in the node pool used on launch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShape")
    String nodeShape;

    /**
     * Specify the configuration of the shape to launch nodes in the node pool.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeShapeConfig")
    UpdateNodeShapeConfigDetails nodeShapeConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
