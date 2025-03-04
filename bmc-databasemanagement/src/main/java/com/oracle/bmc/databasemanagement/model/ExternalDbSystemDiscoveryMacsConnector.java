/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details of an external DB system connector that uses the [Management Agent Cloud Service
 * (MACS)](https://docs.oracle.com/iaas/management-agents/index.html) to connect to an external DB
 * system component. <br>
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
        builder = ExternalDbSystemDiscoveryMacsConnector.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectorType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalDbSystemDiscoveryMacsConnector
        extends ExternalDbSystemDiscoveryConnector {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionStatus")
        private String connectionStatus;

        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = connectionStatus;
            this.__explicitlySet__.add("connectionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionFailureMessage")
        private String connectionFailureMessage;

        public Builder connectionFailureMessage(String connectionFailureMessage) {
            this.connectionFailureMessage = connectionFailureMessage;
            this.__explicitlySet__.add("connectionFailureMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeConnectionStatusLastUpdated")
        private java.util.Date timeConnectionStatusLastUpdated;

        public Builder timeConnectionStatusLastUpdated(
                java.util.Date timeConnectionStatusLastUpdated) {
            this.timeConnectionStatusLastUpdated = timeConnectionStatusLastUpdated;
            this.__explicitlySet__.add("timeConnectionStatusLastUpdated");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * management agent used for the external DB system connector.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * management agent used for the external DB system connector.
         *
         * @param agentId the value to set
         * @return this builder
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionInfo")
        private ExternalDbSystemConnectionInfo connectionInfo;

        public Builder connectionInfo(ExternalDbSystemConnectionInfo connectionInfo) {
            this.connectionInfo = connectionInfo;
            this.__explicitlySet__.add("connectionInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalDbSystemDiscoveryMacsConnector build() {
            ExternalDbSystemDiscoveryMacsConnector model =
                    new ExternalDbSystemDiscoveryMacsConnector(
                            this.displayName,
                            this.connectionStatus,
                            this.connectionFailureMessage,
                            this.timeConnectionStatusLastUpdated,
                            this.agentId,
                            this.connectionInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalDbSystemDiscoveryMacsConnector model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("connectionStatus")) {
                this.connectionStatus(model.getConnectionStatus());
            }
            if (model.wasPropertyExplicitlySet("connectionFailureMessage")) {
                this.connectionFailureMessage(model.getConnectionFailureMessage());
            }
            if (model.wasPropertyExplicitlySet("timeConnectionStatusLastUpdated")) {
                this.timeConnectionStatusLastUpdated(model.getTimeConnectionStatusLastUpdated());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectionInfo")) {
                this.connectionInfo(model.getConnectionInfo());
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
    public ExternalDbSystemDiscoveryMacsConnector(
            String displayName,
            String connectionStatus,
            String connectionFailureMessage,
            java.util.Date timeConnectionStatusLastUpdated,
            String agentId,
            ExternalDbSystemConnectionInfo connectionInfo) {
        super(
                displayName,
                connectionStatus,
                connectionFailureMessage,
                timeConnectionStatusLastUpdated);
        this.agentId = agentId;
        this.connectionInfo = connectionInfo;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management agent used for the external DB system connector.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    private final String agentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management agent used for the external DB system connector.
     *
     * @return the value
     */
    public String getAgentId() {
        return agentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("connectionInfo")
    private final ExternalDbSystemConnectionInfo connectionInfo;

    public ExternalDbSystemConnectionInfo getConnectionInfo() {
        return connectionInfo;
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
        sb.append("ExternalDbSystemDiscoveryMacsConnector(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", agentId=").append(String.valueOf(this.agentId));
        sb.append(", connectionInfo=").append(String.valueOf(this.connectionInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalDbSystemDiscoveryMacsConnector)) {
            return false;
        }

        ExternalDbSystemDiscoveryMacsConnector other = (ExternalDbSystemDiscoveryMacsConnector) o;
        return java.util.Objects.equals(this.agentId, other.agentId)
                && java.util.Objects.equals(this.connectionInfo, other.connectionInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.agentId == null ? 43 : this.agentId.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionInfo == null ? 43 : this.connectionInfo.hashCode());
        return result;
    }
}
