/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Contains the details of an APEX property set <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PropertySetApex.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "key")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PropertySetApex extends PropertySet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isMutable")
        private Boolean isMutable;

        public Builder isMutable(Boolean isMutable) {
            this.isMutable = isMutable;
            this.__explicitlySet__.add("isMutable");
            return this;
        }
        /** The version of APEX */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of APEX
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The APEX engine schema name */
        @com.fasterxml.jackson.annotation.JsonProperty("userKey")
        private String userKey;

        /**
         * The APEX engine schema name
         *
         * @param userKey the value to set
         * @return this builder
         */
        public Builder userKey(String userKey) {
            this.userKey = userKey;
            this.__explicitlySet__.add("userKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PropertySetApex build() {
            PropertySetApex model = new PropertySetApex(this.isMutable, this.version, this.userKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PropertySetApex model) {
            if (model.wasPropertyExplicitlySet("isMutable")) {
                this.isMutable(model.getIsMutable());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("userKey")) {
                this.userKey(model.getUserKey());
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

    @Deprecated
    public PropertySetApex(Boolean isMutable, String version, String userKey) {
        super(isMutable);
        this.version = version;
        this.userKey = userKey;
    }

    /** The version of APEX */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of APEX
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The APEX engine schema name */
    @com.fasterxml.jackson.annotation.JsonProperty("userKey")
    private final String userKey;

    /**
     * The APEX engine schema name
     *
     * @return the value
     */
    public String getUserKey() {
        return userKey;
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
        sb.append("PropertySetApex(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", userKey=").append(String.valueOf(this.userKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PropertySetApex)) {
            return false;
        }

        PropertySetApex other = (PropertySetApex) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.userKey, other.userKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.userKey == null ? 43 : this.userKey.hashCode());
        return result;
    }
}
