/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Upload File Status
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UploadFileStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UploadFileStatus {
    @Deprecated
    @java.beans.ConstructorProperties({"fileName", "isValid"})
    public UploadFileStatus(String fileName, Boolean isValid) {
        super();
        this.fileName = fileName;
        this.isValid = isValid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the file.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileName")
        private String fileName;

        /**
         * Name of the file.
         * @param fileName the value to set
         * @return this builder
         **/
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            this.__explicitlySet__.add("fileName");
            return this;
        }
        /**
         * Is Valid flag.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isValid")
        private Boolean isValid;

        /**
         * Is Valid flag.
         * @param isValid the value to set
         * @return this builder
         **/
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            this.__explicitlySet__.add("isValid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UploadFileStatus build() {
            UploadFileStatus __instance__ = new UploadFileStatus(fileName, isValid);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UploadFileStatus o) {
            Builder copiedBuilder = fileName(o.getFileName()).isValid(o.getIsValid());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Name of the file.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileName")
    private final String fileName;

    /**
     * Name of the file.
     * @return the value
     **/
    public String getFileName() {
        return fileName;
    }

    /**
     * Is Valid flag.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isValid")
    private final Boolean isValid;

    /**
     * Is Valid flag.
     * @return the value
     **/
    public Boolean getIsValid() {
        return isValid;
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
        sb.append("UploadFileStatus(");
        sb.append("fileName=").append(String.valueOf(this.fileName));
        sb.append(", isValid=").append(String.valueOf(this.isValid));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UploadFileStatus)) {
            return false;
        }

        UploadFileStatus other = (UploadFileStatus) o;
        return java.util.Objects.equals(this.fileName, other.fileName)
                && java.util.Objects.equals(this.isValid, other.isValid)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.fileName == null ? 43 : this.fileName.hashCode());
        result = (result * PRIME) + (this.isValid == null ? 43 : this.isValid.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
