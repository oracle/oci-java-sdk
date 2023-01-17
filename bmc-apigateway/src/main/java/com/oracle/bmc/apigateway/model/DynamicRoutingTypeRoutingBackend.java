/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Policy for the details regarding each routing backend under dynamic routing. We specify the value of selectors for which this routing backend must be selected for a request under keys. We specify the configuration details of routing backend under backend.
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
    builder = DynamicRoutingTypeRoutingBackend.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DynamicRoutingTypeRoutingBackend
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "backend"})
    public DynamicRoutingTypeRoutingBackend(
            DynamicSelectionKey key, ApiSpecificationRouteBackend backend) {
        super();
        this.key = key;
        this.backend = backend;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private DynamicSelectionKey key;

        public Builder key(DynamicSelectionKey key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backend")
        private ApiSpecificationRouteBackend backend;

        public Builder backend(ApiSpecificationRouteBackend backend) {
            this.backend = backend;
            this.__explicitlySet__.add("backend");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynamicRoutingTypeRoutingBackend build() {
            DynamicRoutingTypeRoutingBackend model =
                    new DynamicRoutingTypeRoutingBackend(this.key, this.backend);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynamicRoutingTypeRoutingBackend model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("backend")) {
                this.backend(model.getBackend());
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

    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final DynamicSelectionKey key;

    public DynamicSelectionKey getKey() {
        return key;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backend")
    private final ApiSpecificationRouteBackend backend;

    public ApiSpecificationRouteBackend getBackend() {
        return backend;
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
        sb.append("DynamicRoutingTypeRoutingBackend(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", backend=").append(String.valueOf(this.backend));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DynamicRoutingTypeRoutingBackend)) {
            return false;
        }

        DynamicRoutingTypeRoutingBackend other = (DynamicRoutingTypeRoutingBackend) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.backend, other.backend)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.backend == null ? 43 : this.backend.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
