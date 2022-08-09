/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SuggestOutput extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "position",
        "commands",
        "fields",
        "fieldValues",
        "terms",
        "options",
        "examples"
    })
    public SuggestOutput(
            Integer position,
            java.util.List<String> commands,
            java.util.List<String> fields,
            java.util.List<String> fieldValues,
            java.util.List<String> terms,
            java.util.List<String> options,
            java.util.List<String> examples) {
        super();
        this.position = position;
        this.commands = commands;
        this.fields = fields;
        this.fieldValues = fieldValues;
        this.terms = terms;
        this.options = options;
        this.examples = examples;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Character position suggestion should be placed in queryString provided as input.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private Integer position;

        /**
         * Character position suggestion should be placed in queryString provided as input.
         *
         * @param position the value to set
         * @return this builder
         **/
        public Builder position(Integer position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }
        /**
         * Context specific list of querylanguage commands if input is seeking command suggestions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commands")
        private java.util.List<String> commands;

        /**
         * Context specific list of querylanguage commands if input is seeking command suggestions.
         *
         * @param commands the value to set
         * @return this builder
         **/
        public Builder commands(java.util.List<String> commands) {
            this.commands = commands;
            this.__explicitlySet__.add("commands");
            return this;
        }
        /**
         * Context specific list of querylanguage fields / columns if input is seeking field / column suggestions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<String> fields;

        /**
         * Context specific list of querylanguage fields / columns if input is seeking field / column suggestions.
         *
         * @param fields the value to set
         * @return this builder
         **/
        public Builder fields(java.util.List<String> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }
        /**
         * Context specific list of field values if input is seeking field value suggestions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
        private java.util.List<String> fieldValues;

        /**
         * Context specific list of field values if input is seeking field value suggestions.
         *
         * @param fieldValues the value to set
         * @return this builder
         **/
        public Builder fieldValues(java.util.List<String> fieldValues) {
            this.fieldValues = fieldValues;
            this.__explicitlySet__.add("fieldValues");
            return this;
        }
        /**
         * Context specific list of terms / phrases if input is seeking terms / phrase suggestions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("terms")
        private java.util.List<String> terms;

        /**
         * Context specific list of terms / phrases if input is seeking terms / phrase suggestions.
         *
         * @param terms the value to set
         * @return this builder
         **/
        public Builder terms(java.util.List<String> terms) {
            this.terms = terms;
            this.__explicitlySet__.add("terms");
            return this;
        }
        /**
         * Context specific list of querylanguage command options if input is seeking command option suggestions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private java.util.List<String> options;

        /**
         * Context specific list of querylanguage command options if input is seeking command option suggestions.
         *
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(java.util.List<String> options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * Context specific list of querylanguage querystring examples if input is seeking queryString example suggestions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("examples")
        private java.util.List<String> examples;

        /**
         * Context specific list of querylanguage querystring examples if input is seeking queryString example suggestions.
         *
         * @param examples the value to set
         * @return this builder
         **/
        public Builder examples(java.util.List<String> examples) {
            this.examples = examples;
            this.__explicitlySet__.add("examples");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestOutput build() {
            SuggestOutput model =
                    new SuggestOutput(
                            this.position,
                            this.commands,
                            this.fields,
                            this.fieldValues,
                            this.terms,
                            this.options,
                            this.examples);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestOutput model) {
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
            }
            if (model.wasPropertyExplicitlySet("commands")) {
                this.commands(model.getCommands());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("fieldValues")) {
                this.fieldValues(model.getFieldValues());
            }
            if (model.wasPropertyExplicitlySet("terms")) {
                this.terms(model.getTerms());
            }
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
            }
            if (model.wasPropertyExplicitlySet("examples")) {
                this.examples(model.getExamples());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Character position suggestion should be placed in queryString provided as input.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final Integer position;

    /**
     * Character position suggestion should be placed in queryString provided as input.
     *
     * @return the value
     **/
    public Integer getPosition() {
        return position;
    }

    /**
     * Context specific list of querylanguage commands if input is seeking command suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commands")
    private final java.util.List<String> commands;

    /**
     * Context specific list of querylanguage commands if input is seeking command suggestions.
     *
     * @return the value
     **/
    public java.util.List<String> getCommands() {
        return commands;
    }

    /**
     * Context specific list of querylanguage fields / columns if input is seeking field / column suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<String> fields;

    /**
     * Context specific list of querylanguage fields / columns if input is seeking field / column suggestions.
     *
     * @return the value
     **/
    public java.util.List<String> getFields() {
        return fields;
    }

    /**
     * Context specific list of field values if input is seeking field value suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fieldValues")
    private final java.util.List<String> fieldValues;

    /**
     * Context specific list of field values if input is seeking field value suggestions.
     *
     * @return the value
     **/
    public java.util.List<String> getFieldValues() {
        return fieldValues;
    }

    /**
     * Context specific list of terms / phrases if input is seeking terms / phrase suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("terms")
    private final java.util.List<String> terms;

    /**
     * Context specific list of terms / phrases if input is seeking terms / phrase suggestions.
     *
     * @return the value
     **/
    public java.util.List<String> getTerms() {
        return terms;
    }

    /**
     * Context specific list of querylanguage command options if input is seeking command option suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final java.util.List<String> options;

    /**
     * Context specific list of querylanguage command options if input is seeking command option suggestions.
     *
     * @return the value
     **/
    public java.util.List<String> getOptions() {
        return options;
    }

    /**
     * Context specific list of querylanguage querystring examples if input is seeking queryString example suggestions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("examples")
    private final java.util.List<String> examples;

    /**
     * Context specific list of querylanguage querystring examples if input is seeking queryString example suggestions.
     *
     * @return the value
     **/
    public java.util.List<String> getExamples() {
        return examples;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SuggestOutput(");
        sb.append("super=").append(super.toString());
        sb.append("position=").append(String.valueOf(this.position));
        sb.append(", commands=").append(String.valueOf(this.commands));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", fieldValues=").append(String.valueOf(this.fieldValues));
        sb.append(", terms=").append(String.valueOf(this.terms));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", examples=").append(String.valueOf(this.examples));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestOutput)) {
            return false;
        }

        SuggestOutput other = (SuggestOutput) o;
        return java.util.Objects.equals(this.position, other.position)
                && java.util.Objects.equals(this.commands, other.commands)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.fieldValues, other.fieldValues)
                && java.util.Objects.equals(this.terms, other.terms)
                && java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.examples, other.examples)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + (this.commands == null ? 43 : this.commands.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result = (result * PRIME) + (this.fieldValues == null ? 43 : this.fieldValues.hashCode());
        result = (result * PRIME) + (this.terms == null ? 43 : this.terms.hashCode());
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.examples == null ? 43 : this.examples.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
