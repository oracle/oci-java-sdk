/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.015")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TransferAppliance.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TransferAppliance {
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
        "uploadStatusLogUri"
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
            String uploadStatusLogUri) {
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
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
         * @param label the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferAppliance build() {
            TransferAppliance __instance__ =
                    new TransferAppliance(
                            label,
                            lifecycleState,
                            transferJobId,
                            serialNumber,
                            creationTime,
                            customerReceivedTime,
                            customerReturnedTime,
                            nextBillingTime,
                            deliverySecurityTieId,
                            returnSecurityTieId,
                            applianceDeliveryTrackingNumber,
                            applianceReturnDeliveryTrackingNumber,
                            applianceDeliveryVendor,
                            customerShippingAddress,
                            uploadStatusLogUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferAppliance o) {
            Builder copiedBuilder =
                    label(o.getLabel())
                            .lifecycleState(o.getLifecycleState())
                            .transferJobId(o.getTransferJobId())
                            .serialNumber(o.getSerialNumber())
                            .creationTime(o.getCreationTime())
                            .customerReceivedTime(o.getCustomerReceivedTime())
                            .customerReturnedTime(o.getCustomerReturnedTime())
                            .nextBillingTime(o.getNextBillingTime())
                            .deliverySecurityTieId(o.getDeliverySecurityTieId())
                            .returnSecurityTieId(o.getReturnSecurityTieId())
                            .applianceDeliveryTrackingNumber(o.getApplianceDeliveryTrackingNumber())
                            .applianceReturnDeliveryTrackingNumber(
                                    o.getApplianceReturnDeliveryTrackingNumber())
                            .applianceDeliveryVendor(o.getApplianceDeliveryVendor())
                            .customerShippingAddress(o.getCustomerShippingAddress())
                            .uploadStatusLogUri(o.getUploadStatusLogUri());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
     * @return the value
     **/
    public String getLabel() {
        return label;
    }

    /**
     **/
    public enum LifecycleState {
        Requested("REQUESTED"),
        OraclePreparing("ORACLE_PREPARING"),
        Shipping("SHIPPING"),
        Delivered("DELIVERED"),
        Preparing("PREPARING"),
        Finalized("FINALIZED"),
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
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TransferAppliance(");
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
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
