/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TransferAppliance.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TransferAppliance
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "label",
        "lifecycleState",
        "transferJobId",
        "serialNumber",
        "creationTime",
        "customerReceivedTime",
        "customerReturnedTime",
        "nextBillingTime",
        "deliverySecurityTieId",
        "returnSecurityTieId",
        "applianceDeliveryTrackingNumber",
        "applianceReturnDeliveryTrackingNumber",
        "applianceDeliveryVendor",
        "customerShippingAddress",
        "uploadStatusLogUri",
        "returnShippingLabelUri",
        "expectedReturnDate",
        "pickupWindowStartTime",
        "pickupWindowEndTime",
        "minimumStorageCapacityInTerabytes"
    })
    public TransferAppliance(
            String label,
            LifecycleState lifecycleState,
            String transferJobId,
            String serialNumber,
            java.util.Date creationTime,
            java.util.Date customerReceivedTime,
            java.util.Date customerReturnedTime,
            java.util.Date nextBillingTime,
            String deliverySecurityTieId,
            String returnSecurityTieId,
            String applianceDeliveryTrackingNumber,
            String applianceReturnDeliveryTrackingNumber,
            String applianceDeliveryVendor,
            ShippingAddress customerShippingAddress,
            String uploadStatusLogUri,
            String returnShippingLabelUri,
            java.util.Date expectedReturnDate,
            java.util.Date pickupWindowStartTime,
            java.util.Date pickupWindowEndTime,
            Integer minimumStorageCapacityInTerabytes) {
        super();
        this.label = label;
        this.lifecycleState = lifecycleState;
        this.transferJobId = transferJobId;
        this.serialNumber = serialNumber;
        this.creationTime = creationTime;
        this.customerReceivedTime = customerReceivedTime;
        this.customerReturnedTime = customerReturnedTime;
        this.nextBillingTime = nextBillingTime;
        this.deliverySecurityTieId = deliverySecurityTieId;
        this.returnSecurityTieId = returnSecurityTieId;
        this.applianceDeliveryTrackingNumber = applianceDeliveryTrackingNumber;
        this.applianceReturnDeliveryTrackingNumber = applianceReturnDeliveryTrackingNumber;
        this.applianceDeliveryVendor = applianceDeliveryVendor;
        this.customerShippingAddress = customerShippingAddress;
        this.uploadStatusLogUri = uploadStatusLogUri;
        this.returnShippingLabelUri = returnShippingLabelUri;
        this.expectedReturnDate = expectedReturnDate;
        this.pickupWindowStartTime = pickupWindowStartTime;
        this.pickupWindowEndTime = pickupWindowEndTime;
        this.minimumStorageCapacityInTerabytes = minimumStorageCapacityInTerabytes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
        private String transferJobId;

        public Builder transferJobId(String transferJobId) {
            this.transferJobId = transferJobId;
            this.__explicitlySet__.add("transferJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerReceivedTime")
        private java.util.Date customerReceivedTime;

        public Builder customerReceivedTime(java.util.Date customerReceivedTime) {
            this.customerReceivedTime = customerReceivedTime;
            this.__explicitlySet__.add("customerReceivedTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerReturnedTime")
        private java.util.Date customerReturnedTime;

        public Builder customerReturnedTime(java.util.Date customerReturnedTime) {
            this.customerReturnedTime = customerReturnedTime;
            this.__explicitlySet__.add("customerReturnedTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nextBillingTime")
        private java.util.Date nextBillingTime;

        public Builder nextBillingTime(java.util.Date nextBillingTime) {
            this.nextBillingTime = nextBillingTime;
            this.__explicitlySet__.add("nextBillingTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliverySecurityTieId")
        private String deliverySecurityTieId;

        public Builder deliverySecurityTieId(String deliverySecurityTieId) {
            this.deliverySecurityTieId = deliverySecurityTieId;
            this.__explicitlySet__.add("deliverySecurityTieId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnSecurityTieId")
        private String returnSecurityTieId;

        public Builder returnSecurityTieId(String returnSecurityTieId) {
            this.returnSecurityTieId = returnSecurityTieId;
            this.__explicitlySet__.add("returnSecurityTieId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryTrackingNumber")
        private String applianceDeliveryTrackingNumber;

        public Builder applianceDeliveryTrackingNumber(String applianceDeliveryTrackingNumber) {
            this.applianceDeliveryTrackingNumber = applianceDeliveryTrackingNumber;
            this.__explicitlySet__.add("applianceDeliveryTrackingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceReturnDeliveryTrackingNumber")
        private String applianceReturnDeliveryTrackingNumber;

        public Builder applianceReturnDeliveryTrackingNumber(
                String applianceReturnDeliveryTrackingNumber) {
            this.applianceReturnDeliveryTrackingNumber = applianceReturnDeliveryTrackingNumber;
            this.__explicitlySet__.add("applianceReturnDeliveryTrackingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryVendor")
        private String applianceDeliveryVendor;

        public Builder applianceDeliveryVendor(String applianceDeliveryVendor) {
            this.applianceDeliveryVendor = applianceDeliveryVendor;
            this.__explicitlySet__.add("applianceDeliveryVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
        private ShippingAddress customerShippingAddress;

        public Builder customerShippingAddress(ShippingAddress customerShippingAddress) {
            this.customerShippingAddress = customerShippingAddress;
            this.__explicitlySet__.add("customerShippingAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uploadStatusLogUri")
        private String uploadStatusLogUri;

        public Builder uploadStatusLogUri(String uploadStatusLogUri) {
            this.uploadStatusLogUri = uploadStatusLogUri;
            this.__explicitlySet__.add("uploadStatusLogUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnShippingLabelUri")
        private String returnShippingLabelUri;

        public Builder returnShippingLabelUri(String returnShippingLabelUri) {
            this.returnShippingLabelUri = returnShippingLabelUri;
            this.__explicitlySet__.add("returnShippingLabelUri");
            return this;
        }
        /** Expected return date from customer for the device, time portion should be zero. */
        @com.fasterxml.jackson.annotation.JsonProperty("expectedReturnDate")
        private java.util.Date expectedReturnDate;

        /**
         * Expected return date from customer for the device, time portion should be zero.
         *
         * @param expectedReturnDate the value to set
         * @return this builder
         */
        public Builder expectedReturnDate(java.util.Date expectedReturnDate) {
            this.expectedReturnDate = expectedReturnDate;
            this.__explicitlySet__.add("expectedReturnDate");
            return this;
        }
        /** Start time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowStartTime")
        private java.util.Date pickupWindowStartTime;

        /**
         * Start time for the window to pickup the device from customer.
         *
         * @param pickupWindowStartTime the value to set
         * @return this builder
         */
        public Builder pickupWindowStartTime(java.util.Date pickupWindowStartTime) {
            this.pickupWindowStartTime = pickupWindowStartTime;
            this.__explicitlySet__.add("pickupWindowStartTime");
            return this;
        }
        /** End time for the window to pickup the device from customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowEndTime")
        private java.util.Date pickupWindowEndTime;

        /**
         * End time for the window to pickup the device from customer.
         *
         * @param pickupWindowEndTime the value to set
         * @return this builder
         */
        public Builder pickupWindowEndTime(java.util.Date pickupWindowEndTime) {
            this.pickupWindowEndTime = pickupWindowEndTime;
            this.__explicitlySet__.add("pickupWindowEndTime");
            return this;
        }
        /**
         * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("minimumStorageCapacityInTerabytes")
        private Integer minimumStorageCapacityInTerabytes;

        /**
         * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
         *
         * @param minimumStorageCapacityInTerabytes the value to set
         * @return this builder
         */
        public Builder minimumStorageCapacityInTerabytes(
                Integer minimumStorageCapacityInTerabytes) {
            this.minimumStorageCapacityInTerabytes = minimumStorageCapacityInTerabytes;
            this.__explicitlySet__.add("minimumStorageCapacityInTerabytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferAppliance build() {
            TransferAppliance model =
                    new TransferAppliance(
                            this.label,
                            this.lifecycleState,
                            this.transferJobId,
                            this.serialNumber,
                            this.creationTime,
                            this.customerReceivedTime,
                            this.customerReturnedTime,
                            this.nextBillingTime,
                            this.deliverySecurityTieId,
                            this.returnSecurityTieId,
                            this.applianceDeliveryTrackingNumber,
                            this.applianceReturnDeliveryTrackingNumber,
                            this.applianceDeliveryVendor,
                            this.customerShippingAddress,
                            this.uploadStatusLogUri,
                            this.returnShippingLabelUri,
                            this.expectedReturnDate,
                            this.pickupWindowStartTime,
                            this.pickupWindowEndTime,
                            this.minimumStorageCapacityInTerabytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferAppliance model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("transferJobId")) {
                this.transferJobId(model.getTransferJobId());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("creationTime")) {
                this.creationTime(model.getCreationTime());
            }
            if (model.wasPropertyExplicitlySet("customerReceivedTime")) {
                this.customerReceivedTime(model.getCustomerReceivedTime());
            }
            if (model.wasPropertyExplicitlySet("customerReturnedTime")) {
                this.customerReturnedTime(model.getCustomerReturnedTime());
            }
            if (model.wasPropertyExplicitlySet("nextBillingTime")) {
                this.nextBillingTime(model.getNextBillingTime());
            }
            if (model.wasPropertyExplicitlySet("deliverySecurityTieId")) {
                this.deliverySecurityTieId(model.getDeliverySecurityTieId());
            }
            if (model.wasPropertyExplicitlySet("returnSecurityTieId")) {
                this.returnSecurityTieId(model.getReturnSecurityTieId());
            }
            if (model.wasPropertyExplicitlySet("applianceDeliveryTrackingNumber")) {
                this.applianceDeliveryTrackingNumber(model.getApplianceDeliveryTrackingNumber());
            }
            if (model.wasPropertyExplicitlySet("applianceReturnDeliveryTrackingNumber")) {
                this.applianceReturnDeliveryTrackingNumber(
                        model.getApplianceReturnDeliveryTrackingNumber());
            }
            if (model.wasPropertyExplicitlySet("applianceDeliveryVendor")) {
                this.applianceDeliveryVendor(model.getApplianceDeliveryVendor());
            }
            if (model.wasPropertyExplicitlySet("customerShippingAddress")) {
                this.customerShippingAddress(model.getCustomerShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("uploadStatusLogUri")) {
                this.uploadStatusLogUri(model.getUploadStatusLogUri());
            }
            if (model.wasPropertyExplicitlySet("returnShippingLabelUri")) {
                this.returnShippingLabelUri(model.getReturnShippingLabelUri());
            }
            if (model.wasPropertyExplicitlySet("expectedReturnDate")) {
                this.expectedReturnDate(model.getExpectedReturnDate());
            }
            if (model.wasPropertyExplicitlySet("pickupWindowStartTime")) {
                this.pickupWindowStartTime(model.getPickupWindowStartTime());
            }
            if (model.wasPropertyExplicitlySet("pickupWindowEndTime")) {
                this.pickupWindowEndTime(model.getPickupWindowEndTime());
            }
            if (model.wasPropertyExplicitlySet("minimumStorageCapacityInTerabytes")) {
                this.minimumStorageCapacityInTerabytes(
                        model.getMinimumStorageCapacityInTerabytes());
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

    /** Unique alpha-numeric identifier for a transfer appliance auto generated during create. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Requested("REQUESTED"),
        OraclePreparing("ORACLE_PREPARING"),
        Shipping("SHIPPING"),
        Delivered("DELIVERED"),
        Preparing("PREPARING"),
        Finalized("FINALIZED"),
        ReturnLabelRequested("RETURN_LABEL_REQUESTED"),
        ReturnLabelGenerating("RETURN_LABEL_GENERATING"),
        ReturnLabelAvailable("RETURN_LABEL_AVAILABLE"),
        ReturnDelayed("RETURN_DELAYED"),
        ReturnShipped("RETURN_SHIPPED"),
        ReturnShippedCancelled("RETURN_SHIPPED_CANCELLED"),
        OracleReceived("ORACLE_RECEIVED"),
        OracleReceivedCancelled("ORACLE_RECEIVED_CANCELLED"),
        Processing("PROCESSING"),
        Complete("COMPLETE"),
        CustomerNeverReceived("CUSTOMER_NEVER_RECEIVED"),
        OracleNeverReceived("ORACLE_NEVER_RECEIVED"),
        CustomerLost("CUSTOMER_LOST"),
        Cancelled("CANCELLED"),
        Deleted("DELETED"),
        Rejected("REJECTED"),
        Error("ERROR"),

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

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
    private final String transferJobId;

    public String getTransferJobId() {
        return transferJobId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    public String getSerialNumber() {
        return serialNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final java.util.Date creationTime;

    public java.util.Date getCreationTime() {
        return creationTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerReceivedTime")
    private final java.util.Date customerReceivedTime;

    public java.util.Date getCustomerReceivedTime() {
        return customerReceivedTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerReturnedTime")
    private final java.util.Date customerReturnedTime;

    public java.util.Date getCustomerReturnedTime() {
        return customerReturnedTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nextBillingTime")
    private final java.util.Date nextBillingTime;

    public java.util.Date getNextBillingTime() {
        return nextBillingTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deliverySecurityTieId")
    private final String deliverySecurityTieId;

    public String getDeliverySecurityTieId() {
        return deliverySecurityTieId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("returnSecurityTieId")
    private final String returnSecurityTieId;

    public String getReturnSecurityTieId() {
        return returnSecurityTieId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryTrackingNumber")
    private final String applianceDeliveryTrackingNumber;

    public String getApplianceDeliveryTrackingNumber() {
        return applianceDeliveryTrackingNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applianceReturnDeliveryTrackingNumber")
    private final String applianceReturnDeliveryTrackingNumber;

    public String getApplianceReturnDeliveryTrackingNumber() {
        return applianceReturnDeliveryTrackingNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryVendor")
    private final String applianceDeliveryVendor;

    public String getApplianceDeliveryVendor() {
        return applianceDeliveryVendor;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    private final ShippingAddress customerShippingAddress;

    public ShippingAddress getCustomerShippingAddress() {
        return customerShippingAddress;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("uploadStatusLogUri")
    private final String uploadStatusLogUri;

    public String getUploadStatusLogUri() {
        return uploadStatusLogUri;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("returnShippingLabelUri")
    private final String returnShippingLabelUri;

    public String getReturnShippingLabelUri() {
        return returnShippingLabelUri;
    }

    /** Expected return date from customer for the device, time portion should be zero. */
    @com.fasterxml.jackson.annotation.JsonProperty("expectedReturnDate")
    private final java.util.Date expectedReturnDate;

    /**
     * Expected return date from customer for the device, time portion should be zero.
     *
     * @return the value
     */
    public java.util.Date getExpectedReturnDate() {
        return expectedReturnDate;
    }

    /** Start time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowStartTime")
    private final java.util.Date pickupWindowStartTime;

    /**
     * Start time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getPickupWindowStartTime() {
        return pickupWindowStartTime;
    }

    /** End time for the window to pickup the device from customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("pickupWindowEndTime")
    private final java.util.Date pickupWindowEndTime;

    /**
     * End time for the window to pickup the device from customer.
     *
     * @return the value
     */
    public java.util.Date getPickupWindowEndTime() {
        return pickupWindowEndTime;
    }

    /** Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150. */
    @com.fasterxml.jackson.annotation.JsonProperty("minimumStorageCapacityInTerabytes")
    private final Integer minimumStorageCapacityInTerabytes;

    /**
     * Minimum storage capacity of the device, in terabytes. Valid options are 50, 95 and 150.
     *
     * @return the value
     */
    public Integer getMinimumStorageCapacityInTerabytes() {
        return minimumStorageCapacityInTerabytes;
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
        sb.append("TransferAppliance(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", transferJobId=").append(String.valueOf(this.transferJobId));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(", customerReceivedTime=").append(String.valueOf(this.customerReceivedTime));
        sb.append(", customerReturnedTime=").append(String.valueOf(this.customerReturnedTime));
        sb.append(", nextBillingTime=").append(String.valueOf(this.nextBillingTime));
        sb.append(", deliverySecurityTieId=").append(String.valueOf(this.deliverySecurityTieId));
        sb.append(", returnSecurityTieId=").append(String.valueOf(this.returnSecurityTieId));
        sb.append(", applianceDeliveryTrackingNumber=")
                .append(String.valueOf(this.applianceDeliveryTrackingNumber));
        sb.append(", applianceReturnDeliveryTrackingNumber=")
                .append(String.valueOf(this.applianceReturnDeliveryTrackingNumber));
        sb.append(", applianceDeliveryVendor=")
                .append(String.valueOf(this.applianceDeliveryVendor));
        sb.append(", customerShippingAddress=")
                .append(String.valueOf(this.customerShippingAddress));
        sb.append(", uploadStatusLogUri=").append(String.valueOf(this.uploadStatusLogUri));
        sb.append(", returnShippingLabelUri=").append(String.valueOf(this.returnShippingLabelUri));
        sb.append(", expectedReturnDate=").append(String.valueOf(this.expectedReturnDate));
        sb.append(", pickupWindowStartTime=").append(String.valueOf(this.pickupWindowStartTime));
        sb.append(", pickupWindowEndTime=").append(String.valueOf(this.pickupWindowEndTime));
        sb.append(", minimumStorageCapacityInTerabytes=")
                .append(String.valueOf(this.minimumStorageCapacityInTerabytes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransferAppliance)) {
            return false;
        }

        TransferAppliance other = (TransferAppliance) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.transferJobId, other.transferJobId)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && java.util.Objects.equals(this.customerReceivedTime, other.customerReceivedTime)
                && java.util.Objects.equals(this.customerReturnedTime, other.customerReturnedTime)
                && java.util.Objects.equals(this.nextBillingTime, other.nextBillingTime)
                && java.util.Objects.equals(this.deliverySecurityTieId, other.deliverySecurityTieId)
                && java.util.Objects.equals(this.returnSecurityTieId, other.returnSecurityTieId)
                && java.util.Objects.equals(
                        this.applianceDeliveryTrackingNumber, other.applianceDeliveryTrackingNumber)
                && java.util.Objects.equals(
                        this.applianceReturnDeliveryTrackingNumber,
                        other.applianceReturnDeliveryTrackingNumber)
                && java.util.Objects.equals(
                        this.applianceDeliveryVendor, other.applianceDeliveryVendor)
                && java.util.Objects.equals(
                        this.customerShippingAddress, other.customerShippingAddress)
                && java.util.Objects.equals(this.uploadStatusLogUri, other.uploadStatusLogUri)
                && java.util.Objects.equals(
                        this.returnShippingLabelUri, other.returnShippingLabelUri)
                && java.util.Objects.equals(this.expectedReturnDate, other.expectedReturnDate)
                && java.util.Objects.equals(this.pickupWindowStartTime, other.pickupWindowStartTime)
                && java.util.Objects.equals(this.pickupWindowEndTime, other.pickupWindowEndTime)
                && java.util.Objects.equals(
                        this.minimumStorageCapacityInTerabytes,
                        other.minimumStorageCapacityInTerabytes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.transferJobId == null ? 43 : this.transferJobId.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result =
                (result * PRIME)
                        + (this.customerReceivedTime == null
                                ? 43
                                : this.customerReceivedTime.hashCode());
        result =
                (result * PRIME)
                        + (this.customerReturnedTime == null
                                ? 43
                                : this.customerReturnedTime.hashCode());
        result =
                (result * PRIME)
                        + (this.nextBillingTime == null ? 43 : this.nextBillingTime.hashCode());
        result =
                (result * PRIME)
                        + (this.deliverySecurityTieId == null
                                ? 43
                                : this.deliverySecurityTieId.hashCode());
        result =
                (result * PRIME)
                        + (this.returnSecurityTieId == null
                                ? 43
                                : this.returnSecurityTieId.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceDeliveryTrackingNumber == null
                                ? 43
                                : this.applianceDeliveryTrackingNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceReturnDeliveryTrackingNumber == null
                                ? 43
                                : this.applianceReturnDeliveryTrackingNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.applianceDeliveryVendor == null
                                ? 43
                                : this.applianceDeliveryVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.customerShippingAddress == null
                                ? 43
                                : this.customerShippingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.uploadStatusLogUri == null
                                ? 43
                                : this.uploadStatusLogUri.hashCode());
        result =
                (result * PRIME)
                        + (this.returnShippingLabelUri == null
                                ? 43
                                : this.returnShippingLabelUri.hashCode());
        result =
                (result * PRIME)
                        + (this.expectedReturnDate == null
                                ? 43
                                : this.expectedReturnDate.hashCode());
        result =
                (result * PRIME)
                        + (this.pickupWindowStartTime == null
                                ? 43
                                : this.pickupWindowStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.pickupWindowEndTime == null
                                ? 43
                                : this.pickupWindowEndTime.hashCode());
        result =
                (result * PRIME)
                        + (this.minimumStorageCapacityInTerabytes == null
                                ? 43
                                : this.minimumStorageCapacityInTerabytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
