/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.model;

/**
 * Creates Oracle DB GCP Identity Connector resource. <br>
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
        builder = CreateOracleDbGcpIdentityConnectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleDbGcpIdentityConnectorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "issuerUrl",
        "projectId",
        "resourceId",
        "gcpLocation",
        "gcpWorkloadIdentityPoolId",
        "gcpWorkloadIdentityProviderId",
        "gcpResourceServiceAgentId",
        "freeformTags",
        "definedTags"
    })
    public CreateOracleDbGcpIdentityConnectorDetails(
            String displayName,
            String compartmentId,
            String issuerUrl,
            String projectId,
            String resourceId,
            String gcpLocation,
            String gcpWorkloadIdentityPoolId,
            String gcpWorkloadIdentityProviderId,
            String gcpResourceServiceAgentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.issuerUrl = issuerUrl;
        this.projectId = projectId;
        this.resourceId = resourceId;
        this.gcpLocation = gcpLocation;
        this.gcpWorkloadIdentityPoolId = gcpWorkloadIdentityPoolId;
        this.gcpWorkloadIdentityProviderId = gcpWorkloadIdentityProviderId;
        this.gcpResourceServiceAgentId = gcpResourceServiceAgentId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Oracle DB Google GCP Identity Connector resource name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Oracle DB Google GCP Identity Connector resource name.
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

        public CreateOracleDbGcpIdentityConnectorDetails build() {
            CreateOracleDbGcpIdentityConnectorDetails model =
                    new CreateOracleDbGcpIdentityConnectorDetails(
                            this.displayName,
                            this.compartmentId,
                            this.issuerUrl,
                            this.projectId,
                            this.resourceId,
                            this.gcpLocation,
                            this.gcpWorkloadIdentityPoolId,
                            this.gcpWorkloadIdentityProviderId,
                            this.gcpResourceServiceAgentId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleDbGcpIdentityConnectorDetails model) {
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

    /** Oracle DB Google GCP Identity Connector resource name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Oracle DB Google GCP Identity Connector resource name.
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
        sb.append("CreateOracleDbGcpIdentityConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
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
        if (!(o instanceof CreateOracleDbGcpIdentityConnectorDetails)) {
            return false;
        }

        CreateOracleDbGcpIdentityConnectorDetails other =
                (CreateOracleDbGcpIdentityConnectorDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
