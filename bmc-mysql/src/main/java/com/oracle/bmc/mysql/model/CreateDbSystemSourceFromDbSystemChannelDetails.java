/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * Properties to setup a replication channel with the source (cloned) DB system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateDbSystemSourceFromDbSystemChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDbSystemSourceFromDbSystemChannelDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    public CreateDbSystemSourceFromDbSystemChannelDetails(
            String sourceUsername,
            String sourcePassword,
            SslMode sslMode,
            CaCertificate sslCaCertificate,
            String applierUsername) {
        super();
        this.sourceUsername = sourceUsername;
        this.sourcePassword = sourcePassword != null ? sourcePassword.toCharArray() : null;
        this.sslMode = sslMode;
        this.sslCaCertificate = sslCaCertificate;
        this.applierUsername = applierUsername;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceUsername",
        "sourcePassword",
        "sslMode",
        "sslCaCertificate",
        "applierUsername"
    })
    public CreateDbSystemSourceFromDbSystemChannelDetails(
            String sourceUsername,
            char[] sourcePassword,
            SslMode sslMode,
            CaCertificate sslCaCertificate,
            String applierUsername) {
        super();
        this.sourceUsername = sourceUsername;
        this.sourcePassword = sourcePassword;
        this.sslMode = sslMode;
        this.sslCaCertificate = sslCaCertificate;
        this.applierUsername = applierUsername;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the replication user on the source DB system. The username has a maximum
         * length of 96 characters. For more information, please see the [MySQL
         * documentation](https://dev.mysql.com/doc/en/change-replication-source-to.html)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUsername")
        private String sourceUsername;

        /**
         * The name of the replication user on the source DB system. The username has a maximum
         * length of 96 characters. For more information, please see the [MySQL
         * documentation](https://dev.mysql.com/doc/en/change-replication-source-to.html)
         *
         * @param sourceUsername the value to set
         * @return this builder
         */
        public Builder sourceUsername(String sourceUsername) {
            this.sourceUsername = sourceUsername;
            this.__explicitlySet__.add("sourceUsername");
            return this;
        }
        /**
         * The password for the replication user. The password must be between 8 and 32 characters
         * long, and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase
         * character, and 1 special (nonalphanumeric) character.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePassword")
        private char[] sourcePassword;

        /**
         * The password for the replication user. The password must be between 8 and 32 characters
         * long, and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase
         * character, and 1 special (nonalphanumeric) character.
         *
         * @param sourcePassword the value to set
         * @return this builder
         */
        public Builder sourcePassword(char[] sourcePassword) {
            this.sourcePassword = sourcePassword;
            this.__explicitlySet__.add("sourcePassword");
            return this;
        }

        public Builder sourcePassword(String sourcePassword) {
            this.sourcePassword = sourcePassword != null ? sourcePassword.toCharArray() : null;
            this.__explicitlySet__.add("sourcePassword");
            return this;
        }
        /** The SSL mode of the Channel. */
        @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
        private SslMode sslMode;

        /**
         * The SSL mode of the Channel.
         *
         * @param sslMode the value to set
         * @return this builder
         */
        public Builder sslMode(SslMode sslMode) {
            this.sslMode = sslMode;
            this.__explicitlySet__.add("sslMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sslCaCertificate")
        private CaCertificate sslCaCertificate;

        public Builder sslCaCertificate(CaCertificate sslCaCertificate) {
            this.sslCaCertificate = sslCaCertificate;
            this.__explicitlySet__.add("sslCaCertificate");
            return this;
        }
        /** The username for the replication applier of the created MySQL DB System. */
        @com.fasterxml.jackson.annotation.JsonProperty("applierUsername")
        private String applierUsername;

        /**
         * The username for the replication applier of the created MySQL DB System.
         *
         * @param applierUsername the value to set
         * @return this builder
         */
        public Builder applierUsername(String applierUsername) {
            this.applierUsername = applierUsername;
            this.__explicitlySet__.add("applierUsername");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbSystemSourceFromDbSystemChannelDetails build() {
            CreateDbSystemSourceFromDbSystemChannelDetails model =
                    new CreateDbSystemSourceFromDbSystemChannelDetails(
                            this.sourceUsername,
                            this.sourcePassword,
                            this.sslMode,
                            this.sslCaCertificate,
                            this.applierUsername);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbSystemSourceFromDbSystemChannelDetails model) {
            if (model.wasPropertyExplicitlySet("sourceUsername")) {
                this.sourceUsername(model.getSourceUsername());
            }
            if (model.wasPropertyExplicitlySet("sourcePassword")) {
                this.sourcePassword(model.getSourcePassword());
            }
            if (model.wasPropertyExplicitlySet("sslMode")) {
                this.sslMode(model.getSslMode());
            }
            if (model.wasPropertyExplicitlySet("sslCaCertificate")) {
                this.sslCaCertificate(model.getSslCaCertificate());
            }
            if (model.wasPropertyExplicitlySet("applierUsername")) {
                this.applierUsername(model.getApplierUsername());
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
     * The name of the replication user on the source DB system. The username has a maximum length
     * of 96 characters. For more information, please see the [MySQL
     * documentation](https://dev.mysql.com/doc/en/change-replication-source-to.html)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUsername")
    private final String sourceUsername;

    /**
     * The name of the replication user on the source DB system. The username has a maximum length
     * of 96 characters. For more information, please see the [MySQL
     * documentation](https://dev.mysql.com/doc/en/change-replication-source-to.html)
     *
     * @return the value
     */
    public String getSourceUsername() {
        return sourceUsername;
    }

    /**
     * The password for the replication user. The password must be between 8 and 32 characters long,
     * and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase character,
     * and 1 special (nonalphanumeric) character.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePassword")
    private final char[] sourcePassword;

    /**
     * The password for the replication user. The password must be between 8 and 32 characters long,
     * and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase character,
     * and 1 special (nonalphanumeric) character.
     *
     * @return the value
     * @deprecated Use getSourcePassword__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getSourcePassword() {
        return sourcePassword != null ? new String(sourcePassword) : null;
    }

    /**
     * The password for the replication user. The password must be between 8 and 32 characters long,
     * and must contain at least 1 numeric character, 1 lowercase character, 1 uppercase character,
     * and 1 special (nonalphanumeric) character.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePassword")
    public char[] getSourcePassword__AsCharArray() {
        return sourcePassword;
    }

    /** The SSL mode of the Channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("sslMode")
    private final SslMode sslMode;

    /**
     * The SSL mode of the Channel.
     *
     * @return the value
     */
    public SslMode getSslMode() {
        return sslMode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sslCaCertificate")
    private final CaCertificate sslCaCertificate;

    public CaCertificate getSslCaCertificate() {
        return sslCaCertificate;
    }

    /** The username for the replication applier of the created MySQL DB System. */
    @com.fasterxml.jackson.annotation.JsonProperty("applierUsername")
    private final String applierUsername;

    /**
     * The username for the replication applier of the created MySQL DB System.
     *
     * @return the value
     */
    public String getApplierUsername() {
        return applierUsername;
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
        sb.append("CreateDbSystemSourceFromDbSystemChannelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceUsername=").append(String.valueOf(this.sourceUsername));
        sb.append(", sourcePassword=").append("<redacted>");
        sb.append(", sslMode=").append(String.valueOf(this.sslMode));
        sb.append(", sslCaCertificate=").append(String.valueOf(this.sslCaCertificate));
        sb.append(", applierUsername=").append(String.valueOf(this.applierUsername));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbSystemSourceFromDbSystemChannelDetails)) {
            return false;
        }

        CreateDbSystemSourceFromDbSystemChannelDetails other =
                (CreateDbSystemSourceFromDbSystemChannelDetails) o;
        return java.util.Objects.equals(this.sourceUsername, other.sourceUsername)
                && java.util.Objects.equals(this.sourcePassword, other.sourcePassword)
                && java.util.Objects.equals(this.sslMode, other.sslMode)
                && java.util.Objects.equals(this.sslCaCertificate, other.sslCaCertificate)
                && java.util.Objects.equals(this.applierUsername, other.applierUsername)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceUsername == null ? 43 : this.sourceUsername.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePassword == null ? 43 : this.sourcePassword.hashCode());
        result = (result * PRIME) + (this.sslMode == null ? 43 : this.sslMode.hashCode());
        result =
                (result * PRIME)
                        + (this.sslCaCertificate == null ? 43 : this.sslCaCertificate.hashCode());
        result =
                (result * PRIME)
                        + (this.applierUsername == null ? 43 : this.applierUsername.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
