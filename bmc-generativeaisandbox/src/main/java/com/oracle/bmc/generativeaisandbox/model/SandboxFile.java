/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Sandbox file resource representation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SandboxFile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxFile extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sandboxId", "filePath", "contentSha256"})
    public SandboxFile(String sandboxId, String filePath, String contentSha256) {
        super();
        this.sandboxId = sandboxId;
        this.filePath = filePath;
        this.contentSha256 = contentSha256;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Sandbox identifier that this file belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("sandboxId")
        private String sandboxId;

        /**
         * Sandbox identifier that this file belongs to.
         *
         * @param sandboxId the value to set
         * @return this builder
         */
        public Builder sandboxId(String sandboxId) {
            this.sandboxId = sandboxId;
            this.__explicitlySet__.add("sandboxId");
            return this;
        }
        /** Absolute path of the file in the sandbox, under /workspace. */
        @com.fasterxml.jackson.annotation.JsonProperty("filePath")
        private String filePath;

        /**
         * Absolute path of the file in the sandbox, under /workspace.
         *
         * @param filePath the value to set
         * @return this builder
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            this.__explicitlySet__.add("filePath");
            return this;
        }
        /** Base64-encoded SHA-256 checksum of the file content when available. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentSha256")
        private String contentSha256;

        /**
         * Base64-encoded SHA-256 checksum of the file content when available.
         *
         * @param contentSha256 the value to set
         * @return this builder
         */
        public Builder contentSha256(String contentSha256) {
            this.contentSha256 = contentSha256;
            this.__explicitlySet__.add("contentSha256");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxFile build() {
            SandboxFile model = new SandboxFile(this.sandboxId, this.filePath, this.contentSha256);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxFile model) {
            if (model.wasPropertyExplicitlySet("sandboxId")) {
                this.sandboxId(model.getSandboxId());
            }
            if (model.wasPropertyExplicitlySet("filePath")) {
                this.filePath(model.getFilePath());
            }
            if (model.wasPropertyExplicitlySet("contentSha256")) {
                this.contentSha256(model.getContentSha256());
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

    /** Sandbox identifier that this file belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("sandboxId")
    private final String sandboxId;

    /**
     * Sandbox identifier that this file belongs to.
     *
     * @return the value
     */
    public String getSandboxId() {
        return sandboxId;
    }

    /** Absolute path of the file in the sandbox, under /workspace. */
    @com.fasterxml.jackson.annotation.JsonProperty("filePath")
    private final String filePath;

    /**
     * Absolute path of the file in the sandbox, under /workspace.
     *
     * @return the value
     */
    public String getFilePath() {
        return filePath;
    }

    /** Base64-encoded SHA-256 checksum of the file content when available. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentSha256")
    private final String contentSha256;

    /**
     * Base64-encoded SHA-256 checksum of the file content when available.
     *
     * @return the value
     */
    public String getContentSha256() {
        return contentSha256;
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
        sb.append("SandboxFile(");
        sb.append("super=").append(super.toString());
        sb.append("sandboxId=").append(String.valueOf(this.sandboxId));
        sb.append(", filePath=").append(String.valueOf(this.filePath));
        sb.append(", contentSha256=").append(String.valueOf(this.contentSha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxFile)) {
            return false;
        }

        SandboxFile other = (SandboxFile) o;
        return java.util.Objects.equals(this.sandboxId, other.sandboxId)
                && java.util.Objects.equals(this.filePath, other.filePath)
                && java.util.Objects.equals(this.contentSha256, other.contentSha256)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sandboxId == null ? 43 : this.sandboxId.hashCode());
        result = (result * PRIME) + (this.filePath == null ? 43 : this.filePath.hashCode());
        result =
                (result * PRIME)
                        + (this.contentSha256 == null ? 43 : this.contentSha256.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
