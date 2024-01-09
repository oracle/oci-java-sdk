/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * NamespaceMetadata maps a namespace string to defaultS3CompartmentId and defaultSwiftCompartmentId
 * values. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NamespaceMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NamespaceMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespace",
        "defaultS3CompartmentId",
        "defaultSwiftCompartmentId"
    })
    public NamespaceMetadata(
            String namespace, String defaultS3CompartmentId, String defaultSwiftCompartmentId) {
        super();
        this.namespace = namespace;
        this.defaultS3CompartmentId = defaultS3CompartmentId;
        this.defaultSwiftCompartmentId = defaultSwiftCompartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Object Storage namespace to which the metadata belongs. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace to which the metadata belongs.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * If the field is set, specifies the default compartment assignment for the Amazon S3
         * Compatibility API.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
        private String defaultS3CompartmentId;

        /**
         * If the field is set, specifies the default compartment assignment for the Amazon S3
         * Compatibility API.
         *
         * @param defaultS3CompartmentId the value to set
         * @return this builder
         */
        public Builder defaultS3CompartmentId(String defaultS3CompartmentId) {
            this.defaultS3CompartmentId = defaultS3CompartmentId;
            this.__explicitlySet__.add("defaultS3CompartmentId");
            return this;
        }
        /** If the field is set, specifies the default compartment assignment for the Swift API. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
        private String defaultSwiftCompartmentId;

        /**
         * If the field is set, specifies the default compartment assignment for the Swift API.
         *
         * @param defaultSwiftCompartmentId the value to set
         * @return this builder
         */
        public Builder defaultSwiftCompartmentId(String defaultSwiftCompartmentId) {
            this.defaultSwiftCompartmentId = defaultSwiftCompartmentId;
            this.__explicitlySet__.add("defaultSwiftCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NamespaceMetadata build() {
            NamespaceMetadata model =
                    new NamespaceMetadata(
                            this.namespace,
                            this.defaultS3CompartmentId,
                            this.defaultSwiftCompartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NamespaceMetadata model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("defaultS3CompartmentId")) {
                this.defaultS3CompartmentId(model.getDefaultS3CompartmentId());
            }
            if (model.wasPropertyExplicitlySet("defaultSwiftCompartmentId")) {
                this.defaultSwiftCompartmentId(model.getDefaultSwiftCompartmentId());
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

    /** The Object Storage namespace to which the metadata belongs. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace to which the metadata belongs.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * If the field is set, specifies the default compartment assignment for the Amazon S3
     * Compatibility API.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultS3CompartmentId")
    private final String defaultS3CompartmentId;

    /**
     * If the field is set, specifies the default compartment assignment for the Amazon S3
     * Compatibility API.
     *
     * @return the value
     */
    public String getDefaultS3CompartmentId() {
        return defaultS3CompartmentId;
    }

    /** If the field is set, specifies the default compartment assignment for the Swift API. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultSwiftCompartmentId")
    private final String defaultSwiftCompartmentId;

    /**
     * If the field is set, specifies the default compartment assignment for the Swift API.
     *
     * @return the value
     */
    public String getDefaultSwiftCompartmentId() {
        return defaultSwiftCompartmentId;
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
        sb.append("NamespaceMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", defaultS3CompartmentId=").append(String.valueOf(this.defaultS3CompartmentId));
        sb.append(", defaultSwiftCompartmentId=")
                .append(String.valueOf(this.defaultSwiftCompartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NamespaceMetadata)) {
            return false;
        }

        NamespaceMetadata other = (NamespaceMetadata) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(
                        this.defaultS3CompartmentId, other.defaultS3CompartmentId)
                && java.util.Objects.equals(
                        this.defaultSwiftCompartmentId, other.defaultSwiftCompartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultS3CompartmentId == null
                                ? 43
                                : this.defaultS3CompartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultSwiftCompartmentId == null
                                ? 43
                                : this.defaultSwiftCompartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
