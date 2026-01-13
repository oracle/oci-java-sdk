/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the Product. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComplianceDetailProduct.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComplianceDetailProduct
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"productStack", "productName", "productVersion"})
    public ComplianceDetailProduct(String productStack, String productName, String productVersion) {
        super();
        this.productStack = productStack;
        this.productName = productName;
        this.productVersion = productVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Product Stack. */
        @com.fasterxml.jackson.annotation.JsonProperty("productStack")
        private String productStack;

        /**
         * Product Stack.
         *
         * @param productStack the value to set
         * @return this builder
         */
        public Builder productStack(String productStack) {
            this.productStack = productStack;
            this.__explicitlySet__.add("productStack");
            return this;
        }
        /** Product Name. */
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * Product Name.
         *
         * @param productName the value to set
         * @return this builder
         */
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /** Product Version. */
        @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
        private String productVersion;

        /**
         * Product Version.
         *
         * @param productVersion the value to set
         * @return this builder
         */
        public Builder productVersion(String productVersion) {
            this.productVersion = productVersion;
            this.__explicitlySet__.add("productVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceDetailProduct build() {
            ComplianceDetailProduct model =
                    new ComplianceDetailProduct(
                            this.productStack, this.productName, this.productVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceDetailProduct model) {
            if (model.wasPropertyExplicitlySet("productStack")) {
                this.productStack(model.getProductStack());
            }
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("productVersion")) {
                this.productVersion(model.getProductVersion());
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

    /** Product Stack. */
    @com.fasterxml.jackson.annotation.JsonProperty("productStack")
    private final String productStack;

    /**
     * Product Stack.
     *
     * @return the value
     */
    public String getProductStack() {
        return productStack;
    }

    /** Product Name. */
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * Product Name.
     *
     * @return the value
     */
    public String getProductName() {
        return productName;
    }

    /** Product Version. */
    @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
    private final String productVersion;

    /**
     * Product Version.
     *
     * @return the value
     */
    public String getProductVersion() {
        return productVersion;
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
        sb.append("ComplianceDetailProduct(");
        sb.append("super=").append(super.toString());
        sb.append("productStack=").append(String.valueOf(this.productStack));
        sb.append(", productName=").append(String.valueOf(this.productName));
        sb.append(", productVersion=").append(String.valueOf(this.productVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceDetailProduct)) {
            return false;
        }

        ComplianceDetailProduct other = (ComplianceDetailProduct) o;
        return java.util.Objects.equals(this.productStack, other.productStack)
                && java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.productVersion, other.productVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.productStack == null ? 43 : this.productStack.hashCode());
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result =
                (result * PRIME)
                        + (this.productVersion == null ? 43 : this.productVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
