/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the list of packages to add to a software source. <br>
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
        builder = AddPackagesToSoftwareSourceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddPackagesToSoftwareSourceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"packages", "isContinueOnMissingPackages"})
    public AddPackagesToSoftwareSourceDetails(
            java.util.List<String> packages, Boolean isContinueOnMissingPackages) {
        super();
        this.packages = packages;
        this.isContinueOnMissingPackages = isContinueOnMissingPackages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of packages specified by the name of the package (N) or the full package name (NVRA
         * or NEVRA).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packages")
        private java.util.List<String> packages;

        /**
         * List of packages specified by the name of the package (N) or the full package name (NVRA
         * or NEVRA).
         *
         * @param packages the value to set
         * @return this builder
         */
        public Builder packages(java.util.List<String> packages) {
            this.packages = packages;
            this.__explicitlySet__.add("packages");
            return this;
        }
        /**
         * Indicates whether the service should generate a custom software source when the package
         * list contains invalid values. When set to true, the service ignores any invalid packages
         * and generates the custom software source with using the valid packages.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isContinueOnMissingPackages")
        private Boolean isContinueOnMissingPackages;

        /**
         * Indicates whether the service should generate a custom software source when the package
         * list contains invalid values. When set to true, the service ignores any invalid packages
         * and generates the custom software source with using the valid packages.
         *
         * @param isContinueOnMissingPackages the value to set
         * @return this builder
         */
        public Builder isContinueOnMissingPackages(Boolean isContinueOnMissingPackages) {
            this.isContinueOnMissingPackages = isContinueOnMissingPackages;
            this.__explicitlySet__.add("isContinueOnMissingPackages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddPackagesToSoftwareSourceDetails build() {
            AddPackagesToSoftwareSourceDetails model =
                    new AddPackagesToSoftwareSourceDetails(
                            this.packages, this.isContinueOnMissingPackages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddPackagesToSoftwareSourceDetails model) {
            if (model.wasPropertyExplicitlySet("packages")) {
                this.packages(model.getPackages());
            }
            if (model.wasPropertyExplicitlySet("isContinueOnMissingPackages")) {
                this.isContinueOnMissingPackages(model.getIsContinueOnMissingPackages());
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
     * List of packages specified by the name of the package (N) or the full package name (NVRA or
     * NEVRA).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packages")
    private final java.util.List<String> packages;

    /**
     * List of packages specified by the name of the package (N) or the full package name (NVRA or
     * NEVRA).
     *
     * @return the value
     */
    public java.util.List<String> getPackages() {
        return packages;
    }

    /**
     * Indicates whether the service should generate a custom software source when the package list
     * contains invalid values. When set to true, the service ignores any invalid packages and
     * generates the custom software source with using the valid packages.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isContinueOnMissingPackages")
    private final Boolean isContinueOnMissingPackages;

    /**
     * Indicates whether the service should generate a custom software source when the package list
     * contains invalid values. When set to true, the service ignores any invalid packages and
     * generates the custom software source with using the valid packages.
     *
     * @return the value
     */
    public Boolean getIsContinueOnMissingPackages() {
        return isContinueOnMissingPackages;
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
        sb.append("AddPackagesToSoftwareSourceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("packages=").append(String.valueOf(this.packages));
        sb.append(", isContinueOnMissingPackages=")
                .append(String.valueOf(this.isContinueOnMissingPackages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddPackagesToSoftwareSourceDetails)) {
            return false;
        }

        AddPackagesToSoftwareSourceDetails other = (AddPackagesToSoftwareSourceDetails) o;
        return java.util.Objects.equals(this.packages, other.packages)
                && java.util.Objects.equals(
                        this.isContinueOnMissingPackages, other.isContinueOnMissingPackages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.packages == null ? 43 : this.packages.hashCode());
        result =
                (result * PRIME)
                        + (this.isContinueOnMissingPackages == null
                                ? 43
                                : this.isContinueOnMissingPackages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
