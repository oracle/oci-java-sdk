/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to change database parameter values.
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
    builder = ChangeDatabaseParametersDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ChangeDatabaseParametersDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"credentials", "scope", "parameters"})
    public ChangeDatabaseParametersDetails(
            DatabaseCredentials credentials,
            ParameterScope scope,
            java.util.List<ChangeDatabaseParameterDetails> parameters) {
        super();
        this.credentials = credentials;
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
        /**
         * The clause used to specify when the parameter change takes effect.
         * <p>
         * Use {@code MEMORY} to make the change in memory and affect it immediately.
         * Use {@code SPFILE} to make the change in the server parameter file. The
         * change takes effect when the database is next shut down and started
         * up again. Use {@code BOTH} to make the change in memory and in the server
         * parameter file. The change takes effect immediately and persists
         * after the database is shut down and started up again.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private ParameterScope scope;

        /**
         * The clause used to specify when the parameter change takes effect.
         * <p>
         * Use {@code MEMORY} to make the change in memory and affect it immediately.
         * Use {@code SPFILE} to make the change in the server parameter file. The
         * change takes effect when the database is next shut down and started
         * up again. Use {@code BOTH} to make the change in memory and in the server
         * parameter file. The change takes effect immediately and persists
         * after the database is shut down and started up again.
         *
         * @param scope the value to set
         * @return this builder
         **/
        public Builder scope(ParameterScope scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }
        /**
         * A list of database parameters and their values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ChangeDatabaseParameterDetails> parameters;

        /**
         * A list of database parameters and their values.
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<ChangeDatabaseParameterDetails> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ChangeDatabaseParametersDetails build() {
            ChangeDatabaseParametersDetails __instance__ =
                    new ChangeDatabaseParametersDetails(credentials, scope, parameters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ChangeDatabaseParametersDetails o) {
            Builder copiedBuilder =
                    credentials(o.getCredentials())
                            .scope(o.getScope())
                            .parameters(o.getParameters());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final DatabaseCredentials credentials;

    public DatabaseCredentials getCredentials() {
        return credentials;
    }

    /**
     * The clause used to specify when the parameter change takes effect.
     * <p>
     * Use {@code MEMORY} to make the change in memory and affect it immediately.
     * Use {@code SPFILE} to make the change in the server parameter file. The
     * change takes effect when the database is next shut down and started
     * up again. Use {@code BOTH} to make the change in memory and in the server
     * parameter file. The change takes effect immediately and persists
     * after the database is shut down and started up again.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final ParameterScope scope;

    /**
     * The clause used to specify when the parameter change takes effect.
     * <p>
     * Use {@code MEMORY} to make the change in memory and affect it immediately.
     * Use {@code SPFILE} to make the change in the server parameter file. The
     * change takes effect when the database is next shut down and started
     * up again. Use {@code BOTH} to make the change in memory and in the server
     * parameter file. The change takes effect immediately and persists
     * after the database is shut down and started up again.
     *
     * @return the value
     **/
    public ParameterScope getScope() {
        return scope;
    }

    /**
     * A list of database parameters and their values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<ChangeDatabaseParameterDetails> parameters;

    /**
     * A list of database parameters and their values.
     * @return the value
     **/
    public java.util.List<ChangeDatabaseParameterDetails> getParameters() {
        return parameters;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ChangeDatabaseParametersDetails(");
        sb.append("credentials=").append(String.valueOf(this.credentials));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDatabaseParametersDetails)) {
            return false;
        }

        ChangeDatabaseParametersDetails other = (ChangeDatabaseParametersDetails) o;
        return java.util.Objects.equals(this.credentials, other.credentials)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
