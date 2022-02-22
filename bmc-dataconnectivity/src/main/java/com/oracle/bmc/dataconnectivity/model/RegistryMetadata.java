/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Information about the object and its parent.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RegistryMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RegistryMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
        private String aggregatorKey;

        public Builder aggregatorKey(String aggregatorKey) {
            this.aggregatorKey = aggregatorKey;
            this.__explicitlySet__.add("aggregatorKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("labels")
        private java.util.List<String> labels;

        public Builder labels(java.util.List<String> labels) {
            this.labels = labels;
            this.__explicitlySet__.add("labels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
        private Integer registryVersion;

        public Builder registryVersion(Integer registryVersion) {
            this.registryVersion = registryVersion;
            this.__explicitlySet__.add("registryVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
        private Boolean isFavorite;

        public Builder isFavorite(Boolean isFavorite) {
            this.isFavorite = isFavorite;
            this.__explicitlySet__.add("isFavorite");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
        private String createdByUserId;

        public Builder createdByUserId(String createdByUserId) {
            this.createdByUserId = createdByUserId;
            this.__explicitlySet__.add("createdByUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdByUserName")
        private String createdByUserName;

        public Builder createdByUserName(String createdByUserName) {
            this.createdByUserName = createdByUserName;
            this.__explicitlySet__.add("createdByUserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
        private String updatedByUserId;

        public Builder updatedByUserId(String updatedByUserId) {
            this.updatedByUserId = updatedByUserId;
            this.__explicitlySet__.add("updatedByUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserName")
        private String updatedByUserName;

        public Builder updatedByUserName(String updatedByUserName) {
            this.updatedByUserName = updatedByUserName;
            this.__explicitlySet__.add("updatedByUserName");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RegistryMetadata build() {
            RegistryMetadata __instance__ =
                    new RegistryMetadata(
                            aggregatorKey,
                            labels,
                            registryVersion,
                            key,
                            isFavorite,
                            createdByUserId,
                            createdByUserName,
                            updatedByUserId,
                            updatedByUserName,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RegistryMetadata o) {
            Builder copiedBuilder =
                    aggregatorKey(o.getAggregatorKey())
                            .labels(o.getLabels())
                            .registryVersion(o.getRegistryVersion())
                            .key(o.getKey())
                            .isFavorite(o.getIsFavorite())
                            .createdByUserId(o.getCreatedByUserId())
                            .createdByUserName(o.getCreatedByUserName())
                            .updatedByUserId(o.getUpdatedByUserId())
                            .updatedByUserName(o.getUpdatedByUserName())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The owning object's key for this object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregatorKey")
    String aggregatorKey;

    /**
     * Labels are keywords or labels that you can add to data assets, dataflows etc. You can define your own labels and use them to categorize content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("labels")
    java.util.List<String> labels;

    /**
     * The registry version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("registryVersion")
    Integer registryVersion;

    /**
     * The identifying key for the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * Specifies whether this object is a favorite or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFavorite")
    Boolean isFavorite;

    /**
     * The id of the user who created the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
    String createdByUserId;

    /**
     * The name of the user who created the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByUserName")
    String createdByUserName;

    /**
     * The id of the user who updated the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
    String updatedByUserId;

    /**
     * The name of the user who updated the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserName")
    String updatedByUserName;

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

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
