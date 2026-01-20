/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dif.model;

/**
 * Details of GGCS connections to be created. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250830")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GgcsConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GgcsConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connectionName",
        "difDependencies",
        "ggAdminSecretId",
        "connectionId"
    })
    public GgcsConnectionDetails(
            String connectionName,
            java.util.List<DifDependencyDetails> difDependencies,
            String ggAdminSecretId,
            String connectionId) {
        super();
        this.connectionName = connectionName;
        this.difDependencies = difDependencies;
        this.ggAdminSecretId = ggAdminSecretId;
        this.connectionId = connectionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the connection to be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionName")
        private String connectionName;

        /**
         * Name of the connection to be created.
         *
         * @param connectionName the value to set
         * @return this builder
         */
        public Builder connectionName(String connectionName) {
            this.connectionName = connectionName;
            this.__explicitlySet__.add("connectionName");
            return this;
        }
        /** List of Service Dependency Details for connection creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("difDependencies")
        private java.util.List<DifDependencyDetails> difDependencies;

        /**
         * List of Service Dependency Details for connection creation.
         *
         * @param difDependencies the value to set
         * @return this builder
         */
        public Builder difDependencies(java.util.List<DifDependencyDetails> difDependencies) {
            this.difDependencies = difDependencies;
            this.__explicitlySet__.add("difDependencies");
            return this;
        }
        /**
         * Vault secret OCID containing password that Oracle GoldenGate uses to connect the
         * associated system of the given technology.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ggAdminSecretId")
        private String ggAdminSecretId;

        /**
         * Vault secret OCID containing password that Oracle GoldenGate uses to connect the
         * associated system of the given technology.
         *
         * @param ggAdminSecretId the value to set
         * @return this builder
         */
        public Builder ggAdminSecretId(String ggAdminSecretId) {
            this.ggAdminSecretId = ggAdminSecretId;
            this.__explicitlySet__.add("ggAdminSecretId");
            return this;
        }
        /** OCID of pre-created Oracle GoldenGate connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionId")
        private String connectionId;

        /**
         * OCID of pre-created Oracle GoldenGate connection.
         *
         * @param connectionId the value to set
         * @return this builder
         */
        public Builder connectionId(String connectionId) {
            this.connectionId = connectionId;
            this.__explicitlySet__.add("connectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GgcsConnectionDetails build() {
            GgcsConnectionDetails model =
                    new GgcsConnectionDetails(
                            this.connectionName,
                            this.difDependencies,
                            this.ggAdminSecretId,
                            this.connectionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GgcsConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("connectionName")) {
                this.connectionName(model.getConnectionName());
            }
            if (model.wasPropertyExplicitlySet("difDependencies")) {
                this.difDependencies(model.getDifDependencies());
            }
            if (model.wasPropertyExplicitlySet("ggAdminSecretId")) {
                this.ggAdminSecretId(model.getGgAdminSecretId());
            }
            if (model.wasPropertyExplicitlySet("connectionId")) {
                this.connectionId(model.getConnectionId());
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

    /** Name of the connection to be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionName")
    private final String connectionName;

    /**
     * Name of the connection to be created.
     *
     * @return the value
     */
    public String getConnectionName() {
        return connectionName;
    }

    /** List of Service Dependency Details for connection creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("difDependencies")
    private final java.util.List<DifDependencyDetails> difDependencies;

    /**
     * List of Service Dependency Details for connection creation.
     *
     * @return the value
     */
    public java.util.List<DifDependencyDetails> getDifDependencies() {
        return difDependencies;
    }

    /**
     * Vault secret OCID containing password that Oracle GoldenGate uses to connect the associated
     * system of the given technology.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ggAdminSecretId")
    private final String ggAdminSecretId;

    /**
     * Vault secret OCID containing password that Oracle GoldenGate uses to connect the associated
     * system of the given technology.
     *
     * @return the value
     */
    public String getGgAdminSecretId() {
        return ggAdminSecretId;
    }

    /** OCID of pre-created Oracle GoldenGate connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionId")
    private final String connectionId;

    /**
     * OCID of pre-created Oracle GoldenGate connection.
     *
     * @return the value
     */
    public String getConnectionId() {
        return connectionId;
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
        sb.append("GgcsConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("connectionName=").append(String.valueOf(this.connectionName));
        sb.append(", difDependencies=").append(String.valueOf(this.difDependencies));
        sb.append(", ggAdminSecretId=").append(String.valueOf(this.ggAdminSecretId));
        sb.append(", connectionId=").append(String.valueOf(this.connectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GgcsConnectionDetails)) {
            return false;
        }

        GgcsConnectionDetails other = (GgcsConnectionDetails) o;
        return java.util.Objects.equals(this.connectionName, other.connectionName)
                && java.util.Objects.equals(this.difDependencies, other.difDependencies)
                && java.util.Objects.equals(this.ggAdminSecretId, other.ggAdminSecretId)
                && java.util.Objects.equals(this.connectionId, other.connectionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionName == null ? 43 : this.connectionName.hashCode());
        result =
                (result * PRIME)
                        + (this.difDependencies == null ? 43 : this.difDependencies.hashCode());
        result =
                (result * PRIME)
                        + (this.ggAdminSecretId == null ? 43 : this.ggAdminSecretId.hashCode());
        result = (result * PRIME) + (this.connectionId == null ? 43 : this.connectionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
