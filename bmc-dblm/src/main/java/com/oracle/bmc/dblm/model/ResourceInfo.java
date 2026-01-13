/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dblm.model;

/**
 * The Resource Info. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240102")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceInfo extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "resourceCompartmentId",
        "resourceName",
        "resourceId",
        "resourceType",
        "deploymentType",
        "connectorId",
        "isClusterDb",
        "hostInfo",
        "dbVersion",
        "dbPlatformType",
        "licenseType",
        "agentId"
    })
    public ResourceInfo(
            String resourceCompartmentId,
            String resourceName,
            String resourceId,
            String resourceType,
            String deploymentType,
            String connectorId,
            Boolean isClusterDb,
            java.util.List<HostInfo> hostInfo,
            String dbVersion,
            String dbPlatformType,
            String licenseType,
            String agentId) {
        super();
        this.resourceCompartmentId = resourceCompartmentId;
        this.resourceName = resourceName;
        this.resourceId = resourceId;
        this.resourceType = resourceType;
        this.deploymentType = deploymentType;
        this.connectorId = connectorId;
        this.isClusterDb = isClusterDb;
        this.hostInfo = hostInfo;
        this.dbVersion = dbVersion;
        this.dbPlatformType = dbPlatformType;
        this.licenseType = licenseType;
        this.agentId = agentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The compartmentId of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        /**
         * The compartmentId of the resource.
         *
         * @param resourceCompartmentId the value to set
         * @return this builder
         */
        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }
        /** The name of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
        private String resourceName;

        /**
         * The name of the resource.
         *
         * @param resourceName the value to set
         * @return this builder
         */
        public Builder resourceName(String resourceName) {
            this.resourceName = resourceName;
            this.__explicitlySet__.add("resourceName");
            return this;
        }
        /** The Id of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
        private String resourceId;

        /**
         * The Id of the resource.
         *
         * @param resourceId the value to set
         * @return this builder
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            this.__explicitlySet__.add("resourceId");
            return this;
        }
        /** The type of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
        private String resourceType;

        /**
         * The type of the resource.
         *
         * @param resourceType the value to set
         * @return this builder
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            this.__explicitlySet__.add("resourceType");
            return this;
        }
        /** The deployment type of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private String deploymentType;

        /**
         * The deployment type of the resource.
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(String deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /** The connector Id of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * The connector Id of the resource.
         *
         * @param connectorId the value to set
         * @return this builder
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /** True if it is a cluster db. */
        @com.fasterxml.jackson.annotation.JsonProperty("isClusterDb")
        private Boolean isClusterDb;

        /**
         * True if it is a cluster db.
         *
         * @param isClusterDb the value to set
         * @return this builder
         */
        public Builder isClusterDb(Boolean isClusterDb) {
            this.isClusterDb = isClusterDb;
            this.__explicitlySet__.add("isClusterDb");
            return this;
        }
        /** host info objects */
        @com.fasterxml.jackson.annotation.JsonProperty("hostInfo")
        private java.util.List<HostInfo> hostInfo;

        /**
         * host info objects
         *
         * @param hostInfo the value to set
         * @return this builder
         */
        public Builder hostInfo(java.util.List<HostInfo> hostInfo) {
            this.hostInfo = hostInfo;
            this.__explicitlySet__.add("hostInfo");
            return this;
        }
        /** The version of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
        private String dbVersion;

        /**
         * The version of the resource.
         *
         * @param dbVersion the value to set
         * @return this builder
         */
        public Builder dbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            this.__explicitlySet__.add("dbVersion");
            return this;
        }
        /** The platform type of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbPlatformType")
        private String dbPlatformType;

        /**
         * The platform type of the resource.
         *
         * @param dbPlatformType the value to set
         * @return this builder
         */
        public Builder dbPlatformType(String dbPlatformType) {
            this.dbPlatformType = dbPlatformType;
            this.__explicitlySet__.add("dbPlatformType");
            return this;
        }
        /** The License Type of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private String licenseType;

        /**
         * The License Type of the resource.
         *
         * @param licenseType the value to set
         * @return this builder
         */
        public Builder licenseType(String licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }
        /** The agent Id of the agent managing the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The agent Id of the agent managing the resource.
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceInfo build() {
            ResourceInfo model =
                    new ResourceInfo(
                            this.resourceCompartmentId,
                            this.resourceName,
                            this.resourceId,
                            this.resourceType,
                            this.deploymentType,
                            this.connectorId,
                            this.isClusterDb,
                            this.hostInfo,
                            this.dbVersion,
                            this.dbPlatformType,
                            this.licenseType,
                            this.agentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceInfo model) {
            if (model.wasPropertyExplicitlySet("resourceCompartmentId")) {
                this.resourceCompartmentId(model.getResourceCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceName")) {
                this.resourceName(model.getResourceName());
            }
            if (model.wasPropertyExplicitlySet("resourceId")) {
                this.resourceId(model.getResourceId());
            }
            if (model.wasPropertyExplicitlySet("resourceType")) {
                this.resourceType(model.getResourceType());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("isClusterDb")) {
                this.isClusterDb(model.getIsClusterDb());
            }
            if (model.wasPropertyExplicitlySet("hostInfo")) {
                this.hostInfo(model.getHostInfo());
            }
            if (model.wasPropertyExplicitlySet("dbVersion")) {
                this.dbVersion(model.getDbVersion());
            }
            if (model.wasPropertyExplicitlySet("dbPlatformType")) {
                this.dbPlatformType(model.getDbPlatformType());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
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

    /** The compartmentId of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    private final String resourceCompartmentId;

    /**
     * The compartmentId of the resource.
     *
     * @return the value
     */
    public String getResourceCompartmentId() {
        return resourceCompartmentId;
    }

    /** The name of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceName")
    private final String resourceName;

    /**
     * The name of the resource.
     *
     * @return the value
     */
    public String getResourceName() {
        return resourceName;
    }

    /** The Id of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceId")
    private final String resourceId;

    /**
     * The Id of the resource.
     *
     * @return the value
     */
    public String getResourceId() {
        return resourceId;
    }

    /** The type of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    private final String resourceType;

    /**
     * The type of the resource.
     *
     * @return the value
     */
    public String getResourceType() {
        return resourceType;
    }

    /** The deployment type of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final String deploymentType;

    /**
     * The deployment type of the resource.
     *
     * @return the value
     */
    public String getDeploymentType() {
        return deploymentType;
    }

    /** The connector Id of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * The connector Id of the resource.
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
    }

    /** True if it is a cluster db. */
    @com.fasterxml.jackson.annotation.JsonProperty("isClusterDb")
    private final Boolean isClusterDb;

    /**
     * True if it is a cluster db.
     *
     * @return the value
     */
    public Boolean getIsClusterDb() {
        return isClusterDb;
    }

    /** host info objects */
    @com.fasterxml.jackson.annotation.JsonProperty("hostInfo")
    private final java.util.List<HostInfo> hostInfo;

    /**
     * host info objects
     *
     * @return the value
     */
    public java.util.List<HostInfo> getHostInfo() {
        return hostInfo;
    }

    /** The version of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbVersion")
    private final String dbVersion;

    /**
     * The version of the resource.
     *
     * @return the value
     */
    public String getDbVersion() {
        return dbVersion;
    }

    /** The platform type of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbPlatformType")
    private final String dbPlatformType;

    /**
     * The platform type of the resource.
     *
     * @return the value
     */
    public String getDbPlatformType() {
        return dbPlatformType;
    }

    /** The License Type of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final String licenseType;

    /**
     * The License Type of the resource.
     *
     * @return the value
     */
    public String getLicenseType() {
        return licenseType;
    }

    /** The agent Id of the agent managing the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The agent Id of the agent managing the resource.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
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
        sb.append("ResourceInfo(");
        sb.append("super=").append(super.toString());
        sb.append("resourceCompartmentId=").append(String.valueOf(this.resourceCompartmentId));
        sb.append(", resourceName=").append(String.valueOf(this.resourceName));
        sb.append(", resourceId=").append(String.valueOf(this.resourceId));
        sb.append(", resourceType=").append(String.valueOf(this.resourceType));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", isClusterDb=").append(String.valueOf(this.isClusterDb));
        sb.append(", hostInfo=").append(String.valueOf(this.hostInfo));
        sb.append(", dbVersion=").append(String.valueOf(this.dbVersion));
        sb.append(", dbPlatformType=").append(String.valueOf(this.dbPlatformType));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceInfo)) {
            return false;
        }

        ResourceInfo other = (ResourceInfo) o;
        return java.util.Objects.equals(this.resourceCompartmentId, other.resourceCompartmentId)
                && java.util.Objects.equals(this.resourceName, other.resourceName)
                && java.util.Objects.equals(this.resourceId, other.resourceId)
                && java.util.Objects.equals(this.resourceType, other.resourceType)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.isClusterDb, other.isClusterDb)
                && java.util.Objects.equals(this.hostInfo, other.hostInfo)
                && java.util.Objects.equals(this.dbVersion, other.dbVersion)
                && java.util.Objects.equals(this.dbPlatformType, other.dbPlatformType)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceCompartmentId == null
                                ? 43
                                : this.resourceCompartmentId.hashCode());
        result = (result * PRIME) + (this.resourceName == null ? 43 : this.resourceName.hashCode());
        result = (result * PRIME) + (this.resourceId == null ? 43 : this.resourceId.hashCode());
        result = (result * PRIME) + (this.resourceType == null ? 43 : this.resourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result = (result * PRIME) + (this.isClusterDb == null ? 43 : this.isClusterDb.hashCode());
        result = (result * PRIME) + (this.hostInfo == null ? 43 : this.hostInfo.hashCode());
        result = (result * PRIME) + (this.dbVersion == null ? 43 : this.dbVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.dbPlatformType == null ? 43 : this.dbPlatformType.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
