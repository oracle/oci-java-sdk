/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * A summary of the Java release properties. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaReleaseSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaReleaseSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "releaseVersion",
        "familyVersion",
        "parentReleaseVersion",
        "securityStatus",
        "releaseType",
        "licenseType",
        "familyDetails",
        "licenseDetails",
        "releaseDate",
        "releaseNotesUrl",
        "artifactContentTypes",
        "mosPatches",
        "daysUnderSecurityBaseline"
    })
    public JavaReleaseSummary(
            String releaseVersion,
            String familyVersion,
            String parentReleaseVersion,
            JreSecurityStatus securityStatus,
            ReleaseType releaseType,
            LicenseType licenseType,
            JavaFamily familyDetails,
            JavaLicense licenseDetails,
            java.util.Date releaseDate,
            String releaseNotesUrl,
            java.util.List<ArtifactContentType> artifactContentTypes,
            java.util.List<PatchDetail> mosPatches,
            Integer daysUnderSecurityBaseline) {
        super();
        this.releaseVersion = releaseVersion;
        this.familyVersion = familyVersion;
        this.parentReleaseVersion = parentReleaseVersion;
        this.securityStatus = securityStatus;
        this.releaseType = releaseType;
        this.licenseType = licenseType;
        this.familyDetails = familyDetails;
        this.licenseDetails = licenseDetails;
        this.releaseDate = releaseDate;
        this.releaseNotesUrl = releaseNotesUrl;
        this.artifactContentTypes = artifactContentTypes;
        this.mosPatches = mosPatches;
        this.daysUnderSecurityBaseline = daysUnderSecurityBaseline;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Java release version identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
        private String releaseVersion;

        /**
         * Java release version identifier.
         *
         * @param releaseVersion the value to set
         * @return this builder
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            this.__explicitlySet__.add("releaseVersion");
            return this;
        }
        /** Java release family identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
        private String familyVersion;

        /**
         * Java release family identifier.
         *
         * @param familyVersion the value to set
         * @return this builder
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            this.__explicitlySet__.add("familyVersion");
            return this;
        }
        /** Parent Java release version identifier. This is applicable for BPR releases. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentReleaseVersion")
        private String parentReleaseVersion;

        /**
         * Parent Java release version identifier. This is applicable for BPR releases.
         *
         * @param parentReleaseVersion the value to set
         * @return this builder
         */
        public Builder parentReleaseVersion(String parentReleaseVersion) {
            this.parentReleaseVersion = parentReleaseVersion;
            this.__explicitlySet__.add("parentReleaseVersion");
            return this;
        }
        /** The security status of the Java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityStatus")
        private JreSecurityStatus securityStatus;

        /**
         * The security status of the Java version.
         *
         * @param securityStatus the value to set
         * @return this builder
         */
        public Builder securityStatus(JreSecurityStatus securityStatus) {
            this.securityStatus = securityStatus;
            this.__explicitlySet__.add("securityStatus");
            return this;
        }
        /** Release category of the Java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseType")
        private ReleaseType releaseType;

        /**
         * Release category of the Java version.
         *
         * @param releaseType the value to set
         * @return this builder
         */
        public Builder releaseType(ReleaseType releaseType) {
            this.releaseType = releaseType;
            this.__explicitlySet__.add("releaseType");
            return this;
        }
        /** License type for the Java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
        private LicenseType licenseType;

        /**
         * License type for the Java version.
         *
         * @param licenseType the value to set
         * @return this builder
         */
        public Builder licenseType(LicenseType licenseType) {
            this.licenseType = licenseType;
            this.__explicitlySet__.add("licenseType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("familyDetails")
        private JavaFamily familyDetails;

        public Builder familyDetails(JavaFamily familyDetails) {
            this.familyDetails = familyDetails;
            this.__explicitlySet__.add("familyDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseDetails")
        private JavaLicense licenseDetails;

        public Builder licenseDetails(JavaLicense licenseDetails) {
            this.licenseDetails = licenseDetails;
            this.__explicitlySet__.add("licenseDetails");
            return this;
        }
        /**
         * The release date of the Java version (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private java.util.Date releaseDate;

        /**
         * The release date of the Java version (formatted according to
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
         *
         * @param releaseDate the value to set
         * @return this builder
         */
        public Builder releaseDate(java.util.Date releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }
        /** Release notes associated with the Java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseNotesUrl")
        private String releaseNotesUrl;

        /**
         * Release notes associated with the Java version.
         *
         * @param releaseNotesUrl the value to set
         * @return this builder
         */
        public Builder releaseNotesUrl(String releaseNotesUrl) {
            this.releaseNotesUrl = releaseNotesUrl;
            this.__explicitlySet__.add("releaseNotesUrl");
            return this;
        }
        /** Artifact content types for the Java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("artifactContentTypes")
        private java.util.List<ArtifactContentType> artifactContentTypes;

        /**
         * Artifact content types for the Java version.
         *
         * @param artifactContentTypes the value to set
         * @return this builder
         */
        public Builder artifactContentTypes(
                java.util.List<ArtifactContentType> artifactContentTypes) {
            this.artifactContentTypes = artifactContentTypes;
            this.__explicitlySet__.add("artifactContentTypes");
            return this;
        }
        /**
         * List of My Oracle Support(MoS) patches available for this release. This information is
         * only available for {@code BPR} release type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("mosPatches")
        private java.util.List<PatchDetail> mosPatches;

        /**
         * List of My Oracle Support(MoS) patches available for this release. This information is
         * only available for {@code BPR} release type.
         *
         * @param mosPatches the value to set
         * @return this builder
         */
        public Builder mosPatches(java.util.List<PatchDetail> mosPatches) {
            this.mosPatches = mosPatches;
            this.__explicitlySet__.add("mosPatches");
            return this;
        }
        /** The number of days since this release has been under the security baseline. */
        @com.fasterxml.jackson.annotation.JsonProperty("daysUnderSecurityBaseline")
        private Integer daysUnderSecurityBaseline;

        /**
         * The number of days since this release has been under the security baseline.
         *
         * @param daysUnderSecurityBaseline the value to set
         * @return this builder
         */
        public Builder daysUnderSecurityBaseline(Integer daysUnderSecurityBaseline) {
            this.daysUnderSecurityBaseline = daysUnderSecurityBaseline;
            this.__explicitlySet__.add("daysUnderSecurityBaseline");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaReleaseSummary build() {
            JavaReleaseSummary model =
                    new JavaReleaseSummary(
                            this.releaseVersion,
                            this.familyVersion,
                            this.parentReleaseVersion,
                            this.securityStatus,
                            this.releaseType,
                            this.licenseType,
                            this.familyDetails,
                            this.licenseDetails,
                            this.releaseDate,
                            this.releaseNotesUrl,
                            this.artifactContentTypes,
                            this.mosPatches,
                            this.daysUnderSecurityBaseline);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaReleaseSummary model) {
            if (model.wasPropertyExplicitlySet("releaseVersion")) {
                this.releaseVersion(model.getReleaseVersion());
            }
            if (model.wasPropertyExplicitlySet("familyVersion")) {
                this.familyVersion(model.getFamilyVersion());
            }
            if (model.wasPropertyExplicitlySet("parentReleaseVersion")) {
                this.parentReleaseVersion(model.getParentReleaseVersion());
            }
            if (model.wasPropertyExplicitlySet("securityStatus")) {
                this.securityStatus(model.getSecurityStatus());
            }
            if (model.wasPropertyExplicitlySet("releaseType")) {
                this.releaseType(model.getReleaseType());
            }
            if (model.wasPropertyExplicitlySet("licenseType")) {
                this.licenseType(model.getLicenseType());
            }
            if (model.wasPropertyExplicitlySet("familyDetails")) {
                this.familyDetails(model.getFamilyDetails());
            }
            if (model.wasPropertyExplicitlySet("licenseDetails")) {
                this.licenseDetails(model.getLicenseDetails());
            }
            if (model.wasPropertyExplicitlySet("releaseDate")) {
                this.releaseDate(model.getReleaseDate());
            }
            if (model.wasPropertyExplicitlySet("releaseNotesUrl")) {
                this.releaseNotesUrl(model.getReleaseNotesUrl());
            }
            if (model.wasPropertyExplicitlySet("artifactContentTypes")) {
                this.artifactContentTypes(model.getArtifactContentTypes());
            }
            if (model.wasPropertyExplicitlySet("mosPatches")) {
                this.mosPatches(model.getMosPatches());
            }
            if (model.wasPropertyExplicitlySet("daysUnderSecurityBaseline")) {
                this.daysUnderSecurityBaseline(model.getDaysUnderSecurityBaseline());
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

    /** Java release version identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
    private final String releaseVersion;

    /**
     * Java release version identifier.
     *
     * @return the value
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    /** Java release family identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
    private final String familyVersion;

    /**
     * Java release family identifier.
     *
     * @return the value
     */
    public String getFamilyVersion() {
        return familyVersion;
    }

    /** Parent Java release version identifier. This is applicable for BPR releases. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentReleaseVersion")
    private final String parentReleaseVersion;

    /**
     * Parent Java release version identifier. This is applicable for BPR releases.
     *
     * @return the value
     */
    public String getParentReleaseVersion() {
        return parentReleaseVersion;
    }

    /** The security status of the Java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityStatus")
    private final JreSecurityStatus securityStatus;

    /**
     * The security status of the Java version.
     *
     * @return the value
     */
    public JreSecurityStatus getSecurityStatus() {
        return securityStatus;
    }

    /** Release category of the Java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseType")
    private final ReleaseType releaseType;

    /**
     * Release category of the Java version.
     *
     * @return the value
     */
    public ReleaseType getReleaseType() {
        return releaseType;
    }

    /** License type for the Java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseType")
    private final LicenseType licenseType;

    /**
     * License type for the Java version.
     *
     * @return the value
     */
    public LicenseType getLicenseType() {
        return licenseType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("familyDetails")
    private final JavaFamily familyDetails;

    public JavaFamily getFamilyDetails() {
        return familyDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("licenseDetails")
    private final JavaLicense licenseDetails;

    public JavaLicense getLicenseDetails() {
        return licenseDetails;
    }

    /**
     * The release date of the Java version (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    private final java.util.Date releaseDate;

    /**
     * The release date of the Java version (formatted according to
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339)).
     *
     * @return the value
     */
    public java.util.Date getReleaseDate() {
        return releaseDate;
    }

    /** Release notes associated with the Java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseNotesUrl")
    private final String releaseNotesUrl;

    /**
     * Release notes associated with the Java version.
     *
     * @return the value
     */
    public String getReleaseNotesUrl() {
        return releaseNotesUrl;
    }

    /** Artifact content types for the Java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("artifactContentTypes")
    private final java.util.List<ArtifactContentType> artifactContentTypes;

    /**
     * Artifact content types for the Java version.
     *
     * @return the value
     */
    public java.util.List<ArtifactContentType> getArtifactContentTypes() {
        return artifactContentTypes;
    }

    /**
     * List of My Oracle Support(MoS) patches available for this release. This information is only
     * available for {@code BPR} release type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("mosPatches")
    private final java.util.List<PatchDetail> mosPatches;

    /**
     * List of My Oracle Support(MoS) patches available for this release. This information is only
     * available for {@code BPR} release type.
     *
     * @return the value
     */
    public java.util.List<PatchDetail> getMosPatches() {
        return mosPatches;
    }

    /** The number of days since this release has been under the security baseline. */
    @com.fasterxml.jackson.annotation.JsonProperty("daysUnderSecurityBaseline")
    private final Integer daysUnderSecurityBaseline;

    /**
     * The number of days since this release has been under the security baseline.
     *
     * @return the value
     */
    public Integer getDaysUnderSecurityBaseline() {
        return daysUnderSecurityBaseline;
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
        sb.append("JavaReleaseSummary(");
        sb.append("super=").append(super.toString());
        sb.append("releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(", familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(", parentReleaseVersion=").append(String.valueOf(this.parentReleaseVersion));
        sb.append(", securityStatus=").append(String.valueOf(this.securityStatus));
        sb.append(", releaseType=").append(String.valueOf(this.releaseType));
        sb.append(", licenseType=").append(String.valueOf(this.licenseType));
        sb.append(", familyDetails=").append(String.valueOf(this.familyDetails));
        sb.append(", licenseDetails=").append(String.valueOf(this.licenseDetails));
        sb.append(", releaseDate=").append(String.valueOf(this.releaseDate));
        sb.append(", releaseNotesUrl=").append(String.valueOf(this.releaseNotesUrl));
        sb.append(", artifactContentTypes=").append(String.valueOf(this.artifactContentTypes));
        sb.append(", mosPatches=").append(String.valueOf(this.mosPatches));
        sb.append(", daysUnderSecurityBaseline=")
                .append(String.valueOf(this.daysUnderSecurityBaseline));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaReleaseSummary)) {
            return false;
        }

        JavaReleaseSummary other = (JavaReleaseSummary) o;
        return java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.parentReleaseVersion, other.parentReleaseVersion)
                && java.util.Objects.equals(this.securityStatus, other.securityStatus)
                && java.util.Objects.equals(this.releaseType, other.releaseType)
                && java.util.Objects.equals(this.licenseType, other.licenseType)
                && java.util.Objects.equals(this.familyDetails, other.familyDetails)
                && java.util.Objects.equals(this.licenseDetails, other.licenseDetails)
                && java.util.Objects.equals(this.releaseDate, other.releaseDate)
                && java.util.Objects.equals(this.releaseNotesUrl, other.releaseNotesUrl)
                && java.util.Objects.equals(this.artifactContentTypes, other.artifactContentTypes)
                && java.util.Objects.equals(this.mosPatches, other.mosPatches)
                && java.util.Objects.equals(
                        this.daysUnderSecurityBaseline, other.daysUnderSecurityBaseline)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.releaseVersion == null ? 43 : this.releaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.parentReleaseVersion == null
                                ? 43
                                : this.parentReleaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.securityStatus == null ? 43 : this.securityStatus.hashCode());
        result = (result * PRIME) + (this.releaseType == null ? 43 : this.releaseType.hashCode());
        result = (result * PRIME) + (this.licenseType == null ? 43 : this.licenseType.hashCode());
        result =
                (result * PRIME)
                        + (this.familyDetails == null ? 43 : this.familyDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.licenseDetails == null ? 43 : this.licenseDetails.hashCode());
        result = (result * PRIME) + (this.releaseDate == null ? 43 : this.releaseDate.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseNotesUrl == null ? 43 : this.releaseNotesUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactContentTypes == null
                                ? 43
                                : this.artifactContentTypes.hashCode());
        result = (result * PRIME) + (this.mosPatches == null ? 43 : this.mosPatches.hashCode());
        result =
                (result * PRIME)
                        + (this.daysUnderSecurityBaseline == null
                                ? 43
                                : this.daysUnderSecurityBaseline.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
