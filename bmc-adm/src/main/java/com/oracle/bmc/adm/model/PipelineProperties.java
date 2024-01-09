/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Pipeline properties which result from the run of the verify stage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"pipelineIdentifier", "pipelineUrl"})
    public PipelineProperties(String pipelineIdentifier, String pipelineUrl) {
        super();
        this.pipelineIdentifier = pipelineIdentifier;
        this.pipelineUrl = pipelineUrl;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the pipeline or action created in the Verify stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineIdentifier")
        private String pipelineIdentifier;

        /**
         * Unique identifier for the pipeline or action created in the Verify stage.
         *
         * @param pipelineIdentifier the value to set
         * @return this builder
         */
        public Builder pipelineIdentifier(String pipelineIdentifier) {
            this.pipelineIdentifier = pipelineIdentifier;
            this.__explicitlySet__.add("pipelineIdentifier");
            return this;
        }
        /** The web link to the pipeline from the Verify stage. */
        @com.fasterxml.jackson.annotation.JsonProperty("pipelineUrl")
        private String pipelineUrl;

        /**
         * The web link to the pipeline from the Verify stage.
         *
         * @param pipelineUrl the value to set
         * @return this builder
         */
        public Builder pipelineUrl(String pipelineUrl) {
            this.pipelineUrl = pipelineUrl;
            this.__explicitlySet__.add("pipelineUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineProperties build() {
            PipelineProperties model =
                    new PipelineProperties(this.pipelineIdentifier, this.pipelineUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineProperties model) {
            if (model.wasPropertyExplicitlySet("pipelineIdentifier")) {
                this.pipelineIdentifier(model.getPipelineIdentifier());
            }
            if (model.wasPropertyExplicitlySet("pipelineUrl")) {
                this.pipelineUrl(model.getPipelineUrl());
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

    /** Unique identifier for the pipeline or action created in the Verify stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineIdentifier")
    private final String pipelineIdentifier;

    /**
     * Unique identifier for the pipeline or action created in the Verify stage.
     *
     * @return the value
     */
    public String getPipelineIdentifier() {
        return pipelineIdentifier;
    }

    /** The web link to the pipeline from the Verify stage. */
    @com.fasterxml.jackson.annotation.JsonProperty("pipelineUrl")
    private final String pipelineUrl;

    /**
     * The web link to the pipeline from the Verify stage.
     *
     * @return the value
     */
    public String getPipelineUrl() {
        return pipelineUrl;
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
        sb.append("PipelineProperties(");
        sb.append("super=").append(super.toString());
        sb.append("pipelineIdentifier=").append(String.valueOf(this.pipelineIdentifier));
        sb.append(", pipelineUrl=").append(String.valueOf(this.pipelineUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineProperties)) {
            return false;
        }

        PipelineProperties other = (PipelineProperties) o;
        return java.util.Objects.equals(this.pipelineIdentifier, other.pipelineIdentifier)
                && java.util.Objects.equals(this.pipelineUrl, other.pipelineUrl)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.pipelineIdentifier == null
                                ? 43
                                : this.pipelineIdentifier.hashCode());
        result = (result * PRIME) + (this.pipelineUrl == null ? 43 : this.pipelineUrl.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
