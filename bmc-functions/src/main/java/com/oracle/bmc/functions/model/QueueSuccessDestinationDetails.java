/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * The destination queue or channel in the Queue service to which to send the response of the
 * successful detached function invocation.
 *
 * <p>Example: {@code {"kind": "QUEUE", "queueId": "queue_OCID", "channelId": "channel_Id"}} <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = QueueSuccessDestinationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "kind")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueueSuccessDestinationDetails extends SuccessDestinationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * queue.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("queueId")
        private String queueId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * queue.
         *
         * @param queueId the value to set
         * @return this builder
         */
        public Builder queueId(String queueId) {
            this.queueId = queueId;
            this.__explicitlySet__.add("queueId");
            return this;
        }
        /** The ID of the channel in the queue. */
        @com.fasterxml.jackson.annotation.JsonProperty("channelId")
        private String channelId;

        /**
         * The ID of the channel in the queue.
         *
         * @param channelId the value to set
         * @return this builder
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            this.__explicitlySet__.add("channelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueueSuccessDestinationDetails build() {
            QueueSuccessDestinationDetails model =
                    new QueueSuccessDestinationDetails(this.queueId, this.channelId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueueSuccessDestinationDetails model) {
            if (model.wasPropertyExplicitlySet("queueId")) {
                this.queueId(model.getQueueId());
            }
            if (model.wasPropertyExplicitlySet("channelId")) {
                this.channelId(model.getChannelId());
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

    @Deprecated
    public QueueSuccessDestinationDetails(String queueId, String channelId) {
        super();
        this.queueId = queueId;
        this.channelId = channelId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * queue.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queueId")
    private final String queueId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * queue.
     *
     * @return the value
     */
    public String getQueueId() {
        return queueId;
    }

    /** The ID of the channel in the queue. */
    @com.fasterxml.jackson.annotation.JsonProperty("channelId")
    private final String channelId;

    /**
     * The ID of the channel in the queue.
     *
     * @return the value
     */
    public String getChannelId() {
        return channelId;
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
        sb.append("QueueSuccessDestinationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", queueId=").append(String.valueOf(this.queueId));
        sb.append(", channelId=").append(String.valueOf(this.channelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueueSuccessDestinationDetails)) {
            return false;
        }

        QueueSuccessDestinationDetails other = (QueueSuccessDestinationDetails) o;
        return java.util.Objects.equals(this.queueId, other.queueId)
                && java.util.Objects.equals(this.channelId, other.channelId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.queueId == null ? 43 : this.queueId.hashCode());
        result = (result * PRIME) + (this.channelId == null ? 43 : this.channelId.hashCode());
        return result;
    }
}
