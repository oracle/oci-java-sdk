/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Details of a single regular expression specification in a Process Set. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ProcessSetSpecificationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProcessSetSpecificationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "label",
        "processCommand",
        "processUser",
        "processLineRegexPattern"
    })
    public ProcessSetSpecificationDetails(
            String label,
            String processCommand,
            String processUser,
            String processLineRegexPattern) {
        super();
        this.label = label;
        this.processCommand = processCommand;
        this.processUser = processUser;
        this.processLineRegexPattern = processLineRegexPattern;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Optional label used to identify a single filter. */
        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        /**
         * Optional label used to identify a single filter.
         *
         * @param label the value to set
         * @return this builder
         */
        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }
        /** String literal used for exact matching on process name. */
        @com.fasterxml.jackson.annotation.JsonProperty("processCommand")
        private String processCommand;

        /**
         * String literal used for exact matching on process name.
         *
         * @param processCommand the value to set
         * @return this builder
         */
        public Builder processCommand(String processCommand) {
            this.processCommand = processCommand;
            this.__explicitlySet__.add("processCommand");
            return this;
        }
        /** String literal used for exact matching on process user. */
        @com.fasterxml.jackson.annotation.JsonProperty("processUser")
        private String processUser;

        /**
         * String literal used for exact matching on process user.
         *
         * @param processUser the value to set
         * @return this builder
         */
        public Builder processUser(String processUser) {
            this.processUser = processUser;
            this.__explicitlySet__.add("processUser");
            return this;
        }
        /** Regex pattern matching on process arguments. */
        @com.fasterxml.jackson.annotation.JsonProperty("processLineRegexPattern")
        private String processLineRegexPattern;

        /**
         * Regex pattern matching on process arguments.
         *
         * @param processLineRegexPattern the value to set
         * @return this builder
         */
        public Builder processLineRegexPattern(String processLineRegexPattern) {
            this.processLineRegexPattern = processLineRegexPattern;
            this.__explicitlySet__.add("processLineRegexPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProcessSetSpecificationDetails build() {
            ProcessSetSpecificationDetails model =
                    new ProcessSetSpecificationDetails(
                            this.label,
                            this.processCommand,
                            this.processUser,
                            this.processLineRegexPattern);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessSetSpecificationDetails model) {
            if (model.wasPropertyExplicitlySet("label")) {
                this.label(model.getLabel());
            }
            if (model.wasPropertyExplicitlySet("processCommand")) {
                this.processCommand(model.getProcessCommand());
            }
            if (model.wasPropertyExplicitlySet("processUser")) {
                this.processUser(model.getProcessUser());
            }
            if (model.wasPropertyExplicitlySet("processLineRegexPattern")) {
                this.processLineRegexPattern(model.getProcessLineRegexPattern());
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

    /** Optional label used to identify a single filter. */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    private final String label;

    /**
     * Optional label used to identify a single filter.
     *
     * @return the value
     */
    public String getLabel() {
        return label;
    }

    /** String literal used for exact matching on process name. */
    @com.fasterxml.jackson.annotation.JsonProperty("processCommand")
    private final String processCommand;

    /**
     * String literal used for exact matching on process name.
     *
     * @return the value
     */
    public String getProcessCommand() {
        return processCommand;
    }

    /** String literal used for exact matching on process user. */
    @com.fasterxml.jackson.annotation.JsonProperty("processUser")
    private final String processUser;

    /**
     * String literal used for exact matching on process user.
     *
     * @return the value
     */
    public String getProcessUser() {
        return processUser;
    }

    /** Regex pattern matching on process arguments. */
    @com.fasterxml.jackson.annotation.JsonProperty("processLineRegexPattern")
    private final String processLineRegexPattern;

    /**
     * Regex pattern matching on process arguments.
     *
     * @return the value
     */
    public String getProcessLineRegexPattern() {
        return processLineRegexPattern;
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
        sb.append("ProcessSetSpecificationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("label=").append(String.valueOf(this.label));
        sb.append(", processCommand=").append(String.valueOf(this.processCommand));
        sb.append(", processUser=").append(String.valueOf(this.processUser));
        sb.append(", processLineRegexPattern=")
                .append(String.valueOf(this.processLineRegexPattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessSetSpecificationDetails)) {
            return false;
        }

        ProcessSetSpecificationDetails other = (ProcessSetSpecificationDetails) o;
        return java.util.Objects.equals(this.label, other.label)
                && java.util.Objects.equals(this.processCommand, other.processCommand)
                && java.util.Objects.equals(this.processUser, other.processUser)
                && java.util.Objects.equals(
                        this.processLineRegexPattern, other.processLineRegexPattern)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.label == null ? 43 : this.label.hashCode());
        result =
                (result * PRIME)
                        + (this.processCommand == null ? 43 : this.processCommand.hashCode());
        result = (result * PRIME) + (this.processUser == null ? 43 : this.processUser.hashCode());
        result =
                (result * PRIME)
                        + (this.processLineRegexPattern == null
                                ? 43
                                : this.processLineRegexPattern.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
