/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The information about database to be analyzed. When isAdvancedFeaturesEnabled is set to false, parameters connectionDetails, credentialDetails and opsiPrivateEndpoint are optional. Otherwise, connectionDetails and crendetialDetails are required to enable full OPSI service features. If the Autonomouse Database is configured with private, restricted or dedicated access, opsiPrivateEndpoint parameter is required.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateAutonomousDatabaseInsightDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateAutonomousDatabaseInsightDetails extends CreateDatabaseInsightDetails {
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
        private String databaseId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
         * @param databaseId the value to set
         * @return this builder
         **/
        public Builder databaseId(String databaseId) {
            this.databaseId = databaseId;
            this.__explicitlySet__.add("databaseId");
            return this;
        }
        /**
         * OCI database resource type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
        private String databaseResourceType;

        /**
         * OCI database resource type
         * @param databaseResourceType the value to set
         * @return this builder
         **/
        public Builder databaseResourceType(String databaseResourceType) {
            this.databaseResourceType = databaseResourceType;
            this.__explicitlySet__.add("databaseResourceType");
            return this;
        }
        /**
         * Flag is to identify if advanced features for autonomous database is enabled or not
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAdvancedFeaturesEnabled")
        private Boolean isAdvancedFeaturesEnabled;

        /**
         * Flag is to identify if advanced features for autonomous database is enabled or not
         * @param isAdvancedFeaturesEnabled the value to set
         * @return this builder
         **/
        public Builder isAdvancedFeaturesEnabled(Boolean isAdvancedFeaturesEnabled) {
            this.isAdvancedFeaturesEnabled = isAdvancedFeaturesEnabled;
            this.__explicitlySet__.add("isAdvancedFeaturesEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
        private ConnectionDetails connectionDetails;

        public Builder connectionDetails(ConnectionDetails connectionDetails) {
            this.connectionDetails = connectionDetails;
            this.__explicitlySet__.add("connectionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
        private CredentialDetails credentialDetails;

        public Builder credentialDetails(CredentialDetails credentialDetails) {
            this.credentialDetails = credentialDetails;
            this.__explicitlySet__.add("credentialDetails");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
        private String opsiPrivateEndpointId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
         * @param opsiPrivateEndpointId the value to set
         * @return this builder
         **/
        public Builder opsiPrivateEndpointId(String opsiPrivateEndpointId) {
            this.opsiPrivateEndpointId = opsiPrivateEndpointId;
            this.__explicitlySet__.add("opsiPrivateEndpointId");
            return this;
        }
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         **/
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousDatabaseInsightDetails build() {
            CreateAutonomousDatabaseInsightDetails model =
                    new CreateAutonomousDatabaseInsightDetails(
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.databaseId,
                            this.databaseResourceType,
                            this.isAdvancedFeaturesEnabled,
                            this.connectionDetails,
                            this.credentialDetails,
                            this.opsiPrivateEndpointId,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousDatabaseInsightDetails model) {
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
            if (model.wasPropertyExplicitlySet("isAdvancedFeaturesEnabled")) {
                this.isAdvancedFeaturesEnabled(model.getIsAdvancedFeaturesEnabled());
            }
            if (model.wasPropertyExplicitlySet("connectionDetails")) {
                this.connectionDetails(model.getConnectionDetails());
            }
            if (model.wasPropertyExplicitlySet("credentialDetails")) {
                this.credentialDetails(model.getCredentialDetails());
            }
            if (model.wasPropertyExplicitlySet("opsiPrivateEndpointId")) {
                this.opsiPrivateEndpointId(model.getOpsiPrivateEndpointId());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public CreateAutonomousDatabaseInsightDetails(
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String databaseId,
            String databaseResourceType,
            Boolean isAdvancedFeaturesEnabled,
            ConnectionDetails connectionDetails,
            CredentialDetails credentialDetails,
            String opsiPrivateEndpointId,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super(compartmentId, freeformTags, definedTags);
        this.databaseId = databaseId;
        this.databaseResourceType = databaseResourceType;
        this.isAdvancedFeaturesEnabled = isAdvancedFeaturesEnabled;
        this.connectionDetails = connectionDetails;
        this.credentialDetails = credentialDetails;
        this.opsiPrivateEndpointId = opsiPrivateEndpointId;
        this.systemTags = systemTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseId")
    private final String databaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the database.
     * @return the value
     **/
    public String getDatabaseId() {
        return databaseId;
    }

    /**
     * OCI database resource type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseResourceType")
    private final String databaseResourceType;

    /**
     * OCI database resource type
     * @return the value
     **/
    public String getDatabaseResourceType() {
        return databaseResourceType;
    }

    /**
     * Flag is to identify if advanced features for autonomous database is enabled or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdvancedFeaturesEnabled")
    private final Boolean isAdvancedFeaturesEnabled;

    /**
     * Flag is to identify if advanced features for autonomous database is enabled or not
     * @return the value
     **/
    public Boolean getIsAdvancedFeaturesEnabled() {
        return isAdvancedFeaturesEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionDetails")
    private final ConnectionDetails connectionDetails;

    public ConnectionDetails getConnectionDetails() {
        return connectionDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialDetails")
    private final CredentialDetails credentialDetails;

    public CredentialDetails getCredentialDetails() {
        return credentialDetails;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("opsiPrivateEndpointId")
    private final String opsiPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OPSI private endpoint
     * @return the value
     **/
    public String getOpsiPrivateEndpointId() {
        return opsiPrivateEndpointId;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateAutonomousDatabaseInsightDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", databaseId=").append(String.valueOf(this.databaseId));
        sb.append(", databaseResourceType=").append(String.valueOf(this.databaseResourceType));
        sb.append(", isAdvancedFeaturesEnabled=")
                .append(String.valueOf(this.isAdvancedFeaturesEnabled));
        sb.append(", connectionDetails=").append(String.valueOf(this.connectionDetails));
        sb.append(", credentialDetails=").append(String.valueOf(this.credentialDetails));
        sb.append(", opsiPrivateEndpointId=").append(String.valueOf(this.opsiPrivateEndpointId));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousDatabaseInsightDetails)) {
            return false;
        }

        CreateAutonomousDatabaseInsightDetails other = (CreateAutonomousDatabaseInsightDetails) o;
        return java.util.Objects.equals(this.databaseId, other.databaseId)
                && java.util.Objects.equals(this.databaseResourceType, other.databaseResourceType)
                && java.util.Objects.equals(
                        this.isAdvancedFeaturesEnabled, other.isAdvancedFeaturesEnabled)
                && java.util.Objects.equals(this.connectionDetails, other.connectionDetails)
                && java.util.Objects.equals(this.credentialDetails, other.credentialDetails)
                && java.util.Objects.equals(this.opsiPrivateEndpointId, other.opsiPrivateEndpointId)
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
                        + (this.isAdvancedFeaturesEnabled == null
                                ? 43
                                : this.isAdvancedFeaturesEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionDetails == null ? 43 : this.connectionDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialDetails == null ? 43 : this.credentialDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opsiPrivateEndpointId == null
                                ? 43
                                : this.opsiPrivateEndpointId.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        return result;
    }
}
