/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Information about a binary artifact of Java.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JavaArtifact.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JavaArtifact extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "artifactId",
        "artifactDescription",
        "artifactContentType",
        "approximateFileSizeInBytes",
        "sha256",
        "artifactFileName",
        "osFamily",
        "architecture",
        "packageType",
        "packageTypeDetail",
        "downloadUrl",
        "scriptDownloadUrl",
        "scriptChecksumUrl"
    })
    public JavaArtifact(
            Long artifactId,
            String artifactDescription,
            ArtifactContentType artifactContentType,
            Long approximateFileSizeInBytes,
            String sha256,
            String artifactFileName,
            String osFamily,
            String architecture,
            String packageType,
            String packageTypeDetail,
            String downloadUrl,
            String scriptDownloadUrl,
            String scriptChecksumUrl) {
        super();
        this.artifactId = artifactId;
        this.artifactDescription = artifactDescription;
        this.artifactContentType = artifactContentType;
        this.approximateFileSizeInBytes = approximateFileSizeInBytes;
        this.sha256 = sha256;
        this.artifactFileName = artifactFileName;
        this.osFamily = osFamily;
        this.architecture = architecture;
        this.packageType = packageType;
        this.packageTypeDetail = packageTypeDetail;
        this.downloadUrl = downloadUrl;
        this.scriptDownloadUrl = scriptDownloadUrl;
        this.scriptChecksumUrl = scriptChecksumUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier for the artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
        private Long artifactId;

        /**
         * Unique identifier for the artifact.
         * @param artifactId the value to set
         * @return this builder
         **/
        public Builder artifactId(Long artifactId) {
            this.artifactId = artifactId;
            this.__explicitlySet__.add("artifactId");
            return this;
        }
        /**
         * Description of the binary artifact. Typically includes the OS, architecture, and installer type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("artifactDescription")
        private String artifactDescription;

        /**
         * Description of the binary artifact. Typically includes the OS, architecture, and installer type.
         * @param artifactDescription the value to set
         * @return this builder
         **/
        public Builder artifactDescription(String artifactDescription) {
            this.artifactDescription = artifactDescription;
            this.__explicitlySet__.add("artifactDescription");
            return this;
        }
        /**
         * Product content type of this artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("artifactContentType")
        private ArtifactContentType artifactContentType;

        /**
         * Product content type of this artifact.
         * @param artifactContentType the value to set
         * @return this builder
         **/
        public Builder artifactContentType(ArtifactContentType artifactContentType) {
            this.artifactContentType = artifactContentType;
            this.__explicitlySet__.add("artifactContentType");
            return this;
        }
        /**
         * Approximate compressed file size in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("approximateFileSizeInBytes")
        private Long approximateFileSizeInBytes;

        /**
         * Approximate compressed file size in bytes.
         * @param approximateFileSizeInBytes the value to set
         * @return this builder
         **/
        public Builder approximateFileSizeInBytes(Long approximateFileSizeInBytes) {
            this.approximateFileSizeInBytes = approximateFileSizeInBytes;
            this.__explicitlySet__.add("approximateFileSizeInBytes");
            return this;
        }
        /**
         * SHA256 checksum of the artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sha256")
        private String sha256;

        /**
         * SHA256 checksum of the artifact.
         * @param sha256 the value to set
         * @return this builder
         **/
        public Builder sha256(String sha256) {
            this.sha256 = sha256;
            this.__explicitlySet__.add("sha256");
            return this;
        }
        /**
         * The file name of the artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("artifactFileName")
        private String artifactFileName;

        /**
         * The file name of the artifact.
         * @param artifactFileName the value to set
         * @return this builder
         **/
        public Builder artifactFileName(String artifactFileName) {
            this.artifactFileName = artifactFileName;
            this.__explicitlySet__.add("artifactFileName");
            return this;
        }
        /**
         * The target Operating System family for the artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private String osFamily;

        /**
         * The target Operating System family for the artifact.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(String osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * The target Operating System architecture for the artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The target Operating System architecture for the artifact.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * The package type(typically the file extension) of the artifact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private String packageType;

        /**
         * The package type(typically the file extension) of the artifact.
         * @param packageType the value to set
         * @return this builder
         **/
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /**
         * Additional information about the package type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("packageTypeDetail")
        private String packageTypeDetail;

        /**
         * Additional information about the package type.
         * @param packageTypeDetail the value to set
         * @return this builder
         **/
        public Builder packageTypeDetail(String packageTypeDetail) {
            this.packageTypeDetail = packageTypeDetail;
            this.__explicitlySet__.add("packageTypeDetail");
            return this;
        }
        /**
         * The endpoint that returns a short-lived artifact download URL in the response payload.
         * This download url can then be used for downloading the artifact.
         * See this [API](https://docs.oracle.com/en-us/iaas/api/#/en/jms/20230601/JavaArtifact/GenerateArtifactDownloadUrl) for more details.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
        private String downloadUrl;

        /**
         * The endpoint that returns a short-lived artifact download URL in the response payload.
         * This download url can then be used for downloading the artifact.
         * See this [API](https://docs.oracle.com/en-us/iaas/api/#/en/jms/20230601/JavaArtifact/GenerateArtifactDownloadUrl) for more details.
         *
         * @param downloadUrl the value to set
         * @return this builder
         **/
        public Builder downloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            this.__explicitlySet__.add("downloadUrl");
            return this;
        }
        /**
         * The endpoint for downloading this artifact from command line, automatically in scripts and dockerfiles.
         * Depending on the context, this can point to the archive or latest update release version artifact in the specified family.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scriptDownloadUrl")
        private String scriptDownloadUrl;

        /**
         * The endpoint for downloading this artifact from command line, automatically in scripts and dockerfiles.
         * Depending on the context, this can point to the archive or latest update release version artifact in the specified family.
         *
         * @param scriptDownloadUrl the value to set
         * @return this builder
         **/
        public Builder scriptDownloadUrl(String scriptDownloadUrl) {
            this.scriptDownloadUrl = scriptDownloadUrl;
            this.__explicitlySet__.add("scriptDownloadUrl");
            return this;
        }
        /**
         * The URL for retrieving the checksum for the artifact.
         * Depending on the context, this can point to the checksum of the archive or latest update release version artifact.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("scriptChecksumUrl")
        private String scriptChecksumUrl;

        /**
         * The URL for retrieving the checksum for the artifact.
         * Depending on the context, this can point to the checksum of the archive or latest update release version artifact.
         *
         * @param scriptChecksumUrl the value to set
         * @return this builder
         **/
        public Builder scriptChecksumUrl(String scriptChecksumUrl) {
            this.scriptChecksumUrl = scriptChecksumUrl;
            this.__explicitlySet__.add("scriptChecksumUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaArtifact build() {
            JavaArtifact model =
                    new JavaArtifact(
                            this.artifactId,
                            this.artifactDescription,
                            this.artifactContentType,
                            this.approximateFileSizeInBytes,
                            this.sha256,
                            this.artifactFileName,
                            this.osFamily,
                            this.architecture,
                            this.packageType,
                            this.packageTypeDetail,
                            this.downloadUrl,
                            this.scriptDownloadUrl,
                            this.scriptChecksumUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaArtifact model) {
            if (model.wasPropertyExplicitlySet("artifactId")) {
                this.artifactId(model.getArtifactId());
            }
            if (model.wasPropertyExplicitlySet("artifactDescription")) {
                this.artifactDescription(model.getArtifactDescription());
            }
            if (model.wasPropertyExplicitlySet("artifactContentType")) {
                this.artifactContentType(model.getArtifactContentType());
            }
            if (model.wasPropertyExplicitlySet("approximateFileSizeInBytes")) {
                this.approximateFileSizeInBytes(model.getApproximateFileSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("sha256")) {
                this.sha256(model.getSha256());
            }
            if (model.wasPropertyExplicitlySet("artifactFileName")) {
                this.artifactFileName(model.getArtifactFileName());
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
            if (model.wasPropertyExplicitlySet("downloadUrl")) {
                this.downloadUrl(model.getDownloadUrl());
            }
            if (model.wasPropertyExplicitlySet("scriptDownloadUrl")) {
                this.scriptDownloadUrl(model.getScriptDownloadUrl());
            }
            if (model.wasPropertyExplicitlySet("scriptChecksumUrl")) {
                this.scriptChecksumUrl(model.getScriptChecksumUrl());
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
     * Unique identifier for the artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactId")
    private final Long artifactId;

    /**
     * Unique identifier for the artifact.
     * @return the value
     **/
    public Long getArtifactId() {
        return artifactId;
    }

    /**
     * Description of the binary artifact. Typically includes the OS, architecture, and installer type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactDescription")
    private final String artifactDescription;

    /**
     * Description of the binary artifact. Typically includes the OS, architecture, and installer type.
     * @return the value
     **/
    public String getArtifactDescription() {
        return artifactDescription;
    }

    /**
     * Product content type of this artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactContentType")
    private final ArtifactContentType artifactContentType;

    /**
     * Product content type of this artifact.
     * @return the value
     **/
    public ArtifactContentType getArtifactContentType() {
        return artifactContentType;
    }

    /**
     * Approximate compressed file size in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("approximateFileSizeInBytes")
    private final Long approximateFileSizeInBytes;

    /**
     * Approximate compressed file size in bytes.
     * @return the value
     **/
    public Long getApproximateFileSizeInBytes() {
        return approximateFileSizeInBytes;
    }

    /**
     * SHA256 checksum of the artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sha256")
    private final String sha256;

    /**
     * SHA256 checksum of the artifact.
     * @return the value
     **/
    public String getSha256() {
        return sha256;
    }

    /**
     * The file name of the artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactFileName")
    private final String artifactFileName;

    /**
     * The file name of the artifact.
     * @return the value
     **/
    public String getArtifactFileName() {
        return artifactFileName;
    }

    /**
     * The target Operating System family for the artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final String osFamily;

    /**
     * The target Operating System family for the artifact.
     * @return the value
     **/
    public String getOsFamily() {
        return osFamily;
    }

    /**
     * The target Operating System architecture for the artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The target Operating System architecture for the artifact.
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
    }

    /**
     * The package type(typically the file extension) of the artifact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final String packageType;

    /**
     * The package type(typically the file extension) of the artifact.
     * @return the value
     **/
    public String getPackageType() {
        return packageType;
    }

    /**
     * Additional information about the package type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("packageTypeDetail")
    private final String packageTypeDetail;

    /**
     * Additional information about the package type.
     * @return the value
     **/
    public String getPackageTypeDetail() {
        return packageTypeDetail;
    }

    /**
     * The endpoint that returns a short-lived artifact download URL in the response payload.
     * This download url can then be used for downloading the artifact.
     * See this [API](https://docs.oracle.com/en-us/iaas/api/#/en/jms/20230601/JavaArtifact/GenerateArtifactDownloadUrl) for more details.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("downloadUrl")
    private final String downloadUrl;

    /**
     * The endpoint that returns a short-lived artifact download URL in the response payload.
     * This download url can then be used for downloading the artifact.
     * See this [API](https://docs.oracle.com/en-us/iaas/api/#/en/jms/20230601/JavaArtifact/GenerateArtifactDownloadUrl) for more details.
     *
     * @return the value
     **/
    public String getDownloadUrl() {
        return downloadUrl;
    }

    /**
     * The endpoint for downloading this artifact from command line, automatically in scripts and dockerfiles.
     * Depending on the context, this can point to the archive or latest update release version artifact in the specified family.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptDownloadUrl")
    private final String scriptDownloadUrl;

    /**
     * The endpoint for downloading this artifact from command line, automatically in scripts and dockerfiles.
     * Depending on the context, this can point to the archive or latest update release version artifact in the specified family.
     *
     * @return the value
     **/
    public String getScriptDownloadUrl() {
        return scriptDownloadUrl;
    }

    /**
     * The URL for retrieving the checksum for the artifact.
     * Depending on the context, this can point to the checksum of the archive or latest update release version artifact.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scriptChecksumUrl")
    private final String scriptChecksumUrl;

    /**
     * The URL for retrieving the checksum for the artifact.
     * Depending on the context, this can point to the checksum of the archive or latest update release version artifact.
     *
     * @return the value
     **/
    public String getScriptChecksumUrl() {
        return scriptChecksumUrl;
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
        sb.append("JavaArtifact(");
        sb.append("super=").append(super.toString());
        sb.append("artifactId=").append(String.valueOf(this.artifactId));
        sb.append(", artifactDescription=").append(String.valueOf(this.artifactDescription));
        sb.append(", artifactContentType=").append(String.valueOf(this.artifactContentType));
        sb.append(", approximateFileSizeInBytes=")
                .append(String.valueOf(this.approximateFileSizeInBytes));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(", artifactFileName=").append(String.valueOf(this.artifactFileName));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", packageTypeDetail=").append(String.valueOf(this.packageTypeDetail));
        sb.append(", downloadUrl=").append(String.valueOf(this.downloadUrl));
        sb.append(", scriptDownloadUrl=").append(String.valueOf(this.scriptDownloadUrl));
        sb.append(", scriptChecksumUrl=").append(String.valueOf(this.scriptChecksumUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaArtifact)) {
            return false;
        }

        JavaArtifact other = (JavaArtifact) o;
        return java.util.Objects.equals(this.artifactId, other.artifactId)
                && java.util.Objects.equals(this.artifactDescription, other.artifactDescription)
                && java.util.Objects.equals(this.artifactContentType, other.artifactContentType)
                && java.util.Objects.equals(
                        this.approximateFileSizeInBytes, other.approximateFileSizeInBytes)
                && java.util.Objects.equals(this.sha256, other.sha256)
                && java.util.Objects.equals(this.artifactFileName, other.artifactFileName)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.packageTypeDetail, other.packageTypeDetail)
                && java.util.Objects.equals(this.downloadUrl, other.downloadUrl)
                && java.util.Objects.equals(this.scriptDownloadUrl, other.scriptDownloadUrl)
                && java.util.Objects.equals(this.scriptChecksumUrl, other.scriptChecksumUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.artifactId == null ? 43 : this.artifactId.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactDescription == null
                                ? 43
                                : this.artifactDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactContentType == null
                                ? 43
                                : this.artifactContentType.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateFileSizeInBytes == null
                                ? 43
                                : this.approximateFileSizeInBytes.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactFileName == null ? 43 : this.artifactFileName.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result =
                (result * PRIME)
                        + (this.packageTypeDetail == null ? 43 : this.packageTypeDetail.hashCode());
        result = (result * PRIME) + (this.downloadUrl == null ? 43 : this.downloadUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptDownloadUrl == null ? 43 : this.scriptDownloadUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptChecksumUrl == null ? 43 : this.scriptChecksumUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
