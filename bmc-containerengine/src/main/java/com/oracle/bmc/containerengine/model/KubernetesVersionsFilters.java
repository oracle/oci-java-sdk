/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The range of kubernetes versions an addon can be configured. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = KubernetesVersionsFilters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KubernetesVersionsFilters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "minimalVersion",
        "maximumVersion",
        "exactKubernetesVersions"
    })
    public KubernetesVersionsFilters(
            String minimalVersion,
            String maximumVersion,
            java.util.List<String> exactKubernetesVersions) {
        super();
        this.minimalVersion = minimalVersion;
        this.maximumVersion = maximumVersion;
        this.exactKubernetesVersions = exactKubernetesVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The earliest kubernetes version. */
        @com.fasterxml.jackson.annotation.JsonProperty("minimalVersion")
        private String minimalVersion;

        /**
         * The earliest kubernetes version.
         *
         * @param minimalVersion the value to set
         * @return this builder
         */
        public Builder minimalVersion(String minimalVersion) {
            this.minimalVersion = minimalVersion;
            this.__explicitlySet__.add("minimalVersion");
            return this;
        }
        /** The latest kubernetes version. */
        @com.fasterxml.jackson.annotation.JsonProperty("maximumVersion")
        private String maximumVersion;

        /**
         * The latest kubernetes version.
         *
         * @param maximumVersion the value to set
         * @return this builder
         */
        public Builder maximumVersion(String maximumVersion) {
            this.maximumVersion = maximumVersion;
            this.__explicitlySet__.add("maximumVersion");
            return this;
        }
        /** The exact version of kubernetes that are compatible. */
        @com.fasterxml.jackson.annotation.JsonProperty("exactKubernetesVersions")
        private java.util.List<String> exactKubernetesVersions;

        /**
         * The exact version of kubernetes that are compatible.
         *
         * @param exactKubernetesVersions the value to set
         * @return this builder
         */
        public Builder exactKubernetesVersions(java.util.List<String> exactKubernetesVersions) {
            this.exactKubernetesVersions = exactKubernetesVersions;
            this.__explicitlySet__.add("exactKubernetesVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KubernetesVersionsFilters build() {
            KubernetesVersionsFilters model =
                    new KubernetesVersionsFilters(
                            this.minimalVersion, this.maximumVersion, this.exactKubernetesVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KubernetesVersionsFilters model) {
            if (model.wasPropertyExplicitlySet("minimalVersion")) {
                this.minimalVersion(model.getMinimalVersion());
            }
            if (model.wasPropertyExplicitlySet("maximumVersion")) {
                this.maximumVersion(model.getMaximumVersion());
            }
            if (model.wasPropertyExplicitlySet("exactKubernetesVersions")) {
                this.exactKubernetesVersions(model.getExactKubernetesVersions());
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

    /** The earliest kubernetes version. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimalVersion")
    private final String minimalVersion;

    /**
     * The earliest kubernetes version.
     *
     * @return the value
     */
    public String getMinimalVersion() {
        return minimalVersion;
    }

    /** The latest kubernetes version. */
    @com.fasterxml.jackson.annotation.JsonProperty("maximumVersion")
    private final String maximumVersion;

    /**
     * The latest kubernetes version.
     *
     * @return the value
     */
    public String getMaximumVersion() {
        return maximumVersion;
    }

    /** The exact version of kubernetes that are compatible. */
    @com.fasterxml.jackson.annotation.JsonProperty("exactKubernetesVersions")
    private final java.util.List<String> exactKubernetesVersions;

    /**
     * The exact version of kubernetes that are compatible.
     *
     * @return the value
     */
    public java.util.List<String> getExactKubernetesVersions() {
        return exactKubernetesVersions;
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
        sb.append("KubernetesVersionsFilters(");
        sb.append("super=").append(super.toString());
        sb.append("minimalVersion=").append(String.valueOf(this.minimalVersion));
        sb.append(", maximumVersion=").append(String.valueOf(this.maximumVersion));
        sb.append(", exactKubernetesVersions=")
                .append(String.valueOf(this.exactKubernetesVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KubernetesVersionsFilters)) {
            return false;
        }

        KubernetesVersionsFilters other = (KubernetesVersionsFilters) o;
        return java.util.Objects.equals(this.minimalVersion, other.minimalVersion)
                && java.util.Objects.equals(this.maximumVersion, other.maximumVersion)
                && java.util.Objects.equals(
                        this.exactKubernetesVersions, other.exactKubernetesVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.minimalVersion == null ? 43 : this.minimalVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.maximumVersion == null ? 43 : this.maximumVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.exactKubernetesVersions == null
                                ? 43
                                : this.exactKubernetesVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
