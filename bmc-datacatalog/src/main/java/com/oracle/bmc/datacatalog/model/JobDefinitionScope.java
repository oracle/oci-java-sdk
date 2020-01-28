/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Defines the rules or criteria based on which the scope for job definition is circumscribed.
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
    builder = JobDefinitionScope.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class JobDefinitionScope {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("folderName")
        private String folderName;

        public Builder folderName(String folderName) {
            this.folderName = folderName;
            this.__explicitlySet__.add("folderName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("folderNameFilter")
        private String folderNameFilter;

        public Builder folderNameFilter(String folderNameFilter) {
            this.folderNameFilter = folderNameFilter;
            this.__explicitlySet__.add("folderNameFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityNameFilter")
        private String entityNameFilter;

        public Builder entityNameFilter(String entityNameFilter) {
            this.entityNameFilter = entityNameFilter;
            this.__explicitlySet__.add("entityNameFilter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataExtracted")
        private Boolean isSampleDataExtracted;

        public Builder isSampleDataExtracted(Boolean isSampleDataExtracted) {
            this.isSampleDataExtracted = isSampleDataExtracted;
            this.__explicitlySet__.add("isSampleDataExtracted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleDataSizeInMBs")
        private Integer sampleDataSizeInMBs;

        public Builder sampleDataSizeInMBs(Integer sampleDataSizeInMBs) {
            this.sampleDataSizeInMBs = sampleDataSizeInMBs;
            this.__explicitlySet__.add("sampleDataSizeInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobDefinitionScope build() {
            JobDefinitionScope __instance__ =
                    new JobDefinitionScope(
                            folderName,
                            entityName,
                            folderNameFilter,
                            entityNameFilter,
                            isSampleDataExtracted,
                            sampleDataSizeInMBs);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobDefinitionScope o) {
            Builder copiedBuilder =
                    folderName(o.getFolderName())
                            .entityName(o.getEntityName())
                            .folderNameFilter(o.getFolderNameFilter())
                            .entityNameFilter(o.getEntityNameFilter())
                            .isSampleDataExtracted(o.getIsSampleDataExtracted())
                            .sampleDataSizeInMBs(o.getSampleDataSizeInMBs());

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
     * Name of the folder or schema for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderName")
    String folderName;

    /**
     * Name of the entity for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * Filter rules with regular expression to specify folder names for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderNameFilter")
    String folderNameFilter;

    /**
     * Filter rules with regular expression to specify entity names for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityNameFilter")
    String entityNameFilter;

    /**
     * Specify if sample data to be extracted as part of this harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataExtracted")
    Boolean isSampleDataExtracted;

    /**
     * Specify the sample data size in MB, specified as number of rows, for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleDataSizeInMBs")
    Integer sampleDataSizeInMBs;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
