/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Event emitted when command execution finishes. <br>
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
        builder = SandboxCommandFinishedEvent.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "event")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxCommandFinishedEvent extends SandboxCommandEvent {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("seq")
        private Long seq;

        public Builder seq(Long seq) {
            this.seq = seq;
            this.__explicitlySet__.add("seq");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("commandId")
        private String commandId;

        public Builder commandId(String commandId) {
            this.commandId = commandId;
            this.__explicitlySet__.add("commandId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private String data;

        public Builder data(String data) {
            this.data = data;
            this.__explicitlySet__.add("data");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxCommandFinishedEvent build() {
            SandboxCommandFinishedEvent model =
                    new SandboxCommandFinishedEvent(
                            this.seq, this.timestamp, this.commandId, this.data, this.exitCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxCommandFinishedEvent model) {
            if (model.wasPropertyExplicitlySet("seq")) {
                this.seq(model.getSeq());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("commandId")) {
                this.commandId(model.getCommandId());
            }
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("exitCode")) {
                this.exitCode(model.getExitCode());
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
    public SandboxCommandFinishedEvent(
            Long seq, java.util.Date timestamp, String commandId, String data, Integer exitCode) {
        super(seq, timestamp, commandId, data);
        this.exitCode = exitCode;
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
        sb.append("SandboxCommandFinishedEvent(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", exitCode=").append(String.valueOf(this.exitCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxCommandFinishedEvent)) {
            return false;
        }

        SandboxCommandFinishedEvent other = (SandboxCommandFinishedEvent) o;
        return java.util.Objects.equals(this.exitCode, other.exitCode) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.exitCode == null ? 43 : this.exitCode.hashCode());
        return result;
    }
}
