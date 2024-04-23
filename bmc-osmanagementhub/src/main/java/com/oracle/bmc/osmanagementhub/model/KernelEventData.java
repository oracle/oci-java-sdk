/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Information about the kernel event. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = KernelEventData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KernelEventData
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "content",
        "count",
        "eventFingerprint",
        "reason",
        "timeFirstOccurred",
        "additionalDetails"
    })
    public KernelEventData(
            KernelEventContent content,
            Integer count,
            String eventFingerprint,
            String reason,
            java.util.Date timeFirstOccurred,
            KernelEventAdditionalDetails additionalDetails) {
        super();
        this.content = content;
        this.count = count;
        this.eventFingerprint = eventFingerprint;
        this.reason = reason;
        this.timeFirstOccurred = timeFirstOccurred;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private KernelEventContent content;

        public Builder content(KernelEventContent content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** Number of times the event has occurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * Number of times the event has occurred.
         *
         * @param count the value to set
         * @return this builder
         */
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }
        /** Fingerprint of the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("eventFingerprint")
        private String eventFingerprint;

        /**
         * Fingerprint of the event.
         *
         * @param eventFingerprint the value to set
         * @return this builder
         */
        public Builder eventFingerprint(String eventFingerprint) {
            this.eventFingerprint = eventFingerprint;
            this.__explicitlySet__.add("eventFingerprint");
            return this;
        }
        /** Reason for the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * Reason for the event.
         *
         * @param reason the value to set
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }
        /** The date and time that the event first occurred. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstOccurred")
        private java.util.Date timeFirstOccurred;

        /**
         * The date and time that the event first occurred.
         *
         * @param timeFirstOccurred the value to set
         * @return this builder
         */
        public Builder timeFirstOccurred(java.util.Date timeFirstOccurred) {
            this.timeFirstOccurred = timeFirstOccurred;
            this.__explicitlySet__.add("timeFirstOccurred");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private KernelEventAdditionalDetails additionalDetails;

        public Builder additionalDetails(KernelEventAdditionalDetails additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KernelEventData build() {
            KernelEventData model =
                    new KernelEventData(
                            this.content,
                            this.count,
                            this.eventFingerprint,
                            this.reason,
                            this.timeFirstOccurred,
                            this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KernelEventData model) {
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
            }
            if (model.wasPropertyExplicitlySet("eventFingerprint")) {
                this.eventFingerprint(model.getEventFingerprint());
            }
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
            }
            if (model.wasPropertyExplicitlySet("timeFirstOccurred")) {
                this.timeFirstOccurred(model.getTimeFirstOccurred());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final KernelEventContent content;

    public KernelEventContent getContent() {
        return content;
    }

    /** Number of times the event has occurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * Number of times the event has occurred.
     *
     * @return the value
     */
    public Integer getCount() {
        return count;
    }

    /** Fingerprint of the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("eventFingerprint")
    private final String eventFingerprint;

    /**
     * Fingerprint of the event.
     *
     * @return the value
     */
    public String getEventFingerprint() {
        return eventFingerprint;
    }

    /** Reason for the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * Reason for the event.
     *
     * @return the value
     */
    public String getReason() {
        return reason;
    }

    /** The date and time that the event first occurred. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstOccurred")
    private final java.util.Date timeFirstOccurred;

    /**
     * The date and time that the event first occurred.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstOccurred() {
        return timeFirstOccurred;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final KernelEventAdditionalDetails additionalDetails;

    public KernelEventAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("KernelEventData(");
        sb.append("super=").append(super.toString());
        sb.append("content=").append(String.valueOf(this.content));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(", eventFingerprint=").append(String.valueOf(this.eventFingerprint));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(", timeFirstOccurred=").append(String.valueOf(this.timeFirstOccurred));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KernelEventData)) {
            return false;
        }

        KernelEventData other = (KernelEventData) o;
        return java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.count, other.count)
                && java.util.Objects.equals(this.eventFingerprint, other.eventFingerprint)
                && java.util.Objects.equals(this.reason, other.reason)
                && java.util.Objects.equals(this.timeFirstOccurred, other.timeFirstOccurred)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        result =
                (result * PRIME)
                        + (this.eventFingerprint == null ? 43 : this.eventFingerprint.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstOccurred == null ? 43 : this.timeFirstOccurred.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
