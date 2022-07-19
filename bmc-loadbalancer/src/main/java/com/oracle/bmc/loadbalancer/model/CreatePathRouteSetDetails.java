/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A named set of path route rules to add to the load balancer.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreatePathRouteSetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreatePathRouteSetDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "pathRoutes"})
    public CreatePathRouteSetDetails(String name, java.util.List<PathRoute> pathRoutes) {
        super();
        this.name = name;
        this.pathRoutes = pathRoutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name for this set of path route rules. It must be unique and it cannot be changed. Avoid entering
         * confidential information.
         * <p>
         * Example: {@code example_path_route_set}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name for this set of path route rules. It must be unique and it cannot be changed. Avoid entering
         * confidential information.
         * <p>
         * Example: {@code example_path_route_set}
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The set of path route rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pathRoutes")
        private java.util.List<PathRoute> pathRoutes;

        /**
         * The set of path route rules.
         * @param pathRoutes the value to set
         * @return this builder
         **/
        public Builder pathRoutes(java.util.List<PathRoute> pathRoutes) {
            this.pathRoutes = pathRoutes;
            this.__explicitlySet__.add("pathRoutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreatePathRouteSetDetails build() {
            CreatePathRouteSetDetails __instance__ =
                    new CreatePathRouteSetDetails(name, pathRoutes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreatePathRouteSetDetails o) {
            Builder copiedBuilder = name(o.getName()).pathRoutes(o.getPathRoutes());

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

    /**
     * The name for this set of path route rules. It must be unique and it cannot be changed. Avoid entering
     * confidential information.
     * <p>
     * Example: {@code example_path_route_set}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name for this set of path route rules. It must be unique and it cannot be changed. Avoid entering
     * confidential information.
     * <p>
     * Example: {@code example_path_route_set}
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The set of path route rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pathRoutes")
    private final java.util.List<PathRoute> pathRoutes;

    /**
     * The set of path route rules.
     * @return the value
     **/
    public java.util.List<PathRoute> getPathRoutes() {
        return pathRoutes;
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
        sb.append("CreatePathRouteSetDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", pathRoutes=").append(String.valueOf(this.pathRoutes));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreatePathRouteSetDetails)) {
            return false;
        }

        CreatePathRouteSetDetails other = (CreatePathRouteSetDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.pathRoutes, other.pathRoutes)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.pathRoutes == null ? 43 : this.pathRoutes.hashCode());
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
