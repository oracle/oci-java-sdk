/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.tenantmanagercontrolplane.model;

/**
 * The summary of a domain govenance entity owned by a tenancy.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DomainGovernanceSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DomainGovernanceSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ownerId")
        private String ownerId;

        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            this.__explicitlySet__.add("ownerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DomainGovernance.LifecycleState lifecycleState;

        public Builder lifecycleState(DomainGovernance.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGovernanceEnabled")
        private Boolean isGovernanceEnabled;

        public Builder isGovernanceEnabled(Boolean isGovernanceEnabled) {
            this.isGovernanceEnabled = isGovernanceEnabled;
            this.__explicitlySet__.add("isGovernanceEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionEmail")
        private String subscriptionEmail;

        public Builder subscriptionEmail(String subscriptionEmail) {
            this.subscriptionEmail = subscriptionEmail;
            this.__explicitlySet__.add("subscriptionEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
        private String onsTopicId;

        public Builder onsTopicId(String onsTopicId) {
            this.onsTopicId = onsTopicId;
            this.__explicitlySet__.add("onsTopicId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onsSubscriptionId")
        private String onsSubscriptionId;

        public Builder onsSubscriptionId(String onsSubscriptionId) {
            this.onsSubscriptionId = onsSubscriptionId;
            this.__explicitlySet__.add("onsSubscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DomainGovernanceSummary build() {
            DomainGovernanceSummary __instance__ =
                    new DomainGovernanceSummary(
                            id,
                            ownerId,
                            domainId,
                            lifecycleState,
                            isGovernanceEnabled,
                            subscriptionEmail,
                            onsTopicId,
                            onsSubscriptionId,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DomainGovernanceSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .ownerId(o.getOwnerId())
                            .domainId(o.getDomainId())
                            .lifecycleState(o.getLifecycleState())
                            .isGovernanceEnabled(o.getIsGovernanceEnabled())
                            .subscriptionEmail(o.getSubscriptionEmail())
                            .onsTopicId(o.getOnsTopicId())
                            .onsSubscriptionId(o.getOnsSubscriptionId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the domain governance entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the tenancy that owns this domain governance entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ownerId")
    String ownerId;

    /**
     * The OCID of the domain associated with this domain governance entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    String domainId;

    /**
     * The lifecycle state of the domain governance entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    DomainGovernance.LifecycleState lifecycleState;

    /**
     * Indicates whether governance is enabled for this domain.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGovernanceEnabled")
    Boolean isGovernanceEnabled;

    /**
     * The email to notify the user, and that the ONS subscription will be created with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionEmail")
    String subscriptionEmail;

    /**
     * The ONS topic associated with this domain governance entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsTopicId")
    String onsTopicId;

    /**
     * The ONS subscription associated with this domain governance entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onsSubscriptionId")
    String onsSubscriptionId;

    /**
     * Date-time when this domain governance was created. An RFC 3339-formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * Date-time when this domain governance was last updated. An RFC 3339-formatted date and time string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
