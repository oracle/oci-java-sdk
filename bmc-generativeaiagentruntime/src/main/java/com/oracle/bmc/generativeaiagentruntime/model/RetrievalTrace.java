/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * The trace that displays the retrieval information.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RetrievalTrace.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "traceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RetrievalTrace extends Trace {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The agent's search string for getting the displayed information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("retrievalInput")
        private String retrievalInput;

        /**
         * The agent's search string for getting the displayed information.
         * @param retrievalInput the value to set
         * @return this builder
         **/
        public Builder retrievalInput(String retrievalInput) {
            this.retrievalInput = retrievalInput;
            this.__explicitlySet__.add("retrievalInput");
            return this;
        }
        /**
         * A list of citations retrieved from data sources.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("citations")
        private java.util.List<Citation> citations;

        /**
         * A list of citations retrieved from data sources.
         * @param citations the value to set
         * @return this builder
         **/
        public Builder citations(java.util.List<Citation> citations) {
            this.citations = citations;
            this.__explicitlySet__.add("citations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RetrievalTrace build() {
            RetrievalTrace model =
                    new RetrievalTrace(this.timeCreated, this.retrievalInput, this.citations);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RetrievalTrace model) {
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("retrievalInput")) {
                this.retrievalInput(model.getRetrievalInput());
            }
            if (model.wasPropertyExplicitlySet("citations")) {
                this.citations(model.getCitations());
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

    @Deprecated
    public RetrievalTrace(
            java.util.Date timeCreated, String retrievalInput, java.util.List<Citation> citations) {
        super(timeCreated);
        this.retrievalInput = retrievalInput;
        this.citations = citations;
    }

    /**
     * The agent's search string for getting the displayed information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retrievalInput")
    private final String retrievalInput;

    /**
     * The agent's search string for getting the displayed information.
     * @return the value
     **/
    public String getRetrievalInput() {
        return retrievalInput;
    }

    /**
     * A list of citations retrieved from data sources.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("citations")
    private final java.util.List<Citation> citations;

    /**
     * A list of citations retrieved from data sources.
     * @return the value
     **/
    public java.util.List<Citation> getCitations() {
        return citations;
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
        sb.append("RetrievalTrace(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", retrievalInput=").append(String.valueOf(this.retrievalInput));
        sb.append(", citations=").append(String.valueOf(this.citations));
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
        return result;
    }
}
