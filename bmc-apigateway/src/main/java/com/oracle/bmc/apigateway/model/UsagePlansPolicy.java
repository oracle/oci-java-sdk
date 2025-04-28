/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Usage plan policies for this deployment <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UsagePlansPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsagePlansPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tokenLocations"})
    public UsagePlansPolicy(java.util.List<String> tokenLocations) {
        super();
        this.tokenLocations = tokenLocations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of context variables specifying where API tokens may be located in a request.
         * Example locations: - "request.headers[token]" - "request.query[token]" -
         * "request.auth[Token]" - "request.path[TOKEN]"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tokenLocations")
        private java.util.List<String> tokenLocations;

        /**
         * A list of context variables specifying where API tokens may be located in a request.
         * Example locations: - "request.headers[token]" - "request.query[token]" -
         * "request.auth[Token]" - "request.path[TOKEN]"
         *
         * @param tokenLocations the value to set
         * @return this builder
         */
        public Builder tokenLocations(java.util.List<String> tokenLocations) {
            this.tokenLocations = tokenLocations;
            this.__explicitlySet__.add("tokenLocations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsagePlansPolicy build() {
            UsagePlansPolicy model = new UsagePlansPolicy(this.tokenLocations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsagePlansPolicy model) {
            if (model.wasPropertyExplicitlySet("tokenLocations")) {
                this.tokenLocations(model.getTokenLocations());
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
     * A list of context variables specifying where API tokens may be located in a request. Example
     * locations: - "request.headers[token]" - "request.query[token]" - "request.auth[Token]" -
     * "request.path[TOKEN]"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tokenLocations")
    private final java.util.List<String> tokenLocations;

    /**
     * A list of context variables specifying where API tokens may be located in a request. Example
     * locations: - "request.headers[token]" - "request.query[token]" - "request.auth[Token]" -
     * "request.path[TOKEN]"
     *
     * @return the value
     */
    public java.util.List<String> getTokenLocations() {
        return tokenLocations;
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
        sb.append("UsagePlansPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("tokenLocations=").append(String.valueOf(this.tokenLocations));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsagePlansPolicy)) {
            return false;
        }

        UsagePlansPolicy other = (UsagePlansPolicy) o;
        return java.util.Objects.equals(this.tokenLocations, other.tokenLocations)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.tokenLocations == null ? 43 : this.tokenLocations.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
