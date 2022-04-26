/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * Information about a RoverNode.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RoverNode.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RoverNode {
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

        @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
        private String clusterId;

        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            this.__explicitlySet__.add("clusterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private NodeType nodeType;

        public Builder nodeType(NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
        private EnclosureType enclosureType;

        public Builder enclosureType(EnclosureType enclosureType) {
            this.enclosureType = enclosureType;
            this.__explicitlySet__.add("enclosureType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
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

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nodeWorkloads")
        private java.util.List<RoverWorkload> nodeWorkloads;

        public Builder nodeWorkloads(java.util.List<RoverWorkload> nodeWorkloads) {
            this.nodeWorkloads = nodeWorkloads;
            this.__explicitlySet__.add("nodeWorkloads");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCustomerReceieved")
        private java.util.Date timeCustomerReceieved;

        public Builder timeCustomerReceieved(java.util.Date timeCustomerReceieved) {
            this.timeCustomerReceieved = timeCustomerReceieved;
            this.__explicitlySet__.add("timeCustomerReceieved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCustomerReturned")
        private java.util.Date timeCustomerReturned;

        public Builder timeCustomerReturned(java.util.Date timeCustomerReturned) {
            this.timeCustomerReturned = timeCustomerReturned;
            this.__explicitlySet__.add("timeCustomerReturned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliveryTrackingInfo")
        private String deliveryTrackingInfo;

        public Builder deliveryTrackingInfo(String deliveryTrackingInfo) {
            this.deliveryTrackingInfo = deliveryTrackingInfo;
            this.__explicitlySet__.add("deliveryTrackingInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
        private String superUserPassword;

        public Builder superUserPassword(String superUserPassword) {
            this.superUserPassword = superUserPassword;
            this.__explicitlySet__.add("superUserPassword");
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

        @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowStarts")
        private java.util.Date timeReturnWindowStarts;

        public Builder timeReturnWindowStarts(java.util.Date timeReturnWindowStarts) {
            this.timeReturnWindowStarts = timeReturnWindowStarts;
            this.__explicitlySet__.add("timeReturnWindowStarts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
        private String oracleShippingTrackingUrl;

        public Builder oracleShippingTrackingUrl(String oracleShippingTrackingUrl) {
            this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
            this.__explicitlySet__.add("oracleShippingTrackingUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowEnds")
        private java.util.Date timeReturnWindowEnds;

        public Builder timeReturnWindowEnds(java.util.Date timeReturnWindowEnds) {
            this.timeReturnWindowEnds = timeReturnWindowEnds;
            this.__explicitlySet__.add("timeReturnWindowEnds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnShippingLabelUri")
        private String returnShippingLabelUri;

        public Builder returnShippingLabelUri(String returnShippingLabelUri) {
            this.returnShippingLabelUri = returnShippingLabelUri;
            this.__explicitlySet__.add("returnShippingLabelUri");
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

        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageExportPar")
        private String imageExportPar;

        public Builder imageExportPar(String imageExportPar) {
            this.imageExportPar = imageExportPar;
            this.__explicitlySet__.add("imageExportPar");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("masterKeyId")
        private String masterKeyId;

        public Builder masterKeyId(String masterKeyId) {
            this.masterKeyId = masterKeyId;
            this.__explicitlySet__.add("masterKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tags")
        private String tags;

        public Builder tags(String tags) {
            this.tags = tags;
            this.__explicitlySet__.add("tags");
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

        public RoverNode build() {
            RoverNode __instance__ =
                    new RoverNode(
                            id,
                            clusterId,
                            compartmentId,
                            nodeType,
                            shape,
                            enclosureType,
                            serialNumber,
                            displayName,
                            timeCreated,
                            lifecycleState,
                            lifecycleStateDetails,
                            customerShippingAddress,
                            nodeWorkloads,
                            timeCustomerReceieved,
                            timeCustomerReturned,
                            deliveryTrackingInfo,
                            superUserPassword,
                            unlockPassphrase,
                            pointOfContact,
                            pointOfContactPhoneNumber,
                            shippingPreference,
                            shippingVendor,
                            timePickupExpected,
                            timeReturnWindowStarts,
                            oracleShippingTrackingUrl,
                            timeReturnWindowEnds,
                            returnShippingLabelUri,
                            isImportRequested,
                            importCompartmentId,
                            importFileBucket,
                            dataValidationCode,
                            publicKey,
                            imageExportPar,
                            masterKeyId,
                            tags,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverNode o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .clusterId(o.getClusterId())
                            .compartmentId(o.getCompartmentId())
                            .nodeType(o.getNodeType())
                            .shape(o.getShape())
                            .enclosureType(o.getEnclosureType())
                            .serialNumber(o.getSerialNumber())
                            .displayName(o.getDisplayName())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleStateDetails(o.getLifecycleStateDetails())
                            .customerShippingAddress(o.getCustomerShippingAddress())
                            .nodeWorkloads(o.getNodeWorkloads())
                            .timeCustomerReceieved(o.getTimeCustomerReceieved())
                            .timeCustomerReturned(o.getTimeCustomerReturned())
                            .deliveryTrackingInfo(o.getDeliveryTrackingInfo())
                            .superUserPassword(o.getSuperUserPassword())
                            .unlockPassphrase(o.getUnlockPassphrase())
                            .pointOfContact(o.getPointOfContact())
                            .pointOfContactPhoneNumber(o.getPointOfContactPhoneNumber())
                            .shippingPreference(o.getShippingPreference())
                            .shippingVendor(o.getShippingVendor())
                            .timePickupExpected(o.getTimePickupExpected())
                            .timeReturnWindowStarts(o.getTimeReturnWindowStarts())
                            .oracleShippingTrackingUrl(o.getOracleShippingTrackingUrl())
                            .timeReturnWindowEnds(o.getTimeReturnWindowEnds())
                            .returnShippingLabelUri(o.getReturnShippingLabelUri())
                            .isImportRequested(o.getIsImportRequested())
                            .importCompartmentId(o.getImportCompartmentId())
                            .importFileBucket(o.getImportFileBucket())
                            .dataValidationCode(o.getDataValidationCode())
                            .publicKey(o.getPublicKey())
                            .imageExportPar(o.getImageExportPar())
                            .masterKeyId(o.getMasterKeyId())
                            .tags(o.getTags())
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
     * The OCID of RoverNode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The cluster ID if the node is part of a cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterId")
    String clusterId;

    /**
     * The OCID of the compartment containing the RoverNode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The type of node indicating if it belongs to a cluster
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    NodeType nodeType;

    /**
     * The shape of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    String shape;

    /**
     * The type of enclosure rover node is shipped in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
    EnclosureType enclosureType;

    /**
     * Serial number of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The time the the RoverNode was created. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The current state of the RoverNode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * A property that can contain details on the lifecycle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    String lifecycleStateDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    ShippingAddress customerShippingAddress;

    /**
     * List of existing workloads that should be provisioned on the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeWorkloads")
    java.util.List<RoverWorkload> nodeWorkloads;

    /**
     * Date and time when customer received tne node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCustomerReceieved")
    java.util.Date timeCustomerReceieved;

    /**
     * Date and time when customer returned the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCustomerReturned")
    java.util.Date timeCustomerReturned;

    /**
     * Tracking information for device shipping.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deliveryTrackingInfo")
    String deliveryTrackingInfo;

    /**
     * Root password for the rover node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
    String superUserPassword;

    /**
     * Password to unlock the rover node.
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
    @lombok.extern.slf4j.Slf4j
    public enum ShippingPreference {
        OracleShipped("ORACLE_SHIPPED"),
        CustomerPickup("CUSTOMER_PICKUP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ShippingPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (ShippingPreference v : ShippingPreference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShippingPreference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
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
     * Expected date when customer wants to pickup the device if they chose customer pickup.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timePickupExpected")
    java.util.Date timePickupExpected;

    /**
     * Start time for the window to pickup the device from customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowStarts")
    java.util.Date timeReturnWindowStarts;

    /**
     * Tracking Url for the shipped RoverNode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
    String oracleShippingTrackingUrl;

    /**
     * End time for the window to pickup the device from customer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowEnds")
    java.util.Date timeReturnWindowEnds;

    /**
     * Uri to download return shipping label.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("returnShippingLabelUri")
    String returnShippingLabelUri;

    /**
     * The flag indicating that customer requests data to be imported to OCI upon Rover node return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
    Boolean isImportRequested;

    /**
     * An OCID of a compartment where data will be imported to upon Rover node return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
    String importCompartmentId;

    /**
     * Name of a bucket where files from NFS share will be imported to upon Rover node return.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
    String importFileBucket;

    /**
     * Validation code returned by data validation tool. Required for return shipping label generation if data import was requested.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataValidationCode")
    String dataValidationCode;

    /**
     * The public key of the resource principal
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    String publicKey;

    /**
     * The link to pre-authenticated request for a bucket where image workloads are moved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageExportPar")
    String imageExportPar;

    /**
     * Customer provided master key ID to encrypt secret information. If not provided, Rover's master key will be used for encryption.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("masterKeyId")
    String masterKeyId;

    /**
     * The tags associated with tagSlug.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tags")
    String tags;

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
