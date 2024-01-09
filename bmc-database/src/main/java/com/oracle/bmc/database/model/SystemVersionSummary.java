/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * List of compatible Exadata system versions for a given shape and GI version. <br>
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
        builder = SystemVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SystemVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"shape", "giVersion", "systemVersions"})
    public SystemVersionSummary(
            String shape, String giVersion, java.util.List<String> systemVersions) {
        super();
        this.shape = shape;
        this.giVersion = giVersion;
        this.systemVersions = systemVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Exadata shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Exadata shape.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Grid Infrastructure version. */
        @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
        private String giVersion;

        /**
         * Grid Infrastructure version.
         *
         * @param giVersion the value to set
         * @return this builder
         */
        public Builder giVersion(String giVersion) {
            this.giVersion = giVersion;
            this.__explicitlySet__.add("giVersion");
            return this;
        }
        /** Compatible Exadata system versions for a given shape and GI version. */
        @com.fasterxml.jackson.annotation.JsonProperty("systemVersions")
        private java.util.List<String> systemVersions;

        /**
         * Compatible Exadata system versions for a given shape and GI version.
         *
         * @param systemVersions the value to set
         * @return this builder
         */
        public Builder systemVersions(java.util.List<String> systemVersions) {
            this.systemVersions = systemVersions;
            this.__explicitlySet__.add("systemVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemVersionSummary build() {
            SystemVersionSummary model =
                    new SystemVersionSummary(this.shape, this.giVersion, this.systemVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SystemVersionSummary model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("giVersion")) {
                this.giVersion(model.getGiVersion());
            }
            if (model.wasPropertyExplicitlySet("systemVersions")) {
                this.systemVersions(model.getSystemVersions());
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

    /** Exadata shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Exadata shape.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** Grid Infrastructure version. */
    @com.fasterxml.jackson.annotation.JsonProperty("giVersion")
    private final String giVersion;

    /**
     * Grid Infrastructure version.
     *
     * @return the value
     */
    public String getGiVersion() {
        return giVersion;
    }

    /** Compatible Exadata system versions for a given shape and GI version. */
    @com.fasterxml.jackson.annotation.JsonProperty("systemVersions")
    private final java.util.List<String> systemVersions;

    /**
     * Compatible Exadata system versions for a given shape and GI version.
     *
     * @return the value
     */
    public java.util.List<String> getSystemVersions() {
        return systemVersions;
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
        sb.append("SystemVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", giVersion=").append(String.valueOf(this.giVersion));
        sb.append(", systemVersions=").append(String.valueOf(this.systemVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SystemVersionSummary)) {
            return false;
        }

        SystemVersionSummary other = (SystemVersionSummary) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.giVersion, other.giVersion)
                && java.util.Objects.equals(this.systemVersions, other.systemVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + (this.giVersion == null ? 43 : this.giVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.systemVersions == null ? 43 : this.systemVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
