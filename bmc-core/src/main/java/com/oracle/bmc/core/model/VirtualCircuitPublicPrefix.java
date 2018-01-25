/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.model;

/**
 * A public IP prefix and its details. With a public virtual circuit, the customer
 * specifies the customer-owned public IP prefixes to advertise across the connection.
 * For more information, see [FastConnect Overview](https://docs.us-phoenix-1.oraclecloud.com/Content/Network/Concepts/fastconnect.htm).
 *
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VirtualCircuitPublicPrefix.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class VirtualCircuitPublicPrefix {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("verificationState")
        private VerificationState verificationState;

        public Builder verificationState(VerificationState verificationState) {
            this.verificationState = verificationState;
            this.__explicitlySet__.add("verificationState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitPublicPrefix build() {
            VirtualCircuitPublicPrefix __instance__ =
                    new VirtualCircuitPublicPrefix(cidrBlock, verificationState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitPublicPrefix o) {
            Builder copiedBuilder =
                    cidrBlock(o.getCidrBlock()).verificationState(o.getVerificationState());

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
     * Publix IP prefix (CIDR) that the customer specified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    String cidrBlock;
    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic
     * for that prefix can flow across the virtual circuit. Verification can take a
     * few business days. `IN_PROGRESS` means Oracle is verifying the prefix. `COMPLETED`
     * means verification succeeded. `FAILED` means verification failed and traffic for
     * this prefix will not flow across the connection.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum VerificationState {
        InProgress("IN_PROGRESS"),
        Completed("COMPLETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, VerificationState> map;

        static {
            map = new java.util.HashMap<>();
            for (VerificationState v : VerificationState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        VerificationState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static VerificationState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'VerificationState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic
     * for that prefix can flow across the virtual circuit. Verification can take a
     * few business days. `IN_PROGRESS` means Oracle is verifying the prefix. `COMPLETED`
     * means verification succeeded. `FAILED` means verification failed and traffic for
     * this prefix will not flow across the connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("verificationState")
    VerificationState verificationState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
