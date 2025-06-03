/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The trace that displays the retrieval information. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RetrievalTrace.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "traceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RetrievalTrace extends Trace {
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
        /** The agent's search string for getting the displayed information. */
        @com.fasterxml.jackson.annotation.JsonProperty("retrievalInput")
        private String retrievalInput;

        /**
         * The agent's search string for getting the displayed information.
         *
         * @param retrievalInput the value to set
         * @return this builder
         */
        public Builder retrievalInput(String retrievalInput) {
            this.retrievalInput = retrievalInput;
            this.__explicitlySet__.add("retrievalInput");
            return this;
        }
        /** A list of citations retrieved from data sources. */
        @com.fasterxml.jackson.annotation.JsonProperty("citations")
        private java.util.List<Citation> citations;

        /**
         * A list of citations retrieved from data sources.
         *
         * @param citations the value to set
         * @return this builder
         */
        public Builder citations(java.util.List<Citation> citations) {
            this.citations = citations;
            this.__explicitlySet__.add("citations");
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

        public RetrievalTrace build() {
            RetrievalTrace model =
                    new RetrievalTrace(
                            this.key,
                            this.parentKey,
                            this.source,
                            this.timeCreated,
                            this.timeFinished,
                            this.retrievalInput,
                            this.citations,
                            this.usage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetrievalTrace model) {
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
            if (model.wasPropertyExplicitlySet("retrievalInput")) {
                this.retrievalInput(model.getRetrievalInput());
            }
            if (model.wasPropertyExplicitlySet("citations")) {
                this.citations(model.getCitations());
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
    public RetrievalTrace(
            String key,
            String parentKey,
            SourceDetails source,
            java.util.Date timeCreated,
            java.util.Date timeFinished,
            String retrievalInput,
            java.util.List<Citation> citations,
            java.util.List<Usage> usage) {
        super(key, parentKey, source, timeCreated, timeFinished);
        this.retrievalInput = retrievalInput;
        this.citations = citations;
        this.usage = usage;
    }

    /** The agent's search string for getting the displayed information. */
    @com.fasterxml.jackson.annotation.JsonProperty("retrievalInput")
    private final String retrievalInput;

    /**
     * The agent's search string for getting the displayed information.
     *
     * @return the value
     */
    public String getRetrievalInput() {
        return retrievalInput;
    }

    /** A list of citations retrieved from data sources. */
    @com.fasterxml.jackson.annotation.JsonProperty("citations")
    private final java.util.List<Citation> citations;

    /**
     * A list of citations retrieved from data sources.
     *
     * @return the value
     */
    public java.util.List<Citation> getCitations() {
        return citations;
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
        sb.append("RetrievalTrace(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", retrievalInput=").append(String.valueOf(this.retrievalInput));
        sb.append(", citations=").append(String.valueOf(this.citations));
        sb.append(", usage=").append(String.valueOf(this.usage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RetrievalTrace)) {
            return false;
        }

        RetrievalTrace other = (RetrievalTrace) o;
        return java.util.Objects.equals(this.retrievalInput, other.retrievalInput)
                && java.util.Objects.equals(this.citations, other.citations)
                && java.util.Objects.equals(this.usage, other.usage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.retrievalInput == null ? 43 : this.retrievalInput.hashCode());
        result = (result * PRIME) + (this.citations == null ? 43 : this.citations.hashCode());
        result = (result * PRIME) + (this.usage == null ? 43 : this.usage.hashCode());
        return result;
    }
}
