/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * MySql SQL Text type object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MySqlSqlText.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlSqlText extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "schemaName",
        "digest",
        "timeCollected",
        "commandType",
        "digestText"
    })
    public MySqlSqlText(
            String schemaName,
            String digest,
            java.util.Date timeCollected,
            String commandType,
            String digestText) {
        super();
        this.schemaName = schemaName;
        this.digest = digest;
        this.timeCollected = timeCollected;
        this.commandType = commandType;
        this.digestText = digestText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of Database Schema. Example: {@code "performance_schema"} */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * Name of Database Schema. Example: {@code "performance_schema"}
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** digest Example: {@code "323k3k99ua09a90adf"} */
        @com.fasterxml.jackson.annotation.JsonProperty("digest")
        private String digest;

        /**
         * digest Example: {@code "323k3k99ua09a90adf"}
         *
         * @param digest the value to set
         * @return this builder
         */
        public Builder digest(String digest) {
            this.digest = digest;
            this.__explicitlySet__.add("digest");
            return this;
        }
        /** Collection timestamp. Example: {@code "2020-05-06T00:00:00.000Z"} */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
        private java.util.Date timeCollected;

        /**
         * Collection timestamp. Example: {@code "2020-05-06T00:00:00.000Z"}
         *
         * @param timeCollected the value to set
         * @return this builder
         */
        public Builder timeCollected(java.util.Date timeCollected) {
            this.timeCollected = timeCollected;
            this.__explicitlySet__.add("timeCollected");
            return this;
        }
        /** SQL event name Example: {@code "SELECT"} */
        @com.fasterxml.jackson.annotation.JsonProperty("commandType")
        private String commandType;

        /**
         * SQL event name Example: {@code "SELECT"}
         *
         * @param commandType the value to set
         * @return this builder
         */
        public Builder commandType(String commandType) {
            this.commandType = commandType;
            this.__explicitlySet__.add("commandType");
            return this;
        }
        /**
         * The normalized statement string. Example: {@code "SELECT
         * username,profile,default_tablespace,temporary_tablespace FROM dba_users"}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("digestText")
        private String digestText;

        /**
         * The normalized statement string. Example: {@code "SELECT
         * username,profile,default_tablespace,temporary_tablespace FROM dba_users"}
         *
         * @param digestText the value to set
         * @return this builder
         */
        public Builder digestText(String digestText) {
            this.digestText = digestText;
            this.__explicitlySet__.add("digestText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlSqlText build() {
            MySqlSqlText model =
                    new MySqlSqlText(
                            this.schemaName,
                            this.digest,
                            this.timeCollected,
                            this.commandType,
                            this.digestText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlSqlText model) {
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("digest")) {
                this.digest(model.getDigest());
            }
            if (model.wasPropertyExplicitlySet("timeCollected")) {
                this.timeCollected(model.getTimeCollected());
            }
            if (model.wasPropertyExplicitlySet("commandType")) {
                this.commandType(model.getCommandType());
            }
            if (model.wasPropertyExplicitlySet("digestText")) {
                this.digestText(model.getDigestText());
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

    /** Name of Database Schema. Example: {@code "performance_schema"} */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * Name of Database Schema. Example: {@code "performance_schema"}
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** digest Example: {@code "323k3k99ua09a90adf"} */
    @com.fasterxml.jackson.annotation.JsonProperty("digest")
    private final String digest;

    /**
     * digest Example: {@code "323k3k99ua09a90adf"}
     *
     * @return the value
     */
    public String getDigest() {
        return digest;
    }

    /** Collection timestamp. Example: {@code "2020-05-06T00:00:00.000Z"} */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCollected")
    private final java.util.Date timeCollected;

    /**
     * Collection timestamp. Example: {@code "2020-05-06T00:00:00.000Z"}
     *
     * @return the value
     */
    public java.util.Date getTimeCollected() {
        return timeCollected;
    }

    /** SQL event name Example: {@code "SELECT"} */
    @com.fasterxml.jackson.annotation.JsonProperty("commandType")
    private final String commandType;

    /**
     * SQL event name Example: {@code "SELECT"}
     *
     * @return the value
     */
    public String getCommandType() {
        return commandType;
    }

    /**
     * The normalized statement string. Example: {@code "SELECT
     * username,profile,default_tablespace,temporary_tablespace FROM dba_users"}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("digestText")
    private final String digestText;

    /**
     * The normalized statement string. Example: {@code "SELECT
     * username,profile,default_tablespace,temporary_tablespace FROM dba_users"}
     *
     * @return the value
     */
    public String getDigestText() {
        return digestText;
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
        sb.append("MySqlSqlText(");
        sb.append("super=").append(super.toString());
        sb.append("schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", digest=").append(String.valueOf(this.digest));
        sb.append(", timeCollected=").append(String.valueOf(this.timeCollected));
        sb.append(", commandType=").append(String.valueOf(this.commandType));
        sb.append(", digestText=").append(String.valueOf(this.digestText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlSqlText)) {
            return false;
        }

        MySqlSqlText other = (MySqlSqlText) o;
        return java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.digest, other.digest)
                && java.util.Objects.equals(this.timeCollected, other.timeCollected)
                && java.util.Objects.equals(this.commandType, other.commandType)
                && java.util.Objects.equals(this.digestText, other.digestText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.digest == null ? 43 : this.digest.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCollected == null ? 43 : this.timeCollected.hashCode());
        result = (result * PRIME) + (this.commandType == null ? 43 : this.commandType.hashCode());
        result = (result * PRIME) + (this.digestText == null ? 43 : this.digestText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
