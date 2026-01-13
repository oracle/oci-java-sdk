/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Grounding metadata. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GroundingMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GroundingMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "webSearchQueries",
        "searchEntryPoint",
        "groundingChunks",
        "groundingSupports"
    })
    public GroundingMetadata(
            java.util.List<String> webSearchQueries,
            SearchEntryPoint searchEntryPoint,
            java.util.List<GroundingChunk> groundingChunks,
            java.util.List<GroundingSupport> groundingSupports) {
        super();
        this.webSearchQueries = webSearchQueries;
        this.searchEntryPoint = searchEntryPoint;
        this.groundingChunks = groundingChunks;
        this.groundingSupports = groundingSupports;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The queries to be used for Search suggestions. */
        @com.fasterxml.jackson.annotation.JsonProperty("webSearchQueries")
        private java.util.List<String> webSearchQueries;

        /**
         * The queries to be used for Search suggestions.
         *
         * @param webSearchQueries the value to set
         * @return this builder
         */
        public Builder webSearchQueries(java.util.List<String> webSearchQueries) {
            this.webSearchQueries = webSearchQueries;
            this.__explicitlySet__.add("webSearchQueries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("searchEntryPoint")
        private SearchEntryPoint searchEntryPoint;

        public Builder searchEntryPoint(SearchEntryPoint searchEntryPoint) {
            this.searchEntryPoint = searchEntryPoint;
            this.__explicitlySet__.add("searchEntryPoint");
            return this;
        }
        /** Array of objects containing the web sources. */
        @com.fasterxml.jackson.annotation.JsonProperty("groundingChunks")
        private java.util.List<GroundingChunk> groundingChunks;

        /**
         * Array of objects containing the web sources.
         *
         * @param groundingChunks the value to set
         * @return this builder
         */
        public Builder groundingChunks(java.util.List<GroundingChunk> groundingChunks) {
            this.groundingChunks = groundingChunks;
            this.__explicitlySet__.add("groundingChunks");
            return this;
        }
        /** Array of chunks to connect model response text to the sources in groundingChunks. */
        @com.fasterxml.jackson.annotation.JsonProperty("groundingSupports")
        private java.util.List<GroundingSupport> groundingSupports;

        /**
         * Array of chunks to connect model response text to the sources in groundingChunks.
         *
         * @param groundingSupports the value to set
         * @return this builder
         */
        public Builder groundingSupports(java.util.List<GroundingSupport> groundingSupports) {
            this.groundingSupports = groundingSupports;
            this.__explicitlySet__.add("groundingSupports");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GroundingMetadata build() {
            GroundingMetadata model =
                    new GroundingMetadata(
                            this.webSearchQueries,
                            this.searchEntryPoint,
                            this.groundingChunks,
                            this.groundingSupports);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GroundingMetadata model) {
            if (model.wasPropertyExplicitlySet("webSearchQueries")) {
                this.webSearchQueries(model.getWebSearchQueries());
            }
            if (model.wasPropertyExplicitlySet("searchEntryPoint")) {
                this.searchEntryPoint(model.getSearchEntryPoint());
            }
            if (model.wasPropertyExplicitlySet("groundingChunks")) {
                this.groundingChunks(model.getGroundingChunks());
            }
            if (model.wasPropertyExplicitlySet("groundingSupports")) {
                this.groundingSupports(model.getGroundingSupports());
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

    /** The queries to be used for Search suggestions. */
    @com.fasterxml.jackson.annotation.JsonProperty("webSearchQueries")
    private final java.util.List<String> webSearchQueries;

    /**
     * The queries to be used for Search suggestions.
     *
     * @return the value
     */
    public java.util.List<String> getWebSearchQueries() {
        return webSearchQueries;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("searchEntryPoint")
    private final SearchEntryPoint searchEntryPoint;

    public SearchEntryPoint getSearchEntryPoint() {
        return searchEntryPoint;
    }

    /** Array of objects containing the web sources. */
    @com.fasterxml.jackson.annotation.JsonProperty("groundingChunks")
    private final java.util.List<GroundingChunk> groundingChunks;

    /**
     * Array of objects containing the web sources.
     *
     * @return the value
     */
    public java.util.List<GroundingChunk> getGroundingChunks() {
        return groundingChunks;
    }

    /** Array of chunks to connect model response text to the sources in groundingChunks. */
    @com.fasterxml.jackson.annotation.JsonProperty("groundingSupports")
    private final java.util.List<GroundingSupport> groundingSupports;

    /**
     * Array of chunks to connect model response text to the sources in groundingChunks.
     *
     * @return the value
     */
    public java.util.List<GroundingSupport> getGroundingSupports() {
        return groundingSupports;
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
        sb.append("GroundingMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("webSearchQueries=").append(String.valueOf(this.webSearchQueries));
        sb.append(", searchEntryPoint=").append(String.valueOf(this.searchEntryPoint));
        sb.append(", groundingChunks=").append(String.valueOf(this.groundingChunks));
        sb.append(", groundingSupports=").append(String.valueOf(this.groundingSupports));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroundingMetadata)) {
            return false;
        }

        GroundingMetadata other = (GroundingMetadata) o;
        return java.util.Objects.equals(this.webSearchQueries, other.webSearchQueries)
                && java.util.Objects.equals(this.searchEntryPoint, other.searchEntryPoint)
                && java.util.Objects.equals(this.groundingChunks, other.groundingChunks)
                && java.util.Objects.equals(this.groundingSupports, other.groundingSupports)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.webSearchQueries == null ? 43 : this.webSearchQueries.hashCode());
        result =
                (result * PRIME)
                        + (this.searchEntryPoint == null ? 43 : this.searchEntryPoint.hashCode());
        result =
                (result * PRIME)
                        + (this.groundingChunks == null ? 43 : this.groundingChunks.hashCode());
        result =
                (result * PRIME)
                        + (this.groundingSupports == null ? 43 : this.groundingSupports.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
