/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * References to the sections of STIG, CIS, and/or GDPR relevant to the current finding. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = References.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class References extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"stig", "cis", "gdpr"})
    public References(String stig, String cis, String gdpr) {
        super();
        this.stig = stig;
        this.cis = cis;
        this.gdpr = gdpr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Relevant section from STIG. */
        @com.fasterxml.jackson.annotation.JsonProperty("stig")
        private String stig;

        /**
         * Relevant section from STIG.
         *
         * @param stig the value to set
         * @return this builder
         */
        public Builder stig(String stig) {
            this.stig = stig;
            this.__explicitlySet__.add("stig");
            return this;
        }
        /** Relevant section from CIS. */
        @com.fasterxml.jackson.annotation.JsonProperty("cis")
        private String cis;

        /**
         * Relevant section from CIS.
         *
         * @param cis the value to set
         * @return this builder
         */
        public Builder cis(String cis) {
            this.cis = cis;
            this.__explicitlySet__.add("cis");
            return this;
        }
        /** Relevant section from GDPR. */
        @com.fasterxml.jackson.annotation.JsonProperty("gdpr")
        private String gdpr;

        /**
         * Relevant section from GDPR.
         *
         * @param gdpr the value to set
         * @return this builder
         */
        public Builder gdpr(String gdpr) {
            this.gdpr = gdpr;
            this.__explicitlySet__.add("gdpr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public References build() {
            References model = new References(this.stig, this.cis, this.gdpr);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(References model) {
            if (model.wasPropertyExplicitlySet("stig")) {
                this.stig(model.getStig());
            }
            if (model.wasPropertyExplicitlySet("cis")) {
                this.cis(model.getCis());
            }
            if (model.wasPropertyExplicitlySet("gdpr")) {
                this.gdpr(model.getGdpr());
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

    /** Relevant section from STIG. */
    @com.fasterxml.jackson.annotation.JsonProperty("stig")
    private final String stig;

    /**
     * Relevant section from STIG.
     *
     * @return the value
     */
    public String getStig() {
        return stig;
    }

    /** Relevant section from CIS. */
    @com.fasterxml.jackson.annotation.JsonProperty("cis")
    private final String cis;

    /**
     * Relevant section from CIS.
     *
     * @return the value
     */
    public String getCis() {
        return cis;
    }

    /** Relevant section from GDPR. */
    @com.fasterxml.jackson.annotation.JsonProperty("gdpr")
    private final String gdpr;

    /**
     * Relevant section from GDPR.
     *
     * @return the value
     */
    public String getGdpr() {
        return gdpr;
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
        sb.append("References(");
        sb.append("super=").append(super.toString());
        sb.append("stig=").append(String.valueOf(this.stig));
        sb.append(", cis=").append(String.valueOf(this.cis));
        sb.append(", gdpr=").append(String.valueOf(this.gdpr));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof References)) {
            return false;
        }

        References other = (References) o;
        return java.util.Objects.equals(this.stig, other.stig)
                && java.util.Objects.equals(this.cis, other.cis)
                && java.util.Objects.equals(this.gdpr, other.gdpr)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.stig == null ? 43 : this.stig.hashCode());
        result = (result * PRIME) + (this.cis == null ? 43 : this.cis.hashCode());
        result = (result * PRIME) + (this.gdpr == null ? 43 : this.gdpr.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
