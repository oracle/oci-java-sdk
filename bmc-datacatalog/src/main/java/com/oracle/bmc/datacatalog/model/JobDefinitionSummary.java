/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A list of job definition resources. Job definitions define the harvest scope and includes the
 * list of objects to be harvested along with a schedule. The list of objects is usually specified
 * through a combination of object type, regular expressions, or specific names of objects and a
 * sample size for the data harvested. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobDefinitionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JobDefinitionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "catalogId",
        "uri",
        "jobType",
        "lifecycleState",
        "isSampleDataExtracted",
        "timeCreated",
        "connectionKey",
        "timeLatestExecutionStarted",
        "timeLatestExecutionEnded",
        "jobExecutionState",
        "scheduleType",
        "dataAssetKey"
    })
    public JobDefinitionSummary(
            String key,
            String displayName,
            String description,
            String catalogId,
            String uri,
            JobType jobType,
            LifecycleState lifecycleState,
            Boolean isSampleDataExtracted,
            java.util.Date timeCreated,
            String connectionKey,
            java.util.Date timeLatestExecutionStarted,
            java.util.Date timeLatestExecutionEnded,
            JobExecutionState jobExecutionState,
            JobScheduleType scheduleType,
            String dataAssetKey) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.catalogId = catalogId;
        this.uri = uri;
        this.jobType = jobType;
        this.lifecycleState = lifecycleState;
        this.isSampleDataExtracted = isSampleDataExtracted;
        this.timeCreated = timeCreated;
        this.connectionKey = connectionKey;
        this.timeLatestExecutionStarted = timeLatestExecutionStarted;
        this.timeLatestExecutionEnded = timeLatestExecutionEnded;
        this.jobExecutionState = jobExecutionState;
        this.scheduleType = scheduleType;
        this.dataAssetKey = dataAssetKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique key of the job definition resource that is immutable. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Unique key of the job definition resource that is immutable.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid
         * entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Detailed description of the job definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of the job definition.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The data catalog's OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        /**
         * The data catalog's OCID.
         *
         * @param catalogId the value to set
         * @return this builder
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }
        /** URI to the job definition instance in the API. */
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the job definition instance in the API.
         *
         * @param uri the value to set
         * @return this builder
         */
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /** Type of the job definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        /**
         * Type of the job definition.
         *
         * @param jobType the value to set
         * @return this builder
         */
        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }
        /** Lifecycle state of the job definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * Lifecycle state of the job definition.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Specify if sample data to be extracted as part of this harvest. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataExtracted")
        private Boolean isSampleDataExtracted;

        /**
         * Specify if sample data to be extracted as part of this harvest.
         *
         * @param isSampleDataExtracted the value to set
         * @return this builder
         */
        public Builder isSampleDataExtracted(Boolean isSampleDataExtracted) {
            this.isSampleDataExtracted = isSampleDataExtracted;
            this.__explicitlySet__.add("isSampleDataExtracted");
            return this;
        }
        /**
         * The date and time the job definition was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the job definition was created, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The key of the connection resource used in harvest, sampling, profiling jobs. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        /**
         * The key of the connection resource used in harvest, sampling, profiling jobs.
         *
         * @param connectionKey the value to set
         * @return this builder
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }
        /**
         * Time that the latest job execution started. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionStarted")
        private java.util.Date timeLatestExecutionStarted;

        /**
         * Time that the latest job execution started. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeLatestExecutionStarted the value to set
         * @return this builder
         */
        public Builder timeLatestExecutionStarted(java.util.Date timeLatestExecutionStarted) {
            this.timeLatestExecutionStarted = timeLatestExecutionStarted;
            this.__explicitlySet__.add("timeLatestExecutionStarted");
            return this;
        }
        /**
         * Time that the latest job execution ended or null if it hasn't yet completed. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionEnded")
        private java.util.Date timeLatestExecutionEnded;

        /**
         * Time that the latest job execution ended or null if it hasn't yet completed. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeLatestExecutionEnded the value to set
         * @return this builder
         */
        public Builder timeLatestExecutionEnded(java.util.Date timeLatestExecutionEnded) {
            this.timeLatestExecutionEnded = timeLatestExecutionEnded;
            this.__explicitlySet__.add("timeLatestExecutionEnded");
            return this;
        }
        /** Status of the latest job execution, such as running, paused, or completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionState")
        private JobExecutionState jobExecutionState;

        /**
         * Status of the latest job execution, such as running, paused, or completed.
         *
         * @param jobExecutionState the value to set
         * @return this builder
         */
        public Builder jobExecutionState(JobExecutionState jobExecutionState) {
            this.jobExecutionState = jobExecutionState;
            this.__explicitlySet__.add("jobExecutionState");
            return this;
        }
        /** Type of job schedule for the latest job executed. */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private JobScheduleType scheduleType;

        /**
         * Type of job schedule for the latest job executed.
         *
         * @param scheduleType the value to set
         * @return this builder
         */
        public Builder scheduleType(JobScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }
        /**
         * Unique key of the data asset to which this job applies, if the job involves a data asset.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * Unique key of the data asset to which this job applies, if the job involves a data asset.
         *
         * @param dataAssetKey the value to set
         * @return this builder
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobDefinitionSummary build() {
            JobDefinitionSummary model =
                    new JobDefinitionSummary(
                            this.key,
                            this.displayName,
                            this.description,
                            this.catalogId,
                            this.uri,
                            this.jobType,
                            this.lifecycleState,
                            this.isSampleDataExtracted,
                            this.timeCreated,
                            this.connectionKey,
                            this.timeLatestExecutionStarted,
                            this.timeLatestExecutionEnded,
                            this.jobExecutionState,
                            this.scheduleType,
                            this.dataAssetKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobDefinitionSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("isSampleDataExtracted")) {
                this.isSampleDataExtracted(model.getIsSampleDataExtracted());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("connectionKey")) {
                this.connectionKey(model.getConnectionKey());
            }
            if (model.wasPropertyExplicitlySet("timeLatestExecutionStarted")) {
                this.timeLatestExecutionStarted(model.getTimeLatestExecutionStarted());
            }
            if (model.wasPropertyExplicitlySet("timeLatestExecutionEnded")) {
                this.timeLatestExecutionEnded(model.getTimeLatestExecutionEnded());
            }
            if (model.wasPropertyExplicitlySet("jobExecutionState")) {
                this.jobExecutionState(model.getJobExecutionState());
            }
            if (model.wasPropertyExplicitlySet("scheduleType")) {
                this.scheduleType(model.getScheduleType());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
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

    /** Unique key of the job definition resource that is immutable. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Unique key of the job definition resource that is immutable.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Detailed description of the job definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of the job definition.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The data catalog's OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    /**
     * The data catalog's OCID.
     *
     * @return the value
     */
    public String getCatalogId() {
        return catalogId;
    }

    /** URI to the job definition instance in the API. */
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the job definition instance in the API.
     *
     * @return the value
     */
    public String getUri() {
        return uri;
    }

    /** Type of the job definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    /**
     * Type of the job definition.
     *
     * @return the value
     */
    public JobType getJobType() {
        return jobType;
    }

    /** Lifecycle state of the job definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * Lifecycle state of the job definition.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Specify if sample data to be extracted as part of this harvest. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataExtracted")
    private final Boolean isSampleDataExtracted;

    /**
     * Specify if sample data to be extracted as part of this harvest.
     *
     * @return the value
     */
    public Boolean getIsSampleDataExtracted() {
        return isSampleDataExtracted;
    }

    /**
     * The date and time the job definition was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the job definition was created, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The key of the connection resource used in harvest, sampling, profiling jobs. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    /**
     * The key of the connection resource used in harvest, sampling, profiling jobs.
     *
     * @return the value
     */
    public String getConnectionKey() {
        return connectionKey;
    }

    /**
     * Time that the latest job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionStarted")
    private final java.util.Date timeLatestExecutionStarted;

    /**
     * Time that the latest job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339)
     * formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeLatestExecutionStarted() {
        return timeLatestExecutionStarted;
    }

    /**
     * Time that the latest job execution ended or null if it hasn't yet completed. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionEnded")
    private final java.util.Date timeLatestExecutionEnded;

    /**
     * Time that the latest job execution ended or null if it hasn't yet completed. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeLatestExecutionEnded() {
        return timeLatestExecutionEnded;
    }

    /** Status of the latest job execution, such as running, paused, or completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionState")
    private final JobExecutionState jobExecutionState;

    /**
     * Status of the latest job execution, such as running, paused, or completed.
     *
     * @return the value
     */
    public JobExecutionState getJobExecutionState() {
        return jobExecutionState;
    }

    /** Type of job schedule for the latest job executed. */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final JobScheduleType scheduleType;

    /**
     * Type of job schedule for the latest job executed.
     *
     * @return the value
     */
    public JobScheduleType getScheduleType() {
        return scheduleType;
    }

    /** Unique key of the data asset to which this job applies, if the job involves a data asset. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * Unique key of the data asset to which this job applies, if the job involves a data asset.
     *
     * @return the value
     */
    public String getDataAssetKey() {
        return dataAssetKey;
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
        sb.append("JobDefinitionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", isSampleDataExtracted=").append(String.valueOf(this.isSampleDataExtracted));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(", timeLatestExecutionStarted=")
                .append(String.valueOf(this.timeLatestExecutionStarted));
        sb.append(", timeLatestExecutionEnded=")
                .append(String.valueOf(this.timeLatestExecutionEnded));
        sb.append(", jobExecutionState=").append(String.valueOf(this.jobExecutionState));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobDefinitionSummary)) {
            return false;
        }

        JobDefinitionSummary other = (JobDefinitionSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.isSampleDataExtracted, other.isSampleDataExtracted)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(
                        this.timeLatestExecutionStarted, other.timeLatestExecutionStarted)
                && java.util.Objects.equals(
                        this.timeLatestExecutionEnded, other.timeLatestExecutionEnded)
                && java.util.Objects.equals(this.jobExecutionState, other.jobExecutionState)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.isSampleDataExtracted == null
                                ? 43
                                : this.isSampleDataExtracted.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestExecutionStarted == null
                                ? 43
                                : this.timeLatestExecutionStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestExecutionEnded == null
                                ? 43
                                : this.timeLatestExecutionEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.jobExecutionState == null ? 43 : this.jobExecutionState.hashCode());
        result = (result * PRIME) + (this.scheduleType == null ? 43 : this.scheduleType.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
