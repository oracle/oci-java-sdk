/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Contains trace information related to planning at the platform. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PlanningTrace.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "traceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PlanningTrace extends Trace {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentKey")
        private String parentKey;

        public Builder parentKey(String parentKey) {
            this.parentKey = parentKey;
            this.__explicitlySet__.add("parentKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private SourceDetails source;

        public Builder source(SourceDetails source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }
        /** Input prompt to planning LLM. */
        @com.fasterxml.jackson.annotation.JsonProperty("input")
        private String input;

        /**
         * Input prompt to planning LLM.
         *
         * @param input the value to set
         * @return this builder
         */
        public Builder input(String input) {
            this.input = input;
            this.__explicitlySet__.add("input");
            return this;
        }
        /** Output string from planning LLM. */
        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private String output;

        /**
         * Output string from planning LLM.
         *
         * @param output the value to set
         * @return this builder
         */
        public Builder output(String output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }
        /** Details of model and its usage. */
        @com.fasterxml.jackson.annotation.JsonProperty("usage")
        private java.util.List<Usage> usage;

        /**
         * Details of model and its usage.
         *
         * @param usage the value to set
         * @return this builder
         */
        public Builder usage(java.util.List<Usage> usage) {
            this.usage = usage;
            this.__explicitlySet__.add("usage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlanningTrace build() {
            PlanningTrace model =
                    new PlanningTrace(
                            this.key,
                            this.parentKey,
                            this.source,
                            this.timeCreated,
                            this.timeFinished,
                            this.input,
                            this.output,
                            this.usage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlanningTrace model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("parentKey")) {
                this.parentKey(model.getParentKey());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
            }
            if (model.wasPropertyExplicitlySet("input")) {
                this.input(model.getInput());
            }
            if (model.wasPropertyExplicitlySet("output")) {
                this.output(model.getOutput());
            }
            if (model.wasPropertyExplicitlySet("usage")) {
                this.usage(model.getUsage());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public PlanningTrace(
            String key,
            String parentKey,
            SourceDetails source,
            java.util.Date timeCreated,
            java.util.Date timeFinished,
            String input,
            String output,
            java.util.List<Usage> usage) {
        super(key, parentKey, source, timeCreated, timeFinished);
        this.input = input;
        this.output = output;
        this.usage = usage;
    }

    /** Input prompt to planning LLM. */
    @com.fasterxml.jackson.annotation.JsonProperty("input")
    private final String input;

    /**
     * Input prompt to planning LLM.
     *
     * @return the value
     */
    public String getInput() {
        return input;
    }

    /** Output string from planning LLM. */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final String output;

    /**
     * Output string from planning LLM.
     *
     * @return the value
     */
    public String getOutput() {
        return output;
    }

    /** Details of model and its usage. */
    @com.fasterxml.jackson.annotation.JsonProperty("usage")
    private final java.util.List<Usage> usage;

    /**
     * Details of model and its usage.
     *
     * @return the value
     */
    public java.util.List<Usage> getUsage() {
        return usage;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("PlanningTrace(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", input=").append(String.valueOf(this.input));
        sb.append(", output=").append(String.valueOf(this.output));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlanningTrace)) {
            return false;
        }

        PlanningTrace other = (PlanningTrace) o;
        return java.util.Objects.equals(this.input, other.input)
                && java.util.Objects.equals(this.output, other.output)
                && java.util.Objects.equals(this.usage, other.usage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.input == null ? 43 : this.input.hashCode());
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        return result;
    }
}
