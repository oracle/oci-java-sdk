/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the configuration of the path analysis result.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PathAnalysisWorkRequestResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "resultType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PathAnalysisWorkRequestResult extends WorkRequestResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * List of various paths from source node to destination node
         * for a given {@code PathAnalysisQuery}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("paths")
        private java.util.List<Path> paths;

        /**
         * List of various paths from source node to destination node
         * for a given {@code PathAnalysisQuery}.
         *
         * @param paths the value to set
         * @return this builder
         **/
        public Builder paths(java.util.List<Path> paths) {
            this.paths = paths;
            this.__explicitlySet__.add("paths");
            return this;
        }
        /**
         * Time the {@code PathAnalysisResult} was generated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Time the {@code PathAnalysisResult} was generated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathAnalysisWorkRequestResult build() {
            PathAnalysisWorkRequestResult model =
                    new PathAnalysisWorkRequestResult(this.paths, this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathAnalysisWorkRequestResult model) {
            if (model.wasPropertyExplicitlySet("paths")) {
                this.paths(model.getPaths());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
    public PathAnalysisWorkRequestResult(java.util.List<Path> paths, java.util.Date timeCreated) {
        super();
        this.paths = paths;
        this.timeCreated = timeCreated;
    }

    /**
     * List of various paths from source node to destination node
     * for a given {@code PathAnalysisQuery}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("paths")
    private final java.util.List<Path> paths;

    /**
     * List of various paths from source node to destination node
     * for a given {@code PathAnalysisQuery}.
     *
     * @return the value
     **/
    public java.util.List<Path> getPaths() {
        return paths;
    }

    /**
     * Time the {@code PathAnalysisResult} was generated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Time the {@code PathAnalysisResult} was generated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("PathAnalysisWorkRequestResult(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", paths=").append(String.valueOf(this.paths));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PathAnalysisWorkRequestResult)) {
            return false;
        }

        PathAnalysisWorkRequestResult other = (PathAnalysisWorkRequestResult) o;
        return java.util.Objects.equals(this.paths, other.paths)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.paths == null ? 43 : this.paths.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        return result;
    }
}
