/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsParserFilter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsParserFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsParserFilter {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "parser",
        "agentVersion",
        "isInUse",
        "operatingSystem",
        "parserId",
        "version"
    })
    public LogAnalyticsParserFilter(
            String id,
            LogAnalyticsParser parser,
            String agentVersion,
            Long isInUse,
            String operatingSystem,
            Long parserId,
            String version) {
        super();
        this.id = id;
        this.parser = parser;
        this.agentVersion = agentVersion;
        this.isInUse = isInUse;
        this.operatingSystem = operatingSystem;
        this.parserId = parserId;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The parser filter unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The parser filter unique identifier.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parser")
        private LogAnalyticsParser parser;

        public Builder parser(LogAnalyticsParser parser) {
            this.parser = parser;
            this.__explicitlySet__.add("parser");
            return this;
        }
        /**
         * The agent version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * The agent version.
         * @param agentVersion the value to set
         * @return this builder
         **/
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }
        /**
         * A flag idicating whether or not hte filter is currently being used.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
        private Long isInUse;

        /**
         * A flag idicating whether or not hte filter is currently being used.
         *
         * @param isInUse the value to set
         * @return this builder
         **/
        public Builder isInUse(Long isInUse) {
            this.isInUse = isInUse;
            this.__explicitlySet__.add("isInUse");
            return this;
        }
        /**
         * The operating system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
        private String operatingSystem;

        /**
         * The operating system.
         * @param operatingSystem the value to set
         * @return this builder
         **/
        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            this.__explicitlySet__.add("operatingSystem");
            return this;
        }
        /**
         * The parser unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parserId")
        private Long parserId;

        /**
         * The parser unique identifier.
         * @param parserId the value to set
         * @return this builder
         **/
        public Builder parserId(Long parserId) {
            this.parserId = parserId;
            this.__explicitlySet__.add("parserId");
            return this;
        }
        /**
         * The version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsParserFilter build() {
            LogAnalyticsParserFilter __instance__ =
                    new LogAnalyticsParserFilter(
                            id, parser, agentVersion, isInUse, operatingSystem, parserId, version);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsParserFilter o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .parser(o.getParser())
                            .agentVersion(o.getAgentVersion())
                            .isInUse(o.getIsInUse())
                            .operatingSystem(o.getOperatingSystem())
                            .parserId(o.getParserId())
                            .version(o.getVersion());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The parser filter unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The parser filter unique identifier.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parser")
    private final LogAnalyticsParser parser;

    public LogAnalyticsParser getParser() {
        return parser;
    }

    /**
     * The agent version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * The agent version.
     * @return the value
     **/
    public String getAgentVersion() {
        return agentVersion;
    }

    /**
     * A flag idicating whether or not hte filter is currently being used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
    private final Long isInUse;

    /**
     * A flag idicating whether or not hte filter is currently being used.
     *
     * @return the value
     **/
    public Long getIsInUse() {
        return isInUse;
    }

    /**
     * The operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operatingSystem")
    private final String operatingSystem;

    /**
     * The operating system.
     * @return the value
     **/
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * The parser unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parserId")
    private final Long parserId;

    /**
     * The parser unique identifier.
     * @return the value
     **/
    public Long getParserId() {
        return parserId;
    }

    /**
     * The version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version.
     * @return the value
     **/
    public String getVersion() {
        return version;
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
        sb.append("LogAnalyticsParserFilter(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", parser=").append(String.valueOf(this.parser));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", isInUse=").append(String.valueOf(this.isInUse));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", parserId=").append(String.valueOf(this.parserId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsParserFilter)) {
            return false;
        }

        LogAnalyticsParserFilter other = (LogAnalyticsParserFilter) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.parser, other.parser)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(this.isInUse, other.isInUse)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(this.parserId, other.parserId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.parser == null ? 43 : this.parser.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result = (result * PRIME) + (this.isInUse == null ? 43 : this.isInUse.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result = (result * PRIME) + (this.parserId == null ? 43 : this.parserId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
