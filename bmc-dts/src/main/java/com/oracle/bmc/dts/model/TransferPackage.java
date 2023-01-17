/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TransferPackage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TransferPackage extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "label",
        "lifecycleState",
        "transferJobId",
        "creationTime",
        "originalPackageDeliveryTrackingNumber",
        "returnPackageDeliveryTrackingNumber",
        "packageDeliveryVendor",
        "transferSiteShippingAddress",
        "attachedTransferDeviceLabels"
    })
    public TransferPackage(
            String label,
            LifecycleState lifecycleState,
            String transferJobId,
            java.util.Date creationTime,
            String originalPackageDeliveryTrackingNumber,
            String returnPackageDeliveryTrackingNumber,
            String packageDeliveryVendor,
            String transferSiteShippingAddress,
            java.util.List<String> attachedTransferDeviceLabels) {
        super();
        this.label = label;
        this.lifecycleState = lifecycleState;
        this.transferJobId = transferJobId;
        this.creationTime = creationTime;
        this.originalPackageDeliveryTrackingNumber = originalPackageDeliveryTrackingNumber;
        this.returnPackageDeliveryTrackingNumber = returnPackageDeliveryTrackingNumber;
        this.packageDeliveryVendor = packageDeliveryVendor;
        this.transferSiteShippingAddress = transferSiteShippingAddress;
        this.attachedTransferDeviceLabels = attachedTransferDeviceLabels;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalPackageDeliveryTrackingNumber")
        private String originalPackageDeliveryTrackingNumber;

        public Builder originalPackageDeliveryTrackingNumber(
                String originalPackageDeliveryTrackingNumber) {
            this.originalPackageDeliveryTrackingNumber = originalPackageDeliveryTrackingNumber;
            this.__explicitlySet__.add("originalPackageDeliveryTrackingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("returnPackageDeliveryTrackingNumber")
        private String returnPackageDeliveryTrackingNumber;

        public Builder returnPackageDeliveryTrackingNumber(
                String returnPackageDeliveryTrackingNumber) {
            this.returnPackageDeliveryTrackingNumber = returnPackageDeliveryTrackingNumber;
            this.__explicitlySet__.add("returnPackageDeliveryTrackingNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("packageDeliveryVendor")
        private String packageDeliveryVendor;

        public Builder packageDeliveryVendor(String packageDeliveryVendor) {
            this.packageDeliveryVendor = packageDeliveryVendor;
            this.__explicitlySet__.add("packageDeliveryVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transferSiteShippingAddress")
        private String transferSiteShippingAddress;

        public Builder transferSiteShippingAddress(String transferSiteShippingAddress) {
            this.transferSiteShippingAddress = transferSiteShippingAddress;
            this.__explicitlySet__.add("transferSiteShippingAddress");
            return this;
        }
        /**
         * Transfer Devices attached to this Transfer Package
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferDeviceLabels")
        private java.util.List<String> attachedTransferDeviceLabels;

        /**
         * Transfer Devices attached to this Transfer Package
         * @param attachedTransferDeviceLabels the value to set
         * @return this builder
         **/
        public Builder attachedTransferDeviceLabels(
                java.util.List<String> attachedTransferDeviceLabels) {
            this.attachedTransferDeviceLabels = attachedTransferDeviceLabels;
            this.__explicitlySet__.add("attachedTransferDeviceLabels");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferPackage build() {
            TransferPackage model =
                    new TransferPackage(
                            this.label,
                            this.lifecycleState,
                            this.transferJobId,
                            this.creationTime,
                            this.originalPackageDeliveryTrackingNumber,
                            this.returnPackageDeliveryTrackingNumber,
                            this.packageDeliveryVendor,
                            this.transferSiteShippingAddress,
                            this.attachedTransferDeviceLabels);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferPackage model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("transferJobId")) {
                this.transferJobId(model.getTransferJobId());
            }
            if (model.wasPropertyExplicitlySet("creationTime")) {
                this.creationTime(model.getCreationTime());
            }
            if (model.wasPropertyExplicitlySet("originalPackageDeliveryTrackingNumber")) {
                this.originalPackageDeliveryTrackingNumber(
                        model.getOriginalPackageDeliveryTrackingNumber());
            }
            if (model.wasPropertyExplicitlySet("returnPackageDeliveryTrackingNumber")) {
                this.returnPackageDeliveryTrackingNumber(
                        model.getReturnPackageDeliveryTrackingNumber());
            }
            if (model.wasPropertyExplicitlySet("packageDeliveryVendor")) {
                this.packageDeliveryVendor(model.getPackageDeliveryVendor());
            }
            if (model.wasPropertyExplicitlySet("transferSiteShippingAddress")) {
                this.transferSiteShippingAddress(model.getTransferSiteShippingAddress());
            }
            if (model.wasPropertyExplicitlySet("attachedTransferDeviceLabels")) {
                this.attachedTransferDeviceLabels(model.getAttachedTransferDeviceLabels());
            }
            return this;
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

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    public String getLabel() {
        return label;
    }

    /**
     **/
    public enum LifecycleState {
        Preparing("PREPARING"),
        Shipping("SHIPPING"),
        Received("RECEIVED"),
        Processing("PROCESSING"),
        Processed("PROCESSED"),
        Returned("RETURNED"),
        Deleted("DELETED"),
        Cancelled("CANCELLED"),
        CancelledReturned("CANCELLED_RETURNED"),

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

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    private final java.util.Date creationTime;

    public java.util.Date getCreationTime() {
        return creationTime;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("originalPackageDeliveryTrackingNumber")
    private final String originalPackageDeliveryTrackingNumber;

    public String getOriginalPackageDeliveryTrackingNumber() {
        return originalPackageDeliveryTrackingNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("returnPackageDeliveryTrackingNumber")
    private final String returnPackageDeliveryTrackingNumber;

    public String getReturnPackageDeliveryTrackingNumber() {
        return returnPackageDeliveryTrackingNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("packageDeliveryVendor")
    private final String packageDeliveryVendor;

    public String getPackageDeliveryVendor() {
        return packageDeliveryVendor;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("transferSiteShippingAddress")
    private final String transferSiteShippingAddress;

    public String getTransferSiteShippingAddress() {
        return transferSiteShippingAddress;
    }

    /**
     * Transfer Devices attached to this Transfer Package
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferDeviceLabels")
    private final java.util.List<String> attachedTransferDeviceLabels;

    /**
     * Transfer Devices attached to this Transfer Package
     * @return the value
     **/
    public java.util.List<String> getAttachedTransferDeviceLabels() {
        return attachedTransferDeviceLabels;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TransferPackage(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", transferJobId=").append(String.valueOf(this.transferJobId));
        sb.append(", creationTime=").append(String.valueOf(this.creationTime));
        sb.append(", originalPackageDeliveryTrackingNumber=")
                .append(String.valueOf(this.originalPackageDeliveryTrackingNumber));
        sb.append(", returnPackageDeliveryTrackingNumber=")
                .append(String.valueOf(this.returnPackageDeliveryTrackingNumber));
        sb.append(", packageDeliveryVendor=").append(String.valueOf(this.packageDeliveryVendor));
        sb.append(", transferSiteShippingAddress=")
                .append(String.valueOf(this.transferSiteShippingAddress));
        sb.append(", attachedTransferDeviceLabels=")
                .append(String.valueOf(this.attachedTransferDeviceLabels));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TransferPackage)) {
            return false;
        }

        TransferPackage other = (TransferPackage) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.transferJobId, other.transferJobId)
                && java.util.Objects.equals(this.creationTime, other.creationTime)
                && java.util.Objects.equals(
                        this.originalPackageDeliveryTrackingNumber,
                        other.originalPackageDeliveryTrackingNumber)
                && java.util.Objects.equals(
                        this.returnPackageDeliveryTrackingNumber,
                        other.returnPackageDeliveryTrackingNumber)
                && java.util.Objects.equals(this.packageDeliveryVendor, other.packageDeliveryVendor)
                && java.util.Objects.equals(
                        this.transferSiteShippingAddress, other.transferSiteShippingAddress)
                && java.util.Objects.equals(
                        this.attachedTransferDeviceLabels, other.attachedTransferDeviceLabels)
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
        result = (result * PRIME) + (this.creationTime == null ? 43 : this.creationTime.hashCode());
        result =
                (result * PRIME)
                        + (this.originalPackageDeliveryTrackingNumber == null
                                ? 43
                                : this.originalPackageDeliveryTrackingNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.returnPackageDeliveryTrackingNumber == null
                                ? 43
                                : this.returnPackageDeliveryTrackingNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.packageDeliveryVendor == null
                                ? 43
                                : this.packageDeliveryVendor.hashCode());
        result =
                (result * PRIME)
                        + (this.transferSiteShippingAddress == null
                                ? 43
                                : this.transferSiteShippingAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.attachedTransferDeviceLabels == null
                                ? 43
                                : this.attachedTransferDeviceLabels.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
