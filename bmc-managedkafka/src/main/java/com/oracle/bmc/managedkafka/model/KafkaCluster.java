/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managedkafka.model;

/**
 * A KafkaCluster is a description of a KafkaCluster.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KafkaCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KafkaCluster extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "accessSubnets",
        "clientCertificateBundle",
        "kafkaVersion",
        "clusterType",
        "brokerShape",
        "clusterConfigId",
        "clusterConfigVersion",
        "kafkaBootstrapUrls",
        "coordinationType",
        "secretId",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public KafkaCluster(
            String id,
            String displayName,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.List<SubnetSet> accessSubnets,
            String clientCertificateBundle,
            String kafkaVersion,
            ClusterType clusterType,
            BrokerShape brokerShape,
            String clusterConfigId,
            Integer clusterConfigVersion,
            java.util.List<BootstrapUrl> kafkaBootstrapUrls,
            CoordinationType coordinationType,
            String secretId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.accessSubnets = accessSubnets;
        this.clientCertificateBundle = clientCertificateBundle;
        this.kafkaVersion = kafkaVersion;
        this.clusterType = clusterType;
        this.brokerShape = brokerShape;
        this.clusterConfigId = clusterConfigId;
        this.clusterConfigVersion = clusterConfigVersion;
        this.kafkaBootstrapUrls = kafkaBootstrapUrls;
        this.coordinationType = coordinationType;
        this.secretId = secretId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KafkaCluster.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * KafkaCluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name. Does not have to be unique, and it's changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
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
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The date and time the KafkaCluster was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the KafkaCluster was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the KafkaCluster was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the KafkaCluster was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the KafkaCluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the KafkaCluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the KafkaCluster in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the KafkaCluster in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
         * spin up cluster on a single node PRODUCTION - Minimum allowed broker count is 3
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
        private ClusterType clusterType;

        /**
         * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and
         * spin up cluster on a single node PRODUCTION - Minimum allowed broker count is 3
         *
         * @param clusterType the value to set
         * @return this builder
         */
        public Builder clusterType(ClusterType clusterType) {
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
        /** Bootstrap URL that can be used to connect to Kafka */
        @com.fasterxml.jackson.annotation.JsonProperty("kafkaBootstrapUrls")
        private java.util.List<BootstrapUrl> kafkaBootstrapUrls;

        /**
         * Bootstrap URL that can be used to connect to Kafka
         *
         * @param kafkaBootstrapUrls the value to set
         * @return this builder
         */
        public Builder kafkaBootstrapUrls(java.util.List<BootstrapUrl> kafkaBootstrapUrls) {
            this.kafkaBootstrapUrls = kafkaBootstrapUrls;
            this.__explicitlySet__.add("kafkaBootstrapUrls");
            return this;
        }
        /** Kafka coordination type. Set of available types depends on Kafka version */
        @com.fasterxml.jackson.annotation.JsonProperty("coordinationType")
        private CoordinationType coordinationType;

        /**
         * Kafka coordination type. Set of available types depends on Kafka version
         *
         * @param coordinationType the value to set
         * @return this builder
         */
        public Builder coordinationType(CoordinationType coordinationType) {
            this.coordinationType = coordinationType;
            this.__explicitlySet__.add("coordinationType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * secret that contains superuser password.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * secret that contains superuser password.
         *
         * @param secretId the value to set
         * @return this builder
         */
        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KafkaCluster build() {
            KafkaCluster model =
                    new KafkaCluster(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.accessSubnets,
                            this.clientCertificateBundle,
                            this.kafkaVersion,
                            this.clusterType,
                            this.brokerShape,
                            this.clusterConfigId,
                            this.clusterConfigVersion,
                            this.kafkaBootstrapUrls,
                            this.coordinationType,
                            this.secretId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KafkaCluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
            if (model.wasPropertyExplicitlySet("kafkaBootstrapUrls")) {
                this.kafkaBootstrapUrls(model.getKafkaBootstrapUrls());
            }
            if (model.wasPropertyExplicitlySet("coordinationType")) {
                this.coordinationType(model.getCoordinationType());
            }
            if (model.wasPropertyExplicitlySet("secretId")) {
                this.secretId(model.getSecretId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * KafkaCluster.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * KafkaCluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name. Does not have to be unique, and it's changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the KafkaCluster was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the KafkaCluster was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the KafkaCluster was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the KafkaCluster was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the KafkaCluster. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the KafkaCluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the KafkaCluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the KafkaCluster in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the KafkaCluster in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
     * cluster on a single node PRODUCTION - Minimum allowed broker count is 3
     */
    public enum ClusterType implements com.oracle.bmc.http.internal.BmcEnum {
        Development("DEVELOPMENT"),
        Production("PRODUCTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClusterType.class);

        private final String value;
        private static java.util.Map<String, ClusterType> map;

        static {
            map = new java.util.HashMap<>();
            for (ClusterType v : ClusterType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClusterType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClusterType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClusterType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and spin up
     * cluster on a single node PRODUCTION - Minimum allowed broker count is 3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
    private final ClusterType clusterType;

    /**
     * Type of the cluster to spin up. DEVELOPMENT - setting that allows to sacrifice HA and spin up
     * cluster on a single node PRODUCTION - Minimum allowed broker count is 3
     *
     * @return the value
     */
    public ClusterType getClusterType() {
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

    /** Bootstrap URL that can be used to connect to Kafka */
    @com.fasterxml.jackson.annotation.JsonProperty("kafkaBootstrapUrls")
    private final java.util.List<BootstrapUrl> kafkaBootstrapUrls;

    /**
     * Bootstrap URL that can be used to connect to Kafka
     *
     * @return the value
     */
    public java.util.List<BootstrapUrl> getKafkaBootstrapUrls() {
        return kafkaBootstrapUrls;
    }

    /** Kafka coordination type. Set of available types depends on Kafka version */
    public enum CoordinationType implements com.oracle.bmc.http.internal.BmcEnum {
        Zookeeper("ZOOKEEPER"),
        Kraft("KRAFT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CoordinationType.class);

        private final String value;
        private static java.util.Map<String, CoordinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (CoordinationType v : CoordinationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CoordinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CoordinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CoordinationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Kafka coordination type. Set of available types depends on Kafka version */
    @com.fasterxml.jackson.annotation.JsonProperty("coordinationType")
    private final CoordinationType coordinationType;

    /**
     * Kafka coordination type. Set of available types depends on Kafka version
     *
     * @return the value
     */
    public CoordinationType getCoordinationType() {
        return coordinationType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * secret that contains superuser password.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    private final String secretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * secret that contains superuser password.
     *
     * @return the value
     */
    public String getSecretId() {
        return secretId;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("KafkaCluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", accessSubnets=").append(String.valueOf(this.accessSubnets));
        sb.append(", clientCertificateBundle=")
                .append(String.valueOf(this.clientCertificateBundle));
        sb.append(", kafkaVersion=").append(String.valueOf(this.kafkaVersion));
        sb.append(", clusterType=").append(String.valueOf(this.clusterType));
        sb.append(", brokerShape=").append(String.valueOf(this.brokerShape));
        sb.append(", clusterConfigId=").append(String.valueOf(this.clusterConfigId));
        sb.append(", clusterConfigVersion=").append(String.valueOf(this.clusterConfigVersion));
        sb.append(", kafkaBootstrapUrls=").append(String.valueOf(this.kafkaBootstrapUrls));
        sb.append(", coordinationType=").append(String.valueOf(this.coordinationType));
        sb.append(", secretId=").append(String.valueOf(this.secretId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KafkaCluster)) {
            return false;
        }

        KafkaCluster other = (KafkaCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.accessSubnets, other.accessSubnets)
                && java.util.Objects.equals(
                        this.clientCertificateBundle, other.clientCertificateBundle)
                && java.util.Objects.equals(this.kafkaVersion, other.kafkaVersion)
                && java.util.Objects.equals(this.clusterType, other.clusterType)
                && java.util.Objects.equals(this.brokerShape, other.brokerShape)
                && java.util.Objects.equals(this.clusterConfigId, other.clusterConfigId)
                && java.util.Objects.equals(this.clusterConfigVersion, other.clusterConfigVersion)
                && java.util.Objects.equals(this.kafkaBootstrapUrls, other.kafkaBootstrapUrls)
                && java.util.Objects.equals(this.coordinationType, other.coordinationType)
                && java.util.Objects.equals(this.secretId, other.secretId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
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
                        + (this.kafkaBootstrapUrls == null
                                ? 43
                                : this.kafkaBootstrapUrls.hashCode());
        result =
                (result * PRIME)
                        + (this.coordinationType == null ? 43 : this.coordinationType.hashCode());
        result = (result * PRIME) + (this.secretId == null ? 43 : this.secretId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
