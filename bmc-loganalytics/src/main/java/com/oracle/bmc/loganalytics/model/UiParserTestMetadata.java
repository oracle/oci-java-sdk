/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * UiParserTestMetadata
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
    builder = UiParserTestMetadata.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UiParserTestMetadata {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedTime")
        private String lastModifiedTime;

        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            this.__explicitlySet__.add("lastModifiedTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("logFileName")
        private String logFileName;

        public Builder logFileName(String logFileName) {
            this.logFileName = logFileName;
            this.__explicitlySet__.add("logFileName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private java.util.Date timeZone;

        public Builder timeZone(java.util.Date timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UiParserTestMetadata build() {
            UiParserTestMetadata __instance__ =
                    new UiParserTestMetadata(lastModifiedTime, logFileName, timeZone);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UiParserTestMetadata o) {
            Builder copiedBuilder =
                    lastModifiedTime(o.getLastModifiedTime())
                            .logFileName(o.getLogFileName())
                            .timeZone(o.getTimeZone());

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
     * The last modified time.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastModifiedTime")
    String lastModifiedTime;

    /**
     * The log file name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("logFileName")
    String logFileName;

    /**
     * The time zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    java.util.Date timeZone;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
