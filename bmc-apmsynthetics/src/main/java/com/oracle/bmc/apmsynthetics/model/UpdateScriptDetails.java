/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * Details of the request body used to update a script.
 * Only Side or JavaScript content types are supported and content should be in Side or JavaScript formats only.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateScriptDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateScriptDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "contentType",
        "content",
        "contentFileName",
        "parameters",
        "freeformTags",
        "definedTags"
    })
    public UpdateScriptDetails(
            String displayName,
            ContentTypes contentType,
            String content,
            String contentFileName,
            java.util.List<ScriptParameter> parameters,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.contentType = contentType;
        this.content = content;
        this.contentFileName = contentFileName;
        this.parameters = parameters;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Content type of script.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentTypes contentType;

        /**
         * Content type of script.
         * @param contentType the value to set
         * @return this builder
         **/
        public Builder contentType(ContentTypes contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /**
         * The content of the script. It may contain custom-defined tags that can be used for setting dynamic parameters.
         * The format to set dynamic parameters is: {@code <ORAP><ON>param name</ON><OV>param value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}.
         * Param value and isParamValueSecret are optional, the default value for isParamValueSecret is false.
         * Examples:
         * With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>}
         * With parameter name and value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>}
         * Note that the content is valid if it matches the given content type. For example, if the content type is SIDE, then the content should be in Side script format. If the content type is JS, then the content should be in JavaScript format.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The content of the script. It may contain custom-defined tags that can be used for setting dynamic parameters.
         * The format to set dynamic parameters is: {@code <ORAP><ON>param name</ON><OV>param value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}.
         * Param value and isParamValueSecret are optional, the default value for isParamValueSecret is false.
         * Examples:
         * With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>}
         * With parameter name and value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>}
         * Note that the content is valid if it matches the given content type. For example, if the content type is SIDE, then the content should be in Side script format. If the content type is JS, then the content should be in JavaScript format.
         *
         * @param content the value to set
         * @return this builder
         **/
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /**
         * File name of uploaded script content.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contentFileName")
        private String contentFileName;

        /**
         * File name of uploaded script content.
         * @param contentFileName the value to set
         * @return this builder
         **/
        public Builder contentFileName(String contentFileName) {
            this.contentFileName = contentFileName;
            this.__explicitlySet__.add("contentFileName");
            return this;
        }
        /**
         * List of script parameters. Example: {@code [{"paramName": "userid", "paramValue":"testuser", "isSecret": false}]}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ScriptParameter> parameters;

        /**
         * List of script parameters. Example: {@code [{"paramName": "userid", "paramValue":"testuser", "isSecret": false}]}
         *
         * @param parameters the value to set
         * @return this builder
         **/
        public Builder parameters(java.util.List<ScriptParameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateScriptDetails build() {
            UpdateScriptDetails model =
                    new UpdateScriptDetails(
                            this.displayName,
                            this.contentType,
                            this.content,
                            this.contentFileName,
                            this.parameters,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateScriptDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("contentFileName")) {
                this.contentFileName(model.getContentFileName());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Content type of script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final ContentTypes contentType;

    /**
     * Content type of script.
     * @return the value
     **/
    public ContentTypes getContentType() {
        return contentType;
    }

    /**
     * The content of the script. It may contain custom-defined tags that can be used for setting dynamic parameters.
     * The format to set dynamic parameters is: {@code <ORAP><ON>param name</ON><OV>param value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}.
     * Param value and isParamValueSecret are optional, the default value for isParamValueSecret is false.
     * Examples:
     * With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>}
     * With parameter name and value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>}
     * Note that the content is valid if it matches the given content type. For example, if the content type is SIDE, then the content should be in Side script format. If the content type is JS, then the content should be in JavaScript format.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The content of the script. It may contain custom-defined tags that can be used for setting dynamic parameters.
     * The format to set dynamic parameters is: {@code <ORAP><ON>param name</ON><OV>param value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}.
     * Param value and isParamValueSecret are optional, the default value for isParamValueSecret is false.
     * Examples:
     * With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>}
     * With parameter name and value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>}
     * Note that the content is valid if it matches the given content type. For example, if the content type is SIDE, then the content should be in Side script format. If the content type is JS, then the content should be in JavaScript format.
     *
     * @return the value
     **/
    public String getContent() {
        return content;
    }

    /**
     * File name of uploaded script content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentFileName")
    private final String contentFileName;

    /**
     * File name of uploaded script content.
     * @return the value
     **/
    public String getContentFileName() {
        return contentFileName;
    }

    /**
     * List of script parameters. Example: {@code [{"paramName": "userid", "paramValue":"testuser", "isSecret": false}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<ScriptParameter> parameters;

    /**
     * List of script parameters. Example: {@code [{"paramName": "userid", "paramValue":"testuser", "isSecret": false}]}
     *
     * @return the value
     **/
    public java.util.List<ScriptParameter> getParameters() {
        return parameters;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateScriptDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", contentFileName=").append(String.valueOf(this.contentFileName));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateScriptDetails)) {
            return false;
        }

        UpdateScriptDetails other = (UpdateScriptDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.contentFileName, other.contentFileName)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result =
                (result * PRIME)
                        + (this.contentFileName == null ? 43 : this.contentFileName.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
