/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Captured command output details. <br>
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
        builder = SandboxCommandOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxCommandOutput
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"commandId", "exitCode", "stdout", "stderr", "lastSeq"})
    public SandboxCommandOutput(
            String commandId, Integer exitCode, String stdout, String stderr, Long lastSeq) {
        super();
        this.commandId = commandId;
        this.exitCode = exitCode;
        this.stdout = stdout;
        this.stderr = stderr;
        this.lastSeq = lastSeq;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sandbox command identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("commandId")
        private String commandId;

        /**
         * Sandbox command identifier.
         *
         * @param commandId the value to set
         * @return this builder
         */
        public Builder commandId(String commandId) {
            this.commandId = commandId;
            this.__explicitlySet__.add("commandId");
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
        /** Standard output captured from the requested event sequence. */
        @com.fasterxml.jackson.annotation.JsonProperty("stdout")
        private String stdout;

        /**
         * Standard output captured from the requested event sequence.
         *
         * @param stdout the value to set
         * @return this builder
         */
        public Builder stdout(String stdout) {
            this.stdout = stdout;
            this.__explicitlySet__.add("stdout");
            return this;
        }
        /** Standard error captured from the requested event sequence. */
        @com.fasterxml.jackson.annotation.JsonProperty("stderr")
        private String stderr;

        /**
         * Standard error captured from the requested event sequence.
         *
         * @param stderr the value to set
         * @return this builder
         */
        public Builder stderr(String stderr) {
            this.stderr = stderr;
            this.__explicitlySet__.add("stderr");
            return this;
        }
        /** Last command event sequence number included in the output. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastSeq")
        private Long lastSeq;

        /**
         * Last command event sequence number included in the output.
         *
         * @param lastSeq the value to set
         * @return this builder
         */
        public Builder lastSeq(Long lastSeq) {
            this.lastSeq = lastSeq;
            this.__explicitlySet__.add("lastSeq");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxCommandOutput build() {
            SandboxCommandOutput model =
                    new SandboxCommandOutput(
                            this.commandId, this.exitCode, this.stdout, this.stderr, this.lastSeq);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxCommandOutput model) {
            if (model.wasPropertyExplicitlySet("commandId")) {
                this.commandId(model.getCommandId());
            }
            if (model.wasPropertyExplicitlySet("exitCode")) {
                this.exitCode(model.getExitCode());
            }
            if (model.wasPropertyExplicitlySet("stdout")) {
                this.stdout(model.getStdout());
            }
            if (model.wasPropertyExplicitlySet("stderr")) {
                this.stderr(model.getStderr());
            }
            if (model.wasPropertyExplicitlySet("lastSeq")) {
                this.lastSeq(model.getLastSeq());
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
    @com.fasterxml.jackson.annotation.JsonProperty("commandId")
    private final String commandId;

    /**
     * Sandbox command identifier.
     *
     * @return the value
     */
    public String getCommandId() {
        return commandId;
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

    /** Standard output captured from the requested event sequence. */
    @com.fasterxml.jackson.annotation.JsonProperty("stdout")
    private final String stdout;

    /**
     * Standard output captured from the requested event sequence.
     *
     * @return the value
     */
    public String getStdout() {
        return stdout;
    }

    /** Standard error captured from the requested event sequence. */
    @com.fasterxml.jackson.annotation.JsonProperty("stderr")
    private final String stderr;

    /**
     * Standard error captured from the requested event sequence.
     *
     * @return the value
     */
    public String getStderr() {
        return stderr;
    }

    /** Last command event sequence number included in the output. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSeq")
    private final Long lastSeq;

    /**
     * Last command event sequence number included in the output.
     *
     * @return the value
     */
    public Long getLastSeq() {
        return lastSeq;
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
        sb.append("SandboxCommandOutput(");
        sb.append("super=").append(super.toString());
        sb.append("commandId=").append(String.valueOf(this.commandId));
        sb.append(", exitCode=").append(String.valueOf(this.exitCode));
        sb.append(", stdout=").append(String.valueOf(this.stdout));
        sb.append(", stderr=").append(String.valueOf(this.stderr));
        sb.append(", lastSeq=").append(String.valueOf(this.lastSeq));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxCommandOutput)) {
            return false;
        }

        SandboxCommandOutput other = (SandboxCommandOutput) o;
        return java.util.Objects.equals(this.commandId, other.commandId)
                && java.util.Objects.equals(this.exitCode, other.exitCode)
                && java.util.Objects.equals(this.stdout, other.stdout)
                && java.util.Objects.equals(this.stderr, other.stderr)
                && java.util.Objects.equals(this.lastSeq, other.lastSeq)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commandId == null ? 43 : this.commandId.hashCode());
        result = (result * PRIME) + (this.exitCode == null ? 43 : this.exitCode.hashCode());
        result = (result * PRIME) + (this.stdout == null ? 43 : this.stdout.hashCode());
        result = (result * PRIME) + (this.stderr == null ? 43 : this.stderr.hashCode());
        result = (result * PRIME) + (this.lastSeq == null ? 43 : this.lastSeq.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
