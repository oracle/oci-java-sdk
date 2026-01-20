/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * The information about a new queue. <br>
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
        builder = CreateQueueDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateQueueDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "retentionInSeconds",
        "visibilityInSeconds",
        "timeoutInSeconds",
        "channelConsumptionLimit",
        "deadLetterQueueDeliveryCount",
        "customEncryptionKeyId",
        "freeformTags",
        "definedTags"
    })
    public CreateQueueDetails(
            String displayName,
            String compartmentId,
            Integer retentionInSeconds,
            Integer visibilityInSeconds,
            Integer timeoutInSeconds,
            Integer channelConsumptionLimit,
            Integer deadLetterQueueDeliveryCount,
            String customEncryptionKeyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.retentionInSeconds = retentionInSeconds;
        this.visibilityInSeconds = visibilityInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
        this.channelConsumptionLimit = channelConsumptionLimit;
        this.deadLetterQueueDeliveryCount = deadLetterQueueDeliveryCount;
        this.customEncryptionKeyId = customEncryptionKeyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The user-friendly name of the queue. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name of the queue.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the queue.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the queue.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The retention period of messages in the queue, in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionInSeconds")
        private Integer retentionInSeconds;

        /**
         * The retention period of messages in the queue, in seconds.
         *
         * @param retentionInSeconds the value to set
         * @return this builder
         */
        public Builder retentionInSeconds(Integer retentionInSeconds) {
            this.retentionInSeconds = retentionInSeconds;
            this.__explicitlySet__.add("retentionInSeconds");
            return this;
        }
        /** The default visibility timeout of the messages consumed from the queue, in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("visibilityInSeconds")
        private Integer visibilityInSeconds;

        /**
         * The default visibility timeout of the messages consumed from the queue, in seconds.
         *
         * @param visibilityInSeconds the value to set
         * @return this builder
         */
        public Builder visibilityInSeconds(Integer visibilityInSeconds) {
            this.visibilityInSeconds = visibilityInSeconds;
            this.__explicitlySet__.add("visibilityInSeconds");
            return this;
        }
        /** The default polling timeout of the messages in the queue, in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
        private Integer timeoutInSeconds;

        /**
         * The default polling timeout of the messages in the queue, in seconds.
         *
         * @param timeoutInSeconds the value to set
         * @return this builder
         */
        public Builder timeoutInSeconds(Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            this.__explicitlySet__.add("timeoutInSeconds");
            return this;
        }
        /**
         * The percentage of allocated queue resources that can be consumed by a single channel. For
         * example, if a queue has a storage limit of 2Gb, and a single channel consumption limit is
         * 0.1 (10%), that means data size of a single channel can't exceed 200Mb. Consumption limit
         * of 100% (default) means that a single channel can consume up-to all allocated queue's
         * resources.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("channelConsumptionLimit")
        private Integer channelConsumptionLimit;

        /**
         * The percentage of allocated queue resources that can be consumed by a single channel. For
         * example, if a queue has a storage limit of 2Gb, and a single channel consumption limit is
         * 0.1 (10%), that means data size of a single channel can't exceed 200Mb. Consumption limit
         * of 100% (default) means that a single channel can consume up-to all allocated queue's
         * resources.
         *
         * @param channelConsumptionLimit the value to set
         * @return this builder
         */
        public Builder channelConsumptionLimit(Integer channelConsumptionLimit) {
            this.channelConsumptionLimit = channelConsumptionLimit;
            this.__explicitlySet__.add("channelConsumptionLimit");
            return this;
        }
        /**
         * The number of times a message can be delivered to a consumer before being moved to the
         * dead letter queue. A value of 0 indicates that the DLQ is not used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("deadLetterQueueDeliveryCount")
        private Integer deadLetterQueueDeliveryCount;

        /**
         * The number of times a message can be delivered to a consumer before being moved to the
         * dead letter queue. A value of 0 indicates that the DLQ is not used.
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * custom encryption key to be used to encrypt messages content.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionKeyId")
        private String customEncryptionKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * custom encryption key to be used to encrypt messages content.
         *
         * @param customEncryptionKeyId the value to set
         * @return this builder
         */
        public Builder customEncryptionKeyId(String customEncryptionKeyId) {
            this.customEncryptionKeyId = customEncryptionKeyId;
            this.__explicitlySet__.add("customEncryptionKeyId");
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

        public CreateQueueDetails build() {
            CreateQueueDetails model =
                    new CreateQueueDetails(
                            this.displayName,
                            this.compartmentId,
                            this.retentionInSeconds,
                            this.visibilityInSeconds,
                            this.timeoutInSeconds,
                            this.channelConsumptionLimit,
                            this.deadLetterQueueDeliveryCount,
                            this.customEncryptionKeyId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateQueueDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("retentionInSeconds")) {
                this.retentionInSeconds(model.getRetentionInSeconds());
            }
            if (model.wasPropertyExplicitlySet("visibilityInSeconds")) {
                this.visibilityInSeconds(model.getVisibilityInSeconds());
            }
            if (model.wasPropertyExplicitlySet("timeoutInSeconds")) {
                this.timeoutInSeconds(model.getTimeoutInSeconds());
            }
            if (model.wasPropertyExplicitlySet("channelConsumptionLimit")) {
                this.channelConsumptionLimit(model.getChannelConsumptionLimit());
            }
            if (model.wasPropertyExplicitlySet("deadLetterQueueDeliveryCount")) {
                this.deadLetterQueueDeliveryCount(model.getDeadLetterQueueDeliveryCount());
            }
            if (model.wasPropertyExplicitlySet("customEncryptionKeyId")) {
                this.customEncryptionKeyId(model.getCustomEncryptionKeyId());
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

    /** The user-friendly name of the queue. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name of the queue.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the queue.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the queue.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The retention period of messages in the queue, in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInSeconds")
    private final Integer retentionInSeconds;

    /**
     * The retention period of messages in the queue, in seconds.
     *
     * @return the value
     */
    public Integer getRetentionInSeconds() {
        return retentionInSeconds;
    }

    /** The default visibility timeout of the messages consumed from the queue, in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("visibilityInSeconds")
    private final Integer visibilityInSeconds;

    /**
     * The default visibility timeout of the messages consumed from the queue, in seconds.
     *
     * @return the value
     */
    public Integer getVisibilityInSeconds() {
        return visibilityInSeconds;
    }

    /** The default polling timeout of the messages in the queue, in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeoutInSeconds")
    private final Integer timeoutInSeconds;

    /**
     * The default polling timeout of the messages in the queue, in seconds.
     *
     * @return the value
     */
    public Integer getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * The percentage of allocated queue resources that can be consumed by a single channel. For
     * example, if a queue has a storage limit of 2Gb, and a single channel consumption limit is 0.1
     * (10%), that means data size of a single channel can't exceed 200Mb. Consumption limit of 100%
     * (default) means that a single channel can consume up-to all allocated queue's resources.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("channelConsumptionLimit")
    private final Integer channelConsumptionLimit;

    /**
     * The percentage of allocated queue resources that can be consumed by a single channel. For
     * example, if a queue has a storage limit of 2Gb, and a single channel consumption limit is 0.1
     * (10%), that means data size of a single channel can't exceed 200Mb. Consumption limit of 100%
     * (default) means that a single channel can consume up-to all allocated queue's resources.
     *
     * @return the value
     */
    public Integer getChannelConsumptionLimit() {
        return channelConsumptionLimit;
    }

    /**
     * The number of times a message can be delivered to a consumer before being moved to the dead
     * letter queue. A value of 0 indicates that the DLQ is not used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("deadLetterQueueDeliveryCount")
    private final Integer deadLetterQueueDeliveryCount;

    /**
     * The number of times a message can be delivered to a consumer before being moved to the dead
     * letter queue. A value of 0 indicates that the DLQ is not used.
     *
     * @return the value
     */
    public Integer getDeadLetterQueueDeliveryCount() {
        return deadLetterQueueDeliveryCount;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * custom encryption key to be used to encrypt messages content.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customEncryptionKeyId")
    private final String customEncryptionKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * custom encryption key to be used to encrypt messages content.
     *
     * @return the value
     */
    public String getCustomEncryptionKeyId() {
        return customEncryptionKeyId;
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
        sb.append("CreateQueueDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", retentionInSeconds=").append(String.valueOf(this.retentionInSeconds));
        sb.append(", visibilityInSeconds=").append(String.valueOf(this.visibilityInSeconds));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", channelConsumptionLimit=")
                .append(String.valueOf(this.channelConsumptionLimit));
        sb.append(", deadLetterQueueDeliveryCount=")
                .append(String.valueOf(this.deadLetterQueueDeliveryCount));
        sb.append(", customEncryptionKeyId=").append(String.valueOf(this.customEncryptionKeyId));
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
        if (!(o instanceof CreateQueueDetails)) {
            return false;
        }

        CreateQueueDetails other = (CreateQueueDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.retentionInSeconds, other.retentionInSeconds)
                && java.util.Objects.equals(this.visibilityInSeconds, other.visibilityInSeconds)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(
                        this.channelConsumptionLimit, other.channelConsumptionLimit)
                && java.util.Objects.equals(
                        this.deadLetterQueueDeliveryCount, other.deadLetterQueueDeliveryCount)
                && java.util.Objects.equals(this.customEncryptionKeyId, other.customEncryptionKeyId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionInSeconds == null
                                ? 43
                                : this.retentionInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.visibilityInSeconds == null
                                ? 43
                                : this.visibilityInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.timeoutInSeconds == null ? 43 : this.timeoutInSeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.channelConsumptionLimit == null
                                ? 43
                                : this.channelConsumptionLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.deadLetterQueueDeliveryCount == null
                                ? 43
                                : this.deadLetterQueueDeliveryCount.hashCode());
        result =
                (result * PRIME)
                        + (this.customEncryptionKeyId == null
                                ? 43
                                : this.customEncryptionKeyId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
