/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserFilter
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
    builder = LogAnalyticsParserFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsParserFilter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parser")
        private LogAnalyticsParser parser;

        public Builder parser(LogAnalyticsParser parser) {
            this.parser = parser;
            this.__explicitlySet__.add("parser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
        private Long isInUse;

        public Builder isInUse(Long isInUse) {
            this.isInUse = isInUse;
            this.__explicitlySet__.add("isInUse");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parserId")
        private Long parserId;

        public Builder parserId(Long parserId) {
            this.parserId = parserId;
            this.__explicitlySet__.add("parserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserFilter build() {
            LogAnalyticsParserFilter __instance__ =
                    new LogAnalyticsParserFilter(
                            id, parser, agentVersion, isInUse, operatingSystem, parserId, version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserFilter o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .parser(o.getParser())
                            .agentVersion(o.getAgentVersion())
                            .isInUse(o.getIsInUse())
                            .operatingSystem(o.getOperatingSystem())
                            .parserId(o.getParserId())
                            .version(o.getVersion());

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
     * The parser filter unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    @com.fasterxml.jackson.annotation.JsonProperty("parser")
    LogAnalyticsParser parser;

    /**
     * The agent version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    String agentVersion;

    /**
     * A flag idicating whether or not hte filter is currently being used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
    Long isInUse;

    /**
     * The operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    String operatingSystem;

    /**
     * The parser unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserId")
    Long parserId;

    /**
     * The version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
