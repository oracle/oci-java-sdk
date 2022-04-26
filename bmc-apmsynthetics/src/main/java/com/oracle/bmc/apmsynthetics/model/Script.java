/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmsynthetics.model;

/**
 * The information about the script.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Script.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Script {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private ContentTypes contentType;

        public Builder contentType(ContentTypes contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("content")
        private String content;

        public Builder content(String content) {
            this.content = content;
            this.__explicitlySet__.add("content");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
        private java.util.Date timeUploaded;

        public Builder timeUploaded(java.util.Date timeUploaded) {
            this.timeUploaded = timeUploaded;
            this.__explicitlySet__.add("timeUploaded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentSizeInBytes")
        private Integer contentSizeInBytes;

        public Builder contentSizeInBytes(Integer contentSizeInBytes) {
            this.contentSizeInBytes = contentSizeInBytes;
            this.__explicitlySet__.add("contentSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("contentFileName")
        private String contentFileName;

        public Builder contentFileName(String contentFileName) {
            this.contentFileName = contentFileName;
            this.__explicitlySet__.add("contentFileName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<ScriptParameterInfo> parameters;

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

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Script build() {
            Script __instance__ =
                    new Script(
                            id,
                            displayName,
                            contentType,
                            content,
                            timeUploaded,
                            contentSizeInBytes,
                            contentFileName,
                            parameters,
                            monitorStatusCountMap,
                            timeCreated,
                            timeUpdated,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Script o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .displayName(o.getDisplayName())
                            .contentType(o.getContentType())
                            .content(o.getContent())
                            .timeUploaded(o.getTimeUploaded())
                            .contentSizeInBytes(o.getContentSizeInBytes())
                            .contentFileName(o.getContentFileName())
                            .parameters(o.getParameters())
                            .monitorStatusCountMap(o.getMonitorStatusCountMap())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the script.
     * scriptId is mandatory for creation of SCRIPTED_BROWSER and SCRIPTED_REST monitor types. For other monitor types, it should be set to null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Unique name that can be edited. The name should not contain any confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Content type of the script.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    ContentTypes contentType;

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
    String content;

    /**
     * The time the script was uploaded.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUploaded")
    java.util.Date timeUploaded;

    /**
     * Size of the script content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentSizeInBytes")
    Integer contentSizeInBytes;

    /**
     * File name of the uploaded script content.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contentFileName")
    String contentFileName;

    /**
     * List of script parameters. Example: {@code [{"scriptParameter": {"paramName": "userid", "paramValue":"testuser", "isSecret": false}, "isOverwritten": false}]}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<ScriptParameterInfo> parameters;

    @com.fasterxml.jackson.annotation.JsonProperty("monitorStatusCountMap")
    MonitorStatusCountMap monitorStatusCountMap;

    /**
     * The time the resource was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-12T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The time the resource was updated, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339)
     * timestamp format.
     * Example: {@code 2020-02-13T22:47:12.613Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
