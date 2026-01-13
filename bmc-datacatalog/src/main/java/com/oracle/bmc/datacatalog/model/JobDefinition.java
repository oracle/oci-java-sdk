/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Representation of a job definition resource. Job definitions define the harvest scope and
 * includes the list of objects to be harvested along with a schedule. The list of objects is
 * usually specified through a combination of object type, regular expressions, or specific names of
 * objects and a sample size for the data harvested. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobDefinition extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "catalogId",
        "jobType",
        "isIncremental",
        "dataAssetKey",
        "glossaryKey",
        "description",
        "connectionKey",
        "internalVersion",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "createdById",
        "updatedById",
        "uri",
        "isSampleDataExtracted",
        "sampleDataSizeInMBs",
        "timeLatestExecutionStarted",
        "timeLatestExecutionEnded",
        "jobExecutionState",
        "scheduleType",
        "properties"
    })
    public JobDefinition(
            String key,
            String displayName,
            String catalogId,
            JobType jobType,
            Boolean isIncremental,
            String dataAssetKey,
            String glossaryKey,
            String description,
            String connectionKey,
            String internalVersion,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String createdById,
            String updatedById,
            String uri,
            Boolean isSampleDataExtracted,
            Integer sampleDataSizeInMBs,
            java.util.Date timeLatestExecutionStarted,
            java.util.Date timeLatestExecutionEnded,
            JobExecutionState jobExecutionState,
            JobScheduleType scheduleType,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.catalogId = catalogId;
        this.jobType = jobType;
        this.isIncremental = isIncremental;
        this.dataAssetKey = dataAssetKey;
        this.glossaryKey = glossaryKey;
        this.description = description;
        this.connectionKey = connectionKey;
        this.internalVersion = internalVersion;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.createdById = createdById;
        this.updatedById = updatedById;
        this.uri = uri;
        this.isSampleDataExtracted = isSampleDataExtracted;
        this.sampleDataSizeInMBs = sampleDataSizeInMBs;
        this.timeLatestExecutionStarted = timeLatestExecutionStarted;
        this.timeLatestExecutionEnded = timeLatestExecutionEnded;
        this.jobExecutionState = jobExecutionState;
        this.scheduleType = scheduleType;
        this.properties = properties;
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
        /** Specifies if the job definition is incremental or full. */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncremental")
        private Boolean isIncremental;

        /**
         * Specifies if the job definition is incremental or full.
         *
         * @param isIncremental the value to set
         * @return this builder
         */
        public Builder isIncremental(Boolean isIncremental) {
            this.isIncremental = isIncremental;
            this.__explicitlySet__.add("isIncremental");
            return this;
        }
        /** The key of the data asset for which the job is defined. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * The key of the data asset for which the job is defined.
         *
         * @param dataAssetKey the value to set
         * @return this builder
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /** Unique key of the glossary to which this job applies. */
        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        /**
         * Unique key of the glossary to which this job applies.
         *
         * @param glossaryKey the value to set
         * @return this builder
         */
        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
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
        /**
         * The key of the default connection resource to be used for harvest, sampling, profiling
         * jobs. This may be overridden in each job instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        /**
         * The key of the default connection resource to be used for harvest, sampling, profiling
         * jobs. This may be overridden in each job instance.
         *
         * @param connectionKey the value to set
         * @return this builder
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
            return this;
        }
        /** Version of the job definition object. Used internally but can be visible to users. */
        @com.fasterxml.jackson.annotation.JsonProperty("internalVersion")
        private String internalVersion;

        /**
         * Version of the job definition object. Used internally but can be visible to users.
         *
         * @param internalVersion the value to set
         * @return this builder
         */
        public Builder internalVersion(String internalVersion) {
            this.internalVersion = internalVersion;
            this.__explicitlySet__.add("internalVersion");
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
        /**
         * The last time that any change was made to the data asset. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time that any change was made to the data asset. An
         * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** OCID of the user who created this job definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("createdById")
        private String createdById;

        /**
         * OCID of the user who created this job definition.
         *
         * @param createdById the value to set
         * @return this builder
         */
        public Builder createdById(String createdById) {
            this.createdById = createdById;
            this.__explicitlySet__.add("createdById");
            return this;
        }
        /** OCID of the user who updated this job definition. */
        @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
        private String updatedById;

        /**
         * OCID of the user who updated this job definition.
         *
         * @param updatedById the value to set
         * @return this builder
         */
        public Builder updatedById(String updatedById) {
            this.updatedById = updatedById;
            this.__explicitlySet__.add("updatedById");
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
         * Specify the sample data size in MB, specified as number of rows, for this metadata
         * harvest.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sampleDataSizeInMBs")
        private Integer sampleDataSizeInMBs;

        /**
         * Specify the sample data size in MB, specified as number of rows, for this metadata
         * harvest.
         *
         * @param sampleDataSizeInMBs the value to set
         * @return this builder
         */
        public Builder sampleDataSizeInMBs(Integer sampleDataSizeInMBs) {
            this.sampleDataSizeInMBs = sampleDataSizeInMBs;
            this.__explicitlySet__.add("sampleDataSizeInMBs");
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
         * A map of maps that contains the properties which are specific to the job type. Each job
         * type definition may define it's set of required and optional properties. The map keys are
         * category names and the values are maps of property name to property value. Every property
         * is contained inside of a category. Most job definitions have required properties within
         * the "default" category. Example: {@code {"properties": { "default": { "host": "host1",
         * "port": "1521", "database": "orcl"}}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private java.util.Map<String, java.util.Map<String, String>> properties;

        /**
         * A map of maps that contains the properties which are specific to the job type. Each job
         * type definition may define it's set of required and optional properties. The map keys are
         * category names and the values are maps of property name to property value. Every property
         * is contained inside of a category. Most job definitions have required properties within
         * the "default" category. Example: {@code {"properties": { "default": { "host": "host1",
         * "port": "1521", "database": "orcl"}}}}
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(java.util.Map<String, java.util.Map<String, String>> properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobDefinition build() {
            JobDefinition model =
                    new JobDefinition(
                            this.key,
                            this.displayName,
                            this.catalogId,
                            this.jobType,
                            this.isIncremental,
                            this.dataAssetKey,
                            this.glossaryKey,
                            this.description,
                            this.connectionKey,
                            this.internalVersion,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.createdById,
                            this.updatedById,
                            this.uri,
                            this.isSampleDataExtracted,
                            this.sampleDataSizeInMBs,
                            this.timeLatestExecutionStarted,
                            this.timeLatestExecutionEnded,
                            this.jobExecutionState,
                            this.scheduleType,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobDefinition model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("catalogId")) {
                this.catalogId(model.getCatalogId());
            }
            if (model.wasPropertyExplicitlySet("jobType")) {
                this.jobType(model.getJobType());
            }
            if (model.wasPropertyExplicitlySet("isIncremental")) {
                this.isIncremental(model.getIsIncremental());
            }
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("glossaryKey")) {
                this.glossaryKey(model.getGlossaryKey());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("connectionKey")) {
                this.connectionKey(model.getConnectionKey());
            }
            if (model.wasPropertyExplicitlySet("internalVersion")) {
                this.internalVersion(model.getInternalVersion());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("createdById")) {
                this.createdById(model.getCreatedById());
            }
            if (model.wasPropertyExplicitlySet("updatedById")) {
                this.updatedById(model.getUpdatedById());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("isSampleDataExtracted")) {
                this.isSampleDataExtracted(model.getIsSampleDataExtracted());
            }
            if (model.wasPropertyExplicitlySet("sampleDataSizeInMBs")) {
                this.sampleDataSizeInMBs(model.getSampleDataSizeInMBs());
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
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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

    /** Specifies if the job definition is incremental or full. */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncremental")
    private final Boolean isIncremental;

    /**
     * Specifies if the job definition is incremental or full.
     *
     * @return the value
     */
    public Boolean getIsIncremental() {
        return isIncremental;
    }

    /** The key of the data asset for which the job is defined. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * The key of the data asset for which the job is defined.
     *
     * @return the value
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /** Unique key of the glossary to which this job applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    private final String glossaryKey;

    /**
     * Unique key of the glossary to which this job applies.
     *
     * @return the value
     */
    public String getGlossaryKey() {
        return glossaryKey;
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

    /**
     * The key of the default connection resource to be used for harvest, sampling, profiling jobs.
     * This may be overridden in each job instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    /**
     * The key of the default connection resource to be used for harvest, sampling, profiling jobs.
     * This may be overridden in each job instance.
     *
     * @return the value
     */
    public String getConnectionKey() {
        return connectionKey;
    }

    /** Version of the job definition object. Used internally but can be visible to users. */
    @com.fasterxml.jackson.annotation.JsonProperty("internalVersion")
    private final String internalVersion;

    /**
     * Version of the job definition object. Used internally but can be visible to users.
     *
     * @return the value
     */
    public String getInternalVersion() {
        return internalVersion;
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

    /**
     * The last time that any change was made to the data asset. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time that any change was made to the data asset. An
     * [RFC3339](https://tools.ietf.org/html/rfc3339) formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** OCID of the user who created this job definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("createdById")
    private final String createdById;

    /**
     * OCID of the user who created this job definition.
     *
     * @return the value
     */
    public String getCreatedById() {
        return createdById;
    }

    /** OCID of the user who updated this job definition. */
    @com.fasterxml.jackson.annotation.JsonProperty("updatedById")
    private final String updatedById;

    /**
     * OCID of the user who updated this job definition.
     *
     * @return the value
     */
    public String getUpdatedById() {
        return updatedById;
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
     * Specify the sample data size in MB, specified as number of rows, for this metadata harvest.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sampleDataSizeInMBs")
    private final Integer sampleDataSizeInMBs;

    /**
     * Specify the sample data size in MB, specified as number of rows, for this metadata harvest.
     *
     * @return the value
     */
    public Integer getSampleDataSizeInMBs() {
        return sampleDataSizeInMBs;
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

    /**
     * A map of maps that contains the properties which are specific to the job type. Each job type
     * definition may define it's set of required and optional properties. The map keys are category
     * names and the values are maps of property name to property value. Every property is contained
     * inside of a category. Most job definitions have required properties within the "default"
     * category. Example: {@code {"properties": { "default": { "host": "host1", "port": "1521",
     * "database": "orcl"}}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final java.util.Map<String, java.util.Map<String, String>> properties;

    /**
     * A map of maps that contains the properties which are specific to the job type. Each job type
     * definition may define it's set of required and optional properties. The map keys are category
     * names and the values are maps of property name to property value. Every property is contained
     * inside of a category. Most job definitions have required properties within the "default"
     * category. Example: {@code {"properties": { "default": { "host": "host1", "port": "1521",
     * "database": "orcl"}}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, String>> getProperties() {
        return properties;
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
        sb.append("JobDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", catalogId=").append(String.valueOf(this.catalogId));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", isIncremental=").append(String.valueOf(this.isIncremental));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", glossaryKey=").append(String.valueOf(this.glossaryKey));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(", internalVersion=").append(String.valueOf(this.internalVersion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", createdById=").append(String.valueOf(this.createdById));
        sb.append(", updatedById=").append(String.valueOf(this.updatedById));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", isSampleDataExtracted=").append(String.valueOf(this.isSampleDataExtracted));
        sb.append(", sampleDataSizeInMBs=").append(String.valueOf(this.sampleDataSizeInMBs));
        sb.append(", timeLatestExecutionStarted=")
                .append(String.valueOf(this.timeLatestExecutionStarted));
        sb.append(", timeLatestExecutionEnded=")
                .append(String.valueOf(this.timeLatestExecutionEnded));
        sb.append(", jobExecutionState=").append(String.valueOf(this.jobExecutionState));
        sb.append(", scheduleType=").append(String.valueOf(this.scheduleType));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobDefinition)) {
            return false;
        }

        JobDefinition other = (JobDefinition) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.isIncremental, other.isIncremental)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.glossaryKey, other.glossaryKey)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.internalVersion, other.internalVersion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.createdById, other.createdById)
                && java.util.Objects.equals(this.updatedById, other.updatedById)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.isSampleDataExtracted, other.isSampleDataExtracted)
                && java.util.Objects.equals(this.sampleDataSizeInMBs, other.sampleDataSizeInMBs)
                && java.util.Objects.equals(
                        this.timeLatestExecutionStarted, other.timeLatestExecutionStarted)
                && java.util.Objects.equals(
                        this.timeLatestExecutionEnded, other.timeLatestExecutionEnded)
                && java.util.Objects.equals(this.jobExecutionState, other.jobExecutionState)
                && java.util.Objects.equals(this.scheduleType, other.scheduleType)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncremental == null ? 43 : this.isIncremental.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result = (result * PRIME) + (this.glossaryKey == null ? 43 : this.glossaryKey.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
        result =
                (result * PRIME)
                        + (this.internalVersion == null ? 43 : this.internalVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.createdById == null ? 43 : this.createdById.hashCode());
        result = (result * PRIME) + (this.updatedById == null ? 43 : this.updatedById.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.isSampleDataExtracted == null
                                ? 43
                                : this.isSampleDataExtracted.hashCode());
        result =
                (result * PRIME)
                        + (this.sampleDataSizeInMBs == null
                                ? 43
                                : this.sampleDataSizeInMBs.hashCode());
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
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
