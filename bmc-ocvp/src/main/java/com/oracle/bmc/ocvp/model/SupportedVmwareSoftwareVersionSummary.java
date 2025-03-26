/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.model;

/**
 * A specific version of bundled VMware software supported by the Oracle Cloud
 * VMware Solution.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230701")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SupportedVmwareSoftwareVersionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SupportedVmwareSoftwareVersionSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "description", "esxiSoftwareVersions"})
    public SupportedVmwareSoftwareVersionSummary(
            String version,
            String description,
            java.util.List<SupportedEsxiSoftwareVersionSummary> esxiSoftwareVersions) {
        super();
        this.version = version;
        this.description = description;
        this.esxiSoftwareVersions = esxiSoftwareVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A short, unique string that identifies the version of bundled software.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * A short, unique string that identifies the version of bundled software.
         *
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * A description of the software in the bundle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description of the software in the bundle.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A list of supported ESXi software versions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersions")
        private java.util.List<SupportedEsxiSoftwareVersionSummary> esxiSoftwareVersions;

        /**
         * A list of supported ESXi software versions.
         *
         * @param esxiSoftwareVersions the value to set
         * @return this builder
         **/
        public Builder esxiSoftwareVersions(
                java.util.List<SupportedEsxiSoftwareVersionSummary> esxiSoftwareVersions) {
            this.esxiSoftwareVersions = esxiSoftwareVersions;
            this.__explicitlySet__.add("esxiSoftwareVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SupportedVmwareSoftwareVersionSummary build() {
            SupportedVmwareSoftwareVersionSummary model =
                    new SupportedVmwareSoftwareVersionSummary(
                            this.version, this.description, this.esxiSoftwareVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SupportedVmwareSoftwareVersionSummary model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("esxiSoftwareVersions")) {
                this.esxiSoftwareVersions(model.getEsxiSoftwareVersions());
            }
            return this;
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
     * A short, unique string that identifies the version of bundled software.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * A short, unique string that identifies the version of bundled software.
     *
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * A description of the software in the bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description of the software in the bundle.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A list of supported ESXi software versions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("esxiSoftwareVersions")
    private final java.util.List<SupportedEsxiSoftwareVersionSummary> esxiSoftwareVersions;

    /**
     * A list of supported ESXi software versions.
     *
     * @return the value
     **/
    public java.util.List<SupportedEsxiSoftwareVersionSummary> getEsxiSoftwareVersions() {
        return esxiSoftwareVersions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SupportedVmwareSoftwareVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", esxiSoftwareVersions=").append(String.valueOf(this.esxiSoftwareVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupportedVmwareSoftwareVersionSummary)) {
            return false;
        }

        SupportedVmwareSoftwareVersionSummary other = (SupportedVmwareSoftwareVersionSummary) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.esxiSoftwareVersions, other.esxiSoftwareVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.esxiSoftwareVersions == null
                                ? 43
                                : this.esxiSoftwareVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
