/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the spans in a trace by service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TraceServiceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TraceServiceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"spanServiceName", "totalSpans", "errorSpans"})
    public TraceServiceSummary(String spanServiceName, Long totalSpans, Long errorSpans) {
        super();
        this.spanServiceName = spanServiceName;
        this.totalSpans = totalSpans;
        this.errorSpans = errorSpans;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name associated with the service. */
        @com.fasterxml.jackson.annotation.JsonProperty("spanServiceName")
        private String spanServiceName;

        /**
         * Name associated with the service.
         *
         * @param spanServiceName the value to set
         * @return this builder
         */
        public Builder spanServiceName(String spanServiceName) {
            this.spanServiceName = spanServiceName;
            this.__explicitlySet__.add("spanServiceName");
            return this;
        }
        /** Number of spans for serviceName in the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalSpans")
        private Long totalSpans;

        /**
         * Number of spans for serviceName in the trace.
         *
         * @param totalSpans the value to set
         * @return this builder
         */
        public Builder totalSpans(Long totalSpans) {
            this.totalSpans = totalSpans;
            this.__explicitlySet__.add("totalSpans");
            return this;
        }
        /** Number of spans with errors for serviceName in the trace. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorSpans")
        private Long errorSpans;

        /**
         * Number of spans with errors for serviceName in the trace.
         *
         * @param errorSpans the value to set
         * @return this builder
         */
        public Builder errorSpans(Long errorSpans) {
            this.errorSpans = errorSpans;
            this.__explicitlySet__.add("errorSpans");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TraceServiceSummary build() {
            TraceServiceSummary model =
                    new TraceServiceSummary(this.spanServiceName, this.totalSpans, this.errorSpans);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TraceServiceSummary model) {
            if (model.wasPropertyExplicitlySet("spanServiceName")) {
                this.spanServiceName(model.getSpanServiceName());
            }
            if (model.wasPropertyExplicitlySet("totalSpans")) {
                this.totalSpans(model.getTotalSpans());
            }
            if (model.wasPropertyExplicitlySet("errorSpans")) {
                this.errorSpans(model.getErrorSpans());
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

    /** Name associated with the service. */
    @com.fasterxml.jackson.annotation.JsonProperty("spanServiceName")
    private final String spanServiceName;

    /**
     * Name associated with the service.
     *
     * @return the value
     */
    public String getSpanServiceName() {
        return spanServiceName;
    }

    /** Number of spans for serviceName in the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalSpans")
    private final Long totalSpans;

    /**
     * Number of spans for serviceName in the trace.
     *
     * @return the value
     */
    public Long getTotalSpans() {
        return totalSpans;
    }

    /** Number of spans with errors for serviceName in the trace. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorSpans")
    private final Long errorSpans;

    /**
     * Number of spans with errors for serviceName in the trace.
     *
     * @return the value
     */
    public Long getErrorSpans() {
        return errorSpans;
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
        sb.append("TraceServiceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("spanServiceName=").append(String.valueOf(this.spanServiceName));
        sb.append(", totalSpans=").append(String.valueOf(this.totalSpans));
        sb.append(", errorSpans=").append(String.valueOf(this.errorSpans));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TraceServiceSummary)) {
            return false;
        }

        TraceServiceSummary other = (TraceServiceSummary) o;
        return java.util.Objects.equals(this.spanServiceName, other.spanServiceName)
                && java.util.Objects.equals(this.totalSpans, other.totalSpans)
                && java.util.Objects.equals(this.errorSpans, other.errorSpans)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.spanServiceName == null ? 43 : this.spanServiceName.hashCode());
        result = (result * PRIME) + (this.totalSpans == null ? 43 : this.totalSpans.hashCode());
        result = (result * PRIME) + (this.errorSpans == null ? 43 : this.errorSpans.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
