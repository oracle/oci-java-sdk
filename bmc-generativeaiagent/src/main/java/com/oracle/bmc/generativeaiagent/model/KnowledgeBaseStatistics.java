/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagent.model;

/**
 * Statistics for Default Knowledge Base. <br>
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
        builder = KnowledgeBaseStatistics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class KnowledgeBaseStatistics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sizeInBytes", "totalIngestedFiles"})
    public KnowledgeBaseStatistics(Long sizeInBytes, Long totalIngestedFiles) {
        super();
        this.sizeInBytes = sizeInBytes;
        this.totalIngestedFiles = totalIngestedFiles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Knowledge Base size in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * Knowledge Base size in bytes.
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /** Total number of ingested files in Knowledge Base. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalIngestedFiles")
        private Long totalIngestedFiles;

        /**
         * Total number of ingested files in Knowledge Base.
         *
         * @param totalIngestedFiles the value to set
         * @return this builder
         */
        public Builder totalIngestedFiles(Long totalIngestedFiles) {
            this.totalIngestedFiles = totalIngestedFiles;
            this.__explicitlySet__.add("totalIngestedFiles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public KnowledgeBaseStatistics build() {
            KnowledgeBaseStatistics model =
                    new KnowledgeBaseStatistics(this.sizeInBytes, this.totalIngestedFiles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(KnowledgeBaseStatistics model) {
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("totalIngestedFiles")) {
                this.totalIngestedFiles(model.getTotalIngestedFiles());
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

    /** Knowledge Base size in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * Knowledge Base size in bytes.
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /** Total number of ingested files in Knowledge Base. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalIngestedFiles")
    private final Long totalIngestedFiles;

    /**
     * Total number of ingested files in Knowledge Base.
     *
     * @return the value
     */
    public Long getTotalIngestedFiles() {
        return totalIngestedFiles;
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
        sb.append("KnowledgeBaseStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", totalIngestedFiles=").append(String.valueOf(this.totalIngestedFiles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof KnowledgeBaseStatistics)) {
            return false;
        }

        KnowledgeBaseStatistics other = (KnowledgeBaseStatistics) o;
        return java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.totalIngestedFiles, other.totalIngestedFiles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.totalIngestedFiles == null
                                ? 43
                                : this.totalIngestedFiles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
