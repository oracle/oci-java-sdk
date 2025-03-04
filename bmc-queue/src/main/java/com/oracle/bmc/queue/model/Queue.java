/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.queue.model;

/**
 * A detailed representation of a queue and its configuration. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Queue.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Queue extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "messagesEndpoint",
        "retentionInSeconds",
        "visibilityInSeconds",
        "timeoutInSeconds",
        "deadLetterQueueDeliveryCount",
        "customEncryptionKeyId",
        "freeformTags",
        "definedTags",
        "systemTags",
        "channelConsumptionLimit"
    })
    public Queue(
            String id,
            String displayName,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String messagesEndpoint,
            Integer retentionInSeconds,
            Integer visibilityInSeconds,
            Integer timeoutInSeconds,
            Integer deadLetterQueueDeliveryCount,
            String customEncryptionKeyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            Integer channelConsumptionLimit) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.messagesEndpoint = messagesEndpoint;
        this.retentionInSeconds = retentionInSeconds;
        this.visibilityInSeconds = visibilityInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
        this.deadLetterQueueDeliveryCount = deadLetterQueueDeliveryCount;
        this.customEncryptionKeyId = customEncryptionKeyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.channelConsumptionLimit = channelConsumptionLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A unique identifier for the queue that is immutable on creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier for the queue that is immutable on creation.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name for the queue. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the queue. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
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
        /**
         * The time that the queue was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-20T00:00:07.405Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time that the queue was created, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-20T00:00:07.405Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time that the queue was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-20T00:00:07.405Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time that the queue was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
         *
         * <p>Example: {@code 2018-04-20T00:00:07.405Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the queue. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the queue.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** Any additional details about the current state of the queue. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Any additional details about the current state of the queue.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** The endpoint to use to consume or publish messages in the queue. */
        @com.fasterxml.jackson.annotation.JsonProperty("messagesEndpoint")
        private String messagesEndpoint;

        /**
         * The endpoint to use to consume or publish messages in the queue.
         *
         * @param messagesEndpoint the value to set
         * @return this builder
         */
        public Builder messagesEndpoint(String messagesEndpoint) {
            this.messagesEndpoint = messagesEndpoint;
            this.__explicitlySet__.add("messagesEndpoint");
            return this;
        }
        /** The retention period of the messages in the queue, in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionInSeconds")
        private Integer retentionInSeconds;

        /**
         * The retention period of the messages in the queue, in seconds.
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Queue build() {
            Queue model =
                    new Queue(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.messagesEndpoint,
                            this.retentionInSeconds,
                            this.visibilityInSeconds,
                            this.timeoutInSeconds,
                            this.deadLetterQueueDeliveryCount,
                            this.customEncryptionKeyId,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.channelConsumptionLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Queue model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("messagesEndpoint")) {
                this.messagesEndpoint(model.getMessagesEndpoint());
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
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("channelConsumptionLimit")) {
                this.channelConsumptionLimit(model.getChannelConsumptionLimit());
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

    /** A unique identifier for the queue that is immutable on creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier for the queue that is immutable on creation.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name for the queue. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the queue. Does not have to be unique, and it's changeable. Avoid
     * entering confidential information.
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

    /**
     * The time that the queue was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-20T00:00:07.405Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time that the queue was created, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-20T00:00:07.405Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time that the queue was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-20T00:00:07.405Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time that the queue was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339) timestamp format.
     *
     * <p>Example: {@code 2018-04-20T00:00:07.405Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the queue. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),
        Inactive("INACTIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the queue. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the queue.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** Any additional details about the current state of the queue. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Any additional details about the current state of the queue.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** The endpoint to use to consume or publish messages in the queue. */
    @com.fasterxml.jackson.annotation.JsonProperty("messagesEndpoint")
    private final String messagesEndpoint;

    /**
     * The endpoint to use to consume or publish messages in the queue.
     *
     * @return the value
     */
    public String getMessagesEndpoint() {
        return messagesEndpoint;
    }

    /** The retention period of the messages in the queue, in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionInSeconds")
    private final Integer retentionInSeconds;

    /**
     * The retention period of the messages in the queue, in seconds.
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

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("Queue(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", messagesEndpoint=").append(String.valueOf(this.messagesEndpoint));
        sb.append(", retentionInSeconds=").append(String.valueOf(this.retentionInSeconds));
        sb.append(", visibilityInSeconds=").append(String.valueOf(this.visibilityInSeconds));
        sb.append(", timeoutInSeconds=").append(String.valueOf(this.timeoutInSeconds));
        sb.append(", deadLetterQueueDeliveryCount=")
                .append(String.valueOf(this.deadLetterQueueDeliveryCount));
        sb.append(", customEncryptionKeyId=").append(String.valueOf(this.customEncryptionKeyId));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", channelConsumptionLimit=")
                .append(String.valueOf(this.channelConsumptionLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Queue)) {
            return false;
        }

        Queue other = (Queue) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.messagesEndpoint, other.messagesEndpoint)
                && java.util.Objects.equals(this.retentionInSeconds, other.retentionInSeconds)
                && java.util.Objects.equals(this.visibilityInSeconds, other.visibilityInSeconds)
                && java.util.Objects.equals(this.timeoutInSeconds, other.timeoutInSeconds)
                && java.util.Objects.equals(
                        this.deadLetterQueueDeliveryCount, other.deadLetterQueueDeliveryCount)
                && java.util.Objects.equals(this.customEncryptionKeyId, other.customEncryptionKeyId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(
                        this.channelConsumptionLimit, other.channelConsumptionLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.messagesEndpoint == null ? 43 : this.messagesEndpoint.hashCode());
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
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result =
                (result * PRIME)
                        + (this.channelConsumptionLimit == null
                                ? 43
                                : this.channelConsumptionLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
