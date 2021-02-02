/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * To use any of the API operations, you must be authorized in an IAM policy. If you are not authorized,
 * talk to an administrator. If you are an administrator who needs to write policies to give users access, see
 * [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RenameObjectDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RenameObjectDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
        private String sourceName;

        public Builder sourceName(String sourceName) {
            this.sourceName = sourceName;
            this.__explicitlySet__.add("sourceName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newName")
        private String newName;

        public Builder newName(String newName) {
            this.newName = newName;
            this.__explicitlySet__.add("newName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("srcObjIfMatchETag")
        private String srcObjIfMatchETag;

        public Builder srcObjIfMatchETag(String srcObjIfMatchETag) {
            this.srcObjIfMatchETag = srcObjIfMatchETag;
            this.__explicitlySet__.add("srcObjIfMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newObjIfMatchETag")
        private String newObjIfMatchETag;

        public Builder newObjIfMatchETag(String newObjIfMatchETag) {
            this.newObjIfMatchETag = newObjIfMatchETag;
            this.__explicitlySet__.add("newObjIfMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newObjIfNoneMatchETag")
        private String newObjIfNoneMatchETag;

        public Builder newObjIfNoneMatchETag(String newObjIfNoneMatchETag) {
            this.newObjIfNoneMatchETag = newObjIfNoneMatchETag;
            this.__explicitlySet__.add("newObjIfNoneMatchETag");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RenameObjectDetails build() {
            RenameObjectDetails __instance__ =
                    new RenameObjectDetails(
                            sourceName,
                            newName,
                            srcObjIfMatchETag,
                            newObjIfMatchETag,
                            newObjIfNoneMatchETag);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RenameObjectDetails o) {
            Builder copiedBuilder =
                    sourceName(o.getSourceName())
                            .newName(o.getNewName())
                            .srcObjIfMatchETag(o.getSrcObjIfMatchETag())
                            .newObjIfMatchETag(o.getNewObjIfMatchETag())
                            .newObjIfNoneMatchETag(o.getNewObjIfNoneMatchETag());

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
     * The name of the source object to be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceName")
    String sourceName;

    /**
     * The new name of the source object. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newName")
    String newName;

    /**
     * The if-match entity tag (ETag) of the source object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("srcObjIfMatchETag")
    String srcObjIfMatchETag;

    /**
     * The if-match entity tag (ETag) of the new object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newObjIfMatchETag")
    String newObjIfMatchETag;

    /**
     * The if-none-match entity tag (ETag) of the new object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("newObjIfNoneMatchETag")
    String newObjIfNoneMatchETag;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
