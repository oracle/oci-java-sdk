/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * log header values
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
    builder = ExtractLogHeaderResults.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExtractLogHeaderResults {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("jsonPaths")
        private java.util.List<ExtractLogHeaderDetails> jsonPaths;

        public Builder jsonPaths(java.util.List<ExtractLogHeaderDetails> jsonPaths) {
            this.jsonPaths = jsonPaths;
            this.__explicitlySet__.add("jsonPaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("xmlPaths")
        private java.util.List<String> xmlPaths;

        public Builder xmlPaths(java.util.List<String> xmlPaths) {
            this.xmlPaths = xmlPaths;
            this.__explicitlySet__.add("xmlPaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headerPaths")
        private java.util.List<String> headerPaths;

        public Builder headerPaths(java.util.List<String> headerPaths) {
            this.headerPaths = headerPaths;
            this.__explicitlySet__.add("headerPaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtractLogHeaderResults build() {
            ExtractLogHeaderResults __instance__ =
                    new ExtractLogHeaderResults(jsonPaths, xmlPaths, headerPaths);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtractLogHeaderResults o) {
            Builder copiedBuilder =
                    jsonPaths(o.getJsonPaths())
                            .xmlPaths(o.getXmlPaths())
                            .headerPaths(o.getHeaderPaths());

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
     * The log header json paths.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonPaths")
    java.util.List<ExtractLogHeaderDetails> jsonPaths;

    /**
     * The log field or log header values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("xmlPaths")
    java.util.List<String> xmlPaths;

    /**
     * The log header values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerPaths")
    java.util.List<String> headerPaths;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
