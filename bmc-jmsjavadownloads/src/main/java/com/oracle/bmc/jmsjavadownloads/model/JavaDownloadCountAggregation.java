/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * Count of Java downloads aggregated by the specified type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaDownloadCountAggregation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaDownloadCountAggregation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "downloadCount",
        "familyVersion",
        "familyDisplayName",
        "releaseVersion",
        "osFamily",
        "architecture",
        "packageType",
        "packageTypeDetail"
    })
    public JavaDownloadCountAggregation(
            Long downloadCount,
            String familyVersion,
            String familyDisplayName,
            String releaseVersion,
            String osFamily,
            String architecture,
            String packageType,
            String packageTypeDetail) {
        super();
        this.downloadCount = downloadCount;
        this.familyVersion = familyVersion;
        this.familyDisplayName = familyDisplayName;
        this.releaseVersion = releaseVersion;
        this.osFamily = osFamily;
        this.architecture = architecture;
        this.packageType = packageType;
        this.packageTypeDetail = packageTypeDetail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Count of Java downloads. */
        @com.fasterxml.jackson.annotation.JsonProperty("downloadCount")
        private Long downloadCount;

        /**
         * Count of Java downloads.
         *
         * @param downloadCount the value to set
         * @return this builder
         */
        public Builder downloadCount(Long downloadCount) {
            this.downloadCount = downloadCount;
            this.__explicitlySet__.add("downloadCount");
            return this;
        }
        /** The Java family version. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
        private String familyVersion;

        /**
         * The Java family version.
         *
         * @param familyVersion the value to set
         * @return this builder
         */
        public Builder familyVersion(String familyVersion) {
            this.familyVersion = familyVersion;
            this.__explicitlySet__.add("familyVersion");
            return this;
        }
        /** The Java family display name. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyDisplayName")
        private String familyDisplayName;

        /**
         * The Java family display name.
         *
         * @param familyDisplayName the value to set
         * @return this builder
         */
        public Builder familyDisplayName(String familyDisplayName) {
            this.familyDisplayName = familyDisplayName;
            this.__explicitlySet__.add("familyDisplayName");
            return this;
        }
        /** The Java release version. Applicable only to {@code JAVA_RELEASE} aggregationType. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
        private String releaseVersion;

        /**
         * The Java release version. Applicable only to {@code JAVA_RELEASE} aggregationType.
         *
         * @param releaseVersion the value to set
         * @return this builder
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            this.__explicitlySet__.add("releaseVersion");
            return this;
        }
        /**
         * The target Operating System family for the artifact. Applicable only to {@code PLATFORM}
         * aggregationType.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private String osFamily;

        /**
         * The target Operating System family for the artifact. Applicable only to {@code PLATFORM}
         * aggregationType.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(String osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The target Operating System architecture for the artifact. Applicable only to {@code
         * PLATFORM} aggregationType.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The target Operating System architecture for the artifact. Applicable only to {@code
         * PLATFORM} aggregationType.
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * The package type (typically the file extension) of the artifact. Applicable only to
         * {@code PLATFORM} aggregationType.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private String packageType;

        /**
         * The package type (typically the file extension) of the artifact. Applicable only to
         * {@code PLATFORM} aggregationType.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /**
         * Additional information about the package type. Applicable only to {@code PLATFORM}
         * aggregationType.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageTypeDetail")
        private String packageTypeDetail;

        /**
         * Additional information about the package type. Applicable only to {@code PLATFORM}
         * aggregationType.
         *
         * @param packageTypeDetail the value to set
         * @return this builder
         */
        public Builder packageTypeDetail(String packageTypeDetail) {
            this.packageTypeDetail = packageTypeDetail;
            this.__explicitlySet__.add("packageTypeDetail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaDownloadCountAggregation build() {
            JavaDownloadCountAggregation model =
                    new JavaDownloadCountAggregation(
                            this.downloadCount,
                            this.familyVersion,
                            this.familyDisplayName,
                            this.releaseVersion,
                            this.osFamily,
                            this.architecture,
                            this.packageType,
                            this.packageTypeDetail);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaDownloadCountAggregation model) {
            if (model.wasPropertyExplicitlySet("downloadCount")) {
                this.downloadCount(model.getDownloadCount());
            }
            if (model.wasPropertyExplicitlySet("familyVersion")) {
                this.familyVersion(model.getFamilyVersion());
            }
            if (model.wasPropertyExplicitlySet("familyDisplayName")) {
                this.familyDisplayName(model.getFamilyDisplayName());
            }
            if (model.wasPropertyExplicitlySet("releaseVersion")) {
                this.releaseVersion(model.getReleaseVersion());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("packageTypeDetail")) {
                this.packageTypeDetail(model.getPackageTypeDetail());
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

    /** Count of Java downloads. */
    @com.fasterxml.jackson.annotation.JsonProperty("downloadCount")
    private final Long downloadCount;

    /**
     * Count of Java downloads.
     *
     * @return the value
     */
    public Long getDownloadCount() {
        return downloadCount;
    }

    /** The Java family version. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
    private final String familyVersion;

    /**
     * The Java family version.
     *
     * @return the value
     */
    public String getFamilyVersion() {
        return familyVersion;
    }

    /** The Java family display name. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyDisplayName")
    private final String familyDisplayName;

    /**
     * The Java family display name.
     *
     * @return the value
     */
    public String getFamilyDisplayName() {
        return familyDisplayName;
    }

    /** The Java release version. Applicable only to {@code JAVA_RELEASE} aggregationType. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
    private final String releaseVersion;

    /**
     * The Java release version. Applicable only to {@code JAVA_RELEASE} aggregationType.
     *
     * @return the value
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    /**
     * The target Operating System family for the artifact. Applicable only to {@code PLATFORM}
     * aggregationType.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final String osFamily;

    /**
     * The target Operating System family for the artifact. Applicable only to {@code PLATFORM}
     * aggregationType.
     *
     * @return the value
     */
    public String getOsFamily() {
        return osFamily;
    }

    /**
     * The target Operating System architecture for the artifact. Applicable only to {@code
     * PLATFORM} aggregationType.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The target Operating System architecture for the artifact. Applicable only to {@code
     * PLATFORM} aggregationType.
     *
     * @return the value
     */
    public String getArchitecture() {
        return architecture;
    }

    /**
     * The package type (typically the file extension) of the artifact. Applicable only to {@code
     * PLATFORM} aggregationType.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final String packageType;

    /**
     * The package type (typically the file extension) of the artifact. Applicable only to {@code
     * PLATFORM} aggregationType.
     *
     * @return the value
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Additional information about the package type. Applicable only to {@code PLATFORM}
     * aggregationType.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageTypeDetail")
    private final String packageTypeDetail;

    /**
     * Additional information about the package type. Applicable only to {@code PLATFORM}
     * aggregationType.
     *
     * @return the value
     */
    public String getPackageTypeDetail() {
        return packageTypeDetail;
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
        sb.append("JavaDownloadCountAggregation(");
        sb.append("super=").append(super.toString());
        sb.append("downloadCount=").append(String.valueOf(this.downloadCount));
        sb.append(", familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(", familyDisplayName=").append(String.valueOf(this.familyDisplayName));
        sb.append(", releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", packageTypeDetail=").append(String.valueOf(this.packageTypeDetail));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaDownloadCountAggregation)) {
            return false;
        }

        JavaDownloadCountAggregation other = (JavaDownloadCountAggregation) o;
        return java.util.Objects.equals(this.downloadCount, other.downloadCount)
                && java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.familyDisplayName, other.familyDisplayName)
                && java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.packageTypeDetail, other.packageTypeDetail)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.downloadCount == null ? 43 : this.downloadCount.hashCode());
        result =
                (result * PRIME)
                        + (this.familyVersion == null ? 43 : this.familyVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.familyDisplayName == null ? 43 : this.familyDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseVersion == null ? 43 : this.releaseVersion.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.packageTypeDetail == null ? 43 : this.packageTypeDetail.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
