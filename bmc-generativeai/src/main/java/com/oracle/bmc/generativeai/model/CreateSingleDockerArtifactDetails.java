/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * <br>
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
        builder = CreateSingleDockerArtifactDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "artifactType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSingleDockerArtifactDetails extends CreateArtifactDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isVulnerabilityScanRequired")
        private Boolean isVulnerabilityScanRequired;

        public Builder isVulnerabilityScanRequired(Boolean isVulnerabilityScanRequired) {
            this.isVulnerabilityScanRequired = isVulnerabilityScanRequired;
            this.__explicitlySet__.add("isVulnerabilityScanRequired");
            return this;
        }
        /** image url. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerUri")
        private String containerUri;

        /**
         * image url.
         *
         * @param containerUri the value to set
         * @return this builder
         */
        public Builder containerUri(String containerUri) {
            this.containerUri = containerUri;
            this.__explicitlySet__.add("containerUri");
            return this;
        }
        /** image tag. */
        @com.fasterxml.jackson.annotation.JsonProperty("tag")
        private String tag;

        /**
         * image tag.
         *
         * @param tag the value to set
         * @return this builder
         */
        public Builder tag(String tag) {
            this.tag = tag;
            this.__explicitlySet__.add("tag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSingleDockerArtifactDetails build() {
            CreateSingleDockerArtifactDetails model =
                    new CreateSingleDockerArtifactDetails(
                            this.isVulnerabilityScanRequired, this.containerUri, this.tag);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSingleDockerArtifactDetails model) {
            if (model.wasPropertyExplicitlySet("isVulnerabilityScanRequired")) {
                this.isVulnerabilityScanRequired(model.getIsVulnerabilityScanRequired());
            }
            if (model.wasPropertyExplicitlySet("containerUri")) {
                this.containerUri(model.getContainerUri());
            }
            if (model.wasPropertyExplicitlySet("tag")) {
                this.tag(model.getTag());
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
    public CreateSingleDockerArtifactDetails(
            Boolean isVulnerabilityScanRequired, String containerUri, String tag) {
        super(isVulnerabilityScanRequired);
        this.containerUri = containerUri;
        this.tag = tag;
    }

    /** image url. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerUri")
    private final String containerUri;

    /**
     * image url.
     *
     * @return the value
     */
    public String getContainerUri() {
        return containerUri;
    }

    /** image tag. */
    @com.fasterxml.jackson.annotation.JsonProperty("tag")
    private final String tag;

    /**
     * image tag.
     *
     * @return the value
     */
    public String getTag() {
        return tag;
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
        sb.append("CreateSingleDockerArtifactDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", containerUri=").append(String.valueOf(this.containerUri));
        sb.append(", tag=").append(String.valueOf(this.tag));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSingleDockerArtifactDetails)) {
            return false;
        }

        CreateSingleDockerArtifactDetails other = (CreateSingleDockerArtifactDetails) o;
        return java.util.Objects.equals(this.containerUri, other.containerUri)
                && java.util.Objects.equals(this.tag, other.tag)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.containerUri == null ? 43 : this.containerUri.hashCode());
        result = (result * PRIME) + (this.tag == null ? 43 : this.tag.hashCode());
        return result;
    }
}
