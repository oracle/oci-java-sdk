/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * A Deployment Rule Set(DRS) is a JAR (Java ARchive) file used in Java applications to enforce
 * security and manage compatibility between different versions of Java applets and web start
 * applications
 * (https://docs.oracle.com/javase/8/docs/technotes/guides/deploy/deployment_rules.html). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DrsFile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DrsFile extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "bucketName",
        "namespace",
        "drsFileName",
        "drsFileKey",
        "checksumType",
        "checksumValue",
        "isDefault"
    })
    public DrsFile(
            String bucketName,
            String namespace,
            String drsFileName,
            String drsFileKey,
            ChecksumType checksumType,
            String checksumValue,
            Boolean isDefault) {
        super();
        this.bucketName = bucketName;
        this.namespace = namespace;
        this.drsFileName = drsFileName;
        this.drsFileKey = drsFileKey;
        this.checksumType = checksumType;
        this.checksumValue = checksumValue;
        this.isDefault = isDefault;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Object Storage bucket name where the DRS file is located. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket name where the DRS file is located.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** The namespace for Object Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace for Object Storage.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The name of the DRS file in Object Store. */
        @com.fasterxml.jackson.annotation.JsonProperty("drsFileName")
        private String drsFileName;

        /**
         * The name of the DRS file in Object Store.
         *
         * @param drsFileName the value to set
         * @return this builder
         */
        public Builder drsFileName(String drsFileName) {
            this.drsFileName = drsFileName;
            this.__explicitlySet__.add("drsFileName");
            return this;
        }
        /** The unique identifier of the DRS file in Object Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("drsFileKey")
        private String drsFileKey;

        /**
         * The unique identifier of the DRS file in Object Storage.
         *
         * @param drsFileKey the value to set
         * @return this builder
         */
        public Builder drsFileKey(String drsFileKey) {
            this.drsFileKey = drsFileKey;
            this.__explicitlySet__.add("drsFileKey");
            return this;
        }
        /** The checksum type for the DRS file in Object Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
        private ChecksumType checksumType;

        /**
         * The checksum type for the DRS file in Object Storage.
         *
         * @param checksumType the value to set
         * @return this builder
         */
        public Builder checksumType(ChecksumType checksumType) {
            this.checksumType = checksumType;
            this.__explicitlySet__.add("checksumType");
            return this;
        }
        /** The checksum value for the DRS file in Object Storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("checksumValue")
        private String checksumValue;

        /**
         * The checksum value for the DRS file in Object Storage.
         *
         * @param checksumValue the value to set
         * @return this builder
         */
        public Builder checksumValue(String checksumValue) {
            this.checksumValue = checksumValue;
            this.__explicitlySet__.add("checksumValue");
            return this;
        }
        /** To check if the DRS file is the detfault ones. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * To check if the DRS file is the detfault ones.
         *
         * @param isDefault the value to set
         * @return this builder
         */
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DrsFile build() {
            DrsFile model =
                    new DrsFile(
                            this.bucketName,
                            this.namespace,
                            this.drsFileName,
                            this.drsFileKey,
                            this.checksumType,
                            this.checksumValue,
                            this.isDefault);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DrsFile model) {
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("drsFileName")) {
                this.drsFileName(model.getDrsFileName());
            }
            if (model.wasPropertyExplicitlySet("drsFileKey")) {
                this.drsFileKey(model.getDrsFileKey());
            }
            if (model.wasPropertyExplicitlySet("checksumType")) {
                this.checksumType(model.getChecksumType());
            }
            if (model.wasPropertyExplicitlySet("checksumValue")) {
                this.checksumValue(model.getChecksumValue());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
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

    /** The Object Storage bucket name where the DRS file is located. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket name where the DRS file is located.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** The namespace for Object Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace for Object Storage.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the DRS file in Object Store. */
    @com.fasterxml.jackson.annotation.JsonProperty("drsFileName")
    private final String drsFileName;

    /**
     * The name of the DRS file in Object Store.
     *
     * @return the value
     */
    public String getDrsFileName() {
        return drsFileName;
    }

    /** The unique identifier of the DRS file in Object Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("drsFileKey")
    private final String drsFileKey;

    /**
     * The unique identifier of the DRS file in Object Storage.
     *
     * @return the value
     */
    public String getDrsFileKey() {
        return drsFileKey;
    }

    /** The checksum type for the DRS file in Object Storage. */
    public enum ChecksumType implements com.oracle.bmc.http.internal.BmcEnum {
        Sha256("SHA256"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ChecksumType.class);

        private final String value;
        private static java.util.Map<String, ChecksumType> map;

        static {
            map = new java.util.HashMap<>();
            for (ChecksumType v : ChecksumType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ChecksumType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ChecksumType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ChecksumType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The checksum type for the DRS file in Object Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("checksumType")
    private final ChecksumType checksumType;

    /**
     * The checksum type for the DRS file in Object Storage.
     *
     * @return the value
     */
    public ChecksumType getChecksumType() {
        return checksumType;
    }

    /** The checksum value for the DRS file in Object Storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("checksumValue")
    private final String checksumValue;

    /**
     * The checksum value for the DRS file in Object Storage.
     *
     * @return the value
     */
    public String getChecksumValue() {
        return checksumValue;
    }

    /** To check if the DRS file is the detfault ones. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * To check if the DRS file is the detfault ones.
     *
     * @return the value
     */
    public Boolean getIsDefault() {
        return isDefault;
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
        sb.append("DrsFile(");
        sb.append("super=").append(super.toString());
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", drsFileName=").append(String.valueOf(this.drsFileName));
        sb.append(", drsFileKey=").append(String.valueOf(this.drsFileKey));
        sb.append(", checksumType=").append(String.valueOf(this.checksumType));
        sb.append(", checksumValue=").append(String.valueOf(this.checksumValue));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrsFile)) {
            return false;
        }

        DrsFile other = (DrsFile) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.drsFileName, other.drsFileName)
                && java.util.Objects.equals(this.drsFileKey, other.drsFileKey)
                && java.util.Objects.equals(this.checksumType, other.checksumType)
                && java.util.Objects.equals(this.checksumValue, other.checksumValue)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.drsFileName == null ? 43 : this.drsFileName.hashCode());
        result = (result * PRIME) + (this.drsFileKey == null ? 43 : this.drsFileKey.hashCode());
        result = (result * PRIME) + (this.checksumType == null ? 43 : this.checksumType.hashCode());
        result =
                (result * PRIME)
                        + (this.checksumValue == null ? 43 : this.checksumValue.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
