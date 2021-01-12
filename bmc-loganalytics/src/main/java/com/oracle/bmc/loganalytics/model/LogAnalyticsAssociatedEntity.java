/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsAssociatedEntity
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsAssociatedEntity.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsAssociatedEntity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onHost")
        private String onHost;

        public Builder onHost(String onHost) {
            this.onHost = onHost;
            this.__explicitlySet__.add("onHost");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
        private Long associationCount;

        public Builder associationCount(Long associationCount) {
            this.associationCount = associationCount;
            this.__explicitlySet__.add("associationCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsAssociatedEntity build() {
            LogAnalyticsAssociatedEntity __instance__ =
                    new LogAnalyticsAssociatedEntity(
                            entityId,
                            entityName,
                            entityType,
                            entityTypeDisplayName,
                            onHost,
                            associationCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsAssociatedEntity o) {
            Builder copiedBuilder =
                    entityId(o.getEntityId())
                            .entityName(o.getEntityName())
                            .entityType(o.getEntityType())
                            .entityTypeDisplayName(o.getEntityTypeDisplayName())
                            .onHost(o.getOnHost())
                            .associationCount(o.getAssociationCount());

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
     * entity guid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * entity name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * entity type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * entity type display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    String entityTypeDisplayName;

    /**
     * on host
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onHost")
    String onHost;

    /**
     * associationCount
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("associationCount")
    Long associationCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
