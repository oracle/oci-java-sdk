/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * The response to a UpdateMessages request. It indicates the number of server and client failures
 * as well as an array of entries for successful and failed actions. <br>
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
        builder = UpdateMessagesResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateMessagesResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serverFailures", "clientFailures", "entries"})
    public UpdateMessagesResult(
            Integer serverFailures,
            Integer clientFailures,
            java.util.List<UpdateMessagesResultEntry> entries) {
        super();
        this.serverFailures = serverFailures;
        this.clientFailures = clientFailures;
        this.entries = entries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The number of messages that failed to be updated in the queue because of a server
         * failure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serverFailures")
        private Integer serverFailures;

        /**
         * The number of messages that failed to be updated in the queue because of a server
         * failure.
         *
         * @param serverFailures the value to set
         * @return this builder
         */
        public Builder serverFailures(Integer serverFailures) {
            this.serverFailures = serverFailures;
            this.__explicitlySet__.add("serverFailures");
            return this;
        }
        /**
         * The number of messages that failed to be updated in the queue because of a client failure
         * such as an invalid receipt or invalid visibilityInSeconds.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientFailures")
        private Integer clientFailures;

        /**
         * The number of messages that failed to be updated in the queue because of a client failure
         * such as an invalid receipt or invalid visibilityInSeconds.
         *
         * @param clientFailures the value to set
         * @return this builder
         */
        public Builder clientFailures(Integer clientFailures) {
            this.clientFailures = clientFailures;
            this.__explicitlySet__.add("clientFailures");
            return this;
        }
        /**
         * An array of items representing the result of each action. The order is guaranteed to be
         * the same as in the {@code UpdateMessagesDetails} object. If a message was successfully
         * updated in the queue, the entry includes the {@code id} and {@code visibleAfter} fields.
         * If a message failed to be updated in the queue, the entry includes the {@code errorCode}
         * and {@code errorMessage} fields.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entries")
        private java.util.List<UpdateMessagesResultEntry> entries;

        /**
         * An array of items representing the result of each action. The order is guaranteed to be
         * the same as in the {@code UpdateMessagesDetails} object. If a message was successfully
         * updated in the queue, the entry includes the {@code id} and {@code visibleAfter} fields.
         * If a message failed to be updated in the queue, the entry includes the {@code errorCode}
         * and {@code errorMessage} fields.
         *
         * @param entries the value to set
         * @return this builder
         */
        public Builder entries(java.util.List<UpdateMessagesResultEntry> entries) {
            this.entries = entries;
            this.__explicitlySet__.add("entries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMessagesResult build() {
            UpdateMessagesResult model =
                    new UpdateMessagesResult(
                            this.serverFailures, this.clientFailures, this.entries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMessagesResult model) {
            if (model.wasPropertyExplicitlySet("serverFailures")) {
                this.serverFailures(model.getServerFailures());
            }
            if (model.wasPropertyExplicitlySet("clientFailures")) {
                this.clientFailures(model.getClientFailures());
            }
            if (model.wasPropertyExplicitlySet("entries")) {
                this.entries(model.getEntries());
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
     * The number of messages that failed to be updated in the queue because of a server failure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverFailures")
    private final Integer serverFailures;

    /**
     * The number of messages that failed to be updated in the queue because of a server failure.
     *
     * @return the value
     */
    public Integer getServerFailures() {
        return serverFailures;
    }

    /**
     * The number of messages that failed to be updated in the queue because of a client failure
     * such as an invalid receipt or invalid visibilityInSeconds.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientFailures")
    private final Integer clientFailures;

    /**
     * The number of messages that failed to be updated in the queue because of a client failure
     * such as an invalid receipt or invalid visibilityInSeconds.
     *
     * @return the value
     */
    public Integer getClientFailures() {
        return clientFailures;
    }

    /**
     * An array of items representing the result of each action. The order is guaranteed to be the
     * same as in the {@code UpdateMessagesDetails} object. If a message was successfully updated in
     * the queue, the entry includes the {@code id} and {@code visibleAfter} fields. If a message
     * failed to be updated in the queue, the entry includes the {@code errorCode} and {@code
     * errorMessage} fields.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entries")
    private final java.util.List<UpdateMessagesResultEntry> entries;

    /**
     * An array of items representing the result of each action. The order is guaranteed to be the
     * same as in the {@code UpdateMessagesDetails} object. If a message was successfully updated in
     * the queue, the entry includes the {@code id} and {@code visibleAfter} fields. If a message
     * failed to be updated in the queue, the entry includes the {@code errorCode} and {@code
     * errorMessage} fields.
     *
     * @return the value
     */
    public java.util.List<UpdateMessagesResultEntry> getEntries() {
        return entries;
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
        sb.append("UpdateMessagesResult(");
        sb.append("super=").append(super.toString());
        sb.append("serverFailures=").append(String.valueOf(this.serverFailures));
        sb.append(", clientFailures=").append(String.valueOf(this.clientFailures));
        sb.append(", entries=").append(String.valueOf(this.entries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMessagesResult)) {
            return false;
        }

        UpdateMessagesResult other = (UpdateMessagesResult) o;
        return java.util.Objects.equals(this.serverFailures, other.serverFailures)
                && java.util.Objects.equals(this.clientFailures, other.clientFailures)
                && java.util.Objects.equals(this.entries, other.entries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serverFailures == null ? 43 : this.serverFailures.hashCode());
        result =
                (result * PRIME)
                        + (this.clientFailures == null ? 43 : this.clientFailures.hashCode());
        result = (result * PRIME) + (this.entries == null ? 43 : this.entries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
