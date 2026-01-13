/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of a cloud cluster instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CloudClusterInstanceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CloudClusterInstanceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "dbaasId",
        "displayName",
        "componentName",
        "compartmentId",
        "cloudClusterId",
        "cloudDbSystemId",
        "cloudDbNodeId",
        "cloudConnectorId",
        "hostName",
        "nodeRole",
        "crsBaseDirectory",
        "adrHomeDirectory",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CloudClusterInstanceSummary(
            String id,
            String dbaasId,
            String displayName,
            String componentName,
            String compartmentId,
            String cloudClusterId,
            String cloudDbSystemId,
            String cloudDbNodeId,
            String cloudConnectorId,
            String hostName,
            CloudClusterInstance.NodeRole nodeRole,
            String crsBaseDirectory,
            String adrHomeDirectory,
            CloudClusterInstance.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.dbaasId = dbaasId;
        this.displayName = displayName;
        this.componentName = componentName;
        this.compartmentId = compartmentId;
        this.cloudClusterId = cloudClusterId;
        this.cloudDbSystemId = cloudDbSystemId;
        this.cloudDbNodeId = cloudDbNodeId;
        this.cloudConnectorId = cloudConnectorId;
        this.hostName = hostName;
        this.nodeRole = nodeRole;
        this.crsBaseDirectory = crsBaseDirectory;
        this.adrHomeDirectory = adrHomeDirectory;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud cluster instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud cluster instance.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in
         * DBaas service.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbaasId")
        private String dbaasId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in
         * DBaas service.
         *
         * @param dbaasId the value to set
         * @return this builder
         */
        public Builder dbaasId(String dbaasId) {
            this.dbaasId = dbaasId;
            this.__explicitlySet__.add("dbaasId");
            return this;
        }
        /** The user-friendly name for the cluster instance. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the cluster instance. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The name of the cloud cluster instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("componentName")
        private String componentName;

        /**
         * The name of the cloud cluster instance.
         *
         * @param componentName the value to set
         * @return this builder
         */
        public Builder componentName(String componentName) {
            this.componentName = componentName;
            this.__explicitlySet__.add("componentName");
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud cluster that the cluster instance belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudClusterId")
        private String cloudClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud cluster that the cluster instance belongs to.
         *
         * @param cloudClusterId the value to set
         * @return this builder
         */
        public Builder cloudClusterId(String cloudClusterId) {
            this.cloudClusterId = cloudClusterId;
            this.__explicitlySet__.add("cloudClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB system that the cluster instance is a part of.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudDbSystemId")
        private String cloudDbSystemId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB system that the cluster instance is a part of.
         *
         * @param cloudDbSystemId the value to set
         * @return this builder
         */
        public Builder cloudDbSystemId(String cloudDbSystemId) {
            this.cloudDbSystemId = cloudDbSystemId;
            this.__explicitlySet__.add("cloudDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB node.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudDbNodeId")
        private String cloudDbNodeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud DB node.
         *
         * @param cloudDbNodeId the value to set
         * @return this builder
         */
        public Builder cloudDbNodeId(String cloudDbNodeId) {
            this.cloudDbNodeId = cloudDbNodeId;
            this.__explicitlySet__.add("cloudDbNodeId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud connector.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudConnectorId")
        private String cloudConnectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud connector.
         *
         * @param cloudConnectorId the value to set
         * @return this builder
         */
        public Builder cloudConnectorId(String cloudConnectorId) {
            this.cloudConnectorId = cloudConnectorId;
            this.__explicitlySet__.add("cloudConnectorId");
            return this;
        }
        /** The name of the host on which the cluster instance is running. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The name of the host on which the cluster instance is running.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The role of the cluster node. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeRole")
        private CloudClusterInstance.NodeRole nodeRole;

        /**
         * The role of the cluster node.
         *
         * @param nodeRole the value to set
         * @return this builder
         */
        public Builder nodeRole(CloudClusterInstance.NodeRole nodeRole) {
            this.nodeRole = nodeRole;
            this.__explicitlySet__.add("nodeRole");
            return this;
        }
        /** The Oracle base location of Cluster Ready Services (CRS). */
        @com.fasterxml.jackson.annotation.JsonProperty("crsBaseDirectory")
        private String crsBaseDirectory;

        /**
         * The Oracle base location of Cluster Ready Services (CRS).
         *
         * @param crsBaseDirectory the value to set
         * @return this builder
         */
        public Builder crsBaseDirectory(String crsBaseDirectory) {
            this.crsBaseDirectory = crsBaseDirectory;
            this.__explicitlySet__.add("crsBaseDirectory");
            return this;
        }
        /** The Automatic Diagnostic Repository (ADR) home directory for the cluster instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
        private String adrHomeDirectory;

        /**
         * The Automatic Diagnostic Repository (ADR) home directory for the cluster instance.
         *
         * @param adrHomeDirectory the value to set
         * @return this builder
         */
        public Builder adrHomeDirectory(String adrHomeDirectory) {
            this.adrHomeDirectory = adrHomeDirectory;
            this.__explicitlySet__.add("adrHomeDirectory");
            return this;
        }
        /** The current lifecycle state of the cloud cluster instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CloudClusterInstance.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the cloud cluster instance.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(CloudClusterInstance.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Additional information about the current lifecycle state. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The date and time the cloud cluster instance was created. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the cloud cluster instance was created.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the cloud cluster instance was last updated. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the cloud cluster instance was last updated.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System
         * tags can be viewed by users, but can only be created by the system.
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

        public CloudClusterInstanceSummary build() {
            CloudClusterInstanceSummary model =
                    new CloudClusterInstanceSummary(
                            this.id,
                            this.dbaasId,
                            this.displayName,
                            this.componentName,
                            this.compartmentId,
                            this.cloudClusterId,
                            this.cloudDbSystemId,
                            this.cloudDbNodeId,
                            this.cloudConnectorId,
                            this.hostName,
                            this.nodeRole,
                            this.crsBaseDirectory,
                            this.adrHomeDirectory,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudClusterInstanceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("dbaasId")) {
                this.dbaasId(model.getDbaasId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("componentName")) {
                this.componentName(model.getComponentName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("cloudClusterId")) {
                this.cloudClusterId(model.getCloudClusterId());
            }
            if (model.wasPropertyExplicitlySet("cloudDbSystemId")) {
                this.cloudDbSystemId(model.getCloudDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("cloudDbNodeId")) {
                this.cloudDbNodeId(model.getCloudDbNodeId());
            }
            if (model.wasPropertyExplicitlySet("cloudConnectorId")) {
                this.cloudConnectorId(model.getCloudConnectorId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("nodeRole")) {
                this.nodeRole(model.getNodeRole());
            }
            if (model.wasPropertyExplicitlySet("crsBaseDirectory")) {
                this.crsBaseDirectory(model.getCrsBaseDirectory());
            }
            if (model.wasPropertyExplicitlySet("adrHomeDirectory")) {
                this.adrHomeDirectory(model.getAdrHomeDirectory());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * cloud cluster instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud cluster instance.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in DBaas
     * service.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbaasId")
    private final String dbaasId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) in DBaas
     * service.
     *
     * @return the value
     */
    public String getDbaasId() {
        return dbaasId;
    }

    /** The user-friendly name for the cluster instance. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the cluster instance. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The name of the cloud cluster instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("componentName")
    private final String componentName;

    /**
     * The name of the cloud cluster instance.
     *
     * @return the value
     */
    public String getComponentName() {
        return componentName;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud cluster that the cluster instance belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudClusterId")
    private final String cloudClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud cluster that the cluster instance belongs to.
     *
     * @return the value
     */
    public String getCloudClusterId() {
        return cloudClusterId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB system that the cluster instance is a part of.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudDbSystemId")
    private final String cloudDbSystemId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB system that the cluster instance is a part of.
     *
     * @return the value
     */
    public String getCloudDbSystemId() {
        return cloudDbSystemId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB node.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudDbNodeId")
    private final String cloudDbNodeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud DB node.
     *
     * @return the value
     */
    public String getCloudDbNodeId() {
        return cloudDbNodeId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudConnectorId")
    private final String cloudConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud connector.
     *
     * @return the value
     */
    public String getCloudConnectorId() {
        return cloudConnectorId;
    }

    /** The name of the host on which the cluster instance is running. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The name of the host on which the cluster instance is running.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The role of the cluster node. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeRole")
    private final CloudClusterInstance.NodeRole nodeRole;

    /**
     * The role of the cluster node.
     *
     * @return the value
     */
    public CloudClusterInstance.NodeRole getNodeRole() {
        return nodeRole;
    }

    /** The Oracle base location of Cluster Ready Services (CRS). */
    @com.fasterxml.jackson.annotation.JsonProperty("crsBaseDirectory")
    private final String crsBaseDirectory;

    /**
     * The Oracle base location of Cluster Ready Services (CRS).
     *
     * @return the value
     */
    public String getCrsBaseDirectory() {
        return crsBaseDirectory;
    }

    /** The Automatic Diagnostic Repository (ADR) home directory for the cluster instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("adrHomeDirectory")
    private final String adrHomeDirectory;

    /**
     * The Automatic Diagnostic Repository (ADR) home directory for the cluster instance.
     *
     * @return the value
     */
    public String getAdrHomeDirectory() {
        return adrHomeDirectory;
    }

    /** The current lifecycle state of the cloud cluster instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CloudClusterInstance.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the cloud cluster instance.
     *
     * @return the value
     */
    public CloudClusterInstance.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Additional information about the current lifecycle state. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The date and time the cloud cluster instance was created. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the cloud cluster instance was created.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the cloud cluster instance was last updated. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the cloud cluster instance was last updated.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). System tags
     * can be viewed by users, but can only be created by the system.
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
        sb.append("CloudClusterInstanceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", dbaasId=").append(String.valueOf(this.dbaasId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", componentName=").append(String.valueOf(this.componentName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", cloudClusterId=").append(String.valueOf(this.cloudClusterId));
        sb.append(", cloudDbSystemId=").append(String.valueOf(this.cloudDbSystemId));
        sb.append(", cloudDbNodeId=").append(String.valueOf(this.cloudDbNodeId));
        sb.append(", cloudConnectorId=").append(String.valueOf(this.cloudConnectorId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", nodeRole=").append(String.valueOf(this.nodeRole));
        sb.append(", crsBaseDirectory=").append(String.valueOf(this.crsBaseDirectory));
        sb.append(", adrHomeDirectory=").append(String.valueOf(this.adrHomeDirectory));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof CloudClusterInstanceSummary)) {
            return false;
        }

        CloudClusterInstanceSummary other = (CloudClusterInstanceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.dbaasId, other.dbaasId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.componentName, other.componentName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.cloudClusterId, other.cloudClusterId)
                && java.util.Objects.equals(this.cloudDbSystemId, other.cloudDbSystemId)
                && java.util.Objects.equals(this.cloudDbNodeId, other.cloudDbNodeId)
                && java.util.Objects.equals(this.cloudConnectorId, other.cloudConnectorId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.nodeRole, other.nodeRole)
                && java.util.Objects.equals(this.crsBaseDirectory, other.crsBaseDirectory)
                && java.util.Objects.equals(this.adrHomeDirectory, other.adrHomeDirectory)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
        result = (result * PRIME) + (this.dbaasId == null ? 43 : this.dbaasId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.componentName == null ? 43 : this.componentName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudClusterId == null ? 43 : this.cloudClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudDbSystemId == null ? 43 : this.cloudDbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudDbNodeId == null ? 43 : this.cloudDbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudConnectorId == null ? 43 : this.cloudConnectorId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.nodeRole == null ? 43 : this.nodeRole.hashCode());
        result =
                (result * PRIME)
                        + (this.crsBaseDirectory == null ? 43 : this.crsBaseDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.adrHomeDirectory == null ? 43 : this.adrHomeDirectory.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
