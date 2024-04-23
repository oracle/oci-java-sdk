/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides the information used to create a filter for groups from a vendor software source to
 * create or update a custom software source. <br>
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
        builder = PackageGroupFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PackageGroupFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"packageGroups", "filterType"})
    public PackageGroupFilter(java.util.List<String> packageGroups, FilterType filterType) {
        super();
        this.packageGroups = packageGroups;
        this.filterType = filterType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of package group names. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageGroups")
        private java.util.List<String> packageGroups;

        /**
         * List of package group names.
         *
         * @param packageGroups the value to set
         * @return this builder
         */
        public Builder packageGroups(java.util.List<String> packageGroups) {
            this.packageGroups = packageGroups;
            this.__explicitlySet__.add("packageGroups");
            return this;
        }
        /** The type of the filter. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private FilterType filterType;

        /**
         * The type of the filter.
         *
         * @param filterType the value to set
         * @return this builder
         */
        public Builder filterType(FilterType filterType) {
            this.filterType = filterType;
            this.__explicitlySet__.add("filterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PackageGroupFilter build() {
            PackageGroupFilter model = new PackageGroupFilter(this.packageGroups, this.filterType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PackageGroupFilter model) {
            if (model.wasPropertyExplicitlySet("packageGroups")) {
                this.packageGroups(model.getPackageGroups());
            }
            if (model.wasPropertyExplicitlySet("filterType")) {
                this.filterType(model.getFilterType());
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

    /** List of package group names. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageGroups")
    private final java.util.List<String> packageGroups;

    /**
     * List of package group names.
     *
     * @return the value
     */
    public java.util.List<String> getPackageGroups() {
        return packageGroups;
    }

    /** The type of the filter. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final FilterType filterType;

    /**
     * The type of the filter.
     *
     * @return the value
     */
    public FilterType getFilterType() {
        return filterType;
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
        sb.append("PackageGroupFilter(");
        sb.append("super=").append(super.toString());
        sb.append("packageGroups=").append(String.valueOf(this.packageGroups));
        sb.append(", filterType=").append(String.valueOf(this.filterType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageGroupFilter)) {
            return false;
        }

        PackageGroupFilter other = (PackageGroupFilter) o;
        return java.util.Objects.equals(this.packageGroups, other.packageGroups)
                && java.util.Objects.equals(this.filterType, other.filterType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.packageGroups == null ? 43 : this.packageGroups.hashCode());
        result = (result * PRIME) + (this.filterType == null ? 43 : this.filterType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
