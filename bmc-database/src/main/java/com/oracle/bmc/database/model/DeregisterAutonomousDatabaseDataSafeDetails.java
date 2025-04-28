/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to deregister an Autonomous Database with Data Safe. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DeregisterAutonomousDatabaseDataSafeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DeregisterAutonomousDatabaseDataSafeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pdbAdminPassword"})
    public DeregisterAutonomousDatabaseDataSafeDetails(String pdbAdminPassword) {
        super();
        this.pdbAdminPassword = pdbAdminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The admin password provided during the creation of the database. This password is between
         * 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1
         * numeric character. It cannot contain the double quote symbol (") or the username "admin",
         * regardless of casing.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
        private String pdbAdminPassword;

        /**
         * The admin password provided during the creation of the database. This password is between
         * 12 and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1
         * numeric character. It cannot contain the double quote symbol (") or the username "admin",
         * regardless of casing.
         *
         * @param pdbAdminPassword the value to set
         * @return this builder
         */
        public Builder pdbAdminPassword(String pdbAdminPassword) {
            this.pdbAdminPassword = pdbAdminPassword;
            this.__explicitlySet__.add("pdbAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DeregisterAutonomousDatabaseDataSafeDetails build() {
            DeregisterAutonomousDatabaseDataSafeDetails model =
                    new DeregisterAutonomousDatabaseDataSafeDetails(this.pdbAdminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DeregisterAutonomousDatabaseDataSafeDetails model) {
            if (model.wasPropertyExplicitlySet("pdbAdminPassword")) {
                this.pdbAdminPassword(model.getPdbAdminPassword());
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
     * The admin password provided during the creation of the database. This password is between 12
     * and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric
     * character. It cannot contain the double quote symbol (") or the username "admin", regardless
     * of casing.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pdbAdminPassword")
    private final String pdbAdminPassword;

    /**
     * The admin password provided during the creation of the database. This password is between 12
     * and 30 characters long, and must contain at least 1 uppercase, 1 lowercase, and 1 numeric
     * character. It cannot contain the double quote symbol (") or the username "admin", regardless
     * of casing.
     *
     * @return the value
     */
    public String getPdbAdminPassword() {
        return pdbAdminPassword;
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
        sb.append("DeregisterAutonomousDatabaseDataSafeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("pdbAdminPassword=").append(String.valueOf(this.pdbAdminPassword));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DeregisterAutonomousDatabaseDataSafeDetails)) {
            return false;
        }

        DeregisterAutonomousDatabaseDataSafeDetails other =
                (DeregisterAutonomousDatabaseDataSafeDetails) o;
        return java.util.Objects.equals(this.pdbAdminPassword, other.pdbAdminPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pdbAdminPassword == null ? 43 : this.pdbAdminPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
