/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.multicloud.model;

/**
 * A NetworkAnchor is a description of a NetworkAnchor.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NetworkAnchor.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkAnchor extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "resourceAnchorId",
        "timeCreated",
        "timeUpdated",
        "networkAnchorLifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags",
        "setupMode",
        "clusterPlacementGroupId",
        "ociMetadataItem",
        "cloudServiceProviderMetadataItem",
        "subscriptionType"
    })
    public NetworkAnchor(
            String id,
            String displayName,
            String compartmentId,
            String resourceAnchorId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            NetworkAnchorLifecycleState networkAnchorLifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            SetupMode setupMode,
            String clusterPlacementGroupId,
            OciNetworkMetadata ociMetadataItem,
            CloudServiceProviderNetworkMetadataItem cloudServiceProviderMetadataItem,
            SubscriptionType subscriptionType) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.resourceAnchorId = resourceAnchorId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.networkAnchorLifecycleState = networkAnchorLifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
        this.setupMode = setupMode;
        this.clusterPlacementGroupId = clusterPlacementGroupId;
        this.ociMetadataItem = ociMetadataItem;
        this.cloudServiceProviderMetadataItem = cloudServiceProviderMetadataItem;
        this.subscriptionType = subscriptionType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NetworkAnchor.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * NetworkAnchor.
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
        /** OCI resource anchor Id (OCID). */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAnchorId")
        private String resourceAnchorId;

        /**
         * OCI resource anchor Id (OCID).
         *
         * @param resourceAnchorId the value to set
         * @return this builder
         */
        public Builder resourceAnchorId(String resourceAnchorId) {
            this.resourceAnchorId = resourceAnchorId;
            this.__explicitlySet__.add("resourceAnchorId");
            return this;
        }
        /**
         * The date and time the NetworkAnchor was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the NetworkAnchor was created, in the format defined by [RFC
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
         * The date and time the NetworkAnchor was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the NetworkAnchor was updated, in the format defined by [RFC
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
        /** The current state of the NetworkAnchor. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorLifecycleState")
        private NetworkAnchorLifecycleState networkAnchorLifecycleState;

        /**
         * The current state of the NetworkAnchor.
         *
         * @param networkAnchorLifecycleState the value to set
         * @return this builder
         */
        public Builder networkAnchorLifecycleState(
                NetworkAnchorLifecycleState networkAnchorLifecycleState) {
            this.networkAnchorLifecycleState = networkAnchorLifecycleState;
            this.__explicitlySet__.add("networkAnchorLifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the NetworkAnchor in more detail. For
         * example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the NetworkAnchor in more detail. For
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
        /** The CPG ID in which Network Anchor will be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
        private String clusterPlacementGroupId;

        /**
         * The CPG ID in which Network Anchor will be created.
         *
         * @param clusterPlacementGroupId the value to set
         * @return this builder
         */
        public Builder clusterPlacementGroupId(String clusterPlacementGroupId) {
            this.clusterPlacementGroupId = clusterPlacementGroupId;
            this.__explicitlySet__.add("clusterPlacementGroupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ociMetadataItem")
        private OciNetworkMetadata ociMetadataItem;

        public Builder ociMetadataItem(OciNetworkMetadata ociMetadataItem) {
            this.ociMetadataItem = ociMetadataItem;
            this.__explicitlySet__.add("ociMetadataItem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cloudServiceProviderMetadataItem")
        private CloudServiceProviderNetworkMetadataItem cloudServiceProviderMetadataItem;

        public Builder cloudServiceProviderMetadataItem(
                CloudServiceProviderNetworkMetadataItem cloudServiceProviderMetadataItem) {
            this.cloudServiceProviderMetadataItem = cloudServiceProviderMetadataItem;
            this.__explicitlySet__.add("cloudServiceProviderMetadataItem");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkAnchor build() {
            NetworkAnchor model =
                    new NetworkAnchor(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.resourceAnchorId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.networkAnchorLifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags,
                            this.setupMode,
                            this.clusterPlacementGroupId,
                            this.ociMetadataItem,
                            this.cloudServiceProviderMetadataItem,
                            this.subscriptionType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkAnchor model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceAnchorId")) {
                this.resourceAnchorId(model.getResourceAnchorId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("networkAnchorLifecycleState")) {
                this.networkAnchorLifecycleState(model.getNetworkAnchorLifecycleState());
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
            if (model.wasPropertyExplicitlySet("clusterPlacementGroupId")) {
                this.clusterPlacementGroupId(model.getClusterPlacementGroupId());
            }
            if (model.wasPropertyExplicitlySet("ociMetadataItem")) {
                this.ociMetadataItem(model.getOciMetadataItem());
            }
            if (model.wasPropertyExplicitlySet("cloudServiceProviderMetadataItem")) {
                this.cloudServiceProviderMetadataItem(model.getCloudServiceProviderMetadataItem());
            }
            if (model.wasPropertyExplicitlySet("subscriptionType")) {
                this.subscriptionType(model.getSubscriptionType());
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
     * NetworkAnchor.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * NetworkAnchor.
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

    /** OCI resource anchor Id (OCID). */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAnchorId")
    private final String resourceAnchorId;

    /**
     * OCI resource anchor Id (OCID).
     *
     * @return the value
     */
    public String getResourceAnchorId() {
        return resourceAnchorId;
    }

    /**
     * The date and time the NetworkAnchor was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the NetworkAnchor was created, in the format defined by [RFC
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
     * The date and time the NetworkAnchor was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the NetworkAnchor was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the NetworkAnchor. */
    public enum NetworkAnchorLifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
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
                org.slf4j.LoggerFactory.getLogger(NetworkAnchorLifecycleState.class);

        private final String value;
        private static java.util.Map<String, NetworkAnchorLifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkAnchorLifecycleState v : NetworkAnchorLifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkAnchorLifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkAnchorLifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkAnchorLifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current state of the NetworkAnchor. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkAnchorLifecycleState")
    private final NetworkAnchorLifecycleState networkAnchorLifecycleState;

    /**
     * The current state of the NetworkAnchor.
     *
     * @return the value
     */
    public NetworkAnchorLifecycleState getNetworkAnchorLifecycleState() {
        return networkAnchorLifecycleState;
    }

    /**
     * A message that describes the current state of the NetworkAnchor in more detail. For example,
     * can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the NetworkAnchor in more detail. For example,
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

    /** The CPG ID in which Network Anchor will be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterPlacementGroupId")
    private final String clusterPlacementGroupId;

    /**
     * The CPG ID in which Network Anchor will be created.
     *
     * @return the value
     */
    public String getClusterPlacementGroupId() {
        return clusterPlacementGroupId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ociMetadataItem")
    private final OciNetworkMetadata ociMetadataItem;

    public OciNetworkMetadata getOciMetadataItem() {
        return ociMetadataItem;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cloudServiceProviderMetadataItem")
    private final CloudServiceProviderNetworkMetadataItem cloudServiceProviderMetadataItem;

    public CloudServiceProviderNetworkMetadataItem getCloudServiceProviderMetadataItem() {
        return cloudServiceProviderMetadataItem;
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
        sb.append("NetworkAnchor(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceAnchorId=").append(String.valueOf(this.resourceAnchorId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", networkAnchorLifecycleState=")
                .append(String.valueOf(this.networkAnchorLifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(", setupMode=").append(String.valueOf(this.setupMode));
        sb.append(", clusterPlacementGroupId=")
                .append(String.valueOf(this.clusterPlacementGroupId));
        sb.append(", ociMetadataItem=").append(String.valueOf(this.ociMetadataItem));
        sb.append(", cloudServiceProviderMetadataItem=")
                .append(String.valueOf(this.cloudServiceProviderMetadataItem));
        sb.append(", subscriptionType=").append(String.valueOf(this.subscriptionType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkAnchor)) {
            return false;
        }

        NetworkAnchor other = (NetworkAnchor) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceAnchorId, other.resourceAnchorId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(
                        this.networkAnchorLifecycleState, other.networkAnchorLifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && java.util.Objects.equals(this.setupMode, other.setupMode)
                && java.util.Objects.equals(
                        this.clusterPlacementGroupId, other.clusterPlacementGroupId)
                && java.util.Objects.equals(this.ociMetadataItem, other.ociMetadataItem)
                && java.util.Objects.equals(
                        this.cloudServiceProviderMetadataItem,
                        other.cloudServiceProviderMetadataItem)
                && java.util.Objects.equals(this.subscriptionType, other.subscriptionType)
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
        result =
                (result * PRIME)
                        + (this.resourceAnchorId == null ? 43 : this.resourceAnchorId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.networkAnchorLifecycleState == null
                                ? 43
                                : this.networkAnchorLifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + (this.setupMode == null ? 43 : this.setupMode.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterPlacementGroupId == null
                                ? 43
                                : this.clusterPlacementGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.ociMetadataItem == null ? 43 : this.ociMetadataItem.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudServiceProviderMetadataItem == null
                                ? 43
                                : this.cloudServiceProviderMetadataItem.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionType == null ? 43 : this.subscriptionType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
