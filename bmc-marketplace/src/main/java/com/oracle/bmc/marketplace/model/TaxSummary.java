/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * Tax implication that current tenant may be eligible while using specific listing <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TaxSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TaxSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "name", "country", "url"})
    public TaxSummary(java.util.UUID code, String name, String country, String url) {
        super();
        this.code = code;
        this.name = name;
        this.country = country;
        this.url = url;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique code for the tax. */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private java.util.UUID code;

        /**
         * Unique code for the tax.
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(java.util.UUID code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** Name of the tax code. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the tax code.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Country, which imposes the tax. */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country, which imposes the tax.
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /** The URL with more details about this tax. */
        @com.fasterxml.jackson.annotation.JsonProperty("url")
        private String url;

        /**
         * The URL with more details about this tax.
         *
         * @param url the value to set
         * @return this builder
         */
        public Builder url(String url) {
            this.url = url;
            this.__explicitlySet__.add("url");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaxSummary build() {
            TaxSummary model = new TaxSummary(this.code, this.name, this.country, this.url);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaxSummary model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("url")) {
                this.url(model.getUrl());
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

    /** Unique code for the tax. */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final java.util.UUID code;

    /**
     * Unique code for the tax.
     *
     * @return the value
     */
    public java.util.UUID getCode() {
        return code;
    }

    /** Name of the tax code. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the tax code.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Country, which imposes the tax. */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country, which imposes the tax.
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /** The URL with more details about this tax. */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    private final String url;

    /**
     * The URL with more details about this tax.
     *
     * @return the value
     */
    public String getUrl() {
        return url;
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
        sb.append("TaxSummary(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", url=").append(String.valueOf(this.url));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaxSummary)) {
            return false;
        }

        TaxSummary other = (TaxSummary) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.url, other.url)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.url == null ? 43 : this.url.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
