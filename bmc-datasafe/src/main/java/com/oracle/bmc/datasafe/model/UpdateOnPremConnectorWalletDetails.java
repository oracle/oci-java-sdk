/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details used to update an on-premises connector's wallet.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateOnPremConnectorWalletDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateOnPremConnectorWalletDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"isUpdate"})
    public UpdateOnPremConnectorWalletDetails(Boolean isUpdate) {
        super();
        this.isUpdate = isUpdate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether to update or not. If false, the wallet will not be updated. Default is false.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUpdate")
        private Boolean isUpdate;

        /**
         * Indicates whether to update or not. If false, the wallet will not be updated. Default is false.
         * @param isUpdate the value to set
         * @return this builder
         **/
        public Builder isUpdate(Boolean isUpdate) {
            this.isUpdate = isUpdate;
            this.__explicitlySet__.add("isUpdate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOnPremConnectorWalletDetails build() {
            UpdateOnPremConnectorWalletDetails __instance__ =
                    new UpdateOnPremConnectorWalletDetails(isUpdate);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOnPremConnectorWalletDetails o) {
            Builder copiedBuilder = isUpdate(o.getIsUpdate());

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
     * Indicates whether to update or not. If false, the wallet will not be updated. Default is false.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUpdate")
    private final Boolean isUpdate;

    /**
     * Indicates whether to update or not. If false, the wallet will not be updated. Default is false.
     * @return the value
     **/
    public Boolean getIsUpdate() {
        return isUpdate;
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
        sb.append("UpdateOnPremConnectorWalletDetails(");
        sb.append("isUpdate=").append(String.valueOf(this.isUpdate));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOnPremConnectorWalletDetails)) {
            return false;
        }

        UpdateOnPremConnectorWalletDetails other = (UpdateOnPremConnectorWalletDetails) o;
        return java.util.Objects.equals(this.isUpdate, other.isUpdate)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isUpdate == null ? 43 : this.isUpdate.hashCode());
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
