/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcesearch.model;

/**
 * A request containing arbitrary text that must be present in the resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.4")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FreeTextSearchDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FreeTextSearchDetails extends SearchDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchingContextType")
        private MatchingContextType matchingContextType;

        public Builder matchingContextType(MatchingContextType matchingContextType) {
            this.matchingContextType = matchingContextType;
            this.__explicitlySet__.add("matchingContextType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("text")
        private String text;

        public Builder text(String text) {
            this.text = text;
            this.__explicitlySet__.add("text");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FreeTextSearchDetails build() {
            FreeTextSearchDetails __instance__ =
                    new FreeTextSearchDetails(matchingContextType, text);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FreeTextSearchDetails o) {
            Builder copiedBuilder =
                    matchingContextType(o.getMatchingContextType()).text(o.getText());

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

    @Deprecated
    public FreeTextSearchDetails(MatchingContextType matchingContextType, String text) {
        super(matchingContextType);
        this.text = text;
    }

    /**
     * The text to search for.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    String text;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
