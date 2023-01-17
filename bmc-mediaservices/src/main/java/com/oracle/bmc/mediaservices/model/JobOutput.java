/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mediaservices.model;

/**
 * The output result of an executed MediaWorkflowJob. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobOutput.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JobOutput extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assetType",
        "namespaceName",
        "bucketName",
        "objectName",
        "id"
    })
    public JobOutput(
            AssetType assetType,
            String namespaceName,
            String bucketName,
            String objectName,
            String id) {
        super();
        this.assetType = assetType;
        this.namespaceName = namespaceName;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.id = id;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of job output. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetType")
        private AssetType assetType;

        /**
         * Type of job output.
         *
         * @param assetType the value to set
         * @return this builder
         */
        public Builder assetType(AssetType assetType) {
            this.assetType = assetType;
            this.__explicitlySet__.add("assetType");
            return this;
        }
        /** The namespace name of the job output. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * The namespace name of the job output.
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /** The bucket name of the job output. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The bucket name of the job output.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The object name of the job output. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The object name of the job output.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The ID associated with the job output. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID associated with the job output.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobOutput build() {
            JobOutput model =
                    new JobOutput(
                            this.assetType,
                            this.namespaceName,
                            this.bucketName,
                            this.objectName,
                            this.id);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobOutput model) {
            if (model.wasPropertyExplicitlySet("assetType")) {
                this.assetType(model.getAssetType());
            }
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
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

    /** Type of job output. */
    public enum AssetType implements com.oracle.bmc.http.internal.BmcEnum {
        Audio("AUDIO"),
        Video("VIDEO"),
        Playlist("PLAYLIST"),
        Image("IMAGE"),
        CaptionFile("CAPTION_FILE"),
        TranscriptionJob("TRANSCRIPTION_JOB"),
        VisionJob("VISION_JOB"),
        TextAnalysis("TEXT_ANALYSIS"),
        Other("OTHER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AssetType.class);

        private final String value;
        private static java.util.Map<String, AssetType> map;

        static {
            map = new java.util.HashMap<>();
            for (AssetType v : AssetType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AssetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AssetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AssetType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of job output. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetType")
    private final AssetType assetType;

    /**
     * Type of job output.
     *
     * @return the value
     */
    public AssetType getAssetType() {
        return assetType;
    }

    /** The namespace name of the job output. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * The namespace name of the job output.
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
    }

    /** The bucket name of the job output. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The bucket name of the job output.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The object name of the job output. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The object name of the job output.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The ID associated with the job output. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID associated with the job output.
     *
     * @return the value
     */
    public String getId() {
        return id;
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
        sb.append("JobOutput(");
        sb.append("super=").append(super.toString());
        sb.append("assetType=").append(String.valueOf(this.assetType));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobOutput)) {
            return false;
        }

        JobOutput other = (JobOutput) o;
        return java.util.Objects.equals(this.assetType, other.assetType)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.id, other.id)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assetType == null ? 43 : this.assetType.hashCode());
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
