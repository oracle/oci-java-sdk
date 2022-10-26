/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Download Wallet details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DownloadOperationsInsightsWarehouseWalletDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DownloadOperationsInsightsWarehouseWalletDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operationsInsightsWarehouseWalletPassword"})
    public DownloadOperationsInsightsWarehouseWalletDetails(
            String operationsInsightsWarehouseWalletPassword) {
        super();
        this.operationsInsightsWarehouseWalletPassword = operationsInsightsWarehouseWalletPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User provided ADW wallet password for the Operations Insights Warehouse. */
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseWalletPassword")
        private String operationsInsightsWarehouseWalletPassword;

        /**
         * User provided ADW wallet password for the Operations Insights Warehouse.
         *
         * @param operationsInsightsWarehouseWalletPassword the value to set
         * @return this builder
         */
        public Builder operationsInsightsWarehouseWalletPassword(
                String operationsInsightsWarehouseWalletPassword) {
            this.operationsInsightsWarehouseWalletPassword =
                    operationsInsightsWarehouseWalletPassword;
            this.__explicitlySet__.add("operationsInsightsWarehouseWalletPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DownloadOperationsInsightsWarehouseWalletDetails build() {
            DownloadOperationsInsightsWarehouseWalletDetails model =
                    new DownloadOperationsInsightsWarehouseWalletDetails(
                            this.operationsInsightsWarehouseWalletPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DownloadOperationsInsightsWarehouseWalletDetails model) {
            if (model.wasPropertyExplicitlySet("operationsInsightsWarehouseWalletPassword")) {
                this.operationsInsightsWarehouseWalletPassword(
                        model.getOperationsInsightsWarehouseWalletPassword());
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

    /** User provided ADW wallet password for the Operations Insights Warehouse. */
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseWalletPassword")
    private final String operationsInsightsWarehouseWalletPassword;

    /**
     * User provided ADW wallet password for the Operations Insights Warehouse.
     *
     * @return the value
     */
    public String getOperationsInsightsWarehouseWalletPassword() {
        return operationsInsightsWarehouseWalletPassword;
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
        sb.append("DownloadOperationsInsightsWarehouseWalletDetails(");
        sb.append("super=").append(super.toString());
        sb.append("operationsInsightsWarehouseWalletPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DownloadOperationsInsightsWarehouseWalletDetails)) {
            return false;
        }

        DownloadOperationsInsightsWarehouseWalletDetails other =
                (DownloadOperationsInsightsWarehouseWalletDetails) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouseWalletPassword,
                        other.operationsInsightsWarehouseWalletPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseWalletPassword == null
                                ? 43
                                : this.operationsInsightsWarehouseWalletPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
