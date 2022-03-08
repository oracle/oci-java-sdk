/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The information required to create a RoverCluster.
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
    builder = CreateRoverClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateRoverClusterDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
        private ClusterType clusterType;

        public Builder clusterType(ClusterType clusterType) {
            this.clusterType = clusterType;
            this.__explicitlySet__.add("clusterType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
        private String superUserPassword;

        public Builder superUserPassword(String superUserPassword) {
            this.superUserPassword = superUserPassword;
            this.__explicitlySet__.add("superUserPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
        private EnclosureType enclosureType;

        public Builder enclosureType(EnclosureType enclosureType) {
            this.enclosureType = enclosureType;
            this.__explicitlySet__.add("enclosureType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
        private String unlockPassphrase;

        public Builder unlockPassphrase(String unlockPassphrase) {
            this.unlockPassphrase = unlockPassphrase;
            this.__explicitlySet__.add("unlockPassphrase");
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

        @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
        private String oracleShippingTrackingUrl;

        public Builder oracleShippingTrackingUrl(String oracleShippingTrackingUrl) {
            this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
            this.__explicitlySet__.add("oracleShippingTrackingUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
        private Boolean isImportRequested;

        public Builder isImportRequested(Boolean isImportRequested) {
            this.isImportRequested = isImportRequested;
            this.__explicitlySet__.add("isImportRequested");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
        private String importCompartmentId;

        public Builder importCompartmentId(String importCompartmentId) {
            this.importCompartmentId = importCompartmentId;
            this.__explicitlySet__.add("importCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
        private String importFileBucket;

        public Builder importFileBucket(String importFileBucket) {
            this.importFileBucket = importFileBucket;
            this.__explicitlySet__.add("importFileBucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataValidationCode")
        private String dataValidationCode;

        public Builder dataValidationCode(String dataValidationCode) {
            this.dataValidationCode = dataValidationCode;
            this.__explicitlySet__.add("dataValidationCode");
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

        public CreateRoverClusterDetails build() {
            CreateRoverClusterDetails __instance__ =
                    new CreateRoverClusterDetails(
                            displayName,
                            compartmentId,
                            clusterSize,
                            customerShippingAddress,
                            clusterWorkloads,
                            clusterType,
                            superUserPassword,
                            enclosureType,
                            unlockPassphrase,
                            pointOfContact,
                            pointOfContactPhoneNumber,
                            shippingPreference,
                            shippingVendor,
                            timePickupExpected,
                            oracleShippingTrackingUrl,
                            subscriptionId,
                            lifecycleState,
                            lifecycleStateDetails,
                            isImportRequested,
                            importCompartmentId,
                            importFileBucket,
                            dataValidationCode,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRoverClusterDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .clusterSize(o.getClusterSize())
                            .customerShippingAddress(o.getCustomerShippingAddress())
                            .clusterWorkloads(o.getClusterWorkloads())
                            .clusterType(o.getClusterType())
                            .superUserPassword(o.getSuperUserPassword())
                            .enclosureType(o.getEnclosureType())
                            .unlockPassphrase(o.getUnlockPassphrase())
                            .pointOfContact(o.getPointOfContact())
                            .pointOfContactPhoneNumber(o.getPointOfContactPhoneNumber())
                            .shippingPreference(o.getShippingPreference())
                            .shippingVendor(o.getShippingVendor())
                            .timePickupExpected(o.getTimePickupExpected())
                            .oracleShippingTrackingUrl(o.getOracleShippingTrackingUrl())
                            .subscriptionId(o.getSubscriptionId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleStateDetails(o.getLifecycleStateDetails())
                            .isImportRequested(o.getIsImportRequested())
                            .importCompartmentId(o.getImportCompartmentId())
                            .importFileBucket(o.getImportFileBucket())
                            .dataValidationCode(o.getDataValidationCode())
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
     * The OCID of the compartment containing the RoverCluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Number of nodes desired in the cluster, in standalone clusters, between 5 and 15 inclusive. In station clusters, between 15 and 30 inclusive.
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
     * Type of cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterType")
    ClusterType clusterType;

    /**
     * Root password for the rover cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
    String superUserPassword;

    /**
     * The type of enclosure rover nodes in this cluster are shipped in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
    EnclosureType enclosureType;

    /**
     * Password to unlock the rover cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
    String unlockPassphrase;

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
     * Shipping vendor of choice for orace to customer shipping.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shippingVendor")
    String shippingVendor;

    /**
     * Expected date when customer wants to pickup the cluster if they chose customer pickup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePickupExpected")
    java.util.Date timePickupExpected;

    /**
     * Tracking Url for the shipped Rover Cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
    String oracleShippingTrackingUrl;

    /**
     * ID provided to customer after successful subscription to Rover Stations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    String subscriptionId;

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
     * The flag indicating that customer requests data to be imported to OCI upon Rover cluster return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
    Boolean isImportRequested;

    /**
     * An OCID of a compartment where data will be imported to upon Rover cluster return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
    String importCompartmentId;

    /**
     * Name of a bucket where files from NFS share will be imported to upon Rover cluster return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
    String importFileBucket;

    /**
     * Validation code returned by data validation tool. Required for return shipping label generation if data import was requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataValidationCode")
    String dataValidationCode;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle cloud infrastructure services. Each key is predefined and scoped to namespaces.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
