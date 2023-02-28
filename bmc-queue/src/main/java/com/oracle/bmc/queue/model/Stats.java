/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * The stats for a queue or a dead letter queue. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Stats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Stats extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"visibleMessages", "inFlightMessages", "sizeInBytes"})
    public Stats(Long visibleMessages, Long inFlightMessages, Long sizeInBytes) {
        super();
        this.visibleMessages = visibleMessages;
        this.inFlightMessages = inFlightMessages;
        this.sizeInBytes = sizeInBytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The approximate number of visible messages (available for delivery) currently in the
         * queue.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("visibleMessages")
        private Long visibleMessages;

        /**
         * The approximate number of visible messages (available for delivery) currently in the
         * queue.
         *
         * @param visibleMessages the value to set
         * @return this builder
         */
        public Builder visibleMessages(Long visibleMessages) {
            this.visibleMessages = visibleMessages;
            this.__explicitlySet__.add("visibleMessages");
            return this;
        }
        /**
         * The approximate number of messages delivered to a consumer but not yet deleted and so
         * unavailable for re-delivery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inFlightMessages")
        private Long inFlightMessages;

        /**
         * The approximate number of messages delivered to a consumer but not yet deleted and so
         * unavailable for re-delivery.
         *
         * @param inFlightMessages the value to set
         * @return this builder
         */
        public Builder inFlightMessages(Long inFlightMessages) {
            this.inFlightMessages = inFlightMessages;
            this.__explicitlySet__.add("inFlightMessages");
            return this;
        }
        /**
         * The approximate size of the queue in bytes. Sum of the size of visible of in-flight
         * messages.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * The approximate size of the queue in bytes. Sum of the size of visible of in-flight
         * messages.
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Stats build() {
            Stats model = new Stats(this.visibleMessages, this.inFlightMessages, this.sizeInBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Stats model) {
            if (model.wasPropertyExplicitlySet("visibleMessages")) {
                this.visibleMessages(model.getVisibleMessages());
            }
            if (model.wasPropertyExplicitlySet("inFlightMessages")) {
                this.inFlightMessages(model.getInFlightMessages());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
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
     * The approximate number of visible messages (available for delivery) currently in the queue.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("visibleMessages")
    private final Long visibleMessages;

    /**
     * The approximate number of visible messages (available for delivery) currently in the queue.
     *
     * @return the value
     */
    public Long getVisibleMessages() {
        return visibleMessages;
    }

    /**
     * The approximate number of messages delivered to a consumer but not yet deleted and so
     * unavailable for re-delivery.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inFlightMessages")
    private final Long inFlightMessages;

    /**
     * The approximate number of messages delivered to a consumer but not yet deleted and so
     * unavailable for re-delivery.
     *
     * @return the value
     */
    public Long getInFlightMessages() {
        return inFlightMessages;
    }

    /**
     * The approximate size of the queue in bytes. Sum of the size of visible of in-flight messages.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * The approximate size of the queue in bytes. Sum of the size of visible of in-flight messages.
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
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
        sb.append("Stats(");
        sb.append("super=").append(super.toString());
        sb.append("visibleMessages=").append(String.valueOf(this.visibleMessages));
        sb.append(", inFlightMessages=").append(String.valueOf(this.inFlightMessages));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Stats)) {
            return false;
        }

        Stats other = (Stats) o;
        return java.util.Objects.equals(this.visibleMessages, other.visibleMessages)
                && java.util.Objects.equals(this.inFlightMessages, other.inFlightMessages)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.visibleMessages == null ? 43 : this.visibleMessages.hashCode());
        result =
                (result * PRIME)
                        + (this.inFlightMessages == null ? 43 : this.inFlightMessages.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
