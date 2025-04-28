/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Details of the request to update DRS file in a Fleet. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDrsFileDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrsFileDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bucketName", "namespace", "drsFileName"})
    public UpdateDrsFileDetails(String bucketName, String namespace, String drsFileName) {
        super();
        this.bucketName = bucketName;
        this.namespace = namespace;
        this.drsFileName = drsFileName;
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrsFileDetails build() {
            UpdateDrsFileDetails model =
                    new UpdateDrsFileDetails(this.bucketName, this.namespace, this.drsFileName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrsFileDetails model) {
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("drsFileName")) {
                this.drsFileName(model.getDrsFileName());
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
        sb.append("UpdateDrsFileDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", drsFileName=").append(String.valueOf(this.drsFileName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrsFileDetails)) {
            return false;
        }

        UpdateDrsFileDetails other = (UpdateDrsFileDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.drsFileName, other.drsFileName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.drsFileName == null ? 43 : this.drsFileName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
