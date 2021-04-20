/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The list of potential matches returned from the suggest operation for the given input text. The size of the list will be determined
 * by the limit parameter.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestResults.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SuggestResults {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchLatencyInMs")
        private Integer searchLatencyInMs;

        public Builder searchLatencyInMs(Integer searchLatencyInMs) {
            this.searchLatencyInMs = searchLatencyInMs;
            this.__explicitlySet__.add("searchLatencyInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputText")
        private String inputText;

        public Builder inputText(String inputText) {
            this.inputText = inputText;
            this.__explicitlySet__.add("inputText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SuggestListItem> items;

        public Builder items(java.util.List<SuggestListItem> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestResults build() {
            SuggestResults __instance__ =
                    new SuggestResults(totalCount, searchLatencyInMs, inputText, items);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestResults o) {
            Builder copiedBuilder =
                    totalCount(o.getTotalCount())
                            .searchLatencyInMs(o.getSearchLatencyInMs())
                            .inputText(o.getInputText())
                            .items(o.getItems());

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
     * Total number of items returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    Integer totalCount;

    /**
     * Time taken to compute the result, in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchLatencyInMs")
    Integer searchLatencyInMs;

    /**
     * Input string for which the potential matches are computed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputText")
    String inputText;

    /**
     * List of suggestions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<SuggestListItem> items;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
