/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Metadata of a Performance Tuning Analysis result. The analysis result is stored as the Object
 * Storage object. <br>
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
        builder = PerformanceTuningAnalysisResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PerformanceTuningAnalysisResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "workRequestId",
        "fleetId",
        "applicationId",
        "applicationInstallationId",
        "applicationInstallationPath",
        "warningCount",
        "result",
        "managedInstanceId",
        "hostName",
        "applicationName",
        "namespace",
        "bucketName",
        "objectName",
        "timeCreated",
        "timeStarted",
        "timeFinished"
    })
    public PerformanceTuningAnalysisResult(
            String id,
            String workRequestId,
            String fleetId,
            String applicationId,
            String applicationInstallationId,
            String applicationInstallationPath,
            Integer warningCount,
            PerformanceTuningResultStatus result,
            String managedInstanceId,
            String hostName,
            String applicationName,
            String namespace,
            String bucketName,
            String objectName,
            java.util.Date timeCreated,
            java.util.Date timeStarted,
            java.util.Date timeFinished) {
        super();
        this.id = id;
        this.workRequestId = workRequestId;
        this.fleetId = fleetId;
        this.applicationId = applicationId;
        this.applicationInstallationId = applicationInstallationId;
        this.applicationInstallationPath = applicationInstallationPath;
        this.warningCount = warningCount;
        this.result = result;
        this.managedInstanceId = managedInstanceId;
        this.hostName = hostName;
        this.applicationName = applicationName;
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.timeCreated = timeCreated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID to identify this analysis results. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID to identify this analysis results.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the work request to start the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
        private String workRequestId;

        /**
         * The OCID of the work request to start the analysis.
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
        /** The OCID of the application for which the report has been generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
        private String applicationId;

        /**
         * The OCID of the application for which the report has been generated.
         *
         * @param applicationId the value to set
         * @return this builder
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            this.__explicitlySet__.add("applicationId");
            return this;
        }
        /**
         * The internal identifier of the application installation for which the report has been
         * generated.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationId")
        private String applicationInstallationId;

        /**
         * The internal identifier of the application installation for which the report has been
         * generated.
         *
         * @param applicationInstallationId the value to set
         * @return this builder
         */
        public Builder applicationInstallationId(String applicationInstallationId) {
            this.applicationInstallationId = applicationInstallationId;
            this.__explicitlySet__.add("applicationInstallationId");
            return this;
        }
        /** The installation path of the application for which the report has been generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationPath")
        private String applicationInstallationPath;

        /**
         * The installation path of the application for which the report has been generated.
         *
         * @param applicationInstallationPath the value to set
         * @return this builder
         */
        public Builder applicationInstallationPath(String applicationInstallationPath) {
            this.applicationInstallationPath = applicationInstallationPath;
            this.__explicitlySet__.add("applicationInstallationPath");
            return this;
        }
        /** Total number of warnings reported by the analysis. */
        @com.fasterxml.jackson.annotation.JsonProperty("warningCount")
        private Integer warningCount;

        /**
         * Total number of warnings reported by the analysis.
         *
         * @param warningCount the value to set
         * @return this builder
         */
        public Builder warningCount(Integer warningCount) {
            this.warningCount = warningCount;
            this.__explicitlySet__.add("warningCount");
            return this;
        }
        /** Result of the analysis based on whether warnings have been found or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private PerformanceTuningResultStatus result;

        /**
         * Result of the analysis based on whether warnings have been found or not.
         *
         * @param result the value to set
         * @return this builder
         */
        public Builder result(PerformanceTuningResultStatus result) {
            this.result = result;
            this.__explicitlySet__.add("result");
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
        /** The hostname of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        /**
         * The hostname of the managed instance.
         *
         * @param hostName the value to set
         * @return this builder
         */
        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }
        /** The name of the application for which the report has been generated. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * The name of the application for which the report has been generated.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /** The Object Storage namespace of this analysis result. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace of this analysis result.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The Object Storage bucket name of this analysis result. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket name of this analysis result.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The Object Storage object name of this analysis result. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The Object Storage object name of this analysis result.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
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
        /** The time the JFR recording has started. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The time the JFR recording has started.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The time the JFR recording has finished. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The time the JFR recording has finished.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PerformanceTuningAnalysisResult build() {
            PerformanceTuningAnalysisResult model =
                    new PerformanceTuningAnalysisResult(
                            this.id,
                            this.workRequestId,
                            this.fleetId,
                            this.applicationId,
                            this.applicationInstallationId,
                            this.applicationInstallationPath,
                            this.warningCount,
                            this.result,
                            this.managedInstanceId,
                            this.hostName,
                            this.applicationName,
                            this.namespace,
                            this.bucketName,
                            this.objectName,
                            this.timeCreated,
                            this.timeStarted,
                            this.timeFinished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PerformanceTuningAnalysisResult model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("workRequestId")) {
                this.workRequestId(model.getWorkRequestId());
            }
            if (model.wasPropertyExplicitlySet("fleetId")) {
                this.fleetId(model.getFleetId());
            }
            if (model.wasPropertyExplicitlySet("applicationId")) {
                this.applicationId(model.getApplicationId());
            }
            if (model.wasPropertyExplicitlySet("applicationInstallationId")) {
                this.applicationInstallationId(model.getApplicationInstallationId());
            }
            if (model.wasPropertyExplicitlySet("applicationInstallationPath")) {
                this.applicationInstallationPath(model.getApplicationInstallationPath());
            }
            if (model.wasPropertyExplicitlySet("warningCount")) {
                this.warningCount(model.getWarningCount());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
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

    /** The OCID to identify this analysis results. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID to identify this analysis results.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the work request to start the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("workRequestId")
    private final String workRequestId;

    /**
     * The OCID of the work request to start the analysis.
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

    /** The OCID of the application for which the report has been generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationId")
    private final String applicationId;

    /**
     * The OCID of the application for which the report has been generated.
     *
     * @return the value
     */
    public String getApplicationId() {
        return applicationId;
    }

    /**
     * The internal identifier of the application installation for which the report has been
     * generated.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationId")
    private final String applicationInstallationId;

    /**
     * The internal identifier of the application installation for which the report has been
     * generated.
     *
     * @return the value
     */
    public String getApplicationInstallationId() {
        return applicationInstallationId;
    }

    /** The installation path of the application for which the report has been generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationInstallationPath")
    private final String applicationInstallationPath;

    /**
     * The installation path of the application for which the report has been generated.
     *
     * @return the value
     */
    public String getApplicationInstallationPath() {
        return applicationInstallationPath;
    }

    /** Total number of warnings reported by the analysis. */
    @com.fasterxml.jackson.annotation.JsonProperty("warningCount")
    private final Integer warningCount;

    /**
     * Total number of warnings reported by the analysis.
     *
     * @return the value
     */
    public Integer getWarningCount() {
        return warningCount;
    }

    /** Result of the analysis based on whether warnings have been found or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final PerformanceTuningResultStatus result;

    /**
     * Result of the analysis based on whether warnings have been found or not.
     *
     * @return the value
     */
    public PerformanceTuningResultStatus getResult() {
        return result;
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

    /** The hostname of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostName")
    private final String hostName;

    /**
     * The hostname of the managed instance.
     *
     * @return the value
     */
    public String getHostName() {
        return hostName;
    }

    /** The name of the application for which the report has been generated. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * The name of the application for which the report has been generated.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** The Object Storage namespace of this analysis result. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace of this analysis result.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The Object Storage bucket name of this analysis result. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket name of this analysis result.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The Object Storage object name of this analysis result. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The Object Storage object name of this analysis result.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
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

    /** The time the JFR recording has started. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The time the JFR recording has started.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The time the JFR recording has finished. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The time the JFR recording has finished.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
        sb.append("PerformanceTuningAnalysisResult(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", workRequestId=").append(String.valueOf(this.workRequestId));
        sb.append(", fleetId=").append(String.valueOf(this.fleetId));
        sb.append(", applicationId=").append(String.valueOf(this.applicationId));
        sb.append(", applicationInstallationId=")
                .append(String.valueOf(this.applicationInstallationId));
        sb.append(", applicationInstallationPath=")
                .append(String.valueOf(this.applicationInstallationPath));
        sb.append(", warningCount=").append(String.valueOf(this.warningCount));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", hostName=").append(String.valueOf(this.hostName));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PerformanceTuningAnalysisResult)) {
            return false;
        }

        PerformanceTuningAnalysisResult other = (PerformanceTuningAnalysisResult) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.workRequestId, other.workRequestId)
                && java.util.Objects.equals(this.fleetId, other.fleetId)
                && java.util.Objects.equals(this.applicationId, other.applicationId)
                && java.util.Objects.equals(
                        this.applicationInstallationId, other.applicationInstallationId)
                && java.util.Objects.equals(
                        this.applicationInstallationPath, other.applicationInstallationPath)
                && java.util.Objects.equals(this.warningCount, other.warningCount)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostName, other.hostName)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
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
                        + (this.applicationId == null ? 43 : this.applicationId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationInstallationId == null
                                ? 43
                                : this.applicationInstallationId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationInstallationPath == null
                                ? 43
                                : this.applicationInstallationPath.hashCode());
        result = (result * PRIME) + (this.warningCount == null ? 43 : this.warningCount.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.hostName == null ? 43 : this.hostName.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
