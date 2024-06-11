/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * The stats for a queue and its dead letter queue. If channelId is specified in request field, it
 * will return channel specific stats response. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QueueStats.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class QueueStats extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"queue", "dlq", "channelId"})
    public QueueStats(Stats queue, Stats dlq, String channelId) {
        super();
        this.queue = queue;
        this.dlq = dlq;
        this.channelId = channelId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("queue")
        private Stats queue;

        public Builder queue(Stats queue) {
            this.queue = queue;
            this.__explicitlySet__.add("queue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dlq")
        private Stats dlq;

        public Builder dlq(Stats dlq) {
            this.dlq = dlq;
            this.__explicitlySet__.add("dlq");
            return this;
        }
        /**
         * If channelId is present in GetStats call, the channel id will be returned in the GetStats
         * response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("channelId")
        private String channelId;

        /**
         * If channelId is present in GetStats call, the channel id will be returned in the GetStats
         * response.
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

        public QueueStats build() {
            QueueStats model = new QueueStats(this.queue, this.dlq, this.channelId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueueStats model) {
            if (model.wasPropertyExplicitlySet("queue")) {
                this.queue(model.getQueue());
            }
            if (model.wasPropertyExplicitlySet("dlq")) {
                this.dlq(model.getDlq());
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

    @com.fasterxml.jackson.annotation.JsonProperty("queue")
    private final Stats queue;

    public Stats getQueue() {
        return queue;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dlq")
    private final Stats dlq;

    public Stats getDlq() {
        return dlq;
    }

    /**
     * If channelId is present in GetStats call, the channel id will be returned in the GetStats
     * response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channelId")
    private final String channelId;

    /**
     * If channelId is present in GetStats call, the channel id will be returned in the GetStats
     * response.
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
        sb.append("QueueStats(");
        sb.append("super=").append(super.toString());
        sb.append("queue=").append(String.valueOf(this.queue));
        sb.append(", dlq=").append(String.valueOf(this.dlq));
        sb.append(", channelId=").append(String.valueOf(this.channelId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QueueStats)) {
            return false;
        }

        QueueStats other = (QueueStats) o;
        return java.util.Objects.equals(this.queue, other.queue)
                && java.util.Objects.equals(this.dlq, other.dlq)
                && java.util.Objects.equals(this.channelId, other.channelId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.queue == null ? 43 : this.queue.hashCode());
        result = (result * PRIME) + (this.dlq == null ? 43 : this.dlq.hashCode());
        result = (result * PRIME) + (this.channelId == null ? 43 : this.channelId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
