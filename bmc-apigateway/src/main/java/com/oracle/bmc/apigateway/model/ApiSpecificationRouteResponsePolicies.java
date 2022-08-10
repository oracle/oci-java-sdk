/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Behavior applied to any responses sent by the API for requests on this route.
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
    builder = ApiSpecificationRouteResponsePolicies.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiSpecificationRouteResponsePolicies
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"headerTransformations", "responseCacheStore"})
    public ApiSpecificationRouteResponsePolicies(
            HeaderTransformationPolicy headerTransformations,
            ResponseCacheStorePolicy responseCacheStore) {
        super();
        this.headerTransformations = headerTransformations;
        this.responseCacheStore = responseCacheStore;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
        private HeaderTransformationPolicy headerTransformations;

        public Builder headerTransformations(HeaderTransformationPolicy headerTransformations) {
            this.headerTransformations = headerTransformations;
            this.__explicitlySet__.add("headerTransformations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseCacheStore")
        private ResponseCacheStorePolicy responseCacheStore;

        public Builder responseCacheStore(ResponseCacheStorePolicy responseCacheStore) {
            this.responseCacheStore = responseCacheStore;
            this.__explicitlySet__.add("responseCacheStore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiSpecificationRouteResponsePolicies build() {
            ApiSpecificationRouteResponsePolicies model =
                    new ApiSpecificationRouteResponsePolicies(
                            this.headerTransformations, this.responseCacheStore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiSpecificationRouteResponsePolicies model) {
            if (model.wasPropertyExplicitlySet("headerTransformations")) {
                this.headerTransformations(model.getHeaderTransformations());
            }
            if (model.wasPropertyExplicitlySet("responseCacheStore")) {
                this.responseCacheStore(model.getResponseCacheStore());
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

    @com.fasterxml.jackson.annotation.JsonProperty("headerTransformations")
    private final HeaderTransformationPolicy headerTransformations;

    public HeaderTransformationPolicy getHeaderTransformations() {
        return headerTransformations;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseCacheStore")
    private final ResponseCacheStorePolicy responseCacheStore;

    public ResponseCacheStorePolicy getResponseCacheStore() {
        return responseCacheStore;
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
        sb.append("ApiSpecificationRouteResponsePolicies(");
        sb.append("super=").append(super.toString());
        sb.append("headerTransformations=").append(String.valueOf(this.headerTransformations));
        sb.append(", responseCacheStore=").append(String.valueOf(this.responseCacheStore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiSpecificationRouteResponsePolicies)) {
            return false;
        }

        ApiSpecificationRouteResponsePolicies other = (ApiSpecificationRouteResponsePolicies) o;
        return java.util.Objects.equals(this.headerTransformations, other.headerTransformations)
                && java.util.Objects.equals(this.responseCacheStore, other.responseCacheStore)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.headerTransformations == null
                                ? 43
                                : this.headerTransformations.hashCode());
        result =
                (result * PRIME)
                        + (this.responseCacheStore == null
                                ? 43
                                : this.responseCacheStore.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
