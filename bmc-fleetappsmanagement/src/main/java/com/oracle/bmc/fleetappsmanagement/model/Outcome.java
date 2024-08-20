/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Execution Outcome <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Outcome.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Outcome extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"output", "error", "exitCode"})
    public Outcome(String output, String error, String exitCode) {
        super();
        this.output = output;
        this.error = error;
        this.exitCode = exitCode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A shortened version of Execution Output */
        @com.fasterxml.jackson.annotation.JsonProperty("output")
        private String output;

        /**
         * A shortened version of Execution Output
         *
         * @param output the value to set
         * @return this builder
         */
        public Builder output(String output) {
            this.output = output;
            this.__explicitlySet__.add("output");
            return this;
        }
        /** Errors if any associated with the execution */
        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private String error;

        /**
         * Errors if any associated with the execution
         *
         * @param error the value to set
         * @return this builder
         */
        public Builder error(String error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }
        /** Exit Code */
        @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
        private String exitCode;

        /**
         * Exit Code
         *
         * @param exitCode the value to set
         * @return this builder
         */
        public Builder exitCode(String exitCode) {
            this.exitCode = exitCode;
            this.__explicitlySet__.add("exitCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Outcome build() {
            Outcome model = new Outcome(this.output, this.error, this.exitCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Outcome model) {
            if (model.wasPropertyExplicitlySet("output")) {
                this.output(model.getOutput());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
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

    /** A shortened version of Execution Output */
    @com.fasterxml.jackson.annotation.JsonProperty("output")
    private final String output;

    /**
     * A shortened version of Execution Output
     *
     * @return the value
     */
    public String getOutput() {
        return output;
    }

    /** Errors if any associated with the execution */
    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final String error;

    /**
     * Errors if any associated with the execution
     *
     * @return the value
     */
    public String getError() {
        return error;
    }

    /** Exit Code */
    @com.fasterxml.jackson.annotation.JsonProperty("exitCode")
    private final String exitCode;

    /**
     * Exit Code
     *
     * @return the value
     */
    public String getExitCode() {
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
        sb.append("Outcome(");
        sb.append("super=").append(super.toString());
        sb.append("output=").append(String.valueOf(this.output));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(", exitCode=").append(String.valueOf(this.exitCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Outcome)) {
            return false;
        }

        Outcome other = (Outcome) o;
        return java.util.Objects.equals(this.output, other.output)
                && java.util.Objects.equals(this.error, other.error)
                && java.util.Objects.equals(this.exitCode, other.exitCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.output == null ? 43 : this.output.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + (this.exitCode == null ? 43 : this.exitCode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
