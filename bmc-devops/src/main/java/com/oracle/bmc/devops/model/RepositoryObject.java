/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Object containing information about files and directories in a repository.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RepositoryObject.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RepositoryObject extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "sizeInBytes", "sha", "isBinary"})
    public RepositoryObject(Type type, Long sizeInBytes, String sha, Boolean isBinary) {
        super();
        this.type = type;
        this.sizeInBytes = sizeInBytes;
        this.sha = sha;
        this.isBinary = isBinary;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of git object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of git object.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Size in bytes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * Size in bytes.
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * SHA-1 hash of git object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sha")
        private String sha;

        /**
         * SHA-1 hash of git object.
         * @param sha the value to set
         * @return this builder
         **/
        public Builder sha(String sha) {
            this.sha = sha;
            this.__explicitlySet__.add("sha");
            return this;
        }
        /**
         * Flag to determine if the object contains binary file content or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
        private Boolean isBinary;

        /**
         * Flag to determine if the object contains binary file content or not.
         * @param isBinary the value to set
         * @return this builder
         **/
        public Builder isBinary(Boolean isBinary) {
            this.isBinary = isBinary;
            this.__explicitlySet__.add("isBinary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryObject build() {
            RepositoryObject model =
                    new RepositoryObject(this.type, this.sizeInBytes, this.sha, this.isBinary);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryObject model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("sha")) {
                this.sha(model.getSha());
            }
            if (model.wasPropertyExplicitlySet("isBinary")) {
                this.isBinary(model.getIsBinary());
            }
            return this;
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
     * The type of git object.
     **/
    public enum Type {
        Blob("BLOB"),
        Tree("TREE"),
        Commit("COMMIT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of git object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of git object.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Size in bytes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * Size in bytes.
     * @return the value
     **/
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * SHA-1 hash of git object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sha")
    private final String sha;

    /**
     * SHA-1 hash of git object.
     * @return the value
     **/
    public String getSha() {
        return sha;
    }

    /**
     * Flag to determine if the object contains binary file content or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBinary")
    private final Boolean isBinary;

    /**
     * Flag to determine if the object contains binary file content or not.
     * @return the value
     **/
    public Boolean getIsBinary() {
        return isBinary;
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
        sb.append("RepositoryObject(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", sha=").append(String.valueOf(this.sha));
        sb.append(", isBinary=").append(String.valueOf(this.isBinary));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RepositoryObject)) {
            return false;
        }

        RepositoryObject other = (RepositoryObject) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.sha, other.sha)
                && java.util.Objects.equals(this.isBinary, other.isBinary)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.sha == null ? 43 : this.sha.hashCode());
        result = (result * PRIME) + (this.isBinary == null ? 43 : this.isBinary.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
