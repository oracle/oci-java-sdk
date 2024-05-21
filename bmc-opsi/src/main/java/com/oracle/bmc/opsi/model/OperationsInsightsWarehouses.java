/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Operations Insights Warehouse operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OperationsInsightsWarehouses.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperationsInsightsWarehouses
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operationsInsightsWarehouses"})
    public OperationsInsightsWarehouses(Object operationsInsightsWarehouses) {
        super();
        this.operationsInsightsWarehouses = operationsInsightsWarehouses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operations Insights Warehouse Object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouses")
        private Object operationsInsightsWarehouses;

        /**
         * Operations Insights Warehouse Object.
         * @param operationsInsightsWarehouses the value to set
         * @return this builder
         **/
        public Builder operationsInsightsWarehouses(Object operationsInsightsWarehouses) {
            this.operationsInsightsWarehouses = operationsInsightsWarehouses;
            this.__explicitlySet__.add("operationsInsightsWarehouses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationsInsightsWarehouses build() {
            OperationsInsightsWarehouses model =
                    new OperationsInsightsWarehouses(this.operationsInsightsWarehouses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationsInsightsWarehouses model) {
            if (model.wasPropertyExplicitlySet("operationsInsightsWarehouses")) {
                this.operationsInsightsWarehouses(model.getOperationsInsightsWarehouses());
            }
            return this;
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
     * Operations Insights Warehouse Object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouses")
    private final Object operationsInsightsWarehouses;

    /**
     * Operations Insights Warehouse Object.
     * @return the value
     **/
    public Object getOperationsInsightsWarehouses() {
        return operationsInsightsWarehouses;
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
        sb.append("OperationsInsightsWarehouses(");
        sb.append("super=").append(super.toString());
        sb.append("operationsInsightsWarehouses=")
                .append(String.valueOf(this.operationsInsightsWarehouses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationsInsightsWarehouses)) {
            return false;
        }

        OperationsInsightsWarehouses other = (OperationsInsightsWarehouses) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouses, other.operationsInsightsWarehouses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouses == null
                                ? 43
                                : this.operationsInsightsWarehouses.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
