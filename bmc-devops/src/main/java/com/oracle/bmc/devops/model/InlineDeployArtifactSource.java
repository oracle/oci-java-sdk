/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Specifies the inline deployment artifact source details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InlineDeployArtifactSource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "deployArtifactSourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class InlineDeployArtifactSource extends DeployArtifactSource {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * base64 Encoded String
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("base64EncodedContent")
        private byte[] base64EncodedContent;

        /**
         * base64 Encoded String
         * @param base64EncodedContent the value to set
         * @return this builder
         **/
        public Builder base64EncodedContent(byte[] base64EncodedContent) {
            this.base64EncodedContent = base64EncodedContent;
            this.__explicitlySet__.add("base64EncodedContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InlineDeployArtifactSource build() {
            InlineDeployArtifactSource model =
                    new InlineDeployArtifactSource(this.base64EncodedContent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InlineDeployArtifactSource model) {
            if (model.wasPropertyExplicitlySet("base64EncodedContent")) {
                this.base64EncodedContent(model.getBase64EncodedContent());
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
    public InlineDeployArtifactSource(byte[] base64EncodedContent) {
        super();
        this.base64EncodedContent = base64EncodedContent;
    }

    /**
     * base64 Encoded String
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("base64EncodedContent")
    private final byte[] base64EncodedContent;

    /**
     * base64 Encoded String
     * @return the value
     **/
    public byte[] getBase64EncodedContent() {
        return base64EncodedContent;
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
        sb.append("InlineDeployArtifactSource(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", base64EncodedContent=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.base64EncodedContent)
                                : (String.valueOf(this.base64EncodedContent)
                                        + (this.base64EncodedContent != null
                                                ? " (byte["
                                                        + this.base64EncodedContent.length
                                                        + "])"
                                                : ""))));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InlineDeployArtifactSource)) {
            return false;
        }

        InlineDeployArtifactSource other = (InlineDeployArtifactSource) o;
        return java.util.Arrays.equals(this.base64EncodedContent, other.base64EncodedContent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + java.util.Arrays.hashCode(this.base64EncodedContent);
        return result;
    }
}
