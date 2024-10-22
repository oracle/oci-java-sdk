/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Details for script-based execution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScriptBasedExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "executionType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScriptBasedExecutionDetails extends ExecutionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private TaskVariable variables;

        public Builder variables(TaskVariable variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private ContentDetails content;

        public Builder content(ContentDetails content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * Optional command to execute the content. You can provide any commands/arguments that
         * can't be part of the script.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * Optional command to execute the content. You can provide any commands/arguments that
         * can't be part of the script.
         *
         * @param command the value to set
         * @return this builder
         */
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /** Credentials required for executing the task. */
        @com.fasterxml.jackson.annotation.JsonProperty("credentials")
        private java.util.List<ConfigAssociationDetails> credentials;

        /**
         * Credentials required for executing the task.
         *
         * @param credentials the value to set
         * @return this builder
         */
        public Builder credentials(java.util.List<ConfigAssociationDetails> credentials) {
            this.credentials = credentials;
            this.__explicitlySet__.add("credentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScriptBasedExecutionDetails build() {
            ScriptBasedExecutionDetails model =
                    new ScriptBasedExecutionDetails(
                            this.variables, this.content, this.command, this.credentials);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScriptBasedExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("credentials")) {
                this.credentials(model.getCredentials());
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
    public ScriptBasedExecutionDetails(
            TaskVariable variables,
            ContentDetails content,
            String command,
            java.util.List<ConfigAssociationDetails> credentials) {
        super();
        this.variables = variables;
        this.content = content;
        this.command = command;
        this.credentials = credentials;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final TaskVariable variables;

    public TaskVariable getVariables() {
        return variables;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final ContentDetails content;

    public ContentDetails getContent() {
        return content;
    }

    /**
     * Optional command to execute the content. You can provide any commands/arguments that can't be
     * part of the script.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * Optional command to execute the content. You can provide any commands/arguments that can't be
     * part of the script.
     *
     * @return the value
     */
    public String getCommand() {
        return command;
    }

    /** Credentials required for executing the task. */
    @com.fasterxml.jackson.annotation.JsonProperty("credentials")
    private final java.util.List<ConfigAssociationDetails> credentials;

    /**
     * Credentials required for executing the task.
     *
     * @return the value
     */
    public java.util.List<ConfigAssociationDetails> getCredentials() {
        return credentials;
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
        sb.append("ScriptBasedExecutionDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", credentials=").append(String.valueOf(this.credentials));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScriptBasedExecutionDetails)) {
            return false;
        }

        ScriptBasedExecutionDetails other = (ScriptBasedExecutionDetails) o;
        return java.util.Objects.equals(this.variables, other.variables)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.credentials, other.credentials)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.credentials == null ? 43 : this.credentials.hashCode());
        return result;
    }
}
