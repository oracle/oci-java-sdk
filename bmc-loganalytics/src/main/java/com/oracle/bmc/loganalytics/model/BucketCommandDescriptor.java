/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage BUCKET command. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BucketCommandDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BucketCommandDescriptor extends AbstractCommandDescriptor {
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
        /** number of auto calculated ranges to compute if specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxBuckets")
        private Integer maxBuckets;

        /**
         * number of auto calculated ranges to compute if specified.
         *
         * @param maxBuckets the value to set
         * @return this builder
         */
        public Builder maxBuckets(Integer maxBuckets) {
            this.maxBuckets = maxBuckets;
            this.__explicitlySet__.add("maxBuckets");
            return this;
        }
        /**
         * Size of each numeric range if specified. Data type should match numeric field data type
         * specified in the query string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private java.math.BigDecimal span;

        /**
         * Size of each numeric range if specified. Data type should match numeric field data type
         * specified in the query string.
         *
         * @param span the value to set
         * @return this builder
         */
        public Builder span(java.math.BigDecimal span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }
        /** List of the specified numeric ranges. */
        @com.fasterxml.jackson.annotation.JsonProperty("ranges")
        private java.util.List<BucketRange> ranges;

        /**
         * List of the specified numeric ranges.
         *
         * @param ranges the value to set
         * @return this builder
         */
        public Builder ranges(java.util.List<BucketRange> ranges) {
            this.ranges = ranges;
            this.__explicitlySet__.add("ranges");
            return this;
        }
        /**
         * Default value to use in place of null if a result does not fit into any of the specified
         * / calculated ranges.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * Default value to use in place of null if a result does not fit into any of the specified
         * / calculated ranges.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BucketCommandDescriptor build() {
            BucketCommandDescriptor model =
                    new BucketCommandDescriptor(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.category,
                            this.referencedFields,
                            this.declaredFields,
                            this.isHidden,
                            this.maxBuckets,
                            this.span,
                            this.ranges,
                            this.defaultValue);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BucketCommandDescriptor model) {
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
            if (model.wasPropertyExplicitlySet("maxBuckets")) {
                this.maxBuckets(model.getMaxBuckets());
            }
            if (model.wasPropertyExplicitlySet("span")) {
                this.span(model.getSpan());
            }
            if (model.wasPropertyExplicitlySet("ranges")) {
                this.ranges(model.getRanges());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
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
    public BucketCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Boolean isHidden,
            Integer maxBuckets,
            java.math.BigDecimal span,
            java.util.List<BucketRange> ranges,
            String defaultValue) {
        super(
                displayQueryString,
                internalQueryString,
                category,
                referencedFields,
                declaredFields,
                isHidden);
        this.maxBuckets = maxBuckets;
        this.span = span;
        this.ranges = ranges;
        this.defaultValue = defaultValue;
    }

    /** number of auto calculated ranges to compute if specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxBuckets")
    private final Integer maxBuckets;

    /**
     * number of auto calculated ranges to compute if specified.
     *
     * @return the value
     */
    public Integer getMaxBuckets() {
        return maxBuckets;
    }

    /**
     * Size of each numeric range if specified. Data type should match numeric field data type
     * specified in the query string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    private final java.math.BigDecimal span;

    /**
     * Size of each numeric range if specified. Data type should match numeric field data type
     * specified in the query string.
     *
     * @return the value
     */
    public java.math.BigDecimal getSpan() {
        return span;
    }

    /** List of the specified numeric ranges. */
    @com.fasterxml.jackson.annotation.JsonProperty("ranges")
    private final java.util.List<BucketRange> ranges;

    /**
     * List of the specified numeric ranges.
     *
     * @return the value
     */
    public java.util.List<BucketRange> getRanges() {
        return ranges;
    }

    /**
     * Default value to use in place of null if a result does not fit into any of the specified /
     * calculated ranges.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * Default value to use in place of null if a result does not fit into any of the specified /
     * calculated ranges.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
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
        sb.append("BucketCommandDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", maxBuckets=").append(String.valueOf(this.maxBuckets));
        sb.append(", span=").append(String.valueOf(this.span));
        sb.append(", ranges=").append(String.valueOf(this.ranges));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BucketCommandDescriptor)) {
            return false;
        }

        BucketCommandDescriptor other = (BucketCommandDescriptor) o;
        return java.util.Objects.equals(this.maxBuckets, other.maxBuckets)
                && java.util.Objects.equals(this.span, other.span)
                && java.util.Objects.equals(this.ranges, other.ranges)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.maxBuckets == null ? 43 : this.maxBuckets.hashCode());
        result = (result * PRIME) + (this.span == null ? 43 : this.span.hashCode());
        result = (result * PRIME) + (this.ranges == null ? 43 : this.ranges.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        return result;
    }
}
