/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.adm.model;

/**
 * Vulnerable artifact version range.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220421")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VulnerableArtifactVersionRange.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VulnerableArtifactVersionRange
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "versionEndExcluding",
        "versionEndIncluding",
        "versionStartIncluding",
        "versionStartExcluding"
    })
    public VulnerableArtifactVersionRange(
            String versionEndExcluding,
            String versionEndIncluding,
            String versionStartIncluding,
            String versionStartExcluding) {
        super();
        this.versionEndExcluding = versionEndExcluding;
        this.versionEndIncluding = versionEndIncluding;
        this.versionStartIncluding = versionStartIncluding;
        this.versionStartExcluding = versionStartExcluding;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The version immediately after the last affected version. Versions up to, but not including this version, are vulnerable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionEndExcluding")
        private String versionEndExcluding;

        /**
         * The version immediately after the last affected version. Versions up to, but not including this version, are vulnerable.
         * @param versionEndExcluding the value to set
         * @return this builder
         **/
        public Builder versionEndExcluding(String versionEndExcluding) {
            this.versionEndExcluding = versionEndExcluding;
            this.__explicitlySet__.add("versionEndExcluding");
            return this;
        }
        /**
         * Marks the latest version that is affected by the vulnerability. This version and all preceding versions, going back to versionStartExcluding or versionStartIncluding, are considered vulnerable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionEndIncluding")
        private String versionEndIncluding;

        /**
         * Marks the latest version that is affected by the vulnerability. This version and all preceding versions, going back to versionStartExcluding or versionStartIncluding, are considered vulnerable.
         * @param versionEndIncluding the value to set
         * @return this builder
         **/
        public Builder versionEndIncluding(String versionEndIncluding) {
            this.versionEndIncluding = versionEndIncluding;
            this.__explicitlySet__.add("versionEndIncluding");
            return this;
        }
        /**
         * The first version affected by the vulnerability. This version and those following it are considered vulnerable until versionEndExcluding or versionEndIncluding is reached.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionStartIncluding")
        private String versionStartIncluding;

        /**
         * The first version affected by the vulnerability. This version and those following it are considered vulnerable until versionEndExcluding or versionEndIncluding is reached.
         * @param versionStartIncluding the value to set
         * @return this builder
         **/
        public Builder versionStartIncluding(String versionStartIncluding) {
            this.versionStartIncluding = versionStartIncluding;
            this.__explicitlySet__.add("versionStartIncluding");
            return this;
        }
        /**
         * The version immediately before the start of affected versions. The specified version is not affected, but versions immediately after are, up to versionStartIncluding or beyond, if not otherwise defined.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionStartExcluding")
        private String versionStartExcluding;

        /**
         * The version immediately before the start of affected versions. The specified version is not affected, but versions immediately after are, up to versionStartIncluding or beyond, if not otherwise defined.
         * @param versionStartExcluding the value to set
         * @return this builder
         **/
        public Builder versionStartExcluding(String versionStartExcluding) {
            this.versionStartExcluding = versionStartExcluding;
            this.__explicitlySet__.add("versionStartExcluding");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VulnerableArtifactVersionRange build() {
            VulnerableArtifactVersionRange model =
                    new VulnerableArtifactVersionRange(
                            this.versionEndExcluding,
                            this.versionEndIncluding,
                            this.versionStartIncluding,
                            this.versionStartExcluding);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VulnerableArtifactVersionRange model) {
            if (model.wasPropertyExplicitlySet("versionEndExcluding")) {
                this.versionEndExcluding(model.getVersionEndExcluding());
            }
            if (model.wasPropertyExplicitlySet("versionEndIncluding")) {
                this.versionEndIncluding(model.getVersionEndIncluding());
            }
            if (model.wasPropertyExplicitlySet("versionStartIncluding")) {
                this.versionStartIncluding(model.getVersionStartIncluding());
            }
            if (model.wasPropertyExplicitlySet("versionStartExcluding")) {
                this.versionStartExcluding(model.getVersionStartExcluding());
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
     * The version immediately after the last affected version. Versions up to, but not including this version, are vulnerable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionEndExcluding")
    private final String versionEndExcluding;

    /**
     * The version immediately after the last affected version. Versions up to, but not including this version, are vulnerable.
     * @return the value
     **/
    public String getVersionEndExcluding() {
        return versionEndExcluding;
    }

    /**
     * Marks the latest version that is affected by the vulnerability. This version and all preceding versions, going back to versionStartExcluding or versionStartIncluding, are considered vulnerable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionEndIncluding")
    private final String versionEndIncluding;

    /**
     * Marks the latest version that is affected by the vulnerability. This version and all preceding versions, going back to versionStartExcluding or versionStartIncluding, are considered vulnerable.
     * @return the value
     **/
    public String getVersionEndIncluding() {
        return versionEndIncluding;
    }

    /**
     * The first version affected by the vulnerability. This version and those following it are considered vulnerable until versionEndExcluding or versionEndIncluding is reached.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionStartIncluding")
    private final String versionStartIncluding;

    /**
     * The first version affected by the vulnerability. This version and those following it are considered vulnerable until versionEndExcluding or versionEndIncluding is reached.
     * @return the value
     **/
    public String getVersionStartIncluding() {
        return versionStartIncluding;
    }

    /**
     * The version immediately before the start of affected versions. The specified version is not affected, but versions immediately after are, up to versionStartIncluding or beyond, if not otherwise defined.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionStartExcluding")
    private final String versionStartExcluding;

    /**
     * The version immediately before the start of affected versions. The specified version is not affected, but versions immediately after are, up to versionStartIncluding or beyond, if not otherwise defined.
     * @return the value
     **/
    public String getVersionStartExcluding() {
        return versionStartExcluding;
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
        sb.append("VulnerableArtifactVersionRange(");
        sb.append("super=").append(super.toString());
        sb.append("versionEndExcluding=").append(String.valueOf(this.versionEndExcluding));
        sb.append(", versionEndIncluding=").append(String.valueOf(this.versionEndIncluding));
        sb.append(", versionStartIncluding=").append(String.valueOf(this.versionStartIncluding));
        sb.append(", versionStartExcluding=").append(String.valueOf(this.versionStartExcluding));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VulnerableArtifactVersionRange)) {
            return false;
        }

        VulnerableArtifactVersionRange other = (VulnerableArtifactVersionRange) o;
        return java.util.Objects.equals(this.versionEndExcluding, other.versionEndExcluding)
                && java.util.Objects.equals(this.versionEndIncluding, other.versionEndIncluding)
                && java.util.Objects.equals(this.versionStartIncluding, other.versionStartIncluding)
                && java.util.Objects.equals(this.versionStartExcluding, other.versionStartExcluding)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.versionEndExcluding == null
                                ? 43
                                : this.versionEndExcluding.hashCode());
        result =
                (result * PRIME)
                        + (this.versionEndIncluding == null
                                ? 43
                                : this.versionEndIncluding.hashCode());
        result =
                (result * PRIME)
                        + (this.versionStartIncluding == null
                                ? 43
                                : this.versionStartIncluding.hashCode());
        result =
                (result * PRIME)
                        + (this.versionStartExcluding == null
                                ? 43
                                : this.versionStartExcluding.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
