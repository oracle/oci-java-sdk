/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Result of the Java migration analysis. The analysis result is stored in an Object Storage bucket.
 * <br>
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
        builder = JavaMigrationAnalysisResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JavaMigrationAnalysisResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "fleetId",
        "applicationKey",
        "applicationName",
        "applicationPath",
        "applicationExecutionType",
        "sourceJdkVersion",
        "targetJdkVersion",
        "managedInstanceId",
        "hostName",
        "timeCreated",
        "namespace",
        "bucketName",
        "objectStorageUploadDirPath",
        "objectList",
        "metadata"
    })
    public JavaMigrationAnalysisResult(
            String id,
            String workRequestId,
            String fleetId,
            String applicationKey,
            String applicationName,
            String applicationPath,
            ApplicationExecutionType applicationExecutionType,
            String sourceJdkVersion,
            String targetJdkVersion,
            String managedInstanceId,
            String hostName,
            java.util.Date timeCreated,
            String namespace,
            String bucketName,
            String objectStorageUploadDirPath,
            java.util.List<String> objectList,
            String metadata) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.fleetId = fleetId;
        this.applicationKey = applicationKey;
        this.applicationName = applicationName;
        this.applicationPath = applicationPath;
        this.applicationExecutionType = applicationExecutionType;
        this.sourceJdkVersion = sourceJdkVersion;
        this.targetJdkVersion = targetJdkVersion;
        this.managedInstanceId = managedInstanceId;
        this.hostName = hostName;
        this.timeCreated = timeCreated;
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectStorageUploadDirPath = objectStorageUploadDirPath;
        this.objectList = objectList;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the migration analysis report. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the migration analysis report.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the work request of this analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The OCID of the work request of this analysis.
         *
         * @param workRequestId the value to set
         * @return this builder
         */
        public Builder workRequestId(String workRequestId) {
            this.workRequestId = workRequestId;
            this.__explicitlySet__.add("workRequestId");
            return this;
        }
        /** The fleet OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
        private String fleetId;

        /**
         * The fleet OCID.
         *
         * @param fleetId the value to set
         * @return this builder
         */
        public Builder fleetId(String fleetId) {
            this.fleetId = fleetId;
            this.__explicitlySet__.add("fleetId");
            return this;
        }
        /** The unique key that identifies the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * The unique key that identifies the application.
         *
         * @param applicationKey the value to set
         * @return this builder
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /** The name of the application for which the Java migration analysis was performed. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * The name of the application for which the Java migration analysis was performed.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /**
         * The installation path of the application for which the Java migration analysis was
         * performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationPath")
        private String applicationPath;

        /**
         * The installation path of the application for which the Java migration analysis was
         * performed.
         *
         * @param applicationPath the value to set
         * @return this builder
         */
        public Builder applicationPath(String applicationPath) {
            this.applicationPath = applicationPath;
            this.__explicitlySet__.add("applicationPath");
            return this;
        }
        /**
         * Execution type of the application for an application type, such as WAR and EAR, that is
         * deployed or installed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationExecutionType")
        private ApplicationExecutionType applicationExecutionType;

        /**
         * Execution type of the application for an application type, such as WAR and EAR, that is
         * deployed or installed.
         *
         * @param applicationExecutionType the value to set
         * @return this builder
         */
        public Builder applicationExecutionType(ApplicationExecutionType applicationExecutionType) {
            this.applicationExecutionType = applicationExecutionType;
            this.__explicitlySet__.add("applicationExecutionType");
            return this;
        }
        /** The source JDK version of the application that's currently running. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceJdkVersion")
        private String sourceJdkVersion;

        /**
         * The source JDK version of the application that's currently running.
         *
         * @param sourceJdkVersion the value to set
         * @return this builder
         */
        public Builder sourceJdkVersion(String sourceJdkVersion) {
            this.sourceJdkVersion = sourceJdkVersion;
            this.__explicitlySet__.add("sourceJdkVersion");
            return this;
        }
        /** The target JDK version of the application to be migrated. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
        private String targetJdkVersion;

        /**
         * The target JDK version of the application to be migrated.
         *
         * @param targetJdkVersion the value to set
         * @return this builder
         */
        public Builder targetJdkVersion(String targetJdkVersion) {
            this.targetJdkVersion = targetJdkVersion;
            this.__explicitlySet__.add("targetJdkVersion");
            return this;
        }
        /** The managed instance OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The managed instance OCID.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The hostname of the managed instance that hosts the application for which the Java
         * migration analysis was performed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The hostname of the managed instance that hosts the application for which the Java
         * migration analysis was performed.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The time the result is compiled. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the result is compiled.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The object storage namespace that contains the results of the migration analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The object storage namespace that contains the results of the migration analysis.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The name of the object storage bucket that contains the results of the migration
         * analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the object storage bucket that contains the results of the migration
         * analysis.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /**
         * The directory path of the object storage bucket that contains the results of the
         * migration analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUploadDirPath")
        private String objectStorageUploadDirPath;

        /**
         * The directory path of the object storage bucket that contains the results of the
         * migration analysis.
         *
         * @param objectStorageUploadDirPath the value to set
         * @return this builder
         */
        public Builder objectStorageUploadDirPath(String objectStorageUploadDirPath) {
            this.objectStorageUploadDirPath = objectStorageUploadDirPath;
            this.__explicitlySet__.add("objectStorageUploadDirPath");
            return this;
        }
        /**
         * The names of the object storage objects that contain the results of the migration
         * analysis.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectList")
        private java.util.List<String> objectList;

        /**
         * The names of the object storage objects that contain the results of the migration
         * analysis.
         *
         * @param objectList the value to set
         * @return this builder
         */
        public Builder objectList(java.util.List<String> objectList) {
            this.objectList = objectList;
            this.__explicitlySet__.add("objectList");
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

        public JavaMigrationAnalysisResult build() {
            JavaMigrationAnalysisResult model =
                    new JavaMigrationAnalysisResult(
                            this.id,
                            this.workRequestId,
                            this.fleetId,
                            this.applicationKey,
                            this.applicationName,
                            this.applicationPath,
                            this.applicationExecutionType,
                            this.sourceJdkVersion,
                            this.targetJdkVersion,
                            this.managedInstanceId,
                            this.hostName,
                            this.timeCreated,
                            this.namespace,
                            this.bucketName,
                            this.objectStorageUploadDirPath,
                            this.objectList,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaMigrationAnalysisResult model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("applicationPath")) {
                this.applicationPath(model.getApplicationPath());
            }
            if (model.wasPropertyExplicitlySet("applicationExecutionType")) {
                this.applicationExecutionType(model.getApplicationExecutionType());
            }
            if (model.wasPropertyExplicitlySet("sourceJdkVersion")) {
                this.sourceJdkVersion(model.getSourceJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("targetJdkVersion")) {
                this.targetJdkVersion(model.getTargetJdkVersion());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectStorageUploadDirPath")) {
                this.objectStorageUploadDirPath(model.getObjectStorageUploadDirPath());
            }
            if (model.wasPropertyExplicitlySet("objectList")) {
                this.objectList(model.getObjectList());
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

    /** The OCID of the migration analysis report. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the migration analysis report.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the work request of this analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The OCID of the work request of this analysis.
     *
     * @return the value
     */
    public String getWorkRequestId() {
        return workRequestId;
    }

    /** The fleet OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("fleetId")
    private final String fleetId;

    /**
     * The fleet OCID.
     *
     * @return the value
     */
    public String getFleetId() {
        return fleetId;
    }

    /** The unique key that identifies the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * The unique key that identifies the application.
     *
     * @return the value
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    /** The name of the application for which the Java migration analysis was performed. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * The name of the application for which the Java migration analysis was performed.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * The installation path of the application for which the Java migration analysis was performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationPath")
    private final String applicationPath;

    /**
     * The installation path of the application for which the Java migration analysis was performed.
     *
     * @return the value
     */
    public String getApplicationPath() {
        return applicationPath;
    }

    /**
     * Execution type of the application for an application type, such as WAR and EAR, that is
     * deployed or installed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationExecutionType")
    private final ApplicationExecutionType applicationExecutionType;

    /**
     * Execution type of the application for an application type, such as WAR and EAR, that is
     * deployed or installed.
     *
     * @return the value
     */
    public ApplicationExecutionType getApplicationExecutionType() {
        return applicationExecutionType;
    }

    /** The source JDK version of the application that's currently running. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceJdkVersion")
    private final String sourceJdkVersion;

    /**
     * The source JDK version of the application that's currently running.
     *
     * @return the value
     */
    public String getSourceJdkVersion() {
        return sourceJdkVersion;
    }

    /** The target JDK version of the application to be migrated. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetJdkVersion")
    private final String targetJdkVersion;

    /**
     * The target JDK version of the application to be migrated.
     *
     * @return the value
     */
    public String getTargetJdkVersion() {
        return targetJdkVersion;
    }

    /** The managed instance OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The managed instance OCID.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The hostname of the managed instance that hosts the application for which the Java migration
     * analysis was performed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The hostname of the managed instance that hosts the application for which the Java migration
     * analysis was performed.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The time the result is compiled. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the result is compiled.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The object storage namespace that contains the results of the migration analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The object storage namespace that contains the results of the migration analysis.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The name of the object storage bucket that contains the results of the migration analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the object storage bucket that contains the results of the migration analysis.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The directory path of the object storage bucket that contains the results of the migration
     * analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageUploadDirPath")
    private final String objectStorageUploadDirPath;

    /**
     * The directory path of the object storage bucket that contains the results of the migration
     * analysis.
     *
     * @return the value
     */
    public String getObjectStorageUploadDirPath() {
        return objectStorageUploadDirPath;
    }

    /**
     * The names of the object storage objects that contain the results of the migration analysis.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectList")
    private final java.util.List<String> objectList;

    /**
     * The names of the object storage objects that contain the results of the migration analysis.
     *
     * @return the value
     */
    public java.util.List<String> getObjectList() {
        return objectList;
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
        sb.append("JavaMigrationAnalysisResult(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", applicationPath=").append(String.valueOf(this.applicationPath));
        sb.append(", applicationExecutionType=")
                .append(String.valueOf(this.applicationExecutionType));
        sb.append(", sourceJdkVersion=").append(String.valueOf(this.sourceJdkVersion));
        sb.append(", targetJdkVersion=").append(String.valueOf(this.targetJdkVersion));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectStorageUploadDirPath=")
                .append(String.valueOf(this.objectStorageUploadDirPath));
        sb.append(", objectList=").append(String.valueOf(this.objectList));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaMigrationAnalysisResult)) {
            return false;
        }

        JavaMigrationAnalysisResult other = (JavaMigrationAnalysisResult) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.applicationPath, other.applicationPath)
                && java.util.Objects.equals(
                        this.applicationExecutionType, other.applicationExecutionType)
                && java.util.Objects.equals(this.sourceJdkVersion, other.sourceJdkVersion)
                && java.util.Objects.equals(this.targetJdkVersion, other.targetJdkVersion)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(
                        this.objectStorageUploadDirPath, other.objectStorageUploadDirPath)
                && java.util.Objects.equals(this.objectList, other.objectList)
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
        result = (result * PRIME) + (this.fleetId == null ? 43 : this.fleetId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationPath == null ? 43 : this.applicationPath.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationExecutionType == null
                                ? 43
                                : this.applicationExecutionType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceJdkVersion == null ? 43 : this.sourceJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetJdkVersion == null ? 43 : this.targetJdkVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageUploadDirPath == null
                                ? 43
                                : this.objectStorageUploadDirPath.hashCode());
        result = (result * PRIME) + (this.objectList == null ? 43 : this.objectList.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
