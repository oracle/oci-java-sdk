/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * A mount option to be used in the mount command while mounting the OCI File Storage Service (FSS)
 * File System to Containers. The mount option will look like option=value in the mount command.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OciFssMountOption.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OciFssMountOption
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"option", "value"})
    public OciFssMountOption(String option, String value) {
        super();
        this.option = option;
        this.value = value;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A generic (https://man7.org/linux/man-pages/man8/mount.8.html) or nfs
         * (https://man7.org/linux/man-pages/man5/nfs.5.html) mount option.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("option")
        private String option;

        /**
         * A generic (https://man7.org/linux/man-pages/man8/mount.8.html) or nfs
         * (https://man7.org/linux/man-pages/man5/nfs.5.html) mount option.
         *
         * @param option the value to set
         * @return this builder
         */
        public Builder option(String option) {
            this.option = option;
            this.__explicitlySet__.add("option");
            return this;
        }
        /** The value of the mount option. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the mount option.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciFssMountOption build() {
            OciFssMountOption model = new OciFssMountOption(this.option, this.value);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciFssMountOption model) {
            if (model.wasPropertyExplicitlySet("option")) {
                this.option(model.getOption());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
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
     * A generic (https://man7.org/linux/man-pages/man8/mount.8.html) or nfs
     * (https://man7.org/linux/man-pages/man5/nfs.5.html) mount option.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("option")
    private final String option;

    /**
     * A generic (https://man7.org/linux/man-pages/man8/mount.8.html) or nfs
     * (https://man7.org/linux/man-pages/man5/nfs.5.html) mount option.
     *
     * @return the value
     */
    public String getOption() {
        return option;
    }

    /** The value of the mount option. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the mount option.
     *
     * @return the value
     */
    public String getValue() {
        return value;
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
        sb.append("OciFssMountOption(");
        sb.append("super=").append(super.toString());
        sb.append("option=").append(String.valueOf(this.option));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciFssMountOption)) {
            return false;
        }

        OciFssMountOption other = (OciFssMountOption) o;
        return java.util.Objects.equals(this.option, other.option)
                && java.util.Objects.equals(this.value, other.value)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.option == null ? 43 : this.option.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
