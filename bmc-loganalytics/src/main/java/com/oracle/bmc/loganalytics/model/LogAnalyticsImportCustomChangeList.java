/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsImportCustomChangeList
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
    builder = LogAnalyticsImportCustomChangeList.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsImportCustomChangeList {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("createdParserNames")
        private java.util.List<String> createdParserNames;

        public Builder createdParserNames(java.util.List<String> createdParserNames) {
            this.createdParserNames = createdParserNames;
            this.__explicitlySet__.add("createdParserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedParserNames")
        private java.util.List<String> updatedParserNames;

        public Builder updatedParserNames(java.util.List<String> updatedParserNames) {
            this.updatedParserNames = updatedParserNames;
            this.__explicitlySet__.add("updatedParserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdSourceNames")
        private java.util.List<String> createdSourceNames;

        public Builder createdSourceNames(java.util.List<String> createdSourceNames) {
            this.createdSourceNames = createdSourceNames;
            this.__explicitlySet__.add("createdSourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedSourceNames")
        private java.util.List<String> updatedSourceNames;

        public Builder updatedSourceNames(java.util.List<String> updatedSourceNames) {
            this.updatedSourceNames = updatedSourceNames;
            this.__explicitlySet__.add("updatedSourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("createdFieldDisplayNames")
        private java.util.List<String> createdFieldDisplayNames;

        public Builder createdFieldDisplayNames(java.util.List<String> createdFieldDisplayNames) {
            this.createdFieldDisplayNames = createdFieldDisplayNames;
            this.__explicitlySet__.add("createdFieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updatedFieldDisplayNames")
        private java.util.List<String> updatedFieldDisplayNames;

        public Builder updatedFieldDisplayNames(java.util.List<String> updatedFieldDisplayNames) {
            this.updatedFieldDisplayNames = updatedFieldDisplayNames;
            this.__explicitlySet__.add("updatedFieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictParserNames")
        private java.util.List<String> conflictParserNames;

        public Builder conflictParserNames(java.util.List<String> conflictParserNames) {
            this.conflictParserNames = conflictParserNames;
            this.__explicitlySet__.add("conflictParserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictSourceNames")
        private java.util.List<String> conflictSourceNames;

        public Builder conflictSourceNames(java.util.List<String> conflictSourceNames) {
            this.conflictSourceNames = conflictSourceNames;
            this.__explicitlySet__.add("conflictSourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("conflictFieldDisplayNames")
        private java.util.List<String> conflictFieldDisplayNames;

        public Builder conflictFieldDisplayNames(java.util.List<String> conflictFieldDisplayNames) {
            this.conflictFieldDisplayNames = conflictFieldDisplayNames;
            this.__explicitlySet__.add("conflictFieldDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsImportCustomChangeList build() {
            LogAnalyticsImportCustomChangeList __instance__ =
                    new LogAnalyticsImportCustomChangeList(
                            createdParserNames,
                            updatedParserNames,
                            createdSourceNames,
                            updatedSourceNames,
                            createdFieldDisplayNames,
                            updatedFieldDisplayNames,
                            conflictParserNames,
                            conflictSourceNames,
                            conflictFieldDisplayNames);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsImportCustomChangeList o) {
            Builder copiedBuilder =
                    createdParserNames(o.getCreatedParserNames())
                            .updatedParserNames(o.getUpdatedParserNames())
                            .createdSourceNames(o.getCreatedSourceNames())
                            .updatedSourceNames(o.getUpdatedSourceNames())
                            .createdFieldDisplayNames(o.getCreatedFieldDisplayNames())
                            .updatedFieldDisplayNames(o.getUpdatedFieldDisplayNames())
                            .conflictParserNames(o.getConflictParserNames())
                            .conflictSourceNames(o.getConflictSourceNames())
                            .conflictFieldDisplayNames(o.getConflictFieldDisplayNames());

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
     * createdParserNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdParserNames")
    java.util.List<String> createdParserNames;

    /**
     * updatedParserNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedParserNames")
    java.util.List<String> updatedParserNames;

    /**
     * createdSourceNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdSourceNames")
    java.util.List<String> createdSourceNames;

    /**
     * updatedSourceNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedSourceNames")
    java.util.List<String> updatedSourceNames;

    /**
     * createdFieldDisplayNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdFieldDisplayNames")
    java.util.List<String> createdFieldDisplayNames;

    /**
     * updatedFieldDisplayNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updatedFieldDisplayNames")
    java.util.List<String> updatedFieldDisplayNames;

    /**
     * conflictParserNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictParserNames")
    java.util.List<String> conflictParserNames;

    /**
     * conflictSourceNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictSourceNames")
    java.util.List<String> conflictSourceNames;

    /**
     * conflictFieldDisplayNames
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("conflictFieldDisplayNames")
    java.util.List<String> conflictFieldDisplayNames;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
