/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Output of running a set of span enrichment rules against a span.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TestSpanEnrichmentOutput.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "testType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestSpanEnrichmentOutput extends TestOutput {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The span after applying enrichment rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private Object span;

        /**
         * The span after applying enrichment rules.
         * @param span the value to set
         * @return this builder
         **/
        public Builder span(Object span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }
        /**
         * A list of booleans indicating whether the corresponding filter in the input matched the input span.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<Boolean> filters;

        /**
         * A list of booleans indicating whether the corresponding filter in the input matched the input span.
         *
         * @param filters the value to set
         * @return this builder
         **/
        public Builder filters(java.util.List<Boolean> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestSpanEnrichmentOutput build() {
            TestSpanEnrichmentOutput model = new TestSpanEnrichmentOutput(this.span, this.filters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestSpanEnrichmentOutput model) {
            if (model.wasPropertyExplicitlySet("span")) {
                this.span(model.getSpan());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
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
    public TestSpanEnrichmentOutput(Object span, java.util.List<Boolean> filters) {
        super();
        this.span = span;
        this.filters = filters;
    }

    /**
     * The span after applying enrichment rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    private final Object span;

    /**
     * The span after applying enrichment rules.
     * @return the value
     **/
    public Object getSpan() {
        return span;
    }

    /**
     * A list of booleans indicating whether the corresponding filter in the input matched the input span.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<Boolean> filters;

    /**
     * A list of booleans indicating whether the corresponding filter in the input matched the input span.
     *
     * @return the value
     **/
    public java.util.List<Boolean> getFilters() {
        return filters;
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
        sb.append("TestSpanEnrichmentOutput(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", span=").append(String.valueOf(this.span));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestSpanEnrichmentOutput)) {
            return false;
        }

        TestSpanEnrichmentOutput other = (TestSpanEnrichmentOutput) o;
        return java.util.Objects.equals(this.span, other.span)
                && java.util.Objects.equals(this.filters, other.filters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.span == null ? 43 : this.span.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        return result;
    }
}
