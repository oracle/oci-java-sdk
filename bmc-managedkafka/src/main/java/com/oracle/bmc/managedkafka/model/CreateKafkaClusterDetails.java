/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.model;

/**
 * The data to create a KafkaCluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateKafkaClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateKafkaClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "accessSubnets",
        "clientCertificateBundle",
        "kafkaVersion",
        "clusterType",
        "brokerShape",
        "clusterConfigId",
        "clusterConfigVersion",
        "coordinationType",
        "freeformTags",
        "definedTags"
    })
    public CreateKafkaClusterDetails(
            String displayName,
            String compartmentId,
            java.util.List<SubnetSet> accessSubnets,
            String clientCertificateBundle,
            String kafkaVersion,
            KafkaCluster.ClusterType clusterType,
            BrokerShape brokerShape,
            String clusterConfigId,
            Integer clusterConfigVersion,
            KafkaCluster.CoordinationType coordinationType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.accessSubnets = accessSubnets;
        this.clientCertificateBundle = clientCertificateBundle;
        this.kafkaVersion = kafkaVersion;
        this.clusterType = clusterType;
        this.brokerShape = brokerShape;
        this.clusterConfigId = clusterConfigId;
        this.clusterConfigVersion = clusterConfigVersion;
        this.coordinationType = coordinationType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the KafkaCluster in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment to create the KafkaCluster in.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Subnets where broker/coordinator VNICs will be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessSubnets")
        private java.util.List<SubnetSet> accessSubnets;

        /**
         * Subnets where broker/coordinator VNICs will be created.
         *
         * @param accessSubnets the value to set
         * @return this builder
         */
        public Builder accessSubnets(java.util.List<SubnetSet> accessSubnets) {
            this.accessSubnets = accessSubnets;
            this.__explicitlySet__.add("accessSubnets");
            return this;
        }
        /** CA certificate bundle for mTLS broker authentication. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientCertificateBundle")
        private String clientCertificateBundle;

        /**
         * CA certificate bundle for mTLS broker authentication.
         *
         * @param clientCertificateBundle the value to set
         * @return this builder
         */
        public Builder clientCertificateBundle(String clientCertificateBundle) {
            this.clientCertificateBundle = clientCertificateBundle;
            this.__explicitlySet__.add("clientCertificateBundle");
            return this;
        }
        /** Version of Kafka to use to spin up the cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("kafkaVersion")
        private String kafkaVersion;

        /**
         * Version of Kafka to use to spin up the cluster
         *
         * @param kafkaVersion the value to set
         * @return this builder
         */
        public Builder kafkaVersion(String kafkaVersion) {
            this.kafkaVersion = kafkaVersion;
            this.__explicitlySet__.add("kafkaVersion");
            return this;
        }
        /**
         * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and
         * spin up cluster on single node PRODUCTION - Minimum allowed broker count is 3
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
        private KafkaCluster.ClusterType clusterType;

        /**
         * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and
         * spin up cluster on single node PRODUCTION - Minimum allowed broker count is 3
         *
         * @param clusterType the value to set
         * @return this builder
         */
        public Builder clusterType(KafkaCluster.ClusterType clusterType) {
            this.clusterType = clusterType;
            this.__explicitlySet__.add("clusterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("brokerShape")
        private BrokerShape brokerShape;

        public Builder brokerShape(BrokerShape brokerShape) {
            this.brokerShape = brokerShape;
            this.__explicitlySet__.add("brokerShape");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Kafka Cluster configuration object
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterConfigId")
        private String clusterConfigId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * Kafka Cluster configuration object
         *
         * @param clusterConfigId the value to set
         * @return this builder
         */
        public Builder clusterConfigId(String clusterConfigId) {
            this.clusterConfigId = clusterConfigId;
            this.__explicitlySet__.add("clusterConfigId");
            return this;
        }
        /** The version of configuration object */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterConfigVersion")
        private Integer clusterConfigVersion;

        /**
         * The version of configuration object
         *
         * @param clusterConfigVersion the value to set
         * @return this builder
         */
        public Builder clusterConfigVersion(Integer clusterConfigVersion) {
            this.clusterConfigVersion = clusterConfigVersion;
            this.__explicitlySet__.add("clusterConfigVersion");
            return this;
        }
        /** Kafka coordination type. Set of available types depends on Kafka version */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinationType")
        private KafkaCluster.CoordinationType coordinationType;

        /**
         * Kafka coordination type. Set of available types depends on Kafka version
         *
         * @param coordinationType the value to set
         * @return this builder
         */
        public Builder coordinationType(KafkaCluster.CoordinationType coordinationType) {
            this.coordinationType = coordinationType;
            this.__explicitlySet__.add("coordinationType");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateKafkaClusterDetails build() {
            CreateKafkaClusterDetails model =
                    new CreateKafkaClusterDetails(
                            this.displayName,
                            this.compartmentId,
                            this.accessSubnets,
                            this.clientCertificateBundle,
                            this.kafkaVersion,
                            this.clusterType,
                            this.brokerShape,
                            this.clusterConfigId,
                            this.clusterConfigVersion,
                            this.coordinationType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateKafkaClusterDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("accessSubnets")) {
                this.accessSubnets(model.getAccessSubnets());
            }
            if (model.wasPropertyExplicitlySet("clientCertificateBundle")) {
                this.clientCertificateBundle(model.getClientCertificateBundle());
            }
            if (model.wasPropertyExplicitlySet("kafkaVersion")) {
                this.kafkaVersion(model.getKafkaVersion());
            }
            if (model.wasPropertyExplicitlySet("clusterType")) {
                this.clusterType(model.getClusterType());
            }
            if (model.wasPropertyExplicitlySet("brokerShape")) {
                this.brokerShape(model.getBrokerShape());
            }
            if (model.wasPropertyExplicitlySet("clusterConfigId")) {
                this.clusterConfigId(model.getClusterConfigId());
            }
            if (model.wasPropertyExplicitlySet("clusterConfigVersion")) {
                this.clusterConfigVersion(model.getClusterConfigVersion());
            }
            if (model.wasPropertyExplicitlySet("coordinationType")) {
                this.coordinationType(model.getCoordinationType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the KafkaCluster in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment to create the KafkaCluster in.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Subnets where broker/coordinator VNICs will be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessSubnets")
    private final java.util.List<SubnetSet> accessSubnets;

    /**
     * Subnets where broker/coordinator VNICs will be created.
     *
     * @return the value
     */
    public java.util.List<SubnetSet> getAccessSubnets() {
        return accessSubnets;
    }

    /** CA certificate bundle for mTLS broker authentication. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCertificateBundle")
    private final String clientCertificateBundle;

    /**
     * CA certificate bundle for mTLS broker authentication.
     *
     * @return the value
     */
    public String getClientCertificateBundle() {
        return clientCertificateBundle;
    }

    /** Version of Kafka to use to spin up the cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaVersion")
    private final String kafkaVersion;

    /**
     * Version of Kafka to use to spin up the cluster
     *
     * @return the value
     */
    public String getKafkaVersion() {
        return kafkaVersion;
    }

    /**
     * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and spin up
     * cluster on single node PRODUCTION - Minimum allowed broker count is 3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
    private final KafkaCluster.ClusterType clusterType;

    /**
     * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and spin up
     * cluster on single node PRODUCTION - Minimum allowed broker count is 3
     *
     * @return the value
     */
    public KafkaCluster.ClusterType getClusterType() {
        return clusterType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("brokerShape")
    private final BrokerShape brokerShape;

    public BrokerShape getBrokerShape() {
        return brokerShape;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Kafka
     * Cluster configuration object
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterConfigId")
    private final String clusterConfigId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of Kafka
     * Cluster configuration object
     *
     * @return the value
     */
    public String getClusterConfigId() {
        return clusterConfigId;
    }

    /** The version of configuration object */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterConfigVersion")
    private final Integer clusterConfigVersion;

    /**
     * The version of configuration object
     *
     * @return the value
     */
    public Integer getClusterConfigVersion() {
        return clusterConfigVersion;
    }

    /** Kafka coordination type. Set of available types depends on Kafka version */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinationType")
    private final KafkaCluster.CoordinationType coordinationType;

    /**
     * Kafka coordination type. Set of available types depends on Kafka version
     *
     * @return the value
     */
    public KafkaCluster.CoordinationType getCoordinationType() {
        return coordinationType;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateKafkaClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", accessSubnets=").append(String.valueOf(this.accessSubnets));
        sb.append(", clientCertificateBundle=")
                .append(String.valueOf(this.clientCertificateBundle));
        sb.append(", kafkaVersion=").append(String.valueOf(this.kafkaVersion));
        sb.append(", clusterType=").append(String.valueOf(this.clusterType));
        sb.append(", brokerShape=").append(String.valueOf(this.brokerShape));
        sb.append(", clusterConfigId=").append(String.valueOf(this.clusterConfigId));
        sb.append(", clusterConfigVersion=").append(String.valueOf(this.clusterConfigVersion));
        sb.append(", coordinationType=").append(String.valueOf(this.coordinationType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateKafkaClusterDetails)) {
            return false;
        }

        CreateKafkaClusterDetails other = (CreateKafkaClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.accessSubnets, other.accessSubnets)
                && java.util.Objects.equals(
                        this.clientCertificateBundle, other.clientCertificateBundle)
                && java.util.Objects.equals(this.kafkaVersion, other.kafkaVersion)
                && java.util.Objects.equals(this.clusterType, other.clusterType)
                && java.util.Objects.equals(this.brokerShape, other.brokerShape)
                && java.util.Objects.equals(this.clusterConfigId, other.clusterConfigId)
                && java.util.Objects.equals(this.clusterConfigVersion, other.clusterConfigVersion)
                && java.util.Objects.equals(this.coordinationType, other.coordinationType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.accessSubnets == null ? 43 : this.accessSubnets.hashCode());
        result =
                (result * PRIME)
                        + (this.clientCertificateBundle == null
                                ? 43
                                : this.clientCertificateBundle.hashCode());
        result = (result * PRIME) + (this.kafkaVersion == null ? 43 : this.kafkaVersion.hashCode());
        result = (result * PRIME) + (this.clusterType == null ? 43 : this.clusterType.hashCode());
        result = (result * PRIME) + (this.brokerShape == null ? 43 : this.brokerShape.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterConfigId == null ? 43 : this.clusterConfigId.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterConfigVersion == null
                                ? 43
                                : this.clusterConfigVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinationType == null ? 43 : this.coordinationType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
