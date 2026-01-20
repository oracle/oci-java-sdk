/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for a software package available for installation on a managed
 * instance. <br>
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
        builder = UpdatablePackageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "packageClassification")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdatablePackageSummary extends PackageSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private ArchType architecture;

        public Builder architecture(ArchType architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("softwareSources")
        private java.util.List<SoftwareSourceDetails> softwareSources;

        public Builder softwareSources(java.util.List<SoftwareSourceDetails> softwareSources) {
            this.softwareSources = softwareSources;
            this.__explicitlySet__.add("softwareSources");
            return this;
        }
        /** The version of the package that is currently installed on the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("installedVersion")
        private String installedVersion;

        /**
         * The version of the package that is currently installed on the instance.
         *
         * @param installedVersion the value to set
         * @return this builder
         */
        public Builder installedVersion(String installedVersion) {
            this.installedVersion = installedVersion;
            this.__explicitlySet__.add("installedVersion");
            return this;
        }
        /** The type of update. */
        @com.fasterxml.jackson.annotation.JsonProperty("updateType")
        private ClassificationTypes updateType;

        /**
         * The type of update.
         *
         * @param updateType the value to set
         * @return this builder
         */
        public Builder updateType(ClassificationTypes updateType) {
            this.updateType = updateType;
            this.__explicitlySet__.add("updateType");
            return this;
        }
        /** List of errata applicable to this update. */
        @com.fasterxml.jackson.annotation.JsonProperty("errata")
        private java.util.List<String> errata;

        /**
         * List of errata applicable to this update.
         *
         * @param errata the value to set
         * @return this builder
         */
        public Builder errata(java.util.List<String> errata) {
            this.errata = errata;
            this.__explicitlySet__.add("errata");
            return this;
        }
        /** List of CVEs applicable to this erratum. */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
        private java.util.List<String> relatedCves;

        /**
         * List of CVEs applicable to this erratum.
         *
         * @param relatedCves the value to set
         * @return this builder
         */
        public Builder relatedCves(java.util.List<String> relatedCves) {
            this.relatedCves = relatedCves;
            this.__explicitlySet__.add("relatedCves");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdatablePackageSummary build() {
            UpdatablePackageSummary model =
                    new UpdatablePackageSummary(
                            this.displayName,
                            this.name,
                            this.type,
                            this.version,
                            this.architecture,
                            this.softwareSources,
                            this.installedVersion,
                            this.updateType,
                            this.errata,
                            this.relatedCves);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdatablePackageSummary model) {
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
            if (model.wasPropertyExplicitlySet("softwareSources")) {
                this.softwareSources(model.getSoftwareSources());
            }
            if (model.wasPropertyExplicitlySet("installedVersion")) {
                this.installedVersion(model.getInstalledVersion());
            }
            if (model.wasPropertyExplicitlySet("updateType")) {
                this.updateType(model.getUpdateType());
            }
            if (model.wasPropertyExplicitlySet("errata")) {
                this.errata(model.getErrata());
            }
            if (model.wasPropertyExplicitlySet("relatedCves")) {
                this.relatedCves(model.getRelatedCves());
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

    @Deprecated
    public UpdatablePackageSummary(
            String displayName,
            String name,
            String type,
            String version,
            ArchType architecture,
            java.util.List<SoftwareSourceDetails> softwareSources,
            String installedVersion,
            ClassificationTypes updateType,
            java.util.List<String> errata,
            java.util.List<String> relatedCves) {
        super(displayName, name, type, version, architecture, softwareSources);
        this.installedVersion = installedVersion;
        this.updateType = updateType;
        this.errata = errata;
        this.relatedCves = relatedCves;
    }

    /** The version of the package that is currently installed on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("installedVersion")
    private final String installedVersion;

    /**
     * The version of the package that is currently installed on the instance.
     *
     * @return the value
     */
    public String getInstalledVersion() {
        return installedVersion;
    }

    /** The type of update. */
    @com.fasterxml.jackson.annotation.JsonProperty("updateType")
    private final ClassificationTypes updateType;

    /**
     * The type of update.
     *
     * @return the value
     */
    public ClassificationTypes getUpdateType() {
        return updateType;
    }

    /** List of errata applicable to this update. */
    @com.fasterxml.jackson.annotation.JsonProperty("errata")
    private final java.util.List<String> errata;

    /**
     * List of errata applicable to this update.
     *
     * @return the value
     */
    public java.util.List<String> getErrata() {
        return errata;
    }

    /** List of CVEs applicable to this erratum. */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedCves")
    private final java.util.List<String> relatedCves;

    /**
     * List of CVEs applicable to this erratum.
     *
     * @return the value
     */
    public java.util.List<String> getRelatedCves() {
        return relatedCves;
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
        sb.append("UpdatablePackageSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", installedVersion=").append(String.valueOf(this.installedVersion));
        sb.append(", updateType=").append(String.valueOf(this.updateType));
        sb.append(", errata=").append(String.valueOf(this.errata));
        sb.append(", relatedCves=").append(String.valueOf(this.relatedCves));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatablePackageSummary)) {
            return false;
        }

        UpdatablePackageSummary other = (UpdatablePackageSummary) o;
        return java.util.Objects.equals(this.installedVersion, other.installedVersion)
                && java.util.Objects.equals(this.updateType, other.updateType)
                && java.util.Objects.equals(this.errata, other.errata)
                && java.util.Objects.equals(this.relatedCves, other.relatedCves)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.installedVersion == null ? 43 : this.installedVersion.hashCode());
        result = (result * PRIME) + (this.updateType == null ? 43 : this.updateType.hashCode());
        result = (result * PRIME) + (this.errata == null ? 43 : this.errata.hashCode());
        result = (result * PRIME) + (this.relatedCves == null ? 43 : this.relatedCves.hashCode());
        return result;
    }
}
