/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * The file that is mounted on a container instance through a volume mount. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerConfigFile.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ContainerConfigFile
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"fileName", "data", "path"})
    public ContainerConfigFile(String fileName, byte[] data, String path) {
        super();
        this.fileName = fileName;
        this.data = data;
        this.path = path;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the file. The fileName should be unique across the volume. */
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * The name of the file. The fileName should be unique across the volume.
         *
         * @param fileName the value to set
         * @return this builder
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            this.__explicitlySet__.add("fileName");
            return this;
        }
        /**
         * The base64 encoded contents of the file. The contents are decoded to plain text before
         * mounted as a file to a container inside container instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("data")
        private byte[] data;

        /**
         * The base64 encoded contents of the file. The contents are decoded to plain text before
         * mounted as a file to a container inside container instance.
         *
         * @param data the value to set
         * @return this builder
         */
        public Builder data(byte[] data) {
            this.data = data;
            this.__explicitlySet__.add("data");
            return this;
        }
        /**
         * (Optional) Relative path for this file inside the volume mount directory. By default, the
         * file is presented at the root of the volume mount path.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * (Optional) Relative path for this file inside the volume mount directory. By default, the
         * file is presented at the root of the volume mount path.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerConfigFile build() {
            ContainerConfigFile model =
                    new ContainerConfigFile(this.fileName, this.data, this.path);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerConfigFile model) {
            if (model.wasPropertyExplicitlySet("fileName")) {
                this.fileName(model.getFileName());
            }
            if (model.wasPropertyExplicitlySet("data")) {
                this.data(model.getData());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
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

    /** The name of the file. The fileName should be unique across the volume. */
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * The name of the file. The fileName should be unique across the volume.
     *
     * @return the value
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * The base64 encoded contents of the file. The contents are decoded to plain text before
     * mounted as a file to a container inside container instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("data")
    private final byte[] data;

    /**
     * The base64 encoded contents of the file. The contents are decoded to plain text before
     * mounted as a file to a container inside container instance.
     *
     * @return the value
     */
    public byte[] getData() {
        return data;
    }

    /**
     * (Optional) Relative path for this file inside the volume mount directory. By default, the
     * file is presented at the root of the volume mount path.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * (Optional) Relative path for this file inside the volume mount directory. By default, the
     * file is presented at the root of the volume mount path.
     *
     * @return the value
     */
    public String getPath() {
        return path;
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
        sb.append("ContainerConfigFile(");
        sb.append("super=").append(super.toString());
        sb.append("fileName=").append(String.valueOf(this.fileName));
        sb.append(", data=")
                .append(
                        (includeByteArrayContents
                                ? java.util.Arrays.toString(this.data)
                                : (String.valueOf(this.data)
                                        + (this.data != null
                                                ? " (byte[" + this.data.length + "])"
                                                : ""))));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerConfigFile)) {
            return false;
        }

        ContainerConfigFile other = (ContainerConfigFile) o;
        return java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Arrays.equals(this.data, other.data)
                && java.util.Objects.equals(this.path, other.path)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fileName == null ? 43 : this.fileName.hashCode());
        result = (result * PRIME) + java.util.Arrays.hashCode(this.data);
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
