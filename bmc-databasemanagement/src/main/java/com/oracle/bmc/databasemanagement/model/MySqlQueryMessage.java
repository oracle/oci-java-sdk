/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The MySQL error, warning or note raised when a query is run, if any. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlQueryMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlQueryMessage
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"level", "code", "messageText"})
    public MySqlQueryMessage(MySqlMessageSeverity level, Integer code, String messageText) {
        super();
        this.level = level;
        this.code = code;
        this.messageText = messageText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The level of severity of the MySQL message. */
        @com.fasterxml.jackson.annotation.JsonProperty("level")
        private MySqlMessageSeverity level;

        /**
         * The level of severity of the MySQL message.
         *
         * @param level the value to set
         * @return this builder
         */
        public Builder level(MySqlMessageSeverity level) {
            this.level = level;
            this.__explicitlySet__.add("level");
            return this;
        }
        /** The MySQL code of the raised error, warning or note. */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Integer code;

        /**
         * The MySQL code of the raised error, warning or note.
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(Integer code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** The MySQL message text of the raised error, warning or note. */
        @com.fasterxml.jackson.annotation.JsonProperty("messageText")
        private String messageText;

        /**
         * The MySQL message text of the raised error, warning or note.
         *
         * @param messageText the value to set
         * @return this builder
         */
        public Builder messageText(String messageText) {
            this.messageText = messageText;
            this.__explicitlySet__.add("messageText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlQueryMessage build() {
            MySqlQueryMessage model =
                    new MySqlQueryMessage(this.level, this.code, this.messageText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlQueryMessage model) {
            if (model.wasPropertyExplicitlySet("level")) {
                this.level(model.getLevel());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("messageText")) {
                this.messageText(model.getMessageText());
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

    /** The level of severity of the MySQL message. */
    @com.fasterxml.jackson.annotation.JsonProperty("level")
    private final MySqlMessageSeverity level;

    /**
     * The level of severity of the MySQL message.
     *
     * @return the value
     */
    public MySqlMessageSeverity getLevel() {
        return level;
    }

    /** The MySQL code of the raised error, warning or note. */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final Integer code;

    /**
     * The MySQL code of the raised error, warning or note.
     *
     * @return the value
     */
    public Integer getCode() {
        return code;
    }

    /** The MySQL message text of the raised error, warning or note. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageText")
    private final String messageText;

    /**
     * The MySQL message text of the raised error, warning or note.
     *
     * @return the value
     */
    public String getMessageText() {
        return messageText;
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
        sb.append("MySqlQueryMessage(");
        sb.append("super=").append(super.toString());
        sb.append("level=").append(String.valueOf(this.level));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", messageText=").append(String.valueOf(this.messageText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlQueryMessage)) {
            return false;
        }

        MySqlQueryMessage other = (MySqlQueryMessage) o;
        return java.util.Objects.equals(this.level, other.level)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.messageText, other.messageText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.messageText == null ? 43 : this.messageText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
