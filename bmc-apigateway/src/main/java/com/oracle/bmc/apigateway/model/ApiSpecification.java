/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * The logical configuration of the API exposed by a deployment. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ApiSpecification.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApiSpecification
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"requestPolicies", "loggingPolicies", "routes"})
    public ApiSpecification(
            ApiSpecificationRequestPolicies requestPolicies,
            ApiSpecificationLoggingPolicies loggingPolicies,
            java.util.List<ApiSpecificationRoute> routes) {
        super();
        this.requestPolicies = requestPolicies;
        this.loggingPolicies = loggingPolicies;
        this.routes = routes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
        private ApiSpecificationRequestPolicies requestPolicies;

        public Builder requestPolicies(ApiSpecificationRequestPolicies requestPolicies) {
            this.requestPolicies = requestPolicies;
            this.__explicitlySet__.add("requestPolicies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
        private ApiSpecificationLoggingPolicies loggingPolicies;

        public Builder loggingPolicies(ApiSpecificationLoggingPolicies loggingPolicies) {
            this.loggingPolicies = loggingPolicies;
            this.__explicitlySet__.add("loggingPolicies");
            return this;
        }
        /** A list of routes that this API exposes. */
        @com.fasterxml.jackson.annotation.JsonProperty("routes")
        private java.util.List<ApiSpecificationRoute> routes;

        /**
         * A list of routes that this API exposes.
         *
         * @param routes the value to set
         * @return this builder
         */
        public Builder routes(java.util.List<ApiSpecificationRoute> routes) {
            this.routes = routes;
            this.__explicitlySet__.add("routes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecification build() {
            ApiSpecification model =
                    new ApiSpecification(this.requestPolicies, this.loggingPolicies, this.routes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecification model) {
            if (model.wasPropertyExplicitlySet("requestPolicies")) {
                this.requestPolicies(model.getRequestPolicies());
            }
            if (model.wasPropertyExplicitlySet("loggingPolicies")) {
                this.loggingPolicies(model.getLoggingPolicies());
            }
            if (model.wasPropertyExplicitlySet("routes")) {
                this.routes(model.getRoutes());
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

    @com.fasterxml.jackson.annotation.JsonProperty("requestPolicies")
    private final ApiSpecificationRequestPolicies requestPolicies;

    public ApiSpecificationRequestPolicies getRequestPolicies() {
        return requestPolicies;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loggingPolicies")
    private final ApiSpecificationLoggingPolicies loggingPolicies;

    public ApiSpecificationLoggingPolicies getLoggingPolicies() {
        return loggingPolicies;
    }

    /** A list of routes that this API exposes. */
    @com.fasterxml.jackson.annotation.JsonProperty("routes")
    private final java.util.List<ApiSpecificationRoute> routes;

    /**
     * A list of routes that this API exposes.
     *
     * @return the value
     */
    public java.util.List<ApiSpecificationRoute> getRoutes() {
        return routes;
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
        sb.append("ApiSpecification(");
        sb.append("super=").append(super.toString());
        sb.append("requestPolicies=").append(String.valueOf(this.requestPolicies));
        sb.append(", loggingPolicies=").append(String.valueOf(this.loggingPolicies));
        sb.append(", routes=").append(String.valueOf(this.routes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecification)) {
            return false;
        }

        ApiSpecification other = (ApiSpecification) o;
        return java.util.Objects.equals(this.requestPolicies, other.requestPolicies)
                && java.util.Objects.equals(this.loggingPolicies, other.loggingPolicies)
                && java.util.Objects.equals(this.routes, other.routes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.requestPolicies == null ? 43 : this.requestPolicies.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingPolicies == null ? 43 : this.loggingPolicies.hashCode());
        result = (result * PRIME) + (this.routes == null ? 43 : this.routes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
