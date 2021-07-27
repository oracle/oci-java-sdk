/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.secrets.model;

/**
 * The contents of the secret, properties of the secret (and secret version), and user-provided contextual metadata for the secret.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190301")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SecretBundle.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SecretBundle {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("secretId")
        private String secretId;

        public Builder secretId(String secretId) {
            this.secretId = secretId;
            this.__explicitlySet__.add("secretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secretBundleContent")
        private SecretBundleContentDetails secretBundleContent;

        public Builder secretBundleContent(SecretBundleContentDetails secretBundleContent) {
            this.secretBundleContent = secretBundleContent;
            this.__explicitlySet__.add("secretBundleContent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
        private java.util.Date timeOfExpiry;

        public Builder timeOfExpiry(java.util.Date timeOfExpiry) {
            this.timeOfExpiry = timeOfExpiry;
            this.__explicitlySet__.add("timeOfExpiry");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<Stages> stages;

        public Builder stages(java.util.List<Stages> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, Object> metadata;

        public Builder metadata(java.util.Map<String, Object> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecretBundle build() {
            SecretBundle __instance__ =
                    new SecretBundle(
                            secretId,
                            timeCreated,
                            versionNumber,
                            versionName,
                            secretBundleContent,
                            timeOfDeletion,
                            timeOfExpiry,
                            stages,
                            metadata);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecretBundle o) {
            Builder copiedBuilder =
                    secretId(o.getSecretId())
                            .timeCreated(o.getTimeCreated())
                            .versionNumber(o.getVersionNumber())
                            .versionName(o.getVersionName())
                            .secretBundleContent(o.getSecretBundleContent())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .timeOfExpiry(o.getTimeOfExpiry())
                            .stages(o.getStages())
                            .metadata(o.getMetadata());

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
     * The OCID of the secret.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secretId")
    String secretId;

    /**
     * The time when the secret bundle was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The version number of the secret.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    Long versionNumber;

    /**
     * The name of the secret version. Labels are unique across the different versions of a particular secret.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    String versionName;

    @com.fasterxml.jackson.annotation.JsonProperty("secretBundleContent")
    SecretBundleContentDetails secretBundleContent;

    /**
     * An optional property indicating when to delete the secret version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when the secret version will expire, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfExpiry")
    java.util.Date timeOfExpiry;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Stages {
        Current("CURRENT"),
        Pending("PENDING"),
        Latest("LATEST"),
        Previous("PREVIOUS"),
        Deprecated("DEPRECATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Stages> map;

        static {
            map = new java.util.HashMap<>();
            for (Stages v : Stages.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Stages(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Stages create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Stages', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A list of possible rotation states for the secret version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    java.util.List<Stages> stages;

    /**
     * Customer-provided contextual metadata for the secret.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    java.util.Map<String, Object> metadata;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
