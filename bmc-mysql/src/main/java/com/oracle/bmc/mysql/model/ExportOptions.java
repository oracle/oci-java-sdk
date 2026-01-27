/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The additional options used while exporting the DB system backup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExportOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportOptions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"compressionOptions", "dataFormat", "folderName"})
    public ExportOptions(
            CompressionOptions compressionOptions, DataFormat dataFormat, String folderName) {
        super();
        this.compressionOptions = compressionOptions;
        this.dataFormat = dataFormat;
        this.folderName = folderName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("compressionOptions")
        private CompressionOptions compressionOptions;

        public Builder compressionOptions(CompressionOptions compressionOptions) {
            this.compressionOptions = compressionOptions;
            this.__explicitlySet__.add("compressionOptions");
            return this;
        }
        /** The format used for storing data. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
        private DataFormat dataFormat;

        /**
         * The format used for storing data.
         *
         * @param dataFormat the value to set
         * @return this builder
         */
        public Builder dataFormat(DataFormat dataFormat) {
            this.dataFormat = dataFormat;
            this.__explicitlySet__.add("dataFormat");
            return this;
        }
        /**
         * The name of the folder in the Object Storage bucket where the dump files will be stored.
         * A folder with the same name must not exist in the bucket. The folder will be created in
         * the export process.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("folderName")
        private String folderName;

        /**
         * The name of the folder in the Object Storage bucket where the dump files will be stored.
         * A folder with the same name must not exist in the bucket. The folder will be created in
         * the export process.
         *
         * @param folderName the value to set
         * @return this builder
         */
        public Builder folderName(String folderName) {
            this.folderName = folderName;
            this.__explicitlySet__.add("folderName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportOptions build() {
            ExportOptions model =
                    new ExportOptions(this.compressionOptions, this.dataFormat, this.folderName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportOptions model) {
            if (model.wasPropertyExplicitlySet("compressionOptions")) {
                this.compressionOptions(model.getCompressionOptions());
            }
            if (model.wasPropertyExplicitlySet("dataFormat")) {
                this.dataFormat(model.getDataFormat());
            }
            if (model.wasPropertyExplicitlySet("folderName")) {
                this.folderName(model.getFolderName());
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

    @com.fasterxml.jackson.annotation.JsonProperty("compressionOptions")
    private final CompressionOptions compressionOptions;

    public CompressionOptions getCompressionOptions() {
        return compressionOptions;
    }

    /** The format used for storing data. */
    public enum DataFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Csv("CSV"),
        Tsv("TSV"),
        ;

        private final String value;
        private static java.util.Map<String, DataFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (DataFormat v : DataFormat.values()) {
                map.put(v.getValue(), v);
            }
        }

        DataFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid DataFormat: " + key);
        }
    };
    /** The format used for storing data. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataFormat")
    private final DataFormat dataFormat;

    /**
     * The format used for storing data.
     *
     * @return the value
     */
    public DataFormat getDataFormat() {
        return dataFormat;
    }

    /**
     * The name of the folder in the Object Storage bucket where the dump files will be stored. A
     * folder with the same name must not exist in the bucket. The folder will be created in the
     * export process.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("folderName")
    private final String folderName;

    /**
     * The name of the folder in the Object Storage bucket where the dump files will be stored. A
     * folder with the same name must not exist in the bucket. The folder will be created in the
     * export process.
     *
     * @return the value
     */
    public String getFolderName() {
        return folderName;
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
        sb.append("ExportOptions(");
        sb.append("super=").append(super.toString());
        sb.append("compressionOptions=").append(String.valueOf(this.compressionOptions));
        sb.append(", dataFormat=").append(String.valueOf(this.dataFormat));
        sb.append(", folderName=").append(String.valueOf(this.folderName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportOptions)) {
            return false;
        }

        ExportOptions other = (ExportOptions) o;
        return java.util.Objects.equals(this.compressionOptions, other.compressionOptions)
                && java.util.Objects.equals(this.dataFormat, other.dataFormat)
                && java.util.Objects.equals(this.folderName, other.folderName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compressionOptions == null
                                ? 43
                                : this.compressionOptions.hashCode());
        result = (result * PRIME) + (this.dataFormat == null ? 43 : this.dataFormat.hashCode());
        result = (result * PRIME) + (this.folderName == null ? 43 : this.folderName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
