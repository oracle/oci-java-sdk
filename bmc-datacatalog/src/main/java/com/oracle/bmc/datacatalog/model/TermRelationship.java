/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Full term relationship definition. Business term relationship between two terms in a business glossary.
 *
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TermRelationship.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TermRelationship {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermKey")
        private String relatedTermKey;

        public Builder relatedTermKey(String relatedTermKey) {
            this.relatedTermKey = relatedTermKey;
            this.__explicitlySet__.add("relatedTermKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDisplayName")
        private String relatedTermDisplayName;

        public Builder relatedTermDisplayName(String relatedTermDisplayName) {
            this.relatedTermDisplayName = relatedTermDisplayName;
            this.__explicitlySet__.add("relatedTermDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDescription")
        private String relatedTermDescription;

        public Builder relatedTermDescription(String relatedTermDescription) {
            this.relatedTermDescription = relatedTermDescription;
            this.__explicitlySet__.add("relatedTermDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedTermPath")
        private String relatedTermPath;

        public Builder relatedTermPath(String relatedTermPath) {
            this.relatedTermPath = relatedTermPath;
            this.__explicitlySet__.add("relatedTermPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
        private String parentTermKey;

        public Builder parentTermKey(String parentTermKey) {
            this.parentTermKey = parentTermKey;
            this.__explicitlySet__.add("parentTermKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermDisplayName")
        private String parentTermDisplayName;

        public Builder parentTermDisplayName(String parentTermDisplayName) {
            this.parentTermDisplayName = parentTermDisplayName;
            this.__explicitlySet__.add("parentTermDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermDescription")
        private String parentTermDescription;

        public Builder parentTermDescription(String parentTermDescription) {
            this.parentTermDescription = parentTermDescription;
            this.__explicitlySet__.add("parentTermDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentTermPath")
        private String parentTermPath;

        public Builder parentTermPath(String parentTermPath) {
            this.parentTermPath = parentTermPath;
            this.__explicitlySet__.add("parentTermPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TermRelationship build() {
            TermRelationship __instance__ =
                    new TermRelationship(
                            key,
                            displayName,
                            description,
                            relatedTermKey,
                            relatedTermDisplayName,
                            relatedTermDescription,
                            relatedTermPath,
                            uri,
                            parentTermKey,
                            parentTermDisplayName,
                            parentTermDescription,
                            parentTermPath,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TermRelationship o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .relatedTermKey(o.getRelatedTermKey())
                            .relatedTermDisplayName(o.getRelatedTermDisplayName())
                            .relatedTermDescription(o.getRelatedTermDescription())
                            .relatedTermPath(o.getRelatedTermPath())
                            .uri(o.getUri())
                            .parentTermKey(o.getParentTermKey())
                            .parentTermDisplayName(o.getParentTermDisplayName())
                            .parentTermDescription(o.getParentTermDescription())
                            .parentTermPath(o.getParentTermPath())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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
     * Unique term relationship key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.This is the same as relationshipType for termRelationship
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of the term relationship usually defined at the time of creation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Unique id of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermKey")
    String relatedTermKey;

    /**
     * Name of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDisplayName")
    String relatedTermDisplayName;

    /**
     * Description of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermDescription")
    String relatedTermDescription;

    /**
     * Full path of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedTermPath")
    String relatedTermPath;

    /**
     * URI to the term relationship instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * This relationships parent term key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermKey")
    String parentTermKey;

    /**
     * Name of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermDisplayName")
    String parentTermDisplayName;

    /**
     * Description of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermDescription")
    String parentTermDescription;

    /**
     * Full path of the parent term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentTermPath")
    String parentTermPath;

    /**
     * The date and time the term relationship was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * State of the term relationship.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
