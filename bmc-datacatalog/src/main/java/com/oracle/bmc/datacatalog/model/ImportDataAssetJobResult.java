/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Information about a data asset import operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ImportDataAssetJobResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ImportDataAssetJobResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
        private String importJobDefinitionKey;

        public Builder importJobDefinitionKey(String importJobDefinitionKey) {
            this.importJobDefinitionKey = importJobDefinitionKey;
            this.__explicitlySet__.add("importJobDefinitionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
        private String importJobKey;

        public Builder importJobKey(String importJobKey) {
            this.importJobKey = importJobKey;
            this.__explicitlySet__.add("importJobKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionKey")
        private String importJobExecutionKey;

        public Builder importJobExecutionKey(String importJobExecutionKey) {
            this.importJobExecutionKey = importJobExecutionKey;
            this.__explicitlySet__.add("importJobExecutionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionStatus")
        private JobExecutionState importJobExecutionStatus;

        public Builder importJobExecutionStatus(JobExecutionState importJobExecutionStatus) {
            this.importJobExecutionStatus = importJobExecutionStatus;
            this.__explicitlySet__.add("importJobExecutionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ImportDataAssetJobResult build() {
            ImportDataAssetJobResult __instance__ =
                    new ImportDataAssetJobResult(
                            dataAssetKey,
                            importJobDefinitionKey,
                            importJobKey,
                            importJobExecutionKey,
                            importJobExecutionStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ImportDataAssetJobResult o) {
            Builder copiedBuilder =
                    dataAssetKey(o.getDataAssetKey())
                            .importJobDefinitionKey(o.getImportJobDefinitionKey())
                            .importJobKey(o.getImportJobKey())
                            .importJobExecutionKey(o.getImportJobExecutionKey())
                            .importJobExecutionStatus(o.getImportJobExecutionStatus());

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

    /**
     * The unique key of the data asset on which import is triggered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    String dataAssetKey;

    /**
     * The unique key of the job definition resource that is used for the import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobDefinitionKey")
    String importJobDefinitionKey;

    /**
     * The unique key of the job policy for the import.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobKey")
    String importJobKey;

    /**
     * The unique key of the parent job execution for which the log resource is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionKey")
    String importJobExecutionKey;

    /**
     * The status of the import job execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importJobExecutionStatus")
    JobExecutionState importJobExecutionStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
