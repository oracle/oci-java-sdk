/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties required to create an ODA instance attachment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateOdaInstanceAttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateOdaInstanceAttachmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("attachToId")
        private String attachToId;

        public Builder attachToId(String attachToId) {
            this.attachToId = attachToId;
            this.__explicitlySet__.add("attachToId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
        private AttachmentType attachmentType;

        public Builder attachmentType(AttachmentType attachmentType) {
            this.attachmentType = attachmentType;
            this.__explicitlySet__.add("attachmentType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachmentMetadata")
        private String attachmentMetadata;

        public Builder attachmentMetadata(String attachmentMetadata) {
            this.attachmentMetadata = attachmentMetadata;
            this.__explicitlySet__.add("attachmentMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("restrictedOperations")
        private java.util.List<String> restrictedOperations;

        public Builder restrictedOperations(java.util.List<String> restrictedOperations) {
            this.restrictedOperations = restrictedOperations;
            this.__explicitlySet__.add("restrictedOperations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private OdaInstanceAttachmentOwner owner;

        public Builder owner(OdaInstanceAttachmentOwner owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
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

        public CreateOdaInstanceAttachmentDetails build() {
            CreateOdaInstanceAttachmentDetails __instance__ =
                    new CreateOdaInstanceAttachmentDetails(
                            attachToId,
                            attachmentType,
                            attachmentMetadata,
                            restrictedOperations,
                            owner,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOdaInstanceAttachmentDetails o) {
            Builder copiedBuilder =
                    attachToId(o.getAttachToId())
                            .attachmentType(o.getAttachmentType())
                            .attachmentMetadata(o.getAttachmentMetadata())
                            .restrictedOperations(o.getRestrictedOperations())
                            .owner(o.getOwner())
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
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which this ODA instance is being attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachToId")
    String attachToId;
    /**
     * The type of target instance which this ODA instance is being attached.
     **/
    public enum AttachmentType {
        Fusion("FUSION"),
        ;

        private final String value;
        private static java.util.Map<String, AttachmentType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttachmentType v : AttachmentType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AttachmentType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttachmentType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AttachmentType: " + key);
        }
    };
    /**
     * The type of target instance which this ODA instance is being attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentType")
    AttachmentType attachmentType;

    /**
     * Attachment specific metadata. Defined by the target service.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attachmentMetadata")
    String attachmentMetadata;

    /**
     * List of operations that are restricted while this instance is attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("restrictedOperations")
    java.util.List<String> restrictedOperations;

    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    OdaInstanceAttachmentOwner owner;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
