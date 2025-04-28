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
        builder = UpdateTransferPackageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateTransferPackageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "originalPackageDeliveryTrackingNumber",
        "returnPackageDeliveryTrackingNumber",
        "packageDeliveryVendor",
        "lifecycleState"
    })
    public UpdateTransferPackageDetails(
            String originalPackageDeliveryTrackingNumber,
            String returnPackageDeliveryTrackingNumber,
            String packageDeliveryVendor,
            LifecycleState lifecycleState) {
        super();
        this.originalPackageDeliveryTrackingNumber = originalPackageDeliveryTrackingNumber;
        this.returnPackageDeliveryTrackingNumber = returnPackageDeliveryTrackingNumber;
        this.packageDeliveryVendor = packageDeliveryVendor;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

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

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateTransferPackageDetails build() {
            UpdateTransferPackageDetails model =
                    new UpdateTransferPackageDetails(
                            this.originalPackageDeliveryTrackingNumber,
                            this.returnPackageDeliveryTrackingNumber,
                            this.packageDeliveryVendor,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTransferPackageDetails model) {
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
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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

    /** */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Shipping("SHIPPING"),
        Cancelled("CANCELLED"),
        ;

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid LifecycleState: " + key);
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("UpdateTransferPackageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("originalPackageDeliveryTrackingNumber=")
                .append(String.valueOf(this.originalPackageDeliveryTrackingNumber));
        sb.append(", returnPackageDeliveryTrackingNumber=")
                .append(String.valueOf(this.returnPackageDeliveryTrackingNumber));
        sb.append(", packageDeliveryVendor=").append(String.valueOf(this.packageDeliveryVendor));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateTransferPackageDetails)) {
            return false;
        }

        UpdateTransferPackageDetails other = (UpdateTransferPackageDetails) o;
        return java.util.Objects.equals(
                        this.originalPackageDeliveryTrackingNumber,
                        other.originalPackageDeliveryTrackingNumber)
                && java.util.Objects.equals(
                        this.returnPackageDeliveryTrackingNumber,
                        other.returnPackageDeliveryTrackingNumber)
                && java.util.Objects.equals(this.packageDeliveryVendor, other.packageDeliveryVendor)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
