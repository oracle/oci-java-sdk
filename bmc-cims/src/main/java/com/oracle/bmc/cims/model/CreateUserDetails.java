/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cims.model;

/**
 * Details about creation of user.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181231")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateUserDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateUserDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("firstName")
        private String firstName;

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            this.__explicitlySet__.add("firstName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lastName")
        private String lastName;

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            this.__explicitlySet__.add("lastName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("csi")
        private String csi;

        public Builder csi(String csi) {
            this.csi = csi;
            this.__explicitlySet__.add("csi");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phone")
        private String phone;

        public Builder phone(String phone) {
            this.phone = phone;
            this.__explicitlySet__.add("phone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timezone")
        private String timezone;

        public Builder timezone(String timezone) {
            this.timezone = timezone;
            this.__explicitlySet__.add("timezone");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
        private String organizationName;

        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            this.__explicitlySet__.add("organizationName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateUserDetails build() {
            CreateUserDetails __instance__ =
                    new CreateUserDetails(
                            compartmentId,
                            firstName,
                            lastName,
                            country,
                            csi,
                            phone,
                            timezone,
                            organizationName);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateUserDetails o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .firstName(o.getFirstName())
                            .lastName(o.getLastName())
                            .country(o.getCountry())
                            .csi(o.getCsi())
                            .phone(o.getPhone())
                            .timezone(o.getTimezone())
                            .organizationName(o.getOrganizationName());

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
     * The OCID of the tenancy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * First name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("firstName")
    String firstName;

    /**
     * Last name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lastName")
    String lastName;

    /**
     * Country of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    String country;

    /**
     * CSI to be associated to the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("csi")
    String csi;

    /**
     * Contact number of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("phone")
    String phone;

    /**
     * Timezone of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timezone")
    String timezone;

    /**
     * Organization of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
    String organizationName;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
