/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.011")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateTransferPackageDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateTransferPackageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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
            UpdateTransferPackageDetails __instance__ =
                    new UpdateTransferPackageDetails(
                            originalPackageDeliveryTrackingNumber,
                            returnPackageDeliveryTrackingNumber,
                            packageDeliveryVendor,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateTransferPackageDetails o) {
            Builder copiedBuilder =
                    originalPackageDeliveryTrackingNumber(
                                    o.getOriginalPackageDeliveryTrackingNumber())
                            .returnPackageDeliveryTrackingNumber(
                                    o.getReturnPackageDeliveryTrackingNumber())
                            .packageDeliveryVendor(o.getPackageDeliveryVendor())
                            .lifecycleState(o.getLifecycleState());

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

    @com.fasterxml.jackson.annotation.JsonProperty("originalPackageDeliveryTrackingNumber")
    String originalPackageDeliveryTrackingNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("returnPackageDeliveryTrackingNumber")
    String returnPackageDeliveryTrackingNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("packageDeliveryVendor")
    String packageDeliveryVendor;
    /**
     **/
    public enum LifecycleState {
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
            throw new RuntimeException("Invalid LifecycleState: " + key);
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
