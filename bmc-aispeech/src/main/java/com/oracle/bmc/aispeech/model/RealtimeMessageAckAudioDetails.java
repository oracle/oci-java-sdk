/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aispeech.model;

/**
 * Details object for the websocket ack message received from service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RealtimeMessageAckAudioDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RealtimeMessageAckAudioDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"number", "offset", "length"})
    public RealtimeMessageAckAudioDetails(Integer number, Integer offset, Integer length) {
        super();
        this.number = number;
        this.offset = offset;
        this.length = length;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sequence number of the acknowledged packet. */
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private Integer number;

        /**
         * Sequence number of the acknowledged packet.
         *
         * @param number the value to set
         * @return this builder
         */
        public Builder number(Integer number) {
            this.number = number;
            this.__explicitlySet__.add("number");
            return this;
        }
        /** Offset of the acknowledged packet. */
        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Integer offset;

        /**
         * Offset of the acknowledged packet.
         *
         * @param offset the value to set
         * @return this builder
         */
        public Builder offset(Integer offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }
        /** Length in bytes of the acknowledged packet. */
        @com.fasterxml.jackson.annotation.JsonProperty("length")
        private Integer length;

        /**
         * Length in bytes of the acknowledged packet.
         *
         * @param length the value to set
         * @return this builder
         */
        public Builder length(Integer length) {
            this.length = length;
            this.__explicitlySet__.add("length");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RealtimeMessageAckAudioDetails build() {
            RealtimeMessageAckAudioDetails model =
                    new RealtimeMessageAckAudioDetails(this.number, this.offset, this.length);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RealtimeMessageAckAudioDetails model) {
            if (model.wasPropertyExplicitlySet("number")) {
                this.number(model.getNumber());
            }
            if (model.wasPropertyExplicitlySet("offset")) {
                this.offset(model.getOffset());
            }
            if (model.wasPropertyExplicitlySet("length")) {
                this.length(model.getLength());
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

    /** Sequence number of the acknowledged packet. */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    private final Integer number;

    /**
     * Sequence number of the acknowledged packet.
     *
     * @return the value
     */
    public Integer getNumber() {
        return number;
    }

    /** Offset of the acknowledged packet. */
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    private final Integer offset;

    /**
     * Offset of the acknowledged packet.
     *
     * @return the value
     */
    public Integer getOffset() {
        return offset;
    }

    /** Length in bytes of the acknowledged packet. */
    @com.fasterxml.jackson.annotation.JsonProperty("length")
    private final Integer length;

    /**
     * Length in bytes of the acknowledged packet.
     *
     * @return the value
     */
    public Integer getLength() {
        return length;
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
        sb.append("RealtimeMessageAckAudioDetails(");
        sb.append("super=").append(super.toString());
        sb.append("number=").append(String.valueOf(this.number));
        sb.append(", offset=").append(String.valueOf(this.offset));
        sb.append(", length=").append(String.valueOf(this.length));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RealtimeMessageAckAudioDetails)) {
            return false;
        }

        RealtimeMessageAckAudioDetails other = (RealtimeMessageAckAudioDetails) o;
        return java.util.Objects.equals(this.number, other.number)
                && java.util.Objects.equals(this.offset, other.offset)
                && java.util.Objects.equals(this.length, other.length)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.number == null ? 43 : this.number.hashCode());
        result = (result * PRIME) + (this.offset == null ? 43 : this.offset.hashCode());
        result = (result * PRIME) + (this.length == null ? 43 : this.length.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
