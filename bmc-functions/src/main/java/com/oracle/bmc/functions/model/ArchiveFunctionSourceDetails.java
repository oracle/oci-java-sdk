/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Object capturing fields required for creating an archive based function.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ArchiveFunctionSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ArchiveFunctionSourceDetails extends FunctionSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("archiveSourceDetails")
        private ArchiveSourceDetails archiveSourceDetails;

        public Builder archiveSourceDetails(ArchiveSourceDetails archiveSourceDetails) {
            this.archiveSourceDetails = archiveSourceDetails;
            this.__explicitlySet__.add("archiveSourceDetails");
            return this;
        }
        /**
         * The function handler that is executed when the function is invoked. The value of this field depends on the runtime used
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("handler")
        private String handler;

        /**
         * The function handler that is executed when the function is invoked. The value of this field depends on the runtime used
         *
         * @param handler the value to set
         * @return this builder
         **/
        public Builder handler(String handler) {
            this.handler = handler;
            this.__explicitlySet__.add("handler");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("runtimeConfig")
        private RuntimeConfig runtimeConfig;

        public Builder runtimeConfig(RuntimeConfig runtimeConfig) {
            this.runtimeConfig = runtimeConfig;
            this.__explicitlySet__.add("runtimeConfig");
            return this;
        }
        /**
         * The SHA256 hash of the function source code archive, base64-encoded.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceCodeSha256")
        private String sourceCodeSha256;

        /**
         * The SHA256 hash of the function source code archive, base64-encoded.
         *
         * @param sourceCodeSha256 the value to set
         * @return this builder
         **/
        public Builder sourceCodeSha256(String sourceCodeSha256) {
            this.sourceCodeSha256 = sourceCodeSha256;
            this.__explicitlySet__.add("sourceCodeSha256");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ArchiveFunctionSourceDetails build() {
            ArchiveFunctionSourceDetails model =
                    new ArchiveFunctionSourceDetails(
                            this.archiveSourceDetails,
                            this.handler,
                            this.runtimeConfig,
                            this.sourceCodeSha256);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ArchiveFunctionSourceDetails model) {
            if (model.wasPropertyExplicitlySet("archiveSourceDetails")) {
                this.archiveSourceDetails(model.getArchiveSourceDetails());
            }
            if (model.wasPropertyExplicitlySet("handler")) {
                this.handler(model.getHandler());
            }
            if (model.wasPropertyExplicitlySet("runtimeConfig")) {
                this.runtimeConfig(model.getRuntimeConfig());
            }
            if (model.wasPropertyExplicitlySet("sourceCodeSha256")) {
                this.sourceCodeSha256(model.getSourceCodeSha256());
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
    public ArchiveFunctionSourceDetails(
            ArchiveSourceDetails archiveSourceDetails,
            String handler,
            RuntimeConfig runtimeConfig,
            String sourceCodeSha256) {
        super();
        this.archiveSourceDetails = archiveSourceDetails;
        this.handler = handler;
        this.runtimeConfig = runtimeConfig;
        this.sourceCodeSha256 = sourceCodeSha256;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("archiveSourceDetails")
    private final ArchiveSourceDetails archiveSourceDetails;

    public ArchiveSourceDetails getArchiveSourceDetails() {
        return archiveSourceDetails;
    }

    /**
     * The function handler that is executed when the function is invoked. The value of this field depends on the runtime used
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("handler")
    private final String handler;

    /**
     * The function handler that is executed when the function is invoked. The value of this field depends on the runtime used
     *
     * @return the value
     **/
    public String getHandler() {
        return handler;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("runtimeConfig")
    private final RuntimeConfig runtimeConfig;

    public RuntimeConfig getRuntimeConfig() {
        return runtimeConfig;
    }

    /**
     * The SHA256 hash of the function source code archive, base64-encoded.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceCodeSha256")
    private final String sourceCodeSha256;

    /**
     * The SHA256 hash of the function source code archive, base64-encoded.
     *
     * @return the value
     **/
    public String getSourceCodeSha256() {
        return sourceCodeSha256;
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
        sb.append("ArchiveFunctionSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", archiveSourceDetails=").append(String.valueOf(this.archiveSourceDetails));
        sb.append(", handler=").append(String.valueOf(this.handler));
        sb.append(", runtimeConfig=").append(String.valueOf(this.runtimeConfig));
        sb.append(", sourceCodeSha256=").append(String.valueOf(this.sourceCodeSha256));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArchiveFunctionSourceDetails)) {
            return false;
        }

        ArchiveFunctionSourceDetails other = (ArchiveFunctionSourceDetails) o;
        return java.util.Objects.equals(this.archiveSourceDetails, other.archiveSourceDetails)
                && java.util.Objects.equals(this.handler, other.handler)
                && java.util.Objects.equals(this.runtimeConfig, other.runtimeConfig)
                && java.util.Objects.equals(this.sourceCodeSha256, other.sourceCodeSha256)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.archiveSourceDetails == null
                                ? 43
                                : this.archiveSourceDetails.hashCode());
        result = (result * PRIME) + (this.handler == null ? 43 : this.handler.hashCode());
        result =
                (result * PRIME)
                        + (this.runtimeConfig == null ? 43 : this.runtimeConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceCodeSha256 == null ? 43 : this.sourceCodeSha256.hashCode());
        return result;
    }
}
