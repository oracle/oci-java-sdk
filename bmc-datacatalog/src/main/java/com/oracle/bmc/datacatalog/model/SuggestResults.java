/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * The list of potential matches returned from the suggest operation for the given input text. The size of the list will be determined
 * by the limit parameter.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestResults.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SuggestResults extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalCount", "searchLatencyInMs", "inputText", "items"})
    public SuggestResults(
            Integer totalCount,
            Integer searchLatencyInMs,
            String inputText,
            java.util.List<SuggestListItem> items) {
        super();
        this.totalCount = totalCount;
        this.searchLatencyInMs = searchLatencyInMs;
        this.inputText = inputText;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total number of items returned.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * Total number of items returned.
         * @param totalCount the value to set
         * @return this builder
         **/
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }
        /**
         * Time taken to compute the result, in milliseconds.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("searchLatencyInMs")
        private Integer searchLatencyInMs;

        /**
         * Time taken to compute the result, in milliseconds.
         * @param searchLatencyInMs the value to set
         * @return this builder
         **/
        public Builder searchLatencyInMs(Integer searchLatencyInMs) {
            this.searchLatencyInMs = searchLatencyInMs;
            this.__explicitlySet__.add("searchLatencyInMs");
            return this;
        }
        /**
         * Input string for which the potential matches are computed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputText")
        private String inputText;

        /**
         * Input string for which the potential matches are computed.
         * @param inputText the value to set
         * @return this builder
         **/
        public Builder inputText(String inputText) {
            this.inputText = inputText;
            this.__explicitlySet__.add("inputText");
            return this;
        }
        /**
         * List of suggestions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<SuggestListItem> items;

        /**
         * List of suggestions.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<SuggestListItem> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestResults build() {
            SuggestResults model =
                    new SuggestResults(
                            this.totalCount, this.searchLatencyInMs, this.inputText, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestResults model) {
            if (model.wasPropertyExplicitlySet("totalCount")) {
                this.totalCount(model.getTotalCount());
            }
            if (model.wasPropertyExplicitlySet("searchLatencyInMs")) {
                this.searchLatencyInMs(model.getSearchLatencyInMs());
            }
            if (model.wasPropertyExplicitlySet("inputText")) {
                this.inputText(model.getInputText());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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
     * Total number of items returned.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * Total number of items returned.
     * @return the value
     **/
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * Time taken to compute the result, in milliseconds.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("searchLatencyInMs")
    private final Integer searchLatencyInMs;

    /**
     * Time taken to compute the result, in milliseconds.
     * @return the value
     **/
    public Integer getSearchLatencyInMs() {
        return searchLatencyInMs;
    }

    /**
     * Input string for which the potential matches are computed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputText")
    private final String inputText;

    /**
     * Input string for which the potential matches are computed.
     * @return the value
     **/
    public String getInputText() {
        return inputText;
    }

    /**
     * List of suggestions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<SuggestListItem> items;

    /**
     * List of suggestions.
     * @return the value
     **/
    public java.util.List<SuggestListItem> getItems() {
        return items;
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
        sb.append("SuggestResults(");
        sb.append("super=").append(super.toString());
        sb.append("totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", searchLatencyInMs=").append(String.valueOf(this.searchLatencyInMs));
        sb.append(", inputText=").append(String.valueOf(this.inputText));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestResults)) {
            return false;
        }

        SuggestResults other = (SuggestResults) o;
        return java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.searchLatencyInMs, other.searchLatencyInMs)
                && java.util.Objects.equals(this.inputText, other.inputText)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.searchLatencyInMs == null ? 43 : this.searchLatencyInMs.hashCode());
        result = (result * PRIME) + (this.inputText == null ? 43 : this.inputText.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
