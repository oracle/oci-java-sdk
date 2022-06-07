/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * A dependency for a software package
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SoftwarePackageDependency.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SoftwarePackageDependency {
    @Deprecated
    @java.beans.ConstructorProperties({"dependency", "dependencyType", "dependencyModifier"})
    public SoftwarePackageDependency(
            String dependency, String dependencyType, String dependencyModifier) {
        super();
        this.dependency = dependency;
        this.dependencyType = dependencyType;
        this.dependencyModifier = dependencyModifier;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * the software package's dependency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependency")
    private final String dependency;

    public String getDependency() {
        return dependency;
    }

    /**
     * the type of the dependency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyType")
    private final String dependencyType;

    public String getDependencyType() {
        return dependencyType;
    }

    /**
     * the modifier for the dependency
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyModifier")
    private final String dependencyModifier;

    public String getDependencyModifier() {
        return dependencyModifier;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SoftwarePackageDependency(");
        sb.append("dependency=").append(String.valueOf(this.dependency));
        sb.append(", dependencyType=").append(String.valueOf(this.dependencyType));
        sb.append(", dependencyModifier=").append(String.valueOf(this.dependencyModifier));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwarePackageDependency)) {
            return false;
        }

        SoftwarePackageDependency other = (SoftwarePackageDependency) o;
        return java.util.Objects.equals(this.dependency, other.dependency)
                && java.util.Objects.equals(this.dependencyType, other.dependencyType)
                && java.util.Objects.equals(this.dependencyModifier, other.dependencyModifier)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dependency == null ? 43 : this.dependency.hashCode());
        result =
                (result * PRIME)
                        + (this.dependencyType == null ? 43 : this.dependencyType.hashCode());
        result =
                (result * PRIME)
                        + (this.dependencyModifier == null
                                ? 43
                                : this.dependencyModifier.hashCode());
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
