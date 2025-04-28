/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * Connection validation result. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ValidateDatabaseToolsConnectionResult.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ValidateDatabaseToolsConnectionOracleDatabaseResult.class,
            name = "ORACLE_DATABASE"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ValidateDatabaseToolsConnectionMySqlResult.class,
            name = "MYSQL"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ValidateDatabaseToolsConnectionPostgresqlResult.class,
            name = "POSTGRESQL")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ValidateDatabaseToolsConnectionResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message", "cause", "action"})
    protected ValidateDatabaseToolsConnectionResult(
            String code, String message, String cause, String action) {
        super();
        this.code = code;
        this.message = message;
        this.cause = cause;
        this.action = action;
    }

    /**
     * A short code that defines the result of the validation, meant for programmatic parsing. The
     * value OK indicates that the validation was successful.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * A short code that defines the result of the validation, meant for programmatic parsing. The
     * value OK indicates that the validation was successful.
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** A human-readable message that describes the result of the validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable message that describes the result of the validation.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** A human-readable message that describes possible causes for the validation error. */
    @com.fasterxml.jackson.annotation.JsonProperty("cause")
    private final String cause;

    /**
     * A human-readable message that describes possible causes for the validation error.
     *
     * @return the value
     */
    public String getCause() {
        return cause;
    }

    /** A human-readable message that suggests a remedial action to resolve the validation error. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * A human-readable message that suggests a remedial action to resolve the validation error.
     *
     * @return the value
     */
    public String getAction() {
        return action;
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
        sb.append("ValidateDatabaseToolsConnectionResult(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", cause=").append(String.valueOf(this.cause));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateDatabaseToolsConnectionResult)) {
            return false;
        }

        ValidateDatabaseToolsConnectionResult other = (ValidateDatabaseToolsConnectionResult) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.cause, other.cause)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.cause == null ? 43 : this.cause.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
