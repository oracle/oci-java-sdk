/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * The model for the admin market details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdminMarket.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdminMarket extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "code", "categoryCode", "billToCountries"})
    public AdminMarket(
            String name,
            String code,
            String categoryCode,
            java.util.List<AdminBillToCountries> billToCountries) {
        super();
        this.name = name;
        this.code = code;
        this.categoryCode = categoryCode;
        this.billToCountries = billToCountries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the market.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the market.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The code of the market.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * The code of the market.
         * @param code the value to set
         * @return this builder
         **/
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * The category code of the market.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categoryCode")
        private String categoryCode;

        /**
         * The category code of the market.
         * @param categoryCode the value to set
         * @return this builder
         **/
        public Builder categoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            this.__explicitlySet__.add("categoryCode");
            return this;
        }
        /**
         * bill to countries for the market.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("billToCountries")
        private java.util.List<AdminBillToCountries> billToCountries;

        /**
         * bill to countries for the market.
         * @param billToCountries the value to set
         * @return this builder
         **/
        public Builder billToCountries(java.util.List<AdminBillToCountries> billToCountries) {
            this.billToCountries = billToCountries;
            this.__explicitlySet__.add("billToCountries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdminMarket build() {
            AdminMarket model =
                    new AdminMarket(this.name, this.code, this.categoryCode, this.billToCountries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdminMarket model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("categoryCode")) {
                this.categoryCode(model.getCategoryCode());
            }
            if (model.wasPropertyExplicitlySet("billToCountries")) {
                this.billToCountries(model.getBillToCountries());
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
     * The name of the market.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the market.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The code of the market.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * The code of the market.
     * @return the value
     **/
    public String getCode() {
        return code;
    }

    /**
     * The category code of the market.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryCode")
    private final String categoryCode;

    /**
     * The category code of the market.
     * @return the value
     **/
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * bill to countries for the market.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("billToCountries")
    private final java.util.List<AdminBillToCountries> billToCountries;

    /**
     * bill to countries for the market.
     * @return the value
     **/
    public java.util.List<AdminBillToCountries> getBillToCountries() {
        return billToCountries;
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
        sb.append("AdminMarket(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", categoryCode=").append(String.valueOf(this.categoryCode));
        sb.append(", billToCountries=").append(String.valueOf(this.billToCountries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdminMarket)) {
            return false;
        }

        AdminMarket other = (AdminMarket) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.categoryCode, other.categoryCode)
                && java.util.Objects.equals(this.billToCountries, other.billToCountries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.categoryCode == null ? 43 : this.categoryCode.hashCode());
        result =
                (result * PRIME)
                        + (this.billToCountries == null ? 43 : this.billToCountries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
