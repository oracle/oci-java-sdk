/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Operations Insights Warehouse data objects operations. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OpsiWarehouseDataObjects.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OpsiWarehouseDataObjects
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"opsiWarehouseDataObjects"})
    public OpsiWarehouseDataObjects(Object opsiWarehouseDataObjects) {
        super();
        this.opsiWarehouseDataObjects = opsiWarehouseDataObjects;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Operations Insights Warehouse Data Object. */
        @com.fasterxml.jackson.annotation.JsonProperty("opsiWarehouseDataObjects")
        private Object opsiWarehouseDataObjects;

        /**
         * Operations Insights Warehouse Data Object.
         *
         * @param opsiWarehouseDataObjects the value to set
         * @return this builder
         */
        public Builder opsiWarehouseDataObjects(Object opsiWarehouseDataObjects) {
            this.opsiWarehouseDataObjects = opsiWarehouseDataObjects;
            this.__explicitlySet__.add("opsiWarehouseDataObjects");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpsiWarehouseDataObjects build() {
            OpsiWarehouseDataObjects model =
                    new OpsiWarehouseDataObjects(this.opsiWarehouseDataObjects);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpsiWarehouseDataObjects model) {
            if (model.wasPropertyExplicitlySet("opsiWarehouseDataObjects")) {
                this.opsiWarehouseDataObjects(model.getOpsiWarehouseDataObjects());
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

    /** Operations Insights Warehouse Data Object. */
    @com.fasterxml.jackson.annotation.JsonProperty("opsiWarehouseDataObjects")
    private final Object opsiWarehouseDataObjects;

    /**
     * Operations Insights Warehouse Data Object.
     *
     * @return the value
     */
    public Object getOpsiWarehouseDataObjects() {
        return opsiWarehouseDataObjects;
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
        sb.append("OpsiWarehouseDataObjects(");
        sb.append("super=").append(super.toString());
        sb.append("opsiWarehouseDataObjects=")
                .append(String.valueOf(this.opsiWarehouseDataObjects));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpsiWarehouseDataObjects)) {
            return false;
        }

        OpsiWarehouseDataObjects other = (OpsiWarehouseDataObjects) o;
        return java.util.Objects.equals(
                        this.opsiWarehouseDataObjects, other.opsiWarehouseDataObjects)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.opsiWarehouseDataObjects == null
                                ? 43
                                : this.opsiWarehouseDataObjects.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
