/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.014")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TransferAppliance.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TransferAppliance {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

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

    /**
     * Unique alpha-numeric identifier for a transfer appliance auto generated during create.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    String label;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
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
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
    String transferJobId;

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    java.util.Date creationTime;

    @com.fasterxml.jackson.annotation.JsonProperty("customerReceivedTime")
    java.util.Date customerReceivedTime;

    @com.fasterxml.jackson.annotation.JsonProperty("customerReturnedTime")
    java.util.Date customerReturnedTime;

    @com.fasterxml.jackson.annotation.JsonProperty("nextBillingTime")
    java.util.Date nextBillingTime;

    @com.fasterxml.jackson.annotation.JsonProperty("deliverySecurityTieId")
    String deliverySecurityTieId;

    @com.fasterxml.jackson.annotation.JsonProperty("returnSecurityTieId")
    String returnSecurityTieId;

    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryTrackingNumber")
    String applianceDeliveryTrackingNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("applianceReturnDeliveryTrackingNumber")
    String applianceReturnDeliveryTrackingNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("applianceDeliveryVendor")
    String applianceDeliveryVendor;

    @com.fasterxml.jackson.annotation.JsonProperty("customerShippingAddress")
    ShippingAddress customerShippingAddress;

    @com.fasterxml.jackson.annotation.JsonProperty("uploadStatusLogUri")
    String uploadStatusLogUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
