/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Configuration that allows this OpenSearch cluster to trust a remote cluster for reindexing. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoteReindexTrustConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoteReindexTrustConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"remoteSources"})
    public RemoteReindexTrustConfig(java.util.List<RemoteReindexSourceDetails> remoteSources) {
        super();
        this.remoteSources = remoteSources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Remote cluster sources to trust for reindexing. */
        @com.fasterxml.jackson.annotation.JsonProperty("remoteSources")
        private java.util.List<RemoteReindexSourceDetails> remoteSources;

        /**
         * Remote cluster sources to trust for reindexing.
         *
         * @param remoteSources the value to set
         * @return this builder
         */
        public Builder remoteSources(java.util.List<RemoteReindexSourceDetails> remoteSources) {
            this.remoteSources = remoteSources;
            this.__explicitlySet__.add("remoteSources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoteReindexTrustConfig build() {
            RemoteReindexTrustConfig model = new RemoteReindexTrustConfig(this.remoteSources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoteReindexTrustConfig model) {
            if (model.wasPropertyExplicitlySet("remoteSources")) {
                this.remoteSources(model.getRemoteSources());
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

    /** Remote cluster sources to trust for reindexing. */
    @com.fasterxml.jackson.annotation.JsonProperty("remoteSources")
    private final java.util.List<RemoteReindexSourceDetails> remoteSources;

    /**
     * Remote cluster sources to trust for reindexing.
     *
     * @return the value
     */
    public java.util.List<RemoteReindexSourceDetails> getRemoteSources() {
        return remoteSources;
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
        sb.append("RemoteReindexTrustConfig(");
        sb.append("super=").append(super.toString());
        sb.append("remoteSources=").append(String.valueOf(this.remoteSources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoteReindexTrustConfig)) {
            return false;
        }

        RemoteReindexTrustConfig other = (RemoteReindexTrustConfig) o;
        return java.util.Objects.equals(this.remoteSources, other.remoteSources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.remoteSources == null ? 43 : this.remoteSources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
