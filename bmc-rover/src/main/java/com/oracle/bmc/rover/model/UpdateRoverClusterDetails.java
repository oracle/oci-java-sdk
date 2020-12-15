/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The information required to update a RoverCluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateRoverClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateRoverClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        public Builder clusterSize(Integer clusterSize) {
            this.clusterSize = clusterSize;
            this.__explicitlySet__.add("clusterSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterWorkloads")
        private java.util.List<RoverWorkload> clusterWorkloads;

        public Builder clusterWorkloads(java.util.List<RoverWorkload> clusterWorkloads) {
            this.clusterWorkloads = clusterWorkloads;
            this.__explicitlySet__.add("clusterWorkloads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
        private String superUserPassword;

        public Builder superUserPassword(String superUserPassword) {
            this.superUserPassword = superUserPassword;
            this.__explicitlySet__.add("superUserPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
        private String unlockPassphrase;

        public Builder unlockPassphrase(String unlockPassphrase) {
            this.unlockPassphrase = unlockPassphrase;
            this.__explicitlySet__.add("unlockPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
        private EnclosureType enclosureType;

        public Builder enclosureType(EnclosureType enclosureType) {
            this.enclosureType = enclosureType;
            this.__explicitlySet__.add("enclosureType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pointOfContact")
        private String pointOfContact;

        public Builder pointOfContact(String pointOfContact) {
            this.pointOfContact = pointOfContact;
            this.__explicitlySet__.add("pointOfContact");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pointOfContactPhoneNumber")
        private String pointOfContactPhoneNumber;

        public Builder pointOfContactPhoneNumber(String pointOfContactPhoneNumber) {
            this.pointOfContactPhoneNumber = pointOfContactPhoneNumber;
            this.__explicitlySet__.add("pointOfContactPhoneNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shippingPreference")
        private ShippingPreference shippingPreference;

        public Builder shippingPreference(ShippingPreference shippingPreference) {
            this.shippingPreference = shippingPreference;
            this.__explicitlySet__.add("shippingPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
        private String oracleShippingTrackingUrl;

        public Builder oracleShippingTrackingUrl(String oracleShippingTrackingUrl) {
            this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
            this.__explicitlySet__.add("oracleShippingTrackingUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shippingVendor")
        private String shippingVendor;

        public Builder shippingVendor(String shippingVendor) {
            this.shippingVendor = shippingVendor;
            this.__explicitlySet__.add("shippingVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timePickupExpected")
        private java.util.Date timePickupExpected;

        public Builder timePickupExpected(java.util.Date timePickupExpected) {
            this.timePickupExpected = timePickupExpected;
            this.__explicitlySet__.add("timePickupExpected");
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

        public UpdateRoverClusterDetails build() {
            UpdateRoverClusterDetails __instance__ =
                    new UpdateRoverClusterDetails(
                            displayName,
                            clusterSize,
                            customerShippingAddress,
                            clusterWorkloads,
                            superUserPassword,
                            lifecycleState,
                            lifecycleStateDetails,
                            unlockPassphrase,
                            enclosureType,
                            pointOfContact,
                            pointOfContactPhoneNumber,
                            shippingPreference,
                            oracleShippingTrackingUrl,
                            shippingVendor,
                            timePickupExpected,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRoverClusterDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .clusterSize(o.getClusterSize())
                            .customerShippingAddress(o.getCustomerShippingAddress())
                            .clusterWorkloads(o.getClusterWorkloads())
                            .superUserPassword(o.getSuperUserPassword())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleStateDetails(o.getLifecycleStateDetails())
                            .unlockPassphrase(o.getUnlockPassphrase())
                            .enclosureType(o.getEnclosureType())
                            .pointOfContact(o.getPointOfContact())
                            .pointOfContactPhoneNumber(o.getPointOfContactPhoneNumber())
                            .shippingPreference(o.getShippingPreference())
                            .oracleShippingTrackingUrl(o.getOracleShippingTrackingUrl())
                            .shippingVendor(o.getShippingVendor())
                            .timePickupExpected(o.getTimePickupExpected())
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Number of nodes desired in the cluster, between 5 and 15.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    Integer clusterSize;

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    ShippingAddress customerShippingAddress;

    /**
     * List of existing workloads that should be provisioned on the nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterWorkloads")
    java.util.List<RoverWorkload> clusterWorkloads;

    /**
     * Root password for the rover cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
    String superUserPassword;

    /**
     * The current state of the RoverCluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A property that can contain details on the lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    String lifecycleStateDetails;

    /**
     * Password to unlock the rover cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
    String unlockPassphrase;

    /**
     * The type of enclosure rover nodes in this cluster are shipped in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
    EnclosureType enclosureType;

    /**
     * Name of point of contact for this order if customer is picking up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pointOfContact")
    String pointOfContact;

    /**
     * Phone number of point of contact for this order if customer is picking up.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pointOfContactPhoneNumber")
    String pointOfContactPhoneNumber;
    /**
     * Preference for device delivery.
     **/
    public enum ShippingPreference {
        OracleShipped("ORACLE_SHIPPED"),
        CustomerPickup("CUSTOMER_PICKUP"),
        ;

        private final String value;
        private static java.util.Map<String, ShippingPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (ShippingPreference v : ShippingPreference.values()) {
                map.put(v.getValue(), v);
            }
        }

        ShippingPreference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShippingPreference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ShippingPreference: " + key);
        }
    };
    /**
     * Preference for device delivery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shippingPreference")
    ShippingPreference shippingPreference;

    /**
     * Tracking Url for the shipped Rover Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
    String oracleShippingTrackingUrl;

    /**
     * Shipping vendor of choice for orace to customer shipping.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shippingVendor")
    String shippingVendor;

    /**
     * Expected date when customer wants to pickup the device if they chose customer pickup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePickupExpected")
    java.util.Date timePickupExpected;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: `{orcl-cloud: {free-tier-retain: true}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
