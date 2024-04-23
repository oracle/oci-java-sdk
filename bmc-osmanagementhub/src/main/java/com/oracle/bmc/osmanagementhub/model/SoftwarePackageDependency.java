/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Identifies the dependency for a software package. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SoftwarePackageDependency.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SoftwarePackageDependency
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The software package's dependency. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependency")
        private String dependency;

        /**
         * The software package's dependency.
         *
         * @param dependency the value to set
         * @return this builder
         */
        public Builder dependency(String dependency) {
            this.dependency = dependency;
            this.__explicitlySet__.add("dependency");
            return this;
        }
        /** The type of the dependency. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependencyType")
        private String dependencyType;

        /**
         * The type of the dependency.
         *
         * @param dependencyType the value to set
         * @return this builder
         */
        public Builder dependencyType(String dependencyType) {
            this.dependencyType = dependencyType;
            this.__explicitlySet__.add("dependencyType");
            return this;
        }
        /** The modifier for the dependency. */
        @com.fasterxml.jackson.annotation.JsonProperty("dependencyModifier")
        private String dependencyModifier;

        /**
         * The modifier for the dependency.
         *
         * @param dependencyModifier the value to set
         * @return this builder
         */
        public Builder dependencyModifier(String dependencyModifier) {
            this.dependencyModifier = dependencyModifier;
            this.__explicitlySet__.add("dependencyModifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackageDependency build() {
            SoftwarePackageDependency model =
                    new SoftwarePackageDependency(
                            this.dependency, this.dependencyType, this.dependencyModifier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackageDependency model) {
            if (model.wasPropertyExplicitlySet("dependency")) {
                this.dependency(model.getDependency());
            }
            if (model.wasPropertyExplicitlySet("dependencyType")) {
                this.dependencyType(model.getDependencyType());
            }
            if (model.wasPropertyExplicitlySet("dependencyModifier")) {
                this.dependencyModifier(model.getDependencyModifier());
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

    /** The software package's dependency. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependency")
    private final String dependency;

    /**
     * The software package's dependency.
     *
     * @return the value
     */
    public String getDependency() {
        return dependency;
    }

    /** The type of the dependency. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyType")
    private final String dependencyType;

    /**
     * The type of the dependency.
     *
     * @return the value
     */
    public String getDependencyType() {
        return dependencyType;
    }

    /** The modifier for the dependency. */
    @com.fasterxml.jackson.annotation.JsonProperty("dependencyModifier")
    private final String dependencyModifier;

    /**
     * The modifier for the dependency.
     *
     * @return the value
     */
    public String getDependencyModifier() {
        return dependencyModifier;
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
        sb.append("SoftwarePackageDependency(");
        sb.append("super=").append(super.toString());
        sb.append("dependency=").append(String.valueOf(this.dependency));
        sb.append(", dependencyType=").append(String.valueOf(this.dependencyType));
        sb.append(", dependencyModifier=").append(String.valueOf(this.dependencyModifier));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
