/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The information required to create a RoverNode. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateRoverNodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateRoverNodeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "shape",
        "customerShippingAddress",
        "nodeWorkloads",
        "superUserPassword",
        "unlockPassphrase",
        "pointOfContact",
        "pointOfContactPhoneNumber",
        "shippingPreference",
        "shippingVendor",
        "timePickupExpected",
        "publicKey",
        "timeReturnWindowStarts",
        "timeReturnWindowEnds",
        "lifecycleState",
        "enclosureType",
        "lifecycleStateDetails",
        "serialNumber",
        "oracleShippingTrackingUrl",
        "isImportRequested",
        "importCompartmentId",
        "importFileBucket",
        "dataValidationCode",
        "masterKeyId",
        "certificateAuthorityId",
        "timeCertValidityEnd",
        "commonName",
        "certCompartmentId",
        "certKeyAlgorithm",
        "certSignatureAlgorithm",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CreateRoverNodeDetails(
            String displayName,
            String compartmentId,
            String shape,
            ShippingAddress customerShippingAddress,
            java.util.List<RoverWorkload> nodeWorkloads,
            String superUserPassword,
            String unlockPassphrase,
            String pointOfContact,
            String pointOfContactPhoneNumber,
            ShippingPreference shippingPreference,
            String shippingVendor,
            java.util.Date timePickupExpected,
            String publicKey,
            java.util.Date timeReturnWindowStarts,
            java.util.Date timeReturnWindowEnds,
            LifecycleState lifecycleState,
            EnclosureType enclosureType,
            String lifecycleStateDetails,
            String serialNumber,
            String oracleShippingTrackingUrl,
            Boolean isImportRequested,
            String importCompartmentId,
            String importFileBucket,
            String dataValidationCode,
            String masterKeyId,
            String certificateAuthorityId,
            java.util.Date timeCertValidityEnd,
            String commonName,
            String certCompartmentId,
            CertKeyAlgorithm certKeyAlgorithm,
            CertSignatureAlgorithm certSignatureAlgorithm,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.shape = shape;
        this.customerShippingAddress = customerShippingAddress;
        this.nodeWorkloads = nodeWorkloads;
        this.superUserPassword = superUserPassword;
        this.unlockPassphrase = unlockPassphrase;
        this.pointOfContact = pointOfContact;
        this.pointOfContactPhoneNumber = pointOfContactPhoneNumber;
        this.shippingPreference = shippingPreference;
        this.shippingVendor = shippingVendor;
        this.timePickupExpected = timePickupExpected;
        this.publicKey = publicKey;
        this.timeReturnWindowStarts = timeReturnWindowStarts;
        this.timeReturnWindowEnds = timeReturnWindowEnds;
        this.lifecycleState = lifecycleState;
        this.enclosureType = enclosureType;
        this.lifecycleStateDetails = lifecycleStateDetails;
        this.serialNumber = serialNumber;
        this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
        this.isImportRequested = isImportRequested;
        this.importCompartmentId = importCompartmentId;
        this.importFileBucket = importFileBucket;
        this.dataValidationCode = dataValidationCode;
        this.masterKeyId = masterKeyId;
        this.certificateAuthorityId = certificateAuthorityId;
        this.timeCertValidityEnd = timeCertValidityEnd;
        this.commonName = commonName;
        this.certCompartmentId = certCompartmentId;
        this.certKeyAlgorithm = certKeyAlgorithm;
        this.certSignatureAlgorithm = certSignatureAlgorithm;
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
        /** The OCID of the compartment containing the RoverNode. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the RoverNode.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The shape of the node. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the node.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }
        /** List of existing workloads that should be provisioned on the node. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeWorkloads")
        private java.util.List<RoverWorkload> nodeWorkloads;

        /**
         * List of existing workloads that should be provisioned on the node.
         *
         * @param nodeWorkloads the value to set
         * @return this builder
         */
        public Builder nodeWorkloads(java.util.List<RoverWorkload> nodeWorkloads) {
            this.nodeWorkloads = nodeWorkloads;
            this.__explicitlySet__.add("nodeWorkloads");
            return this;
        }
        /** Root password for the rover node. */
        @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
        private String superUserPassword;

        /**
         * Root password for the rover node.
         *
         * @param superUserPassword the value to set
         * @return this builder
         */
        public Builder superUserPassword(String superUserPassword) {
            this.superUserPassword = superUserPassword;
            this.__explicitlySet__.add("superUserPassword");
            return this;
        }
        /** Passphrase to unlock the rover node. */
        @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
        private String unlockPassphrase;

        /**
         * Passphrase to unlock the rover node.
         *
         * @param unlockPassphrase the value to set
         * @return this builder
         */
        public Builder unlockPassphrase(String unlockPassphrase) {
            this.unlockPassphrase = unlockPassphrase;
            this.__explicitlySet__.add("unlockPassphrase");
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
        /** The public key of the resource principal */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
        private String publicKey;

        /**
         * The public key of the resource principal
         *
         * @param publicKey the value to set
         * @return this builder
         */
        public Builder publicKey(String publicKey) {
            this.publicKey = publicKey;
            this.__explicitlySet__.add("publicKey");
            return this;
        }
        /** Start time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowStarts")
        private java.util.Date timeReturnWindowStarts;

        /**
         * Start time for the window to pickup the device from customer.
         *
         * @param timeReturnWindowStarts the value to set
         * @return this builder
         */
        public Builder timeReturnWindowStarts(java.util.Date timeReturnWindowStarts) {
            this.timeReturnWindowStarts = timeReturnWindowStarts;
            this.__explicitlySet__.add("timeReturnWindowStarts");
            return this;
        }
        /** End time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowEnds")
        private java.util.Date timeReturnWindowEnds;

        /**
         * End time for the window to pickup the device from customer.
         *
         * @param timeReturnWindowEnds the value to set
         * @return this builder
         */
        public Builder timeReturnWindowEnds(java.util.Date timeReturnWindowEnds) {
            this.timeReturnWindowEnds = timeReturnWindowEnds;
            this.__explicitlySet__.add("timeReturnWindowEnds");
            return this;
        }
        /** The current state of the RoverNode. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the RoverNode.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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
        /** Serial number of the node. */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * Serial number of the node.
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /** Tracking Url for the shipped FmsRoverNode. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
        private String oracleShippingTrackingUrl;

        /**
         * Tracking Url for the shipped FmsRoverNode.
         *
         * @param oracleShippingTrackingUrl the value to set
         * @return this builder
         */
        public Builder oracleShippingTrackingUrl(String oracleShippingTrackingUrl) {
            this.oracleShippingTrackingUrl = oracleShippingTrackingUrl;
            this.__explicitlySet__.add("oracleShippingTrackingUrl");
            return this;
        }
        /**
         * The flag indicating that customer requests data to be imported to OCI upon Rover node
         * return.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
        private Boolean isImportRequested;

        /**
         * The flag indicating that customer requests data to be imported to OCI upon Rover node
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
        /** An OCID of a compartment where data will be imported to upon Rover node return. */
        @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
        private String importCompartmentId;

        /**
         * An OCID of a compartment where data will be imported to upon Rover node return.
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
         * Name of a bucket where files from NFS share will be imported to upon Rover node return.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
        private String importFileBucket;

        /**
         * Name of a bucket where files from NFS share will be imported to upon Rover node return.
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
         * Customer provided master key ID to encrypt secret information. If not provided, Rover's
         * master key will be used for encryption.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("masterKeyId")
        private String masterKeyId;

        /**
         * Customer provided master key ID to encrypt secret information. If not provided, Rover's
         * master key will be used for encryption.
         *
         * @param masterKeyId the value to set
         * @return this builder
         */
        public Builder masterKeyId(String masterKeyId) {
            this.masterKeyId = masterKeyId;
            this.__explicitlySet__.add("masterKeyId");
            return this;
        }
        /** The certificateAuthorityId of subordinate/intermediate certificate authority. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
        private String certificateAuthorityId;

        /**
         * The certificateAuthorityId of subordinate/intermediate certificate authority.
         *
         * @param certificateAuthorityId the value to set
         * @return this builder
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            this.__explicitlySet__.add("certificateAuthorityId");
            return this;
        }
        /** The time after which leaf certificate will invalid. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCertValidityEnd")
        private java.util.Date timeCertValidityEnd;

        /**
         * The time after which leaf certificate will invalid.
         *
         * @param timeCertValidityEnd the value to set
         * @return this builder
         */
        public Builder timeCertValidityEnd(java.util.Date timeCertValidityEnd) {
            this.timeCertValidityEnd = timeCertValidityEnd;
            this.__explicitlySet__.add("timeCertValidityEnd");
            return this;
        }
        /** The common name for the leaf certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        /**
         * The common name for the leaf certificate.
         *
         * @param commonName the value to set
         * @return this builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }
        /** The compartmentId of the leaf certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certCompartmentId")
        private String certCompartmentId;

        /**
         * The compartmentId of the leaf certificate.
         *
         * @param certCompartmentId the value to set
         * @return this builder
         */
        public Builder certCompartmentId(String certCompartmentId) {
            this.certCompartmentId = certCompartmentId;
            this.__explicitlySet__.add("certCompartmentId");
            return this;
        }
        /** key algorithm for issuing leaf certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certKeyAlgorithm")
        private CertKeyAlgorithm certKeyAlgorithm;

        /**
         * key algorithm for issuing leaf certificate.
         *
         * @param certKeyAlgorithm the value to set
         * @return this builder
         */
        public Builder certKeyAlgorithm(CertKeyAlgorithm certKeyAlgorithm) {
            this.certKeyAlgorithm = certKeyAlgorithm;
            this.__explicitlySet__.add("certKeyAlgorithm");
            return this;
        }
        /** signature algorithm for issuing leaf certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certSignatureAlgorithm")
        private CertSignatureAlgorithm certSignatureAlgorithm;

        /**
         * signature algorithm for issuing leaf certificate.
         *
         * @param certSignatureAlgorithm the value to set
         * @return this builder
         */
        public Builder certSignatureAlgorithm(CertSignatureAlgorithm certSignatureAlgorithm) {
            this.certSignatureAlgorithm = certSignatureAlgorithm;
            this.__explicitlySet__.add("certSignatureAlgorithm");
            return this;
        }
        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * The freeform tags associated with this resource, if any. Each tag is a simple key-value
         * pair with no predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * The defined tags associated with this resource, if any. Each key is predefined and scoped
         * to namespaces. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {orcl-cloud: {free-tier-retain: true}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * The system tags associated with this resource, if any. The system tags are set by Oracle
         * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
         * information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {orcl-cloud: {free-tier-retain: true}}}
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

        public CreateRoverNodeDetails build() {
            CreateRoverNodeDetails model =
                    new CreateRoverNodeDetails(
                            this.displayName,
                            this.compartmentId,
                            this.shape,
                            this.customerShippingAddress,
                            this.nodeWorkloads,
                            this.superUserPassword,
                            this.unlockPassphrase,
                            this.pointOfContact,
                            this.pointOfContactPhoneNumber,
                            this.shippingPreference,
                            this.shippingVendor,
                            this.timePickupExpected,
                            this.publicKey,
                            this.timeReturnWindowStarts,
                            this.timeReturnWindowEnds,
                            this.lifecycleState,
                            this.enclosureType,
                            this.lifecycleStateDetails,
                            this.serialNumber,
                            this.oracleShippingTrackingUrl,
                            this.isImportRequested,
                            this.importCompartmentId,
                            this.importFileBucket,
                            this.dataValidationCode,
                            this.masterKeyId,
                            this.certificateAuthorityId,
                            this.timeCertValidityEnd,
                            this.commonName,
                            this.certCompartmentId,
                            this.certKeyAlgorithm,
                            this.certSignatureAlgorithm,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateRoverNodeDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("nodeWorkloads")) {
                this.nodeWorkloads(model.getNodeWorkloads());
            }
            if (model.wasPropertyExplicitlySet("superUserPassword")) {
                this.superUserPassword(model.getSuperUserPassword());
            }
            if (model.wasPropertyExplicitlySet("unlockPassphrase")) {
                this.unlockPassphrase(model.getUnlockPassphrase());
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
            if (model.wasPropertyExplicitlySet("shippingVendor")) {
                this.shippingVendor(model.getShippingVendor());
            }
            if (model.wasPropertyExplicitlySet("timePickupExpected")) {
                this.timePickupExpected(model.getTimePickupExpected());
            }
            if (model.wasPropertyExplicitlySet("publicKey")) {
                this.publicKey(model.getPublicKey());
            }
            if (model.wasPropertyExplicitlySet("timeReturnWindowStarts")) {
                this.timeReturnWindowStarts(model.getTimeReturnWindowStarts());
            }
            if (model.wasPropertyExplicitlySet("timeReturnWindowEnds")) {
                this.timeReturnWindowEnds(model.getTimeReturnWindowEnds());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("enclosureType")) {
                this.enclosureType(model.getEnclosureType());
            }
            if (model.wasPropertyExplicitlySet("lifecycleStateDetails")) {
                this.lifecycleStateDetails(model.getLifecycleStateDetails());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("oracleShippingTrackingUrl")) {
                this.oracleShippingTrackingUrl(model.getOracleShippingTrackingUrl());
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
            if (model.wasPropertyExplicitlySet("masterKeyId")) {
                this.masterKeyId(model.getMasterKeyId());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityId")) {
                this.certificateAuthorityId(model.getCertificateAuthorityId());
            }
            if (model.wasPropertyExplicitlySet("timeCertValidityEnd")) {
                this.timeCertValidityEnd(model.getTimeCertValidityEnd());
            }
            if (model.wasPropertyExplicitlySet("commonName")) {
                this.commonName(model.getCommonName());
            }
            if (model.wasPropertyExplicitlySet("certCompartmentId")) {
                this.certCompartmentId(model.getCertCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("certKeyAlgorithm")) {
                this.certKeyAlgorithm(model.getCertKeyAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("certSignatureAlgorithm")) {
                this.certSignatureAlgorithm(model.getCertSignatureAlgorithm());
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

    /** The OCID of the compartment containing the RoverNode. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the RoverNode.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The shape of the node. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the node.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    /** List of existing workloads that should be provisioned on the node. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeWorkloads")
    private final java.util.List<RoverWorkload> nodeWorkloads;

    /**
     * List of existing workloads that should be provisioned on the node.
     *
     * @return the value
     */
    public java.util.List<RoverWorkload> getNodeWorkloads() {
        return nodeWorkloads;
    }

    /** Root password for the rover node. */
    @com.fasterxml.jackson.annotation.JsonProperty("superUserPassword")
    private final String superUserPassword;

    /**
     * Root password for the rover node.
     *
     * @return the value
     */
    public String getSuperUserPassword() {
        return superUserPassword;
    }

    /** Passphrase to unlock the rover node. */
    @com.fasterxml.jackson.annotation.JsonProperty("unlockPassphrase")
    private final String unlockPassphrase;

    /**
     * Passphrase to unlock the rover node.
     *
     * @return the value
     */
    public String getUnlockPassphrase() {
        return unlockPassphrase;
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

    /** The public key of the resource principal */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKey")
    private final String publicKey;

    /**
     * The public key of the resource principal
     *
     * @return the value
     */
    public String getPublicKey() {
        return publicKey;
    }

    /** Start time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowStarts")
    private final java.util.Date timeReturnWindowStarts;

    /**
     * Start time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getTimeReturnWindowStarts() {
        return timeReturnWindowStarts;
    }

    /** End time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeReturnWindowEnds")
    private final java.util.Date timeReturnWindowEnds;

    /**
     * End time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getTimeReturnWindowEnds() {
        return timeReturnWindowEnds;
    }

    /** The current state of the RoverNode. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the RoverNode.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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

    /** Serial number of the node. */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * Serial number of the node.
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** Tracking Url for the shipped FmsRoverNode. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleShippingTrackingUrl")
    private final String oracleShippingTrackingUrl;

    /**
     * Tracking Url for the shipped FmsRoverNode.
     *
     * @return the value
     */
    public String getOracleShippingTrackingUrl() {
        return oracleShippingTrackingUrl;
    }

    /**
     * The flag indicating that customer requests data to be imported to OCI upon Rover node return.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isImportRequested")
    private final Boolean isImportRequested;

    /**
     * The flag indicating that customer requests data to be imported to OCI upon Rover node return.
     *
     * @return the value
     */
    public Boolean getIsImportRequested() {
        return isImportRequested;
    }

    /** An OCID of a compartment where data will be imported to upon Rover node return. */
    @com.fasterxml.jackson.annotation.JsonProperty("importCompartmentId")
    private final String importCompartmentId;

    /**
     * An OCID of a compartment where data will be imported to upon Rover node return.
     *
     * @return the value
     */
    public String getImportCompartmentId() {
        return importCompartmentId;
    }

    /** Name of a bucket where files from NFS share will be imported to upon Rover node return. */
    @com.fasterxml.jackson.annotation.JsonProperty("importFileBucket")
    private final String importFileBucket;

    /**
     * Name of a bucket where files from NFS share will be imported to upon Rover node return.
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
     * Customer provided master key ID to encrypt secret information. If not provided, Rover's
     * master key will be used for encryption.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterKeyId")
    private final String masterKeyId;

    /**
     * Customer provided master key ID to encrypt secret information. If not provided, Rover's
     * master key will be used for encryption.
     *
     * @return the value
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    /** The certificateAuthorityId of subordinate/intermediate certificate authority. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
    private final String certificateAuthorityId;

    /**
     * The certificateAuthorityId of subordinate/intermediate certificate authority.
     *
     * @return the value
     */
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }

    /** The time after which leaf certificate will invalid. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCertValidityEnd")
    private final java.util.Date timeCertValidityEnd;

    /**
     * The time after which leaf certificate will invalid.
     *
     * @return the value
     */
    public java.util.Date getTimeCertValidityEnd() {
        return timeCertValidityEnd;
    }

    /** The common name for the leaf certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    /**
     * The common name for the leaf certificate.
     *
     * @return the value
     */
    public String getCommonName() {
        return commonName;
    }

    /** The compartmentId of the leaf certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certCompartmentId")
    private final String certCompartmentId;

    /**
     * The compartmentId of the leaf certificate.
     *
     * @return the value
     */
    public String getCertCompartmentId() {
        return certCompartmentId;
    }

    /** key algorithm for issuing leaf certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certKeyAlgorithm")
    private final CertKeyAlgorithm certKeyAlgorithm;

    /**
     * key algorithm for issuing leaf certificate.
     *
     * @return the value
     */
    public CertKeyAlgorithm getCertKeyAlgorithm() {
        return certKeyAlgorithm;
    }

    /** signature algorithm for issuing leaf certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certSignatureAlgorithm")
    private final CertSignatureAlgorithm certSignatureAlgorithm;

    /**
     * signature algorithm for issuing leaf certificate.
     *
     * @return the value
     */
    public CertSignatureAlgorithm getCertSignatureAlgorithm() {
        return certSignatureAlgorithm;
    }

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * The freeform tags associated with this resource, if any. Each tag is a simple key-value pair
     * with no predefined name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The defined tags associated with this resource, if any. Each key is predefined and scoped to
     * namespaces. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {orcl-cloud: {free-tier-retain: true}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * The system tags associated with this resource, if any. The system tags are set by Oracle
     * cloud infrastructure services. Each key is predefined and scoped to namespaces. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
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
        sb.append("CreateRoverNodeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", nodeWorkloads=").append(String.valueOf(this.nodeWorkloads));
        sb.append(", superUserPassword=").append(String.valueOf(this.superUserPassword));
        sb.append(", unlockPassphrase=").append(String.valueOf(this.unlockPassphrase));
        sb.append(", pointOfContact=").append(String.valueOf(this.pointOfContact));
        sb.append(", pointOfContactPhoneNumber=")
                .append(String.valueOf(this.pointOfContactPhoneNumber));
        sb.append(", shippingPreference=").append(String.valueOf(this.shippingPreference));
        sb.append(", shippingVendor=").append(String.valueOf(this.shippingVendor));
        sb.append(", timePickupExpected=").append(String.valueOf(this.timePickupExpected));
        sb.append(", publicKey=").append(String.valueOf(this.publicKey));
        sb.append(", timeReturnWindowStarts=").append(String.valueOf(this.timeReturnWindowStarts));
        sb.append(", timeReturnWindowEnds=").append(String.valueOf(this.timeReturnWindowEnds));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", enclosureType=").append(String.valueOf(this.enclosureType));
        sb.append(", lifecycleStateDetails=").append(String.valueOf(this.lifecycleStateDetails));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", oracleShippingTrackingUrl=")
                .append(String.valueOf(this.oracleShippingTrackingUrl));
        sb.append(", isImportRequested=").append(String.valueOf(this.isImportRequested));
        sb.append(", importCompartmentId=").append(String.valueOf(this.importCompartmentId));
        sb.append(", importFileBucket=").append(String.valueOf(this.importFileBucket));
        sb.append(", dataValidationCode=").append(String.valueOf(this.dataValidationCode));
        sb.append(", masterKeyId=").append(String.valueOf(this.masterKeyId));
        sb.append(", certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(", timeCertValidityEnd=").append(String.valueOf(this.timeCertValidityEnd));
        sb.append(", commonName=").append(String.valueOf(this.commonName));
        sb.append(", certCompartmentId=").append(String.valueOf(this.certCompartmentId));
        sb.append(", certKeyAlgorithm=").append(String.valueOf(this.certKeyAlgorithm));
        sb.append(", certSignatureAlgorithm=").append(String.valueOf(this.certSignatureAlgorithm));
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
        if (!(o instanceof CreateRoverNodeDetails)) {
            return false;
        }

        CreateRoverNodeDetails other = (CreateRoverNodeDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.nodeWorkloads, other.nodeWorkloads)
                && java.util.Objects.equals(this.superUserPassword, other.superUserPassword)
                && java.util.Objects.equals(this.unlockPassphrase, other.unlockPassphrase)
                && java.util.Objects.equals(this.pointOfContact, other.pointOfContact)
                && java.util.Objects.equals(
                        this.pointOfContactPhoneNumber, other.pointOfContactPhoneNumber)
                && java.util.Objects.equals(this.shippingPreference, other.shippingPreference)
                && java.util.Objects.equals(this.shippingVendor, other.shippingVendor)
                && java.util.Objects.equals(this.timePickupExpected, other.timePickupExpected)
                && java.util.Objects.equals(this.publicKey, other.publicKey)
                && java.util.Objects.equals(
                        this.timeReturnWindowStarts, other.timeReturnWindowStarts)
                && java.util.Objects.equals(this.timeReturnWindowEnds, other.timeReturnWindowEnds)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.enclosureType, other.enclosureType)
                && java.util.Objects.equals(this.lifecycleStateDetails, other.lifecycleStateDetails)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(
                        this.oracleShippingTrackingUrl, other.oracleShippingTrackingUrl)
                && java.util.Objects.equals(this.isImportRequested, other.isImportRequested)
                && java.util.Objects.equals(this.importCompartmentId, other.importCompartmentId)
                && java.util.Objects.equals(this.importFileBucket, other.importFileBucket)
                && java.util.Objects.equals(this.dataValidationCode, other.dataValidationCode)
                && java.util.Objects.equals(this.masterKeyId, other.masterKeyId)
                && java.util.Objects.equals(
                        this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(this.timeCertValidityEnd, other.timeCertValidityEnd)
                && java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.certCompartmentId, other.certCompartmentId)
                && java.util.Objects.equals(this.certKeyAlgorithm, other.certKeyAlgorithm)
                && java.util.Objects.equals(
                        this.certSignatureAlgorithm, other.certSignatureAlgorithm)
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.nodeWorkloads == null ? 43 : this.nodeWorkloads.hashCode());
        result =
                (result * PRIME)
                        + (this.superUserPassword == null ? 43 : this.superUserPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.unlockPassphrase == null ? 43 : this.unlockPassphrase.hashCode());
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
                        + (this.shippingVendor == null ? 43 : this.shippingVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.timePickupExpected == null
                                ? 43
                                : this.timePickupExpected.hashCode());
        result = (result * PRIME) + (this.publicKey == null ? 43 : this.publicKey.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReturnWindowStarts == null
                                ? 43
                                : this.timeReturnWindowStarts.hashCode());
        result =
                (result * PRIME)
                        + (this.timeReturnWindowEnds == null
                                ? 43
                                : this.timeReturnWindowEnds.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.enclosureType == null ? 43 : this.enclosureType.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleStateDetails == null
                                ? 43
                                : this.lifecycleStateDetails.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.oracleShippingTrackingUrl == null
                                ? 43
                                : this.oracleShippingTrackingUrl.hashCode());
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
        result = (result * PRIME) + (this.masterKeyId == null ? 43 : this.masterKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCertValidityEnd == null
                                ? 43
                                : this.timeCertValidityEnd.hashCode());
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result =
                (result * PRIME)
                        + (this.certCompartmentId == null ? 43 : this.certCompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.certKeyAlgorithm == null ? 43 : this.certKeyAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.certSignatureAlgorithm == null
                                ? 43
                                : this.certSignatureAlgorithm.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
