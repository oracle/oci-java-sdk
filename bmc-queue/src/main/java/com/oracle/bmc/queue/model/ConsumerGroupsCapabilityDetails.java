/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * Specifies the details for the consumer group capability. All fields are optional and are only
 * used when the capability is added. Fields will be {@code null} when the capability is returned as
 * part of the GetQueue API. <br>
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
        builder = ConsumerGroupsCapabilityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConsumerGroupsCapabilityDetails extends CapabilityDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies if the primary consumer group should be automatically enabled after adding the
         * capability.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPrimaryConsumerGroupEnabled")
        private Boolean isPrimaryConsumerGroupEnabled;

        /**
         * Specifies if the primary consumer group should be automatically enabled after adding the
         * capability.
         *
         * @param isPrimaryConsumerGroupEnabled the value to set
         * @return this builder
         */
        public Builder isPrimaryConsumerGroupEnabled(Boolean isPrimaryConsumerGroupEnabled) {
            this.isPrimaryConsumerGroupEnabled = isPrimaryConsumerGroupEnabled;
            this.__explicitlySet__.add("isPrimaryConsumerGroupEnabled");
            return this;
        }
        /**
         * Name of the primary consumer group. If omitted, it will be named "Primary Consumer
         * Group".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryConsumerGroupDisplayName")
        private String primaryConsumerGroupDisplayName;

        /**
         * Name of the primary consumer group. If omitted, it will be named "Primary Consumer
         * Group".
         *
         * @param primaryConsumerGroupDisplayName the value to set
         * @return this builder
         */
        public Builder primaryConsumerGroupDisplayName(String primaryConsumerGroupDisplayName) {
            this.primaryConsumerGroupDisplayName = primaryConsumerGroupDisplayName;
            this.__explicitlySet__.add("primaryConsumerGroupDisplayName");
            return this;
        }
        /**
         * The filter used by the primary consumer group. Only messages matching the filter will be
         * available by consumers of the group. An empty value means that all messages will be
         * available in the group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primaryConsumerGroupFilter")
        private String primaryConsumerGroupFilter;

        /**
         * The filter used by the primary consumer group. Only messages matching the filter will be
         * available by consumers of the group. An empty value means that all messages will be
         * available in the group.
         *
         * @param primaryConsumerGroupFilter the value to set
         * @return this builder
         */
        public Builder primaryConsumerGroupFilter(String primaryConsumerGroupFilter) {
            this.primaryConsumerGroupFilter = primaryConsumerGroupFilter;
            this.__explicitlySet__.add("primaryConsumerGroupFilter");
            return this;
        }
        /**
         * The number of times a message can be delivered to a consumer before being moved to the
         * dead letter queue. A value of 0 indicates that the DLQ is not used. If the value isn't
         * set, it will be using the value defined at the queue level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty(
                "primaryConsumerGroupDeadLetterQueueDeliveryCount")
        private Integer primaryConsumerGroupDeadLetterQueueDeliveryCount;

        /**
         * The number of times a message can be delivered to a consumer before being moved to the
         * dead letter queue. A value of 0 indicates that the DLQ is not used. If the value isn't
         * set, it will be using the value defined at the queue level.
         *
         * @param primaryConsumerGroupDeadLetterQueueDeliveryCount the value to set
         * @return this builder
         */
        public Builder primaryConsumerGroupDeadLetterQueueDeliveryCount(
                Integer primaryConsumerGroupDeadLetterQueueDeliveryCount) {
            this.primaryConsumerGroupDeadLetterQueueDeliveryCount =
                    primaryConsumerGroupDeadLetterQueueDeliveryCount;
            this.__explicitlySet__.add("primaryConsumerGroupDeadLetterQueueDeliveryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConsumerGroupsCapabilityDetails build() {
            ConsumerGroupsCapabilityDetails model =
                    new ConsumerGroupsCapabilityDetails(
                            this.isPrimaryConsumerGroupEnabled,
                            this.primaryConsumerGroupDisplayName,
                            this.primaryConsumerGroupFilter,
                            this.primaryConsumerGroupDeadLetterQueueDeliveryCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConsumerGroupsCapabilityDetails model) {
            if (model.wasPropertyExplicitlySet("isPrimaryConsumerGroupEnabled")) {
                this.isPrimaryConsumerGroupEnabled(model.getIsPrimaryConsumerGroupEnabled());
            }
            if (model.wasPropertyExplicitlySet("primaryConsumerGroupDisplayName")) {
                this.primaryConsumerGroupDisplayName(model.getPrimaryConsumerGroupDisplayName());
            }
            if (model.wasPropertyExplicitlySet("primaryConsumerGroupFilter")) {
                this.primaryConsumerGroupFilter(model.getPrimaryConsumerGroupFilter());
            }
            if (model.wasPropertyExplicitlySet(
                    "primaryConsumerGroupDeadLetterQueueDeliveryCount")) {
                this.primaryConsumerGroupDeadLetterQueueDeliveryCount(
                        model.getPrimaryConsumerGroupDeadLetterQueueDeliveryCount());
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
    public ConsumerGroupsCapabilityDetails(
            Boolean isPrimaryConsumerGroupEnabled,
            String primaryConsumerGroupDisplayName,
            String primaryConsumerGroupFilter,
            Integer primaryConsumerGroupDeadLetterQueueDeliveryCount) {
        super();
        this.isPrimaryConsumerGroupEnabled = isPrimaryConsumerGroupEnabled;
        this.primaryConsumerGroupDisplayName = primaryConsumerGroupDisplayName;
        this.primaryConsumerGroupFilter = primaryConsumerGroupFilter;
        this.primaryConsumerGroupDeadLetterQueueDeliveryCount =
                primaryConsumerGroupDeadLetterQueueDeliveryCount;
    }

    /**
     * Specifies if the primary consumer group should be automatically enabled after adding the
     * capability.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrimaryConsumerGroupEnabled")
    private final Boolean isPrimaryConsumerGroupEnabled;

    /**
     * Specifies if the primary consumer group should be automatically enabled after adding the
     * capability.
     *
     * @return the value
     */
    public Boolean getIsPrimaryConsumerGroupEnabled() {
        return isPrimaryConsumerGroupEnabled;
    }

    /**
     * Name of the primary consumer group. If omitted, it will be named "Primary Consumer Group".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryConsumerGroupDisplayName")
    private final String primaryConsumerGroupDisplayName;

    /**
     * Name of the primary consumer group. If omitted, it will be named "Primary Consumer Group".
     *
     * @return the value
     */
    public String getPrimaryConsumerGroupDisplayName() {
        return primaryConsumerGroupDisplayName;
    }

    /**
     * The filter used by the primary consumer group. Only messages matching the filter will be
     * available by consumers of the group. An empty value means that all messages will be available
     * in the group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primaryConsumerGroupFilter")
    private final String primaryConsumerGroupFilter;

    /**
     * The filter used by the primary consumer group. Only messages matching the filter will be
     * available by consumers of the group. An empty value means that all messages will be available
     * in the group.
     *
     * @return the value
     */
    public String getPrimaryConsumerGroupFilter() {
        return primaryConsumerGroupFilter;
    }

    /**
     * The number of times a message can be delivered to a consumer before being moved to the dead
     * letter queue. A value of 0 indicates that the DLQ is not used. If the value isn't set, it
     * will be using the value defined at the queue level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty(
            "primaryConsumerGroupDeadLetterQueueDeliveryCount")
    private final Integer primaryConsumerGroupDeadLetterQueueDeliveryCount;

    /**
     * The number of times a message can be delivered to a consumer before being moved to the dead
     * letter queue. A value of 0 indicates that the DLQ is not used. If the value isn't set, it
     * will be using the value defined at the queue level.
     *
     * @return the value
     */
    public Integer getPrimaryConsumerGroupDeadLetterQueueDeliveryCount() {
        return primaryConsumerGroupDeadLetterQueueDeliveryCount;
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
        sb.append("ConsumerGroupsCapabilityDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isPrimaryConsumerGroupEnabled=")
                .append(String.valueOf(this.isPrimaryConsumerGroupEnabled));
        sb.append(", primaryConsumerGroupDisplayName=")
                .append(String.valueOf(this.primaryConsumerGroupDisplayName));
        sb.append(", primaryConsumerGroupFilter=")
                .append(String.valueOf(this.primaryConsumerGroupFilter));
        sb.append(", primaryConsumerGroupDeadLetterQueueDeliveryCount=")
                .append(String.valueOf(this.primaryConsumerGroupDeadLetterQueueDeliveryCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConsumerGroupsCapabilityDetails)) {
            return false;
        }

        ConsumerGroupsCapabilityDetails other = (ConsumerGroupsCapabilityDetails) o;
        return java.util.Objects.equals(
                        this.isPrimaryConsumerGroupEnabled, other.isPrimaryConsumerGroupEnabled)
                && java.util.Objects.equals(
                        this.primaryConsumerGroupDisplayName, other.primaryConsumerGroupDisplayName)
                && java.util.Objects.equals(
                        this.primaryConsumerGroupFilter, other.primaryConsumerGroupFilter)
                && java.util.Objects.equals(
                        this.primaryConsumerGroupDeadLetterQueueDeliveryCount,
                        other.primaryConsumerGroupDeadLetterQueueDeliveryCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isPrimaryConsumerGroupEnabled == null
                                ? 43
                                : this.isPrimaryConsumerGroupEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryConsumerGroupDisplayName == null
                                ? 43
                                : this.primaryConsumerGroupDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryConsumerGroupFilter == null
                                ? 43
                                : this.primaryConsumerGroupFilter.hashCode());
        result =
                (result * PRIME)
                        + (this.primaryConsumerGroupDeadLetterQueueDeliveryCount == null
                                ? 43
                                : this.primaryConsumerGroupDeadLetterQueueDeliveryCount.hashCode());
        return result;
    }
}
