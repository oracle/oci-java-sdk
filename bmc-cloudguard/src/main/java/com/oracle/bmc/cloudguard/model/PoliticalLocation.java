/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The geographical location of a problem in terms of political units. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PoliticalLocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PoliticalLocation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"city", "state", "country"})
    public PoliticalLocation(String city, String state, String country) {
        super();
        this.city = city;
        this.state = state;
        this.country = country;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** City of problem's location */
        @com.fasterxml.jackson.annotation.JsonProperty("city")
        private String city;

        /**
         * City of problem's location
         *
         * @param city the value to set
         * @return this builder
         */
        public Builder city(String city) {
            this.city = city;
            this.__explicitlySet__.add("city");
            return this;
        }
        /** State or province of problem's location */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private String state;

        /**
         * State or province of problem's location
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(String state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** Country of problem's location */
        @com.fasterxml.jackson.annotation.JsonProperty("country")
        private String country;

        /**
         * Country of problem's location
         *
         * @param country the value to set
         * @return this builder
         */
        public Builder country(String country) {
            this.country = country;
            this.__explicitlySet__.add("country");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PoliticalLocation build() {
            PoliticalLocation model = new PoliticalLocation(this.city, this.state, this.country);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PoliticalLocation model) {
            if (model.wasPropertyExplicitlySet("city")) {
                this.city(model.getCity());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("country")) {
                this.country(model.getCountry());
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

    /** City of problem's location */
    @com.fasterxml.jackson.annotation.JsonProperty("city")
    private final String city;

    /**
     * City of problem's location
     *
     * @return the value
     */
    public String getCity() {
        return city;
    }

    /** State or province of problem's location */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final String state;

    /**
     * State or province of problem's location
     *
     * @return the value
     */
    public String getState() {
        return state;
    }

    /** Country of problem's location */
    @com.fasterxml.jackson.annotation.JsonProperty("country")
    private final String country;

    /**
     * Country of problem's location
     *
     * @return the value
     */
    public String getCountry() {
        return country;
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
        sb.append("PoliticalLocation(");
        sb.append("super=").append(super.toString());
        sb.append("city=").append(String.valueOf(this.city));
        sb.append(", state=").append(String.valueOf(this.state));
        sb.append(", country=").append(String.valueOf(this.country));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PoliticalLocation)) {
            return false;
        }

        PoliticalLocation other = (PoliticalLocation) o;
        return java.util.Objects.equals(this.city, other.city)
                && java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.country, other.country)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.city == null ? 43 : this.city.hashCode());
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.country == null ? 43 : this.country.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
