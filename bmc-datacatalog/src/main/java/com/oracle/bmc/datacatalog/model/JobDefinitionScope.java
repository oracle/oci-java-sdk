/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = JobDefinitionScope.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class JobDefinitionScope {
    @Deprecated
    @java.beans.ConstructorProperties({
        "folderName",
        "entityName",
        "folderNameFilter",
        "entityNameFilter",
        "isSampleDataExtracted",
        "sampleDataSizeInMBs"
    })
    public JobDefinitionScope(
            String folderName,
            String entityName,
            String folderNameFilter,
            String entityNameFilter,
            Boolean isSampleDataExtracted,
            Integer sampleDataSizeInMBs) {
        super();
        this.folderName = folderName;
        this.entityName = entityName;
        this.folderNameFilter = folderNameFilter;
        this.entityNameFilter = entityNameFilter;
        this.isSampleDataExtracted = isSampleDataExtracted;
        this.sampleDataSizeInMBs = sampleDataSizeInMBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Name of the folder or schema for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderName")
    private final String folderName;

    public String getFolderName() {
        return folderName;
    }

    /**
     * Name of the entity for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    public String getEntityName() {
        return entityName;
    }

    /**
     * Filter rules with regular expression to specify folder names for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderNameFilter")
    private final String folderNameFilter;

    public String getFolderNameFilter() {
        return folderNameFilter;
    }

    /**
     * Filter rules with regular expression to specify entity names for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityNameFilter")
    private final String entityNameFilter;

    public String getEntityNameFilter() {
        return entityNameFilter;
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
     * Specify the sample data size in MB, specified as number of rows, for this metadata harvest.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleDataSizeInMBs")
    private final Integer sampleDataSizeInMBs;

    public Integer getSampleDataSizeInMBs() {
        return sampleDataSizeInMBs;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("JobDefinitionScope(");
        sb.append("folderName=").append(String.valueOf(this.folderName));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", folderNameFilter=").append(String.valueOf(this.folderNameFilter));
        sb.append(", entityNameFilter=").append(String.valueOf(this.entityNameFilter));
        sb.append(", isSampleDataExtracted=").append(String.valueOf(this.isSampleDataExtracted));
        sb.append(", sampleDataSizeInMBs=").append(String.valueOf(this.sampleDataSizeInMBs));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobDefinitionScope)) {
            return false;
        }

        JobDefinitionScope other = (JobDefinitionScope) o;
        return java.util.Objects.equals(this.folderName, other.folderName)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.folderNameFilter, other.folderNameFilter)
                && java.util.Objects.equals(this.entityNameFilter, other.entityNameFilter)
                && java.util.Objects.equals(this.isSampleDataExtracted, other.isSampleDataExtracted)
                && java.util.Objects.equals(this.sampleDataSizeInMBs, other.sampleDataSizeInMBs)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.folderName == null ? 43 : this.folderName.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.folderNameFilter == null ? 43 : this.folderNameFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.entityNameFilter == null ? 43 : this.entityNameFilter.hashCode());
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
