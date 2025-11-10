/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for API-based execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApiBasedExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "executionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApiBasedExecutionDetails extends ExecutionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Endpoint to be invoked. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * Endpoint to be invoked.
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /** The list of system variables. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemVariables")
        private java.util.List<String> systemVariables;

        /**
         * The list of system variables.
         *
         * @param systemVariables the value to set
         * @return this builder
         */
        public Builder systemVariables(java.util.List<String> systemVariables) {
            this.systemVariables = systemVariables;
            this.__explicitlySet__.add("systemVariables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiBasedExecutionDetails build() {
            ApiBasedExecutionDetails model =
                    new ApiBasedExecutionDetails(this.endpoint, this.systemVariables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiBasedExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("systemVariables")) {
                this.systemVariables(model.getSystemVariables());
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
    public ApiBasedExecutionDetails(String endpoint, java.util.List<String> systemVariables) {
        super();
        this.endpoint = endpoint;
        this.systemVariables = systemVariables;
    }

    /** Endpoint to be invoked. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * Endpoint to be invoked.
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
    }

    /** The list of system variables. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemVariables")
    private final java.util.List<String> systemVariables;

    /**
     * The list of system variables.
     *
     * @return the value
     */
    public java.util.List<String> getSystemVariables() {
        return systemVariables;
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
        sb.append("ApiBasedExecutionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", systemVariables=").append(String.valueOf(this.systemVariables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiBasedExecutionDetails)) {
            return false;
        }

        ApiBasedExecutionDetails other = (ApiBasedExecutionDetails) o;
        return java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.systemVariables, other.systemVariables)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVariables == null ? 43 : this.systemVariables.hashCode());
        return result;
    }
}
