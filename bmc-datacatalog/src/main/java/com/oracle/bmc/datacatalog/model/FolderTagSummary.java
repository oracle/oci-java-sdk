/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Summary of a folder tag.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FolderTagSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FolderTagSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
        private String folderKey;

        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
            this.__explicitlySet__.add("folderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termKey")
        private String termKey;

        public Builder termKey(String termKey) {
            this.termKey = termKey;
            this.__explicitlySet__.add("termKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termPath")
        private String termPath;

        public Builder termPath(String termPath) {
            this.termPath = termPath;
            this.__explicitlySet__.add("termPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
        private String termDescription;

        public Builder termDescription(String termDescription) {
            this.termDescription = termDescription;
            this.__explicitlySet__.add("termDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
        private String glossaryKey;

        public Builder glossaryKey(String glossaryKey) {
            this.glossaryKey = glossaryKey;
            this.__explicitlySet__.add("glossaryKey");
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

        public FolderTagSummary build() {
            FolderTagSummary __instance__ =
                    new FolderTagSummary(
                            folderKey,
                            key,
                            timeCreated,
                            name,
                            uri,
                            termKey,
                            termPath,
                            termDescription,
                            glossaryKey,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FolderTagSummary o) {
            Builder copiedBuilder =
                    folderKey(o.getFolderKey())
                            .key(o.getKey())
                            .timeCreated(o.getTimeCreated())
                            .name(o.getName())
                            .uri(o.getUri())
                            .termKey(o.getTermKey())
                            .termPath(o.getTermPath())
                            .termDescription(o.getTermDescription())
                            .glossaryKey(o.getGlossaryKey())
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
     * The unique key of the parent folder.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("folderKey")
    String folderKey;

    /**
     * Unique tag key that is immutable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The date and time the tag was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Name of the tag that matches the term name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * URI to the tag instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * Unique key of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termKey")
    String termKey;

    /**
     * Path of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termPath")
    String termPath;

    /**
     * Description of the related term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("termDescription")
    String termDescription;

    /**
     * Unique id of the parent glossary of the term.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("glossaryKey")
    String glossaryKey;

    /**
     * State of the Tag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
