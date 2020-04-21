/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A dependecy for a software package
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwarePackageDependency.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SoftwarePackageDependency {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dependency")
        private String dependency;

        public Builder dependency(String dependency) {
            this.dependency = dependency;
            this.__explicitlySet__.add("dependency");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependencyType")
        private String dependencyType;

        public Builder dependencyType(String dependencyType) {
            this.dependencyType = dependencyType;
            this.__explicitlySet__.add("dependencyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dependencyModifier")
        private String dependencyModifier;

        public Builder dependencyModifier(String dependencyModifier) {
            this.dependencyModifier = dependencyModifier;
            this.__explicitlySet__.add("dependencyModifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackageDependency build() {
            SoftwarePackageDependency __instance__ =
                    new SoftwarePackageDependency(dependency, dependencyType, dependencyModifier);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackageDependency o) {
            Builder copiedBuilder =
                    dependency(o.getDependency())
                            .dependencyType(o.getDependencyType())
                            .dependencyModifier(o.getDependencyModifier());

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

    /**
     * the software package's dependency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependency")
    String dependency;

    /**
     * the type of the dependency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyType")
    String dependencyType;

    /**
     * the modifier for the dependency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyModifier")
    String dependencyModifier;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
