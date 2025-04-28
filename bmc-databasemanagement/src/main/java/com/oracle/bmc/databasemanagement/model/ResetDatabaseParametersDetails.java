/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to reset database parameter values. It takes either credentials or
 * databaseCredential. It's recommended to provide databaseCredential <br>
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
        builder = ResetDatabaseParametersDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResetDatabaseParametersDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"credentials", "databaseCredential", "scope", "parameters"})
    public ResetDatabaseParametersDetails(
            DatabaseCredentials credentials,
            DatabaseCredentialDetails databaseCredential,
            ParameterScope scope,
            java.util.List<String> parameters) {
        super();
        this.credentials = credentials;
        this.databaseCredential = databaseCredential;
        this.scope = scope;
        this.parameters = parameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private DatabaseCredentials credentials;

        public Builder credentials(DatabaseCredentials credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
        private DatabaseCredentialDetails databaseCredential;

        public Builder databaseCredential(DatabaseCredentialDetails databaseCredential) {
            this.databaseCredential = databaseCredential;
            this.__explicitlySet__.add("databaseCredential");
            return this;
        }
        /**
         * The clause used to specify when the parameter change takes effect.
         *
         * <p>Use {@code MEMORY} to make the change in memory and ensure that it takes effect
         * immediately. Use {@code SPFILE} to make the change in the server parameter file. The
         * change takes effect when the database is next shut down and started up again. Use {@code
         * BOTH} to make the change in memory and in the server parameter file. The change takes
         * effect immediately and persists after the database is shut down and started up again.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private ParameterScope scope;

        /**
         * The clause used to specify when the parameter change takes effect.
         *
         * <p>Use {@code MEMORY} to make the change in memory and ensure that it takes effect
         * immediately. Use {@code SPFILE} to make the change in the server parameter file. The
         * change takes effect when the database is next shut down and started up again. Use {@code
         * BOTH} to make the change in memory and in the server parameter file. The change takes
         * effect immediately and persists after the database is shut down and started up again.
         *
         * @param scope the value to set
         * @return this builder
         */
        public Builder scope(ParameterScope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /** A list of database parameter names. */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<String> parameters;

        /**
         * A list of database parameter names.
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<String> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResetDatabaseParametersDetails build() {
            ResetDatabaseParametersDetails model =
                    new ResetDatabaseParametersDetails(
                            this.credentials, this.databaseCredential, this.scope, this.parameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResetDatabaseParametersDetails model) {
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
            }
            if (model.wasPropertyExplicitlySet("databaseCredential")) {
                this.databaseCredential(model.getDatabaseCredential());
            }
            if (model.wasPropertyExplicitlySet("scope")) {
                this.scope(model.getScope());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final DatabaseCredentials credentials;

    public DatabaseCredentials getCredentials() {
        return credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseCredential")
    private final DatabaseCredentialDetails databaseCredential;

    public DatabaseCredentialDetails getDatabaseCredential() {
        return databaseCredential;
    }

    /**
     * The clause used to specify when the parameter change takes effect.
     *
     * <p>Use {@code MEMORY} to make the change in memory and ensure that it takes effect
     * immediately. Use {@code SPFILE} to make the change in the server parameter file. The change
     * takes effect when the database is next shut down and started up again. Use {@code BOTH} to
     * make the change in memory and in the server parameter file. The change takes effect
     * immediately and persists after the database is shut down and started up again.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final ParameterScope scope;

    /**
     * The clause used to specify when the parameter change takes effect.
     *
     * <p>Use {@code MEMORY} to make the change in memory and ensure that it takes effect
     * immediately. Use {@code SPFILE} to make the change in the server parameter file. The change
     * takes effect when the database is next shut down and started up again. Use {@code BOTH} to
     * make the change in memory and in the server parameter file. The change takes effect
     * immediately and persists after the database is shut down and started up again.
     *
     * @return the value
     */
    public ParameterScope getScope() {
        return scope;
    }

    /** A list of database parameter names. */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<String> parameters;

    /**
     * A list of database parameter names.
     *
     * @return the value
     */
    public java.util.List<String> getParameters() {
        return parameters;
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
        sb.append("ResetDatabaseParametersDetails(");
        sb.append("super=").append(super.toString());
        sb.append("credentials=").append(String.valueOf(this.credentials));
        sb.append(", databaseCredential=").append(String.valueOf(this.databaseCredential));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResetDatabaseParametersDetails)) {
            return false;
        }

        ResetDatabaseParametersDetails other = (ResetDatabaseParametersDetails) o;
        return java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.databaseCredential, other.databaseCredential)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseCredential == null
                                ? 43
                                : this.databaseCredential.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
