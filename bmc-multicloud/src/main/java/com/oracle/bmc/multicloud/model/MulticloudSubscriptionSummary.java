/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Multicloud subscription object <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MulticloudSubscriptionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MulticloudSubscriptionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "classicSubscriptionId",
        "subscriptionId",
        "partnerCloudAccountIdentifier",
        "serviceName",
        "timeLinkedDate",
        "paymentPlan",
        "activeCommitment",
        "timeEndDate",
        "lifecycleState",
        "cspAdditionalProperties",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MulticloudSubscriptionSummary(
            String classicSubscriptionId,
            String subscriptionId,
            String partnerCloudAccountIdentifier,
            SubscriptionType serviceName,
            java.util.Date timeLinkedDate,
            String paymentPlan,
            String activeCommitment,
            java.util.Date timeEndDate,
            LifecycleState lifecycleState,
            java.util.Map<String, String> cspAdditionalProperties,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.classicSubscriptionId = classicSubscriptionId;
        this.subscriptionId = subscriptionId;
        this.partnerCloudAccountIdentifier = partnerCloudAccountIdentifier;
        this.serviceName = serviceName;
        this.timeLinkedDate = timeLinkedDate;
        this.paymentPlan = paymentPlan;
        this.activeCommitment = activeCommitment;
        this.timeEndDate = timeEndDate;
        this.lifecycleState = lifecycleState;
        this.cspAdditionalProperties = cspAdditionalProperties;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Subscription ID for OCI and Partner cloud in classic format. */
        @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
        private String classicSubscriptionId;

        /**
         * Subscription ID for OCI and Partner cloud in classic format.
         *
         * @param classicSubscriptionId the value to set
         * @return this builder
         */
        public Builder classicSubscriptionId(String classicSubscriptionId) {
            this.classicSubscriptionId = classicSubscriptionId;
            this.__explicitlySet__.add("classicSubscriptionId");
            return this;
        }
        /**
         * URL to the subscription page
         * https://{console-url}/org-mgmt/subscription/ocid1.organizationssubscription.oc1.iad.amaaaaaapf266qyaqohz27zvh45jzaielgwojo53bh24s7cy5q5g7fiknpxa?region=us-ashburn-1.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * URL to the subscription page
         * https://{console-url}/org-mgmt/subscription/ocid1.organizationssubscription.oc1.iad.amaaaaaapf266qyaqohz27zvh45jzaielgwojo53bh24s7cy5q5g7fiknpxa?region=us-ashburn-1.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** The partner cloud account ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("partnerCloudAccountIdentifier")
        private String partnerCloudAccountIdentifier;

        /**
         * The partner cloud account ID.
         *
         * @param partnerCloudAccountIdentifier the value to set
         * @return this builder
         */
        public Builder partnerCloudAccountIdentifier(String partnerCloudAccountIdentifier) {
            this.partnerCloudAccountIdentifier = partnerCloudAccountIdentifier;
            this.__explicitlySet__.add("partnerCloudAccountIdentifier");
            return this;
        }
        /** The serviceName that externalLocation map object belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
        private SubscriptionType serviceName;

        /**
         * The serviceName that externalLocation map object belongs to.
         *
         * @param serviceName the value to set
         * @return this builder
         */
        public Builder serviceName(SubscriptionType serviceName) {
            this.serviceName = serviceName;
            this.__explicitlySet__.add("serviceName");
            return this;
        }
        /**
         * The date and time for when the multicloud was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLinkedDate")
        private java.util.Date timeLinkedDate;

        /**
         * The date and time for when the multicloud was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeLinkedDate the value to set
         * @return this builder
         */
        public Builder timeLinkedDate(java.util.Date timeLinkedDate) {
            this.timeLinkedDate = timeLinkedDate;
            this.__explicitlySet__.add("timeLinkedDate");
            return this;
        }
        /** Payment plan for the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("paymentPlan")
        private String paymentPlan;

        /**
         * Payment plan for the subscription.
         *
         * @param paymentPlan the value to set
         * @return this builder
         */
        public Builder paymentPlan(String paymentPlan) {
            this.paymentPlan = paymentPlan;
            this.__explicitlySet__.add("paymentPlan");
            return this;
        }
        /** Total value for the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("activeCommitment")
        private String activeCommitment;

        /**
         * Total value for the subscription.
         *
         * @param activeCommitment the value to set
         * @return this builder
         */
        public Builder activeCommitment(String activeCommitment) {
            this.activeCommitment = activeCommitment;
            this.__explicitlySet__.add("activeCommitment");
            return this;
        }
        /**
         * The date and time for when the subscription is finishing, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEndDate")
        private java.util.Date timeEndDate;

        /**
         * The date and time for when the subscription is finishing, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeEndDate the value to set
         * @return this builder
         */
        public Builder timeEndDate(java.util.Date timeEndDate) {
            this.timeEndDate = timeEndDate;
            this.__explicitlySet__.add("timeEndDate");
            return this;
        }
        /** The current state of the subscription. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the subscription.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** CSP Specific Additional Properties, AzureSubnetId for Azure */
        @com.fasterxml.jackson.annotation.JsonProperty("cspAdditionalProperties")
        private java.util.Map<String, String> cspAdditionalProperties;

        /**
         * CSP Specific Additional Properties, AzureSubnetId for Azure
         *
         * @param cspAdditionalProperties the value to set
         * @return this builder
         */
        public Builder cspAdditionalProperties(
                java.util.Map<String, String> cspAdditionalProperties) {
            this.cspAdditionalProperties = cspAdditionalProperties;
            this.__explicitlySet__.add("cspAdditionalProperties");
            return this;
        }
        /**
         * The date and time the subscription was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the subscription was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
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
         * The date and time the subscription was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the subscription was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/rfc/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace.
         *
         * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MulticloudSubscriptionSummary build() {
            MulticloudSubscriptionSummary model =
                    new MulticloudSubscriptionSummary(
                            this.classicSubscriptionId,
                            this.subscriptionId,
                            this.partnerCloudAccountIdentifier,
                            this.serviceName,
                            this.timeLinkedDate,
                            this.paymentPlan,
                            this.activeCommitment,
                            this.timeEndDate,
                            this.lifecycleState,
                            this.cspAdditionalProperties,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MulticloudSubscriptionSummary model) {
            if (model.wasPropertyExplicitlySet("classicSubscriptionId")) {
                this.classicSubscriptionId(model.getClassicSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("partnerCloudAccountIdentifier")) {
                this.partnerCloudAccountIdentifier(model.getPartnerCloudAccountIdentifier());
            }
            if (model.wasPropertyExplicitlySet("serviceName")) {
                this.serviceName(model.getServiceName());
            }
            if (model.wasPropertyExplicitlySet("timeLinkedDate")) {
                this.timeLinkedDate(model.getTimeLinkedDate());
            }
            if (model.wasPropertyExplicitlySet("paymentPlan")) {
                this.paymentPlan(model.getPaymentPlan());
            }
            if (model.wasPropertyExplicitlySet("activeCommitment")) {
                this.activeCommitment(model.getActiveCommitment());
            }
            if (model.wasPropertyExplicitlySet("timeEndDate")) {
                this.timeEndDate(model.getTimeEndDate());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("cspAdditionalProperties")) {
                this.cspAdditionalProperties(model.getCspAdditionalProperties());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** Subscription ID for OCI and Partner cloud in classic format. */
    @com.fasterxml.jackson.annotation.JsonProperty("classicSubscriptionId")
    private final String classicSubscriptionId;

    /**
     * Subscription ID for OCI and Partner cloud in classic format.
     *
     * @return the value
     */
    public String getClassicSubscriptionId() {
        return classicSubscriptionId;
    }

    /**
     * URL to the subscription page
     * https://{console-url}/org-mgmt/subscription/ocid1.organizationssubscription.oc1.iad.amaaaaaapf266qyaqohz27zvh45jzaielgwojo53bh24s7cy5q5g7fiknpxa?region=us-ashburn-1.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * URL to the subscription page
     * https://{console-url}/org-mgmt/subscription/ocid1.organizationssubscription.oc1.iad.amaaaaaapf266qyaqohz27zvh45jzaielgwojo53bh24s7cy5q5g7fiknpxa?region=us-ashburn-1.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** The partner cloud account ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("partnerCloudAccountIdentifier")
    private final String partnerCloudAccountIdentifier;

    /**
     * The partner cloud account ID.
     *
     * @return the value
     */
    public String getPartnerCloudAccountIdentifier() {
        return partnerCloudAccountIdentifier;
    }

    /** The serviceName that externalLocation map object belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceName")
    private final SubscriptionType serviceName;

    /**
     * The serviceName that externalLocation map object belongs to.
     *
     * @return the value
     */
    public SubscriptionType getServiceName() {
        return serviceName;
    }

    /**
     * The date and time for when the multicloud was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLinkedDate")
    private final java.util.Date timeLinkedDate;

    /**
     * The date and time for when the multicloud was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeLinkedDate() {
        return timeLinkedDate;
    }

    /** Payment plan for the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("paymentPlan")
    private final String paymentPlan;

    /**
     * Payment plan for the subscription.
     *
     * @return the value
     */
    public String getPaymentPlan() {
        return paymentPlan;
    }

    /** Total value for the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("activeCommitment")
    private final String activeCommitment;

    /**
     * Total value for the subscription.
     *
     * @return the value
     */
    public String getActiveCommitment() {
        return activeCommitment;
    }

    /**
     * The date and time for when the subscription is finishing, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEndDate")
    private final java.util.Date timeEndDate;

    /**
     * The date and time for when the subscription is finishing, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeEndDate() {
        return timeEndDate;
    }

    /** The current state of the subscription. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
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
    /** The current state of the subscription. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the subscription.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** CSP Specific Additional Properties, AzureSubnetId for Azure */
    @com.fasterxml.jackson.annotation.JsonProperty("cspAdditionalProperties")
    private final java.util.Map<String, String> cspAdditionalProperties;

    /**
     * CSP Specific Additional Properties, AzureSubnetId for Azure
     *
     * @return the value
     */
    public java.util.Map<String, String> getCspAdditionalProperties() {
        return cspAdditionalProperties;
    }

    /**
     * The date and time the subscription was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the subscription was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the subscription was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the subscription was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/rfc/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace.
     *
     * <p>Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("MulticloudSubscriptionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("classicSubscriptionId=").append(String.valueOf(this.classicSubscriptionId));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", partnerCloudAccountIdentifier=")
                .append(String.valueOf(this.partnerCloudAccountIdentifier));
        sb.append(", serviceName=").append(String.valueOf(this.serviceName));
        sb.append(", timeLinkedDate=").append(String.valueOf(this.timeLinkedDate));
        sb.append(", paymentPlan=").append(String.valueOf(this.paymentPlan));
        sb.append(", activeCommitment=").append(String.valueOf(this.activeCommitment));
        sb.append(", timeEndDate=").append(String.valueOf(this.timeEndDate));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", cspAdditionalProperties=")
                .append(String.valueOf(this.cspAdditionalProperties));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MulticloudSubscriptionSummary)) {
            return false;
        }

        MulticloudSubscriptionSummary other = (MulticloudSubscriptionSummary) o;
        return java.util.Objects.equals(this.classicSubscriptionId, other.classicSubscriptionId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(
                        this.partnerCloudAccountIdentifier, other.partnerCloudAccountIdentifier)
                && java.util.Objects.equals(this.serviceName, other.serviceName)
                && java.util.Objects.equals(this.timeLinkedDate, other.timeLinkedDate)
                && java.util.Objects.equals(this.paymentPlan, other.paymentPlan)
                && java.util.Objects.equals(this.activeCommitment, other.activeCommitment)
                && java.util.Objects.equals(this.timeEndDate, other.timeEndDate)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(
                        this.cspAdditionalProperties, other.cspAdditionalProperties)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.classicSubscriptionId == null
                                ? 43
                                : this.classicSubscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.partnerCloudAccountIdentifier == null
                                ? 43
                                : this.partnerCloudAccountIdentifier.hashCode());
        result = (result * PRIME) + (this.serviceName == null ? 43 : this.serviceName.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLinkedDate == null ? 43 : this.timeLinkedDate.hashCode());
        result = (result * PRIME) + (this.paymentPlan == null ? 43 : this.paymentPlan.hashCode());
        result =
                (result * PRIME)
                        + (this.activeCommitment == null ? 43 : this.activeCommitment.hashCode());
        result = (result * PRIME) + (this.timeEndDate == null ? 43 : this.timeEndDate.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.cspAdditionalProperties == null
                                ? 43
                                : this.cspAdditionalProperties.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
