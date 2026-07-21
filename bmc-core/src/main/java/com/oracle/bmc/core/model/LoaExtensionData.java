/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Data related to the extension of the Expiry date of the LOA. It gives you number of remaining
 * extensions along with a history of past extensions made on the LOA. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LoaExtensionData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LoaExtensionData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"remainingExtensions", "history"})
    public LoaExtensionData(Long remainingExtensions, java.util.List<String> history) {
        super();
        this.remainingExtensions = remainingExtensions;
        this.history = history;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The maximum number of times this LOA's expiry can be extended. */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingExtensions")
        private Long remainingExtensions;

        /**
         * The maximum number of times this LOA's expiry can be extended.
         *
         * @param remainingExtensions the value to set
         * @return this builder
         */
        public Builder remainingExtensions(Long remainingExtensions) {
            this.remainingExtensions = remainingExtensions;
            this.__explicitlySet__.add("remainingExtensions");
            return this;
        }
        /**
         * Chronologically sorted list of date and time when the Letter of Authority's expiration
         * was last updated, most recent first, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). List is empty if the LOA's expiration
         * date has never been extended.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("history")
        private java.util.List<String> history;

        /**
         * Chronologically sorted list of date and time when the Letter of Authority's expiration
         * was last updated, most recent first, in the format defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). List is empty if the LOA's expiration
         * date has never been extended.
         *
         * @param history the value to set
         * @return this builder
         */
        public Builder history(java.util.List<String> history) {
            this.history = history;
            this.__explicitlySet__.add("history");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoaExtensionData build() {
            LoaExtensionData model = new LoaExtensionData(this.remainingExtensions, this.history);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoaExtensionData model) {
            if (model.wasPropertyExplicitlySet("remainingExtensions")) {
                this.remainingExtensions(model.getRemainingExtensions());
            }
            if (model.wasPropertyExplicitlySet("history")) {
                this.history(model.getHistory());
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

    /** The maximum number of times this LOA's expiry can be extended. */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingExtensions")
    private final Long remainingExtensions;

    /**
     * The maximum number of times this LOA's expiry can be extended.
     *
     * @return the value
     */
    public Long getRemainingExtensions() {
        return remainingExtensions;
    }

    /**
     * Chronologically sorted list of date and time when the Letter of Authority's expiration was
     * last updated, most recent first, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). List is empty if the LOA's expiration date
     * has never been extended.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("history")
    private final java.util.List<String> history;

    /**
     * Chronologically sorted list of date and time when the Letter of Authority's expiration was
     * last updated, most recent first, in the format defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). List is empty if the LOA's expiration date
     * has never been extended.
     *
     * @return the value
     */
    public java.util.List<String> getHistory() {
        return history;
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
        sb.append("LoaExtensionData(");
        sb.append("super=").append(super.toString());
        sb.append("remainingExtensions=").append(String.valueOf(this.remainingExtensions));
        sb.append(", history=").append(String.valueOf(this.history));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoaExtensionData)) {
            return false;
        }

        LoaExtensionData other = (LoaExtensionData) o;
        return java.util.Objects.equals(this.remainingExtensions, other.remainingExtensions)
                && java.util.Objects.equals(this.history, other.history)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.remainingExtensions == null
                                ? 43
                                : this.remainingExtensions.hashCode());
        result = (result * PRIME) + (this.history == null ? 43 : this.history.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
