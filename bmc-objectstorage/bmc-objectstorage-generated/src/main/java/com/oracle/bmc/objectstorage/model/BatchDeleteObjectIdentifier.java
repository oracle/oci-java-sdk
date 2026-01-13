/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.model;

/**
 * Delete object details. <br>
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
        builder = BatchDeleteObjectIdentifier.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BatchDeleteObjectIdentifier
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"objectName", "ifMatch"})
    public BatchDeleteObjectIdentifier(String objectName, String ifMatch) {
        super();
        this.objectName = objectName;
        this.ifMatch = ifMatch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the object to delete. Avoid entering confidential information. Example:
         * test/object1.log
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object to delete. Avoid entering confidential information. Example:
         * test/object1.log
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The entity tag (ETag) to match. Avoid entering confidential information. Example: etag1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ifMatch")
        private String ifMatch;

        /**
         * The entity tag (ETag) to match. Avoid entering confidential information. Example: etag1
         *
         * @param ifMatch the value to set
         * @return this builder
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            this.__explicitlySet__.add("ifMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BatchDeleteObjectIdentifier build() {
            BatchDeleteObjectIdentifier model =
                    new BatchDeleteObjectIdentifier(this.objectName, this.ifMatch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BatchDeleteObjectIdentifier model) {
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("ifMatch")) {
                this.ifMatch(model.getIfMatch());
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

    /**
     * The name of the object to delete. Avoid entering confidential information. Example:
     * test/object1.log
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object to delete. Avoid entering confidential information. Example:
     * test/object1.log
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The entity tag (ETag) to match. Avoid entering confidential information. Example: etag1 */
    @com.fasterxml.jackson.annotation.JsonProperty("ifMatch")
    private final String ifMatch;

    /**
     * The entity tag (ETag) to match. Avoid entering confidential information. Example: etag1
     *
     * @return the value
     */
    public String getIfMatch() {
        return ifMatch;
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
        sb.append("BatchDeleteObjectIdentifier(");
        sb.append("super=").append(super.toString());
        sb.append("objectName=").append(String.valueOf(this.objectName));
        sb.append(", ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDeleteObjectIdentifier)) {
            return false;
        }

        BatchDeleteObjectIdentifier other = (BatchDeleteObjectIdentifier) o;
        return java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
