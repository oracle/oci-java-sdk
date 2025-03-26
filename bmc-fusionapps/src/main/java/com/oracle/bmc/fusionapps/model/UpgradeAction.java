/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * Quarterly upgrade details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpgradeAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "actionType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpgradeAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("referenceKey")
        private String referenceKey;

        public Builder referenceKey(String referenceKey) {
            this.referenceKey = referenceKey;
            this.__explicitlySet__.add("referenceKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private State state;

        public Builder state(State state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * name of the repo
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * name of the repo
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * month qualifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("qualifier")
        private String qualifier;

        /**
         * month qualifier
         * @param qualifier the value to set
         * @return this builder
         **/
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            this.__explicitlySet__.add("qualifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpgradeAction build() {
            UpgradeAction model =
                    new UpgradeAction(
                            this.referenceKey,
                            this.state,
                            this.description,
                            this.version,
                            this.qualifier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpgradeAction model) {
            if (model.wasPropertyExplicitlySet("referenceKey")) {
                this.referenceKey(model.getReferenceKey());
            }
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("qualifier")) {
                this.qualifier(model.getQualifier());
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
    public UpgradeAction(
            String referenceKey,
            State state,
            String description,
            String version,
            String qualifier) {
        super(referenceKey, state, description);
        this.version = version;
        this.qualifier = qualifier;
    }

    /**
     * name of the repo
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * name of the repo
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * month qualifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("qualifier")
    private final String qualifier;

    /**
     * month qualifier
     * @return the value
     **/
    public String getQualifier() {
        return qualifier;
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
        sb.append("UpgradeAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", qualifier=").append(String.valueOf(this.qualifier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpgradeAction)) {
            return false;
        }

        UpgradeAction other = (UpgradeAction) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.qualifier, other.qualifier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.qualifier == null ? 43 : this.qualifier.hashCode());
        return result;
    }
}
