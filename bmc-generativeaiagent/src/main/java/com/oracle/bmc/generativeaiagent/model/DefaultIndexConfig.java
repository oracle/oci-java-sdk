/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * The default index is service managed vector store on behalf of the customer. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DefaultIndexConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "indexConfigType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DefaultIndexConfig extends IndexConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether to enable Hybrid search in service managed OpenSearch. */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableHybridSearch")
        private Boolean shouldEnableHybridSearch;

        /**
         * Whether to enable Hybrid search in service managed OpenSearch.
         *
         * @param shouldEnableHybridSearch the value to set
         * @return this builder
         */
        public Builder shouldEnableHybridSearch(Boolean shouldEnableHybridSearch) {
            this.shouldEnableHybridSearch = shouldEnableHybridSearch;
            this.__explicitlySet__.add("shouldEnableHybridSearch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultIndexConfig build() {
            DefaultIndexConfig model = new DefaultIndexConfig(this.shouldEnableHybridSearch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultIndexConfig model) {
            if (model.wasPropertyExplicitlySet("shouldEnableHybridSearch")) {
                this.shouldEnableHybridSearch(model.getShouldEnableHybridSearch());
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
    public DefaultIndexConfig(Boolean shouldEnableHybridSearch) {
        super();
        this.shouldEnableHybridSearch = shouldEnableHybridSearch;
    }

    /** Whether to enable Hybrid search in service managed OpenSearch. */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldEnableHybridSearch")
    private final Boolean shouldEnableHybridSearch;

    /**
     * Whether to enable Hybrid search in service managed OpenSearch.
     *
     * @return the value
     */
    public Boolean getShouldEnableHybridSearch() {
        return shouldEnableHybridSearch;
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
        sb.append("DefaultIndexConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", shouldEnableHybridSearch=")
                .append(String.valueOf(this.shouldEnableHybridSearch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultIndexConfig)) {
            return false;
        }

        DefaultIndexConfig other = (DefaultIndexConfig) o;
        return java.util.Objects.equals(
                        this.shouldEnableHybridSearch, other.shouldEnableHybridSearch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.shouldEnableHybridSearch == null
                                ? 43
                                : this.shouldEnableHybridSearch.hashCode());
        return result;
    }
}
