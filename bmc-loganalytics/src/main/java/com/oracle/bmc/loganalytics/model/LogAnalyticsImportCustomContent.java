/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsImportCustomContent
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
    builder = LogAnalyticsImportCustomContent.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsImportCustomContent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parserNames")
        private java.util.List<String> parserNames;

        public Builder parserNames(java.util.List<String> parserNames) {
            this.parserNames = parserNames;
            this.__explicitlySet__.add("parserNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceNames")
        private java.util.List<String> sourceNames;

        public Builder sourceNames(java.util.List<String> sourceNames) {
            this.sourceNames = sourceNames;
            this.__explicitlySet__.add("sourceNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
        private java.util.List<String> fieldNames;

        public Builder fieldNames(java.util.List<String> fieldNames) {
            this.fieldNames = fieldNames;
            this.__explicitlySet__.add("fieldNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("changeList")
        private LogAnalyticsImportCustomChangeList changeList;

        public Builder changeList(LogAnalyticsImportCustomChangeList changeList) {
            this.changeList = changeList;
            this.__explicitlySet__.add("changeList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentName")
        private String contentName;

        public Builder contentName(String contentName) {
            this.contentName = contentName;
            this.__explicitlySet__.add("contentName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsImportCustomContent build() {
            LogAnalyticsImportCustomContent __instance__ =
                    new LogAnalyticsImportCustomContent(
                            parserNames, sourceNames, fieldNames, changeList, contentName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsImportCustomContent o) {
            Builder copiedBuilder =
                    parserNames(o.getParserNames())
                            .sourceNames(o.getSourceNames())
                            .fieldNames(o.getFieldNames())
                            .changeList(o.getChangeList())
                            .contentName(o.getContentName());

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
     * The parser names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserNames")
    java.util.List<String> parserNames;

    /**
     * The source names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceNames")
    java.util.List<String> sourceNames;

    /**
     * The field names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldNames")
    java.util.List<String> fieldNames;

    @com.fasterxml.jackson.annotation.JsonProperty("changeList")
    LogAnalyticsImportCustomChangeList changeList;

    /**
     * The content name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentName")
    String contentName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
