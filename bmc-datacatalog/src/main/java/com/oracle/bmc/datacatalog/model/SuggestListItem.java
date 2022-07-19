/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a potential match returned from the suggest operation for the given input text.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestListItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SuggestListItem {
    @Deprecated
    @java.beans.ConstructorProperties({"suggestion", "objectCount"})
    public SuggestListItem(String suggestion, Integer objectCount) {
        super();
        this.suggestion = suggestion;
        this.objectCount = objectCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Potential string match. Matching is based on the frequency of usage within the catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("suggestion")
        private String suggestion;

        /**
         * Potential string match. Matching is based on the frequency of usage within the catalog.
         * @param suggestion the value to set
         * @return this builder
         **/
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            this.__explicitlySet__.add("suggestion");
            return this;
        }
        /**
         * The number of objects which contain this suggestion.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
        private Integer objectCount;

        /**
         * The number of objects which contain this suggestion.
         * @param objectCount the value to set
         * @return this builder
         **/
        public Builder objectCount(Integer objectCount) {
            this.objectCount = objectCount;
            this.__explicitlySet__.add("objectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestListItem build() {
            SuggestListItem __instance__ = new SuggestListItem(suggestion, objectCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestListItem o) {
            Builder copiedBuilder = suggestion(o.getSuggestion()).objectCount(o.getObjectCount());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Potential string match. Matching is based on the frequency of usage within the catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("suggestion")
    private final String suggestion;

    /**
     * Potential string match. Matching is based on the frequency of usage within the catalog.
     * @return the value
     **/
    public String getSuggestion() {
        return suggestion;
    }

    /**
     * The number of objects which contain this suggestion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
    private final Integer objectCount;

    /**
     * The number of objects which contain this suggestion.
     * @return the value
     **/
    public Integer getObjectCount() {
        return objectCount;
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
        sb.append("SuggestListItem(");
        sb.append("suggestion=").append(String.valueOf(this.suggestion));
        sb.append(", objectCount=").append(String.valueOf(this.objectCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SuggestListItem)) {
            return false;
        }

        SuggestListItem other = (SuggestListItem) o;
        return java.util.Objects.equals(this.suggestion, other.suggestion)
                && java.util.Objects.equals(this.objectCount, other.objectCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.suggestion == null ? 43 : this.suggestion.hashCode());
        result = (result * PRIME) + (this.objectCount == null ? 43 : this.objectCount.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
