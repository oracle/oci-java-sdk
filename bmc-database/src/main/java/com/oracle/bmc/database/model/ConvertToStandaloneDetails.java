/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The properties for converting a standby database to a standalone.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConvertToStandaloneDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConvertToStandaloneDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"databaseAdminPassword"})
    public ConvertToStandaloneDetails(String databaseAdminPassword) {
        super();
        this.databaseAdminPassword = databaseAdminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The administrator password of the primary database in this Data Guard association.
         * <p>
         **The password MUST be the same as the primary admin password.**
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        /**
         * The administrator password of the primary database in this Data Guard association.
         * <p>
         **The password MUST be the same as the primary admin password.**
         *
         * @param databaseAdminPassword the value to set
         * @return this builder
         **/
        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConvertToStandaloneDetails build() {
            ConvertToStandaloneDetails model =
                    new ConvertToStandaloneDetails(this.databaseAdminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConvertToStandaloneDetails model) {
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
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
     * The administrator password of the primary database in this Data Guard association.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final String databaseAdminPassword;

    /**
     * The administrator password of the primary database in this Data Guard association.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     * @return the value
     **/
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword;
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
        sb.append("ConvertToStandaloneDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseAdminPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConvertToStandaloneDetails)) {
            return false;
        }

        ConvertToStandaloneDetails other = (ConvertToStandaloneDetails) o;
        return java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseAdminPassword == null
                                ? 43
                                : this.databaseAdminPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
