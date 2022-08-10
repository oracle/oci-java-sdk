/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplace.model;

/**
 * The model for regions supported by a listing and package.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Region.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Region extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "code", "countries"})
    public Region(String name, String code, java.util.List<Item> countries) {
        super();
        this.name = name;
        this.code = code;
        this.countries = countries;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the region.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The code of the region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * The code of the region.
         * @param code the value to set
         * @return this builder
         **/
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * Countries in the region.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countries")
        private java.util.List<Item> countries;

        /**
         * Countries in the region.
         * @param countries the value to set
         * @return this builder
         **/
        public Builder countries(java.util.List<Item> countries) {
            this.countries = countries;
            this.__explicitlySet__.add("countries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Region build() {
            Region model = new Region(this.name, this.code, this.countries);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Region model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("countries")) {
                this.countries(model.getCountries());
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
     * The name of the region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the region.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The code of the region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * The code of the region.
     * @return the value
     **/
    public String getCode() {
        return code;
    }

    /**
     * Countries in the region.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countries")
    private final java.util.List<Item> countries;

    /**
     * Countries in the region.
     * @return the value
     **/
    public java.util.List<Item> getCountries() {
        return countries;
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
        sb.append("Region(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", countries=").append(String.valueOf(this.countries));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Region)) {
            return false;
        }

        Region other = (Region) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.countries, other.countries)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.countries == null ? 43 : this.countries.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
