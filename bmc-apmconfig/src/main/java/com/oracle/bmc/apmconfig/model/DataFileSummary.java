/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.model;

/**
 * Properties related to the file. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DataFileSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DataFileSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "apmType",
        "sizeInBytes",
        "md5",
        "timeLastModified",
        "metadata"
    })
    public DataFileSummary(
            String name,
            String apmType,
            Long sizeInBytes,
            String md5,
            java.util.Date timeLastModified,
            java.util.Map<String, String> metadata) {
        super();
        this.name = name;
        this.apmType = apmType;
        this.sizeInBytes = sizeInBytes;
        this.md5 = md5;
        this.timeLastModified = timeLastModified;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name to use as identifier for the data file. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name to use as identifier for the data file.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The type of the data file, indicating its intended use Example: {@code source_map} */
        @com.fasterxml.jackson.annotation.JsonProperty("apmType")
        private String apmType;

        /**
         * The type of the data file, indicating its intended use Example: {@code source_map}
         *
         * @param apmType the value to set
         * @return this builder
         */
        public Builder apmType(String apmType) {
            this.apmType = apmType;
            this.__explicitlySet__.add("apmType");
            return this;
        }
        /** Size of the object in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * Size of the object in bytes.
         *
         * @param sizeInBytes the value to set
         * @return this builder
         */
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /** Base64-encoded MD5 hash of the object data. */
        @com.fasterxml.jackson.annotation.JsonProperty("md5")
        private String md5;

        /**
         * Base64-encoded MD5 hash of the object data.
         *
         * @param md5 the value to set
         * @return this builder
         */
        public Builder md5(String md5) {
            this.md5 = md5;
            this.__explicitlySet__.add("md5");
            return this;
        }
        /**
         * The last time the object was modified, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
        private java.util.Date timeLastModified;

        /**
         * The last time the object was modified, as described in [RFC
         * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2020-02-19T22:47:12.613Z}
         *
         * @param timeLastModified the value to set
         * @return this builder
         */
        public Builder timeLastModified(java.util.Date timeLastModified) {
            this.timeLastModified = timeLastModified;
            this.__explicitlySet__.add("timeLastModified");
            return this;
        }
        /** Metadata properties related to the data file. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Metadata properties related to the data file.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DataFileSummary build() {
            DataFileSummary model =
                    new DataFileSummary(
                            this.name,
                            this.apmType,
                            this.sizeInBytes,
                            this.md5,
                            this.timeLastModified,
                            this.metadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DataFileSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("apmType")) {
                this.apmType(model.getApmType());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("md5")) {
                this.md5(model.getMd5());
            }
            if (model.wasPropertyExplicitlySet("timeLastModified")) {
                this.timeLastModified(model.getTimeLastModified());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /** The name to use as identifier for the data file. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name to use as identifier for the data file.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The type of the data file, indicating its intended use Example: {@code source_map} */
    @com.fasterxml.jackson.annotation.JsonProperty("apmType")
    private final String apmType;

    /**
     * The type of the data file, indicating its intended use Example: {@code source_map}
     *
     * @return the value
     */
    public String getApmType() {
        return apmType;
    }

    /** Size of the object in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * Size of the object in bytes.
     *
     * @return the value
     */
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /** Base64-encoded MD5 hash of the object data. */
    @com.fasterxml.jackson.annotation.JsonProperty("md5")
    private final String md5;

    /**
     * Base64-encoded MD5 hash of the object data.
     *
     * @return the value
     */
    public String getMd5() {
        return md5;
    }

    /**
     * The last time the object was modified, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastModified")
    private final java.util.Date timeLastModified;

    /**
     * The last time the object was modified, as described in [RFC
     * 2616](https://tools.ietf.org/html/rfc2616#section-14.29). Expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2020-02-19T22:47:12.613Z}
     *
     * @return the value
     */
    public java.util.Date getTimeLastModified() {
        return timeLastModified;
    }

    /** Metadata properties related to the data file. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Metadata properties related to the data file.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
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
        sb.append("DataFileSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", apmType=").append(String.valueOf(this.apmType));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", md5=").append(String.valueOf(this.md5));
        sb.append(", timeLastModified=").append(String.valueOf(this.timeLastModified));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DataFileSummary)) {
            return false;
        }

        DataFileSummary other = (DataFileSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.apmType, other.apmType)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(this.md5, other.md5)
                && java.util.Objects.equals(this.timeLastModified, other.timeLastModified)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.apmType == null ? 43 : this.apmType.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result = (result * PRIME) + (this.md5 == null ? 43 : this.md5.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastModified == null ? 43 : this.timeLastModified.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
