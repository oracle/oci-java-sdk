/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * Summary of missing IAM policies for a multicloud subscription. <br>
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
        builder = MulticloudPolicySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MulticloudPolicySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "subscriptionId",
        "subscriptionType",
        "groups",
        "policies",
        "lifecycleState",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public MulticloudPolicySummary(
            String subscriptionId,
            SubscriptionType subscriptionType,
            java.util.List<String> groups,
            java.util.List<MulticloudPolicy> policies,
            MulticloudPolicy.LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.subscriptionId = subscriptionId;
        this.subscriptionType = subscriptionType;
        this.groups = groups;
        this.policies = policies;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Compartment The
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Subscription
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * Compartment The
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle Subscription
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** Oracle Cloud Infrastructure Subscription Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
        private SubscriptionType subscriptionType;

        /**
         * Oracle Cloud Infrastructure Subscription Type.
         *
         * @param subscriptionType the value to set
         * @return this builder
         */
        public Builder subscriptionType(SubscriptionType subscriptionType) {
            this.subscriptionType = subscriptionType;
            this.__explicitlySet__.add("subscriptionType");
            return this;
        }
        /** groups required for the particular subscriptionType IAM policy statements required. */
        @com.fasterxml.jackson.annotation.JsonProperty("groups")
        private java.util.List<String> groups;

        /**
         * groups required for the particular subscriptionType IAM policy statements required.
         *
         * @param groups the value to set
         * @return this builder
         */
        public Builder groups(java.util.List<String> groups) {
            this.groups = groups;
            this.__explicitlySet__.add("groups");
            return this;
        }
        /** Missing policy definitions. */
        @com.fasterxml.jackson.annotation.JsonProperty("policies")
        private java.util.List<MulticloudPolicy> policies;

        /**
         * Missing policy definitions.
         *
         * @param policies the value to set
         * @return this builder
         */
        public Builder policies(java.util.List<MulticloudPolicy> policies) {
            this.policies = policies;
            this.__explicitlySet__.add("policies");
            return this;
        }
        /** The current state of the Multicloud Network Alert. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MulticloudPolicy.LifecycleState lifecycleState;

        /**
         * The current state of the Multicloud Network Alert.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(MulticloudPolicy.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        public MulticloudPolicySummary build() {
            MulticloudPolicySummary model =
                    new MulticloudPolicySummary(
                            this.subscriptionId,
                            this.subscriptionType,
                            this.groups,
                            this.policies,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MulticloudPolicySummary model) {
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("subscriptionType")) {
                this.subscriptionType(model.getSubscriptionType());
            }
            if (model.wasPropertyExplicitlySet("groups")) {
                this.groups(model.getGroups());
            }
            if (model.wasPropertyExplicitlySet("policies")) {
                this.policies(model.getPolicies());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /**
     * Compartment The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * of the Oracle Subscription
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * Compartment The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     * of the Oracle Subscription
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** Oracle Cloud Infrastructure Subscription Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
    private final SubscriptionType subscriptionType;

    /**
     * Oracle Cloud Infrastructure Subscription Type.
     *
     * @return the value
     */
    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /** groups required for the particular subscriptionType IAM policy statements required. */
    @com.fasterxml.jackson.annotation.JsonProperty("groups")
    private final java.util.List<String> groups;

    /**
     * groups required for the particular subscriptionType IAM policy statements required.
     *
     * @return the value
     */
    public java.util.List<String> getGroups() {
        return groups;
    }

    /** Missing policy definitions. */
    @com.fasterxml.jackson.annotation.JsonProperty("policies")
    private final java.util.List<MulticloudPolicy> policies;

    /**
     * Missing policy definitions.
     *
     * @return the value
     */
    public java.util.List<MulticloudPolicy> getPolicies() {
        return policies;
    }

    /** The current state of the Multicloud Network Alert. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MulticloudPolicy.LifecycleState lifecycleState;

    /**
     * The current state of the Multicloud Network Alert.
     *
     * @return the value
     */
    public MulticloudPolicy.LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("MulticloudPolicySummary(");
        sb.append("super=").append(super.toString());
        sb.append("subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", subscriptionType=").append(String.valueOf(this.subscriptionType));
        sb.append(", groups=").append(String.valueOf(this.groups));
        sb.append(", policies=").append(String.valueOf(this.policies));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof MulticloudPolicySummary)) {
            return false;
        }

        MulticloudPolicySummary other = (MulticloudPolicySummary) o;
        return java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.subscriptionType, other.subscriptionType)
                && java.util.Objects.equals(this.groups, other.groups)
                && java.util.Objects.equals(this.policies, other.policies)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
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
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionType == null ? 43 : this.subscriptionType.hashCode());
        result = (result * PRIME) + (this.groups == null ? 43 : this.groups.hashCode());
        result = (result * PRIME) + (this.policies == null ? 43 : this.policies.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
