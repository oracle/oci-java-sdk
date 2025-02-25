/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Returns a parser agnostic breakdown of a query string for client query string introspection.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParseQueryOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParseQueryOutput extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayQueryString",
        "internalQueryString",
        "columns",
        "responseTimeInMs",
        "timeFilter",
        "commands"
    })
    public ParseQueryOutput(
            String displayQueryString,
            String internalQueryString,
            java.util.List<AbstractColumn> columns,
            Long responseTimeInMs,
            TimeRange timeFilter,
            java.util.List<AbstractCommandDescriptor> commands) {
        super();
        this.displayQueryString = displayQueryString;
        this.internalQueryString = internalQueryString;
        this.columns = columns;
        this.responseTimeInMs = responseTimeInMs;
        this.timeFilter = timeFilter;
        this.commands = commands;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Display string formatted by query builder of user specified query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
        private String displayQueryString;

        /**
         * Display string formatted by query builder of user specified query string.
         *
         * @param displayQueryString the value to set
         * @return this builder
         **/
        public Builder displayQueryString(String displayQueryString) {
            this.displayQueryString = displayQueryString;
            this.__explicitlySet__.add("displayQueryString");
            return this;
        }
        /**
         * Internal string formatted by query builder of user specified query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
        private String internalQueryString;

        /**
         * Internal string formatted by query builder of user specified query string.
         *
         * @param internalQueryString the value to set
         * @return this builder
         **/
        public Builder internalQueryString(String internalQueryString) {
            this.internalQueryString = internalQueryString;
            this.__explicitlySet__.add("internalQueryString");
            return this;
        }
        /**
         * List of columns returned by the specified query string as result output.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columns")
        private java.util.List<AbstractColumn> columns;

        /**
         * List of columns returned by the specified query string as result output.
         *
         * @param columns the value to set
         * @return this builder
         **/
        public Builder columns(java.util.List<AbstractColumn> columns) {
            this.columns = columns;
            this.__explicitlySet__.add("columns");
            return this;
        }
        /**
         * Operation response time.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
        private Long responseTimeInMs;

        /**
         * Operation response time.
         *
         * @param responseTimeInMs the value to set
         * @return this builder
         **/
        public Builder responseTimeInMs(Long responseTimeInMs) {
            this.responseTimeInMs = responseTimeInMs;
            this.__explicitlySet__.add("responseTimeInMs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
        private TimeRange timeFilter;

        public Builder timeFilter(TimeRange timeFilter) {
            this.timeFilter = timeFilter;
            this.__explicitlySet__.add("timeFilter");
            return this;
        }
        /**
         * List of querylanguage command descriptors, describing the specfied query string.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("commands")
        private java.util.List<AbstractCommandDescriptor> commands;

        /**
         * List of querylanguage command descriptors, describing the specfied query string.
         *
         * @param commands the value to set
         * @return this builder
         **/
        public Builder commands(java.util.List<AbstractCommandDescriptor> commands) {
            this.commands = commands;
            this.__explicitlySet__.add("commands");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParseQueryOutput build() {
            ParseQueryOutput model =
                    new ParseQueryOutput(
                            this.displayQueryString,
                            this.internalQueryString,
                            this.columns,
                            this.responseTimeInMs,
                            this.timeFilter,
                            this.commands);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParseQueryOutput model) {
            if (model.wasPropertyExplicitlySet("displayQueryString")) {
                this.displayQueryString(model.getDisplayQueryString());
            }
            if (model.wasPropertyExplicitlySet("internalQueryString")) {
                this.internalQueryString(model.getInternalQueryString());
            }
            if (model.wasPropertyExplicitlySet("columns")) {
                this.columns(model.getColumns());
            }
            if (model.wasPropertyExplicitlySet("responseTimeInMs")) {
                this.responseTimeInMs(model.getResponseTimeInMs());
            }
            if (model.wasPropertyExplicitlySet("timeFilter")) {
                this.timeFilter(model.getTimeFilter());
            }
            if (model.wasPropertyExplicitlySet("commands")) {
                this.commands(model.getCommands());
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

    /**
     * Display string formatted by query builder of user specified query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayQueryString")
    private final String displayQueryString;

    /**
     * Display string formatted by query builder of user specified query string.
     *
     * @return the value
     **/
    public String getDisplayQueryString() {
        return displayQueryString;
    }

    /**
     * Internal string formatted by query builder of user specified query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalQueryString")
    private final String internalQueryString;

    /**
     * Internal string formatted by query builder of user specified query string.
     *
     * @return the value
     **/
    public String getInternalQueryString() {
        return internalQueryString;
    }

    /**
     * List of columns returned by the specified query string as result output.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columns")
    private final java.util.List<AbstractColumn> columns;

    /**
     * List of columns returned by the specified query string as result output.
     *
     * @return the value
     **/
    public java.util.List<AbstractColumn> getColumns() {
        return columns;
    }

    /**
     * Operation response time.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("responseTimeInMs")
    private final Long responseTimeInMs;

    /**
     * Operation response time.
     *
     * @return the value
     **/
    public Long getResponseTimeInMs() {
        return responseTimeInMs;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("timeFilter")
    private final TimeRange timeFilter;

    public TimeRange getTimeFilter() {
        return timeFilter;
    }

    /**
     * List of querylanguage command descriptors, describing the specfied query string.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("commands")
    private final java.util.List<AbstractCommandDescriptor> commands;

    /**
     * List of querylanguage command descriptors, describing the specfied query string.
     *
     * @return the value
     **/
    public java.util.List<AbstractCommandDescriptor> getCommands() {
        return commands;
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
        sb.append("ParseQueryOutput(");
        sb.append("super=").append(super.toString());
        sb.append("displayQueryString=").append(String.valueOf(this.displayQueryString));
        sb.append(", internalQueryString=").append(String.valueOf(this.internalQueryString));
        sb.append(", columns=").append(String.valueOf(this.columns));
        sb.append(", responseTimeInMs=").append(String.valueOf(this.responseTimeInMs));
        sb.append(", timeFilter=").append(String.valueOf(this.timeFilter));
        sb.append(", commands=").append(String.valueOf(this.commands));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParseQueryOutput)) {
            return false;
        }

        ParseQueryOutput other = (ParseQueryOutput) o;
        return java.util.Objects.equals(this.displayQueryString, other.displayQueryString)
                && java.util.Objects.equals(this.internalQueryString, other.internalQueryString)
                && java.util.Objects.equals(this.columns, other.columns)
                && java.util.Objects.equals(this.responseTimeInMs, other.responseTimeInMs)
                && java.util.Objects.equals(this.timeFilter, other.timeFilter)
                && java.util.Objects.equals(this.commands, other.commands)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.displayQueryString == null
                                ? 43
                                : this.displayQueryString.hashCode());
        result =
                (result * PRIME)
                        + (this.internalQueryString == null
                                ? 43
                                : this.internalQueryString.hashCode());
        result = (result * PRIME) + (this.columns == null ? 43 : this.columns.hashCode());
        result =
                (result * PRIME)
                        + (this.responseTimeInMs == null ? 43 : this.responseTimeInMs.hashCode());
        result = (result * PRIME) + (this.timeFilter == null ? 43 : this.timeFilter.hashCode());
        result = (result * PRIME) + (this.commands == null ? 43 : this.commands.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
