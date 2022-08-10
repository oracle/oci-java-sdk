/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Pre-Authenticated Request Link for ODMS Agent log use.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ParLink.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ParLink extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"parLink"})
    public ParLink(String parLink) {
        super();
        this.parLink = parLink;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Pre-Authenticated Request URI.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parLink")
        private String parLink;

        /**
         * Pre-Authenticated Request URI.
         *
         * @param parLink the value to set
         * @return this builder
         **/
        public Builder parLink(String parLink) {
            this.parLink = parLink;
            this.__explicitlySet__.add("parLink");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParLink build() {
            ParLink model = new ParLink(this.parLink);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParLink model) {
            if (model.wasPropertyExplicitlySet("parLink")) {
                this.parLink(model.getParLink());
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
     * Pre-Authenticated Request URI.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parLink")
    private final String parLink;

    /**
     * Pre-Authenticated Request URI.
     *
     * @return the value
     **/
    public String getParLink() {
        return parLink;
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
        sb.append("ParLink(");
        sb.append("super=").append(super.toString());
        sb.append("parLink=").append(String.valueOf(this.parLink));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParLink)) {
            return false;
        }

        ParLink other = (ParLink) o;
        return java.util.Objects.equals(this.parLink, other.parLink) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.parLink == null ? 43 : this.parLink.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
