/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides summary information for available repos to add directly to compartments. A software
 * source contains a collection of packages. For more information, see [Managing Software
 * Sources](https://docs.oracle.com/iaas/osmh/doc/software-sources.htm). <br>
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
        builder = SoftwareSourceRepoSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SoftwareSourceRepoSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "repoId",
        "softwareSourceType",
        "osFamily",
        "archType",
        "description"
    })
    public SoftwareSourceRepoSummary(
            String displayName,
            String repoId,
            SoftwareSourceType softwareSourceType,
            OsFamily osFamily,
            ArchType archType,
            String description) {
        super();
        this.displayName = displayName;
        this.repoId = repoId;
        this.softwareSourceType = softwareSourceType;
        this.osFamily = osFamily;
        this.archType = archType;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User-friendly name for the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * User-friendly name for the software source.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The repository ID for the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("repoId")
        private String repoId;

        /**
         * The repository ID for the software source.
         *
         * @param repoId the value to set
         * @return this builder
         */
        public Builder repoId(String repoId) {
            this.repoId = repoId;
            this.__explicitlySet__.add("repoId");
            return this;
        }
        /** Type of software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceType")
        private SoftwareSourceType softwareSourceType;

        /**
         * Type of software source.
         *
         * @param softwareSourceType the value to set
         * @return this builder
         */
        public Builder softwareSourceType(SoftwareSourceType softwareSourceType) {
            this.softwareSourceType = softwareSourceType;
            this.__explicitlySet__.add("softwareSourceType");
            return this;
        }
        /** The OS family of the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The OS family of the software source.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** The architecture type supported by the software source. */
        @com.fasterxml.jackson.annotation.JsonProperty("archType")
        private ArchType archType;

        /**
         * The architecture type supported by the software source.
         *
         * @param archType the value to set
         * @return this builder
         */
        public Builder archType(ArchType archType) {
            this.archType = archType;
            this.__explicitlySet__.add("archType");
            return this;
        }
        /**
         * Description of the software source. For custom software sources, this is user-specified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the software source. For custom software sources, this is user-specified.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SoftwareSourceRepoSummary build() {
            SoftwareSourceRepoSummary model =
                    new SoftwareSourceRepoSummary(
                            this.displayName,
                            this.repoId,
                            this.softwareSourceType,
                            this.osFamily,
                            this.archType,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SoftwareSourceRepoSummary model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("repoId")) {
                this.repoId(model.getRepoId());
            }
            if (model.wasPropertyExplicitlySet("softwareSourceType")) {
                this.softwareSourceType(model.getSoftwareSourceType());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("archType")) {
                this.archType(model.getArchType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** User-friendly name for the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * User-friendly name for the software source.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The repository ID for the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("repoId")
    private final String repoId;

    /**
     * The repository ID for the software source.
     *
     * @return the value
     */
    public String getRepoId() {
        return repoId;
    }

    /** Type of software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("softwareSourceType")
    private final SoftwareSourceType softwareSourceType;

    /**
     * Type of software source.
     *
     * @return the value
     */
    public SoftwareSourceType getSoftwareSourceType() {
        return softwareSourceType;
    }

    /** The OS family of the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The OS family of the software source.
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** The architecture type supported by the software source. */
    @com.fasterxml.jackson.annotation.JsonProperty("archType")
    private final ArchType archType;

    /**
     * The architecture type supported by the software source.
     *
     * @return the value
     */
    public ArchType getArchType() {
        return archType;
    }

    /** Description of the software source. For custom software sources, this is user-specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the software source. For custom software sources, this is user-specified.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("SoftwareSourceRepoSummary(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", repoId=").append(String.valueOf(this.repoId));
        sb.append(", softwareSourceType=").append(String.valueOf(this.softwareSourceType));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", archType=").append(String.valueOf(this.archType));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SoftwareSourceRepoSummary)) {
            return false;
        }

        SoftwareSourceRepoSummary other = (SoftwareSourceRepoSummary) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.repoId, other.repoId)
                && java.util.Objects.equals(this.softwareSourceType, other.softwareSourceType)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.archType, other.archType)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.repoId == null ? 43 : this.repoId.hashCode());
        result =
                (result * PRIME)
                        + (this.softwareSourceType == null
                                ? 43
                                : this.softwareSourceType.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.archType == null ? 43 : this.archType.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
