/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * A ResourceAnchor is a description of a ResourceAnchor.
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Getting Started with
 * Policies](https://docs.oracle.com/iaas/Content/Identity/policiesgs/get-started-with-policies.htm).
 * <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceAnchor.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ResourceAnchor
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "region",
        "compartmentId",
        "compartmentName",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "setupMode",
        "linkedCompartmentId",
        "linkedCompartmentName",
        "subscriptionType",
        "subscriptionId",
        "cloudServiceProviderMetadataItem"
    })
    public ResourceAnchor(
            String id,
            String displayName,
            String region,
            String compartmentId,
            String compartmentName,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            SetupMode setupMode,
            String linkedCompartmentId,
            String linkedCompartmentName,
            SubscriptionType subscriptionType,
            String subscriptionId,
            CloudServiceProviderMetadataItem cloudServiceProviderMetadataItem) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.region = region;
        this.compartmentId = compartmentId;
        this.compartmentName = compartmentName;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.setupMode = setupMode;
        this.linkedCompartmentId = linkedCompartmentId;
        this.linkedCompartmentName = linkedCompartmentName;
        this.subscriptionType = subscriptionType;
        this.subscriptionId = subscriptionId;
        this.cloudServiceProviderMetadataItem = cloudServiceProviderMetadataItem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnchor.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnchor.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A user-friendly name. Does not have to be unique, and it's changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** OCI Region that resource is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * OCI Region that resource is created.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The name assigned to the compartment during creation. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
        private String compartmentName;

        /**
         * The name assigned to the compartment during creation.
         *
         * @param compartmentName the value to set
         * @return this builder
         */
        public Builder compartmentName(String compartmentName) {
            this.compartmentName = compartmentName;
            this.__explicitlySet__.add("compartmentName");
            return this;
        }
        /**
         * The date and time the ResourceAnchor was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the ResourceAnchor was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the ResourceAnchor was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the ResourceAnchor was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the ResourceAnchor. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the ResourceAnchor.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the ResourceAnchor in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the ResourceAnchor in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /**
         * AUTO_BIND - when passed compartment will be created on-behalf of customer and bind to
         * this resource anchor NO_AUTO_BIND - compartment will not be created and later customer
         * can bind existing compartment. to this resource anchor. This is for future use only
         */
        @com.fasterxml.jackson.annotation.JsonProperty("setupMode")
        private SetupMode setupMode;

        /**
         * AUTO_BIND - when passed compartment will be created on-behalf of customer and bind to
         * this resource anchor NO_AUTO_BIND - compartment will not be created and later customer
         * can bind existing compartment. to this resource anchor. This is for future use only
         *
         * @param setupMode the value to set
         * @return this builder
         */
        public Builder setupMode(SetupMode setupMode) {
            this.setupMode = setupMode;
            this.__explicitlySet__.add("setupMode");
            return this;
        }
        /**
         * Optional - Oracle Cloud Infrastructure compartment Id (OCID) which was created or linked
         * by customer with resource anchor. This compartmentId is different from where resource
         * Anchor live.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("linkedCompartmentId")
        private String linkedCompartmentId;

        /**
         * Optional - Oracle Cloud Infrastructure compartment Id (OCID) which was created or linked
         * by customer with resource anchor. This compartmentId is different from where resource
         * Anchor live.
         *
         * @param linkedCompartmentId the value to set
         * @return this builder
         */
        public Builder linkedCompartmentId(String linkedCompartmentId) {
            this.linkedCompartmentId = linkedCompartmentId;
            this.__explicitlySet__.add("linkedCompartmentId");
            return this;
        }
        /**
         * The name assigned to the compartment which was created or linked by customer with
         * resource anchor. This compartment is different from where resource Anchor live.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("linkedCompartmentName")
        private String linkedCompartmentName;

        /**
         * The name assigned to the compartment which was created or linked by customer with
         * resource anchor. This compartment is different from where resource Anchor live.
         *
         * @param linkedCompartmentName the value to set
         * @return this builder
         */
        public Builder linkedCompartmentName(String linkedCompartmentName) {
            this.linkedCompartmentName = linkedCompartmentName;
            this.__explicitlySet__.add("linkedCompartmentName");
            return this;
        }
        /** subscription type */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
        private SubscriptionType subscriptionType;

        /**
         * subscription type
         *
         * @param subscriptionType the value to set
         * @return this builder
         */
        public Builder subscriptionType(SubscriptionType subscriptionType) {
            this.subscriptionType = subscriptionType;
            this.__explicitlySet__.add("subscriptionType");
            return this;
        }
        /** Oracle Cloud Infrastructure Subscription Id */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * Oracle Cloud Infrastructure Subscription Id
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudServiceProviderMetadataItem")
        private CloudServiceProviderMetadataItem cloudServiceProviderMetadataItem;

        public Builder cloudServiceProviderMetadataItem(
                CloudServiceProviderMetadataItem cloudServiceProviderMetadataItem) {
            this.cloudServiceProviderMetadataItem = cloudServiceProviderMetadataItem;
            this.__explicitlySet__.add("cloudServiceProviderMetadataItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ResourceAnchor build() {
            ResourceAnchor model =
                    new ResourceAnchor(
                            this.id,
                            this.displayName,
                            this.region,
                            this.compartmentId,
                            this.compartmentName,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.setupMode,
                            this.linkedCompartmentId,
                            this.linkedCompartmentName,
                            this.subscriptionType,
                            this.subscriptionId,
                            this.cloudServiceProviderMetadataItem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceAnchor model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("compartmentName")) {
                this.compartmentName(model.getCompartmentName());
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
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
            }
            if (model.wasPropertyExplicitlySet("setupMode")) {
                this.setupMode(model.getSetupMode());
            }
            if (model.wasPropertyExplicitlySet("linkedCompartmentId")) {
                this.linkedCompartmentId(model.getLinkedCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("linkedCompartmentName")) {
                this.linkedCompartmentName(model.getLinkedCompartmentName());
            }
            if (model.wasPropertyExplicitlySet("subscriptionType")) {
                this.subscriptionType(model.getSubscriptionType());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("cloudServiceProviderMetadataItem")) {
                this.cloudServiceProviderMetadataItem(model.getCloudServiceProviderMetadataItem());
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
     * ResourceAnchor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnchor.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A user-friendly name. Does not have to be unique, and it's changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** OCI Region that resource is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * OCI Region that resource is created.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The name assigned to the compartment during creation. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentName")
    private final String compartmentName;

    /**
     * The name assigned to the compartment during creation.
     *
     * @return the value
     */
    public String getCompartmentName() {
        return compartmentName;
    }

    /**
     * The date and time the ResourceAnchor was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the ResourceAnchor was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the ResourceAnchor was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the ResourceAnchor was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the ResourceAnchor. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

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
    /** The current state of the ResourceAnchor. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the ResourceAnchor.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the ResourceAnchor in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the ResourceAnchor in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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

    /**
     * AUTO_BIND - when passed compartment will be created on-behalf of customer and bind to this
     * resource anchor NO_AUTO_BIND - compartment will not be created and later customer can bind
     * existing compartment. to this resource anchor. This is for future use only
     */
    public enum SetupMode implements com.oracle.bmc.http.internal.BmcEnum {
        AutoBind("AUTO_BIND"),
        NoAutoBind("NO_AUTO_BIND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SetupMode.class);

        private final String value;
        private static java.util.Map<String, SetupMode> map;

        static {
            map = new java.util.HashMap<>();
            for (SetupMode v : SetupMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SetupMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SetupMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SetupMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * AUTO_BIND - when passed compartment will be created on-behalf of customer and bind to this
     * resource anchor NO_AUTO_BIND - compartment will not be created and later customer can bind
     * existing compartment. to this resource anchor. This is for future use only
     */
    @com.fasterxml.jackson.annotation.JsonProperty("setupMode")
    private final SetupMode setupMode;

    /**
     * AUTO_BIND - when passed compartment will be created on-behalf of customer and bind to this
     * resource anchor NO_AUTO_BIND - compartment will not be created and later customer can bind
     * existing compartment. to this resource anchor. This is for future use only
     *
     * @return the value
     */
    public SetupMode getSetupMode() {
        return setupMode;
    }

    /**
     * Optional - Oracle Cloud Infrastructure compartment Id (OCID) which was created or linked by
     * customer with resource anchor. This compartmentId is different from where resource Anchor
     * live.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linkedCompartmentId")
    private final String linkedCompartmentId;

    /**
     * Optional - Oracle Cloud Infrastructure compartment Id (OCID) which was created or linked by
     * customer with resource anchor. This compartmentId is different from where resource Anchor
     * live.
     *
     * @return the value
     */
    public String getLinkedCompartmentId() {
        return linkedCompartmentId;
    }

    /**
     * The name assigned to the compartment which was created or linked by customer with resource
     * anchor. This compartment is different from where resource Anchor live.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("linkedCompartmentName")
    private final String linkedCompartmentName;

    /**
     * The name assigned to the compartment which was created or linked by customer with resource
     * anchor. This compartment is different from where resource Anchor live.
     *
     * @return the value
     */
    public String getLinkedCompartmentName() {
        return linkedCompartmentName;
    }

    /** subscription type */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionType")
    private final SubscriptionType subscriptionType;

    /**
     * subscription type
     *
     * @return the value
     */
    public SubscriptionType getSubscriptionType() {
        return subscriptionType;
    }

    /** Oracle Cloud Infrastructure Subscription Id */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * Oracle Cloud Infrastructure Subscription Id
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudServiceProviderMetadataItem")
    private final CloudServiceProviderMetadataItem cloudServiceProviderMetadataItem;

    public CloudServiceProviderMetadataItem getCloudServiceProviderMetadataItem() {
        return cloudServiceProviderMetadataItem;
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
        sb.append("ResourceAnchor(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", compartmentName=").append(String.valueOf(this.compartmentName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", setupMode=").append(String.valueOf(this.setupMode));
        sb.append(", linkedCompartmentId=").append(String.valueOf(this.linkedCompartmentId));
        sb.append(", linkedCompartmentName=").append(String.valueOf(this.linkedCompartmentName));
        sb.append(", subscriptionType=").append(String.valueOf(this.subscriptionType));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", cloudServiceProviderMetadataItem=")
                .append(String.valueOf(this.cloudServiceProviderMetadataItem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceAnchor)) {
            return false;
        }

        ResourceAnchor other = (ResourceAnchor) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compartmentName, other.compartmentName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.setupMode, other.setupMode)
                && java.util.Objects.equals(this.linkedCompartmentId, other.linkedCompartmentId)
                && java.util.Objects.equals(this.linkedCompartmentName, other.linkedCompartmentName)
                && java.util.Objects.equals(this.subscriptionType, other.subscriptionType)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(
                        this.cloudServiceProviderMetadataItem,
                        other.cloudServiceProviderMetadataItem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentName == null ? 43 : this.compartmentName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.setupMode == null ? 43 : this.setupMode.hashCode());
        result =
                (result * PRIME)
                        + (this.linkedCompartmentId == null
                                ? 43
                                : this.linkedCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.linkedCompartmentName == null
                                ? 43
                                : this.linkedCompartmentName.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionType == null ? 43 : this.subscriptionType.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudServiceProviderMetadataItem == null
                                ? 43
                                : this.cloudServiceProviderMetadataItem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
