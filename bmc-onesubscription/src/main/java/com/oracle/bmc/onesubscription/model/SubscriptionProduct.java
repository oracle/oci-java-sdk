/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Product description <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SubscriptionProduct.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SubscriptionProduct
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"partNumber", "name", "unitOfMeasure", "provisioningGroup"})
    public SubscriptionProduct(
            String partNumber, String name, String unitOfMeasure, String provisioningGroup) {
        super();
        this.partNumber = partNumber;
        this.name = name;
        this.unitOfMeasure = unitOfMeasure;
        this.provisioningGroup = provisioningGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Product part numner */
        @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
        private String partNumber;

        /**
         * Product part numner
         *
         * @param partNumber the value to set
         * @return this builder
         */
        public Builder partNumber(String partNumber) {
            this.partNumber = partNumber;
            this.__explicitlySet__.add("partNumber");
            return this;
        }
        /** Product name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Product name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Unit of measure */
        @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
        private String unitOfMeasure;

        /**
         * Unit of measure
         *
         * @param unitOfMeasure the value to set
         * @return this builder
         */
        public Builder unitOfMeasure(String unitOfMeasure) {
            this.unitOfMeasure = unitOfMeasure;
            this.__explicitlySet__.add("unitOfMeasure");
            return this;
        }
        /** Product provisioning group */
        @com.fasterxml.jackson.annotation.JsonProperty("provisioningGroup")
        private String provisioningGroup;

        /**
         * Product provisioning group
         *
         * @param provisioningGroup the value to set
         * @return this builder
         */
        public Builder provisioningGroup(String provisioningGroup) {
            this.provisioningGroup = provisioningGroup;
            this.__explicitlySet__.add("provisioningGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SubscriptionProduct build() {
            SubscriptionProduct model =
                    new SubscriptionProduct(
                            this.partNumber, this.name, this.unitOfMeasure, this.provisioningGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SubscriptionProduct model) {
            if (model.wasPropertyExplicitlySet("partNumber")) {
                this.partNumber(model.getPartNumber());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("unitOfMeasure")) {
                this.unitOfMeasure(model.getUnitOfMeasure());
            }
            if (model.wasPropertyExplicitlySet("provisioningGroup")) {
                this.provisioningGroup(model.getProvisioningGroup());
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

    /** Product part numner */
    @com.fasterxml.jackson.annotation.JsonProperty("partNumber")
    private final String partNumber;

    /**
     * Product part numner
     *
     * @return the value
     */
    public String getPartNumber() {
        return partNumber;
    }

    /** Product name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Product name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Unit of measure */
    @com.fasterxml.jackson.annotation.JsonProperty("unitOfMeasure")
    private final String unitOfMeasure;

    /**
     * Unit of measure
     *
     * @return the value
     */
    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /** Product provisioning group */
    @com.fasterxml.jackson.annotation.JsonProperty("provisioningGroup")
    private final String provisioningGroup;

    /**
     * Product provisioning group
     *
     * @return the value
     */
    public String getProvisioningGroup() {
        return provisioningGroup;
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
        sb.append("SubscriptionProduct(");
        sb.append("super=").append(super.toString());
        sb.append("partNumber=").append(String.valueOf(this.partNumber));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", unitOfMeasure=").append(String.valueOf(this.unitOfMeasure));
        sb.append(", provisioningGroup=").append(String.valueOf(this.provisioningGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubscriptionProduct)) {
            return false;
        }

        SubscriptionProduct other = (SubscriptionProduct) o;
        return java.util.Objects.equals(this.partNumber, other.partNumber)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.unitOfMeasure, other.unitOfMeasure)
                && java.util.Objects.equals(this.provisioningGroup, other.provisioningGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.partNumber == null ? 43 : this.partNumber.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.unitOfMeasure == null ? 43 : this.unitOfMeasure.hashCode());
        result =
                (result * PRIME)
                        + (this.provisioningGroup == null ? 43 : this.provisioningGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
