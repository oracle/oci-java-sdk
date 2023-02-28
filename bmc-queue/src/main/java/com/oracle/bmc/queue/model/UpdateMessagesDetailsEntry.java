/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * Object that represents a message to update in a queue. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMessagesDetailsEntry.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateMessagesDetailsEntry
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"receipt", "visibilityInSeconds"})
    public UpdateMessagesDetailsEntry(String receipt, Integer visibilityInSeconds) {
        super();
        this.receipt = receipt;
        this.visibilityInSeconds = visibilityInSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The receipt of the message to update */
        @com.fasterxml.jackson.annotation.JsonProperty("receipt")
        private String receipt;

        /**
         * The receipt of the message to update
         *
         * @param receipt the value to set
         * @return this builder
         */
        public Builder receipt(String receipt) {
            this.receipt = receipt;
            this.__explicitlySet__.add("receipt");
            return this;
        }
        /**
         * The new visibility of the message relative to the current time (as-per the clock of the
         * server receiving the request).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("visibilityInSeconds")
        private Integer visibilityInSeconds;

        /**
         * The new visibility of the message relative to the current time (as-per the clock of the
         * server receiving the request).
         *
         * @param visibilityInSeconds the value to set
         * @return this builder
         */
        public Builder visibilityInSeconds(Integer visibilityInSeconds) {
            this.visibilityInSeconds = visibilityInSeconds;
            this.__explicitlySet__.add("visibilityInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMessagesDetailsEntry build() {
            UpdateMessagesDetailsEntry model =
                    new UpdateMessagesDetailsEntry(this.receipt, this.visibilityInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMessagesDetailsEntry model) {
            if (model.wasPropertyExplicitlySet("receipt")) {
                this.receipt(model.getReceipt());
            }
            if (model.wasPropertyExplicitlySet("visibilityInSeconds")) {
                this.visibilityInSeconds(model.getVisibilityInSeconds());
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

    /** The receipt of the message to update */
    @com.fasterxml.jackson.annotation.JsonProperty("receipt")
    private final String receipt;

    /**
     * The receipt of the message to update
     *
     * @return the value
     */
    public String getReceipt() {
        return receipt;
    }

    /**
     * The new visibility of the message relative to the current time (as-per the clock of the
     * server receiving the request).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("visibilityInSeconds")
    private final Integer visibilityInSeconds;

    /**
     * The new visibility of the message relative to the current time (as-per the clock of the
     * server receiving the request).
     *
     * @return the value
     */
    public Integer getVisibilityInSeconds() {
        return visibilityInSeconds;
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
        sb.append("UpdateMessagesDetailsEntry(");
        sb.append("super=").append(super.toString());
        sb.append("receipt=").append(String.valueOf(this.receipt));
        sb.append(", visibilityInSeconds=").append(String.valueOf(this.visibilityInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMessagesDetailsEntry)) {
            return false;
        }

        UpdateMessagesDetailsEntry other = (UpdateMessagesDetailsEntry) o;
        return java.util.Objects.equals(this.receipt, other.receipt)
                && java.util.Objects.equals(this.visibilityInSeconds, other.visibilityInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.receipt == null ? 43 : this.receipt.hashCode());
        result =
                (result * PRIME)
                        + (this.visibilityInSeconds == null
                                ? 43
                                : this.visibilityInSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
