/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * New password value for the target service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PasswordSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PasswordSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public PasswordSummary(String adminPassword) {
        super();
        this.adminPassword = adminPassword != null ? adminPassword.toCharArray() : null;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({"adminPassword"})
    public PasswordSummary(char[] adminPassword) {
        super();
        this.adminPassword = adminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Base-64 encoded new admin password for the requested service after the reset operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
        private char[] adminPassword;

        /**
         * Base-64 encoded new admin password for the requested service after the reset operation.
         *
         * @param adminPassword the value to set
         * @return this builder
         */
        public Builder adminPassword(char[] adminPassword) {
            this.adminPassword = adminPassword;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        public Builder adminPassword(String adminPassword) {
            this.adminPassword = adminPassword != null ? adminPassword.toCharArray() : null;
            this.__explicitlySet__.add("adminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordSummary build() {
            PasswordSummary model = new PasswordSummary(this.adminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordSummary model) {
            if (model.wasPropertyExplicitlySet("adminPassword")) {
                this.adminPassword(model.getAdminPassword());
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

    /** Base-64 encoded new admin password for the requested service after the reset operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    private final char[] adminPassword;

    /**
     * Base-64 encoded new admin password for the requested service after the reset operation.
     *
     * @return the value
     * @deprecated Use getAdminPassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getAdminPassword() {
        return adminPassword != null ? new String(adminPassword) : null;
    }

    /**
     * Base-64 encoded new admin password for the requested service after the reset operation.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("adminPassword")
    public char[] getAdminPassword__AsCharArray() {
        return adminPassword;
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
        sb.append("PasswordSummary(");
        sb.append("super=").append(super.toString());
        sb.append("adminPassword=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PasswordSummary)) {
            return false;
        }

        PasswordSummary other = (PasswordSummary) o;
        return java.util.Objects.equals(this.adminPassword, other.adminPassword)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.adminPassword == null ? 43 : this.adminPassword.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
