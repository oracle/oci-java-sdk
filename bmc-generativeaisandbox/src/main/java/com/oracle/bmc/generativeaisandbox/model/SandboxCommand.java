/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Sandbox command resource representation. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SandboxCommand.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxCommand
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "sandboxId",
        "cwd",
        "command",
        "args",
        "environmentVariables",
        "exitCode",
        "output",
        "timeCreated",
        "timeUpdated",
        "timeStarted",
        "timeFinished"
    })
    public SandboxCommand(
            String id,
            String sandboxId,
            String cwd,
            String command,
            java.util.List<String> args,
            java.util.List<EnvironmentVariable> environmentVariables,
            Integer exitCode,
            SandboxCommandOutput output,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeStarted,
            java.util.Date timeFinished) {
        super();
        this.id = id;
        this.sandboxId = sandboxId;
        this.cwd = cwd;
        this.command = command;
        this.args = args;
        this.environmentVariables = environmentVariables;
        this.exitCode = exitCode;
        this.output = output;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeStarted = timeStarted;
        this.timeFinished = timeFinished;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sandbox command identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Sandbox command identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Sandbox identifier that this command runs against. */
        @com.fasterxml.jackson.annotation.JsonProperty("sandboxId")
        private String sandboxId;

        /**
         * Sandbox identifier that this command runs against.
         *
         * @param sandboxId the value to set
         * @return this builder
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            this.__explicitlySet__.add("sandboxId");
            return this;
        }
        /**
         * Absolute directory path used as the working directory for command execution in the
         * sandbox.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cwd")
        private String cwd;

        /**
         * Absolute directory path used as the working directory for command execution in the
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
        /** The command executed in the sandbox runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * The command executed in the sandbox runtime.
         *
         * @param command the value to set
         * @return this builder
         */
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
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
        /** Environment variables injected into the command execution. */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
        private java.util.List<EnvironmentVariable> environmentVariables;

        /**
         * Environment variables injected into the command execution.
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
        /** Process exit code when available. */
        @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
        private Integer exitCode;

        /**
         * Process exit code when available.
         *
         * @param exitCode the value to set
         * @return this builder
         */
        public Builder exitCode(Integer exitCode) {
            this.exitCode = exitCode;
            this.__explicitlySet__.add("exitCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private SandboxCommandOutput output;

        public Builder output(SandboxCommandOutput output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }
        /** The date and time the command was created, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the command was created, in RFC 3339 format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The date and time the command was last updated, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the command was last updated, in RFC 3339 format.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The date and time command execution started, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time command execution started, in RFC 3339 format.
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** The date and time command execution finished, in RFC 3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        /**
         * The date and time command execution finished, in RFC 3339 format.
         *
         * @param timeFinished the value to set
         * @return this builder
         */
        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxCommand build() {
            SandboxCommand model =
                    new SandboxCommand(
                            this.id,
                            this.sandboxId,
                            this.cwd,
                            this.command,
                            this.args,
                            this.environmentVariables,
                            this.exitCode,
                            this.output,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeStarted,
                            this.timeFinished);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxCommand model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("sandboxId")) {
                this.sandboxId(model.getSandboxId());
            }
            if (model.wasPropertyExplicitlySet("cwd")) {
                this.cwd(model.getCwd());
            }
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("args")) {
                this.args(model.getArgs());
            }
            if (model.wasPropertyExplicitlySet("environmentVariables")) {
                this.environmentVariables(model.getEnvironmentVariables());
            }
            if (model.wasPropertyExplicitlySet("exitCode")) {
                this.exitCode(model.getExitCode());
            }
            if (model.wasPropertyExplicitlySet("output")) {
                this.output(model.getOutput());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeFinished")) {
                this.timeFinished(model.getTimeFinished());
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

    /** Sandbox command identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Sandbox command identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Sandbox identifier that this command runs against. */
    @com.fasterxml.jackson.annotation.JsonProperty("sandboxId")
    private final String sandboxId;

    /**
     * Sandbox identifier that this command runs against.
     *
     * @return the value
     */
    public String getSandboxId() {
        return sandboxId;
    }

    /**
     * Absolute directory path used as the working directory for command execution in the sandbox.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cwd")
    private final String cwd;

    /**
     * Absolute directory path used as the working directory for command execution in the sandbox.
     *
     * @return the value
     */
    public String getCwd() {
        return cwd;
    }

    /** The command executed in the sandbox runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * The command executed in the sandbox runtime.
     *
     * @return the value
     */
    public String getCommand() {
        return command;
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

    /** Environment variables injected into the command execution. */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentVariables")
    private final java.util.List<EnvironmentVariable> environmentVariables;

    /**
     * Environment variables injected into the command execution.
     *
     * @return the value
     */
    public java.util.List<EnvironmentVariable> getEnvironmentVariables() {
        return environmentVariables;
    }

    /** Process exit code when available. */
    @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
    private final Integer exitCode;

    /**
     * Process exit code when available.
     *
     * @return the value
     */
    public Integer getExitCode() {
        return exitCode;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final SandboxCommandOutput output;

    public SandboxCommandOutput getOutput() {
        return output;
    }

    /** The date and time the command was created, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the command was created, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The date and time the command was last updated, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the command was last updated, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The date and time command execution started, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time command execution started, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** The date and time command execution finished, in RFC 3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    private final java.util.Date timeFinished;

    /**
     * The date and time command execution finished, in RFC 3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeFinished() {
        return timeFinished;
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
        sb.append("SandboxCommand(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", sandboxId=").append(String.valueOf(this.sandboxId));
        sb.append(", cwd=").append(String.valueOf(this.cwd));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", args=").append(String.valueOf(this.args));
        sb.append(", environmentVariables=").append(String.valueOf(this.environmentVariables));
        sb.append(", exitCode=").append(String.valueOf(this.exitCode));
        sb.append(", output=").append(String.valueOf(this.output));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeFinished=").append(String.valueOf(this.timeFinished));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxCommand)) {
            return false;
        }

        SandboxCommand other = (SandboxCommand) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.cwd, other.cwd)
                && java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.args, other.args)
                && java.util.Objects.equals(this.environmentVariables, other.environmentVariables)
                && java.util.Objects.equals(this.exitCode, other.exitCode)
                && java.util.Objects.equals(this.output, other.output)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeFinished, other.timeFinished)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result = (result * PRIME) + (this.cwd == null ? 43 : this.cwd.hashCode());
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.args == null ? 43 : this.args.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentVariables == null
                                ? 43
                                : this.environmentVariables.hashCode());
        result = (result * PRIME) + (this.exitCode == null ? 43 : this.exitCode.hashCode());
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeFinished == null ? 43 : this.timeFinished.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
