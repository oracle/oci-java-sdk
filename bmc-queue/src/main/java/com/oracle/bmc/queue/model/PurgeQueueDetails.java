/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * Purge parameters. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PurgeQueueDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PurgeQueueDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"purgeType", "channelIds"})
    public PurgeQueueDetails(PurgeType purgeType, java.util.List<String> channelIds) {
        super();
        this.purgeType = purgeType;
        this.channelIds = channelIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of the purge to perform: - NORMAL - purge only the normal queue - DLQ - purge only
         * the dead letter queue - BOTH - purge both the normal queue and the dead letter queue
         */
        @com.fasterxml.jackson.annotation.JsonProperty("purgeType")
        private PurgeType purgeType;

        /**
         * Type of the purge to perform: - NORMAL - purge only the normal queue - DLQ - purge only
         * the dead letter queue - BOTH - purge both the normal queue and the dead letter queue
         *
         * @param purgeType the value to set
         * @return this builder
         */
        public Builder purgeType(PurgeType purgeType) {
            this.purgeType = purgeType;
            this.__explicitlySet__.add("purgeType");
            return this;
        }
        /**
         * Optional parameter to specify the destination of purge operation. If the channel ID is
         * specified, the purge operation will delete all the messages in the specific channels. If
         * the channel ID is not specified, the purge operation will delete all the messages in the
         * queue and in the child channels.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("channelIds")
        private java.util.List<String> channelIds;

        /**
         * Optional parameter to specify the destination of purge operation. If the channel ID is
         * specified, the purge operation will delete all the messages in the specific channels. If
         * the channel ID is not specified, the purge operation will delete all the messages in the
         * queue and in the child channels.
         *
         * @param channelIds the value to set
         * @return this builder
         */
        public Builder channelIds(java.util.List<String> channelIds) {
            this.channelIds = channelIds;
            this.__explicitlySet__.add("channelIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PurgeQueueDetails build() {
            PurgeQueueDetails model = new PurgeQueueDetails(this.purgeType, this.channelIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PurgeQueueDetails model) {
            if (model.wasPropertyExplicitlySet("purgeType")) {
                this.purgeType(model.getPurgeType());
            }
            if (model.wasPropertyExplicitlySet("channelIds")) {
                this.channelIds(model.getChannelIds());
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
     * Type of the purge to perform: - NORMAL - purge only the normal queue - DLQ - purge only the
     * dead letter queue - BOTH - purge both the normal queue and the dead letter queue
     */
    public enum PurgeType implements com.oracle.bmc.http.internal.BmcEnum {
        Normal("NORMAL"),
        Dlq("DLQ"),
        Both("BOTH"),
        ;

        private final String value;
        private static java.util.Map<String, PurgeType> map;

        static {
            map = new java.util.HashMap<>();
            for (PurgeType v : PurgeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        PurgeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PurgeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PurgeType: " + key);
        }
    };
    /**
     * Type of the purge to perform: - NORMAL - purge only the normal queue - DLQ - purge only the
     * dead letter queue - BOTH - purge both the normal queue and the dead letter queue
     */
    @com.fasterxml.jackson.annotation.JsonProperty("purgeType")
    private final PurgeType purgeType;

    /**
     * Type of the purge to perform: - NORMAL - purge only the normal queue - DLQ - purge only the
     * dead letter queue - BOTH - purge both the normal queue and the dead letter queue
     *
     * @return the value
     */
    public PurgeType getPurgeType() {
        return purgeType;
    }

    /**
     * Optional parameter to specify the destination of purge operation. If the channel ID is
     * specified, the purge operation will delete all the messages in the specific channels. If the
     * channel ID is not specified, the purge operation will delete all the messages in the queue
     * and in the child channels.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channelIds")
    private final java.util.List<String> channelIds;

    /**
     * Optional parameter to specify the destination of purge operation. If the channel ID is
     * specified, the purge operation will delete all the messages in the specific channels. If the
     * channel ID is not specified, the purge operation will delete all the messages in the queue
     * and in the child channels.
     *
     * @return the value
     */
    public java.util.List<String> getChannelIds() {
        return channelIds;
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
        sb.append("PurgeQueueDetails(");
        sb.append("super=").append(super.toString());
        sb.append("purgeType=").append(String.valueOf(this.purgeType));
        sb.append(", channelIds=").append(String.valueOf(this.channelIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PurgeQueueDetails)) {
            return false;
        }

        PurgeQueueDetails other = (PurgeQueueDetails) o;
        return java.util.Objects.equals(this.purgeType, other.purgeType)
                && java.util.Objects.equals(this.channelIds, other.channelIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.purgeType == null ? 43 : this.purgeType.hashCode());
        result = (result * PRIME) + (this.channelIds == null ? 43 : this.channelIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
