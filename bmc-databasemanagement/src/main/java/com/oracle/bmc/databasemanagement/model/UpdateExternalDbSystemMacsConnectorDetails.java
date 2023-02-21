/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details for updating the external [Management Agent Cloud Service
 * (MACS)](https://docs.cloud.oracle.com/iaas/management-agents/index.html) connector used to
 * connect to an external DB system component. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateExternalDbSystemMacsConnectorDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "connectorType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateExternalDbSystemMacsConnectorDetails
        extends UpdateExternalDbSystemConnectorDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("connectionInfo")
        private ExternalDbSystemConnectionInfo connectionInfo;

        public Builder connectionInfo(ExternalDbSystemConnectionInfo connectionInfo) {
            this.connectionInfo = connectionInfo;
            this.__explicitlySet__.add("connectionInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateExternalDbSystemMacsConnectorDetails build() {
            UpdateExternalDbSystemMacsConnectorDetails model =
                    new UpdateExternalDbSystemMacsConnectorDetails(this.connectionInfo);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateExternalDbSystemMacsConnectorDetails model) {
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
    public UpdateExternalDbSystemMacsConnectorDetails(
            ExternalDbSystemConnectionInfo connectionInfo) {
        super();
        this.connectionInfo = connectionInfo;
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
        sb.append("UpdateExternalDbSystemMacsConnectorDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", connectionInfo=").append(String.valueOf(this.connectionInfo));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateExternalDbSystemMacsConnectorDetails)) {
            return false;
        }

        UpdateExternalDbSystemMacsConnectorDetails other =
                (UpdateExternalDbSystemMacsConnectorDetails) o;
        return java.util.Objects.equals(this.connectionInfo, other.connectionInfo)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.connectionInfo == null ? 43 : this.connectionInfo.hashCode());
        return result;
    }
}
