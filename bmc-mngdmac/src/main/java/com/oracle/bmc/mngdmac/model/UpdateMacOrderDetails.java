/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mngdmac.model;

/**
 * The data to update a MacOrder. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250320")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMacOrderDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMacOrderDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "orderDescription",
        "orderSize",
        "shape",
        "ipRange"
    })
    public UpdateMacOrderDetails(
            String displayName,
            String orderDescription,
            Integer orderSize,
            MacOrder.Shape shape,
            String ipRange) {
        super();
        this.displayName = displayName;
        this.orderDescription = orderDescription;
        this.orderSize = orderSize;
        this.shape = shape;
        this.ipRange = ipRange;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A user-friendly description. To provide some insight about the resource. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("orderDescription")
        private String orderDescription;

        /**
         * A user-friendly description. To provide some insight about the resource. Avoid entering
         * confidential information.
         *
         * @param orderDescription the value to set
         * @return this builder
         */
        public Builder orderDescription(String orderDescription) {
            this.orderDescription = orderDescription;
            this.__explicitlySet__.add("orderDescription");
            return this;
        }
        /** Number of macs requested in this MacOrder. */
        @com.fasterxml.jackson.annotation.JsonProperty("orderSize")
        private Integer orderSize;

        /**
         * Number of macs requested in this MacOrder.
         *
         * @param orderSize the value to set
         * @return this builder
         */
        public Builder orderSize(Integer orderSize) {
            this.orderSize = orderSize;
            this.__explicitlySet__.add("orderSize");
            return this;
        }
        /** The shape of the Mac. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private MacOrder.Shape shape;

        /**
         * The shape of the Mac.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(MacOrder.Shape shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The IP Range specified by the customer for this order. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipRange")
        private String ipRange;

        /**
         * The IP Range specified by the customer for this order.
         *
         * @param ipRange the value to set
         * @return this builder
         */
        public Builder ipRange(String ipRange) {
            this.ipRange = ipRange;
            this.__explicitlySet__.add("ipRange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMacOrderDetails build() {
            UpdateMacOrderDetails model =
                    new UpdateMacOrderDetails(
                            this.displayName,
                            this.orderDescription,
                            this.orderSize,
                            this.shape,
                            this.ipRange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMacOrderDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("orderDescription")) {
                this.orderDescription(model.getOrderDescription());
            }
            if (model.wasPropertyExplicitlySet("orderSize")) {
                this.orderSize(model.getOrderSize());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("ipRange")) {
                this.ipRange(model.getIpRange());
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

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. To provide some insight about the resource. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("orderDescription")
    private final String orderDescription;

    /**
     * A user-friendly description. To provide some insight about the resource. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getOrderDescription() {
        return orderDescription;
    }

    /** Number of macs requested in this MacOrder. */
    @com.fasterxml.jackson.annotation.JsonProperty("orderSize")
    private final Integer orderSize;

    /**
     * Number of macs requested in this MacOrder.
     *
     * @return the value
     */
    public Integer getOrderSize() {
        return orderSize;
    }

    /** The shape of the Mac. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final MacOrder.Shape shape;

    /**
     * The shape of the Mac.
     *
     * @return the value
     */
    public MacOrder.Shape getShape() {
        return shape;
    }

    /** The IP Range specified by the customer for this order. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipRange")
    private final String ipRange;

    /**
     * The IP Range specified by the customer for this order.
     *
     * @return the value
     */
    public String getIpRange() {
        return ipRange;
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
        sb.append("UpdateMacOrderDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", orderDescription=").append(String.valueOf(this.orderDescription));
        sb.append(", orderSize=").append(String.valueOf(this.orderSize));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", ipRange=").append(String.valueOf(this.ipRange));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMacOrderDetails)) {
            return false;
        }

        UpdateMacOrderDetails other = (UpdateMacOrderDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.orderDescription, other.orderDescription)
                && java.util.Objects.equals(this.orderSize, other.orderSize)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.ipRange, other.ipRange)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.orderDescription == null ? 43 : this.orderDescription.hashCode());
        result = (result * PRIME) + (this.orderSize == null ? 43 : this.orderSize.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.ipRange == null ? 43 : this.ipRange.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
