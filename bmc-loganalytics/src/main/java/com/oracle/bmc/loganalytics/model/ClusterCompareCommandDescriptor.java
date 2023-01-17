/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage CLUSTERCOMPARE command.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ClusterCompareCommandDescriptor.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ClusterCompareCommandDescriptor extends AbstractCommandDescriptor {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
        private Boolean isHidden;

        public Builder isHidden(Boolean isHidden) {
            this.isHidden = isHidden;
            this.__explicitlySet__.add("isHidden");
            return this;
        }
        /**
         * To shift time range of main query backwards using a relative time expression e.g -24hrs. E.g compare against the previous 24 hrs.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeShift")
        private String timeShift;

        /**
         * To shift time range of main query backwards using a relative time expression e.g -24hrs. E.g compare against the previous 24 hrs.
         *
         * @param timeShift the value to set
         * @return this builder
         **/
        public Builder timeShift(String timeShift) {
            this.timeShift = timeShift;
            this.__explicitlySet__.add("timeShift");
            return this;
        }
        /**
         * Start time to apply to base line query if specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
        private Long timeStart;

        /**
         * Start time to apply to base line query if specified.
         *
         * @param timeStart the value to set
         * @return this builder
         **/
        public Builder timeStart(Long timeStart) {
            this.timeStart = timeStart;
            this.__explicitlySet__.add("timeStart");
            return this;
        }
        /**
         * End time to apply to base line query if specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private Long timeEnd;

        /**
         * End time to apply to base line query if specified.
         *
         * @param timeEnd the value to set
         * @return this builder
         **/
        public Builder timeEnd(Long timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /**
         * Option to calculate trends of each cluster if specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTrends")
        private Boolean shouldIncludeTrends;

        /**
         * Option to calculate trends of each cluster if specified.
         *
         * @param shouldIncludeTrends the value to set
         * @return this builder
         **/
        public Builder shouldIncludeTrends(Boolean shouldIncludeTrends) {
            this.shouldIncludeTrends = shouldIncludeTrends;
            this.__explicitlySet__.add("shouldIncludeTrends");
            return this;
        }
        /**
         * Option to control the size of buckets in the histogram e.g 8hrs  - each bar other than first and last should represent 8hr time span. Will be adjusted to a larger span if time range is very large.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private String span;

        /**
         * Option to control the size of buckets in the histogram e.g 8hrs  - each bar other than first and last should represent 8hr time span. Will be adjusted to a larger span if time range is very large.
         *
         * @param span the value to set
         * @return this builder
         **/
        public Builder span(String span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }
        /**
         * Query to use to compute base line to compare top level query results against to identify differences if specified.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("baselineQuery")
        private String baselineQuery;

        /**
         * Query to use to compute base line to compare top level query results against to identify differences if specified.
         *
         * @param baselineQuery the value to set
         * @return this builder
         **/
        public Builder baselineQuery(String baselineQuery) {
            this.baselineQuery = baselineQuery;
            this.__explicitlySet__.add("baselineQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ClusterCompareCommandDescriptor build() {
            ClusterCompareCommandDescriptor model =
                    new ClusterCompareCommandDescriptor(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.category,
                            this.referencedFields,
                            this.declaredFields,
                            this.isHidden,
                            this.timeShift,
                            this.timeStart,
                            this.timeEnd,
                            this.shouldIncludeTrends,
                            this.span,
                            this.baselineQuery);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ClusterCompareCommandDescriptor model) {
            if (model.wasPropertyExplicitlySet("displayQueryString")) {
                this.displayQueryString(model.getDisplayQueryString());
            }
            if (model.wasPropertyExplicitlySet("internalQueryString")) {
                this.internalQueryString(model.getInternalQueryString());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("referencedFields")) {
                this.referencedFields(model.getReferencedFields());
            }
            if (model.wasPropertyExplicitlySet("declaredFields")) {
                this.declaredFields(model.getDeclaredFields());
            }
            if (model.wasPropertyExplicitlySet("isHidden")) {
                this.isHidden(model.getIsHidden());
            }
            if (model.wasPropertyExplicitlySet("timeShift")) {
                this.timeShift(model.getTimeShift());
            }
            if (model.wasPropertyExplicitlySet("timeStart")) {
                this.timeStart(model.getTimeStart());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeTrends")) {
                this.shouldIncludeTrends(model.getShouldIncludeTrends());
            }
            if (model.wasPropertyExplicitlySet("span")) {
                this.span(model.getSpan());
            }
            if (model.wasPropertyExplicitlySet("baselineQuery")) {
                this.baselineQuery(model.getBaselineQuery());
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
    public ClusterCompareCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Boolean isHidden,
            String timeShift,
            Long timeStart,
            Long timeEnd,
            Boolean shouldIncludeTrends,
            String span,
            String baselineQuery) {
        super(
                displayQueryString,
                internalQueryString,
                category,
                referencedFields,
                declaredFields,
                isHidden);
        this.timeShift = timeShift;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        this.shouldIncludeTrends = shouldIncludeTrends;
        this.span = span;
        this.baselineQuery = baselineQuery;
    }

    /**
     * To shift time range of main query backwards using a relative time expression e.g -24hrs. E.g compare against the previous 24 hrs.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeShift")
    private final String timeShift;

    /**
     * To shift time range of main query backwards using a relative time expression e.g -24hrs. E.g compare against the previous 24 hrs.
     *
     * @return the value
     **/
    public String getTimeShift() {
        return timeShift;
    }

    /**
     * Start time to apply to base line query if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStart")
    private final Long timeStart;

    /**
     * Start time to apply to base line query if specified.
     *
     * @return the value
     **/
    public Long getTimeStart() {
        return timeStart;
    }

    /**
     * End time to apply to base line query if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final Long timeEnd;

    /**
     * End time to apply to base line query if specified.
     *
     * @return the value
     **/
    public Long getTimeEnd() {
        return timeEnd;
    }

    /**
     * Option to calculate trends of each cluster if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTrends")
    private final Boolean shouldIncludeTrends;

    /**
     * Option to calculate trends of each cluster if specified.
     *
     * @return the value
     **/
    public Boolean getShouldIncludeTrends() {
        return shouldIncludeTrends;
    }

    /**
     * Option to control the size of buckets in the histogram e.g 8hrs  - each bar other than first and last should represent 8hr time span. Will be adjusted to a larger span if time range is very large.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    private final String span;

    /**
     * Option to control the size of buckets in the histogram e.g 8hrs  - each bar other than first and last should represent 8hr time span. Will be adjusted to a larger span if time range is very large.
     *
     * @return the value
     **/
    public String getSpan() {
        return span;
    }

    /**
     * Query to use to compute base line to compare top level query results against to identify differences if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("baselineQuery")
    private final String baselineQuery;

    /**
     * Query to use to compute base line to compare top level query results against to identify differences if specified.
     *
     * @return the value
     **/
    public String getBaselineQuery() {
        return baselineQuery;
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
        sb.append("ClusterCompareCommandDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeShift=").append(String.valueOf(this.timeShift));
        sb.append(", timeStart=").append(String.valueOf(this.timeStart));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", shouldIncludeTrends=").append(String.valueOf(this.shouldIncludeTrends));
        sb.append(", span=").append(String.valueOf(this.span));
        sb.append(", baselineQuery=").append(String.valueOf(this.baselineQuery));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ClusterCompareCommandDescriptor)) {
            return false;
        }

        ClusterCompareCommandDescriptor other = (ClusterCompareCommandDescriptor) o;
        return java.util.Objects.equals(this.timeShift, other.timeShift)
                && java.util.Objects.equals(this.timeStart, other.timeStart)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.shouldIncludeTrends, other.shouldIncludeTrends)
                && java.util.Objects.equals(this.span, other.span)
                && java.util.Objects.equals(this.baselineQuery, other.baselineQuery)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.timeShift == null ? 43 : this.timeShift.hashCode());
        result = (result * PRIME) + (this.timeStart == null ? 43 : this.timeStart.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeTrends == null
                                ? 43
                                : this.shouldIncludeTrends.hashCode());
        result = (result * PRIME) + (this.span == null ? 43 : this.span.hashCode());
        result =
                (result * PRIME)
                        + (this.baselineQuery == null ? 43 : this.baselineQuery.hashCode());
        return result;
    }
}
