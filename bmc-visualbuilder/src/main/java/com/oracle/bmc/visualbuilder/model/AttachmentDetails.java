/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.visualbuilder.model;

/**
 * Description of an attachments for this instance
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AttachmentDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AttachmentDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetRole")
        private TargetRole targetRole;

        public Builder targetRole(TargetRole targetRole) {
            this.targetRole = targetRole;
            this.__explicitlySet__.add("targetRole");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
        private Boolean isImplicit;

        public Builder isImplicit(Boolean isImplicit) {
            this.isImplicit = isImplicit;
            this.__explicitlySet__.add("isImplicit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetInstanceUrl")
        private String targetInstanceUrl;

        public Builder targetInstanceUrl(String targetInstanceUrl) {
            this.targetInstanceUrl = targetInstanceUrl;
            this.__explicitlySet__.add("targetInstanceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetServiceType")
        private String targetServiceType;

        public Builder targetServiceType(String targetServiceType) {
            this.targetServiceType = targetServiceType;
            this.__explicitlySet__.add("targetServiceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttachmentDetails build() {
            AttachmentDetails __instance__ =
                    new AttachmentDetails(
                            targetRole, isImplicit, targetId, targetInstanceUrl, targetServiceType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttachmentDetails o) {
            Builder copiedBuilder =
                    targetRole(o.getTargetRole())
                            .isImplicit(o.getIsImplicit())
                            .targetId(o.getTargetId())
                            .targetInstanceUrl(o.getTargetInstanceUrl())
                            .targetServiceType(o.getTargetServiceType());

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
     * The role of the target attachment.
     *    * {@code PARENT} - The target instance is the parent of this attachment.
     *    * {@code CHILD} - The target instance is the child of this attachment.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TargetRole {
        Parent("PARENT"),
        Child("CHILD"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TargetRole> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetRole v : TargetRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The role of the target attachment.
     *    * {@code PARENT} - The target instance is the parent of this attachment.
     *    * {@code CHILD} - The target instance is the child of this attachment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetRole")
    TargetRole targetRole;

    /**
     * * If role == {@code PARENT}, the attached instance was created by this service instance
     * * If role == {@code CHILD}, this instance was created from attached instance on behalf of a user
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isImplicit")
    Boolean isImplicit;

    /**
     * The OCID of the target instance (which could be any other OCI PaaS/SaaS resource), to which this instance is attached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The dataplane instance URL of the attached instance
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetInstanceUrl")
    String targetInstanceUrl;

    /**
     * The type of the target instance, such as "FUSION".
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetServiceType")
    String targetServiceType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
