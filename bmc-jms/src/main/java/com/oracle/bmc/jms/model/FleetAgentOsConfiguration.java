/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Management Agent Configuration for list of include/exclude file system paths (specific to operating system).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetAgentOsConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FleetAgentOsConfiguration {
    @Deprecated
    @java.beans.ConstructorProperties({"includePaths", "excludePaths"})
    public FleetAgentOsConfiguration(
            java.util.List<String> includePaths, java.util.List<String> excludePaths) {
        super();
        this.includePaths = includePaths;
        this.excludePaths = excludePaths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("includePaths")
        private java.util.List<String> includePaths;

        public Builder includePaths(java.util.List<String> includePaths) {
            this.includePaths = includePaths;
            this.__explicitlySet__.add("includePaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("excludePaths")
        private java.util.List<String> excludePaths;

        public Builder excludePaths(java.util.List<String> excludePaths) {
            this.excludePaths = excludePaths;
            this.__explicitlySet__.add("excludePaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetAgentOsConfiguration build() {
            FleetAgentOsConfiguration __instance__ =
                    new FleetAgentOsConfiguration(includePaths, excludePaths);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetAgentOsConfiguration o) {
            Builder copiedBuilder =
                    includePaths(o.getIncludePaths()).excludePaths(o.getExcludePaths());

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
     * An array of file system paths (environment variables supported).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includePaths")
    private final java.util.List<String> includePaths;

    public java.util.List<String> getIncludePaths() {
        return includePaths;
    }

    /**
     * An array of file system paths (environment variables supported).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludePaths")
    private final java.util.List<String> excludePaths;

    public java.util.List<String> getExcludePaths() {
        return excludePaths;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FleetAgentOsConfiguration(");
        sb.append("includePaths=").append(String.valueOf(this.includePaths));
        sb.append(", excludePaths=").append(String.valueOf(this.excludePaths));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetAgentOsConfiguration)) {
            return false;
        }

        FleetAgentOsConfiguration other = (FleetAgentOsConfiguration) o;
        return java.util.Objects.equals(this.includePaths, other.includePaths)
                && java.util.Objects.equals(this.excludePaths, other.excludePaths)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.includePaths == null ? 43 : this.includePaths.hashCode());
        result = (result * PRIME) + (this.excludePaths == null ? 43 : this.excludePaths.hashCode());
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
