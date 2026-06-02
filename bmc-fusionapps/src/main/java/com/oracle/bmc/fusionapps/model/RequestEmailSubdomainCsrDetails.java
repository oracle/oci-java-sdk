/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Email subdomain certificate request detail
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RequestEmailSubdomainCsrDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RequestEmailSubdomainCsrDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commonName",
        "sans",
        "organizationName",
        "organizationUnit",
        "locality",
        "state",
        "country",
        "emailAddress"
    })
    public RequestEmailSubdomainCsrDetails(
            String commonName,
            String sans,
            String organizationName,
            String organizationUnit,
            String locality,
            String state,
            String country,
            String emailAddress) {
        super();
        this.commonName = commonName;
        this.sans = sans;
        this.organizationName = organizationName;
        this.organizationUnit = organizationUnit;
        this.locality = locality;
        this.state = state;
        this.country = country;
        this.emailAddress = emailAddress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * fully qualified host name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        /**
         * fully qualified host name
         * @param commonName the value to set
         * @return this builder
         **/
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }
        /**
         * subject alternative names, comma separated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sans")
        private String sans;

        /**
         * subject alternative names, comma separated
         * @param sans the value to set
         * @return this builder
         **/
        public Builder sans(String sans) {
            this.sans = sans;
            this.__explicitlySet__.add("sans");
            return this;
        }
        /**
         * company name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
        private String organizationName;

        /**
         * company name
         * @param organizationName the value to set
         * @return this builder
         **/
        public Builder organizationName(String organizationName) {
            this.organizationName = organizationName;
            this.__explicitlySet__.add("organizationName");
            return this;
        }
        /**
         * company section
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("organizationUnit")
        private String organizationUnit;

        /**
         * company section
         * @param organizationUnit the value to set
         * @return this builder
         **/
        public Builder organizationUnit(String organizationUnit) {
            this.organizationUnit = organizationUnit;
            this.__explicitlySet__.add("organizationUnit");
            return this;
        }
        /**
         * city
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locality")
        private String locality;

        /**
         * city
         * @param locality the value to set
         * @return this builder
         **/
        public Builder locality(String locality) {
            this.locality = locality;
            this.__explicitlySet__.add("locality");
            return this;
        }
        /**
         * state or province
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * state or province
         * @param state the value to set
         * @return this builder
         **/
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /**
         * country name
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * country name
         * @param country the value to set
         * @return this builder
         **/
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }
        /**
         * email address
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
        private String emailAddress;

        /**
         * email address
         * @param emailAddress the value to set
         * @return this builder
         **/
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            this.__explicitlySet__.add("emailAddress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestEmailSubdomainCsrDetails build() {
            RequestEmailSubdomainCsrDetails model =
                    new RequestEmailSubdomainCsrDetails(
                            this.commonName,
                            this.sans,
                            this.organizationName,
                            this.organizationUnit,
                            this.locality,
                            this.state,
                            this.country,
                            this.emailAddress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestEmailSubdomainCsrDetails model) {
            if (model.wasPropertyExplicitlySet("commonName")) {
                this.commonName(model.getCommonName());
            }
            if (model.wasPropertyExplicitlySet("sans")) {
                this.sans(model.getSans());
            }
            if (model.wasPropertyExplicitlySet("organizationName")) {
                this.organizationName(model.getOrganizationName());
            }
            if (model.wasPropertyExplicitlySet("organizationUnit")) {
                this.organizationUnit(model.getOrganizationUnit());
            }
            if (model.wasPropertyExplicitlySet("locality")) {
                this.locality(model.getLocality());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
            }
            if (model.wasPropertyExplicitlySet("emailAddress")) {
                this.emailAddress(model.getEmailAddress());
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
     * fully qualified host name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    /**
     * fully qualified host name
     * @return the value
     **/
    public String getCommonName() {
        return commonName;
    }

    /**
     * subject alternative names, comma separated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sans")
    private final String sans;

    /**
     * subject alternative names, comma separated
     * @return the value
     **/
    public String getSans() {
        return sans;
    }

    /**
     * company name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationName")
    private final String organizationName;

    /**
     * company name
     * @return the value
     **/
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * company section
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("organizationUnit")
    private final String organizationUnit;

    /**
     * company section
     * @return the value
     **/
    public String getOrganizationUnit() {
        return organizationUnit;
    }

    /**
     * city
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locality")
    private final String locality;

    /**
     * city
     * @return the value
     **/
    public String getLocality() {
        return locality;
    }

    /**
     * state or province
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * state or province
     * @return the value
     **/
    public String getState() {
        return state;
    }

    /**
     * country name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * country name
     * @return the value
     **/
    public String getCountry() {
        return country;
    }

    /**
     * email address
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("emailAddress")
    private final String emailAddress;

    /**
     * email address
     * @return the value
     **/
    public String getEmailAddress() {
        return emailAddress;
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
        sb.append("RequestEmailSubdomainCsrDetails(");
        sb.append("super=").append(super.toString());
        sb.append("commonName=").append(String.valueOf(this.commonName));
        sb.append(", sans=").append(String.valueOf(this.sans));
        sb.append(", organizationName=").append(String.valueOf(this.organizationName));
        sb.append(", organizationUnit=").append(String.valueOf(this.organizationUnit));
        sb.append(", locality=").append(String.valueOf(this.locality));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(", emailAddress=").append(String.valueOf(this.emailAddress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RequestEmailSubdomainCsrDetails)) {
            return false;
        }

        RequestEmailSubdomainCsrDetails other = (RequestEmailSubdomainCsrDetails) o;
        return java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.sans, other.sans)
                && java.util.Objects.equals(this.organizationName, other.organizationName)
                && java.util.Objects.equals(this.organizationUnit, other.organizationUnit)
                && java.util.Objects.equals(this.locality, other.locality)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.country, other.country)
                && java.util.Objects.equals(this.emailAddress, other.emailAddress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result = (result * PRIME) + (this.sans == null ? 43 : this.sans.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationName == null ? 43 : this.organizationName.hashCode());
        result =
                (result * PRIME)
                        + (this.organizationUnit == null ? 43 : this.organizationUnit.hashCode());
        result = (result * PRIME) + (this.locality == null ? 43 : this.locality.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + (this.emailAddress == null ? 43 : this.emailAddress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
