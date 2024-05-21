/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Behavior applied to any requests received by the API on this route.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiSpecificationRouteRequestPolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecificationRouteRequestPolicies
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "authorization",
        "cors",
        "queryParameterValidations",
        "headerValidations",
        "bodyValidation",
        "headerTransformations",
        "queryParameterTransformations",
        "responseCacheLookup"
    })
    public ApiSpecificationRouteRequestPolicies(
            RouteAuthorizationPolicy authorization,
            CorsPolicy cors,
            QueryParameterValidationRequestPolicy queryParameterValidations,
            HeaderValidationRequestPolicy headerValidations,
            BodyValidationRequestPolicy bodyValidation,
            HeaderTransformationPolicy headerTransformations,
            QueryParameterTransformationPolicy queryParameterTransformations,
            ResponseCacheLookupPolicy responseCacheLookup) {
        super();
        this.authorization = authorization;
        this.cors = cors;
        this.queryParameterValidations = queryParameterValidations;
        this.headerValidations = headerValidations;
        this.bodyValidation = bodyValidation;
        this.headerTransformations = headerTransformations;
        this.queryParameterTransformations = queryParameterTransformations;
        this.responseCacheLookup = responseCacheLookup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("authorization")
        private RouteAuthorizationPolicy authorization;

        public Builder authorization(RouteAuthorizationPolicy authorization) {
            this.authorization = authorization;
            this.__explicitlySet__.add("authorization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cors")
        private CorsPolicy cors;

        public Builder cors(CorsPolicy cors) {
            this.cors = cors;
            this.__explicitlySet__.add("cors");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryParameterValidations")
        private QueryParameterValidationRequestPolicy queryParameterValidations;

        public Builder queryParameterValidations(
                QueryParameterValidationRequestPolicy queryParameterValidations) {
            this.queryParameterValidations = queryParameterValidations;
            this.__explicitlySet__.add("queryParameterValidations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerValidations")
        private HeaderValidationRequestPolicy headerValidations;

        public Builder headerValidations(HeaderValidationRequestPolicy headerValidations) {
            this.headerValidations = headerValidations;
            this.__explicitlySet__.add("headerValidations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bodyValidation")
        private BodyValidationRequestPolicy bodyValidation;

        public Builder bodyValidation(BodyValidationRequestPolicy bodyValidation) {
            this.bodyValidation = bodyValidation;
            this.__explicitlySet__.add("bodyValidation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
        private HeaderTransformationPolicy headerTransformations;

        public Builder headerTransformations(HeaderTransformationPolicy headerTransformations) {
            this.headerTransformations = headerTransformations;
            this.__explicitlySet__.add("headerTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryParameterTransformations")
        private QueryParameterTransformationPolicy queryParameterTransformations;

        public Builder queryParameterTransformations(
                QueryParameterTransformationPolicy queryParameterTransformations) {
            this.queryParameterTransformations = queryParameterTransformations;
            this.__explicitlySet__.add("queryParameterTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCacheLookup")
        private ResponseCacheLookupPolicy responseCacheLookup;

        public Builder responseCacheLookup(ResponseCacheLookupPolicy responseCacheLookup) {
            this.responseCacheLookup = responseCacheLookup;
            this.__explicitlySet__.add("responseCacheLookup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRouteRequestPolicies build() {
            ApiSpecificationRouteRequestPolicies model =
                    new ApiSpecificationRouteRequestPolicies(
                            this.authorization,
                            this.cors,
                            this.queryParameterValidations,
                            this.headerValidations,
                            this.bodyValidation,
                            this.headerTransformations,
                            this.queryParameterTransformations,
                            this.responseCacheLookup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRouteRequestPolicies model) {
            if (model.wasPropertyExplicitlySet("authorization")) {
                this.authorization(model.getAuthorization());
            }
            if (model.wasPropertyExplicitlySet("cors")) {
                this.cors(model.getCors());
            }
            if (model.wasPropertyExplicitlySet("queryParameterValidations")) {
                this.queryParameterValidations(model.getQueryParameterValidations());
            }
            if (model.wasPropertyExplicitlySet("headerValidations")) {
                this.headerValidations(model.getHeaderValidations());
            }
            if (model.wasPropertyExplicitlySet("bodyValidation")) {
                this.bodyValidation(model.getBodyValidation());
            }
            if (model.wasPropertyExplicitlySet("headerTransformations")) {
                this.headerTransformations(model.getHeaderTransformations());
            }
            if (model.wasPropertyExplicitlySet("queryParameterTransformations")) {
                this.queryParameterTransformations(model.getQueryParameterTransformations());
            }
            if (model.wasPropertyExplicitlySet("responseCacheLookup")) {
                this.responseCacheLookup(model.getResponseCacheLookup());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("authorization")
    private final RouteAuthorizationPolicy authorization;

    public RouteAuthorizationPolicy getAuthorization() {
        return authorization;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cors")
    private final CorsPolicy cors;

    public CorsPolicy getCors() {
        return cors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryParameterValidations")
    private final QueryParameterValidationRequestPolicy queryParameterValidations;

    public QueryParameterValidationRequestPolicy getQueryParameterValidations() {
        return queryParameterValidations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("headerValidations")
    private final HeaderValidationRequestPolicy headerValidations;

    public HeaderValidationRequestPolicy getHeaderValidations() {
        return headerValidations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bodyValidation")
    private final BodyValidationRequestPolicy bodyValidation;

    public BodyValidationRequestPolicy getBodyValidation() {
        return bodyValidation;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
    private final HeaderTransformationPolicy headerTransformations;

    public HeaderTransformationPolicy getHeaderTransformations() {
        return headerTransformations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryParameterTransformations")
    private final QueryParameterTransformationPolicy queryParameterTransformations;

    public QueryParameterTransformationPolicy getQueryParameterTransformations() {
        return queryParameterTransformations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseCacheLookup")
    private final ResponseCacheLookupPolicy responseCacheLookup;

    public ResponseCacheLookupPolicy getResponseCacheLookup() {
        return responseCacheLookup;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiSpecificationRouteRequestPolicies(");
        sb.append("super=").append(super.toString());
        sb.append("authorization=").append(String.valueOf(this.authorization));
        sb.append(", cors=").append(String.valueOf(this.cors));
        sb.append(", queryParameterValidations=")
                .append(String.valueOf(this.queryParameterValidations));
        sb.append(", headerValidations=").append(String.valueOf(this.headerValidations));
        sb.append(", bodyValidation=").append(String.valueOf(this.bodyValidation));
        sb.append(", headerTransformations=").append(String.valueOf(this.headerTransformations));
        sb.append(", queryParameterTransformations=")
                .append(String.valueOf(this.queryParameterTransformations));
        sb.append(", responseCacheLookup=").append(String.valueOf(this.responseCacheLookup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecificationRouteRequestPolicies)) {
            return false;
        }

        ApiSpecificationRouteRequestPolicies other = (ApiSpecificationRouteRequestPolicies) o;
        return java.util.Objects.equals(this.authorization, other.authorization)
                && java.util.Objects.equals(this.cors, other.cors)
                && java.util.Objects.equals(
                        this.queryParameterValidations, other.queryParameterValidations)
                && java.util.Objects.equals(this.headerValidations, other.headerValidations)
                && java.util.Objects.equals(this.bodyValidation, other.bodyValidation)
                && java.util.Objects.equals(this.headerTransformations, other.headerTransformations)
                && java.util.Objects.equals(
                        this.queryParameterTransformations, other.queryParameterTransformations)
                && java.util.Objects.equals(this.responseCacheLookup, other.responseCacheLookup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.authorization == null ? 43 : this.authorization.hashCode());
        result = (result * PRIME) + (this.cors == null ? 43 : this.cors.hashCode());
        result =
                (result * PRIME)
                        + (this.queryParameterValidations == null
                                ? 43
                                : this.queryParameterValidations.hashCode());
        result =
                (result * PRIME)
                        + (this.headerValidations == null ? 43 : this.headerValidations.hashCode());
        result =
                (result * PRIME)
                        + (this.bodyValidation == null ? 43 : this.bodyValidation.hashCode());
        result =
                (result * PRIME)
                        + (this.headerTransformations == null
                                ? 43
                                : this.headerTransformations.hashCode());
        result =
                (result * PRIME)
                        + (this.queryParameterTransformations == null
                                ? 43
                                : this.queryParameterTransformations.hashCode());
        result =
                (result * PRIME)
                        + (this.responseCacheLookup == null
                                ? 43
                                : this.responseCacheLookup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
