/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create the connector to the Exadata storage server. <br>
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
        builder = CreateExternalExadataStorageConnectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateExternalExadataStorageConnectorDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageServerId",
        "agentId",
        "connectorName",
        "connectionUri",
        "credentialInfo",
        "freeformTags",
        "definedTags"
    })
    public CreateExternalExadataStorageConnectorDetails(
            String storageServerId,
            String agentId,
            String connectorName,
            String connectionUri,
            RestCredential credentialInfo,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.storageServerId = storageServerId;
        this.agentId = agentId;
        this.connectorName = connectorName;
        this.connectionUri = connectionUri;
        this.credentialInfo = credentialInfo;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata storage server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerId")
        private String storageServerId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Exadata storage server.
         *
         * @param storageServerId the value to set
         * @return this builder
         */
        public Builder storageServerId(String storageServerId) {
            this.storageServerId = storageServerId;
            this.__explicitlySet__.add("storageServerId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * agent for the Exadata storage server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * agent for the Exadata storage server.
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /** The name of the Exadata storage server connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorName")
        private String connectorName;

        /**
         * The name of the Exadata storage server connector.
         *
         * @param connectorName the value to set
         * @return this builder
         */
        public Builder connectorName(String connectorName) {
            this.connectorName = connectorName;
            this.__explicitlySet__.add("connectorName");
            return this;
        }
        /**
         * The unique string of the connection. For example,
         * "https://<storage-server-name>/MS/RESTService/".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUri")
        private String connectionUri;

        /**
         * The unique string of the connection. For example,
         * "https://<storage-server-name>/MS/RESTService/".
         *
         * @param connectionUri the value to set
         * @return this builder
         */
        public Builder connectionUri(String connectionUri) {
            this.connectionUri = connectionUri;
            this.__explicitlySet__.add("connectionUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("credentialInfo")
        private RestCredential credentialInfo;

        public Builder credentialInfo(RestCredential credentialInfo) {
            this.credentialInfo = credentialInfo;
            this.__explicitlySet__.add("credentialInfo");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalExadataStorageConnectorDetails build() {
            CreateExternalExadataStorageConnectorDetails model =
                    new CreateExternalExadataStorageConnectorDetails(
                            this.storageServerId,
                            this.agentId,
                            this.connectorName,
                            this.connectionUri,
                            this.credentialInfo,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalExadataStorageConnectorDetails model) {
            if (model.wasPropertyExplicitlySet("storageServerId")) {
                this.storageServerId(model.getStorageServerId());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectorName")) {
                this.connectorName(model.getConnectorName());
            }
            if (model.wasPropertyExplicitlySet("connectionUri")) {
                this.connectionUri(model.getConnectionUri());
            }
            if (model.wasPropertyExplicitlySet("credentialInfo")) {
                this.credentialInfo(model.getCredentialInfo());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata storage server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerId")
    private final String storageServerId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Exadata storage server.
     *
     * @return the value
     */
    public String getStorageServerId() {
        return storageServerId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * agent for the Exadata storage server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * agent for the Exadata storage server.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    /** The name of the Exadata storage server connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorName")
    private final String connectorName;

    /**
     * The name of the Exadata storage server connector.
     *
     * @return the value
     */
    public String getConnectorName() {
        return connectorName;
    }

    /**
     * The unique string of the connection. For example,
     * "https://<storage-server-name>/MS/RESTService/".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUri")
    private final String connectionUri;

    /**
     * The unique string of the connection. For example,
     * "https://<storage-server-name>/MS/RESTService/".
     *
     * @return the value
     */
    public String getConnectionUri() {
        return connectionUri;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialInfo")
    private final RestCredential credentialInfo;

    public RestCredential getCredentialInfo() {
        return credentialInfo;
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
        sb.append("CreateExternalExadataStorageConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageServerId=").append(String.valueOf(this.storageServerId));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", connectorName=").append(String.valueOf(this.connectorName));
        sb.append(", connectionUri=").append(String.valueOf(this.connectionUri));
        sb.append(", credentialInfo=").append(String.valueOf(this.credentialInfo));
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
        if (!(o instanceof CreateExternalExadataStorageConnectorDetails)) {
            return false;
        }

        CreateExternalExadataStorageConnectorDetails other =
                (CreateExternalExadataStorageConnectorDetails) o;
        return java.util.Objects.equals(this.storageServerId, other.storageServerId)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.connectorName, other.connectorName)
                && java.util.Objects.equals(this.connectionUri, other.connectionUri)
                && java.util.Objects.equals(this.credentialInfo, other.credentialInfo)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.storageServerId == null ? 43 : this.storageServerId.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectorName == null ? 43 : this.connectorName.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionUri == null ? 43 : this.connectionUri.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialInfo == null ? 43 : this.credentialInfo.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
