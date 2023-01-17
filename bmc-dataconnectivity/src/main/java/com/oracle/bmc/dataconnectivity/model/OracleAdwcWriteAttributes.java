/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * Properties to configure when writing to Oracle Autonomous Data Warehouse Cloud.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OracleAdwcWriteAttributes.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OracleAdwcWriteAttributes extends AbstractWriteAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
        private Schema bucketSchema;

        public Builder bucketSchema(Schema bucketSchema) {
            this.bucketSchema = bucketSchema;
            this.__explicitlySet__.add("bucketSchema");
            return this;
        }
        /**
         * The file name for the attribute.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stagingFileName")
        private String stagingFileName;

        /**
         * The file name for the attribute.
         * @param stagingFileName the value to set
         * @return this builder
         **/
        public Builder stagingFileName(String stagingFileName) {
            this.stagingFileName = stagingFileName;
            this.__explicitlySet__.add("stagingFileName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
        private DataAsset stagingDataAsset;

        public Builder stagingDataAsset(DataAsset stagingDataAsset) {
            this.stagingDataAsset = stagingDataAsset;
            this.__explicitlySet__.add("stagingDataAsset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
        private Connection stagingConnection;

        public Builder stagingConnection(Connection stagingConnection) {
            this.stagingConnection = stagingConnection;
            this.__explicitlySet__.add("stagingConnection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleAdwcWriteAttributes build() {
            OracleAdwcWriteAttributes model =
                    new OracleAdwcWriteAttributes(
                            this.bucketSchema,
                            this.stagingFileName,
                            this.stagingDataAsset,
                            this.stagingConnection);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleAdwcWriteAttributes model) {
            if (model.wasPropertyExplicitlySet("bucketSchema")) {
                this.bucketSchema(model.getBucketSchema());
            }
            if (model.wasPropertyExplicitlySet("stagingFileName")) {
                this.stagingFileName(model.getStagingFileName());
            }
            if (model.wasPropertyExplicitlySet("stagingDataAsset")) {
                this.stagingDataAsset(model.getStagingDataAsset());
            }
            if (model.wasPropertyExplicitlySet("stagingConnection")) {
                this.stagingConnection(model.getStagingConnection());
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

    @Deprecated
    public OracleAdwcWriteAttributes(
            Schema bucketSchema,
            String stagingFileName,
            DataAsset stagingDataAsset,
            Connection stagingConnection) {
        super();
        this.bucketSchema = bucketSchema;
        this.stagingFileName = stagingFileName;
        this.stagingDataAsset = stagingDataAsset;
        this.stagingConnection = stagingConnection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("bucketSchema")
    private final Schema bucketSchema;

    public Schema getBucketSchema() {
        return bucketSchema;
    }

    /**
     * The file name for the attribute.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stagingFileName")
    private final String stagingFileName;

    /**
     * The file name for the attribute.
     * @return the value
     **/
    public String getStagingFileName() {
        return stagingFileName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingDataAsset")
    private final DataAsset stagingDataAsset;

    public DataAsset getStagingDataAsset() {
        return stagingDataAsset;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("stagingConnection")
    private final Connection stagingConnection;

    public Connection getStagingConnection() {
        return stagingConnection;
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
        sb.append("OracleAdwcWriteAttributes(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", bucketSchema=").append(String.valueOf(this.bucketSchema));
        sb.append(", stagingFileName=").append(String.valueOf(this.stagingFileName));
        sb.append(", stagingDataAsset=").append(String.valueOf(this.stagingDataAsset));
        sb.append(", stagingConnection=").append(String.valueOf(this.stagingConnection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleAdwcWriteAttributes)) {
            return false;
        }

        OracleAdwcWriteAttributes other = (OracleAdwcWriteAttributes) o;
        return java.util.Objects.equals(this.bucketSchema, other.bucketSchema)
                && java.util.Objects.equals(this.stagingFileName, other.stagingFileName)
                && java.util.Objects.equals(this.stagingDataAsset, other.stagingDataAsset)
                && java.util.Objects.equals(this.stagingConnection, other.stagingConnection)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bucketSchema == null ? 43 : this.bucketSchema.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingFileName == null ? 43 : this.stagingFileName.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingDataAsset == null ? 43 : this.stagingDataAsset.hashCode());
        result =
                (result * PRIME)
                        + (this.stagingConnection == null ? 43 : this.stagingConnection.hashCode());
        return result;
    }
}
