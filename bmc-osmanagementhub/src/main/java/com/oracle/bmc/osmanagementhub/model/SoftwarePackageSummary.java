/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a software package. <br>
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
        builder = SoftwarePackageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SoftwarePackageSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "name",
        "type",
        "version",
        "architecture",
        "checksum",
        "checksumType",
        "isLatest",
        "softwareSources",
        "osFamilies"
    })
    public SoftwarePackageSummary(
            String displayName,
            String name,
            String type,
            String version,
            SoftwarePackageArchitecture architecture,
            String checksum,
            String checksumType,
            Boolean isLatest,
            java.util.List<SoftwareSourceDetails> softwareSources,
            java.util.List<OsFamily> osFamilies) {
        super();
        this.displayName = displayName;
        this.name = name;
        this.type = type;
        this.version = version;
        this.architecture = architecture;
        this.checksum = checksum;
        this.checksumType = checksumType;
        this.isLatest = isLatest;
        this.softwareSources = softwareSources;
        this.osFamilies = osFamilies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Package name. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Package name.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Unique identifier for the package. Note that this is not an OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique identifier for the package. Note that this is not an OCID.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Type of the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of the package.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Version of the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Version of the package.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The architecture for which this software was built. */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private SoftwarePackageArchitecture architecture;

        /**
         * The architecture for which this software was built.
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(SoftwarePackageArchitecture architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** Checksum of the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("checksum")
        private String checksum;

        /**
         * Checksum of the package.
         *
         * @param checksum the value to set
         * @return this builder
         */
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            this.__explicitlySet__.add("checksum");
            return this;
        }
        /** Type of the checksum. */
        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private String checksumType;

        /**
         * Type of the checksum.
         *
         * @param checksumType the value to set
         * @return this builder
         */
        public Builder checksumType(String checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }
        /** Indicates whether this package is the latest version. */
        @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
        private Boolean isLatest;

        /**
         * Indicates whether this package is the latest version.
         *
         * @param isLatest the value to set
         * @return this builder
         */
        public Builder isLatest(Boolean isLatest) {
            this.isLatest = isLatest;
            this.__explicitlySet__.add("isLatest");
            return this;
        }
        /**
         * List of software sources that provide the software package. This property is deprecated
         * and it will be removed in a future API release.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceDetails> softwareSources;

        /**
         * List of software sources that provide the software package. This property is deprecated
         * and it will be removed in a future API release.
         *
         * @param softwareSources the value to set
         * @return this builder
         */
        public Builder softwareSources(java.util.List<SoftwareSourceDetails> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }
        /** The OS families the package belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
        private java.util.List<OsFamily> osFamilies;

        /**
         * The OS families the package belongs to.
         *
         * @param osFamilies the value to set
         * @return this builder
         */
        public Builder osFamilies(java.util.List<OsFamily> osFamilies) {
            this.osFamilies = osFamilies;
            this.__explicitlySet__.add("osFamilies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwarePackageSummary build() {
            SoftwarePackageSummary model =
                    new SoftwarePackageSummary(
                            this.displayName,
                            this.name,
                            this.type,
                            this.version,
                            this.architecture,
                            this.checksum,
                            this.checksumType,
                            this.isLatest,
                            this.softwareSources,
                            this.osFamilies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwarePackageSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("checksum")) {
                this.checksum(model.getChecksum());
            }
            if (model.wasPropertyExplicitlySet("checksumType")) {
                this.checksumType(model.getChecksumType());
            }
            if (model.wasPropertyExplicitlySet("isLatest")) {
                this.isLatest(model.getIsLatest());
            }
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("osFamilies")) {
                this.osFamilies(model.getOsFamilies());
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

    /** Package name. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Package name.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Unique identifier for the package. Note that this is not an OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique identifier for the package. Note that this is not an OCID.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Type of the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of the package.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Version of the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Version of the package.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The architecture for which this software was built. */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final SoftwarePackageArchitecture architecture;

    /**
     * The architecture for which this software was built.
     *
     * @return the value
     */
    public SoftwarePackageArchitecture getArchitecture() {
        return architecture;
    }

    /** Checksum of the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    private final String checksum;

    /**
     * Checksum of the package.
     *
     * @return the value
     */
    public String getChecksum() {
        return checksum;
    }

    /** Type of the checksum. */
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    private final String checksumType;

    /**
     * Type of the checksum.
     *
     * @return the value
     */
    public String getChecksumType() {
        return checksumType;
    }

    /** Indicates whether this package is the latest version. */
    @com.fasterxml.jackson.annotation.JsonProperty("isLatest")
    private final Boolean isLatest;

    /**
     * Indicates whether this package is the latest version.
     *
     * @return the value
     */
    public Boolean getIsLatest() {
        return isLatest;
    }

    /**
     * List of software sources that provide the software package. This property is deprecated and
     * it will be removed in a future API release.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
    private final java.util.List<SoftwareSourceDetails> softwareSources;

    /**
     * List of software sources that provide the software package. This property is deprecated and
     * it will be removed in a future API release.
     *
     * @return the value
     */
    public java.util.List<SoftwareSourceDetails> getSoftwareSources() {
        return softwareSources;
    }

    /** The OS families the package belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamilies")
    private final java.util.List<OsFamily> osFamilies;

    /**
     * The OS families the package belongs to.
     *
     * @return the value
     */
    public java.util.List<OsFamily> getOsFamilies() {
        return osFamilies;
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
        sb.append("SoftwarePackageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", checksum=").append(String.valueOf(this.checksum));
        sb.append(", checksumType=").append(String.valueOf(this.checksumType));
        sb.append(", isLatest=").append(String.valueOf(this.isLatest));
        sb.append(", softwareSources=").append(String.valueOf(this.softwareSources));
        sb.append(", osFamilies=").append(String.valueOf(this.osFamilies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwarePackageSummary)) {
            return false;
        }

        SoftwarePackageSummary other = (SoftwarePackageSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.checksum, other.checksum)
                && java.util.Objects.equals(this.checksumType, other.checksumType)
                && java.util.Objects.equals(this.isLatest, other.isLatest)
                && java.util.Objects.equals(this.softwareSources, other.softwareSources)
                && java.util.Objects.equals(this.osFamilies, other.osFamilies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.checksum == null ? 43 : this.checksum.hashCode());
        result = (result * PRIME) + (this.checksumType == null ? 43 : this.checksumType.hashCode());
        result = (result * PRIME) + (this.isLatest == null ? 43 : this.isLatest.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSources == null ? 43 : this.softwareSources.hashCode());
        result = (result * PRIME) + (this.osFamilies == null ? 43 : this.osFamilies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
