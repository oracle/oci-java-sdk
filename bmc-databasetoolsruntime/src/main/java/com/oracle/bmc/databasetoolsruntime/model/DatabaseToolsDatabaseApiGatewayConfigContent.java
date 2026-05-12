/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * The content of a Database Tools database API gateway config global resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseToolsDatabaseApiGatewayConfigContent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DatabaseToolsDatabaseApiGatewayConfigContent
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"global", "pools"})
    public DatabaseToolsDatabaseApiGatewayConfigContent(
            DatabaseToolsDatabaseApiGatewayConfigGlobal global,
            java.util.List<DatabaseToolsDatabaseApiGatewayConfigPoolContent> pools) {
        super();
        this.global = global;
        this.pools = pools;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("global")
        private DatabaseToolsDatabaseApiGatewayConfigGlobal global;

        public Builder global(DatabaseToolsDatabaseApiGatewayConfigGlobal global) {
            this.global = global;
            this.__explicitlySet__.add("global");
            return this;
        }
        /**
         * The content of the Database Tools database API gateway config pools each with API spec
         * and auto API spec definitions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pools")
        private java.util.List<DatabaseToolsDatabaseApiGatewayConfigPoolContent> pools;

        /**
         * The content of the Database Tools database API gateway config pools each with API spec
         * and auto API spec definitions.
         *
         * @param pools the value to set
         * @return this builder
         */
        public Builder pools(
                java.util.List<DatabaseToolsDatabaseApiGatewayConfigPoolContent> pools) {
            this.pools = pools;
            this.__explicitlySet__.add("pools");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsDatabaseApiGatewayConfigContent build() {
            DatabaseToolsDatabaseApiGatewayConfigContent model =
                    new DatabaseToolsDatabaseApiGatewayConfigContent(this.global, this.pools);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsDatabaseApiGatewayConfigContent model) {
            if (model.wasPropertyExplicitlySet("global")) {
                this.global(model.getGlobal());
            }
            if (model.wasPropertyExplicitlySet("pools")) {
                this.pools(model.getPools());
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

    @com.fasterxml.jackson.annotation.JsonProperty("global")
    private final DatabaseToolsDatabaseApiGatewayConfigGlobal global;

    public DatabaseToolsDatabaseApiGatewayConfigGlobal getGlobal() {
        return global;
    }

    /**
     * The content of the Database Tools database API gateway config pools each with API spec and
     * auto API spec definitions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pools")
    private final java.util.List<DatabaseToolsDatabaseApiGatewayConfigPoolContent> pools;

    /**
     * The content of the Database Tools database API gateway config pools each with API spec and
     * auto API spec definitions.
     *
     * @return the value
     */
    public java.util.List<DatabaseToolsDatabaseApiGatewayConfigPoolContent> getPools() {
        return pools;
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
        sb.append("DatabaseToolsDatabaseApiGatewayConfigContent(");
        sb.append("super=").append(super.toString());
        sb.append("global=").append(String.valueOf(this.global));
        sb.append(", pools=").append(String.valueOf(this.pools));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsDatabaseApiGatewayConfigContent)) {
            return false;
        }

        DatabaseToolsDatabaseApiGatewayConfigContent other =
                (DatabaseToolsDatabaseApiGatewayConfigContent) o;
        return java.util.Objects.equals(this.global, other.global)
                && java.util.Objects.equals(this.pools, other.pools)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.global == null ? 43 : this.global.hashCode());
        result = (result * PRIME) + (this.pools == null ? 43 : this.pools.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
