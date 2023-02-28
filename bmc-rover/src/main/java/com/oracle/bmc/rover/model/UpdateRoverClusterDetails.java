/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The information required to update a RoverCluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateRoverClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateRoverClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "clusterSize",
        "customerShippingAddress",
        "clusterWorkloads",
        "superUserPassword",
        "lifecycleState",
        "lifecycleStateDetails",
        "unlockPassphrase",
        "enclosureType",
        "pointOfContact",
        "pointOfContactPhoneNumber",
        "shippingPreference",
        "oracleShippingTrackingUrl",
        "subscriptionId",
        "shippingVendor",
        "timePickupExpected",
        "isImportRequested",
        "importCompartmentId",
        "importFileBucket",
        "dataValidationCode",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public UpdateRoverClusterDetails(
            String displayName,
            Integer clusterSize,
            ShippingAddress customerShippingAddress,
            java.util.List<RoverWorkload> clusterWorkloads,
            String superUserPassword,
            LifecycleState lifecycleState,
            String lifecycleStateDetails,
            String unlockPassphrase,
            EnclosureType enclosureType,
            String pointOfContact,
            String pointOfContactPhoneNumber,
            ShippingPreference shippingPreference,
            String oracleShippingTrackingUrl,
            String subscriptionId,
            String shippingVendor,
            java.util.Date timePickupExpected,
            Boolean isImportRequested,
            String importCompartmentId,
            String importFileBucket,
            String dataValidationCode,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.clusterSize = clusterSize;
        this.customerShippingAddress = customerShippingAddress;
        this.clusterWorkloads = clusterWorkloads;
        this.superUserPassword = superUserPassword;
        this.lifecycleState = lifecycleState;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.unlockPassphrase = unlockPassphrase;
        this.enclosureType = enclosureType;
        this.pointOfContact = pointOfContact;
        this.pointOfContactPhoneNumber = pointOfContactPhoneNumber;
        this.shippingPreference = shippingPreference;
        this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
        this.subscriptionId = subscriptionId;
        this.shippingVendor = shippingVendor;
        this.timePickupExpected = timePickupExpected;
        this.isImportRequested = isImportRequested;
        this.importCompartmentId = importCompartmentId;
        this.importFileBucket = importFileBucket;
        this.dataValidationCode = dataValidationCode;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
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
         * Number of nodes desired in the cluster, in standalone clusters, between 5 and 15
         * inclusive. In station clusters, between 15 and 30 inclusive.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
        private Integer clusterSize;

        /**
         * Number of nodes desired in the cluster, in standalone clusters, between 5 and 15
         * inclusive. In station clusters, between 15 and 30 inclusive.
         *
         * @param clusterSize the value to set
         * @return this builder
         */
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
        /** List of existing workloads that should be provisioned on the nodes. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterWorkloads")
        private java.util.List<RoverWorkload> clusterWorkloads;

        /**
         * List of existing workloads that should be provisioned on the nodes.
         *
         * @param clusterWorkloads the value to set
         * @return this builder
         */
        public Builder clusterWorkloads(java.util.List<RoverWorkload> clusterWorkloads) {
            this.clusterWorkloads = clusterWorkloads;
            this.__explicitlySet__.add("clusterWorkloads");
            return this;
        }
        /** Root password for the rover cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
        private String superUserPassword;

        /**
         * Root password for the rover cluster.
         *
         * @param superUserPassword the value to set
         * @return this builder
         */
        public Builder superUserPassword(String superUserPassword) {
            this.superUserPassword = superUserPassword;
            this.__explicitlySet__.add("superUserPassword");
            return this;
        }
        /** The current state of the RoverCluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the RoverCluster.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** A property that can contain details on the lifecycle. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private String lifecycleStateDetails;

        /**
         * A property that can contain details on the lifecycle.
         *
         * @param lifecycleStateDetails the value to set
         * @return this builder
         */
        public Builder lifecycleStateDetails(String lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }
        /** Password to unlock the rover cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
        private String unlockPassphrase;

        /**
         * Password to unlock the rover cluster.
         *
         * @param unlockPassphrase the value to set
         * @return this builder
         */
        public Builder unlockPassphrase(String unlockPassphrase) {
            this.unlockPassphrase = unlockPassphrase;
            this.__explicitlySet__.add("unlockPassphrase");
            return this;
        }
        /** The type of enclosure rover nodes in this cluster are shipped in. */
        @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
        private EnclosureType enclosureType;

        /**
         * The type of enclosure rover nodes in this cluster are shipped in.
         *
         * @param enclosureType the value to set
         * @return this builder
         */
        public Builder enclosureType(EnclosureType enclosureType) {
            this.enclosureType = enclosureType;
            this.__explicitlySet__.add("enclosureType");
            return this;
        }
        /** Name of point of contact for this order if customer is picking up. */
        @com.fasterxml.jackson.annotation.JsonProperty("pointOfContact")
        private String pointOfContact;

        /**
         * Name of point of contact for this order if customer is picking up.
         *
         * @param pointOfContact the value to set
         * @return this builder
         */
        public Builder pointOfContact(String pointOfContact) {
            this.pointOfContact = pointOfContact;
            this.__explicitlySet__.add("pointOfContact");
            return this;
        }
        /** Phone number of point of contact for this order if customer is picking up. */
        @com.fasterxml.jackson.annotation.JsonProperty("pointOfContactPhoneNumber")
        private String pointOfContactPhoneNumber;

        /**
         * Phone number of point of contact for this order if customer is picking up.
         *
         * @param pointOfContactPhoneNumber the value to set
         * @return this builder
         */
        public Builder pointOfContactPhoneNumber(String pointOfContactPhoneNumber) {
            this.pointOfContactPhoneNumber = pointOfContactPhoneNumber;
            this.__explicitlySet__.add("pointOfContactPhoneNumber");
            return this;
        }
        /** Preference for device delivery. */
        @com.fasterxml.jackson.annotation.JsonProperty("shippingPreference")
        private ShippingPreference shippingPreference;

        /**
         * Preference for device delivery.
         *
         * @param shippingPreference the value to set
         * @return this builder
         */
        public Builder shippingPreference(ShippingPreference shippingPreference) {
            this.shippingPreference = shippingPreference;
            this.__explicitlySet__.add("shippingPreference");
            return this;
        }
        /** Tracking Url for the shipped Rover Cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
        private String oracleShippingTrackingUrl;

        /**
         * Tracking Url for the shipped Rover Cluster.
         *
         * @param oracleShippingTrackingUrl the value to set
         * @return this builder
         */
        public Builder oracleShippingTrackingUrl(String oracleShippingTrackingUrl) {
            this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
            this.__explicitlySet__.add("oracleShippingTrackingUrl");
            return this;
        }
        /** ID provided to customer after successful subscription to Rover Stations. */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * ID provided to customer after successful subscription to Rover Stations.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /** Shipping vendor of choice for orace to customer shipping. */
        @com.fasterxml.jackson.annotation.JsonProperty("shippingVendor")
        private String shippingVendor;

        /**
         * Shipping vendor of choice for orace to customer shipping.
         *
         * @param shippingVendor the value to set
         * @return this builder
         */
        public Builder shippingVendor(String shippingVendor) {
            this.shippingVendor = shippingVendor;
            this.__explicitlySet__.add("shippingVendor");
            return this;
        }
        /** Expected date when customer wants to pickup the device if they chose customer pickup. */
        @com.fasterxml.jackson.annotation.JsonProperty("timePickupExpected")
        private java.util.Date timePickupExpected;

        /**
         * Expected date when customer wants to pickup the device if they chose customer pickup.
         *
         * @param timePickupExpected the value to set
         * @return this builder
         */
        public Builder timePickupExpected(java.util.Date timePickupExpected) {
            this.timePickupExpected = timePickupExpected;
            this.__explicitlySet__.add("timePickupExpected");
            return this;
        }
        /**
         * The flag indicating that customer requests data to be imported to OCI upon Rover cluster
         * return.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
        private Boolean isImportRequested;

        /**
         * The flag indicating that customer requests data to be imported to OCI upon Rover cluster
         * return.
         *
         * @param isImportRequested the value to set
         * @return this builder
         */
        public Builder isImportRequested(Boolean isImportRequested) {
            this.isImportRequested = isImportRequested;
            this.__explicitlySet__.add("isImportRequested");
            return this;
        }
        /** An OCID of a compartment where data will be imported to upon Rover cluster return. */
        @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
        private String importCompartmentId;

        /**
         * An OCID of a compartment where data will be imported to upon Rover cluster return.
         *
         * @param importCompartmentId the value to set
         * @return this builder
         */
        public Builder importCompartmentId(String importCompartmentId) {
            this.importCompartmentId = importCompartmentId;
            this.__explicitlySet__.add("importCompartmentId");
            return this;
        }
        /**
         * Name of a bucket where files from NFS share will be imported to upon Rover cluster
         * return.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
        private String importFileBucket;

        /**
         * Name of a bucket where files from NFS share will be imported to upon Rover cluster
         * return.
         *
         * @param importFileBucket the value to set
         * @return this builder
         */
        public Builder importFileBucket(String importFileBucket) {
            this.importFileBucket = importFileBucket;
            this.__explicitlySet__.add("importFileBucket");
            return this;
        }
        /**
         * Validation code returned by data validation tool. Required for return shipping label
         * generation if data import was requested.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dataValidationCode")
        private String dataValidationCode;

        /**
         * Validation code returned by data validation tool. Required for return shipping label
         * generation if data import was requested.
         *
         * @param dataValidationCode the value to set
         * @return this builder
         */
        public Builder dataValidationCode(String dataValidationCode) {
            this.dataValidationCode = dataValidationCode;
            this.__explicitlySet__.add("dataValidationCode");
            return this;
        }
        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
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
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
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
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {orcl-cloud: {free-tier-retain: true}}}
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

        public UpdateRoverClusterDetails build() {
            UpdateRoverClusterDetails model =
                    new UpdateRoverClusterDetails(
                            this.displayName,
                            this.clusterSize,
                            this.customerShippingAddress,
                            this.clusterWorkloads,
                            this.superUserPassword,
                            this.lifecycleState,
                            this.lifecycleStateDetails,
                            this.unlockPassphrase,
                            this.enclosureType,
                            this.pointOfContact,
                            this.pointOfContactPhoneNumber,
                            this.shippingPreference,
                            this.oracleShippingTrackingUrl,
                            this.subscriptionId,
                            this.shippingVendor,
                            this.timePickupExpected,
                            this.isImportRequested,
                            this.importCompartmentId,
                            this.importFileBucket,
                            this.dataValidationCode,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRoverClusterDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("clusterSize")) {
                this.clusterSize(model.getClusterSize());
            }
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("clusterWorkloads")) {
                this.clusterWorkloads(model.getClusterWorkloads());
            }
            if (model.wasPropertyExplicitlySet("superUserPassword")) {
                this.superUserPassword(model.getSuperUserPassword());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("unlockPassphrase")) {
                this.unlockPassphrase(model.getUnlockPassphrase());
            }
            if (model.wasPropertyExplicitlySet("enclosureType")) {
                this.enclosureType(model.getEnclosureType());
            }
            if (model.wasPropertyExplicitlySet("pointOfContact")) {
                this.pointOfContact(model.getPointOfContact());
            }
            if (model.wasPropertyExplicitlySet("pointOfContactPhoneNumber")) {
                this.pointOfContactPhoneNumber(model.getPointOfContactPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("shippingPreference")) {
                this.shippingPreference(model.getShippingPreference());
            }
            if (model.wasPropertyExplicitlySet("oracleShippingTrackingUrl")) {
                this.oracleShippingTrackingUrl(model.getOracleShippingTrackingUrl());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("shippingVendor")) {
                this.shippingVendor(model.getShippingVendor());
            }
            if (model.wasPropertyExplicitlySet("timePickupExpected")) {
                this.timePickupExpected(model.getTimePickupExpected());
            }
            if (model.wasPropertyExplicitlySet("isImportRequested")) {
                this.isImportRequested(model.getIsImportRequested());
            }
            if (model.wasPropertyExplicitlySet("importCompartmentId")) {
                this.importCompartmentId(model.getImportCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("importFileBucket")) {
                this.importFileBucket(model.getImportFileBucket());
            }
            if (model.wasPropertyExplicitlySet("dataValidationCode")) {
                this.dataValidationCode(model.getDataValidationCode());
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
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Number of nodes desired in the cluster, in standalone clusters, between 5 and 15 inclusive.
     * In station clusters, between 15 and 30 inclusive.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterSize")
    private final Integer clusterSize;

    /**
     * Number of nodes desired in the cluster, in standalone clusters, between 5 and 15 inclusive.
     * In station clusters, between 15 and 30 inclusive.
     *
     * @return the value
     */
    public Integer getClusterSize() {
        return clusterSize;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /** List of existing workloads that should be provisioned on the nodes. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterWorkloads")
    private final java.util.List<RoverWorkload> clusterWorkloads;

    /**
     * List of existing workloads that should be provisioned on the nodes.
     *
     * @return the value
     */
    public java.util.List<RoverWorkload> getClusterWorkloads() {
        return clusterWorkloads;
    }

    /** Root password for the rover cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
    private final String superUserPassword;

    /**
     * Root password for the rover cluster.
     *
     * @return the value
     */
    public String getSuperUserPassword() {
        return superUserPassword;
    }

    /** The current state of the RoverCluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the RoverCluster.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** A property that can contain details on the lifecycle. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    private final String lifecycleStateDetails;

    /**
     * A property that can contain details on the lifecycle.
     *
     * @return the value
     */
    public String getLifecycleStateDetails() {
        return lifecycleStateDetails;
    }

    /** Password to unlock the rover cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
    private final String unlockPassphrase;

    /**
     * Password to unlock the rover cluster.
     *
     * @return the value
     */
    public String getUnlockPassphrase() {
        return unlockPassphrase;
    }

    /** The type of enclosure rover nodes in this cluster are shipped in. */
    @com.fasterxml.jackson.annotation.JsonProperty("enclosureType")
    private final EnclosureType enclosureType;

    /**
     * The type of enclosure rover nodes in this cluster are shipped in.
     *
     * @return the value
     */
    public EnclosureType getEnclosureType() {
        return enclosureType;
    }

    /** Name of point of contact for this order if customer is picking up. */
    @com.fasterxml.jackson.annotation.JsonProperty("pointOfContact")
    private final String pointOfContact;

    /**
     * Name of point of contact for this order if customer is picking up.
     *
     * @return the value
     */
    public String getPointOfContact() {
        return pointOfContact;
    }

    /** Phone number of point of contact for this order if customer is picking up. */
    @com.fasterxml.jackson.annotation.JsonProperty("pointOfContactPhoneNumber")
    private final String pointOfContactPhoneNumber;

    /**
     * Phone number of point of contact for this order if customer is picking up.
     *
     * @return the value
     */
    public String getPointOfContactPhoneNumber() {
        return pointOfContactPhoneNumber;
    }

    /** Preference for device delivery. */
    public enum ShippingPreference implements com.oracle.bmc.http.internal.BmcEnum {
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
    /** Preference for device delivery. */
    @com.fasterxml.jackson.annotation.JsonProperty("shippingPreference")
    private final ShippingPreference shippingPreference;

    /**
     * Preference for device delivery.
     *
     * @return the value
     */
    public ShippingPreference getShippingPreference() {
        return shippingPreference;
    }

    /** Tracking Url for the shipped Rover Cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
    private final String oracleShippingTrackingUrl;

    /**
     * Tracking Url for the shipped Rover Cluster.
     *
     * @return the value
     */
    public String getOracleShippingTrackingUrl() {
        return oracleShippingTrackingUrl;
    }

    /** ID provided to customer after successful subscription to Rover Stations. */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * ID provided to customer after successful subscription to Rover Stations.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /** Shipping vendor of choice for orace to customer shipping. */
    @com.fasterxml.jackson.annotation.JsonProperty("shippingVendor")
    private final String shippingVendor;

    /**
     * Shipping vendor of choice for orace to customer shipping.
     *
     * @return the value
     */
    public String getShippingVendor() {
        return shippingVendor;
    }

    /** Expected date when customer wants to pickup the device if they chose customer pickup. */
    @com.fasterxml.jackson.annotation.JsonProperty("timePickupExpected")
    private final java.util.Date timePickupExpected;

    /**
     * Expected date when customer wants to pickup the device if they chose customer pickup.
     *
     * @return the value
     */
    public java.util.Date getTimePickupExpected() {
        return timePickupExpected;
    }

    /**
     * The flag indicating that customer requests data to be imported to OCI upon Rover cluster
     * return.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
    private final Boolean isImportRequested;

    /**
     * The flag indicating that customer requests data to be imported to OCI upon Rover cluster
     * return.
     *
     * @return the value
     */
    public Boolean getIsImportRequested() {
        return isImportRequested;
    }

    /** An OCID of a compartment where data will be imported to upon Rover cluster return. */
    @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
    private final String importCompartmentId;

    /**
     * An OCID of a compartment where data will be imported to upon Rover cluster return.
     *
     * @return the value
     */
    public String getImportCompartmentId() {
        return importCompartmentId;
    }

    /**
     * Name of a bucket where files from NFS share will be imported to upon Rover cluster return.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
    private final String importFileBucket;

    /**
     * Name of a bucket where files from NFS share will be imported to upon Rover cluster return.
     *
     * @return the value
     */
    public String getImportFileBucket() {
        return importFileBucket;
    }

    /**
     * Validation code returned by data validation tool. Required for return shipping label
     * generation if data import was requested.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dataValidationCode")
    private final String dataValidationCode;

    /**
     * Validation code returned by data validation tool. Required for return shipping label
     * generation if data import was requested.
     *
     * @return the value
     */
    public String getDataValidationCode() {
        return dataValidationCode;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
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
        sb.append("UpdateRoverClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", clusterSize=").append(String.valueOf(this.clusterSize));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", clusterWorkloads=").append(String.valueOf(this.clusterWorkloads));
        sb.append(", superUserPassword=").append(String.valueOf(this.superUserPassword));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", unlockPassphrase=").append(String.valueOf(this.unlockPassphrase));
        sb.append(", enclosureType=").append(String.valueOf(this.enclosureType));
        sb.append(", pointOfContact=").append(String.valueOf(this.pointOfContact));
        sb.append(", pointOfContactPhoneNumber=")
                .append(String.valueOf(this.pointOfContactPhoneNumber));
        sb.append(", shippingPreference=").append(String.valueOf(this.shippingPreference));
        sb.append(", oracleShippingTrackingUrl=")
                .append(String.valueOf(this.oracleShippingTrackingUrl));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", shippingVendor=").append(String.valueOf(this.shippingVendor));
        sb.append(", timePickupExpected=").append(String.valueOf(this.timePickupExpected));
        sb.append(", isImportRequested=").append(String.valueOf(this.isImportRequested));
        sb.append(", importCompartmentId=").append(String.valueOf(this.importCompartmentId));
        sb.append(", importFileBucket=").append(String.valueOf(this.importFileBucket));
        sb.append(", dataValidationCode=").append(String.valueOf(this.dataValidationCode));
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
        if (!(o instanceof UpdateRoverClusterDetails)) {
            return false;
        }

        UpdateRoverClusterDetails other = (UpdateRoverClusterDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.clusterSize, other.clusterSize)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.clusterWorkloads, other.clusterWorkloads)
                && java.util.Objects.equals(this.superUserPassword, other.superUserPassword)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.unlockPassphrase, other.unlockPassphrase)
                && java.util.Objects.equals(this.enclosureType, other.enclosureType)
                && java.util.Objects.equals(this.pointOfContact, other.pointOfContact)
                && java.util.Objects.equals(
                        this.pointOfContactPhoneNumber, other.pointOfContactPhoneNumber)
                && java.util.Objects.equals(this.shippingPreference, other.shippingPreference)
                && java.util.Objects.equals(
                        this.oracleShippingTrackingUrl, other.oracleShippingTrackingUrl)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.shippingVendor, other.shippingVendor)
                && java.util.Objects.equals(this.timePickupExpected, other.timePickupExpected)
                && java.util.Objects.equals(this.isImportRequested, other.isImportRequested)
                && java.util.Objects.equals(this.importCompartmentId, other.importCompartmentId)
                && java.util.Objects.equals(this.importFileBucket, other.importFileBucket)
                && java.util.Objects.equals(this.dataValidationCode, other.dataValidationCode)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.clusterSize == null ? 43 : this.clusterSize.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterWorkloads == null ? 43 : this.clusterWorkloads.hashCode());
        result =
                (result * PRIME)
                        + (this.superUserPassword == null ? 43 : this.superUserPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.unlockPassphrase == null ? 43 : this.unlockPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.enclosureType == null ? 43 : this.enclosureType.hashCode());
        result =
                (result * PRIME)
                        + (this.pointOfContact == null ? 43 : this.pointOfContact.hashCode());
        result =
                (result * PRIME)
                        + (this.pointOfContactPhoneNumber == null
                                ? 43
                                : this.pointOfContactPhoneNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.shippingPreference == null
                                ? 43
                                : this.shippingPreference.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleShippingTrackingUrl == null
                                ? 43
                                : this.oracleShippingTrackingUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.shippingVendor == null ? 43 : this.shippingVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.timePickupExpected == null
                                ? 43
                                : this.timePickupExpected.hashCode());
        result =
                (result * PRIME)
                        + (this.isImportRequested == null ? 43 : this.isImportRequested.hashCode());
        result =
                (result * PRIME)
                        + (this.importCompartmentId == null
                                ? 43
                                : this.importCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.importFileBucket == null ? 43 : this.importFileBucket.hashCode());
        result =
                (result * PRIME)
                        + (this.dataValidationCode == null
                                ? 43
                                : this.dataValidationCode.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
