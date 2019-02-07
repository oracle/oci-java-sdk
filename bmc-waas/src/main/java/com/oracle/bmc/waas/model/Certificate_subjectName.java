/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = Certificate_subjectName.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Certificate_subjectName {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateProvince")
        private String stateProvince;

        public Builder stateProvince(String stateProvince) {
            this.stateProvince = stateProvince;
            this.__explicitlySet__.add("stateProvince");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("locality")
        private String locality;

        public Builder locality(String locality) {
            this.locality = locality;
            this.__explicitlySet__.add("locality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organization")
        private String organization;

        public Builder organization(String organization) {
            this.organization = organization;
            this.__explicitlySet__.add("organization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
        private String organizationalUnit;

        public Builder organizationalUnit(String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            this.__explicitlySet__.add("organizationalUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate_subjectName build() {
            Certificate_subjectName __instance__ =
                    new Certificate_subjectName(
                            country,
                            stateProvince,
                            locality,
                            organization,
                            organizationalUnit,
                            commonName,
                            emailAddress);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate_subjectName o) {
            Builder copiedBuilder =
                    country(o.getCountry())
                            .stateProvince(o.getStateProvince())
                            .locality(o.getLocality())
                            .organization(o.getOrganization())
                            .organizationalUnit(o.getOrganizationalUnit())
                            .commonName(o.getCommonName())
                            .emailAddress(o.getEmailAddress());

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

    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    @com.fasterxml.jackson.annotation.JsonProperty("stateProvince")
    String stateProvince;

    @com.fasterxml.jackson.annotation.JsonProperty("locality")
    String locality;

    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    String organization;

    @com.fasterxml.jackson.annotation.JsonProperty("organizationalUnit")
    String organizationalUnit;

    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    String commonName;

    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    String emailAddress;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
