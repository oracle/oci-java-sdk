/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Details of a potential match returned from the suggest operation for the given input text. by the
 * limit parameter. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SuggestListItem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SuggestListItem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
         */
        @com.fasterxml.jackson.annotation.JsonProperty("suggestion")
        private String suggestion;

        /**
         * Potential string match. Matching is based on the frequency of usage within the catalog.
         *
         * @param suggestion the value to set
         * @return this builder
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            this.__explicitlySet__.add("suggestion");
            return this;
        }
        /** The number of objects which contain this suggestion. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
        private Integer objectCount;

        /**
         * The number of objects which contain this suggestion.
         *
         * @param objectCount the value to set
         * @return this builder
         */
        public Builder objectCount(Integer objectCount) {
            this.objectCount = objectCount;
            this.__explicitlySet__.add("objectCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SuggestListItem build() {
            SuggestListItem model = new SuggestListItem(this.suggestion, this.objectCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SuggestListItem model) {
            if (model.wasPropertyExplicitlySet("suggestion")) {
                this.suggestion(model.getSuggestion());
            }
            if (model.wasPropertyExplicitlySet("objectCount")) {
                this.objectCount(model.getObjectCount());
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

    /** Potential string match. Matching is based on the frequency of usage within the catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("suggestion")
    private final String suggestion;

    /**
     * Potential string match. Matching is based on the frequency of usage within the catalog.
     *
     * @return the value
     */
    public String getSuggestion() {
        return suggestion;
    }

    /** The number of objects which contain this suggestion. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectCount")
    private final Integer objectCount;

    /**
     * The number of objects which contain this suggestion.
     *
     * @return the value
     */
    public Integer getObjectCount() {
        return objectCount;
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
        sb.append("SuggestListItem(");
        sb.append("super=").append(super.toString());
        sb.append("suggestion=").append(String.valueOf(this.suggestion));
        sb.append(", objectCount=").append(String.valueOf(this.objectCount));
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
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.suggestion == null ? 43 : this.suggestion.hashCode());
        result = (result * PRIME) + (this.objectCount == null ? 43 : this.objectCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
