/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Representation of a job definition Resource. Job definitions define the harvest scope and
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateJobDefinitionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateJobDefinitionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "jobType",
        "isIncremental",
        "dataAssetKey",
        "connectionKey",
        "isSampleDataExtracted",
        "sampleDataSizeInMBs",
        "properties"
    })
    public CreateJobDefinitionDetails(
            String displayName,
            String description,
            JobType jobType,
            Boolean isIncremental,
            String dataAssetKey,
            String connectionKey,
            Boolean isSampleDataExtracted,
            Integer sampleDataSizeInMBs,
            java.util.Map<String, java.util.Map<String, String>> properties) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.jobType = jobType;
        this.isIncremental = isIncremental;
        this.dataAssetKey = dataAssetKey;
        this.connectionKey = connectionKey;
        this.isSampleDataExtracted = isSampleDataExtracted;
        this.sampleDataSizeInMBs = sampleDataSizeInMBs;
        this.properties = properties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** The key of the connection resource to be used for the job. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
        private String connectionKey;

        /**
         * The key of the connection resource to be used for the job.
         *
         * @param connectionKey the value to set
         * @return this builder
         */
        public Builder connectionKey(String connectionKey) {
            this.connectionKey = connectionKey;
            this.__explicitlySet__.add("connectionKey");
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

        public CreateJobDefinitionDetails build() {
            CreateJobDefinitionDetails model =
                    new CreateJobDefinitionDetails(
                            this.displayName,
                            this.description,
                            this.jobType,
                            this.isIncremental,
                            this.dataAssetKey,
                            this.connectionKey,
                            this.isSampleDataExtracted,
                            this.sampleDataSizeInMBs,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateJobDefinitionDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
            if (model.wasPropertyExplicitlySet("connectionKey")) {
                this.connectionKey(model.getConnectionKey());
            }
            if (model.wasPropertyExplicitlySet("isSampleDataExtracted")) {
                this.isSampleDataExtracted(model.getIsSampleDataExtracted());
            }
            if (model.wasPropertyExplicitlySet("sampleDataSizeInMBs")) {
                this.sampleDataSizeInMBs(model.getSampleDataSizeInMBs());
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

    /** The key of the connection resource to be used for the job. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionKey")
    private final String connectionKey;

    /**
     * The key of the connection resource to be used for the job.
     *
     * @return the value
     */
    public String getConnectionKey() {
        return connectionKey;
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
        sb.append("CreateJobDefinitionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", jobType=").append(String.valueOf(this.jobType));
        sb.append(", isIncremental=").append(String.valueOf(this.isIncremental));
        sb.append(", dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", connectionKey=").append(String.valueOf(this.connectionKey));
        sb.append(", isSampleDataExtracted=").append(String.valueOf(this.isSampleDataExtracted));
        sb.append(", sampleDataSizeInMBs=").append(String.valueOf(this.sampleDataSizeInMBs));
        sb.append(", properties=").append(String.valueOf(this.properties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateJobDefinitionDetails)) {
            return false;
        }

        CreateJobDefinitionDetails other = (CreateJobDefinitionDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.jobType, other.jobType)
                && java.util.Objects.equals(this.isIncremental, other.isIncremental)
                && java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.connectionKey, other.connectionKey)
                && java.util.Objects.equals(this.isSampleDataExtracted, other.isSampleDataExtracted)
                && java.util.Objects.equals(this.sampleDataSizeInMBs, other.sampleDataSizeInMBs)
                && java.util.Objects.equals(this.properties, other.properties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.jobType == null ? 43 : this.jobType.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncremental == null ? 43 : this.isIncremental.hashCode());
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.connectionKey == null ? 43 : this.connectionKey.hashCode());
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
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
