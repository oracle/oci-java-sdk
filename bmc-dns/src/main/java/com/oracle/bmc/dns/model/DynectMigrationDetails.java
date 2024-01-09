/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * Details specific to performing a DynECT zone migration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DynectMigrationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DynectMigrationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "customerName",
        "username",
        "password",
        "httpRedirectReplacements"
    })
    public DynectMigrationDetails(
            String customerName,
            String username,
            String password,
            java.util.Map<String, java.util.List<MigrationReplacement>> httpRedirectReplacements) {
        super();
        this.customerName = customerName;
        this.username = username;
        this.password = password;
        this.httpRedirectReplacements = httpRedirectReplacements;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** DynECT customer name the zone belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("customerName")
        private String customerName;

        /**
         * DynECT customer name the zone belongs to.
         *
         * @param customerName the value to set
         * @return this builder
         */
        public Builder customerName(String customerName) {
            this.customerName = customerName;
            this.__explicitlySet__.add("customerName");
            return this;
        }
        /** DynECT API username to perform the migration with. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * DynECT API username to perform the migration with.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }
        /** DynECT API password for the provided username. */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * DynECT API password for the provided username.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }
        /**
         * A map of fully-qualified domain names (FQDNs) to an array of {@code MigrationReplacement}
         * objects.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("httpRedirectReplacements")
        private java.util.Map<String, java.util.List<MigrationReplacement>>
                httpRedirectReplacements;

        /**
         * A map of fully-qualified domain names (FQDNs) to an array of {@code MigrationReplacement}
         * objects.
         *
         * @param httpRedirectReplacements the value to set
         * @return this builder
         */
        public Builder httpRedirectReplacements(
                java.util.Map<String, java.util.List<MigrationReplacement>>
                        httpRedirectReplacements) {
            this.httpRedirectReplacements = httpRedirectReplacements;
            this.__explicitlySet__.add("httpRedirectReplacements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynectMigrationDetails build() {
            DynectMigrationDetails model =
                    new DynectMigrationDetails(
                            this.customerName,
                            this.username,
                            this.password,
                            this.httpRedirectReplacements);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynectMigrationDetails model) {
            if (model.wasPropertyExplicitlySet("customerName")) {
                this.customerName(model.getCustomerName());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
            }
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
            }
            if (model.wasPropertyExplicitlySet("httpRedirectReplacements")) {
                this.httpRedirectReplacements(model.getHttpRedirectReplacements());
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

    /** DynECT customer name the zone belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("customerName")
    private final String customerName;

    /**
     * DynECT customer name the zone belongs to.
     *
     * @return the value
     */
    public String getCustomerName() {
        return customerName;
    }

    /** DynECT API username to perform the migration with. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * DynECT API username to perform the migration with.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
    }

    /** DynECT API password for the provided username. */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * DynECT API password for the provided username.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
    }

    /**
     * A map of fully-qualified domain names (FQDNs) to an array of {@code MigrationReplacement}
     * objects.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("httpRedirectReplacements")
    private final java.util.Map<String, java.util.List<MigrationReplacement>>
            httpRedirectReplacements;

    /**
     * A map of fully-qualified domain names (FQDNs) to an array of {@code MigrationReplacement}
     * objects.
     *
     * @return the value
     */
    public java.util.Map<String, java.util.List<MigrationReplacement>>
            getHttpRedirectReplacements() {
        return httpRedirectReplacements;
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
        sb.append("DynectMigrationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("customerName=").append(String.valueOf(this.customerName));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(", password=").append("<redacted>");
        sb.append(", httpRedirectReplacements=")
                .append(String.valueOf(this.httpRedirectReplacements));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DynectMigrationDetails)) {
            return false;
        }

        DynectMigrationDetails other = (DynectMigrationDetails) o;
        return java.util.Objects.equals(this.customerName, other.customerName)
                && java.util.Objects.equals(this.username, other.username)
                && java.util.Objects.equals(this.password, other.password)
                && java.util.Objects.equals(
                        this.httpRedirectReplacements, other.httpRedirectReplacements)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.customerName == null ? 43 : this.customerName.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        result =
                (result * PRIME)
                        + (this.httpRedirectReplacements == null
                                ? 43
                                : this.httpRedirectReplacements.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
