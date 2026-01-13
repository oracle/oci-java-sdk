/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * A list of the messages published to a queue. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PutMessages.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PutMessages extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"messages"})
    public PutMessages(java.util.List<PutMessage> messages) {
        super();
        this.messages = messages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The messages that have been published to a queue. */
        @com.fasterxml.jackson.annotation.JsonProperty("messages")
        private java.util.List<PutMessage> messages;

        /**
         * The messages that have been published to a queue.
         *
         * @param messages the value to set
         * @return this builder
         */
        public Builder messages(java.util.List<PutMessage> messages) {
            this.messages = messages;
            this.__explicitlySet__.add("messages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PutMessages build() {
            PutMessages model = new PutMessages(this.messages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PutMessages model) {
            if (model.wasPropertyExplicitlySet("messages")) {
                this.messages(model.getMessages());
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

    /** The messages that have been published to a queue. */
    @com.fasterxml.jackson.annotation.JsonProperty("messages")
    private final java.util.List<PutMessage> messages;

    /**
     * The messages that have been published to a queue.
     *
     * @return the value
     */
    public java.util.List<PutMessage> getMessages() {
        return messages;
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
        sb.append("PutMessages(");
        sb.append("super=").append(super.toString());
        sb.append("messages=").append(String.valueOf(this.messages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PutMessages)) {
            return false;
        }

        PutMessages other = (PutMessages) o;
        return java.util.Objects.equals(this.messages, other.messages) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.messages == null ? 43 : this.messages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
