/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define meta data for a cluster.
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ClusterMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ClusterMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
        private String createdByUserId;

        public Builder createdByUserId(String createdByUserId) {
            this.createdByUserId = createdByUserId;
            this.__explicitlySet__.add("createdByUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdByWorkRequestId")
        private String createdByWorkRequestId;

        public Builder createdByWorkRequestId(String createdByWorkRequestId) {
            this.createdByWorkRequestId = createdByWorkRequestId;
            this.__explicitlySet__.add("createdByWorkRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDeleted")
        private java.util.Date timeDeleted;

        public Builder timeDeleted(java.util.Date timeDeleted) {
            this.timeDeleted = timeDeleted;
            this.__explicitlySet__.add("timeDeleted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deletedByUserId")
        private String deletedByUserId;

        public Builder deletedByUserId(String deletedByUserId) {
            this.deletedByUserId = deletedByUserId;
            this.__explicitlySet__.add("deletedByUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deletedByWorkRequestId")
        private String deletedByWorkRequestId;

        public Builder deletedByWorkRequestId(String deletedByWorkRequestId) {
            this.deletedByWorkRequestId = deletedByWorkRequestId;
            this.__explicitlySet__.add("deletedByWorkRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
        private String updatedByUserId;

        public Builder updatedByUserId(String updatedByUserId) {
            this.updatedByUserId = updatedByUserId;
            this.__explicitlySet__.add("updatedByUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedByWorkRequestId")
        private String updatedByWorkRequestId;

        public Builder updatedByWorkRequestId(String updatedByWorkRequestId) {
            this.updatedByWorkRequestId = updatedByWorkRequestId;
            this.__explicitlySet__.add("updatedByWorkRequestId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterMetadata build() {
            ClusterMetadata __instance__ =
                    new ClusterMetadata(
                            timeCreated,
                            createdByUserId,
                            createdByWorkRequestId,
                            timeDeleted,
                            deletedByUserId,
                            deletedByWorkRequestId,
                            timeUpdated,
                            updatedByUserId,
                            updatedByWorkRequestId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterMetadata o) {
            Builder copiedBuilder =
                    timeCreated(o.getTimeCreated())
                            .createdByUserId(o.getCreatedByUserId())
                            .createdByWorkRequestId(o.getCreatedByWorkRequestId())
                            .timeDeleted(o.getTimeDeleted())
                            .deletedByUserId(o.getDeletedByUserId())
                            .deletedByWorkRequestId(o.getDeletedByWorkRequestId())
                            .timeUpdated(o.getTimeUpdated())
                            .updatedByUserId(o.getUpdatedByUserId())
                            .updatedByWorkRequestId(o.getUpdatedByWorkRequestId());

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
     * The time the cluster was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The user who created the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByUserId")
    String createdByUserId;

    /**
     * The OCID of the work request which created the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdByWorkRequestId")
    String createdByWorkRequestId;

    /**
     * The time the cluster was deleted.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDeleted")
    java.util.Date timeDeleted;

    /**
     * The user who deleted the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedByUserId")
    String deletedByUserId;

    /**
     * The OCID of the work request which deleted the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deletedByWorkRequestId")
    String deletedByWorkRequestId;

    /**
     * The time the cluster was updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The user who updated the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByUserId")
    String updatedByUserId;

    /**
     * The OCID of the work request which updated the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedByWorkRequestId")
    String updatedByWorkRequestId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
