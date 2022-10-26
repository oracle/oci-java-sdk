/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * The information about the script. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Script.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Script extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "contentType",
        "content",
        "timeUploaded",
        "contentSizeInBytes",
        "contentFileName",
        "parameters",
        "monitorStatusCountMap",
        "timeCreated",
        "timeUpdated",
        "freeformTags",
        "definedTags"
    })
    public Script(
            String id,
            String displayName,
            ContentTypes contentType,
            String content,
            java.util.Date timeUploaded,
            Integer contentSizeInBytes,
            String contentFileName,
            java.util.List<ScriptParameterInfo> parameters,
            MonitorStatusCountMap monitorStatusCountMap,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.contentType = contentType;
        this.content = content;
        this.timeUploaded = timeUploaded;
        this.contentSizeInBytes = contentSizeInBytes;
        this.contentFileName = contentFileName;
        this.parameters = parameters;
        this.monitorStatusCountMap = monitorStatusCountMap;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
         * types. For other monitor types, it should be set to null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
         * types. For other monitor types, it should be set to null.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Unique name that can be edited. The name should not contain any confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Content type of the script. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentTypes contentType;

        /**
         * Content type of the script.
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(ContentTypes contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /**
         * The content of the script. It may contain custom-defined tags that can be used for
         * setting dynamic parameters. The format to set dynamic parameters is: {@code
         * <ORAP><ON>param name</ON><OV>param
         * value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}. Param value and
         * isParamValueSecret are optional, the default value for isParamValueSecret is false.
         * Examples: With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>} With
         * parameter name and value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>}
         * Note that the content is valid if it matches the given content type. For example, if the
         * content type is SIDE, then the content should be in Side script format. If the content
         * type is JS, then the content should be in JavaScript format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        /**
         * The content of the script. It may contain custom-defined tags that can be used for
         * setting dynamic parameters. The format to set dynamic parameters is: {@code
         * <ORAP><ON>param name</ON><OV>param
         * value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}. Param value and
         * isParamValueSecret are optional, the default value for isParamValueSecret is false.
         * Examples: With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>} With
         * parameter name and value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>}
         * Note that the content is valid if it matches the given content type. For example, if the
         * content type is SIDE, then the content should be in Side script format. If the content
         * type is JS, then the content should be in JavaScript format.
         *
         * @param content the value to set
         * @return this builder
         */
        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }
        /** The time the script was uploaded. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
        private java.util.Date timeUploaded;

        /**
         * The time the script was uploaded.
         *
         * @param timeUploaded the value to set
         * @return this builder
         */
        public Builder timeUploaded(java.util.Date timeUploaded) {
            this.timeUploaded = timeUploaded;
            this.__explicitlySet__.add("timeUploaded");
            return this;
        }
        /** Size of the script content. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentSizeInBytes")
        private Integer contentSizeInBytes;

        /**
         * Size of the script content.
         *
         * @param contentSizeInBytes the value to set
         * @return this builder
         */
        public Builder contentSizeInBytes(Integer contentSizeInBytes) {
            this.contentSizeInBytes = contentSizeInBytes;
            this.__explicitlySet__.add("contentSizeInBytes");
            return this;
        }
        /** File name of the uploaded script content. */
        @com.fasterxml.jackson.annotation.JsonProperty("contentFileName")
        private String contentFileName;

        /**
         * File name of the uploaded script content.
         *
         * @param contentFileName the value to set
         * @return this builder
         */
        public Builder contentFileName(String contentFileName) {
            this.contentFileName = contentFileName;
            this.__explicitlySet__.add("contentFileName");
            return this;
        }
        /**
         * List of script parameters. Example: {@code [{"scriptParameter": {"paramName": "userid",
         * "paramValue":"testuser", "isSecret": false}, "isOverwritten": false}]}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ScriptParameterInfo> parameters;

        /**
         * List of script parameters. Example: {@code [{"scriptParameter": {"paramName": "userid",
         * "paramValue":"testuser", "isSecret": false}, "isOverwritten": false}]}
         *
         * @param parameters the value to set
         * @return this builder
         */
        public Builder parameters(java.util.List<ScriptParameterInfo> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("monitorStatusCountMap")
        private MonitorStatusCountMap monitorStatusCountMap;

        public Builder monitorStatusCountMap(MonitorStatusCountMap monitorStatusCountMap) {
            this.monitorStatusCountMap = monitorStatusCountMap;
            this.__explicitlySet__.add("monitorStatusCountMap");
            return this;
        }
        /**
         * The time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the resource was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-12T22:47:12.613Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-13T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the resource was updated, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-13T22:47:12.613Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Script build() {
            Script model =
                    new Script(
                            this.id,
                            this.displayName,
                            this.contentType,
                            this.content,
                            this.timeUploaded,
                            this.contentSizeInBytes,
                            this.contentFileName,
                            this.parameters,
                            this.monitorStatusCountMap,
                            this.timeCreated,
                            this.timeUpdated,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Script model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("content")) {
                this.content(model.getContent());
            }
            if (model.wasPropertyExplicitlySet("timeUploaded")) {
                this.timeUploaded(model.getTimeUploaded());
            }
            if (model.wasPropertyExplicitlySet("contentSizeInBytes")) {
                this.contentSizeInBytes(model.getContentSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("contentFileName")) {
                this.contentFileName(model.getContentFileName());
            }
            if (model.wasPropertyExplicitlySet("parameters")) {
                this.parameters(model.getParameters());
            }
            if (model.wasPropertyExplicitlySet("monitorStatusCountMap")) {
                this.monitorStatusCountMap(model.getMonitorStatusCountMap());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
     * types. For other monitor types, it should be set to null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * script. scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor
     * types. For other monitor types, it should be set to null.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique name that can be edited. The name should not contain any confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Content type of the script. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final ContentTypes contentType;

    /**
     * Content type of the script.
     *
     * @return the value
     */
    public ContentTypes getContentType() {
        return contentType;
    }

    /**
     * The content of the script. It may contain custom-defined tags that can be used for setting
     * dynamic parameters. The format to set dynamic parameters is: {@code <ORAP><ON>param
     * name</ON><OV>param value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}. Param value and
     * isParamValueSecret are optional, the default value for isParamValueSecret is false. Examples:
     * With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>} With parameter name and
     * value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>} Note that the content is
     * valid if it matches the given content type. For example, if the content type is SIDE, then
     * the content should be in Side script format. If the content type is JS, then the content
     * should be in JavaScript format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("content")
    private final String content;

    /**
     * The content of the script. It may contain custom-defined tags that can be used for setting
     * dynamic parameters. The format to set dynamic parameters is: {@code <ORAP><ON>param
     * name</ON><OV>param value</OV><OS>isParamValueSecret(true/false)</OS></ORAP>}. Param value and
     * isParamValueSecret are optional, the default value for isParamValueSecret is false. Examples:
     * With mandatory param name : {@code <ORAP><ON>param name</ON></ORAP>} With parameter name and
     * value : {@code <ORAP><ON>param name</ON><OV>param value</OV></ORAP>} Note that the content is
     * valid if it matches the given content type. For example, if the content type is SIDE, then
     * the content should be in Side script format. If the content type is JS, then the content
     * should be in JavaScript format.
     *
     * @return the value
     */
    public String getContent() {
        return content;
    }

    /** The time the script was uploaded. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
    private final java.util.Date timeUploaded;

    /**
     * The time the script was uploaded.
     *
     * @return the value
     */
    public java.util.Date getTimeUploaded() {
        return timeUploaded;
    }

    /** Size of the script content. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentSizeInBytes")
    private final Integer contentSizeInBytes;

    /**
     * Size of the script content.
     *
     * @return the value
     */
    public Integer getContentSizeInBytes() {
        return contentSizeInBytes;
    }

    /** File name of the uploaded script content. */
    @com.fasterxml.jackson.annotation.JsonProperty("contentFileName")
    private final String contentFileName;

    /**
     * File name of the uploaded script content.
     *
     * @return the value
     */
    public String getContentFileName() {
        return contentFileName;
    }

    /**
     * List of script parameters. Example: {@code [{"scriptParameter": {"paramName": "userid",
     * "paramValue":"testuser", "isSecret": false}, "isOverwritten": false}]}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    private final java.util.List<ScriptParameterInfo> parameters;

    /**
     * List of script parameters. Example: {@code [{"scriptParameter": {"paramName": "userid",
     * "paramValue":"testuser", "isSecret": false}, "isOverwritten": false}]}
     *
     * @return the value
     */
    public java.util.List<ScriptParameterInfo> getParameters() {
        return parameters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("monitorStatusCountMap")
    private final MonitorStatusCountMap monitorStatusCountMap;

    public MonitorStatusCountMap getMonitorStatusCountMap() {
        return monitorStatusCountMap;
    }

    /**
     * The time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the resource was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-12T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-13T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the resource was updated, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-13T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("Script(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", content=").append(String.valueOf(this.content));
        sb.append(", timeUploaded=").append(String.valueOf(this.timeUploaded));
        sb.append(", contentSizeInBytes=").append(String.valueOf(this.contentSizeInBytes));
        sb.append(", contentFileName=").append(String.valueOf(this.contentFileName));
        sb.append(", parameters=").append(String.valueOf(this.parameters));
        sb.append(", monitorStatusCountMap=").append(String.valueOf(this.monitorStatusCountMap));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
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
        if (!(o instanceof Script)) {
            return false;
        }

        Script other = (Script) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.content, other.content)
                && java.util.Objects.equals(this.timeUploaded, other.timeUploaded)
                && java.util.Objects.equals(this.contentSizeInBytes, other.contentSizeInBytes)
                && java.util.Objects.equals(this.contentFileName, other.contentFileName)
                && java.util.Objects.equals(this.parameters, other.parameters)
                && java.util.Objects.equals(this.monitorStatusCountMap, other.monitorStatusCountMap)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result = (result * PRIME) + (this.content == null ? 43 : this.content.hashCode());
        result = (result * PRIME) + (this.timeUploaded == null ? 43 : this.timeUploaded.hashCode());
        result =
                (result * PRIME)
                        + (this.contentSizeInBytes == null
                                ? 43
                                : this.contentSizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.contentFileName == null ? 43 : this.contentFileName.hashCode());
        result = (result * PRIME) + (this.parameters == null ? 43 : this.parameters.hashCode());
        result =
                (result * PRIME)
                        + (this.monitorStatusCountMap == null
                                ? 43
                                : this.monitorStatusCountMap.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
