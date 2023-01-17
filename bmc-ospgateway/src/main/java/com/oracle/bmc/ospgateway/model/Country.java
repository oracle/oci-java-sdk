/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ospgateway.model;

/**
 * Country details model
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Country.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Country extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "countryId",
        "countryCode",
        "countryName",
        "languageId",
        "ascii3CountryCode"
    })
    public Country(
            java.math.BigDecimal countryId,
            String countryCode,
            String countryName,
            java.math.BigDecimal languageId,
            String ascii3CountryCode) {
        super();
        this.countryId = countryId;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.languageId = languageId;
        this.ascii3CountryCode = ascii3CountryCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indentifier of the country. This is a DB side unique id which was generated when the entity was created in the table
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryId")
        private java.math.BigDecimal countryId;

        /**
         * Indentifier of the country. This is a DB side unique id which was generated when the entity was created in the table
         * @param countryId the value to set
         * @return this builder
         **/
        public Builder countryId(java.math.BigDecimal countryId) {
            this.countryId = countryId;
            this.__explicitlySet__.add("countryId");
            return this;
        }
        /**
         * Country code in ISO-3166-1 2-letter format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        /**
         * Country code in ISO-3166-1 2-letter format
         * @param countryCode the value to set
         * @return this builder
         **/
        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }
        /**
         * Name of the country
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        /**
         * Name of the country
         * @param countryName the value to set
         * @return this builder
         **/
        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }
        /**
         * Language identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("languageId")
        private java.math.BigDecimal languageId;

        /**
         * Language identifier
         * @param languageId the value to set
         * @return this builder
         **/
        public Builder languageId(java.math.BigDecimal languageId) {
            this.languageId = languageId;
            this.__explicitlySet__.add("languageId");
            return this;
        }
        /**
         * Country code in ISO-3166-1 3-letter format
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ascii3CountryCode")
        private String ascii3CountryCode;

        /**
         * Country code in ISO-3166-1 3-letter format
         * @param ascii3CountryCode the value to set
         * @return this builder
         **/
        public Builder ascii3CountryCode(String ascii3CountryCode) {
            this.ascii3CountryCode = ascii3CountryCode;
            this.__explicitlySet__.add("ascii3CountryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Country build() {
            Country model =
                    new Country(
                            this.countryId,
                            this.countryCode,
                            this.countryName,
                            this.languageId,
                            this.ascii3CountryCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Country model) {
            if (model.wasPropertyExplicitlySet("countryId")) {
                this.countryId(model.getCountryId());
            }
            if (model.wasPropertyExplicitlySet("countryCode")) {
                this.countryCode(model.getCountryCode());
            }
            if (model.wasPropertyExplicitlySet("countryName")) {
                this.countryName(model.getCountryName());
            }
            if (model.wasPropertyExplicitlySet("languageId")) {
                this.languageId(model.getLanguageId());
            }
            if (model.wasPropertyExplicitlySet("ascii3CountryCode")) {
                this.ascii3CountryCode(model.getAscii3CountryCode());
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
     * Indentifier of the country. This is a DB side unique id which was generated when the entity was created in the table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryId")
    private final java.math.BigDecimal countryId;

    /**
     * Indentifier of the country. This is a DB side unique id which was generated when the entity was created in the table
     * @return the value
     **/
    public java.math.BigDecimal getCountryId() {
        return countryId;
    }

    /**
     * Country code in ISO-3166-1 2-letter format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    private final String countryCode;

    /**
     * Country code in ISO-3166-1 2-letter format
     * @return the value
     **/
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Name of the country
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    private final String countryName;

    /**
     * Name of the country
     * @return the value
     **/
    public String getCountryName() {
        return countryName;
    }

    /**
     * Language identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageId")
    private final java.math.BigDecimal languageId;

    /**
     * Language identifier
     * @return the value
     **/
    public java.math.BigDecimal getLanguageId() {
        return languageId;
    }

    /**
     * Country code in ISO-3166-1 3-letter format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ascii3CountryCode")
    private final String ascii3CountryCode;

    /**
     * Country code in ISO-3166-1 3-letter format
     * @return the value
     **/
    public String getAscii3CountryCode() {
        return ascii3CountryCode;
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
        sb.append("Country(");
        sb.append("super=").append(super.toString());
        sb.append("countryId=").append(String.valueOf(this.countryId));
        sb.append(", countryCode=").append(String.valueOf(this.countryCode));
        sb.append(", countryName=").append(String.valueOf(this.countryName));
        sb.append(", languageId=").append(String.valueOf(this.languageId));
        sb.append(", ascii3CountryCode=").append(String.valueOf(this.ascii3CountryCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Country)) {
            return false;
        }

        Country other = (Country) o;
        return java.util.Objects.equals(this.countryId, other.countryId)
                && java.util.Objects.equals(this.countryCode, other.countryCode)
                && java.util.Objects.equals(this.countryName, other.countryName)
                && java.util.Objects.equals(this.languageId, other.languageId)
                && java.util.Objects.equals(this.ascii3CountryCode, other.ascii3CountryCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.countryId == null ? 43 : this.countryId.hashCode());
        result = (result * PRIME) + (this.countryCode == null ? 43 : this.countryCode.hashCode());
        result = (result * PRIME) + (this.countryName == null ? 43 : this.countryName.hashCode());
        result = (result * PRIME) + (this.languageId == null ? 43 : this.languageId.hashCode());
        result =
                (result * PRIME)
                        + (this.ascii3CountryCode == null ? 43 : this.ascii3CountryCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
