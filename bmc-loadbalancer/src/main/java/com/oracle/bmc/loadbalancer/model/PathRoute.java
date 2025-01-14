/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * A "path route rule" to evaluate an incoming URI path, and then route a matching request to the
 * specified backend set.
 *
 * <p>Path route rules apply only to HTTP and HTTPS requests. They have no effect on TCP requests.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PathRoute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PathRoute extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"path", "pathMatchType", "backendSetName"})
    public PathRoute(String path, PathMatchType pathMatchType, String backendSetName) {
        super();
        this.path = path;
        this.pathMatchType = pathMatchType;
        this.backendSetName = backendSetName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The path string to match against the incoming URI path.
         *
         * <p>Path strings are case-insensitive.
         *
         * <p>Asterisk (*) wildcards are not supported.
         *
         * <p>Regular expressions are not supported.
         *
         * <p>Example: {@code /example/video/123}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The path string to match against the incoming URI path.
         *
         * <p>Path strings are case-insensitive.
         *
         * <p>Asterisk (*) wildcards are not supported.
         *
         * <p>Regular expressions are not supported.
         *
         * <p>Example: {@code /example/video/123}
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The type of matching to apply to incoming URIs. */
        @com.fasterxml.jackson.annotation.JsonProperty("pathMatchType")
        private PathMatchType pathMatchType;

        /**
         * The type of matching to apply to incoming URIs.
         *
         * @param pathMatchType the value to set
         * @return this builder
         */
        public Builder pathMatchType(PathMatchType pathMatchType) {
            this.pathMatchType = pathMatchType;
            this.__explicitlySet__.add("pathMatchType");
            return this;
        }
        /**
         * The name of the target backend set for requests where the incoming URI matches the
         * specified path.
         *
         * <p>Example: {@code example_backend_set}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
        private String backendSetName;

        /**
         * The name of the target backend set for requests where the incoming URI matches the
         * specified path.
         *
         * <p>Example: {@code example_backend_set}
         *
         * @param backendSetName the value to set
         * @return this builder
         */
        public Builder backendSetName(String backendSetName) {
            this.backendSetName = backendSetName;
            this.__explicitlySet__.add("backendSetName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathRoute build() {
            PathRoute model = new PathRoute(this.path, this.pathMatchType, this.backendSetName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathRoute model) {
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("pathMatchType")) {
                this.pathMatchType(model.getPathMatchType());
            }
            if (model.wasPropertyExplicitlySet("backendSetName")) {
                this.backendSetName(model.getBackendSetName());
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
     * The path string to match against the incoming URI path.
     *
     * <p>Path strings are case-insensitive.
     *
     * <p>Asterisk (*) wildcards are not supported.
     *
     * <p>Regular expressions are not supported.
     *
     * <p>Example: {@code /example/video/123}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The path string to match against the incoming URI path.
     *
     * <p>Path strings are case-insensitive.
     *
     * <p>Asterisk (*) wildcards are not supported.
     *
     * <p>Regular expressions are not supported.
     *
     * <p>Example: {@code /example/video/123}
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The type of matching to apply to incoming URIs. */
    @com.fasterxml.jackson.annotation.JsonProperty("pathMatchType")
    private final PathMatchType pathMatchType;

    /**
     * The type of matching to apply to incoming URIs.
     *
     * @return the value
     */
    public PathMatchType getPathMatchType() {
        return pathMatchType;
    }

    /**
     * The name of the target backend set for requests where the incoming URI matches the specified
     * path.
     *
     * <p>Example: {@code example_backend_set}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backendSetName")
    private final String backendSetName;

    /**
     * The name of the target backend set for requests where the incoming URI matches the specified
     * path.
     *
     * <p>Example: {@code example_backend_set}
     *
     * @return the value
     */
    public String getBackendSetName() {
        return backendSetName;
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
        sb.append("PathRoute(");
        sb.append("super=").append(super.toString());
        sb.append("path=").append(String.valueOf(this.path));
        sb.append(", pathMatchType=").append(String.valueOf(this.pathMatchType));
        sb.append(", backendSetName=").append(String.valueOf(this.backendSetName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PathRoute)) {
            return false;
        }

        PathRoute other = (PathRoute) o;
        return java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.pathMatchType, other.pathMatchType)
                && java.util.Objects.equals(this.backendSetName, other.backendSetName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.pathMatchType == null ? 43 : this.pathMatchType.hashCode());
        result =
                (result * PRIME)
                        + (this.backendSetName == null ? 43 : this.backendSetName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
