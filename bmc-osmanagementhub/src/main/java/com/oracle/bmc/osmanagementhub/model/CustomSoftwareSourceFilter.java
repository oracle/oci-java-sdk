/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Used to apply filters to a VendorSoftwareSource to create/update CustomSoftwareSources. <br>
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
        builder = CustomSoftwareSourceFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CustomSoftwareSourceFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "packageFilters",
        "moduleStreamProfileFilters",
        "packageGroupFilters"
    })
    public CustomSoftwareSourceFilter(
            java.util.List<PackageFilter> packageFilters,
            java.util.List<ModuleStreamProfileFilter> moduleStreamProfileFilters,
            java.util.List<PackageGroupFilter> packageGroupFilters) {
        super();
        this.packageFilters = packageFilters;
        this.moduleStreamProfileFilters = moduleStreamProfileFilters;
        this.packageGroupFilters = packageGroupFilters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of package filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageFilters")
        private java.util.List<PackageFilter> packageFilters;

        /**
         * The list of package filters.
         *
         * @param packageFilters the value to set
         * @return this builder
         */
        public Builder packageFilters(java.util.List<PackageFilter> packageFilters) {
            this.packageFilters = packageFilters;
            this.__explicitlySet__.add("packageFilters");
            return this;
        }
        /** The list of module stream/profile filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("moduleStreamProfileFilters")
        private java.util.List<ModuleStreamProfileFilter> moduleStreamProfileFilters;

        /**
         * The list of module stream/profile filters.
         *
         * @param moduleStreamProfileFilters the value to set
         * @return this builder
         */
        public Builder moduleStreamProfileFilters(
                java.util.List<ModuleStreamProfileFilter> moduleStreamProfileFilters) {
            this.moduleStreamProfileFilters = moduleStreamProfileFilters;
            this.__explicitlySet__.add("moduleStreamProfileFilters");
            return this;
        }
        /** The list of group filters. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageGroupFilters")
        private java.util.List<PackageGroupFilter> packageGroupFilters;

        /**
         * The list of group filters.
         *
         * @param packageGroupFilters the value to set
         * @return this builder
         */
        public Builder packageGroupFilters(java.util.List<PackageGroupFilter> packageGroupFilters) {
            this.packageGroupFilters = packageGroupFilters;
            this.__explicitlySet__.add("packageGroupFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CustomSoftwareSourceFilter build() {
            CustomSoftwareSourceFilter model =
                    new CustomSoftwareSourceFilter(
                            this.packageFilters,
                            this.moduleStreamProfileFilters,
                            this.packageGroupFilters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CustomSoftwareSourceFilter model) {
            if (model.wasPropertyExplicitlySet("packageFilters")) {
                this.packageFilters(model.getPackageFilters());
            }
            if (model.wasPropertyExplicitlySet("moduleStreamProfileFilters")) {
                this.moduleStreamProfileFilters(model.getModuleStreamProfileFilters());
            }
            if (model.wasPropertyExplicitlySet("packageGroupFilters")) {
                this.packageGroupFilters(model.getPackageGroupFilters());
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

    /** The list of package filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageFilters")
    private final java.util.List<PackageFilter> packageFilters;

    /**
     * The list of package filters.
     *
     * @return the value
     */
    public java.util.List<PackageFilter> getPackageFilters() {
        return packageFilters;
    }

    /** The list of module stream/profile filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("moduleStreamProfileFilters")
    private final java.util.List<ModuleStreamProfileFilter> moduleStreamProfileFilters;

    /**
     * The list of module stream/profile filters.
     *
     * @return the value
     */
    public java.util.List<ModuleStreamProfileFilter> getModuleStreamProfileFilters() {
        return moduleStreamProfileFilters;
    }

    /** The list of group filters. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageGroupFilters")
    private final java.util.List<PackageGroupFilter> packageGroupFilters;

    /**
     * The list of group filters.
     *
     * @return the value
     */
    public java.util.List<PackageGroupFilter> getPackageGroupFilters() {
        return packageGroupFilters;
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
        sb.append("CustomSoftwareSourceFilter(");
        sb.append("super=").append(super.toString());
        sb.append("packageFilters=").append(String.valueOf(this.packageFilters));
        sb.append(", moduleStreamProfileFilters=")
                .append(String.valueOf(this.moduleStreamProfileFilters));
        sb.append(", packageGroupFilters=").append(String.valueOf(this.packageGroupFilters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CustomSoftwareSourceFilter)) {
            return false;
        }

        CustomSoftwareSourceFilter other = (CustomSoftwareSourceFilter) o;
        return java.util.Objects.equals(this.packageFilters, other.packageFilters)
                && java.util.Objects.equals(
                        this.moduleStreamProfileFilters, other.moduleStreamProfileFilters)
                && java.util.Objects.equals(this.packageGroupFilters, other.packageGroupFilters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.packageFilters == null ? 43 : this.packageFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.moduleStreamProfileFilters == null
                                ? 43
                                : this.moduleStreamProfileFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.packageGroupFilters == null
                                ? 43
                                : this.packageGroupFilters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
