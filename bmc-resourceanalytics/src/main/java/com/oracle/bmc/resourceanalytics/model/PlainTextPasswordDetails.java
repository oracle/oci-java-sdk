/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * Details for the PLAIN_TEXT ADW Admin password. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PlainTextPasswordDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "passwordType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PlainTextPasswordDetails extends AdwAdminPasswordDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Password for the ADW to be created in User Tenancy. The password must be between 12 and
         * 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric
         * character. It cannot contain the double quote symbol (") or the username "admin",
         * regardless of casing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        /**
         * Password for the ADW to be created in User Tenancy. The password must be between 12 and
         * 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric
         * character. It cannot contain the double quote symbol (") or the username "admin",
         * regardless of casing.
         *
         * @param password the value to set
         * @return this builder
         */
        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PlainTextPasswordDetails build() {
            PlainTextPasswordDetails model = new PlainTextPasswordDetails(this.password);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PlainTextPasswordDetails model) {
            if (model.wasPropertyExplicitlySet("password")) {
                this.password(model.getPassword());
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

    @Deprecated
    public PlainTextPasswordDetails(String password) {
        super();
        this.password = password;
    }

    /**
     * Password for the ADW to be created in User Tenancy. The password must be between 12 and 30
     * characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character.
     * It cannot contain the double quote symbol (") or the username "admin", regardless of casing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    private final String password;

    /**
     * Password for the ADW to be created in User Tenancy. The password must be between 12 and 30
     * characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric character.
     * It cannot contain the double quote symbol (") or the username "admin", regardless of casing.
     *
     * @return the value
     */
    public String getPassword() {
        return password;
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
        sb.append("PlainTextPasswordDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", password=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlainTextPasswordDetails)) {
            return false;
        }

        PlainTextPasswordDetails other = (PlainTextPasswordDetails) o;
        return java.util.Objects.equals(this.password, other.password) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.password == null ? 43 : this.password.hashCode());
        return result;
    }
}
