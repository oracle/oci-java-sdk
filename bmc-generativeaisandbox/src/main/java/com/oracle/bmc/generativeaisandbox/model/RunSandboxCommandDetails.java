/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Request body used to run a command in a sandbox. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RunSandboxCommandDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RunSandboxCommandDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"command", "cwd", "args", "environmentVariables", "timeout"})
    public RunSandboxCommandDetails(
            String command,
            String cwd,
            java.util.List<String> args,
            java.util.List<EnvironmentVariable> environmentVariables,
            String timeout) {
        super();
        this.command = command;
        this.cwd = cwd;
        this.args = args;
        this.environmentVariables = environmentVariables;
        this.timeout = timeout;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The command to execute in the sandbox runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * The command to execute in the sandbox runtime.
         *
         * @param command the value to set
         * @return this builder
         */
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * Absolute directory path to use as the working directory for command execution in the
         * sandbox.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cwd")
        private String cwd;

        /**
         * Absolute directory path to use as the working directory for command execution in the
         * sandbox.
         *
         * @param cwd the value to set
         * @return this builder
         */
        public Builder cwd(String cwd) {
            this.cwd = cwd;
            this.__explicitlySet__.add("cwd");
            return this;
        }
        /** Command arguments. */
        @com.fasterxml.jackson.annotation.JsonProperty("args")
        private java.util.List<String> args;

        /**
         * Command arguments.
         *
         * @param args the value to set
         * @return this builder
         */
        public Builder args(java.util.List<String> args) {
            this.args = args;
            this.__explicitlySet__.add("args");
            return this;
        }
        /** Environment variables to inject into the command execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.List<EnvironmentVariable> environmentVariables;

        /**
         * Environment variables to inject into the command execution.
         *
         * @param environmentVariables the value to set
         * @return this builder
         */
        public Builder environmentVariables(
                java.util.List<EnvironmentVariable> environmentVariables) {
            this.environmentVariables = environmentVariables;
            this.__explicitlySet__.add("environmentVariables");
            return this;
        }
        /** Maximum execution time for the command, in ISO 8601 duration format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeout")
        private String timeout;

        /**
         * Maximum execution time for the command, in ISO 8601 duration format.
         *
         * @param timeout the value to set
         * @return this builder
         */
        public Builder timeout(String timeout) {
            this.timeout = timeout;
            this.__explicitlySet__.add("timeout");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RunSandboxCommandDetails build() {
            RunSandboxCommandDetails model =
                    new RunSandboxCommandDetails(
                            this.command,
                            this.cwd,
                            this.args,
                            this.environmentVariables,
                            this.timeout);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RunSandboxCommandDetails model) {
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("cwd")) {
                this.cwd(model.getCwd());
            }
            if (model.wasPropertyExplicitlySet("args")) {
                this.args(model.getArgs());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("timeout")) {
                this.timeout(model.getTimeout());
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

    /** The command to execute in the sandbox runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * The command to execute in the sandbox runtime.
     *
     * @return the value
     */
    public String getCommand() {
        return command;
    }

    /**
     * Absolute directory path to use as the working directory for command execution in the sandbox.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cwd")
    private final String cwd;

    /**
     * Absolute directory path to use as the working directory for command execution in the sandbox.
     *
     * @return the value
     */
    public String getCwd() {
        return cwd;
    }

    /** Command arguments. */
    @com.fasterxml.jackson.annotation.JsonProperty("args")
    private final java.util.List<String> args;

    /**
     * Command arguments.
     *
     * @return the value
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /** Environment variables to inject into the command execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * Environment variables to inject into the command execution.
     *
     * @return the value
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /** Maximum execution time for the command, in ISO 8601 duration format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeout")
    private final String timeout;

    /**
     * Maximum execution time for the command, in ISO 8601 duration format.
     *
     * @return the value
     */
    public String getTimeout() {
        return timeout;
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
        sb.append("RunSandboxCommandDetails(");
        sb.append("super=").append(super.toString());
        sb.append("command=").append(String.valueOf(this.command));
        sb.append(", cwd=").append(String.valueOf(this.cwd));
        sb.append(", args=").append(String.valueOf(this.args));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", timeout=").append(String.valueOf(this.timeout));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RunSandboxCommandDetails)) {
            return false;
        }

        RunSandboxCommandDetails other = (RunSandboxCommandDetails) o;
        return java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.cwd, other.cwd)
                && java.util.Objects.equals(this.args, other.args)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.timeout, other.timeout)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.cwd == null ? 43 : this.cwd.hashCode());
        result = (result * PRIME) + (this.args == null ? 43 : this.args.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result = (result * PRIME) + (this.timeout == null ? 43 : this.timeout.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
