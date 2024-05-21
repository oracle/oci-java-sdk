/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details about the job which performs an export.
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
    builder = AsynchronousExportGlossaryResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AsynchronousExportGlossaryResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "jobDefinitionName",
        "jobDefinitionKey",
        "jobKey",
        "jobExecutionKey",
        "sourceKey"
    })
    public AsynchronousExportGlossaryResult(
            String jobDefinitionName,
            String jobDefinitionKey,
            String jobKey,
            String jobExecutionKey,
            String sourceKey) {
        super();
        this.jobDefinitionName = jobDefinitionName;
        this.jobDefinitionKey = jobDefinitionKey;
        this.jobKey = jobKey;
        this.jobExecutionKey = jobExecutionKey;
        this.sourceKey = sourceKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display name of the export job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionName")
        private String jobDefinitionName;

        /**
         * Display name of the export job.
         * @param jobDefinitionName the value to set
         * @return this builder
         **/
        public Builder jobDefinitionName(String jobDefinitionName) {
            this.jobDefinitionName = jobDefinitionName;
            this.__explicitlySet__.add("jobDefinitionName");
            return this;
        }
        /**
         * Unique key of the export job definition.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
        private String jobDefinitionKey;

        /**
         * Unique key of the export job definition.
         * @param jobDefinitionKey the value to set
         * @return this builder
         **/
        public Builder jobDefinitionKey(String jobDefinitionKey) {
            this.jobDefinitionKey = jobDefinitionKey;
            this.__explicitlySet__.add("jobDefinitionKey");
            return this;
        }
        /**
         * Unique key of the export job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
        private String jobKey;

        /**
         * Unique key of the export job.
         * @param jobKey the value to set
         * @return this builder
         **/
        public Builder jobKey(String jobKey) {
            this.jobKey = jobKey;
            this.__explicitlySet__.add("jobKey");
            return this;
        }
        /**
         * Unique key of the job execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
        private String jobExecutionKey;

        /**
         * Unique key of the job execution.
         * @param jobExecutionKey the value to set
         * @return this builder
         **/
        public Builder jobExecutionKey(String jobExecutionKey) {
            this.jobExecutionKey = jobExecutionKey;
            this.__explicitlySet__.add("jobExecutionKey");
            return this;
        }
        /**
         * Unique key of the object being exported.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
        private String sourceKey;

        /**
         * Unique key of the object being exported.
         * @param sourceKey the value to set
         * @return this builder
         **/
        public Builder sourceKey(String sourceKey) {
            this.sourceKey = sourceKey;
            this.__explicitlySet__.add("sourceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AsynchronousExportGlossaryResult build() {
            AsynchronousExportGlossaryResult model =
                    new AsynchronousExportGlossaryResult(
                            this.jobDefinitionName,
                            this.jobDefinitionKey,
                            this.jobKey,
                            this.jobExecutionKey,
                            this.sourceKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AsynchronousExportGlossaryResult model) {
            if (model.wasPropertyExplicitlySet("jobDefinitionName")) {
                this.jobDefinitionName(model.getJobDefinitionName());
            }
            if (model.wasPropertyExplicitlySet("jobDefinitionKey")) {
                this.jobDefinitionKey(model.getJobDefinitionKey());
            }
            if (model.wasPropertyExplicitlySet("jobKey")) {
                this.jobKey(model.getJobKey());
            }
            if (model.wasPropertyExplicitlySet("jobExecutionKey")) {
                this.jobExecutionKey(model.getJobExecutionKey());
            }
            if (model.wasPropertyExplicitlySet("sourceKey")) {
                this.sourceKey(model.getSourceKey());
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
     * Display name of the export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionName")
    private final String jobDefinitionName;

    /**
     * Display name of the export job.
     * @return the value
     **/
    public String getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * Unique key of the export job definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobDefinitionKey")
    private final String jobDefinitionKey;

    /**
     * Unique key of the export job definition.
     * @return the value
     **/
    public String getJobDefinitionKey() {
        return jobDefinitionKey;
    }

    /**
     * Unique key of the export job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobKey")
    private final String jobKey;

    /**
     * Unique key of the export job.
     * @return the value
     **/
    public String getJobKey() {
        return jobKey;
    }

    /**
     * Unique key of the job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jobExecutionKey")
    private final String jobExecutionKey;

    /**
     * Unique key of the job execution.
     * @return the value
     **/
    public String getJobExecutionKey() {
        return jobExecutionKey;
    }

    /**
     * Unique key of the object being exported.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceKey")
    private final String sourceKey;

    /**
     * Unique key of the object being exported.
     * @return the value
     **/
    public String getSourceKey() {
        return sourceKey;
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
        sb.append("AsynchronousExportGlossaryResult(");
        sb.append("super=").append(super.toString());
        sb.append("jobDefinitionName=").append(String.valueOf(this.jobDefinitionName));
        sb.append(", jobDefinitionKey=").append(String.valueOf(this.jobDefinitionKey));
        sb.append(", jobKey=").append(String.valueOf(this.jobKey));
        sb.append(", jobExecutionKey=").append(String.valueOf(this.jobExecutionKey));
        sb.append(", sourceKey=").append(String.valueOf(this.sourceKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AsynchronousExportGlossaryResult)) {
            return false;
        }

        AsynchronousExportGlossaryResult other = (AsynchronousExportGlossaryResult) o;
        return java.util.Objects.equals(this.jobDefinitionName, other.jobDefinitionName)
                && java.util.Objects.equals(this.jobDefinitionKey, other.jobDefinitionKey)
                && java.util.Objects.equals(this.jobKey, other.jobKey)
                && java.util.Objects.equals(this.jobExecutionKey, other.jobExecutionKey)
                && java.util.Objects.equals(this.sourceKey, other.sourceKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.jobDefinitionName == null ? 43 : this.jobDefinitionName.hashCode());
        result =
                (result * PRIME)
                        + (this.jobDefinitionKey == null ? 43 : this.jobDefinitionKey.hashCode());
        result = (result * PRIME) + (this.jobKey == null ? 43 : this.jobKey.hashCode());
        result =
                (result * PRIME)
                        + (this.jobExecutionKey == null ? 43 : this.jobExecutionKey.hashCode());
        result = (result * PRIME) + (this.sourceKey == null ? 43 : this.sourceKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
