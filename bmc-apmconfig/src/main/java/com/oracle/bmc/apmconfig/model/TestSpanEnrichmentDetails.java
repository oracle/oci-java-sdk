/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Run a set of span enrichment rules on a given span to see the result.
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
    builder = TestSpanEnrichmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "testType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TestSpanEnrichmentDetails extends TestDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The span enrichment rules to test in the format of an Options resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private Object options;

        /**
         * The span enrichment rules to test in the format of an Options resource.
         * @param options the value to set
         * @return this builder
         **/
        public Builder options(Object options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }
        /**
         * A list of filters to try against the given span.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("filters")
        private java.util.List<FilterTextOrId> filters;

        /**
         * A list of filters to try against the given span.
         * @param filters the value to set
         * @return this builder
         **/
        public Builder filters(java.util.List<FilterTextOrId> filters) {
            this.filters = filters;
            this.__explicitlySet__.add("filters");
            return this;
        }
        /**
         * The span to test the rules on. This should be a valid JSON object that follows one
         * of the formats used by distributed tracing frameworks, such as OpenTelemetry, Zipkin, or
         * Oracle Application Performance Monitoring.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private Object span;

        /**
         * The span to test the rules on. This should be a valid JSON object that follows one
         * of the formats used by distributed tracing frameworks, such as OpenTelemetry, Zipkin, or
         * Oracle Application Performance Monitoring.
         *
         * @param span the value to set
         * @return this builder
         **/
        public Builder span(Object span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestSpanEnrichmentDetails build() {
            TestSpanEnrichmentDetails model =
                    new TestSpanEnrichmentDetails(this.options, this.filters, this.span);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestSpanEnrichmentDetails model) {
            if (model.wasPropertyExplicitlySet("options")) {
                this.options(model.getOptions());
            }
            if (model.wasPropertyExplicitlySet("filters")) {
                this.filters(model.getFilters());
            }
            if (model.wasPropertyExplicitlySet("span")) {
                this.span(model.getSpan());
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
    public TestSpanEnrichmentDetails(
            Object options, java.util.List<FilterTextOrId> filters, Object span) {
        super();
        this.options = options;
        this.filters = filters;
        this.span = span;
    }

    /**
     * The span enrichment rules to test in the format of an Options resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    private final Object options;

    /**
     * The span enrichment rules to test in the format of an Options resource.
     * @return the value
     **/
    public Object getOptions() {
        return options;
    }

    /**
     * A list of filters to try against the given span.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filters")
    private final java.util.List<FilterTextOrId> filters;

    /**
     * A list of filters to try against the given span.
     * @return the value
     **/
    public java.util.List<FilterTextOrId> getFilters() {
        return filters;
    }

    /**
     * The span to test the rules on. This should be a valid JSON object that follows one
     * of the formats used by distributed tracing frameworks, such as OpenTelemetry, Zipkin, or
     * Oracle Application Performance Monitoring.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    private final Object span;

    /**
     * The span to test the rules on. This should be a valid JSON object that follows one
     * of the formats used by distributed tracing frameworks, such as OpenTelemetry, Zipkin, or
     * Oracle Application Performance Monitoring.
     *
     * @return the value
     **/
    public Object getSpan() {
        return span;
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
        sb.append("TestSpanEnrichmentDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", options=").append(String.valueOf(this.options));
        sb.append(", filters=").append(String.valueOf(this.filters));
        sb.append(", span=").append(String.valueOf(this.span));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestSpanEnrichmentDetails)) {
            return false;
        }

        TestSpanEnrichmentDetails other = (TestSpanEnrichmentDetails) o;
        return java.util.Objects.equals(this.options, other.options)
                && java.util.Objects.equals(this.filters, other.filters)
                && java.util.Objects.equals(this.span, other.span)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.options == null ? 43 : this.options.hashCode());
        result = (result * PRIME) + (this.filters == null ? 43 : this.filters.hashCode());
        result = (result * PRIME) + (this.span == null ? 43 : this.span.hashCode());
        return result;
    }
}
