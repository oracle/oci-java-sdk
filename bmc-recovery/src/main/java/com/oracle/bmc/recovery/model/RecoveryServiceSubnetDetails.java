/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Details of the Recovery Service Subnet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecoveryServiceSubnetDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RecoveryServiceSubnetDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"recoveryServiceSubnetId", "lifecycleState"})
    public RecoveryServiceSubnetDetails(
            String recoveryServiceSubnetId, LifecycleState lifecycleState) {
        super();
        this.recoveryServiceSubnetId = recoveryServiceSubnetId;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Recovery Service Subnet Identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnetId")
        private String recoveryServiceSubnetId;

        /**
         * Recovery Service Subnet Identifier.
         *
         * @param recoveryServiceSubnetId the value to set
         * @return this builder
         */
        public Builder recoveryServiceSubnetId(String recoveryServiceSubnetId) {
            this.recoveryServiceSubnetId = recoveryServiceSubnetId;
            this.__explicitlySet__.add("recoveryServiceSubnetId");
            return this;
        }
        /** The current state of the Recovery Service Subnet. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Recovery Service Subnet.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecoveryServiceSubnetDetails build() {
            RecoveryServiceSubnetDetails model =
                    new RecoveryServiceSubnetDetails(
                            this.recoveryServiceSubnetId, this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecoveryServiceSubnetDetails model) {
            if (model.wasPropertyExplicitlySet("recoveryServiceSubnetId")) {
                this.recoveryServiceSubnetId(model.getRecoveryServiceSubnetId());
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

    /** Recovery Service Subnet Identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnetId")
    private final String recoveryServiceSubnetId;

    /**
     * Recovery Service Subnet Identifier.
     *
     * @return the value
     */
    public String getRecoveryServiceSubnetId() {
        return recoveryServiceSubnetId;
    }

    /** The current state of the Recovery Service Subnet. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Recovery Service Subnet.
     *
     * @return the value
     */
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
        sb.append("RecoveryServiceSubnetDetails(");
        sb.append("super=").append(super.toString());
        sb.append("recoveryServiceSubnetId=").append(String.valueOf(this.recoveryServiceSubnetId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecoveryServiceSubnetDetails)) {
            return false;
        }

        RecoveryServiceSubnetDetails other = (RecoveryServiceSubnetDetails) o;
        return java.util.Objects.equals(this.recoveryServiceSubnetId, other.recoveryServiceSubnetId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.recoveryServiceSubnetId == null
                                ? 43
                                : this.recoveryServiceSubnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
