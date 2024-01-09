/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.recovery.model;

/**
 * Parameters to retrieve information about a specific recovery service subnet. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210216")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RecoveryServiceSubnetInput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecoveryServiceSubnetInput
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"recoveryServiceSubnetId"})
    public RecoveryServiceSubnetInput(String recoveryServiceSubnetId) {
        super();
        this.recoveryServiceSubnetId = recoveryServiceSubnetId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The recovery service subnet OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnetId")
        private String recoveryServiceSubnetId;

        /**
         * The recovery service subnet OCID.
         *
         * @param recoveryServiceSubnetId the value to set
         * @return this builder
         */
        public Builder recoveryServiceSubnetId(String recoveryServiceSubnetId) {
            this.recoveryServiceSubnetId = recoveryServiceSubnetId;
            this.__explicitlySet__.add("recoveryServiceSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecoveryServiceSubnetInput build() {
            RecoveryServiceSubnetInput model =
                    new RecoveryServiceSubnetInput(this.recoveryServiceSubnetId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecoveryServiceSubnetInput model) {
            if (model.wasPropertyExplicitlySet("recoveryServiceSubnetId")) {
                this.recoveryServiceSubnetId(model.getRecoveryServiceSubnetId());
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

    /** The recovery service subnet OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryServiceSubnetId")
    private final String recoveryServiceSubnetId;

    /**
     * The recovery service subnet OCID.
     *
     * @return the value
     */
    public String getRecoveryServiceSubnetId() {
        return recoveryServiceSubnetId;
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
        sb.append("RecoveryServiceSubnetInput(");
        sb.append("super=").append(super.toString());
        sb.append("recoveryServiceSubnetId=").append(String.valueOf(this.recoveryServiceSubnetId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecoveryServiceSubnetInput)) {
            return false;
        }

        RecoveryServiceSubnetInput other = (RecoveryServiceSubnetInput) o;
        return java.util.Objects.equals(this.recoveryServiceSubnetId, other.recoveryServiceSubnetId)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
