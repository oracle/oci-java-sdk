/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.marketplacepublisher.model;

/**
 * A listing version provided by the Publisher. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VersionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class VersionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"number", "description", "releaseDate"})
    public VersionDetails(String number, String description, String releaseDate) {
        super();
        this.number = number;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version number. */
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private String number;

        /**
         * The version number.
         *
         * @param number the value to set
         * @return this builder
         */
        public Builder number(String number) {
            this.number = number;
            this.__explicitlySet__.add("number");
            return this;
        }
        /** The version description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The version description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The version release date. */
        @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
        private String releaseDate;

        /**
         * The version release date.
         *
         * @param releaseDate the value to set
         * @return this builder
         */
        public Builder releaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            this.__explicitlySet__.add("releaseDate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VersionDetails build() {
            VersionDetails model =
                    new VersionDetails(this.number, this.description, this.releaseDate);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VersionDetails model) {
            if (model.wasPropertyExplicitlySet("number")) {
                this.number(model.getNumber());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("releaseDate")) {
                this.releaseDate(model.getReleaseDate());
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

    /** The version number. */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    private final String number;

    /**
     * The version number.
     *
     * @return the value
     */
    public String getNumber() {
        return number;
    }

    /** The version description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The version description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** The version release date. */
    @com.fasterxml.jackson.annotation.JsonProperty("releaseDate")
    private final String releaseDate;

    /**
     * The version release date.
     *
     * @return the value
     */
    public String getReleaseDate() {
        return releaseDate;
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
        sb.append("VersionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("number=").append(String.valueOf(this.number));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", releaseDate=").append(String.valueOf(this.releaseDate));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VersionDetails)) {
            return false;
        }

        VersionDetails other = (VersionDetails) o;
        return java.util.Objects.equals(this.number, other.number)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.releaseDate, other.releaseDate)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.number == null ? 43 : this.number.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.releaseDate == null ? 43 : this.releaseDate.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
