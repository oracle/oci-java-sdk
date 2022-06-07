/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A list of job definition resources. Job definitions define the harvest scope and includes the list of objects
 * to be harvested along with a schedule. The list of objects is usually specified through a combination of object
 * type, regular expressions, or specific names of objects and a sample size for the data harvested.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JobDefinitionSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobDefinitionSummary {
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
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
        private String catalogId;

        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            this.__explicitlySet__.add("catalogId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobType")
        private JobType jobType;

        public Builder jobType(JobType jobType) {
            this.jobType = jobType;
            this.__explicitlySet__.add("jobType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataExtracted")
        private Boolean isSampleDataExtracted;

        public Builder isSampleDataExtracted(Boolean isSampleDataExtracted) {
            this.isSampleDataExtracted = isSampleDataExtracted;
            this.__explicitlySet__.add("isSampleDataExtracted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionStarted")
        private java.util.Date timeLatestExecutionStarted;

        public Builder timeLatestExecutionStarted(java.util.Date timeLatestExecutionStarted) {
            this.timeLatestExecutionStarted = timeLatestExecutionStarted;
            this.__explicitlySet__.add("timeLatestExecutionStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionEnded")
        private java.util.Date timeLatestExecutionEnded;

        public Builder timeLatestExecutionEnded(java.util.Date timeLatestExecutionEnded) {
            this.timeLatestExecutionEnded = timeLatestExecutionEnded;
            this.__explicitlySet__.add("timeLatestExecutionEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionState")
        private JobExecutionState jobExecutionState;

        public Builder jobExecutionState(JobExecutionState jobExecutionState) {
            this.jobExecutionState = jobExecutionState;
            this.__explicitlySet__.add("jobExecutionState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
        private JobScheduleType scheduleType;

        public Builder scheduleType(JobScheduleType scheduleType) {
            this.scheduleType = scheduleType;
            this.__explicitlySet__.add("scheduleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobDefinitionSummary build() {
            JobDefinitionSummary __instance__ =
                    new JobDefinitionSummary(
                            key,
                            displayName,
                            description,
                            catalogId,
                            uri,
                            jobType,
                            lifecycleState,
                            isSampleDataExtracted,
                            timeCreated,
                            connectionKey,
                            timeLatestExecutionStarted,
                            timeLatestExecutionEnded,
                            jobExecutionState,
                            scheduleType,
                            dataAssetKey);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobDefinitionSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .catalogId(o.getCatalogId())
                            .uri(o.getUri())
                            .jobType(o.getJobType())
                            .lifecycleState(o.getLifecycleState())
                            .isSampleDataExtracted(o.getIsSampleDataExtracted())
                            .timeCreated(o.getTimeCreated())
                            .connectionKey(o.getConnectionKey())
                            .timeLatestExecutionStarted(o.getTimeLatestExecutionStarted())
                            .timeLatestExecutionEnded(o.getTimeLatestExecutionEnded())
                            .jobExecutionState(o.getJobExecutionState())
                            .scheduleType(o.getScheduleType())
                            .dataAssetKey(o.getDataAssetKey());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Unique key of the job definition resource that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of the job definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    public String getDescription() {
        return description;
    }

    /**
     * The data catalog's OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("catalogId")
    private final String catalogId;

    public String getCatalogId() {
        return catalogId;
    }

    /**
     * URI to the job definition instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    public String getUri() {
        return uri;
    }

    /**
     * Type of the job definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobType")
    private final JobType jobType;

    public JobType getJobType() {
        return jobType;
    }

    /**
     * Lifecycle state of the job definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Specify if sample data to be extracted as part of this harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataExtracted")
    private final Boolean isSampleDataExtracted;

    public Boolean getIsSampleDataExtracted() {
        return isSampleDataExtracted;
    }

    /**
     * The date and time the job definition was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The key of the connection resource used in harvest, sampling, profiling jobs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    public String getConnectionKey() {
        return connectionKey;
    }

    /**
     * Time that the latest job execution started. An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionStarted")
    private final java.util.Date timeLatestExecutionStarted;

    public java.util.Date getTimeLatestExecutionStarted() {
        return timeLatestExecutionStarted;
    }

    /**
     * Time that the latest job execution ended or null if it hasn't yet completed.
     * An [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestExecutionEnded")
    private final java.util.Date timeLatestExecutionEnded;

    public java.util.Date getTimeLatestExecutionEnded() {
        return timeLatestExecutionEnded;
    }

    /**
     * Status of the latest job execution, such as running, paused, or completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionState")
    private final JobExecutionState jobExecutionState;

    public JobExecutionState getJobExecutionState() {
        return jobExecutionState;
    }

    /**
     * Type of job schedule for the latest job executed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scheduleType")
    private final JobScheduleType scheduleType;

    public JobScheduleType getScheduleType() {
        return scheduleType;
    }

    /**
     * Unique key of the data asset to which this job applies, if the job involves a data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    public String getDataAssetKey() {
        return dataAssetKey;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobDefinitionSummary(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
