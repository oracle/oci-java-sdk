/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage HIGHLIGHTGROUPS command.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = HighlightGroupsCommandDescriptor.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class HighlightGroupsCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFields")
        private java.util.List<AbstractField> referencedFields;

        public Builder referencedFields(java.util.List<AbstractField> referencedFields) {
            this.referencedFields = referencedFields;
            this.__explicitlySet__.add("referencedFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("declaredFields")
        private java.util.List<AbstractField> declaredFields;

        public Builder declaredFields(java.util.List<AbstractField> declaredFields) {
            this.declaredFields = declaredFields;
            this.__explicitlySet__.add("declaredFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("color")
        private String color;

        public Builder color(String color) {
            this.color = color;
            this.__explicitlySet__.add("color");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private String priority;

        public Builder priority(String priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<String> fields;

        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keywords")
        private java.util.List<String> keywords;

        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            this.__explicitlySet__.add("keywords");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subQueries")
        private java.util.List<ParseQueryOutput> subQueries;

        public Builder subQueries(java.util.List<ParseQueryOutput> subQueries) {
            this.subQueries = subQueries;
            this.__explicitlySet__.add("subQueries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HighlightGroupsCommandDescriptor build() {
            HighlightGroupsCommandDescriptor __instance__ =
                    new HighlightGroupsCommandDescriptor(
                            displayQueryString,
                            internalQueryString,
                            category,
                            referencedFields,
                            declaredFields,
                            color,
                            priority,
                            fields,
                            keywords,
                            subQueries);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HighlightGroupsCommandDescriptor o) {
            Builder copiedBuilder =
                    displayQueryString(o.getDisplayQueryString())
                            .internalQueryString(o.getInternalQueryString())
                            .category(o.getCategory())
                            .referencedFields(o.getReferencedFields())
                            .declaredFields(o.getDeclaredFields())
                            .color(o.getColor())
                            .priority(o.getPriority())
                            .fields(o.getFields())
                            .keywords(o.getKeywords())
                            .subQueries(o.getSubQueries());

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
    public HighlightGroupsCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            String color,
            String priority,
            java.util.List<String> fields,
            java.util.List<String> keywords,
            java.util.List<ParseQueryOutput> subQueries) {
        super(displayQueryString, internalQueryString, category, referencedFields, declaredFields);
        this.color = color;
        this.priority = priority;
        this.fields = fields;
        this.keywords = keywords;
        this.subQueries = subQueries;
    }

    /**
     * User specified color to highlight matches with if found.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("color")
    String color;

    /**
     * User specified priority assigned to highlighted matches if found.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    String priority;

    /**
     * List of fields to search for terms or phrases to highlight.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<String> fields;

    /**
     * List of terms or phrases to highlight if found.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keywords")
    java.util.List<String> keywords;

    /**
     * List of subQueries specified as highlightgroups command arguments
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subQueries")
    java.util.List<ParseQueryOutput> subQueries;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
