/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Options for streaming response. Only set this when you set stream: true. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StreamOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StreamOptions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isIncludeUsage"})
    public StreamOptions(Boolean isIncludeUsage) {
        super();
        this.isIncludeUsage = isIncludeUsage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * If set, an additional chunk will be streamed before the data: [DONE] message. The usage
         * field on this chunk shows the token usage statistics for the entire request
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeUsage")
        private Boolean isIncludeUsage;

        /**
         * If set, an additional chunk will be streamed before the data: [DONE] message. The usage
         * field on this chunk shows the token usage statistics for the entire request
         *
         * @param isIncludeUsage the value to set
         * @return this builder
         */
        public Builder isIncludeUsage(Boolean isIncludeUsage) {
            this.isIncludeUsage = isIncludeUsage;
            this.__explicitlySet__.add("isIncludeUsage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StreamOptions build() {
            StreamOptions model = new StreamOptions(this.isIncludeUsage);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamOptions model) {
            if (model.wasPropertyExplicitlySet("isIncludeUsage")) {
                this.isIncludeUsage(model.getIsIncludeUsage());
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

    /**
     * If set, an additional chunk will be streamed before the data: [DONE] message. The usage field
     * on this chunk shows the token usage statistics for the entire request
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeUsage")
    private final Boolean isIncludeUsage;

    /**
     * If set, an additional chunk will be streamed before the data: [DONE] message. The usage field
     * on this chunk shows the token usage statistics for the entire request
     *
     * @return the value
     */
    public Boolean getIsIncludeUsage() {
        return isIncludeUsage;
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
        sb.append("StreamOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isIncludeUsage=").append(String.valueOf(this.isIncludeUsage));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamOptions)) {
            return false;
        }

        StreamOptions other = (StreamOptions) o;
        return java.util.Objects.equals(this.isIncludeUsage, other.isIncludeUsage)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isIncludeUsage == null ? 43 : this.isIncludeUsage.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
