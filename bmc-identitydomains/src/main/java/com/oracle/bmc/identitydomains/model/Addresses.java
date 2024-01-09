/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * A physical mailing address for this User, as described in (address Element). Canonical Type
 * Values of work, home, and other. The value attribute is a complex type with the following
 * sub-attributes. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Addresses.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Addresses extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "formatted",
        "streetAddress",
        "locality",
        "region",
        "postalCode",
        "country",
        "type",
        "primary"
    })
    public Addresses(
            String formatted,
            String streetAddress,
            String locality,
            String region,
            String postalCode,
            String country,
            Type type,
            Boolean primary) {
        super();
        this.formatted = formatted;
        this.streetAddress = streetAddress;
        this.locality = locality;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.type = type;
        this.primary = primary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The full mailing address, formatted for display or use with a mailing label. This
         * attribute MAY contain newlines.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formatted")
        private String formatted;

        /**
         * The full mailing address, formatted for display or use with a mailing label. This
         * attribute MAY contain newlines.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param formatted the value to set
         * @return this builder
         */
        public Builder formatted(String formatted) {
            this.formatted = formatted;
            this.__explicitlySet__.add("formatted");
            return this;
        }
        /**
         * The full street address component, which may include house number, street name, PO BOX,
         * and multi-line extended street address information. This attribute MAY contain newlines.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("streetAddress")
        private String streetAddress;

        /**
         * The full street address component, which may include house number, street name, PO BOX,
         * and multi-line extended street address information. This attribute MAY contain newlines.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param streetAddress the value to set
         * @return this builder
         */
        public Builder streetAddress(String streetAddress) {
            this.streetAddress = streetAddress;
            this.__explicitlySet__.add("streetAddress");
            return this;
        }
        /**
         * The city or locality component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("locality")
        private String locality;

        /**
         * The city or locality component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param locality the value to set
         * @return this builder
         */
        public Builder locality(String locality) {
            this.locality = locality;
            this.__explicitlySet__.add("locality");
            return this;
        }
        /**
         * The state or region component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The state or region component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * The zipcode or postal code component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
        private String postalCode;

        /**
         * The zipcode or postal code component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param postalCode the value to set
         * @return this builder
         */
        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            this.__explicitlySet__.add("postalCode");
            return this;
        }
        /**
         * The country name component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
         * "countries" and attrValues.value eq "upper($(country))" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: true - multiValued:
         * false - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * The country name component.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
         * "countries" and attrValues.value eq "upper($(country))" -
         * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: true - multiValued:
         * false - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * A label indicating the attribute's function; e.g., 'work' or 'home'.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * A label indicating the attribute's function; e.g., 'work' or 'home'.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * A Boolean value indicating the 'primary' or preferred attribute value for this attribute.
         * The primary attribute value 'true' MUST appear no more than once.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("primary")
        private Boolean primary;

        /**
         * A Boolean value indicating the 'primary' or preferred attribute value for this attribute.
         * The primary attribute value 'true' MUST appear no more than once.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param primary the value to set
         * @return this builder
         */
        public Builder primary(Boolean primary) {
            this.primary = primary;
            this.__explicitlySet__.add("primary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Addresses build() {
            Addresses model =
                    new Addresses(
                            this.formatted,
                            this.streetAddress,
                            this.locality,
                            this.region,
                            this.postalCode,
                            this.country,
                            this.type,
                            this.primary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Addresses model) {
            if (model.wasPropertyExplicitlySet("formatted")) {
                this.formatted(model.getFormatted());
            }
            if (model.wasPropertyExplicitlySet("streetAddress")) {
                this.streetAddress(model.getStreetAddress());
            }
            if (model.wasPropertyExplicitlySet("locality")) {
                this.locality(model.getLocality());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("postalCode")) {
                this.postalCode(model.getPostalCode());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("primary")) {
                this.primary(model.getPrimary());
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

    /**
     * The full mailing address, formatted for display or use with a mailing label. This attribute
     * MAY contain newlines.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formatted")
    private final String formatted;

    /**
     * The full mailing address, formatted for display or use with a mailing label. This attribute
     * MAY contain newlines.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFormatted() {
        return formatted;
    }

    /**
     * The full street address component, which may include house number, street name, PO BOX, and
     * multi-line extended street address information. This attribute MAY contain newlines.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("streetAddress")
    private final String streetAddress;

    /**
     * The full street address component, which may include house number, street name, PO BOX, and
     * multi-line extended street address information. This attribute MAY contain newlines.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * The city or locality component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("locality")
    private final String locality;

    /**
     * The city or locality component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLocality() {
        return locality;
    }

    /**
     * The state or region component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The state or region component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * The zipcode or postal code component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("postalCode")
    private final String postalCode;

    /**
     * The zipcode or postal code component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * The country name component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
     * "countries" and attrValues.value eq "upper($(country))" -
     * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: true - multiValued:
     * false - mutability: readWrite - required: false - returned: default - type: string -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * The country name component.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCanonicalValueSourceFilter: attrName eq
     * "countries" and attrValues.value eq "upper($(country))" -
     * idcsCanonicalValueSourceResourceType: AllowedValue - idcsSearchable: true - multiValued:
     * false - mutability: readWrite - required: false - returned: default - type: string -
     * uniqueness: none
     *
     * @return the value
     */
    public String getCountry() {
        return country;
    }

    /**
     * A label indicating the attribute's function; e.g., 'work' or 'home'.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Work("work"),
        Home("home"),
        Other("other"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * A label indicating the attribute's function; e.g., 'work' or 'home'.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * A label indicating the attribute's function; e.g., 'work' or 'home'.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * A Boolean value indicating the 'primary' or preferred attribute value for this attribute. The
     * primary attribute value 'true' MUST appear no more than once.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("primary")
    private final Boolean primary;

    /**
     * A Boolean value indicating the 'primary' or preferred attribute value for this attribute. The
     * primary attribute value 'true' MUST appear no more than once.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getPrimary() {
        return primary;
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
        sb.append("Addresses(");
        sb.append("super=").append(super.toString());
        sb.append("formatted=").append(String.valueOf(this.formatted));
        sb.append(", streetAddress=").append(String.valueOf(this.streetAddress));
        sb.append(", locality=").append(String.valueOf(this.locality));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", postalCode=").append(String.valueOf(this.postalCode));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", primary=").append(String.valueOf(this.primary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Addresses)) {
            return false;
        }

        Addresses other = (Addresses) o;
        return java.util.Objects.equals(this.formatted, other.formatted)
                && java.util.Objects.equals(this.streetAddress, other.streetAddress)
                && java.util.Objects.equals(this.locality, other.locality)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.postalCode, other.postalCode)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.primary, other.primary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.formatted == null ? 43 : this.formatted.hashCode());
        result =
                (result * PRIME)
                        + (this.streetAddress == null ? 43 : this.streetAddress.hashCode());
        result = (result * PRIME) + (this.locality == null ? 43 : this.locality.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.postalCode == null ? 43 : this.postalCode.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.primary == null ? 43 : this.primary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
