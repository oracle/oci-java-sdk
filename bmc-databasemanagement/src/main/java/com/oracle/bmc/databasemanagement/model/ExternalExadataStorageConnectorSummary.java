/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The connector of the Exadata storage server. <br>
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
        builder = ExternalExadataStorageConnectorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalExadataStorageConnectorSummary extends DbmResource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalId")
        private String internalId;

        public Builder internalId(String internalId) {
            this.internalId = internalId;
            this.__explicitlySet__.add("internalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private java.util.Map<String, String> additionalDetails;

        public Builder additionalDetails(java.util.Map<String, String> additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
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
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Exadata storage server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServerId")
        private String storageServerId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * agent for the Exadata storage server.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalExadataStorageConnectorSummary build() {
            ExternalExadataStorageConnectorSummary model =
                    new ExternalExadataStorageConnectorSummary(
                            this.id,
                            this.displayName,
                            this.version,
                            this.internalId,
                            this.status,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleDetails,
                            this.additionalDetails,
                            this.connectionUri,
                            this.storageServerId,
                            this.agentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalExadataStorageConnectorSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("internalId")) {
                this.internalId(model.getInternalId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
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
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
            }
            if (model.wasPropertyExplicitlySet("connectionUri")) {
                this.connectionUri(model.getConnectionUri());
            }
            if (model.wasPropertyExplicitlySet("storageServerId")) {
                this.storageServerId(model.getStorageServerId());
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

    @Deprecated
    public ExternalExadataStorageConnectorSummary(
            String id,
            String displayName,
            String version,
            String internalId,
            String status,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String lifecycleDetails,
            java.util.Map<String, String> additionalDetails,
            String connectionUri,
            String storageServerId,
            String agentId) {
        super(
                id,
                displayName,
                version,
                internalId,
                status,
                lifecycleState,
                timeCreated,
                timeUpdated,
                lifecycleDetails,
                additionalDetails);
        this.connectionUri = connectionUri;
        this.storageServerId = storageServerId;
        this.agentId = agentId;
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata storage server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServerId")
    private final String storageServerId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Exadata storage server.
     *
     * @return the value
     */
    public String getStorageServerId() {
        return storageServerId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * agent for the Exadata storage server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * agent for the Exadata storage server.
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
        sb.append("ExternalExadataStorageConnectorSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", connectionUri=").append(String.valueOf(this.connectionUri));
        sb.append(", storageServerId=").append(String.valueOf(this.storageServerId));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalExadataStorageConnectorSummary)) {
            return false;
        }

        ExternalExadataStorageConnectorSummary other = (ExternalExadataStorageConnectorSummary) o;
        return java.util.Objects.equals(this.connectionUri, other.connectionUri)
                && java.util.Objects.equals(this.storageServerId, other.storageServerId)
                && java.util.Objects.equals(this.agentId, other.agentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionUri == null ? 43 : this.connectionUri.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServerId == null ? 43 : this.storageServerId.hashCode());
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        return result;
    }
}
