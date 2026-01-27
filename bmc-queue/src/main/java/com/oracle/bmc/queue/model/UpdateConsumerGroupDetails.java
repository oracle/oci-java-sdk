/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * The information to be updated. <br>
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
        builder = UpdateConsumerGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateConsumerGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "filter",
        "isEnabled",
        "deadLetterQueueDeliveryCount",
        "freeformTags",
        "definedTags"
    })
    public UpdateConsumerGroupDetails(
            String displayName,
            String filter,
            Boolean isEnabled,
            Integer deadLetterQueueDeliveryCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.filter = filter;
        this.isEnabled = isEnabled;
        this.deadLetterQueueDeliveryCount = deadLetterQueueDeliveryCount;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * consumer group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * consumer group.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The filter used by the consumer group. Only messages matching the filter will be
         * available by consumers of the group.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filter")
        private String filter;

        /**
         * The filter used by the consumer group. Only messages matching the filter will be
         * available by consumers of the group.
         *
         * @param filter the value to set
         * @return this builder
         */
        public Builder filter(String filter) {
            this.filter = filter;
            this.__explicitlySet__.add("filter");
            return this;
        }
        /**
         * Used to enable or disable the consumer group. An enabled consumer group will have a
         * lifecycle state of ACTIVE, while a disabled will have its state as INACTIVE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Used to enable or disable the consumer group. An enabled consumer group will have a
         * lifecycle state of ACTIVE, while a disabled will have its state as INACTIVE.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The number of times a message can be delivered to a consumer before being moved to the
         * dead letter queue. A value of 0 indicates that the DLQ is not used. Changing that value
         * to a lower threshold does not retroactively move in-flight messages in the dead letter
         * queue. A value of -1 unsets the delivery count for the consumer group (i.e. it will now
         * be using the value set at the queue level).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deadLetterQueueDeliveryCount")
        private Integer deadLetterQueueDeliveryCount;

        /**
         * The number of times a message can be delivered to a consumer before being moved to the
         * dead letter queue. A value of 0 indicates that the DLQ is not used. Changing that value
         * to a lower threshold does not retroactively move in-flight messages in the dead letter
         * queue. A value of -1 unsets the delivery count for the consumer group (i.e. it will now
         * be using the value set at the queue level).
         *
         * @param deadLetterQueueDeliveryCount the value to set
         * @return this builder
         */
        public Builder deadLetterQueueDeliveryCount(Integer deadLetterQueueDeliveryCount) {
            this.deadLetterQueueDeliveryCount = deadLetterQueueDeliveryCount;
            this.__explicitlySet__.add("deadLetterQueueDeliveryCount");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateConsumerGroupDetails build() {
            UpdateConsumerGroupDetails model =
                    new UpdateConsumerGroupDetails(
                            this.displayName,
                            this.filter,
                            this.isEnabled,
                            this.deadLetterQueueDeliveryCount,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateConsumerGroupDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("filter")) {
                this.filter(model.getFilter());
            }
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("deadLetterQueueDeliveryCount")) {
                this.deadLetterQueueDeliveryCount(model.getDeadLetterQueueDeliveryCount());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * consumer group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * consumer group.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The filter used by the consumer group. Only messages matching the filter will be available by
     * consumers of the group.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filter")
    private final String filter;

    /**
     * The filter used by the consumer group. Only messages matching the filter will be available by
     * consumers of the group.
     *
     * @return the value
     */
    public String getFilter() {
        return filter;
    }

    /**
     * Used to enable or disable the consumer group. An enabled consumer group will have a lifecycle
     * state of ACTIVE, while a disabled will have its state as INACTIVE.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Used to enable or disable the consumer group. An enabled consumer group will have a lifecycle
     * state of ACTIVE, while a disabled will have its state as INACTIVE.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The number of times a message can be delivered to a consumer before being moved to the dead
     * letter queue. A value of 0 indicates that the DLQ is not used. Changing that value to a lower
     * threshold does not retroactively move in-flight messages in the dead letter queue. A value of
     * -1 unsets the delivery count for the consumer group (i.e. it will now be using the value set
     * at the queue level).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deadLetterQueueDeliveryCount")
    private final Integer deadLetterQueueDeliveryCount;

    /**
     * The number of times a message can be delivered to a consumer before being moved to the dead
     * letter queue. A value of 0 indicates that the DLQ is not used. Changing that value to a lower
     * threshold does not retroactively move in-flight messages in the dead letter queue. A value of
     * -1 unsets the delivery count for the consumer group (i.e. it will now be using the value set
     * at the queue level).
     *
     * @return the value
     */
    public Integer getDeadLetterQueueDeliveryCount() {
        return deadLetterQueueDeliveryCount;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateConsumerGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", filter=").append(String.valueOf(this.filter));
        sb.append(", isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", deadLetterQueueDeliveryCount=")
                .append(String.valueOf(this.deadLetterQueueDeliveryCount));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConsumerGroupDetails)) {
            return false;
        }

        UpdateConsumerGroupDetails other = (UpdateConsumerGroupDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(
                        this.deadLetterQueueDeliveryCount, other.deadLetterQueueDeliveryCount)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.deadLetterQueueDeliveryCount == null
                                ? 43
                                : this.deadLetterQueueDeliveryCount.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
