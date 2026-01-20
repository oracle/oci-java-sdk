/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Tail log source object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UnifiedAgentTailLogSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "sourceType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UnifiedAgentTailLogSource extends UnifiedAgentLoggingSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Absolute paths for log source files. Wildcards can be used. */
        @com.fasterxml.jackson.annotation.JsonProperty("paths")
        private java.util.List<String> paths;

        /**
         * Absolute paths for log source files. Wildcards can be used.
         *
         * @param paths the value to set
         * @return this builder
         */
        public Builder paths(java.util.List<String> paths) {
            this.paths = paths;
            this.__explicitlySet__.add("paths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parser")
        private UnifiedAgentParser parser;

        public Builder parser(UnifiedAgentParser parser) {
            this.parser = parser;
            this.__explicitlySet__.add("parser");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advancedOptions")
        private UnifiedAgentTailSourceAdvancedOptions advancedOptions;

        public Builder advancedOptions(UnifiedAgentTailSourceAdvancedOptions advancedOptions) {
            this.advancedOptions = advancedOptions;
            this.__explicitlySet__.add("advancedOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UnifiedAgentTailLogSource build() {
            UnifiedAgentTailLogSource model =
                    new UnifiedAgentTailLogSource(
                            this.name, this.paths, this.parser, this.advancedOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UnifiedAgentTailLogSource model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("paths")) {
                this.paths(model.getPaths());
            }
            if (model.wasPropertyExplicitlySet("parser")) {
                this.parser(model.getParser());
            }
            if (model.wasPropertyExplicitlySet("advancedOptions")) {
                this.advancedOptions(model.getAdvancedOptions());
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
    public UnifiedAgentTailLogSource(
            String name,
            java.util.List<String> paths,
            UnifiedAgentParser parser,
            UnifiedAgentTailSourceAdvancedOptions advancedOptions) {
        super(name);
        this.paths = paths;
        this.parser = parser;
        this.advancedOptions = advancedOptions;
    }

    /** Absolute paths for log source files. Wildcards can be used. */
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final java.util.List<String> paths;

    /**
     * Absolute paths for log source files. Wildcards can be used.
     *
     * @return the value
     */
    public java.util.List<String> getPaths() {
        return paths;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parser")
    private final UnifiedAgentParser parser;

    public UnifiedAgentParser getParser() {
        return parser;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advancedOptions")
    private final UnifiedAgentTailSourceAdvancedOptions advancedOptions;

    public UnifiedAgentTailSourceAdvancedOptions getAdvancedOptions() {
        return advancedOptions;
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
        sb.append("UnifiedAgentTailLogSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(", parser=").append(String.valueOf(this.parser));
        sb.append(", advancedOptions=").append(String.valueOf(this.advancedOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UnifiedAgentTailLogSource)) {
            return false;
        }

        UnifiedAgentTailLogSource other = (UnifiedAgentTailLogSource) o;
        return java.util.Objects.equals(this.paths, other.paths)
                && java.util.Objects.equals(this.parser, other.parser)
                && java.util.Objects.equals(this.advancedOptions, other.advancedOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        result = (result * PRIME) + (this.parser == null ? 43 : this.parser.hashCode());
        result =
                (result * PRIME)
                        + (this.advancedOptions == null ? 43 : this.advancedOptions.hashCode());
        return result;
    }
}
