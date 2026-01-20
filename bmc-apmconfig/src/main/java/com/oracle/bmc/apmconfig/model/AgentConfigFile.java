/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * An agent configuration file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AgentConfigFile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentConfigFile
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"contentType", "body"})
    public AgentConfigFile(String contentType, String body) {
        super();
        this.contentType = contentType;
        this.body = body;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The MIME Content-Type that describes the content of the body field, for example,
         * text/yaml or text/yaml; charset=utf-8
         */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * The MIME Content-Type that describes the content of the body field, for example,
         * text/yaml or text/yaml; charset=utf-8
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /** The Base64 encoded agent configuration file. */
        @com.fasterxml.jackson.annotation.JsonProperty("body")
        private String body;

        /**
         * The Base64 encoded agent configuration file.
         *
         * @param body the value to set
         * @return this builder
         */
        public Builder body(String body) {
            this.body = body;
            this.__explicitlySet__.add("body");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentConfigFile build() {
            AgentConfigFile model = new AgentConfigFile(this.contentType, this.body);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentConfigFile model) {
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("body")) {
                this.body(model.getBody());
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

    /**
     * The MIME Content-Type that describes the content of the body field, for example, text/yaml or
     * text/yaml; charset=utf-8
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * The MIME Content-Type that describes the content of the body field, for example, text/yaml or
     * text/yaml; charset=utf-8
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /** The Base64 encoded agent configuration file. */
    @com.fasterxml.jackson.annotation.JsonProperty("body")
    private final String body;

    /**
     * The Base64 encoded agent configuration file.
     *
     * @return the value
     */
    public String getBody() {
        return body;
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
        sb.append("AgentConfigFile(");
        sb.append("super=").append(super.toString());
        sb.append("contentType=").append(String.valueOf(this.contentType));
        sb.append(", body=").append(String.valueOf(this.body));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentConfigFile)) {
            return false;
        }

        AgentConfigFile other = (AgentConfigFile) o;
        return java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.body, other.body)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.body == null ? 43 : this.body.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
