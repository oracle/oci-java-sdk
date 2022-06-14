/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsPatternFilter
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
    builder = LogAnalyticsPatternFilter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LogAnalyticsPatternFilter {
    @Deprecated
    @java.beans.ConstructorProperties({
        "pattern",
        "agentVersion",
        "isInUse",
        "operatingSystem",
        "patternId",
        "sourceId",
        "version",
        "source"
    })
    public LogAnalyticsPatternFilter(
            LogAnalyticsSourcePattern pattern,
            String agentVersion,
            Boolean isInUse,
            String operatingSystem,
            Long patternId,
            Long sourceId,
            String version,
            LogAnalyticsSource source) {
        super();
        this.pattern = pattern;
        this.agentVersion = agentVersion;
        this.isInUse = isInUse;
        this.operatingSystem = operatingSystem;
        this.patternId = patternId;
        this.sourceId = sourceId;
        this.version = version;
        this.source = source;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private LogAnalyticsSourcePattern pattern;

        public Builder pattern(LogAnalyticsSourcePattern pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
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
         * A flag indicating whether or not the pattern filter is currently
         * in use.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
        private Boolean isInUse;

        /**
         * A flag indicating whether or not the pattern filter is currently
         * in use.
         *
         * @param isInUse the value to set
         * @return this builder
         **/
        public Builder isInUse(Boolean isInUse) {
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
         * The pattern unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patternId")
        private Long patternId;

        /**
         * The pattern unique identifier.
         * @param patternId the value to set
         * @return this builder
         **/
        public Builder patternId(Long patternId) {
            this.patternId = patternId;
            this.__explicitlySet__.add("patternId");
            return this;
        }
        /**
         * The source unique identifier.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private Long sourceId;

        /**
         * The source unique identifier.
         * @param sourceId the value to set
         * @return this builder
         **/
        public Builder sourceId(Long sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The pattern filter version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The pattern filter version.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private LogAnalyticsSource source;

        public Builder source(LogAnalyticsSource source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsPatternFilter build() {
            LogAnalyticsPatternFilter __instance__ =
                    new LogAnalyticsPatternFilter(
                            pattern,
                            agentVersion,
                            isInUse,
                            operatingSystem,
                            patternId,
                            sourceId,
                            version,
                            source);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsPatternFilter o) {
            Builder copiedBuilder =
                    pattern(o.getPattern())
                            .agentVersion(o.getAgentVersion())
                            .isInUse(o.getIsInUse())
                            .operatingSystem(o.getOperatingSystem())
                            .patternId(o.getPatternId())
                            .sourceId(o.getSourceId())
                            .version(o.getVersion())
                            .source(o.getSource());

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

    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final LogAnalyticsSourcePattern pattern;

    public LogAnalyticsSourcePattern getPattern() {
        return pattern;
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
     * A flag indicating whether or not the pattern filter is currently
     * in use.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInUse")
    private final Boolean isInUse;

    /**
     * A flag indicating whether or not the pattern filter is currently
     * in use.
     *
     * @return the value
     **/
    public Boolean getIsInUse() {
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
     * The pattern unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patternId")
    private final Long patternId;

    /**
     * The pattern unique identifier.
     * @return the value
     **/
    public Long getPatternId() {
        return patternId;
    }

    /**
     * The source unique identifier.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final Long sourceId;

    /**
     * The source unique identifier.
     * @return the value
     **/
    public Long getSourceId() {
        return sourceId;
    }

    /**
     * The pattern filter version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The pattern filter version.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final LogAnalyticsSource source;

    public LogAnalyticsSource getSource() {
        return source;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LogAnalyticsPatternFilter(");
        sb.append("pattern=").append(String.valueOf(this.pattern));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", isInUse=").append(String.valueOf(this.isInUse));
        sb.append(", operatingSystem=").append(String.valueOf(this.operatingSystem));
        sb.append(", patternId=").append(String.valueOf(this.patternId));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LogAnalyticsPatternFilter)) {
            return false;
        }

        LogAnalyticsPatternFilter other = (LogAnalyticsPatternFilter) o;
        return java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(this.isInUse, other.isInUse)
                && java.util.Objects.equals(this.operatingSystem, other.operatingSystem)
                && java.util.Objects.equals(this.patternId, other.patternId)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result = (result * PRIME) + (this.isInUse == null ? 43 : this.isInUse.hashCode());
        result =
                (result * PRIME)
                        + (this.operatingSystem == null ? 43 : this.operatingSystem.hashCode());
        result = (result * PRIME) + (this.patternId == null ? 43 : this.patternId.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
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
