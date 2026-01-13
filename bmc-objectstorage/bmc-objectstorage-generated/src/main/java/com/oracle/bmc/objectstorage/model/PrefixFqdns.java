/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * An object containing FQDNs <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrefixFqdns.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrefixFqdns extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "objectStorageApiFqdn",
        "s3CompatibilityApiFqdn",
        "swiftApiFqdn"
    })
    public PrefixFqdns(
            String objectStorageApiFqdn, String s3CompatibilityApiFqdn, String swiftApiFqdn) {
        super();
        this.objectStorageApiFqdn = objectStorageApiFqdn;
        this.s3CompatibilityApiFqdn = s3CompatibilityApiFqdn;
        this.swiftApiFqdn = swiftApiFqdn;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** ObjectStorage API FQDN */
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageApiFqdn")
        private String objectStorageApiFqdn;

        /**
         * ObjectStorage API FQDN
         *
         * @param objectStorageApiFqdn the value to set
         * @return this builder
         */
        public Builder objectStorageApiFqdn(String objectStorageApiFqdn) {
            this.objectStorageApiFqdn = objectStorageApiFqdn;
            this.__explicitlySet__.add("objectStorageApiFqdn");
            return this;
        }
        /** S3 Compatibility API FQDN */
        @com.fasterxml.jackson.annotation.JsonProperty("s3CompatibilityApiFqdn")
        private String s3CompatibilityApiFqdn;

        /**
         * S3 Compatibility API FQDN
         *
         * @param s3CompatibilityApiFqdn the value to set
         * @return this builder
         */
        public Builder s3CompatibilityApiFqdn(String s3CompatibilityApiFqdn) {
            this.s3CompatibilityApiFqdn = s3CompatibilityApiFqdn;
            this.__explicitlySet__.add("s3CompatibilityApiFqdn");
            return this;
        }
        /** Swift API FQDN */
        @com.fasterxml.jackson.annotation.JsonProperty("swiftApiFqdn")
        private String swiftApiFqdn;

        /**
         * Swift API FQDN
         *
         * @param swiftApiFqdn the value to set
         * @return this builder
         */
        public Builder swiftApiFqdn(String swiftApiFqdn) {
            this.swiftApiFqdn = swiftApiFqdn;
            this.__explicitlySet__.add("swiftApiFqdn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PrefixFqdns build() {
            PrefixFqdns model =
                    new PrefixFqdns(
                            this.objectStorageApiFqdn,
                            this.s3CompatibilityApiFqdn,
                            this.swiftApiFqdn);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrefixFqdns model) {
            if (model.wasPropertyExplicitlySet("objectStorageApiFqdn")) {
                this.objectStorageApiFqdn(model.getObjectStorageApiFqdn());
            }
            if (model.wasPropertyExplicitlySet("s3CompatibilityApiFqdn")) {
                this.s3CompatibilityApiFqdn(model.getS3CompatibilityApiFqdn());
            }
            if (model.wasPropertyExplicitlySet("swiftApiFqdn")) {
                this.swiftApiFqdn(model.getSwiftApiFqdn());
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

    /** ObjectStorage API FQDN */
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageApiFqdn")
    private final String objectStorageApiFqdn;

    /**
     * ObjectStorage API FQDN
     *
     * @return the value
     */
    public String getObjectStorageApiFqdn() {
        return objectStorageApiFqdn;
    }

    /** S3 Compatibility API FQDN */
    @com.fasterxml.jackson.annotation.JsonProperty("s3CompatibilityApiFqdn")
    private final String s3CompatibilityApiFqdn;

    /**
     * S3 Compatibility API FQDN
     *
     * @return the value
     */
    public String getS3CompatibilityApiFqdn() {
        return s3CompatibilityApiFqdn;
    }

    /** Swift API FQDN */
    @com.fasterxml.jackson.annotation.JsonProperty("swiftApiFqdn")
    private final String swiftApiFqdn;

    /**
     * Swift API FQDN
     *
     * @return the value
     */
    public String getSwiftApiFqdn() {
        return swiftApiFqdn;
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
        sb.append("PrefixFqdns(");
        sb.append("super=").append(super.toString());
        sb.append("objectStorageApiFqdn=").append(String.valueOf(this.objectStorageApiFqdn));
        sb.append(", s3CompatibilityApiFqdn=").append(String.valueOf(this.s3CompatibilityApiFqdn));
        sb.append(", swiftApiFqdn=").append(String.valueOf(this.swiftApiFqdn));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PrefixFqdns)) {
            return false;
        }

        PrefixFqdns other = (PrefixFqdns) o;
        return java.util.Objects.equals(this.objectStorageApiFqdn, other.objectStorageApiFqdn)
                && java.util.Objects.equals(
                        this.s3CompatibilityApiFqdn, other.s3CompatibilityApiFqdn)
                && java.util.Objects.equals(this.swiftApiFqdn, other.swiftApiFqdn)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectStorageApiFqdn == null
                                ? 43
                                : this.objectStorageApiFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.s3CompatibilityApiFqdn == null
                                ? 43
                                : this.s3CompatibilityApiFqdn.hashCode());
        result = (result * PRIME) + (this.swiftApiFqdn == null ? 43 : this.swiftApiFqdn.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
