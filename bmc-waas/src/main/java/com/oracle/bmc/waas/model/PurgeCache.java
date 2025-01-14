/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The list of cached resources to purge. If a resource is not specified, the purge targets all
 * rules in a policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PurgeCache.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PurgeCache extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resources"})
    public PurgeCache(java.util.List<String> resources) {
        super();
        this.resources = resources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A resource to purge, specified by either a hostless absolute path starting with a single
         * slash (Example: {@code /path/to/resource}) or by a relative path in which the first
         * component will be interpreted as a domain protected by the WAAS policy (Example: {@code
         * example.com/path/to/resource}).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<String> resources;

        /**
         * A resource to purge, specified by either a hostless absolute path starting with a single
         * slash (Example: {@code /path/to/resource}) or by a relative path in which the first
         * component will be interpreted as a domain protected by the WAAS policy (Example: {@code
         * example.com/path/to/resource}).
         *
         * @param resources the value to set
         * @return this builder
         */
        public Builder resources(java.util.List<String> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PurgeCache build() {
            PurgeCache model = new PurgeCache(this.resources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PurgeCache model) {
            if (model.wasPropertyExplicitlySet("resources")) {
                this.resources(model.getResources());
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
     * A resource to purge, specified by either a hostless absolute path starting with a single
     * slash (Example: {@code /path/to/resource}) or by a relative path in which the first component
     * will be interpreted as a domain protected by the WAAS policy (Example: {@code
     * example.com/path/to/resource}).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    private final java.util.List<String> resources;

    /**
     * A resource to purge, specified by either a hostless absolute path starting with a single
     * slash (Example: {@code /path/to/resource}) or by a relative path in which the first component
     * will be interpreted as a domain protected by the WAAS policy (Example: {@code
     * example.com/path/to/resource}).
     *
     * @return the value
     */
    public java.util.List<String> getResources() {
        return resources;
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
        sb.append("PurgeCache(");
        sb.append("super=").append(super.toString());
        sb.append("resources=").append(String.valueOf(this.resources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurgeCache)) {
            return false;
        }

        PurgeCache other = (PurgeCache) o;
        return java.util.Objects.equals(this.resources, other.resources) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resources == null ? 43 : this.resources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
