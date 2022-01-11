/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Country.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Country {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("countryId")
        private java.math.BigDecimal countryId;

        public Builder countryId(java.math.BigDecimal countryId) {
            this.countryId = countryId;
            this.__explicitlySet__.add("countryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
        private String countryCode;

        public Builder countryCode(String countryCode) {
            this.countryCode = countryCode;
            this.__explicitlySet__.add("countryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("countryName")
        private String countryName;

        public Builder countryName(String countryName) {
            this.countryName = countryName;
            this.__explicitlySet__.add("countryName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("languageId")
        private java.math.BigDecimal languageId;

        public Builder languageId(java.math.BigDecimal languageId) {
            this.languageId = languageId;
            this.__explicitlySet__.add("languageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ascii3CountryCode")
        private String ascii3CountryCode;

        public Builder ascii3CountryCode(String ascii3CountryCode) {
            this.ascii3CountryCode = ascii3CountryCode;
            this.__explicitlySet__.add("ascii3CountryCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Country build() {
            Country __instance__ =
                    new Country(countryId, countryCode, countryName, languageId, ascii3CountryCode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Country o) {
            Builder copiedBuilder =
                    countryId(o.getCountryId())
                            .countryCode(o.getCountryCode())
                            .countryName(o.getCountryName())
                            .languageId(o.getLanguageId())
                            .ascii3CountryCode(o.getAscii3CountryCode());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Indentifier of the country. This is a DB side unique id which was generated when the entity was created in the table
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryId")
    java.math.BigDecimal countryId;

    /**
     * Country code in ISO-3166-1 2-letter format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryCode")
    String countryCode;

    /**
     * Name of the country
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("countryName")
    String countryName;

    /**
     * Language identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("languageId")
    java.math.BigDecimal languageId;

    /**
     * Country code in ISO-3166-1 3-letter format
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ascii3CountryCode")
    String ascii3CountryCode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
