/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Database system connection information. Used to connect to PostgreSQL instance(s). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConnectionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConnectionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"caCertificate", "primaryDbEndpoint", "instanceEndpoints"})
    public ConnectionDetails(
            String caCertificate,
            Endpoint primaryDbEndpoint,
            java.util.List<DbInstanceEndpoint> instanceEndpoints) {
        super();
        this.caCertificate = caCertificate;
        this.primaryDbEndpoint = primaryDbEndpoint;
        this.instanceEndpoints = instanceEndpoints;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The CA certificate to be used by the PosgreSQL client to connect to the database. The CA
         * certificate is used to authenticate the server identity. It is issued by PostgreSQL
         * Service Private CA.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
        private String caCertificate;

        /**
         * The CA certificate to be used by the PosgreSQL client to connect to the database. The CA
         * certificate is used to authenticate the server identity. It is issued by PostgreSQL
         * Service Private CA.
         *
         * @param caCertificate the value to set
         * @return this builder
         */
        public Builder caCertificate(String caCertificate) {
            this.caCertificate = caCertificate;
            this.__explicitlySet__.add("caCertificate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryDbEndpoint")
        private Endpoint primaryDbEndpoint;

        public Builder primaryDbEndpoint(Endpoint primaryDbEndpoint) {
            this.primaryDbEndpoint = primaryDbEndpoint;
            this.__explicitlySet__.add("primaryDbEndpoint");
            return this;
        }
        /** The list of database instance node endpoints in the database system. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceEndpoints")
        private java.util.List<DbInstanceEndpoint> instanceEndpoints;

        /**
         * The list of database instance node endpoints in the database system.
         *
         * @param instanceEndpoints the value to set
         * @return this builder
         */
        public Builder instanceEndpoints(java.util.List<DbInstanceEndpoint> instanceEndpoints) {
            this.instanceEndpoints = instanceEndpoints;
            this.__explicitlySet__.add("instanceEndpoints");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectionDetails build() {
            ConnectionDetails model =
                    new ConnectionDetails(
                            this.caCertificate, this.primaryDbEndpoint, this.instanceEndpoints);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionDetails model) {
            if (model.wasPropertyExplicitlySet("caCertificate")) {
                this.caCertificate(model.getCaCertificate());
            }
            if (model.wasPropertyExplicitlySet("primaryDbEndpoint")) {
                this.primaryDbEndpoint(model.getPrimaryDbEndpoint());
            }
            if (model.wasPropertyExplicitlySet("instanceEndpoints")) {
                this.instanceEndpoints(model.getInstanceEndpoints());
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
     * The CA certificate to be used by the PosgreSQL client to connect to the database. The CA
     * certificate is used to authenticate the server identity. It is issued by PostgreSQL Service
     * Private CA.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("caCertificate")
    private final String caCertificate;

    /**
     * The CA certificate to be used by the PosgreSQL client to connect to the database. The CA
     * certificate is used to authenticate the server identity. It is issued by PostgreSQL Service
     * Private CA.
     *
     * @return the value
     */
    public String getCaCertificate() {
        return caCertificate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("primaryDbEndpoint")
    private final Endpoint primaryDbEndpoint;

    public Endpoint getPrimaryDbEndpoint() {
        return primaryDbEndpoint;
    }

    /** The list of database instance node endpoints in the database system. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceEndpoints")
    private final java.util.List<DbInstanceEndpoint> instanceEndpoints;

    /**
     * The list of database instance node endpoints in the database system.
     *
     * @return the value
     */
    public java.util.List<DbInstanceEndpoint> getInstanceEndpoints() {
        return instanceEndpoints;
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
        sb.append("ConnectionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("caCertificate=").append(String.valueOf(this.caCertificate));
        sb.append(", primaryDbEndpoint=").append(String.valueOf(this.primaryDbEndpoint));
        sb.append(", instanceEndpoints=").append(String.valueOf(this.instanceEndpoints));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionDetails)) {
            return false;
        }

        ConnectionDetails other = (ConnectionDetails) o;
        return java.util.Objects.equals(this.caCertificate, other.caCertificate)
                && java.util.Objects.equals(this.primaryDbEndpoint, other.primaryDbEndpoint)
                && java.util.Objects.equals(this.instanceEndpoints, other.instanceEndpoints)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.caCertificate == null ? 43 : this.caCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryDbEndpoint == null ? 43 : this.primaryDbEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceEndpoints == null ? 43 : this.instanceEndpoints.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
