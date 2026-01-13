/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsjavadownloads.model;

/**
 * A summary of Java artifact download in a tenancy. <br>
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
        builder = JavaDownloadRecordSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaDownloadRecordSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "familyVersion",
        "familyDisplayName",
        "releaseVersion",
        "osFamily",
        "architecture",
        "packageType",
        "packageTypeDetail",
        "downloadSourceId",
        "timeDownloaded",
        "downloadType"
    })
    public JavaDownloadRecordSummary(
            String familyVersion,
            String familyDisplayName,
            String releaseVersion,
            String osFamily,
            String architecture,
            String packageType,
            String packageTypeDetail,
            String downloadSourceId,
            java.util.Date timeDownloaded,
            String downloadType) {
        super();
        this.familyVersion = familyVersion;
        this.familyDisplayName = familyDisplayName;
        this.releaseVersion = releaseVersion;
        this.osFamily = osFamily;
        this.architecture = architecture;
        this.packageType = packageType;
        this.packageTypeDetail = packageTypeDetail;
        this.downloadSourceId = downloadSourceId;
        this.timeDownloaded = timeDownloaded;
        this.downloadType = downloadType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Java family version identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
        private String familyVersion;

        /**
         * The Java family version identifier.
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
        /** The Java release version identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
        private String releaseVersion;

        /**
         * The Java release version identifier.
         *
         * @param releaseVersion the value to set
         * @return this builder
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            this.__explicitlySet__.add("releaseVersion");
            return this;
        }
        /** The target Operating System family for the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private String osFamily;

        /**
         * The target Operating System family for the artifact.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(String osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** The target Operating System architecture for the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The target Operating System architecture for the artifact.
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** The package type (typically the file extension) of the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private String packageType;

        /**
         * The package type (typically the file extension) of the artifact.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** Additional information about the package type. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageTypeDetail")
        private String packageTypeDetail;

        /**
         * Additional information about the package type.
         *
         * @param packageTypeDetail the value to set
         * @return this builder
         */
        public Builder packageTypeDetail(String packageTypeDetail) {
            this.packageTypeDetail = packageTypeDetail;
            this.__explicitlySet__.add("packageTypeDetail");
            return this;
        }
        /** Identifier of the source that downloaded the artifact. */
        @com.fasterxml.jackson.annotation.JsonProperty("downloadSourceId")
        private String downloadSourceId;

        /**
         * Identifier of the source that downloaded the artifact.
         *
         * @param downloadSourceId the value to set
         * @return this builder
         */
        public Builder downloadSourceId(String downloadSourceId) {
            this.downloadSourceId = downloadSourceId;
            this.__explicitlySet__.add("downloadSourceId");
            return this;
        }
        /** Timestamp of download. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDownloaded")
        private java.util.Date timeDownloaded;

        /**
         * Timestamp of download.
         *
         * @param timeDownloaded the value to set
         * @return this builder
         */
        public Builder timeDownloaded(java.util.Date timeDownloaded) {
            this.timeDownloaded = timeDownloaded;
            this.__explicitlySet__.add("timeDownloaded");
            return this;
        }
        /** Type of download. */
        @com.fasterxml.jackson.annotation.JsonProperty("downloadType")
        private String downloadType;

        /**
         * Type of download.
         *
         * @param downloadType the value to set
         * @return this builder
         */
        public Builder downloadType(String downloadType) {
            this.downloadType = downloadType;
            this.__explicitlySet__.add("downloadType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaDownloadRecordSummary build() {
            JavaDownloadRecordSummary model =
                    new JavaDownloadRecordSummary(
                            this.familyVersion,
                            this.familyDisplayName,
                            this.releaseVersion,
                            this.osFamily,
                            this.architecture,
                            this.packageType,
                            this.packageTypeDetail,
                            this.downloadSourceId,
                            this.timeDownloaded,
                            this.downloadType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaDownloadRecordSummary model) {
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
            if (model.wasPropertyExplicitlySet("downloadSourceId")) {
                this.downloadSourceId(model.getDownloadSourceId());
            }
            if (model.wasPropertyExplicitlySet("timeDownloaded")) {
                this.timeDownloaded(model.getTimeDownloaded());
            }
            if (model.wasPropertyExplicitlySet("downloadType")) {
                this.downloadType(model.getDownloadType());
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

    /** The Java family version identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("familyVersion")
    private final String familyVersion;

    /**
     * The Java family version identifier.
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

    /** The Java release version identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
    private final String releaseVersion;

    /**
     * The Java release version identifier.
     *
     * @return the value
     */
    public String getReleaseVersion() {
        return releaseVersion;
    }

    /** The target Operating System family for the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final String osFamily;

    /**
     * The target Operating System family for the artifact.
     *
     * @return the value
     */
    public String getOsFamily() {
        return osFamily;
    }

    /** The target Operating System architecture for the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The target Operating System architecture for the artifact.
     *
     * @return the value
     */
    public String getArchitecture() {
        return architecture;
    }

    /** The package type (typically the file extension) of the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final String packageType;

    /**
     * The package type (typically the file extension) of the artifact.
     *
     * @return the value
     */
    public String getPackageType() {
        return packageType;
    }

    /** Additional information about the package type. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageTypeDetail")
    private final String packageTypeDetail;

    /**
     * Additional information about the package type.
     *
     * @return the value
     */
    public String getPackageTypeDetail() {
        return packageTypeDetail;
    }

    /** Identifier of the source that downloaded the artifact. */
    @com.fasterxml.jackson.annotation.JsonProperty("downloadSourceId")
    private final String downloadSourceId;

    /**
     * Identifier of the source that downloaded the artifact.
     *
     * @return the value
     */
    public String getDownloadSourceId() {
        return downloadSourceId;
    }

    /** Timestamp of download. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDownloaded")
    private final java.util.Date timeDownloaded;

    /**
     * Timestamp of download.
     *
     * @return the value
     */
    public java.util.Date getTimeDownloaded() {
        return timeDownloaded;
    }

    /** Type of download. */
    @com.fasterxml.jackson.annotation.JsonProperty("downloadType")
    private final String downloadType;

    /**
     * Type of download.
     *
     * @return the value
     */
    public String getDownloadType() {
        return downloadType;
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
        sb.append("JavaDownloadRecordSummary(");
        sb.append("super=").append(super.toString());
        sb.append("familyVersion=").append(String.valueOf(this.familyVersion));
        sb.append(", familyDisplayName=").append(String.valueOf(this.familyDisplayName));
        sb.append(", releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", packageTypeDetail=").append(String.valueOf(this.packageTypeDetail));
        sb.append(", downloadSourceId=").append(String.valueOf(this.downloadSourceId));
        sb.append(", timeDownloaded=").append(String.valueOf(this.timeDownloaded));
        sb.append(", downloadType=").append(String.valueOf(this.downloadType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaDownloadRecordSummary)) {
            return false;
        }

        JavaDownloadRecordSummary other = (JavaDownloadRecordSummary) o;
        return java.util.Objects.equals(this.familyVersion, other.familyVersion)
                && java.util.Objects.equals(this.familyDisplayName, other.familyDisplayName)
                && java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.packageTypeDetail, other.packageTypeDetail)
                && java.util.Objects.equals(this.downloadSourceId, other.downloadSourceId)
                && java.util.Objects.equals(this.timeDownloaded, other.timeDownloaded)
                && java.util.Objects.equals(this.downloadType, other.downloadType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result =
                (result * PRIME)
                        + (this.downloadSourceId == null ? 43 : this.downloadSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDownloaded == null ? 43 : this.timeDownloaded.hashCode());
        result = (result * PRIME) + (this.downloadType == null ? 43 : this.downloadType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
