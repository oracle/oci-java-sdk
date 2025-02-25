/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * Details of the Objectstorage object
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ObjectDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "objectNamespace",
        "objectBucket",
        "objectName",
        "objectUrl",
        "checksum"
    })
    public ObjectDetails(
            String objectNamespace,
            String objectBucket,
            String objectName,
            String objectUrl,
            String checksum) {
        super();
        this.objectNamespace = objectNamespace;
        this.objectBucket = objectBucket;
        this.objectName = objectName;
        this.objectUrl = objectUrl;
        this.checksum = checksum;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Objectstorage namespace reference providing the original location of this object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectNamespace")
        private String objectNamespace;

        /**
         * Objectstorage namespace reference providing the original location of this object
         * @param objectNamespace the value to set
         * @return this builder
         **/
        public Builder objectNamespace(String objectNamespace) {
            this.objectNamespace = objectNamespace;
            this.__explicitlySet__.add("objectNamespace");
            return this;
        }
        /**
         * Objectstorage bucket reference providing the original location of this object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectBucket")
        private String objectBucket;

        /**
         * Objectstorage bucket reference providing the original location of this object
         * @param objectBucket the value to set
         * @return this builder
         **/
        public Builder objectBucket(String objectBucket) {
            this.objectBucket = objectBucket;
            this.__explicitlySet__.add("objectBucket");
            return this;
        }
        /**
         * Objectstorage object name reference providing the original location of this object
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * Objectstorage object name reference providing the original location of this object
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * Object storage URL for download
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectUrl")
        private String objectUrl;

        /**
         * Object storage URL for download
         * @param objectUrl the value to set
         * @return this builder
         **/
        public Builder objectUrl(String objectUrl) {
            this.objectUrl = objectUrl;
            this.__explicitlySet__.add("objectUrl");
            return this;
        }
        /**
         * Object content SHA256 Hash
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("checksum")
        private String checksum;

        /**
         * Object content SHA256 Hash
         * @param checksum the value to set
         * @return this builder
         **/
        public Builder checksum(String checksum) {
            this.checksum = checksum;
            this.__explicitlySet__.add("checksum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectDetails build() {
            ObjectDetails model =
                    new ObjectDetails(
                            this.objectNamespace,
                            this.objectBucket,
                            this.objectName,
                            this.objectUrl,
                            this.checksum);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectDetails model) {
            if (model.wasPropertyExplicitlySet("objectNamespace")) {
                this.objectNamespace(model.getObjectNamespace());
            }
            if (model.wasPropertyExplicitlySet("objectBucket")) {
                this.objectBucket(model.getObjectBucket());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("objectUrl")) {
                this.objectUrl(model.getObjectUrl());
            }
            if (model.wasPropertyExplicitlySet("checksum")) {
                this.checksum(model.getChecksum());
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
     * Objectstorage namespace reference providing the original location of this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectNamespace")
    private final String objectNamespace;

    /**
     * Objectstorage namespace reference providing the original location of this object
     * @return the value
     **/
    public String getObjectNamespace() {
        return objectNamespace;
    }

    /**
     * Objectstorage bucket reference providing the original location of this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectBucket")
    private final String objectBucket;

    /**
     * Objectstorage bucket reference providing the original location of this object
     * @return the value
     **/
    public String getObjectBucket() {
        return objectBucket;
    }

    /**
     * Objectstorage object name reference providing the original location of this object
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * Objectstorage object name reference providing the original location of this object
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * Object storage URL for download
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectUrl")
    private final String objectUrl;

    /**
     * Object storage URL for download
     * @return the value
     **/
    public String getObjectUrl() {
        return objectUrl;
    }

    /**
     * Object content SHA256 Hash
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("checksum")
    private final String checksum;

    /**
     * Object content SHA256 Hash
     * @return the value
     **/
    public String getChecksum() {
        return checksum;
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
        sb.append("ObjectDetails(");
        sb.append("super=").append(super.toString());
        sb.append("objectNamespace=").append(String.valueOf(this.objectNamespace));
        sb.append(", objectBucket=").append(String.valueOf(this.objectBucket));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectUrl=").append(String.valueOf(this.objectUrl));
        sb.append(", checksum=").append(String.valueOf(this.checksum));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectDetails)) {
            return false;
        }

        ObjectDetails other = (ObjectDetails) o;
        return java.util.Objects.equals(this.objectNamespace, other.objectNamespace)
                && java.util.Objects.equals(this.objectBucket, other.objectBucket)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectUrl, other.objectUrl)
                && java.util.Objects.equals(this.checksum, other.checksum)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectNamespace == null ? 43 : this.objectNamespace.hashCode());
        result = (result * PRIME) + (this.objectBucket == null ? 43 : this.objectBucket.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectUrl == null ? 43 : this.objectUrl.hashCode());
        result = (result * PRIME) + (this.checksum == null ? 43 : this.checksum.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
