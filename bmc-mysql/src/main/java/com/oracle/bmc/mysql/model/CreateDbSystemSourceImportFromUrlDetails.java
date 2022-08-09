/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * An Object Storage PAR from which to import the DB System initial data.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDbSystemSourceImportFromUrlDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "sourceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateDbSystemSourceImportFromUrlDetails extends CreateDbSystemSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Pre-Authenticated Request (PAR) of a bucket/prefix or PAR of a @.manifest.json object from the Object Storage.
         * Check [Using Pre-Authenticated Requests](https://docs.oracle.com/en-us/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
         * for information related to PAR creation.
         * Please create PAR with "Permit object reads" access type and "Enable Object Listing" permission when using a bucket/prefix PAR.
         * Please create PAR with "Permit object reads" access type when using a @.manifest.json object PAR.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUrl")
        private String sourceUrl;

        /**
         * The Pre-Authenticated Request (PAR) of a bucket/prefix or PAR of a @.manifest.json object from the Object Storage.
         * Check [Using Pre-Authenticated Requests](https://docs.oracle.com/en-us/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
         * for information related to PAR creation.
         * Please create PAR with "Permit object reads" access type and "Enable Object Listing" permission when using a bucket/prefix PAR.
         * Please create PAR with "Permit object reads" access type when using a @.manifest.json object PAR.
         *
         * @param sourceUrl the value to set
         * @return this builder
         **/
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
            this.__explicitlySet__.add("sourceUrl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDbSystemSourceImportFromUrlDetails build() {
            CreateDbSystemSourceImportFromUrlDetails model =
                    new CreateDbSystemSourceImportFromUrlDetails(this.sourceUrl);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDbSystemSourceImportFromUrlDetails model) {
            if (model.wasPropertyExplicitlySet("sourceUrl")) {
                this.sourceUrl(model.getSourceUrl());
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
    public CreateDbSystemSourceImportFromUrlDetails(String sourceUrl) {
        super();
        this.sourceUrl = sourceUrl;
    }

    /**
     * The Pre-Authenticated Request (PAR) of a bucket/prefix or PAR of a @.manifest.json object from the Object Storage.
     * Check [Using Pre-Authenticated Requests](https://docs.oracle.com/en-us/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for information related to PAR creation.
     * Please create PAR with "Permit object reads" access type and "Enable Object Listing" permission when using a bucket/prefix PAR.
     * Please create PAR with "Permit object reads" access type when using a @.manifest.json object PAR.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUrl")
    private final String sourceUrl;

    /**
     * The Pre-Authenticated Request (PAR) of a bucket/prefix or PAR of a @.manifest.json object from the Object Storage.
     * Check [Using Pre-Authenticated Requests](https://docs.oracle.com/en-us/iaas/Content/Object/Tasks/usingpreauthenticatedrequests.htm)
     * for information related to PAR creation.
     * Please create PAR with "Permit object reads" access type and "Enable Object Listing" permission when using a bucket/prefix PAR.
     * Please create PAR with "Permit object reads" access type when using a @.manifest.json object PAR.
     *
     * @return the value
     **/
    public String getSourceUrl() {
        return sourceUrl;
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
        sb.append("CreateDbSystemSourceImportFromUrlDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", sourceUrl=").append(String.valueOf(this.sourceUrl));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDbSystemSourceImportFromUrlDetails)) {
            return false;
        }

        CreateDbSystemSourceImportFromUrlDetails other =
                (CreateDbSystemSourceImportFromUrlDetails) o;
        return java.util.Objects.equals(this.sourceUrl, other.sourceUrl) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.sourceUrl == null ? 43 : this.sourceUrl.hashCode());
        return result;
    }
}
