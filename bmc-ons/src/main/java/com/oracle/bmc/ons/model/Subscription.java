/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ons.model;

/**
 * The subscription's configuration. For general information about subscriptions, see
 * [Notifications Overview](https://docs.oracle.com/iaas/Content/Notification/Concepts/notificationoverview.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Subscription.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Subscription extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "topicId",
        "protocol",
        "endpoint",
        "lifecycleState",
        "compartmentId",
        "createdTime",
        "deliverPolicy",
        "etag",
        "freeformTags",
        "definedTags"
    })
    public Subscription(
            String id,
            String topicId,
            String protocol,
            String endpoint,
            LifecycleState lifecycleState,
            String compartmentId,
            Long createdTime,
            String deliverPolicy,
            String etag,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.topicId = topicId;
        this.protocol = protocol;
        this.endpoint = endpoint;
        this.lifecycleState = lifecycleState;
        this.compartmentId = compartmentId;
        this.createdTime = createdTime;
        this.deliverPolicy = deliverPolicy;
        this.etag = etag;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated topic.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("topicId")
        private String topicId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated topic.
         *
         * @param topicId the value to set
         * @return this builder
         **/
        public Builder topicId(String topicId) {
            this.topicId = topicId;
            this.__explicitlySet__.add("topicId");
            return this;
        }
        /**
         * The protocol used for the subscription.
         * <p>
         * Allowed values:
         *   * {@code CUSTOM_HTTPS}
         *   * {@code EMAIL}
         *   * {@code HTTPS} (deprecated; for PagerDuty endpoints, use {@code PAGERDUTY})
         *   * {@code ORACLE_FUNCTIONS}
         *   * {@code PAGERDUTY}
         *   * {@code SLACK}
         *   * {@code SMS}
         * <p>
         * For information about subscription protocols, see
         * [To create a subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protocol")
        private String protocol;

        /**
         * The protocol used for the subscription.
         * <p>
         * Allowed values:
         *   * {@code CUSTOM_HTTPS}
         *   * {@code EMAIL}
         *   * {@code HTTPS} (deprecated; for PagerDuty endpoints, use {@code PAGERDUTY})
         *   * {@code ORACLE_FUNCTIONS}
         *   * {@code PAGERDUTY}
         *   * {@code SLACK}
         *   * {@code SMS}
         * <p>
         * For information about subscription protocols, see
         * [To create a subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
         *
         * @param protocol the value to set
         * @return this builder
         **/
        public Builder protocol(String protocol) {
            this.protocol = protocol;
            this.__explicitlySet__.add("protocol");
            return this;
        }
        /**
         * A locator that corresponds to the subscription protocol.
         * For example, an email address for a subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that uses an HTTP-based protocol.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * A locator that corresponds to the subscription protocol.
         * For example, an email address for a subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that uses an HTTP-based protocol.
         *
         * @param endpoint the value to set
         * @return this builder
         **/
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /**
         * The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
         *
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for the subscription.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for the subscription.
         *
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The time when this suscription was created.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("createdTime")
        private Long createdTime;

        /**
         * The time when this suscription was created.
         *
         * @param createdTime the value to set
         * @return this builder
         **/
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            this.__explicitlySet__.add("createdTime");
            return this;
        }
        /**
         * The delivery policy of the subscription. Stored as a JSON string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("deliverPolicy")
        private String deliverPolicy;

        /**
         * The delivery policy of the subscription. Stored as a JSON string.
         * @param deliverPolicy the value to set
         * @return this builder
         **/
        public Builder deliverPolicy(String deliverPolicy) {
            this.deliverPolicy = deliverPolicy;
            this.__explicitlySet__.add("deliverPolicy");
            return this;
        }
        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("etag")
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         **/
        public Builder etag(String etag) {
            this.etag = etag;
            this.__explicitlySet__.add("etag");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Subscription build() {
            Subscription model =
                    new Subscription(
                            this.id,
                            this.topicId,
                            this.protocol,
                            this.endpoint,
                            this.lifecycleState,
                            this.compartmentId,
                            this.createdTime,
                            this.deliverPolicy,
                            this.etag,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Subscription model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("topicId")) {
                this.topicId(model.getTopicId());
            }
            if (model.wasPropertyExplicitlySet("protocol")) {
                this.protocol(model.getProtocol());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("createdTime")) {
                this.createdTime(model.getCreatedTime());
            }
            if (model.wasPropertyExplicitlySet("deliverPolicy")) {
                this.deliverPolicy(model.getDeliverPolicy());
            }
            if (model.wasPropertyExplicitlySet("etag")) {
                this.etag(model.getEtag());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the subscription.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated topic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("topicId")
    private final String topicId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the associated topic.
     *
     * @return the value
     **/
    public String getTopicId() {
        return topicId;
    }

    /**
     * The protocol used for the subscription.
     * <p>
     * Allowed values:
     *   * {@code CUSTOM_HTTPS}
     *   * {@code EMAIL}
     *   * {@code HTTPS} (deprecated; for PagerDuty endpoints, use {@code PAGERDUTY})
     *   * {@code ORACLE_FUNCTIONS}
     *   * {@code PAGERDUTY}
     *   * {@code SLACK}
     *   * {@code SMS}
     * <p>
     * For information about subscription protocols, see
     * [To create a subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protocol")
    private final String protocol;

    /**
     * The protocol used for the subscription.
     * <p>
     * Allowed values:
     *   * {@code CUSTOM_HTTPS}
     *   * {@code EMAIL}
     *   * {@code HTTPS} (deprecated; for PagerDuty endpoints, use {@code PAGERDUTY})
     *   * {@code ORACLE_FUNCTIONS}
     *   * {@code PAGERDUTY}
     *   * {@code SLACK}
     *   * {@code SMS}
     * <p>
     * For information about subscription protocols, see
     * [To create a subscription](https://docs.oracle.com/iaas/Content/Notification/Tasks/managingtopicsandsubscriptions.htm#createSub).
     *
     * @return the value
     **/
    public String getProtocol() {
        return protocol;
    }

    /**
     * A locator that corresponds to the subscription protocol.
     * For example, an email address for a subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that uses an HTTP-based protocol.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * A locator that corresponds to the subscription protocol.
     * For example, an email address for a subscription that uses the {@code EMAIL} protocol, or a URL for a subscription that uses an HTTP-based protocol.
     *
     * @return the value
     **/
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
     *
     **/
    public enum LifecycleState {
        Pending("PENDING"),
        Active("ACTIVE"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The lifecycle state of the subscription. The status of a new subscription is PENDING; when confirmed, the subscription status changes to ACTIVE.
     *
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for the subscription.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment for the subscription.
     *
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The time when this suscription was created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createdTime")
    private final Long createdTime;

    /**
     * The time when this suscription was created.
     *
     * @return the value
     **/
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * The delivery policy of the subscription. Stored as a JSON string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deliverPolicy")
    private final String deliverPolicy;

    /**
     * The delivery policy of the subscription. Stored as a JSON string.
     * @return the value
     **/
    public String getDeliverPolicy() {
        return deliverPolicy;
    }

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("etag")
    private final String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     **/
    public String getEtag() {
        return etag;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Subscription(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", topicId=").append(String.valueOf(this.topicId));
        sb.append(", protocol=").append(String.valueOf(this.protocol));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", createdTime=").append(String.valueOf(this.createdTime));
        sb.append(", deliverPolicy=").append(String.valueOf(this.deliverPolicy));
        sb.append(", etag=").append(String.valueOf(this.etag));
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
        if (!(o instanceof Subscription)) {
            return false;
        }

        Subscription other = (Subscription) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.topicId, other.topicId)
                && java.util.Objects.equals(this.protocol, other.protocol)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.createdTime, other.createdTime)
                && java.util.Objects.equals(this.deliverPolicy, other.deliverPolicy)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.topicId == null ? 43 : this.topicId.hashCode());
        result = (result * PRIME) + (this.protocol == null ? 43 : this.protocol.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.createdTime == null ? 43 : this.createdTime.hashCode());
        result =
                (result * PRIME)
                        + (this.deliverPolicy == null ? 43 : this.deliverPolicy.hashCode());
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
