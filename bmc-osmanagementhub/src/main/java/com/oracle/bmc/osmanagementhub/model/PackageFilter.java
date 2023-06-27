/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Used to select packages from VendorSoftwareSources to create/update CustomSoftwareSources. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PackageFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PackageFilter extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "packageName",
        "packageNamePattern",
        "packageVersion",
        "filterType"
    })
    public PackageFilter(
            String packageName,
            String packageNamePattern,
            String packageVersion,
            FilterType filterType) {
        super();
        this.packageName = packageName;
        this.packageNamePattern = packageNamePattern;
        this.packageVersion = packageVersion;
        this.filterType = filterType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The package name. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageName")
        private String packageName;

        /**
         * The package name.
         *
         * @param packageName the value to set
         * @return this builder
         */
        public Builder packageName(String packageName) {
            this.packageName = packageName;
            this.__explicitlySet__.add("packageName");
            return this;
        }
        /** The package name pattern. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageNamePattern")
        private String packageNamePattern;

        /**
         * The package name pattern.
         *
         * @param packageNamePattern the value to set
         * @return this builder
         */
        public Builder packageNamePattern(String packageNamePattern) {
            this.packageNamePattern = packageNamePattern;
            this.__explicitlySet__.add("packageNamePattern");
            return this;
        }
        /**
         * The package version, which is denoted by 'version-release', or 'epoch:version-release'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
        private String packageVersion;

        /**
         * The package version, which is denoted by 'version-release', or 'epoch:version-release'.
         *
         * @param packageVersion the value to set
         * @return this builder
         */
        public Builder packageVersion(String packageVersion) {
            this.packageVersion = packageVersion;
            this.__explicitlySet__.add("packageVersion");
            return this;
        }
        /** The type of the filter, which can be of two types - INCLUDE or EXCLUDE. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterType")
        private FilterType filterType;

        /**
         * The type of the filter, which can be of two types - INCLUDE or EXCLUDE.
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

        public PackageFilter build() {
            PackageFilter model =
                    new PackageFilter(
                            this.packageName,
                            this.packageNamePattern,
                            this.packageVersion,
                            this.filterType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PackageFilter model) {
            if (model.wasPropertyExplicitlySet("packageName")) {
                this.packageName(model.getPackageName());
            }
            if (model.wasPropertyExplicitlySet("packageNamePattern")) {
                this.packageNamePattern(model.getPackageNamePattern());
            }
            if (model.wasPropertyExplicitlySet("packageVersion")) {
                this.packageVersion(model.getPackageVersion());
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

    /** The package name. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageName")
    private final String packageName;

    /**
     * The package name.
     *
     * @return the value
     */
    public String getPackageName() {
        return packageName;
    }

    /** The package name pattern. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageNamePattern")
    private final String packageNamePattern;

    /**
     * The package name pattern.
     *
     * @return the value
     */
    public String getPackageNamePattern() {
        return packageNamePattern;
    }

    /** The package version, which is denoted by 'version-release', or 'epoch:version-release'. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageVersion")
    private final String packageVersion;

    /**
     * The package version, which is denoted by 'version-release', or 'epoch:version-release'.
     *
     * @return the value
     */
    public String getPackageVersion() {
        return packageVersion;
    }

    /** The type of the filter, which can be of two types - INCLUDE or EXCLUDE. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterType")
    private final FilterType filterType;

    /**
     * The type of the filter, which can be of two types - INCLUDE or EXCLUDE.
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
        sb.append("PackageFilter(");
        sb.append("super=").append(super.toString());
        sb.append("packageName=").append(String.valueOf(this.packageName));
        sb.append(", packageNamePattern=").append(String.valueOf(this.packageNamePattern));
        sb.append(", packageVersion=").append(String.valueOf(this.packageVersion));
        sb.append(", filterType=").append(String.valueOf(this.filterType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageFilter)) {
            return false;
        }

        PackageFilter other = (PackageFilter) o;
        return java.util.Objects.equals(this.packageName, other.packageName)
                && java.util.Objects.equals(this.packageNamePattern, other.packageNamePattern)
                && java.util.Objects.equals(this.packageVersion, other.packageVersion)
                && java.util.Objects.equals(this.filterType, other.filterType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.packageName == null ? 43 : this.packageName.hashCode());
        result =
                (result * PRIME)
                        + (this.packageNamePattern == null
                                ? 43
                                : this.packageNamePattern.hashCode());
        result =
                (result * PRIME)
                        + (this.packageVersion == null ? 43 : this.packageVersion.hashCode());
        result = (result * PRIME) + (this.filterType == null ? 43 : this.filterType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
