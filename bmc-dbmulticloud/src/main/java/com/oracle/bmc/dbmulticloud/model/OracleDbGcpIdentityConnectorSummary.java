/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Oracle DB GCP Identity Connector resource summary. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OracleDbGcpIdentityConnectorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleDbGcpIdentityConnectorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "issuerUrl",
        "projectId",
        "resourceId",
        "gcpLocation",
        "gcpWorkloadIdentityPoolId",
        "gcpWorkloadIdentityProviderId",
        "gcpResourceServiceAgentId",
        "gcpNodes",
        "gcpIdentityConnectivityStatus",
        "lifecycleState",
        "lifecycleStateDetails",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public OracleDbGcpIdentityConnectorSummary(
            String id,
            String displayName,
            String compartmentId,
            String issuerUrl,
            String projectId,
            String resourceId,
            String gcpLocation,
            String gcpWorkloadIdentityPoolId,
            String gcpWorkloadIdentityProviderId,
            String gcpResourceServiceAgentId,
            java.util.List<GcpNodes> gcpNodes,
            OracleDbGcpIdentityConnector.GcpIdentityConnectivityStatus
                    gcpIdentityConnectivityStatus,
            OracleDbGcpIdentityConnector.LifecycleState lifecycleState,
            String lifecycleStateDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.issuerUrl = issuerUrl;
        this.projectId = projectId;
        this.resourceId = resourceId;
        this.gcpLocation = gcpLocation;
        this.gcpWorkloadIdentityPoolId = gcpWorkloadIdentityPoolId;
        this.gcpWorkloadIdentityProviderId = gcpWorkloadIdentityProviderId;
        this.gcpResourceServiceAgentId = gcpResourceServiceAgentId;
        this.gcpNodes = gcpNodes;
        this.gcpIdentityConnectivityStatus = gcpIdentityConnectivityStatus;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
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
         * Oracle DB GCP Identity Connector resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB GCP Identity Connector resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Oracle DB GCP Identity Connector resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Oracle DB GCP Identity Connector resource name.
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
         * compartment that contains the Oracle DB GCP Identity Connector resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment that contains the Oracle DB GCP Identity Connector resource.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OIDC token issuer Url */
        @com.fasterxml.jackson.annotation.JsonProperty("issuerUrl")
        private String issuerUrl;

        /**
         * OIDC token issuer Url
         *
         * @param issuerUrl the value to set
         * @return this builder
         */
        public Builder issuerUrl(String issuerUrl) {
            this.issuerUrl = issuerUrl;
            this.__explicitlySet__.add("issuerUrl");
            return this;
        }
        /** Project id of the customer project. */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * Project id of the customer project.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * GCP VM Cluster resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * GCP VM Cluster resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** GCP Location. */
        @com.fasterxml.jackson.annotation.JsonProperty("gcpLocation")
        private String gcpLocation;

        /**
         * GCP Location.
         *
         * @param gcpLocation the value to set
         * @return this builder
         */
        public Builder gcpLocation(String gcpLocation) {
            this.gcpLocation = gcpLocation;
            this.__explicitlySet__.add("gcpLocation");
            return this;
        }
        /** The ID of the cloud GCP Workload Identity Pool. */
        @com.fasterxml.jackson.annotation.JsonProperty("gcpWorkloadIdentityPoolId")
        private String gcpWorkloadIdentityPoolId;

        /**
         * The ID of the cloud GCP Workload Identity Pool.
         *
         * @param gcpWorkloadIdentityPoolId the value to set
         * @return this builder
         */
        public Builder gcpWorkloadIdentityPoolId(String gcpWorkloadIdentityPoolId) {
            this.gcpWorkloadIdentityPoolId = gcpWorkloadIdentityPoolId;
            this.__explicitlySet__.add("gcpWorkloadIdentityPoolId");
            return this;
        }
        /** The ID of the GCP Workload Identity Provider. */
        @com.fasterxml.jackson.annotation.JsonProperty("gcpWorkloadIdentityProviderId")
        private String gcpWorkloadIdentityProviderId;

        /**
         * The ID of the GCP Workload Identity Provider.
         *
         * @param gcpWorkloadIdentityProviderId the value to set
         * @return this builder
         */
        public Builder gcpWorkloadIdentityProviderId(String gcpWorkloadIdentityProviderId) {
            this.gcpWorkloadIdentityProviderId = gcpWorkloadIdentityProviderId;
            this.__explicitlySet__.add("gcpWorkloadIdentityProviderId");
            return this;
        }
        /** The ID of the GCP resource service agent. */
        @com.fasterxml.jackson.annotation.JsonProperty("gcpResourceServiceAgentId")
        private String gcpResourceServiceAgentId;

        /**
         * The ID of the GCP resource service agent.
         *
         * @param gcpResourceServiceAgentId the value to set
         * @return this builder
         */
        public Builder gcpResourceServiceAgentId(String gcpResourceServiceAgentId) {
            this.gcpResourceServiceAgentId = gcpResourceServiceAgentId;
            this.__explicitlySet__.add("gcpResourceServiceAgentId");
            return this;
        }
        /** List of All VMs where GCP Identity Connector is configured for this VMCluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("gcpNodes")
        private java.util.List<GcpNodes> gcpNodes;

        /**
         * List of All VMs where GCP Identity Connector is configured for this VMCluster.
         *
         * @param gcpNodes the value to set
         * @return this builder
         */
        public Builder gcpNodes(java.util.List<GcpNodes> gcpNodes) {
            this.gcpNodes = gcpNodes;
            this.__explicitlySet__.add("gcpNodes");
            return this;
        }
        /** The current lifecycle state of the GCP Identity Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("gcpIdentityConnectivityStatus")
        private OracleDbGcpIdentityConnector.GcpIdentityConnectivityStatus
                gcpIdentityConnectivityStatus;

        /**
         * The current lifecycle state of the GCP Identity Connector resource.
         *
         * @param gcpIdentityConnectivityStatus the value to set
         * @return this builder
         */
        public Builder gcpIdentityConnectivityStatus(
                OracleDbGcpIdentityConnector.GcpIdentityConnectivityStatus
                        gcpIdentityConnectivityStatus) {
            this.gcpIdentityConnectivityStatus = gcpIdentityConnectivityStatus;
            this.__explicitlySet__.add("gcpIdentityConnectivityStatus");
            return this;
        }
        /** The current lifecycle state of the GCP Identity Connector resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private OracleDbGcpIdentityConnector.LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the GCP Identity Connector resource.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(OracleDbGcpIdentityConnector.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Description of the current lifecycle state in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * Description of the current lifecycle state in more detail.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /**
         * Time when the Oracle DB GCP Identity Connector resource was created expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time when the Oracle DB GCP Identity Connector resource was created expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
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
         * Time when the Oracle DB GCP Identity Connector resource was last modified expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Time when the Oracle DB GCP Identity Connector resource was last modified expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'
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

        public OracleDbGcpIdentityConnectorSummary build() {
            OracleDbGcpIdentityConnectorSummary model =
                    new OracleDbGcpIdentityConnectorSummary(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.issuerUrl,
                            this.projectId,
                            this.resourceId,
                            this.gcpLocation,
                            this.gcpWorkloadIdentityPoolId,
                            this.gcpWorkloadIdentityProviderId,
                            this.gcpResourceServiceAgentId,
                            this.gcpNodes,
                            this.gcpIdentityConnectivityStatus,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
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
        public Builder copy(OracleDbGcpIdentityConnectorSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("issuerUrl")) {
                this.issuerUrl(model.getIssuerUrl());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("gcpLocation")) {
                this.gcpLocation(model.getGcpLocation());
            }
            if (model.wasPropertyExplicitlySet("gcpWorkloadIdentityPoolId")) {
                this.gcpWorkloadIdentityPoolId(model.getGcpWorkloadIdentityPoolId());
            }
            if (model.wasPropertyExplicitlySet("gcpWorkloadIdentityProviderId")) {
                this.gcpWorkloadIdentityProviderId(model.getGcpWorkloadIdentityProviderId());
            }
            if (model.wasPropertyExplicitlySet("gcpResourceServiceAgentId")) {
                this.gcpResourceServiceAgentId(model.getGcpResourceServiceAgentId());
            }
            if (model.wasPropertyExplicitlySet("gcpNodes")) {
                this.gcpNodes(model.getGcpNodes());
            }
            if (model.wasPropertyExplicitlySet("gcpIdentityConnectivityStatus")) {
                this.gcpIdentityConnectivityStatus(model.getGcpIdentityConnectivityStatus());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
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
     * Oracle DB GCP Identity Connector resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB GCP Identity Connector resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Oracle DB GCP Identity Connector resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Oracle DB GCP Identity Connector resource name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Oracle DB GCP Identity Connector resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment that contains the Oracle DB GCP Identity Connector resource.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OIDC token issuer Url */
    @com.fasterxml.jackson.annotation.JsonProperty("issuerUrl")
    private final String issuerUrl;

    /**
     * OIDC token issuer Url
     *
     * @return the value
     */
    public String getIssuerUrl() {
        return issuerUrl;
    }

    /** Project id of the customer project. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * Project id of the customer project.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the GCP
     * VM Cluster resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the GCP
     * VM Cluster resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** GCP Location. */
    @com.fasterxml.jackson.annotation.JsonProperty("gcpLocation")
    private final String gcpLocation;

    /**
     * GCP Location.
     *
     * @return the value
     */
    public String getGcpLocation() {
        return gcpLocation;
    }

    /** The ID of the cloud GCP Workload Identity Pool. */
    @com.fasterxml.jackson.annotation.JsonProperty("gcpWorkloadIdentityPoolId")
    private final String gcpWorkloadIdentityPoolId;

    /**
     * The ID of the cloud GCP Workload Identity Pool.
     *
     * @return the value
     */
    public String getGcpWorkloadIdentityPoolId() {
        return gcpWorkloadIdentityPoolId;
    }

    /** The ID of the GCP Workload Identity Provider. */
    @com.fasterxml.jackson.annotation.JsonProperty("gcpWorkloadIdentityProviderId")
    private final String gcpWorkloadIdentityProviderId;

    /**
     * The ID of the GCP Workload Identity Provider.
     *
     * @return the value
     */
    public String getGcpWorkloadIdentityProviderId() {
        return gcpWorkloadIdentityProviderId;
    }

    /** The ID of the GCP resource service agent. */
    @com.fasterxml.jackson.annotation.JsonProperty("gcpResourceServiceAgentId")
    private final String gcpResourceServiceAgentId;

    /**
     * The ID of the GCP resource service agent.
     *
     * @return the value
     */
    public String getGcpResourceServiceAgentId() {
        return gcpResourceServiceAgentId;
    }

    /** List of All VMs where GCP Identity Connector is configured for this VMCluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("gcpNodes")
    private final java.util.List<GcpNodes> gcpNodes;

    /**
     * List of All VMs where GCP Identity Connector is configured for this VMCluster.
     *
     * @return the value
     */
    public java.util.List<GcpNodes> getGcpNodes() {
        return gcpNodes;
    }

    /** The current lifecycle state of the GCP Identity Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("gcpIdentityConnectivityStatus")
    private final OracleDbGcpIdentityConnector.GcpIdentityConnectivityStatus
            gcpIdentityConnectivityStatus;

    /**
     * The current lifecycle state of the GCP Identity Connector resource.
     *
     * @return the value
     */
    public OracleDbGcpIdentityConnector.GcpIdentityConnectivityStatus
            getGcpIdentityConnectivityStatus() {
        return gcpIdentityConnectivityStatus;
    }

    /** The current lifecycle state of the GCP Identity Connector resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final OracleDbGcpIdentityConnector.LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the GCP Identity Connector resource.
     *
     * @return the value
     */
    public OracleDbGcpIdentityConnector.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Description of the current lifecycle state in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * Description of the current lifecycle state in more detail.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /**
     * Time when the Oracle DB GCP Identity Connector resource was created expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time when the Oracle DB GCP Identity Connector resource was created expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * Time when the Oracle DB GCP Identity Connector resource was last modified expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Time when the Oracle DB GCP Identity Connector resource was last modified expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format, e.g. '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("OracleDbGcpIdentityConnectorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", issuerUrl=").append(String.valueOf(this.issuerUrl));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", gcpLocation=").append(String.valueOf(this.gcpLocation));
        sb.append(", gcpWorkloadIdentityPoolId=")
                .append(String.valueOf(this.gcpWorkloadIdentityPoolId));
        sb.append(", gcpWorkloadIdentityProviderId=")
                .append(String.valueOf(this.gcpWorkloadIdentityProviderId));
        sb.append(", gcpResourceServiceAgentId=")
                .append(String.valueOf(this.gcpResourceServiceAgentId));
        sb.append(", gcpNodes=").append(String.valueOf(this.gcpNodes));
        sb.append(", gcpIdentityConnectivityStatus=")
                .append(String.valueOf(this.gcpIdentityConnectivityStatus));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
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
        if (!(o instanceof OracleDbGcpIdentityConnectorSummary)) {
            return false;
        }

        OracleDbGcpIdentityConnectorSummary other = (OracleDbGcpIdentityConnectorSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.issuerUrl, other.issuerUrl)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.gcpLocation, other.gcpLocation)
                && java.util.Objects.equals(
                        this.gcpWorkloadIdentityPoolId, other.gcpWorkloadIdentityPoolId)
                && java.util.Objects.equals(
                        this.gcpWorkloadIdentityProviderId, other.gcpWorkloadIdentityProviderId)
                && java.util.Objects.equals(
                        this.gcpResourceServiceAgentId, other.gcpResourceServiceAgentId)
                && java.util.Objects.equals(this.gcpNodes, other.gcpNodes)
                && java.util.Objects.equals(
                        this.gcpIdentityConnectivityStatus, other.gcpIdentityConnectivityStatus)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
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
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.issuerUrl == null ? 43 : this.issuerUrl.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.gcpLocation == null ? 43 : this.gcpLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.gcpWorkloadIdentityPoolId == null
                                ? 43
                                : this.gcpWorkloadIdentityPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.gcpWorkloadIdentityProviderId == null
                                ? 43
                                : this.gcpWorkloadIdentityProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.gcpResourceServiceAgentId == null
                                ? 43
                                : this.gcpResourceServiceAgentId.hashCode());
        result = (result * PRIME) + (this.gcpNodes == null ? 43 : this.gcpNodes.hashCode());
        result =
                (result * PRIME)
                        + (this.gcpIdentityConnectivityStatus == null
                                ? 43
                                : this.gcpIdentityConnectivityStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
