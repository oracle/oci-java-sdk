/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The statistics of data ingestion job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DataIngestionJobStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataIngestionJobStatistics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "numberOfFailedFiles",
        "numberOfIngestedFiles",
        "durationInSeconds"
    })
    public DataIngestionJobStatistics(
            Integer numberOfFailedFiles, Integer numberOfIngestedFiles, Integer durationInSeconds) {
        super();
        this.numberOfFailedFiles = numberOfFailedFiles;
        this.numberOfIngestedFiles = numberOfIngestedFiles;
        this.durationInSeconds = durationInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of files that have failed during the ingestion. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfFailedFiles")
        private Integer numberOfFailedFiles;

        /**
         * The number of files that have failed during the ingestion.
         *
         * @param numberOfFailedFiles the value to set
         * @return this builder
         */
        public Builder numberOfFailedFiles(Integer numberOfFailedFiles) {
            this.numberOfFailedFiles = numberOfFailedFiles;
            this.__explicitlySet__.add("numberOfFailedFiles");
            return this;
        }
        /** The number of files that have been successfully ingested during the ingestion. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfIngestedFiles")
        private Integer numberOfIngestedFiles;

        /**
         * The number of files that have been successfully ingested during the ingestion.
         *
         * @param numberOfIngestedFiles the value to set
         * @return this builder
         */
        public Builder numberOfIngestedFiles(Integer numberOfIngestedFiles) {
            this.numberOfIngestedFiles = numberOfIngestedFiles;
            this.__explicitlySet__.add("numberOfIngestedFiles");
            return this;
        }
        /** The duration of this ingestion job. */
        @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
        private Integer durationInSeconds;

        /**
         * The duration of this ingestion job.
         *
         * @param durationInSeconds the value to set
         * @return this builder
         */
        public Builder durationInSeconds(Integer durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            this.__explicitlySet__.add("durationInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataIngestionJobStatistics build() {
            DataIngestionJobStatistics model =
                    new DataIngestionJobStatistics(
                            this.numberOfFailedFiles,
                            this.numberOfIngestedFiles,
                            this.durationInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataIngestionJobStatistics model) {
            if (model.wasPropertyExplicitlySet("numberOfFailedFiles")) {
                this.numberOfFailedFiles(model.getNumberOfFailedFiles());
            }
            if (model.wasPropertyExplicitlySet("numberOfIngestedFiles")) {
                this.numberOfIngestedFiles(model.getNumberOfIngestedFiles());
            }
            if (model.wasPropertyExplicitlySet("durationInSeconds")) {
                this.durationInSeconds(model.getDurationInSeconds());
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

    /** The number of files that have failed during the ingestion. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfFailedFiles")
    private final Integer numberOfFailedFiles;

    /**
     * The number of files that have failed during the ingestion.
     *
     * @return the value
     */
    public Integer getNumberOfFailedFiles() {
        return numberOfFailedFiles;
    }

    /** The number of files that have been successfully ingested during the ingestion. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfIngestedFiles")
    private final Integer numberOfIngestedFiles;

    /**
     * The number of files that have been successfully ingested during the ingestion.
     *
     * @return the value
     */
    public Integer getNumberOfIngestedFiles() {
        return numberOfIngestedFiles;
    }

    /** The duration of this ingestion job. */
    @com.fasterxml.jackson.annotation.JsonProperty("durationInSeconds")
    private final Integer durationInSeconds;

    /**
     * The duration of this ingestion job.
     *
     * @return the value
     */
    public Integer getDurationInSeconds() {
        return durationInSeconds;
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
        sb.append("DataIngestionJobStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("numberOfFailedFiles=").append(String.valueOf(this.numberOfFailedFiles));
        sb.append(", numberOfIngestedFiles=").append(String.valueOf(this.numberOfIngestedFiles));
        sb.append(", durationInSeconds=").append(String.valueOf(this.durationInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataIngestionJobStatistics)) {
            return false;
        }

        DataIngestionJobStatistics other = (DataIngestionJobStatistics) o;
        return java.util.Objects.equals(this.numberOfFailedFiles, other.numberOfFailedFiles)
                && java.util.Objects.equals(this.numberOfIngestedFiles, other.numberOfIngestedFiles)
                && java.util.Objects.equals(this.durationInSeconds, other.durationInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.numberOfFailedFiles == null
                                ? 43
                                : this.numberOfFailedFiles.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfIngestedFiles == null
                                ? 43
                                : this.numberOfIngestedFiles.hashCode());
        result =
                (result * PRIME)
                        + (this.durationInSeconds == null ? 43 : this.durationInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
