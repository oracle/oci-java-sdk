/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetsoftwareupdate.model;

/**
 * Exadata Fleet Update Cycle Target version string details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220528")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = VersionFsuTargetDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VersionFsuTargetDetails extends FsuGoalVersionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("homePolicy")
        private HomePolicy homePolicy;

        public Builder homePolicy(HomePolicy homePolicy) {
            this.homePolicy = homePolicy;
            this.__explicitlySet__.add("homePolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("newHomePrefix")
        private String newHomePrefix;

        public Builder newHomePrefix(String newHomePrefix) {
            this.newHomePrefix = newHomePrefix;
            this.__explicitlySet__.add("newHomePrefix");
            return this;
        }
        /**
         * Target DB or GI version string for the Exadata Fleet Update Cycle.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * Target DB or GI version string for the Exadata Fleet Update Cycle.
         *
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VersionFsuTargetDetails build() {
            VersionFsuTargetDetails model =
                    new VersionFsuTargetDetails(this.homePolicy, this.newHomePrefix, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VersionFsuTargetDetails model) {
            if (model.wasPropertyExplicitlySet("homePolicy")) {
                this.homePolicy(model.getHomePolicy());
            }
            if (model.wasPropertyExplicitlySet("newHomePrefix")) {
                this.newHomePrefix(model.getNewHomePrefix());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
    public VersionFsuTargetDetails(HomePolicy homePolicy, String newHomePrefix, String version) {
        super(homePolicy, newHomePrefix);
        this.version = version;
    }

    /**
     * Target DB or GI version string for the Exadata Fleet Update Cycle.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * Target DB or GI version string for the Exadata Fleet Update Cycle.
     *
     * @return the value
     **/
    public String getVersion() {
        return version;
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
        sb.append("VersionFsuTargetDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VersionFsuTargetDetails)) {
            return false;
        }

        VersionFsuTargetDetails other = (VersionFsuTargetDetails) o;
        return java.util.Objects.equals(this.version, other.version) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        return result;
    }
}
