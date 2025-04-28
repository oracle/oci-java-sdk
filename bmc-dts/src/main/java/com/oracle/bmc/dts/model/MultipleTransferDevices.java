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
        builder = MultipleTransferDevices.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MultipleTransferDevices
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"transferDeviceObjects"})
    public MultipleTransferDevices(java.util.List<TransferDeviceSummary> transferDeviceObjects) {
        super();
        this.transferDeviceObjects = transferDeviceObjects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of TransferDeviceObject's */
        @com.fasterxml.jackson.annotation.JsonProperty("transferDeviceObjects")
        private java.util.List<TransferDeviceSummary> transferDeviceObjects;

        /**
         * List of TransferDeviceObject's
         *
         * @param transferDeviceObjects the value to set
         * @return this builder
         */
        public Builder transferDeviceObjects(
                java.util.List<TransferDeviceSummary> transferDeviceObjects) {
            this.transferDeviceObjects = transferDeviceObjects;
            this.__explicitlySet__.add("transferDeviceObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MultipleTransferDevices build() {
            MultipleTransferDevices model = new MultipleTransferDevices(this.transferDeviceObjects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MultipleTransferDevices model) {
            if (model.wasPropertyExplicitlySet("transferDeviceObjects")) {
                this.transferDeviceObjects(model.getTransferDeviceObjects());
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

    /** List of TransferDeviceObject's */
    @com.fasterxml.jackson.annotation.JsonProperty("transferDeviceObjects")
    private final java.util.List<TransferDeviceSummary> transferDeviceObjects;

    /**
     * List of TransferDeviceObject's
     *
     * @return the value
     */
    public java.util.List<TransferDeviceSummary> getTransferDeviceObjects() {
        return transferDeviceObjects;
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
        sb.append("MultipleTransferDevices(");
        sb.append("super=").append(super.toString());
        sb.append("transferDeviceObjects=").append(String.valueOf(this.transferDeviceObjects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MultipleTransferDevices)) {
            return false;
        }

        MultipleTransferDevices other = (MultipleTransferDevices) o;
        return java.util.Objects.equals(this.transferDeviceObjects, other.transferDeviceObjects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.transferDeviceObjects == null
                                ? 43
                                : this.transferDeviceObjects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
