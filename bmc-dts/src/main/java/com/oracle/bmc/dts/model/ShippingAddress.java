/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dts.model;

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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.017")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShippingAddress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ShippingAddress extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "addressee",
        "careOf",
        "address1",
        "address2",
        "address3",
        "address4",
        "cityOrLocality",
        "stateOrRegion",
        "zipcode",
        "country",
        "phoneNumber",
        "email"
    })
    public ShippingAddress(
            String addressee,
            String careOf,
            String address1,
            String address2,
            String address3,
            String address4,
            String cityOrLocality,
            String stateOrRegion,
            String zipcode,
            String country,
            String phoneNumber,
            String email) {
        super();
        this.addressee = addressee;
        this.careOf = careOf;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.address4 = address4;
        this.cityOrLocality = cityOrLocality;
        this.stateOrRegion = stateOrRegion;
        this.zipcode = zipcode;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("addressee")
        private String addressee;

        public Builder addressee(String addressee) {
            this.addressee = addressee;
            this.__explicitlySet__.add("addressee");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("careOf")
        private String careOf;

        public Builder careOf(String careOf) {
            this.careOf = careOf;
            this.__explicitlySet__.add("careOf");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address1")
        private String address1;

        public Builder address1(String address1) {
            this.address1 = address1;
            this.__explicitlySet__.add("address1");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address2")
        private String address2;

        public Builder address2(String address2) {
            this.address2 = address2;
            this.__explicitlySet__.add("address2");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address3")
        private String address3;

        public Builder address3(String address3) {
            this.address3 = address3;
            this.__explicitlySet__.add("address3");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("address4")
        private String address4;

        public Builder address4(String address4) {
            this.address4 = address4;
            this.__explicitlySet__.add("address4");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cityOrLocality")
        private String cityOrLocality;

        public Builder cityOrLocality(String cityOrLocality) {
            this.cityOrLocality = cityOrLocality;
            this.__explicitlySet__.add("cityOrLocality");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stateOrRegion")
        private String stateOrRegion;

        public Builder stateOrRegion(String stateOrRegion) {
            this.stateOrRegion = stateOrRegion;
            this.__explicitlySet__.add("stateOrRegion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
        private String zipcode;

        public Builder zipcode(String zipcode) {
            this.zipcode = zipcode;
            this.__explicitlySet__.add("zipcode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
        private String phoneNumber;

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.__explicitlySet__.add("phoneNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShippingAddress build() {
            ShippingAddress model =
                    new ShippingAddress(
                            this.addressee,
                            this.careOf,
                            this.address1,
                            this.address2,
                            this.address3,
                            this.address4,
                            this.cityOrLocality,
                            this.stateOrRegion,
                            this.zipcode,
                            this.country,
                            this.phoneNumber,
                            this.email);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShippingAddress model) {
            if (model.wasPropertyExplicitlySet("addressee")) {
                this.addressee(model.getAddressee());
            }
            if (model.wasPropertyExplicitlySet("careOf")) {
                this.careOf(model.getCareOf());
            }
            if (model.wasPropertyExplicitlySet("address1")) {
                this.address1(model.getAddress1());
            }
            if (model.wasPropertyExplicitlySet("address2")) {
                this.address2(model.getAddress2());
            }
            if (model.wasPropertyExplicitlySet("address3")) {
                this.address3(model.getAddress3());
            }
            if (model.wasPropertyExplicitlySet("address4")) {
                this.address4(model.getAddress4());
            }
            if (model.wasPropertyExplicitlySet("cityOrLocality")) {
                this.cityOrLocality(model.getCityOrLocality());
            }
            if (model.wasPropertyExplicitlySet("stateOrRegion")) {
                this.stateOrRegion(model.getStateOrRegion());
            }
            if (model.wasPropertyExplicitlySet("zipcode")) {
                this.zipcode(model.getZipcode());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("phoneNumber")) {
                this.phoneNumber(model.getPhoneNumber());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
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

    @com.fasterxml.jackson.annotation.JsonProperty("addressee")
    private final String addressee;

    public String getAddressee() {
        return addressee;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("careOf")
    private final String careOf;

    public String getCareOf() {
        return careOf;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("address1")
    private final String address1;

    public String getAddress1() {
        return address1;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("address2")
    private final String address2;

    public String getAddress2() {
        return address2;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("address3")
    private final String address3;

    public String getAddress3() {
        return address3;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("address4")
    private final String address4;

    public String getAddress4() {
        return address4;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("cityOrLocality")
    private final String cityOrLocality;

    public String getCityOrLocality() {
        return cityOrLocality;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stateOrRegion")
    private final String stateOrRegion;

    public String getStateOrRegion() {
        return stateOrRegion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("zipcode")
    private final String zipcode;

    public String getZipcode() {
        return zipcode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    public String getCountry() {
        return country;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("phoneNumber")
    private final String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    public String getEmail() {
        return email;
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
        sb.append("ShippingAddress(");
        sb.append("super=").append(super.toString());
        sb.append("addressee=").append(String.valueOf(this.addressee));
        sb.append(", careOf=").append(String.valueOf(this.careOf));
        sb.append(", address1=").append(String.valueOf(this.address1));
        sb.append(", address2=").append(String.valueOf(this.address2));
        sb.append(", address3=").append(String.valueOf(this.address3));
        sb.append(", address4=").append(String.valueOf(this.address4));
        sb.append(", cityOrLocality=").append(String.valueOf(this.cityOrLocality));
        sb.append(", stateOrRegion=").append(String.valueOf(this.stateOrRegion));
        sb.append(", zipcode=").append(String.valueOf(this.zipcode));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", phoneNumber=").append(String.valueOf(this.phoneNumber));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShippingAddress)) {
            return false;
        }

        ShippingAddress other = (ShippingAddress) o;
        return java.util.Objects.equals(this.addressee, other.addressee)
                && java.util.Objects.equals(this.careOf, other.careOf)
                && java.util.Objects.equals(this.address1, other.address1)
                && java.util.Objects.equals(this.address2, other.address2)
                && java.util.Objects.equals(this.address3, other.address3)
                && java.util.Objects.equals(this.address4, other.address4)
                && java.util.Objects.equals(this.cityOrLocality, other.cityOrLocality)
                && java.util.Objects.equals(this.stateOrRegion, other.stateOrRegion)
                && java.util.Objects.equals(this.zipcode, other.zipcode)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.phoneNumber, other.phoneNumber)
                && java.util.Objects.equals(this.email, other.email)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.addressee == null ? 43 : this.addressee.hashCode());
        result = (result * PRIME) + (this.careOf == null ? 43 : this.careOf.hashCode());
        result = (result * PRIME) + (this.address1 == null ? 43 : this.address1.hashCode());
        result = (result * PRIME) + (this.address2 == null ? 43 : this.address2.hashCode());
        result = (result * PRIME) + (this.address3 == null ? 43 : this.address3.hashCode());
        result = (result * PRIME) + (this.address4 == null ? 43 : this.address4.hashCode());
        result =
                (result * PRIME)
                        + (this.cityOrLocality == null ? 43 : this.cityOrLocality.hashCode());
        result =
                (result * PRIME)
                        + (this.stateOrRegion == null ? 43 : this.stateOrRegion.hashCode());
        result = (result * PRIME) + (this.zipcode == null ? 43 : this.zipcode.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.phoneNumber == null ? 43 : this.phoneNumber.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
