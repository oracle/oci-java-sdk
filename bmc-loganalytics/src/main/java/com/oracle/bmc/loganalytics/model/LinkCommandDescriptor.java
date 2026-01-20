/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Command descriptor for querylanguage LINK command. <br>
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
        builder = LinkCommandDescriptor.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LinkCommandDescriptor extends AbstractCommandDescriptor {
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
        /** Option to return groups with a null value if specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeNulls")
        private Boolean shouldIncludeNulls;

        /**
         * Option to return groups with a null value if specified.
         *
         * @param shouldIncludeNulls the value to set
         * @return this builder
         */
        public Builder shouldIncludeNulls(Boolean shouldIncludeNulls) {
            this.shouldIncludeNulls = shouldIncludeNulls;
            this.__explicitlySet__.add("shouldIncludeNulls");
            return this;
        }
        /** Option to calculate trends of each group if specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTrends")
        private Boolean shouldIncludeTrends;

        /**
         * Option to calculate trends of each group if specified.
         *
         * @param shouldIncludeTrends the value to set
         * @return this builder
         */
        public Builder shouldIncludeTrends(Boolean shouldIncludeTrends) {
            this.shouldIncludeTrends = shouldIncludeTrends;
            this.__explicitlySet__.add("shouldIncludeTrends");
            return this;
        }
        /**
         * Option to control the size of buckets in the histogram e.g 8hrs - each bar other than
         * first and last should represent 8hr time span. Will be adjusted to a larger span if time
         * range is very large.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("span")
        private String span;

        /**
         * Option to control the size of buckets in the histogram e.g 8hrs - each bar other than
         * first and last should represent 8hr time span. Will be adjusted to a larger span if time
         * range is very large.
         *
         * @param span the value to set
         * @return this builder
         */
        public Builder span(String span) {
            this.span = span;
            this.__explicitlySet__.add("span");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LinkCommandDescriptor build() {
            LinkCommandDescriptor model =
                    new LinkCommandDescriptor(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.category,
                            this.referencedFields,
                            this.declaredFields,
                            this.isHidden,
                            this.shouldIncludeNulls,
                            this.shouldIncludeTrends,
                            this.span);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LinkCommandDescriptor model) {
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
            if (model.wasPropertyExplicitlySet("shouldIncludeNulls")) {
                this.shouldIncludeNulls(model.getShouldIncludeNulls());
            }
            if (model.wasPropertyExplicitlySet("shouldIncludeTrends")) {
                this.shouldIncludeTrends(model.getShouldIncludeTrends());
            }
            if (model.wasPropertyExplicitlySet("span")) {
                this.span(model.getSpan());
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
    public LinkCommandDescriptor(
            String displayQueryString,
            String internalQueryString,
            String category,
            java.util.List<AbstractField> referencedFields,
            java.util.List<AbstractField> declaredFields,
            Boolean isHidden,
            Boolean shouldIncludeNulls,
            Boolean shouldIncludeTrends,
            String span) {
        super(
                displayQueryString,
                internalQueryString,
                category,
                referencedFields,
                declaredFields,
                isHidden);
        this.shouldIncludeNulls = shouldIncludeNulls;
        this.shouldIncludeTrends = shouldIncludeTrends;
        this.span = span;
    }

    /** Option to return groups with a null value if specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeNulls")
    private final Boolean shouldIncludeNulls;

    /**
     * Option to return groups with a null value if specified.
     *
     * @return the value
     */
    public Boolean getShouldIncludeNulls() {
        return shouldIncludeNulls;
    }

    /** Option to calculate trends of each group if specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldIncludeTrends")
    private final Boolean shouldIncludeTrends;

    /**
     * Option to calculate trends of each group if specified.
     *
     * @return the value
     */
    public Boolean getShouldIncludeTrends() {
        return shouldIncludeTrends;
    }

    /**
     * Option to control the size of buckets in the histogram e.g 8hrs - each bar other than first
     * and last should represent 8hr time span. Will be adjusted to a larger span if time range is
     * very large.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("span")
    private final String span;

    /**
     * Option to control the size of buckets in the histogram e.g 8hrs - each bar other than first
     * and last should represent 8hr time span. Will be adjusted to a larger span if time range is
     * very large.
     *
     * @return the value
     */
    public String getSpan() {
        return span;
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
        sb.append("LinkCommandDescriptor(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", shouldIncludeNulls=").append(String.valueOf(this.shouldIncludeNulls));
        sb.append(", shouldIncludeTrends=").append(String.valueOf(this.shouldIncludeTrends));
        sb.append(", span=").append(String.valueOf(this.span));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LinkCommandDescriptor)) {
            return false;
        }

        LinkCommandDescriptor other = (LinkCommandDescriptor) o;
        return java.util.Objects.equals(this.shouldIncludeNulls, other.shouldIncludeNulls)
                && java.util.Objects.equals(this.shouldIncludeTrends, other.shouldIncludeTrends)
                && java.util.Objects.equals(this.span, other.span)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.shouldIncludeNulls == null
                                ? 43
                                : this.shouldIncludeNulls.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeTrends == null
                                ? 43
                                : this.shouldIncludeTrends.hashCode());
        result = (result * PRIME) + (this.span == null ? 43 : this.span.hashCode());
        return result;
    }
}
