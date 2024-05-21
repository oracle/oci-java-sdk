/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Query Properties applicable to OS_COMMAND type of collection method
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OsCommandUpdateQueryProperties.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "collectionMethod"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OsCommandUpdateQueryProperties extends MetricExtensionUpdateQueryProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OS command to execute without arguments
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("command")
        private String command;

        /**
         * OS command to execute without arguments
         * @param command the value to set
         * @return this builder
         **/
        public Builder command(String command) {
            this.command = command;
            this.__explicitlySet__.add("command");
            return this;
        }
        /**
         * Character used to delimit multiple metric values in single line of output
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
        private String delimiter;

        /**
         * Character used to delimit multiple metric values in single line of output
         * @param delimiter the value to set
         * @return this builder
         **/
        public Builder delimiter(String delimiter) {
            this.delimiter = delimiter;
            this.__explicitlySet__.add("delimiter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scriptDetails")
        private ScriptFileDetails scriptDetails;

        public Builder scriptDetails(ScriptFileDetails scriptDetails) {
            this.scriptDetails = scriptDetails;
            this.__explicitlySet__.add("scriptDetails");
            return this;
        }
        /**
         * Arguments required by either command or script
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("arguments")
        private String arguments;

        /**
         * Arguments required by either command or script
         * @param arguments the value to set
         * @return this builder
         **/
        public Builder arguments(String arguments) {
            this.arguments = arguments;
            this.__explicitlySet__.add("arguments");
            return this;
        }
        /**
         * String prefix used to identify metric output of the OS Command
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startsWith")
        private String startsWith;

        /**
         * String prefix used to identify metric output of the OS Command
         * @param startsWith the value to set
         * @return this builder
         **/
        public Builder startsWith(String startsWith) {
            this.startsWith = startsWith;
            this.__explicitlySet__.add("startsWith");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OsCommandUpdateQueryProperties build() {
            OsCommandUpdateQueryProperties model =
                    new OsCommandUpdateQueryProperties(
                            this.command,
                            this.delimiter,
                            this.scriptDetails,
                            this.arguments,
                            this.startsWith);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OsCommandUpdateQueryProperties model) {
            if (model.wasPropertyExplicitlySet("command")) {
                this.command(model.getCommand());
            }
            if (model.wasPropertyExplicitlySet("delimiter")) {
                this.delimiter(model.getDelimiter());
            }
            if (model.wasPropertyExplicitlySet("scriptDetails")) {
                this.scriptDetails(model.getScriptDetails());
            }
            if (model.wasPropertyExplicitlySet("arguments")) {
                this.arguments(model.getArguments());
            }
            if (model.wasPropertyExplicitlySet("startsWith")) {
                this.startsWith(model.getStartsWith());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public OsCommandUpdateQueryProperties(
            String command,
            String delimiter,
            ScriptFileDetails scriptDetails,
            String arguments,
            String startsWith) {
        super();
        this.command = command;
        this.delimiter = delimiter;
        this.scriptDetails = scriptDetails;
        this.arguments = arguments;
        this.startsWith = startsWith;
    }

    /**
     * OS command to execute without arguments
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("command")
    private final String command;

    /**
     * OS command to execute without arguments
     * @return the value
     **/
    public String getCommand() {
        return command;
    }

    /**
     * Character used to delimit multiple metric values in single line of output
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("delimiter")
    private final String delimiter;

    /**
     * Character used to delimit multiple metric values in single line of output
     * @return the value
     **/
    public String getDelimiter() {
        return delimiter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("scriptDetails")
    private final ScriptFileDetails scriptDetails;

    public ScriptFileDetails getScriptDetails() {
        return scriptDetails;
    }

    /**
     * Arguments required by either command or script
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("arguments")
    private final String arguments;

    /**
     * Arguments required by either command or script
     * @return the value
     **/
    public String getArguments() {
        return arguments;
    }

    /**
     * String prefix used to identify metric output of the OS Command
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startsWith")
    private final String startsWith;

    /**
     * String prefix used to identify metric output of the OS Command
     * @return the value
     **/
    public String getStartsWith() {
        return startsWith;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OsCommandUpdateQueryProperties(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", command=").append(String.valueOf(this.command));
        sb.append(", delimiter=").append(String.valueOf(this.delimiter));
        sb.append(", scriptDetails=").append(String.valueOf(this.scriptDetails));
        sb.append(", arguments=").append(String.valueOf(this.arguments));
        sb.append(", startsWith=").append(String.valueOf(this.startsWith));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OsCommandUpdateQueryProperties)) {
            return false;
        }

        OsCommandUpdateQueryProperties other = (OsCommandUpdateQueryProperties) o;
        return java.util.Objects.equals(this.command, other.command)
                && java.util.Objects.equals(this.delimiter, other.delimiter)
                && java.util.Objects.equals(this.scriptDetails, other.scriptDetails)
                && java.util.Objects.equals(this.arguments, other.arguments)
                && java.util.Objects.equals(this.startsWith, other.startsWith)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.command == null ? 43 : this.command.hashCode());
        result = (result * PRIME) + (this.delimiter == null ? 43 : this.delimiter.hashCode());
        result =
                (result * PRIME)
                        + (this.scriptDetails == null ? 43 : this.scriptDetails.hashCode());
        result = (result * PRIME) + (this.arguments == null ? 43 : this.arguments.hashCode());
        result = (result * PRIME) + (this.startsWith == null ? 43 : this.startsWith.hashCode());
        return result;
    }
}
