/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * The database instance node endpoint information. <br>
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
        builder = DbInstanceEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbInstanceEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dbInstanceId", "endpoint"})
    public DbInstanceEndpoint(String dbInstanceId, Endpoint endpoint) {
        super();
        this.dbInstanceId = dbInstanceId;
        this.endpoint = endpoint;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier of the database instance node. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
        private String dbInstanceId;

        /**
         * Unique identifier of the database instance node.
         *
         * @param dbInstanceId the value to set
         * @return this builder
         */
        public Builder dbInstanceId(String dbInstanceId) {
            this.dbInstanceId = dbInstanceId;
            this.__explicitlySet__.add("dbInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private Endpoint endpoint;

        public Builder endpoint(Endpoint endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbInstanceEndpoint build() {
            DbInstanceEndpoint model = new DbInstanceEndpoint(this.dbInstanceId, this.endpoint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbInstanceEndpoint model) {
            if (model.wasPropertyExplicitlySet("dbInstanceId")) {
                this.dbInstanceId(model.getDbInstanceId());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
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

    /** Unique identifier of the database instance node. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbInstanceId")
    private final String dbInstanceId;

    /**
     * Unique identifier of the database instance node.
     *
     * @return the value
     */
    public String getDbInstanceId() {
        return dbInstanceId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final Endpoint endpoint;

    public Endpoint getEndpoint() {
        return endpoint;
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
        sb.append("DbInstanceEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("dbInstanceId=").append(String.valueOf(this.dbInstanceId));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbInstanceEndpoint)) {
            return false;
        }

        DbInstanceEndpoint other = (DbInstanceEndpoint) o;
        return java.util.Objects.equals(this.dbInstanceId, other.dbInstanceId)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dbInstanceId == null ? 43 : this.dbInstanceId.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
