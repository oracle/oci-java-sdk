/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * An OpenSearch cluster resource. An OpenSearch cluster is set of instances that provide OpenSearch
 * functionality in OCI Search Service with OpenSearch. For more information, see [About Search
 * Service with
 * OpenSearch](https://docs.cloud.oracle.com/iaas/Content/search-opensearch/Concepts/ociopensearch.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpensearchCluster.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpensearchCluster
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "timeDeleted",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "softwareVersion",
        "totalStorageGB",
        "opensearchFqdn",
        "opensearchPrivateIp",
        "opendashboardFqdn",
        "opendashboardPrivateIp",
        "masterNodeCount",
        "masterNodeHostType",
        "masterNodeHostBareMetalShape",
        "masterNodeHostOcpuCount",
        "masterNodeHostMemoryGB",
        "dataNodeCount",
        "dataNodeHostType",
        "dataNodeHostBareMetalShape",
        "dataNodeHostOcpuCount",
        "dataNodeHostMemoryGB",
        "dataNodeStorageGB",
        "opendashboardNodeCount",
        "opendashboardNodeHostOcpuCount",
        "opendashboardNodeHostMemoryGB",
        "vcnId",
        "subnetId",
        "vcnCompartmentId",
        "subnetCompartmentId",
        "fqdn",
        "availabilityDomains",
        "securityMode",
        "securityMasterUserName",
        "securityMasterUserPasswordHash"
    })
    public OpensearchCluster(
            String id,
            String displayName,
            String compartmentId,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeDeleted,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            String softwareVersion,
            Integer totalStorageGB,
            String opensearchFqdn,
            String opensearchPrivateIp,
            String opendashboardFqdn,
            String opendashboardPrivateIp,
            Integer masterNodeCount,
            MasterNodeHostType masterNodeHostType,
            String masterNodeHostBareMetalShape,
            Integer masterNodeHostOcpuCount,
            Integer masterNodeHostMemoryGB,
            Integer dataNodeCount,
            DataNodeHostType dataNodeHostType,
            String dataNodeHostBareMetalShape,
            Integer dataNodeHostOcpuCount,
            Integer dataNodeHostMemoryGB,
            Integer dataNodeStorageGB,
            Integer opendashboardNodeCount,
            Integer opendashboardNodeHostOcpuCount,
            Integer opendashboardNodeHostMemoryGB,
            String vcnId,
            String subnetId,
            String vcnCompartmentId,
            String subnetCompartmentId,
            String fqdn,
            java.util.List<String> availabilityDomains,
            SecurityMode securityMode,
            String securityMasterUserName,
            String securityMasterUserPasswordHash) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeDeleted = timeDeleted;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.softwareVersion = softwareVersion;
        this.totalStorageGB = totalStorageGB;
        this.opensearchFqdn = opensearchFqdn;
        this.opensearchPrivateIp = opensearchPrivateIp;
        this.opendashboardFqdn = opendashboardFqdn;
        this.opendashboardPrivateIp = opendashboardPrivateIp;
        this.masterNodeCount = masterNodeCount;
        this.masterNodeHostType = masterNodeHostType;
        this.masterNodeHostBareMetalShape = masterNodeHostBareMetalShape;
        this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
        this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
        this.dataNodeCount = dataNodeCount;
        this.dataNodeHostType = dataNodeHostType;
        this.dataNodeHostBareMetalShape = dataNodeHostBareMetalShape;
        this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
        this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
        this.dataNodeStorageGB = dataNodeStorageGB;
        this.opendashboardNodeCount = opendashboardNodeCount;
        this.opendashboardNodeHostOcpuCount = opendashboardNodeHostOcpuCount;
        this.opendashboardNodeHostMemoryGB = opendashboardNodeHostMemoryGB;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.vcnCompartmentId = vcnCompartmentId;
        this.subnetCompartmentId = subnetCompartmentId;
        this.fqdn = fqdn;
        this.availabilityDomains = availabilityDomains;
        this.securityMode = securityMode;
        this.securityMasterUserName = securityMasterUserName;
        this.securityMasterUserPasswordHash = securityMasterUserPasswordHash;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the cluster.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The name of the cluster. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the cluster. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The OCID of the compartment where the cluster is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where the cluster is located.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The current state of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the cluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The amount of time in milliseconds since the cluster was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The amount of time in milliseconds since the cluster was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The amount of time in milliseconds since the cluster was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The amount of time in milliseconds since the cluster was updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The amount of time in milliseconds since the cluster was updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDeleted")
        private java.util.Date timeDeleted;

        /**
         * The amount of time in milliseconds since the cluster was updated.
         *
         * @param timeDeleted the value to set
         * @return this builder
         */
        public Builder timeDeleted(java.util.Date timeDeleted) {
            this.timeDeleted = timeDeleted;
            this.__explicitlySet__.add("timeDeleted");
            return this;
        }
        /** Additional information about the current lifecycle state of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state of the cluster.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }
        /** The software version the cluster is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
        private String softwareVersion;

        /**
         * The software version the cluster is running.
         *
         * @param softwareVersion the value to set
         * @return this builder
         */
        public Builder softwareVersion(String softwareVersion) {
            this.softwareVersion = softwareVersion;
            this.__explicitlySet__.add("softwareVersion");
            return this;
        }
        /** The size in GB of the cluster's total storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageGB")
        private Integer totalStorageGB;

        /**
         * The size in GB of the cluster's total storage.
         *
         * @param totalStorageGB the value to set
         * @return this builder
         */
        public Builder totalStorageGB(Integer totalStorageGB) {
            this.totalStorageGB = totalStorageGB;
            this.__explicitlySet__.add("totalStorageGB");
            return this;
        }
        /** The fully qualified domain name (FQDN) for the cluster's API endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("opensearchFqdn")
        private String opensearchFqdn;

        /**
         * The fully qualified domain name (FQDN) for the cluster's API endpoint.
         *
         * @param opensearchFqdn the value to set
         * @return this builder
         */
        public Builder opensearchFqdn(String opensearchFqdn) {
            this.opensearchFqdn = opensearchFqdn;
            this.__explicitlySet__.add("opensearchFqdn");
            return this;
        }
        /** The cluster's private IP address. */
        @com.fasterxml.jackson.annotation.JsonProperty("opensearchPrivateIp")
        private String opensearchPrivateIp;

        /**
         * The cluster's private IP address.
         *
         * @param opensearchPrivateIp the value to set
         * @return this builder
         */
        public Builder opensearchPrivateIp(String opensearchPrivateIp) {
            this.opensearchPrivateIp = opensearchPrivateIp;
            this.__explicitlySet__.add("opensearchPrivateIp");
            return this;
        }
        /**
         * The fully qualified domain name (FQDN) for the cluster's OpenSearch Dashboard API
         * endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardFqdn")
        private String opendashboardFqdn;

        /**
         * The fully qualified domain name (FQDN) for the cluster's OpenSearch Dashboard API
         * endpoint.
         *
         * @param opendashboardFqdn the value to set
         * @return this builder
         */
        public Builder opendashboardFqdn(String opendashboardFqdn) {
            this.opendashboardFqdn = opendashboardFqdn;
            this.__explicitlySet__.add("opendashboardFqdn");
            return this;
        }
        /** The private IP address for the cluster's OpenSearch Dashboard. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardPrivateIp")
        private String opendashboardPrivateIp;

        /**
         * The private IP address for the cluster's OpenSearch Dashboard.
         *
         * @param opendashboardPrivateIp the value to set
         * @return this builder
         */
        public Builder opendashboardPrivateIp(String opendashboardPrivateIp) {
            this.opendashboardPrivateIp = opendashboardPrivateIp;
            this.__explicitlySet__.add("opendashboardPrivateIp");
            return this;
        }
        /** The number of master nodes configured for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeCount")
        private Integer masterNodeCount;

        /**
         * The number of master nodes configured for the cluster.
         *
         * @param masterNodeCount the value to set
         * @return this builder
         */
        public Builder masterNodeCount(Integer masterNodeCount) {
            this.masterNodeCount = masterNodeCount;
            this.__explicitlySet__.add("masterNodeCount");
            return this;
        }
        /** The instance type for the cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostType")
        private MasterNodeHostType masterNodeHostType;

        /**
         * The instance type for the cluster's master nodes.
         *
         * @param masterNodeHostType the value to set
         * @return this builder
         */
        public Builder masterNodeHostType(MasterNodeHostType masterNodeHostType) {
            this.masterNodeHostType = masterNodeHostType;
            this.__explicitlySet__.add("masterNodeHostType");
            return this;
        }
        /** The bare metal shape for the cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostBareMetalShape")
        private String masterNodeHostBareMetalShape;

        /**
         * The bare metal shape for the cluster's master nodes.
         *
         * @param masterNodeHostBareMetalShape the value to set
         * @return this builder
         */
        public Builder masterNodeHostBareMetalShape(String masterNodeHostBareMetalShape) {
            this.masterNodeHostBareMetalShape = masterNodeHostBareMetalShape;
            this.__explicitlySet__.add("masterNodeHostBareMetalShape");
            return this;
        }
        /** The number of OCPUs configured for cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
        private Integer masterNodeHostOcpuCount;

        /**
         * The number of OCPUs configured for cluster's master nodes.
         *
         * @param masterNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder masterNodeHostOcpuCount(Integer masterNodeHostOcpuCount) {
            this.masterNodeHostOcpuCount = masterNodeHostOcpuCount;
            this.__explicitlySet__.add("masterNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's master nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
        private Integer masterNodeHostMemoryGB;

        /**
         * The amount of memory in GB, for the cluster's master nodes.
         *
         * @param masterNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder masterNodeHostMemoryGB(Integer masterNodeHostMemoryGB) {
            this.masterNodeHostMemoryGB = masterNodeHostMemoryGB;
            this.__explicitlySet__.add("masterNodeHostMemoryGB");
            return this;
        }
        /** The number of data nodes configured for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeCount")
        private Integer dataNodeCount;

        /**
         * The number of data nodes configured for the cluster.
         *
         * @param dataNodeCount the value to set
         * @return this builder
         */
        public Builder dataNodeCount(Integer dataNodeCount) {
            this.dataNodeCount = dataNodeCount;
            this.__explicitlySet__.add("dataNodeCount");
            return this;
        }
        /** The instance type for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostType")
        private DataNodeHostType dataNodeHostType;

        /**
         * The instance type for the cluster's data nodes.
         *
         * @param dataNodeHostType the value to set
         * @return this builder
         */
        public Builder dataNodeHostType(DataNodeHostType dataNodeHostType) {
            this.dataNodeHostType = dataNodeHostType;
            this.__explicitlySet__.add("dataNodeHostType");
            return this;
        }
        /** The bare metal shape for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostBareMetalShape")
        private String dataNodeHostBareMetalShape;

        /**
         * The bare metal shape for the cluster's data nodes.
         *
         * @param dataNodeHostBareMetalShape the value to set
         * @return this builder
         */
        public Builder dataNodeHostBareMetalShape(String dataNodeHostBareMetalShape) {
            this.dataNodeHostBareMetalShape = dataNodeHostBareMetalShape;
            this.__explicitlySet__.add("dataNodeHostBareMetalShape");
            return this;
        }
        /** The number of OCPUs configured for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
        private Integer dataNodeHostOcpuCount;

        /**
         * The number of OCPUs configured for the cluster's data nodes.
         *
         * @param dataNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder dataNodeHostOcpuCount(Integer dataNodeHostOcpuCount) {
            this.dataNodeHostOcpuCount = dataNodeHostOcpuCount;
            this.__explicitlySet__.add("dataNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
        private Integer dataNodeHostMemoryGB;

        /**
         * The amount of memory in GB, for the cluster's data nodes.
         *
         * @param dataNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder dataNodeHostMemoryGB(Integer dataNodeHostMemoryGB) {
            this.dataNodeHostMemoryGB = dataNodeHostMemoryGB;
            this.__explicitlySet__.add("dataNodeHostMemoryGB");
            return this;
        }
        /** The amount of storage in GB, to configure per node for the cluster's data nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataNodeStorageGB")
        private Integer dataNodeStorageGB;

        /**
         * The amount of storage in GB, to configure per node for the cluster's data nodes.
         *
         * @param dataNodeStorageGB the value to set
         * @return this builder
         */
        public Builder dataNodeStorageGB(Integer dataNodeStorageGB) {
            this.dataNodeStorageGB = dataNodeStorageGB;
            this.__explicitlySet__.add("dataNodeStorageGB");
            return this;
        }
        /** The number of OpenSearch Dashboard nodes configured for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeCount")
        private Integer opendashboardNodeCount;

        /**
         * The number of OpenSearch Dashboard nodes configured for the cluster.
         *
         * @param opendashboardNodeCount the value to set
         * @return this builder
         */
        public Builder opendashboardNodeCount(Integer opendashboardNodeCount) {
            this.opendashboardNodeCount = opendashboardNodeCount;
            this.__explicitlySet__.add("opendashboardNodeCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostOcpuCount")
        private Integer opendashboardNodeHostOcpuCount;

        /**
         * The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes.
         *
         * @param opendashboardNodeHostOcpuCount the value to set
         * @return this builder
         */
        public Builder opendashboardNodeHostOcpuCount(Integer opendashboardNodeHostOcpuCount) {
            this.opendashboardNodeHostOcpuCount = opendashboardNodeHostOcpuCount;
            this.__explicitlySet__.add("opendashboardNodeHostOcpuCount");
            return this;
        }
        /** The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostMemoryGB")
        private Integer opendashboardNodeHostMemoryGB;

        /**
         * The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes.
         *
         * @param opendashboardNodeHostMemoryGB the value to set
         * @return this builder
         */
        public Builder opendashboardNodeHostMemoryGB(Integer opendashboardNodeHostMemoryGB) {
            this.opendashboardNodeHostMemoryGB = opendashboardNodeHostMemoryGB;
            this.__explicitlySet__.add("opendashboardNodeHostMemoryGB");
            return this;
        }
        /** The OCID of the cluster's VCN. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The OCID of the cluster's VCN.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /** The OCID of the cluster's subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the cluster's subnet.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The OCID for the compartment where the cluster's VCN is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnCompartmentId")
        private String vcnCompartmentId;

        /**
         * The OCID for the compartment where the cluster's VCN is located.
         *
         * @param vcnCompartmentId the value to set
         * @return this builder
         */
        public Builder vcnCompartmentId(String vcnCompartmentId) {
            this.vcnCompartmentId = vcnCompartmentId;
            this.__explicitlySet__.add("vcnCompartmentId");
            return this;
        }
        /** The OCID for the compartment where the cluster's subnet is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetCompartmentId")
        private String subnetCompartmentId;

        /**
         * The OCID for the compartment where the cluster's subnet is located.
         *
         * @param subnetCompartmentId the value to set
         * @return this builder
         */
        public Builder subnetCompartmentId(String subnetCompartmentId) {
            this.subnetCompartmentId = subnetCompartmentId;
            this.__explicitlySet__.add("subnetCompartmentId");
            return this;
        }
        /** The fully qualified domain name (FQDN) for the cluster's API endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
        private String fqdn;

        /**
         * The fully qualified domain name (FQDN) for the cluster's API endpoint.
         *
         * @param fqdn the value to set
         * @return this builder
         */
        public Builder fqdn(String fqdn) {
            this.fqdn = fqdn;
            this.__explicitlySet__.add("fqdn");
            return this;
        }
        /** The availability domains to distribute the cluser nodes across. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomains")
        private java.util.List<String> availabilityDomains;

        /**
         * The availability domains to distribute the cluser nodes across.
         *
         * @param availabilityDomains the value to set
         * @return this builder
         */
        public Builder availabilityDomains(java.util.List<String> availabilityDomains) {
            this.availabilityDomains = availabilityDomains;
            this.__explicitlySet__.add("availabilityDomains");
            return this;
        }
        /** The security mode of the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMode")
        private SecurityMode securityMode;

        /**
         * The security mode of the cluster.
         *
         * @param securityMode the value to set
         * @return this builder
         */
        public Builder securityMode(SecurityMode securityMode) {
            this.securityMode = securityMode;
            this.__explicitlySet__.add("securityMode");
            return this;
        }
        /** The name of the master user that are used to manage security config */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserName")
        private String securityMasterUserName;

        /**
         * The name of the master user that are used to manage security config
         *
         * @param securityMasterUserName the value to set
         * @return this builder
         */
        public Builder securityMasterUserName(String securityMasterUserName) {
            this.securityMasterUserName = securityMasterUserName;
            this.__explicitlySet__.add("securityMasterUserName");
            return this;
        }
        /** The password hash of the master user that are used to manage security config */
        @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserPasswordHash")
        private String securityMasterUserPasswordHash;

        /**
         * The password hash of the master user that are used to manage security config
         *
         * @param securityMasterUserPasswordHash the value to set
         * @return this builder
         */
        public Builder securityMasterUserPasswordHash(String securityMasterUserPasswordHash) {
            this.securityMasterUserPasswordHash = securityMasterUserPasswordHash;
            this.__explicitlySet__.add("securityMasterUserPasswordHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpensearchCluster build() {
            OpensearchCluster model =
                    new OpensearchCluster(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeDeleted,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.softwareVersion,
                            this.totalStorageGB,
                            this.opensearchFqdn,
                            this.opensearchPrivateIp,
                            this.opendashboardFqdn,
                            this.opendashboardPrivateIp,
                            this.masterNodeCount,
                            this.masterNodeHostType,
                            this.masterNodeHostBareMetalShape,
                            this.masterNodeHostOcpuCount,
                            this.masterNodeHostMemoryGB,
                            this.dataNodeCount,
                            this.dataNodeHostType,
                            this.dataNodeHostBareMetalShape,
                            this.dataNodeHostOcpuCount,
                            this.dataNodeHostMemoryGB,
                            this.dataNodeStorageGB,
                            this.opendashboardNodeCount,
                            this.opendashboardNodeHostOcpuCount,
                            this.opendashboardNodeHostMemoryGB,
                            this.vcnId,
                            this.subnetId,
                            this.vcnCompartmentId,
                            this.subnetCompartmentId,
                            this.fqdn,
                            this.availabilityDomains,
                            this.securityMode,
                            this.securityMasterUserName,
                            this.securityMasterUserPasswordHash);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpensearchCluster model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeDeleted")) {
                this.timeDeleted(model.getTimeDeleted());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
            if (model.wasPropertyExplicitlySet("softwareVersion")) {
                this.softwareVersion(model.getSoftwareVersion());
            }
            if (model.wasPropertyExplicitlySet("totalStorageGB")) {
                this.totalStorageGB(model.getTotalStorageGB());
            }
            if (model.wasPropertyExplicitlySet("opensearchFqdn")) {
                this.opensearchFqdn(model.getOpensearchFqdn());
            }
            if (model.wasPropertyExplicitlySet("opensearchPrivateIp")) {
                this.opensearchPrivateIp(model.getOpensearchPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("opendashboardFqdn")) {
                this.opendashboardFqdn(model.getOpendashboardFqdn());
            }
            if (model.wasPropertyExplicitlySet("opendashboardPrivateIp")) {
                this.opendashboardPrivateIp(model.getOpendashboardPrivateIp());
            }
            if (model.wasPropertyExplicitlySet("masterNodeCount")) {
                this.masterNodeCount(model.getMasterNodeCount());
            }
            if (model.wasPropertyExplicitlySet("masterNodeHostType")) {
                this.masterNodeHostType(model.getMasterNodeHostType());
            }
            if (model.wasPropertyExplicitlySet("masterNodeHostBareMetalShape")) {
                this.masterNodeHostBareMetalShape(model.getMasterNodeHostBareMetalShape());
            }
            if (model.wasPropertyExplicitlySet("masterNodeHostOcpuCount")) {
                this.masterNodeHostOcpuCount(model.getMasterNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("masterNodeHostMemoryGB")) {
                this.masterNodeHostMemoryGB(model.getMasterNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("dataNodeCount")) {
                this.dataNodeCount(model.getDataNodeCount());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostType")) {
                this.dataNodeHostType(model.getDataNodeHostType());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostBareMetalShape")) {
                this.dataNodeHostBareMetalShape(model.getDataNodeHostBareMetalShape());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostOcpuCount")) {
                this.dataNodeHostOcpuCount(model.getDataNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("dataNodeHostMemoryGB")) {
                this.dataNodeHostMemoryGB(model.getDataNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("dataNodeStorageGB")) {
                this.dataNodeStorageGB(model.getDataNodeStorageGB());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeCount")) {
                this.opendashboardNodeCount(model.getOpendashboardNodeCount());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeHostOcpuCount")) {
                this.opendashboardNodeHostOcpuCount(model.getOpendashboardNodeHostOcpuCount());
            }
            if (model.wasPropertyExplicitlySet("opendashboardNodeHostMemoryGB")) {
                this.opendashboardNodeHostMemoryGB(model.getOpendashboardNodeHostMemoryGB());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("vcnCompartmentId")) {
                this.vcnCompartmentId(model.getVcnCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("subnetCompartmentId")) {
                this.subnetCompartmentId(model.getSubnetCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("fqdn")) {
                this.fqdn(model.getFqdn());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomains")) {
                this.availabilityDomains(model.getAvailabilityDomains());
            }
            if (model.wasPropertyExplicitlySet("securityMode")) {
                this.securityMode(model.getSecurityMode());
            }
            if (model.wasPropertyExplicitlySet("securityMasterUserName")) {
                this.securityMasterUserName(model.getSecurityMasterUserName());
            }
            if (model.wasPropertyExplicitlySet("securityMasterUserPasswordHash")) {
                this.securityMasterUserPasswordHash(model.getSecurityMasterUserPasswordHash());
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

    /** The OCID of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the cluster.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The name of the cluster. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the cluster. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The OCID of the compartment where the cluster is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where the cluster is located.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The current state of the cluster. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Updating("UPDATING"),
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
    /** The current state of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the cluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The amount of time in milliseconds since the cluster was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The amount of time in milliseconds since the cluster was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The amount of time in milliseconds since the cluster was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The amount of time in milliseconds since the cluster was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The amount of time in milliseconds since the cluster was updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeleted")
    private final java.util.Date timeDeleted;

    /**
     * The amount of time in milliseconds since the cluster was updated.
     *
     * @return the value
     */
    public java.util.Date getTimeDeleted() {
        return timeDeleted;
    }

    /** Additional information about the current lifecycle state of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state of the cluster.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    /** The software version the cluster is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareVersion")
    private final String softwareVersion;

    /**
     * The software version the cluster is running.
     *
     * @return the value
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    /** The size in GB of the cluster's total storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageGB")
    private final Integer totalStorageGB;

    /**
     * The size in GB of the cluster's total storage.
     *
     * @return the value
     */
    public Integer getTotalStorageGB() {
        return totalStorageGB;
    }

    /** The fully qualified domain name (FQDN) for the cluster's API endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearchFqdn")
    private final String opensearchFqdn;

    /**
     * The fully qualified domain name (FQDN) for the cluster's API endpoint.
     *
     * @return the value
     */
    public String getOpensearchFqdn() {
        return opensearchFqdn;
    }

    /** The cluster's private IP address. */
    @com.fasterxml.jackson.annotation.JsonProperty("opensearchPrivateIp")
    private final String opensearchPrivateIp;

    /**
     * The cluster's private IP address.
     *
     * @return the value
     */
    public String getOpensearchPrivateIp() {
        return opensearchPrivateIp;
    }

    /**
     * The fully qualified domain name (FQDN) for the cluster's OpenSearch Dashboard API endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardFqdn")
    private final String opendashboardFqdn;

    /**
     * The fully qualified domain name (FQDN) for the cluster's OpenSearch Dashboard API endpoint.
     *
     * @return the value
     */
    public String getOpendashboardFqdn() {
        return opendashboardFqdn;
    }

    /** The private IP address for the cluster's OpenSearch Dashboard. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardPrivateIp")
    private final String opendashboardPrivateIp;

    /**
     * The private IP address for the cluster's OpenSearch Dashboard.
     *
     * @return the value
     */
    public String getOpendashboardPrivateIp() {
        return opendashboardPrivateIp;
    }

    /** The number of master nodes configured for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeCount")
    private final Integer masterNodeCount;

    /**
     * The number of master nodes configured for the cluster.
     *
     * @return the value
     */
    public Integer getMasterNodeCount() {
        return masterNodeCount;
    }

    /** The instance type for the cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostType")
    private final MasterNodeHostType masterNodeHostType;

    /**
     * The instance type for the cluster's master nodes.
     *
     * @return the value
     */
    public MasterNodeHostType getMasterNodeHostType() {
        return masterNodeHostType;
    }

    /** The bare metal shape for the cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostBareMetalShape")
    private final String masterNodeHostBareMetalShape;

    /**
     * The bare metal shape for the cluster's master nodes.
     *
     * @return the value
     */
    public String getMasterNodeHostBareMetalShape() {
        return masterNodeHostBareMetalShape;
    }

    /** The number of OCPUs configured for cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostOcpuCount")
    private final Integer masterNodeHostOcpuCount;

    /**
     * The number of OCPUs configured for cluster's master nodes.
     *
     * @return the value
     */
    public Integer getMasterNodeHostOcpuCount() {
        return masterNodeHostOcpuCount;
    }

    /** The amount of memory in GB, for the cluster's master nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterNodeHostMemoryGB")
    private final Integer masterNodeHostMemoryGB;

    /**
     * The amount of memory in GB, for the cluster's master nodes.
     *
     * @return the value
     */
    public Integer getMasterNodeHostMemoryGB() {
        return masterNodeHostMemoryGB;
    }

    /** The number of data nodes configured for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeCount")
    private final Integer dataNodeCount;

    /**
     * The number of data nodes configured for the cluster.
     *
     * @return the value
     */
    public Integer getDataNodeCount() {
        return dataNodeCount;
    }

    /** The instance type for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostType")
    private final DataNodeHostType dataNodeHostType;

    /**
     * The instance type for the cluster's data nodes.
     *
     * @return the value
     */
    public DataNodeHostType getDataNodeHostType() {
        return dataNodeHostType;
    }

    /** The bare metal shape for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostBareMetalShape")
    private final String dataNodeHostBareMetalShape;

    /**
     * The bare metal shape for the cluster's data nodes.
     *
     * @return the value
     */
    public String getDataNodeHostBareMetalShape() {
        return dataNodeHostBareMetalShape;
    }

    /** The number of OCPUs configured for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostOcpuCount")
    private final Integer dataNodeHostOcpuCount;

    /**
     * The number of OCPUs configured for the cluster's data nodes.
     *
     * @return the value
     */
    public Integer getDataNodeHostOcpuCount() {
        return dataNodeHostOcpuCount;
    }

    /** The amount of memory in GB, for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeHostMemoryGB")
    private final Integer dataNodeHostMemoryGB;

    /**
     * The amount of memory in GB, for the cluster's data nodes.
     *
     * @return the value
     */
    public Integer getDataNodeHostMemoryGB() {
        return dataNodeHostMemoryGB;
    }

    /** The amount of storage in GB, to configure per node for the cluster's data nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataNodeStorageGB")
    private final Integer dataNodeStorageGB;

    /**
     * The amount of storage in GB, to configure per node for the cluster's data nodes.
     *
     * @return the value
     */
    public Integer getDataNodeStorageGB() {
        return dataNodeStorageGB;
    }

    /** The number of OpenSearch Dashboard nodes configured for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeCount")
    private final Integer opendashboardNodeCount;

    /**
     * The number of OpenSearch Dashboard nodes configured for the cluster.
     *
     * @return the value
     */
    public Integer getOpendashboardNodeCount() {
        return opendashboardNodeCount;
    }

    /** The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostOcpuCount")
    private final Integer opendashboardNodeHostOcpuCount;

    /**
     * The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes.
     *
     * @return the value
     */
    public Integer getOpendashboardNodeHostOcpuCount() {
        return opendashboardNodeHostOcpuCount;
    }

    /** The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("opendashboardNodeHostMemoryGB")
    private final Integer opendashboardNodeHostMemoryGB;

    /**
     * The amount of memory in GB, for the cluster's OpenSearch Dashboard nodes.
     *
     * @return the value
     */
    public Integer getOpendashboardNodeHostMemoryGB() {
        return opendashboardNodeHostMemoryGB;
    }

    /** The OCID of the cluster's VCN. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The OCID of the cluster's VCN.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /** The OCID of the cluster's subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the cluster's subnet.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The OCID for the compartment where the cluster's VCN is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnCompartmentId")
    private final String vcnCompartmentId;

    /**
     * The OCID for the compartment where the cluster's VCN is located.
     *
     * @return the value
     */
    public String getVcnCompartmentId() {
        return vcnCompartmentId;
    }

    /** The OCID for the compartment where the cluster's subnet is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetCompartmentId")
    private final String subnetCompartmentId;

    /**
     * The OCID for the compartment where the cluster's subnet is located.
     *
     * @return the value
     */
    public String getSubnetCompartmentId() {
        return subnetCompartmentId;
    }

    /** The fully qualified domain name (FQDN) for the cluster's API endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("fqdn")
    private final String fqdn;

    /**
     * The fully qualified domain name (FQDN) for the cluster's API endpoint.
     *
     * @return the value
     */
    public String getFqdn() {
        return fqdn;
    }

    /** The availability domains to distribute the cluser nodes across. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomains")
    private final java.util.List<String> availabilityDomains;

    /**
     * The availability domains to distribute the cluser nodes across.
     *
     * @return the value
     */
    public java.util.List<String> getAvailabilityDomains() {
        return availabilityDomains;
    }

    /** The security mode of the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMode")
    private final SecurityMode securityMode;

    /**
     * The security mode of the cluster.
     *
     * @return the value
     */
    public SecurityMode getSecurityMode() {
        return securityMode;
    }

    /** The name of the master user that are used to manage security config */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserName")
    private final String securityMasterUserName;

    /**
     * The name of the master user that are used to manage security config
     *
     * @return the value
     */
    public String getSecurityMasterUserName() {
        return securityMasterUserName;
    }

    /** The password hash of the master user that are used to manage security config */
    @com.fasterxml.jackson.annotation.JsonProperty("securityMasterUserPasswordHash")
    private final String securityMasterUserPasswordHash;

    /**
     * The password hash of the master user that are used to manage security config
     *
     * @return the value
     */
    public String getSecurityMasterUserPasswordHash() {
        return securityMasterUserPasswordHash;
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
        sb.append("OpensearchCluster(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeDeleted=").append(String.valueOf(this.timeDeleted));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", softwareVersion=").append(String.valueOf(this.softwareVersion));
        sb.append(", totalStorageGB=").append(String.valueOf(this.totalStorageGB));
        sb.append(", opensearchFqdn=").append(String.valueOf(this.opensearchFqdn));
        sb.append(", opensearchPrivateIp=").append(String.valueOf(this.opensearchPrivateIp));
        sb.append(", opendashboardFqdn=").append(String.valueOf(this.opendashboardFqdn));
        sb.append(", opendashboardPrivateIp=").append(String.valueOf(this.opendashboardPrivateIp));
        sb.append(", masterNodeCount=").append(String.valueOf(this.masterNodeCount));
        sb.append(", masterNodeHostType=").append(String.valueOf(this.masterNodeHostType));
        sb.append(", masterNodeHostBareMetalShape=")
                .append(String.valueOf(this.masterNodeHostBareMetalShape));
        sb.append(", masterNodeHostOcpuCount=")
                .append(String.valueOf(this.masterNodeHostOcpuCount));
        sb.append(", masterNodeHostMemoryGB=").append(String.valueOf(this.masterNodeHostMemoryGB));
        sb.append(", dataNodeCount=").append(String.valueOf(this.dataNodeCount));
        sb.append(", dataNodeHostType=").append(String.valueOf(this.dataNodeHostType));
        sb.append(", dataNodeHostBareMetalShape=")
                .append(String.valueOf(this.dataNodeHostBareMetalShape));
        sb.append(", dataNodeHostOcpuCount=").append(String.valueOf(this.dataNodeHostOcpuCount));
        sb.append(", dataNodeHostMemoryGB=").append(String.valueOf(this.dataNodeHostMemoryGB));
        sb.append(", dataNodeStorageGB=").append(String.valueOf(this.dataNodeStorageGB));
        sb.append(", opendashboardNodeCount=").append(String.valueOf(this.opendashboardNodeCount));
        sb.append(", opendashboardNodeHostOcpuCount=")
                .append(String.valueOf(this.opendashboardNodeHostOcpuCount));
        sb.append(", opendashboardNodeHostMemoryGB=")
                .append(String.valueOf(this.opendashboardNodeHostMemoryGB));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", vcnCompartmentId=").append(String.valueOf(this.vcnCompartmentId));
        sb.append(", subnetCompartmentId=").append(String.valueOf(this.subnetCompartmentId));
        sb.append(", fqdn=").append(String.valueOf(this.fqdn));
        sb.append(", availabilityDomains=").append(String.valueOf(this.availabilityDomains));
        sb.append(", securityMode=").append(String.valueOf(this.securityMode));
        sb.append(", securityMasterUserName=").append(String.valueOf(this.securityMasterUserName));
        sb.append(", securityMasterUserPasswordHash=")
                .append(String.valueOf(this.securityMasterUserPasswordHash));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpensearchCluster)) {
            return false;
        }

        OpensearchCluster other = (OpensearchCluster) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeDeleted, other.timeDeleted)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.softwareVersion, other.softwareVersion)
                && java.util.Objects.equals(this.totalStorageGB, other.totalStorageGB)
                && java.util.Objects.equals(this.opensearchFqdn, other.opensearchFqdn)
                && java.util.Objects.equals(this.opensearchPrivateIp, other.opensearchPrivateIp)
                && java.util.Objects.equals(this.opendashboardFqdn, other.opendashboardFqdn)
                && java.util.Objects.equals(
                        this.opendashboardPrivateIp, other.opendashboardPrivateIp)
                && java.util.Objects.equals(this.masterNodeCount, other.masterNodeCount)
                && java.util.Objects.equals(this.masterNodeHostType, other.masterNodeHostType)
                && java.util.Objects.equals(
                        this.masterNodeHostBareMetalShape, other.masterNodeHostBareMetalShape)
                && java.util.Objects.equals(
                        this.masterNodeHostOcpuCount, other.masterNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.masterNodeHostMemoryGB, other.masterNodeHostMemoryGB)
                && java.util.Objects.equals(this.dataNodeCount, other.dataNodeCount)
                && java.util.Objects.equals(this.dataNodeHostType, other.dataNodeHostType)
                && java.util.Objects.equals(
                        this.dataNodeHostBareMetalShape, other.dataNodeHostBareMetalShape)
                && java.util.Objects.equals(this.dataNodeHostOcpuCount, other.dataNodeHostOcpuCount)
                && java.util.Objects.equals(this.dataNodeHostMemoryGB, other.dataNodeHostMemoryGB)
                && java.util.Objects.equals(this.dataNodeStorageGB, other.dataNodeStorageGB)
                && java.util.Objects.equals(
                        this.opendashboardNodeCount, other.opendashboardNodeCount)
                && java.util.Objects.equals(
                        this.opendashboardNodeHostOcpuCount, other.opendashboardNodeHostOcpuCount)
                && java.util.Objects.equals(
                        this.opendashboardNodeHostMemoryGB, other.opendashboardNodeHostMemoryGB)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.vcnCompartmentId, other.vcnCompartmentId)
                && java.util.Objects.equals(this.subnetCompartmentId, other.subnetCompartmentId)
                && java.util.Objects.equals(this.fqdn, other.fqdn)
                && java.util.Objects.equals(this.availabilityDomains, other.availabilityDomains)
                && java.util.Objects.equals(this.securityMode, other.securityMode)
                && java.util.Objects.equals(
                        this.securityMasterUserName, other.securityMasterUserName)
                && java.util.Objects.equals(
                        this.securityMasterUserPasswordHash, other.securityMasterUserPasswordHash)
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
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeDeleted == null ? 43 : this.timeDeleted.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareVersion == null ? 43 : this.softwareVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.totalStorageGB == null ? 43 : this.totalStorageGB.hashCode());
        result =
                (result * PRIME)
                        + (this.opensearchFqdn == null ? 43 : this.opensearchFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.opensearchPrivateIp == null
                                ? 43
                                : this.opensearchPrivateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardFqdn == null ? 43 : this.opendashboardFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardPrivateIp == null
                                ? 43
                                : this.opendashboardPrivateIp.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeCount == null ? 43 : this.masterNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeHostType == null
                                ? 43
                                : this.masterNodeHostType.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeHostBareMetalShape == null
                                ? 43
                                : this.masterNodeHostBareMetalShape.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeHostOcpuCount == null
                                ? 43
                                : this.masterNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.masterNodeHostMemoryGB == null
                                ? 43
                                : this.masterNodeHostMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeCount == null ? 43 : this.dataNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeHostType == null ? 43 : this.dataNodeHostType.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeHostBareMetalShape == null
                                ? 43
                                : this.dataNodeHostBareMetalShape.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeHostOcpuCount == null
                                ? 43
                                : this.dataNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeHostMemoryGB == null
                                ? 43
                                : this.dataNodeHostMemoryGB.hashCode());
        result =
                (result * PRIME)
                        + (this.dataNodeStorageGB == null ? 43 : this.dataNodeStorageGB.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardNodeCount == null
                                ? 43
                                : this.opendashboardNodeCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardNodeHostOcpuCount == null
                                ? 43
                                : this.opendashboardNodeHostOcpuCount.hashCode());
        result =
                (result * PRIME)
                        + (this.opendashboardNodeHostMemoryGB == null
                                ? 43
                                : this.opendashboardNodeHostMemoryGB.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.vcnCompartmentId == null ? 43 : this.vcnCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.subnetCompartmentId == null
                                ? 43
                                : this.subnetCompartmentId.hashCode());
        result = (result * PRIME) + (this.fqdn == null ? 43 : this.fqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomains == null
                                ? 43
                                : this.availabilityDomains.hashCode());
        result = (result * PRIME) + (this.securityMode == null ? 43 : this.securityMode.hashCode());
        result =
                (result * PRIME)
                        + (this.securityMasterUserName == null
                                ? 43
                                : this.securityMasterUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.securityMasterUserPasswordHash == null
                                ? 43
                                : this.securityMasterUserPasswordHash.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
