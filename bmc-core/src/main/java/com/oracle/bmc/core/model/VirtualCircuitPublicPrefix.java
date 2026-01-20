/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A public IP prefix and its details. With a public virtual circuit, the customer specifies the
 * customer-owned public IP prefixes to advertise across the connection. For more information, see
 * [FastConnect Overview](https://docs.oracle.com/iaas/Content/Network/Concepts/fastconnect.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = VirtualCircuitPublicPrefix.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VirtualCircuitPublicPrefix
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"cidrBlock", "verificationState"})
    public VirtualCircuitPublicPrefix(String cidrBlock, VerificationState verificationState) {
        super();
        this.cidrBlock = cidrBlock;
        this.verificationState = verificationState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Publix IP prefix (CIDR) that the customer specified. */
        @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
        private String cidrBlock;

        /**
         * Publix IP prefix (CIDR) that the customer specified.
         *
         * @param cidrBlock the value to set
         * @return this builder
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            this.__explicitlySet__.add("cidrBlock");
            return this;
        }
        /**
         * Oracle must verify that the customer owns the public IP prefix before traffic for that
         * prefix can flow across the virtual circuit. Verification can take a few business days.
         * {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED} means
         * verification succeeded. {@code FAILED} means verification failed and traffic for this
         * prefix will not flow across the connection.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("verificationState")
        private VerificationState verificationState;

        /**
         * Oracle must verify that the customer owns the public IP prefix before traffic for that
         * prefix can flow across the virtual circuit. Verification can take a few business days.
         * {@code IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED} means
         * verification succeeded. {@code FAILED} means verification failed and traffic for this
         * prefix will not flow across the connection.
         *
         * @param verificationState the value to set
         * @return this builder
         */
        public Builder verificationState(VerificationState verificationState) {
            this.verificationState = verificationState;
            this.__explicitlySet__.add("verificationState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VirtualCircuitPublicPrefix build() {
            VirtualCircuitPublicPrefix model =
                    new VirtualCircuitPublicPrefix(this.cidrBlock, this.verificationState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VirtualCircuitPublicPrefix model) {
            if (model.wasPropertyExplicitlySet("cidrBlock")) {
                this.cidrBlock(model.getCidrBlock());
            }
            if (model.wasPropertyExplicitlySet("verificationState")) {
                this.verificationState(model.getVerificationState());
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

    /** Publix IP prefix (CIDR) that the customer specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("cidrBlock")
    private final String cidrBlock;

    /**
     * Publix IP prefix (CIDR) that the customer specified.
     *
     * @return the value
     */
    public String getCidrBlock() {
        return cidrBlock;
    }

    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic for that prefix
     * can flow across the virtual circuit. Verification can take a few business days. {@code
     * IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED} means verification
     * succeeded. {@code FAILED} means verification failed and traffic for this prefix will not flow
     * across the connection.
     */
    public enum VerificationState implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Completed("COMPLETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(VerificationState.class);

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
     * Oracle must verify that the customer owns the public IP prefix before traffic for that prefix
     * can flow across the virtual circuit. Verification can take a few business days. {@code
     * IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED} means verification
     * succeeded. {@code FAILED} means verification failed and traffic for this prefix will not flow
     * across the connection.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verificationState")
    private final VerificationState verificationState;

    /**
     * Oracle must verify that the customer owns the public IP prefix before traffic for that prefix
     * can flow across the virtual circuit. Verification can take a few business days. {@code
     * IN_PROGRESS} means Oracle is verifying the prefix. {@code COMPLETED} means verification
     * succeeded. {@code FAILED} means verification failed and traffic for this prefix will not flow
     * across the connection.
     *
     * @return the value
     */
    public VerificationState getVerificationState() {
        return verificationState;
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
        sb.append("VirtualCircuitPublicPrefix(");
        sb.append("super=").append(super.toString());
        sb.append("cidrBlock=").append(String.valueOf(this.cidrBlock));
        sb.append(", verificationState=").append(String.valueOf(this.verificationState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VirtualCircuitPublicPrefix)) {
            return false;
        }

        VirtualCircuitPublicPrefix other = (VirtualCircuitPublicPrefix) o;
        return java.util.Objects.equals(this.cidrBlock, other.cidrBlock)
                && java.util.Objects.equals(this.verificationState, other.verificationState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cidrBlock == null ? 43 : this.cidrBlock.hashCode());
        result =
                (result * PRIME)
                        + (this.verificationState == null ? 43 : this.verificationState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
