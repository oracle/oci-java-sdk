/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Typeahead results
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SuggestOutput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commands")
        private java.util.List<String> commands;

        public Builder commands(java.util.List<String> commands) {
            this.commands = commands;
            this.__explicitlySet__.add("commands");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<String> fields;

        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<String> fieldValues;

        public Builder fieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("terms")
        private java.util.List<String> terms;

        public Builder terms(java.util.List<String> terms) {
            this.terms = terms;
            this.__explicitlySet__.add("terms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.List<String> options;

        public Builder options(java.util.List<String> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("examples")
        private java.util.List<String> examples;

        public Builder examples(java.util.List<String> examples) {
            this.examples = examples;
            this.__explicitlySet__.add("examples");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestOutput build() {
            SuggestOutput __instance__ =
                    new SuggestOutput(
                            position, commands, fields, fieldValues, terms, options, examples);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestOutput o) {
            Builder copiedBuilder =
                    position(o.getPosition())
                            .commands(o.getCommands())
                            .fields(o.getFields())
                            .fieldValues(o.getFieldValues())
                            .terms(o.getTerms())
                            .options(o.getOptions())
                            .examples(o.getExamples());

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
     * Character position suggestion should be placed in queryString provided as input.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    Integer position;

    /**
     * Context specific list of querylanguage commands if input is seeking command suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commands")
    java.util.List<String> commands;

    /**
     * Context specific list of querylanguage fields / columns if input is seeking field / column suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    java.util.List<String> fields;

    /**
     * Context specific list of field values if input is seeking field value suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    java.util.List<String> fieldValues;

    /**
     * Context specific list of terms / phrases if input is seeking terms / phrase suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("terms")
    java.util.List<String> terms;

    /**
     * Context specific list of querylanguage command options if input is seeking command option suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    java.util.List<String> options;

    /**
     * Context specific list of querylanguage querystring examples if input is seeking queryString example suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("examples")
    java.util.List<String> examples;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
