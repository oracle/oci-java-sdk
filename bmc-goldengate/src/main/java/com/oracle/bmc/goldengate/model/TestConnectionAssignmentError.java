/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Error Information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TestConnectionAssignmentError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TestConnectionAssignmentError
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message", "issue", "action"})
    public TestConnectionAssignmentError(String code, String message, String issue, String action) {
        super();
        this.code = code;
        this.message = message;
        this.issue = issue;
        this.action = action;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A short error code that defines the error, meant for programmatic parsing. */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * A short error code that defines the error, meant for programmatic parsing.
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** A human-readable error string. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human-readable error string.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** The text describing the root cause of the reported issue. */
        @com.fasterxml.jackson.annotation.JsonProperty("issue")
        private String issue;

        /**
         * The text describing the root cause of the reported issue.
         *
         * @param issue the value to set
         * @return this builder
         */
        public Builder issue(String issue) {
            this.issue = issue;
            this.__explicitlySet__.add("issue");
            return this;
        }
        /** The text describing the action required to fix the issue. */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private String action;

        /**
         * The text describing the action required to fix the issue.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(String action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TestConnectionAssignmentError build() {
            TestConnectionAssignmentError model =
                    new TestConnectionAssignmentError(
                            this.code, this.message, this.issue, this.action);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TestConnectionAssignmentError model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("issue")) {
                this.issue(model.getIssue());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
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

    /** A short error code that defines the error, meant for programmatic parsing. */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * A short error code that defines the error, meant for programmatic parsing.
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** A human-readable error string. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable error string.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** The text describing the root cause of the reported issue. */
    @com.fasterxml.jackson.annotation.JsonProperty("issue")
    private final String issue;

    /**
     * The text describing the root cause of the reported issue.
     *
     * @return the value
     */
    public String getIssue() {
        return issue;
    }

    /** The text describing the action required to fix the issue. */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final String action;

    /**
     * The text describing the action required to fix the issue.
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
        sb.append("TestConnectionAssignmentError(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", issue=").append(String.valueOf(this.issue));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TestConnectionAssignmentError)) {
            return false;
        }

        TestConnectionAssignmentError other = (TestConnectionAssignmentError) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.issue, other.issue)
                && java.util.Objects.equals(this.action, other.action)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.issue == null ? 43 : this.issue.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
