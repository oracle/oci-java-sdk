/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details of the Product.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ComplianceReportProduct.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ComplianceReportProduct
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"productName", "targets"})
    public ComplianceReportProduct(
            String productName, java.util.List<ComplianceReportTarget> targets) {
        super();
        this.productName = productName;
        this.targets = targets;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Product Name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("productName")
        private String productName;

        /**
         * Product Name.
         * @param productName the value to set
         * @return this builder
         **/
        public Builder productName(String productName) {
            this.productName = productName;
            this.__explicitlySet__.add("productName");
            return this;
        }
        /**
         * Managed Targets associated with the Product.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targets")
        private java.util.List<ComplianceReportTarget> targets;

        /**
         * Managed Targets associated with the Product.
         * @param targets the value to set
         * @return this builder
         **/
        public Builder targets(java.util.List<ComplianceReportTarget> targets) {
            this.targets = targets;
            this.__explicitlySet__.add("targets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComplianceReportProduct build() {
            ComplianceReportProduct model =
                    new ComplianceReportProduct(this.productName, this.targets);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComplianceReportProduct model) {
            if (model.wasPropertyExplicitlySet("productName")) {
                this.productName(model.getProductName());
            }
            if (model.wasPropertyExplicitlySet("targets")) {
                this.targets(model.getTargets());
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
     * Product Name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("productName")
    private final String productName;

    /**
     * Product Name.
     * @return the value
     **/
    public String getProductName() {
        return productName;
    }

    /**
     * Managed Targets associated with the Product.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targets")
    private final java.util.List<ComplianceReportTarget> targets;

    /**
     * Managed Targets associated with the Product.
     * @return the value
     **/
    public java.util.List<ComplianceReportTarget> getTargets() {
        return targets;
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
        sb.append("ComplianceReportProduct(");
        sb.append("super=").append(super.toString());
        sb.append("productName=").append(String.valueOf(this.productName));
        sb.append(", targets=").append(String.valueOf(this.targets));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComplianceReportProduct)) {
            return false;
        }

        ComplianceReportProduct other = (ComplianceReportProduct) o;
        return java.util.Objects.equals(this.productName, other.productName)
                && java.util.Objects.equals(this.targets, other.targets)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.productName == null ? 43 : this.productName.hashCode());
        result = (result * PRIME) + (this.targets == null ? 43 : this.targets.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
