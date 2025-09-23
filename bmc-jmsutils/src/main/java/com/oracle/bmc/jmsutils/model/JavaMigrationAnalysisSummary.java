/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jmsutils.model;

/**
 * Summary information about a Java Migration Analysis. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250521")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JavaMigrationAnalysisSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMigrationAnalysisSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "compartmentId",
        "analysisProjectName",
        "inputApplicationsObjectStoragePaths",
        "targetJdkVersion",
        "namespaceName",
        "bucketName",
        "analysisResultObjectStoragePath",
        "analysisResultFiles",
        "timeCreated",
        "timeStarted",
        "timeFinished",
        "createdBy",
        "metadata"
    })
    public JavaMigrationAnalysisSummary(
            String id,
            String workRequestId,
            String compartmentId,
            String analysisProjectName,
            java.util.List<String> inputApplicationsObjectStoragePaths,
            String targetJdkVersion,
            String namespaceName,
            String bucketName,
            String analysisResultObjectStoragePath,
            java.util.List<String> analysisResultFiles,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished,
            Principal createdBy,
            String metadata) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.compartmentId = compartmentId;
        this.analysisProjectName = analysisProjectName;
        this.inputApplicationsObjectStoragePaths = inputApplicationsObjectStoragePaths;
        this.targetJdkVersion = targetJdkVersion;
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.analysisResultObjectStoragePath = analysisResultObjectStoragePath;
        this.analysisResultFiles = analysisResultFiles;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
        this.createdBy = createdBy;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Java Migration Analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Java Migration Analysis.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Work Request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Work Request.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Name of the analysis project. */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
        private String analysisProjectName;

        /**
         * Name of the analysis project.
         *
         * @param analysisProjectName the value to set
         * @return this builder
         */
        public Builder analysisProjectName(String analysisProjectName) {
            this.analysisProjectName = analysisProjectName;
            this.__explicitlySet__.add("analysisProjectName");
            return this;
        }
        /** Object storage paths to the input files applications to be analysed. */
        @com.fasterxml.jackson.annotation.JsonProperty("inputApplicationsObjectStoragePaths")
        private java.util.List<String> inputApplicationsObjectStoragePaths;

        /**
         * Object storage paths to the input files applications to be analysed.
         *
         * @param inputApplicationsObjectStoragePaths the value to set
         * @return this builder
         */
        public Builder inputApplicationsObjectStoragePaths(
                java.util.List<String> inputApplicationsObjectStoragePaths) {
            this.inputApplicationsObjectStoragePaths = inputApplicationsObjectStoragePaths;
            this.__explicitlySet__.add("inputApplicationsObjectStoragePaths");
            return this;
        }
        /** Jdk Version of the Java Migration Analysis target. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
        private String targetJdkVersion;

        /**
         * Jdk Version of the Java Migration Analysis target.
         *
         * @param targetJdkVersion the value to set
         * @return this builder
         */
        public Builder targetJdkVersion(String targetJdkVersion) {
            this.targetJdkVersion = targetJdkVersion;
            this.__explicitlySet__.add("targetJdkVersion");
            return this;
        }
        /** Object storage namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Object storage namespace.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** Object storage bucket name. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Object storage bucket name.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Path to the Object Storage analysis application result. */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisResultObjectStoragePath")
        private String analysisResultObjectStoragePath;

        /**
         * Path to the Object Storage analysis application result.
         *
         * @param analysisResultObjectStoragePath the value to set
         * @return this builder
         */
        public Builder analysisResultObjectStoragePath(String analysisResultObjectStoragePath) {
            this.analysisResultObjectStoragePath = analysisResultObjectStoragePath;
            this.__explicitlySet__.add("analysisResultObjectStoragePath");
            return this;
        }
        /** The analysis application file names result in the Object Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisResultFiles")
        private java.util.List<String> analysisResultFiles;

        /**
         * The analysis application file names result in the Object Storage.
         *
         * @param analysisResultFiles the value to set
         * @return this builder
         */
        public Builder analysisResultFiles(java.util.List<String> analysisResultFiles) {
            this.analysisResultFiles = analysisResultFiles;
            this.__explicitlySet__.add("analysisResultFiles");
            return this;
        }
        /**
         * The date and time the Java Migration Analysis was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the Java Migration Analysis was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the Java Migration Analysis was started, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the Java Migration Analysis was started, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the Java Migration Analysis was finished, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time the Java Migration Analysis was finished, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private Principal createdBy;

        public Builder createdBy(Principal createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }
        /** Additional info reserved for future use. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private String metadata;

        /**
         * Additional info reserved for future use.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaMigrationAnalysisSummary build() {
            JavaMigrationAnalysisSummary model =
                    new JavaMigrationAnalysisSummary(
                            this.id,
                            this.workRequestId,
                            this.compartmentId,
                            this.analysisProjectName,
                            this.inputApplicationsObjectStoragePaths,
                            this.targetJdkVersion,
                            this.namespaceName,
                            this.bucketName,
                            this.analysisResultObjectStoragePath,
                            this.analysisResultFiles,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeFinished,
                            this.createdBy,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMigrationAnalysisSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("analysisProjectName")) {
                this.analysisProjectName(model.getAnalysisProjectName());
            }
            if (model.wasPropertyExplicitlySet("inputApplicationsObjectStoragePaths")) {
                this.inputApplicationsObjectStoragePaths(
                        model.getInputApplicationsObjectStoragePaths());
            }
            if (model.wasPropertyExplicitlySet("targetJdkVersion")) {
                this.targetJdkVersion(model.getTargetJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("analysisResultObjectStoragePath")) {
                this.analysisResultObjectStoragePath(model.getAnalysisResultObjectStoragePath());
            }
            if (model.wasPropertyExplicitlySet("analysisResultFiles")) {
                this.analysisResultFiles(model.getAnalysisResultFiles());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Java
     * Migration Analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Java
     * Migration Analysis.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Work
     * Request.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Work
     * Request.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Name of the analysis project. */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisProjectName")
    private final String analysisProjectName;

    /**
     * Name of the analysis project.
     *
     * @return the value
     */
    public String getAnalysisProjectName() {
        return analysisProjectName;
    }

    /** Object storage paths to the input files applications to be analysed. */
    @com.fasterxml.jackson.annotation.JsonProperty("inputApplicationsObjectStoragePaths")
    private final java.util.List<String> inputApplicationsObjectStoragePaths;

    /**
     * Object storage paths to the input files applications to be analysed.
     *
     * @return the value
     */
    public java.util.List<String> getInputApplicationsObjectStoragePaths() {
        return inputApplicationsObjectStoragePaths;
    }

    /** Jdk Version of the Java Migration Analysis target. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
    private final String targetJdkVersion;

    /**
     * Jdk Version of the Java Migration Analysis target.
     *
     * @return the value
     */
    public String getTargetJdkVersion() {
        return targetJdkVersion;
    }

    /** Object storage namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Object storage namespace.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** Object storage bucket name. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Object storage bucket name.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Path to the Object Storage analysis application result. */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisResultObjectStoragePath")
    private final String analysisResultObjectStoragePath;

    /**
     * Path to the Object Storage analysis application result.
     *
     * @return the value
     */
    public String getAnalysisResultObjectStoragePath() {
        return analysisResultObjectStoragePath;
    }

    /** The analysis application file names result in the Object Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisResultFiles")
    private final java.util.List<String> analysisResultFiles;

    /**
     * The analysis application file names result in the Object Storage.
     *
     * @return the value
     */
    public java.util.List<String> getAnalysisResultFiles() {
        return analysisResultFiles;
    }

    /**
     * The date and time the Java Migration Analysis was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the Java Migration Analysis was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the Java Migration Analysis was started, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the Java Migration Analysis was started, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the Java Migration Analysis was finished, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time the Java Migration Analysis was finished, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final Principal createdBy;

    public Principal getCreatedBy() {
        return createdBy;
    }

    /** Additional info reserved for future use. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final String metadata;

    /**
     * Additional info reserved for future use.
     *
     * @return the value
     */
    public String getMetadata() {
        return metadata;
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
        sb.append("JavaMigrationAnalysisSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", analysisProjectName=").append(String.valueOf(this.analysisProjectName));
        sb.append(", inputApplicationsObjectStoragePaths=")
                .append(String.valueOf(this.inputApplicationsObjectStoragePaths));
        sb.append(", targetJdkVersion=").append(String.valueOf(this.targetJdkVersion));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", analysisResultObjectStoragePath=")
                .append(String.valueOf(this.analysisResultObjectStoragePath));
        sb.append(", analysisResultFiles=").append(String.valueOf(this.analysisResultFiles));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMigrationAnalysisSummary)) {
            return false;
        }

        JavaMigrationAnalysisSummary other = (JavaMigrationAnalysisSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.analysisProjectName, other.analysisProjectName)
                && java.util.Objects.equals(
                        this.inputApplicationsObjectStoragePaths,
                        other.inputApplicationsObjectStoragePaths)
                && java.util.Objects.equals(this.targetJdkVersion, other.targetJdkVersion)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(
                        this.analysisResultObjectStoragePath, other.analysisResultObjectStoragePath)
                && java.util.Objects.equals(this.analysisResultFiles, other.analysisResultFiles)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.workRequestId == null ? 43 : this.workRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisProjectName == null
                                ? 43
                                : this.analysisProjectName.hashCode());
        result =
                (result * PRIME)
                        + (this.inputApplicationsObjectStoragePaths == null
                                ? 43
                                : this.inputApplicationsObjectStoragePaths.hashCode());
        result =
                (result * PRIME)
                        + (this.targetJdkVersion == null ? 43 : this.targetJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisResultObjectStoragePath == null
                                ? 43
                                : this.analysisResultObjectStoragePath.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisResultFiles == null
                                ? 43
                                : this.analysisResultFiles.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
