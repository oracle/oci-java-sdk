/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The token that allows the OCI Console to access the Autonomous AI Database Service Console. <br>
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
        builder = AutonomousDatabaseConsoleTokenDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseConsoleTokenDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"token", "loginUrl"})
    public AutonomousDatabaseConsoleTokenDetails(String token, String loginUrl) {
        super();
        this.token = token;
        this.loginUrl = loginUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The token that allows the OCI Console to access the Autonomous AI Transaction Processing
         * Service Console.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("token")
        private String token;

        /**
         * The token that allows the OCI Console to access the Autonomous AI Transaction Processing
         * Service Console.
         *
         * @param token the value to set
         * @return this builder
         */
        public Builder token(String token) {
            this.token = token;
            this.__explicitlySet__.add("token");
            return this;
        }
        /**
         * The login URL that allows the OCI Console to access the Autonomous AI Transaction
         * Processing Service Console.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginUrl")
        private String loginUrl;

        /**
         * The login URL that allows the OCI Console to access the Autonomous AI Transaction
         * Processing Service Console.
         *
         * @param loginUrl the value to set
         * @return this builder
         */
        public Builder loginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            this.__explicitlySet__.add("loginUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseConsoleTokenDetails build() {
            AutonomousDatabaseConsoleTokenDetails model =
                    new AutonomousDatabaseConsoleTokenDetails(this.token, this.loginUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseConsoleTokenDetails model) {
            if (model.wasPropertyExplicitlySet("token")) {
                this.token(model.getToken());
            }
            if (model.wasPropertyExplicitlySet("loginUrl")) {
                this.loginUrl(model.getLoginUrl());
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
     * The token that allows the OCI Console to access the Autonomous AI Transaction Processing
     * Service Console.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("token")
    private final String token;

    /**
     * The token that allows the OCI Console to access the Autonomous AI Transaction Processing
     * Service Console.
     *
     * @return the value
     */
    public String getToken() {
        return token;
    }

    /**
     * The login URL that allows the OCI Console to access the Autonomous AI Transaction Processing
     * Service Console.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginUrl")
    private final String loginUrl;

    /**
     * The login URL that allows the OCI Console to access the Autonomous AI Transaction Processing
     * Service Console.
     *
     * @return the value
     */
    public String getLoginUrl() {
        return loginUrl;
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
        sb.append("AutonomousDatabaseConsoleTokenDetails(");
        sb.append("super=").append(super.toString());
        sb.append("token=").append(String.valueOf(this.token));
        sb.append(", loginUrl=").append(String.valueOf(this.loginUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseConsoleTokenDetails)) {
            return false;
        }

        AutonomousDatabaseConsoleTokenDetails other = (AutonomousDatabaseConsoleTokenDetails) o;
        return java.util.Objects.equals(this.token, other.token)
                && java.util.Objects.equals(this.loginUrl, other.loginUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.token == null ? 43 : this.token.hashCode());
        result = (result * PRIME) + (this.loginUrl == null ? 43 : this.loginUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
