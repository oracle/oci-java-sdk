/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsMetaSourceType
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
    builder = LogAnalyticsMetaSourceType.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsMetaSourceType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("builtInParserName")
        private String builtInParserName;

        public Builder builtInParserName(String builtInParserName) {
            this.builtInParserName = builtInParserName;
            this.__explicitlySet__.add("builtInParserName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityDisplayName")
        private String entityDisplayName;

        public Builder entityDisplayName(String entityDisplayName) {
            this.entityDisplayName = entityDisplayName;
            this.__explicitlySet__.add("entityDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximumExcludePattern")
        private Long maximumExcludePattern;

        public Builder maximumExcludePattern(Long maximumExcludePattern) {
            this.maximumExcludePattern = maximumExcludePattern;
            this.__explicitlySet__.add("maximumExcludePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximumIncludePattern")
        private Long maximumIncludePattern;

        public Builder maximumIncludePattern(Long maximumIncludePattern) {
            this.maximumIncludePattern = maximumIncludePattern;
            this.__explicitlySet__.add("maximumIncludePattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsMetaSourceType build() {
            LogAnalyticsMetaSourceType __instance__ =
                    new LogAnalyticsMetaSourceType(
                            builtInParserName,
                            description,
                            displayName,
                            entityDisplayName,
                            entityName,
                            name,
                            maximumExcludePattern,
                            maximumIncludePattern);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsMetaSourceType o) {
            Builder copiedBuilder =
                    builtInParserName(o.getBuiltInParserName())
                            .description(o.getDescription())
                            .displayName(o.getDisplayName())
                            .entityDisplayName(o.getEntityDisplayName())
                            .entityName(o.getEntityName())
                            .name(o.getName())
                            .maximumExcludePattern(o.getMaximumExcludePattern())
                            .maximumIncludePattern(o.getMaximumIncludePattern());

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
     * built in parser name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("builtInParserName")
    String builtInParserName;

    /**
     * type description
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * entity display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityDisplayName")
    String entityDisplayName;

    /**
     * entity name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * source type name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * maximum exclude pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumExcludePattern")
    Long maximumExcludePattern;

    /**
     * maximum include pattern
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumIncludePattern")
    Long maximumIncludePattern;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
