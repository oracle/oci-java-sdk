/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * Details of the dependent object.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DependentObjectSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DependentObjectSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
        private String createdByName;

        public Builder createdByName(String createdByName) {
            this.createdByName = createdByName;
            this.__explicitlySet__.add("createdByName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
        private String updatedBy;

        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            this.__explicitlySet__.add("updatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
        private String updatedByName;

        public Builder updatedByName(String updatedByName) {
            this.updatedByName = updatedByName;
            this.__explicitlySet__.add("updatedByName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("aggregator")
        private AggregatorSummary aggregator;

        public Builder aggregator(AggregatorSummary aggregator) {
            this.aggregator = aggregator;
            this.__explicitlySet__.add("aggregator");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
        private String identifierPath;

        public Builder identifierPath(String identifierPath) {
            this.identifierPath = identifierPath;
            this.__explicitlySet__.add("identifierPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infoFields")
        private java.util.Map<String, String> infoFields;

        public Builder infoFields(java.util.Map<String, String> infoFields) {
            this.infoFields = infoFields;
            this.__explicitlySet__.add("infoFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
        private Integer registryVersion;

        public Builder registryVersion(Integer registryVersion) {
            this.registryVersion = registryVersion;
            this.__explicitlySet__.add("registryVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countStatistics")
        private CountStatistic countStatistics;

        public Builder countStatistics(CountStatistic countStatistics) {
            this.countStatistics = countStatistics;
            this.__explicitlySet__.add("countStatistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DependentObjectSummary build() {
            DependentObjectSummary __instance__ =
                    new DependentObjectSummary(
                            createdBy,
                            createdByName,
                            updatedBy,
                            updatedByName,
                            timeCreated,
                            timeUpdated,
                            aggregatorKey,
                            aggregator,
                            identifierPath,
                            infoFields,
                            registryVersion,
                            labels,
                            isFavorite,
                            countStatistics);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DependentObjectSummary o) {
            Builder copiedBuilder =
                    createdBy(o.getCreatedBy())
                            .createdByName(o.getCreatedByName())
                            .updatedBy(o.getUpdatedBy())
                            .updatedByName(o.getUpdatedByName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .aggregatorKey(o.getAggregatorKey())
                            .aggregator(o.getAggregator())
                            .identifierPath(o.getIdentifierPath())
                            .infoFields(o.getInfoFields())
                            .registryVersion(o.getRegistryVersion())
                            .labels(o.getLabels())
                            .isFavorite(o.getIsFavorite())
                            .countStatistics(o.getCountStatistics());

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
     * The user that created the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    String createdBy;

    /**
     * The user that created the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByName")
    String createdByName;

    /**
     * The user that updated the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedBy")
    String updatedBy;

    /**
     * The user that updated the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByName")
    String updatedByName;

    /**
     * The date and time that the object was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time that the object was updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The owning object key for this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    String aggregatorKey;

    @com.fasterxml.jackson.annotation.JsonProperty("aggregator")
    AggregatorSummary aggregator;

    /**
     * The full path to identify this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifierPath")
    String identifierPath;

    /**
     * Information property fields.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infoFields")
    java.util.Map<String, String> infoFields;

    /**
     * The registry version of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
    Integer registryVersion;

    /**
     * Labels are keywords or tags that you can add to data assets, dataflows and so on. You can define your own labels and use them to categorize content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<String> labels;

    /**
     * Specifies whether this object is a favorite or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    Boolean isFavorite;

    @com.fasterxml.jackson.annotation.JsonProperty("countStatistics")
    CountStatistic countStatistics;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
