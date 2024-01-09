/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The information about the new Packaging Configuration. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateStreamPackagingConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateStreamPackagingConfigDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "distributionChannelId",
        "displayName",
        "streamPackagingFormat",
        "segmentTimeInSeconds",
        "encryption",
        "freeformTags",
        "definedTags"
    })
    public CreateStreamPackagingConfigDetails(
            String distributionChannelId,
            String displayName,
            StreamPackagingFormat streamPackagingFormat,
            Integer segmentTimeInSeconds,
            StreamPackagingConfigEncryption encryption,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.distributionChannelId = distributionChannelId;
        this.displayName = displayName;
        this.streamPackagingFormat = streamPackagingFormat;
        this.segmentTimeInSeconds = segmentTimeInSeconds;
        this.encryption = encryption;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Unique identifier of the Distribution Channel that this stream packaging configuration
         * belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("distributionChannelId")
        private String distributionChannelId;

        /**
         * Unique identifier of the Distribution Channel that this stream packaging configuration
         * belongs to.
         *
         * @param distributionChannelId the value to set
         * @return this builder
         */
        public Builder distributionChannelId(String distributionChannelId) {
            this.distributionChannelId = distributionChannelId;
            this.__explicitlySet__.add("distributionChannelId");
            return this;
        }
        /**
         * The name of the stream Packaging Configuration. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The name of the stream Packaging Configuration. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The output format for the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("streamPackagingFormat")
        private StreamPackagingFormat streamPackagingFormat;

        /**
         * The output format for the package.
         *
         * @param streamPackagingFormat the value to set
         * @return this builder
         */
        public Builder streamPackagingFormat(StreamPackagingFormat streamPackagingFormat) {
            this.streamPackagingFormat = streamPackagingFormat;
            this.__explicitlySet__.add("streamPackagingFormat");
            return this;
        }
        /** The duration in seconds for each fragment. */
        @com.fasterxml.jackson.annotation.JsonProperty("segmentTimeInSeconds")
        private Integer segmentTimeInSeconds;

        /**
         * The duration in seconds for each fragment.
         *
         * @param segmentTimeInSeconds the value to set
         * @return this builder
         */
        public Builder segmentTimeInSeconds(Integer segmentTimeInSeconds) {
            this.segmentTimeInSeconds = segmentTimeInSeconds;
            this.__explicitlySet__.add("segmentTimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryption")
        private StreamPackagingConfigEncryption encryption;

        public Builder encryption(StreamPackagingConfigEncryption encryption) {
            this.encryption = encryption;
            this.__explicitlySet__.add("encryption");
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

        public CreateStreamPackagingConfigDetails build() {
            CreateStreamPackagingConfigDetails model =
                    new CreateStreamPackagingConfigDetails(
                            this.distributionChannelId,
                            this.displayName,
                            this.streamPackagingFormat,
                            this.segmentTimeInSeconds,
                            this.encryption,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateStreamPackagingConfigDetails model) {
            if (model.wasPropertyExplicitlySet("distributionChannelId")) {
                this.distributionChannelId(model.getDistributionChannelId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("streamPackagingFormat")) {
                this.streamPackagingFormat(model.getStreamPackagingFormat());
            }
            if (model.wasPropertyExplicitlySet("segmentTimeInSeconds")) {
                this.segmentTimeInSeconds(model.getSegmentTimeInSeconds());
            }
            if (model.wasPropertyExplicitlySet("encryption")) {
                this.encryption(model.getEncryption());
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
     * Unique identifier of the Distribution Channel that this stream packaging configuration
     * belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distributionChannelId")
    private final String distributionChannelId;

    /**
     * Unique identifier of the Distribution Channel that this stream packaging configuration
     * belongs to.
     *
     * @return the value
     */
    public String getDistributionChannelId() {
        return distributionChannelId;
    }

    /** The name of the stream Packaging Configuration. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The name of the stream Packaging Configuration. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The output format for the package. */
    public enum StreamPackagingFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Hls("HLS"),
        Dash("DASH"),
        ;

        private final String value;
        private static java.util.Map<String, StreamPackagingFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (StreamPackagingFormat v : StreamPackagingFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        StreamPackagingFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StreamPackagingFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid StreamPackagingFormat: " + key);
        }
    };
    /** The output format for the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("streamPackagingFormat")
    private final StreamPackagingFormat streamPackagingFormat;

    /**
     * The output format for the package.
     *
     * @return the value
     */
    public StreamPackagingFormat getStreamPackagingFormat() {
        return streamPackagingFormat;
    }

    /** The duration in seconds for each fragment. */
    @com.fasterxml.jackson.annotation.JsonProperty("segmentTimeInSeconds")
    private final Integer segmentTimeInSeconds;

    /**
     * The duration in seconds for each fragment.
     *
     * @return the value
     */
    public Integer getSegmentTimeInSeconds() {
        return segmentTimeInSeconds;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("encryption")
    private final StreamPackagingConfigEncryption encryption;

    public StreamPackagingConfigEncryption getEncryption() {
        return encryption;
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
        sb.append("CreateStreamPackagingConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("distributionChannelId=").append(String.valueOf(this.distributionChannelId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", streamPackagingFormat=").append(String.valueOf(this.streamPackagingFormat));
        sb.append(", segmentTimeInSeconds=").append(String.valueOf(this.segmentTimeInSeconds));
        sb.append(", encryption=").append(String.valueOf(this.encryption));
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
        if (!(o instanceof CreateStreamPackagingConfigDetails)) {
            return false;
        }

        CreateStreamPackagingConfigDetails other = (CreateStreamPackagingConfigDetails) o;
        return java.util.Objects.equals(this.distributionChannelId, other.distributionChannelId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.streamPackagingFormat, other.streamPackagingFormat)
                && java.util.Objects.equals(this.segmentTimeInSeconds, other.segmentTimeInSeconds)
                && java.util.Objects.equals(this.encryption, other.encryption)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.distributionChannelId == null
                                ? 43
                                : this.distributionChannelId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.streamPackagingFormat == null
                                ? 43
                                : this.streamPackagingFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.segmentTimeInSeconds == null
                                ? 43
                                : this.segmentTimeInSeconds.hashCode());
        result = (result * PRIME) + (this.encryption == null ? 43 : this.encryption.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
