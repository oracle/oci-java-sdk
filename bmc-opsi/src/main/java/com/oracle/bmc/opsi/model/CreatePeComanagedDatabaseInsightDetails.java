/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about database to be analyzed. Either an opsiPrivateEndpointId or
 * dbmPrivateEndpointId must be specified. If the dbmPrivateEndpointId is specified, a new
 * Operations Insights private endpoint will be created. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreatePeComanagedDatabaseInsightDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreatePeComanagedDatabaseInsightDetails extends CreateDatabaseInsightDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the database.
         *
         * @param databaseId the value to set
         * @return this builder
         */
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /** OCI database resource type */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
        private String databaseResourceType;

        /**
         * OCI database resource type
         *
         * @param databaseResourceType the value to set
         * @return this builder
         */
        public Builder databaseResourceType(String databaseResourceType) {
            this.databaseResourceType = databaseResourceType;
            this.__explicitlySet__.add("databaseResourceType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the OPSI private endpoint
         */
        @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
        private String opsiPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the OPSI private endpoint
         *
         * @param opsiPrivateEndpointId the value to set
         * @return this builder
         */
        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            this.opsiPrivateEndpointId = opsiPrivateEndpointId;
            this.__explicitlySet__.add("opsiPrivateEndpointId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Database Management private endpoint
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbmPrivateEndpointId")
        private String dbmPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Database Management private endpoint
         *
         * @param dbmPrivateEndpointId the value to set
         * @return this builder
         */
        public Builder dbmPrivateEndpointId(String dbmPrivateEndpointId) {
            this.dbmPrivateEndpointId = dbmPrivateEndpointId;
            this.__explicitlySet__.add("dbmPrivateEndpointId");
            return this;
        }
        /** Database service name used for connection requests. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private String serviceName;

        /**
         * Database service name used for connection requests.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private CredentialDetails credentialDetails;

        public Builder credentialDetails(CredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private PeComanagedDatabaseConnectionDetails connectionDetails;

        public Builder connectionDetails(PeComanagedDatabaseConnectionDetails connectionDetails) {
            this.connectionDetails = connectionDetails;
            this.__explicitlySet__.add("connectionDetails");
            return this;
        }
        /** Database Deployment Type */
        @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
        private DeploymentType deploymentType;

        /**
         * Database Deployment Type
         *
         * @param deploymentType the value to set
         * @return this builder
         */
        public Builder deploymentType(DeploymentType deploymentType) {
            this.deploymentType = deploymentType;
            this.__explicitlySet__.add("deploymentType");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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

        public CreatePeComanagedDatabaseInsightDetails build() {
            CreatePeComanagedDatabaseInsightDetails model =
                    new CreatePeComanagedDatabaseInsightDetails(
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.databaseId,
                            this.databaseResourceType,
                            this.opsiPrivateEndpointId,
                            this.dbmPrivateEndpointId,
                            this.serviceName,
                            this.credentialDetails,
                            this.connectionDetails,
                            this.deploymentType,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePeComanagedDatabaseInsightDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("databaseId")) {
                this.databaseId(model.getDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("databaseResourceType")) {
                this.databaseResourceType(model.getDatabaseResourceType());
            }
            if (model.wasPropertyExplicitlySet("opsiPrivateEndpointId")) {
                this.opsiPrivateEndpointId(model.getOpsiPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("dbmPrivateEndpointId")) {
                this.dbmPrivateEndpointId(model.getDbmPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("connectionDetails")) {
                this.connectionDetails(model.getConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("deploymentType")) {
                this.deploymentType(model.getDeploymentType());
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

    @Deprecated
    public CreatePeComanagedDatabaseInsightDetails(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String databaseId,
            String databaseResourceType,
            String opsiPrivateEndpointId,
            String dbmPrivateEndpointId,
            String serviceName,
            CredentialDetails credentialDetails,
            PeComanagedDatabaseConnectionDetails connectionDetails,
            DeploymentType deploymentType,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super(compartmentId, freeformTags, definedTags);
        this.databaseId = databaseId;
        this.databaseResourceType = databaseResourceType;
        this.opsiPrivateEndpointId = opsiPrivateEndpointId;
        this.dbmPrivateEndpointId = dbmPrivateEndpointId;
        this.serviceName = serviceName;
        this.credentialDetails = credentialDetails;
        this.connectionDetails = connectionDetails;
        this.deploymentType = deploymentType;
        this.systemTags = systemTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the database.
     *
     * @return the value
     */
    public String getDatabaseId() {
        return databaseId;
    }

    /** OCI database resource type */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
    private final String databaseResourceType;

    /**
     * OCI database resource type
     *
     * @return the value
     */
    public String getDatabaseResourceType() {
        return databaseResourceType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the OPSI private endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
    private final String opsiPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the OPSI private endpoint
     *
     * @return the value
     */
    public String getOpsiPrivateEndpointId() {
        return opsiPrivateEndpointId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Database Management private endpoint
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbmPrivateEndpointId")
    private final String dbmPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Database Management private endpoint
     *
     * @return the value
     */
    public String getDbmPrivateEndpointId() {
        return dbmPrivateEndpointId;
    }

    /** Database service name used for connection requests. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final String serviceName;

    /**
     * Database service name used for connection requests.
     *
     * @return the value
     */
    public String getServiceName() {
        return serviceName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final CredentialDetails credentialDetails;

    public CredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final PeComanagedDatabaseConnectionDetails connectionDetails;

    public PeComanagedDatabaseConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }

    /** Database Deployment Type */
    public enum DeploymentType implements com.oracle.bmc.http.internal.BmcEnum {
        VirtualMachine("VIRTUAL_MACHINE"),
        BareMetal("BARE_METAL"),
        Exacs("EXACS"),
        ;

        private final String value;
        private static java.util.Map<String, DeploymentType> map;

        static {
            map = new java.util.HashMap<>();
            for (DeploymentType v : DeploymentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        DeploymentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DeploymentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DeploymentType: " + key);
        }
    };
    /** Database Deployment Type */
    @com.fasterxml.jackson.annotation.JsonProperty("deploymentType")
    private final DeploymentType deploymentType;

    /**
     * Database Deployment Type
     *
     * @return the value
     */
    public DeploymentType getDeploymentType() {
        return deploymentType;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
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
        sb.append("CreatePeComanagedDatabaseInsightDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseResourceType=").append(String.valueOf(this.databaseResourceType));
        sb.append(", opsiPrivateEndpointId=").append(String.valueOf(this.opsiPrivateEndpointId));
        sb.append(", dbmPrivateEndpointId=").append(String.valueOf(this.dbmPrivateEndpointId));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", deploymentType=").append(String.valueOf(this.deploymentType));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePeComanagedDatabaseInsightDetails)) {
            return false;
        }

        CreatePeComanagedDatabaseInsightDetails other = (CreatePeComanagedDatabaseInsightDetails) o;
        return java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseResourceType, other.databaseResourceType)
                && java.util.Objects.equals(this.opsiPrivateEndpointId, other.opsiPrivateEndpointId)
                && java.util.Objects.equals(this.dbmPrivateEndpointId, other.dbmPrivateEndpointId)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.connectionDetails, other.connectionDetails)
                && java.util.Objects.equals(this.deploymentType, other.deploymentType)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.databaseId == null ? 43 : this.databaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseResourceType == null
                                ? 43
                                : this.databaseResourceType.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiPrivateEndpointId == null
                                ? 43
                                : this.opsiPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbmPrivateEndpointId == null
                                ? 43
                                : this.dbmPrivateEndpointId.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.deploymentType == null ? 43 : this.deploymentType.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }
}
