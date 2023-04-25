/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of creating the connector to the Exadata storage server.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateExternalExadataStorageConnectorDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateExternalExadataStorageConnectorDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "storageServerId",
        "agentId",
        "connectorName",
        "connectionUri",
        "credentialInfo"
    })
    public CreateExternalExadataStorageConnectorDetails(
            String storageServerId,
            String agentId,
            String connectorName,
            String connectionUri,
            RestCredential credentialInfo) {
        super();
        this.storageServerId = storageServerId;
        this.agentId = agentId;
        this.connectorName = connectorName;
        this.connectionUri = connectionUri;
        this.credentialInfo = credentialInfo;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata storage server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerId")
        private String storageServerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata storage server.
         * @param storageServerId the value to set
         * @return this builder
         **/
        public Builder storageServerId(String storageServerId) {
            this.storageServerId = storageServerId;
            this.__explicitlySet__.add("storageServerId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the agent for the Exadata storage server.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the agent for the Exadata storage server.
         * @param agentId the value to set
         * @return this builder
         **/
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }
        /**
         * The connector name if OCI connector is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectorName")
        private String connectorName;

        /**
         * The connector name if OCI connector is created.
         * @param connectorName the value to set
         * @return this builder
         **/
        public Builder connectorName(String connectorName) {
            this.connectorName = connectorName;
            this.__explicitlySet__.add("connectorName");
            return this;
        }
        /**
         * The unique connection string of the connection. For example, "https://slcm21celadm02.us.oracle.com:443/MS/RESTService/".
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("connectionUri")
        private String connectionUri;

        /**
         * The unique connection string of the connection. For example, "https://slcm21celadm02.us.oracle.com:443/MS/RESTService/".
         * @param connectionUri the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalExadataStorageConnectorDetails build() {
            CreateExternalExadataStorageConnectorDetails model =
                    new CreateExternalExadataStorageConnectorDetails(
                            this.storageServerId,
                            this.agentId,
                            this.connectorName,
                            this.connectionUri,
                            this.credentialInfo);
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata storage server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerId")
    private final String storageServerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Exadata storage server.
     * @return the value
     **/
    public String getStorageServerId() {
        return storageServerId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the agent for the Exadata storage server.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the agent for the Exadata storage server.
     * @return the value
     **/
    public String getAgentId() {
        return agentId;
    }

    /**
     * The connector name if OCI connector is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectorName")
    private final String connectorName;

    /**
     * The connector name if OCI connector is created.
     * @return the value
     **/
    public String getConnectorName() {
        return connectorName;
    }

    /**
     * The unique connection string of the connection. For example, "https://slcm21celadm02.us.oracle.com:443/MS/RESTService/".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionUri")
    private final String connectionUri;

    /**
     * The unique connection string of the connection. For example, "https://slcm21celadm02.us.oracle.com:443/MS/RESTService/".
     * @return the value
     **/
    public String getConnectionUri() {
        return connectionUri;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("credentialInfo")
    private final RestCredential credentialInfo;

    public RestCredential getCredentialInfo() {
        return credentialInfo;
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
        sb.append("CreateExternalExadataStorageConnectorDetails(");
        sb.append("super=").append(super.toString());
        sb.append("storageServerId=").append(String.valueOf(this.storageServerId));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", connectorName=").append(String.valueOf(this.connectorName));
        sb.append(", connectionUri=").append(String.valueOf(this.connectionUri));
        sb.append(", credentialInfo=").append(String.valueOf(this.credentialInfo));
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
