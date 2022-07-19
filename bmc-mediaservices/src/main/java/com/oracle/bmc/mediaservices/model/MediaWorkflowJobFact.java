/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * One fact of a list of facts associated to a MediaWorkflowJob that presents a point-in-time
 * snapshot of the resources, data and events that were composed to generate a runnable job.
 * This information will be used internally to trouble-shoot problematic workflows or jobs.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MediaWorkflowJobFact.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MediaWorkflowJobFact {
    @Deprecated
    @java.beans.ConstructorProperties({"mediaWorkflowJobId", "key", "name", "type", "detail"})
    public MediaWorkflowJobFact(
            String mediaWorkflowJobId,
            Long key,
            String name,
            String type,
            java.util.Map<String, String> detail) {
        super();
        this.mediaWorkflowJobId = mediaWorkflowJobId;
        this.key = key;
        this.name = name;
        this.type = type;
        this.detail = detail;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Reference to the parent job.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
        private String mediaWorkflowJobId;

        /**
         * Reference to the parent job.
         * @param mediaWorkflowJobId the value to set
         * @return this builder
         **/
        public Builder mediaWorkflowJobId(String mediaWorkflowJobId) {
            this.mediaWorkflowJobId = mediaWorkflowJobId;
            this.__explicitlySet__.add("mediaWorkflowJobId");
            return this;
        }
        /**
         * System generated serial number to uniquely identify a detail in order within a MediaWorkflowJob.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private Long key;

        /**
         * System generated serial number to uniquely identify a detail in order within a MediaWorkflowJob.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(Long key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Unique name. It is read-only and generated for the fact.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Unique name. It is read-only and generated for the fact.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The type of information contained in this detail.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of information contained in this detail.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The body of the detail captured as JSON.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("detail")
        private java.util.Map<String, String> detail;

        /**
         * The body of the detail captured as JSON.
         * @param detail the value to set
         * @return this builder
         **/
        public Builder detail(java.util.Map<String, String> detail) {
            this.detail = detail;
            this.__explicitlySet__.add("detail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MediaWorkflowJobFact build() {
            MediaWorkflowJobFact __instance__ =
                    new MediaWorkflowJobFact(mediaWorkflowJobId, key, name, type, detail);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MediaWorkflowJobFact o) {
            Builder copiedBuilder =
                    mediaWorkflowJobId(o.getMediaWorkflowJobId())
                            .key(o.getKey())
                            .name(o.getName())
                            .type(o.getType())
                            .detail(o.getDetail());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Reference to the parent job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaWorkflowJobId")
    private final String mediaWorkflowJobId;

    /**
     * Reference to the parent job.
     * @return the value
     **/
    public String getMediaWorkflowJobId() {
        return mediaWorkflowJobId;
    }

    /**
     * System generated serial number to uniquely identify a detail in order within a MediaWorkflowJob.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final Long key;

    /**
     * System generated serial number to uniquely identify a detail in order within a MediaWorkflowJob.
     * @return the value
     **/
    public Long getKey() {
        return key;
    }

    /**
     * Unique name. It is read-only and generated for the fact.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Unique name. It is read-only and generated for the fact.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The type of information contained in this detail.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of information contained in this detail.
     * @return the value
     **/
    public String getType() {
        return type;
    }

    /**
     * The body of the detail captured as JSON.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("detail")
    private final java.util.Map<String, String> detail;

    /**
     * The body of the detail captured as JSON.
     * @return the value
     **/
    public java.util.Map<String, String> getDetail() {
        return detail;
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
        sb.append("MediaWorkflowJobFact(");
        sb.append("mediaWorkflowJobId=").append(String.valueOf(this.mediaWorkflowJobId));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", detail=").append(String.valueOf(this.detail));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MediaWorkflowJobFact)) {
            return false;
        }

        MediaWorkflowJobFact other = (MediaWorkflowJobFact) o;
        return java.util.Objects.equals(this.mediaWorkflowJobId, other.mediaWorkflowJobId)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.detail, other.detail)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.mediaWorkflowJobId == null
                                ? 43
                                : this.mediaWorkflowJobId.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.detail == null ? 43 : this.detail.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
